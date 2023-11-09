import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class51 {
	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lbi;",
		garbageValue = "-1314025679"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 11
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltz;IIIIIIB)V",
		garbageValue = "1"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (class169.method3438(var1, var2, var3)) { // L: 169
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 170

			while (true) {
				var7 = var0.readUnsignedShort(); // L: 172
				if (var7 == 0) { // L: 173
					if (var1 == 0) { // L: 174
						Tiles.Tiles_heights[0][var2][var3] = -class107.method2701(var4 + 932731, var5 + 556238) * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 175
					}
					break;
				}

				if (var7 == 1) { // L: 178
					int var8 = var0.readUnsignedByte(); // L: 179
					if (var8 == 1) { // L: 180
						var8 = 0;
					}

					if (var1 == 0) { // L: 181
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8; // L: 182
					}
					break;
				}

				if (var7 <= 49) { // L: 185
					class74.field916[var1][var2][var3] = (short)var0.readShort(); // L: 186
					Player.field1127[var1][var2][var3] = (byte)((var7 - 2) / 4); // L: 187
					Tiles.field1018[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3); // L: 188
				} else if (var7 <= 81) { // L: 191
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49); // L: 192
				} else {
					FaceNormal.field2621[var1][var2][var3] = (short)(var7 - 81); // L: 195
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedShort(); // L: 200
				if (var7 == 0) { // L: 201
					break;
				}

				if (var7 == 1) { // L: 202
					var0.readUnsignedByte(); // L: 203
					break; // L: 204
				}

				if (var7 <= 49) { // L: 206
					var0.readShort(); // L: 207
				}
			}
		}

	} // L: 211

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-612230964"
	)
	static int method316(int var0, Script var1, boolean var2) {
		return 2; // L: 5069
	}
}
