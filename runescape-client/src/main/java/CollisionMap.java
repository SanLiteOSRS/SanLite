import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("CollisionMap")
public class CollisionMap {
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1430868227
	)
	@Export("xInset")
	public int xInset;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1439144823
	)
	@Export("yInset")
	public int yInset;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1332223607
	)
	@Export("xSize")
	int xSize;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1657414401
	)
	@Export("ySize")
	int ySize;
	@ObfuscatedName("ap")
	@Export("flags")
	public int[][] flags;

	public CollisionMap(int var1, int var2) {
		this.xInset = 0;
		this.yInset = 0;
		this.xSize = var1;
		this.ySize = var2;
		this.flags = new int[this.xSize][this.ySize];
		this.clear();
	} // L: 50

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-965310063"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.xSize; ++var1) {
			for (int var2 = 0; var2 < this.ySize; ++var2) { // L: 54
				if (var1 != 0 && var2 != 0 && var1 < this.xSize - 5 && var2 < this.ySize - 5) {
					this.flags[var1][var2] = 16777216;
				} else {
					this.flags[var1][var2] = 16777215;
				}
			}
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-1323698352"
	)
	public void method4184(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset; // L: 62
		var2 -= this.yInset; // L: 63
		if (var3 == 0) { // L: 64
			if (var4 == 0) { // L: 65
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

			if (var3 == 2) {
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
					this.setFlag(var1, var2 - 1, 1024); // L: 173
				}

				if (var4 == 3) { // L: 175
					this.setFlag(var1, var2, 81920); // L: 176
					this.setFlag(var1, var2 - 1, 1024); // L: 177
					this.setFlag(var1 - 1, var2, 4096); // L: 178
				}
			}
		}

	} // L: 182

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-525339514"
	)
	@Export("addGameObject")
	public void addGameObject(int var1, int var2, int var3, int var4, boolean var5) {
		int var6 = 256; // L: 185
		if (var5) { // L: 186
			var6 += 131072;
		}

		var1 -= this.xInset; // L: 187
		var2 -= this.yInset; // L: 188

		for (int var7 = var1; var7 < var3 + var1; ++var7) { // L: 189
			if (var7 >= 0 && var7 < this.xSize) { // L: 190
				for (int var8 = var2; var8 < var2 + var4; ++var8) { // L: 191
					if (var8 >= 0 && var8 < this.ySize) { // L: 192
						this.setFlag(var7, var8, var6);
					}
				}
			}
		}

	} // L: 196

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-77979262"
	)
	@Export("setBlockedByFloor")
	public void setBlockedByFloor(int var1, int var2) {
		var1 -= this.xInset; // L: 199
		var2 -= this.yInset; // L: 200
		int[] var10000 = this.flags[var1]; // L: 201
		var10000[var2] |= 2097152;
	} // L: 202

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1845865380"
	)
	@Export("setBlockedByFloorDec")
	public void setBlockedByFloorDec(int var1, int var2) {
		var1 -= this.xInset; // L: 205
		var2 -= this.yInset; // L: 206
		int[] var10000 = this.flags[var1]; // L: 207
		var10000[var2] |= 262144;
	} // L: 208

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-5"
	)
	@Export("setFlag")
	void setFlag(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1]; // L: 211
		var10000[var2] |= var3;
	} // L: 212

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIIZB)V",
		garbageValue = "103"
	)
	public void method4200(int var1, int var2, int var3, int var4, boolean var5) {
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)V",
		garbageValue = "-2126189491"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "689502231"
	)
	@Export("setFlagOff")
	void setFlagOff(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1]; // L: 357
		var10000[var2] &= ~var3;
	} // L: 358

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-865883096"
	)
	public void method4192(int var1, int var2) {
		var1 -= this.xInset; // L: 361
		var2 -= this.yInset; // L: 362
		int[] var10000 = this.flags[var1]; // L: 363
		var10000[var2] &= -262145;
	} // L: 364

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "57"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 39
		if (var4 == null) { // L: 40
			var4 = new ItemContainer(); // L: 41
			ItemContainer.itemContainers.put(var4, (long)var0); // L: 42
		}

		if (var4.ids.length <= var1) { // L: 44
			int[] var5 = new int[var1 + 1]; // L: 45
			int[] var6 = new int[var1 + 1]; // L: 46

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) { // L: 47
				var5[var7] = var4.ids[var7]; // L: 48
				var6[var7] = var4.quantities[var7]; // L: 49
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) { // L: 51
				var5[var7] = -1; // L: 52
				var6[var7] = 0; // L: 53
			}

			var4.ids = var5; // L: 55
			var4.quantities = var6; // L: 56
		}

		var4.ids[var1] = var2; // L: 58
		var4.quantities[var1] = var3; // L: 59
	} // L: 60

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-933803817"
	)
	public static void method4208() {
		if (NetCache.NetCache_socket != null) { // L: 273
			NetCache.NetCache_socket.close();
		}

	} // L: 274

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(CS)Z",
		garbageValue = "18719"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 159
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "379941192"
	)
	static int method4213(int var0, Script var1, boolean var2) {
		return 2; // L: 4930
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Lkz;IIII)V",
		garbageValue = "1926559804"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false); // L: 13053
		if (var4 != null) { // L: 13054
			if (Client.minimapState < 3) { // L: 13055
				SoundSystem.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 13056
			}

		}
	} // L: 13057
}
