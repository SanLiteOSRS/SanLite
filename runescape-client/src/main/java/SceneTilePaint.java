import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 106917001
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1198653441
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 62824417
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -790767125
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1418532851
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("z")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -940535567
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true;
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lci;",
		garbageValue = "-313203913"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = (var1 << 8) + var0;
		Script var6 = (Script)Script.Script_cached.get((long)(var3 << 16));
		Script var5;
		if (var6 != null) {
			var5 = var6;
		} else {
			String var7 = String.valueOf(var3);
			int var8 = class22.archive12.getGroupId(var7);
			if (var8 == -1) {
				var5 = null;
			} else {
				label58: {
					byte[] var9 = class22.archive12.takeFileFlat(var8);
					if (var9 != null) {
						if (var9.length <= 1) {
							var5 = null;
							break label58;
						}

						var6 = class25.newScript(var9);
						if (var6 != null) {
							Script.Script_cached.put(var6, (long)(var3 << 16));
							var5 = var6;
							break label58;
						}
					}

					var5 = null;
				}
			}
		}

		if (var5 != null) {
			return var5;
		} else {
			int var4 = WorldMapSection2.method3202(var2, var0);
			Script var12 = (Script)Script.Script_cached.get((long)(var4 << 16));
			Script var13;
			if (var12 != null) {
				var13 = var12;
			} else {
				String var14 = String.valueOf(var4);
				int var10 = class22.archive12.getGroupId(var14);
				if (var10 == -1) {
					var13 = null;
				} else {
					byte[] var11 = class22.archive12.takeFileFlat(var10);
					if (var11 != null) {
						if (var11.length <= 1) {
							var13 = null;
							return var13 != null ? var13 : null;
						}

						var12 = class25.newScript(var11);
						if (var12 != null) {
							Script.Script_cached.put(var12, (long)(var4 << 16));
							var13 = var12;
							return var13 != null ? var13 : null;
						}
					}

					var13 = null;
				}
			}

			return var13 != null ? var13 : null;
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-82147640"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7;
		int var4 = var1 >> 7;
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
			int var5 = var2;
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
				var5 = var2 + 1;
			}

			int var6 = var0 & 127;
			int var7 = var1 & 127;
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 >> 7;
			int var9 = Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] >> 7;
			return var8 * (128 - var7) + var9 * var7 >> 7;
		} else {
			return 0;
		}
	}
}
