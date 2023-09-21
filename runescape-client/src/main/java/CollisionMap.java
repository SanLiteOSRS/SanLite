import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("CollisionMap")
public class CollisionMap {
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field2392;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -2021200957
	)
	@Export("xInset")
	int xInset;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -699061873
	)
	@Export("yInset")
	int yInset;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1430235387
	)
	@Export("xSize")
	int xSize;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -182180591
	)
	@Export("ySize")
	int ySize;
	@ObfuscatedName("bt")
	@Export("flags")
	public int[][] flags;

	public CollisionMap(int var1, int var2) {
		this.xInset = 0;
		this.yInset = 0;
		this.xSize = var1;
		this.ySize = var2;
		this.flags = new int[this.xSize][this.ySize]; // L: 48
		this.clear();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1112127553"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.xSize; ++var1) {
			for (int var2 = 0; var2 < this.ySize; ++var2) {
				if (var1 != 0 && var2 != 0 && var1 < this.xSize - 5 && var2 < this.ySize - 5) {
					this.flags[var1][var2] = 16777216; // L: 56
				} else {
					this.flags[var1][var2] = 16777215;
				}
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIZB)V",
		garbageValue = "22"
	)
	public void method4331(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		if (var3 == 0) { // L: 64
			if (var4 == 0) {
				this.setFlag(var1, var2, 128); // L: 66
				this.setFlag(var1 - 1, var2, 8); // L: 67
			}

			if (var4 == 1) { // L: 69
				this.setFlag(var1, var2, 2); // L: 70
				this.setFlag(var1, var2 + 1, 32); // L: 71
			}

			if (var4 == 2) { // L: 73
				this.setFlag(var1, var2, 8); // L: 74
				this.setFlag(var1 + 1, var2, 128); // L: 75
			}

			if (var4 == 3) { // L: 77
				this.setFlag(var1, var2, 32); // L: 78
				this.setFlag(var1, var2 - 1, 2); // L: 79
			}
		}

		if (var3 == 1 || var3 == 3) { // L: 82
			if (var4 == 0) { // L: 83
				this.setFlag(var1, var2, 1); // L: 84
				this.setFlag(var1 - 1, var2 + 1, 16); // L: 85
			}

			if (var4 == 1) { // L: 87
				this.setFlag(var1, var2, 4); // L: 88
				this.setFlag(var1 + 1, var2 + 1, 64); // L: 89
			}

			if (var4 == 2) { // L: 91
				this.setFlag(var1, var2, 16); // L: 92
				this.setFlag(var1 + 1, var2 - 1, 1); // L: 93
			}

			if (var4 == 3) { // L: 95
				this.setFlag(var1, var2, 64); // L: 96
				this.setFlag(var1 - 1, var2 - 1, 4); // L: 97
			}
		}

		if (var3 == 2) { // L: 100
			if (var4 == 0) { // L: 101
				this.setFlag(var1, var2, 130); // L: 102
				this.setFlag(var1 - 1, var2, 8); // L: 103
				this.setFlag(var1, var2 + 1, 32); // L: 104
			}

			if (var4 == 1) { // L: 106
				this.setFlag(var1, var2, 10); // L: 107
				this.setFlag(var1, var2 + 1, 32); // L: 108
				this.setFlag(var1 + 1, var2, 128); // L: 109
			}

			if (var4 == 2) { // L: 111
				this.setFlag(var1, var2, 40); // L: 112
				this.setFlag(var1 + 1, var2, 128); // L: 113
				this.setFlag(var1, var2 - 1, 2); // L: 114
			}

			if (var4 == 3) { // L: 116
				this.setFlag(var1, var2, 160); // L: 117
				this.setFlag(var1, var2 - 1, 2); // L: 118
				this.setFlag(var1 - 1, var2, 8); // L: 119
			}
		}

		if (var5) { // L: 122
			if (var3 == 0) { // L: 123
				if (var4 == 0) { // L: 124
					this.setFlag(var1, var2, 65536); // L: 125
					this.setFlag(var1 - 1, var2, 4096); // L: 126
				}

				if (var4 == 1) { // L: 128
					this.setFlag(var1, var2, 1024); // L: 129
					this.setFlag(var1, var2 + 1, 16384); // L: 130
				}

				if (var4 == 2) { // L: 132
					this.setFlag(var1, var2, 4096); // L: 133
					this.setFlag(var1 + 1, var2, 65536); // L: 134
				}

				if (var4 == 3) { // L: 136
					this.setFlag(var1, var2, 16384); // L: 137
					this.setFlag(var1, var2 - 1, 1024); // L: 138
				}
			}

			if (var3 == 1 || var3 == 3) { // L: 141
				if (var4 == 0) { // L: 142
					this.setFlag(var1, var2, 512); // L: 143
					this.setFlag(var1 - 1, var2 + 1, 8192); // L: 144
				}

				if (var4 == 1) { // L: 146
					this.setFlag(var1, var2, 2048); // L: 147
					this.setFlag(var1 + 1, var2 + 1, 32768); // L: 148
				}

				if (var4 == 2) { // L: 150
					this.setFlag(var1, var2, 8192); // L: 151
					this.setFlag(var1 + 1, var2 - 1, 512); // L: 152
				}

				if (var4 == 3) { // L: 154
					this.setFlag(var1, var2, 32768); // L: 155
					this.setFlag(var1 - 1, var2 - 1, 2048); // L: 156
				}
			}

			if (var3 == 2) { // L: 159
				if (var4 == 0) { // L: 160
					this.setFlag(var1, var2, 66560); // L: 161
					this.setFlag(var1 - 1, var2, 4096); // L: 162
					this.setFlag(var1, var2 + 1, 16384); // L: 163
				}

				if (var4 == 1) { // L: 165
					this.setFlag(var1, var2, 5120); // L: 166
					this.setFlag(var1, var2 + 1, 16384); // L: 167
					this.setFlag(var1 + 1, var2, 65536); // L: 168
				}

				if (var4 == 2) { // L: 170
					this.setFlag(var1, var2, 20480); // L: 171
					this.setFlag(var1 + 1, var2, 65536); // L: 172
					this.setFlag(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 81920);
					this.setFlag(var1, var2 - 1, 1024);
					this.setFlag(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIZB)V",
		garbageValue = "-29"
	)
	@Export("addGameObject")
	public void addGameObject(int var1, int var2, int var3, int var4, boolean var5) {
		int var6 = 256; // L: 185
		if (var5) {
			var6 += 131072;
		}

		var1 -= this.xInset;
		var2 -= this.yInset; // L: 188

		for (int var7 = var1; var7 < var3 + var1; ++var7) {
			if (var7 >= 0 && var7 < this.xSize) { // L: 190
				for (int var8 = var2; var8 < var2 + var4; ++var8) {
					if (var8 >= 0 && var8 < this.ySize) { // L: 192
						this.setFlag(var7, var8, var6);
					}
				}
			}
		}

	} // L: 196

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "404851372"
	)
	@Export("setBlockedByFloor")
	public void setBlockedByFloor(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset; // L: 200
		int[] var10000 = this.flags[var1];
		var10000[var2] |= 2097152;
	} // L: 202

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "43"
	)
	@Export("setBlockedByFloorDec")
	public void setBlockedByFloorDec(int var1, int var2) {
		var1 -= this.xInset; // L: 205
		var2 -= this.yInset; // L: 206
		int[] var10000 = this.flags[var1]; // L: 207
		var10000[var2] |= 262144;
	} // L: 208

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1437518268"
	)
	@Export("setFlag")
	void setFlag(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1]; // L: 211
		var10000[var2] |= var3;
	} // L: 212

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "1303990924"
	)
	public void method4334(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset; // L: 215
		var2 -= this.yInset; // L: 216
		if (var3 == 0) { // L: 217
			if (var4 == 0) { // L: 218
				this.setFlagOff(var1, var2, 128); // L: 219
				this.setFlagOff(var1 - 1, var2, 8); // L: 220
			}

			if (var4 == 1) { // L: 222
				this.setFlagOff(var1, var2, 2); // L: 223
				this.setFlagOff(var1, var2 + 1, 32); // L: 224
			}

			if (var4 == 2) { // L: 226
				this.setFlagOff(var1, var2, 8); // L: 227
				this.setFlagOff(var1 + 1, var2, 128); // L: 228
			}

			if (var4 == 3) { // L: 230
				this.setFlagOff(var1, var2, 32); // L: 231
				this.setFlagOff(var1, var2 - 1, 2); // L: 232
			}
		}

		if (var3 == 1 || var3 == 3) { // L: 235
			if (var4 == 0) { // L: 236
				this.setFlagOff(var1, var2, 1); // L: 237
				this.setFlagOff(var1 - 1, var2 + 1, 16); // L: 238
			}

			if (var4 == 1) { // L: 240
				this.setFlagOff(var1, var2, 4); // L: 241
				this.setFlagOff(var1 + 1, var2 + 1, 64); // L: 242
			}

			if (var4 == 2) { // L: 244
				this.setFlagOff(var1, var2, 16); // L: 245
				this.setFlagOff(var1 + 1, var2 - 1, 1); // L: 246
			}

			if (var4 == 3) { // L: 248
				this.setFlagOff(var1, var2, 64); // L: 249
				this.setFlagOff(var1 - 1, var2 - 1, 4); // L: 250
			}
		}

		if (var3 == 2) { // L: 253
			if (var4 == 0) { // L: 254
				this.setFlagOff(var1, var2, 130); // L: 255
				this.setFlagOff(var1 - 1, var2, 8); // L: 256
				this.setFlagOff(var1, var2 + 1, 32); // L: 257
			}

			if (var4 == 1) { // L: 259
				this.setFlagOff(var1, var2, 10); // L: 260
				this.setFlagOff(var1, var2 + 1, 32); // L: 261
				this.setFlagOff(var1 + 1, var2, 128); // L: 262
			}

			if (var4 == 2) { // L: 264
				this.setFlagOff(var1, var2, 40); // L: 265
				this.setFlagOff(var1 + 1, var2, 128); // L: 266
				this.setFlagOff(var1, var2 - 1, 2); // L: 267
			}

			if (var4 == 3) { // L: 269
				this.setFlagOff(var1, var2, 160); // L: 270
				this.setFlagOff(var1, var2 - 1, 2); // L: 271
				this.setFlagOff(var1 - 1, var2, 8); // L: 272
			}
		}

		if (var5) { // L: 275
			if (var3 == 0) { // L: 276
				if (var4 == 0) { // L: 277
					this.setFlagOff(var1, var2, 65536); // L: 278
					this.setFlagOff(var1 - 1, var2, 4096); // L: 279
				}

				if (var4 == 1) { // L: 281
					this.setFlagOff(var1, var2, 1024); // L: 282
					this.setFlagOff(var1, var2 + 1, 16384); // L: 283
				}

				if (var4 == 2) { // L: 285
					this.setFlagOff(var1, var2, 4096); // L: 286
					this.setFlagOff(var1 + 1, var2, 65536); // L: 287
				}

				if (var4 == 3) { // L: 289
					this.setFlagOff(var1, var2, 16384); // L: 290
					this.setFlagOff(var1, var2 - 1, 1024); // L: 291
				}
			}

			if (var3 == 1 || var3 == 3) { // L: 294
				if (var4 == 0) { // L: 295
					this.setFlagOff(var1, var2, 512); // L: 296
					this.setFlagOff(var1 - 1, var2 + 1, 8192); // L: 297
				}

				if (var4 == 1) { // L: 299
					this.setFlagOff(var1, var2, 2048); // L: 300
					this.setFlagOff(var1 + 1, var2 + 1, 32768); // L: 301
				}

				if (var4 == 2) { // L: 303
					this.setFlagOff(var1, var2, 8192); // L: 304
					this.setFlagOff(var1 + 1, var2 - 1, 512); // L: 305
				}

				if (var4 == 3) { // L: 307
					this.setFlagOff(var1, var2, 32768); // L: 308
					this.setFlagOff(var1 - 1, var2 - 1, 2048); // L: 309
				}
			}

			if (var3 == 2) { // L: 312
				if (var4 == 0) { // L: 313
					this.setFlagOff(var1, var2, 66560); // L: 314
					this.setFlagOff(var1 - 1, var2, 4096); // L: 315
					this.setFlagOff(var1, var2 + 1, 16384); // L: 316
				}

				if (var4 == 1) { // L: 318
					this.setFlagOff(var1, var2, 5120); // L: 319
					this.setFlagOff(var1, var2 + 1, 16384); // L: 320
					this.setFlagOff(var1 + 1, var2, 65536); // L: 321
				}

				if (var4 == 2) { // L: 323
					this.setFlagOff(var1, var2, 20480); // L: 324
					this.setFlagOff(var1 + 1, var2, 65536); // L: 325
					this.setFlagOff(var1, var2 - 1, 1024); // L: 326
				}

				if (var4 == 3) { // L: 328
					this.setFlagOff(var1, var2, 81920); // L: 329
					this.setFlagOff(var1, var2 - 1, 1024); // L: 330
					this.setFlagOff(var1 - 1, var2, 4096); // L: 331
				}
			}
		}

	} // L: 335

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)V",
		garbageValue = "-1836775904"
	)
	@Export("setFlagOffNonSquare")
	public void setFlagOffNonSquare(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var7 = 256; // L: 338
		if (var6) { // L: 339
			var7 += 131072;
		}

		var1 -= this.xInset; // L: 340
		var2 -= this.yInset; // L: 341
		int var8;
		if (var5 == 1 || var5 == 3) { // L: 342
			var8 = var3; // L: 343
			var3 = var4; // L: 344
			var4 = var8; // L: 345
		}

		for (var8 = var1; var8 < var3 + var1; ++var8) { // L: 347
			if (var8 >= 0 && var8 < this.xSize) { // L: 348
				for (int var9 = var2; var9 < var2 + var4; ++var9) { // L: 349
					if (var9 >= 0 && var9 < this.ySize) {
						this.setFlagOff(var8, var9, var7); // L: 350
					}
				}
			}
		}

	} // L: 354

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "2063236329"
	)
	@Export("setFlagOff")
	void setFlagOff(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1]; // L: 357
		var10000[var2] &= ~var3;
	} // L: 358

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-278708003"
	)
	public void method4315(int var1, int var2) {
		var1 -= this.xInset; // L: 361
		var2 -= this.yInset; // L: 362
		int[] var10000 = this.flags[var1]; // L: 363
		var10000[var2] &= -262145;
	} // L: 364

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Loa;B)I",
		garbageValue = "-53"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length(); // L: 11
		int var4 = var1.length(); // L: 12
		int var5 = 0; // L: 13
		int var6 = 0; // L: 14
		char var7 = 0; // L: 15
		char var8 = 0; // L: 16

		while (var5 - var7 < var3 || var6 - var8 < var4) { // L: 18
			if (var5 - var7 >= var3) { // L: 19
				return -1;
			}

			if (var6 - var8 >= var4) { // L: 20
				return 1;
			}

			char var9;
			if (var7 != 0) { // L: 23
				var9 = var7; // L: 24
				boolean var14 = false; // L: 25
			} else {
				var9 = var0.charAt(var5++); // L: 27
			}

			char var10;
			if (var8 != 0) { // L: 28
				var10 = var8; // L: 29
				boolean var15 = false; // L: 30
			} else {
				var10 = var1.charAt(var6++); // L: 32
			}

			var7 = class216.method3940(var9); // L: 33
			var8 = class216.method3940(var10); // L: 34
			var9 = class319.standardizeChar(var9, var2); // L: 35
			var10 = class319.standardizeChar(var10, var2); // L: 36
			if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) { // L: 37
				var9 = Character.toLowerCase(var9); // L: 38
				var10 = Character.toLowerCase(var10); // L: 39
				if (var9 != var10) { // L: 40
					return class11.lowercaseChar(var9, var2) - class11.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4); // L: 43

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) { // L: 44
			if (var2 == Language.Language_FR) { // L: 45
				var5 = var3 - 1 - var17; // L: 46
				var6 = var4 - 1 - var17; // L: 47
			} else {
				var6 = var17; // L: 49
				var5 = var17;
			}

			char var11 = var0.charAt(var5); // L: 50
			var12 = var1.charAt(var6); // L: 51
			if (var12 != var11 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) { // L: 52
				var11 = Character.toLowerCase(var11); // L: 53
				var12 = Character.toLowerCase(var12); // L: 54
				if (var12 != var11) { // L: 55
					return class11.lowercaseChar(var11, var2) - class11.lowercaseChar(var12, var2);
				}
			}
		}

		var17 = var3 - var4; // L: 58
		if (var17 != 0) { // L: 59
			return var17;
		} else {
			for (int var18 = 0; var18 < var16; ++var18) { // L: 60
				var12 = var0.charAt(var18); // L: 61
				char var13 = var1.charAt(var18); // L: 62
				if (var13 != var12) { // L: 63
					return class11.lowercaseChar(var12, var2) - class11.lowercaseChar(var13, var2);
				}
			}

			return 0; // L: 65
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "10"
	)
	public static boolean method4325() {
		boolean var0 = false; // L: 173
		boolean var1 = false; // L: 174
		if (!class319.field3435.isEmpty()) { // L: 175
			class421 var2 = (class421)class319.field3435.get(0); // L: 176
			if (var2 == null) { // L: 177
				class319.field3435.remove(0); // L: 178
			} else if (var2.vmethod7780()) { // L: 180
				if (var2.method7760()) { // L: 181
					System.out.println("Error in midimanager.service: " + var2.method7763()); // L: 182
					var0 = true; // L: 183
				} else {
					if (var2.method7764() != null) { // L: 186
						class319.field3435.add(1, var2.method7764()); // L: 187
					}

					var1 = var2.method7762(); // L: 189
				}

				class319.field3435.remove(0); // L: 191
			} else {
				var1 = var2.method7762(); // L: 194
			}
		}

		if (var0) { // L: 197
			class319.field3435.clear(); // L: 198
			class74.method2113(); // L: 199
		}

		return var1; // L: 201
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "856561238"
	)
	static final void method4301() {
		Client.packetWriter.close(); // L: 2933
		class214.method3909(); // L: 2934
		class10.scene.clear(); // L: 2935

		for (int var0 = 0; var0 < 4; ++var0) { // L: 2936
			Client.collisionMaps[var0].clear();
		}

		Client.field756.method4232(); // L: 2937
		System.gc(); // L: 2938
		ItemComposition.method4136(0, 0); // L: 2939
		class470.method8459(); // L: 2940
		Client.playingJingle = false; // L: 2941
		SoundCache.method866(); // L: 2942
		DefaultsGroup.method8263(10); // L: 2943
	} // L: 2944

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)Z",
		garbageValue = "1005514584"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 12708
	}
}
