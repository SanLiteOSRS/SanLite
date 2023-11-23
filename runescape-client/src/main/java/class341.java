import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
public class class341 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	class406 field3620;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	class406 field3619;
	@ObfuscatedName("ai")
	boolean field3628;
	@ObfuscatedName("aw")
	boolean field3621;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 851630373
	)
	int field3618;
	@ObfuscatedName("an")
	boolean field3623;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1942411497
	)
	int field3624;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1687939343
	)
	int field3625;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1973395103
	)
	int field3626;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1057586769
	)
	int field3638;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 2069229323
	)
	int field3614;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -992449321
	)
	int field3615;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 256491843
	)
	int field3630;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1326953207
	)
	int field3631;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 461569489
	)
	int field3632;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 498690491
	)
	int field3633;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1961242281
	)
	int field3627;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -921124497
	)
	int field3635;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -609564537
	)
	int field3639;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	class334 field3637;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	class334 field3636;

	class341() {
		this.field3620 = new class406(); // L: 32
		this.field3619 = new class406(); // L: 33
		this.field3628 = false; // L: 34
		this.field3621 = true; // L: 35
		this.field3618 = 0; // L: 36
		this.field3623 = false; // L: 37
		this.field3624 = 0; // L: 38
		this.field3625 = 0; // L: 39
		this.field3626 = 0; // L: 40
		this.field3638 = 0; // L: 41
		this.field3614 = 0; // L: 42
		this.field3615 = 0; // L: 43
		this.field3630 = 0; // L: 44
		this.field3631 = Integer.MAX_VALUE; // L: 45
		this.field3632 = Integer.MAX_VALUE; // L: 46
		this.field3633 = 0; // L: 47
		this.field3627 = 0; // L: 48
		this.field3635 = 0; // L: 49
		this.field3639 = 0; // L: 50
		this.field3620.method7625(1); // L: 55
		this.field3619.method7625(1); // L: 56
	} // L: 57

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method6360() {
		this.field3618 = (this.field3618 + 1) % 60; // L: 60
		if (this.field3630 > 0) { // L: 61
			--this.field3630; // L: 62
		}

	} // L: 64

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1199149744"
	)
	public boolean method6361(boolean var1) {
		var1 = var1 && this.field3621; // L: 67
		boolean var2 = this.field3628 != var1; // L: 68
		this.field3628 = var1; // L: 69
		if (!this.field3628) { // L: 70
			this.method6385(this.field3638, this.field3638); // L: 71
		}

		return var2; // L: 73
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "18331512"
	)
	public void method6614(boolean var1) {
		this.field3621 = var1; // L: 77
		this.field3628 = var1 && this.field3628; // L: 78
	} // L: 79

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "1"
	)
	public boolean method6363(String var1) {
		String var2 = this.field3620.method7523(); // L: 82
		if (!var2.equals(var1)) { // L: 83
			var1 = this.method6429(var1); // L: 84
			this.field3620.method7535(var1); // L: 85
			this.method6385(this.field3614, this.field3638); // L: 86
			this.method6370(this.field3635, this.field3639); // L: 87
			this.method6451(); // L: 88
			this.method6574(); // L: 89
			return true; // L: 90
		} else {
			return false; // L: 92
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "-65"
	)
	boolean method6364(String var1) {
		this.field3619.method7535(var1); // L: 96
		return true; // L: 97
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lpa;B)Z",
		garbageValue = "116"
	)
	boolean method6431(AbstractFont var1) {
		boolean var2 = !this.field3623; // L: 101
		this.field3620.method7527(var1); // L: 102
		this.field3619.method7527(var1); // L: 103
		this.field3623 = true; // L: 104
		var2 |= this.method6370(this.field3635, this.field3639); // L: 105
		var2 |= this.method6385(this.field3614, this.field3638); // L: 106
		if (this.method6451()) { // L: 107
			this.method6574(); // L: 108
			var2 = true; // L: 109
		}

		return var2; // L: 111
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "101"
	)
	public boolean method6366(int var1, int var2) {
		boolean var3 = this.field3633 != var1 || var2 != this.field3627; // L: 115
		this.field3633 = var1; // L: 116
		this.field3627 = var2; // L: 117
		var3 |= this.method6370(this.field3635, this.field3639); // L: 118
		return var3; // L: 119
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-229674282"
	)
	public boolean method6367(int var1) {
		if (var1 < 0) { // L: 123
			var1 = Integer.MAX_VALUE; // L: 124
		}

		boolean var2 = var1 == this.field3620.method7546(); // L: 126
		this.field3620.method7524(var1); // L: 127
		this.field3619.method7524(var1); // L: 128
		if (this.method6451()) { // L: 129
			this.method6574(); // L: 130
			var2 = true; // L: 131
		}

		return var2; // L: 133
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "8"
	)
	public boolean method6553(int var1) {
		this.field3620.method7525(var1); // L: 137
		if (this.method6451()) { // L: 138
			this.method6574(); // L: 139
			return true; // L: 140
		} else {
			return false; // L: 142
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "117249639"
	)
	public boolean method6369(int var1) {
		this.field3632 = var1; // L: 146
		if (this.method6451()) { // L: 147
			this.method6574(); // L: 148
			return true; // L: 149
		} else {
			return false; // L: 151
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-285626466"
	)
	public boolean method6370(int var1, int var2) {
		if (!this.method6394()) { // L: 155
			this.field3635 = var1; // L: 156
			this.field3639 = var2; // L: 157
			return false; // L: 158
		} else {
			int var3 = this.field3635; // L: 160
			int var4 = this.field3639; // L: 161
			int var5 = Math.max(0, this.field3620.method7653() - this.field3633 + 2); // L: 162
			int var6 = Math.max(0, this.field3620.method7618() - this.field3627 + 1); // L: 163
			this.field3635 = Math.max(0, Math.min(var5, var1)); // L: 164
			this.field3639 = Math.max(0, Math.min(var6, var2)); // L: 165
			return var3 != this.field3635 || var4 != this.field3639; // L: 166
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "18"
	)
	public boolean method6371(int var1, int var2) {
		boolean var3 = true; // L: 170
		if (var1 < 0 || var1 > 2) { // L: 171
			var3 = false; // L: 172
		}

		if (var2 < 0 || var2 > 2) { // L: 174
			var3 = false; // L: 175
		}

		return var3 ? this.field3620.method7529(var1, var2) : false; // L: 177 178 180
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-56"
	)
	public void method6372(int var1) {
		this.field3620.method7530(var1); // L: 184
	} // L: 185

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-15"
	)
	public void method6373(int var1) {
		this.field3624 = var1; // L: 188
	} // L: 189

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "312320630"
	)
	public void method6413(int var1) {
		this.field3620.method7625(var1); // L: 192
	} // L: 193

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1049067680"
	)
	public void method6375(int var1) {
		this.field3620.method7526(var1); // L: 196
	} // L: 197

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1504264243"
	)
	public boolean method6376(int var1) {
		this.field3626 = var1; // L: 200
		String var2 = this.field3620.method7523(); // L: 201
		int var3 = var2.length(); // L: 202
		var2 = this.method6429(var2); // L: 203
		if (var2.length() != var3) { // L: 204
			this.field3620.method7535(var2); // L: 205
			this.method6370(this.field3635, this.field3639); // L: 206
			this.method6451(); // L: 207
			this.method6574(); // L: 208
			return true; // L: 209
		} else {
			return false; // L: 211
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "611320825"
	)
	public void method6386() {
		this.field3623 = false; // L: 215
	} // L: 216

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1918004716"
	)
	public boolean method6378(int var1) {
		if (this.method6439(var1)) { // L: 219
			this.method6461(); // L: 220
			class407 var2 = this.field3620.method7631((char)var1, this.field3638, this.field3631); // L: 221
			this.method6385(var2.method7655(), var2.method7655()); // L: 222
			this.method6451(); // L: 223
			this.method6574(); // L: 224
		}

		return true; // L: 226
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "125"
	)
	public void method6368() {
		if (!this.method6461() && this.field3638 > 0) { // L: 230
			int var1 = this.field3620.method7569(this.field3638 - 1); // L: 231
			this.method6574(); // L: 232
			this.method6385(var1, var1); // L: 233
		}

	} // L: 235

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1496895197"
	)
	public void method6380() {
		if (!this.method6461() && this.field3638 < this.field3620.method7522()) { // L: 238
			int var1 = this.field3620.method7569(this.field3638); // L: 239
			this.method6574(); // L: 240
			this.method6385(var1, var1); // L: 241
		}

	} // L: 243

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	public void method6428() {
		if (!this.method6461() && this.field3638 > 0) { // L: 246
			class497 var1 = this.method6478(this.field3638 - 1); // L: 247
			int var2 = this.field3620.method7538((Integer)var1.field4996, this.field3638); // L: 248
			this.method6574(); // L: 249
			this.method6385(var2, var2); // L: 250
		}

	} // L: 252

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "576864564"
	)
	public void method6382() {
		if (!this.method6461() && this.field3638 < this.field3620.method7522()) { // L: 255
			class497 var1 = this.method6478(this.field3638); // L: 256
			int var2 = this.field3620.method7538(this.field3638, (Integer)var1.field4997); // L: 257
			this.method6574(); // L: 258
			this.method6385(var2, var2); // L: 259
		}

	} // L: 261

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1514418987"
	)
	boolean method6461() {
		if (!this.method6362()) { // L: 264
			return false;
		} else {
			int var1 = this.field3620.method7538(this.field3614, this.field3638); // L: 265
			this.method6574(); // L: 266
			this.method6385(var1, var1); // L: 267
			return true; // L: 268
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "154519165"
	)
	public void method6434() {
		this.method6385(0, this.field3620.method7522()); // L: 272
	} // L: 273

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1917418195"
	)
	public boolean method6385(int var1, int var2) {
		if (!this.method6394()) { // L: 276
			this.field3614 = var1; // L: 277
			this.field3638 = var2; // L: 278
			return false; // L: 279
		} else {
			if (var1 > this.field3620.method7522()) { // L: 281
				var1 = this.field3620.method7522(); // L: 282
			}

			if (var2 > this.field3620.method7522()) { // L: 284
				var2 = this.field3620.method7522(); // L: 285
			}

			boolean var3 = this.field3614 != var1 || var2 != this.field3638; // L: 287
			this.field3614 = var1; // L: 288
			if (var2 != this.field3638) { // L: 289
				this.field3638 = var2; // L: 290
				this.field3618 = 0; // L: 291
				this.method6436(); // L: 292
			}

			if (var3 && this.field3636 != null) { // L: 294 295
				this.field3636.vmethod6278(); // L: 296
			}

			return var3; // L: 299
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "64"
	)
	public void method6440(boolean var1) {
		class497 var2 = this.method6459(this.field3638); // L: 303
		this.method6505((Integer)var2.field4996, var1); // L: 304
	} // L: 305

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-114"
	)
	public void method6387(boolean var1) {
		class497 var2 = this.method6459(this.field3638); // L: 308
		this.method6505((Integer)var2.field4997, var1); // L: 309
	} // L: 310

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "941946265"
	)
	public void method6565(boolean var1) {
		this.method6505(0, var1); // L: 313
	} // L: 314

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2021236230"
	)
	public void method6389(boolean var1) {
		this.method6505(this.field3620.method7522(), var1); // L: 317
	} // L: 318

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1171552759"
	)
	public void method6390(boolean var1) {
		if (this.method6362() && !var1) { // L: 321
			this.method6505(Math.min(this.field3614, this.field3638), var1); // L: 322
		} else if (this.field3638 > 0) { // L: 324
			this.method6505(this.field3638 - 1, var1); // L: 325
		}

	} // L: 327

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-81"
	)
	public void method6391(boolean var1) {
		if (this.method6362() && !var1) { // L: 330
			this.method6505(Math.max(this.field3614, this.field3638), var1); // L: 331
		} else if (this.field3638 < this.field3620.method7522()) { // L: 333
			this.method6505(this.field3638 + 1, var1); // L: 334
		}

	} // L: 336

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1880064758"
	)
	public void method6392(boolean var1) {
		if (this.field3638 > 0) { // L: 339
			class497 var2 = this.method6478(this.field3638 - 1); // L: 340
			this.method6505((Integer)var2.field4996, var1); // L: 341
		}

	} // L: 343

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-214351650"
	)
	public void method6393(boolean var1) {
		if (this.field3638 < this.field3620.method7522()) { // L: 346
			class497 var2 = this.method6478(this.field3638 + 1); // L: 347
			this.method6505((Integer)var2.field4997, var1); // L: 348
		}

	} // L: 350

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2098854575"
	)
	public void method6602(boolean var1) {
		if (this.field3638 > 0) { // L: 353
			this.method6505(this.field3620.method7540(this.field3638, -1), var1); // L: 354
		}

	} // L: 356

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "115"
	)
	public void method6395(boolean var1) {
		if (this.field3638 < this.field3620.method7522()) { // L: 359
			this.method6505(this.field3620.method7540(this.field3638, 1), var1); // L: 360
		}

	} // L: 362

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1022985895"
	)
	public void method6396(boolean var1) {
		if (this.field3638 > 0) { // L: 365
			int var2 = this.method6576(); // L: 366
			this.method6505(this.field3620.method7540(this.field3638, -var2), var1); // L: 367
		}

	} // L: 369

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-828148265"
	)
	public void method6397(boolean var1) {
		if (this.field3638 < this.field3620.method7522()) { // L: 372
			int var2 = this.method6576(); // L: 373
			this.method6505(this.field3620.method7540(this.field3638, var2), var1); // L: 374
		}

	} // L: 376

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-618248059"
	)
	public void method6596(boolean var1) {
		class410 var2 = this.field3620.method7531(0, this.field3638); // L: 379
		class497 var3 = var2.method7793(); // L: 380
		this.method6505(this.field3620.method7539((Integer)var3.field4996, this.field3639), var1); // L: 381
	} // L: 382

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-993585503"
	)
	public void method6506(boolean var1) {
		class410 var2 = this.field3620.method7531(0, this.field3638); // L: 385
		class497 var3 = var2.method7793(); // L: 386
		this.method6505(this.field3620.method7539((Integer)var3.field4996, this.field3627 + this.field3639), var1); // L: 387
	} // L: 388

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "470461038"
	)
	public void method6400(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false; // L: 391
		class497 var6;
		int var8;
		if (!this.field3623) { // L: 392
			var8 = 0; // L: 393
		} else {
			var1 += this.field3635; // L: 396
			var2 += this.field3639; // L: 397
			var6 = this.method6541(); // L: 398
			var8 = this.field3620.method7539(var1 - (Integer)var6.field4996, var2 - (Integer)var6.field4997); // L: 399
		}

		if (var3 && var4) { // L: 401
			this.field3625 = 1; // L: 402
			var6 = this.method6478(var8); // L: 403
			class497 var7 = this.method6478(this.field3615); // L: 404
			this.method6430(var7, var6); // L: 405
		} else if (var3) { // L: 407
			this.field3625 = 1; // L: 408
			var6 = this.method6478(var8); // L: 409
			this.method6385((Integer)var6.field4996, (Integer)var6.field4997); // L: 410
			this.field3615 = (Integer)var6.field4996; // L: 411
		} else if (var4) { // L: 413
			this.method6385(this.field3615, var8); // L: 414
		} else {
			if (this.field3630 > 0 && var8 == this.field3615) { // L: 417
				if (this.field3614 == this.field3638) { // L: 418
					this.field3625 = 1; // L: 419
					var6 = this.method6478(var8); // L: 420
					this.method6385((Integer)var6.field4996, (Integer)var6.field4997); // L: 421
				} else {
					this.field3625 = 2; // L: 424
					var6 = this.method6459(var8); // L: 425
					this.method6385((Integer)var6.field4996, (Integer)var6.field4997); // L: 426
				}
			} else {
				this.field3625 = 0; // L: 430
				this.method6385(var8, var8); // L: 431
				this.field3615 = var8; // L: 432
			}

			this.field3630 = 25; // L: 434
		}

	} // L: 436

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-292946076"
	)
	public void method6401(int var1, int var2) {
		if (this.field3623 && this.method6640()) { // L: 439
			var1 += this.field3635; // L: 440
			var2 += this.field3639; // L: 441
			class497 var3 = this.method6541(); // L: 442
			int var4 = this.field3620.method7539(var1 - (Integer)var3.field4996, var2 - (Integer)var3.field4997); // L: 443
			class497 var5;
			class497 var6;
			switch(this.field3625) { // L: 444
			case 0:
				this.method6385(this.field3614, var4); // L: 454
				break; // L: 455
			case 1:
				var5 = this.method6478(this.field3615); // L: 447
				var6 = this.method6478(var4); // L: 448
				this.method6430(var5, var6); // L: 449
				break;
			case 2:
				var5 = this.method6459(this.field3615); // L: 459
				var6 = this.method6459(var4); // L: 460
				this.method6430(var5, var6); // L: 461
			}
		}

	} // L: 466

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-307910360"
	)
	public void method6402(Clipboard var1) {
		class410 var2 = this.field3620.method7531(this.field3614, this.field3638); // L: 469
		if (!var2.method7777()) { // L: 470
			String var3 = var2.method7775(); // L: 471
			if (!var3.isEmpty()) { // L: 472
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null); // L: 473
			}
		}

	} // L: 476

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "2135903606"
	)
	public void method6403(Clipboard var1) {
		if (this.method6362()) { // L: 479
			this.method6402(var1); // L: 480
			this.method6461(); // L: 481
		}

	} // L: 483

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "1435827067"
	)
	public void method6546(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null); // L: 486
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) { // L: 487
			try {
				String var3 = this.method6429((String)var2.getTransferData(DataFlavor.stringFlavor)); // L: 489
				this.method6461(); // L: 490
				class407 var4 = this.field3620.method7533(var3, this.field3638, this.field3631); // L: 491
				this.method6385(var4.method7655(), var4.method7655()); // L: 492
				this.method6451(); // L: 493
				this.method6574(); // L: 494
			} catch (Exception var5) { // L: 496
			}
		}

	} // L: 498

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-288828294"
	)
	public void method6405() {
		this.field3639 = Math.max(0, this.field3639 - this.field3620.method7614()); // L: 501
	} // L: 502

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "34"
	)
	public void method6406() {
		int var1 = Math.max(0, this.field3620.method7618() - this.field3627); // L: 505
		this.field3639 = Math.min(var1, this.field3639 + this.field3620.method7614()); // L: 506
	} // L: 507

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lmc;I)V",
		garbageValue = "-1869847655"
	)
	public void method6407(class334 var1) {
		this.field3637 = var1; // L: 510
	} // L: 511

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lmc;I)V",
		garbageValue = "-1051047872"
	)
	public void method6441(class334 var1) {
		this.field3636 = var1; // L: 514
	} // L: 515

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Lpv;",
		garbageValue = "2075539041"
	)
	public class406 method6616() {
		return this.field3620; // L: 518
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Lpv;",
		garbageValue = "1030146297"
	)
	public class406 method6644() {
		return this.field3619; // L: 522
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)Lpd;",
		garbageValue = "126"
	)
	public class410 method6609() {
		return this.field3620.method7531(this.field3614, this.field3638); // L: 526
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2065405253"
	)
	public boolean method6640() {
		return this.field3628; // L: 530
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "32"
	)
	public boolean method6409() {
		return this.field3621; // L: 534
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	public boolean method6414() {
		return this.method6640() && this.field3618 % 60 < 30; // L: 538
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method6415() {
		return this.field3638; // L: 542
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-93"
	)
	public int method6416() {
		return this.field3614; // L: 546
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1339355429"
	)
	public boolean method6394() {
		return this.field3623; // L: 550
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-914270657"
	)
	public int method6418() {
		return this.field3635; // L: 554
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-59337247"
	)
	public int method6419() {
		return this.field3639; // L: 558
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "183448923"
	)
	public int method6420() {
		return this.field3620.method7546(); // L: 562
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1901590514"
	)
	public int method6628() {
		return this.field3620.method7547(); // L: 566
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "433958524"
	)
	public int method6630() {
		return this.field3632; // L: 570
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "27"
	)
	public int method6423() {
		return this.field3624; // L: 574
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1220088206"
	)
	public int method6424() {
		return this.field3620.method7548(); // L: 578
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	public int method6425() {
		return this.field3626; // L: 582
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1771864931"
	)
	public int method6550() {
		return this.field3620.method7549(); // L: 586
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "48"
	)
	public boolean method6426() {
		return this.method6628() > 1; // L: 590
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-760216869"
	)
	boolean method6362() {
		return this.field3638 != this.field3614; // L: 594
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-79"
	)
	String method6429(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length()); // L: 598

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 599
			char var4 = var1.charAt(var3); // L: 600
			if (this.method6439(var4)) { // L: 601
				var2.append(var4); // L: 602
			}
		}

		return var2.toString(); // L: 605
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Lti;Lti;I)V",
		garbageValue = "-1148711859"
	)
	void method6430(class497 var1, class497 var2) {
		if ((Integer)var2.field4996 < (Integer)var1.field4996) { // L: 609
			this.method6385((Integer)var1.field4997, (Integer)var2.field4996); // L: 610
		} else {
			this.method6385((Integer)var1.field4996, (Integer)var2.field4997); // L: 613
		}

	} // L: 615

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(II)Lti;",
		garbageValue = "377951962"
	)
	class497 method6478(int var1) {
		int var2 = this.field3620.method7522(); // L: 618
		int var3 = 0; // L: 619
		int var4 = var2; // L: 620

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 621
			if (this.method6437(this.field3620.method7552(var5 - 1).field4509)) { // L: 622
				var3 = var5; // L: 623
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 627
			if (this.method6437(this.field3620.method7552(var5).field4509)) { // L: 628
				var4 = var5; // L: 629
				break;
			}
		}

		return new class497(var3, var4); // L: 633
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)Lti;",
		garbageValue = "-1182045499"
	)
	class497 method6459(int var1) {
		int var2 = this.field3620.method7522(); // L: 637
		int var3 = 0; // L: 638
		int var4 = var2; // L: 639

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 640
			if (this.field3620.method7552(var5 - 1).field4509 == '\n') { // L: 641
				var3 = var5; // L: 642
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 646
			if (this.field3620.method7552(var5).field4509 == '\n') { // L: 647
				var4 = var5; // L: 648
				break;
			}
		}

		return new class497(var3, var4); // L: 652
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1603465990"
	)
	boolean method6451() {
		if (!this.method6394()) { // L: 656
			return false;
		} else {
			boolean var1 = false; // L: 657
			if (this.field3620.method7522() > this.field3632) { // L: 658
				this.field3620.method7538(this.field3632, this.field3620.method7522()); // L: 659
				var1 = true; // L: 660
			}

			int var2 = this.method6628(); // L: 662
			int var3;
			if (this.field3620.method7544() > var2) { // L: 663
				var3 = this.field3620.method7540(0, var2) - 1; // L: 664
				this.field3620.method7538(var3, this.field3620.method7522()); // L: 665
				var1 = true; // L: 666
			}

			if (var1) { // L: 668
				var3 = this.field3638; // L: 669
				int var4 = this.field3614; // L: 670
				int var5 = this.field3620.method7522(); // L: 671
				if (this.field3638 > var5) { // L: 672
					var3 = var5; // L: 673
				}

				if (this.field3614 > var5) { // L: 675
					var4 = var5; // L: 676
				}

				this.method6385(var4, var3); // L: 678
			}

			return var1; // L: 680
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "2086601547"
	)
	void method6505(int var1, boolean var2) {
		if (var2) { // L: 684
			this.method6385(this.field3614, var1);
		} else {
			this.method6385(var1, var1); // L: 685
		}

	} // L: 686

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	int method6576() {
		return this.field3627 / this.field3620.method7614(); // L: 689
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1786950999"
	)
	void method6436() {
		class410 var1 = this.field3620.method7531(0, this.field3638); // L: 693
		class497 var2 = var1.method7793(); // L: 694
		int var3 = this.field3620.method7614(); // L: 695
		int var4 = (Integer)var2.field4996 - 10; // L: 696
		int var5 = var4 + 20; // L: 697
		int var6 = (Integer)var2.field4997 - 3; // L: 698
		int var7 = var3 + var6 + 6; // L: 699
		int var8 = this.field3635; // L: 700
		int var9 = var8 + this.field3633; // L: 701
		int var10 = this.field3639; // L: 702
		int var11 = var10 + this.field3627; // L: 703
		int var12 = this.field3635; // L: 704
		int var13 = this.field3639; // L: 705
		if (var4 < var8) { // L: 706
			var12 = var4; // L: 707
		} else if (var5 > var9) { // L: 709
			var12 = var5 - this.field3633; // L: 710
		}

		if (var6 < var10) { // L: 712
			var13 = var6; // L: 713
		} else if (var7 > var11) { // L: 715
			var13 = var7 - this.field3627; // L: 716
		}

		this.method6370(var12, var13); // L: 718
	} // L: 719

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	boolean method6437(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9; // L: 722
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "336"
	)
	void method6574() {
		if (this.field3637 != null) { // L: 726
			this.field3637.vmethod6278(); // L: 727
		}

	} // L: 729

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1431244165"
	)
	boolean method6439(int var1) {
		switch(this.field3626) { // L: 732
		case 1:
			return class25.isAlphaNumeric((char)var1); // L: 747
		case 2:
			return class10.isCharAlphabetic((char)var1); // L: 749
		case 3:
			return Player.isDigit((char)var1); // L: 745
		case 4:
			char var2 = (char)var1; // L: 734
			if (Player.isDigit(var2)) { // L: 735
				return true; // L: 736
			} else {
				if (var2 != 'k' && var2 != 'K' && var2 != 'm' && var2 != 'M' && var2 != 'b' && var2 != 'B') { // L: 738
					return false; // L: 741
				}

				return true; // L: 739
			}
		default:
			return true; // L: 743
		}
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(I)Lti;",
		garbageValue = "-306061048"
	)
	class497 method6541() {
		int var1 = this.field3620.method7560(this.field3633); // L: 754
		int var2 = this.field3620.method7551(this.field3627); // L: 755
		return new class497(var1, var2); // L: 756
	}
}
