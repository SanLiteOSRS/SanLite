import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("of")
public class class372 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lsg;IIIIIIB)V",
		garbageValue = "-110"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = var1 >= 0 && var1 < 4 && var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104; // L: 171
		int var8;
		if (var7) { // L: 173
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 174

			while (true) {
				var8 = var0.readUnsignedShort(); // L: 176
				if (var8 == 0) { // L: 177
					if (var1 == 0) { // L: 178
						int[] var15 = Tiles.Tiles_heights[0][var2]; // L: 179
						int var12 = var4 + 932731; // L: 182
						int var13 = var5 + 556238; // L: 183
						int var14 = class101.method2691(45365 + var12, 91923 + var13, 4) - 128 + (class101.method2691(10294 + var12, 37821 + var13, 2) - 128 >> 1) + (class101.method2691(var12, var13, 1) - 128 >> 2); // L: 185
						var14 = (int)((double)var14 * 0.3D) + 35; // L: 186
						if (var14 < 10) { // L: 187
							var14 = 10;
						} else if (var14 > 60) { // L: 188
							var14 = 60;
						}

						var15[var3] = -var14 * 8; // L: 191
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 193
					}
					break;
				}

				if (var8 == 1) { // L: 196
					int var9 = var0.readUnsignedByte(); // L: 197
					if (var9 == 1) {
						var9 = 0; // L: 198
					}

					if (var1 == 0) { // L: 199
						Tiles.Tiles_heights[0][var2][var3] = -var9 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var9 * 8; // L: 200
					}
					break;
				}

				if (var8 <= 49) { // L: 203
					Tiles.field997[var1][var2][var3] = (short)var0.readShort(); // L: 204
					Tiles.field1008[var1][var2][var3] = (byte)((var8 - 2) / 4); // L: 205
					Tiles.field999[var1][var2][var3] = (byte)(var8 - 2 + var6 & 3); // L: 206
				} else if (var8 <= 81) { // L: 209
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var8 - 49); // L: 210
				} else {
					class186.field1976[var1][var2][var3] = (short)(var8 - 81); // L: 213
				}
			}
		} else {
			while (true) {
				var8 = var0.readUnsignedShort(); // L: 218
				if (var8 == 0) { // L: 219
					break;
				}

				if (var8 == 1) { // L: 220
					var0.readUnsignedByte(); // L: 221
					break; // L: 222
				}

				if (var8 <= 49) { // L: 224
					var0.readShort(); // L: 225
				}
			}
		}

	} // L: 229
}
