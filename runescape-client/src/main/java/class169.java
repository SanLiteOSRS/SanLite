import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class169 implements WorldMapSection {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -782257189
	)
	int field2017;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 909746241
	)
	int field2013;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1319843895
	)
	int field2014;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -920944403
	)
	int field2015;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1564454979
	)
	int field2019;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -734700081
	)
	int field2016;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1538730207
	)
	int field2012;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2021929301
	)
	int field2018;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1236356559
	)
	int field2020;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -86863827
	)
	int field2021;

	class169() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lfe;I)V",
		garbageValue = "-1549282997"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2019) {
			var1.regionLowX = this.field2019;
		}

		if (var1.regionHighX < this.field2019) {
			var1.regionHighX = this.field2019;
		}

		if (var1.regionLowY > this.field2016) {
			var1.regionLowY = this.field2016;
		}

		if (var1.regionHighY < this.field2016) {
			var1.regionHighY = this.field2016;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1758075186"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2017 && var1 < this.field2013 + this.field2017) {
			return var2 >= (this.field2014 << 6) + (this.field2012 << 3) && var2 <= (this.field2014 << 6) + (this.field2012 << 3) + 7 && var3 >= (this.field2015 << 6) + (this.field2018 << 3) && var3 <= (this.field2015 << 6) + (this.field2018 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "226487857"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2019 << 6) + (this.field2020 << 3) && var1 <= (this.field2019 << 6) + (this.field2020 << 3) + 7 && var2 >= (this.field2016 << 6) + (this.field2021 << 3) && var2 <= (this.field2016 << 6) + (this.field2021 << 3) + 7;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "118"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field2019 * 64 - this.field2014 * 64 + var2 + (this.field2020 * 8 - this.field2012 * 8), var3 + (this.field2016 * 64 - this.field2015 * 64) + (this.field2021 * 8 - this.field2018 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)Lia;",
		garbageValue = "-400477740"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field2014 * 64 - this.field2019 * 64 + (this.field2012 * 8 - this.field2020 * 8) + var1;
			int var4 = this.field2015 * 64 - this.field2016 * 64 + var2 + (this.field2018 * 8 - this.field2021 * 8);
			return new Coord(this.field2017, var3, var4);
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)V",
		garbageValue = "45"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2017 = var1.readUnsignedByte();
		this.field2013 = var1.readUnsignedByte();
		this.field2014 = var1.readUnsignedShort();
		this.field2012 = var1.readUnsignedByte();
		this.field2015 = var1.readUnsignedShort();
		this.field2018 = var1.readUnsignedByte();
		this.field2019 = var1.readUnsignedShort();
		this.field2020 = var1.readUnsignedByte();
		this.field2016 = var1.readUnsignedShort();
		this.field2021 = var1.readUnsignedByte();
		this.method3477();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-910102378"
	)
	void method3477() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1096176570"
	)
	static String method3495(int var0) {
		return "<img=" + var0 + ">";
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;ZII)V",
		garbageValue = "878052857"
	)
	static void method3494(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				Login.loginIndex = 4;
			}

		} else {
			Login.loginIndex = var3;
			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			Canvas.leftTitleSprite = WorldMapAreaData.convertJpgToSprite(var4);
			class12.rightTitleSprite = Canvas.leftTitleSprite.mirrorHorizontally();
			int var5 = Client.worldProperties;
			if ((var5 & 536870912) != 0) {
				FontName.logoSprite = MenuAction.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var5 & 1073741824) != 0) {
				FontName.logoSprite = MenuAction.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else {
				FontName.logoSprite = MenuAction.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}

			ItemContainer.titleboxSprite = MenuAction.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Login.titlebuttonSprite = MenuAction.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			Login.runesSprite = GameObject.method4235(var1, "runes", "");
			FontName.title_muteSprite = GameObject.method4235(var1, "title_mute", "");
			GrandExchangeOfferUnitPriceComparator.options_buttons_0Sprite = MenuAction.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			InterfaceParent.field1134 = MenuAction.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			GrandExchangeEvent.options_buttons_2Sprite = MenuAction.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			class225.field2684 = MenuAction.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			TaskHandler.field1466 = GrandExchangeOfferUnitPriceComparator.options_buttons_0Sprite.subWidth;
			class125.field1456 = GrandExchangeOfferUnitPriceComparator.options_buttons_0Sprite.subHeight;
			AttackOption.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
			}

			PendingSpawn.field1204 = 0;
			class16.otp = "";
			Login.field1008 = true;
			Login.worldSelectOpen = false;
			if (!class12.clientPreferences.titleMusicDisabled) {
				Archive var6 = class29.archive6;
				int var7 = var6.getGroupId("scape main");
				int var8 = var6.getFileId(var7, "");
				class229.playMusicTrack(2, var6, var7, var8, 255, false);
			} else {
				class390.method6744(2);
			}

			if (NetCache.NetCache_socket != null) {
				try {
					Buffer var12 = new Buffer(4);
					var12.writeByte(3);
					var12.writeMedium(0);
					NetCache.NetCache_socket.write(var12.array, 0, 4);
				} catch (IOException var11) {
					try {
						NetCache.NetCache_socket.close();
					} catch (Exception var10) {
					}

					++NetCache.NetCache_ioExceptions;
					NetCache.NetCache_socket = null;
				}
			}

			Login.clearLoginScreen = true;
			Login.xPadding = (GameEngine.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			class21.loginBoxCenter = Login.loginBoxX + 180;
			Canvas.leftTitleSprite.drawAt(Login.xPadding, 0);
			class12.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			FontName.logoSprite.drawAt(Login.xPadding + 382 - FontName.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1486014533"
	)
	public static void method3493() {
		VarpDefinition.VarpDefinition_cached.clear();
	}
}
