import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = -2012270183
	)
	static int field1283;
	@ObfuscatedName("qk")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	static class414 field1286;
	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Lra;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("f")
	int[] field1273;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -160908861
	)
	int field1269;
	@ObfuscatedName("u")
	int[] field1282;
	@ObfuscatedName("b")
	int[] field1277;
	@ObfuscatedName("j")
	int[] field1272;
	@ObfuscatedName("g")
	int[] field1268;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1407572829
	)
	int field1285;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1106031441
	)
	int field1275;
	@ObfuscatedName("n")
	int[] field1276;
	@ObfuscatedName("k")
	int[] field1280;
	@ObfuscatedName("a")
	int[] field1278;
	@ObfuscatedName("s")
	int[] field1279;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1330592451
	)
	int field1264;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -609740368
	)
	int field1281;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 145472861
	)
	int field1274;

	@ObfuscatedSignature(
		descriptor = "([Lra;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1273 = new int[256]; // L: 13
		this.field1269 = 0; // L: 14
		this.field1285 = 0; // L: 19
		this.field1275 = 0; // L: 20
		this.field1264 = 0; // L: 25
		this.field1281 = 0; // L: 26
		this.field1274 = 0; // L: 27
		this.sprites = var1; // L: 30
		this.initColors(); // L: 31
	} // L: 32

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "87"
	)
	@Export("initColors")
	void initColors() {
		this.field1277 = new int[256]; // L: 35

		int var1;
		for (var1 = 0; var1 < 64; ++var1) { // L: 36
			this.field1277[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 37
			this.field1277[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 38
			this.field1277[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 39
			this.field1277[var1 + 192] = 16777215;
		}

		this.field1272 = new int[256]; // L: 40

		for (var1 = 0; var1 < 64; ++var1) { // L: 41
			this.field1272[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 42
			this.field1272[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 43
			this.field1272[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 44
			this.field1272[var1 + 192] = 16777215;
		}

		this.field1268 = new int[256]; // L: 45

		for (var1 = 0; var1 < 64; ++var1) { // L: 46
			this.field1268[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 47
			this.field1268[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 48
			this.field1268[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 49
			this.field1268[var1 + 192] = 16777215;
		}

		this.field1282 = new int[256]; // L: 50
		this.field1264 = 0; // L: 51
		this.field1278 = new int[32768]; // L: 52
		this.field1279 = new int[32768]; // L: 53
		this.method2378((IndexedSprite)null); // L: 54
		this.field1276 = new int[32768]; // L: 55
		this.field1280 = new int[32768]; // L: 56
	} // L: 57

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method2381() {
		this.field1277 = null; // L: 60
		this.field1272 = null; // L: 61
		this.field1268 = null; // L: 62
		this.field1282 = null; // L: 63
		this.field1278 = null; // L: 64
		this.field1279 = null; // L: 65
		this.field1276 = null; // L: 66
		this.field1280 = null; // L: 67
		this.field1264 = 0; // L: 68
		this.field1281 = 0; // L: 69
	} // L: 70

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1789761719"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1276 == null) { // L: 73
			this.initColors(); // L: 74
		}

		if (this.field1274 == 0) { // L: 76
			this.field1274 = var2; // L: 77
		}

		int var3 = var2 - this.field1274; // L: 79
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1274 = var2;
		if (var3 > 0) {
			this.method2373(var3); // L: 83
		}

		this.method2371(var1);
	} // L: 86

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1516509810"
	)
	final void method2373(int var1) {
		this.field1264 += 128 * var1; // L: 89
		int var2;
		if (this.field1264 > this.field1278.length) {
			this.field1264 -= this.field1278.length; // L: 91
			var2 = (int)(Math.random() * 12.0D); // L: 92
			this.method2378(this.sprites[var2]); // L: 93
		}

		var2 = 0; // L: 95
		int var3 = var1 * 128; // L: 96
		int var4 = (256 - var1) * 128; // L: 97

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) { // L: 98
			var6 = this.field1276[var3 + var2] - this.field1278[var2 + this.field1264 & this.field1278.length - 1] * var1 / 6; // L: 99
			if (var6 < 0) { // L: 100
				var6 = 0;
			}

			this.field1276[var2++] = var6; // L: 101
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
					this.field1276[var9 + var8] = 255;
				} else {
					this.field1276[var8 + var9] = 0; // L: 110
				}
			}
		}

		if (this.field1285 * 16 > 0) { // L: 113
			this.field1285 = this.field1285 * 16 - var1 * 4;
		}

		if (this.field1275 * 16 > 0) { // L: 114
			this.field1275 = this.field1275 * 16 - var1 * 4;
		}

		if (this.field1285 * 16 == 0 && this.field1275 * 16 == 0) { // L: 115
			var7 = (int)(Math.random() * (double)(2000 / var1)); // L: 116
			if (var7 == 0) { // L: 117
				this.field1285 = 1024;
			}

			if (var7 == 1) { // L: 118
				this.field1275 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) { // L: 120
			this.field1273[var7] = this.field1273[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 121
			this.field1273[var7] = (int)(Math.sin((double)this.field1269 / 14.0D) * 16.0D + Math.sin((double)this.field1269 / 15.0D) * 14.0D + Math.sin((double)this.field1269 / 16.0D) * 12.0D); // L: 122
			++this.field1269; // L: 123
		}

		this.field1281 = this.field1281 * 10000 + 10000 * var1; // L: 125
		var7 = ((Client.cycle & 1) + var1) / 2; // L: 126
		if (var7 > 0) { // L: 127
			short var16 = 128; // L: 128
			byte var17 = 2; // L: 129
			var10 = 128 - var17 - var17; // L: 130

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1281 * 100; ++var11) { // L: 131
				var12 = (int)(Math.random() * (double)var10) + var17; // L: 132
				var13 = (int)(Math.random() * (double)var16) + var16; // L: 133
				this.field1276[var12 + (var13 << 7)] = 192; // L: 134
			}

			this.field1281 = 0; // L: 136

			int var14;
			for (var11 = 0; var11 < 256; ++var11) { // L: 137
				var12 = 0; // L: 138
				var13 = var11 * 128; // L: 139

				for (var14 = -var7; var14 < 128; ++var14) { // L: 140
					if (var14 + var7 < 128) { // L: 141
						var12 += this.field1276[var7 + var13 + var14];
					}

					if (var14 - (var7 + 1) >= 0) { // L: 142
						var12 -= this.field1276[var13 + var14 - (var7 + 1)];
					}

					if (var14 >= 0) { // L: 143
						this.field1280[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) { // L: 146
				var12 = 0; // L: 147

				for (var13 = -var7; var13 < 256; ++var13) { // L: 148
					var14 = var13 * 128; // L: 149
					if (var7 + var13 < 256) { // L: 150
						var12 += this.field1280[var11 + var14 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) { // L: 151
						var12 -= this.field1280[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1276[var14 + var11] = var12 / (var7 * 2 + 1); // L: 152
					}
				}
			}
		}

	} // L: 156

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIS)I",
		garbageValue = "-25186"
	)
	final int method2406(int var1, int var2, int var3) {
		int var4 = 256 - var3; // L: 159
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var3 * (var2 & 16711935) + var4 * (var1 & 16711935) & -16711936) >> 8; // L: 160
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "854312768"
	)
	final void method2371(int var1) {
		int var2 = this.field1282.length; // L: 164
		if (this.field1285 * 16 > 0) { // L: 165
			this.method2376(this.field1285 * 16, this.field1272); // L: 166
		} else if (this.field1275 * 16 > 0) { // L: 168
			this.method2376(this.field1275 * 16, this.field1268); // L: 169
		} else {
			for (int var3 = 0; var3 < var2; ++var3) { // L: 172
				this.field1282[var3] = this.field1277[var3];
			}
		}

		this.method2403(var1); // L: 174
	} // L: 175

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "-583340799"
	)
	final void method2376(int var1, int[] var2) {
		int var3 = this.field1282.length; // L: 178

		for (int var4 = 0; var4 < var3; ++var4) { // L: 179
			if (var1 > 768) { // L: 180
				this.field1282[var4] = this.method2406(this.field1277[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1282[var4] = var2[var4]; // L: 181
			} else {
				this.field1282[var4] = this.method2406(var2[var4], this.field1277[var4], 256 - var1); // L: 182
			}
		}

	} // L: 184

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-59"
	)
	final void method2403(int var1) {
		int var2 = 0; // L: 187

		for (int var3 = 1; var3 < 255; ++var3) { // L: 188
			int var4 = (256 - var3) * this.field1273[var3] / 256; // L: 189
			int var5 = var4 + var1; // L: 190
			int var6 = 0; // L: 191
			int var7 = 128; // L: 192
			if (var5 < 0) { // L: 193
				var6 = -var5; // L: 194
				var5 = 0; // L: 195
			}

			if (var5 + 128 >= RouteStrategy.rasterProvider.width) { // L: 197
				var7 = RouteStrategy.rasterProvider.width - var5; // L: 198
			}

			int var8 = var5 + (var3 + 8) * RouteStrategy.rasterProvider.width; // L: 200
			var2 += var6; // L: 201

			for (int var9 = var6; var9 < var7; ++var9) { // L: 202
				int var10 = this.field1276[var2++]; // L: 203
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width; // L: 204
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 205
					int var12 = var10; // L: 206
					int var13 = 256 - var10; // L: 207
					var10 = this.field1282[var10]; // L: 208
					int var14 = RouteStrategy.rasterProvider.pixels[var8]; // L: 209
					RouteStrategy.rasterProvider.pixels[var8++] = -16777216 | ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) >> 8; // L: 210
				} else {
					++var8; // L: 212
				}
			}

			var2 += 128 - var7; // L: 214
		}

	} // L: 216

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lra;B)V",
		garbageValue = "-14"
	)
	final void method2378(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1278.length; ++var2) { // L: 219
			this.field1278[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) { // L: 220
			var3 = (int)(Math.random() * 128.0D * 256.0D); // L: 221
			this.field1278[var3] = (int)(Math.random() * 256.0D); // L: 222
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) { // L: 224
			for (var3 = 1; var3 < 255; ++var3) { // L: 225
				for (var4 = 1; var4 < 127; ++var4) { // L: 226
					var5 = var4 + (var3 << 7); // L: 227
					this.field1279[var5] = (this.field1278[var5 + 128] + this.field1278[var5 - 128] + this.field1278[var5 + 1] + this.field1278[var5 - 1]) / 4; // L: 228
				}
			}

			int[] var8 = this.field1278; // L: 231
			this.field1278 = this.field1279; // L: 232
			this.field1279 = var8; // L: 233
		}

		if (var1 != null) { // L: 235
			var2 = 0; // L: 236

			for (var3 = 0; var3 < var1.subHeight * 531611920; ++var3) { // L: 237
				for (var4 = 0; var4 < var1.subWidth; ++var4) { // L: 238
					if (var1.pixels[var2++] != 0) { // L: 239
						var5 = var4 + var1.xOffset + 16; // L: 240
						int var6 = var3 + var1.yOffset + 16; // L: 241
						int var7 = var5 + (var6 << 7); // L: 242
						this.field1278[var7] = 0; // L: 243
					}
				}
			}
		}

	} // L: 248

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1833502915"
	)
	static String method2390() {
		StringBuilder var0 = new StringBuilder(); // L: 80

		Message var2;
		for (Iterator var1 = Messages.Messages_hashTable.iterator(); var1.hasNext(); var0.append(var2.text).append('\n')) { // L: 81 87
			var2 = (Message)var1.next(); // L: 82
			if (var2.sender != null && !var2.sender.isEmpty()) { // L: 84
				var0.append(var2.sender).append(':'); // L: 85
			}
		}

		return var0.toString(); // L: 90
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lkd;I)I",
		garbageValue = "1493565771"
	)
	static int method2380(Widget var0) {
		if (var0.type != 11) { // L: 1529
			Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1530
			return 1; // L: 1531
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1533
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var0.method6171(var1); // L: 1534
			return 1; // L: 1535
		}
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(II)Lqf;",
		garbageValue = "1223108366"
	)
	static class460 method2407(int var0) {
		class460 var1 = (class460)Client.Widget_cachedModels.get((long)var0); // L: 12753
		if (var1 == null) { // L: 12754
			var1 = new class460(Ignored.field4539, class300.method5847(var0), class459.method8447(var0)); // L: 12755
			Client.Widget_cachedModels.put(var1, (long)var0); // L: 12756
		}

		return var1; // L: 12758
	}
}
