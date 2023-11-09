import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("ch")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[Lry;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("y")
	int[] field1224;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1039743457
	)
	int field1228;
	@ObfuscatedName("n")
	int[] field1232;
	@ObfuscatedName("r")
	int[] field1227;
	@ObfuscatedName("l")
	int[] field1237;
	@ObfuscatedName("s")
	int[] field1221;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1827124167
	)
	int field1226;
	@ObfuscatedName("b")
	int field1231;
	@ObfuscatedName("o")
	int[] field1225;
	@ObfuscatedName("u")
	int[] field1233;
	@ObfuscatedName("z")
	int[] field1234;
	@ObfuscatedName("t")
	int[] field1235;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1883625357
	)
	int field1229;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1849168848
	)
	int field1238;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 773450197
	)
	int field1236;

	@ObfuscatedSignature(
		descriptor = "([Lry;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1224 = new int[256]; // L: 13
		this.field1228 = 0; // L: 14
		this.field1226 = 0; // L: 19
		this.field1231 = 0; // L: 20
		this.field1229 = 0; // L: 25
		this.field1238 = 0; // L: 26
		this.field1236 = 0; // L: 27
		this.sprites = var1; // L: 30
		this.initColors(); // L: 31
	} // L: 32

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-15"
	)
	@Export("initColors")
	void initColors() {
		this.field1227 = new int[256]; // L: 35

		int var1;
		for (var1 = 0; var1 < 64; ++var1) { // L: 36
			this.field1227[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 37
			this.field1227[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 38
			this.field1227[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 39
			this.field1227[var1 + 192] = 16777215;
		}

		this.field1237 = new int[256]; // L: 40

		for (var1 = 0; var1 < 64; ++var1) { // L: 41
			this.field1237[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 42
			this.field1237[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 43
			this.field1237[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 44
			this.field1237[var1 + 192] = 16777215;
		}

		this.field1221 = new int[256]; // L: 45

		for (var1 = 0; var1 < 64; ++var1) { // L: 46
			this.field1221[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 47
			this.field1221[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 48
			this.field1221[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 49
			this.field1221[var1 + 192] = 16777215;
		}

		this.field1232 = new int[256]; // L: 50
		this.field1229 = 0; // L: 51
		this.field1234 = new int[32768]; // L: 52
		this.field1235 = new int[32768]; // L: 53
		this.method2362((IndexedSprite)null); // L: 54
		this.field1225 = new int[32768]; // L: 55
		this.field1233 = new int[32768]; // L: 56
	} // L: 57

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "10000"
	)
	void method2344() {
		this.field1227 = null; // L: 60
		this.field1237 = null; // L: 61
		this.field1221 = null; // L: 62
		this.field1232 = null; // L: 63
		this.field1234 = null; // L: 64
		this.field1235 = null; // L: 65
		this.field1225 = null; // L: 66
		this.field1233 = null; // L: 67
		this.field1229 = 0; // L: 68
		this.field1238 = 0; // L: 69
	} // L: 70

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-98"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1225 == null) { // L: 73
			this.initColors(); // L: 74
		}

		if (this.field1236 == 0) { // L: 76
			this.field1236 = var2; // L: 77
		}

		int var3 = var2 - this.field1236; // L: 79
		if (var3 >= 256) { // L: 80
			var3 = 0;
		}

		this.field1236 = var2; // L: 81
		if (var3 > 0) { // L: 82
			this.method2346(var3); // L: 83
		}

		this.method2374(var1); // L: 85
	} // L: 86

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1529135396"
	)
	final void method2346(int var1) {
		this.field1229 += var1 * 128; // L: 89
		int var2;
		if (this.field1229 > this.field1234.length) { // L: 90
			this.field1229 -= this.field1234.length; // L: 91
			var2 = (int)(Math.random() * 12.0D); // L: 92
			this.method2362(this.sprites[var2]); // L: 93
		}

		var2 = 0; // L: 95
		int var3 = var1 * 128; // L: 96
		int var4 = (256 - var1) * 128; // L: 97

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) { // L: 98
			var6 = this.field1225[var3 + var2] - this.field1234[var2 + this.field1229 & this.field1234.length - 1] * var1 / 6; // L: 99
			if (var6 < 0) { // L: 100
				var6 = 0;
			}

			this.field1225[var2++] = var6; // L: 101
		}

		byte var15 = 10; // L: 103
		var6 = 128 - var15; // L: 104

		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 105
			int var8 = var7 * 128; // L: 106

			for (int var9 = 0; var9 < 128; ++var9) { // L: 107
				var10 = (int)(Math.random() * 100.0D); // L: 108
				if (var10 < 50 && var9 > var15 && var9 < var6) { // L: 109
					this.field1225[var8 + var9] = 255;
				} else {
					this.field1225[var8 + var9] = 0; // L: 110
				}
			}
		}

		if (this.field1226 * 16 > 0) { // L: 113
			this.field1226 = this.field1226 * 16 - var1 * 4;
		}

		if (this.field1231 * 788944111 > 0) { // L: 114
			this.field1231 -= var1 * 640510012;
		}

		if (this.field1226 * 16 == 0 && this.field1231 * 788944111 == 0) { // L: 115
			var7 = (int)(Math.random() * (double)(2000 / var1)); // L: 116
			if (var7 == 0) { // L: 117
				this.field1226 = 1024;
			}

			if (var7 == 1) { // L: 118
				this.field1231 = 761805824;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) { // L: 120
			this.field1224[var7] = this.field1224[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 121
			this.field1224[var7] = (int)(Math.sin((double)this.field1228 / 14.0D) * 16.0D + Math.sin((double)this.field1228 / 15.0D) * 14.0D + Math.sin((double)this.field1228 / 16.0D) * 12.0D); // L: 122
			++this.field1228; // L: 123
		}

		this.field1238 = this.field1238 * 10000 + 10000 * var1; // L: 125
		var7 = ((Client.cycle & 1) + var1) / 2; // L: 126
		if (var7 > 0) { // L: 127
			short var16 = 128; // L: 128
			byte var17 = 2; // L: 129
			var10 = 128 - var17 - var17; // L: 130

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1238 * 100; ++var11) { // L: 131
				var12 = (int)(Math.random() * (double)var10) + var17; // L: 132
				var13 = (int)(Math.random() * (double)var16) + var16; // L: 133
				this.field1225[var12 + (var13 << 7)] = 192; // L: 134
			}

			this.field1238 = 0; // L: 136

			int var14;
			for (var11 = 0; var11 < 256; ++var11) { // L: 137
				var12 = 0; // L: 138
				var13 = var11 * 128; // L: 139

				for (var14 = -var7; var14 < 128; ++var14) { // L: 140
					if (var7 + var14 < 128) { // L: 141
						var12 += this.field1225[var7 + var14 + var13];
					}

					if (var14 - (var7 + 1) >= 0) { // L: 142
						var12 -= this.field1225[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) { // L: 143
						this.field1233[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) { // L: 146
				var12 = 0; // L: 147

				for (var13 = -var7; var13 < 256; ++var13) { // L: 148
					var14 = var13 * 128; // L: 149
					if (var7 + var13 < 256) { // L: 150
						var12 += this.field1233[var11 + var14 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) { // L: 151
						var12 -= this.field1233[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1225[var14 + var11] = var12 / (var7 * 2 + 1); // L: 152
					}
				}
			}
		}

	} // L: 156

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "282424643"
	)
	final int method2347(int var1, int var2, int var3) {
		int var4 = 256 - var3; // L: 159
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var3 * (var2 & 16711935) + var4 * (var1 & 16711935) & -16711936) >> 8; // L: 160
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-626555307"
	)
	final void method2374(int var1) {
		int var2 = this.field1232.length; // L: 164
		if (this.field1226 * 16 > 0) { // L: 165
			this.method2348(this.field1226 * 16, this.field1237); // L: 166
		} else if (this.field1231 * 788944111 > 0) { // L: 168
			this.method2348(this.field1231 * 788944111, this.field1221); // L: 169
		} else {
			for (int var3 = 0; var3 < var2; ++var3) { // L: 172
				this.field1232[var3] = this.field1227[var3];
			}
		}

		this.method2349(var1); // L: 174
	} // L: 175

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "383633095"
	)
	final void method2348(int var1, int[] var2) {
		int var3 = this.field1232.length; // L: 178

		for (int var4 = 0; var4 < var3; ++var4) { // L: 179
			if (var1 > 768) { // L: 180
				this.field1232[var4] = this.method2347(this.field1227[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1232[var4] = var2[var4]; // L: 181
			} else {
				this.field1232[var4] = this.method2347(var2[var4], this.field1227[var4], 256 - var1); // L: 182
			}
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "307234910"
	)
	final void method2349(int var1) {
		int var2 = 0; // L: 187

		for (int var3 = 1; var3 < 255; ++var3) { // L: 188
			int var4 = (256 - var3) * this.field1224[var3] / 256; // L: 189
			int var5 = var4 + var1; // L: 190
			int var6 = 0; // L: 191
			int var7 = 128; // L: 192
			if (var5 < 0) { // L: 193
				var6 = -var5; // L: 194
				var5 = 0; // L: 195
			}

			if (var5 + 128 >= class1.rasterProvider.width) { // L: 197
				var7 = class1.rasterProvider.width - var5; // L: 198
			}

			int var8 = var5 + (var3 + 8) * class1.rasterProvider.width; // L: 200
			var2 += var6; // L: 201

			for (int var9 = var6; var9 < var7; ++var9) { // L: 202
				int var10 = this.field1225[var2++]; // L: 203
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width; // L: 204
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 205
					int var12 = var10; // L: 206
					int var13 = 256 - var10; // L: 207
					var10 = this.field1232[var10]; // L: 208
					int var14 = class1.rasterProvider.pixels[var8]; // L: 209
					class1.rasterProvider.pixels[var8++] = -16777216 | (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) + ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) >> 8; // L: 210
				} else {
					++var8; // L: 212
				}
			}

			var2 += 128 - var7; // L: 214
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lry;B)V",
		garbageValue = "83"
	)
	final void method2362(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1234.length; ++var2) {
			this.field1234[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1234[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) { // L: 226
					var5 = var4 + (var3 << 7); // L: 227
					this.field1235[var5] = (this.field1234[var5 + 1] + this.field1234[var5 + 128] + this.field1234[var5 - 128] + this.field1234[var5 - 1]) / 4; // L: 228
				}
			}

			int[] var8 = this.field1234; // L: 231
			this.field1234 = this.field1235; // L: 232
			this.field1235 = var8; // L: 233
		}

		if (var1 != null) { // L: 235
			var2 = 0; // L: 236

			for (var3 = 0; var3 < var1.subHeight * -507610800; ++var3) { // L: 237
				for (var4 = 0; var4 < var1.subWidth; ++var4) { // L: 238
					if (var1.pixels[var2++] != 0) { // L: 239
						var5 = var4 + var1.xOffset + 16; // L: 240
						int var6 = var3 + var1.yOffset + 16; // L: 241
						int var7 = var5 + (var6 << 7); // L: 242
						this.field1234[var7] = 0; // L: 243
					}
				}
			}
		}

	} // L: 248

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "-846855505"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 216
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 217
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 218
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE; // L: 219
		} else if (var0.equals("Z")) { // L: 220
			return Boolean.TYPE;
		} else if (var0.equals("F")) { // L: 221
			return Float.TYPE;
		} else if (var0.equals("D")) { // L: 222
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE; // L: 223
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0); // L: 224 225
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhj;",
		garbageValue = "125"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 336
		if (var1 != null) { // L: 337
			return var1;
		} else {
			AbstractArchive var3 = class34.SequenceDefinition_animationsArchive; // L: 339
			AbstractArchive var4 = SequenceDefinition.SequenceDefinition_skeletonsArchive; // L: 340
			boolean var5 = true; // L: 342
			int[] var6 = var3.getGroupFileIds(var0); // L: 343

			for (int var7 = 0; var7 < var6.length; ++var7) { // L: 344
				byte[] var8 = var3.getFile(var0, var6[var7]); // L: 345
				if (var8 == null) { // L: 346
					var5 = false; // L: 347
				} else {
					int var9 = (var8[0] & 255) << 8 | var8[1] & 255; // L: 350
					byte[] var10 = var4.getFile(var9, 0); // L: 353
					if (var10 == null) { // L: 354
						var5 = false;
					}
				}
			}

			Frames var2;
			if (!var5) { // L: 356
				var2 = null; // L: 357
			} else {
				try {
					var2 = new Frames(var3, var4, var0, false); // L: 361
				} catch (Exception var12) { // L: 363
					var2 = null; // L: 364
				}
			}

			if (var2 != null) { // L: 368
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var2, (long)var0);
			}

			return var2; // L: 369
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1316905508"
	)
	static final void method2350(String var0) {
		class11.method101("Please remove " + var0 + " from your friend list first"); // L: 184
	} // L: 185
}
