import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -95994325
	)
	@Export("VarpDefinition_fileCount")
	public static int VarpDefinition_fileCount;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = 1676071199
	)
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Lbq;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				PcmPlayer var2 = this.players[var1];
				if (var2 != null) {
					var2.run();
				}
			}
		} catch (Exception var4) {
			FriendsChatManager.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-27"
	)
	public static void method916() {
		StructComposition.StructDefinition_cached.clear();
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "1"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class20.loadInterface(var0)) {
			WorldMapCacheName.field2135 = null;
			PcmPlayer.drawInterface(GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (WorldMapCacheName.field2135 != null) {
				PcmPlayer.drawInterface(WorldMapCacheName.field2135, -1412584499, var1, var2, var3, var4, Clock.field1538, Canvas.field296, var7);
				WorldMapCacheName.field2135 = null;
			}

		} else {
			if (var7 != -1) {
				Client.field831[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.field831[var8] = true;
				}
			}

		}
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(IIIILoa;Liq;B)V",
		garbageValue = "-118"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var9 * var2 + var3 * var8 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2((double)var10, (double)var11);
			int var14 = var5.width / 2 - 25;
			int var15 = (int)(Math.sin(var12) * (double)var14);
			int var16 = (int)(Math.cos(var12) * (double)var14);
			byte var17 = 20;
			class22.redHintArrowSprite.method7043(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			class32.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}
}
