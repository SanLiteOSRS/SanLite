import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
public class class240 {
	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	static AbstractSocket field2847;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[Lkf;",
		garbageValue = "736917026"
	)
	static GameBuild[] method4992() {
		return new GameBuild[]{GameBuild.RC, GameBuild.BUILDLIVE, GameBuild.LIVE, GameBuild.WIP}; // L: 13
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Llc;Llc;ZII)V",
		garbageValue = "945865856"
	)
	static void method4988(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 165
			if (var3 == 4) { // L: 166
				UserComparator6.method2701(4); // L: 167
			}

		} else {
			if (var3 == 0) { // L: 171
				WorldMapID.method4981(var2); // L: 172
			} else {
				UserComparator6.method2701(var3); // L: 175
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 177
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 178
			SpriteMask.leftTitleSprite = class147.method3105(var4); // L: 179
			class356.rightTitleSprite = SpriteMask.leftTitleSprite.mirrorHorizontally(); // L: 180
			MilliClock.method3293(var1, Client.worldProperties); // L: 181
			class7.titleboxSprite = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 182
			class229.titlebuttonSprite = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 183
			class342.field4165 = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 184
			Login.field896 = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 185
			BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 186
			Login.runesSprite = class342.method6304(var1, "runes", ""); // L: 187
			Login.title_muteSprite = class342.method6304(var1, "title_mute", ""); // L: 188
			class11.options_buttons_0Sprite = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 189
			class329.field4111 = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 190
			Login.options_buttons_2Sprite = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 191
			SoundSystem.field321 = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 192
			WorldMapCacheName.field2862 = class11.options_buttons_0Sprite.subWidth; // L: 193
			HealthBarDefinition.field1864 = class11.options_buttons_0Sprite.subHeight; // L: 194
			RouteStrategy.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite); // L: 195
			if (var2) { // L: 196
				Login.Login_username = ""; // L: 197
				Login.Login_password = ""; // L: 198
				Login.field901 = new String[8]; // L: 199
				Login.field912 = 0; // L: 200
			}

			class260.field2908 = 0; // L: 202
			Login.otp = ""; // L: 203
			Login.field893 = true; // L: 204
			Login.worldSelectOpen = false; // L: 205
			if (!class260.clientPreferences.method2316()) { // L: 206
				Archive var5 = MouseHandler.archive6; // L: 207
				int var6 = var5.getGroupId("scape main"); // L: 209
				int var7 = var5.getFileId(var6, ""); // L: 210
				class273.musicPlayerStatus = 1; // L: 212
				class149.musicTrackArchive = var5; // L: 213
				class273.musicTrackGroupId = var6; // L: 214
				UserComparator6.musicTrackFileId = var7; // L: 215
				class273.musicTrackVolume = 255; // L: 216
				class347.musicTrackBoolean = false; // L: 217
				FaceNormal.pcmSampleLength = 2; // L: 218
			} else {
				class273.musicPlayerStatus = 1; // L: 223
				class149.musicTrackArchive = null; // L: 224
				class273.musicTrackGroupId = -1; // L: 225
				UserComparator6.musicTrackFileId = -1; // L: 226
				class273.musicTrackVolume = 0; // L: 227
				class347.musicTrackBoolean = false; // L: 228
				FaceNormal.pcmSampleLength = 2; // L: 229
			}

			StructComposition.method3597(false); // L: 231
			Login.clearLoginScreen = true; // L: 232
			Login.xPadding = (class352.canvasWidth - 765) / 2; // L: 233
			Login.loginBoxX = Login.xPadding + 202; // L: 234
			Login.loginBoxCenter = Login.loginBoxX + 180; // L: 235
			SpriteMask.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 236
			class356.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 237
			Canvas.logoSprite.drawAt(Login.xPadding + 382 - Canvas.logoSprite.subWidth / 2, 18); // L: 238
		}
	} // L: 169 239

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1983581438"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (class13.friendsChatManager != null) { // L: 12198
			PacketBufferNode var1 = class433.getPacketBufferNode(ClientPacket.field3011, Client.packetWriter.isaacCipher); // L: 12199
			var1.packetBuffer.writeByte(class92.stringCp1252NullTerminatedByteSize(var0)); // L: 12200
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12201
			Client.packetWriter.addNode(var1); // L: 12202
		}
	} // L: 12203

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "98"
	)
	static void method4994(int var0) {
		Client.oculusOrbState = var0; // L: 12388
	} // L: 12389
}
