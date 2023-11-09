import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
public class class92 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lqr;IIIIIII)V",
		garbageValue = "-1423465619"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 192
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 193

			while (true) {
				var7 = var0.readUnsignedByte(); // L: 195
				if (var7 == 0) { // L: 196
					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -class433.method7492(var4 + 932731 + var2, 556238 + var3 + var5) * 8; // L: 197
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 198
					}
					break;
				}

				if (var7 == 1) { // L: 201
					int var8 = var0.readUnsignedByte(); // L: 202
					if (var8 == 1) { // L: 203
						var8 = 0;
					}

					if (var1 == 0) { // L: 204
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8; // L: 205
					}
					break;
				}

				if (var7 <= 49) { // L: 208
					Tiles.Tiles_overlays[var1][var2][var3] = var0.readByte(); // L: 209
					AbstractUserComparator.Tiles_shapes[var1][var2][var3] = (byte)((var7 - 2) / 4); // L: 210
					GrandExchangeOfferOwnWorldComparator.field473[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3); // L: 211
				} else if (var7 <= 81) { // L: 214
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49); // L: 215
				} else {
					Tiles.Tiles_underlays[var1][var2][var3] = (byte)(var7 - 81); // L: 218
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedByte(); // L: 223
				if (var7 == 0) { // L: 224
					break;
				}

				if (var7 == 1) { // L: 225
					var0.readUnsignedByte(); // L: 226
					break;
				}

				if (var7 <= 49) { // L: 229
					var0.readUnsignedByte();
				}
			}
		}

	} // L: 232
}
