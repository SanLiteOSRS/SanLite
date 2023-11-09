import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
public class class157 extends class143 {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	static IndexedSprite field1731;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 497505199
	)
	int field1730;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class157(class146 var1) {
		this.this$0 = var1;
		this.field1730 = -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "1"
	)
	void vmethod3345(Buffer var1) {
		this.field1730 = var1.readUnsignedShort();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V",
		garbageValue = "-621392079"
	)
	void vmethod3346(ClanSettings var1) {
		var1.method3199(this.field1730); // L: 222
	} // L: 223

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ler;FZI)F",
		garbageValue = "-500490179"
	)
	static float method3279(class129 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 198
		if (var0 != null && var0.method2970() != 0) { // L: 199
			float var4 = (float)var0.field1509[0].field1454;
			float var5 = (float)var0.field1509[var0.method2970() - 1].field1454;
			float var6 = var5 - var4;
			if ((double)var6 == 0.0D) { // L: 205
				return var0.field1509[0].field1457;
			} else {
				float var7 = 0.0F; // L: 208
				if (var1 > var5) { // L: 209
					var7 = (var1 - var5) / var6; // L: 210
				} else {
					var7 = (var1 - var4) / var6; // L: 213
				}

				double var8 = (double)((int)var7); // L: 215
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 216
				float var11 = var10 * var6; // L: 217
				var8 = Math.abs(var8 + 1.0D); // L: 218
				double var12 = var8 / 2.0D; // L: 219
				double var14 = (double)((int)var12); // L: 220
				var10 = (float)(var12 - var14); // L: 221
				float var16;
				float var17;
				if (var2) { // L: 224
					if (var0.field1507 == class127.field1494) { // L: 225
						if (0.0D != (double)var10) { // L: 226
							var11 += var4; // L: 227
						} else {
							var11 = var5 - var11; // L: 230
						}
					} else if (var0.field1507 != class127.field1490 && var0.field1507 != class127.field1493) { // L: 233
						if (var0.field1507 == class127.field1491) { // L: 236
							var11 = var4 - var1; // L: 237
							var16 = var0.field1509[0].field1458; // L: 238
							var17 = var0.field1509[0].field1456; // L: 239
							var3 = var0.field1509[0].field1457; // L: 240
							if (0.0D != (double)var16) { // L: 241
								var3 -= var11 * var17 / var16; // L: 242
							}

							return var3; // L: 244
						}
					} else {
						var11 = var5 - var11; // L: 234
					}
				} else if (var0.field1508 == class127.field1494) { // L: 248
					if (0.0D != (double)var10) { // L: 249
						var11 = var5 - var11; // L: 250
					} else {
						var11 += var4; // L: 253
					}
				} else if (var0.field1508 != class127.field1490 && var0.field1508 != class127.field1493) { // L: 256
					if (var0.field1508 == class127.field1491) { // L: 259
						var11 = var1 - var5; // L: 260
						var16 = var0.field1509[var0.method2970() - 1].field1460; // L: 261
						var17 = var0.field1509[var0.method2970() - 1].field1459; // L: 262
						var3 = var0.field1509[var0.method2970() - 1].field1457; // L: 263
						if ((double)var16 != 0.0D) { // L: 264
							var3 += var11 * var17 / var16; // L: 265
						}

						return var3; // L: 267
					}
				} else {
					var11 += var4; // L: 257
				}

				var3 = World.method1794(var0, var11); // L: 270
				float var18;
				if (var2 && var0.field1507 == class127.field1493) { // L: 272
					var18 = var0.field1509[var0.method2970() - 1].field1457 - var0.field1509[0].field1457; // L: 273
					var3 = (float)((double)var3 - (double)var18 * var8); // L: 274
				} else if (!var2 && var0.field1508 == class127.field1493) { // L: 276
					var18 = var0.field1509[var0.method2970() - 1].field1457 - var0.field1509[0].field1457; // L: 277
					var3 = (float)((double)var3 + (double)var18 * var8); // L: 278
				}

				return var3; // L: 280
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ltc;IIIIIII)V",
		garbageValue = "2059587956"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (Interpreter.method1986(var1, var2, var3)) { // L: 169
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 170

			while (true) {
				var7 = var0.readUnsignedShort(); // L: 172
				if (var7 == 0) { // L: 173
					if (var1 == 0) { // L: 174
						Tiles.Tiles_heights[0][var2][var3] = -TextureProvider.method4731(var4 + 932731, 556238 + var5) * 8;
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
					Tiles.field993[var1][var2][var3] = (short)var0.readShort(); // L: 186
					Tiles.field994[var1][var2][var3] = (byte)((var7 - 2) / 4); // L: 187
					WorldMapRectangle.field3005[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3); // L: 188
				} else if (var7 <= 81) { // L: 191
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49); // L: 192
				} else {
					Tiles.field998[var1][var2][var3] = (short)(var7 - 81); // L: 195
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

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-779904485"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field708 = 0L; // L: 4524
		if (var0 >= 2) { // L: 4525
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 4526
		}

		if (DecorativeObject.getWindowedMode() == 1) { // L: 4527
			class439.client.setMaxCanvasSize(765, 503); // L: 4528
		} else {
			class439.client.setMaxCanvasSize(7680, 2160); // L: 4531
		}

		if (Client.gameState >= 25) { // L: 4533
			class407.method7663();
		}

	} // L: 4534

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "444262637"
	)
	static final void method3272(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 12033
		WorldMapManager.clientPreferences.method2456(var0); // L: 12034
	} // L: 12035
}
