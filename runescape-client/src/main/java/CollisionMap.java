import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
@Implements("CollisionMap")
public class CollisionMap {
	@ObfuscatedName("ac")
	public static String field2347;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 2023804941
	)
	@Export("xInset")
	int xInset;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1811869817
	)
	@Export("yInset")
	int yInset;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1511640623
	)
	@Export("xSize")
	int xSize;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 777221461
	)
	@Export("ySize")
	int ySize;
	@ObfuscatedName("bw")
	@Export("flags")
	public int[][] flags;

	public CollisionMap(int var1, int var2) {
		this.xInset = 0; // L: 44
		this.yInset = 0; // L: 45
		this.xSize = var1; // L: 46
		this.ySize = var2; // L: 47
		this.flags = new int[this.xSize][this.ySize]; // L: 48
		this.clear(); // L: 49
	} // L: 50

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1057196754"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.xSize; ++var1) { // L: 53
			for (int var2 = 0; var2 < this.ySize; ++var2) { // L: 54
				if (var1 != 0 && var2 != 0 && var1 < this.xSize - 5 && var2 < this.ySize - 5) { // L: 55
					this.flags[var1][var2] = 16777216; // L: 56
				} else {
					this.flags[var1][var2] = 16777215;
				}
			}
		}

	} // L: 59

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-1208247289"
	)
	public void method4191(int var1, int var2, int var3, int var4, boolean var5) {
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "1569995917"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "745791000"
	)
	@Export("setBlockedByFloor")
	public void setBlockedByFloor(int var1, int var2) {
		var1 -= this.xInset; // L: 199
		var2 -= this.yInset; // L: 200
		int[] var10000 = this.flags[var1]; // L: 201
		var10000[var2] |= 2097152;
	} // L: 202

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-190738836"
	)
	@Export("setBlockedByFloorDec")
	public void setBlockedByFloorDec(int var1, int var2) {
		var1 -= this.xInset; // L: 205
		var2 -= this.yInset; // L: 206
		int[] var10000 = this.flags[var1]; // L: 207
		var10000[var2] |= 262144;
	} // L: 208

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "45"
	)
	@Export("setFlag")
	void setFlag(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1]; // L: 211
		var10000[var2] |= var3;
	} // L: 212

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-908082263"
	)
	public void method4202(int var1, int var2, int var3, int var4, boolean var5) {
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)V",
		garbageValue = "1718462800"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-866743118"
	)
	@Export("setFlagOff")
	void setFlagOff(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1]; // L: 357
		var10000[var2] &= ~var3;
	} // L: 358

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	public void method4194(int var1, int var2) {
		var1 -= this.xInset; // L: 361
		var2 -= this.yInset; // L: 362
		int[] var10000 = this.flags[var1]; // L: 363
		var10000[var2] &= -262145;
	} // L: 364

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-118"
	)
	public static int method4216(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) { // L: 26 27 30
			if ((var1 & 1) != 0) {
				var2 = var0 * var2; // L: 28
			}

			var0 *= var0; // L: 29
		}

		if (var1 == 1) { // L: 32
			return var0 * var2;
		} else {
			return var2; // L: 33
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1867192379"
	)
	static void method4208() {
		Players.Players_count = 0; // L: 684

		for (int var0 = 0; var0 < 2048; ++var0) { // L: 685
			Players.field1360[var0] = null; // L: 686
			Players.field1363[var0] = class218.field2384; // L: 687
		}

	} // L: 689

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1603276123"
	)
	static final void method4214(boolean var0) {
		class105.method2684(); // L: 5991
		++Client.packetWriter.pendingWrites; // L: 5992
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 5993
			Client.packetWriter.pendingWrites = 0; // L: 5994
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 5995
				PacketBufferNode var1 = class503.getPacketBufferNode(ClientPacket.field3123, Client.packetWriter.isaacCipher); // L: 5997
				Client.packetWriter.addNode(var1); // L: 5998

				try {
					Client.packetWriter.flush(); // L: 6000
				} catch (IOException var3) { // L: 6002
					Client.hadNetworkError = true; // L: 6003
				}
			}

		}
	} // L: 6006
}
