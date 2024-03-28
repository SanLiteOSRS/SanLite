import java.awt.Image;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
public class class30 {
	@ObfuscatedName("bd")
	static Image field147;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "-174828521"
	)
	static final boolean method426(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 232
		Buffer var4 = new Buffer(var0); // L: 233
		int var5 = -1; // L: 234

		label69:
		while (true) {
			int var6 = var4.method9283(); // L: 236
			if (var6 == 0) { // L: 237
				return var3; // L: 268
			}

			var5 += var6; // L: 238
			int var7 = 0; // L: 239
			boolean var8 = false; // L: 240

			while (true) {
				int var9;
				while (!var8) { // L: 242
					var9 = var4.readUShortSmart(); // L: 248
					if (var9 == 0) { // L: 249
						continue label69;
					}

					var7 += var9 - 1; // L: 250
					int var10 = var7 & 63; // L: 251
					int var11 = var7 >> 6 & 63; // L: 252
					int var12 = var4.readUnsignedByte() >> 2; // L: 253
					int var13 = var11 + var1; // L: 254
					int var14 = var10 + var2; // L: 255
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 256
						ObjectComposition var15 = MouseRecorder.getObjectDefinition(var5); // L: 257
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 258
							if (!var15.needsModelFiles()) { // L: 259
								++Client.field727; // L: 260
								var3 = false; // L: 261
							}

							var8 = true; // L: 263
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 243
				if (var9 == 0) { // L: 244
					break;
				}

				var4.readUnsignedByte(); // L: 245
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lck;B)V",
		garbageValue = "-90"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 1976
			Client.isMembersWorld = var0.isMembersOnly(); // L: 1977
			Decimator.method1085(var0.isMembersOnly()); // L: 1978
		}

		if (var0.properties != Client.worldProperties) { // L: 1980
			GrandExchangeEvents.method7082(GameEngine.field201, var0.properties); // L: 1981
		}

		class166.worldHost = var0.host; // L: 1983
		Client.worldId = var0.id; // L: 1984
		Client.worldProperties = var0.properties; // L: 1985
		class430.field4669 = var0.field831; // L: 1986
		class10.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 1987
		SoundCache.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 1988
		DesktopPlatformInfoProvider.currentPort = class10.worldPort; // L: 1989
	} // L: 1990
}
