import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
public class class427 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	public static final class427 field4680;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	static final class427 field4678;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("musicTrack")
	public static MusicTrack musicTrack;
	@ObfuscatedName("v")
	String field4677;

	static {
		field4680 = new class427("application/json"); // L: 4
		field4678 = new class427("text/plain"); // L: 5
	}

	class427(String var1) {
		this.field4677 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "105"
	)
	public String method8031() {
		return this.field4677; // L: 13
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lrd;IIIIIII)V",
		garbageValue = "821456932"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (HealthBar.method2611(var1, var2, var3)) { // L: 152
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 153

			while (true) {
				var7 = Client.field505 < 209 ? var0.readUnsignedByte() : var0.readUnsignedShort(); // L: 155
				if (var7 == 0) { // L: 156
					if (var1 == 0) { // L: 157
						int[] var14 = Tiles.Tiles_heights[0][var2]; // L: 158
						int var11 = var4 + 932731; // L: 161
						int var12 = var5 + 556238; // L: 162
						int var13 = class4.method17(45365 + var11, var12 + 91923, 4) - 128 + (class4.method17(10294 + var11, var12 + 37821, 2) - 128 >> 1) + (class4.method17(var11, var12, 1) - 128 >> 2); // L: 164
						var13 = (int)(0.3D * (double)var13) + 35; // L: 165
						if (var13 < 10) { // L: 166
							var13 = 10;
						} else if (var13 > 60) { // L: 167
							var13 = 60;
						}

						var14[var3] = -var13 * 8; // L: 170
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 172
					}
					break;
				}

				if (var7 == 1) { // L: 175
					int var8 = var0.readUnsignedByte(); // L: 176
					if (var8 == 1) { // L: 177
						var8 = 0;
					}

					if (var1 == 0) { // L: 178
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8; // L: 179
					}
					break;
				}

				if (var7 <= 49) { // L: 182
					class172.field1865[var1][var2][var3] = Client.field505 < 209 ? (short)var0.readByte() : (short)var0.readShort(); // L: 183
					Tiles.field1011[var1][var2][var3] = (byte)((var7 - 2) / 4); // L: 184
					Tiles.field1012[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3); // L: 185
				} else if (var7 <= 81) { // L: 188
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49); // L: 189
				} else {
					Tiles.field1010[var1][var2][var3] = (short)(var7 - 81); // L: 192
				}
			}
		} else {
			while (true) {
				var7 = Client.field505 < 209 ? var0.readUnsignedByte() : var0.readUnsignedShort(); // L: 197
				if (var7 == 0) { // L: 198
					break;
				}

				if (var7 == 1) { // L: 199
					var0.readUnsignedByte(); // L: 200
					break; // L: 201
				}

				if (var7 <= 49) { // L: 203
					if (Client.field505 < 209) { // L: 204
						var0.readByte(); // L: 205
					} else {
						var0.readShort(); // L: 208
					}
				}
			}
		}

	} // L: 213
}
