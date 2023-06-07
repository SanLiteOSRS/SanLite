import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
public class class327 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	class392 field3566;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	class392 field3560;
	@ObfuscatedName("au")
	boolean field3567;
	@ObfuscatedName("ai")
	boolean field3562;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1321716601
	)
	int field3563;
	@ObfuscatedName("aw")
	boolean field3564;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1150554175
	)
	int field3565;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -686509035
	)
	int field3574;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1579752717
	)
	int field3569;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 2085648293
	)
	int field3568;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -399039343
	)
	int field3579;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1719027535
	)
	int field3554;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1047916879
	)
	int field3571;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -713150515
	)
	int field3572;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -2092422027
	)
	int field3573;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1924765425
	)
	int field3570;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -154548847
	)
	int field3575;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 611922185
	)
	int field3576;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1879603107
	)
	int field3577;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	class321 field3578;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	class321 field3552;

	class327() {
		this.field3566 = new class392(); // L: 32
		this.field3560 = new class392(); // L: 33
		this.field3567 = false; // L: 34
		this.field3562 = true; // L: 35
		this.field3563 = 0; // L: 36
		this.field3564 = false; // L: 37
		this.field3565 = 0; // L: 38
		this.field3574 = 0; // L: 39
		this.field3569 = 0; // L: 40
		this.field3568 = 0; // L: 41
		this.field3579 = 0; // L: 42
		this.field3554 = 0; // L: 43
		this.field3571 = 0; // L: 44
		this.field3572 = Integer.MAX_VALUE; // L: 45
		this.field3573 = Integer.MAX_VALUE; // L: 46
		this.field3570 = 0; // L: 47
		this.field3575 = 0; // L: 48
		this.field3576 = 0; // L: 49
		this.field3577 = 0; // L: 50
		this.field3566.method7272(1); // L: 55
		this.field3560.method7272(1); // L: 56
	} // L: 57

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1366871947"
	)
	void method6135() {
		this.field3563 = (this.field3563 + 1) % 60; // L: 60
		if (this.field3571 > 0) { // L: 61
			--this.field3571; // L: 62
		}

	} // L: 64

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "102"
	)
	public boolean method6056(boolean var1) {
		var1 = var1 && this.field3562; // L: 67
		boolean var2 = this.field3567 != var1; // L: 68
		this.field3567 = var1; // L: 69
		if (!this.field3567) { // L: 70
			this.method6080(this.field3568, this.field3568); // L: 71
		}

		return var2; // L: 73
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1331805463"
	)
	public void method6057(boolean var1) {
		this.field3562 = var1; // L: 77
		this.field3567 = var1 && this.field3567; // L: 78
	} // L: 79

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1468802518"
	)
	boolean method6334(String var1) {
		String var2 = this.field3566.method7267(); // L: 82
		if (!var2.equals(var1)) { // L: 83
			var1 = this.method6124(var1); // L: 84
			this.field3566.method7279(var1); // L: 85
			this.method6338(this.field3576, this.field3577); // L: 86
			this.method6317(); // L: 87
			this.method6133(); // L: 88
			return true; // L: 89
		} else {
			return false; // L: 91
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-149482019"
	)
	boolean method6219(String var1) {
		this.field3560.method7279(var1); // L: 95
		return true; // L: 96
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpn;I)Z",
		garbageValue = "-1972901380"
	)
	boolean method6060(AbstractFont var1) {
		boolean var2 = !this.field3564; // L: 100
		this.field3566.method7271(var1); // L: 101
		this.field3560.method7271(var1); // L: 102
		this.field3564 = true; // L: 103
		var2 |= this.method6338(this.field3576, this.field3577); // L: 104
		var2 |= this.method6080(this.field3579, this.field3568); // L: 105
		if (this.method6317()) { // L: 106
			this.method6133(); // L: 107
			var2 = true; // L: 108
		}

		return var2; // L: 110
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "156796357"
	)
	public boolean method6061(int var1, int var2) {
		boolean var3 = this.field3570 != var1 || var2 != this.field3575; // L: 114
		this.field3570 = var1; // L: 115
		this.field3575 = var2; // L: 116
		var3 |= this.method6338(this.field3576, this.field3577); // L: 117
		return var3; // L: 118
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1859935155"
	)
	public boolean method6167(int var1) {
		if (var1 < 0) { // L: 122
			var1 = Integer.MAX_VALUE; // L: 123
		}

		boolean var2 = var1 == this.field3566.method7290(); // L: 125
		this.field3566.method7397(var1); // L: 126
		this.field3560.method7397(var1); // L: 127
		if (this.method6317()) { // L: 128
			this.method6133(); // L: 129
			var2 = true; // L: 130
		}

		return var2; // L: 132
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1046429285"
	)
	public boolean method6110(int var1) {
		this.field3566.method7269(var1); // L: 136
		if (this.method6317()) { // L: 137
			this.method6133(); // L: 138
			return true; // L: 139
		} else {
			return false; // L: 141
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1518453135"
	)
	public boolean method6064(int var1) {
		this.field3573 = var1; // L: 145
		if (this.method6317()) { // L: 146
			this.method6133(); // L: 147
			return true; // L: 148
		} else {
			return false; // L: 150
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "0"
	)
	public boolean method6338(int var1, int var2) {
		if (!this.method6238()) { // L: 154
			this.field3576 = var1; // L: 155
			this.field3577 = var2; // L: 156
			return false; // L: 157
		} else {
			int var3 = this.field3576; // L: 159
			int var4 = this.field3577; // L: 160
			int var5 = Math.max(0, this.field3566.method7285() - this.field3570 + 2); // L: 161
			int var6 = Math.max(0, this.field3566.method7288() - this.field3575 + 1); // L: 162
			this.field3576 = Math.max(0, Math.min(var5, var1)); // L: 163
			this.field3577 = Math.max(0, Math.min(var6, var2)); // L: 164
			return var3 != this.field3576 || var4 != this.field3577; // L: 165
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1434004662"
	)
	public boolean method6066(int var1, int var2) {
		boolean var3 = true; // L: 169
		if (var1 < 0 || var1 > 2) { // L: 170
			var3 = false; // L: 171
		}

		if (var2 < 0 || var2 > 2) { // L: 173
			var3 = false; // L: 174
		}

		return var3 ? this.field3566.method7273(var1, var2) : false; // L: 176 177 179
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2092078385"
	)
	public void method6067(int var1) {
		this.field3566.method7361(var1); // L: 183
	} // L: 184

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1102820457"
	)
	public void method6168(int var1) {
		this.field3565 = var1; // L: 187
	} // L: 188

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "94089397"
	)
	public void method6069(int var1) {
		this.field3566.method7272(var1); // L: 191
	} // L: 192

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1327708796"
	)
	public void method6070(int var1) {
		this.field3566.method7270(var1); // L: 195
	} // L: 196

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "121"
	)
	public boolean method6071(int var1) {
		this.field3569 = var1; // L: 199
		String var2 = this.field3566.method7267(); // L: 200
		int var3 = var2.length(); // L: 201
		var2 = this.method6124(var2); // L: 202
		if (var2.length() != var3) { // L: 203
			this.field3566.method7279(var2); // L: 204
			this.method6338(this.field3576, this.field3577); // L: 205
			this.method6317(); // L: 206
			this.method6133(); // L: 207
			return true; // L: 208
		} else {
			return false; // L: 210
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-91946430"
	)
	public void method6072() {
		this.field3564 = false; // L: 214
	} // L: 215

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-41"
	)
	public boolean method6254(int var1) {
		if (this.method6134(var1)) { // L: 218
			this.method6186(); // L: 219
			class393 var2 = this.field3566.method7276((char)var1, this.field3568, this.field3572); // L: 220
			this.method6080(var2.method7412(), var2.method7412()); // L: 221
			this.method6317(); // L: 222
			this.method6133(); // L: 223
		}

		return true; // L: 225
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1892200113"
	)
	public void method6273() {
		if (!this.method6186() && this.field3568 > 0) { // L: 229
			int var1 = this.field3566.method7281(this.field3568 - 1); // L: 230
			this.method6133(); // L: 231
			this.method6080(var1, var1); // L: 232
		}

	} // L: 234

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1621563977"
	)
	public void method6075() {
		if (!this.method6186() && this.field3568 < this.field3566.method7266()) { // L: 237
			int var1 = this.field3566.method7281(this.field3568); // L: 238
			this.method6133(); // L: 239
			this.method6080(var1, var1); // L: 240
		}

	} // L: 242

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1930066506"
	)
	public void method6076() {
		if (!this.method6186() && this.field3568 > 0) { // L: 245
			class473 var1 = this.method6126(this.field3568 - 1); // L: 246
			int var2 = this.field3566.method7282((Integer)var1.field4903, this.field3568); // L: 247
			this.method6133(); // L: 248
			this.method6080(var2, var2); // L: 249
		}

	} // L: 251

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1784378069"
	)
	public void method6248() {
		if (!this.method6186() && this.field3568 < this.field3566.method7266()) { // L: 254
			class473 var1 = this.method6126(this.field3568); // L: 255
			int var2 = this.field3566.method7282(this.field3568, (Integer)var1.field4904); // L: 256
			this.method6133(); // L: 257
			this.method6080(var2, var2); // L: 258
		}

	} // L: 260

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1362686979"
	)
	boolean method6186() {
		if (!this.method6123()) { // L: 263
			return false;
		} else {
			int var1 = this.field3566.method7282(this.field3579, this.field3568); // L: 264
			this.method6133(); // L: 265
			this.method6080(var1, var1); // L: 266
			return true; // L: 267
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1257491815"
	)
	public void method6079() {
		this.method6080(0, this.field3566.method7266()); // L: 271
	} // L: 272

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "58"
	)
	public boolean method6080(int var1, int var2) {
		if (!this.method6238()) { // L: 275
			this.field3579 = var1; // L: 276
			this.field3568 = var2; // L: 277
			return false; // L: 278
		} else {
			if (var1 > this.field3566.method7266()) { // L: 280
				var1 = this.field3566.method7266(); // L: 281
			}

			if (var2 > this.field3566.method7266()) { // L: 283
				var2 = this.field3566.method7266(); // L: 284
			}

			boolean var3 = this.field3579 != var1 || var2 != this.field3568; // L: 286
			this.field3579 = var1; // L: 287
			if (var2 != this.field3568) { // L: 288
				this.field3568 = var2; // L: 289
				this.field3563 = 0; // L: 290
				this.method6131(); // L: 291
			}

			if (var3 && this.field3552 != null) { // L: 293 294
				this.field3552.vmethod5986(); // L: 295
			}

			return var3; // L: 298
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "65535"
	)
	public void method6331(boolean var1) {
		class473 var2 = this.method6127(this.field3568); // L: 302
		this.method6129((Integer)var2.field4903, var1); // L: 303
	} // L: 304

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-115"
	)
	public void method6216(boolean var1) {
		class473 var2 = this.method6127(this.field3568); // L: 307
		this.method6129((Integer)var2.field4904, var1); // L: 308
	} // L: 309

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1186975323"
	)
	public void method6083(boolean var1) {
		this.method6129(0, var1); // L: 312
	} // L: 313

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1751235989"
	)
	public void method6084(boolean var1) {
		this.method6129(this.field3566.method7266(), var1); // L: 316
	} // L: 317

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-95"
	)
	public void method6266(boolean var1) {
		if (this.method6123() && !var1) { // L: 320
			this.method6129(Math.min(this.field3579, this.field3568), var1); // L: 321
		} else if (this.field3568 > 0) { // L: 323
			this.method6129(this.field3568 - 1, var1); // L: 324
		}

	} // L: 326

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-48"
	)
	public void method6294(boolean var1) {
		if (this.method6123() && !var1) { // L: 329
			this.method6129(Math.max(this.field3579, this.field3568), var1); // L: 330
		} else if (this.field3568 < this.field3566.method7266()) { // L: 332
			this.method6129(this.field3568 + 1, var1); // L: 333
		}

	} // L: 335

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "899685139"
	)
	public void method6087(boolean var1) {
		if (this.field3568 > 0) { // L: 338
			class473 var2 = this.method6126(this.field3568 - 1); // L: 339
			this.method6129((Integer)var2.field4903, var1); // L: 340
		}

	} // L: 342

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1949621946"
	)
	public void method6095(boolean var1) {
		if (this.field3568 < this.field3566.method7266()) { // L: 345
			class473 var2 = this.method6126(this.field3568 + 1); // L: 346
			this.method6129((Integer)var2.field4904, var1); // L: 347
		}

	} // L: 349

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	public void method6089(boolean var1) {
		if (this.field3568 > 0) { // L: 352
			this.method6129(this.field3566.method7289(this.field3568, -1), var1); // L: 353
		}

	} // L: 355

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "48"
	)
	public void method6246(boolean var1) {
		if (this.field3568 < this.field3566.method7266()) { // L: 358
			this.method6129(this.field3566.method7289(this.field3568, 1), var1); // L: 359
		}

	} // L: 361

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1183245304"
	)
	public void method6091(boolean var1) {
		if (this.field3568 > 0) { // L: 364
			int var2 = this.method6130(); // L: 365
			this.method6129(this.field3566.method7289(this.field3568, -var2), var1); // L: 366
		}

	} // L: 368

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1906419112"
	)
	public void method6092(boolean var1) {
		if (this.field3568 < this.field3566.method7266()) { // L: 371
			int var2 = this.method6130(); // L: 372
			this.method6129(this.field3566.method7289(this.field3568, var2), var1); // L: 373
		}

	} // L: 375

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1430584970"
	)
	public void method6093(boolean var1) {
		class396 var2 = this.field3566.method7275(0, this.field3568); // L: 378
		class473 var3 = var2.method7541(); // L: 379
		this.method6129(this.field3566.method7296((Integer)var3.field4903, this.field3577), var1); // L: 380
	} // L: 381

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "14452723"
	)
	public void method6241(boolean var1) {
		class396 var2 = this.field3566.method7275(0, this.field3568); // L: 384
		class473 var3 = var2.method7541(); // L: 385
		this.method6129(this.field3566.method7296((Integer)var3.field4903, this.field3575 + this.field3577), var1); // L: 386
	} // L: 387

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "537466825"
	)
	public void method6159(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false; // L: 390
		class473 var6;
		int var8;
		if (!this.field3564) { // L: 391
			var8 = 0; // L: 392
		} else {
			var1 += this.field3576; // L: 395
			var2 += this.field3577; // L: 396
			var6 = this.method6150(); // L: 397
			var8 = this.field3566.method7296(var1 - (Integer)var6.field4903, var2 - (Integer)var6.field4904); // L: 398
		}

		if (var3 && var4) { // L: 400
			this.field3574 = 1; // L: 401
			var6 = this.method6126(var8); // L: 402
			class473 var7 = this.method6126(this.field3554); // L: 403
			this.method6125(var7, var6); // L: 404
		} else if (var3) { // L: 406
			this.field3574 = 1; // L: 407
			var6 = this.method6126(var8); // L: 408
			this.method6080((Integer)var6.field4903, (Integer)var6.field4904); // L: 409
			this.field3554 = (Integer)var6.field4903; // L: 410
		} else if (var4) { // L: 412
			this.method6080(this.field3554, var8); // L: 413
		} else {
			if (this.field3571 > 0 && var8 == this.field3554) { // L: 416
				if (this.field3579 == this.field3568) { // L: 417
					this.field3574 = 1; // L: 418
					var6 = this.method6126(var8); // L: 419
					this.method6080((Integer)var6.field4903, (Integer)var6.field4904); // L: 420
				} else {
					this.field3574 = 2; // L: 423
					var6 = this.method6127(var8); // L: 424
					this.method6080((Integer)var6.field4903, (Integer)var6.field4904); // L: 425
				}
			} else {
				this.field3574 = 0; // L: 429
				this.method6080(var8, var8); // L: 430
				this.field3554 = var8; // L: 431
			}

			this.field3571 = 25; // L: 433
		}

	} // L: 435

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-279189279"
	)
	public void method6096(int var1, int var2) {
		if (this.field3564 && this.method6107()) { // L: 438
			var1 += this.field3576; // L: 439
			var2 += this.field3577; // L: 440
			class473 var3 = this.method6150(); // L: 441
			int var4 = this.field3566.method7296(var1 - (Integer)var3.field4903, var2 - (Integer)var3.field4904); // L: 442
			class473 var5;
			class473 var6;
			switch(this.field3574) { // L: 443
			case 0:
				this.method6080(this.field3579, var4); // L: 453
				break; // L: 454
			case 1:
				var5 = this.method6126(this.field3554); // L: 458
				var6 = this.method6126(var4); // L: 459
				this.method6125(var5, var6);
				break; // L: 460
			case 2:
				var5 = this.method6127(this.field3554); // L: 446
				var6 = this.method6127(var4); // L: 447
				this.method6125(var5, var6); // L: 448
			}
		}

	} // L: 465

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1117002090"
	)
	public void method6097(Clipboard var1) {
		class396 var2 = this.field3566.method7275(this.field3579, this.field3568); // L: 468
		if (!var2.method7531()) { // L: 469
			String var3 = var2.method7529(); // L: 470
			if (!var3.isEmpty()) { // L: 471
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null); // L: 472
			}
		}

	} // L: 475

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "50"
	)
	public void method6098(Clipboard var1) {
		if (this.method6123()) { // L: 478
			this.method6097(var1); // L: 479
			this.method6186(); // L: 480
		}

	} // L: 482

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "301106092"
	)
	public void method6184(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null); // L: 485
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) { // L: 486
			try {
				String var3 = this.method6124((String)var2.getTransferData(DataFlavor.stringFlavor)); // L: 488
				this.method6186(); // L: 489
				class393 var4 = this.field3566.method7277(var3, this.field3568, this.field3572); // L: 490
				this.method6080(var4.method7412(), var4.method7412()); // L: 491
				this.method6317(); // L: 492
				this.method6133(); // L: 493
			} catch (Exception var5) { // L: 495
			}
		}

	} // L: 497

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-72"
	)
	public void method6100() {
		this.field3577 = Math.max(0, this.field3577 - this.field3566.method7287()); // L: 500
	} // L: 501

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-125833639"
	)
	public void method6264() {
		int var1 = Math.max(0, this.field3566.method7288() - this.field3575); // L: 504
		this.field3577 = Math.min(var1, this.field3577 + this.field3566.method7287()); // L: 505
	} // L: 506

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lmo;B)V",
		garbageValue = "5"
	)
	public void method6271(class321 var1) {
		this.field3578 = var1; // L: 509
	} // L: 510

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lmo;I)V",
		garbageValue = "919903927"
	)
	public void method6103(class321 var1) {
		this.field3552 = var1; // L: 513
	} // L: 514

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)Lpk;",
		garbageValue = "58"
	)
	public class392 method6163() {
		return this.field3566; // L: 517
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Lpk;",
		garbageValue = "-2034054674"
	)
	public class392 method6105() {
		return this.field3560; // L: 521
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)Lpw;",
		garbageValue = "-55"
	)
	public class396 method6106() {
		return this.field3566.method7275(this.field3579, this.field3568); // L: 525
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-405027294"
	)
	public boolean method6107() {
		return this.field3567; // L: 529
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-246360184"
	)
	public boolean method6156() {
		return this.field3562; // L: 533
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1419094514"
	)
	public boolean method6109() {
		return this.method6107() && this.field3563 % 60 < 30; // L: 537
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	public int method6239() {
		return this.field3568; // L: 541
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1682671662"
	)
	public int method6232() {
		return this.field3579; // L: 545
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "115320322"
	)
	public boolean method6238() {
		return this.field3564; // L: 549
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "841625291"
	)
	public int method6157() {
		return this.field3576; // L: 553
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "19"
	)
	public int method6114() {
		return this.field3577; // L: 557
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method6115() {
		return this.field3566.method7290(); // L: 561
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-368943571"
	)
	public int method6170() {
		return this.field3566.method7299(); // L: 565
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-173585629"
	)
	public int method6117() {
		return this.field3573; // L: 569
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "133494003"
	)
	public int method6118() {
		return this.field3565; // L: 573
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-81"
	)
	public int method6229() {
		return this.field3566.method7305(); // L: 577
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-516900515"
	)
	public int method6305() {
		return this.field3569; // L: 581
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "374345971"
	)
	public int method6121() {
		return this.field3566.method7378(); // L: 585
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1962908634"
	)
	public boolean method6122() {
		return this.method6170() > 1; // L: 589
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1300653391"
	)
	boolean method6123() {
		return this.field3579 != this.field3568; // L: 593
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "37"
	)
	String method6124(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length()); // L: 597

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 598
			char var4 = var1.charAt(var3); // L: 599
			if (this.method6134(var4)) { // L: 600
				var2.append(var4); // L: 601
			}
		}

		return var2.toString(); // L: 604
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Lsf;Lsf;I)V",
		garbageValue = "-1064229642"
	)
	void method6125(class473 var1, class473 var2) {
		if ((Integer)var2.field4903 < (Integer)var1.field4903) { // L: 608
			this.method6080((Integer)var1.field4904, (Integer)var2.field4903); // L: 609
		} else {
			this.method6080((Integer)var1.field4903, (Integer)var2.field4904); // L: 612
		}

	} // L: 614

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II)Lsf;",
		garbageValue = "-324312765"
	)
	class473 method6126(int var1) {
		int var2 = this.field3566.method7266(); // L: 617
		int var3 = 0; // L: 618
		int var4 = var2; // L: 619

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 620
			if (this.method6132(this.field3566.method7262(var5 - 1).field4438)) { // L: 621
				var3 = var5; // L: 622
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 626
			if (this.method6132(this.field3566.method7262(var5).field4438)) { // L: 627
				var4 = var5; // L: 628
				break;
			}
		}

		return new class473(var3, var4); // L: 632
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsf;",
		garbageValue = "89"
	)
	class473 method6127(int var1) {
		int var2 = this.field3566.method7266(); // L: 636
		int var3 = 0; // L: 637
		int var4 = var2; // L: 638

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 639
			if (this.field3566.method7262(var5 - 1).field4438 == '\n') { // L: 640
				var3 = var5; // L: 641
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 645
			if (this.field3566.method7262(var5).field4438 == '\n') { // L: 646
				var4 = var5; // L: 647
				break;
			}
		}

		return new class473(var3, var4); // L: 651
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-5"
	)
	boolean method6317() {
		if (!this.method6238()) { // L: 655
			return false;
		} else {
			boolean var1 = false; // L: 656
			if (this.field3566.method7266() > this.field3573) { // L: 657
				this.field3566.method7282(this.field3573, this.field3566.method7266()); // L: 658
				var1 = true; // L: 659
			}

			int var2 = this.method6170(); // L: 661
			int var3;
			if (this.field3566.method7319() > var2) { // L: 662
				var3 = this.field3566.method7289(0, var2) - 1; // L: 663
				this.field3566.method7282(var3, this.field3566.method7266()); // L: 664
				var1 = true; // L: 665
			}

			if (var1) { // L: 667
				var3 = this.field3568; // L: 668
				int var4 = this.field3579; // L: 669
				int var5 = this.field3566.method7266(); // L: 670
				if (this.field3568 > var5) { // L: 671
					var3 = var5; // L: 672
				}

				if (this.field3579 > var5) { // L: 674
					var4 = var5; // L: 675
				}

				this.method6080(var4, var3); // L: 677
			}

			return var1; // L: 679
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1859543250"
	)
	void method6129(int var1, boolean var2) {
		if (var2) { // L: 683
			this.method6080(this.field3579, var1);
		} else {
			this.method6080(var1, var1); // L: 684
		}

	} // L: 685

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1409912129"
	)
	int method6130() {
		return this.field3575 / this.field3566.method7287(); // L: 688
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method6131() {
		class396 var1 = this.field3566.method7275(0, this.field3568); // L: 692
		class473 var2 = var1.method7541(); // L: 693
		int var3 = this.field3566.method7287(); // L: 694
		int var4 = (Integer)var2.field4903 - 10; // L: 695
		int var5 = var4 + 20; // L: 696
		int var6 = (Integer)var2.field4904 - 3; // L: 697
		int var7 = var6 + var3 + 6; // L: 698
		int var8 = this.field3576; // L: 699
		int var9 = var8 + this.field3570; // L: 700
		int var10 = this.field3577; // L: 701
		int var11 = var10 + this.field3575; // L: 702
		int var12 = this.field3576; // L: 703
		int var13 = this.field3577; // L: 704
		if (var4 < var8) { // L: 705
			var12 = var4; // L: 706
		} else if (var5 > var9) { // L: 708
			var12 = var5 - this.field3570; // L: 709
		}

		if (var6 < var10) { // L: 711
			var13 = var6; // L: 712
		} else if (var7 > var11) { // L: 714
			var13 = var7 - this.field3575; // L: 715
		}

		this.method6338(var12, var13); // L: 717
	} // L: 718

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-54"
	)
	boolean method6132(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9; // L: 721
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1795542626"
	)
	void method6133() {
		if (this.field3578 != null) { // L: 725
			this.field3578.vmethod5986(); // L: 726
		}

	} // L: 728

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-565978703"
	)
	boolean method6134(int var1) {
		switch(this.field3569) { // L: 731
		case 1:
			return class209.isAlphaNumeric((char)var1); // L: 746
		case 2:
			return class382.isCharAlphabetic((char)var1); // L: 742
		case 3:
			return class159.isDigit((char)var1); // L: 748
		case 4:
			char var2 = (char)var1; // L: 733
			if (class159.isDigit(var2)) { // L: 734
				return true; // L: 735
			} else {
				if (var2 != 'k' && var2 != 'K' && var2 != 'm' && var2 != 'M' && var2 != 'b' && var2 != 'B') { // L: 737
					return false; // L: 740
				}

				return true; // L: 738
			}
		default:
			return true; // L: 744
		}
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(B)Lsf;",
		garbageValue = "0"
	)
	class473 method6150() {
		int var1 = this.field3566.method7294(this.field3570); // L: 753
		int var2 = this.field3566.method7325(this.field3575); // L: 754
		return new class473(var1, var2); // L: 755
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1915884245"
	)
	static final boolean method6088() {
		return Client.isMenuOpen; // L: 9150
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "689278853"
	)
	static void method6341() {
		if (Client.oculusOrbState == 1) { // L: 12743
			Client.field602 = true; // L: 12744
		}

	} // L: 12746
}
