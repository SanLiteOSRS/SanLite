import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
public class class307 {
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "[Lrg;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	class372 field3506;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	class372 field3523;
	@ObfuscatedName("x")
	boolean field3508;
	@ObfuscatedName("a")
	boolean field3509;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2080878637
	)
	int field3510;
	@ObfuscatedName("d")
	boolean field3511;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1251381815
	)
	int field3512;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1587046269
	)
	int field3514;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1718344237
	)
	int field3507;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -177271749
	)
	int field3515;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1303698229
	)
	int field3516;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1196699783
	)
	int field3517;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1407037675
	)
	int field3518;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1330593425
	)
	int field3519;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -246405609
	)
	int field3520;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -816769447
	)
	int field3521;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1954984243
	)
	int field3522;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1183676473
	)
	int field3527;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1081586051
	)
	int field3496;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1305557139
	)
	int field3525;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	class301 field3500;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	class301 field3497;

	class307() {
		this.field3506 = new class372(); // L: 32
		this.field3523 = new class372(); // L: 33
		this.field3508 = false; // L: 34
		this.field3509 = true; // L: 35
		this.field3510 = 0; // L: 36
		this.field3511 = false; // L: 37
		this.field3512 = 0; // L: 38
		this.field3514 = 0; // L: 39
		this.field3507 = 0; // L: 40
		this.field3515 = 0; // L: 41
		this.field3516 = 0; // L: 42
		this.field3517 = 0; // L: 43
		this.field3518 = 0; // L: 44
		this.field3519 = Integer.MAX_VALUE; // L: 45
		this.field3520 = Integer.MAX_VALUE; // L: 46
		this.field3521 = Integer.MAX_VALUE; // L: 47
		this.field3522 = 0; // L: 48
		this.field3527 = 0; // L: 49
		this.field3496 = 0; // L: 50
		this.field3525 = 0; // L: 51
		this.field3506.method7101(1); // L: 56
		this.field3523.method7101(1); // L: 57
	} // L: 58

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-907314219"
	)
	void method5922() {
		this.field3510 = (this.field3510 + 1) % 60; // L: 61
		if (this.field3518 > 0) { // L: 62
			--this.field3518; // L: 63
		}

	} // L: 65

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-101"
	)
	public boolean method6057(boolean var1) {
		var1 = var1 && this.field3509; // L: 68
		boolean var2 = this.field3508 != var1; // L: 69
		this.field3508 = var1; // L: 70
		if (!this.field3508) { // L: 71
			this.method6013(this.field3515, this.field3515); // L: 72
		}

		return var2; // L: 74
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "49231833"
	)
	public void method5924(boolean var1) {
		this.field3509 = var1; // L: 78
		this.field3508 = var1 && this.field3508; // L: 79
	} // L: 80

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-2115269539"
	)
	boolean method5946(String var1) {
		String var2 = this.field3506.method7078(); // L: 83
		if (!var2.equals(var1)) { // L: 84
			var1 = this.method5990(var1); // L: 85
			this.field3506.method7088(var1); // L: 86
			this.method5932(this.field3496, this.field3525); // L: 87
			this.method5994(); // L: 88
			this.method5999(); // L: 89
			return true; // L: 90
		} else {
			return false; // L: 92
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "2098104516"
	)
	boolean method5926(String var1) {
		this.field3523.method7088(var1); // L: 96
		return true; // L: 97
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnw;B)Z",
		garbageValue = "103"
	)
	boolean method6033(AbstractFont var1) {
		boolean var2 = !this.field3511; // L: 101
		this.field3506.method7089(var1); // L: 102
		this.field3523.method7089(var1); // L: 103
		this.field3511 = true; // L: 104
		var2 |= this.method5932(this.field3496, this.field3525); // L: 105
		var2 |= this.method6013(this.field3516, this.field3515); // L: 106
		if (this.method5994()) { // L: 107
			this.method5999(); // L: 108
			var2 = true; // L: 109
		}

		return var2; // L: 111
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-7"
	)
	public boolean method5928(int var1, int var2) {
		boolean var3 = this.field3522 != var1 || var2 != this.field3527; // L: 115
		this.field3522 = var1; // L: 116
		this.field3527 = var2; // L: 117
		var3 |= this.method5932(this.field3496, this.field3525); // L: 118
		return var3; // L: 119
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "59"
	)
	public boolean method5929(int var1) {
		if (var1 < 0) { // L: 123
			var1 = Integer.MAX_VALUE; // L: 124
		}

		boolean var2 = var1 == this.field3506.method7099(); // L: 126
		this.field3506.method7079(var1, true); // L: 127
		this.field3523.method7079(var1, true); // L: 128
		if (this.method5994()) { // L: 129
			this.method5999(); // L: 130
			var2 = true; // L: 131
		}

		return var2; // L: 133
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-229191440"
	)
	public boolean method5930(int var1) {
		if (var1 < 0) { // L: 137
			this.field3519 = Integer.MAX_VALUE; // L: 138
		} else {
			this.field3519 = var1; // L: 141
		}

		if (this.method5994()) { // L: 143
			this.method5999(); // L: 144
			return true; // L: 145
		} else {
			return false; // L: 147
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-125"
	)
	public boolean method6150(int var1) {
		this.field3521 = var1; // L: 151
		if (this.method5994()) { // L: 152
			this.method5999(); // L: 153
			return true; // L: 154
		} else {
			return false; // L: 156
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1771659696"
	)
	public boolean method5932(int var1, int var2) {
		if (!this.method5979()) { // L: 160
			this.field3496 = var1; // L: 161
			this.field3525 = var2; // L: 162
			return false; // L: 163
		} else {
			int var3 = this.field3496; // L: 165
			int var4 = this.field3525; // L: 166
			int var5 = Math.max(0, this.field3506.method7175() - this.field3522 + 2); // L: 167
			int var6 = Math.max(0, this.field3506.method7095() - this.field3527 + 1); // L: 168
			this.field3496 = Math.max(0, Math.min(var5, var1)); // L: 169
			this.field3525 = Math.max(0, Math.min(var6, var2)); // L: 170
			return var3 != this.field3496 || var4 != this.field3525; // L: 171
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "25"
	)
	public boolean method6068(int var1, int var2) {
		return true; // L: 175
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "575795924"
	)
	public void method5934(int var1) {
		this.field3506.method7083(var1); // L: 179
	} // L: 180

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1337038489"
	)
	public void method5935(int var1) {
		this.field3512 = var1; // L: 183
	} // L: 184

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "646756591"
	)
	public void method5936(int var1) {
		this.field3506.method7101(var1); // L: 187
	} // L: 188

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1378818373"
	)
	public void method5937(int var1) {
		this.field3506.method7080(var1); // L: 191
	} // L: 192

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-49"
	)
	public boolean method5938(int var1) {
		this.field3507 = var1; // L: 195
		String var2 = this.field3506.method7078(); // L: 196
		int var3 = var2.length(); // L: 197
		var2 = this.method5990(var2); // L: 198
		if (var2.length() != var3) { // L: 199
			this.field3506.method7088(var2); // L: 200
			this.method5932(this.field3496, this.field3525); // L: 201
			this.method5994(); // L: 202
			this.method5999(); // L: 203
			return true; // L: 204
		} else {
			return false; // L: 206
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "66"
	)
	public void method6031() {
		this.field3511 = false; // L: 210
	} // L: 211

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1369936671"
	)
	public boolean method5940(int var1) {
		if (this.method6000(var1)) { // L: 214
			this.method5945(); // L: 215
			class373 var2 = this.field3506.method7174((char)var1, this.field3515, this.field3520, this.field3519); // L: 216
			this.method6013(var2.method7186(), var2.method7186()); // L: 217
			this.method5994(); // L: 218
			this.method5999(); // L: 219
		}

		return true; // L: 221
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-70"
	)
	public void method5941() {
		if (!this.method5945() && this.field3515 > 0) { // L: 225
			int var1 = this.field3506.method7152(this.field3515 - 1); // L: 226
			this.method5999(); // L: 227
			this.method6013(var1, var1); // L: 228
		}

	} // L: 230

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "127602061"
	)
	public void method6124() {
		if (!this.method5945() && this.field3515 < this.field3506.method7173()) { // L: 233
			int var1 = this.field3506.method7152(this.field3515); // L: 234
			this.method5999(); // L: 235
			this.method6013(var1, var1); // L: 236
		}

	} // L: 238

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1362450681"
	)
	public void method5943() {
		if (!this.method5945() && this.field3515 > 0) { // L: 241
			class447 var1 = this.method5992(this.field3515 - 1); // L: 242
			int var2 = this.field3506.method7091((Integer)var1.field4832, this.field3515); // L: 243
			this.method5999(); // L: 244
			this.method6013(var2, var2); // L: 245
		}

	} // L: 247

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1932520887"
	)
	public void method5944() {
		if (!this.method5945() && this.field3515 < this.field3506.method7173()) { // L: 250
			class447 var1 = this.method5992(this.field3515); // L: 251
			int var2 = this.field3506.method7091(this.field3515, (Integer)var1.field4833); // L: 252
			this.method5999(); // L: 253
			this.method6013(var2, var2); // L: 254
		}

	} // L: 256

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1659058039"
	)
	boolean method5945() {
		if (!this.method6087()) { // L: 259
			return false;
		} else {
			int var1 = this.field3506.method7091(this.field3516, this.field3515); // L: 260
			this.method5999(); // L: 261
			this.method6013(var1, var1); // L: 262
			return true; // L: 263
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	public void method5991() {
		this.method6013(0, this.field3506.method7173()); // L: 267
	} // L: 268

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1250868463"
	)
	public boolean method6013(int var1, int var2) {
		if (!this.method5979()) { // L: 271
			this.field3516 = var1; // L: 272
			this.field3515 = var2; // L: 273
			return false; // L: 274
		} else {
			if (var1 > this.field3506.method7173()) { // L: 276
				var1 = this.field3506.method7173(); // L: 277
			}

			if (var2 > this.field3506.method7173()) { // L: 279
				var2 = this.field3506.method7173(); // L: 280
			}

			boolean var3 = this.field3516 != var1 || var2 != this.field3515; // L: 282
			this.field3516 = var1; // L: 283
			if (var2 != this.field3515) { // L: 284
				this.field3515 = var2; // L: 285
				this.field3510 = 0; // L: 286
				this.method5997(); // L: 287
			}

			if (var3 && this.field3497 != null) { // L: 289 290
				this.field3497.vmethod5862(); // L: 291
			}

			return var3; // L: 294
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1672652675"
	)
	public void method5923(boolean var1) {
		class447 var2 = this.method5993(this.field3515); // L: 298
		this.method5982((Integer)var2.field4832, var1); // L: 299
	} // L: 300

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "754153094"
	)
	public void method6060(boolean var1) {
		class447 var2 = this.method5993(this.field3515); // L: 303
		this.method5982((Integer)var2.field4833, var1); // L: 304
	} // L: 305

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1647876465"
	)
	public void method6132(boolean var1) {
		this.method5982(0, var1); // L: 308
	} // L: 309

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1488591424"
	)
	public void method6160(boolean var1) {
		this.method5982(this.field3506.method7173(), var1); // L: 312
	} // L: 313

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	public void method6037(boolean var1) {
		if (this.method6087() && !var1) { // L: 316
			this.method5982(Math.min(this.field3516, this.field3515), var1); // L: 317
		} else if (this.field3515 > 0) { // L: 319
			this.method5982(this.field3515 - 1, var1); // L: 320
		}

	} // L: 322

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1917917432"
	)
	public void method5953(boolean var1) {
		if (this.method6087() && !var1) { // L: 325
			this.method5982(Math.max(this.field3516, this.field3515), var1); // L: 326
		} else if (this.field3515 < this.field3506.method7173()) { // L: 328
			this.method5982(this.field3515 + 1, var1); // L: 329
		}

	} // L: 331

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1661249652"
	)
	public void method6163(boolean var1) {
		if (this.field3515 > 0) { // L: 334
			class447 var2 = this.method5992(this.field3515 - 1); // L: 335
			this.method5982((Integer)var2.field4832, var1); // L: 336
		}

	} // L: 338

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1637073208"
	)
	public void method5955(boolean var1) {
		if (this.field3515 < this.field3506.method7173()) { // L: 341
			class447 var2 = this.method5992(this.field3515 + 1); // L: 342
			this.method5982((Integer)var2.field4833, var1); // L: 343
		}

	} // L: 345

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2057418884"
	)
	public void method5956(boolean var1) {
		if (this.field3515 > 0) { // L: 348
			this.method5982(this.field3506.method7115(this.field3515, -1), var1); // L: 349
		}

	} // L: 351

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2073067096"
	)
	public void method5957(boolean var1) {
		if (this.field3515 < this.field3506.method7173()) { // L: 354
			this.method5982(this.field3506.method7115(this.field3515, 1), var1); // L: 355
		}

	} // L: 357

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "113"
	)
	public void method5958(boolean var1) {
		if (this.field3515 > 0) { // L: 360
			int var2 = this.method6186(); // L: 361
			this.method5982(this.field3506.method7115(this.field3515, -var2), var1); // L: 362
		}

	} // L: 364

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-20"
	)
	public void method5959(boolean var1) {
		if (this.field3515 < this.field3506.method7173()) { // L: 367
			int var2 = this.method6186(); // L: 368
			this.method5982(this.field3506.method7115(this.field3515, var2), var1); // L: 369
		}

	} // L: 371

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1600044103"
	)
	public void method5960(boolean var1) {
		class376 var2 = this.field3506.method7140(0, this.field3515); // L: 374
		class447 var3 = var2.method7303(); // L: 375
		this.method5982(this.field3506.method7092((Integer)var3.field4832, this.field3525), var1); // L: 376
	} // L: 377

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-82"
	)
	public void method5961(boolean var1) {
		class376 var2 = this.field3506.method7140(0, this.field3515); // L: 380
		class447 var3 = var2.method7303(); // L: 381
		this.method5982(this.field3506.method7092((Integer)var3.field4832, this.field3525 + this.field3527), var1); // L: 382
	} // L: 383

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-663576903"
	)
	public void method5962(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false; // L: 386
		int var8;
		if (!this.field3511) { // L: 387
			var8 = 0; // L: 388
		} else {
			var1 += this.field3496; // L: 391
			var2 += this.field3525; // L: 392
			var8 = this.field3506.method7092(var1, var2); // L: 393
		}

		class447 var6;
		if (var3 && var4) { // L: 395
			this.field3514 = 1; // L: 396
			var6 = this.method5992(var8); // L: 397
			class447 var7 = this.method5992(this.field3517); // L: 398
			this.method6051(var7, var6); // L: 399
		} else if (var3) { // L: 401
			this.field3514 = 1; // L: 402
			var6 = this.method5992(var8); // L: 403
			this.method6013((Integer)var6.field4832, (Integer)var6.field4833); // L: 404
			this.field3517 = (Integer)var6.field4832; // L: 405
		} else if (var4) { // L: 407
			this.method6013(this.field3517, var8); // L: 408
		} else {
			if (this.field3518 > 0 && var8 == this.field3517) { // L: 411
				if (this.field3515 == this.field3516) { // L: 412
					this.field3514 = 1; // L: 413
					var6 = this.method5992(var8); // L: 414
					this.method6013((Integer)var6.field4832, (Integer)var6.field4833); // L: 415
				} else {
					this.field3514 = 2; // L: 418
					var6 = this.method5993(var8); // L: 419
					this.method6013((Integer)var6.field4832, (Integer)var6.field4833); // L: 420
				}
			} else {
				this.field3514 = 0; // L: 424
				this.method6013(var8, var8); // L: 425
				this.field3517 = var8; // L: 426
			}

			this.field3518 = 25; // L: 428
		}

	} // L: 430

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "50"
	)
	public void method6048(int var1, int var2) {
		if (this.field3511 && this.method5974()) { // L: 433
			var1 += this.field3496; // L: 434
			var2 += this.field3525; // L: 435
			int var3 = this.field3506.method7092(var1, var2); // L: 436
			class447 var4;
			class447 var5;
			switch(this.field3514) { // L: 437
			case 0:
				this.method6013(this.field3516, var3); // L: 454
				break;
			case 1:
				var4 = this.method5992(this.field3517); // L: 447
				var5 = this.method5992(var3); // L: 448
				this.method6051(var4, var5); // L: 449
				break; // L: 450
			case 2:
				var4 = this.method5993(this.field3517); // L: 440
				var5 = this.method5993(var3); // L: 441
				this.method6051(var4, var5); // L: 442
			}
		}

	} // L: 459

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "38"
	)
	public void method5964(Clipboard var1) {
		class376 var2 = this.field3506.method7140(this.field3516, this.field3515); // L: 462
		if (!var2.method7297()) { // L: 463
			String var3 = var2.method7307(); // L: 464
			if (!var3.isEmpty()) { // L: 465
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null); // L: 466
			}
		}

	} // L: 469

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "2113716103"
	)
	public void method5965(Clipboard var1) {
		if (this.method6087()) { // L: 472
			this.method5964(var1); // L: 473
			this.method5945(); // L: 474
		}

	} // L: 476

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1739927066"
	)
	public void method6043(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null); // L: 479
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) { // L: 480
			try {
				String var3 = this.method5990((String)var2.getTransferData(DataFlavor.stringFlavor)); // L: 482
				this.method5945(); // L: 483
				class373 var4 = this.field3506.method7086(var3, this.field3515, this.field3520, this.field3519); // L: 484
				this.method6013(var4.method7186(), var4.method7186()); // L: 485
				this.method5994(); // L: 486
				this.method5999(); // L: 487
			} catch (Exception var5) { // L: 489
				System.out.println("Error pasting clipboard to InputField."); // L: 490
			}
		}

	} // L: 493

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2102286537"
	)
	public void method5967() {
		this.field3525 = Math.max(0, this.field3525 - this.field3506.method7096()); // L: 496
	} // L: 497

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "373252948"
	)
	public void method5968() {
		int var1 = Math.max(0, this.field3506.method7095() - this.field3527); // L: 500
		this.field3525 = Math.min(var1, this.field3525 + this.field3506.method7096()); // L: 501
	} // L: 502

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lkm;I)V",
		garbageValue = "1850283525"
	)
	public void method5969(class301 var1) {
		this.field3500 = var1; // L: 505
	} // L: 506

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lkm;I)V",
		garbageValue = "2122113051"
	)
	public void method5970(class301 var1) {
		this.field3497 = var1; // L: 509
	} // L: 510

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lnp;",
		garbageValue = "1893289455"
	)
	public class372 method5971() {
		return this.field3506; // L: 513
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lnp;",
		garbageValue = "-1034233503"
	)
	public class372 method6128() {
		return this.field3523; // L: 517
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Lnm;",
		garbageValue = "-44"
	)
	public class376 method5973() {
		return this.field3506.method7140(this.field3516, this.field3515); // L: 521
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1981913214"
	)
	public boolean method5974() {
		return this.field3508; // L: 525
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2077111986"
	)
	public boolean method5954() {
		return this.field3509; // L: 529
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "110"
	)
	public boolean method5976() {
		return this.method5974() && this.field3510 % 60 < 30; // L: 533
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1889382032"
	)
	public int method6145() {
		return this.field3515; // L: 537
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "621557504"
	)
	public int method5978() {
		return this.field3516; // L: 541
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1371647930"
	)
	public boolean method5979() {
		return this.field3511; // L: 545
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "605810854"
	)
	public int method5980() {
		return this.field3496; // L: 549
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "25511"
	)
	public int method6041() {
		return this.field3525; // L: 553
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-880385464"
	)
	public int method5950() {
		return this.field3506.method7099(); // L: 557
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "595036192"
	)
	public int method5983() {
		return this.field3519; // L: 561
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "641760578"
	)
	public int method5984() {
		return this.field3521; // L: 565
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1597714886"
	)
	public int method5948() {
		return this.field3512; // L: 569
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1235797121"
	)
	public int method5985() {
		return this.field3506.method7100(); // L: 573
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-347080143"
	)
	public int method6058() {
		return this.field3507; // L: 577
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "19"
	)
	public int method5987() {
		return this.field3506.method7085(); // L: 581
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-68"
	)
	public boolean method5988() {
		return this.field3519 > 1; // L: 585
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1923749872"
	)
	boolean method6087() {
		return this.field3516 != this.field3515; // L: 589
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-182363535"
	)
	String method5990(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length()); // L: 593

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 594
			char var4 = var1.charAt(var3); // L: 595
			if (this.method6000(var4)) { // L: 596
				var2.append(var4); // L: 597
			}
		}

		return var2.toString(); // L: 600
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lqd;Lqd;I)V",
		garbageValue = "1953734910"
	)
	void method6051(class447 var1, class447 var2) {
		if ((Integer)var2.field4832 < (Integer)var1.field4832) { // L: 604
			this.method6013((Integer)var1.field4833, (Integer)var2.field4832); // L: 605
		} else {
			this.method6013((Integer)var1.field4832, (Integer)var2.field4833); // L: 608
		}

	} // L: 610

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqd;",
		garbageValue = "11"
	)
	class447 method5992(int var1) {
		int var2 = this.field3506.method7173(); // L: 613
		int var3 = 0; // L: 614
		int var4 = var2; // L: 615

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 616
			if (this.method5998(this.field3506.method7074(var5 - 1).field4411)) { // L: 617
				var3 = var5; // L: 618
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 622
			if (this.method5998(this.field3506.method7074(var5).field4411)) { // L: 623
				var4 = var5; // L: 624
				break;
			}
		}

		return new class447(var3, var4); // L: 628
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqd;",
		garbageValue = "127"
	)
	class447 method5993(int var1) {
		int var2 = this.field3506.method7173(); // L: 632
		int var3 = 0; // L: 633
		int var4 = var2; // L: 634

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 635
			if (this.field3506.method7074(var5 - 1).field4411 == '\n') { // L: 636
				var3 = var5; // L: 637
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 641
			if (this.field3506.method7074(var5).field4411 == '\n') { // L: 642
				var4 = var5; // L: 643
				break;
			}
		}

		return new class447(var3, var4); // L: 647
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "100"
	)
	boolean method5994() {
		if (!this.method5979()) { // L: 651
			return false;
		} else {
			boolean var1 = false; // L: 652
			if (this.field3506.method7173() > this.field3521) { // L: 653
				this.field3506.method7091(this.field3521, this.field3506.method7173()); // L: 654
				var1 = true; // L: 655
			}

			int var2;
			if (this.field3506.method7137() > this.field3519) { // L: 657
				var2 = this.field3506.method7115(0, this.field3519) - 1; // L: 658
				this.field3506.method7091(var2, this.field3506.method7173()); // L: 659
				var1 = true; // L: 660
			}

			if (var1) { // L: 662
				var2 = this.field3515; // L: 663
				int var3 = this.field3516; // L: 664
				int var4 = this.field3506.method7173(); // L: 665
				if (this.field3515 > var4) { // L: 666
					var2 = var4; // L: 667
				}

				if (this.field3516 > var4) { // L: 669
					var3 = var4; // L: 670
				}

				this.method6013(var3, var2); // L: 672
			}

			return var1; // L: 674
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "16"
	)
	void method5982(int var1, boolean var2) {
		if (var2) { // L: 678
			this.method6013(this.field3516, var1);
		} else {
			this.method6013(var1, var1); // L: 679
		}

	} // L: 680

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-954530936"
	)
	int method6186() {
		return this.field3527 / this.field3506.method7096(); // L: 683
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1927387060"
	)
	void method5997() {
		class376 var1 = this.field3506.method7140(0, this.field3515); // L: 687
		class447 var2 = var1.method7303(); // L: 688
		int var3 = this.field3506.method7096(); // L: 689
		int var4 = (Integer)var2.field4832 - 10; // L: 690
		int var5 = var4 + 20; // L: 691
		int var6 = (Integer)var2.field4833 - 3; // L: 692
		int var7 = var6 + var3 + 6; // L: 693
		int var8 = this.field3496; // L: 694
		int var9 = var8 + this.field3522; // L: 695
		int var10 = this.field3525; // L: 696
		int var11 = var10 + this.field3527; // L: 697
		int var12 = this.field3496; // L: 698
		int var13 = this.field3525; // L: 699
		if (var4 < var8) { // L: 700
			var12 = var4; // L: 701
		} else if (var5 > var9) { // L: 703
			var12 = var5 - this.field3522; // L: 704
		}

		if (var6 < var10) { // L: 706
			var13 = var6; // L: 707
		} else if (var7 > var11) { // L: 709
			var13 = var7 - this.field3527; // L: 710
		}

		this.method5932(var12, var13); // L: 712
	} // L: 713

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "105"
	)
	boolean method5998(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9; // L: 716
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "754124756"
	)
	void method5999() {
		if (this.field3500 != null) { // L: 720
			this.field3500.vmethod5862(); // L: 721
		}

	} // L: 723

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	boolean method6000(int var1) {
		switch(this.field3507) { // L: 726
		case 1:
			return class97.isAlphaNumeric((char)var1); // L: 741
		case 2:
			return class155.isCharAlphabetic((char)var1); // L: 728
		case 3:
			return CollisionMap.isDigit((char)var1); // L: 739
		case 4:
			char var2 = (char)var1; // L: 730
			if (CollisionMap.isDigit(var2)) { // L: 731
				return true; // L: 732
			} else {
				if (var2 != 'k' && var2 != 'K' && var2 != 'm' && var2 != 'M' && var2 != 'b' && var2 != 'B') { // L: 734
					return false; // L: 737
				}

				return true; // L: 735
			}
		default:
			return true; // L: 743
		}
	}
}
