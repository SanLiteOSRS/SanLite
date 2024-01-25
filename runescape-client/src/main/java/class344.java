import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
public class class344 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	class410 field3661;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	class410 field3662;
	@ObfuscatedName("as")
	boolean field3663;
	@ObfuscatedName("ab")
	boolean field3664;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -927562215
	)
	int field3654;
	@ObfuscatedName("ai")
	boolean field3677;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 723808703
	)
	int field3658;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -518060953
	)
	int field3668;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1660195199
	)
	int field3669;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1322171211
	)
	int field3670;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1422970877
	)
	int field3671;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1252841213
	)
	int field3672;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1189192165
	)
	int field3673;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -2088724375
	)
	int field3674;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1517047265
	)
	int field3675;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 281895221
	)
	int field3666;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 227423931
	)
	int field3678;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1170236757
	)
	int field3665;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1803766269
	)
	int field3667;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	class337 field3680;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	class337 field3681;

	class344() {
		this.field3661 = new class410(); // L: 32
		this.field3662 = new class410(); // L: 33
		this.field3663 = false; // L: 34
		this.field3664 = true; // L: 35
		this.field3654 = 0; // L: 36
		this.field3677 = false; // L: 37
		this.field3658 = 0; // L: 38
		this.field3668 = 0; // L: 39
		this.field3669 = 0; // L: 40
		this.field3670 = 0; // L: 41
		this.field3671 = 0; // L: 42
		this.field3672 = 0; // L: 43
		this.field3673 = 0; // L: 44
		this.field3674 = Integer.MAX_VALUE; // L: 45
		this.field3675 = Integer.MAX_VALUE; // L: 46
		this.field3666 = 0; // L: 47
		this.field3678 = 0; // L: 48
		this.field3665 = 0; // L: 49
		this.field3667 = 0; // L: 50
		this.field3661.method7674(1); // L: 55
		this.field3662.method7674(1); // L: 56
	} // L: 57

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-84965937"
	)
	void method6416() {
		this.field3654 = (this.field3654 + 1) % 60; // L: 60
		if (this.field3673 > 0) { // L: 61
			--this.field3673; // L: 62
		}

	} // L: 64

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "1739563427"
	)
	public boolean method6475(boolean var1) {
		var1 = var1 && this.field3664; // L: 67
		boolean var2 = this.field3663 != var1; // L: 68
		this.field3663 = var1; // L: 69
		if (!this.field3663) { // L: 70
			this.method6441(this.field3670, this.field3670); // L: 71
		}

		return var2; // L: 73
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "90"
	)
	public void method6418(boolean var1) {
		this.field3664 = var1; // L: 77
		this.field3663 = var1 && this.field3663; // L: 78
	} // L: 79

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "27"
	)
	public boolean method6639(String var1) {
		String var2 = this.field3661.method7608(); // L: 82
		if (!var2.equals(var1)) { // L: 83
			var1 = this.method6484(var1); // L: 84
			this.field3661.method7635(var1); // L: 85
			this.method6441(this.field3671, this.field3670); // L: 86
			this.method6426(this.field3665, this.field3667); // L: 87
			this.method6439(); // L: 88
			this.method6493(); // L: 89
			return true; // L: 90
		} else {
			return false; // L: 92
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "12"
	)
	boolean method6420(String var1) {
		this.field3662.method7635(var1); // L: 96
		return true; // L: 97
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lpw;I)Z",
		garbageValue = "-76054362"
	)
	boolean method6637(AbstractFont var1) {
		boolean var2 = !this.field3677; // L: 101
		this.field3661.method7610(var1); // L: 102
		this.field3662.method7610(var1); // L: 103
		this.field3677 = true; // L: 104
		var2 |= this.method6426(this.field3665, this.field3667); // L: 105
		var2 |= this.method6441(this.field3671, this.field3670); // L: 106
		if (this.method6439()) { // L: 107
			this.method6493(); // L: 108
			var2 = true; // L: 109
		}

		return var2; // L: 111
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-827732084"
	)
	public boolean method6422(int var1, int var2) {
		boolean var3 = this.field3666 != var1 || var2 != this.field3678; // L: 115
		this.field3666 = var1; // L: 116
		this.field3678 = var2; // L: 117
		var3 |= this.method6426(this.field3665, this.field3667); // L: 118
		return var3; // L: 119
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1199776693"
	)
	public boolean method6423(int var1) {
		if (var1 < 0) { // L: 123
			var1 = Integer.MAX_VALUE; // L: 124
		}

		boolean var2 = var1 == this.field3661.method7631(); // L: 126
		this.field3661.method7609(var1); // L: 127
		this.field3662.method7609(var1); // L: 128
		if (this.method6439()) { // L: 129
			this.method6493(); // L: 130
			var2 = true; // L: 131
		}

		return var2; // L: 133
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-923313975"
	)
	public boolean method6424(int var1) {
		this.field3661.method7606(var1); // L: 137
		if (this.method6439()) { // L: 138
			this.method6493(); // L: 139
			return true; // L: 140
		} else {
			return false; // L: 142
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2138901136"
	)
	public boolean method6425(int var1) {
		this.field3675 = var1; // L: 146
		if (this.method6439()) { // L: 147
			this.method6493(); // L: 148
			return true; // L: 149
		} else {
			return false; // L: 151
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2040478791"
	)
	public boolean method6426(int var1, int var2) {
		if (!this.method6472()) { // L: 155
			this.field3665 = var1; // L: 156
			this.field3667 = var2; // L: 157
			return false; // L: 158
		} else {
			int var3 = this.field3665; // L: 160
			int var4 = this.field3667; // L: 161
			int var5 = Math.max(0, this.field3661.method7626() - this.field3666 + 2); // L: 162
			int var6 = Math.max(0, this.field3661.method7725() - this.field3678 + 1); // L: 163
			this.field3665 = Math.max(0, Math.min(var5, var1)); // L: 164
			this.field3667 = Math.max(0, Math.min(var6, var2)); // L: 165
			return var3 != this.field3665 || var4 != this.field3667; // L: 166
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-677251205"
	)
	public boolean method6435(int var1, int var2) {
		boolean var3 = true; // L: 170
		if (var1 < 0 || var1 > 2) { // L: 171
			var3 = false; // L: 172
		}

		if (var2 < 0 || var2 > 2) { // L: 174
			var3 = false; // L: 175
		}

		return var3 ? this.field3661.method7634(var1, var2) : false; // L: 177 178 180
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-395216684"
	)
	public void method6428(int var1) {
		this.field3661.method7735(var1); // L: 184
	} // L: 185

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "126"
	)
	public void method6429(int var1) {
		this.field3658 = var1; // L: 188
	} // L: 189

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "84"
	)
	public void method6446(int var1) {
		this.field3661.method7674(var1); // L: 192
	} // L: 193

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1805115412"
	)
	public void method6431(int var1) {
		this.field3661.method7611(var1); // L: 196
	} // L: 197

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	public boolean method6432(int var1) {
		this.field3669 = var1; // L: 200
		String var2 = this.field3661.method7608(); // L: 201
		int var3 = var2.length(); // L: 202
		var2 = this.method6484(var2); // L: 203
		if (var2.length() != var3) { // L: 204
			this.field3661.method7635(var2); // L: 205
			this.method6426(this.field3665, this.field3667); // L: 206
			this.method6439(); // L: 207
			this.method6493(); // L: 208
			return true; // L: 209
		} else {
			return false; // L: 211
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1347183701"
	)
	public void method6433() {
		this.field3677 = false; // L: 215
	} // L: 216

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "-11903"
	)
	public boolean method6434(int var1) {
		if (this.method6494(var1)) { // L: 219
			this.method6631(); // L: 220
			class411 var2 = this.field3661.method7620((char)var1, this.field3670, this.field3674); // L: 221
			this.method6441(var2.method7743(), var2.method7743()); // L: 222
			this.method6439(); // L: 223
			this.method6493(); // L: 224
		}

		return true; // L: 226
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "28884836"
	)
	public void method6545() {
		if (!this.method6631() && this.field3670 > 0) { // L: 230
			int var1 = this.field3661.method7622(this.field3670 - 1); // L: 231
			this.method6493(); // L: 232
			this.method6441(var1, var1); // L: 233
		}

	} // L: 235

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "64"
	)
	public void method6662() {
		if (!this.method6631() && this.field3670 < this.field3661.method7701()) { // L: 238
			int var1 = this.field3661.method7622(this.field3670); // L: 239
			this.method6493(); // L: 240
			this.method6441(var1, var1); // L: 241
		}

	} // L: 243

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1048565678"
	)
	public void method6618() {
		if (!this.method6631() && this.field3670 > 0) { // L: 246
			class501 var1 = this.method6539(this.field3670 - 1); // L: 247
			int var2 = this.field3661.method7646((Integer)var1.field5041, this.field3670); // L: 248
			this.method6493(); // L: 249
			this.method6441(var2, var2); // L: 250
		}

	} // L: 252

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	public void method6438() {
		if (!this.method6631() && this.field3670 < this.field3661.method7701()) { // L: 255
			class501 var1 = this.method6539(this.field3670); // L: 256
			int var2 = this.field3661.method7646(this.field3670, (Integer)var1.field5042); // L: 257
			this.method6493(); // L: 258
			this.method6441(var2, var2); // L: 259
		}

	} // L: 261

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1878211035"
	)
	boolean method6631() {
		if (!this.method6483()) { // L: 264
			return false;
		} else {
			int var1 = this.field3661.method7646(this.field3671, this.field3670); // L: 265
			this.method6493(); // L: 266
			this.method6441(var1, var1); // L: 267
			return true; // L: 268
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1073491575"
	)
	public void method6440() {
		this.method6441(0, this.field3661.method7701()); // L: 272
	} // L: 273

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "600882972"
	)
	public boolean method6441(int var1, int var2) {
		if (!this.method6472()) { // L: 276
			this.field3671 = var1; // L: 277
			this.field3670 = var2; // L: 278
			return false; // L: 279
		} else {
			if (var1 > this.field3661.method7701()) { // L: 281
				var1 = this.field3661.method7701(); // L: 282
			}

			if (var2 > this.field3661.method7701()) { // L: 284
				var2 = this.field3661.method7701(); // L: 285
			}

			boolean var3 = this.field3671 != var1 || var2 != this.field3670; // L: 287
			this.field3671 = var1; // L: 288
			if (var2 != this.field3670) { // L: 289
				this.field3670 = var2; // L: 290
				this.field3654 = 0; // L: 291
				this.method6491(); // L: 292
			}

			if (var3 && this.field3681 != null) { // L: 294 295
				this.field3681.vmethod6342(); // L: 296
			}

			return var3; // L: 299
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "19"
	)
	public void method6682(boolean var1) {
		class501 var2 = this.method6487(this.field3670); // L: 303
		this.method6489((Integer)var2.field5041, var1); // L: 304
	} // L: 305

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-832245630"
	)
	public void method6443(boolean var1) {
		class501 var2 = this.method6487(this.field3670); // L: 308
		this.method6489((Integer)var2.field5042, var1); // L: 309
	} // L: 310

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-75"
	)
	public void method6444(boolean var1) {
		this.method6489(0, var1); // L: 313
	} // L: 314

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1523194643"
	)
	public void method6523(boolean var1) {
		this.method6489(this.field3661.method7701(), var1); // L: 317
	} // L: 318

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1810464131"
	)
	public void method6653(boolean var1) {
		if (this.method6483() && !var1) { // L: 321
			this.method6489(Math.min(this.field3671, this.field3670), var1); // L: 322
		} else if (this.field3670 > 0) { // L: 324
			this.method6489(this.field3670 - 1, var1); // L: 325
		}

	} // L: 327

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-951550480"
	)
	public void method6447(boolean var1) {
		if (this.method6483() && !var1) { // L: 330
			this.method6489(Math.max(this.field3671, this.field3670), var1); // L: 331
		} else if (this.field3670 < this.field3661.method7701()) { // L: 333
			this.method6489(this.field3670 + 1, var1); // L: 334
		}

	} // L: 336

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "81"
	)
	public void method6615(boolean var1) {
		if (this.field3670 > 0) { // L: 339
			class501 var2 = this.method6539(this.field3670 - 1); // L: 340
			this.method6489((Integer)var2.field5041, var1); // L: 341
		}

	} // L: 343

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	public void method6575(boolean var1) {
		if (this.field3670 < this.field3661.method7701()) { // L: 346
			class501 var2 = this.method6539(this.field3670 + 1); // L: 347
			this.method6489((Integer)var2.field5042, var1); // L: 348
		}

	} // L: 350

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-403282535"
	)
	public void method6450(boolean var1) {
		if (this.field3670 > 0) { // L: 353
			this.method6489(this.field3661.method7734(this.field3670, -1), var1); // L: 354
		}

	} // L: 356

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "40"
	)
	public void method6451(boolean var1) {
		if (this.field3670 < this.field3661.method7701()) { // L: 359
			this.method6489(this.field3661.method7734(this.field3670, 1), var1); // L: 360
		}

	} // L: 362

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2087852013"
	)
	public void method6526(boolean var1) {
		if (this.field3670 > 0) { // L: 365
			int var2 = this.method6563(); // L: 366
			this.method6489(this.field3661.method7734(this.field3670, -var2), var1); // L: 367
		}

	} // L: 369

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-218253011"
	)
	public void method6599(boolean var1) {
		if (this.field3670 < this.field3661.method7701()) { // L: 372
			int var2 = this.method6563(); // L: 373
			this.method6489(this.field3661.method7734(this.field3670, var2), var1); // L: 374
		}

	} // L: 376

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1904095126"
	)
	public void method6454(boolean var1) {
		class414 var2 = this.field3661.method7616(0, this.field3670); // L: 379
		class501 var3 = var2.method7886(); // L: 380
		this.method6489(this.field3661.method7624((Integer)var3.field5041, this.field3667), var1); // L: 381
	} // L: 382

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "716006051"
	)
	public void method6455(boolean var1) {
		class414 var2 = this.field3661.method7616(0, this.field3670); // L: 385
		class501 var3 = var2.method7886(); // L: 386
		this.method6489(this.field3661.method7624((Integer)var3.field5041, this.field3667 + this.field3678), var1); // L: 387
	} // L: 388

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IIZZB)V",
		garbageValue = "1"
	)
	public void method6465(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false; // L: 391
		class501 var6;
		int var8;
		if (!this.field3677) { // L: 392
			var8 = 0; // L: 393
		} else {
			var1 += this.field3665; // L: 396
			var2 += this.field3667; // L: 397
			var6 = this.method6495(); // L: 398
			var8 = this.field3661.method7624(var1 - (Integer)var6.field5041, var2 - (Integer)var6.field5042); // L: 399
		}

		if (var3 && var4) { // L: 401
			this.field3668 = 1; // L: 402
			var6 = this.method6539(var8); // L: 403
			class501 var7 = this.method6539(this.field3672); // L: 404
			this.method6485(var7, var6); // L: 405
		} else if (var3) { // L: 407
			this.field3668 = 1; // L: 408
			var6 = this.method6539(var8); // L: 409
			this.method6441((Integer)var6.field5041, (Integer)var6.field5042); // L: 410
			this.field3672 = (Integer)var6.field5041; // L: 411
		} else if (var4) { // L: 413
			this.method6441(this.field3672, var8); // L: 414
		} else {
			if (this.field3673 > 0 && var8 == this.field3672) { // L: 417
				if (this.field3671 == this.field3670) { // L: 418
					this.field3668 = 1; // L: 419
					var6 = this.method6539(var8); // L: 420
					this.method6441((Integer)var6.field5041, (Integer)var6.field5042); // L: 421
				} else {
					this.field3668 = 2; // L: 424
					var6 = this.method6487(var8); // L: 425
					this.method6441((Integer)var6.field5041, (Integer)var6.field5042); // L: 426
				}
			} else {
				this.field3668 = 0; // L: 430
				this.method6441(var8, var8); // L: 431
				this.field3672 = var8; // L: 432
			}

			this.field3673 = 25; // L: 434
		}

	} // L: 436

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1238890691"
	)
	public void method6518(int var1, int var2) {
		if (this.field3677 && this.method6468()) { // L: 439
			var1 += this.field3665; // L: 440
			var2 += this.field3667; // L: 441
			class501 var3 = this.method6495(); // L: 442
			int var4 = this.field3661.method7624(var1 - (Integer)var3.field5041, var2 - (Integer)var3.field5042); // L: 443
			class501 var5;
			class501 var6;
			switch(this.field3668) { // L: 444
			case 0:
				this.method6441(this.field3671, var4); // L: 447
				break;
			case 1:
				var5 = this.method6539(this.field3672); // L: 459
				var6 = this.method6539(var4); // L: 460
				this.method6485(var5, var6); // L: 461
				break; // L: 462
			case 2:
				var5 = this.method6487(this.field3672); // L: 452
				var6 = this.method6487(var4); // L: 453
				this.method6485(var5, var6); // L: 454
			}
		}

	} // L: 466

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-2007795370"
	)
	public void method6458(Clipboard var1) {
		class414 var2 = this.field3661.method7616(this.field3671, this.field3670); // L: 469
		if (!var2.method7882()) { // L: 470
			String var3 = var2.method7883(); // L: 471
			if (!var3.isEmpty()) { // L: 472
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null); // L: 473
			}
		}

	} // L: 476

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "6"
	)
	public void method6459(Clipboard var1) {
		if (this.method6483()) { // L: 479
			this.method6458(var1); // L: 480
			this.method6631(); // L: 481
		}

	} // L: 483

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-448030902"
	)
	public void method6460(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null); // L: 486
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) { // L: 487
			try {
				String var3 = this.method6484((String)var2.getTransferData(DataFlavor.stringFlavor)); // L: 489
				this.method6631(); // L: 490
				class411 var4 = this.field3661.method7618(var3, this.field3670, this.field3674); // L: 491
				this.method6441(var4.method7743(), var4.method7743()); // L: 492
				this.method6439(); // L: 493
				this.method6493(); // L: 494
			} catch (Exception var5) { // L: 496
			}
		}

	} // L: 498

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-536063803"
	)
	public void method6558() {
		this.field3667 = Math.max(0, this.field3667 - this.field3661.method7628()); // L: 501
	} // L: 502

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1640514736"
	)
	public void method6544() {
		int var1 = Math.max(0, this.field3661.method7725() - this.field3678); // L: 505
		this.field3667 = Math.min(var1, this.field3667 + this.field3661.method7628()); // L: 506
	} // L: 507

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lmn;I)V",
		garbageValue = "-649011962"
	)
	public void method6463(class337 var1) {
		this.field3680 = var1; // L: 510
	} // L: 511

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lmn;I)V",
		garbageValue = "1906988469"
	)
	public void method6464(class337 var1) {
		this.field3681 = var1; // L: 514
	} // L: 515

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Lpx;",
		garbageValue = "-1481638233"
	)
	public class410 method6442() {
		return this.field3661; // L: 518
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Lpx;",
		garbageValue = "-1712409033"
	)
	public class410 method6564() {
		return this.field3662; // L: 522
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)Lpo;",
		garbageValue = "41"
	)
	public class414 method6467() {
		return this.field3661.method7616(this.field3671, this.field3670); // L: 526
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public boolean method6468() {
		return this.field3663; // L: 530
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "86"
	)
	public boolean method6672() {
		return this.field3664; // L: 534
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "34"
	)
	public boolean method6548() {
		return this.method6468() && this.field3654 % 60 < 30; // L: 538
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2094283485"
	)
	public int method6471() {
		return this.field3670; // L: 542
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "68"
	)
	public int method6531() {
		return this.field3671; // L: 546
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "701930769"
	)
	public boolean method6472() {
		return this.field3677; // L: 550
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-19"
	)
	public int method6504() {
		return this.field3665; // L: 554
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1416952932"
	)
	public int method6474() {
		return this.field3667; // L: 558
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "84"
	)
	public int method6452() {
		return this.field3661.method7631(); // L: 562
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1054433888"
	)
	public int method6476() {
		return this.field3661.method7632(); // L: 566
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-778621174"
	)
	public int method6477() {
		return this.field3675; // L: 570
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-17"
	)
	public int method6663() {
		return this.field3658; // L: 574
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-65"
	)
	public int method6479() {
		return this.field3661.method7633(); // L: 578
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-33"
	)
	public int method6480() {
		return this.field3669; // L: 582
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "4"
	)
	public int method6593() {
		return this.field3661.method7699(); // L: 586
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1835257177"
	)
	public boolean method6482() {
		return this.method6476() > 1; // L: 590
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1601411461"
	)
	boolean method6483() {
		return this.field3670 != this.field3671; // L: 594
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "122"
	)
	String method6484(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length()); // L: 598

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 599
			char var4 = var1.charAt(var3); // L: 600
			if (this.method6494(var4)) { // L: 601
				var2.append(var4); // L: 602
			}
		}

		return var2.toString(); // L: 605
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Ltg;Ltg;I)V",
		garbageValue = "-688476977"
	)
	void method6485(class501 var1, class501 var2) {
		if ((Integer)var2.field5041 < (Integer)var1.field5041) { // L: 609
			this.method6441((Integer)var1.field5042, (Integer)var2.field5041); // L: 610
		} else {
			this.method6441((Integer)var1.field5041, (Integer)var2.field5042); // L: 613
		}

	} // L: 615

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(II)Ltg;",
		garbageValue = "1290124594"
	)
	class501 method6539(int var1) {
		int var2 = this.field3661.method7701(); // L: 618
		int var3 = 0; // L: 619
		int var4 = var2; // L: 620

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 621
			if (this.method6492(this.field3661.method7603(var5 - 1).field4545)) { // L: 622
				var3 = var5; // L: 623
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 627
			if (this.method6492(this.field3661.method7603(var5).field4545)) { // L: 628
				var4 = var5; // L: 629
				break;
			}
		}

		return new class501(var3, var4); // L: 633
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltg;",
		garbageValue = "100"
	)
	class501 method6487(int var1) {
		int var2 = this.field3661.method7701(); // L: 637
		int var3 = 0; // L: 638
		int var4 = var2; // L: 639

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 640
			if (this.field3661.method7603(var5 - 1).field4545 == '\n') { // L: 641
				var3 = var5; // L: 642
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 646
			if (this.field3661.method7603(var5).field4545 == '\n') { // L: 647
				var4 = var5; // L: 648
				break;
			}
		}

		return new class501(var3, var4); // L: 652
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2047199645"
	)
	boolean method6439() {
		if (!this.method6472()) { // L: 656
			return false;
		} else {
			boolean var1 = false; // L: 657
			if (this.field3661.method7701() > this.field3675) { // L: 658
				this.field3661.method7646(this.field3675, this.field3661.method7701()); // L: 659
				var1 = true; // L: 660
			}

			int var2 = this.method6476(); // L: 662
			int var3;
			if (this.field3661.method7629() > var2) { // L: 663
				var3 = this.field3661.method7734(0, var2) - 1; // L: 664
				this.field3661.method7646(var3, this.field3661.method7701()); // L: 665
				var1 = true; // L: 666
			}

			if (var1) { // L: 668
				var3 = this.field3670; // L: 669
				int var4 = this.field3671; // L: 670
				int var5 = this.field3661.method7701(); // L: 671
				if (this.field3670 > var5) { // L: 672
					var3 = var5; // L: 673
				}

				if (this.field3671 > var5) { // L: 675
					var4 = var5; // L: 676
				}

				this.method6441(var4, var3); // L: 678
			}

			return var1; // L: 680
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "59"
	)
	void method6489(int var1, boolean var2) {
		if (var2) { // L: 684
			this.method6441(this.field3671, var1);
		} else {
			this.method6441(var1, var1); // L: 685
		}

	} // L: 686

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-111535006"
	)
	int method6563() {
		return this.field3678 / this.field3661.method7628(); // L: 689
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1588298523"
	)
	void method6491() {
		class414 var1 = this.field3661.method7616(0, this.field3670); // L: 693
		class501 var2 = var1.method7886(); // L: 694
		int var3 = this.field3661.method7628(); // L: 695
		int var4 = (Integer)var2.field5041 - 10; // L: 696
		int var5 = var4 + 20; // L: 697
		int var6 = (Integer)var2.field5042 - 3; // L: 698
		int var7 = var6 + var3 + 6; // L: 699
		int var8 = this.field3665; // L: 700
		int var9 = var8 + this.field3666; // L: 701
		int var10 = this.field3667; // L: 702
		int var11 = var10 + this.field3678; // L: 703
		int var12 = this.field3665; // L: 704
		int var13 = this.field3667; // L: 705
		if (var4 < var8) { // L: 706
			var12 = var4; // L: 707
		} else if (var5 > var9) { // L: 709
			var12 = var5 - this.field3666; // L: 710
		}

		if (var6 < var10) { // L: 712
			var13 = var6; // L: 713
		} else if (var7 > var11) { // L: 715
			var13 = var7 - this.field3678; // L: 716
		}

		this.method6426(var12, var13); // L: 718
	} // L: 719

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-90"
	)
	boolean method6492(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9; // L: 722
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	void method6493() {
		if (this.field3680 != null) { // L: 726
			this.field3680.vmethod6342(); // L: 727
		}

	} // L: 729

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-985592109"
	)
	boolean method6494(int var1) {
		switch(this.field3669) { // L: 732
		case 1:
			return WorldMapIcon_0.isAlphaNumeric((char)var1); // L: 749
		case 2:
			return PlayerType.isCharAlphabetic((char)var1); // L: 745
		case 3:
			return ScriptFrame.isDigit((char)var1); // L: 747
		case 4:
			char var2 = (char)var1; // L: 736
			if (ScriptFrame.isDigit(var2)) { // L: 737
				return true; // L: 738
			} else {
				if (var2 != 'k' && var2 != 'K' && var2 != 'm' && var2 != 'M' && var2 != 'b' && var2 != 'B') { // L: 740
					return false; // L: 743
				}

				return true; // L: 741
			}
		default:
			return true; // L: 734
		}
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)Ltg;",
		garbageValue = "-1550125844"
	)
	class501 method6495() {
		int var1 = this.field3661.method7623(this.field3666); // L: 754
		int var2 = this.field3661.method7636(this.field3678); // L: 755
		return new class501(var1, var2); // L: 756
	}
}
