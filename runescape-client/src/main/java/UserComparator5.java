import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;
	@ObfuscatedName("h")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Loa;Loa;I)I",
		garbageValue = "-1440387042"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) { // L: 14
			if (var2.world == 0) { // L: 15
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1; // L: 18
		}

		return this.compareUser(var1, var2); // L: 20
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 24
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lly;Lly;ZII)V",
		garbageValue = "176810660"
	)
	static void method2830(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 203
			if (var3 == 4) { // L: 204
				class12.method155(4); // L: 205
			}

		} else {
			if (var3 == 0) { // L: 209
				class124.method2939(var2); // L: 210
			} else {
				class12.method155(var3); // L: 213
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 215
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 216
			SecureRandomCallable.leftTitleSprite = Language.method6693(var4); // L: 217
			class9.rightTitleSprite = SecureRandomCallable.leftTitleSprite.mirrorHorizontally(); // L: 218
			int var5 = Client.worldProperties; // L: 219
			if ((var5 & 536870912) != 0) { // L: 221
				Login.logoSprite = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", ""); // L: 222
			} else if ((var5 & 1073741824) != 0) { // L: 224
				Login.logoSprite = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", ""); // L: 225
			} else if ((var5 & 256) != 0) { // L: 227
				Login.logoSprite = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", ""); // L: 228
			} else {
				Login.logoSprite = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 231
			}

			ModelData0.titleboxSprite = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 234
			Frames.field2611 = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 235
			class299.field3457 = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 236
			class150.field1756 = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 237
			Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 238
			int var7 = var1.getGroupId("runes"); // L: 241
			int var8 = var1.getFileId(var7, ""); // L: 242
			IndexedSprite[] var6 = AbstractWorldMapData.method5238(var1, var7, var8); // L: 243
			Login.field918 = var6; // L: 245
			var8 = var1.getGroupId("title_mute"); // L: 248
			int var9 = var1.getFileId(var8, ""); // L: 249
			IndexedSprite[] var11 = AbstractWorldMapData.method5238(var1, var8, var9); // L: 250
			class109.title_muteSprite = var11; // L: 252
			WorldMapLabel.field2975 = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 253
			Login.field949 = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 254
			class89.field1154 = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 255
			Login.field927 = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 256
			class126.field1569 = WorldMapLabel.field2975.subWidth; // L: 257
			WorldMapSection1.field2998 = WorldMapLabel.field2975.subHeight; // L: 258
			class154.loginScreenRunesAnimation = new LoginScreenAnimation(Login.field918); // L: 259
			if (var2) { // L: 260
				Login.Login_username = ""; // L: 261
				Login.Login_password = ""; // L: 262
				Login.field915 = new String[8]; // L: 263
				Login.field938 = 0; // L: 264
			}

			class143.field1697 = 0; // L: 266
			class141.otp = ""; // L: 267
			Login.field930 = true; // L: 268
			Login.worldSelectOpen = false; // L: 269
			if (!StructComposition.clientPreferences.method2428()) { // L: 270
				Archive var12 = class162.archive6; // L: 271
				var9 = var12.getGroupId("scape main"); // L: 273
				int var10 = var12.getFileId(var9, ""); // L: 274
				class286.musicPlayerStatus = 1; // L: 276
				class304.musicTrackArchive = var12; // L: 277
				class109.musicTrackGroupId = var9; // L: 278
				class286.musicTrackFileId = var10; // L: 279
				class467.musicTrackVolume = 255; // L: 280
				class145.musicTrackBoolean = false; // L: 281
				class286.pcmSampleLength = 2; // L: 282
			} else {
				class384.method7370(2); // L: 286
			}

			if (NetCache.NetCache_socket != null) { // L: 288
				try {
					Buffer var16 = new Buffer(4); // L: 290
					var16.writeByte(3); // L: 291
					var16.writeMedium(0); // L: 292
					NetCache.NetCache_socket.write(var16.array, 0, 4); // L: 293
				} catch (IOException var15) {
					try {
						NetCache.NetCache_socket.close(); // L: 297
					} catch (Exception var14) { // L: 299
					}

					++NetCache.NetCache_ioExceptions; // L: 300
					NetCache.NetCache_socket = null; // L: 301
				}
			}

			Login.clearLoginScreen = true; // L: 304
			Login.xPadding = (CollisionMap.canvasWidth - 765) / 2; // L: 305
			Login.loginBoxX = Login.xPadding + 202; // L: 306
			UrlRequest.loginBoxCenter = Login.loginBoxX + 180; // L: 307
			SecureRandomCallable.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 308
			class9.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 309
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 310
		}
	} // L: 207 311
}
