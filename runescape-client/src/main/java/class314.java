import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
public class class314 {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	class379 field3536;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	class379 field3535;
	@ObfuscatedName("as")
	boolean field3530;
	@ObfuscatedName("aj")
	boolean field3531;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -870124373
	)
	int field3532;
	@ObfuscatedName("az")
	boolean field3533;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1959011707
	)
	int field3534;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -971547877
	)
	int field3546;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -947277461
	)
	int field3528;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1350344153
	)
	int field3537;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 542296527
	)
	int field3538;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -600117957
	)
	int field3539;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 2106407237
	)
	int field3540;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1383048587
	)
	int field3541;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -522869069
	)
	int field3542;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -212351097
	)
	int field3523;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1953737631
	)
	int field3544;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -466889091
	)
	int field3545;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 607166941
	)
	int field3524;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	class308 field3547;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	class308 field3548;

	class314() {
		this.field3536 = new class379();
		this.field3535 = new class379();
		this.field3530 = false; // L: 34
		this.field3531 = true;
		this.field3532 = 0;
		this.field3533 = false;
		this.field3534 = 0; // L: 38
		this.field3546 = 0;
		this.field3528 = 0;
		this.field3537 = 0;
		this.field3538 = 0;
		this.field3539 = 0;
		this.field3540 = 0;
		this.field3541 = Integer.MAX_VALUE;
		this.field3542 = Integer.MAX_VALUE; // L: 46
		this.field3523 = 0;
		this.field3544 = 0;
		this.field3545 = 0;
		this.field3524 = 0; // L: 50
		this.field3536.method7270(1);
		this.field3535.method7270(1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-76"
	)
	void method6283() {
		this.field3532 = (this.field3532 + 1) % 60;
		if (this.field3540 > 0) {
			--this.field3540; // L: 62
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-825756514"
	)
	public boolean method6087(boolean var1) {
		var1 = var1 && this.field3531;
		boolean var2 = this.field3530 != var1;
		this.field3530 = var1;
		if (!this.field3530) { // L: 70
			this.method6111(this.field3537, this.field3537);
		}

		return var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1575779976"
	)
	public void method6088(boolean var1) {
		this.field3531 = var1;
		this.field3530 = var1 && this.field3530;
	} // L: 79

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1247495644"
	)
	boolean method6089(String var1) {
		String var2 = this.field3536.method7265();
		if (!var2.equals(var1)) { // L: 83
			var1 = this.method6155(var1);
			this.field3536.method7277(var1);
			this.method6096(this.field3545, this.field3524);
			this.method6159(); // L: 87
			this.method6164();
			return true;
		} else {
			return false; // L: 91
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "2"
	)
	boolean method6090(String var1) {
		this.field3535.method7277(var1); // L: 95
		return true;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lou;I)Z",
		garbageValue = "1219787460"
	)
	boolean method6129(AbstractFont var1) {
		boolean var2 = !this.field3533;
		this.field3536.method7373(var1);
		this.field3535.method7373(var1);
		this.field3533 = true; // L: 103
		var2 |= this.method6096(this.field3545, this.field3524);
		var2 |= this.method6111(this.field3538, this.field3537);
		if (this.method6159()) {
			this.method6164();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "63"
	)
	public boolean method6092(int var1, int var2) {
		boolean var3 = this.field3523 != var1 || var2 != this.field3544;
		this.field3523 = var1; // L: 115
		this.field3544 = var2;
		var3 |= this.method6096(this.field3545, this.field3524);
		return var3;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2034737462"
	)
	public boolean method6093(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field3536.method7379();
		this.field3536.method7320(var1); // L: 126
		this.field3535.method7320(var1);
		if (this.method6159()) {
			this.method6164();
			var2 = true; // L: 130
		}

		return var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "16"
	)
	public boolean method6336(int var1) {
		this.field3536.method7261(var1);
		if (this.method6159()) {
			this.method6164(); // L: 138
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1888462912"
	)
	public boolean method6095(int var1) {
		this.field3542 = var1;
		if (this.method6159()) {
			this.method6164(); // L: 147
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "24"
	)
	public boolean method6096(int var1, int var2) {
		if (!this.method6143()) {
			this.field3545 = var1; // L: 155
			this.field3524 = var2;
			return false;
		} else {
			int var3 = this.field3545; // L: 159
			int var4 = this.field3524;
			int var5 = Math.max(0, this.field3536.method7283() - this.field3523 + 2);
			int var6 = Math.max(0, this.field3536.method7284() - this.field3544 + 1);
			this.field3545 = Math.max(0, Math.min(var5, var1)); // L: 163
			this.field3524 = Math.max(0, Math.min(var6, var2)); // L: 164
			return var3 != this.field3545 || var4 != this.field3524;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1553777879"
	)
	public boolean method6097(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) { // L: 170
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) { // L: 173
			var3 = false; // L: 174
		}

		return var3 ? this.field3536.method7271(var1, var2) : false; // L: 176 177 179
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2084045870"
	)
	public void method6098(int var1) {
		this.field3536.method7272(var1); // L: 183
	} // L: 184

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1564790862"
	)
	public void method6086(int var1) {
		this.field3534 = var1; // L: 187
	} // L: 188

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1444501030"
	)
	public void method6100(int var1) {
		this.field3536.method7270(var1); // L: 191
	} // L: 192

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-6347"
	)
	public void method6101(int var1) {
		this.field3536.method7298(var1); // L: 195
	} // L: 196

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "59"
	)
	public boolean method6102(int var1) {
		this.field3528 = var1; // L: 199
		String var2 = this.field3536.method7265(); // L: 200
		int var3 = var2.length(); // L: 201
		var2 = this.method6155(var2); // L: 202
		if (var2.length() != var3) { // L: 203
			this.field3536.method7277(var2); // L: 204
			this.method6096(this.field3545, this.field3524); // L: 205
			this.method6159(); // L: 206
			this.method6164(); // L: 207
			return true; // L: 208
		} else {
			return false; // L: 210
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-83630880"
	)
	public void method6215() {
		this.field3533 = false; // L: 214
	} // L: 215

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-337201766"
	)
	public boolean method6104(int var1) {
		if (this.method6163(var1)) { // L: 218
			this.method6109(); // L: 219
			class380 var2 = this.field3536.method7307((char)var1, this.field3537, this.field3541); // L: 220
			this.method6111(var2.method7396(), var2.method7396()); // L: 221
			this.method6159(); // L: 222
			this.method6164(); // L: 223
		}

		return true; // L: 225
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1712590947"
	)
	public void method6207() {
		if (!this.method6109() && this.field3537 > 0) { // L: 229
			int var1 = this.field3536.method7279(this.field3537 - 1); // L: 230
			this.method6164(); // L: 231
			this.method6111(var1, var1); // L: 232
		}

	} // L: 234

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-11"
	)
	public void method6167() {
		if (!this.method6109() && this.field3537 < this.field3536.method7264()) { // L: 237
			int var1 = this.field3536.method7279(this.field3537); // L: 238
			this.method6164(); // L: 239
			this.method6111(var1, var1); // L: 240
		}

	} // L: 242

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1555798008"
	)
	public void method6290() {
		if (!this.method6109() && this.field3537 > 0) { // L: 245
			class461 var1 = this.method6157(this.field3537 - 1); // L: 246
			int var2 = this.field3536.method7280((Integer)var1.field4886, this.field3537); // L: 247
			this.method6164(); // L: 248
			this.method6111(var2, var2); // L: 249
		}

	} // L: 251

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2132510379"
	)
	public void method6342() {
		if (!this.method6109() && this.field3537 < this.field3536.method7264()) { // L: 254
			class461 var1 = this.method6157(this.field3537); // L: 255
			int var2 = this.field3536.method7280(this.field3537, (Integer)var1.field4887); // L: 256
			this.method6164(); // L: 257
			this.method6111(var2, var2); // L: 258
		}

	} // L: 260

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1772299463"
	)
	boolean method6109() {
		if (!this.method6154()) { // L: 263
			return false;
		} else {
			int var1 = this.field3536.method7280(this.field3538, this.field3537); // L: 264
			this.method6164(); // L: 265
			this.method6111(var1, var1); // L: 266
			return true; // L: 267
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-26"
	)
	public void method6352() {
		this.method6111(0, this.field3536.method7264()); // L: 271
	} // L: 272

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "19"
	)
	public boolean method6111(int var1, int var2) {
		if (!this.method6143()) { // L: 275
			this.field3538 = var1; // L: 276
			this.field3537 = var2; // L: 277
			return false; // L: 278
		} else {
			if (var1 > this.field3536.method7264()) { // L: 280
				var1 = this.field3536.method7264(); // L: 281
			}

			if (var2 > this.field3536.method7264()) { // L: 283
				var2 = this.field3536.method7264(); // L: 284
			}

			boolean var3 = this.field3538 != var1 || var2 != this.field3537; // L: 286
			this.field3538 = var1; // L: 287
			if (var2 != this.field3537) { // L: 288
				this.field3537 = var2; // L: 289
				this.field3532 = 0; // L: 290
				this.method6162(); // L: 291
			}

			if (var3 && this.field3548 != null) { // L: 293 294
				this.field3548.vmethod6027(); // L: 295
			}

			return var3; // L: 298
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-994542859"
	)
	public void method6108(boolean var1) {
		class461 var2 = this.method6158(this.field3537); // L: 302
		this.method6160((Integer)var2.field4886, var1); // L: 303
	} // L: 304

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-84102297"
	)
	public void method6217(boolean var1) {
		class461 var2 = this.method6158(this.field3537); // L: 307
		this.method6160((Integer)var2.field4887, var1); // L: 308
	} // L: 309

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "78"
	)
	public void method6114(boolean var1) {
		this.method6160(0, var1); // L: 312
	} // L: 313

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-19"
	)
	public void method6222(boolean var1) {
		this.method6160(this.field3536.method7264(), var1); // L: 316
	} // L: 317

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "728659002"
	)
	public void method6116(boolean var1) {
		if (this.method6154() && !var1) { // L: 320
			this.method6160(Math.min(this.field3538, this.field3537), var1); // L: 321
		} else if (this.field3537 > 0) { // L: 323
			this.method6160(this.field3537 - 1, var1); // L: 324
		}

	} // L: 326

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1785240009"
	)
	public void method6117(boolean var1) {
		if (this.method6154() && !var1) { // L: 329
			this.method6160(Math.max(this.field3538, this.field3537), var1); // L: 330
		} else if (this.field3537 < this.field3536.method7264()) { // L: 332
			this.method6160(this.field3537 + 1, var1); // L: 333
		}

	} // L: 335

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "355798212"
	)
	public void method6351(boolean var1) {
		if (this.field3537 > 0) { // L: 338
			class461 var2 = this.method6157(this.field3537 - 1); // L: 339
			this.method6160((Integer)var2.field4886, var1); // L: 340
		}

	} // L: 342

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "3"
	)
	public void method6119(boolean var1) {
		if (this.field3537 < this.field3536.method7264()) { // L: 345
			class461 var2 = this.method6157(this.field3537 + 1); // L: 346
			this.method6160((Integer)var2.field4887, var1); // L: 347
		}

	} // L: 349

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "52"
	)
	public void method6120(boolean var1) {
		if (this.field3537 > 0) { // L: 352
			this.method6160(this.field3536.method7282(this.field3537, -1), var1); // L: 353
		}

	} // L: 355

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-45"
	)
	public void method6121(boolean var1) {
		if (this.field3537 < this.field3536.method7264()) { // L: 358
			this.method6160(this.field3536.method7282(this.field3537, 1), var1); // L: 359
		}

	} // L: 361

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	public void method6122(boolean var1) {
		if (this.field3537 > 0) { // L: 364
			int var2 = this.method6161(); // L: 365
			this.method6160(this.field3536.method7282(this.field3537, -var2), var1); // L: 366
		}

	} // L: 368

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "12979"
	)
	public void method6107(boolean var1) {
		if (this.field3537 < this.field3536.method7264()) { // L: 371
			int var2 = this.method6161(); // L: 372
			this.method6160(this.field3536.method7282(this.field3537, var2), var1); // L: 373
		}

	} // L: 375

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1605724073"
	)
	public void method6124(boolean var1) {
		class383 var2 = this.field3536.method7341(0, this.field3537); // L: 378
		class461 var3 = var2.method7512(); // L: 379
		this.method6160(this.field3536.method7281((Integer)var3.field4886, this.field3524), var1); // L: 380
	} // L: 381

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1731882601"
	)
	public void method6110(boolean var1) {
		class383 var2 = this.field3536.method7341(0, this.field3537); // L: 384
		class461 var3 = var2.method7512(); // L: 385
		this.method6160(this.field3536.method7281((Integer)var3.field4886, this.field3544 + this.field3524), var1); // L: 386
	} // L: 387

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "1549873407"
	)
	public void method6126(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false; // L: 390
		class461 var6;
		int var8;
		if (!this.field3533) { // L: 391
			var8 = 0; // L: 392
		} else {
			var1 += this.field3545; // L: 395
			var2 += this.field3524; // L: 396
			var6 = this.method6166(); // L: 397
			var8 = this.field3536.method7281(var1 - (Integer)var6.field4886, var2 - (Integer)var6.field4887); // L: 398
		}

		if (var3 && var4) { // L: 400
			this.field3546 = 1; // L: 401
			var6 = this.method6157(var8); // L: 402
			class461 var7 = this.method6157(this.field3539); // L: 403
			this.method6156(var7, var6); // L: 404
		} else if (var3) { // L: 406
			this.field3546 = 1; // L: 407
			var6 = this.method6157(var8); // L: 408
			this.method6111((Integer)var6.field4886, (Integer)var6.field4887); // L: 409
			this.field3539 = (Integer)var6.field4886; // L: 410
		} else if (var4) { // L: 412
			this.method6111(this.field3539, var8); // L: 413
		} else {
			if (this.field3540 > 0 && var8 == this.field3539) { // L: 416
				if (this.field3538 == this.field3537) { // L: 417
					this.field3546 = 1; // L: 418
					var6 = this.method6157(var8); // L: 419
					this.method6111((Integer)var6.field4886, (Integer)var6.field4887); // L: 420
				} else {
					this.field3546 = 2; // L: 423
					var6 = this.method6158(var8); // L: 424
					this.method6111((Integer)var6.field4886, (Integer)var6.field4887); // L: 425
				}
			} else {
				this.field3546 = 0; // L: 429
				this.method6111(var8, var8); // L: 430
				this.field3539 = var8; // L: 431
			}

			this.field3540 = 25; // L: 433
		}

	} // L: 435

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "915076242"
	)
	public void method6115(int var1, int var2) {
		if (this.field3533 && this.method6138()) { // L: 438
			var1 += this.field3545; // L: 439
			var2 += this.field3524; // L: 440
			class461 var3 = this.method6166(); // L: 441
			int var4 = this.field3536.method7281(var1 - (Integer)var3.field4886, var2 - (Integer)var3.field4887); // L: 442
			class461 var5;
			class461 var6;
			switch(this.field3546) { // L: 443
			case 0:
				this.method6111(this.field3538, var4); // L: 460
				break;
			case 1:
				var5 = this.method6157(this.field3539); // L: 446
				var6 = this.method6157(var4); // L: 447
				this.method6156(var5, var6); // L: 448
				break;
			case 2:
				var5 = this.method6158(this.field3539); // L: 453
				var6 = this.method6158(var4); // L: 454
				this.method6156(var5, var6); // L: 455
			}
		}

	} // L: 465

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "36"
	)
	public void method6128(Clipboard var1) {
		class383 var2 = this.field3536.method7341(this.field3538, this.field3537); // L: 468
		if (!var2.method7513()) { // L: 469
			String var3 = var2.method7522(); // L: 470
			if (!var3.isEmpty()) { // L: 471
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null); // L: 472
			}
		}

	} // L: 475

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "107"
	)
	public void method6273(Clipboard var1) {
		if (this.method6154()) { // L: 478
			this.method6128(var1); // L: 479
			this.method6109(); // L: 480
		}

	} // L: 482

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1794913499"
	)
	public void method6130(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null); // L: 485
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) { // L: 486
			try {
				String var3 = this.method6155((String)var2.getTransferData(DataFlavor.stringFlavor)); // L: 488
				this.method6109(); // L: 489
				class380 var4 = this.field3536.method7275(var3, this.field3537, this.field3541); // L: 490
				this.method6111(var4.method7396(), var4.method7396()); // L: 491
				this.method6159(); // L: 492
				this.method6164(); // L: 493
			} catch (Exception var5) { // L: 495
			}
		}

	} // L: 497

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "113728735"
	)
	public void method6274() {
		this.field3524 = Math.max(0, this.field3524 - this.field3536.method7386()); // L: 500
	} // L: 501

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "113"
	)
	public void method6278() {
		int var1 = Math.max(0, this.field3536.method7284() - this.field3544); // L: 504
		this.field3524 = Math.min(var1, this.field3524 + this.field3536.method7386()); // L: 505
	} // L: 506

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Llx;I)V",
		garbageValue = "-1866870049"
	)
	public void method6132(class308 var1) {
		this.field3547 = var1; // L: 509
	} // L: 510

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Llx;I)V",
		garbageValue = "-1257923429"
	)
	public void method6258(class308 var1) {
		this.field3548 = var1; // L: 513
	} // L: 514

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Loq;",
		garbageValue = "-1580027563"
	)
	public class379 method6135() {
		return this.field3536; // L: 517
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(B)Loq;",
		garbageValue = "-94"
	)
	public class379 method6136() {
		return this.field3535; // L: 521
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Loa;",
		garbageValue = "2061234095"
	)
	public class383 method6137() {
		return this.field3536.method7341(this.field3538, this.field3537); // L: 525
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1877239255"
	)
	public boolean method6138() {
		return this.field3530; // L: 529
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1994580892"
	)
	public boolean method6139() {
		return this.field3531; // L: 533
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-30"
	)
	public boolean method6140() {
		return this.method6138() && this.field3532 % 60 < 30; // L: 537
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-483082370"
	)
	public int method6141() {
		return this.field3537; // L: 541
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1050882526"
	)
	public int method6142() {
		return this.field3538; // L: 545
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "32293634"
	)
	public boolean method6143() {
		return this.field3533; // L: 549
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-57692379"
	)
	public int method6200() {
		return this.field3545; // L: 553
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-91399205"
	)
	public int method6299() {
		return this.field3524; // L: 557
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1594572507"
	)
	public int method6146() {
		return this.field3536.method7379(); // L: 561
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2023379849"
	)
	public int method6329() {
		return this.field3536.method7289(); // L: 565
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1424429838"
	)
	public int method6099() {
		return this.field3542; // L: 569
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-111"
	)
	public int method6149() {
		return this.field3534; // L: 573
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1783004580"
	)
	public int method6148() {
		return this.field3536.method7334(); // L: 577
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2117890366"
	)
	public int method6151() {
		return this.field3528; // L: 581
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-72"
	)
	public int method6152() {
		return this.field3536.method7291(); // L: 585
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1129098287"
	)
	public boolean method6153() {
		return this.method6329() > 1; // L: 589
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-306594009"
	)
	boolean method6154() {
		return this.field3538 != this.field3537; // L: 593
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "83"
	)
	String method6155(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length()); // L: 597

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 598
			char var4 = var1.charAt(var3); // L: 599
			if (this.method6163(var4)) { // L: 600
				var2.append(var4); // L: 601
			}
		}

		return var2.toString(); // L: 604
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Lrg;Lrg;I)V",
		garbageValue = "1153538536"
	)
	void method6156(class461 var1, class461 var2) {
		if ((Integer)var2.field4886 < (Integer)var1.field4886) { // L: 608
			this.method6111((Integer)var1.field4887, (Integer)var2.field4886); // L: 609
		} else {
			this.method6111((Integer)var1.field4886, (Integer)var2.field4887); // L: 612
		}

	} // L: 614

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrg;",
		garbageValue = "-128"
	)
	class461 method6157(int var1) {
		int var2 = this.field3536.method7264(); // L: 617
		int var3 = 0; // L: 618
		int var4 = var2; // L: 619

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 620
			if (this.method6328(this.field3536.method7260(var5 - 1).field4428)) { // L: 621
				var3 = var5; // L: 622
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 626
			if (this.method6328(this.field3536.method7260(var5).field4428)) { // L: 627
				var4 = var5; // L: 628
				break;
			}
		}

		return new class461(var3, var4); // L: 632
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)Lrg;",
		garbageValue = "-600467207"
	)
	class461 method6158(int var1) {
		int var2 = this.field3536.method7264(); // L: 636
		int var3 = 0; // L: 637
		int var4 = var2; // L: 638

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 639
			if (this.field3536.method7260(var5 - 1).field4428 == '\n') { // L: 640
				var3 = var5; // L: 641
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 645
			if (this.field3536.method7260(var5).field4428 == '\n') { // L: 646
				var4 = var5; // L: 647
				break;
			}
		}

		return new class461(var3, var4); // L: 651
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "27"
	)
	boolean method6159() {
		if (!this.method6143()) { // L: 655
			return false;
		} else {
			boolean var1 = false; // L: 656
			if (this.field3536.method7264() > this.field3542) { // L: 657
				this.field3536.method7280(this.field3542, this.field3536.method7264()); // L: 658
				var1 = true; // L: 659
			}

			int var2 = this.method6329(); // L: 661
			int var3;
			if (this.field3536.method7286() > var2) { // L: 662
				var3 = this.field3536.method7282(0, var2) - 1; // L: 663
				this.field3536.method7280(var3, this.field3536.method7264()); // L: 664
				var1 = true; // L: 665
			}

			if (var1) { // L: 667
				var3 = this.field3537; // L: 668
				int var4 = this.field3538; // L: 669
				int var5 = this.field3536.method7264(); // L: 670
				if (this.field3537 > var5) { // L: 671
					var3 = var5; // L: 672
				}

				if (this.field3538 > var5) { // L: 674
					var4 = var5; // L: 675
				}

				this.method6111(var4, var3); // L: 677
			}

			return var1; // L: 679
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "53"
	)
	void method6160(int var1, boolean var2) {
		if (var2) { // L: 683
			this.method6111(this.field3538, var1);
		} else {
			this.method6111(var1, var1); // L: 684
		}

	} // L: 685

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2810550"
	)
	int method6161() {
		return this.field3544 / this.field3536.method7386(); // L: 688
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	void method6162() {
		class383 var1 = this.field3536.method7341(0, this.field3537); // L: 692
		class461 var2 = var1.method7512(); // L: 693
		int var3 = this.field3536.method7386(); // L: 694
		int var4 = (Integer)var2.field4886 - 10; // L: 695
		int var5 = var4 + 20; // L: 696
		int var6 = (Integer)var2.field4887 - 3; // L: 697
		int var7 = var3 + var6 + 6; // L: 698
		int var8 = this.field3545; // L: 699
		int var9 = var8 + this.field3523; // L: 700
		int var10 = this.field3524; // L: 701
		int var11 = var10 + this.field3544; // L: 702
		int var12 = this.field3545; // L: 703
		int var13 = this.field3524; // L: 704
		if (var4 < var8) { // L: 705
			var12 = var4; // L: 706
		} else if (var5 > var9) { // L: 708
			var12 = var5 - this.field3523; // L: 709
		}

		if (var6 < var10) { // L: 711
			var13 = var6; // L: 712
		} else if (var7 > var11) { // L: 714
			var13 = var7 - this.field3544; // L: 715
		}

		this.method6096(var12, var13); // L: 717
	} // L: 718

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1230751066"
	)
	boolean method6328(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9; // L: 721
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1220338251"
	)
	void method6164() {
		if (this.field3547 != null) { // L: 725
			this.field3547.vmethod6027(); // L: 726
		}

	} // L: 728

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "11"
	)
	boolean method6163(int var1) {
		switch(this.field3528) { // L: 731
		case 1:
			return MenuAction.isAlphaNumeric((char)var1); // L: 746
		case 2:
			return class134.isCharAlphabetic((char)var1); // L: 748
		case 3:
			return class149.isDigit((char)var1); // L: 744
		case 4:
			char var2 = (char)var1; // L: 733
			if (class149.isDigit(var2)) { // L: 734
				return true; // L: 735
			} else {
				if (var2 != 'k' && var2 != 'K' && var2 != 'm' && var2 != 'M' && var2 != 'b' && var2 != 'B') { // L: 737
					return false; // L: 740
				}

				return true; // L: 738
			}
		default:
			return true; // L: 742
		}
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(I)Lrg;",
		garbageValue = "351336662"
	)
	class461 method6166() {
		int var1 = this.field3536.method7381(this.field3523); // L: 753
		int var2 = this.field3536.method7383(this.field3544); // L: 754
		return new class461(var1, var2); // L: 755
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lnx;IB)Llg;",
		garbageValue = "53"
	)
	public static PacketBufferNode method6225(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = class330.getPacketBufferNode(ClientPacket.field3110, Client.packetWriter.isaacCipher); // L: 17
		var4.packetBuffer.writeByte(0); // L: 18
		int var5 = var4.packetBuffer.offset; // L: 19
		var4.packetBuffer.writeByte(var0); // L: 20
		String var6 = var1.toLowerCase(); // L: 21
		byte var7 = 0; // L: 22
		if (var6.startsWith("yellow:")) { // L: 23
			var7 = 0; // L: 24
			var1 = var1.substring("yellow:".length()); // L: 25
		} else if (var6.startsWith("red:")) { // L: 27
			var7 = 1; // L: 28
			var1 = var1.substring("red:".length()); // L: 29
		} else if (var6.startsWith("green:")) { // L: 31
			var7 = 2; // L: 32
			var1 = var1.substring("green:".length()); // L: 33
		} else if (var6.startsWith("cyan:")) { // L: 35
			var7 = 3;
			var1 = var1.substring("cyan:".length());
		} else if (var6.startsWith("purple:")) { // L: 39
			var7 = 4;
			var1 = var1.substring("purple:".length()); // L: 41
		} else if (var6.startsWith("white:")) { // L: 43
			var7 = 5; // L: 44
			var1 = var1.substring("white:".length()); // L: 45
		} else if (var6.startsWith("flash1:")) { // L: 47
			var7 = 6; // L: 48
			var1 = var1.substring("flash1:".length()); // L: 49
		} else if (var6.startsWith("flash2:")) { // L: 51
			var7 = 7; // L: 52
			var1 = var1.substring("flash2:".length()); // L: 53
		} else if (var6.startsWith("flash3:")) { // L: 55
			var7 = 8; // L: 56
			var1 = var1.substring("flash3:".length()); // L: 57
		} else if (var6.startsWith("glow1:")) { // L: 59
			var7 = 9; // L: 60
			var1 = var1.substring("glow1:".length()); // L: 61
		} else if (var6.startsWith("glow2:")) { // L: 63
			var7 = 10; // L: 64
			var1 = var1.substring("glow2:".length()); // L: 65
		} else if (var6.startsWith("glow3:")) { // L: 67
			var7 = 11; // L: 68
			var1 = var1.substring("glow3:".length()); // L: 69
		} else if (var2 != Language.Language_EN) { // L: 71
			if (var6.startsWith("yellow:")) { // L: 72
				var7 = 0; // L: 73
				var1 = var1.substring("yellow:".length()); // L: 74
			} else if (var6.startsWith("red:")) { // L: 76
				var7 = 1; // L: 77
				var1 = var1.substring("red:".length()); // L: 78
			} else if (var6.startsWith("green:")) { // L: 80
				var7 = 2; // L: 81
				var1 = var1.substring("green:".length()); // L: 82
			} else if (var6.startsWith("cyan:")) { // L: 84
				var7 = 3; // L: 85
				var1 = var1.substring("cyan:".length()); // L: 86
			} else if (var6.startsWith("purple:")) { // L: 88
				var7 = 4; // L: 89
				var1 = var1.substring("purple:".length()); // L: 90
			} else if (var6.startsWith("white:")) { // L: 92
				var7 = 5; // L: 93
				var1 = var1.substring("white:".length()); // L: 94
			} else if (var6.startsWith("flash1:")) { // L: 96
				var7 = 6; // L: 97
				var1 = var1.substring("flash1:".length()); // L: 98
			} else if (var6.startsWith("flash2:")) { // L: 100
				var7 = 7; // L: 101
				var1 = var1.substring("flash2:".length()); // L: 102
			} else if (var6.startsWith("flash3:")) {
				var7 = 8;
				var1 = var1.substring("flash3:".length());
			} else if (var6.startsWith("glow1:")) { // L: 108
				var7 = 9; // L: 109
				var1 = var1.substring("glow1:".length()); // L: 110
			} else if (var6.startsWith("glow2:")) { // L: 112
				var7 = 10; // L: 113
				var1 = var1.substring("glow2:".length()); // L: 114
			} else if (var6.startsWith("glow3:")) { // L: 116
				var7 = 11; // L: 117
				var1 = var1.substring("glow3:".length()); // L: 118
			}
		}

		var6 = var1.toLowerCase(); // L: 121
		byte var8 = 0; // L: 122
		if (var6.startsWith("wave:")) { // L: 123
			var8 = 1; // L: 124
			var1 = var1.substring("wave:".length()); // L: 125
		} else if (var6.startsWith("wave2:")) { // L: 127
			var8 = 2; // L: 128
			var1 = var1.substring("wave2:".length()); // L: 129
		} else if (var6.startsWith("shake:")) { // L: 131
			var8 = 3; // L: 132
			var1 = var1.substring("shake:".length()); // L: 133
		} else if (var6.startsWith("scroll:")) { // L: 135
			var8 = 4; // L: 136
			var1 = var1.substring("scroll:".length()); // L: 137
		} else if (var6.startsWith("slide:")) { // L: 139
			var8 = 5; // L: 140
			var1 = var1.substring("slide:".length()); // L: 141
		} else if (var2 != Language.Language_EN) { // L: 143
			if (var6.startsWith("wave:")) { // L: 144
				var8 = 1; // L: 145
				var1 = var1.substring("wave:".length()); // L: 146
			} else if (var6.startsWith("wave2:")) { // L: 148
				var8 = 2; // L: 149
				var1 = var1.substring("wave2:".length()); // L: 150
			} else if (var6.startsWith("shake:")) { // L: 152
				var8 = 3; // L: 153
				var1 = var1.substring("shake:".length()); // L: 154
			} else if (var6.startsWith("scroll:")) { // L: 156
				var8 = 4; // L: 157
				var1 = var1.substring("scroll:".length()); // L: 158
			} else if (var6.startsWith("slide:")) { // L: 160
				var8 = 5; // L: 161
				var1 = var1.substring("slide:".length()); // L: 162
			}
		}

		var4.packetBuffer.writeByte(var7); // L: 165
		var4.packetBuffer.writeByte(var8); // L: 166
		WorldMapArea.method5162(var4.packetBuffer, var1); // L: 167
		if (var0 == class324.field3743.rsOrdinal()) { // L: 168
			var4.packetBuffer.writeByte(var3); // L: 169
		}

		var4.packetBuffer.method9053(var4.packetBuffer.offset - var5); // L: 171
		return var4; // L: 172
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "114146742"
	)
	public static void method6147(boolean var0) {
		if (var0 && Rasterizer2D.field5062 != null) { // L: 36
			Rasterizer3D.field2519 = Rasterizer3D.field2512; // L: 37
		} else {
			Rasterizer3D.field2519 = Rasterizer3D.field2518; // L: 40
		}

	} // L: 42

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Ljava/lang/String;Ljava/lang/String;I)[Ltc;",
		garbageValue = "1567788624"
	)
	public static IndexedSprite[] method6353(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 104
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 105
			int var4 = var0.getFileId(var3, var2); // L: 106
			return class68.method2030(var0, var3, var4); // L: 107
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILmq;IIIII[FB)Lmq;",
		garbageValue = "34"
	)
	static Widget method6354(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget(); // L: 883
		var8.type = var0; // L: 884
		var8.parentId = var1.id; // L: 885
		var8.childIndex = var2; // L: 886
		var8.isIf3 = true; // L: 887
		var8.xAlignment = var3; // L: 888
		var8.yAlignment = var4; // L: 889
		var8.widthAlignment = var5; // L: 890
		var8.heightAlignment = var6; // L: 891
		var8.rawX = (int)((float)var1.width * var7[0]); // L: 892
		var8.rawY = (int)((float)var1.height * var7[1]); // L: 893
		var8.rawWidth = (int)((float)var1.width * var7[2]); // L: 894
		var8.rawHeight = (int)(var7[3] * (float)var1.height); // L: 895
		return var8; // L: 896
	}
}
