import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("CollisionMap")
public class CollisionMap {
	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("uy")
	@ObfuscatedGetter(
		intValue = -1717644073
	)
	static int field2445;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -233279593
	)
	@Export("xInset")
	int xInset;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1153342305
	)
	@Export("yInset")
	int yInset;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -563864283
	)
	@Export("xSize")
	int xSize;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 566867105
	)
	@Export("ySize")
	int ySize;
	@ObfuscatedName("bs")
	@Export("flags")
	public int[][] flags;

	public CollisionMap(int var1, int var2) {
		this.xInset = 0;
		this.yInset = 0;
		this.xSize = var1;
		this.ySize = var2;
		this.flags = new int[this.xSize][this.ySize];
		this.clear();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1149107979"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.xSize; ++var1) { // L: 53
			for (int var2 = 0; var2 < this.ySize; ++var2) {
				if (var1 != 0 && var2 != 0 && var1 < this.xSize - 5 && var2 < this.ySize - 5) { // L: 55
					this.flags[var1][var2] = 16777216;
				} else {
					this.flags[var1][var2] = 16777215;
				}
			}
		}

	} // L: 59

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "1739593374"
	)
	public void method4353(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset; // L: 62
		var2 -= this.yInset;
		if (var3 == 0) {
			if (var4 == 0) {
				this.setFlag(var1, var2, 128); // L: 66
				this.setFlag(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.setFlag(var1, var2, 2);
				this.setFlag(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.setFlag(var1, var2, 8);
				this.setFlag(var1 + 1, var2, 128); // L: 75
			}

			if (var4 == 3) { // L: 77
				this.setFlag(var1, var2, 32);
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "2116342032"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1203207662"
	)
	@Export("setBlockedByFloor")
	public void setBlockedByFloor(int var1, int var2) {
		var1 -= this.xInset; // L: 199
		var2 -= this.yInset; // L: 200
		int[] var10000 = this.flags[var1]; // L: 201
		var10000[var2] |= 2097152;
	} // L: 202

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2101501073"
	)
	@Export("setBlockedByFloorDec")
	public void setBlockedByFloorDec(int var1, int var2) {
		var1 -= this.xInset; // L: 205
		var2 -= this.yInset; // L: 206
		int[] var10000 = this.flags[var1]; // L: 207
		var10000[var2] |= 262144;
	} // L: 208

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "17"
	)
	@Export("setFlag")
	void setFlag(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1]; // L: 211
		var10000[var2] |= var3;
	} // L: 212

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIZB)V",
		garbageValue = "83"
	)
	public void method4358(int var1, int var2, int var3, int var4, boolean var5) {
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZB)V",
		garbageValue = "-124"
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1853212949"
	)
	@Export("setFlagOff")
	void setFlagOff(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1]; // L: 357
		var10000[var2] &= ~var3;
	} // L: 358

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "10302"
	)
	public void method4361(int var1, int var2) {
		var1 -= this.xInset; // L: 361
		var2 -= this.yInset; // L: 362
		int[] var10000 = this.flags[var1]; // L: 363
		var10000[var2] &= -262145;
	} // L: 364

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "1153342305"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		boolean var2 = false; // L: 43
		boolean var3 = false; // L: 44
		int var4 = 0; // L: 45
		int var5 = var0.length(); // L: 46
		int var6 = 0;

		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3; // L: 76
				break;
			}

			label86: {
				char var7 = var0.charAt(var6); // L: 48
				if (var6 == 0) { // L: 49
					if (var7 == '-') { // L: 50
						var2 = true; // L: 51
						break label86;
					}

					if (var7 == '+') { // L: 54
						break label86;
					}
				}

				int var9;
				if (var7 >= '0' && var7 <= '9') { // L: 56
					var9 = var7 - '0';
				} else if (var7 >= 'A' && var7 <= 'Z') { // L: 57
					var9 = var7 - '7';
				} else {
					if (var7 < 'a' || var7 > 'z') { // L: 58
						var1 = false; // L: 60
						break;
					}

					var9 = var7 - 'W';
				}

				if (var9 >= 10) { // L: 63
					var1 = false; // L: 64
					break; // L: 65
				}

				if (var2) { // L: 67
					var9 = -var9;
				}

				int var8 = var4 * 10 + var9; // L: 68
				if (var4 != var8 / 10) { // L: 69
					var1 = false; // L: 70
					break; // L: 71
				}

				var4 = var8; // L: 73
				var3 = true; // L: 74
			}

			++var6; // L: 47
		}

		return var1; // L: 78
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "797487725"
	)
	static final void method4359(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) { // L: 9438
			var2 -= 2000;
		}

		Player var9;
		PacketBufferNode var10;
		if (var2 == 46) { // L: 9439
			var9 = Client.players[var3]; // L: 9440
			if (var9 != null) { // L: 9441
				Client.mouseCrossX = var7; // L: 9442
				Client.mouseCrossY = var8; // L: 9443
				Client.mouseCrossColor = 2; // L: 9444
				Client.mouseCrossState = 0; // L: 9445
				Client.destinationX = var0; // L: 9446
				Client.destinationY = var1; // L: 9447
				var10 = class425.getPacketBufferNode(ClientPacket.field3246, Client.packetWriter.isaacCipher); // L: 9449
				var10.packetBuffer.writeShort(var3); // L: 9450
				var10.packetBuffer.method9296(Client.field748.method4318(82) ? 1 : 0); // L: 9451
				Client.packetWriter.addNode(var10); // L: 9452
			}
		}

		if (var2 == 51) { // L: 9455
			var9 = Client.players[var3]; // L: 9456
			if (var9 != null) { // L: 9457
				Client.mouseCrossX = var7; // L: 9458
				Client.mouseCrossY = var8; // L: 9459
				Client.mouseCrossColor = 2; // L: 9460
				Client.mouseCrossState = 0; // L: 9461
				Client.destinationX = var0; // L: 9462
				Client.destinationY = var1; // L: 9463
				var10 = class425.getPacketBufferNode(ClientPacket.field3202, Client.packetWriter.isaacCipher); // L: 9465
				var10.packetBuffer.writeByte(Client.field748.method4318(82) ? 1 : 0); // L: 9466
				var10.packetBuffer.method9398(var3); // L: 9467
				Client.packetWriter.addNode(var10); // L: 9468
			}
		}

		PacketBufferNode var14;
		if (var2 == 3) { // L: 9471
			Client.mouseCrossX = var7; // L: 9472
			Client.mouseCrossY = var8; // L: 9473
			Client.mouseCrossColor = 2; // L: 9474
			Client.mouseCrossState = 0; // L: 9475
			Client.destinationX = var0; // L: 9476
			Client.destinationY = var1; // L: 9477
			var14 = class425.getPacketBufferNode(ClientPacket.field3277, Client.packetWriter.isaacCipher); // L: 9479
			var14.packetBuffer.writeByte(Client.field748.method4318(82) ? 1 : 0); // L: 9480
			var14.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0); // L: 9481
			var14.packetBuffer.writeShort(var3); // L: 9482
			var14.packetBuffer.method9246(DevicePcmPlayerProvider.baseY * 64 + var1); // L: 9483
			Client.packetWriter.addNode(var14); // L: 9484
		}

		NPC var15;
		if (var2 == 9) { // L: 9486
			var15 = Client.npcs[var3]; // L: 9487
			if (var15 != null) { // L: 9488
				Client.mouseCrossX = var7; // L: 9489
				Client.mouseCrossY = var8; // L: 9490
				Client.mouseCrossColor = 2; // L: 9491
				Client.mouseCrossState = 0; // L: 9492
				Client.destinationX = var0; // L: 9493
				Client.destinationY = var1; // L: 9494
				var10 = class425.getPacketBufferNode(ClientPacket.field3292, Client.packetWriter.isaacCipher); // L: 9496
				var10.packetBuffer.method9304(var3); // L: 9497
				var10.packetBuffer.method9297(Client.field748.method4318(82) ? 1 : 0); // L: 9498
				Client.packetWriter.addNode(var10); // L: 9499
			}
		}

		if (var2 == 4) { // L: 9502
			Client.mouseCrossX = var7; // L: 9503
			Client.mouseCrossY = var8; // L: 9504
			Client.mouseCrossColor = 2; // L: 9505
			Client.mouseCrossState = 0; // L: 9506
			Client.destinationX = var0; // L: 9507
			Client.destinationY = var1; // L: 9508
			var14 = class425.getPacketBufferNode(ClientPacket.field3235, Client.packetWriter.isaacCipher); // L: 9510
			var14.packetBuffer.method9297(Client.field748.method4318(82) ? 1 : 0); // L: 9511
			var14.packetBuffer.writeShort(DevicePcmPlayerProvider.baseY * 64 + var1); // L: 9512
			var14.packetBuffer.method9304(var3); // L: 9513
			var14.packetBuffer.method9304(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0); // L: 9514
			Client.packetWriter.addNode(var14); // L: 9515
		}

		if (var2 == 22) { // L: 9517
			Client.mouseCrossX = var7; // L: 9518
			Client.mouseCrossY = var8; // L: 9519
			Client.mouseCrossColor = 2; // L: 9520
			Client.mouseCrossState = 0; // L: 9521
			Client.destinationX = var0; // L: 9522
			Client.destinationY = var1; // L: 9523
			var14 = class425.getPacketBufferNode(ClientPacket.field3295, Client.packetWriter.isaacCipher); // L: 9525
			var14.packetBuffer.method9398(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0); // L: 9526
			var14.packetBuffer.method9398(var3); // L: 9527
			var14.packetBuffer.method9398(DevicePcmPlayerProvider.baseY * 64 + var1); // L: 9528
			var14.packetBuffer.method9295(Client.field748.method4318(82) ? 1 : 0); // L: 9529
			Client.packetWriter.addNode(var14); // L: 9530
		}

		if (var2 == 10) { // L: 9532
			var15 = Client.npcs[var3]; // L: 9533
			if (var15 != null) { // L: 9534
				Client.mouseCrossX = var7; // L: 9535
				Client.mouseCrossY = var8; // L: 9536
				Client.mouseCrossColor = 2; // L: 9537
				Client.mouseCrossState = 0; // L: 9538
				Client.destinationX = var0; // L: 9539
				Client.destinationY = var1; // L: 9540
				var10 = class425.getPacketBufferNode(ClientPacket.field3237, Client.packetWriter.isaacCipher); // L: 9542
				var10.packetBuffer.writeByte(Client.field748.method4318(82) ? 1 : 0); // L: 9543
				var10.packetBuffer.method9304(var3); // L: 9544
				Client.packetWriter.addNode(var10); // L: 9545
			}
		}

		if (var2 == 16) { // L: 9548
			Client.mouseCrossX = var7; // L: 9549
			Client.mouseCrossY = var8; // L: 9550
			Client.mouseCrossColor = 2; // L: 9551
			Client.mouseCrossState = 0; // L: 9552
			Client.destinationX = var0; // L: 9553
			Client.destinationY = var1; // L: 9554
			var14 = class425.getPacketBufferNode(ClientPacket.field3225, Client.packetWriter.isaacCipher); // L: 9556
			var14.packetBuffer.method9297(Client.field748.method4318(82) ? 1 : 0); // L: 9557
			var14.packetBuffer.method9246(var3); // L: 9558
			var14.packetBuffer.method9398(class254.field2776); // L: 9559
			var14.packetBuffer.method9304(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0); // L: 9560
			var14.packetBuffer.method9250(class366.field3997); // L: 9561
			var14.packetBuffer.method9398(class500.field5007); // L: 9562
			var14.packetBuffer.method9246(DevicePcmPlayerProvider.baseY * 64 + var1); // L: 9563
			Client.packetWriter.addNode(var14); // L: 9564
		}

		if (var2 == 45) { // L: 9566
			var9 = Client.players[var3]; // L: 9567
			if (var9 != null) { // L: 9568
				Client.mouseCrossX = var7; // L: 9569
				Client.mouseCrossY = var8; // L: 9570
				Client.mouseCrossColor = 2; // L: 9571
				Client.mouseCrossState = 0; // L: 9572
				Client.destinationX = var0; // L: 9573
				Client.destinationY = var1; // L: 9574
				var10 = class425.getPacketBufferNode(ClientPacket.field3269, Client.packetWriter.isaacCipher); // L: 9576
				var10.packetBuffer.method9297(Client.field748.method4318(82) ? 1 : 0); // L: 9577
				var10.packetBuffer.method9304(var3); // L: 9578
				Client.packetWriter.addNode(var10); // L: 9579
			}
		}

		if (var2 == 26) { // L: 9582
			class67.method1200(); // L: 9583
		}

		if (var2 == 21) { // L: 9585
			Client.mouseCrossX = var7; // L: 9586
			Client.mouseCrossY = var8; // L: 9587
			Client.mouseCrossColor = 2; // L: 9588
			Client.mouseCrossState = 0; // L: 9589
			Client.destinationX = var0; // L: 9590
			Client.destinationY = var1; // L: 9591
			var14 = class425.getPacketBufferNode(ClientPacket.field3280, Client.packetWriter.isaacCipher); // L: 9593
			var14.packetBuffer.writeByte(Client.field748.method4318(82) ? 1 : 0); // L: 9594
			var14.packetBuffer.writeShort(DevicePcmPlayerProvider.baseY * 64 + var1); // L: 9595
			var14.packetBuffer.method9398(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0); // L: 9596
			var14.packetBuffer.method9398(var3); // L: 9597
			Client.packetWriter.addNode(var14); // L: 9598
		}

		if (var2 == 23) { // L: 9600
			if (Client.isMenuOpen) { // L: 9601
				LoginType.scene.setViewportWalking(); // L: 9602
			} else {
				LoginType.scene.menuOpen(class172.Client_plane, var0, var1, true); // L: 9605
			}
		}

		if (var2 == 2) { // L: 9608
			Client.mouseCrossX = var7; // L: 9609
			Client.mouseCrossY = var8; // L: 9610
			Client.mouseCrossColor = 2; // L: 9611
			Client.mouseCrossState = 0; // L: 9612
			Client.destinationX = var0; // L: 9613
			Client.destinationY = var1; // L: 9614
			var14 = class425.getPacketBufferNode(ClientPacket.field3272, Client.packetWriter.isaacCipher); // L: 9615
			var14.packetBuffer.method9398(Client.field688); // L: 9616
			var14.packetBuffer.method9246(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0); // L: 9617
			var14.packetBuffer.method9246(DevicePcmPlayerProvider.baseY * 64 + var1); // L: 9618
			var14.packetBuffer.writeIntME(ChatChannel.field1020); // L: 9619
			var14.packetBuffer.method9304(var3); // L: 9620
			var14.packetBuffer.method9295(Client.field748.method4318(82) ? 1 : 0); // L: 9621
			var14.packetBuffer.method9246(Client.field678); // L: 9622
			Client.packetWriter.addNode(var14); // L: 9623
		}

		if (var2 == 7) { // L: 9625
			var15 = Client.npcs[var3]; // L: 9626
			if (var15 != null) { // L: 9627
				Client.mouseCrossX = var7; // L: 9628
				Client.mouseCrossY = var8; // L: 9629
				Client.mouseCrossColor = 2; // L: 9630
				Client.mouseCrossState = 0; // L: 9631
				Client.destinationX = var0; // L: 9632
				Client.destinationY = var1; // L: 9633
				var10 = class425.getPacketBufferNode(ClientPacket.field3289, Client.packetWriter.isaacCipher); // L: 9635
				var10.packetBuffer.writeShort(class500.field5007); // L: 9636
				var10.packetBuffer.writeIntME(class366.field3997); // L: 9637
				var10.packetBuffer.method9398(var3); // L: 9638
				var10.packetBuffer.writeShort(class254.field2776); // L: 9639
				var10.packetBuffer.method9296(Client.field748.method4318(82) ? 1 : 0); // L: 9640
				Client.packetWriter.addNode(var10); // L: 9641
			}
		}

		int var11;
		Widget var16;
		if (var2 == 29) { // L: 9644
			var14 = class425.getPacketBufferNode(ClientPacket.field3251, Client.packetWriter.isaacCipher); // L: 9646
			var14.packetBuffer.writeIntME(var1); // L: 9647
			Client.packetWriter.addNode(var14); // L: 9648
			var16 = class243.field2620.method6281(var1); // L: 9649
			if (var16 != null && var16.cs1Instructions != null && var16.cs1Instructions[0][0] == 5) { // L: 9650
				var11 = var16.cs1Instructions[0][1]; // L: 9651
				if (Varps.Varps_main[var11] != var16.cs1ComparisonValues[0]) { // L: 9652
					Varps.Varps_main[var11] = var16.cs1ComparisonValues[0]; // L: 9653
					class11.changeGameOptions(var11); // L: 9654
				}
			}
		}

		if (var2 == 47) { // L: 9658
			var9 = Client.players[var3]; // L: 9659
			if (var9 != null) { // L: 9660
				Client.mouseCrossX = var7; // L: 9661
				Client.mouseCrossY = var8; // L: 9662
				Client.mouseCrossColor = 2; // L: 9663
				Client.mouseCrossState = 0; // L: 9664
				Client.destinationX = var0; // L: 9665
				Client.destinationY = var1; // L: 9666
				var10 = class425.getPacketBufferNode(ClientPacket.field3287, Client.packetWriter.isaacCipher); // L: 9668
				var10.packetBuffer.method9304(var3); // L: 9669
				var10.packetBuffer.method9296(Client.field748.method4318(82) ? 1 : 0); // L: 9670
				Client.packetWriter.addNode(var10); // L: 9671
			}
		}

		if (var2 == 1001) { // L: 9674
			Client.mouseCrossX = var7; // L: 9675
			Client.mouseCrossY = var8; // L: 9676
			Client.mouseCrossColor = 2; // L: 9677
			Client.mouseCrossState = 0; // L: 9678
			Client.destinationX = var0; // L: 9679
			Client.destinationY = var1; // L: 9680
			var14 = class425.getPacketBufferNode(ClientPacket.field3244, Client.packetWriter.isaacCipher); // L: 9682
			var14.packetBuffer.writeByte(Client.field748.method4318(82) ? 1 : 0); // L: 9683
			var14.packetBuffer.writeShort(DevicePcmPlayerProvider.baseY * 64 + var1); // L: 9684
			var14.packetBuffer.method9398(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0); // L: 9685
			var14.packetBuffer.method9246(var3); // L: 9686
			Client.packetWriter.addNode(var14); // L: 9687
		}

		if (var2 == 1) { // L: 9689
			Client.mouseCrossX = var7; // L: 9690
			Client.mouseCrossY = var8; // L: 9691
			Client.mouseCrossColor = 2; // L: 9692
			Client.mouseCrossState = 0; // L: 9693
			Client.destinationX = var0; // L: 9694
			Client.destinationY = var1; // L: 9695
			var14 = class425.getPacketBufferNode(ClientPacket.field3253, Client.packetWriter.isaacCipher); // L: 9697
			var14.packetBuffer.method9304(DevicePcmPlayerProvider.baseY * 64 + var1); // L: 9698
			var14.packetBuffer.method9246(class500.field5007); // L: 9699
			var14.packetBuffer.method9297(Client.field748.method4318(82) ? 1 : 0); // L: 9700
			var14.packetBuffer.method9304(var3); // L: 9701
			var14.packetBuffer.method9304(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0); // L: 9702
			var14.packetBuffer.method9246(class254.field2776); // L: 9703
			var14.packetBuffer.method9250(class366.field3997); // L: 9704
			Client.packetWriter.addNode(var14); // L: 9705
		}

		if (var2 == 28) { // L: 9707
			var14 = class425.getPacketBufferNode(ClientPacket.field3251, Client.packetWriter.isaacCipher); // L: 9709
			var14.packetBuffer.writeIntME(var1); // L: 9710
			Client.packetWriter.addNode(var14); // L: 9711
			var16 = class243.field2620.method6281(var1); // L: 9712
			if (var16 != null && var16.cs1Instructions != null && var16.cs1Instructions[0][0] == 5) { // L: 9713
				var11 = var16.cs1Instructions[0][1]; // L: 9714
				Varps.Varps_main[var11] = 1 - Varps.Varps_main[var11]; // L: 9715
				class11.changeGameOptions(var11); // L: 9716
			}
		}

		if (var2 == 1004) { // L: 9719
			Client.mouseCrossX = var7; // L: 9720
			Client.mouseCrossY = var8; // L: 9721
			Client.mouseCrossColor = 2; // L: 9722
			Client.mouseCrossState = 0; // L: 9723
			var14 = class425.getPacketBufferNode(ClientPacket.field3241, Client.packetWriter.isaacCipher); // L: 9725
			var14.packetBuffer.method9246(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0); // L: 9726
			var14.packetBuffer.method9246(DevicePcmPlayerProvider.baseY * 64 + var1); // L: 9727
			var14.packetBuffer.method9246(var3); // L: 9728
			Client.packetWriter.addNode(var14); // L: 9729
		}

		Widget var18;
		if (var2 == 57 || var2 == 1007) { // L: 9731
			var18 = class243.field2620.method6286(var1, var0); // L: 9732
			if (var18 != null) { // L: 9733
				AbstractArchive.widgetDefaultMenuAction(var3, var1, var0, var4, var6); // L: 9734
			}
		}

		if (var2 == 14) { // L: 9737
			var9 = Client.players[var3]; // L: 9738
			if (var9 != null) { // L: 9739
				Client.mouseCrossX = var7; // L: 9740
				Client.mouseCrossY = var8; // L: 9741
				Client.mouseCrossColor = 2; // L: 9742
				Client.mouseCrossState = 0; // L: 9743
				Client.destinationX = var0; // L: 9744
				Client.destinationY = var1; // L: 9745
				var10 = class425.getPacketBufferNode(ClientPacket.field3296, Client.packetWriter.isaacCipher); // L: 9747
				var10.packetBuffer.method9296(Client.field748.method4318(82) ? 1 : 0); // L: 9748
				var10.packetBuffer.method9398(class500.field5007); // L: 9749
				var10.packetBuffer.writeShort(var3); // L: 9750
				var10.packetBuffer.writeIntME(class366.field3997); // L: 9751
				var10.packetBuffer.writeShort(class254.field2776); // L: 9752
				Client.packetWriter.addNode(var10); // L: 9753
			}
		}

		if (var2 == 58) { // L: 9756
			var18 = class243.field2620.method6286(var1, var0); // L: 9757
			if (var18 != null) { // L: 9758
				if (var18.field3851 != null) { // L: 9759
					ScriptEvent var17 = new ScriptEvent(); // L: 9760
					var17.widget = var18; // L: 9761
					var17.opIndex = var3; // L: 9762
					var17.targetName = var6; // L: 9763
					var17.args = var18.field3851; // L: 9764
					AbstractWorldMapData.runScriptEvent(var17); // L: 9765
				}

				var10 = class425.getPacketBufferNode(ClientPacket.field3236, Client.packetWriter.isaacCipher); // L: 9768
				var10.packetBuffer.method9407(var1); // L: 9769
				var10.packetBuffer.method9246(Client.field688); // L: 9770
				var10.packetBuffer.method9246(var0); // L: 9771
				var10.packetBuffer.method9407(ChatChannel.field1020); // L: 9772
				var10.packetBuffer.method9398(Client.field678); // L: 9773
				var10.packetBuffer.method9304(var4); // L: 9774
				Client.packetWriter.addNode(var10); // L: 9775
			}
		}

		if (var2 == 25) { // L: 9778
			var18 = class243.field2620.method6286(var1, var0); // L: 9779
			if (var18 != null) { // L: 9780
				WorldMapCacheName.method5751(); // L: 9781
				Interpreter.method2068(var1, var0, class342.Widget_unpackTargetMask(class33.getWidgetFlags(var18)), var4); // L: 9782
				Client.isItemSelected = 0; // L: 9783
				Client.field557 = class160.Widget_getSpellActionName(var18); // L: 9784
				if (Client.field557 == null) { // L: 9785
					Client.field557 = "null";
				}

				if (var18.isIf3) { // L: 9786
					Client.field801 = var18.dataText + Decimator.colorStartTag(16777215);
				} else {
					Client.field801 = Decimator.colorStartTag(65280) + var18.field3822 + Decimator.colorStartTag(16777215); // L: 9787
				}
			}

		} else {
			if (var2 == 50) { // L: 9791
				var9 = Client.players[var3]; // L: 9792
				if (var9 != null) { // L: 9793
					Client.mouseCrossX = var7; // L: 9794
					Client.mouseCrossY = var8; // L: 9795
					Client.mouseCrossColor = 2; // L: 9796
					Client.mouseCrossState = 0; // L: 9797
					Client.destinationX = var0; // L: 9798
					Client.destinationY = var1; // L: 9799
					var10 = class425.getPacketBufferNode(ClientPacket.field3226, Client.packetWriter.isaacCipher); // L: 9801
					var10.packetBuffer.method9296(Client.field748.method4318(82) ? 1 : 0); // L: 9802
					var10.packetBuffer.method9398(var3); // L: 9803
					Client.packetWriter.addNode(var10); // L: 9804
				}
			}

			if (var2 == 18) { // L: 9807
				Client.mouseCrossX = var7; // L: 9808
				Client.mouseCrossY = var8; // L: 9809
				Client.mouseCrossColor = 2; // L: 9810
				Client.mouseCrossState = 0; // L: 9811
				Client.destinationX = var0; // L: 9812
				Client.destinationY = var1; // L: 9813
				var14 = class425.getPacketBufferNode(ClientPacket.field3209, Client.packetWriter.isaacCipher); // L: 9815
				var14.packetBuffer.writeByte(Client.field748.method4318(82) ? 1 : 0); // L: 9816
				var14.packetBuffer.method9398(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0); // L: 9817
				var14.packetBuffer.method9398(var3); // L: 9818
				var14.packetBuffer.method9246(DevicePcmPlayerProvider.baseY * 64 + var1); // L: 9819
				Client.packetWriter.addNode(var14); // L: 9820
			}

			if (var2 == 6) { // L: 9822
				Client.mouseCrossX = var7; // L: 9823
				Client.mouseCrossY = var8; // L: 9824
				Client.mouseCrossColor = 2; // L: 9825
				Client.mouseCrossState = 0; // L: 9826
				Client.destinationX = var0; // L: 9827
				Client.destinationY = var1; // L: 9828
				var14 = class425.getPacketBufferNode(ClientPacket.field3221, Client.packetWriter.isaacCipher); // L: 9830
				var14.packetBuffer.method9398(var3); // L: 9831
				var14.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0); // L: 9832
				var14.packetBuffer.method9295(Client.field748.method4318(82) ? 1 : 0); // L: 9833
				var14.packetBuffer.writeShort(DevicePcmPlayerProvider.baseY * 64 + var1); // L: 9834
				Client.packetWriter.addNode(var14); // L: 9835
			}

			if (var2 == 30 && Client.meslayerContinueWidget == null) { // L: 9837 9838
				class67.resumePauseWidget(var1, var0); // L: 9839
				Client.meslayerContinueWidget = class243.field2620.method6286(var1, var0); // L: 9840
				WorldMapData_0.invalidateWidget(Client.meslayerContinueWidget); // L: 9841
			}

			if (var2 == 15) { // L: 9844
				var9 = Client.players[var3]; // L: 9845
				if (var9 != null) { // L: 9846
					Client.mouseCrossX = var7; // L: 9847
					Client.mouseCrossY = var8; // L: 9848
					Client.mouseCrossColor = 2; // L: 9849
					Client.mouseCrossState = 0; // L: 9850
					Client.destinationX = var0; // L: 9851
					Client.destinationY = var1; // L: 9852
					var10 = class425.getPacketBufferNode(ClientPacket.field3238, Client.packetWriter.isaacCipher); // L: 9853
					var10.packetBuffer.writeIntME(ChatChannel.field1020); // L: 9854
					var10.packetBuffer.writeByte(Client.field748.method4318(82) ? 1 : 0); // L: 9855
					var10.packetBuffer.writeShort(Client.field688); // L: 9856
					var10.packetBuffer.writeShort(Client.field678); // L: 9857
					var10.packetBuffer.method9398(var3); // L: 9858
					Client.packetWriter.addNode(var10); // L: 9859
				}
			}

			if (var2 == 13) { // L: 9862
				var15 = Client.npcs[var3]; // L: 9863
				if (var15 != null) { // L: 9864
					Client.mouseCrossX = var7; // L: 9865
					Client.mouseCrossY = var8; // L: 9866
					Client.mouseCrossColor = 2; // L: 9867
					Client.mouseCrossState = 0; // L: 9868
					Client.destinationX = var0; // L: 9869
					Client.destinationY = var1; // L: 9870
					var10 = class425.getPacketBufferNode(ClientPacket.field3268, Client.packetWriter.isaacCipher); // L: 9872
					var10.packetBuffer.method9398(var3); // L: 9873
					var10.packetBuffer.method9295(Client.field748.method4318(82) ? 1 : 0); // L: 9874
					Client.packetWriter.addNode(var10); // L: 9875
				}
			}

			if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) { // L: 9878
				ModeWhere.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 9879
			}

			if (var2 == 48) { // L: 9881
				var9 = Client.players[var3]; // L: 9882
				if (var9 != null) { // L: 9883
					Client.mouseCrossX = var7; // L: 9884
					Client.mouseCrossY = var8; // L: 9885
					Client.mouseCrossColor = 2; // L: 9886
					Client.mouseCrossState = 0; // L: 9887
					Client.destinationX = var0; // L: 9888
					Client.destinationY = var1; // L: 9889
					var10 = class425.getPacketBufferNode(ClientPacket.field3279, Client.packetWriter.isaacCipher); // L: 9891
					var10.packetBuffer.method9304(var3); // L: 9892
					var10.packetBuffer.method9296(Client.field748.method4318(82) ? 1 : 0); // L: 9893
					Client.packetWriter.addNode(var10); // L: 9894
				}
			}

			if (var2 == 8) { // L: 9897
				var15 = Client.npcs[var3]; // L: 9898
				if (var15 != null) { // L: 9899
					Client.mouseCrossX = var7; // L: 9900
					Client.mouseCrossY = var8; // L: 9901
					Client.mouseCrossColor = 2; // L: 9902
					Client.mouseCrossState = 0; // L: 9903
					Client.destinationX = var0; // L: 9904
					Client.destinationY = var1; // L: 9905
					var10 = class425.getPacketBufferNode(ClientPacket.field3291, Client.packetWriter.isaacCipher); // L: 9906
					var10.packetBuffer.method9398(Client.field678); // L: 9907
					var10.packetBuffer.method9407(ChatChannel.field1020); // L: 9908
					var10.packetBuffer.method9398(Client.field688); // L: 9909
					var10.packetBuffer.writeByte(Client.field748.method4318(82) ? 1 : 0); // L: 9910
					var10.packetBuffer.writeShort(var3); // L: 9911
					Client.packetWriter.addNode(var10); // L: 9912
				}
			}

			if (var2 == 1002) { // L: 9915
				Client.mouseCrossX = var7; // L: 9916
				Client.mouseCrossY = var8; // L: 9917
				Client.mouseCrossColor = 2; // L: 9918
				Client.mouseCrossState = 0; // L: 9919
				var14 = class425.getPacketBufferNode(ClientPacket.field3270, Client.packetWriter.isaacCipher); // L: 9921
				var14.packetBuffer.method9304(var3); // L: 9922
				Client.packetWriter.addNode(var14); // L: 9923
			}

			if (var2 == 19) { // L: 9925
				Client.mouseCrossX = var7; // L: 9926
				Client.mouseCrossY = var8; // L: 9927
				Client.mouseCrossColor = 2; // L: 9928
				Client.mouseCrossState = 0; // L: 9929
				Client.destinationX = var0; // L: 9930
				Client.destinationY = var1; // L: 9931
				var14 = class425.getPacketBufferNode(ClientPacket.field3273, Client.packetWriter.isaacCipher); // L: 9933
				var14.packetBuffer.method9246(DevicePcmPlayerProvider.baseY * 64 + var1); // L: 9934
				var14.packetBuffer.method9398(var3); // L: 9935
				var14.packetBuffer.method9296(Client.field748.method4318(82) ? 1 : 0); // L: 9936
				var14.packetBuffer.method9246(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0); // L: 9937
				Client.packetWriter.addNode(var14); // L: 9938
			}

			if (var2 == 5) { // L: 9940
				Client.mouseCrossX = var7; // L: 9941
				Client.mouseCrossY = var8; // L: 9942
				Client.mouseCrossColor = 2; // L: 9943
				Client.mouseCrossState = 0; // L: 9944
				Client.destinationX = var0; // L: 9945
				Client.destinationY = var1; // L: 9946
				var14 = class425.getPacketBufferNode(ClientPacket.field3256, Client.packetWriter.isaacCipher); // L: 9948
				var14.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0); // L: 9949
				var14.packetBuffer.writeShort(DevicePcmPlayerProvider.baseY * 64 + var1); // L: 9950
				var14.packetBuffer.method9246(var3); // L: 9951
				var14.packetBuffer.writeByte(Client.field748.method4318(82) ? 1 : 0); // L: 9952
				Client.packetWriter.addNode(var14); // L: 9953
			}

			if (var2 == 44) { // L: 9955
				var9 = Client.players[var3]; // L: 9956
				if (var9 != null) { // L: 9957
					Client.mouseCrossX = var7; // L: 9958
					Client.mouseCrossY = var8; // L: 9959
					Client.mouseCrossColor = 2; // L: 9960
					Client.mouseCrossState = 0; // L: 9961
					Client.destinationX = var0; // L: 9962
					Client.destinationY = var1; // L: 9963
					var10 = class425.getPacketBufferNode(ClientPacket.field3204, Client.packetWriter.isaacCipher); // L: 9965
					var10.packetBuffer.method9398(var3); // L: 9966
					var10.packetBuffer.writeByte(Client.field748.method4318(82) ? 1 : 0); // L: 9967
					Client.packetWriter.addNode(var10); // L: 9968
				}
			}

			if (var2 == 11) { // L: 9971
				var15 = Client.npcs[var3]; // L: 9972
				if (var15 != null) { // L: 9973
					Client.mouseCrossX = var7; // L: 9974
					Client.mouseCrossY = var8; // L: 9975
					Client.mouseCrossColor = 2; // L: 9976
					Client.mouseCrossState = 0; // L: 9977
					Client.destinationX = var0; // L: 9978
					Client.destinationY = var1; // L: 9979
					var10 = class425.getPacketBufferNode(ClientPacket.field3214, Client.packetWriter.isaacCipher); // L: 9981
					var10.packetBuffer.method9246(var3); // L: 9982
					var10.packetBuffer.writeByte(Client.field748.method4318(82) ? 1 : 0); // L: 9983
					Client.packetWriter.addNode(var10); // L: 9984
				}
			}

			PacketBufferNode var13;
			if (var2 == 24) { // L: 9987
				var18 = class243.field2620.method6281(var1); // L: 9988
				if (var18 != null) { // L: 9989
					boolean var12 = true; // L: 9990
					if (var18.contentType > 0) { // L: 9991
						var12 = PacketWriter.method2801(var18);
					}

					if (var12) { // L: 9992
						var13 = class425.getPacketBufferNode(ClientPacket.field3251, Client.packetWriter.isaacCipher); // L: 9994
						var13.packetBuffer.writeIntME(var1); // L: 9995
						Client.packetWriter.addNode(var13); // L: 9996
					}
				}
			}

			if (var2 == 12) { // L: 10000
				var15 = Client.npcs[var3]; // L: 10001
				if (var15 != null) { // L: 10002
					Client.mouseCrossX = var7; // L: 10003
					Client.mouseCrossY = var8; // L: 10004
					Client.mouseCrossColor = 2; // L: 10005
					Client.mouseCrossState = 0; // L: 10006
					Client.destinationX = var0; // L: 10007
					Client.destinationY = var1; // L: 10008
					var10 = class425.getPacketBufferNode(ClientPacket.field3230, Client.packetWriter.isaacCipher); // L: 10010
					var10.packetBuffer.method9296(Client.field748.method4318(82) ? 1 : 0); // L: 10011
					var10.packetBuffer.method9398(var3); // L: 10012
					Client.packetWriter.addNode(var10); // L: 10013
				}
			}

			if (var2 == 49) { // L: 10016
				var9 = Client.players[var3]; // L: 10017
				if (var9 != null) { // L: 10018
					Client.mouseCrossX = var7; // L: 10019
					Client.mouseCrossY = var8; // L: 10020
					Client.mouseCrossColor = 2; // L: 10021
					Client.mouseCrossState = 0; // L: 10022
					Client.destinationX = var0; // L: 10023
					Client.destinationY = var1; // L: 10024
					var10 = class425.getPacketBufferNode(ClientPacket.field3298, Client.packetWriter.isaacCipher); // L: 10026
					var10.packetBuffer.method9398(var3); // L: 10027
					var10.packetBuffer.method9296(Client.field748.method4318(82) ? 1 : 0); // L: 10028
					Client.packetWriter.addNode(var10); // L: 10029
				}
			}

			if (var2 == 20) { // L: 10032
				Client.mouseCrossX = var7; // L: 10033
				Client.mouseCrossY = var8; // L: 10034
				Client.mouseCrossColor = 2; // L: 10035
				Client.mouseCrossState = 0; // L: 10036
				Client.destinationX = var0; // L: 10037
				Client.destinationY = var1; // L: 10038
				var14 = class425.getPacketBufferNode(ClientPacket.field3264, Client.packetWriter.isaacCipher); // L: 10040
				var14.packetBuffer.method9304(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0); // L: 10041
				var14.packetBuffer.method9398(var3); // L: 10042
				var14.packetBuffer.method9246(DevicePcmPlayerProvider.baseY * 64 + var1); // L: 10043
				var14.packetBuffer.method9296(Client.field748.method4318(82) ? 1 : 0); // L: 10044
				Client.packetWriter.addNode(var14); // L: 10045
			}

			if (var2 == 17) { // L: 10047
				Client.mouseCrossX = var7; // L: 10048
				Client.mouseCrossY = var8; // L: 10049
				Client.mouseCrossColor = 2; // L: 10050
				Client.mouseCrossState = 0; // L: 10051
				Client.destinationX = var0; // L: 10052
				Client.destinationY = var1; // L: 10053
				var14 = class425.getPacketBufferNode(ClientPacket.field3229, Client.packetWriter.isaacCipher); // L: 10054
				var14.packetBuffer.writeIntME(ChatChannel.field1020); // L: 10055
				var14.packetBuffer.method9398(var3); // L: 10056
				var14.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0); // L: 10057
				var14.packetBuffer.writeShort(Client.field678); // L: 10058
				var14.packetBuffer.method9246(DevicePcmPlayerProvider.baseY * 64 + var1); // L: 10059
				var14.packetBuffer.method9246(Client.field688); // L: 10060
				var14.packetBuffer.writeByte(Client.field748.method4318(82) ? 1 : 0); // L: 10061
				Client.packetWriter.addNode(var14); // L: 10062
			}

			if (var2 == 1003) { // L: 10064
				Client.mouseCrossX = var7; // L: 10065
				Client.mouseCrossY = var8; // L: 10066
				Client.mouseCrossColor = 2; // L: 10067
				Client.mouseCrossState = 0; // L: 10068
				var15 = Client.npcs[var3]; // L: 10069
				if (var15 != null) { // L: 10070
					NPCComposition var19 = var15.definition; // L: 10071
					if (var19.transforms != null) { // L: 10072
						var19 = var19.transform();
					}

					if (var19 != null) { // L: 10073
						var13 = class425.getPacketBufferNode(ClientPacket.field3247, Client.packetWriter.isaacCipher); // L: 10075
						var13.packetBuffer.method9304(var19.id); // L: 10076
						Client.packetWriter.addNode(var13); // L: 10077
					}
				}
			}

			if (Client.isItemSelected != 0) { // L: 10081
				Client.isItemSelected = 0; // L: 10082
				WorldMapData_0.invalidateWidget(class243.field2620.method6281(class366.field3997)); // L: 10083
			}

			if (Client.isSpellSelected) { // L: 10085
				WorldMapCacheName.method5751();
			}

		}
	} // L: 9789 10086
}
