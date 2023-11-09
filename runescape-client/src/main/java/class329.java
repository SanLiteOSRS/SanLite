import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
public class class329 {
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	class394 field3603;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	class394 field3581;
	@ObfuscatedName("af")
	boolean field3582;
	@ObfuscatedName("ae")
	boolean field3583;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 658506775
	)
	int field3592;
	@ObfuscatedName("aq")
	boolean field3585;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1008460019
	)
	int field3590;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1021024219
	)
	int field3587;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2083729979
	)
	int field3575;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1099869583
	)
	int field3589;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 925849649
	)
	int field3597;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 506812211
	)
	int field3591;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -2102598651
	)
	int field3580;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1535083817
	)
	int field3593;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 529733689
	)
	int field3588;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1968284747
	)
	int field3595;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1988565337
	)
	int field3596;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 898641349
	)
	int field3599;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 263202089
	)
	int field3598;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	class323 field3584;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	class323 field3600;

	class329() {
		this.field3603 = new class394(); // L: 32
		this.field3581 = new class394(); // L: 33
		this.field3582 = false; // L: 34
		this.field3583 = true; // L: 35
		this.field3592 = 0; // L: 36
		this.field3585 = false; // L: 37
		this.field3590 = 0; // L: 38
		this.field3587 = 0; // L: 39
		this.field3575 = 0; // L: 40
		this.field3589 = 0; // L: 41
		this.field3597 = 0; // L: 42
		this.field3591 = 0; // L: 43
		this.field3580 = 0; // L: 44
		this.field3593 = Integer.MAX_VALUE; // L: 45
		this.field3588 = Integer.MAX_VALUE; // L: 46
		this.field3595 = 0; // L: 47
		this.field3596 = 0; // L: 48
		this.field3599 = 0; // L: 49
		this.field3598 = 0; // L: 50
		this.field3603.method7344(1); // L: 55
		this.field3581.method7344(1); // L: 56
	} // L: 57

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1423149245"
	)
	void method6161() {
		this.field3592 = (this.field3592 + 1) % 60; // L: 60
		if (this.field3580 > 0) { // L: 61
			--this.field3580; // L: 62
		}

	} // L: 64

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "1207379483"
	)
	public boolean method6386(boolean var1) {
		var1 = var1 && this.field3583; // L: 67
		boolean var2 = this.field3582 != var1; // L: 68
		this.field3582 = var1; // L: 69
		if (!this.field3582) { // L: 70
			this.method6186(this.field3589, this.field3589); // L: 71
		}

		return var2; // L: 73
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1580054105"
	)
	public void method6162(boolean var1) {
		this.field3583 = var1; // L: 77
		this.field3582 = var1 && this.field3582; // L: 78
	} // L: 79

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-2017202564"
	)
	boolean method6164(String var1) {
		String var2 = this.field3603.method7416(); // L: 82
		if (!var2.equals(var1)) { // L: 83
			var1 = this.method6230(var1); // L: 84
			this.field3603.method7369(var1); // L: 85
			this.method6430(this.field3599, this.field3598); // L: 86
			this.method6344(); // L: 87
			this.method6239(); // L: 88
			return true; // L: 89
		} else {
			return false; // L: 91
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "843487402"
	)
	boolean method6165(String var1) {
		this.field3581.method7369(var1); // L: 95
		return true; // L: 96
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpp;B)Z",
		garbageValue = "-42"
	)
	boolean method6393(AbstractFont var1) {
		boolean var2 = !this.field3585; // L: 100
		this.field3603.method7443(var1); // L: 101
		this.field3581.method7443(var1); // L: 102
		this.field3585 = true; // L: 103
		var2 |= this.method6430(this.field3599, this.field3598); // L: 104
		var2 |= this.method6186(this.field3597, this.field3589); // L: 105
		if (this.method6344()) { // L: 106
			this.method6239(); // L: 107
			var2 = true; // L: 108
		}

		return var2; // L: 110
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1374516626"
	)
	public boolean method6167(int var1, int var2) {
		boolean var3 = this.field3595 != var1 || var2 != this.field3596; // L: 114
		this.field3595 = var1; // L: 115
		this.field3596 = var2; // L: 116
		var3 |= this.method6430(this.field3599, this.field3598); // L: 117
		return var3; // L: 118
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-128"
	)
	public boolean method6214(int var1) {
		if (var1 < 0) { // L: 122
			var1 = Integer.MAX_VALUE; // L: 123
		}

		boolean var2 = var1 == this.field3603.method7423(); // L: 125
		this.field3603.method7438(var1); // L: 126
		this.field3581.method7438(var1); // L: 127
		if (this.method6344()) { // L: 128
			this.method6239(); // L: 129
			var2 = true; // L: 130
		}

		return var2; // L: 132
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1869536305"
	)
	public boolean method6169(int var1) {
		this.field3603.method7424(var1); // L: 136
		if (this.method6344()) { // L: 137
			this.method6239(); // L: 138
			return true; // L: 139
		} else {
			return false; // L: 141
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "51"
	)
	public boolean method6170(int var1) {
		this.field3588 = var1; // L: 145
		if (this.method6344()) { // L: 146
			this.method6239(); // L: 147
			return true; // L: 148
		} else {
			return false; // L: 150
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1249217352"
	)
	public boolean method6430(int var1, int var2) {
		if (!this.method6218()) { // L: 154
			this.field3599 = var1; // L: 155
			this.field3598 = var2; // L: 156
			return false; // L: 157
		} else {
			int var3 = this.field3599; // L: 159
			int var4 = this.field3598; // L: 160
			int var5 = Math.max(0, this.field3603.method7360() - this.field3595 + 2); // L: 161
			int var6 = Math.max(0, this.field3603.method7386() - this.field3596 + 1); // L: 162
			this.field3599 = Math.max(0, Math.min(var5, var1)); // L: 163
			this.field3598 = Math.max(0, Math.min(var6, var2)); // L: 164
			return var3 != this.field3599 || var4 != this.field3598; // L: 165
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1156067636"
	)
	public boolean method6172(int var1, int var2) {
		boolean var3 = true; // L: 169
		if (var1 < 0 || var1 > 2) { // L: 170
			var3 = false; // L: 171
		}

		if (var2 < 0 || var2 > 2) { // L: 173
			var3 = false; // L: 174
		}

		return var3 ? this.field3603.method7336(var1, var2) : false; // L: 176 177 179
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "104"
	)
	public void method6173(int var1) {
		this.field3603.method7349(var1); // L: 183
	} // L: 184

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "103"
	)
	public void method6174(int var1) {
		this.field3590 = var1; // L: 187
	} // L: 188

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1451470358"
	)
	public void method6175(int var1) {
		this.field3603.method7344(var1); // L: 191
	} // L: 192

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "103"
	)
	public void method6176(int var1) {
		this.field3603.method7448(var1); // L: 195
	} // L: 196

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-170741259"
	)
	public boolean method6243(int var1) {
		this.field3575 = var1; // L: 199
		String var2 = this.field3603.method7416(); // L: 200
		int var3 = var2.length(); // L: 201
		var2 = this.method6230(var2); // L: 202
		if (var2.length() != var3) { // L: 203
			this.field3603.method7369(var2); // L: 204
			this.method6430(this.field3599, this.field3598); // L: 205
			this.method6344(); // L: 206
			this.method6239(); // L: 207
			return true; // L: 208
		} else {
			return false; // L: 210
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-79"
	)
	public void method6178() {
		this.field3585 = false; // L: 214
	} // L: 215

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1322388974"
	)
	public boolean method6179(int var1) {
		if (this.method6240(var1)) { // L: 218
			this.method6217(); // L: 219
			class395 var2 = this.field3603.method7351((char)var1, this.field3589, this.field3593); // L: 220
			this.method6186(var2.method7465(), var2.method7465()); // L: 221
			this.method6344(); // L: 222
			this.method6239(); // L: 223
		}

		return true; // L: 225
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1099646124"
	)
	public void method6412() {
		if (!this.method6217() && this.field3589 > 0) { // L: 229
			int var1 = this.field3603.method7356(this.field3589 - 1); // L: 230
			this.method6239(); // L: 231
			this.method6186(var1, var1); // L: 232
		}

	} // L: 234

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-87"
	)
	public void method6181() {
		if (!this.method6217() && this.field3589 < this.field3603.method7341()) { // L: 237
			int var1 = this.field3603.method7356(this.field3589); // L: 238
			this.method6239(); // L: 239
			this.method6186(var1, var1); // L: 240
		}

	} // L: 242

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-59"
	)
	public void method6365() {
		if (!this.method6217() && this.field3589 > 0) { // L: 245
			class485 var1 = this.method6232(this.field3589 - 1); // L: 246
			int var2 = this.field3603.method7357((Integer)var1.field4964, this.field3589); // L: 247
			this.method6239(); // L: 248
			this.method6186(var2, var2); // L: 249
		}

	} // L: 251

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	public void method6183() {
		if (!this.method6217() && this.field3589 < this.field3603.method7341()) { // L: 254
			class485 var1 = this.method6232(this.field3589); // L: 255
			int var2 = this.field3603.method7357(this.field3589, (Integer)var1.field4962); // L: 256
			this.method6239(); // L: 257
			this.method6186(var2, var2); // L: 258
		}

	} // L: 260

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	boolean method6217() {
		if (!this.method6229()) { // L: 263
			return false;
		} else {
			int var1 = this.field3603.method7357(this.field3597, this.field3589); // L: 264
			this.method6239(); // L: 265
			this.method6186(var1, var1); // L: 266
			return true; // L: 267
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1962358939"
	)
	public void method6342() {
		this.method6186(0, this.field3603.method7341()); // L: 271
	} // L: 272

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-953050526"
	)
	public boolean method6186(int var1, int var2) {
		if (!this.method6218()) { // L: 275
			this.field3597 = var1; // L: 276
			this.field3589 = var2; // L: 277
			return false; // L: 278
		} else {
			if (var1 > this.field3603.method7341()) { // L: 280
				var1 = this.field3603.method7341(); // L: 281
			}

			if (var2 > this.field3603.method7341()) { // L: 283
				var2 = this.field3603.method7341(); // L: 284
			}

			boolean var3 = this.field3597 != var1 || var2 != this.field3589; // L: 286
			this.field3597 = var1; // L: 287
			if (var2 != this.field3589) { // L: 288
				this.field3589 = var2; // L: 289
				this.field3592 = 0; // L: 290
				this.method6414(); // L: 291
			}

			if (var3 && this.field3600 != null) { // L: 293 294
				this.field3600.vmethod6111(); // L: 295
			}

			return var3; // L: 298
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-37"
	)
	public void method6205(boolean var1) {
		class485 var2 = this.method6233(this.field3589); // L: 302
		this.method6235((Integer)var2.field4964, var1); // L: 303
	} // L: 304

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1983382171"
	)
	public void method6188(boolean var1) {
		class485 var2 = this.method6233(this.field3589); // L: 307
		this.method6235((Integer)var2.field4962, var1); // L: 308
	} // L: 309

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-36"
	)
	public void method6189(boolean var1) {
		this.method6235(0, var1); // L: 312
	} // L: 313

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "21"
	)
	public void method6420(boolean var1) {
		this.method6235(this.field3603.method7341(), var1); // L: 316
	} // L: 317

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1897615533"
	)
	public void method6191(boolean var1) {
		if (this.method6229() && !var1) { // L: 320
			this.method6235(Math.min(this.field3597, this.field3589), var1); // L: 321
		} else if (this.field3589 > 0) { // L: 323
			this.method6235(this.field3589 - 1, var1); // L: 324
		}

	} // L: 326

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "110"
	)
	public void method6185(boolean var1) {
		if (this.method6229() && !var1) { // L: 329
			this.method6235(Math.max(this.field3597, this.field3589), var1); // L: 330
		} else if (this.field3589 < this.field3603.method7341()) { // L: 332
			this.method6235(this.field3589 + 1, var1); // L: 333
		}

	} // L: 335

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1792394352"
	)
	public void method6358(boolean var1) {
		if (this.field3589 > 0) { // L: 338
			class485 var2 = this.method6232(this.field3589 - 1); // L: 339
			this.method6235((Integer)var2.field4964, var1); // L: 340
		}

	} // L: 342

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1211071147"
	)
	public void method6194(boolean var1) {
		if (this.field3589 < this.field3603.method7341()) { // L: 345
			class485 var2 = this.method6232(this.field3589 + 1); // L: 346
			this.method6235((Integer)var2.field4962, var1); // L: 347
		}

	} // L: 349

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2116762123"
	)
	public void method6195(boolean var1) {
		if (this.field3589 > 0) { // L: 352
			this.method6235(this.field3603.method7425(this.field3589, -1), var1); // L: 353
		}

	} // L: 355

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-90"
	)
	public void method6216(boolean var1) {
		if (this.field3589 < this.field3603.method7341()) { // L: 358
			this.method6235(this.field3603.method7425(this.field3589, 1), var1); // L: 359
		}

	} // L: 361

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	public void method6244(boolean var1) {
		if (this.field3589 > 0) { // L: 364
			int var2 = this.method6236(); // L: 365
			this.method6235(this.field3603.method7425(this.field3589, -var2), var1); // L: 366
		}

	} // L: 368

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-639255100"
	)
	public void method6198(boolean var1) {
		if (this.field3589 < this.field3603.method7341()) { // L: 371
			int var2 = this.method6236(); // L: 372
			this.method6235(this.field3603.method7425(this.field3589, var2), var1); // L: 373
		}

	} // L: 375

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2105742368"
	)
	public void method6199(boolean var1) {
		class398 var2 = this.field3603.method7350(0, this.field3589); // L: 378
		class485 var3 = var2.method7585(); // L: 379
		this.method6235(this.field3603.method7431((Integer)var3.field4964, this.field3598), var1); // L: 380
	} // L: 381

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	public void method6200(boolean var1) {
		class398 var2 = this.field3603.method7350(0, this.field3589); // L: 384
		class485 var3 = var2.method7585(); // L: 385
		this.method6235(this.field3603.method7431((Integer)var3.field4964, this.field3596 + this.field3598), var1); // L: 386
	} // L: 387

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-2061669367"
	)
	public void method6201(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false; // L: 390
		class485 var6;
		int var8;
		if (!this.field3585) { // L: 391
			var8 = 0; // L: 392
		} else {
			var1 += this.field3599; // L: 395
			var2 += this.field3598; // L: 396
			var6 = this.method6241(); // L: 397
			var8 = this.field3603.method7431(var1 - (Integer)var6.field4964, var2 - (Integer)var6.field4962); // L: 398
		}

		if (var3 && var4) { // L: 400
			this.field3587 = 1; // L: 401
			var6 = this.method6232(var8); // L: 402
			class485 var7 = this.method6232(this.field3591); // L: 403
			this.method6231(var7, var6); // L: 404
		} else if (var3) { // L: 406
			this.field3587 = 1; // L: 407
			var6 = this.method6232(var8); // L: 408
			this.method6186((Integer)var6.field4964, (Integer)var6.field4962); // L: 409
			this.field3591 = (Integer)var6.field4964; // L: 410
		} else if (var4) { // L: 412
			this.method6186(this.field3591, var8); // L: 413
		} else {
			if (this.field3580 > 0 && var8 == this.field3591) { // L: 416
				if (this.field3589 == this.field3597) { // L: 417
					this.field3587 = 1; // L: 418
					var6 = this.method6232(var8); // L: 419
					this.method6186((Integer)var6.field4964, (Integer)var6.field4962); // L: 420
				} else {
					this.field3587 = 2; // L: 423
					var6 = this.method6233(var8); // L: 424
					this.method6186((Integer)var6.field4964, (Integer)var6.field4962); // L: 425
				}
			} else {
				this.field3587 = 0; // L: 429
				this.method6186(var8, var8); // L: 430
				this.field3591 = var8; // L: 431
			}

			this.field3580 = 25; // L: 433
		}

	} // L: 435

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "118"
	)
	public void method6202(int var1, int var2) {
		if (this.field3585 && this.method6434()) { // L: 438
			var1 += this.field3599; // L: 439
			var2 += this.field3598; // L: 440
			class485 var3 = this.method6241(); // L: 441
			int var4 = this.field3603.method7431(var1 - (Integer)var3.field4964, var2 - (Integer)var3.field4962); // L: 442
			class485 var5;
			class485 var6;
			switch(this.field3587) { // L: 443
			case 0:
				this.method6186(this.field3597, var4); // L: 446
				break;
			case 1:
				var5 = this.method6232(this.field3591); // L: 451
				var6 = this.method6232(var4); // L: 452
				this.method6231(var5, var6); // L: 453
				break; // L: 454
			case 2:
				var5 = this.method6233(this.field3591); // L: 458
				var6 = this.method6233(var4); // L: 459
				this.method6231(var5, var6); // L: 460
			}
		}

	} // L: 465

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "1971399138"
	)
	public void method6209(Clipboard var1) {
		class398 var2 = this.field3603.method7350(this.field3597, this.field3589); // L: 468
		if (!var2.method7584()) { // L: 469
			String var3 = var2.method7580(); // L: 470
			if (!var3.isEmpty()) { // L: 471
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null); // L: 472
			}
		}

	} // L: 475

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1125565292"
	)
	public void method6204(Clipboard var1) {
		if (this.method6229()) { // L: 478
			this.method6209(var1); // L: 479
			this.method6217(); // L: 480
		}

	} // L: 482

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "1925602064"
	)
	public void method6260(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null); // L: 485
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) { // L: 486
			try {
				String var3 = this.method6230((String)var2.getTransferData(DataFlavor.stringFlavor)); // L: 488
				this.method6217(); // L: 489
				class395 var4 = this.field3603.method7352(var3, this.field3589, this.field3593); // L: 490
				this.method6186(var4.method7465(), var4.method7465()); // L: 491
				this.method6344(); // L: 492
				this.method6239(); // L: 493
			} catch (Exception var5) { // L: 495
			}
		}

	} // L: 497

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1892913152"
	)
	public void method6206() {
		this.field3598 = Math.max(0, this.field3598 - this.field3603.method7384()); // L: 500
	} // L: 501

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "580017028"
	)
	public void method6371() {
		int var1 = Math.max(0, this.field3603.method7386() - this.field3596); // L: 504
		this.field3598 = Math.min(var1, this.field3598 + this.field3603.method7384()); // L: 505
	} // L: 506

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lmr;I)V",
		garbageValue = "1288808403"
	)
	public void method6208(class323 var1) {
		this.field3584 = var1; // L: 509
	} // L: 510

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lmr;I)V",
		garbageValue = "1780189799"
	)
	public void method6190(class323 var1) {
		this.field3600 = var1; // L: 513
	} // L: 514

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Lpz;",
		garbageValue = "-750965880"
	)
	public class394 method6210() {
		return this.field3603; // L: 517
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)Lpz;",
		garbageValue = "110"
	)
	public class394 method6219() {
		return this.field3581; // L: 521
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)Lpt;",
		garbageValue = "-1422397369"
	)
	public class398 method6255() {
		return this.field3603.method7350(this.field3597, this.field3589); // L: 525
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1850356566"
	)
	public boolean method6434() {
		return this.field3582; // L: 529
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-7"
	)
	public boolean method6207() {
		return this.field3583; // L: 533
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1844504098"
	)
	public boolean method6215() {
		return this.method6434() && this.field3592 % 60 < 30; // L: 537
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "811682719"
	)
	public int method6177() {
		return this.field3589; // L: 541
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-451495754"
	)
	public int method6263() {
		return this.field3597; // L: 545
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-685712304"
	)
	public boolean method6218() {
		return this.field3585; // L: 549
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "317663555"
	)
	public int method6346() {
		return this.field3599; // L: 553
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-458260703"
	)
	public int method6220() {
		return this.field3598; // L: 557
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-107"
	)
	public int method6221() {
		return this.field3603.method7423(); // L: 561
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1983220199"
	)
	public int method6246() {
		return this.field3603.method7358(); // L: 565
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1238588412"
	)
	public int method6223() {
		return this.field3588; // L: 569
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1242294726"
	)
	public int method6385() {
		return this.field3590; // L: 573
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-26"
	)
	public int method6225() {
		return this.field3603.method7355(); // L: 577
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1910754886"
	)
	public int method6226() {
		return this.field3575; // L: 581
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-773185346"
	)
	public int method6227() {
		return this.field3603.method7368(); // L: 585
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "120"
	)
	public boolean method6228() {
		return this.method6246() > 1; // L: 589
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-10470"
	)
	boolean method6229() {
		return this.field3597 != this.field3589; // L: 593
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1489994659"
	)
	String method6230(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length()); // L: 597

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 598
			char var4 = var1.charAt(var3); // L: 599
			if (this.method6240(var4)) { // L: 600
				var2.append(var4); // L: 601
			}
		}

		return var2.toString(); // L: 604
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Lsh;Lsh;I)V",
		garbageValue = "2130890339"
	)
	void method6231(class485 var1, class485 var2) {
		if ((Integer)var2.field4964 < (Integer)var1.field4964) { // L: 608
			this.method6186((Integer)var1.field4962, (Integer)var2.field4964); // L: 609
		} else {
			this.method6186((Integer)var1.field4964, (Integer)var2.field4962); // L: 612
		}

	} // L: 614

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II)Lsh;",
		garbageValue = "733310951"
	)
	class485 method6232(int var1) {
		int var2 = this.field3603.method7341(); // L: 617
		int var3 = 0; // L: 618
		int var4 = var2; // L: 619

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 620
			if (this.method6224(this.field3603.method7337(var5 - 1).field4465)) { // L: 621
				var3 = var5; // L: 622
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 626
			if (this.method6224(this.field3603.method7337(var5).field4465)) { // L: 627
				var4 = var5; // L: 628
				break;
			}
		}

		return new class485(var3, var4); // L: 632
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(II)Lsh;",
		garbageValue = "1044777109"
	)
	class485 method6233(int var1) {
		int var2 = this.field3603.method7341(); // L: 636
		int var3 = 0; // L: 637
		int var4 = var2; // L: 638

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 639
			if (this.field3603.method7337(var5 - 1).field4465 == '\n') { // L: 640
				var3 = var5; // L: 641
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 645
			if (this.field3603.method7337(var5).field4465 == '\n') { // L: 646
				var4 = var5; // L: 647
				break;
			}
		}

		return new class485(var3, var4); // L: 651
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "31278"
	)
	boolean method6344() {
		if (!this.method6218()) { // L: 655
			return false;
		} else {
			boolean var1 = false; // L: 656
			if (this.field3603.method7341() > this.field3588) { // L: 657
				this.field3603.method7357(this.field3588, this.field3603.method7341()); // L: 658
				var1 = true; // L: 659
			}

			int var2 = this.method6246(); // L: 661
			int var3;
			if (this.field3603.method7363() > var2) { // L: 662
				var3 = this.field3603.method7425(0, var2) - 1; // L: 663
				this.field3603.method7357(var3, this.field3603.method7341()); // L: 664
				var1 = true; // L: 665
			}

			if (var1) { // L: 667
				var3 = this.field3589; // L: 668
				int var4 = this.field3597; // L: 669
				int var5 = this.field3603.method7341(); // L: 670
				if (this.field3589 > var5) { // L: 671
					var3 = var5; // L: 672
				}

				if (this.field3597 > var5) { // L: 674
					var4 = var5; // L: 675
				}

				this.method6186(var4, var3); // L: 677
			}

			return var1; // L: 679
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1161480698"
	)
	void method6235(int var1, boolean var2) {
		if (var2) { // L: 683
			this.method6186(this.field3597, var1);
		} else {
			this.method6186(var1, var1); // L: 684
		}

	} // L: 685

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2073297192"
	)
	int method6236() {
		return this.field3596 / this.field3603.method7384(); // L: 688
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "11"
	)
	void method6414() {
		class398 var1 = this.field3603.method7350(0, this.field3589); // L: 692
		class485 var2 = var1.method7585(); // L: 693
		int var3 = this.field3603.method7384(); // L: 694
		int var4 = (Integer)var2.field4964 - 10; // L: 695
		int var5 = var4 + 20; // L: 696
		int var6 = (Integer)var2.field4962 - 3; // L: 697
		int var7 = var3 + var6 + 6; // L: 698
		int var8 = this.field3599; // L: 699
		int var9 = var8 + this.field3595; // L: 700
		int var10 = this.field3598; // L: 701
		int var11 = var10 + this.field3596; // L: 702
		int var12 = this.field3599; // L: 703
		int var13 = this.field3598; // L: 704
		if (var4 < var8) { // L: 705
			var12 = var4; // L: 706
		} else if (var5 > var9) { // L: 708
			var12 = var5 - this.field3595; // L: 709
		}

		if (var6 < var10) { // L: 711
			var13 = var6; // L: 712
		} else if (var7 > var11) { // L: 714
			var13 = var7 - this.field3596; // L: 715
		}

		this.method6430(var12, var13); // L: 717
	} // L: 718

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2104007090"
	)
	boolean method6224(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9; // L: 721
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-38"
	)
	void method6239() {
		if (this.field3584 != null) { // L: 725
			this.field3584.vmethod6111(); // L: 726
		}

	} // L: 728

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1391092697"
	)
	boolean method6240(int var1) {
		switch(this.field3575) { // L: 731
		case 1:
			return GrandExchangeOfferTotalQuantityComparator.isAlphaNumeric((char)var1); // L: 737
		case 2:
			return SpotAnimationDefinition.isCharAlphabetic((char)var1); // L: 735
		case 3:
			return class412.isDigit((char)var1); // L: 733
		case 4:
			char var2 = (char)var1; // L: 739
			if (class412.isDigit(var2)) { // L: 740
				return true; // L: 741
			} else {
				if (var2 != 'k' && var2 != 'K' && var2 != 'm' && var2 != 'M' && var2 != 'b' && var2 != 'B') { // L: 743
					return false; // L: 746
				}

				return true; // L: 744
			}
		default:
			return true; // L: 748
		}
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)Lsh;",
		garbageValue = "-1946125191"
	)
	class485 method6241() {
		int var1 = this.field3603.method7421(this.field3595); // L: 753
		int var2 = this.field3603.method7370(this.field3596); // L: 754
		return new class485(var1, var2); // L: 755
	}
}
