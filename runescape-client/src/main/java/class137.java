import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class137 extends DualNode {
	@ObfuscatedName("ap")
	public static ThreadPoolExecutor field1625;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 296985237
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1090891029
	)
	int field1628;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[[Lfh;"
	)
	public class130[][] field1627;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[[Lfh;"
	)
	class130[][] field1621;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	public Skeleton field1622;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -354796061
	)
	int field1623;
	@ObfuscatedName("ai")
	boolean field1631;
	@ObfuscatedName("aa")
	Future field1626;
	@ObfuscatedName("af")
	List field1620;

	@ObfuscatedSignature(
		descriptor = "(Lnu;Lnu;IZ)V",
		garbageValue = "0"
	)
	public class137(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1627 = null; // L: 21
		this.field1621 = null; // L: 22
		this.field1623 = 0; // L: 24
		this.field1628 = var3; // L: 32
		byte[] var5 = var1.takeFile(this.field1628 >> 16 & 65535, this.field1628 & 65535); // L: 33
		Buffer var6 = new Buffer(var5); // L: 34
		int var7 = var6.readUnsignedByte(); // L: 35
		int var8 = var6.readUnsignedShort(); // L: 36
		byte[] var9 = var2.getFile(var8, 0); // L: 39
		this.field1622 = new Skeleton(var8, var9); // L: 40
		this.field1620 = new ArrayList(); // L: 41
		this.field1626 = field1625.submit(new class134(this, var6, var7)); // L: 42
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;IB)V",
		garbageValue = "100"
	)
	void method3057(Buffer var1, int var2) {
		var1.readUnsignedShort(); // L: 52
		var1.readUnsignedShort(); // L: 53
		this.field1623 = var1.readUnsignedByte(); // L: 54
		int var3 = var1.readUnsignedShort(); // L: 55
		this.field1621 = new class130[this.field1622.method4517().method4461()][]; // L: 56
		this.field1627 = new class130[this.field1622.method4520()][]; // L: 57
		class129[] var4 = new class129[var3]; // L: 58

		int var5;
		int var7;
		int var9;
		for (var5 = 0; var5 < var3; ++var5) { // L: 59
			var7 = var1.readUnsignedByte(); // L: 61
			class131 var16 = (class131)class25.findEnumerated(WorldMapSprite.method5482(), var7); // L: 63
			if (var16 == null) { // L: 64
				var16 = class131.field1578;
			}

			var9 = var1.readShortSmart(); // L: 68
			int var11 = var1.readUnsignedByte(); // L: 70
			class132[] var12 = new class132[]{class132.field1588, class132.field1584, class132.field1585, class132.field1586, class132.field1592, class132.field1604, class132.field1589, class132.field1590, class132.field1601, class132.field1594, class132.field1593, class132.field1591, class132.field1595, class132.field1587, class132.field1597, class132.field1598, class132.field1599}; // L: 74
			class132 var13 = (class132)class25.findEnumerated(var12, var11); // L: 76
			if (var13 == null) { // L: 77
				var13 = class132.field1588;
			}

			class130 var20 = new class130(); // L: 81
			var20.method2992(var1, var2); // L: 82
			var4[var5] = new class129(this, var20, var16, var13, var9); // L: 83
			int var14 = var16.method3025(); // L: 84
			class130[][] var15;
			if (var16 == class131.field1581) { // L: 86
				var15 = this.field1621; // L: 87
			} else {
				var15 = this.field1627; // L: 90
			}

			if (var15[var9] == null) { // L: 92
				var15[var9] = new class130[var14]; // L: 93
			}

			if (var16 == class131.field1577) { // L: 95
				this.field1631 = true; // L: 96
			}
		}

		var5 = var3 / class291.field3100; // L: 99
		int var6 = var3 % class291.field3100; // L: 100
		int var8 = 0; // L: 102

		for (var9 = 0; var9 < class291.field3100; ++var9) { // L: 103
			var7 = var8; // L: 104
			var8 += var5; // L: 105
			if (var6 > 0) { // L: 106
				++var8; // L: 107
				--var6; // L: 108
			}

			if (var8 == var7) { // L: 110
				break;
			}

			this.field1620.add(field1625.submit(new class136(this, var7, var8, var4))); // L: 115
		}

	} // L: 125

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1948814782"
	)
	public boolean method3068() {
		if (this.field1626 == null && this.field1620 == null) { // L: 128
			return true; // L: 129
		} else {
			if (this.field1626 != null) { // L: 131
				if (!this.field1626.isDone()) { // L: 132
					return false; // L: 133
				}

				this.field1626 = null; // L: 135
			}

			boolean var1 = true; // L: 137

			for (int var2 = 0; var2 < this.field1620.size(); ++var2) { // L: 138
				if (!((Future)this.field1620.get(var2)).isDone()) { // L: 139
					var1 = false; // L: 140
				} else {
					this.field1620.remove(var2); // L: 143
					--var2; // L: 144
				}
			}

			if (!var1) { // L: 147
				return false; // L: 148
			} else {
				this.field1620 = null; // L: 150
				return true; // L: 151
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1976853081"
	)
	public int method3059() {
		return this.field1623; // L: 155
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1397730419"
	)
	public boolean method3060() {
		return this.field1631; // L: 159
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILeo;IIB)V",
		garbageValue = "-98"
	)
	public void method3061(int var1, class127 var2, int var3, int var4) {
		class450 var5;
		synchronized(class450.field4737) { // L: 165
			if (class462.field4778 == 0) { // L: 166
				var5 = new class450();
			} else {
				class450.field4737[--class462.field4778].method8194(); // L: 168
				var5 = class450.field4737[class462.field4778]; // L: 169
			}
		}

		this.method3056(var5, var3, var2, var1); // L: 174
		this.method3066(var5, var3, var2, var1); // L: 175
		this.method3063(var5, var3, var2, var1); // L: 176
		var2.method2947(var5); // L: 177
		var5.method8235(); // L: 178
	} // L: 179

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lrz;ILeo;II)V",
		garbageValue = "1937438486"
	)
	void method3056(class450 var1, int var2, class127 var3, int var4) {
		float[] var5 = var3.method2952(this.field1623); // L: 182
		float var6 = var5[0]; // L: 183
		float var7 = var5[1]; // L: 184
		float var8 = var5[2]; // L: 185
		if (this.field1621[var2] != null) { // L: 186
			class130 var9 = this.field1621[var2][0]; // L: 187
			class130 var10 = this.field1621[var2][1]; // L: 188
			class130 var11 = this.field1621[var2][2]; // L: 189
			if (var9 != null) { // L: 190
				var6 = var9.method2994(var4);
			}

			if (var10 != null) { // L: 191
				var7 = var10.method2994(var4);
			}

			if (var11 != null) { // L: 192
				var8 = var11.method2994(var4);
			}
		}

		class449 var17 = Login.method2085();
		var17.method8163(1.0F, 0.0F, 0.0F, var6);
		class449 var18 = Login.method2085();
		var18.method8163(0.0F, 1.0F, 0.0F, var7);
		class449 var19 = Login.method2085();
		var19.method8163(0.0F, 0.0F, 1.0F, var8);
		class449 var12 = Login.method2085();
		var12.method8165(var19);
		var12.method8165(var17);
		var12.method8165(var18);
		class450 var13;
		synchronized(class450.field4737) {
			if (class462.field4778 == 0) {
				var13 = new class450();
			} else {
				class450.field4737[--class462.field4778].method8194();
				var13 = class450.field4737[class462.field4778];
			}
		}

		var13.method8240(var12); // L: 215
		var1.method8237(var13);
		var17.method8180();
		var18.method8180();
		var19.method8180();
		var12.method8180();
		var13.method8235();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrz;ILeo;II)V",
		garbageValue = "1689339528"
	)
	void method3063(class450 var1, int var2, class127 var3, int var4) {
		float[] var5 = var3.method2953(this.field1623);
		float var6 = var5[0]; // L: 226
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1621[var2] != null) {
			class130 var9 = this.field1621[var2][3];
			class130 var10 = this.field1621[var2][4]; // L: 231
			class130 var11 = this.field1621[var2][5]; // L: 232
			if (var9 != null) { // L: 233
				var6 = var9.method2994(var4);
			}

			if (var10 != null) { // L: 234
				var7 = var10.method2994(var4);
			}

			if (var11 != null) {
				var8 = var11.method2994(var4);
			}
		}

		var1.field4739[12] = var6; // L: 237
		var1.field4739[13] = var7; // L: 238
		var1.field4739[14] = var8; // L: 239
	} // L: 240

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrz;ILeo;II)V",
		garbageValue = "-2003285459"
	)
	void method3066(class450 var1, int var2, class127 var3, int var4) {
		float[] var5 = var3.method2954(this.field1623); // L: 243
		float var6 = var5[0]; // L: 244
		float var7 = var5[1]; // L: 245
		float var8 = var5[2]; // L: 246
		if (this.field1621[var2] != null) { // L: 247
			class130 var9 = this.field1621[var2][6]; // L: 248
			class130 var10 = this.field1621[var2][7]; // L: 249
			class130 var11 = this.field1621[var2][8]; // L: 250
			if (var9 != null) { // L: 251
				var6 = var9.method2994(var4);
			}

			if (var10 != null) { // L: 252
				var7 = var10.method2994(var4);
			}

			if (var11 != null) { // L: 253
				var8 = var11.method2994(var4);
			}
		}

		class450 var14;
		synchronized(class450.field4737) { // L: 257
			if (class462.field4778 == 0) { // L: 258
				var14 = new class450();
			} else {
				class450.field4737[--class462.field4778].method8194(); // L: 260
				var14 = class450.field4737[class462.field4778]; // L: 261
			}
		}

		var14.method8198(var6, var7, var8); // L: 266
		var1.method8237(var14); // L: 267
		var14.method8235(); // L: 268
	} // L: 269

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-7280279"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 194
		var1.offset = var0.length - 2; // L: 195
		class529.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 196
		class529.SpriteBuffer_xOffsets = new int[class529.SpriteBuffer_spriteCount]; // L: 197
		class152.SpriteBuffer_yOffsets = new int[class529.SpriteBuffer_spriteCount]; // L: 198
		HealthBarUpdate.SpriteBuffer_spriteWidths = new int[class529.SpriteBuffer_spriteCount]; // L: 199
		SpriteMask.SpriteBuffer_spriteHeights = new int[class529.SpriteBuffer_spriteCount]; // L: 200
		Coord.SpriteBuffer_pixels = new byte[class529.SpriteBuffer_spriteCount][]; // L: 201
		var1.offset = var0.length - 7 - class529.SpriteBuffer_spriteCount * 8; // L: 202
		class529.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 203
		class420.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 204
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 205

		int var3;
		for (var3 = 0; var3 < class529.SpriteBuffer_spriteCount; ++var3) { // L: 206
			class529.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class529.SpriteBuffer_spriteCount; ++var3) { // L: 207
			class152.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class529.SpriteBuffer_spriteCount; ++var3) { // L: 208
			HealthBarUpdate.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class529.SpriteBuffer_spriteCount; ++var3) { // L: 209
			SpriteMask.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class529.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 210
		class505.SpriteBuffer_spritePalette = new int[var2]; // L: 211

		for (var3 = 1; var3 < var2; ++var3) { // L: 212
			class505.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 213
			if (class505.SpriteBuffer_spritePalette[var3] == 0) { // L: 214
				class505.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 216

		for (var3 = 0; var3 < class529.SpriteBuffer_spriteCount; ++var3) { // L: 217
			int var4 = HealthBarUpdate.SpriteBuffer_spriteWidths[var3]; // L: 218
			int var5 = SpriteMask.SpriteBuffer_spriteHeights[var3]; // L: 219
			int var6 = var4 * var5; // L: 220
			byte[] var7 = new byte[var6]; // L: 221
			Coord.SpriteBuffer_pixels[var3] = var7; // L: 222
			int var8 = var1.readUnsignedByte(); // L: 223
			int var9;
			if (var8 == 0) { // L: 224
				for (var9 = 0; var9 < var6; ++var9) { // L: 225
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 227
				for (var9 = 0; var9 < var4; ++var9) { // L: 228
					for (int var10 = 0; var10 < var5; ++var10) { // L: 229
						var7[var9 + var4 * var10] = var1.readByte(); // L: 230
					}
				}
			}
		}

	} // L: 235
}
