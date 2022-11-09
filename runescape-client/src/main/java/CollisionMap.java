import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
@Implements("CollisionMap")
public class CollisionMap {
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "[Lry;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2020349675
	)
	@Export("xInset")
	public int xInset;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1900924205
	)
	@Export("yInset")
	public int yInset;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -893901129
	)
	@Export("xSize")
	int xSize;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -592342081
	)
	@Export("ySize")
	int ySize;
	@ObfuscatedName("as")
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1126858921"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-1706440889"
	)
	public void method4002(int var1, int var2, int var3, int var4, boolean var5) {
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "1599328162"
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1947960962"
	)
	@Export("setBlockedByFloor")
	public void setBlockedByFloor(int var1, int var2) {
		var1 -= this.xInset; // L: 199
		var2 -= this.yInset; // L: 200
		int[] var10000 = this.flags[var1]; // L: 201
		var10000[var2] |= 2097152;
	} // L: 202

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1214087717"
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
		descriptor = "(IIII)V",
		garbageValue = "1657151465"
	)
	@Export("setFlag")
	void setFlag(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1]; // L: 211
		var10000[var2] |= var3;
	} // L: 212

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIIZS)V",
		garbageValue = "217"
	)
	public void method4025(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset; // L: 215
		var2 -= this.yInset; // L: 216
		if (var3 == 0) { // L: 217
			if (var4 == 0) { // L: 218
				this.setFlagOff(var1, var2, 128);
				this.setFlagOff(var1 - 1, var2, 8);
			}

			if (var4 == 1) { // L: 222
				this.setFlagOff(var1, var2, 2);
				this.setFlagOff(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.setFlagOff(var1, var2, 8);
				this.setFlagOff(var1 + 1, var2, 128); // L: 228
			}

			if (var4 == 3) {
				this.setFlagOff(var1, var2, 32);
				this.setFlagOff(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.setFlagOff(var1, var2, 1);
				this.setFlagOff(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.setFlagOff(var1, var2, 4);
				this.setFlagOff(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.setFlagOff(var1, var2, 16);
				this.setFlagOff(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.setFlagOff(var1, var2, 64); // L: 249
				this.setFlagOff(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) { // L: 253
			if (var4 == 0) { // L: 254
				this.setFlagOff(var1, var2, 130);
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZB)V",
		garbageValue = "-77"
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1419756940"
	)
	@Export("setFlagOff")
	void setFlagOff(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1]; // L: 357
		var10000[var2] &= ~var3;
	} // L: 358

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1323410714"
	)
	public void method4009(int var1, int var2) {
		var1 -= this.xInset; // L: 361
		var2 -= this.yInset; // L: 362
		int[] var10000 = this.flags[var1]; // L: 363
		var10000[var2] &= -262145;
	} // L: 364

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Z",
		garbageValue = "0"
	)
	static final boolean method4036(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 219
		Buffer var4 = new Buffer(var0); // L: 220
		int var5 = -1; // L: 221

		label71:
		while (true) {
			int var6 = var4.method8420(); // L: 223
			if (var6 == 0) { // L: 224
				return var3; // L: 255
			}

			var5 += var6; // L: 225
			int var7 = 0; // L: 226
			boolean var8 = false; // L: 227

			while (true) {
				int var9;
				while (!var8) { // L: 229
					var9 = var4.readUShortSmart(); // L: 235
					if (var9 == 0) { // L: 236
						continue label71;
					}

					var7 += var9 - 1; // L: 237
					int var10 = var7 & 63; // L: 238
					int var11 = var7 >> 6 & 63; // L: 239
					int var12 = var4.readUnsignedByte() >> 2; // L: 240
					int var13 = var11 + var1; // L: 241
					int var14 = var10 + var2; // L: 242
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 243
						ObjectComposition var15 = InterfaceParent.getObjectDefinition(var5); // L: 244
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 245
							if (!var15.needsModelFiles()) { // L: 246
								++Client.field559; // L: 247
								var3 = false; // L: 248
							}

							var8 = true; // L: 250
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 230
				if (var9 == 0) { // L: 231
					break;
				}

				var4.readUnsignedByte(); // L: 232
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "-1438921464"
	)
	static Date method4028() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 1032
		var0.setLenient(false); // L: 1033
		StringBuilder var1 = new StringBuilder(); // L: 1034
		String[] var2 = Login.field914; // L: 1036

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1037
			String var4 = var2[var3]; // L: 1038
			if (var4 == null) { // L: 1040
				class20.method291("Date not valid.", "Please ensure all characters are populated.", ""); // L: 1041
				return null; // L: 1042
			}

			var1.append(var4); // L: 1044
		}

		var1.append("12"); // L: 1048
		return var0.parse(var1.toString()); // L: 1049
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "406167973"
	)
	static final void method4019(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class343.field4234 || ServerPacket.field3133 != var1) { // L: 5691
			class343.field4234 = var0; // L: 5694
			ServerPacket.field3133 = var1; // L: 5695
			class21.method305(25); // L: 5696
			class145.drawLoadingMessage("Loading - please wait.", true); // L: 5697
			int var3 = class26.baseX * 64; // L: 5698
			int var4 = class158.baseY * 64; // L: 5699
			class26.baseX = (var0 - 6) * 8; // L: 5700
			class158.baseY = (var1 - 6) * 8; // L: 5701
			int var5 = class26.baseX * 64 - var3; // L: 5702
			int var6 = class158.baseY * 64 - var4; // L: 5703
			var3 = class26.baseX * 64; // L: 5704
			var4 = class158.baseY * 64; // L: 5705

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 65536; ++var7) { // L: 5706
				NPC var19 = Client.npcs[var7]; // L: 5707
				if (var19 != null) { // L: 5708
					for (var9 = 0; var9 < 10; ++var9) { // L: 5709
						var10000 = var19.pathX; // L: 5710
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5711
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5713
					var19.y -= var6 * 128; // L: 5714
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5717
				Player var22 = Client.players[var7]; // L: 5718
				if (var22 != null) { // L: 5719
					for (var9 = 0; var9 < 10; ++var9) { // L: 5720
						var10000 = var22.pathX; // L: 5721
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5722
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5724
					var22.y -= var6 * 128; // L: 5725
				}
			}

			byte var20 = 0; // L: 5728
			byte var8 = 104; // L: 5729
			byte var21 = 1; // L: 5730
			if (var5 < 0) { // L: 5731
				var20 = 103; // L: 5732
				var8 = -1; // L: 5733
				var21 = -1; // L: 5734
			}

			byte var10 = 0; // L: 5736
			byte var11 = 104; // L: 5737
			byte var12 = 1; // L: 5738
			if (var6 < 0) { // L: 5739
				var10 = 103; // L: 5740
				var11 = -1; // L: 5741
				var12 = -1; // L: 5742
			}

			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) { // L: 5744
				for (var14 = var10; var14 != var11; var14 += var12) { // L: 5745
					int var15 = var13 + var5; // L: 5746
					int var16 = var6 + var14; // L: 5747

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5748
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) { // L: 5749
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5750
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5754 5755 5759
				var18.x -= var5; // L: 5756
				var18.y -= var6; // L: 5757
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5758
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5761
				Client.destinationX -= var5; // L: 5762
				Client.destinationY -= var6; // L: 5763
			}

			Client.soundEffectCount = 0; // L: 5765
			Client.isCameraLocked = false; // L: 5766
			TextureProvider.cameraX -= var5 << 7; // L: 5767
			class313.cameraZ -= var6 << 7; // L: 5768
			class31.oculusOrbFocalPointX -= var5 << 7; // L: 5769
			PendingSpawn.oculusOrbFocalPointY -= var6 << 7; // L: 5770
			Client.field519 = -1; // L: 5771
			Client.graphicsObjects.clear(); // L: 5772
			Client.projectiles.clear(); // L: 5773

			for (var14 = 0; var14 < 4; ++var14) { // L: 5774
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5692 5775
}
