import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
public class class347 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	class413 field3683;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	class413 field3684;
	@ObfuscatedName("at")
	boolean field3687;
	@ObfuscatedName("ay")
	boolean field3686;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -98494749
	)
	int field3692;
	@ObfuscatedName("ac")
	boolean field3688;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 457671495
	)
	int field3689;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 576040561
	)
	int field3690;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2028893089
	)
	int field3691;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 2064086413
	)
	int field3693;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 100459291
	)
	int field3679;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1200781745
	)
	int field3699;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1619311665
	)
	int field3676;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1109506203
	)
	int field3696;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1106870875
	)
	int field3697;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1605854399
	)
	int field3698;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -413240369
	)
	int field3695;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1727719529
	)
	int field3694;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 977160551
	)
	int field3701;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	class339 field3702;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	class339 field3703;

	class347() {
		this.field3683 = new class413(); // L: 32
		this.field3684 = new class413(); // L: 33
		this.field3687 = false; // L: 34
		this.field3686 = true; // L: 35
		this.field3692 = 0; // L: 36
		this.field3688 = false; // L: 37
		this.field3689 = 0; // L: 38
		this.field3690 = 0; // L: 39
		this.field3691 = 0; // L: 40
		this.field3693 = 0; // L: 41
		this.field3679 = 0; // L: 42
		this.field3699 = 0; // L: 43
		this.field3676 = 0; // L: 44
		this.field3696 = Integer.MAX_VALUE; // L: 45
		this.field3697 = Integer.MAX_VALUE; // L: 46
		this.field3698 = 0; // L: 47
		this.field3695 = 0; // L: 48
		this.field3694 = 0; // L: 49
		this.field3701 = 0; // L: 50
		this.field3683.method7779(1); // L: 55
		this.field3684.method7779(1); // L: 56
	} // L: 57

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-756472438"
	)
	void method6681() {
		this.field3692 = (this.field3692 + 1) % 60; // L: 60
		if (this.field3676 > 0) { // L: 61
			--this.field3676; // L: 62
		}

	} // L: 64

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "753569973"
	)
	public boolean method6722(boolean var1) {
		var1 = var1 && this.field3686; // L: 67
		boolean var2 = this.field3687 != var1; // L: 68
		this.field3687 = var1; // L: 69
		if (!this.field3687) { // L: 70
			this.method6530(this.field3693, this.field3693); // L: 71
		}

		return var2; // L: 73
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1273758417"
	)
	public void method6508(boolean var1) {
		this.field3686 = var1; // L: 77
		this.field3687 = var1 && this.field3687; // L: 78
	} // L: 79

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "528177582"
	)
	public boolean method6551(String var1) {
		String var2 = this.field3683.method7754(); // L: 82
		if (!var2.equals(var1)) { // L: 83
			var1 = this.method6527(var1); // L: 84
			this.field3683.method7792(var1); // L: 85
			this.method6530(this.field3679, this.field3693); // L: 86
			this.method6516(this.field3694, this.field3701); // L: 87
			this.method6578(); // L: 88
			this.method6583(); // L: 89
			return true; // L: 90
		} else {
			return false; // L: 92
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-2132521772"
	)
	boolean method6510(String var1) {
		this.field3684.method7792(var1); // L: 96
		return true; // L: 97
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lqi;B)Z",
		garbageValue = "7"
	)
	boolean method6511(AbstractFont var1) {
		boolean var2 = !this.field3688; // L: 101
		this.field3683.method7800(var1); // L: 102
		this.field3684.method7800(var1); // L: 103
		this.field3688 = true; // L: 104
		var2 |= this.method6516(this.field3694, this.field3701); // L: 105
		var2 |= this.method6530(this.field3679, this.field3693); // L: 106
		if (this.method6578()) { // L: 107
			this.method6583(); // L: 108
			var2 = true; // L: 109
		}

		return var2; // L: 111
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "4"
	)
	public boolean method6512(int var1, int var2) {
		boolean var3 = this.field3698 != var1 || var2 != this.field3695; // L: 115
		this.field3698 = var1; // L: 116
		this.field3695 = var2; // L: 117
		var3 |= this.method6516(this.field3694, this.field3701); // L: 118
		return var3; // L: 119
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2020341672"
	)
	public boolean method6519(int var1) {
		if (var1 < 0) { // L: 123
			var1 = Integer.MAX_VALUE; // L: 124
		}

		boolean var2 = var1 == this.field3683.method7767(); // L: 126
		this.field3683.method7700(var1); // L: 127
		this.field3684.method7700(var1); // L: 128
		if (this.method6578()) { // L: 129
			this.method6583(); // L: 130
			var2 = true; // L: 131
		}

		return var2; // L: 133
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "96"
	)
	public boolean method6577(int var1) {
		this.field3683.method7701(var1); // L: 137
		if (this.method6578()) { // L: 138
			this.method6583(); // L: 139
			return true; // L: 140
		} else {
			return false; // L: 142
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2117018219"
	)
	public boolean method6772(int var1) {
		this.field3697 = var1; // L: 146
		if (this.method6578()) { // L: 147
			this.method6583(); // L: 148
			return true; // L: 149
		} else {
			return false; // L: 151
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1128260790"
	)
	public boolean method6516(int var1, int var2) {
		if (!this.method6562()) { // L: 155
			this.field3694 = var1; // L: 156
			this.field3701 = var2; // L: 157
			return false; // L: 158
		} else {
			int var3 = this.field3694; // L: 160
			int var4 = this.field3701; // L: 161
			int var5 = Math.max(0, this.field3683.method7717() - this.field3698 + 2); // L: 162
			int var6 = Math.max(0, this.field3683.method7735() - this.field3695 + 1); // L: 163
			this.field3694 = Math.max(0, Math.min(var5, var1)); // L: 164
			this.field3701 = Math.max(0, Math.min(var6, var2)); // L: 165
			return var3 != this.field3694 || var4 != this.field3701; // L: 166
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "911185863"
	)
	public boolean method6517(int var1, int var2) {
		boolean var3 = true; // L: 170
		if (var1 < 0 || var1 > 2) { // L: 171
			var3 = false; // L: 172
		}

		if (var2 < 0 || var2 > 2) { // L: 174
			var3 = false; // L: 175
		}

		return var3 ? this.field3683.method7705(var1, var2) : false; // L: 177 178 180
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "65"
	)
	public void method6554(int var1) {
		this.field3683.method7706(var1); // L: 184
	} // L: 185

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1715771131"
	)
	public void method6639(int var1) {
		this.field3689 = var1; // L: 188
	} // L: 189

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-525256758"
	)
	public void method6520(int var1) {
		this.field3683.method7779(var1); // L: 192
	} // L: 193

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "7"
	)
	public void method6521(int var1) {
		this.field3683.method7731(var1); // L: 196
	} // L: 197

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-104"
	)
	public boolean method6651(int var1) {
		this.field3691 = var1; // L: 200
		String var2 = this.field3683.method7754(); // L: 201
		int var3 = var2.length(); // L: 202
		var2 = this.method6527(var2); // L: 203
		if (var2.length() != var3) { // L: 204
			this.field3683.method7792(var2); // L: 205
			this.method6516(this.field3694, this.field3701); // L: 206
			this.method6578(); // L: 207
			this.method6583(); // L: 208
			return true; // L: 209
		} else {
			return false; // L: 211
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-20912"
	)
	public void method6742() {
		this.field3688 = false; // L: 215
	} // L: 216

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-290248574"
	)
	public boolean method6524(int var1) {
		if (this.method6584(var1)) { // L: 219
			this.method6734(); // L: 220
			class414 var2 = this.field3683.method7708((char)var1, this.field3693, this.field3696); // L: 221
			this.method6530(var2.method7832(), var2.method7832()); // L: 222
			this.method6578(); // L: 223
			this.method6583(); // L: 224
		}

		return true; // L: 226
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method6525() {
		if (!this.method6734() && this.field3693 > 0) { // L: 230
			int var1 = this.field3683.method7713(this.field3693 - 1); // L: 231
			this.method6583(); // L: 232
			this.method6530(var1, var1); // L: 233
		}

	} // L: 235

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "898173700"
	)
	public void method6526() {
		if (!this.method6734() && this.field3693 < this.field3683.method7711()) { // L: 238
			int var1 = this.field3683.method7713(this.field3693); // L: 239
			this.method6583(); // L: 240
			this.method6530(var1, var1); // L: 241
		}

	} // L: 243

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-811114332"
	)
	public void method6783() {
		if (!this.method6734() && this.field3693 > 0) { // L: 246
			class504 var1 = this.method6657(this.field3693 - 1); // L: 247
			int var2 = this.field3683.method7798((Integer)var1.field5063, this.field3693); // L: 248
			this.method6583(); // L: 249
			this.method6530(var2, var2); // L: 250
		}

	} // L: 252

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "878062977"
	)
	public void method6528() {
		if (!this.method6734() && this.field3693 < this.field3683.method7711()) { // L: 255
			class504 var1 = this.method6657(this.field3693); // L: 256
			int var2 = this.field3683.method7798(this.field3693, (Integer)var1.field5064); // L: 257
			this.method6583(); // L: 258
			this.method6530(var2, var2); // L: 259
		}

	} // L: 261

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1048060656"
	)
	boolean method6734() {
		if (!this.method6600()) { // L: 264
			return false;
		} else {
			int var1 = this.field3683.method7798(this.field3679, this.field3693); // L: 265
			this.method6583(); // L: 266
			this.method6530(var1, var1); // L: 267
			return true; // L: 268
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1354777542"
	)
	public void method6514() {
		this.method6530(0, this.field3683.method7711()); // L: 272
	} // L: 273

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "34"
	)
	public boolean method6530(int var1, int var2) {
		if (!this.method6562()) { // L: 276
			this.field3679 = var1; // L: 277
			this.field3693 = var2; // L: 278
			return false; // L: 279
		} else {
			if (var1 > this.field3683.method7711()) { // L: 281
				var1 = this.field3683.method7711(); // L: 282
			}

			if (var2 > this.field3683.method7711()) { // L: 284
				var2 = this.field3683.method7711(); // L: 285
			}

			boolean var3 = this.field3679 != var1 || var2 != this.field3693; // L: 287
			this.field3679 = var1; // L: 288
			if (var2 != this.field3693) { // L: 289
				this.field3693 = var2; // L: 290
				this.field3692 = 0; // L: 291
				this.method6715(); // L: 292
			}

			if (var3 && this.field3703 != null) { // L: 294 295
				this.field3703.vmethod6430(); // L: 296
			}

			return var3; // L: 299
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-955837720"
	)
	public void method6531(boolean var1) {
		class504 var2 = this.method6574(this.field3693); // L: 303
		this.method6579((Integer)var2.field5063, var1); // L: 304
	} // L: 305

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-552794233"
	)
	public void method6532(boolean var1) {
		class504 var2 = this.method6574(this.field3693); // L: 308
		this.method6579((Integer)var2.field5064, var1); // L: 309
	} // L: 310

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "7"
	)
	public void method6533(boolean var1) {
		this.method6579(0, var1); // L: 313
	} // L: 314

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1480986847"
	)
	public void method6766(boolean var1) {
		this.method6579(this.field3683.method7711(), var1); // L: 317
	} // L: 318

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1932709766"
	)
	public void method6535(boolean var1) {
		if (this.method6600() && !var1) { // L: 321
			this.method6579(Math.min(this.field3679, this.field3693), var1); // L: 322
		} else if (this.field3693 > 0) { // L: 324
			this.method6579(this.field3693 - 1, var1); // L: 325
		}

	} // L: 327

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1446723021"
	)
	public void method6737(boolean var1) {
		if (this.method6600() && !var1) { // L: 330
			this.method6579(Math.max(this.field3679, this.field3693), var1); // L: 331
		} else if (this.field3693 < this.field3683.method7711()) { // L: 333
			this.method6579(this.field3693 + 1, var1); // L: 334
		}

	} // L: 336

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	public void method6537(boolean var1) {
		if (this.field3693 > 0) { // L: 339
			class504 var2 = this.method6657(this.field3693 - 1); // L: 340
			this.method6579((Integer)var2.field5063, var1); // L: 341
		}

	} // L: 343

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1107971774"
	)
	public void method6538(boolean var1) {
		if (this.field3693 < this.field3683.method7711()) { // L: 346
			class504 var2 = this.method6657(this.field3693 + 1); // L: 347
			this.method6579((Integer)var2.field5064, var1); // L: 348
		}

	} // L: 350

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-59"
	)
	public void method6539(boolean var1) {
		if (this.field3693 > 0) { // L: 353
			this.method6579(this.field3683.method7716(this.field3693, -1), var1); // L: 354
		}

	} // L: 356

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	public void method6710(boolean var1) {
		if (this.field3693 < this.field3683.method7711()) { // L: 359
			this.method6579(this.field3683.method7716(this.field3693, 1), var1); // L: 360
		}

	} // L: 362

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	public void method6505(boolean var1) {
		if (this.field3693 > 0) { // L: 365
			int var2 = this.method6580(); // L: 366
			this.method6579(this.field3683.method7716(this.field3693, -var2), var1); // L: 367
		}

	} // L: 369

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-9"
	)
	public void method6542(boolean var1) {
		if (this.field3693 < this.field3683.method7711()) { // L: 372
			int var2 = this.method6580(); // L: 373
			this.method6579(this.field3683.method7716(this.field3693, var2), var1); // L: 374
		}

	} // L: 376

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-57"
	)
	public void method6543(boolean var1) {
		class417 var2 = this.field3683.method7707(0, this.field3693); // L: 379
		class504 var3 = var2.method7963(); // L: 380
		this.method6579(this.field3683.method7715((Integer)var3.field5063, this.field3701), var1); // L: 381
	} // L: 382

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-25917"
	)
	public void method6544(boolean var1) {
		class417 var2 = this.field3683.method7707(0, this.field3693); // L: 385
		class504 var3 = var2.method7963(); // L: 386
		this.method6579(this.field3683.method7715((Integer)var3.field5063, this.field3695 + this.field3701), var1); // L: 387
	} // L: 388

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-1047851640"
	)
	public void method6545(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false; // L: 391
		class504 var6;
		int var8;
		if (!this.field3688) { // L: 392
			var8 = 0; // L: 393
		} else {
			var1 += this.field3694; // L: 396
			var2 += this.field3701; // L: 397
			var6 = this.method6585(); // L: 398
			var8 = this.field3683.method7715(var1 - (Integer)var6.field5063, var2 - (Integer)var6.field5064); // L: 399
		}

		if (var3 && var4) { // L: 401
			this.field3690 = 1; // L: 402
			var6 = this.method6657(var8); // L: 403
			class504 var7 = this.method6657(this.field3699); // L: 404
			this.method6575(var7, var6); // L: 405
		} else if (var3) { // L: 407
			this.field3690 = 1; // L: 408
			var6 = this.method6657(var8); // L: 409
			this.method6530((Integer)var6.field5063, (Integer)var6.field5064); // L: 410
			this.field3699 = (Integer)var6.field5063; // L: 411
		} else if (var4) { // L: 413
			this.method6530(this.field3699, var8); // L: 414
		} else {
			if (this.field3676 > 0 && var8 == this.field3699) { // L: 417
				if (this.field3679 == this.field3693) { // L: 418
					this.field3690 = 1; // L: 419
					var6 = this.method6657(var8); // L: 420
					this.method6530((Integer)var6.field5063, (Integer)var6.field5064); // L: 421
				} else {
					this.field3690 = 2; // L: 424
					var6 = this.method6574(var8); // L: 425
					this.method6530((Integer)var6.field5063, (Integer)var6.field5064); // L: 426
				}
			} else {
				this.field3690 = 0; // L: 430
				this.method6530(var8, var8); // L: 431
				this.field3699 = var8; // L: 432
			}

			this.field3676 = 25; // L: 434
		}

	} // L: 436

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "528254532"
	)
	public void method6546(int var1, int var2) {
		if (this.field3688 && this.method6557()) { // L: 439
			var1 += this.field3694; // L: 440
			var2 += this.field3701; // L: 441
			class504 var3 = this.method6585(); // L: 442
			int var4 = this.field3683.method7715(var1 - (Integer)var3.field5063, var2 - (Integer)var3.field5064); // L: 443
			class504 var5;
			class504 var6;
			switch(this.field3690) { // L: 444
			case 0:
				this.method6530(this.field3679, var4); // L: 447
				break;
			case 1:
				var5 = this.method6657(this.field3699); // L: 459
				var6 = this.method6657(var4); // L: 460
				this.method6575(var5, var6); // L: 461
				break; // L: 462
			case 2:
				var5 = this.method6574(this.field3699); // L: 452
				var6 = this.method6574(var4); // L: 453
				this.method6575(var5, var6); // L: 454
			}
		}

	} // L: 466

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1147801496"
	)
	public void method6547(Clipboard var1) {
		class417 var2 = this.field3683.method7707(this.field3679, this.field3693); // L: 469
		if (!var2.method7956()) { // L: 470
			String var3 = var2.method7960(); // L: 471
			if (!var3.isEmpty()) { // L: 472
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null); // L: 473
			}
		}

	} // L: 476

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-2048151798"
	)
	public void method6747(Clipboard var1) {
		if (this.method6600()) { // L: 479
			this.method6547(var1); // L: 480
			this.method6734(); // L: 481
		}

	} // L: 483

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-932002013"
	)
	public void method6599(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null); // L: 486
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) { // L: 487
			try {
				String var3 = this.method6527((String)var2.getTransferData(DataFlavor.stringFlavor)); // L: 489
				this.method6734(); // L: 490
				class414 var4 = this.field3683.method7709(var3, this.field3693, this.field3696); // L: 491
				this.method6530(var4.method7832(), var4.method7832()); // L: 492
				this.method6578(); // L: 493
				this.method6583(); // L: 494
			} catch (Exception var5) { // L: 496
			}
		}

	} // L: 498

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1610173482"
	)
	public void method6550() {
		this.field3701 = Math.max(0, this.field3701 - this.field3683.method7719()); // L: 501
	} // L: 502

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1391428115"
	)
	public void method6653() {
		int var1 = Math.max(0, this.field3683.method7735() - this.field3695); // L: 505
		this.field3701 = Math.min(var1, this.field3701 + this.field3683.method7719()); // L: 506
	} // L: 507

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lnw;B)V",
		garbageValue = "8"
	)
	public void method6552(class339 var1) {
		this.field3702 = var1; // L: 510
	} // L: 511

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lnw;I)V",
		garbageValue = "-1665927607"
	)
	public void method6779(class339 var1) {
		this.field3703 = var1; // L: 514
	} // L: 515

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Lpv;",
		garbageValue = "1257442185"
	)
	public class413 method6515() {
		return this.field3683; // L: 518
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Lpv;",
		garbageValue = "-212619046"
	)
	public class413 method6711() {
		return this.field3684; // L: 522
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)Lqz;",
		garbageValue = "-57"
	)
	public class417 method6556() {
		return this.field3683.method7707(this.field3679, this.field3693); // L: 526
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1403865728"
	)
	public boolean method6557() {
		return this.field3687; // L: 530
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-3432"
	)
	public boolean method6558() {
		return this.field3686; // L: 534
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public boolean method6559() {
		return this.method6557() && this.field3692 % 60 < 30; // L: 538
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-73"
	)
	public int method6560() {
		return this.field3693; // L: 542
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "395517084"
	)
	public int method6561() {
		return this.field3679; // L: 546
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1180862872"
	)
	public boolean method6562() {
		return this.field3688; // L: 550
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "101"
	)
	public int method6507() {
		return this.field3694; // L: 554
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2060373188"
	)
	public int method6564() {
		return this.field3701; // L: 558
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2120111535"
	)
	public int method6565() {
		return this.field3683.method7767(); // L: 562
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108307152"
	)
	public int method6663() {
		return this.field3683.method7808(); // L: 566
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2136471290"
	)
	public int method6623() {
		return this.field3697; // L: 570
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1990544466"
	)
	public int method6568() {
		return this.field3689; // L: 574
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	public int method6569() {
		return this.field3683.method7724(); // L: 578
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "95"
	)
	public int method6570() {
		return this.field3691; // L: 582
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-773664366"
	)
	public int method6636() {
		return this.field3683.method7765(); // L: 586
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1937995389"
	)
	public boolean method6572() {
		return this.method6663() > 1; // L: 590
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1356361203"
	)
	boolean method6600() {
		return this.field3679 != this.field3693; // L: 594
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "159066077"
	)
	String method6527(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length()); // L: 598

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 599
			char var4 = var1.charAt(var3); // L: 600
			if (this.method6584(var4)) { // L: 601
				var2.append(var4); // L: 602
			}
		}

		return var2.toString(); // L: 605
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Lth;Lth;S)V",
		garbageValue = "-86"
	)
	void method6575(class504 var1, class504 var2) {
		if ((Integer)var2.field5063 < (Integer)var1.field5063) { // L: 609
			this.method6530((Integer)var1.field5064, (Integer)var2.field5063); // L: 610
		} else {
			this.method6530((Integer)var1.field5063, (Integer)var2.field5064); // L: 613
		}

	} // L: 615

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II)Lth;",
		garbageValue = "326724202"
	)
	class504 method6657(int var1) {
		int var2 = this.field3683.method7711(); // L: 618
		int var3 = 0; // L: 619
		int var4 = var2; // L: 620

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 621
			if (this.method6522(this.field3683.method7775(var5 - 1).field4583)) { // L: 622
				var3 = var5; // L: 623
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 627
			if (this.method6522(this.field3683.method7775(var5).field4583)) { // L: 628
				var4 = var5; // L: 629
				break;
			}
		}

		return new class504(var3, var4); // L: 633
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(II)Lth;",
		garbageValue = "1298604778"
	)
	class504 method6574(int var1) {
		int var2 = this.field3683.method7711(); // L: 637
		int var3 = 0; // L: 638
		int var4 = var2; // L: 639

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 640
			if (this.field3683.method7775(var5 - 1).field4583 == '\n') { // L: 641
				var3 = var5; // L: 642
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 646
			if (this.field3683.method7775(var5).field4583 == '\n') { // L: 647
				var4 = var5; // L: 648
				break;
			}
		}

		return new class504(var3, var4); // L: 652
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-140710823"
	)
	boolean method6578() {
		if (!this.method6562()) { // L: 656
			return false;
		} else {
			boolean var1 = false; // L: 657
			if (this.field3683.method7711() > this.field3697) { // L: 658
				this.field3683.method7798(this.field3697, this.field3683.method7711()); // L: 659
				var1 = true; // L: 660
			}

			int var2 = this.method6663(); // L: 662
			int var3;
			if (this.field3683.method7720() > var2) { // L: 663
				var3 = this.field3683.method7716(0, var2) - 1; // L: 664
				this.field3683.method7798(var3, this.field3683.method7711()); // L: 665
				var1 = true; // L: 666
			}

			if (var1) { // L: 668
				var3 = this.field3693; // L: 669
				int var4 = this.field3679; // L: 670
				int var5 = this.field3683.method7711(); // L: 671
				if (this.field3693 > var5) { // L: 672
					var3 = var5; // L: 673
				}

				if (this.field3679 > var5) { // L: 675
					var4 = var5; // L: 676
				}

				this.method6530(var4, var3); // L: 678
			}

			return var1; // L: 680
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1955972447"
	)
	void method6579(int var1, boolean var2) {
		if (var2) { // L: 684
			this.method6530(this.field3679, var1);
		} else {
			this.method6530(var1, var1); // L: 685
		}

	} // L: 686

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-925662674"
	)
	int method6580() {
		return this.field3695 / this.field3683.method7719(); // L: 689
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1025063266"
	)
	void method6715() {
		class417 var1 = this.field3683.method7707(0, this.field3693); // L: 693
		class504 var2 = var1.method7963(); // L: 694
		int var3 = this.field3683.method7719(); // L: 695
		int var4 = (Integer)var2.field5063 - 10; // L: 696
		int var5 = var4 + 20; // L: 697
		int var6 = (Integer)var2.field5064 - 3; // L: 698
		int var7 = var6 + var3 + 6; // L: 699
		int var8 = this.field3694; // L: 700
		int var9 = var8 + this.field3698; // L: 701
		int var10 = this.field3701; // L: 702
		int var11 = var10 + this.field3695; // L: 703
		int var12 = this.field3694; // L: 704
		int var13 = this.field3701; // L: 705
		if (var4 < var8) { // L: 706
			var12 = var4; // L: 707
		} else if (var5 > var9) { // L: 709
			var12 = var5 - this.field3698; // L: 710
		}

		if (var6 < var10) { // L: 712
			var13 = var6; // L: 713
		} else if (var7 > var11) { // L: 715
			var13 = var7 - this.field3695; // L: 716
		}

		this.method6516(var12, var13); // L: 718
	} // L: 719

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2048388371"
	)
	boolean method6522(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9; // L: 722
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method6583() {
		if (this.field3702 != null) { // L: 726
			this.field3702.vmethod6430(); // L: 727
		}

	} // L: 729

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-423014427"
	)
	boolean method6584(int var1) {
		switch(this.field3691) { // L: 732
		case 1:
			return WallObject.isAlphaNumeric((char)var1); // L: 736
		case 2:
			return class154.isCharAlphabetic((char)var1); // L: 749
		case 3:
			return class237.isDigit((char)var1); // L: 734
		case 4:
			char var2 = (char)var1; // L: 740
			if (class237.isDigit(var2)) { // L: 741
				return true; // L: 742
			} else {
				if (var2 != 'k' && var2 != 'K' && var2 != 'm' && var2 != 'M' && var2 != 'b' && var2 != 'B') { // L: 744
					return false; // L: 747
				}

				return true; // L: 745
			}
		default:
			return true; // L: 738
		}
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)Lth;",
		garbageValue = "1240566023"
	)
	class504 method6585() {
		int var1 = this.field3683.method7773(this.field3698); // L: 754
		int var2 = this.field3683.method7786(this.field3695); // L: 755
		return new class504(var1, var2); // L: 756
	}
}
