import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
public class class310 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	class375 field3495;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	class375 field3482;
	@ObfuscatedName("at")
	boolean field3475;
	@ObfuscatedName("af")
	boolean field3484;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -592725527
	)
	int field3485;
	@ObfuscatedName("aw")
	boolean field3486;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -955072115
	)
	int field3487;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1425946631
	)
	int field3488;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1808030777
	)
	int field3489;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1631564881
	)
	int field3490;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1850335611
	)
	int field3479;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1413071145
	)
	int field3493;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -539300659
	)
	int field3477;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1677266913
	)
	int field3494;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 2049887613
	)
	int field3500;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -891093219
	)
	int field3496;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1054608939
	)
	int field3483;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1911457455
	)
	int field3498;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 2009047315
	)
	int field3499;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	class304 field3497;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	class304 field3501;

	class310() {
		this.field3495 = new class375(); // L: 32
		this.field3482 = new class375(); // L: 33
		this.field3475 = false; // L: 34
		this.field3484 = true; // L: 35
		this.field3485 = 0; // L: 36
		this.field3486 = false; // L: 37
		this.field3487 = 0; // L: 38
		this.field3488 = 0; // L: 39
		this.field3489 = 0; // L: 40
		this.field3490 = 0; // L: 41
		this.field3479 = 0; // L: 42
		this.field3493 = 0; // L: 43
		this.field3477 = 0; // L: 44
		this.field3494 = Integer.MAX_VALUE; // L: 45
		this.field3500 = Integer.MAX_VALUE; // L: 46
		this.field3496 = 0; // L: 47
		this.field3483 = 0; // L: 48
		this.field3498 = 0; // L: 49
		this.field3499 = 0; // L: 50
		this.field3495.method7127(1); // L: 55
		this.field3482.method7127(1); // L: 56
	} // L: 57

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1714802262"
	)
	void method5816() {
		this.field3485 = (this.field3485 + 1) % 60; // L: 60
		if (this.field3477 > 0) { // L: 61
			--this.field3477; // L: 62
		}

	} // L: 64

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "2"
	)
	public boolean method5891(boolean var1) {
		var1 = var1 && this.field3484; // L: 67
		boolean var2 = this.field3475 != var1; // L: 68
		this.field3475 = var1; // L: 69
		if (!this.field3475) { // L: 70
			this.method5841(this.field3490, this.field3490); // L: 71
		}

		return var2; // L: 73
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1686031987"
	)
	public void method5839(boolean var1) {
		this.field3484 = var1; // L: 77
		this.field3475 = var1 && this.field3475; // L: 78
	} // L: 79

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-417183925"
	)
	boolean method5966(String var1) {
		String var2 = this.field3495.method6999(); // L: 82
		if (!var2.equals(var1)) { // L: 83
			var1 = this.method5844(var1); // L: 84
			this.field3495.method7011(var1); // L: 85
			this.method5826(this.field3498, this.field3499); // L: 86
			this.method5889(); // L: 87
			this.method5894(); // L: 88
			return true; // L: 89
		} else {
			return false; // L: 91
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "16"
	)
	boolean method5820(String var1) {
		this.field3482.method7011(var1); // L: 95
		return true; // L: 96
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lou;I)Z",
		garbageValue = "-473812710"
	)
	boolean method6005(AbstractFont var1) {
		boolean var2 = !this.field3486; // L: 100
		this.field3495.method7003(var1); // L: 101
		this.field3482.method7003(var1); // L: 102
		this.field3486 = true; // L: 103
		var2 |= this.method5826(this.field3498, this.field3499); // L: 104
		var2 |= this.method5841(this.field3479, this.field3490); // L: 105
		if (this.method5889()) { // L: 106
			this.method5894(); // L: 107
			var2 = true; // L: 108
		}

		return var2; // L: 110
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1542973086"
	)
	public boolean method5822(int var1, int var2) {
		boolean var3 = this.field3496 != var1 || var2 != this.field3483; // L: 114
		this.field3496 = var1; // L: 115
		this.field3483 = var2; // L: 116
		var3 |= this.method5826(this.field3498, this.field3499); // L: 117
		return var3; // L: 118
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-41"
	)
	public boolean method5815(int var1) {
		if (var1 < 0) { // L: 122
			var1 = Integer.MAX_VALUE; // L: 123
		}

		boolean var2 = var1 == this.field3495.method7022(); // L: 125
		this.field3495.method7000(var1); // L: 126
		this.field3482.method7000(var1); // L: 127
		if (this.method5889()) { // L: 128
			this.method5894(); // L: 129
			var2 = true; // L: 130
		}

		return var2; // L: 132
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "981334972"
	)
	public boolean method5824(int var1) {
		this.field3495.method7001(var1); // L: 136
		if (this.method5889()) { // L: 137
			this.method5894(); // L: 138
			return true; // L: 139
		} else {
			return false; // L: 141
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "120"
	)
	public boolean method5825(int var1) {
		this.field3500 = var1; // L: 145
		if (this.method5889()) { // L: 146
			this.method5894(); // L: 147
			return true; // L: 148
		} else {
			return false; // L: 150
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "573264435"
	)
	public boolean method5826(int var1, int var2) {
		if (!this.method5873()) { // L: 154
			this.field3498 = var1; // L: 155
			this.field3499 = var2; // L: 156
			return false; // L: 157
		} else {
			int var3 = this.field3498; // L: 159
			int var4 = this.field3499; // L: 160
			int var5 = Math.max(0, this.field3495.method7017() - this.field3496 + 2); // L: 161
			int var6 = Math.max(0, this.field3495.method7018() - this.field3483 + 1); // L: 162
			this.field3498 = Math.max(0, Math.min(var5, var1)); // L: 163
			this.field3499 = Math.max(0, Math.min(var6, var2)); // L: 164
			return var3 != this.field3498 || var4 != this.field3499; // L: 165
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-297314157"
	)
	public boolean method5935(int var1, int var2) {
		boolean var3 = true; // L: 169
		if (var1 < 0 || var1 > 2) { // L: 170
			System.out.println("InputField.setAlignment: Invalid horizontal alignment. Given value: '" + var1 + "'."); // L: 171
			var3 = false; // L: 172
		}

		if (var2 < 0 || var2 > 2) { // L: 174
			System.out.println("InputField.setAlignment: Invalid vertical alignment. Given value: '" + var2 + "'."); // L: 175
			var3 = false; // L: 176
		}

		return var3 ? this.field3495.method7005(var1, var2) : false; // L: 178 179 181
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2050381023"
	)
	public void method5828(int var1) {
		this.field3495.method7006(var1); // L: 185
	} // L: 186

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "5000"
	)
	public void method5862(int var1) {
		this.field3487 = var1; // L: 189
	} // L: 190

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "91"
	)
	public void method5903(int var1) {
		this.field3495.method7127(var1); // L: 193
	} // L: 194

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	public void method5831(int var1) {
		this.field3495.method7002(var1); // L: 197
	} // L: 198

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "235641685"
	)
	public boolean method5918(int var1) {
		this.field3489 = var1; // L: 201
		String var2 = this.field3495.method6999(); // L: 202
		int var3 = var2.length(); // L: 203
		var2 = this.method5844(var2); // L: 204
		if (var2.length() != var3) { // L: 205
			this.field3495.method7011(var2); // L: 206
			this.method5826(this.field3498, this.field3499); // L: 207
			this.method5889(); // L: 208
			this.method5894(); // L: 209
			return true; // L: 210
		} else {
			return false; // L: 212
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2120482340"
	)
	public void method5833() {
		this.field3486 = false; // L: 216
	} // L: 217

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1552754857"
	)
	public boolean method5834(int var1) {
		if (this.method5817(var1)) { // L: 220
			this.method6063(); // L: 221
			class376 var2 = this.field3495.method7070((char)var1, this.field3490, this.field3494); // L: 222
			this.method5841(var2.method7137(), var2.method7137()); // L: 223
			this.method5889(); // L: 224
			this.method5894(); // L: 225
		}

		return true; // L: 227
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1620308356"
	)
	public void method5835() {
		if (!this.method6063() && this.field3490 > 0) { // L: 231
			int var1 = this.field3495.method7013(this.field3490 - 1); // L: 232
			this.method5894(); // L: 233
			this.method5841(var1, var1); // L: 234
		}

	} // L: 236

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1088264884"
	)
	public void method5836() {
		if (!this.method6063() && this.field3490 < this.field3495.method6998()) { // L: 239
			int var1 = this.field3495.method7013(this.field3490); // L: 240
			this.method5894(); // L: 241
			this.method5841(var1, var1); // L: 242
		}

	} // L: 244

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-672060695"
	)
	public void method5837() {
		if (!this.method6063() && this.field3490 > 0) { // L: 247
			class451 var1 = this.method5887(this.field3490 - 1); // L: 248
			int var2 = this.field3495.method7031((Integer)var1.field4798, this.field3490); // L: 249
			this.method5894(); // L: 250
			this.method5841(var2, var2); // L: 251
		}

	} // L: 253

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "158006576"
	)
	public void method5869() {
		if (!this.method6063() && this.field3490 < this.field3495.method6998()) { // L: 256
			class451 var1 = this.method5887(this.field3490); // L: 257
			int var2 = this.field3495.method7031(this.field3490, (Integer)var1.field4799); // L: 258
			this.method5894(); // L: 259
			this.method5841(var2, var2); // L: 260
		}

	} // L: 262

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "60"
	)
	boolean method6063() {
		if (!this.method5884()) { // L: 265
			return false;
		} else {
			int var1 = this.field3495.method7031(this.field3479, this.field3490); // L: 266
			this.method5894(); // L: 267
			this.method5841(var1, var1); // L: 268
			return true; // L: 269
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "105"
	)
	public void method5840() {
		this.method5841(0, this.field3495.method6998()); // L: 273
	} // L: 274

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-976822634"
	)
	public boolean method5841(int var1, int var2) {
		if (!this.method5873()) { // L: 277
			this.field3479 = var1; // L: 278
			this.field3490 = var2; // L: 279
			return false; // L: 280
		} else {
			if (var1 > this.field3495.method6998()) { // L: 282
				var1 = this.field3495.method6998(); // L: 283
			}

			if (var2 > this.field3495.method6998()) { // L: 285
				var2 = this.field3495.method6998(); // L: 286
			}

			boolean var3 = this.field3479 != var1 || var2 != this.field3490; // L: 288
			this.field3479 = var1; // L: 289
			if (var2 != this.field3490) { // L: 290
				this.field3490 = var2; // L: 291
				this.field3485 = 0; // L: 292
				this.method6002(); // L: 293
			}

			if (var3 && this.field3501 != null) { // L: 295 296
				this.field3501.vmethod5776(); // L: 297
			}

			return var3; // L: 300
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "4"
	)
	public void method5978(boolean var1) {
		class451 var2 = this.method5888(this.field3490); // L: 304
		this.method5890((Integer)var2.field4798, var1); // L: 305
	} // L: 306

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	public void method6047(boolean var1) {
		class451 var2 = this.method5888(this.field3490); // L: 309
		this.method5890((Integer)var2.field4799, var1); // L: 310
	} // L: 311

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1194970788"
	)
	public void method5897(boolean var1) {
		this.method5890(0, var1); // L: 314
	} // L: 315

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "32"
	)
	public void method5845(boolean var1) {
		this.method5890(this.field3495.method6998(), var1); // L: 318
	} // L: 319

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1911929784"
	)
	public void method5846(boolean var1) {
		if (this.method5884() && !var1) { // L: 322
			this.method5890(Math.min(this.field3479, this.field3490), var1); // L: 323
		} else if (this.field3490 > 0) { // L: 325
			this.method5890(this.field3490 - 1, var1); // L: 326
		}

	} // L: 328

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1578037568"
	)
	public void method5847(boolean var1) {
		if (this.method5884() && !var1) { // L: 331
			this.method5890(Math.max(this.field3479, this.field3490), var1); // L: 332
		} else if (this.field3490 < this.field3495.method6998()) { // L: 334
			this.method5890(this.field3490 + 1, var1); // L: 335
		}

	} // L: 337

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1446997327"
	)
	public void method5848(boolean var1) {
		if (this.field3490 > 0) { // L: 340
			class451 var2 = this.method5887(this.field3490 - 1); // L: 341
			this.method5890((Integer)var2.field4798, var1); // L: 342
		}

	} // L: 344

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1939904884"
	)
	public void method5948(boolean var1) {
		if (this.field3490 < this.field3495.method6998()) { // L: 347
			class451 var2 = this.method5887(this.field3490 + 1); // L: 348
			this.method5890((Integer)var2.field4799, var1); // L: 349
		}

	} // L: 351

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2005118133"
	)
	public void method5823(boolean var1) {
		if (this.field3490 > 0) { // L: 354
			this.method5890(this.field3495.method7016(this.field3490, -1), var1); // L: 355
		}

	} // L: 357

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1910910611"
	)
	public void method5954(boolean var1) {
		if (this.field3490 < this.field3495.method6998()) { // L: 360
			this.method5890(this.field3495.method7016(this.field3490, 1), var1); // L: 361
		}

	} // L: 363

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2137080090"
	)
	public void method5877(boolean var1) {
		if (this.field3490 > 0) { // L: 366
			int var2 = this.method6082(); // L: 367
			this.method5890(this.field3495.method7016(this.field3490, -var2), var1); // L: 368
		}

	} // L: 370

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1881074040"
	)
	public void method5914(boolean var1) {
		if (this.field3490 < this.field3495.method6998()) { // L: 373
			int var2 = this.method6082(); // L: 374
			this.method5890(this.field3495.method7016(this.field3490, var2), var1); // L: 375
		}

	} // L: 377

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2036072619"
	)
	public void method6012(boolean var1) {
		class379 var2 = this.field3495.method7007(0, this.field3490); // L: 380
		class451 var3 = var2.method7268(); // L: 381
		this.method5890(this.field3495.method7015((Integer)var3.field4798, this.field3499), var1); // L: 382
	} // L: 383

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1382425470"
	)
	public void method5855(boolean var1) {
		class379 var2 = this.field3495.method7007(0, this.field3490); // L: 386
		class451 var3 = var2.method7268(); // L: 387
		this.method5890(this.field3495.method7015((Integer)var3.field4798, this.field3499 + this.field3483), var1); // L: 388
	} // L: 389

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "1883477450"
	)
	public void method5856(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false; // L: 392
		class451 var6;
		int var8;
		if (!this.field3486) { // L: 393
			var8 = 0; // L: 394
		} else {
			var1 += this.field3498; // L: 397
			var2 += this.field3499; // L: 398
			var6 = this.method5896(); // L: 399
			var8 = this.field3495.method7015(var1 - (Integer)var6.field4798, var2 - (Integer)var6.field4799); // L: 400
		}

		if (var3 && var4) { // L: 402
			this.field3488 = 1; // L: 403
			var6 = this.method5887(var8); // L: 404
			class451 var7 = this.method5887(this.field3493); // L: 405
			this.method5949(var7, var6); // L: 406
		} else if (var3) { // L: 408
			this.field3488 = 1; // L: 409
			var6 = this.method5887(var8); // L: 410
			this.method5841((Integer)var6.field4798, (Integer)var6.field4799); // L: 411
			this.field3493 = (Integer)var6.field4798; // L: 412
		} else if (var4) { // L: 414
			this.method5841(this.field3493, var8); // L: 415
		} else {
			if (this.field3477 > 0 && var8 == this.field3493) { // L: 418
				if (this.field3490 == this.field3479) { // L: 419
					this.field3488 = 1; // L: 420
					var6 = this.method5887(var8); // L: 421
					this.method5841((Integer)var6.field4798, (Integer)var6.field4799); // L: 422
				} else {
					this.field3488 = 2; // L: 425
					var6 = this.method5888(var8); // L: 426
					this.method5841((Integer)var6.field4798, (Integer)var6.field4799); // L: 427
				}
			} else {
				this.field3488 = 0; // L: 431
				this.method5841(var8, var8); // L: 432
				this.field3493 = var8; // L: 433
			}

			this.field3477 = 25; // L: 435
		}

	} // L: 437

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	public void method5857(int var1, int var2) {
		if (this.field3486 && this.method5955()) { // L: 440
			var1 += this.field3498; // L: 441
			var2 += this.field3499; // L: 442
			class451 var3 = this.method5896(); // L: 443
			int var4 = this.field3495.method7015(var1 - (Integer)var3.field4798, var2 - (Integer)var3.field4799); // L: 444
			class451 var5;
			class451 var6;
			switch(this.field3488) { // L: 445
			case 0:
				this.method5841(this.field3479, var4); // L: 448
				break;
			case 1:
				var5 = this.method5887(this.field3493); // L: 460
				var6 = this.method5887(var4); // L: 461
				this.method5949(var5, var6); // L: 462
				break; // L: 463
			case 2:
				var5 = this.method5888(this.field3493); // L: 453
				var6 = this.method5888(var4); // L: 454
				this.method5949(var5, var6); // L: 455
			}
		}

	} // L: 467

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "-56"
	)
	public void method5858(Clipboard var1) {
		class379 var2 = this.field3495.method7007(this.field3479, this.field3490); // L: 470
		if (!var2.method7246()) { // L: 471
			String var3 = var2.method7244(); // L: 472
			if (!var3.isEmpty()) { // L: 473
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null); // L: 474
			}
		}

	} // L: 477

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "-82"
	)
	public void method6056(Clipboard var1) {
		if (this.method5884()) { // L: 480
			this.method5858(var1); // L: 481
			this.method6063(); // L: 482
		}

	} // L: 484

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "63"
	)
	public void method5860(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null); // L: 487
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) { // L: 488
			try {
				String var3 = this.method5844((String)var2.getTransferData(DataFlavor.stringFlavor)); // L: 490
				this.method6063(); // L: 491
				class376 var4 = this.field3495.method7023(var3, this.field3490, this.field3494); // L: 492
				this.method5841(var4.method7137(), var4.method7137()); // L: 493
				this.method5889(); // L: 494
				this.method5894(); // L: 495
			} catch (Exception var5) { // L: 497
				System.out.println("Error pasting clipboard to InputField."); // L: 498
			}
		}

	} // L: 501

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "26"
	)
	public void method5861() {
		this.field3499 = Math.max(0, this.field3499 - this.field3495.method7019()); // L: 504
	} // L: 505

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1569086073"
	)
	public void method5859() {
		int var1 = Math.max(0, this.field3495.method7018() - this.field3483); // L: 508
		this.field3499 = Math.min(var1, this.field3499 + this.field3495.method7019()); // L: 509
	} // L: 510

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lll;B)V",
		garbageValue = "-73"
	)
	public void method5851(class304 var1) {
		this.field3497 = var1; // L: 513
	} // L: 514

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lll;B)V",
		garbageValue = "-5"
	)
	public void method5864(class304 var1) {
		this.field3501 = var1; // L: 517
	} // L: 518

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "1262168662"
	)
	public class375 method5865() {
		return this.field3495; // L: 521
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "2112515776"
	)
	public class375 method5866() {
		return this.field3482; // L: 525
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)Lon;",
		garbageValue = "1325696613"
	)
	public class379 method5867() {
		return this.field3495.method7007(this.field3479, this.field3490); // L: 529
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-549820891"
	)
	public boolean method5955() {
		return this.field3475; // L: 533
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "3"
	)
	public boolean method5933() {
		return this.field3484; // L: 537
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-71"
	)
	public boolean method5870() {
		return this.method5955() && this.field3485 % 60 < 30; // L: 541
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1567314781"
	)
	public int method5871() {
		return this.field3490; // L: 545
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "752181260"
	)
	public int method6029() {
		return this.field3479; // L: 549
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-435556851"
	)
	public boolean method5873() {
		return this.field3486; // L: 553
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "875824176"
	)
	public int method5874() {
		return this.field3498; // L: 557
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "151655806"
	)
	public int method5958() {
		return this.field3499; // L: 561
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1709224599"
	)
	public int method5876() {
		return this.field3495.method7022(); // L: 565
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-50256780"
	)
	public int method5818() {
		return this.field3495.method7057(); // L: 569
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-250886570"
	)
	public int method5880() {
		return this.field3500; // L: 573
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	public int method5879() {
		return this.field3487; // L: 577
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1805162168"
	)
	public int method5913() {
		return this.field3495.method7024(); // L: 581
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "29919"
	)
	public int method5881() {
		return this.field3489; // L: 585
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1565778570"
	)
	public int method5943() {
		return this.field3495.method7106(); // L: 589
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2045196166"
	)
	public boolean method5893() {
		return this.method5818() > 1; // L: 593
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2138172639"
	)
	boolean method5884() {
		return this.field3479 != this.field3490; // L: 597
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1725028844"
	)
	String method5844(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length()); // L: 601

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 602
			char var4 = var1.charAt(var3); // L: 603
			if (this.method5817(var4)) { // L: 604
				var2.append(var4); // L: 605
			}
		}

		return var2.toString(); // L: 608
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Lrv;Lrv;I)V",
		garbageValue = "-418592345"
	)
	void method5949(class451 var1, class451 var2) {
		if ((Integer)var2.field4798 < (Integer)var1.field4798) { // L: 612
			this.method5841((Integer)var1.field4799, (Integer)var2.field4798); // L: 613
		} else {
			this.method5841((Integer)var1.field4798, (Integer)var2.field4799); // L: 616
		}

	} // L: 618

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrv;",
		garbageValue = "-68"
	)
	class451 method5887(int var1) {
		int var2 = this.field3495.method6998(); // L: 621
		int var3 = 0; // L: 622
		int var4 = var2; // L: 623

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 624
			if (this.method5992(this.field3495.method7118(var5 - 1).field4380)) { // L: 625
				var3 = var5; // L: 626
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 630
			if (this.method5992(this.field3495.method7118(var5).field4380)) { // L: 631
				var4 = var5; // L: 632
				break;
			}
		}

		return new class451(var3, var4); // L: 636
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrv;",
		garbageValue = "61"
	)
	class451 method5888(int var1) {
		int var2 = this.field3495.method6998(); // L: 640
		int var3 = 0; // L: 641
		int var4 = var2; // L: 642

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 643
			if (this.field3495.method7118(var5 - 1).field4380 == '\n') { // L: 644
				var3 = var5; // L: 645
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 649
			if (this.field3495.method7118(var5).field4380 == '\n') { // L: 650
				var4 = var5; // L: 651
				break;
			}
		}

		return new class451(var3, var4); // L: 655
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	boolean method5889() {
		if (!this.method5873()) { // L: 659
			return false;
		} else {
			boolean var1 = false; // L: 660
			if (this.field3495.method6998() > this.field3500) { // L: 661
				this.field3495.method7031(this.field3500, this.field3495.method6998()); // L: 662
				var1 = true; // L: 663
			}

			int var2 = this.method5818(); // L: 665
			int var3;
			if (this.field3495.method7020() > var2) { // L: 666
				var3 = this.field3495.method7016(0, var2) - 1; // L: 667
				this.field3495.method7031(var3, this.field3495.method6998()); // L: 668
				var1 = true; // L: 669
			}

			if (var1) { // L: 671
				var3 = this.field3490; // L: 672
				int var4 = this.field3479; // L: 673
				int var5 = this.field3495.method6998(); // L: 674
				if (this.field3490 > var5) { // L: 675
					var3 = var5; // L: 676
				}

				if (this.field3479 > var5) { // L: 678
					var4 = var5; // L: 679
				}

				this.method5841(var4, var3); // L: 681
			}

			return var1; // L: 683
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-838795897"
	)
	void method5890(int var1, boolean var2) {
		if (var2) { // L: 687
			this.method5841(this.field3479, var1);
		} else {
			this.method5841(var1, var1); // L: 688
		}

	} // L: 689

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "3157"
	)
	int method6082() {
		return this.field3483 / this.field3495.method7019(); // L: 692
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2005598872"
	)
	void method6002() {
		class379 var1 = this.field3495.method7007(0, this.field3490); // L: 696
		class451 var2 = var1.method7268(); // L: 697
		int var3 = this.field3495.method7019(); // L: 698
		int var4 = (Integer)var2.field4798 - 10; // L: 699
		int var5 = var4 + 20; // L: 700
		int var6 = (Integer)var2.field4799 - 3; // L: 701
		int var7 = var6 + var3 + 6; // L: 702
		int var8 = this.field3498; // L: 703
		int var9 = var8 + this.field3496; // L: 704
		int var10 = this.field3499; // L: 705
		int var11 = var10 + this.field3483; // L: 706
		int var12 = this.field3498; // L: 707
		int var13 = this.field3499; // L: 708
		if (var4 < var8) { // L: 709
			var12 = var4; // L: 710
		} else if (var5 > var9) { // L: 712
			var12 = var5 - this.field3496; // L: 713
		}

		if (var6 < var10) { // L: 715
			var13 = var6; // L: 716
		} else if (var7 > var11) { // L: 718
			var13 = var7 - this.field3483; // L: 719
		}

		this.method5826(var12, var13); // L: 721
	} // L: 722

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "85"
	)
	boolean method5992(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9; // L: 725
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "14181552"
	)
	void method5894() {
		if (this.field3497 != null) { // L: 729
			this.field3497.vmethod5776(); // L: 730
		}

	} // L: 732

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "15719519"
	)
	boolean method5817(int var1) {
		switch(this.field3489) { // L: 735
		case 1:
			return PlayerComposition.isAlphaNumeric((char)var1); // L: 739
		case 2:
			return ArchiveDiskAction.isCharAlphabetic((char)var1); // L: 752
		case 3:
			return KeyHandler.isDigit((char)var1); // L: 737
		case 4:
			char var2 = (char)var1; // L: 743
			if (KeyHandler.isDigit(var2)) { // L: 744
				return true; // L: 745
			} else {
				if (var2 != 'k' && var2 != 'K' && var2 != 'm' && var2 != 'M' && var2 != 'b' && var2 != 'B') { // L: 747
					return false; // L: 750
				}

				return true; // L: 748
			}
		default:
			return true; // L: 741
		}
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(B)Lrv;",
		garbageValue = "9"
	)
	class451 method5896() {
		int var1 = this.field3495.method7069(this.field3496); // L: 757
		int var2 = this.field3495.method7033(this.field3483); // L: 758
		return new class451(var1, var2); // L: 759
	}
}
