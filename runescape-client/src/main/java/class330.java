import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
public class class330 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	class395 field3576;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	class395 field3594;
	@ObfuscatedName("ao")
	boolean field3583;
	@ObfuscatedName("ac")
	boolean field3584;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 793053853
	)
	int field3585;
	@ObfuscatedName("an")
	boolean field3598;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 728692293
	)
	int field3581;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -911762755
	)
	int field3588;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1484511711
	)
	int field3587;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -678929799
	)
	int field3590;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 415453075
	)
	int field3591;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1141785699
	)
	int field3592;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -738147983
	)
	int field3593;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1313664571
	)
	int field3574;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1099494877
	)
	int field3595;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1603379109
	)
	int field3596;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 984808681
	)
	int field3597;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1393718881
	)
	int field3589;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 654926663
	)
	int field3599;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	class324 field3600;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	class324 field3601;

	class330() {
		this.field3576 = new class395(); // L: 32
		this.field3594 = new class395(); // L: 33
		this.field3583 = false; // L: 34
		this.field3584 = true; // L: 35
		this.field3585 = 0; // L: 36
		this.field3598 = false; // L: 37
		this.field3581 = 0; // L: 38
		this.field3588 = 0; // L: 39
		this.field3587 = 0; // L: 40
		this.field3590 = 0; // L: 41
		this.field3591 = 0; // L: 42
		this.field3592 = 0; // L: 43
		this.field3593 = 0; // L: 44
		this.field3574 = Integer.MAX_VALUE; // L: 45
		this.field3595 = Integer.MAX_VALUE; // L: 46
		this.field3596 = 0; // L: 47
		this.field3597 = 0; // L: 48
		this.field3589 = 0; // L: 49
		this.field3599 = 0; // L: 50
		this.field3576.method7322(1); // L: 55
		this.field3594.method7322(1); // L: 56
	} // L: 57

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-459181496"
	)
	void method6162() {
		this.field3585 = (this.field3585 + 1) % 60; // L: 60
		if (this.field3593 > 0) { // L: 61
			--this.field3593; // L: 62
		}

	} // L: 64

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "7"
	)
	public boolean method6160(boolean var1) {
		var1 = var1 && this.field3584; // L: 67
		boolean var2 = this.field3583 != var1; // L: 68
		this.field3583 = var1; // L: 69
		if (!this.field3583) { // L: 70
			this.method6184(this.field3590, this.field3590); // L: 71
		}

		return var2; // L: 73
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1718362437"
	)
	public void method6161(boolean var1) {
		this.field3584 = var1; // L: 77
		this.field3583 = var1 && this.field3583; // L: 78
	} // L: 79

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "-14"
	)
	boolean method6296(String var1) {
		String var2 = this.field3576.method7368(); // L: 82
		if (!var2.equals(var1)) { // L: 83
			var1 = this.method6228(var1); // L: 84
			this.field3576.method7329(var1); // L: 85
			this.method6208(this.field3589, this.field3599); // L: 86
			this.method6232(); // L: 87
			this.method6237(); // L: 88
			return true; // L: 89
		} else {
			return false; // L: 91
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "8373002"
	)
	boolean method6163(String var1) {
		this.field3594.method7329(var1); // L: 95
		return true; // L: 96
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lpq;I)Z",
		garbageValue = "-1919649797"
	)
	boolean method6244(AbstractFont var1) {
		boolean var2 = !this.field3598; // L: 100
		this.field3576.method7449(var1); // L: 101
		this.field3594.method7449(var1); // L: 102
		this.field3598 = true; // L: 103
		var2 |= this.method6208(this.field3589, this.field3599); // L: 104
		var2 |= this.method6184(this.field3591, this.field3590); // L: 105
		if (this.method6232()) { // L: 106
			this.method6237(); // L: 107
			var2 = true; // L: 108
		}

		return var2; // L: 110
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1432554130"
	)
	public boolean method6165(int var1, int var2) {
		boolean var3 = this.field3596 != var1 || var2 != this.field3597; // L: 114
		this.field3596 = var1; // L: 115
		this.field3597 = var2; // L: 116
		var3 |= this.method6208(this.field3589, this.field3599); // L: 117
		return var3; // L: 118
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-40"
	)
	public boolean method6331(int var1) {
		if (var1 < 0) { // L: 122
			var1 = Integer.MAX_VALUE; // L: 123
		}

		boolean var2 = var1 == this.field3576.method7340(); // L: 125
		this.field3576.method7384(var1); // L: 126
		this.field3594.method7384(var1); // L: 127
		if (this.method6232()) { // L: 128
			this.method6237(); // L: 129
			var2 = true; // L: 130
		}

		return var2; // L: 132
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "14"
	)
	public boolean method6167(int var1) {
		this.field3576.method7319(var1); // L: 136
		if (this.method6232()) { // L: 137
			this.method6237(); // L: 138
			return true; // L: 139
		} else {
			return false; // L: 141
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "569863727"
	)
	public boolean method6168(int var1) {
		this.field3595 = var1; // L: 145
		if (this.method6232()) { // L: 146
			this.method6237(); // L: 147
			return true; // L: 148
		} else {
			return false; // L: 150
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "217776537"
	)
	public boolean method6208(int var1, int var2) {
		if (!this.method6216()) { // L: 154
			this.field3589 = var1; // L: 155
			this.field3599 = var2; // L: 156
			return false; // L: 157
		} else {
			int var3 = this.field3589; // L: 159
			int var4 = this.field3599; // L: 160
			int var5 = Math.max(0, this.field3576.method7335() - this.field3596 + 2); // L: 161
			int var6 = Math.max(0, this.field3576.method7318() - this.field3597 + 1); // L: 162
			this.field3589 = Math.max(0, Math.min(var5, var1)); // L: 163
			this.field3599 = Math.max(0, Math.min(var6, var2)); // L: 164
			return var3 != this.field3589 || var4 != this.field3599; // L: 165
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIS)Z",
		garbageValue = "-1284"
	)
	public boolean method6170(int var1, int var2) {
		boolean var3 = true; // L: 169
		if (var1 < 0 || var1 > 2) { // L: 170
			var3 = false; // L: 171
		}

		if (var2 < 0 || var2 > 2) { // L: 173
			var3 = false; // L: 174
		}

		return var3 ? this.field3576.method7323(var1, var2) : false; // L: 176 177 179
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1785897338"
	)
	public void method6310(int var1) {
		this.field3576.method7317(var1); // L: 183
	} // L: 184

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-39"
	)
	public void method6350(int var1) {
		this.field3581 = var1; // L: 187
	} // L: 188

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "591098801"
	)
	public void method6173(int var1) {
		this.field3576.method7322(var1); // L: 191
	} // L: 192

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1778164479"
	)
	public void method6277(int var1) {
		this.field3576.method7392(var1); // L: 195
	} // L: 196

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2124230223"
	)
	public boolean method6175(int var1) {
		this.field3587 = var1; // L: 199
		String var2 = this.field3576.method7368(); // L: 200
		int var3 = var2.length(); // L: 201
		var2 = this.method6228(var2); // L: 202
		if (var2.length() != var3) { // L: 203
			this.field3576.method7329(var2); // L: 204
			this.method6208(this.field3589, this.field3599); // L: 205
			this.method6232(); // L: 206
			this.method6237(); // L: 207
			return true; // L: 208
		} else {
			return false; // L: 210
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1676900457"
	)
	public void method6176() {
		this.field3598 = false; // L: 214
	} // L: 215

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2097619146"
	)
	public boolean method6422(int var1) {
		if (this.method6217(var1)) { // L: 218
			this.method6182(); // L: 219
			class396 var2 = this.field3576.method7326((char)var1, this.field3590, this.field3574); // L: 220
			this.method6184(var2.method7458(), var2.method7458()); // L: 221
			this.method6232(); // L: 222
			this.method6237(); // L: 223
		}

		return true; // L: 225
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "639045291"
	)
	public void method6235() {
		if (!this.method6182() && this.field3590 > 0) { // L: 229
			int var1 = this.field3576.method7437(this.field3590 - 1); // L: 230
			this.method6237(); // L: 231
			this.method6184(var1, var1); // L: 232
		}

	} // L: 234

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1560455499"
	)
	public void method6179() {
		if (!this.method6182() && this.field3590 < this.field3576.method7316()) { // L: 237
			int var1 = this.field3576.method7437(this.field3590); // L: 238
			this.method6237(); // L: 239
			this.method6184(var1, var1); // L: 240
		}

	} // L: 242

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1632298723"
	)
	public void method6180() {
		if (!this.method6182() && this.field3590 > 0) { // L: 245
			class486 var1 = this.method6177(this.field3590 - 1); // L: 246
			int var2 = this.field3576.method7332((Integer)var1.field4964, this.field3590); // L: 247
			this.method6237(); // L: 248
			this.method6184(var2, var2); // L: 249
		}

	} // L: 251

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "45"
	)
	public void method6181() {
		if (!this.method6182() && this.field3590 < this.field3576.method7316()) { // L: 254
			class486 var1 = this.method6177(this.field3590); // L: 255
			int var2 = this.field3576.method7332(this.field3590, (Integer)var1.field4962); // L: 256
			this.method6237(); // L: 257
			this.method6184(var2, var2); // L: 258
		}

	} // L: 260

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "809245355"
	)
	boolean method6182() {
		if (!this.method6166()) { // L: 263
			return false;
		} else {
			int var1 = this.field3576.method7332(this.field3591, this.field3590); // L: 264
			this.method6237(); // L: 265
			this.method6184(var1, var1); // L: 266
			return true; // L: 267
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-636827836"
	)
	public void method6234() {
		this.method6184(0, this.field3576.method7316()); // L: 271
	} // L: 272

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-47"
	)
	public boolean method6184(int var1, int var2) {
		if (!this.method6216()) { // L: 275
			this.field3591 = var1; // L: 276
			this.field3590 = var2; // L: 277
			return false; // L: 278
		} else {
			if (var1 > this.field3576.method7316()) { // L: 280
				var1 = this.field3576.method7316(); // L: 281
			}

			if (var2 > this.field3576.method7316()) { // L: 283
				var2 = this.field3576.method7316(); // L: 284
			}

			boolean var3 = this.field3591 != var1 || var2 != this.field3590; // L: 286
			this.field3591 = var1; // L: 287
			if (var2 != this.field3590) { // L: 288
				this.field3590 = var2; // L: 289
				this.field3585 = 0; // L: 290
				this.method6395(); // L: 291
			}

			if (var3 && this.field3601 != null) { // L: 293 294
				this.field3601.vmethod6102(); // L: 295
			}

			return var3; // L: 298
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "112"
	)
	public void method6321(boolean var1) {
		class486 var2 = this.method6174(this.field3590); // L: 302
		this.method6233((Integer)var2.field4964, var1); // L: 303
	} // L: 304

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "647132311"
	)
	public void method6186(boolean var1) {
		class486 var2 = this.method6174(this.field3590); // L: 307
		this.method6233((Integer)var2.field4962, var1); // L: 308
	} // L: 309

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "26"
	)
	public void method6187(boolean var1) {
		this.method6233(0, var1); // L: 312
	} // L: 313

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "109"
	)
	public void method6317(boolean var1) {
		this.method6233(this.field3576.method7316(), var1); // L: 316
	} // L: 317

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "483744415"
	)
	public void method6189(boolean var1) {
		if (this.method6166() && !var1) { // L: 320
			this.method6233(Math.min(this.field3591, this.field3590), var1); // L: 321
		} else if (this.field3590 > 0) { // L: 323
			this.method6233(this.field3590 - 1, var1); // L: 324
		}

	} // L: 326

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "424331931"
	)
	public void method6190(boolean var1) {
		if (this.method6166() && !var1) { // L: 329
			this.method6233(Math.max(this.field3591, this.field3590), var1); // L: 330
		} else if (this.field3590 < this.field3576.method7316()) { // L: 332
			this.method6233(this.field3590 + 1, var1); // L: 333
		}

	} // L: 335

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1838680706"
	)
	public void method6191(boolean var1) {
		if (this.field3590 > 0) { // L: 338
			class486 var2 = this.method6177(this.field3590 - 1); // L: 339
			this.method6233((Integer)var2.field4964, var1); // L: 340
		}

	} // L: 342

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-127"
	)
	public void method6192(boolean var1) {
		if (this.field3590 < this.field3576.method7316()) { // L: 345
			class486 var2 = this.method6177(this.field3590 + 1); // L: 346
			this.method6233((Integer)var2.field4962, var1); // L: 347
		}

	} // L: 349

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-31746529"
	)
	public void method6358(boolean var1) {
		if (this.field3590 > 0) { // L: 352
			this.method6233(this.field3576.method7334(this.field3590, -1), var1); // L: 353
		}

	} // L: 355

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "593239666"
	)
	public void method6194(boolean var1) {
		if (this.field3590 < this.field3576.method7316()) { // L: 358
			this.method6233(this.field3576.method7334(this.field3590, 1), var1); // L: 359
		}

	} // L: 361

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-35"
	)
	public void method6195(boolean var1) {
		if (this.field3590 > 0) { // L: 364
			int var2 = this.method6330(); // L: 365
			this.method6233(this.field3576.method7334(this.field3590, -var2), var1); // L: 366
		}

	} // L: 368

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "46"
	)
	public void method6158(boolean var1) {
		if (this.field3590 < this.field3576.method7316()) { // L: 371
			int var2 = this.method6330(); // L: 372
			this.method6233(this.field3576.method7334(this.field3590, var2), var1); // L: 373
		}

	} // L: 375

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	public void method6353(boolean var1) {
		class399 var2 = this.field3576.method7422(0, this.field3590); // L: 378
		class486 var3 = var2.method7588(); // L: 379
		this.method6233(this.field3576.method7333((Integer)var3.field4964, this.field3599), var1); // L: 380
	} // L: 381

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1784409030"
	)
	public void method6198(boolean var1) {
		class399 var2 = this.field3576.method7422(0, this.field3590); // L: 384
		class486 var3 = var2.method7588(); // L: 385
		this.method6233(this.field3576.method7333((Integer)var3.field4964, this.field3599 + this.field3597), var1); // L: 386
	} // L: 387

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-1784719026"
	)
	public void method6427(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false; // L: 390
		class486 var6;
		int var8;
		if (!this.field3598) { // L: 391
			var8 = 0; // L: 392
		} else {
			var1 += this.field3589; // L: 395
			var2 += this.field3599; // L: 396
			var6 = this.method6238(); // L: 397
			var8 = this.field3576.method7333(var1 - (Integer)var6.field4964, var2 - (Integer)var6.field4962); // L: 398
		}

		if (var3 && var4) { // L: 400
			this.field3588 = 1; // L: 401
			var6 = this.method6177(var8); // L: 402
			class486 var7 = this.method6177(this.field3592); // L: 403
			this.method6229(var7, var6); // L: 404
		} else if (var3) { // L: 406
			this.field3588 = 1; // L: 407
			var6 = this.method6177(var8); // L: 408
			this.method6184((Integer)var6.field4964, (Integer)var6.field4962); // L: 409
			this.field3592 = (Integer)var6.field4964; // L: 410
		} else if (var4) { // L: 412
			this.method6184(this.field3592, var8); // L: 413
		} else {
			if (this.field3593 > 0 && var8 == this.field3592) { // L: 416
				if (this.field3590 == this.field3591) { // L: 417
					this.field3588 = 1; // L: 418
					var6 = this.method6177(var8); // L: 419
					this.method6184((Integer)var6.field4964, (Integer)var6.field4962); // L: 420
				} else {
					this.field3588 = 2; // L: 423
					var6 = this.method6174(var8); // L: 424
					this.method6184((Integer)var6.field4964, (Integer)var6.field4962); // L: 425
				}
			} else {
				this.field3588 = 0; // L: 429
				this.method6184(var8, var8); // L: 430
				this.field3592 = var8; // L: 431
			}

			this.field3593 = 25; // L: 433
		}

	} // L: 435

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1833413853"
	)
	public void method6200(int var1, int var2) {
		if (this.field3598 && this.method6211()) { // L: 438
			var1 += this.field3589; // L: 439
			var2 += this.field3599; // L: 440
			class486 var3 = this.method6238(); // L: 441
			int var4 = this.field3576.method7333(var1 - (Integer)var3.field4964, var2 - (Integer)var3.field4962); // L: 442
			class486 var5;
			class486 var6;
			switch(this.field3588) { // L: 443
			case 0:
				this.method6184(this.field3591, var4); // L: 446
				break;
			case 1:
				var5 = this.method6177(this.field3592); // L: 458
				var6 = this.method6177(var4); // L: 459
				this.method6229(var5, var6);
				break; // L: 460
			case 2:
				var5 = this.method6174(this.field3592); // L: 451
				var6 = this.method6174(var4); // L: 452
				this.method6229(var5, var6); // L: 453
			}
		}

	} // L: 465

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "47"
	)
	public void method6201(Clipboard var1) {
		class399 var2 = this.field3576.method7422(this.field3591, this.field3590); // L: 468
		if (!var2.method7584()) { // L: 469
			String var3 = var2.method7582(); // L: 470
			if (!var3.isEmpty()) { // L: 471
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null); // L: 472
			}
		}

	} // L: 475

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "189356475"
	)
	public void method6202(Clipboard var1) {
		if (this.method6166()) { // L: 478
			this.method6201(var1); // L: 479
			this.method6182(); // L: 480
		}

	} // L: 482

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "284807230"
	)
	public void method6203(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null); // L: 485
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) { // L: 486
			try {
				String var3 = this.method6228((String)var2.getTransferData(DataFlavor.stringFlavor)); // L: 488
				this.method6182(); // L: 489
				class396 var4 = this.field3576.method7327(var3, this.field3590, this.field3574); // L: 490
				this.method6184(var4.method7458(), var4.method7458()); // L: 491
				this.method6232(); // L: 492
				this.method6237(); // L: 493
			} catch (Exception var5) { // L: 495
			}
		}

	} // L: 497

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-121"
	)
	public void method6230() {
		this.field3599 = Math.max(0, this.field3599 - this.field3576.method7351()); // L: 500
	} // L: 501

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-119"
	)
	public void method6185() {
		int var1 = Math.max(0, this.field3576.method7318() - this.field3597); // L: 504
		this.field3599 = Math.min(var1, this.field3599 + this.field3576.method7351()); // L: 505
	} // L: 506

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lmv;B)V",
		garbageValue = "26"
	)
	public void method6227(class324 var1) {
		this.field3600 = var1; // L: 509
	} // L: 510

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lmv;I)V",
		garbageValue = "-2108435148"
	)
	public void method6207(class324 var1) {
		this.field3601 = var1; // L: 513
	} // L: 514

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Lpt;",
		garbageValue = "-1669614004"
	)
	public class395 method6264() {
		return this.field3576; // L: 517
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)Lpt;",
		garbageValue = "25"
	)
	public class395 method6415() {
		return this.field3594; // L: 521
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)Lpo;",
		garbageValue = "2"
	)
	public class399 method6210() {
		return this.field3576.method7422(this.field3591, this.field3590); // L: 525
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1934970333"
	)
	public boolean method6211() {
		return this.field3583; // L: 529
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1635187775"
	)
	public boolean method6212() {
		return this.field3584; // L: 533
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-3"
	)
	public boolean method6288() {
		return this.method6211() && this.field3585 % 60 < 30; // L: 537
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1735474606"
	)
	public int method6214() {
		return this.field3590; // L: 541
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-912146623"
	)
	public int method6215() {
		return this.field3591; // L: 545
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-72"
	)
	public boolean method6216() {
		return this.field3598; // L: 549
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1863338129"
	)
	public int method6316() {
		return this.field3589; // L: 553
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "56"
	)
	public int method6218() {
		return this.field3599; // L: 557
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1605906220"
	)
	public int method6219() {
		return this.field3576.method7340(); // L: 561
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1275690994"
	)
	public int method6220() {
		return this.field3576.method7341(); // L: 565
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "27"
	)
	public int method6221() {
		return this.field3595; // L: 569
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2058718198"
	)
	public int method6204() {
		return this.field3581; // L: 573
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "61"
	)
	public int method6223() {
		return this.field3576.method7380(); // L: 577
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "85673603"
	)
	public int method6311() {
		return this.field3587; // L: 581
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method6300() {
		return this.field3576.method7343(); // L: 585
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-26300"
	)
	public boolean method6226() {
		return this.method6220() > 1; // L: 589
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1024988634"
	)
	boolean method6166() {
		return this.field3590 != this.field3591; // L: 593
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "755561266"
	)
	String method6228(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length()); // L: 597

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 598
			char var4 = var1.charAt(var3); // L: 599
			if (this.method6217(var4)) { // L: 600
				var2.append(var4); // L: 601
			}
		}

		return var2.toString(); // L: 604
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Lsf;Lsf;I)V",
		garbageValue = "1987987448"
	)
	void method6229(class486 var1, class486 var2) {
		if ((Integer)var2.field4964 < (Integer)var1.field4964) { // L: 608
			this.method6184((Integer)var1.field4962, (Integer)var2.field4964); // L: 609
		} else {
			this.method6184((Integer)var1.field4964, (Integer)var2.field4962); // L: 612
		}

	} // L: 614

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsf;",
		garbageValue = "42"
	)
	class486 method6177(int var1) {
		int var2 = this.field3576.method7316(); // L: 617
		int var3 = 0; // L: 618
		int var4 = var2; // L: 619

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 620
			if (this.method6292(this.field3576.method7312(var5 - 1).field4480)) { // L: 621
				var3 = var5; // L: 622
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 626
			if (this.method6292(this.field3576.method7312(var5).field4480)) { // L: 627
				var4 = var5; // L: 628
				break;
			}
		}

		return new class486(var3, var4); // L: 632
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(II)Lsf;",
		garbageValue = "1047123828"
	)
	class486 method6174(int var1) {
		int var2 = this.field3576.method7316(); // L: 636
		int var3 = 0; // L: 637
		int var4 = var2; // L: 638

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 639
			if (this.field3576.method7312(var5 - 1).field4480 == '\n') { // L: 640
				var3 = var5; // L: 641
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 645
			if (this.field3576.method7312(var5).field4480 == '\n') { // L: 646
				var4 = var5; // L: 647
				break;
			}
		}

		return new class486(var3, var4); // L: 651
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1532809681"
	)
	boolean method6232() {
		if (!this.method6216()) { // L: 655
			return false;
		} else {
			boolean var1 = false; // L: 656
			if (this.field3576.method7316() > this.field3595) { // L: 657
				this.field3576.method7332(this.field3595, this.field3576.method7316()); // L: 658
				var1 = true; // L: 659
			}

			int var2 = this.method6220(); // L: 661
			int var3;
			if (this.field3576.method7338() > var2) { // L: 662
				var3 = this.field3576.method7334(0, var2) - 1; // L: 663
				this.field3576.method7332(var3, this.field3576.method7316()); // L: 664
				var1 = true; // L: 665
			}

			if (var1) { // L: 667
				var3 = this.field3590; // L: 668
				int var4 = this.field3591; // L: 669
				int var5 = this.field3576.method7316(); // L: 670
				if (this.field3590 > var5) { // L: 671
					var3 = var5; // L: 672
				}

				if (this.field3591 > var5) { // L: 674
					var4 = var5; // L: 675
				}

				this.method6184(var4, var3); // L: 677
			}

			return var1; // L: 679
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1065241721"
	)
	void method6233(int var1, boolean var2) {
		if (var2) { // L: 683
			this.method6184(this.field3591, var1);
		} else {
			this.method6184(var1, var1); // L: 684
		}

	} // L: 685

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1134475135"
	)
	int method6330() {
		return this.field3597 / this.field3576.method7351(); // L: 688
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-886757584"
	)
	void method6395() {
		class399 var1 = this.field3576.method7422(0, this.field3590); // L: 692
		class486 var2 = var1.method7588(); // L: 693
		int var3 = this.field3576.method7351(); // L: 694
		int var4 = (Integer)var2.field4964 - 10; // L: 695
		int var5 = var4 + 20; // L: 696
		int var6 = (Integer)var2.field4962 - 3; // L: 697
		int var7 = var3 + var6 + 6; // L: 698
		int var8 = this.field3589; // L: 699
		int var9 = var8 + this.field3596; // L: 700
		int var10 = this.field3599; // L: 701
		int var11 = var10 + this.field3597; // L: 702
		int var12 = this.field3589; // L: 703
		int var13 = this.field3599; // L: 704
		if (var4 < var8) { // L: 705
			var12 = var4; // L: 706
		} else if (var5 > var9) { // L: 708
			var12 = var5 - this.field3596; // L: 709
		}

		if (var6 < var10) { // L: 711
			var13 = var6; // L: 712
		} else if (var7 > var11) { // L: 714
			var13 = var7 - this.field3597; // L: 715
		}

		this.method6208(var12, var13); // L: 717
	} // L: 718

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2093013908"
	)
	boolean method6292(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9; // L: 721
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "203184236"
	)
	void method6237() {
		if (this.field3600 != null) { // L: 725
			this.field3600.vmethod6102(); // L: 726
		}

	} // L: 728

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "98"
	)
	boolean method6217(int var1) {
		switch(this.field3587) { // L: 731
		case 1:
			return class126.isAlphaNumeric((char)var1); // L: 735
		case 2:
			return Canvas.isCharAlphabetic((char)var1); // L: 733
		case 3:
			return class164.isDigit((char)var1); // L: 739
		case 4:
			char var2 = (char)var1; // L: 741
			if (class164.isDigit(var2)) { // L: 742
				return true; // L: 743
			} else {
				if (var2 != 'k' && var2 != 'K' && var2 != 'm' && var2 != 'M' && var2 != 'b' && var2 != 'B') { // L: 745
					return false; // L: 748
				}

				return true; // L: 746
			}
		default:
			return true; // L: 737
		}
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(B)Lsf;",
		garbageValue = "0"
	)
	class486 method6238() {
		int var1 = this.field3576.method7344(this.field3596); // L: 753
		int var2 = this.field3576.method7345(this.field3597); // L: 754
		return new class486(var1, var2); // L: 755
	}

	@ObfuscatedName("ar")
	static int method6436(long var0) {
		return (int)(var0 >>> 0 & 127L); // L: 52
	}
}
