import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cq")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = 300589696
	)
	static int field1233;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = -1154483311
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("z")
	int[] field1218;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1486098233
	)
	int field1219;
	@ObfuscatedName("h")
	int[] field1220;
	@ObfuscatedName("a")
	int[] field1229;
	@ObfuscatedName("d")
	int[] field1222;
	@ObfuscatedName("n")
	int[] field1223;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 359650093
	)
	int field1224;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1905612583
	)
	int field1225;
	@ObfuscatedName("p")
	int[] field1226;
	@ObfuscatedName("b")
	int[] field1227;
	@ObfuscatedName("l")
	int[] field1214;
	@ObfuscatedName("y")
	int[] field1213;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -78773531
	)
	int field1215;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1400814000
	)
	int field1231;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -576484813
	)
	int field1228;

	@ObfuscatedSignature(
		descriptor = "([Lql;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1218 = new int[256]; // L: 13
		this.field1219 = 0; // L: 14
		this.field1224 = 0; // L: 19
		this.field1225 = 0; // L: 20
		this.field1215 = 0; // L: 25
		this.field1231 = 0; // L: 26
		this.field1228 = 0; // L: 27
		this.sprites = var1; // L: 30
		this.initColors(); // L: 31
	} // L: 32

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1253946128"
	)
	@Export("initColors")
	void initColors() {
		this.field1229 = new int[256]; // L: 35

		int var1;
		for (var1 = 0; var1 < 64; ++var1) { // L: 36
			this.field1229[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 37
			this.field1229[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 38
			this.field1229[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1229[var1 + 192] = 16777215;
		}

		this.field1222 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1222[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 42
			this.field1222[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 43
			this.field1222[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 44
			this.field1222[var1 + 192] = 16777215;
		}

		this.field1223 = new int[256]; // L: 45

		for (var1 = 0; var1 < 64; ++var1) { // L: 46
			this.field1223[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 47
			this.field1223[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 48
			this.field1223[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 49
			this.field1223[var1 + 192] = 16777215;
		}

		this.field1220 = new int[256]; // L: 50
		this.field1215 = 0; // L: 51
		this.field1214 = new int[32768]; // L: 52
		this.field1213 = new int[32768]; // L: 53
		this.method2283((IndexedSprite)null); // L: 54
		this.field1226 = new int[32768]; // L: 55
		this.field1227 = new int[32768]; // L: 56
	} // L: 57

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "325280497"
	)
	void method2275() {
		this.field1229 = null; // L: 60
		this.field1222 = null; // L: 61
		this.field1223 = null; // L: 62
		this.field1220 = null; // L: 63
		this.field1214 = null; // L: 64
		this.field1213 = null; // L: 65
		this.field1226 = null; // L: 66
		this.field1227 = null; // L: 67
		this.field1215 = 0; // L: 68
		this.field1231 = 0; // L: 69
	} // L: 70

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-27976"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1226 == null) { // L: 73
			this.initColors(); // L: 74
		}

		if (this.field1228 == 0) { // L: 76
			this.field1228 = var2; // L: 77
		}

		int var3 = var2 - this.field1228; // L: 79
		if (var3 >= 256) { // L: 80
			var3 = 0;
		}

		this.field1228 = var2; // L: 81
		if (var3 > 0) { // L: 82
			this.method2292(var3); // L: 83
		}

		this.method2300(var1); // L: 85
	} // L: 86

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-112"
	)
	final void method2292(int var1) {
		this.field1215 += 128 * var1; // L: 89
		int var2;
		if (this.field1215 > this.field1214.length) {
			this.field1215 -= this.field1214.length; // L: 91
			var2 = (int)(Math.random() * 12.0D);
			this.method2283(this.sprites[var2]);
		}

		var2 = 0; // L: 95
		int var3 = var1 * 128; // L: 96
		int var4 = (256 - var1) * 128; // L: 97

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) { // L: 98
			var6 = this.field1226[var2 + var3] - this.field1214[var2 + this.field1215 & this.field1214.length - 1] * var1 / 6; // L: 99
			if (var6 < 0) { // L: 100
				var6 = 0;
			}

			this.field1226[var2++] = var6; // L: 101
		}

		byte var15 = 10; // L: 103
		var6 = 128 - var15;

		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) {
			int var8 = var7 * 128; // L: 106

			for (int var9 = 0; var9 < 128; ++var9) { // L: 107
				var10 = (int)(Math.random() * 100.0D); // L: 108
				if (var10 < 50 && var9 > var15 && var9 < var6) { // L: 109
					this.field1226[var9 + var8] = 255;
				} else {
					this.field1226[var8 + var9] = 0; // L: 110
				}
			}
		}

		if (this.field1224 * 16 > 0) { // L: 113
			this.field1224 = this.field1224 * 16 - var1 * 4;
		}

		if (this.field1225 * 16 > 0) { // L: 114
			this.field1225 = this.field1225 * 16 - var1 * 4;
		}

		if (this.field1224 * 16 == 0 && this.field1225 * 16 == 0) { // L: 115
			var7 = (int)(Math.random() * (double)(2000 / var1)); // L: 116
			if (var7 == 0) { // L: 117
				this.field1224 = 1024;
			}

			if (var7 == 1) { // L: 118
				this.field1225 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) { // L: 120
			this.field1218[var7] = this.field1218[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 121
			this.field1218[var7] = (int)(Math.sin((double)this.field1219 / 14.0D) * 16.0D + Math.sin((double)this.field1219 / 15.0D) * 14.0D + Math.sin((double)this.field1219 / 16.0D) * 12.0D); // L: 122
			++this.field1219; // L: 123
		}

		this.field1231 = this.field1231 * 10000 + var1 * 10000; // L: 125
		var7 = ((Client.cycle & 1) + var1) / 2; // L: 126
		if (var7 > 0) { // L: 127
			short var16 = 128; // L: 128
			byte var17 = 2; // L: 129
			var10 = 128 - var17 - var17; // L: 130

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1231 * 100; ++var11) { // L: 131
				var12 = (int)(Math.random() * (double)var10) + var17; // L: 132
				var13 = (int)(Math.random() * (double)var16) + var16; // L: 133
				this.field1226[var12 + (var13 << 7)] = 192; // L: 134
			}

			this.field1231 = 0; // L: 136

			int var14;
			for (var11 = 0; var11 < 256; ++var11) { // L: 137
				var12 = 0; // L: 138
				var13 = var11 * 128; // L: 139

				for (var14 = -var7; var14 < 128; ++var14) { // L: 140
					if (var14 + var7 < 128) { // L: 141
						var12 += this.field1226[var13 + var14 + var7];
					}

					if (var14 - (var7 + 1) >= 0) { // L: 142
						var12 -= this.field1226[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) { // L: 143
						this.field1227[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) { // L: 146
				var12 = 0; // L: 147

				for (var13 = -var7; var13 < 256; ++var13) { // L: 148
					var14 = var13 * 128; // L: 149
					if (var13 + var7 < 256) { // L: 150
						var12 += this.field1227[var7 * 128 + var11 + var14];
					}

					if (var13 - (var7 + 1) >= 0) { // L: 151
						var12 -= this.field1227[var14 + var11 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1226[var14 + var11] = var12 / (var7 * 2 + 1); // L: 152
					}
				}
			}
		}

	} // L: 156

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1438143565"
	)
	final int method2280(int var1, int var2, int var3) {
		int var4 = 256 - var3; // L: 159
		return (var4 * (var1 & 65280) + var3 * (var2 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8; // L: 160
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "50"
	)
	final void method2300(int var1) {
		int var2 = this.field1220.length; // L: 164
		if (this.field1224 * 16 > 0) { // L: 165
			this.method2297(this.field1224 * 16, this.field1222); // L: 166
		} else if (this.field1225 * 16 > 0) { // L: 168
			this.method2297(this.field1225 * 16, this.field1223); // L: 169
		} else {
			for (int var3 = 0; var3 < var2; ++var3) { // L: 172
				this.field1220[var3] = this.field1229[var3];
			}
		}

		this.method2281(var1); // L: 174
	} // L: 175

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "-571629794"
	)
	final void method2297(int var1, int[] var2) {
		int var3 = this.field1220.length; // L: 178

		for (int var4 = 0; var4 < var3; ++var4) { // L: 179
			if (var1 > 768) { // L: 180
				this.field1220[var4] = this.method2280(this.field1229[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1220[var4] = var2[var4]; // L: 181
			} else {
				this.field1220[var4] = this.method2280(var2[var4], this.field1229[var4], 256 - var1); // L: 182
			}
		}

	} // L: 184

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-103"
	)
	final void method2281(int var1) {
		int var2 = 0; // L: 187

		for (int var3 = 1; var3 < 255; ++var3) { // L: 188
			int var4 = (256 - var3) * this.field1218[var3] / 256; // L: 189
			int var5 = var4 + var1; // L: 190
			int var6 = 0; // L: 191
			int var7 = 128; // L: 192
			if (var5 < 0) { // L: 193
				var6 = -var5; // L: 194
				var5 = 0; // L: 195
			}

			if (var5 + 128 >= class268.rasterProvider.width) { // L: 197
				var7 = class268.rasterProvider.width - var5; // L: 198
			}

			int var8 = var5 + (var3 + 8) * class268.rasterProvider.width; // L: 200
			var2 += var6; // L: 201

			for (int var9 = var6; var9 < var7; ++var9) { // L: 202
				int var10 = this.field1226[var2++]; // L: 203
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width; // L: 204
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 205
					int var12 = var10; // L: 206
					int var13 = 256 - var10; // L: 207
					var10 = this.field1220[var10]; // L: 208
					int var14 = class268.rasterProvider.pixels[var8]; // L: 209
					class268.rasterProvider.pixels[var8++] = -16777216 | ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) + (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) >> 8; // L: 210
				} else {
					++var8; // L: 212
				}
			}

			var2 += 128 - var7; // L: 214
		}

	} // L: 216

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lql;I)V",
		garbageValue = "-1405909757"
	)
	final void method2283(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1214.length; ++var2) { // L: 219
			this.field1214[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) { // L: 220
			var3 = (int)(Math.random() * 128.0D * 256.0D); // L: 221
			this.field1214[var3] = (int)(Math.random() * 256.0D); // L: 222
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) { // L: 224
			for (var3 = 1; var3 < 255; ++var3) { // L: 225
				for (var4 = 1; var4 < 127; ++var4) { // L: 226
					var5 = var4 + (var3 << 7); // L: 227
					this.field1213[var5] = (this.field1214[var5 + 1] + this.field1214[var5 - 128] + this.field1214[var5 + 128] + this.field1214[var5 - 1]) / 4; // L: 228
				}
			}

			int[] var8 = this.field1214; // L: 231
			this.field1214 = this.field1213; // L: 232
			this.field1213 = var8; // L: 233
		}

		if (var1 != null) { // L: 235
			var2 = 0; // L: 236

			for (var3 = 0; var3 < var1.subHeight; ++var3) { // L: 237
				for (var4 = 0; var4 < var1.subWidth; ++var4) { // L: 238
					if (var1.pixels[var2++] != 0) { // L: 239
						var5 = var4 + var1.xOffset + 16; // L: 240
						int var6 = var3 + var1.yOffset + 16; // L: 241
						int var7 = var5 + (var6 << 7); // L: 242
						this.field1214[var7] = 0; // L: 243
					}
				}
			}
		}

	} // L: 248

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "482402081"
	)
	static SecureRandom method2306() {
		SecureRandom var0 = new SecureRandom(); // L: 39
		var0.nextInt(); // L: 40
		return var0; // L: 41
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Ldg;",
		garbageValue = "1649345102"
	)
	static class119 method2305(int var0) {
		class119[] var1 = new class119[]{class119.field1467, class119.field1466, class119.field1465, class119.field1468, class119.field1470, class119.field1473, class119.field1471, class119.field1483, class119.field1472, class119.field1474, class119.field1475, class119.field1476, class119.field1479, class119.field1478, class119.field1484, class119.field1480, class119.field1481}; // L: 90
		class119 var2 = (class119)class271.findEnumerated(var1, var0); // L: 92
		if (var2 == null) { // L: 93
			var2 = class119.field1467;
		}

		return var2; // L: 94
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "443414989"
	)
	static final void method2279(String var0) {
		FileSystem.addGameMessage(30, "", var0); // L: 104
	} // L: 105

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "-2138590712"
	)
	static int method2307(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1279
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1296
				var7 = var2 ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget; // L: 1297
				var4 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 1298
				if (var4 >= 1 && var4 <= 10) { // L: 1299
					class93 var8 = new class93(var4, var7.id, var7.childIndex, var7.itemId); // L: 1302
					Interpreter.field841.add(var8); // L: 1303
					return 1; // L: 1304
				} else {
					throw new RuntimeException(); // L: 1300
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1306
				TaskHandler.Interpreter_intStackSize -= 3; // L: 1307
				int var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 1308
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 1309
				int var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]; // L: 1310
				if (var5 >= 1 && var5 <= 10) { // L: 1311
					class93 var6 = new class93(var5, var3, var4, FloorUnderlayDefinition.getWidget(var3).itemId); // L: 1314
					Interpreter.field841.add(var6); // L: 1315
					return 1; // L: 1316
				} else {
					throw new RuntimeException(); // L: 1312
				}
			} else {
				return 2; // L: 1318
			}
		} else if (Interpreter.field844 >= 10) { // L: 1280
			throw new RuntimeException(); // L: 1281
		} else {
			if (var0 >= 2000) { // L: 1284
				var7 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 1285
			} else {
				var7 = var2 ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget; // L: 1287
			}

			if (var7.onResize == null) { // L: 1288
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1289
				var9.widget = var7; // L: 1290
				var9.args = var7.onResize; // L: 1291
				var9.field1049 = Interpreter.field844 + 1; // L: 1292
				Client.scriptEvents.addFirst(var9); // L: 1293
				return 1; // L: 1294
			}
		}
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIS)V",
		garbageValue = "128"
	)
	static final void method2304(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 10423
		int var7 = var3 - var1; // L: 10424
		int var8 = var6 >= 0 ? var6 : -var6; // L: 10425
		int var9 = var7 >= 0 ? var7 : -var7; // L: 10426
		int var10 = var8; // L: 10427
		if (var8 < var9) { // L: 10428
			var10 = var9;
		}

		if (var10 != 0) { // L: 10429
			int var11 = (var6 << 16) / var10; // L: 10430
			int var12 = (var7 << 16) / var10; // L: 10431
			if (var12 <= var11) { // L: 10432
				var11 = -var11;
			} else {
				var12 = -var12; // L: 10433
			}

			int var13 = var5 * var12 >> 17; // L: 10434
			int var14 = var5 * var12 + 1 >> 17; // L: 10435
			int var15 = var5 * var11 >> 17; // L: 10436
			int var16 = var5 * var11 + 1 >> 17; // L: 10437
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 10438
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 10439
			int var17 = var0 + var13; // L: 10440
			int var18 = var0 - var14; // L: 10441
			int var19 = var0 + var6 - var14; // L: 10442
			int var20 = var0 + var6 + var13; // L: 10443
			int var21 = var15 + var1; // L: 10444
			int var22 = var1 - var16; // L: 10445
			int var23 = var7 + var1 - var16; // L: 10446
			int var24 = var7 + var15 + var1; // L: 10447
			Rasterizer3D.method4008(var17, var18, var19); // L: 10448
			Rasterizer3D.method4009(var21, var22, var23, var17, var18, var19, var4); // L: 10449
			Rasterizer3D.method4008(var17, var19, var20); // L: 10450
			Rasterizer3D.method4009(var21, var23, var24, var17, var19, var20, var4); // L: 10451
		}
	} // L: 10452
}
