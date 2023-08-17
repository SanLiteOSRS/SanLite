import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 109226417
	)
	static int field518;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "[Luk;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("au")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 13024

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Loz;Loz;I)I",
		garbageValue = "117695478"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 13027
			return 0;
		} else {
			if (this.filterWorlds) { // L: 13028
				if (Client.worldId == var1.world) { // L: 13029
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 13030
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 13032
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 13036
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 13040
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "126"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') { // L: 216
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true; // L: 217
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376; // L: 218
		}
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-1589346294"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4980
			var2 = 1;
		}

		if (var3 < 1) { // L: 4981
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4982
		int var6;
		if (var5 < 0) { // L: 4984
			var6 = Client.field800;
		} else if (var5 >= 100) { // L: 4985
			var6 = Client.field685;
		} else {
			var6 = (Client.field685 - Client.field800) * var5 / 100 + Client.field800; // L: 4986
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4987
		int var8;
		int var9;
		short var17;
		if (var7 < Client.field806) { // L: 4988
			var17 = Client.field806; // L: 4989
			var6 = var17 * var2 * 334 / (var3 * 512); // L: 4990
			if (var6 > Client.field635) { // L: 4991
				var6 = Client.field635; // L: 4992
				var8 = var3 * var6 * 512 / (var17 * 334); // L: 4993
				var9 = (var2 - var8) / 2; // L: 4994
				if (var4) { // L: 4995
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4996
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4997
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4998
				}

				var0 += var9; // L: 5000
				var2 -= var9 * 2; // L: 5001
			}
		} else if (var7 > Client.field807) { // L: 5004
			var17 = Client.field807; // L: 5005
			var6 = var17 * var2 * 334 / (var3 * 512); // L: 5006
			if (var6 < Client.field804) { // L: 5007
				var6 = Client.field804; // L: 5008
				var8 = var17 * var2 * 334 / (var6 * 512); // L: 5009
				var9 = (var3 - var8) / 2; // L: 5010
				if (var4) { // L: 5011
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 5012
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 5013
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 5014
				}

				var1 += var9; // L: 5016
				var3 -= var9 * 2; // L: 5017
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 5020
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 5021
			int[] var16 = new int[9]; // L: 5023

			for (var9 = 0; var9 < var16.length; ++var9) { // L: 5024
				int var10 = var9 * 32 + 15 + 128; // L: 5025
				int var11 = class172.method3459(var10); // L: 5026
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 5027
				int var14 = var3 - 334; // L: 5030
				if (var14 < 0) { // L: 5031
					var14 = 0;
				} else if (var14 > 100) { // L: 5032
					var14 = 100;
				}

				int var15 = (Client.zoomWidth - Client.zoomHeight) * var14 / 100 + Client.zoomHeight; // L: 5033
				int var13 = var15 * var11 / 256; // L: 5034
				var16[var9] = var13 * var12 >> 16; // L: 5037
			}

			Scene.Scene_buildVisiblityMap(var16, 500, 800, var2 * 334 / var3, 334); // L: 5039
		}

		Client.viewportOffsetX = var0; // L: 5042
		Client.viewportOffsetY = var1; // L: 5043
		Client.viewportWidth = var2; // L: 5044
		Client.viewportHeight = var3; // L: 5045
	} // L: 5046
}
