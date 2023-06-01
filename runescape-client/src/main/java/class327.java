import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
public class class327 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	class392 field3565;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	class392 field3564;
	@ObfuscatedName("av")
	boolean field3582;
	@ObfuscatedName("aq")
	boolean field3581;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1087469193
	)
	int field3567;
	@ObfuscatedName("ak")
	boolean field3568;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 993454981
	)
	int field3576;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1301653461
	)
	int field3570;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 216544487
	)
	int field3571;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1571594959
	)
	int field3572;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 543300875
	)
	int field3573;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1571573093
	)
	int field3574;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 687614883
	)
	int field3575;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -60445323
	)
	int field3566;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -87749769
	)
	int field3569;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1233061757
	)
	int field3578;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1660011381
	)
	int field3563;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1195096305
	)
	int field3559;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1893671919
	)
	int field3577;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	class321 field3555;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	class321 field3583;

	class327() {
		this.field3565 = new class392(); // L: 32
		this.field3564 = new class392(); // L: 33
		this.field3582 = false; // L: 34
		this.field3581 = true; // L: 35
		this.field3567 = 0; // L: 36
		this.field3568 = false; // L: 37
		this.field3576 = 0; // L: 38
		this.field3570 = 0; // L: 39
		this.field3571 = 0; // L: 40
		this.field3572 = 0; // L: 41
		this.field3573 = 0; // L: 42
		this.field3574 = 0; // L: 43
		this.field3575 = 0; // L: 44
		this.field3566 = Integer.MAX_VALUE; // L: 45
		this.field3569 = Integer.MAX_VALUE; // L: 46
		this.field3578 = 0; // L: 47
		this.field3563 = 0; // L: 48
		this.field3559 = 0; // L: 49
		this.field3577 = 0; // L: 50
		this.field3565.method7276(1); // L: 55
		this.field3564.method7276(1); // L: 56
	} // L: 57

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "943751866"
	)
	void method6383() {
		this.field3567 = (this.field3567 + 1) % 60; // L: 60
		if (this.field3575 > 0) { // L: 61
			--this.field3575; // L: 62
		}

	} // L: 64

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1965327184"
	)
	public boolean method6190(boolean var1) {
		var1 = var1 && this.field3581; // L: 67
		boolean var2 = this.field3582 != var1; // L: 68
		this.field3582 = var1; // L: 69
		if (!this.field3582) { // L: 70
			this.method6402(this.field3572, this.field3572); // L: 71
		}

		return var2; // L: 73
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "91"
	)
	public void method6390(boolean var1) {
		this.field3581 = var1; // L: 77
		this.field3582 = var1 && this.field3582; // L: 78
	} // L: 79

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1163080610"
	)
	boolean method6155(String var1) {
		String var2 = this.field3565.method7257(); // L: 82
		if (!var2.equals(var1)) { // L: 83
			var1 = this.method6221(var1); // L: 84
			this.field3565.method7318(var1); // L: 85
			this.method6162(this.field3559, this.field3577); // L: 86
			this.method6225(); // L: 87
			this.method6230(); // L: 88
			return true; // L: 89
		} else {
			return false; // L: 91
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1890987266"
	)
	boolean method6156(String var1) {
		this.field3564.method7318(var1); // L: 95
		return true; // L: 96
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lpw;I)Z",
		garbageValue = "-1038766334"
	)
	boolean method6329(AbstractFont var1) {
		boolean var2 = !this.field3568; // L: 100
		this.field3565.method7382(var1); // L: 101
		this.field3564.method7382(var1); // L: 102
		this.field3568 = true; // L: 103
		var2 |= this.method6162(this.field3559, this.field3577); // L: 104
		var2 |= this.method6402(this.field3573, this.field3572); // L: 105
		if (this.method6225()) { // L: 106
			this.method6230(); // L: 107
			var2 = true; // L: 108
		}

		return var2; // L: 110
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "563628663"
	)
	public boolean method6296(int var1, int var2) {
		boolean var3 = this.field3578 != var1 || var2 != this.field3563; // L: 114
		this.field3578 = var1; // L: 115
		this.field3563 = var2; // L: 116
		var3 |= this.method6162(this.field3559, this.field3577); // L: 117
		return var3; // L: 118
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-518856630"
	)
	public boolean method6275(int var1) {
		if (var1 < 0) { // L: 122
			var1 = Integer.MAX_VALUE; // L: 123
		}

		boolean var2 = var1 == this.field3565.method7262(); // L: 125
		this.field3565.method7275(var1); // L: 126
		this.field3564.method7275(var1); // L: 127
		if (this.method6225()) { // L: 128
			this.method6230(); // L: 129
			var2 = true; // L: 130
		}

		return var2; // L: 132
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1239958158"
	)
	public boolean method6415(int var1) {
		this.field3565.method7259(var1); // L: 136
		if (this.method6225()) { // L: 137
			this.method6230(); // L: 138
			return true; // L: 139
		} else {
			return false; // L: 141
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "730173558"
	)
	public boolean method6317(int var1) {
		this.field3569 = var1; // L: 145
		if (this.method6225()) { // L: 146
			this.method6230(); // L: 147
			return true; // L: 148
		} else {
			return false; // L: 150
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-102"
	)
	public boolean method6162(int var1, int var2) {
		if (!this.method6209()) { // L: 154
			this.field3559 = var1; // L: 155
			this.field3577 = var2; // L: 156
			return false; // L: 157
		} else {
			int var3 = this.field3559; // L: 159
			int var4 = this.field3577; // L: 160
			int var5 = Math.max(0, this.field3565.method7288() - this.field3578 + 2); // L: 161
			int var6 = Math.max(0, this.field3565.method7278() - this.field3563 + 1); // L: 162
			this.field3559 = Math.max(0, Math.min(var5, var1)); // L: 163
			this.field3577 = Math.max(0, Math.min(var6, var2)); // L: 164
			return var3 != this.field3559 || var4 != this.field3577; // L: 165
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-324971452"
	)
	public boolean method6163(int var1, int var2) {
		boolean var3 = true; // L: 169
		if (var1 < 0 || var1 > 2) { // L: 170
			var3 = false; // L: 171
		}

		if (var2 < 0 || var2 > 2) { // L: 173
			var3 = false; // L: 174
		}

		return var3 ? this.field3565.method7372(var1, var2) : false; // L: 176 177 179
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "544975957"
	)
	public void method6166(int var1) {
		this.field3565.method7327(var1); // L: 183
	} // L: 184

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-35"
	)
	public void method6165(int var1) {
		this.field3576 = var1; // L: 187
	} // L: 188

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	public void method6267(int var1) {
		this.field3565.method7276(var1); // L: 191
	} // L: 192

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-96"
	)
	public void method6167(int var1) {
		this.field3565.method7370(var1); // L: 195
	} // L: 196

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "264165983"
	)
	public boolean method6366(int var1) {
		this.field3571 = var1; // L: 199
		String var2 = this.field3565.method7257(); // L: 200
		int var3 = var2.length(); // L: 201
		var2 = this.method6221(var2); // L: 202
		if (var2.length() != var3) { // L: 203
			this.field3565.method7318(var2); // L: 204
			this.method6162(this.field3559, this.field3577); // L: 205
			this.method6225(); // L: 206
			this.method6230(); // L: 207
			return true; // L: 208
		} else {
			return false; // L: 210
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	public void method6169() {
		this.field3568 = false; // L: 214
	} // L: 215

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "-10249"
	)
	public boolean method6170(int var1) {
		if (this.method6232(var1)) { // L: 218
			this.method6175(); // L: 219
			class393 var2 = this.field3565.method7266((char)var1, this.field3572, this.field3566); // L: 220
			this.method6402(var2.method7394(), var2.method7394()); // L: 221
			this.method6225(); // L: 222
			this.method6230(); // L: 223
		}

		return true; // L: 225
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "827072479"
	)
	public void method6171() {
		if (!this.method6175() && this.field3572 > 0) { // L: 229
			int var1 = this.field3565.method7271(this.field3572 - 1); // L: 230
			this.method6230(); // L: 231
			this.method6402(var1, var1); // L: 232
		}

	} // L: 234

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1995326369"
	)
	public void method6336() {
		if (!this.method6175() && this.field3572 < this.field3565.method7256()) { // L: 237
			int var1 = this.field3565.method7271(this.field3572); // L: 238
			this.method6230(); // L: 239
			this.method6402(var1, var1); // L: 240
		}

	} // L: 242

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2122470986"
	)
	public void method6173() {
		if (!this.method6175() && this.field3572 > 0) { // L: 245
			class473 var1 = this.method6349(this.field3572 - 1); // L: 246
			int var2 = this.field3565.method7269((Integer)var1.field4909, this.field3572); // L: 247
			this.method6230(); // L: 248
			this.method6402(var2, var2); // L: 249
		}

	} // L: 251

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1253133302"
	)
	public void method6248() {
		if (!this.method6175() && this.field3572 < this.field3565.method7256()) { // L: 254
			class473 var1 = this.method6349(this.field3572); // L: 255
			int var2 = this.field3565.method7269(this.field3572, (Integer)var1.field4908); // L: 256
			this.method6230(); // L: 257
			this.method6402(var2, var2); // L: 258
		}

	} // L: 260

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-783178323"
	)
	boolean method6175() {
		if (!this.method6219()) { // L: 263
			return false;
		} else {
			int var1 = this.field3565.method7269(this.field3573, this.field3572); // L: 264
			this.method6230(); // L: 265
			this.method6402(var1, var1); // L: 266
			return true; // L: 267
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-778061003"
	)
	public void method6176() {
		this.method6402(0, this.field3565.method7256()); // L: 271
	} // L: 272

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "115"
	)
	public boolean method6402(int var1, int var2) {
		if (!this.method6209()) { // L: 275
			this.field3573 = var1; // L: 276
			this.field3572 = var2; // L: 277
			return false; // L: 278
		} else {
			if (var1 > this.field3565.method7256()) { // L: 280
				var1 = this.field3565.method7256(); // L: 281
			}

			if (var2 > this.field3565.method7256()) { // L: 283
				var2 = this.field3565.method7256(); // L: 284
			}

			boolean var3 = this.field3573 != var1 || var2 != this.field3572; // L: 286
			this.field3573 = var1; // L: 287
			if (var2 != this.field3572) { // L: 288
				this.field3572 = var2; // L: 289
				this.field3567 = 0; // L: 290
				this.method6228(); // L: 291
			}

			if (var3 && this.field3583 != null) { // L: 293 294
				this.field3583.vmethod6091(); // L: 295
			}

			return var3; // L: 298
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "675174717"
	)
	public void method6345(boolean var1) {
		class473 var2 = this.method6151(this.field3572); // L: 302
		this.method6226((Integer)var2.field4909, var1); // L: 303
	} // L: 304

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-118"
	)
	public void method6179(boolean var1) {
		class473 var2 = this.method6151(this.field3572); // L: 307
		this.method6226((Integer)var2.field4908, var1); // L: 308
	} // L: 309

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-550927925"
	)
	public void method6281(boolean var1) {
		this.method6226(0, var1); // L: 312
	} // L: 313

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-7"
	)
	public void method6257(boolean var1) {
		this.method6226(this.field3565.method7256(), var1); // L: 316
	} // L: 317

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "4"
	)
	public void method6182(boolean var1) {
		if (this.method6219() && !var1) { // L: 320
			this.method6226(Math.min(this.field3573, this.field3572), var1); // L: 321
		} else if (this.field3572 > 0) { // L: 323
			this.method6226(this.field3572 - 1, var1); // L: 324
		}

	} // L: 326

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1162215238"
	)
	public void method6183(boolean var1) {
		if (this.method6219() && !var1) { // L: 329
			this.method6226(Math.max(this.field3573, this.field3572), var1); // L: 330
		} else if (this.field3572 < this.field3565.method7256()) { // L: 332
			this.method6226(this.field3572 + 1, var1); // L: 333
		}

	} // L: 335

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "929498435"
	)
	public void method6350(boolean var1) {
		if (this.field3572 > 0) { // L: 338
			class473 var2 = this.method6349(this.field3572 - 1); // L: 339
			this.method6226((Integer)var2.field4909, var1); // L: 340
		}

	} // L: 342

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1582722192"
	)
	public void method6185(boolean var1) {
		if (this.field3572 < this.field3565.method7256()) { // L: 345
			class473 var2 = this.method6349(this.field3572 + 1); // L: 346
			this.method6226((Integer)var2.field4908, var1); // L: 347
		}

	} // L: 349

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-91"
	)
	public void method6186(boolean var1) {
		if (this.field3572 > 0) { // L: 352
			this.method6226(this.field3565.method7274(this.field3572, -1), var1); // L: 353
		}

	} // L: 355

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1865610745"
	)
	public void method6187(boolean var1) {
		if (this.field3572 < this.field3565.method7256()) { // L: 358
			this.method6226(this.field3565.method7274(this.field3572, 1), var1); // L: 359
		}

	} // L: 361

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "26"
	)
	public void method6188(boolean var1) {
		if (this.field3572 > 0) { // L: 364
			int var2 = this.method6227(); // L: 365
			this.method6226(this.field3565.method7274(this.field3572, -var2), var1); // L: 366
		}

	} // L: 368

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "65"
	)
	public void method6189(boolean var1) {
		if (this.field3572 < this.field3565.method7256()) { // L: 371
			int var2 = this.method6227(); // L: 372
			this.method6226(this.field3565.method7274(this.field3572, var2), var1); // L: 373
		}

	} // L: 375

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1474457438"
	)
	public void method6404(boolean var1) {
		class396 var2 = this.field3565.method7265(0, this.field3572); // L: 378
		class473 var3 = var2.method7512(); // L: 379
		this.method6226(this.field3565.method7273((Integer)var3.field4909, this.field3577), var1); // L: 380
	} // L: 381

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "919790517"
	)
	public void method6204(boolean var1) {
		class396 var2 = this.field3565.method7265(0, this.field3572); // L: 384
		class473 var3 = var2.method7512(); // L: 385
		this.method6226(this.field3565.method7273((Integer)var3.field4909, this.field3577 + this.field3563), var1); // L: 386
	} // L: 387

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "1337737215"
	)
	public void method6192(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false; // L: 390
		class473 var6;
		int var8;
		if (!this.field3568) { // L: 391
			var8 = 0; // L: 392
		} else {
			var1 += this.field3559; // L: 395
			var2 += this.field3577; // L: 396
			var6 = this.method6321(); // L: 397
			var8 = this.field3565.method7273(var1 - (Integer)var6.field4909, var2 - (Integer)var6.field4908); // L: 398
		}

		if (var3 && var4) { // L: 400
			this.field3570 = 1; // L: 401
			var6 = this.method6349(var8); // L: 402
			class473 var7 = this.method6349(this.field3574); // L: 403
			this.method6222(var7, var6); // L: 404
		} else if (var3) { // L: 406
			this.field3570 = 1; // L: 407
			var6 = this.method6349(var8); // L: 408
			this.method6402((Integer)var6.field4909, (Integer)var6.field4908); // L: 409
			this.field3574 = (Integer)var6.field4909; // L: 410
		} else if (var4) { // L: 412
			this.method6402(this.field3574, var8); // L: 413
		} else {
			if (this.field3575 > 0 && var8 == this.field3574) { // L: 416
				if (this.field3573 == this.field3572) { // L: 417
					this.field3570 = 1; // L: 418
					var6 = this.method6349(var8); // L: 419
					this.method6402((Integer)var6.field4909, (Integer)var6.field4908); // L: 420
				} else {
					this.field3570 = 2; // L: 423
					var6 = this.method6151(var8); // L: 424
					this.method6402((Integer)var6.field4909, (Integer)var6.field4908); // L: 425
				}
			} else {
				this.field3570 = 0; // L: 429
				this.method6402(var8, var8); // L: 430
				this.field3574 = var8; // L: 431
			}

			this.field3575 = 25; // L: 433
		}

	} // L: 435

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1097783953"
	)
	public void method6193(int var1, int var2) {
		if (this.field3568 && this.method6380()) { // L: 438
			var1 += this.field3559; // L: 439
			var2 += this.field3577; // L: 440
			class473 var3 = this.method6321(); // L: 441
			int var4 = this.field3565.method7273(var1 - (Integer)var3.field4909, var2 - (Integer)var3.field4908); // L: 442
			class473 var5;
			class473 var6;
			switch(this.field3570) { // L: 443
			case 0:
				this.method6402(this.field3573, var4); // L: 446
				break;
			case 1:
				var5 = this.method6349(this.field3574); // L: 458
				var6 = this.method6349(var4); // L: 459
				this.method6222(var5, var6); // L: 460
				break; // L: 461
			case 2:
				var5 = this.method6151(this.field3574); // L: 451
				var6 = this.method6151(var4); // L: 452
				this.method6222(var5, var6); // L: 453
			}
		}

	} // L: 465

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1977570277"
	)
	public void method6194(Clipboard var1) {
		class396 var2 = this.field3565.method7265(this.field3573, this.field3572); // L: 468
		if (!var2.method7516()) { // L: 469
			String var3 = var2.method7529(); // L: 470
			if (!var3.isEmpty()) { // L: 471
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null); // L: 472
			}
		}

	} // L: 475

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1499752909"
	)
	public void method6195(Clipboard var1) {
		if (this.method6219()) { // L: 478
			this.method6194(var1); // L: 479
			this.method6175(); // L: 480
		}

	} // L: 482

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "104"
	)
	public void method6305(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null); // L: 485
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) { // L: 486
			try {
				String var3 = this.method6221((String)var2.getTransferData(DataFlavor.stringFlavor)); // L: 488
				this.method6175(); // L: 489
				class393 var4 = this.field3565.method7267(var3, this.field3572, this.field3566); // L: 490
				this.method6402(var4.method7394(), var4.method7394()); // L: 491
				this.method6225(); // L: 492
				this.method6230(); // L: 493
			} catch (Exception var5) { // L: 495
			}
		}

	} // L: 497

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method6280() {
		this.field3577 = Math.max(0, this.field3577 - this.field3565.method7277()); // L: 500
	} // L: 501

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1996295200"
	)
	public void method6231() {
		int var1 = Math.max(0, this.field3565.method7278() - this.field3563); // L: 504
		this.field3577 = Math.min(var1, this.field3577 + this.field3565.method7277()); // L: 505
	} // L: 506

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lmw;B)V",
		garbageValue = "91"
	)
	public void method6217(class321 var1) {
		this.field3555 = var1; // L: 509
	} // L: 510

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lmw;B)V",
		garbageValue = "-55"
	)
	public void method6200(class321 var1) {
		this.field3583 = var1; // L: 513
	} // L: 514

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)Lpf;",
		garbageValue = "-1299536280"
	)
	public class392 method6201() {
		return this.field3565; // L: 517
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Lpf;",
		garbageValue = "-1022513463"
	)
	public class392 method6191() {
		return this.field3564; // L: 521
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Lpb;",
		garbageValue = "-2104877216"
	)
	public class396 method6203() {
		return this.field3565.method7265(this.field3573, this.field3572); // L: 525
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1214620145"
	)
	public boolean method6380() {
		return this.field3582; // L: 529
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2007899906"
	)
	public boolean method6205() {
		return this.field3581; // L: 533
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-890031831"
	)
	public boolean method6224() {
		return this.method6380() && this.field3567 % 60 < 30; // L: 537
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "56"
	)
	public int method6207() {
		return this.field3572; // L: 541
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-91"
	)
	public int method6208() {
		return this.field3573; // L: 545
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1561862970"
	)
	public boolean method6209() {
		return this.field3568; // L: 549
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1153367042"
	)
	public int method6210() {
		return this.field3559; // L: 553
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1973685108"
	)
	public int method6178() {
		return this.field3577; // L: 557
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1645852357"
	)
	public int method6212() {
		return this.field3565.method7262(); // L: 561
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "516860549"
	)
	public int method6213() {
		return this.field3565.method7313(); // L: 565
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1879663711"
	)
	public int method6157() {
		return this.field3569; // L: 569
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "701295796"
	)
	public int method6215() {
		return this.field3576; // L: 573
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-295274068"
	)
	public int method6216() {
		return this.field3565.method7301(); // L: 577
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1057481208"
	)
	public int method6362() {
		return this.field3571; // L: 581
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "106"
	)
	public int method6218() {
		return this.field3565.method7309(); // L: 585
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1955467301"
	)
	public boolean method6168() {
		return this.method6213() > 1; // L: 589
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "712502747"
	)
	boolean method6219() {
		return this.field3572 != this.field3573; // L: 593
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1869526217"
	)
	String method6221(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length()); // L: 597

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 598
			char var4 = var1.charAt(var3); // L: 599
			if (this.method6232(var4)) { // L: 600
				var2.append(var4); // L: 601
			}
		}

		return var2.toString(); // L: 604
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Lsk;Lsk;I)V",
		garbageValue = "-1629945382"
	)
	void method6222(class473 var1, class473 var2) {
		if ((Integer)var2.field4909 < (Integer)var1.field4909) { // L: 608
			this.method6402((Integer)var1.field4908, (Integer)var2.field4909); // L: 609
		} else {
			this.method6402((Integer)var1.field4909, (Integer)var2.field4908); // L: 612
		}

	} // L: 614

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsk;",
		garbageValue = "-5"
	)
	class473 method6349(int var1) {
		int var2 = this.field3565.method7256(); // L: 617
		int var3 = 0; // L: 618
		int var4 = var2; // L: 619

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 620
			if (this.method6229(this.field3565.method7252(var5 - 1).field4454)) { // L: 621
				var3 = var5; // L: 622
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 626
			if (this.method6229(this.field3565.method7252(var5).field4454)) { // L: 627
				var4 = var5; // L: 628
				break;
			}
		}

		return new class473(var3, var4); // L: 632
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(II)Lsk;",
		garbageValue = "1533658574"
	)
	class473 method6151(int var1) {
		int var2 = this.field3565.method7256(); // L: 636
		int var3 = 0; // L: 637
		int var4 = var2; // L: 638

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 639
			if (this.field3565.method7252(var5 - 1).field4454 == '\n') { // L: 640
				var3 = var5; // L: 641
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 645
			if (this.field3565.method7252(var5).field4454 == '\n') { // L: 646
				var4 = var5; // L: 647
				break;
			}
		}

		return new class473(var3, var4); // L: 651
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-324230349"
	)
	boolean method6225() {
		if (!this.method6209()) { // L: 655
			return false;
		} else {
			boolean var1 = false; // L: 656
			if (this.field3565.method7256() > this.field3569) { // L: 657
				this.field3565.method7269(this.field3569, this.field3565.method7256()); // L: 658
				var1 = true; // L: 659
			}

			int var2 = this.method6213(); // L: 661
			int var3;
			if (this.field3565.method7282() > var2) { // L: 662
				var3 = this.field3565.method7274(0, var2) - 1; // L: 663
				this.field3565.method7269(var3, this.field3565.method7256()); // L: 664
				var1 = true; // L: 665
			}

			if (var1) { // L: 667
				var3 = this.field3572; // L: 668
				int var4 = this.field3573; // L: 669
				int var5 = this.field3565.method7256(); // L: 670
				if (this.field3572 > var5) { // L: 671
					var3 = var5; // L: 672
				}

				if (this.field3573 > var5) { // L: 674
					var4 = var5; // L: 675
				}

				this.method6402(var4, var3); // L: 677
			}

			return var1; // L: 679
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-747698614"
	)
	void method6226(int var1, boolean var2) {
		if (var2) { // L: 683
			this.method6402(this.field3573, var1);
		} else {
			this.method6402(var1, var1); // L: 684
		}

	} // L: 685

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-61"
	)
	int method6227() {
		return this.field3563 / this.field3565.method7277(); // L: 688
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2038166821"
	)
	void method6228() {
		class396 var1 = this.field3565.method7265(0, this.field3572); // L: 692
		class473 var2 = var1.method7512(); // L: 693
		int var3 = this.field3565.method7277(); // L: 694
		int var4 = (Integer)var2.field4909 - 10; // L: 695
		int var5 = var4 + 20; // L: 696
		int var6 = (Integer)var2.field4908 - 3; // L: 697
		int var7 = var3 + var6 + 6; // L: 698
		int var8 = this.field3559; // L: 699
		int var9 = var8 + this.field3578; // L: 700
		int var10 = this.field3577; // L: 701
		int var11 = var10 + this.field3563; // L: 702
		int var12 = this.field3559; // L: 703
		int var13 = this.field3577; // L: 704
		if (var4 < var8) { // L: 705
			var12 = var4; // L: 706
		} else if (var5 > var9) { // L: 708
			var12 = var5 - this.field3578; // L: 709
		}

		if (var6 < var10) { // L: 711
			var13 = var6; // L: 712
		} else if (var7 > var11) { // L: 714
			var13 = var7 - this.field3563; // L: 715
		}

		this.method6162(var12, var13); // L: 717
	} // L: 718

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "256"
	)
	boolean method6229(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9; // L: 721
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method6230() {
		if (this.field3555 != null) { // L: 725
			this.field3555.vmethod6091(); // L: 726
		}

	} // L: 728

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "27265"
	)
	boolean method6232(int var1) {
		switch(this.field3571) { // L: 731
		case 1:
			return ServerPacket.isAlphaNumeric((char)var1); // L: 739
		case 2:
			return Clock.isCharAlphabetic((char)var1); // L: 733
		case 3:
			return class350.isDigit((char)var1); // L: 737
		case 4:
			char var2 = (char)var1; // L: 741
			if (class350.isDigit(var2)) { // L: 742
				return true; // L: 743
			} else {
				if (var2 != 'k' && var2 != 'K' && var2 != 'm' && var2 != 'M' && var2 != 'b' && var2 != 'B') { // L: 745
					return false; // L: 748
				}

				return true; // L: 746
			}
		default:
			return true; // L: 735
		}
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(B)Lsk;",
		garbageValue = "-91"
	)
	class473 method6321() {
		int var1 = this.field3565.method7336(this.field3578); // L: 753
		int var2 = this.field3565.method7285(this.field3563); // L: 754
		return new class473(var1, var2); // L: 755
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "822008960"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = class280.method5641(var0); // L: 24
		int var2 = var1.baseVar; // L: 25
		int var3 = var1.startBit; // L: 26
		int var4 = var1.endBit; // L: 27
		int var5 = Varps.Varps_masks[var4 - var3]; // L: 28
		return Varps.Varps_main[var2] >> var3 & var5; // L: 29
	}
}
