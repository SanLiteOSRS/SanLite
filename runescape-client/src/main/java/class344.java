import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public class class344 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	class409 field3634;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	class409 field3658;
	@ObfuscatedName("ae")
	boolean field3653;
	@ObfuscatedName("aw")
	boolean field3640;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -286517097
	)
	int field3629;
	@ObfuscatedName("az")
	boolean field3642;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 433913125
	)
	int field3643;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1855293077
	)
	int field3648;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 513255703
	)
	int field3639;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1553113311
	)
	int field3646;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -301492353
	)
	int field3647;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1848989437
	)
	int field3645;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -830849715
	)
	int field3649;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1721588169
	)
	int field3650;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1477303877
	)
	int field3651;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 98211697
	)
	int field3652;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1299374005
	)
	int field3637;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -211082193
	)
	int field3641;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 655548705
	)
	int field3655;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	class337 field3656;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	class337 field3657;

	class344() {
		this.field3634 = new class409(); // L: 32
		this.field3658 = new class409(); // L: 33
		this.field3653 = false; // L: 34
		this.field3640 = true; // L: 35
		this.field3629 = 0; // L: 36
		this.field3642 = false; // L: 37
		this.field3643 = 0; // L: 38
		this.field3648 = 0; // L: 39
		this.field3639 = 0; // L: 40
		this.field3646 = 0; // L: 41
		this.field3647 = 0; // L: 42
		this.field3645 = 0; // L: 43
		this.field3649 = 0; // L: 44
		this.field3650 = Integer.MAX_VALUE; // L: 45
		this.field3651 = Integer.MAX_VALUE; // L: 46
		this.field3652 = 0; // L: 47
		this.field3637 = 0; // L: 48
		this.field3641 = 0; // L: 49
		this.field3655 = 0; // L: 50
		this.field3634.method7473(1); // L: 55
		this.field3658.method7473(1); // L: 56
	} // L: 57

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "120"
	)
	void method6397() {
		this.field3629 = (this.field3629 + 1) % 60; // L: 60
		if (this.field3649 > 0) { // L: 61
			--this.field3649; // L: 62
		}

	} // L: 64

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "523317409"
	)
	public boolean method6304(boolean var1) {
		var1 = var1 && this.field3640; // L: 67
		boolean var2 = this.field3653 != var1; // L: 68
		this.field3653 = var1; // L: 69
		if (!this.field3653) { // L: 70
			this.method6314(this.field3646, this.field3646); // L: 71
		}

		return var2; // L: 73
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1481904343"
	)
	public void method6305(boolean var1) {
		this.field3640 = var1; // L: 77
		this.field3653 = var1 && this.field3653; // L: 78
	} // L: 79

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-2133127223"
	)
	public boolean method6306(String var1) {
		String var2 = this.field3634.method7468(); // L: 82
		if (!var2.equals(var1)) { // L: 83
			var1 = this.method6543(var1); // L: 84
			this.field3634.method7552(var1); // L: 85
			this.method6314(this.field3647, this.field3646); // L: 86
			this.method6313(this.field3641, this.field3655); // L: 87
			this.method6376(); // L: 88
			this.method6567(); // L: 89
			return true; // L: 90
		} else {
			return false; // L: 92
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1293964055"
	)
	boolean method6307(String var1) {
		this.field3658.method7552(var1); // L: 96
		return true; // L: 97
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lpk;I)Z",
		garbageValue = "2045619310"
	)
	boolean method6308(AbstractFont var1) {
		boolean var2 = !this.field3642; // L: 101
		this.field3634.method7472(var1); // L: 102
		this.field3658.method7472(var1); // L: 103
		this.field3642 = true; // L: 104
		var2 |= this.method6313(this.field3641, this.field3655); // L: 105
		var2 |= this.method6314(this.field3647, this.field3646); // L: 106
		if (this.method6376()) { // L: 107
			this.method6567(); // L: 108
			var2 = true; // L: 109
		}

		return var2; // L: 111
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "70"
	)
	public boolean method6501(int var1, int var2) {
		boolean var3 = this.field3652 != var1 || var2 != this.field3637; // L: 115
		this.field3652 = var1; // L: 116
		this.field3637 = var2; // L: 117
		var3 |= this.method6313(this.field3641, this.field3655); // L: 118
		return var3; // L: 119
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-74"
	)
	public boolean method6321(int var1) {
		if (var1 < 0) { // L: 123
			var1 = Integer.MAX_VALUE; // L: 124
		}

		boolean var2 = var1 == this.field3634.method7476(); // L: 126
		this.field3634.method7527(var1); // L: 127
		this.field3658.method7527(var1); // L: 128
		if (this.method6376()) { // L: 129
			this.method6567(); // L: 130
			var2 = true; // L: 131
		}

		return var2; // L: 133
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "6"
	)
	public boolean method6311(int var1) {
		this.field3634.method7470(var1); // L: 137
		if (this.method6376()) { // L: 138
			this.method6567(); // L: 139
			return true; // L: 140
		} else {
			return false; // L: 142
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1717570728"
	)
	public boolean method6412(int var1) {
		this.field3651 = var1; // L: 146
		if (this.method6376()) { // L: 147
			this.method6567(); // L: 148
			return true; // L: 149
		} else {
			return false; // L: 151
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1634456183"
	)
	public boolean method6313(int var1, int var2) {
		if (!this.method6360()) { // L: 155
			this.field3641 = var1; // L: 156
			this.field3655 = var2; // L: 157
			return false; // L: 158
		} else {
			int var3 = this.field3641; // L: 160
			int var4 = this.field3655; // L: 161
			int var5 = Math.max(0, this.field3634.method7486() - this.field3652 + 2); // L: 162
			int var6 = Math.max(0, this.field3634.method7487() - this.field3637 + 1); // L: 163
			this.field3641 = Math.max(0, Math.min(var5, var1)); // L: 164
			this.field3655 = Math.max(0, Math.min(var6, var2)); // L: 165
			return var3 != this.field3641 || var4 != this.field3655; // L: 166
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2093677654"
	)
	public boolean method6537(int var1, int var2) {
		boolean var3 = true; // L: 170
		if (var1 < 0 || var1 > 2) { // L: 171
			var3 = false; // L: 172
		}

		if (var2 < 0 || var2 > 2) { // L: 174
			var3 = false; // L: 175
		}

		return var3 ? this.field3634.method7474(var1, var2) : false; // L: 177 178 180
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-939191131"
	)
	public void method6315(int var1) {
		this.field3634.method7475(var1); // L: 184
	} // L: 185

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-592386576"
	)
	public void method6316(int var1) {
		this.field3643 = var1; // L: 188
	} // L: 189

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "3"
	)
	public void method6317(int var1) {
		this.field3634.method7473(var1); // L: 192
	} // L: 193

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1498031514"
	)
	public void method6318(int var1) {
		this.field3634.method7471(var1); // L: 196
	} // L: 197

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "180"
	)
	public boolean method6319(int var1) {
		this.field3639 = var1; // L: 200
		String var2 = this.field3634.method7468(); // L: 201
		int var3 = var2.length(); // L: 202
		var2 = this.method6543(var2); // L: 203
		if (var2.length() != var3) { // L: 204
			this.field3634.method7552(var2); // L: 205
			this.method6313(this.field3641, this.field3655); // L: 206
			this.method6376(); // L: 207
			this.method6567(); // L: 208
			return true; // L: 209
		} else {
			return false; // L: 211
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-969199499"
	)
	public void method6486() {
		this.field3642 = false; // L: 215
	} // L: 216

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "4138"
	)
	public boolean method6333(int var1) {
		if (this.method6382(var1)) { // L: 219
			this.method6326(); // L: 220
			class410 var2 = this.field3634.method7583((char)var1, this.field3646, this.field3650); // L: 221
			this.method6314(var2.method7603(), var2.method7603()); // L: 222
			this.method6376(); // L: 223
			this.method6567(); // L: 224
		}

		return true; // L: 226
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "755624940"
	)
	public void method6322() {
		if (!this.method6326() && this.field3646 > 0) { // L: 230
			int var1 = this.field3634.method7482(this.field3646 - 1); // L: 231
			this.method6567(); // L: 232
			this.method6314(var1, var1); // L: 233
		}

	} // L: 235

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "22"
	)
	public void method6495() {
		if (!this.method6326() && this.field3646 < this.field3634.method7467()) { // L: 238
			int var1 = this.field3634.method7482(this.field3646); // L: 239
			this.method6567(); // L: 240
			this.method6314(var1, var1); // L: 241
		}

	} // L: 243

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2101637945"
	)
	public void method6479() {
		if (!this.method6326() && this.field3646 > 0) { // L: 246
			class500 var1 = this.method6374(this.field3646 - 1); // L: 247
			int var2 = this.field3634.method7483((Integer)var1.field5003, this.field3646); // L: 248
			this.method6567(); // L: 249
			this.method6314(var2, var2); // L: 250
		}

	} // L: 252

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-882101391"
	)
	public void method6563() {
		if (!this.method6326() && this.field3646 < this.field3634.method7467()) { // L: 255
			class500 var1 = this.method6374(this.field3646); // L: 256
			int var2 = this.field3634.method7483(this.field3646, (Integer)var1.field5004); // L: 257
			this.method6567(); // L: 258
			this.method6314(var2, var2); // L: 259
		}

	} // L: 261

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-639259447"
	)
	boolean method6326() {
		if (!this.method6565()) { // L: 264
			return false;
		} else {
			int var1 = this.field3634.method7483(this.field3647, this.field3646); // L: 265
			this.method6567(); // L: 266
			this.method6314(var1, var1); // L: 267
			return true; // L: 268
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	public void method6327() {
		this.method6314(0, this.field3634.method7467()); // L: 272
	} // L: 273

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-504671047"
	)
	public boolean method6314(int var1, int var2) {
		if (!this.method6360()) { // L: 276
			this.field3647 = var1; // L: 277
			this.field3646 = var2; // L: 278
			return false; // L: 279
		} else {
			if (var1 > this.field3634.method7467()) { // L: 281
				var1 = this.field3634.method7467(); // L: 282
			}

			if (var2 > this.field3634.method7467()) { // L: 284
				var2 = this.field3634.method7467(); // L: 285
			}

			boolean var3 = this.field3647 != var1 || var2 != this.field3646; // L: 287
			this.field3647 = var1; // L: 288
			if (var2 != this.field3646) { // L: 289
				this.field3646 = var2; // L: 290
				this.field3629 = 0; // L: 291
				this.method6379(); // L: 292
			}

			if (var3 && this.field3657 != null) { // L: 294 295
				this.field3657.vmethod6238(); // L: 296
			}

			return var3; // L: 299
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "55"
	)
	public void method6481(boolean var1) {
		class500 var2 = this.method6375(this.field3646); // L: 303
		this.method6377((Integer)var2.field5003, var1); // L: 304
	} // L: 305

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2010552592"
	)
	public void method6330(boolean var1) {
		class500 var2 = this.method6375(this.field3646); // L: 308
		this.method6377((Integer)var2.field5004, var1); // L: 309
	} // L: 310

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-81"
	)
	public void method6331(boolean var1) {
		this.method6377(0, var1); // L: 313
	} // L: 314

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1475070773"
	)
	public void method6332(boolean var1) {
		this.method6377(this.field3634.method7467(), var1); // L: 317
	} // L: 318

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1914804723"
	)
	public void method6453(boolean var1) {
		if (this.method6565() && !var1) { // L: 321
			this.method6377(Math.min(this.field3647, this.field3646), var1); // L: 322
		} else if (this.field3646 > 0) { // L: 324
			this.method6377(this.field3646 - 1, var1); // L: 325
		}

	} // L: 327

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1254852438"
	)
	public void method6334(boolean var1) {
		if (this.method6565() && !var1) { // L: 330
			this.method6377(Math.max(this.field3647, this.field3646), var1); // L: 331
		} else if (this.field3646 < this.field3634.method7467()) { // L: 333
			this.method6377(this.field3646 + 1, var1); // L: 334
		}

	} // L: 336

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1246989574"
	)
	public void method6335(boolean var1) {
		if (this.field3646 > 0) { // L: 339
			class500 var2 = this.method6374(this.field3646 - 1); // L: 340
			this.method6377((Integer)var2.field5003, var1); // L: 341
		}

	} // L: 343

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-589145055"
	)
	public void method6336(boolean var1) {
		if (this.field3646 < this.field3634.method7467()) { // L: 346
			class500 var2 = this.method6374(this.field3646 + 1); // L: 347
			this.method6377((Integer)var2.field5004, var1); // L: 348
		}

	} // L: 350

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1596308602"
	)
	public void method6337(boolean var1) {
		if (this.field3646 > 0) { // L: 353
			this.method6377(this.field3634.method7485(this.field3646, -1), var1); // L: 354
		}

	} // L: 356

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1852812163"
	)
	public void method6338(boolean var1) {
		if (this.field3646 < this.field3634.method7467()) { // L: 359
			this.method6377(this.field3634.method7485(this.field3646, 1), var1); // L: 360
		}

	} // L: 362

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-28"
	)
	public void method6339(boolean var1) {
		if (this.field3646 > 0) { // L: 365
			int var2 = this.method6378(); // L: 366
			this.method6377(this.field3634.method7485(this.field3646, -var2), var1); // L: 367
		}

	} // L: 369

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-196223675"
	)
	public void method6340(boolean var1) {
		if (this.field3646 < this.field3634.method7467()) { // L: 372
			int var2 = this.method6378(); // L: 373
			this.method6377(this.field3634.method7485(this.field3646, var2), var1); // L: 374
		}

	} // L: 376

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "18712"
	)
	public void method6341(boolean var1) {
		class413 var2 = this.field3634.method7549(0, this.field3646); // L: 379
		class500 var3 = var2.method7711(); // L: 380
		this.method6377(this.field3634.method7484((Integer)var3.field5003, this.field3655), var1); // L: 381
	} // L: 382

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-124"
	)
	public void method6342(boolean var1) {
		class413 var2 = this.field3634.method7549(0, this.field3646); // L: 385
		class500 var3 = var2.method7711(); // L: 386
		this.method6377(this.field3634.method7484((Integer)var3.field5003, this.field3637 + this.field3655), var1); // L: 387
	} // L: 388

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-1267266894"
	)
	public void method6343(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false; // L: 391
		class500 var6;
		int var8;
		if (!this.field3642) { // L: 392
			var8 = 0; // L: 393
		} else {
			var1 += this.field3641; // L: 396
			var2 += this.field3655; // L: 397
			var6 = this.method6569(); // L: 398
			var8 = this.field3634.method7484(var1 - (Integer)var6.field5003, var2 - (Integer)var6.field5004); // L: 399
		}

		if (var3 && var4) { // L: 401
			this.field3648 = 1; // L: 402
			var6 = this.method6374(var8); // L: 403
			class500 var7 = this.method6374(this.field3645); // L: 404
			this.method6303(var7, var6); // L: 405
		} else if (var3) { // L: 407
			this.field3648 = 1; // L: 408
			var6 = this.method6374(var8); // L: 409
			this.method6314((Integer)var6.field5003, (Integer)var6.field5004); // L: 410
			this.field3645 = (Integer)var6.field5003; // L: 411
		} else if (var4) { // L: 413
			this.method6314(this.field3645, var8); // L: 414
		} else {
			if (this.field3649 > 0 && var8 == this.field3645) { // L: 417
				if (this.field3646 == this.field3647) { // L: 418
					this.field3648 = 1; // L: 419
					var6 = this.method6374(var8); // L: 420
					this.method6314((Integer)var6.field5003, (Integer)var6.field5004); // L: 421
				} else {
					this.field3648 = 2; // L: 424
					var6 = this.method6375(var8); // L: 425
					this.method6314((Integer)var6.field5003, (Integer)var6.field5004); // L: 426
				}
			} else {
				this.field3648 = 0; // L: 430
				this.method6314(var8, var8); // L: 431
				this.field3645 = var8; // L: 432
			}

			this.field3649 = 25; // L: 434
		}

	} // L: 436

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1597491058"
	)
	public void method6562(int var1, int var2) {
		if (this.field3642 && this.method6355()) { // L: 439
			var1 += this.field3641; // L: 440
			var2 += this.field3655; // L: 441
			class500 var3 = this.method6569(); // L: 442
			int var4 = this.field3634.method7484(var1 - (Integer)var3.field5003, var2 - (Integer)var3.field5004); // L: 443
			class500 var5;
			class500 var6;
			switch(this.field3648) { // L: 444
			case 0:
				this.method6314(this.field3647, var4); // L: 461
				break;
			case 1:
				var5 = this.method6374(this.field3645); // L: 447
				var6 = this.method6374(var4); // L: 448
				this.method6303(var5, var6); // L: 449
				break;
			case 2:
				var5 = this.method6375(this.field3645); // L: 454
				var6 = this.method6375(var4); // L: 455
				this.method6303(var5, var6); // L: 456
			}
		}

	} // L: 466

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-839335368"
	)
	public void method6345(Clipboard var1) {
		class413 var2 = this.field3634.method7549(this.field3647, this.field3646); // L: 469
		if (!var2.method7707()) { // L: 470
			String var3 = var2.method7720(); // L: 471
			if (!var3.isEmpty()) { // L: 472
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null); // L: 473
			}
		}

	} // L: 476

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "2087668691"
	)
	public void method6454(Clipboard var1) {
		if (this.method6565()) { // L: 479
			this.method6345(var1); // L: 480
			this.method6326(); // L: 481
		}

	} // L: 483

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "84"
	)
	public void method6508(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null); // L: 486
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) { // L: 487
			try {
				String var3 = this.method6543((String)var2.getTransferData(DataFlavor.stringFlavor)); // L: 489
				this.method6326(); // L: 490
				class410 var4 = this.field3634.method7478(var3, this.field3646, this.field3650); // L: 491
				this.method6314(var4.method7603(), var4.method7603()); // L: 492
				this.method6376(); // L: 493
				this.method6567(); // L: 494
			} catch (Exception var5) { // L: 496
			}
		}

	} // L: 498

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public void method6411() {
		this.field3655 = Math.max(0, this.field3655 - this.field3634.method7488()); // L: 501
	} // L: 502

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-794433961"
	)
	public void method6320() {
		int var1 = Math.max(0, this.field3634.method7487() - this.field3637); // L: 505
		this.field3655 = Math.min(var1, this.field3655 + this.field3634.method7488()); // L: 506
	} // L: 507

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lmg;I)V",
		garbageValue = "-1738038140"
	)
	public void method6350(class337 var1) {
		this.field3656 = var1; // L: 510
	} // L: 511

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lmg;I)V",
		garbageValue = "1967767680"
	)
	public void method6349(class337 var1) {
		this.field3657 = var1; // L: 514
	} // L: 515

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)Lpp;",
		garbageValue = "-4"
	)
	public class409 method6532() {
		return this.field3634; // L: 518
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)Lpp;",
		garbageValue = "1583287029"
	)
	public class409 method6353() {
		return this.field3658; // L: 522
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Lpr;",
		garbageValue = "1493883876"
	)
	public class413 method6354() {
		return this.field3634.method7549(this.field3647, this.field3646); // L: 526
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "435699001"
	)
	public boolean method6355() {
		return this.field3653; // L: 530
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "515348942"
	)
	public boolean method6356() {
		return this.field3640; // L: 534
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "30"
	)
	public boolean method6357() {
		return this.method6355() && this.field3629 % 60 < 30; // L: 538
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-272595100"
	)
	public int method6358() {
		return this.field3646; // L: 542
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "6"
	)
	public int method6359() {
		return this.field3647; // L: 546
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1559709726"
	)
	public boolean method6360() {
		return this.field3642; // L: 550
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1987240412"
	)
	public int method6361() {
		return this.field3641; // L: 554
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-123"
	)
	public int method6362() {
		return this.field3655; // L: 558
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1717649091"
	)
	public int method6523() {
		return this.field3634.method7476(); // L: 562
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "61"
	)
	public int method6364() {
		return this.field3634.method7504(); // L: 566
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "418287158"
	)
	public int method6365() {
		return this.field3651; // L: 570
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "250709855"
	)
	public int method6302() {
		return this.field3643; // L: 574
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-150919313"
	)
	public int method6367() {
		return this.field3634.method7493(); // L: 578
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "128"
	)
	public int method6368() {
		return this.field3639; // L: 582
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "29102"
	)
	public int method6372() {
		return this.field3634.method7494(); // L: 586
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "114534110"
	)
	public boolean method6370() {
		return this.method6364() > 1; // L: 590
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-455222882"
	)
	boolean method6565() {
		return this.field3646 != this.field3647; // L: 594
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-21"
	)
	String method6543(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length()); // L: 598

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 599
			char var4 = var1.charAt(var3); // L: 600
			if (this.method6382(var4)) { // L: 601
				var2.append(var4); // L: 602
			}
		}

		return var2.toString(); // L: 605
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Ltw;Ltw;I)V",
		garbageValue = "1806400604"
	)
	void method6303(class500 var1, class500 var2) {
		if ((Integer)var2.field5003 < (Integer)var1.field5003) { // L: 609
			this.method6314((Integer)var1.field5004, (Integer)var2.field5003); // L: 610
		} else {
			this.method6314((Integer)var1.field5003, (Integer)var2.field5004); // L: 613
		}

	} // L: 615

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(II)Ltw;",
		garbageValue = "1967174247"
	)
	class500 method6374(int var1) {
		int var2 = this.field3634.method7467(); // L: 618
		int var3 = 0; // L: 619
		int var4 = var2; // L: 620

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 621
			if (this.method6380(this.field3634.method7463(var5 - 1).field4523)) { // L: 622
				var3 = var5; // L: 623
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 627
			if (this.method6380(this.field3634.method7463(var5).field4523)) { // L: 628
				var4 = var5; // L: 629
				break;
			}
		}

		return new class500(var3, var4); // L: 633
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)Ltw;",
		garbageValue = "-1936541681"
	)
	class500 method6375(int var1) {
		int var2 = this.field3634.method7467(); // L: 637
		int var3 = 0; // L: 638
		int var4 = var2; // L: 639

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 640
			if (this.field3634.method7463(var5 - 1).field4523 == '\n') { // L: 641
				var3 = var5; // L: 642
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 646
			if (this.field3634.method7463(var5).field4523 == '\n') { // L: 647
				var4 = var5; // L: 648
				break;
			}
		}

		return new class500(var3, var4); // L: 652
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1778479023"
	)
	boolean method6376() {
		if (!this.method6360()) { // L: 656
			return false;
		} else {
			boolean var1 = false; // L: 657
			if (this.field3634.method7467() > this.field3651) { // L: 658
				this.field3634.method7483(this.field3651, this.field3634.method7467()); // L: 659
				var1 = true; // L: 660
			}

			int var2 = this.method6364(); // L: 662
			int var3;
			if (this.field3634.method7489() > var2) { // L: 663
				var3 = this.field3634.method7485(0, var2) - 1; // L: 664
				this.field3634.method7483(var3, this.field3634.method7467()); // L: 665
				var1 = true; // L: 666
			}

			if (var1) { // L: 668
				var3 = this.field3646; // L: 669
				int var4 = this.field3647; // L: 670
				int var5 = this.field3634.method7467(); // L: 671
				if (this.field3646 > var5) { // L: 672
					var3 = var5; // L: 673
				}

				if (this.field3647 > var5) { // L: 675
					var4 = var5; // L: 676
				}

				this.method6314(var4, var3); // L: 678
			}

			return var1; // L: 680
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1307117212"
	)
	void method6377(int var1, boolean var2) {
		if (var2) { // L: 684
			this.method6314(this.field3647, var1);
		} else {
			this.method6314(var1, var1); // L: 685
		}

	} // L: 686

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "996246059"
	)
	int method6378() {
		return this.field3637 / this.field3634.method7488(); // L: 689
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1596440102"
	)
	void method6379() {
		class413 var1 = this.field3634.method7549(0, this.field3646); // L: 693
		class500 var2 = var1.method7711(); // L: 694
		int var3 = this.field3634.method7488(); // L: 695
		int var4 = (Integer)var2.field5003 - 10; // L: 696
		int var5 = var4 + 20; // L: 697
		int var6 = (Integer)var2.field5004 - 3; // L: 698
		int var7 = var6 + var3 + 6; // L: 699
		int var8 = this.field3641; // L: 700
		int var9 = var8 + this.field3652; // L: 701
		int var10 = this.field3655; // L: 702
		int var11 = var10 + this.field3637; // L: 703
		int var12 = this.field3641; // L: 704
		int var13 = this.field3655; // L: 705
		if (var4 < var8) { // L: 706
			var12 = var4; // L: 707
		} else if (var5 > var9) { // L: 709
			var12 = var5 - this.field3652; // L: 710
		}

		if (var6 < var10) { // L: 712
			var13 = var6; // L: 713
		} else if (var7 > var11) { // L: 715
			var13 = var7 - this.field3637; // L: 716
		}

		this.method6313(var12, var13); // L: 718
	} // L: 719

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "5"
	)
	boolean method6380(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9; // L: 722
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "844665494"
	)
	void method6567() {
		if (this.field3656 != null) { // L: 726
			this.field3656.vmethod6238(); // L: 727
		}

	} // L: 729

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	boolean method6382(int var1) {
		switch(this.field3639) { // L: 732
		case 1:
			return Decimator.isAlphaNumeric((char)var1); // L: 740
		case 2:
			return class135.isCharAlphabetic((char)var1); // L: 738
		case 3:
			return IsaacCipher.isDigit((char)var1); // L: 736
		case 4:
			char var2 = (char)var1; // L: 742
			if (IsaacCipher.isDigit(var2)) { // L: 743
				return true; // L: 744
			} else {
				if (var2 != 'k' && var2 != 'K' && var2 != 'm' && var2 != 'M' && var2 != 'b' && var2 != 'B') { // L: 746
					return false; // L: 749
				}

				return true; // L: 747
			}
		default:
			return true; // L: 734
		}
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)Ltw;",
		garbageValue = "-1694076835"
	)
	class500 method6569() {
		int var1 = this.field3634.method7495(this.field3652); // L: 754
		int var2 = this.field3634.method7595(this.field3637); // L: 755
		return new class500(var1, var2); // L: 756
	}
}
