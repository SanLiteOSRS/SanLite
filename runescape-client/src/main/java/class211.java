import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
public class class211 implements class29 {
	@ObfuscatedName("ay")
	char[] field2331;
	@ObfuscatedName("an")
	int[] field2327;
	@ObfuscatedName("ar")
	public int[] field2323;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1557886353
	)
	public int field2333;
	@ObfuscatedName("at")
	int[] field2325;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1323016745
	)
	int field2326;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1870086243
	)
	int field2322;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1324642979
	)
	int field2328;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -910361493
	)
	int field2329;
	@ObfuscatedName("ag")
	boolean[] field2330;
	@ObfuscatedName("ad")
	boolean[] field2324;
	@ObfuscatedName("aw")
	boolean[] field2332;
	@ObfuscatedName("ae")
	public char field2321;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -625696205
	)
	public int field2334;

	public class211() {
		this.field2331 = new char[128]; // L: 8
		this.field2327 = new int[128]; // L: 9
		this.field2323 = new int[128]; // L: 10
		this.field2333 = 0; // L: 11
		this.field2325 = new int[128]; // L: 12
		this.field2326 = 0; // L: 13
		this.field2322 = 0; // L: 14
		this.field2328 = 0; // L: 15
		this.field2329 = 0; // L: 16
		this.field2330 = new boolean[112]; // L: 17
		this.field2324 = new boolean[112]; // L: 18
		this.field2332 = new boolean[112]; // L: 19
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1472929918"
	)
	public boolean vmethod4080(int var1) {
		this.method4082(var1); // L: 24
		this.field2330[var1] = true; // L: 25
		this.field2324[var1] = true; // L: 26
		this.field2332[var1] = false; // L: 27
		this.field2323[++this.field2333 - 1] = var1; // L: 28
		return true; // L: 29
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-2"
	)
	public boolean vmethod4114(int var1) {
		this.field2330[var1] = false; // L: 33
		this.field2324[var1] = false; // L: 34
		this.field2332[var1] = true; // L: 35
		this.field2325[++this.field2326 - 1] = var1; // L: 36
		return true; // L: 37
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1010520021"
	)
	public boolean vmethod4081(char var1) {
		int var2 = this.field2328 + 1 & 127; // L: 41
		if (var2 != this.field2322) { // L: 42
			this.field2327[this.field2328] = -1; // L: 43
			this.field2331[this.field2328] = var1; // L: 44
			this.field2328 = var2; // L: 45
		}

		return false; // L: 47
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-910540057"
	)
	public boolean vmethod4083(boolean var1) {
		return false; // L: 60
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "13"
	)
	void method4082(int var1) {
		int var2 = this.field2328 + 1 & 127; // L: 51
		if (var2 != this.field2322) { // L: 52
			this.field2327[this.field2328] = var1; // L: 53
			this.field2331[this.field2328] = 0; // L: 54
			this.field2328 = var2; // L: 55
		}

	} // L: 57

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1915865521"
	)
	public void method4084() {
		this.field2322 = this.field2329; // L: 64
		this.field2329 = this.field2328; // L: 65
		this.field2333 = 0; // L: 66
		this.field2326 = 0; // L: 67
		Arrays.fill(this.field2324, false); // L: 68
		Arrays.fill(this.field2332, false); // L: 69
	} // L: 70

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-72326020"
	)
	public final boolean method4085() {
		if (this.field2322 == this.field2329) { // L: 73
			return false;
		} else {
			this.field2334 = this.field2327[this.field2322]; // L: 74
			this.field2321 = this.field2331[this.field2322]; // L: 75
			this.field2322 = this.field2322 + 1 & 127; // L: 76
			return true; // L: 77
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1228485301"
	)
	public boolean method4086(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2324[var1] : false; // L: 81 82
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "67"
	)
	public boolean method4087(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2330[var1] : false; // L: 86 87
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1999452395"
	)
	public boolean method4088(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2332[var1] : false; // L: 91 92
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-609320807"
	)
	public int[] method4089() {
		int[] var1 = new int[this.field2333]; // L: 96

		for (int var2 = 0; var2 < this.field2333; ++var2) { // L: 97
			var1[var2] = this.field2323[var2]; // L: 98
		}

		return var1; // L: 100
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-2061467571"
	)
	public int[] method4090() {
		int[] var1 = new int[this.field2326]; // L: 104

		for (int var2 = 0; var2 < this.field2326; ++var2) { // L: 105
			var1[var2] = this.field2325[var2]; // L: 106
		}

		return var1; // L: 108
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lni;Lni;ZII)V",
		garbageValue = "1963879953"
	)
	static void method4118(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 206
			if (var3 == 4) { // L: 207
				class14.method171(4); // L: 208
			}

		} else {
			if (var3 == 0) { // L: 212
				class260.method5395(var2); // L: 213
			} else {
				class14.method171(var3); // L: 216
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 218
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 219
			class305.leftTitleSprite = SecureRandomFuture.method2112(var4); // L: 220
			class362.rightTitleSprite = class305.leftTitleSprite.mirrorHorizontally(); // L: 221
			method4117(var1, Client.worldProperties); // L: 222
			class330.titleboxSprite = class512.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 223
			class157.field1731 = class512.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 224
			class25.field115 = class512.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 225
			ModelData0.field2817 = class512.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 226
			class512.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 227
			IndexedSprite[] var5;
			int var7;
			if (!var1.isValidFileName("runes", "")) { // L: 230
				var5 = null; // L: 231
			} else {
				int var6 = var1.getGroupId("runes"); // L: 234
				var7 = var1.getFileId(var6, ""); // L: 235
				var5 = MouseRecorder.method2253(var1, var6, var7); // L: 236
			}

			Login.field885 = var5; // L: 238
			IndexedSprite[] var9;
			if (!var1.isValidFileName("title_mute", "")) { // L: 241
				var9 = null; // L: 242
			} else {
				var7 = var1.getGroupId("title_mute"); // L: 245
				int var8 = var1.getFileId(var7, ""); // L: 246
				var9 = MouseRecorder.method2253(var1, var7, var8); // L: 247
			}

			class33.title_muteSprite = var9; // L: 249
			Login.field887 = class512.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 250
			class124.field1462 = class512.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 251
			UserComparator10.field1443 = class512.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 252
			Login.field921 = class512.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 253
			Skeleton.field2541 = Login.field887.subWidth; // L: 254
			class342.field3848 = Login.field887.subHeight; // L: 255
			SecureRandomCallable.loginScreenRunesAnimation = new LoginScreenAnimation(Login.field885); // L: 256
			if (var2) { // L: 257
				Login.Login_username = ""; // L: 258
				Login.Login_password = ""; // L: 259
				Login.field905 = new String[8]; // L: 260
				Login.field903 = 0; // L: 261
			}

			AbstractWorldMapData.field2999 = 0; // L: 263
			class382.otp = ""; // L: 264
			Login.field909 = true; // L: 265
			Login.worldSelectOpen = false; // L: 266
			if (!WorldMapManager.clientPreferences.method2435()) { // L: 267
				UserComparator4.method2839(2, class33.archive6, "scape main", "", 255, false);
			} else {
				ItemContainer.method2222(2); // L: 268
			}

			class299.method5759(false); // L: 269
			Login.clearLoginScreen = true; // L: 270
			Login.xPadding = (class10.canvasWidth - 765) / 2; // L: 271
			Login.loginBoxX = Login.xPadding + 202; // L: 272
			class153.loginBoxCenter = Login.loginBoxX + 180; // L: 273
			class305.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 274
			class362.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 275
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 276
		}
	} // L: 210 277

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lni;IB)V",
		garbageValue = "0"
	)
	static void method4117(AbstractArchive var0, int var1) {
		if ((var1 & 536870912) != 0) { // L: 303
			Login.logoSprite = class512.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", ""); // L: 304
		} else if ((var1 & 1073741824) != 0) { // L: 306
			Login.logoSprite = class512.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", ""); // L: 307
		} else if ((var1 & 256) != 0) { // L: 309
			Login.logoSprite = class512.SpriteBuffer_getIndexedSpriteByName(var0, "logo_speedrunning", ""); // L: 310
		} else {
			Login.logoSprite = class512.SpriteBuffer_getIndexedSpriteByName(var0, "logo", ""); // L: 313
		}

	} // L: 315
}
