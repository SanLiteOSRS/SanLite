import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
public enum class124 implements class387 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	field1472(1, 0),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	field1470(0, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	field1471(3, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	field1474(4, 3),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	field1473(2, 4);

	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1046332187
	)
	public final int field1475;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1180048497
	)
	@Export("id")
	final int id;

	class124(int var3, int var4) {
		this.field1475 = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Low;Low;ZII)V",
		garbageValue = "734075679"
	)
	static void method3004(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 185
			if (var3 == 4) { // L: 186
				Actor.method2489(4); // L: 187
			}

		} else {
			if (var3 == 0) { // L: 191
				class408.method7592(var2); // L: 192
			} else {
				Actor.method2489(var3); // L: 195
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 197
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 198
			Buddy.leftTitleSprite = class181.method3691(var4); // L: 199
			SecureRandomCallable.rightTitleSprite = Buddy.leftTitleSprite.mirrorHorizontally(); // L: 200
			SecureRandomFuture.method2235(var1, Client.worldProperties); // L: 201
			Login.titleboxSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 202
			class182.field1904 = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 203
			Login.field925 = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 204
			class473.field4839 = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 205
			VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 206
			Login.field906 = class412.method7748(var1, "runes", ""); // L: 207
			Clock.title_muteSprite = class412.method7748(var1, "title_mute", ""); // L: 208
			class182.field1908 = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 209
			class465.field4805 = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 210
			class402.field4500 = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 211
			Decimator.field410 = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 212
			class31.field168 = class182.field1908.subWidth; // L: 213
			Skills.field3911 = class182.field1908.subHeight; // L: 214
			SpriteMask.loginScreenRunesAnimation = new LoginScreenAnimation(Login.field906); // L: 215
			if (var2) { // L: 216
				Login.Login_username = ""; // L: 217
				Login.Login_password = ""; // L: 218
				Login.field934 = new String[8]; // L: 219
				Login.field924 = 0; // L: 220
			}

			class130.field1525 = 0; // L: 222
			class148.otp = ""; // L: 223
			Login.field913 = true; // L: 224
			Login.worldSelectOpen = false; // L: 225
			if (!class93.clientPreferences.method2546()) { // L: 226
				ArrayList var5 = new ArrayList(); // L: 227
				var5.add(new class331(WorldMapSection0.field2587, "scape main", "", 255, false)); // L: 228
				LoginScreenAnimation.method2528(var5, 0, 0, 0, 100, false); // L: 229
			} else {
				Actor.method2488(0, 0); // L: 231
			}

			FontName.method9049(); // L: 232
			class220.method4348().method7126(false); // L: 233
			Login.clearLoginScreen = true; // L: 234
			Login.xPadding = (class524.canvasWidth - 765) / 2; // L: 235
			Login.loginBoxX = Login.xPadding + 202; // L: 236
			class433.loginBoxCenter = Login.loginBoxX + 180; // L: 237
			Buddy.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 238
			SecureRandomCallable.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 239
			GrandExchangeEvents.logoSprite.drawAt(Login.xPadding + 382 - GrandExchangeEvents.logoSprite.subWidth / 2, 18); // L: 240
		}
	} // L: 189 241
}
