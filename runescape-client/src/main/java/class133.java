import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
public class class133 extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -183831087
	)
	int field1604;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[[Lda;"
	)
	public class125[][] field1601;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[[Lda;"
	)
	class125[][] field1602;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	public Skeleton field1600;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1361787611
	)
	int field1599;
	@ObfuscatedName("j")
	boolean field1597;
	@ObfuscatedName("l")
	Future field1603;
	@ObfuscatedName("k")
	List field1598;

	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;IZ)V"
	)
	class133(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1601 = null; // L: 21
		this.field1602 = null; // L: 22
		this.field1599 = 0; // L: 24
		this.field1604 = var3; // L: 62
		byte[] var5 = var1.takeFile(this.field1604 >> 16 & 65535, this.field1604 & 65535); // L: 63
		Buffer var6 = new Buffer(var5); // L: 64
		int var7 = var6.readUnsignedByte(); // L: 65
		int var8 = var6.readUnsignedShort(); // L: 66
		byte[] var9;
		if (var4) { // L: 68
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0); // L: 69
		}

		this.field1600 = new Skeleton(var8, var9); // L: 70
		this.field1598 = new ArrayList(); // L: 71
		this.field1603 = class277.field3059.submit(new class132(this, var6, var7)); // L: 72
	} // L: 79

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lrd;IS)V",
		garbageValue = "-4594"
	)
	void method3114(Buffer var1, int var2) {
		var1.readUnsignedShort(); // L: 82
		var1.readUnsignedShort(); // L: 83
		this.field1599 = var1.readUnsignedByte(); // L: 84
		int var3 = var1.readUnsignedShort(); // L: 85
		this.field1602 = new class125[this.field1600.method4450().method4428()][]; // L: 86
		this.field1601 = new class125[this.field1600.method4446()][]; // L: 87
		class124[] var4 = new class124[var3]; // L: 88

		int var5;
		int var7;
		int var9;
		for (var5 = 0; var5 < var3; ++var5) { // L: 89
			var7 = var1.readUnsignedByte(); // L: 91
			class126[] var16 = new class126[]{class126.field1546, class126.field1548, class126.field1555, class126.field1550, class126.field1552, class126.field1551}; // L: 95
			class126 var17 = (class126)class4.findEnumerated(var16, var7); // L: 97
			if (var17 == null) { // L: 98
				var17 = class126.field1546;
			}

			var9 = var1.readShortSmart(); // L: 102
			int var11 = var1.readUnsignedByte(); // L: 104
			class127 var12 = (class127)class4.findEnumerated(class122.method3029(), var11); // L: 106
			if (var12 == null) { // L: 107
				var12 = class127.field1566;
			}

			class125 var13 = new class125(); // L: 111
			var13.method3064(var1, var2); // L: 112
			var4[var5] = new class124(this, var13, var17, var12, var9); // L: 113
			int var14 = var17.method3072(); // L: 114
			class125[][] var15;
			if (var17 == class126.field1548) { // L: 116
				var15 = this.field1602; // L: 117
			} else {
				var15 = this.field1601; // L: 120
			}

			if (var15[var9] == null) { // L: 122
				var15[var9] = new class125[var14]; // L: 123
			}

			if (var17 == class126.field1552) { // L: 125
				this.field1597 = true; // L: 126
			}
		}

		var5 = var3 / class461.field4894; // L: 129
		int var6 = var3 % class461.field4894; // L: 130
		int var8 = 0; // L: 132

		for (var9 = 0; var9 < class461.field4894; ++var9) { // L: 133
			var7 = var8; // L: 134
			var8 += var5; // L: 135
			if (var6 > 0) { // L: 136
				++var8; // L: 137
				--var6; // L: 138
			}

			if (var8 == var7) { // L: 140
				break;
			}

			this.field1598.add(class277.field3059.submit(new class128(this, var7, var8, var4))); // L: 145
		}

	} // L: 155

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "21065"
	)
	public boolean method3094() {
		if (this.field1603 == null && this.field1598 == null) { // L: 158
			return true; // L: 159
		} else {
			if (this.field1603 != null) { // L: 161
				if (!this.field1603.isDone()) { // L: 162
					return false; // L: 163
				}

				this.field1603 = null; // L: 165
			}

			boolean var1 = true; // L: 167

			for (int var2 = 0; var2 < this.field1598.size(); ++var2) { // L: 168
				if (!((Future)this.field1598.get(var2)).isDone()) { // L: 169
					var1 = false; // L: 170
				} else {
					this.field1598.remove(var2); // L: 173
					--var2; // L: 174
				}
			}

			if (!var1) { // L: 177
				return false; // L: 178
			} else {
				this.field1598 = null; // L: 180
				return true; // L: 181
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method3117() {
		return this.field1599; // L: 185
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1498028146"
	)
	public boolean method3096() {
		return this.field1597; // L: 189
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILdc;III)V",
		garbageValue = "-2140393878"
	)
	public void method3097(int var1, class122 var2, int var3, int var4) {
		class417 var5;
		synchronized(class417.field4641) { // L: 195
			if (class417.field4643 == 0) { // L: 196
				var5 = new class417();
			} else {
				class417.field4641[--class417.field4643].method7964(); // L: 198
				var5 = class417.field4641[class417.field4643]; // L: 199
			}
		}

		this.method3092(var5, var3, var2, var1); // L: 204
		this.method3100(var5, var3, var2, var1); // L: 205
		this.method3099(var5, var3, var2, var1); // L: 206
		var2.method3000(var5); // L: 207
		var5.method7908(); // L: 208
	} // L: 209

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpb;ILdc;II)V",
		garbageValue = "1446395810"
	)
	void method3092(class417 var1, int var2, class122 var3, int var4) {
		float[] var5 = var3.method3004(this.field1599); // L: 212
		float var6 = var5[0]; // L: 213
		float var7 = var5[1]; // L: 214
		float var8 = var5[2]; // L: 215
		if (this.field1602[var2] != null) { // L: 216
			class125 var9 = this.field1602[var2][0]; // L: 217
			class125 var10 = this.field1602[var2][1]; // L: 218
			class125 var11 = this.field1602[var2][2]; // L: 219
			if (var9 != null) { // L: 220
				var6 = var9.method3043(var4);
			}

			if (var10 != null) { // L: 221
				var7 = var10.method3043(var4);
			}

			if (var11 != null) { // L: 222
				var8 = var11.method3043(var4);
			}
		}

		class416 var25;
		synchronized(class416.field4635) { // L: 226
			if (class388.field4510 == 0) { // L: 227
				var25 = new class416();
			} else {
				class416.field4635[--class388.field4510].method7882(); // L: 229
				var25 = class416.field4635[class388.field4510]; // L: 230
			}
		}

		var25.method7897(1.0F, 0.0F, 0.0F, var6);
		class416 var26;
		synchronized(class416.field4635) { // L: 238
			if (class388.field4510 == 0) {
				var26 = new class416();
			} else {
				class416.field4635[--class388.field4510].method7882(); // L: 241
				var26 = class416.field4635[class388.field4510]; // L: 242
			}
		}

		var26.method7897(0.0F, 1.0F, 0.0F, var7); // L: 247
		class416 var13;
		synchronized(class416.field4635) { // L: 250
			if (class388.field4510 == 0) { // L: 251
				var13 = new class416();
			} else {
				class416.field4635[--class388.field4510].method7882(); // L: 253
				var13 = class416.field4635[class388.field4510]; // L: 254
			}
		}

		var13.method7897(0.0F, 0.0F, 1.0F, var8); // L: 259
		class416 var15;
		synchronized(class416.field4635) { // L: 262
			if (class388.field4510 == 0) { // L: 263
				var15 = new class416();
			} else {
				class416.field4635[--class388.field4510].method7882(); // L: 265
				var15 = class416.field4635[class388.field4510]; // L: 266
			}
		}

		var15.method7883(var13); // L: 271
		var15.method7883(var25); // L: 272
		var15.method7883(var26); // L: 273
		class417 var17;
		synchronized(class417.field4641) { // L: 276
			if (class417.field4643 == 0) { // L: 277
				var17 = new class417();
			} else {
				class417.field4641[--class417.field4643].method7964(); // L: 279
				var17 = class417.field4641[class417.field4643]; // L: 280
			}
		}

		var17.method7919(var15); // L: 285
		var1.method7914(var17); // L: 286
		var25.method7894(); // L: 287
		var26.method7894(); // L: 288
		var13.method7894(); // L: 289
		var15.method7894(); // L: 290
		var17.method7908(); // L: 291
	} // L: 292

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpb;ILdc;IB)V",
		garbageValue = "-85"
	)
	void method3099(class417 var1, int var2, class122 var3, int var4) {
		float[] var5 = var3.method3012(this.field1599); // L: 295
		float var6 = var5[0]; // L: 296
		float var7 = var5[1]; // L: 297
		float var8 = var5[2]; // L: 298
		if (this.field1602[var2] != null) { // L: 299
			class125 var9 = this.field1602[var2][3]; // L: 300
			class125 var10 = this.field1602[var2][4]; // L: 301
			class125 var11 = this.field1602[var2][5]; // L: 302
			if (var9 != null) { // L: 303
				var6 = var9.method3043(var4);
			}

			if (var10 != null) { // L: 304
				var7 = var10.method3043(var4);
			}

			if (var11 != null) { // L: 305
				var8 = var11.method3043(var4);
			}
		}

		var1.field4644[12] = var6; // L: 307
		var1.field4644[13] = var7; // L: 308
		var1.field4644[14] = var8; // L: 309
	} // L: 310

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpb;ILdc;II)V",
		garbageValue = "1689322046"
	)
	void method3100(class417 var1, int var2, class122 var3, int var4) {
		float[] var5 = var3.method3006(this.field1599); // L: 313
		float var6 = var5[0]; // L: 314
		float var7 = var5[1]; // L: 315
		float var8 = var5[2]; // L: 316
		if (this.field1602[var2] != null) { // L: 317
			class125 var9 = this.field1602[var2][6]; // L: 318
			class125 var10 = this.field1602[var2][7]; // L: 319
			class125 var11 = this.field1602[var2][8]; // L: 320
			if (var9 != null) { // L: 321
				var6 = var9.method3043(var4);
			}

			if (var10 != null) { // L: 322
				var7 = var10.method3043(var4);
			}

			if (var11 != null) { // L: 323
				var8 = var11.method3043(var4);
			}
		}

		class417 var14;
		synchronized(class417.field4641) { // L: 327
			if (class417.field4643 == 0) { // L: 328
				var14 = new class417();
			} else {
				class417.field4641[--class417.field4643].method7964(); // L: 330
				var14 = class417.field4641[class417.field4643]; // L: 331
			}
		}

		var14.method7923(var6, var7, var8); // L: 336
		var1.method7914(var14); // L: 337
		var14.method7908(); // L: 338
	} // L: 339

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Lkz;",
		garbageValue = "74"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16; // L: 233
		int var2 = var0 & 65535; // L: 234
		if (WorldMapLabel.Widget_interfaceComponents[var1] == null || WorldMapLabel.Widget_interfaceComponents[var1][var2] == null) { // L: 235
			boolean var3 = class153.loadInterface(var1); // L: 236
			if (!var3) { // L: 237
				return null;
			}
		}

		return WorldMapLabel.Widget_interfaceComponents[var1][var2]; // L: 239
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-186134787"
	)
	public static int method3118(int var0, int var1, int var2) {
		var2 &= 3; // L: 9
		if (var2 == 0) { // L: 10
			return var0;
		} else if (var2 == 1) { // L: 11
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1; // L: 12 13
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-25"
	)
	public static int method3119() {
		return ++MouseHandler.MouseHandler_idleCycles - 1; // L: 58
	}
}
