import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("o")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("q")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor(); // L: 10
		this.future = this.executor.submit(new SecureRandomCallable()); // L: 14
	} // L: 15

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2030157363"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown(); // L: 18
		this.executor = null; // L: 19
	} // L: 20

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1383304538"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone(); // L: 23
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/security/SecureRandom;",
		garbageValue = "-26"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get(); // L: 28
		} catch (Exception var2) { // L: 30
			return LoginScreenAnimation.method2306(); // L: 31
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[Lqb;",
		garbageValue = "-1140507063"
	)
	static PrivateChatMode[] method2010() {
		return new PrivateChatMode[]{PrivateChatMode.field4828, PrivateChatMode.field4825, PrivateChatMode.field4827}; // L: 11
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "-1887656692"
	)
	static final boolean method2022(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 212
		Buffer var4 = new Buffer(var0); // L: 213
		int var5 = -1; // L: 214

		label66:
		while (true) {
			int var6 = var4.method7873(); // L: 216
			if (var6 == 0) { // L: 217
				return var3; // L: 248
			}

			var5 += var6; // L: 218
			int var7 = 0; // L: 219
			boolean var8 = false; // L: 220

			while (true) {
				int var9;
				while (!var8) { // L: 222
					var9 = var4.readUShortSmart(); // L: 228
					if (var9 == 0) { // L: 229
						continue label66;
					}

					var7 += var9 - 1; // L: 230
					int var10 = var7 & 63; // L: 231
					int var11 = var7 >> 6 & 63; // L: 232
					int var12 = var4.readUnsignedByte() >> 2; // L: 233
					int var13 = var11 + var1; // L: 234
					int var14 = var10 + var2; // L: 235
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 236
						ObjectComposition var15 = WorldMapDecoration.getObjectDefinition(var5); // L: 237
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 238
							if (!var15.needsModelFiles()) { // L: 239
								++Client.field609; // L: 240
								var3 = false; // L: 241
							}

							var8 = true; // L: 243
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 223
				if (var9 == 0) { // L: 224
					break;
				}

				var4.readUnsignedByte(); // L: 225
			}
		}
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-119"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 5614
		int var4 = var1 >> 7; // L: 5615
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 5616
			int var5 = var2; // L: 5617
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 5618
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 5619
			int var7 = var1 & 127; // L: 5620
			int var8 = Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 + (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] >> 7; // L: 5621
			int var9 = var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7; // L: 5622
			return var9 * var7 + var8 * (128 - var7) >> 7; // L: 5623
		} else {
			return 0;
		}
	}
}
