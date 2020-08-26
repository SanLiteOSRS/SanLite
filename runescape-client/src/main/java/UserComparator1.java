import java.io.IOException;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
@Implements("UserComparator1")
public class UserComparator1 implements Comparator {
	@ObfuscatedName("z")
	@Export("reversed")
	final boolean reversed;

	public UserComparator1(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Ljc;Ljc;B)I",
		garbageValue = "57"
	)
	@Export("compare_bridged")
	int compare_bridged(Nameable var1, Nameable var2) {
		return this.reversed ? var1.compareTo_user(var2) : var2.compareTo_user(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Nameable)var1, (Nameable)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lic;Lic;ZII)V",
		garbageValue = "1091425537"
	)
	static void method6041(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				Login.loginIndex = 4;
			}

		} else {
			Login.loginIndex = var3;
			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			UserComparator2.leftTitleSprite = MouseHandler.convertJpgToSprite(var4);
			Login.rightTitleSprite = UserComparator2.leftTitleSprite.mirrorHorizontally();
			if ((Client.worldProperties & 536870912) != 0) {
				AbstractByteArrayCopier.logoSprite = class234.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((Client.worldProperties & 1073741824) != 0) {
				AbstractByteArrayCopier.logoSprite = class234.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else {
				AbstractByteArrayCopier.logoSprite = class234.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}

			class296.titleboxSprite = class234.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			ModelData0.titlebuttonSprite = class234.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			int var6 = var1.getGroupId("runes");
			int var7 = var1.getFileId(var6, "");
			IndexedSprite[] var5 = UserComparator5.method3515(var1, var6, var7);
			GrandExchangeOfferTotalQuantityComparator.runesSprite = var5;
			var7 = var1.getGroupId("title_mute");
			int var8 = var1.getFileId(var7, "");
			IndexedSprite[] var10 = UserComparator5.method3515(var1, var7, var8);
			ClientPreferences.title_muteSprite = var10;
			class227.options_buttons_0Sprite = class234.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			PlayerType.field3134 = class234.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			MusicPatchNode2.options_buttons_2Sprite = class234.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			Login.field1221 = class234.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			GrandExchangeOfferNameComparator.field114 = class227.options_buttons_0Sprite.subWidth;
			ReflectionCheck.field1364 = class227.options_buttons_0Sprite.subHeight;
			Varcs.loginScreenRunesAnimation = new LoginScreenAnimation(GrandExchangeOfferTotalQuantityComparator.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
			}

			LoginScreenAnimation.field1070 = 0;
			WorldMapLabelSize.otp = "";
			Login.field1223 = true;
			Login.worldSelectOpen = false;
			if (!Tile.clientPreferences.titleMusicDisabled) {
				Archive var11 = CollisionMap.archive6;
				var8 = var11.getGroupId("scape main");
				int var9 = var11.getFileId(var8, "");
				class206.field2437 = 1;
				class204.musicTrackArchive = var11;
				BuddyRankComparator.musicTrackGroupId = var8;
				class206.musicTrackFileId = var9;
				Tiles.musicTrackVolume = 255;
				class206.musicTrackBoolean = false;
				FaceNormal.field1922 = 2;
			} else {
				class58.method915(2);
			}

			if (NetCache.NetCache_socket != null) {
				try {
					Buffer var15 = new Buffer(4);
					var15.writeByte(3);
					var15.writeMedium(0);
					NetCache.NetCache_socket.write(var15.array, 0, 4);
				} catch (IOException var14) {
					try {
						NetCache.NetCache_socket.close();
					} catch (Exception var13) {
					}

					++NetCache.NetCache_ioExceptions;
					NetCache.NetCache_socket = null;
				}
			}

			Login.clearLoginScreen = true;
			Login.xPadding = (FloorDecoration.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			IsaacCipher.loginBoxCenter = Login.loginBoxX + 180;
			UserComparator2.leftTitleSprite.drawAt(Login.xPadding, 0);
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			AbstractByteArrayCopier.logoSprite.drawAt(Login.xPadding + 382 - AbstractByteArrayCopier.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-660550270"
	)
	static final void method6040() {
		int var0 = ChatChannel.menuX;
		int var1 = Client.menuY;
		int var2 = DevicePcmPlayerProvider.menuWidth;
		int var3 = WorldMapManager.menuHeight;
		int var4 = 6116423;
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0);
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
		class4.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1);
		int var5 = MouseHandler.MouseHandler_x;
		int var6 = MouseHandler.MouseHandler_y;

		for (int var7 = 0; var7 < Client.menuOptionsCount; ++var7) {
			int var8 = var1 + (Client.menuOptionsCount - 1 - var7) * 15 + 31;
			int var9 = 16777215;
			if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
				var9 = 16776960;
			}

			Font var10 = class4.fontBold12;
			String var11;
			if (var7 < 0) {
				var11 = "";
			} else if (Client.menuTargets[var7].length() > 0) {
				var11 = Client.menuActions[var7] + " " + Client.menuTargets[var7];
			} else {
				var11 = Client.menuActions[var7];
			}

			var10.draw(var11, var0 + 3, var8, var9, 0);
		}

		HealthBarUpdate.method1817(ChatChannel.menuX, Client.menuY, DevicePcmPlayerProvider.menuWidth, WorldMapManager.menuHeight);
	}
}
