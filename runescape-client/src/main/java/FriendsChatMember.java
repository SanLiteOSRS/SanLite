import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("FriendsChatMember")
public class FriendsChatMember extends Buddy {
	@ObfuscatedName("ua")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("friend")
	TriBool friend;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("ignored")
	TriBool ignored;

	FriendsChatMember() {
		this.friend = TriBool.TriBool_unknown; // L: 6
		this.ignored = TriBool.TriBool_unknown; // L: 7
	} // L: 9

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "62"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.friend = TriBool.TriBool_unknown; // L: 12
	} // L: 13

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-353480072"
	)
	@Export("isFriend")
	public final boolean isFriend() {
		if (this.friend == TriBool.TriBool_unknown) { // L: 16
			this.fillIsFriend(); // L: 17
		}

		return this.friend == TriBool.TriBool_true; // L: 19
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "88"
	)
	@Export("fillIsFriend")
	void fillIsFriend() {
		this.friend = class321.friendSystem.friendsList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 23
	} // L: 24

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1391337815"
	)
	@Export("clearIsIgnored")
	void clearIsIgnored() {
		this.ignored = TriBool.TriBool_unknown; // L: 27
	} // L: 28

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2136358949"
	)
	@Export("isIgnored")
	public final boolean isIgnored() {
		if (this.ignored == TriBool.TriBool_unknown) { // L: 31
			this.fillIsIgnored(); // L: 32
		}

		return this.ignored == TriBool.TriBool_true; // L: 34
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-789416039"
	)
	@Export("fillIsIgnored")
	void fillIsIgnored() {
		this.ignored = class321.friendSystem.ignoreList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 38
	} // L: 39

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lls;Lls;ZII)V",
		garbageValue = "332086000"
	)
	static void method6613(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 161
			if (var3 == 4) { // L: 162
				class116.method2683(4); // L: 163
			}

		} else {
			if (var3 == 0) { // L: 167
				class33.method572(var2); // L: 168
			} else {
				class116.method2683(var3); // L: 171
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 173
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 174
			class10.leftTitleSprite = class155.method3172(var4); // L: 175
			Login.rightTitleSprite = class10.leftTitleSprite.mirrorHorizontally(); // L: 176
			int var5 = Client.worldProperties; // L: 177
			if ((var5 & 536870912) != 0) { // L: 179
				MusicPatchPcmStream.logoSprite = class150.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", ""); // L: 180
			} else if ((var5 & 1073741824) != 0) { // L: 182
				MusicPatchPcmStream.logoSprite = class150.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", ""); // L: 183
			} else {
				MusicPatchPcmStream.logoSprite = class150.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 186
			}

			class19.titleboxSprite = class150.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 189
			Login.titlebuttonSprite = class150.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 190
			class329.field4091 = class150.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 191
			Login.field872 = class150.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 192
			class150.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 193
			Login.runesSprite = Bounds.method6868(var1, "runes", ""); // L: 194
			class161.title_muteSprite = Bounds.method6868(var1, "title_mute", ""); // L: 195
			class29.options_buttons_0Sprite = class150.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 196
			Login.field874 = class150.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 197
			VerticalAlignment.options_buttons_2Sprite = class150.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 198
			KeyHandler.field127 = class150.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 199
			ClientPreferences.field1245 = class29.options_buttons_0Sprite.subWidth; // L: 200
			class141.field1635 = class29.options_buttons_0Sprite.subHeight; // L: 201
			class259.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite); // L: 202
			if (var2) { // L: 203
				Login.Login_username = ""; // L: 204
				Login.Login_password = ""; // L: 205
				Login.field892 = new String[8]; // L: 206
				Login.field891 = 0; // L: 207
			}

			class19.field100 = 0; // L: 209
			KeyHandler.otp = ""; // L: 210
			Login.field895 = true; // L: 211
			Login.worldSelectOpen = false; // L: 212
			if (!clientPreferences.method2213()) { // L: 213
				Archive var6 = PacketBuffer.archive6; // L: 214
				int var7 = var6.getGroupId("scape main"); // L: 216
				int var8 = var6.getFileId(var7, ""); // L: 217
				class273.musicPlayerStatus = 1; // L: 219
				NetFileRequest.musicTrackArchive = var6; // L: 220
				UrlRequester.musicTrackGroupId = var7; // L: 221
				SceneTilePaint.musicTrackFileId = var8; // L: 222
				class28.musicTrackVolume = 255; // L: 223
				class273.musicTrackBoolean = false; // L: 224
				class160.pcmSampleLength = 2; // L: 225
			} else {
				class273.musicPlayerStatus = 1; // L: 230
				NetFileRequest.musicTrackArchive = null; // L: 231
				UrlRequester.musicTrackGroupId = -1; // L: 232
				SceneTilePaint.musicTrackFileId = -1; // L: 233
				class28.musicTrackVolume = 0; // L: 234
				class273.musicTrackBoolean = false; // L: 235
				class160.pcmSampleLength = 2; // L: 236
			}

			if (NetCache.NetCache_socket != null) { // L: 239
				try {
					Buffer var12 = new Buffer(4); // L: 241
					var12.writeByte(3); // L: 242
					var12.writeMedium(0); // L: 243
					NetCache.NetCache_socket.write(var12.array, 0, 4); // L: 244
				} catch (IOException var11) {
					try {
						NetCache.NetCache_socket.close(); // L: 248
					} catch (Exception var10) { // L: 250
					}

					++NetCache.NetCache_ioExceptions; // L: 251
					NetCache.NetCache_socket = null; // L: 252
				}
			}

			Login.clearLoginScreen = true; // L: 255
			Login.xPadding = (class7.canvasWidth - 765) / 2; // L: 256
			Login.loginBoxX = Login.xPadding + 202; // L: 257
			Login.loginBoxCenter = Login.loginBoxX + 180; // L: 258
			class10.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 259
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 260
			MusicPatchPcmStream.logoSprite.drawAt(Login.xPadding + 382 - MusicPatchPcmStream.logoSprite.subWidth / 2, 18); // L: 261
		}
	} // L: 165 262
}
