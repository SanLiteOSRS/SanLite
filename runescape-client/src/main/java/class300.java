import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
public class class300 {
	@ObfuscatedName("rw")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	class365 field3439;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	class365 field3453;
	@ObfuscatedName("m")
	boolean field3441;
	@ObfuscatedName("q")
	boolean field3442;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1828326439
	)
	int field3443;
	@ObfuscatedName("e")
	boolean field3433;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -424355885
	)
	int field3444;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 475458307
	)
	int field3451;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2024752615
	)
	int field3447;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -993954281
	)
	int field3448;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 701971453
	)
	int field3449;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 610132973
	)
	int field3450;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -686280337
	)
	int field3456;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1229581707
	)
	int field3452;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 282824603
	)
	int field3432;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2118935603
	)
	int field3446;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -944132263
	)
	int field3455;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -95228669
	)
	int field3445;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1195447645
	)
	int field3457;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1011849235
	)
	int field3458;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	class294 field3459;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	class294 field3460;

	class300() {
		this.field3439 = new class365(); // L: 32
		this.field3453 = new class365(); // L: 33
		this.field3441 = false; // L: 34
		this.field3442 = true; // L: 35
		this.field3443 = 0; // L: 36
		this.field3433 = false; // L: 37
		this.field3444 = 0; // L: 38
		this.field3451 = 0; // L: 39
		this.field3447 = 0; // L: 40
		this.field3448 = 0; // L: 41
		this.field3449 = 0; // L: 42
		this.field3450 = 0; // L: 43
		this.field3456 = 0; // L: 44
		this.field3452 = Integer.MAX_VALUE; // L: 45
		this.field3432 = Integer.MAX_VALUE; // L: 46
		this.field3446 = Integer.MAX_VALUE; // L: 47
		this.field3455 = 0; // L: 48
		this.field3445 = 0; // L: 49
		this.field3457 = 0; // L: 50
		this.field3458 = 0; // L: 51
		this.field3439.method6905(1); // L: 56
		this.field3453.method6905(1); // L: 57
	} // L: 58

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "383325496"
	)
	void method5945() {
		this.field3443 = (this.field3443 + 1) % 60; // L: 61
		if (this.field3456 > 0) { // L: 62
			--this.field3456; // L: 63
		}

	} // L: 65

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "115"
	)
	public boolean method5767(boolean var1) {
		var1 = var1 && this.field3442; // L: 68
		boolean var2 = this.field3441 != var1; // L: 69
		this.field3441 = var1; // L: 70
		if (!this.field3441) { // L: 71
			this.method5791(this.field3448, this.field3448); // L: 72
		}

		return var2; // L: 74
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "482660072"
	)
	public void method5843(boolean var1) {
		this.field3442 = var1; // L: 78
		this.field3441 = var1 && this.field3441; // L: 79
	} // L: 80

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1493841080"
	)
	boolean method5769(String var1) {
		String var2 = this.field3439.method6880(); // L: 83
		if (!var2.equals(var1)) { // L: 84
			var1 = this.method5877(var1); // L: 85
			this.field3439.method6895(var1); // L: 86
			this.method5946(this.field3457, this.field3458); // L: 87
			this.method5839(); // L: 88
			this.method5844(); // L: 89
			return true; // L: 90
		} else {
			return false; // L: 92
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1915740339"
	)
	boolean method5790(String var1) {
		this.field3453.method6895(var1); // L: 96
		return true; // L: 97
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)Z",
		garbageValue = "-1861202727"
	)
	boolean method5771(AbstractFont var1) {
		boolean var2 = !this.field3433; // L: 101
		this.field3439.method6888(var1); // L: 102
		this.field3453.method6888(var1); // L: 103
		this.field3433 = true; // L: 104
		var2 |= this.method5946(this.field3457, this.field3458); // L: 105
		var2 |= this.method5791(this.field3449, this.field3448); // L: 106
		if (this.method5839()) { // L: 107
			this.method5844(); // L: 108
			var2 = true; // L: 109
		}

		return var2; // L: 111
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIS)Z",
		garbageValue = "18021"
	)
	public boolean method5772(int var1, int var2) {
		boolean var3 = this.field3455 != var1 || var2 != this.field3445; // L: 115
		this.field3455 = var1; // L: 116
		this.field3445 = var2; // L: 117
		var3 |= this.method5946(this.field3457, this.field3458); // L: 118
		return var3; // L: 119
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2055398543"
	)
	public boolean method5773(int var1) {
		if (var1 < 0) { // L: 123
			var1 = Integer.MAX_VALUE; // L: 124
		}

		boolean var2 = var1 == this.field3439.method6906(); // L: 126
		this.field3439.method6886(var1, true); // L: 127
		this.field3453.method6886(var1, true); // L: 128
		if (this.method5839()) { // L: 129
			this.method5844(); // L: 130
			var2 = true; // L: 131
		}

		return var2; // L: 133
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "37"
	)
	public boolean method5774(int var1) {
		if (var1 < 0) { // L: 137
			this.field3452 = Integer.MAX_VALUE; // L: 138
		} else {
			this.field3452 = var1; // L: 141
		}

		if (this.method5839()) { // L: 143
			this.method5844(); // L: 144
			return true; // L: 145
		} else {
			return false; // L: 147
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "397477575"
	)
	public boolean method5775(int var1) {
		this.field3446 = var1; // L: 151
		if (this.method5839()) { // L: 152
			this.method5844(); // L: 153
			return true; // L: 154
		} else {
			return false; // L: 156
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "50"
	)
	public boolean method5946(int var1, int var2) {
		if (!this.method5906()) { // L: 160
			this.field3457 = var1; // L: 161
			this.field3458 = var2; // L: 162
			return false; // L: 163
		} else {
			int var3 = this.field3457; // L: 165
			int var4 = this.field3458; // L: 166
			int var5 = Math.max(0, this.field3439.method6901() - this.field3455 + 2); // L: 167
			int var6 = Math.max(0, this.field3439.method6969() - this.field3445 + 1); // L: 168
			this.field3457 = Math.max(0, Math.min(var5, var1)); // L: 169
			this.field3458 = Math.max(0, Math.min(var6, var2)); // L: 170
			return var3 != this.field3457 || var4 != this.field3458; // L: 171
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2031540867"
	)
	public boolean method5777(int var1, int var2) {
		return true; // L: 175
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1121255176"
	)
	public void method5778(int var1) {
		this.field3439.method6890(var1); // L: 179
	} // L: 180

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "56"
	)
	public void method5779(int var1) {
		this.field3444 = var1; // L: 183
	} // L: 184

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "273310275"
	)
	public void method5780(int var1) {
		this.field3439.method6905(var1); // L: 187
	} // L: 188

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1640345033"
	)
	public void method5781(int var1) {
		this.field3439.method6887(var1); // L: 191
	} // L: 192

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-327130862"
	)
	public boolean method5936(int var1) {
		this.field3447 = var1; // L: 195
		String var2 = this.field3439.method6880(); // L: 196
		int var3 = var2.length(); // L: 197
		var2 = this.method5877(var2); // L: 198
		if (var2.length() != var3) { // L: 199
			this.field3439.method6895(var2); // L: 200
			this.method5946(this.field3457, this.field3458); // L: 201
			this.method5839(); // L: 202
			this.method5844(); // L: 203
			return true; // L: 204
		} else {
			return false; // L: 206
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-558918319"
	)
	public void method5783() {
		this.field3433 = false; // L: 210
	} // L: 211

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1127335642"
	)
	public boolean method5784(int var1) {
		if (this.method5845(var1)) { // L: 214
			this.method5789(); // L: 215
			class366 var2 = this.field3439.method6885((char)var1, this.field3448, this.field3432, this.field3452); // L: 216
			this.method5791(var2.method6990(), var2.method6990()); // L: 217
			this.method5839(); // L: 218
			this.method5844(); // L: 219
		}

		return true; // L: 221
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1895876307"
	)
	public void method5823() {
		if (!this.method5789() && this.field3448 > 0) { // L: 225
			int var1 = this.field3439.method6897(this.field3448 - 1); // L: 226
			this.method5844(); // L: 227
			this.method5791(var1, var1); // L: 228
		}

	} // L: 230

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1476990491"
	)
	public void method5872() {
		if (!this.method5789() && this.field3448 < this.field3439.method6943()) { // L: 233
			int var1 = this.field3439.method6897(this.field3448); // L: 234
			this.method5844(); // L: 235
			this.method5791(var1, var1); // L: 236
		}

	} // L: 238

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2105237791"
	)
	public void method5787() {
		if (!this.method5789() && this.field3448 > 0) { // L: 241
			class437 var1 = this.method5837(this.field3448 - 1); // L: 242
			int var2 = this.field3439.method6898((Integer)var1.field4764, this.field3448); // L: 243
			this.method5844(); // L: 244
			this.method5791(var2, var2); // L: 245
		}

	} // L: 247

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	public void method5953() {
		if (!this.method5789() && this.field3448 < this.field3439.method6943()) { // L: 250
			class437 var1 = this.method5837(this.field3448); // L: 251
			int var2 = this.field3439.method6898(this.field3448, (Integer)var1.field4765); // L: 252
			this.method5844(); // L: 253
			this.method5791(var2, var2); // L: 254
		}

	} // L: 256

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "391672360"
	)
	boolean method5789() {
		if (!this.method5834()) { // L: 259
			return false;
		} else {
			int var1 = this.field3439.method6898(this.field3449, this.field3448); // L: 260
			this.method5844(); // L: 261
			this.method5791(var1, var1); // L: 262
			return true; // L: 263
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1350000651"
	)
	public void method5770() {
		this.method5791(0, this.field3439.method6943()); // L: 267
	} // L: 268

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "602500049"
	)
	public boolean method5791(int var1, int var2) {
		if (!this.method5906()) { // L: 271
			this.field3449 = var1; // L: 272
			this.field3448 = var2; // L: 273
			return false; // L: 274
		} else {
			if (var1 > this.field3439.method6943()) { // L: 276
				var1 = this.field3439.method6943(); // L: 277
			}

			if (var2 > this.field3439.method6943()) { // L: 279
				var2 = this.field3439.method6943(); // L: 280
			}

			boolean var3 = this.field3449 != var1 || var2 != this.field3448; // L: 282
			this.field3449 = var1; // L: 283
			if (var2 != this.field3448) { // L: 284
				this.field3448 = var2; // L: 285
				this.field3443 = 0; // L: 286
				this.method5794(); // L: 287
			}

			if (var3 && this.field3460 != null) { // L: 289 290
				this.field3460.vmethod5708(); // L: 291
			}

			return var3; // L: 294
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-668853391"
	)
	public void method5792(boolean var1) {
		class437 var2 = this.method5838(this.field3448); // L: 298
		this.method5904((Integer)var2.field4764, var1); // L: 299
	} // L: 300

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "73"
	)
	public void method5853(boolean var1) {
		class437 var2 = this.method5838(this.field3448); // L: 303
		this.method5904((Integer)var2.field4765, var1); // L: 304
	} // L: 305

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "29"
	)
	public void method5867(boolean var1) {
		this.method5904(0, var1); // L: 308
	} // L: 309

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-107"
	)
	public void method5825(boolean var1) {
		this.method5904(this.field3439.method6943(), var1); // L: 312
	} // L: 313

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-292624657"
	)
	public void method6028(boolean var1) {
		if (this.method5834() && !var1) { // L: 316
			this.method5904(Math.min(this.field3449, this.field3448), var1); // L: 317
		} else if (this.field3448 > 0) { // L: 319
			this.method5904(this.field3448 - 1, var1); // L: 320
		}

	} // L: 322

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2000790065"
	)
	public void method5786(boolean var1) {
		if (this.method5834() && !var1) { // L: 325
			this.method5904(Math.max(this.field3449, this.field3448), var1); // L: 326
		} else if (this.field3448 < this.field3439.method6943()) { // L: 328
			this.method5904(this.field3448 + 1, var1); // L: 329
		}

	} // L: 331

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "32"
	)
	public void method5798(boolean var1) {
		if (this.field3448 > 0) { // L: 334
			class437 var2 = this.method5837(this.field3448 - 1); // L: 335
			this.method5904((Integer)var2.field4764, var1); // L: 336
		}

	} // L: 338

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "32"
	)
	public void method5799(boolean var1) {
		if (this.field3448 < this.field3439.method6943()) { // L: 341
			class437 var2 = this.method5837(this.field3448 + 1); // L: 342
			this.method5904((Integer)var2.field4765, var1); // L: 343
		}

	} // L: 345

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1676919578"
	)
	public void method5886(boolean var1) {
		if (this.field3448 > 0) { // L: 348
			this.method5904(this.field3439.method6900(this.field3448, -1), var1); // L: 349
		}

	} // L: 351

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-15"
	)
	public void method6010(boolean var1) {
		if (this.field3448 < this.field3439.method6943()) { // L: 354
			this.method5904(this.field3439.method6900(this.field3448, 1), var1); // L: 355
		}

	} // L: 357

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "90"
	)
	public void method5768(boolean var1) {
		if (this.field3448 > 0) { // L: 360
			int var2 = this.method5841(); // L: 361
			this.method5904(this.field3439.method6900(this.field3448, -var2), var1); // L: 362
		}

	} // L: 364

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "100"
	)
	public void method5803(boolean var1) {
		if (this.field3448 < this.field3439.method6943()) { // L: 367
			int var2 = this.method5841(); // L: 368
			this.method5904(this.field3439.method6900(this.field3448, var2), var1); // L: 369
		}

	} // L: 371

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "172420565"
	)
	public void method5937(boolean var1) {
		class369 var2 = this.field3439.method6891(0, this.field3448); // L: 374
		class437 var3 = var2.method7101(); // L: 375
		this.method5904(this.field3439.method6930((Integer)var3.field4764, this.field3458), var1); // L: 376
	} // L: 377

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2076196179"
	)
	public void method5805(boolean var1) {
		class369 var2 = this.field3439.method6891(0, this.field3448); // L: 380
		class437 var3 = var2.method7101(); // L: 381
		this.method5904(this.field3439.method6930((Integer)var3.field4764, this.field3445 + this.field3458), var1); // L: 382
	} // L: 383

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-243047032"
	)
	public void method5806(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false; // L: 386
		int var8;
		if (!this.field3433) { // L: 387
			var8 = 0; // L: 388
		} else {
			var1 += this.field3457; // L: 391
			var2 += this.field3458; // L: 392
			var8 = this.field3439.method6930(var1, var2); // L: 393
		}

		class437 var6;
		if (var3 && var4) { // L: 395
			this.field3451 = 1; // L: 396
			var6 = this.method5837(var8); // L: 397
			class437 var7 = this.method5837(this.field3450); // L: 398
			this.method5836(var7, var6); // L: 399
		} else if (var3) { // L: 401
			this.field3451 = 1; // L: 402
			var6 = this.method5837(var8); // L: 403
			this.method5791((Integer)var6.field4764, (Integer)var6.field4765); // L: 404
			this.field3450 = (Integer)var6.field4764; // L: 405
		} else if (var4) { // L: 407
			this.method5791(this.field3450, var8); // L: 408
		} else {
			if (this.field3456 > 0 && var8 == this.field3450) { // L: 411
				if (this.field3448 == this.field3449) { // L: 412
					this.field3451 = 1; // L: 413
					var6 = this.method5837(var8); // L: 414
					this.method5791((Integer)var6.field4764, (Integer)var6.field4765); // L: 415
				} else {
					this.field3451 = 2; // L: 418
					var6 = this.method5838(var8); // L: 419
					this.method5791((Integer)var6.field4764, (Integer)var6.field4765); // L: 420
				}
			} else {
				this.field3451 = 0; // L: 424
				this.method5791(var8, var8); // L: 425
				this.field3450 = var8; // L: 426
			}

			this.field3456 = 25; // L: 428
		}

	} // L: 430

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "487730188"
	)
	public void method5807(int var1, int var2) {
		if (this.field3433 && this.method5800()) { // L: 433
			var1 += this.field3457; // L: 434
			var2 += this.field3458; // L: 435
			int var3 = this.field3439.method6930(var1, var2); // L: 436
			class437 var4;
			class437 var5;
			switch(this.field3451) { // L: 437
			case 0:
				this.method5791(this.field3449, var3); // L: 447
				break; // L: 448
			case 1:
				var4 = this.method5837(this.field3450); // L: 452
				var5 = this.method5837(var3); // L: 453
				this.method5836(var4, var5); // L: 454
				break; // L: 455
			case 2:
				var4 = this.method5838(this.field3450); // L: 440
				var5 = this.method5838(var3); // L: 441
				this.method5836(var4, var5); // L: 442
			}
		}

	} // L: 459

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1568945485"
	)
	public void method5840(Clipboard var1) {
		class369 var2 = this.field3439.method6891(this.field3449, this.field3448); // L: 462
		if (!var2.method7097()) { // L: 463
			String var3 = var2.method7116(); // L: 464
			if (!var3.isEmpty()) { // L: 465
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null); // L: 466
			}
		}

	} // L: 469

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "15"
	)
	public void method5809(Clipboard var1) {
		if (this.method5834()) { // L: 472
			this.method5840(var1); // L: 473
			this.method5789(); // L: 474
		}

	} // L: 476

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1634663255"
	)
	public void method5854(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null); // L: 479
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) { // L: 480
			try {
				String var3 = this.method5877((String)var2.getTransferData(DataFlavor.stringFlavor)); // L: 482
				this.method5789(); // L: 483
				class366 var4 = this.field3439.method6935(var3, this.field3448, this.field3432, this.field3452); // L: 484
				this.method5791(var4.method6990(), var4.method6990()); // L: 485
				this.method5839(); // L: 486
				this.method5844(); // L: 487
			} catch (Exception var5) { // L: 489
				System.out.println("Error pasting clipboard to InputField."); // L: 490
			}
		}

	} // L: 493

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1950882813"
	)
	public void method5917() {
		this.field3458 = Math.max(0, this.field3458 - this.field3439.method6903()); // L: 496
	} // L: 497

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1850755217"
	)
	public void method5804() {
		int var1 = Math.max(0, this.field3439.method6969() - this.field3445); // L: 500
		this.field3458 = Math.min(var1, this.field3458 + this.field3439.method6903()); // L: 501
	} // L: 502

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lko;I)V",
		garbageValue = "-1874509338"
	)
	public void method5813(class294 var1) {
		this.field3459 = var1; // L: 505
	} // L: 506

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lko;I)V",
		garbageValue = "-181076367"
	)
	public void method5814(class294 var1) {
		this.field3460 = var1; // L: 509
	} // L: 510

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lnz;",
		garbageValue = "32"
	)
	public class365 method5962() {
		return this.field3439; // L: 513
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Lnz;",
		garbageValue = "-126"
	)
	public class365 method5816() {
		return this.field3453; // L: 517
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lnx;",
		garbageValue = "-597710352"
	)
	public class369 method5817() {
		return this.field3439.method6891(this.field3449, this.field3448); // L: 521
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-608221962"
	)
	public boolean method5800() {
		return this.field3441; // L: 525
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1202348163"
	)
	public boolean method5819() {
		return this.field3442; // L: 529
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1073760412"
	)
	public boolean method5820() {
		return this.method5800() && this.field3443 % 60 < 30; // L: 533
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	public int method5821() {
		return this.field3448; // L: 537
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1609260206"
	)
	public int method5898() {
		return this.field3449; // L: 541
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1918729793"
	)
	public boolean method5906() {
		return this.field3433; // L: 545
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1947511226"
	)
	public int method5824() {
		return this.field3457; // L: 549
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "2678"
	)
	public int method5892() {
		return this.field3458; // L: 553
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-17"
	)
	public int method5826() {
		return this.field3439.method6906(); // L: 557
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "9"
	)
	public int method5827() {
		return this.field3452; // L: 561
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2138124933"
	)
	public int method5828() {
		return this.field3446; // L: 565
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-47"
	)
	public int method5829() {
		return this.field3444; // L: 569
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "987980022"
	)
	public int method6030() {
		return this.field3439.method6893(); // L: 573
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1929938372"
	)
	public int method5954() {
		return this.field3447; // L: 577
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "956147758"
	)
	public int method5832() {
		return this.field3439.method6908(); // L: 581
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2138423281"
	)
	public boolean method5833() {
		return this.field3452 > 1; // L: 585
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1205531866"
	)
	boolean method5834() {
		return this.field3448 != this.field3449; // L: 589
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1980903671"
	)
	String method5877(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length()); // L: 593

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 594
			char var4 = var1.charAt(var3); // L: 595
			if (this.method5845(var4)) { // L: 596
				var2.append(var4); // L: 597
			}
		}

		return var2.toString(); // L: 600
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lpv;Lpv;I)V",
		garbageValue = "-634283126"
	)
	void method5836(class437 var1, class437 var2) {
		if ((Integer)var2.field4764 < (Integer)var1.field4764) { // L: 604
			this.method5791((Integer)var1.field4765, (Integer)var2.field4764); // L: 605
		} else {
			this.method5791((Integer)var1.field4764, (Integer)var2.field4765); // L: 608
		}

	} // L: 610

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)Lpv;",
		garbageValue = "-1473052836"
	)
	class437 method5837(int var1) {
		int var2 = this.field3439.method6943(); // L: 613
		int var3 = 0; // L: 614
		int var4 = var2; // L: 615

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 616
			if (this.method5975(this.field3439.method6881(var5 - 1).field4347)) { // L: 617
				var3 = var5; // L: 618
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 622
			if (this.method5975(this.field3439.method6881(var5).field4347)) { // L: 623
				var4 = var5; // L: 624
				break;
			}
		}

		return new class437(var3, var4); // L: 628
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)Lpv;",
		garbageValue = "-1838714256"
	)
	class437 method5838(int var1) {
		int var2 = this.field3439.method6943(); // L: 632
		int var3 = 0; // L: 633
		int var4 = var2; // L: 634

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 635
			if (this.field3439.method6881(var5 - 1).field4347 == '\n') { // L: 636
				var3 = var5; // L: 637
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 641
			if (this.field3439.method6881(var5).field4347 == '\n') { // L: 642
				var4 = var5; // L: 643
				break;
			}
		}

		return new class437(var3, var4); // L: 647
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2108562318"
	)
	boolean method5839() {
		if (!this.method5906()) { // L: 651
			return false;
		} else {
			boolean var1 = false; // L: 652
			if (this.field3439.method6943() > this.field3446) { // L: 653
				this.field3439.method6898(this.field3446, this.field3439.method6943()); // L: 654
				var1 = true; // L: 655
			}

			int var2;
			if (this.field3439.method6904() > this.field3452) { // L: 657
				var2 = this.field3439.method6900(0, this.field3452) - 1; // L: 658
				this.field3439.method6898(var2, this.field3439.method6943()); // L: 659
				var1 = true; // L: 660
			}

			if (var1) { // L: 662
				var2 = this.field3448; // L: 663
				int var3 = this.field3449; // L: 664
				int var4 = this.field3439.method6943(); // L: 665
				if (this.field3448 > var4) { // L: 666
					var2 = var4; // L: 667
				}

				if (this.field3449 > var4) { // L: 669
					var3 = var4; // L: 670
				}

				this.method5791(var3, var2); // L: 672
			}

			return var1; // L: 674
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-380525563"
	)
	void method5904(int var1, boolean var2) {
		if (var2) { // L: 678
			this.method5791(this.field3449, var1);
		} else {
			this.method5791(var1, var1); // L: 679
		}

	} // L: 680

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-13"
	)
	int method5841() {
		return this.field3445 / this.field3439.method6903(); // L: 683
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method5794() {
		class369 var1 = this.field3439.method6891(0, this.field3448); // L: 687
		class437 var2 = var1.method7101(); // L: 688
		int var3 = this.field3439.method6903(); // L: 689
		int var4 = (Integer)var2.field4764 - 10; // L: 690
		int var5 = var4 + 20; // L: 691
		int var6 = (Integer)var2.field4765 - 3; // L: 692
		int var7 = var6 + var3 + 6; // L: 693
		int var8 = this.field3457; // L: 694
		int var9 = var8 + this.field3455; // L: 695
		int var10 = this.field3458; // L: 696
		int var11 = var10 + this.field3445; // L: 697
		int var12 = this.field3457; // L: 698
		int var13 = this.field3458; // L: 699
		if (var4 < var8) { // L: 700
			var12 = var4; // L: 701
		} else if (var5 > var9) { // L: 703
			var12 = var5 - this.field3455; // L: 704
		}

		if (var6 < var10) { // L: 706
			var13 = var6; // L: 707
		} else if (var7 > var11) { // L: 709
			var13 = var7 - this.field3445; // L: 710
		}

		this.method5946(var12, var13); // L: 712
	} // L: 713

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "15"
	)
	boolean method5975(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9; // L: 716
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	void method5844() {
		if (this.field3459 != null) { // L: 720
			this.field3459.vmethod5708(); // L: 721
		}

	} // L: 723

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-128"
	)
	boolean method5845(int var1) {
		switch(this.field3447) { // L: 726
		case 1:
			return ClanSettings.isAlphaNumeric((char)var1); // L: 734
		case 2:
			return BuddyRankComparator.isCharAlphabetic((char)var1); // L: 730
		case 3:
			return GrandExchangeOffer.isDigit((char)var1); // L: 728
		case 4:
			char var2 = (char)var1; // L: 736
			if (GrandExchangeOffer.isDigit(var2)) { // L: 737
				return true; // L: 738
			} else {
				if (var2 != 'k' && var2 != 'K' && var2 != 'm' && var2 != 'M' && var2 != 'b' && var2 != 'B') { // L: 740
					return false; // L: 743
				}

				return true; // L: 741
			}
		default:
			return true; // L: 732
		}
	}
}
