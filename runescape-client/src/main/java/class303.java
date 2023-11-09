import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
public class class303 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	class368 field3491;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	class368 field3483;
	@ObfuscatedName("t")
	boolean field3493;
	@ObfuscatedName("c")
	boolean field3489;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1998851831
	)
	int field3508;
	@ObfuscatedName("d")
	boolean field3496;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 155329521
	)
	int field3497;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 397985193
	)
	int field3498;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1343153257
	)
	int field3499;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -704819605
	)
	int field3492;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 142706045
	)
	int field3501;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 683297025
	)
	int field3502;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -171046757
	)
	int field3503;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1245285575
	)
	int field3500;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 359621961
	)
	int field3484;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1943562183
	)
	int field3486;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1762576791
	)
	int field3507;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 281194267
	)
	int field3506;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1564492109
	)
	int field3485;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -312555077
	)
	int field3482;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	class297 field3511;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	class297 field3512;

	class303() {
		this.field3491 = new class368(); // L: 32
		this.field3483 = new class368(); // L: 33
		this.field3493 = false; // L: 34
		this.field3489 = true; // L: 35
		this.field3508 = 0; // L: 36
		this.field3496 = false; // L: 37
		this.field3497 = 0; // L: 38
		this.field3498 = 0; // L: 39
		this.field3499 = 0; // L: 40
		this.field3492 = 0; // L: 41
		this.field3501 = 0; // L: 42
		this.field3502 = 0; // L: 43
		this.field3503 = 0; // L: 44
		this.field3500 = Integer.MAX_VALUE; // L: 45
		this.field3484 = Integer.MAX_VALUE; // L: 46
		this.field3486 = Integer.MAX_VALUE; // L: 47
		this.field3507 = 0; // L: 48
		this.field3506 = 0; // L: 49
		this.field3485 = 0; // L: 50
		this.field3482 = 0; // L: 51
		this.field3491.method7123(1); // L: 56
		this.field3483.method7123(1); // L: 57
	} // L: 58

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1350430597"
	)
	void method5879() {
		this.field3508 = (this.field3508 + 1) % 60; // L: 61
		if (this.field3503 > 0) { // L: 62
			--this.field3503; // L: 63
		}

	} // L: 65

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "1031224212"
	)
	public boolean method5880(boolean var1) {
		var1 = var1 && this.field3489; // L: 68
		boolean var2 = this.field3493 != var1; // L: 69
		this.field3493 = var1; // L: 70
		if (!this.field3493) { // L: 71
			this.method5904(this.field3492, this.field3492); // L: 72
		}

		return var2; // L: 74
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1990857914"
	)
	public void method5881(boolean var1) {
		this.field3489 = var1; // L: 78
		this.field3493 = var1 && this.field3493; // L: 79
	} // L: 80

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1086312663"
	)
	boolean method5882(String var1) {
		String var2 = this.field3491.method7091(); // L: 83
		if (!var2.equals(var1)) { // L: 84
			var1 = this.method5948(var1); // L: 85
			this.field3491.method7051(var1); // L: 86
			this.method5889(this.field3485, this.field3482); // L: 87
			this.method5920(); // L: 88
			this.method5957(); // L: 89
			return true; // L: 90
		} else {
			return false; // L: 92
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-966702085"
	)
	boolean method6124(String var1) {
		this.field3483.method7051(var1); // L: 96
		return true; // L: 97
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lne;S)Z",
		garbageValue = "-408"
	)
	boolean method5884(AbstractFont var1) {
		boolean var2 = !this.field3496; // L: 101
		this.field3491.method7108(var1); // L: 102
		this.field3483.method7108(var1); // L: 103
		this.field3496 = true; // L: 104
		var2 |= this.method5889(this.field3485, this.field3482); // L: 105
		var2 |= this.method5904(this.field3501, this.field3492); // L: 106
		if (this.method5920()) { // L: 107
			this.method5957(); // L: 108
			var2 = true; // L: 109
		}

		return var2; // L: 111
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1720007659"
	)
	public boolean method5885(int var1, int var2) {
		boolean var3 = this.field3507 != var1 || var2 != this.field3506; // L: 115
		this.field3507 = var1; // L: 116
		this.field3506 = var2; // L: 117
		var3 |= this.method5889(this.field3485, this.field3482); // L: 118
		return var3; // L: 119
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "11"
	)
	public boolean method5886(int var1) {
		if (var1 < 0) { // L: 123
			var1 = Integer.MAX_VALUE; // L: 124
		}

		boolean var2 = var1 == this.field3491.method7062(); // L: 126
		this.field3491.method7042(var1, true); // L: 127
		this.field3483.method7042(var1, true); // L: 128
		if (this.method5920()) { // L: 129
			this.method5957(); // L: 130
			var2 = true; // L: 131
		}

		return var2; // L: 133
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "195765062"
	)
	public boolean method5887(int var1) {
		if (var1 < 0) { // L: 137
			this.field3500 = Integer.MAX_VALUE; // L: 138
		} else {
			this.field3500 = var1; // L: 141
		}

		if (this.method5920()) { // L: 143
			this.method5957(); // L: 144
			return true; // L: 145
		} else {
			return false; // L: 147
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-54"
	)
	public boolean method5888(int var1) {
		this.field3486 = var1; // L: 151
		if (this.method5920()) { // L: 152
			this.method5957(); // L: 153
			return true; // L: 154
		} else {
			return false; // L: 156
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1288674527"
	)
	public boolean method5889(int var1, int var2) {
		if (!this.method6062()) { // L: 160
			this.field3485 = var1; // L: 161
			this.field3482 = var2; // L: 162
			return false; // L: 163
		} else {
			int var3 = this.field3485; // L: 165
			int var4 = this.field3482; // L: 166
			int var5 = Math.max(0, this.field3491.method7057() - this.field3507 + 2); // L: 167
			int var6 = Math.max(0, this.field3491.method7140() - this.field3506 + 1); // L: 168
			this.field3485 = Math.max(0, Math.min(var5, var1)); // L: 169
			this.field3482 = Math.max(0, Math.min(var6, var2)); // L: 170
			return var3 != this.field3485 || var4 != this.field3482; // L: 171
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1022783976"
	)
	public boolean method5890(int var1, int var2) {
		return true; // L: 175
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "604179607"
	)
	public void method5891(int var1) {
		this.field3491.method7117(var1); // L: 179
	} // L: 180

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1403807319"
	)
	public void method5892(int var1) {
		this.field3497 = var1; // L: 183
	} // L: 184

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "716355991"
	)
	public void method6015(int var1) {
		this.field3491.method7123(var1); // L: 187
	} // L: 188

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "217166740"
	)
	public void method5941(int var1) {
		this.field3491.method7043(var1); // L: 191
	} // L: 192

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "50"
	)
	public boolean method6044(int var1) {
		this.field3499 = var1; // L: 195
		String var2 = this.field3491.method7091(); // L: 196
		int var3 = var2.length(); // L: 197
		var2 = this.method5948(var2); // L: 198
		if (var2.length() != var3) { // L: 199
			this.field3491.method7051(var2); // L: 200
			this.method5889(this.field3485, this.field3482); // L: 201
			this.method5920(); // L: 202
			this.method5957(); // L: 203
			return true; // L: 204
		} else {
			return false; // L: 206
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1966558117"
	)
	public void method5896() {
		this.field3496 = false; // L: 210
	} // L: 211

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-188837227"
	)
	public boolean method5897(int var1) {
		if (this.method5929(var1)) { // L: 214
			this.method5902(); // L: 215
			class369 var2 = this.field3491.method7048((char)var1, this.field3492, this.field3484, this.field3500); // L: 216
			this.method5904(var2.method7145(), var2.method7145()); // L: 217
			this.method5920(); // L: 218
			this.method5957(); // L: 219
		}

		return true; // L: 221
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "3315"
	)
	public void method5898() {
		if (!this.method5902() && this.field3492 > 0) { // L: 225
			int var1 = this.field3491.method7053(this.field3492 - 1); // L: 226
			this.method5957(); // L: 227
			this.method5904(var1, var1); // L: 228
		}

	} // L: 230

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method5899() {
		if (!this.method5902() && this.field3492 < this.field3491.method7041()) { // L: 233
			int var1 = this.field3491.method7053(this.field3492); // L: 234
			this.method5957(); // L: 235
			this.method5904(var1, var1); // L: 236
		}

	} // L: 238

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "512301118"
	)
	public void method5900() {
		if (!this.method5902() && this.field3492 > 0) { // L: 241
			class440 var1 = this.method5950(this.field3492 - 1); // L: 242
			int var2 = this.field3491.method7046((Integer)var1.field4811, this.field3492); // L: 243
			this.method5957(); // L: 244
			this.method5904(var2, var2); // L: 245
		}

	} // L: 247

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-30062"
	)
	public void method5901() {
		if (!this.method5902() && this.field3492 < this.field3491.method7041()) { // L: 250
			class440 var1 = this.method5950(this.field3492); // L: 251
			int var2 = this.field3491.method7046(this.field3492, (Integer)var1.field4809); // L: 252
			this.method5957(); // L: 253
			this.method5904(var2, var2); // L: 254
		}

	} // L: 256

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1528760733"
	)
	boolean method5902() {
		if (!this.method5947()) { // L: 259
			return false;
		} else {
			int var1 = this.field3491.method7046(this.field3501, this.field3492); // L: 260
			this.method5957(); // L: 261
			this.method5904(var1, var1); // L: 262
			return true; // L: 263
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "54505361"
	)
	public void method6116() {
		this.method5904(0, this.field3491.method7041()); // L: 267
	} // L: 268

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-34"
	)
	public boolean method5904(int var1, int var2) {
		if (!this.method6062()) { // L: 271
			this.field3501 = var1; // L: 272
			this.field3492 = var2; // L: 273
			return false; // L: 274
		} else {
			if (var1 > this.field3491.method7041()) { // L: 276
				var1 = this.field3491.method7041(); // L: 277
			}

			if (var2 > this.field3491.method7041()) { // L: 279
				var2 = this.field3491.method7041(); // L: 280
			}

			boolean var3 = this.field3501 != var1 || var2 != this.field3492; // L: 282
			this.field3501 = var1; // L: 283
			if (var2 != this.field3492) { // L: 284
				this.field3492 = var2; // L: 285
				this.field3508 = 0; // L: 286
				this.method5955(); // L: 287
			}

			if (var3 && this.field3512 != null) { // L: 289 290
				this.field3512.vmethod5829(); // L: 291
			}

			return var3; // L: 294
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "111"
	)
	public void method6143(boolean var1) {
		class440 var2 = this.method6037(this.field3492); // L: 298
		this.method6112((Integer)var2.field4811, var1); // L: 299
	} // L: 300

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1891106199"
	)
	public void method5906(boolean var1) {
		class440 var2 = this.method6037(this.field3492); // L: 303
		this.method6112((Integer)var2.field4809, var1); // L: 304
	} // L: 305

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-926488964"
	)
	public void method5907(boolean var1) {
		this.method6112(0, var1); // L: 308
	} // L: 309

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1841715153"
	)
	public void method5908(boolean var1) {
		this.method6112(this.field3491.method7041(), var1); // L: 312
	} // L: 313

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-585513262"
	)
	public void method5909(boolean var1) {
		if (this.method5947() && !var1) { // L: 316
			this.method6112(Math.min(this.field3501, this.field3492), var1); // L: 317
		} else if (this.field3492 > 0) { // L: 319
			this.method6112(this.field3492 - 1, var1); // L: 320
		}

	} // L: 322

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "7"
	)
	public void method5910(boolean var1) {
		if (this.method5947() && !var1) { // L: 325
			this.method6112(Math.max(this.field3501, this.field3492), var1); // L: 326
		} else if (this.field3492 < this.field3491.method7041()) { // L: 328
			this.method6112(this.field3492 + 1, var1); // L: 329
		}

	} // L: 331

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "101"
	)
	public void method5911(boolean var1) {
		if (this.field3492 > 0) { // L: 334
			class440 var2 = this.method5950(this.field3492 - 1); // L: 335
			this.method6112((Integer)var2.field4811, var1); // L: 336
		}

	} // L: 338

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-17"
	)
	public void method5903(boolean var1) {
		if (this.field3492 < this.field3491.method7041()) { // L: 341
			class440 var2 = this.method5950(this.field3492 + 1); // L: 342
			this.method6112((Integer)var2.field4809, var1); // L: 343
		}

	} // L: 345

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "478652614"
	)
	public void method6028(boolean var1) {
		if (this.field3492 > 0) { // L: 348
			this.method6112(this.field3491.method7056(this.field3492, -1), var1); // L: 349
		}

	} // L: 351

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-76"
	)
	public void method5935(boolean var1) {
		if (this.field3492 < this.field3491.method7041()) { // L: 354
			this.method6112(this.field3491.method7056(this.field3492, 1), var1); // L: 355
		}

	} // L: 357

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-2228"
	)
	public void method5915(boolean var1) {
		if (this.field3492 > 0) { // L: 360
			int var2 = this.method5954(); // L: 361
			this.method6112(this.field3491.method7056(this.field3492, -var2), var1); // L: 362
		}

	} // L: 364

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "314854978"
	)
	public void method5916(boolean var1) {
		if (this.field3492 < this.field3491.method7041()) { // L: 367
			int var2 = this.method5954(); // L: 368
			this.method6112(this.field3491.method7056(this.field3492, var2), var1); // L: 369
		}

	} // L: 371

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "4"
	)
	public void method5917(boolean var1) {
		class372 var2 = this.field3491.method7092(0, this.field3492); // L: 374
		class440 var3 = var2.method7255(); // L: 375
		this.method6112(this.field3491.method7055((Integer)var3.field4811, this.field3482), var1); // L: 376
	} // L: 377

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "891282237"
	)
	public void method5918(boolean var1) {
		class372 var2 = this.field3491.method7092(0, this.field3492); // L: 380
		class440 var3 = var2.method7255(); // L: 381
		this.method6112(this.field3491.method7055((Integer)var3.field4811, this.field3506 + this.field3482), var1); // L: 382
	} // L: 383

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIZZB)V",
		garbageValue = "80"
	)
	public void method5919(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false; // L: 386
		int var8;
		if (!this.field3496) { // L: 387
			var8 = 0; // L: 388
		} else {
			var1 += this.field3485; // L: 391
			var2 += this.field3482; // L: 392
			var8 = this.field3491.method7055(var1, var2); // L: 393
		}

		class440 var6;
		if (var3 && var4) { // L: 395
			this.field3498 = 1; // L: 396
			var6 = this.method5950(var8); // L: 397
			class440 var7 = this.method5950(this.field3502); // L: 398
			this.method6058(var7, var6); // L: 399
		} else if (var3) { // L: 401
			this.field3498 = 1; // L: 402
			var6 = this.method5950(var8); // L: 403
			this.method5904((Integer)var6.field4811, (Integer)var6.field4809); // L: 404
			this.field3502 = (Integer)var6.field4811; // L: 405
		} else if (var4) { // L: 407
			this.method5904(this.field3502, var8); // L: 408
		} else {
			if (this.field3503 > 0 && var8 == this.field3502) { // L: 411
				if (this.field3501 == this.field3492) { // L: 412
					this.field3498 = 1; // L: 413
					var6 = this.method5950(var8); // L: 414
					this.method5904((Integer)var6.field4811, (Integer)var6.field4809); // L: 415
				} else {
					this.field3498 = 2; // L: 418
					var6 = this.method6037(var8); // L: 419
					this.method5904((Integer)var6.field4811, (Integer)var6.field4809); // L: 420
				}
			} else {
				this.field3498 = 0; // L: 424
				this.method5904(var8, var8); // L: 425
				this.field3502 = var8; // L: 426
			}

			this.field3503 = 25; // L: 428
		}

	} // L: 430

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "116560284"
	)
	public void method6102(int var1, int var2) {
		if (this.field3496 && this.method5963()) { // L: 433
			var1 += this.field3485; // L: 434
			var2 += this.field3482; // L: 435
			int var3 = this.field3491.method7055(var1, var2); // L: 436
			class440 var4;
			class440 var5;
			switch(this.field3498) { // L: 437
			case 0:
				this.method5904(this.field3501, var3); // L: 447
				break; // L: 448
			case 1:
				var4 = this.method5950(this.field3502); // L: 452
				var5 = this.method5950(var3); // L: 453
				this.method6058(var4, var5); // L: 454
				break; // L: 455
			case 2:
				var4 = this.method6037(this.field3502); // L: 440
				var5 = this.method6037(var3); // L: 441
				this.method6058(var4, var5); // L: 442
			}
		}

	} // L: 459

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1357067118"
	)
	public void method6034(Clipboard var1) {
		class372 var2 = this.field3491.method7092(this.field3501, this.field3492); // L: 462
		if (!var2.method7251()) { // L: 463
			String var3 = var2.method7272(); // L: 464
			if (!var3.isEmpty()) { // L: 465
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null); // L: 466
			}
		}

	} // L: 469

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "1200185346"
	)
	public void method5922(Clipboard var1) {
		if (this.method5947()) { // L: 472
			this.method6034(var1); // L: 473
			this.method5902(); // L: 474
		}

	} // L: 476

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "1443728969"
	)
	public void method5923(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null); // L: 479
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) { // L: 480
			try {
				String var3 = this.method5948((String)var2.getTransferData(DataFlavor.stringFlavor)); // L: 482
				this.method5902(); // L: 483
				class369 var4 = this.field3491.method7049(var3, this.field3492, this.field3484, this.field3500); // L: 484
				this.method5904(var4.method7145(), var4.method7145()); // L: 485
				this.method5920(); // L: 486
				this.method5957(); // L: 487
			} catch (Exception var5) { // L: 489
				System.out.println("Error pasting clipboard to InputField."); // L: 490
			}
		}

	} // L: 493

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-382481619"
	)
	public void method5924() {
		this.field3482 = Math.max(0, this.field3482 - this.field3491.method7131()); // L: 496
	} // L: 497

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1691398443"
	)
	public void method6001() {
		int var1 = Math.max(0, this.field3491.method7140() - this.field3506); // L: 500
		this.field3482 = Math.min(var1, this.field3482 + this.field3491.method7131()); // L: 501
	} // L: 502

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lkr;I)V",
		garbageValue = "-1482480307"
	)
	public void method5926(class297 var1) {
		this.field3511 = var1; // L: 505
	} // L: 506

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lkr;I)V",
		garbageValue = "-981604746"
	)
	public void method5927(class297 var1) {
		this.field3512 = var1; // L: 509
	} // L: 510

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lnu;",
		garbageValue = "-174585091"
	)
	public class368 method6004() {
		return this.field3491; // L: 513
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lnu;",
		garbageValue = "-1028025765"
	)
	public class368 method5893() {
		return this.field3483; // L: 517
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Lna;",
		garbageValue = "0"
	)
	public class372 method5930() {
		return this.field3491.method7092(this.field3501, this.field3492); // L: 521
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1825590323"
	)
	public boolean method5963() {
		return this.field3493; // L: 525
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public boolean method5878() {
		return this.field3489; // L: 529
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "241"
	)
	public boolean method5933() {
		return this.method5963() && this.field3508 % 60 < 30; // L: 533
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1904955935"
	)
	public int method5934() {
		return this.field3492; // L: 537
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-80"
	)
	public int method5913() {
		return this.field3501; // L: 541
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-555561187"
	)
	public boolean method6062() {
		return this.field3496; // L: 545
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1887741730"
	)
	public int method5937() {
		return this.field3485; // L: 549
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1255754672"
	)
	public int method5938() {
		return this.field3482; // L: 553
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-17768"
	)
	public int method5939() {
		return this.field3491.method7062(); // L: 557
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-40"
	)
	public int method5940() {
		return this.field3500; // L: 561
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1076456010"
	)
	public int method6111() {
		return this.field3486; // L: 565
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-216079285"
	)
	public int method5942() {
		return this.field3497; // L: 569
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1133819584"
	)
	public int method6054() {
		return this.field3491.method7063(); // L: 573
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2061169778"
	)
	public int method5944() {
		return this.field3499; // L: 577
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1951131614"
	)
	public int method6024() {
		return this.field3491.method7104(); // L: 581
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1774852145"
	)
	public boolean method5946() {
		return this.field3500 > 1; // L: 585
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1862038399"
	)
	boolean method5947() {
		return this.field3492 != this.field3501; // L: 589
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1311901455"
	)
	String method5948(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length()); // L: 593

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 594
			char var4 = var1.charAt(var3); // L: 595
			if (this.method5929(var4)) { // L: 596
				var2.append(var4); // L: 597
			}
		}

		return var2.toString(); // L: 600
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lpg;Lpg;I)V",
		garbageValue = "-1058810846"
	)
	void method6058(class440 var1, class440 var2) {
		if ((Integer)var2.field4811 < (Integer)var1.field4811) { // L: 604
			this.method5904((Integer)var1.field4809, (Integer)var2.field4811); // L: 605
		} else {
			this.method5904((Integer)var1.field4811, (Integer)var2.field4809); // L: 608
		}

	} // L: 610

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(II)Lpg;",
		garbageValue = "-1085956446"
	)
	class440 method5950(int var1) {
		int var2 = this.field3491.method7041(); // L: 613
		int var3 = 0; // L: 614
		int var4 = var2; // L: 615

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 616
			if (this.method6029(this.field3491.method7038(var5 - 1).field4395)) { // L: 617
				var3 = var5; // L: 618
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 622
			if (this.method6029(this.field3491.method7038(var5).field4395)) { // L: 623
				var4 = var5; // L: 624
				break;
			}
		}

		return new class440(var3, var4); // L: 628
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)Lpg;",
		garbageValue = "1830301127"
	)
	class440 method6037(int var1) {
		int var2 = this.field3491.method7041(); // L: 632
		int var3 = 0; // L: 633
		int var4 = var2; // L: 634

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 635
			if (this.field3491.method7038(var5 - 1).field4395 == '\n') { // L: 636
				var3 = var5; // L: 637
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 641
			if (this.field3491.method7038(var5).field4395 == '\n') { // L: 642
				var4 = var5; // L: 643
				break;
			}
		}

		return new class440(var3, var4); // L: 647
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "8914325"
	)
	boolean method5920() {
		if (!this.method6062()) { // L: 651
			return false;
		} else {
			boolean var1 = false; // L: 652
			if (this.field3491.method7041() > this.field3486) { // L: 653
				this.field3491.method7046(this.field3486, this.field3491.method7041()); // L: 654
				var1 = true; // L: 655
			}

			int var2;
			if (this.field3491.method7133() > this.field3500) { // L: 657
				var2 = this.field3491.method7056(0, this.field3500) - 1; // L: 658
				this.field3491.method7046(var2, this.field3491.method7041()); // L: 659
				var1 = true; // L: 660
			}

			if (var1) { // L: 662
				var2 = this.field3492; // L: 663
				int var3 = this.field3501; // L: 664
				int var4 = this.field3491.method7041(); // L: 665
				if (this.field3492 > var4) { // L: 666
					var2 = var4; // L: 667
				}

				if (this.field3501 > var4) { // L: 669
					var3 = var4; // L: 670
				}

				this.method5904(var3, var2); // L: 672
			}

			return var1; // L: 674
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1350161608"
	)
	void method6112(int var1, boolean var2) {
		if (var2) { // L: 678
			this.method5904(this.field3501, var1);
		} else {
			this.method5904(var1, var1); // L: 679
		}

	} // L: 680

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-201387644"
	)
	int method5954() {
		return this.field3506 / this.field3491.method7131(); // L: 683
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "797989363"
	)
	void method5955() {
		class372 var1 = this.field3491.method7092(0, this.field3492); // L: 687
		class440 var2 = var1.method7255(); // L: 688
		int var3 = this.field3491.method7131(); // L: 689
		int var4 = (Integer)var2.field4811 - 10; // L: 690
		int var5 = var4 + 20; // L: 691
		int var6 = (Integer)var2.field4809 - 3; // L: 692
		int var7 = var6 + var3 + 6; // L: 693
		int var8 = this.field3485; // L: 694
		int var9 = var8 + this.field3507; // L: 695
		int var10 = this.field3482; // L: 696
		int var11 = var10 + this.field3506; // L: 697
		int var12 = this.field3485; // L: 698
		int var13 = this.field3482; // L: 699
		if (var4 < var8) { // L: 700
			var12 = var4; // L: 701
		} else if (var5 > var9) { // L: 703
			var12 = var5 - this.field3507; // L: 704
		}

		if (var6 < var10) { // L: 706
			var13 = var6; // L: 707
		} else if (var7 > var11) { // L: 709
			var13 = var7 - this.field3506; // L: 710
		}

		this.method5889(var12, var13); // L: 712
	} // L: 713

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2021327959"
	)
	boolean method6029(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9; // L: 716
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method5957() {
		if (this.field3511 != null) { // L: 720
			this.field3511.vmethod5829(); // L: 721
		}

	} // L: 723

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1962828241"
	)
	boolean method5929(int var1) {
		switch(this.field3499) { // L: 726
		case 1:
			return ObjectComposition.isAlphaNumeric((char)var1); // L: 739
		case 2:
			return ViewportMouse.isCharAlphabetic((char)var1); // L: 743
		case 3:
			return WorldMapLabelSize.isDigit((char)var1); // L: 741
		case 4:
			char var2 = (char)var1; // L: 730
			if (WorldMapLabelSize.isDigit(var2)) { // L: 731
				return true; // L: 732
			} else {
				if (var2 != 'k' && var2 != 'K' && var2 != 'm' && var2 != 'M' && var2 != 'b' && var2 != 'B') { // L: 734
					return false; // L: 737
				}

				return true; // L: 735
			}
		default:
			return true; // L: 728
		}
	}
}
