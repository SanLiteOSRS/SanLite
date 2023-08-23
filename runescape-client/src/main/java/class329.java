import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
public class class329 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	class394 field3599;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	class394 field3588;
	@ObfuscatedName("ah")
	boolean field3612;
	@ObfuscatedName("as")
	boolean field3600;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -431478779
	)
	int field3597;
	@ObfuscatedName("aj")
	boolean field3602;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -351339173
	)
	int field3603;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 204432917
	)
	int field3617;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1633191951
	)
	int field3605;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -972960841
	)
	int field3607;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -961539401
	)
	int field3606;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1144432645
	)
	int field3608;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1912313197
	)
	int field3609;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -363578579
	)
	int field3598;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -878896123
	)
	int field3615;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1556928317
	)
	int field3604;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1288731127
	)
	int field3613;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 687942875
	)
	int field3614;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1187411399
	)
	int field3601;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	class323 field3616;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	class323 field3611;

	class329() {
		this.field3599 = new class394(); // L: 32
		this.field3588 = new class394(); // L: 33
		this.field3612 = false; // L: 34
		this.field3600 = true; // L: 35
		this.field3597 = 0; // L: 36
		this.field3602 = false; // L: 37
		this.field3603 = 0; // L: 38
		this.field3617 = 0; // L: 39
		this.field3605 = 0; // L: 40
		this.field3607 = 0; // L: 41
		this.field3606 = 0; // L: 42
		this.field3608 = 0; // L: 43
		this.field3609 = 0; // L: 44
		this.field3598 = Integer.MAX_VALUE; // L: 45
		this.field3615 = Integer.MAX_VALUE; // L: 46
		this.field3604 = 0; // L: 47
		this.field3613 = 0; // L: 48
		this.field3614 = 0; // L: 49
		this.field3601 = 0; // L: 50
		this.field3599.method7350(1); // L: 55
		this.field3588.method7350(1); // L: 56
	} // L: 57

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "108"
	)
	void method6105() {
		this.field3597 = (this.field3597 + 1) % 60; // L: 60
		if (this.field3609 > 0) { // L: 61
			--this.field3609; // L: 62
		}

	} // L: 64

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1080189228"
	)
	public boolean method6106(boolean var1) {
		var1 = var1 && this.field3600; // L: 67
		boolean var2 = this.field3612 != var1; // L: 68
		this.field3612 = var1; // L: 69
		if (!this.field3612) { // L: 70
			this.method6130(this.field3607, this.field3607); // L: 71
		}

		return var2; // L: 73
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "220495780"
	)
	public void method6143(boolean var1) {
		this.field3600 = var1; // L: 77
		this.field3612 = var1 && this.field3612; // L: 78
	} // L: 79

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-764154033"
	)
	boolean method6290(String var1) {
		String var2 = this.field3599.method7282(); // L: 82
		if (!var2.equals(var1)) { // L: 83
			var1 = this.method6165(var1); // L: 84
			this.field3599.method7358(var1); // L: 85
			this.method6115(this.field3614, this.field3601); // L: 86
			this.method6178(); // L: 87
			this.method6183(); // L: 88
			return true; // L: 89
		} else {
			return false; // L: 91
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "0"
	)
	boolean method6109(String var1) {
		this.field3588.method7358(var1); // L: 95
		return true; // L: 96
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lpk;B)Z",
		garbageValue = "2"
	)
	boolean method6110(AbstractFont var1) {
		boolean var2 = !this.field3602; // L: 100
		this.field3599.method7286(var1); // L: 101
		this.field3588.method7286(var1); // L: 102
		this.field3602 = true; // L: 103
		var2 |= this.method6115(this.field3614, this.field3601); // L: 104
		var2 |= this.method6130(this.field3606, this.field3607); // L: 105
		if (this.method6178()) { // L: 106
			this.method6183(); // L: 107
			var2 = true; // L: 108
		}

		return var2; // L: 110
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-41"
	)
	public boolean method6111(int var1, int var2) {
		boolean var3 = this.field3604 != var1 || var2 != this.field3613; // L: 114
		this.field3604 = var1; // L: 115
		this.field3613 = var2; // L: 116
		var3 |= this.method6115(this.field3614, this.field3601); // L: 117
		return var3; // L: 118
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1183077231"
	)
	public boolean method6112(int var1) {
		if (var1 < 0) { // L: 122
			var1 = Integer.MAX_VALUE; // L: 123
		}

		boolean var2 = var1 == this.field3599.method7403(); // L: 125
		this.field3599.method7328(var1); // L: 126
		this.field3588.method7328(var1); // L: 127
		if (this.method6178()) { // L: 128
			this.method6183(); // L: 129
			var2 = true; // L: 130
		}

		return var2; // L: 132
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-790356702"
	)
	public boolean method6113(int var1) {
		this.field3599.method7280(var1); // L: 136
		if (this.method6178()) { // L: 137
			this.method6183(); // L: 138
			return true; // L: 139
		} else {
			return false; // L: 141
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-34"
	)
	public boolean method6322(int var1) {
		this.field3615 = var1; // L: 145
		if (this.method6178()) { // L: 146
			this.method6183(); // L: 147
			return true; // L: 148
		} else {
			return false; // L: 150
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1916065285"
	)
	public boolean method6115(int var1, int var2) {
		if (!this.method6162()) { // L: 154
			this.field3614 = var1; // L: 155
			this.field3601 = var2; // L: 156
			return false; // L: 157
		} else {
			int var3 = this.field3614; // L: 159
			int var4 = this.field3601; // L: 160
			int var5 = Math.max(0, this.field3599.method7300() - this.field3604 + 2); // L: 161
			int var6 = Math.max(0, this.field3599.method7301() - this.field3613 + 1); // L: 162
			this.field3614 = Math.max(0, Math.min(var5, var1)); // L: 163
			this.field3601 = Math.max(0, Math.min(var6, var2)); // L: 164
			return var3 != this.field3614 || var4 != this.field3601; // L: 165
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIS)Z",
		garbageValue = "-28947"
	)
	public boolean method6267(int var1, int var2) {
		boolean var3 = true; // L: 169
		if (var1 < 0 || var1 > 2) { // L: 170
			var3 = false; // L: 171
		}

		if (var2 < 0 || var2 > 2) { // L: 173
			var3 = false; // L: 174
		}

		return var3 ? this.field3599.method7288(var1, var2) : false; // L: 176 177 179
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "105"
	)
	public void method6117(int var1) {
		this.field3599.method7289(var1); // L: 183
	} // L: 184

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "318624055"
	)
	public void method6118(int var1) {
		this.field3603 = var1; // L: 187
	} // L: 188

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-745884306"
	)
	public void method6378(int var1) {
		this.field3599.method7350(var1); // L: 191
	} // L: 192

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "73"
	)
	public void method6376(int var1) {
		this.field3599.method7285(var1); // L: 195
	} // L: 196

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1266422233"
	)
	public boolean method6201(int var1) {
		this.field3605 = var1; // L: 199
		String var2 = this.field3599.method7282(); // L: 200
		int var3 = var2.length(); // L: 201
		var2 = this.method6165(var2); // L: 202
		if (var2.length() != var3) { // L: 203
			this.field3599.method7358(var2); // L: 204
			this.method6115(this.field3614, this.field3601); // L: 205
			this.method6178(); // L: 206
			this.method6183(); // L: 207
			return true; // L: 208
		} else {
			return false; // L: 210
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-313169923"
	)
	public void method6122() {
		this.field3602 = false; // L: 214
	} // L: 215

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-88"
	)
	public boolean method6199(int var1) {
		if (this.method6172(var1)) { // L: 218
			this.method6128(); // L: 219
			class395 var2 = this.field3599.method7346((char)var1, this.field3607, this.field3598); // L: 220
			this.method6130(var2.method7419(), var2.method7419()); // L: 221
			this.method6178(); // L: 222
			this.method6183(); // L: 223
		}

		return true; // L: 225
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1833500314"
	)
	public void method6124() {
		if (!this.method6128() && this.field3607 > 0) { // L: 229
			int var1 = this.field3599.method7296(this.field3607 - 1); // L: 230
			this.method6183(); // L: 231
			this.method6130(var1, var1); // L: 232
		}

	} // L: 234

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	public void method6125() {
		if (!this.method6128() && this.field3607 < this.field3599.method7281()) { // L: 237
			int var1 = this.field3599.method7296(this.field3607); // L: 238
			this.method6183(); // L: 239
			this.method6130(var1, var1); // L: 240
		}

	} // L: 242

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-66"
	)
	public void method6126() {
		if (!this.method6128() && this.field3607 > 0) { // L: 245
			class485 var1 = this.method6176(this.field3607 - 1); // L: 246
			int var2 = this.field3599.method7297((Integer)var1.field4966, this.field3607); // L: 247
			this.method6183(); // L: 248
			this.method6130(var2, var2); // L: 249
		}

	} // L: 251

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-43"
	)
	public void method6156() {
		if (!this.method6128() && this.field3607 < this.field3599.method7281()) { // L: 254
			class485 var1 = this.method6176(this.field3607); // L: 255
			int var2 = this.field3599.method7297(this.field3607, (Integer)var1.field4965); // L: 256
			this.method6183(); // L: 257
			this.method6130(var2, var2); // L: 258
		}

	} // L: 260

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1216764682"
	)
	boolean method6128() {
		if (!this.method6173()) { // L: 263
			return false;
		} else {
			int var1 = this.field3599.method7297(this.field3606, this.field3607); // L: 264
			this.method6183(); // L: 265
			this.method6130(var1, var1); // L: 266
			return true; // L: 267
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-70"
	)
	public void method6370() {
		this.method6130(0, this.field3599.method7281()); // L: 271
	} // L: 272

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "28215574"
	)
	public boolean method6130(int var1, int var2) {
		if (!this.method6162()) { // L: 275
			this.field3606 = var1; // L: 276
			this.field3607 = var2; // L: 277
			return false; // L: 278
		} else {
			if (var1 > this.field3599.method7281()) { // L: 280
				var1 = this.field3599.method7281(); // L: 281
			}

			if (var2 > this.field3599.method7281()) { // L: 283
				var2 = this.field3599.method7281(); // L: 284
			}

			boolean var3 = this.field3606 != var1 || var2 != this.field3607; // L: 286
			this.field3606 = var1; // L: 287
			if (var2 != this.field3607) { // L: 288
				this.field3607 = var2; // L: 289
				this.field3597 = 0; // L: 290
				this.method6181(); // L: 291
			}

			if (var3 && this.field3611 != null) { // L: 293 294
				this.field3611.vmethod6045(); // L: 295
			}

			return var3; // L: 298
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "67"
	)
	public void method6131(boolean var1) {
		class485 var2 = this.method6177(this.field3607); // L: 302
		this.method6179((Integer)var2.field4966, var1); // L: 303
	} // L: 304

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-86"
	)
	public void method6132(boolean var1) {
		class485 var2 = this.method6177(this.field3607); // L: 307
		this.method6179((Integer)var2.field4965, var1); // L: 308
	} // L: 309

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "103"
	)
	public void method6133(boolean var1) {
		this.method6179(0, var1); // L: 312
	} // L: 313

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1079000340"
	)
	public void method6134(boolean var1) {
		this.method6179(this.field3599.method7281(), var1); // L: 316
	} // L: 317

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1431814125"
	)
	public void method6304(boolean var1) {
		if (this.method6173() && !var1) { // L: 320
			this.method6179(Math.min(this.field3606, this.field3607), var1); // L: 321
		} else if (this.field3607 > 0) { // L: 323
			this.method6179(this.field3607 - 1, var1); // L: 324
		}

	} // L: 326

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1263469110"
	)
	public void method6136(boolean var1) {
		if (this.method6173() && !var1) { // L: 329
			this.method6179(Math.max(this.field3606, this.field3607), var1); // L: 330
		} else if (this.field3607 < this.field3599.method7281()) { // L: 332
			this.method6179(this.field3607 + 1, var1); // L: 333
		}

	} // L: 335

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-12006"
	)
	public void method6137(boolean var1) {
		if (this.field3607 > 0) { // L: 338
			class485 var2 = this.method6176(this.field3607 - 1); // L: 339
			this.method6179((Integer)var2.field4966, var1); // L: 340
		}

	} // L: 342

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1452508344"
	)
	public void method6138(boolean var1) {
		if (this.field3607 < this.field3599.method7281()) { // L: 345
			class485 var2 = this.method6176(this.field3607 + 1); // L: 346
			this.method6179((Integer)var2.field4965, var1); // L: 347
		}

	} // L: 349

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1855815967"
	)
	public void method6139(boolean var1) {
		if (this.field3607 > 0) { // L: 352
			this.method6179(this.field3599.method7299(this.field3607, -1), var1); // L: 353
		}

	} // L: 355

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1322004372"
	)
	public void method6140(boolean var1) {
		if (this.field3607 < this.field3599.method7281()) { // L: 358
			this.method6179(this.field3599.method7299(this.field3607, 1), var1); // L: 359
		}

	} // L: 361

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "6"
	)
	public void method6141(boolean var1) {
		if (this.field3607 > 0) { // L: 364
			int var2 = this.method6180(); // L: 365
			this.method6179(this.field3599.method7299(this.field3607, -var2), var1); // L: 366
		}

	} // L: 368

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-203552347"
	)
	public void method6127(boolean var1) {
		if (this.field3607 < this.field3599.method7281()) { // L: 371
			int var2 = this.method6180(); // L: 372
			this.method6179(this.field3599.method7299(this.field3607, var2), var1); // L: 373
		}

	} // L: 375

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "2595"
	)
	public void method6280(boolean var1) {
		class398 var2 = this.field3599.method7290(0, this.field3607); // L: 378
		class485 var3 = var2.method7553(); // L: 379
		this.method6179(this.field3599.method7327((Integer)var3.field4966, this.field3601), var1); // L: 380
	} // L: 381

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1036465571"
	)
	public void method6278(boolean var1) {
		class398 var2 = this.field3599.method7290(0, this.field3607); // L: 384
		class485 var3 = var2.method7553(); // L: 385
		this.method6179(this.field3599.method7327((Integer)var3.field4966, this.field3613 + this.field3601), var1); // L: 386
	} // L: 387

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-1002335608"
	)
	public void method6347(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false; // L: 390
		class485 var6;
		int var8;
		if (!this.field3602) { // L: 391
			var8 = 0; // L: 392
		} else {
			var1 += this.field3614; // L: 395
			var2 += this.field3601; // L: 396
			var6 = this.method6185(); // L: 397
			var8 = this.field3599.method7327(var1 - (Integer)var6.field4966, var2 - (Integer)var6.field4965); // L: 398
		}

		if (var3 && var4) { // L: 400
			this.field3617 = 1; // L: 401
			var6 = this.method6176(var8); // L: 402
			class485 var7 = this.method6176(this.field3608); // L: 403
			this.method6175(var7, var6); // L: 404
		} else if (var3) { // L: 406
			this.field3617 = 1; // L: 407
			var6 = this.method6176(var8); // L: 408
			this.method6130((Integer)var6.field4966, (Integer)var6.field4965); // L: 409
			this.field3608 = (Integer)var6.field4966; // L: 410
		} else if (var4) { // L: 412
			this.method6130(this.field3608, var8); // L: 413
		} else {
			if (this.field3609 > 0 && var8 == this.field3608) { // L: 416
				if (this.field3607 == this.field3606) { // L: 417
					this.field3617 = 1; // L: 418
					var6 = this.method6176(var8); // L: 419
					this.method6130((Integer)var6.field4966, (Integer)var6.field4965); // L: 420
				} else {
					this.field3617 = 2; // L: 423
					var6 = this.method6177(var8); // L: 424
					this.method6130((Integer)var6.field4966, (Integer)var6.field4965); // L: 425
				}
			} else {
				this.field3617 = 0; // L: 429
				this.method6130(var8, var8); // L: 430
				this.field3608 = var8; // L: 431
			}

			this.field3609 = 25; // L: 433
		}

	} // L: 435

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-30"
	)
	public void method6190(int var1, int var2) {
		if (this.field3602 && this.method6157()) { // L: 438
			var1 += this.field3614; // L: 439
			var2 += this.field3601; // L: 440
			class485 var3 = this.method6185(); // L: 441
			int var4 = this.field3599.method7327(var1 - (Integer)var3.field4966, var2 - (Integer)var3.field4965); // L: 442
			class485 var5;
			class485 var6;
			switch(this.field3617) { // L: 443
			case 0:
				this.method6130(this.field3606, var4); // L: 446
				break;
			case 1:
				var5 = this.method6176(this.field3608); // L: 451
				var6 = this.method6176(var4); // L: 452
				this.method6175(var5, var6); // L: 453
				break;
			case 2:
				var5 = this.method6177(this.field3608); // L: 458
				var6 = this.method6177(var4); // L: 459
				this.method6175(var5, var6); // L: 460
			}
		}

	} // L: 465

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1723140286"
	)
	public void method6147(Clipboard var1) {
		class398 var2 = this.field3599.method7290(this.field3606, this.field3607); // L: 468
		if (!var2.method7544()) { // L: 469
			String var3 = var2.method7542(); // L: 470
			if (!var3.isEmpty()) { // L: 471
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null); // L: 472
			}
		}

	} // L: 475

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "2111715206"
	)
	public void method6108(Clipboard var1) {
		if (this.method6173()) { // L: 478
			this.method6147(var1); // L: 479
			this.method6128(); // L: 480
		}

	} // L: 482

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-992379728"
	)
	public void method6149(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null); // L: 485
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) { // L: 486
			try {
				String var3 = this.method6165((String)var2.getTransferData(DataFlavor.stringFlavor)); // L: 488
				this.method6128(); // L: 489
				class395 var4 = this.field3599.method7292(var3, this.field3607, this.field3598); // L: 490
				this.method6130(var4.method7419(), var4.method7419()); // L: 491
				this.method6178(); // L: 492
				this.method6183(); // L: 493
			} catch (Exception var5) { // L: 495
			}
		}

	} // L: 497

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "127"
	)
	public void method6308() {
		this.field3601 = Math.max(0, this.field3601 - this.field3599.method7302()); // L: 500
	} // L: 501

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-12"
	)
	public void method6151() {
		int var1 = Math.max(0, this.field3599.method7301() - this.field3613); // L: 504
		this.field3601 = Math.min(var1, this.field3601 + this.field3599.method7302()); // L: 505
	} // L: 506

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lmf;I)V",
		garbageValue = "1877137858"
	)
	public void method6152(class323 var1) {
		this.field3616 = var1; // L: 509
	} // L: 510

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lmf;I)V",
		garbageValue = "1739536664"
	)
	public void method6153(class323 var1) {
		this.field3611 = var1; // L: 513
	} // L: 514

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Lpj;",
		garbageValue = "-2121359079"
	)
	public class394 method6230() {
		return this.field3599; // L: 517
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Lpj;",
		garbageValue = "1026932642"
	)
	public class394 method6155() {
		return this.field3588; // L: 521
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Lpl;",
		garbageValue = "-927140025"
	)
	public class398 method6120() {
		return this.field3599.method7290(this.field3606, this.field3607); // L: 525
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "10263708"
	)
	public boolean method6157() {
		return this.field3612; // L: 529
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2120535737"
	)
	public boolean method6158() {
		return this.field3600; // L: 533
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "111"
	)
	public boolean method6210() {
		return this.method6157() && this.field3597 % 60 < 30; // L: 537
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	public int method6160() {
		return this.field3607; // L: 541
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "9"
	)
	public int method6161() {
		return this.field3606; // L: 545
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "73"
	)
	public boolean method6162() {
		return this.field3602; // L: 549
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1004374049"
	)
	public int method6163() {
		return this.field3614; // L: 553
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-737818988"
	)
	public int method6286() {
		return this.field3601; // L: 557
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "770052367"
	)
	public int method6326() {
		return this.field3599.method7403(); // L: 561
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-339785891"
	)
	public int method6298() {
		return this.field3599.method7306(); // L: 565
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-105"
	)
	public int method6362() {
		return this.field3615; // L: 569
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "10872"
	)
	public int method6168() {
		return this.field3603; // L: 573
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-333954295"
	)
	public int method6123() {
		return this.field3599.method7325(); // L: 577
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method6261() {
		return this.field3605; // L: 581
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2053175833"
	)
	public int method6114() {
		return this.field3599.method7308(); // L: 585
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-20"
	)
	public boolean method6243() {
		return this.method6298() > 1; // L: 589
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-350056548"
	)
	boolean method6173() {
		return this.field3607 != this.field3606; // L: 593
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "83"
	)
	String method6165(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length()); // L: 597

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 598
			char var4 = var1.charAt(var3); // L: 599
			if (this.method6172(var4)) { // L: 600
				var2.append(var4); // L: 601
			}
		}

		return var2.toString(); // L: 604
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Lss;Lss;B)V",
		garbageValue = "5"
	)
	void method6175(class485 var1, class485 var2) {
		if ((Integer)var2.field4966 < (Integer)var1.field4966) { // L: 608
			this.method6130((Integer)var1.field4965, (Integer)var2.field4966); // L: 609
		} else {
			this.method6130((Integer)var1.field4966, (Integer)var2.field4965); // L: 612
		}

	} // L: 614

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(IB)Lss;",
		garbageValue = "-107"
	)
	class485 method6176(int var1) {
		int var2 = this.field3599.method7281(); // L: 617
		int var3 = 0; // L: 618
		int var4 = var2; // L: 619

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 620
			if (this.method6182(this.field3599.method7303(var5 - 1).field4476)) { // L: 621
				var3 = var5; // L: 622
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 626
			if (this.method6182(this.field3599.method7303(var5).field4476)) { // L: 627
				var4 = var5; // L: 628
				break;
			}
		}

		return new class485(var3, var4); // L: 632
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II)Lss;",
		garbageValue = "-982019338"
	)
	class485 method6177(int var1) {
		int var2 = this.field3599.method7281(); // L: 636
		int var3 = 0; // L: 637
		int var4 = var2; // L: 638

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 639
			if (this.field3599.method7303(var5 - 1).field4476 == '\n') { // L: 640
				var3 = var5; // L: 641
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 645
			if (this.field3599.method7303(var5).field4476 == '\n') { // L: 646
				var4 = var5; // L: 647
				break;
			}
		}

		return new class485(var3, var4); // L: 651
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2078239234"
	)
	boolean method6178() {
		if (!this.method6162()) { // L: 655
			return false;
		} else {
			boolean var1 = false; // L: 656
			if (this.field3599.method7281() > this.field3615) { // L: 657
				this.field3599.method7297(this.field3615, this.field3599.method7281()); // L: 658
				var1 = true; // L: 659
			}

			int var2 = this.method6298(); // L: 661
			int var3;
			if (this.field3599.method7341() > var2) { // L: 662
				var3 = this.field3599.method7299(0, var2) - 1; // L: 663
				this.field3599.method7297(var3, this.field3599.method7281()); // L: 664
				var1 = true; // L: 665
			}

			if (var1) { // L: 667
				var3 = this.field3607; // L: 668
				int var4 = this.field3606; // L: 669
				int var5 = this.field3599.method7281(); // L: 670
				if (this.field3607 > var5) { // L: 671
					var3 = var5; // L: 672
				}

				if (this.field3606 > var5) { // L: 674
					var4 = var5; // L: 675
				}

				this.method6130(var4, var3); // L: 677
			}

			return var1; // L: 679
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1750876747"
	)
	void method6179(int var1, boolean var2) {
		if (var2) { // L: 683
			this.method6130(this.field3606, var1);
		} else {
			this.method6130(var1, var1); // L: 684
		}

	} // L: 685

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "6"
	)
	int method6180() {
		return this.field3613 / this.field3599.method7302(); // L: 688
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-676768049"
	)
	void method6181() {
		class398 var1 = this.field3599.method7290(0, this.field3607); // L: 692
		class485 var2 = var1.method7553(); // L: 693
		int var3 = this.field3599.method7302(); // L: 694
		int var4 = (Integer)var2.field4966 - 10; // L: 695
		int var5 = var4 + 20; // L: 696
		int var6 = (Integer)var2.field4965 - 3; // L: 697
		int var7 = var6 + var3 + 6; // L: 698
		int var8 = this.field3614; // L: 699
		int var9 = var8 + this.field3604; // L: 700
		int var10 = this.field3601; // L: 701
		int var11 = var10 + this.field3613; // L: 702
		int var12 = this.field3614; // L: 703
		int var13 = this.field3601; // L: 704
		if (var4 < var8) { // L: 705
			var12 = var4; // L: 706
		} else if (var5 > var9) { // L: 708
			var12 = var5 - this.field3604; // L: 709
		}

		if (var6 < var10) { // L: 711
			var13 = var6; // L: 712
		} else if (var7 > var11) { // L: 714
			var13 = var7 - this.field3613; // L: 715
		}

		this.method6115(var12, var13); // L: 717
	} // L: 718

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-369704395"
	)
	boolean method6182(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9; // L: 721
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2067288907"
	)
	void method6183() {
		if (this.field3616 != null) { // L: 725
			this.field3616.vmethod6045(); // L: 726
		}

	} // L: 728

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-268502133"
	)
	boolean method6172(int var1) {
		switch(this.field3605) { // L: 731
		case 1:
			return WorldMapLabel.isAlphaNumeric((char)var1); // L: 735
		case 2:
			return class200.isCharAlphabetic((char)var1); // L: 746
		case 3:
			return class330.isDigit((char)var1); // L: 748
		case 4:
			char var2 = (char)var1; // L: 737
			if (class330.isDigit(var2)) { // L: 738
				return true; // L: 739
			} else {
				if (var2 != 'k' && var2 != 'K' && var2 != 'm' && var2 != 'M' && var2 != 'b' && var2 != 'B') { // L: 741
					return false; // L: 744
				}

				return true; // L: 742
			}
		default:
			return true; // L: 733
		}
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(I)Lss;",
		garbageValue = "-1390264109"
	)
	class485 method6185() {
		int var1 = this.field3599.method7309(this.field3604); // L: 753
		int var2 = this.field3599.method7310(this.field3613); // L: 754
		return new class485(var1, var2); // L: 755
	}
}
