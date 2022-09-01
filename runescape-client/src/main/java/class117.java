import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
public class class117 {
	@ObfuscatedName("s")
	boolean field1447;
	@ObfuscatedName("h")
	boolean field1438;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	class116 field1439;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	class116 field1449;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Ldr;"
	)
	class113[] field1441;
	@ObfuscatedName("q")
	boolean field1442;
	@ObfuscatedName("i")
	float field1437;
	@ObfuscatedName("k")
	float field1444;
	@ObfuscatedName("o")
	float[] field1445;
	@ObfuscatedName("n")
	float[] field1440;
	@ObfuscatedName("d")
	boolean field1448;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -142194557
	)
	int field1446;
	@ObfuscatedName("m")
	float[] field1454;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1852010129
	)
	int field1450;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -777934173
	)
	int field1451;
	@ObfuscatedName("z")
	float field1452;
	@ObfuscatedName("r")
	float field1443;

	class117() {
		this.field1445 = new float[4]; // L: 16
		this.field1440 = new float[4]; // L: 17
		this.field1448 = true; // L: 18
		this.field1446 = 0; // L: 19
	} // L: 26

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)I",
		garbageValue = "1553569592"
	)
	int method2685(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort(); // L: 29
		int var4 = var1.readUnsignedByte(); // L: 30
		class123[] var5 = new class123[]{class123.field1508, class123.field1515, class123.field1507, class123.field1512, class123.field1509, class123.field1518, class123.field1511, class123.field1510, class123.field1513}; // L: 34
		class123 var6 = (class123)GameEngine.findEnumerated(var5, var4); // L: 36
		if (var6 == null) { // L: 37
			var6 = class123.field1513;
		}

		int var12 = var1.readUnsignedByte(); // L: 40
		class116[] var7 = new class116[]{class116.field1434, class116.field1431, class116.field1428, class116.field1433, class116.field1432}; // L: 44
		class116 var8 = (class116)GameEngine.findEnumerated(var7, var12); // L: 46
		if (var8 == null) { // L: 47
			var8 = class116.field1434;
		}

		this.field1439 = var8; // L: 50
		int var13 = var1.readUnsignedByte(); // L: 52
		class116[] var9 = new class116[]{class116.field1434, class116.field1431, class116.field1428, class116.field1433, class116.field1432}; // L: 56
		class116 var10 = (class116)GameEngine.findEnumerated(var9, var13); // L: 58
		if (var10 == null) { // L: 59
			var10 = class116.field1434;
		}

		this.field1449 = var10; // L: 62
		this.field1447 = var1.readUnsignedByte() != 0; // L: 63
		this.field1441 = new class113[var3]; // L: 64
		class113 var15 = null; // L: 65

		int var14;
		for (var14 = 0; var14 < var3; ++var14) { // L: 66
			class113 var11 = new class113(); // L: 67
			var11.method2621(var1, var2); // L: 68
			this.field1441[var14] = var11; // L: 69
			if (var15 != null) { // L: 70
				var15.field1404 = var11; // L: 71
			}

			var15 = var11; // L: 73
		}

		this.field1450 = this.field1441[0].field1400; // L: 75
		this.field1451 = this.field1441[this.method2712() - 1].field1400; // L: 76
		this.field1454 = new float[this.method2686() + 1]; // L: 78

		for (var14 = this.method2687(); var14 <= this.method2709(); ++var14) { // L: 79
			this.field1454[var14 - this.method2687()] = class10.method86(this, (float)var14); // L: 80
		}

		this.field1441 = null; // L: 82
		this.field1452 = class10.method86(this, (float)(this.method2687() - 1)); // L: 84
		this.field1443 = class10.method86(this, (float)(this.method2709() + 1)); // L: 85
		return var3; // L: 86
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-313022235"
	)
	public float method2705(int var1) {
		if (var1 < this.method2687()) { // L: 91
			return this.field1452; // L: 92
		} else {
			return var1 > this.method2709() ? this.field1443 : this.field1454[var1 - this.method2687()]; // L: 94 95 97
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "512"
	)
	int method2687() {
		return this.field1450; // L: 102
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "428317719"
	)
	int method2709() {
		return this.field1451; // L: 106
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-70"
	)
	int method2686() {
		return this.method2709() - this.method2687(); // L: 110
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "1558860712"
	)
	int method2690(float var1) {
		if (this.field1446 < 0 || (float)this.field1441[this.field1446].field1400 > var1 || this.field1441[this.field1446].field1404 != null && (float)this.field1441[this.field1446].field1404.field1400 <= var1) { // L: 114
			if (var1 >= (float)this.method2687() && var1 <= (float)this.method2709()) { // L: 117
				int var2 = this.method2712(); // L: 120
				int var3 = this.field1446; // L: 121
				if (var2 > 0) { // L: 122
					int var4 = 0; // L: 123
					int var5 = var2 - 1; // L: 124

					do {
						int var6 = var5 + var4 >> 1; // L: 126
						if (var1 < (float)this.field1441[var6].field1400) { // L: 127
							if (var1 > (float)this.field1441[var6 - 1].field1400) { // L: 128
								var3 = var6 - 1; // L: 129
								break;
							}

							var5 = var6 - 1; // L: 133
						} else {
							if (var1 <= (float)this.field1441[var6].field1400) { // L: 136
								var3 = var6; // L: 146
								break; // L: 147
							}

							if (var1 < (float)this.field1441[var6 + 1].field1400) { // L: 137
								var3 = var6; // L: 138
								break; // L: 139
							}

							var4 = var6 + 1; // L: 142
						}
					} while(var4 <= var5); // L: 149
				}

				if (var3 != this.field1446) { // L: 151
					this.field1446 = var3; // L: 152
					this.field1448 = true; // L: 153
				}

				return this.field1446; // L: 155
			} else {
				return -1; // L: 118
			}
		} else {
			return this.field1446; // L: 115
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(FB)Ldr;",
		garbageValue = "-25"
	)
	class113 method2691(float var1) {
		int var2 = this.method2690(var1); // L: 159
		return var2 >= 0 && var2 < this.field1441.length ? this.field1441[var2] : null; // L: 160 161 164
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "16711935"
	)
	int method2712() {
		return this.field1441 == null ? 0 : this.field1441.length; // L: 169 170
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "51"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 227
		var1.offset = var0.length - 2; // L: 228
		class457.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 229
		class457.SpriteBuffer_xOffsets = new int[class457.SpriteBuffer_spriteCount]; // L: 230
		InterfaceParent.SpriteBuffer_yOffsets = new int[class457.SpriteBuffer_spriteCount]; // L: 231
		class457.SpriteBuffer_spriteWidths = new int[class457.SpriteBuffer_spriteCount]; // L: 232
		SoundCache.SpriteBuffer_spriteHeights = new int[class457.SpriteBuffer_spriteCount]; // L: 233
		class181.SpriteBuffer_pixels = new byte[class457.SpriteBuffer_spriteCount][]; // L: 234
		var1.offset = var0.length - 7 - class457.SpriteBuffer_spriteCount * 8; // L: 235
		class457.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 236
		class457.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 237
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 238

		int var3;
		for (var3 = 0; var3 < class457.SpriteBuffer_spriteCount; ++var3) { // L: 239
			class457.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class457.SpriteBuffer_spriteCount; ++var3) { // L: 240
			InterfaceParent.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class457.SpriteBuffer_spriteCount; ++var3) { // L: 241
			class457.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class457.SpriteBuffer_spriteCount; ++var3) { // L: 242
			SoundCache.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class457.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 243
		class457.SpriteBuffer_spritePalette = new int[var2]; // L: 244

		for (var3 = 1; var3 < var2; ++var3) { // L: 245
			class457.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 246
			if (class457.SpriteBuffer_spritePalette[var3] == 0) { // L: 247
				class457.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 249

		for (var3 = 0; var3 < class457.SpriteBuffer_spriteCount; ++var3) { // L: 250
			int var4 = class457.SpriteBuffer_spriteWidths[var3]; // L: 251
			int var5 = SoundCache.SpriteBuffer_spriteHeights[var3]; // L: 252
			int var6 = var4 * var5; // L: 253
			byte[] var7 = new byte[var6]; // L: 254
			class181.SpriteBuffer_pixels[var3] = var7; // L: 255
			int var8 = var1.readUnsignedByte(); // L: 256
			int var9;
			if (var8 == 0) { // L: 257
				for (var9 = 0; var9 < var6; ++var9) { // L: 258
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 260
				for (var9 = 0; var9 < var4; ++var9) { // L: 261
					for (int var10 = 0; var10 < var5; ++var10) { // L: 262
						var7[var9 + var4 * var10] = var1.readByte(); // L: 263
					}
				}
			}
		}

	} // L: 268
}
