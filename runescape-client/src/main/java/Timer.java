import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("py")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = 6454939314304867917L
	)
	long field4564;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -7356339213300068871L
	)
	long field4563;
	@ObfuscatedName("ao")
	public boolean field4568;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 8401720768134439495L
	)
	long field4565;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -287005139873916205L
	)
	long field4566;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 1145719069338779159L
	)
	long field4572;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -264016203
	)
	int field4567;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 436925731
	)
	int field4569;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1568859201
	)
	int field4570;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 140876143
	)
	int field4571;

	public Timer() {
		this.field4564 = -1L; // L: 7
		this.field4563 = -1L; // L: 8
		this.field4568 = false; // L: 9
		this.field4565 = 0L; // L: 10
		this.field4566 = 0L; // L: 11
		this.field4572 = 0L; // L: 12
		this.field4567 = 0; // L: 13
		this.field4569 = 0; // L: 14
		this.field4570 = 0; // L: 15
		this.field4571 = 0; // L: 16
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "8457"
	)
	public void method7683() {
		this.field4564 = GameEngine.method661(); // L: 19
	} // L: 20

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1934849344"
	)
	public void method7702() {
		if (-1L != this.field4564) { // L: 23
			this.field4566 = GameEngine.method661() - this.field4564; // L: 24
			this.field4564 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-350362388"
	)
	public void method7685(int var1) {
		this.field4563 = GameEngine.method661(); // L: 30
		this.field4567 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1654604746"
	)
	public void method7686() {
		if (-1L != this.field4563) { // L: 35
			this.field4565 = GameEngine.method661() - this.field4563; // L: 36
			this.field4563 = -1L; // L: 37
		}

		++this.field4570; // L: 39
		this.field4568 = true; // L: 40
	} // L: 41

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1332700570"
	)
	public void method7687() {
		this.field4568 = false; // L: 44
		this.field4569 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1203645178"
	)
	public void method7682() {
		this.method7686(); // L: 49
	} // L: 50

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "-1131300040"
	)
	@Export("write")
	public void write(Buffer var1) {
		ClientPreferences.method2464(var1, this.field4566); // L: 53
		ClientPreferences.method2464(var1, this.field4565); // L: 54
		ClientPreferences.method2464(var1, this.field4572); // L: 55
		var1.writeShort(this.field4567); // L: 56
		var1.writeShort(this.field4569); // L: 57
		var1.writeShort(this.field4570); // L: 58
		var1.writeShort(this.field4571); // L: 59
	} // L: 60

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Lnu;ZII)V",
		garbageValue = "-487590023"
	)
	static void method7688(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (class403.clearLoginScreen) { // L: 169
			if (var3 == 4) { // L: 170
				PcmPlayer.method838(4); // L: 171
			}

		} else {
			if (var3 == 0) { // L: 175
				WorldMapAreaData.method5584(var2); // L: 176
			} else {
				PcmPlayer.method838(var3); // L: 179
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 181
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 182
			Login.leftTitleSprite = WorldMapData_1.method5347(var4); // L: 183
			Bounds.rightTitleSprite = Login.leftTitleSprite.mirrorHorizontally(); // L: 184
			int var5 = Client.worldProperties; // L: 185
			if ((var5 & class510.field5090.rsOrdinal()) != 0) { // L: 187
				SoundSystem.logoSprite = class172.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", ""); // L: 188
			} else if ((var5 & class510.field5091.rsOrdinal()) != 0) { // L: 190
				SoundSystem.logoSprite = class172.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", ""); // L: 191
			} else if ((var5 & class510.field5069.rsOrdinal()) != 0) { // L: 193
				SoundSystem.logoSprite = class172.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", ""); // L: 194
			} else {
				SoundSystem.logoSprite = class172.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 197
			}

			Login.titleboxSprite = class172.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 200
			class219.field2417 = class172.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 201
			Login.field933 = class172.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 202
			ItemContainer.field1068 = class172.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 203
			class172.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 204
			Login.field931 = class219.method4261(var1, "runes", ""); // L: 205
			class13.title_muteSprite = class219.method4261(var1, "title_mute", ""); // L: 206
			Login.field929 = class172.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 207
			Skills.field3850 = class172.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 208
			UserComparator6.field1491 = class172.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 209
			VerticalAlignment.field2083 = class172.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 210
			class136.field1615 = Login.field929.subWidth; // L: 211
			Nameable.field4657 = Login.field929.subHeight; // L: 212
			class139.loginScreenRunesAnimation = new LoginScreenAnimation(Login.field931); // L: 213
			if (var2) { // L: 214
				Login.Login_username = ""; // L: 215
				Login.Login_password = ""; // L: 216
				Login.field954 = new String[8]; // L: 217
				Login.field951 = 0; // L: 218
			}

			class503.field5039 = 0; // L: 220
			class369.otp = ""; // L: 221
			Login.field956 = true; // L: 222
			Login.worldSelectOpen = false; // L: 223
			if (!class449.clientPreferences.method2484()) { // L: 224
				ArrayList var6 = new ArrayList(); // L: 225
				var6.add(new class317(class385.archive11, "scape main", "", 255, false)); // L: 226
				class53.method1097(var6, 0, 0, 0, 100, false); // L: 227
			} else {
				Script.method2180(0, 0); // L: 229
			}

			UrlRequester.method2829(); // L: 230
			CollisionMap.method4177().method6793(false); // L: 231
			class403.clearLoginScreen = true; // L: 232
			Login.xPadding = (class113.canvasWidth - 765) / 2; // L: 233
			Login.loginBoxX = Login.xPadding + 202; // L: 234
			class452.loginBoxCenter = Login.loginBoxX + 180; // L: 235
			Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 236
			Bounds.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 237
			SoundSystem.logoSprite.drawAt(Login.xPadding + 382 - SoundSystem.logoSprite.subWidth / 2, 18); // L: 238
		}
	} // L: 173 239
}
