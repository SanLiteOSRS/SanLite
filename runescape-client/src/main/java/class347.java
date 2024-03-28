import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nf")
public class class347 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	class414 field3704;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	class414 field3705;
	@ObfuscatedName("av")
	boolean field3720;
	@ObfuscatedName("aa")
	boolean field3707;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 633818209
	)
	int field3708;
	@ObfuscatedName("am")
	boolean field3709;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1416549249
	)
	int field3710;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 56930121
	)
	int field3711;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1938348531
	)
	int field3712;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -696415297
	)
	int field3713;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1342328083
	)
	int field3714;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1505266767
	)
	int field3715;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1269111487
	)
	int field3703;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -739586287
	)
	int field3699;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 995068293
	)
	int field3718;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1873962829
	)
	int field3719;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -54602861
	)
	int field3717;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 678412027
	)
	int field3706;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1843053071
	)
	int field3722;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	class339 field3723;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	class339 field3724;

	class347() {
		this.field3704 = new class414(); // L: 32
		this.field3705 = new class414(); // L: 33
		this.field3720 = false; // L: 34
		this.field3707 = true; // L: 35
		this.field3708 = 0; // L: 36
		this.field3709 = false; // L: 37
		this.field3710 = 0; // L: 38
		this.field3711 = 0; // L: 39
		this.field3712 = 0; // L: 40
		this.field3713 = 0; // L: 41
		this.field3714 = 0; // L: 42
		this.field3715 = 0; // L: 43
		this.field3703 = 0; // L: 44
		this.field3699 = Integer.MAX_VALUE; // L: 45
		this.field3718 = Integer.MAX_VALUE; // L: 46
		this.field3719 = 0; // L: 47
		this.field3717 = 0; // L: 48
		this.field3706 = 0; // L: 49
		this.field3722 = 0; // L: 50
		this.field3704.method7519(1); // L: 55
		this.field3705.method7519(1); // L: 56
	} // L: 57

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "128"
	)
	void method6575() {
		this.field3708 = (this.field3708 + 1) % 60; // L: 60
		if (this.field3703 > 0) { // L: 61
			--this.field3703; // L: 62
		}

	} // L: 64

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-8"
	)
	public boolean method6486(boolean var1) {
		var1 = var1 && this.field3707; // L: 67
		boolean var2 = this.field3720 != var1; // L: 68
		this.field3720 = var1; // L: 69
		if (!this.field3720) { // L: 70
			this.method6388(this.field3713, this.field3713); // L: 71
		}

		return var2; // L: 73
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2094488853"
	)
	public void method6365(boolean var1) {
		this.field3707 = var1; // L: 77
		this.field3720 = var1 && this.field3720; // L: 78
	} // L: 79

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "412370921"
	)
	public boolean method6366(String var1) {
		String var2 = this.field3704.method7539(); // L: 82
		if (!var2.equals(var1)) { // L: 83
			var1 = this.method6565(var1); // L: 84
			this.field3704.method7531(var1); // L: 85
			this.method6388(this.field3714, this.field3713); // L: 86
			this.method6373(this.field3706, this.field3722); // L: 87
			this.method6621(); // L: 88
			this.method6441(); // L: 89
			return true; // L: 90
		} else {
			return false; // L: 92
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1425302395"
	)
	boolean method6367(String var1) {
		this.field3705.method7531(var1); // L: 96
		return true; // L: 97
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lqu;I)Z",
		garbageValue = "-1587619498"
	)
	boolean method6368(AbstractFont var1) {
		boolean var2 = !this.field3709; // L: 101
		this.field3704.method7518(var1); // L: 102
		this.field3705.method7518(var1); // L: 103
		this.field3709 = true; // L: 104
		var2 |= this.method6373(this.field3706, this.field3722); // L: 105
		var2 |= this.method6388(this.field3714, this.field3713); // L: 106
		if (this.method6621()) { // L: 107
			this.method6441(); // L: 108
			var2 = true; // L: 109
		}

		return var2; // L: 111
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1248509963"
	)
	public boolean method6369(int var1, int var2) {
		boolean var3 = this.field3719 != var1 || var2 != this.field3717; // L: 115
		this.field3719 = var1; // L: 116
		this.field3717 = var2; // L: 117
		var3 |= this.method6373(this.field3706, this.field3722); // L: 118
		return var3; // L: 119
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1757451957"
	)
	public boolean method6370(int var1) {
		if (var1 < 0) { // L: 123
			var1 = Integer.MAX_VALUE; // L: 124
		}

		boolean var2 = var1 == this.field3704.method7537(); // L: 126
		this.field3704.method7515(var1); // L: 127
		this.field3705.method7515(var1); // L: 128
		if (this.method6621()) { // L: 129
			this.method6441(); // L: 130
			var2 = true; // L: 131
		}

		return var2; // L: 133
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1759905487"
	)
	public boolean method6390(int var1) {
		this.field3704.method7560(var1); // L: 137
		if (this.method6621()) { // L: 138
			this.method6441(); // L: 139
			return true; // L: 140
		} else {
			return false; // L: 142
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1885012973"
	)
	public boolean method6520(int var1) {
		this.field3718 = var1; // L: 146
		if (this.method6621()) { // L: 147
			this.method6441(); // L: 148
			return true; // L: 149
		} else {
			return false; // L: 151
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2053073056"
	)
	public boolean method6373(int var1, int var2) {
		if (!this.method6513()) { // L: 155
			this.field3706 = var1; // L: 156
			this.field3722 = var2; // L: 157
			return false; // L: 158
		} else {
			int var3 = this.field3706; // L: 160
			int var4 = this.field3722; // L: 161
			int var5 = Math.max(0, this.field3704.method7532() - this.field3719 + 2); // L: 162
			int var6 = Math.max(0, this.field3704.method7533() - this.field3717 + 1); // L: 163
			this.field3706 = Math.max(0, Math.min(var5, var1)); // L: 164
			this.field3722 = Math.max(0, Math.min(var6, var2)); // L: 165
			return var3 != this.field3706 || var4 != this.field3722; // L: 166
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2108697040"
	)
	public boolean method6374(int var1, int var2) {
		boolean var3 = true; // L: 170
		if (var1 < 0 || var1 > 2) { // L: 171
			var3 = false; // L: 172
		}

		if (var2 < 0 || var2 > 2) { // L: 174
			var3 = false; // L: 175
		}

		return var3 ? this.field3704.method7520(var1, var2) : false; // L: 177 178 180
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-36"
	)
	public void method6375(int var1) {
		this.field3704.method7514(var1); // L: 184
	} // L: 185

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "949948744"
	)
	public void method6376(int var1) {
		this.field3710 = var1; // L: 188
	} // L: 189

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "14"
	)
	public void method6377(int var1) {
		this.field3704.method7519(var1); // L: 192
	} // L: 193

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-8"
	)
	public void method6465(int var1) {
		this.field3704.method7618(var1); // L: 196
	} // L: 197

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1787858640"
	)
	public boolean method6379(int var1) {
		this.field3712 = var1; // L: 200
		String var2 = this.field3704.method7539(); // L: 201
		int var3 = var2.length(); // L: 202
		var2 = this.method6565(var2); // L: 203
		if (var2.length() != var3) { // L: 204
			this.field3704.method7531(var2); // L: 205
			this.method6373(this.field3706, this.field3722); // L: 206
			this.method6621(); // L: 207
			this.method6441(); // L: 208
			return true; // L: 209
		} else {
			return false; // L: 211
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1992125382"
	)
	public void method6380() {
		this.field3709 = false; // L: 215
	} // L: 216

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1906586043"
	)
	public boolean method6404(int var1) {
		if (this.method6463(var1)) { // L: 219
			this.method6460(); // L: 220
			class415 var2 = this.field3704.method7523((char)var1, this.field3713, this.field3699); // L: 221
			this.method6388(var2.method7647(), var2.method7647()); // L: 222
			this.method6621(); // L: 223
			this.method6441(); // L: 224
		}

		return true; // L: 226
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1262687164"
	)
	public void method6382() {
		if (!this.method6460() && this.field3713 > 0) { // L: 230
			int var1 = this.field3704.method7579(this.field3713 - 1); // L: 231
			this.method6441(); // L: 232
			this.method6388(var1, var1); // L: 233
		}

	} // L: 235

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1439316077"
	)
	public void method6383() {
		if (!this.method6460() && this.field3713 < this.field3704.method7513()) { // L: 238
			int var1 = this.field3704.method7579(this.field3713); // L: 239
			this.method6441(); // L: 240
			this.method6388(var1, var1); // L: 241
		}

	} // L: 243

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-113"
	)
	public void method6384() {
		if (!this.method6460() && this.field3713 > 0) { // L: 246
			class505 var1 = this.method6434(this.field3713 - 1); // L: 247
			int var2 = this.field3704.method7529((Integer)var1.field5090, this.field3713); // L: 248
			this.method6441(); // L: 249
			this.method6388(var2, var2); // L: 250
		}

	} // L: 252

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "663917"
	)
	public void method6385() {
		if (!this.method6460() && this.field3713 < this.field3704.method7513()) { // L: 255
			class505 var1 = this.method6434(this.field3713); // L: 256
			int var2 = this.field3704.method7529(this.field3713, (Integer)var1.field5089); // L: 257
			this.method6441(); // L: 258
			this.method6388(var2, var2); // L: 259
		}

	} // L: 261

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2018454978"
	)
	boolean method6460() {
		if (!this.method6381()) { // L: 264
			return false;
		} else {
			int var1 = this.field3704.method7529(this.field3714, this.field3713); // L: 265
			this.method6441(); // L: 266
			this.method6388(var1, var1); // L: 267
			return true; // L: 268
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "880872164"
	)
	public void method6387() {
		this.method6388(0, this.field3704.method7513()); // L: 272
	} // L: 273

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-765314180"
	)
	public boolean method6388(int var1, int var2) {
		if (!this.method6513()) { // L: 276
			this.field3714 = var1; // L: 277
			this.field3713 = var2; // L: 278
			return false; // L: 279
		} else {
			if (var1 > this.field3704.method7513()) { // L: 281
				var1 = this.field3704.method7513(); // L: 282
			}

			if (var2 > this.field3704.method7513()) { // L: 284
				var2 = this.field3704.method7513(); // L: 285
			}

			boolean var3 = this.field3714 != var1 || var2 != this.field3713; // L: 287
			this.field3714 = var1; // L: 288
			if (var2 != this.field3713) { // L: 289
				this.field3713 = var2; // L: 290
				this.field3708 = 0; // L: 291
				this.method6439(); // L: 292
			}

			if (var3 && this.field3724 != null) { // L: 294 295
				this.field3724.vmethod6279(); // L: 296
			}

			return var3; // L: 299
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2000894436"
	)
	public void method6389(boolean var1) {
		class505 var2 = this.method6435(this.field3713); // L: 303
		this.method6437((Integer)var2.field5090, var1); // L: 304
	} // L: 305

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "9"
	)
	public void method6419(boolean var1) {
		class505 var2 = this.method6435(this.field3713); // L: 308
		this.method6437((Integer)var2.field5089, var1); // L: 309
	} // L: 310

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1722616829"
	)
	public void method6391(boolean var1) {
		this.method6437(0, var1); // L: 313
	} // L: 314

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1551964769"
	)
	public void method6502(boolean var1) {
		this.method6437(this.field3704.method7513(), var1); // L: 317
	} // L: 318

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-116018656"
	)
	public void method6393(boolean var1) {
		if (this.method6381() && !var1) { // L: 321
			this.method6437(Math.min(this.field3714, this.field3713), var1); // L: 322
		} else if (this.field3713 > 0) { // L: 324
			this.method6437(this.field3713 - 1, var1); // L: 325
		}

	} // L: 327

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "10"
	)
	public void method6487(boolean var1) {
		if (this.method6381() && !var1) { // L: 330
			this.method6437(Math.max(this.field3714, this.field3713), var1); // L: 331
		} else if (this.field3713 < this.field3704.method7513()) { // L: 333
			this.method6437(this.field3713 + 1, var1); // L: 334
		}

	} // L: 336

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "32"
	)
	public void method6558(boolean var1) {
		if (this.field3713 > 0) { // L: 339
			class505 var2 = this.method6434(this.field3713 - 1); // L: 340
			this.method6437((Integer)var2.field5090, var1); // L: 341
		}

	} // L: 343

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2143687715"
	)
	public void method6396(boolean var1) {
		if (this.field3713 < this.field3704.method7513()) { // L: 346
			class505 var2 = this.method6434(this.field3713 + 1); // L: 347
			this.method6437((Integer)var2.field5089, var1); // L: 348
		}

	} // L: 350

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1143277370"
	)
	public void method6415(boolean var1) {
		if (this.field3713 > 0) { // L: 353
			this.method6437(this.field3704.method7601(this.field3713, -1), var1); // L: 354
		}

	} // L: 356

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1865829578"
	)
	public void method6398(boolean var1) {
		if (this.field3713 < this.field3704.method7513()) { // L: 359
			this.method6437(this.field3704.method7601(this.field3713, 1), var1); // L: 360
		}

	} // L: 362

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-90655933"
	)
	public void method6399(boolean var1) {
		if (this.field3713 > 0) { // L: 365
			int var2 = this.method6421(); // L: 366
			this.method6437(this.field3704.method7601(this.field3713, -var2), var1); // L: 367
		}

	} // L: 369

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-2"
	)
	public void method6400(boolean var1) {
		if (this.field3713 < this.field3704.method7513()) { // L: 372
			int var2 = this.method6421(); // L: 373
			this.method6437(this.field3704.method7601(this.field3713, var2), var1); // L: 374
		}

	} // L: 376

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-7"
	)
	public void method6444(boolean var1) {
		class418 var2 = this.field3704.method7522(0, this.field3713); // L: 379
		class505 var3 = var2.method7768(); // L: 380
		this.method6437(this.field3704.method7587((Integer)var3.field5090, this.field3722), var1); // L: 381
	} // L: 382

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-2"
	)
	public void method6402(boolean var1) {
		class418 var2 = this.field3704.method7522(0, this.field3713); // L: 385
		class505 var3 = var2.method7768(); // L: 386
		this.method6437(this.field3704.method7587((Integer)var3.field5090, this.field3722 + this.field3717), var1); // L: 387
	} // L: 388

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-1786925884"
	)
	public void method6403(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false; // L: 391
		class505 var6;
		int var8;
		if (!this.field3709) { // L: 392
			var8 = 0; // L: 393
		} else {
			var1 += this.field3706; // L: 396
			var2 += this.field3722; // L: 397
			var6 = this.method6443(); // L: 398
			var8 = this.field3704.method7587(var1 - (Integer)var6.field5090, var2 - (Integer)var6.field5089); // L: 399
		}

		if (var3 && var4) { // L: 401
			this.field3711 = 1; // L: 402
			var6 = this.method6434(var8); // L: 403
			class505 var7 = this.method6434(this.field3715); // L: 404
			this.method6433(var7, var6); // L: 405
		} else if (var3) { // L: 407
			this.field3711 = 1; // L: 408
			var6 = this.method6434(var8); // L: 409
			this.method6388((Integer)var6.field5090, (Integer)var6.field5089); // L: 410
			this.field3715 = (Integer)var6.field5090; // L: 411
		} else if (var4) { // L: 413
			this.method6388(this.field3715, var8); // L: 414
		} else {
			if (this.field3703 > 0 && var8 == this.field3715) { // L: 417
				if (this.field3714 == this.field3713) { // L: 418
					this.field3711 = 1; // L: 419
					var6 = this.method6434(var8); // L: 420
					this.method6388((Integer)var6.field5090, (Integer)var6.field5089); // L: 421
				} else {
					this.field3711 = 2; // L: 424
					var6 = this.method6435(var8); // L: 425
					this.method6388((Integer)var6.field5090, (Integer)var6.field5089); // L: 426
				}
			} else {
				this.field3711 = 0; // L: 430
				this.method6388(var8, var8); // L: 431
				this.field3715 = var8; // L: 432
			}

			this.field3703 = 25; // L: 434
		}

	} // L: 436

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "36"
	)
	public void method6395(int var1, int var2) {
		if (this.field3709 && this.method6459()) { // L: 439
			var1 += this.field3706; // L: 440
			var2 += this.field3722; // L: 441
			class505 var3 = this.method6443(); // L: 442
			int var4 = this.field3704.method7587(var1 - (Integer)var3.field5090, var2 - (Integer)var3.field5089); // L: 443
			class505 var5;
			class505 var6;
			switch(this.field3711) { // L: 444
			case 0:
				this.method6388(this.field3714, var4); // L: 454
				break; // L: 455
			case 1:
				var5 = this.method6434(this.field3715); // L: 447
				var6 = this.method6434(var4); // L: 448
				this.method6433(var5, var6); // L: 449
				break;
			case 2:
				var5 = this.method6435(this.field3715); // L: 459
				var6 = this.method6435(var4); // L: 460
				this.method6433(var5, var6); // L: 461
			}
		}

	} // L: 466

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-979681908"
	)
	public void method6405(Clipboard var1) {
		class418 var2 = this.field3704.method7522(this.field3714, this.field3713); // L: 469
		if (!var2.method7783()) { // L: 470
			String var3 = var2.method7763(); // L: 471
			if (!var3.isEmpty()) { // L: 472
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null); // L: 473
			}
		}

	} // L: 476

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "1627324748"
	)
	public void method6420(Clipboard var1) {
		if (this.method6381()) { // L: 479
			this.method6405(var1); // L: 480
			this.method6460(); // L: 481
		}

	} // L: 483

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1956126753"
	)
	public void method6518(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null); // L: 486
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) { // L: 487
			try {
				String var3 = this.method6565((String)var2.getTransferData(DataFlavor.stringFlavor)); // L: 489
				this.method6460(); // L: 490
				class415 var4 = this.field3704.method7524(var3, this.field3713, this.field3699); // L: 491
				this.method6388(var4.method7647(), var4.method7647()); // L: 492
				this.method6621(); // L: 493
				this.method6441(); // L: 494
			} catch (Exception var5) { // L: 496
			}
		}

	} // L: 498

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1264919921"
	)
	public void method6591() {
		this.field3722 = Math.max(0, this.field3722 - this.field3704.method7511()); // L: 501
	} // L: 502

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-26997525"
	)
	public void method6401() {
		int var1 = Math.max(0, this.field3704.method7533() - this.field3717); // L: 505
		this.field3722 = Math.min(var1, this.field3722 + this.field3704.method7511()); // L: 506
	} // L: 507

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I)V",
		garbageValue = "182286842"
	)
	public void method6410(class339 var1) {
		this.field3723 = var1; // L: 510
	} // L: 511

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I)V",
		garbageValue = "2061492133"
	)
	public void method6411(class339 var1) {
		this.field3724 = var1; // L: 514
	} // L: 515

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)Lpl;",
		garbageValue = "-43"
	)
	public class414 method6412() {
		return this.field3704; // L: 518
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Lpl;",
		garbageValue = "2055669649"
	)
	public class414 method6413() {
		return this.field3705; // L: 522
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)Lqs;",
		garbageValue = "1"
	)
	public class418 method6431() {
		return this.field3704.method7522(this.field3714, this.field3713); // L: 526
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "7"
	)
	public boolean method6459() {
		return this.field3720; // L: 530
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2058642585"
	)
	public boolean method6416() {
		return this.field3707; // L: 534
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "6888321"
	)
	public boolean method6616() {
		return this.method6459() && this.field3708 % 60 < 30; // L: 538
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method6510() {
		return this.field3713; // L: 542
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2029522419"
	)
	public int method6559() {
		return this.field3714; // L: 546
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "105"
	)
	public boolean method6513() {
		return this.field3709; // L: 550
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-861544381"
	)
	public int method6473() {
		return this.field3706; // L: 554
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1585413102"
	)
	public int method6422() {
		return this.field3722; // L: 558
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1679889553"
	)
	public int method6423() {
		return this.field3704.method7537(); // L: 562
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-762480006"
	)
	public int method6424() {
		return this.field3704.method7642(); // L: 566
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1982517099"
	)
	public int method6425() {
		return this.field3718; // L: 570
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "5"
	)
	public int method6574() {
		return this.field3710; // L: 574
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1168571052"
	)
	public int method6427() {
		return this.field3704.method7540(); // L: 578
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "11471171"
	)
	public int method6428() {
		return this.field3712; // L: 582
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1121128681"
	)
	public int method6429() {
		return this.field3704.method7534(); // L: 586
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-35"
	)
	public boolean method6430() {
		return this.method6424() > 1; // L: 590
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "15"
	)
	boolean method6381() {
		return this.field3713 != this.field3714; // L: 594
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1456061272"
	)
	String method6565(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length()); // L: 598

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 599
			char var4 = var1.charAt(var3); // L: 600
			if (this.method6463(var4)) { // L: 601
				var2.append(var4); // L: 602
			}
		}

		return var2.toString(); // L: 605
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Ltd;Ltd;B)V",
		garbageValue = "114"
	)
	void method6433(class505 var1, class505 var2) {
		if ((Integer)var2.field5090 < (Integer)var1.field5090) { // L: 609
			this.method6388((Integer)var1.field5089, (Integer)var2.field5090); // L: 610
		} else {
			this.method6388((Integer)var1.field5090, (Integer)var2.field5089); // L: 613
		}

	} // L: 615

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltd;",
		garbageValue = "1"
	)
	class505 method6434(int var1) {
		int var2 = this.field3704.method7513(); // L: 618
		int var3 = 0; // L: 619
		int var4 = var2; // L: 620

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 621
			if (this.method6440(this.field3704.method7509(var5 - 1).field4607)) { // L: 622
				var3 = var5; // L: 623
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 627
			if (this.method6440(this.field3704.method7509(var5).field4607)) { // L: 628
				var4 = var5; // L: 629
				break;
			}
		}

		return new class505(var3, var4); // L: 633
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(II)Ltd;",
		garbageValue = "-1223506802"
	)
	class505 method6435(int var1) {
		int var2 = this.field3704.method7513(); // L: 637
		int var3 = 0; // L: 638
		int var4 = var2; // L: 639

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 640
			if (this.field3704.method7509(var5 - 1).field4607 == '\n') { // L: 641
				var3 = var5; // L: 642
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 646
			if (this.field3704.method7509(var5).field4607 == '\n') { // L: 647
				var4 = var5; // L: 648
				break;
			}
		}

		return new class505(var3, var4); // L: 652
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "161244868"
	)
	boolean method6621() {
		if (!this.method6513()) { // L: 656
			return false;
		} else {
			boolean var1 = false; // L: 657
			if (this.field3704.method7513() > this.field3718) { // L: 658
				this.field3704.method7529(this.field3718, this.field3704.method7513()); // L: 659
				var1 = true; // L: 660
			}

			int var2 = this.method6424(); // L: 662
			int var3;
			if (this.field3704.method7535() > var2) { // L: 663
				var3 = this.field3704.method7601(0, var2) - 1; // L: 664
				this.field3704.method7529(var3, this.field3704.method7513()); // L: 665
				var1 = true; // L: 666
			}

			if (var1) { // L: 668
				var3 = this.field3713; // L: 669
				int var4 = this.field3714; // L: 670
				int var5 = this.field3704.method7513(); // L: 671
				if (this.field3713 > var5) { // L: 672
					var3 = var5; // L: 673
				}

				if (this.field3714 > var5) { // L: 675
					var4 = var5; // L: 676
				}

				this.method6388(var4, var3); // L: 678
			}

			return var1; // L: 680
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(IZS)V",
		garbageValue = "1011"
	)
	void method6437(int var1, boolean var2) {
		if (var2) { // L: 684
			this.method6388(this.field3714, var1);
		} else {
			this.method6388(var1, var1); // L: 685
		}

	} // L: 686

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1898461256"
	)
	int method6421() {
		return this.field3717 / this.field3704.method7511(); // L: 689
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "13"
	)
	void method6439() {
		class418 var1 = this.field3704.method7522(0, this.field3713); // L: 693
		class505 var2 = var1.method7768(); // L: 694
		int var3 = this.field3704.method7511(); // L: 695
		int var4 = (Integer)var2.field5090 - 10; // L: 696
		int var5 = var4 + 20; // L: 697
		int var6 = (Integer)var2.field5089 - 3; // L: 698
		int var7 = var3 + var6 + 6; // L: 699
		int var8 = this.field3706; // L: 700
		int var9 = var8 + this.field3719; // L: 701
		int var10 = this.field3722; // L: 702
		int var11 = var10 + this.field3717; // L: 703
		int var12 = this.field3706; // L: 704
		int var13 = this.field3722; // L: 705
		if (var4 < var8) { // L: 706
			var12 = var4; // L: 707
		} else if (var5 > var9) { // L: 709
			var12 = var5 - this.field3719; // L: 710
		}

		if (var6 < var10) { // L: 712
			var13 = var6; // L: 713
		} else if (var7 > var11) { // L: 715
			var13 = var7 - this.field3717; // L: 716
		}

		this.method6373(var12, var13); // L: 718
	} // L: 719

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-836467031"
	)
	boolean method6440(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9; // L: 722
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "235053595"
	)
	void method6441() {
		if (this.field3723 != null) { // L: 726
			this.field3723.vmethod6279(); // L: 727
		}

	} // L: 729

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1455554406"
	)
	boolean method6463(int var1) {
		switch(this.field3712) { // L: 732
		case 1:
			return class210.isAlphaNumeric((char)var1); // L: 749
		case 2:
			return UserComparator10.isCharAlphabetic((char)var1); // L: 743
		case 3:
			return class384.isDigit((char)var1); // L: 747
		case 4:
			char var2 = (char)var1; // L: 734
			if (class384.isDigit(var2)) { // L: 735
				return true; // L: 736
			} else {
				if (var2 != 'k' && var2 != 'K' && var2 != 'm' && var2 != 'M' && var2 != 'b' && var2 != 'B') { // L: 738
					return false; // L: 741
				}

				return true; // L: 739
			}
		default:
			return true; // L: 745
		}
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)Ltd;",
		garbageValue = "1550358867"
	)
	class505 method6443() {
		int var1 = this.field3704.method7549(this.field3719); // L: 754
		int var2 = this.field3704.method7542(this.field3717); // L: 755
		return new class505(var1, var2); // L: 756
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-1629885069"
	)
	static int method6642(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 4753
			var3 = class172.Client_plane; // L: 4754
			int var15 = GrandExchangeOfferOwnWorldComparator.baseX * 64 + (class133.localPlayer.x >> 7); // L: 4755
			int var8 = DevicePcmPlayerProvider.baseY * 64 + (class133.localPlayer.y >> 7); // L: 4756
			MouseRecorder.getWorldMap().method8719(var3, var15, var8, true); // L: 4757
			return 1; // L: 4758
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 4760
				var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4761
				String var16 = ""; // L: 4762
				var9 = MouseRecorder.getWorldMap().getMapArea(var3); // L: 4763
				if (var9 != null) { // L: 4764
					var16 = var9.getExternalName(); // L: 4765
				}

				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var16; // L: 4767
				return 1; // L: 4768
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 4770
				var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4771
				MouseRecorder.getWorldMap().setCurrentMapAreaId(var3); // L: 4772
				return 1; // L: 4773
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 4775
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = MouseRecorder.getWorldMap().getZoomLevel(); // L: 4776
				return 1; // L: 4777
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 4779
				var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4780
				MouseRecorder.getWorldMap().setZoomPercentage(var3); // L: 4781
				return 1; // L: 4782
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 4784
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = MouseRecorder.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 4785
				return 1; // L: 4786
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 4788
					var14 = new Coord(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 4789
					MouseRecorder.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 4790
					return 1; // L: 4791
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 4793
					var14 = new Coord(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 4794
					MouseRecorder.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 4795
					return 1; // L: 4796
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 4798
					var14 = new Coord(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 4799
					MouseRecorder.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 4800
					return 1; // L: 4801
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 4803
					var14 = new Coord(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 4804
					MouseRecorder.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 4805
					return 1; // L: 4806
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 4808
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = MouseRecorder.getWorldMap().getDisplayX(); // L: 4809
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = MouseRecorder.getWorldMap().getDisplayY(); // L: 4810
					return 1; // L: 4811
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 4813
						var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4814
						var11 = MouseRecorder.getWorldMap().getMapArea(var3); // L: 4815
						if (var11 == null) { // L: 4816
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4817
						} else {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 4820
						}

						return 1; // L: 4822
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 4824
						var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4825
						var11 = MouseRecorder.getWorldMap().getMapArea(var3); // L: 4826
						if (var11 == null) { // L: 4827
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4828
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4829
						} else {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 4832
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 4833
						}

						return 1; // L: 4835
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 4837
						var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4838
						var11 = MouseRecorder.getWorldMap().getMapArea(var3); // L: 4839
						if (var11 == null) { // L: 4840
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4841
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4842
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4843
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4844
						} else {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4847
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4848
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4849
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4850
						}

						return 1; // L: 4852
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4854
						var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4855
						var11 = MouseRecorder.getWorldMap().getMapArea(var3); // L: 4856
						if (var11 == null) { // L: 4857
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 4858
						} else {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4861
						}

						return 1; // L: 4863
					} else if (var0 == 6615) { // L: 4865
						var14 = MouseRecorder.getWorldMap().getDisplayCoord(); // L: 4866
						if (var14 == null) { // L: 4867
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 4868
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 4869
						} else {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var14.x; // L: 4872
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var14.y; // L: 4873
						}

						return 1; // L: 4875
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4877
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = MouseRecorder.getWorldMap().currentMapAreaId(); // L: 4878
						return 1; // L: 4879
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4881
						var14 = new Coord(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 4882
						var11 = MouseRecorder.getWorldMap().getCurrentMapArea(); // L: 4883
						if (var11 == null) { // L: 4884
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 4885
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 4886
							return 1; // L: 4887
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4889
							if (var12 == null) { // L: 4890
								Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 4891
								Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 4892
							} else {
								Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var12[0]; // L: 4895
								Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var12[1]; // L: 4896
							}

							return 1; // L: 4898
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4900
							var14 = new Coord(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 4901
							var11 = MouseRecorder.getWorldMap().getCurrentMapArea(); // L: 4902
							if (var11 == null) { // L: 4903
								Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 4904
								Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 4905
								return 1; // L: 4906
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4908
								if (var5 == null) { // L: 4909
									Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 4910
								} else {
									Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var5.packed(); // L: 4913
								}

								return 1; // L: 4915
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4917
								class19.Interpreter_intStackSize -= 2; // L: 4918
								var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 4919
								var10 = new Coord(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]); // L: 4920
								FileSystem.method3537(var3, var10, false); // L: 4921
								return 1; // L: 4922
							} else if (var0 == 6620) { // L: 4924
								class19.Interpreter_intStackSize -= 2; // L: 4925
								var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 4926
								var10 = new Coord(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]); // L: 4927
								FileSystem.method3537(var3, var10, true); // L: 4928
								return 1; // L: 4929
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4931
								class19.Interpreter_intStackSize -= 2; // L: 4932
								var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 4933
								var10 = new Coord(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]); // L: 4934
								var9 = MouseRecorder.getWorldMap().getMapArea(var3); // L: 4935
								if (var9 == null) { // L: 4936
									Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4937
									return 1; // L: 4938
								} else {
									Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4940
									return 1; // L: 4941
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4943
								Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = MouseRecorder.getWorldMap().getDisplayWith(); // L: 4944
								Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = MouseRecorder.getWorldMap().getDisplayHeight(); // L: 4945
								return 1; // L: 4946
							} else if (var0 == 6623) { // L: 4948
								var14 = new Coord(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 4949
								var11 = MouseRecorder.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4950
								if (var11 == null) { // L: 4951
									Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 4952
								} else {
									Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var11.getId(); // L: 4955
								}

								return 1; // L: 4957
							} else if (var0 == 6624) { // L: 4959
								MouseRecorder.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 4960
								return 1; // L: 4961
							} else if (var0 == 6625) { // L: 4963
								MouseRecorder.getWorldMap().resetMaxFlashCount(); // L: 4964
								return 1; // L: 4965
							} else if (var0 == 6626) { // L: 4967
								MouseRecorder.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 4968
								return 1; // L: 4969
							} else if (var0 == 6627) { // L: 4971
								MouseRecorder.getWorldMap().resetCyclesPerFlash(); // L: 4972
								return 1; // L: 4973
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4975
									var13 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 4976
									MouseRecorder.getWorldMap().setPerpetualFlash(var13); // L: 4977
									return 1; // L: 4978
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4980
									var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4981
									MouseRecorder.getWorldMap().flashElement(var3); // L: 4982
									return 1; // L: 4983
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4985
									var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4986
									MouseRecorder.getWorldMap().flashCategory(var3); // L: 4987
									return 1; // L: 4988
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4990
									MouseRecorder.getWorldMap().stopCurrentFlashes(); // L: 4991
									return 1; // L: 4992
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4994
									var13 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 4995
									MouseRecorder.getWorldMap().setElementsDisabled(var13); // L: 4996
									return 1; // L: 4997
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4999
										class19.Interpreter_intStackSize -= 2; // L: 5000
										var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 5001
										var7 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1] == 1; // L: 5002
										MouseRecorder.getWorldMap().disableElement(var3, var7); // L: 5003
										return 1; // L: 5004
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 5006
										class19.Interpreter_intStackSize -= 2; // L: 5007
										var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 5008
										var7 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1] == 1; // L: 5009
										MouseRecorder.getWorldMap().setCategoryDisabled(var3, var7); // L: 5010
										return 1; // L: 5011
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 5013
										Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = MouseRecorder.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 5014
										return 1; // L: 5015
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 5017
										var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 5018
										Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = MouseRecorder.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 5019
										return 1; // L: 5020
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 5022
										var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 5023
										Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = MouseRecorder.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 5024
										return 1; // L: 5025
									} else if (var0 == 6638) { // L: 5027
										class19.Interpreter_intStackSize -= 2; // L: 5028
										var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 5029
										var10 = new Coord(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]); // L: 5030
										var5 = MouseRecorder.getWorldMap().method8764(var3, var10); // L: 5031
										if (var5 == null) { // L: 5032
											Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 5033
										} else {
											Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var5.packed(); // L: 5036
										}

										return 1; // L: 5038
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 5040
											var6 = MouseRecorder.getWorldMap().iconStart(); // L: 5041
											if (var6 == null) { // L: 5042
												Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 5043
												Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 5044
											} else {
												Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var6.getElement(); // L: 5047
												Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 5048
											}

											return 1; // L: 5050
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 5052
											var6 = MouseRecorder.getWorldMap().iconNext(); // L: 5053
											if (var6 == null) { // L: 5054
												Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 5055
												Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 5056
											} else {
												Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var6.getElement(); // L: 5059
												Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 5060
											}

											return 1; // L: 5062
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 5064
												var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 5065
												var4 = class340.WorldMapElement_get(var3); // L: 5066
												if (var4.name == null) { // L: 5067
													Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 5068
												} else {
													Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var4.name; // L: 5071
												}

												return 1; // L: 5073
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 5075
												var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 5076
												var4 = class340.WorldMapElement_get(var3); // L: 5077
												Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4.textSize; // L: 5078
												return 1; // L: 5079
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 5081
												var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 5082
												var4 = class340.WorldMapElement_get(var3); // L: 5083
												if (var4 == null) { // L: 5084
													Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 5085
												} else {
													Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4.category; // L: 5088
												}

												return 1; // L: 5090
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 5092
												var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 5093
												var4 = class340.WorldMapElement_get(var3); // L: 5094
												if (var4 == null) { // L: 5095
													Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 5096
												} else {
													Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4.sprite1; // L: 5099
												}

												return 1; // L: 5101
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 5103
												Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Interpreter.worldMapEvent.mapElement; // L: 5104
												return 1; // L: 5105
											} else if (var0 == 6698) { // L: 5107
												Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Interpreter.worldMapEvent.coord1.packed(); // L: 5108
												return 1; // L: 5109
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 5111
												Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Interpreter.worldMapEvent.coord2.packed(); // L: 5112
												return 1; // L: 5113
											} else {
												return 2; // L: 5115
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1405156583"
	)
	public static boolean method6641() {
		return Client.staffModLevel >= 2; // L: 12912
	}
}
