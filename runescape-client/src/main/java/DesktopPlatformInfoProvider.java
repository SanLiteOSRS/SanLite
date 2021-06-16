import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
@Implements("DesktopPlatformInfoProvider")
public class DesktopPlatformInfoProvider implements PlatformInfoProvider {
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1922177111
	)
	int field3939;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1155417059
	)
	int field3937;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -187752831
	)
	int field3941;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lms;",
		garbageValue = "-1968333950"
	)
	@Export("get")
	public PlatformInfo get() {
		byte var1;
		if (GraphicsObject.formattedOperatingSystemName.startsWith("win")) {
			var1 = 1;
		} else if (GraphicsObject.formattedOperatingSystemName.startsWith("mac")) {
			var1 = 2;
		} else if (GraphicsObject.formattedOperatingSystemName.startsWith("linux")) {
			var1 = 3;
		} else {
			var1 = 4;
		}

		String var2;
		try {
			var2 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception var27) {
			var2 = "";
		}

		String var3;
		try {
			var3 = System.getProperty("os.version").toLowerCase();
		} catch (Exception var26) {
			var3 = "";
		}

		String var4 = "Unknown";
		String var5 = "1.1";

		try {
			var4 = System.getProperty("java.vendor");
			var5 = System.getProperty("java.version");
		} catch (Exception var25) {
		}

		boolean var24;
		if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
			var24 = false;
		} else {
			var24 = true;
		}

		byte var7 = 0;
		if (var1 == 1) {
			if (var3.indexOf("4.0") != -1) {
				var7 = 1;
			} else if (var3.indexOf("4.1") != -1) {
				var7 = 2;
			} else if (var3.indexOf("4.9") != -1) {
				var7 = 3;
			} else if (var3.indexOf("5.0") != -1) {
				var7 = 4;
			} else if (var3.indexOf("5.1") != -1) {
				var7 = 5;
			} else if (var3.indexOf("5.2") != -1) {
				var7 = 8;
			} else if (var3.indexOf("6.0") != -1) {
				var7 = 6;
			} else if (var3.indexOf("6.1") != -1) {
				var7 = 7;
			} else if (var3.indexOf("6.2") != -1) {
				var7 = 9;
			} else if (var3.indexOf("6.3") != -1) {
				var7 = 10;
			} else if (var3.indexOf("10.0") != -1) {
				var7 = 11;
			}
		} else if (var1 == 2) {
			if (var3.indexOf("10.4") != -1) {
				var7 = 20;
			} else if (var3.indexOf("10.5") != -1) {
				var7 = 21;
			} else if (var3.indexOf("10.6") != -1) {
				var7 = 22;
			} else if (var3.indexOf("10.7") != -1) {
				var7 = 23;
			} else if (var3.indexOf("10.8") != -1) {
				var7 = 24;
			} else if (var3.indexOf("10.9") != -1) {
				var7 = 25;
			} else if (var3.indexOf("10.10") != -1) {
				var7 = 26;
			} else if (var3.indexOf("10.11") != -1) {
				var7 = 27;
			} else if (var3.indexOf("10.12") != -1) {
				var7 = 28;
			} else if (var3.indexOf("10.13") != -1) {
				var7 = 29;
			}
		}

		byte var8;
		if (var4.toLowerCase().indexOf("sun") != -1) {
			var8 = 1;
		} else if (var4.toLowerCase().indexOf("microsoft") != -1) {
			var8 = 2;
		} else if (var4.toLowerCase().indexOf("apple") != -1) {
			var8 = 3;
		} else if (var4.toLowerCase().indexOf("oracle") != -1) {
			var8 = 5;
		} else {
			var8 = 4;
		}

		this.method6099(var5);
		int var10 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
		int var11;
		if (this.field3939 > 3) {
			var11 = Runtime.getRuntime().availableProcessors();
		} else {
			var11 = 0;
		}

		byte var12 = 0;
		String var13 = "";
		String var14 = "";
		String var15 = "";
		String var16 = "";
		String var17 = "";
		String var18 = "";
		int[] var23 = new int[3];
		return new PlatformInfo(var1, var24, var7, var8, this.field3939, this.field3937, this.field3941, false, var10, var11, var12, 0, var13, var14, var15, var16, 0, 0, 0, 0, var17, var18, var23, 0, "");
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1264148958"
	)
	void method6099(String var1) {
		if (var1.startsWith("1.")) {
			this.method6107(var1);
		} else {
			this.method6101(var1);
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "497638496"
	)
	void method6107(String var1) {
		String[] var2 = var1.split("\\.");

		try {
			this.field3939 = Integer.parseInt(var2[1]);
			var2 = var2[2].split("_");
			this.field3937 = Integer.parseInt(var2[0]);
			this.field3941 = Integer.parseInt(var2[1]);
		} catch (Exception var4) {
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2055431648"
	)
	void method6101(String var1) {
		String[] var2 = var1.split("\\.");

		try {
			this.field3939 = Integer.parseInt(var2[0]);
			this.field3937 = Integer.parseInt(var2[1]);
			this.field3941 = Integer.parseInt(var2[2]);
		} catch (Exception var4) {
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;ZII)V",
		garbageValue = "2098353545"
	)
	static void method6109(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (class377.clearLoginScreen) {
			if (var3 == 4) {
				Login.loginIndex = 4;
			}

		} else {
			Login.loginIndex = var3;
			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			class339.leftTitleSprite = class125.convertJpgToSprite(var4);
			class377.rightTitleSprite = class339.leftTitleSprite.mirrorHorizontally();
			class27.method364(var1, Client.worldProperties);
			Coord.titleboxSprite = TextureProvider.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			class289.titlebuttonSprite = TextureProvider.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			Login.runesSprite = WorldMapLabelSize.method3268(var1, "runes", "");
			GrandExchangeEvents.title_muteSprite = WorldMapLabelSize.method3268(var1, "title_mute", "");
			Login.options_buttons_0Sprite = TextureProvider.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			NetFileRequest.field3577 = TextureProvider.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			WorldMapCacheName.options_buttons_2Sprite = TextureProvider.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			Login.field1005 = TextureProvider.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			class126.field1477 = Login.options_buttons_0Sprite.subWidth;
			PcmPlayer.field416 = Login.options_buttons_0Sprite.subHeight;
			PendingSpawn.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
			}

			class0.field2 = 0;
			ItemLayer.otp = "";
			Login.field1022 = true;
			Login.worldSelectOpen = false;
			if (!class4.clientPreferences.titleMusicDisabled) {
				Archive var5 = DynamicObject.archive6;
				int var6 = var5.getGroupId("scape main");
				int var7 = var5.getFileId(var6, "");
				WorldMapIcon_1.playMusicTrack(2, var5, var6, var7, 255, false);
			} else {
				PcmPlayer.method856(2);
			}

			class105.method2358(false);
			class377.clearLoginScreen = true;
			Login.xPadding = (AttackOption.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			class25.loginBoxCenter = Login.loginBoxX + 180;
			class339.leftTitleSprite.drawAt(Login.xPadding, 0);
			class377.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Messages.logoSprite.drawAt(Login.xPadding + 382 - Messages.logoSprite.subWidth / 2, 18);
		}
	}
}
