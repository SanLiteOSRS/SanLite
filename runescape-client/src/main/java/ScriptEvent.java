import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("ac")
	@Export("args")
	Object[] args;
	@ObfuscatedName("al")
	boolean field1077;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -516361671
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1264016841
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1289880341
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 875155687
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1281178505
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("av")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1781378181
	)
	int field1078;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -107146135
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;B)V",
		garbageValue = "-8"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1815349260"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnm;B)V",
		garbageValue = "-116"
	)
	public void method2317(Widget var1) {
		this.widget = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-119"
	)
	static int method2327(int var0, int var1) {
		FloorOverlayDefinition var2 = class4.method15(var0); // L: 15
		if (var2 == null) { // L: 16
			return var1; // L: 17
		} else {
			int var3;
			int var4;
			byte var5;
			int var7;
			if (var2.secondaryRgb >= 0) { // L: 19
				var3 = Occluder.method4859(var2.secondaryHue, var2.secondarySaturation, var2.secondaryLightness); // L: 20
				var5 = 96; // L: 22
				if (var3 == -2) { // L: 24
					var4 = 12345678; // L: 25
				} else if (var3 == -1) {
					if (var5 < 0) {
						var5 = 0;
					} else if (var5 > 127) {
						var5 = 127;
					}

					var7 = 127 - var5;
					var4 = var7;
				} else {
					var7 = var5 * (var3 & 127) / 128; // L: 39
					if (var7 < 2) {
						var7 = 2;
					} else if (var7 > 126) { // L: 41
						var7 = 126;
					}

					var4 = var7 + (var3 & 65408); // L: 42
				}

				return Rasterizer3D.Rasterizer3D_colorPalette[var4] | -16777216; // L: 45
			} else if (var2.texture >= 0) { // L: 47
				var4 = Rasterizer3D.field2550.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture); // L: 49
				var5 = 96; // L: 50
				if (var4 == -2) { // L: 52
					var3 = 12345678; // L: 53
				} else if (var4 == -1) { // L: 56
					if (var5 < 0) { // L: 57
						var5 = 0; // L: 58
					} else if (var5 > 127) { // L: 60
						var5 = 127; // L: 61
					}

					var7 = 127 - var5; // L: 63
					var3 = var7; // L: 64
				} else {
					var7 = var5 * (var4 & 127) / 128; // L: 67
					if (var7 < 2) {
						var7 = 2; // L: 68
					} else if (var7 > 126) { // L: 69
						var7 = 126;
					}

					var3 = var7 + (var4 & 65408); // L: 70
				}

				return Rasterizer3D.Rasterizer3D_colorPalette[var3] | -16777216; // L: 73
			} else if (var2.primaryRgb == 16711935) { // L: 75
				return var1; // L: 76
			} else {
				var3 = Occluder.method4859(var2.hue, var2.saturation, var2.lightness); // L: 79
				var5 = 96; // L: 81
				if (var3 == -2) { // L: 83
					var4 = 12345678; // L: 84
				} else if (var3 == -1) { // L: 87
					if (var5 < 0) { // L: 88
						var5 = 0; // L: 89
					} else if (var5 > 127) { // L: 91
						var5 = 127; // L: 92
					}

					var7 = 127 - var5; // L: 94
					var4 = var7; // L: 95
				} else {
					var7 = var5 * (var3 & 127) / 128; // L: 98
					if (var7 < 2) { // L: 99
						var7 = 2;
					} else if (var7 > 126) { // L: 100
						var7 = 126;
					}

					var4 = var7 + (var3 & 65408); // L: 101
				}

				return Rasterizer3D.Rasterizer3D_colorPalette[var4] | -16777216; // L: 104
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;III)[Lud;",
		garbageValue = "-1840423911"
	)
	public static SpritePixels[] method2331(AbstractArchive var0, int var1, int var2) {
		if (!class164.method3376(var0, var1, var2)) { // L: 23
			return null;
		} else {
			SpritePixels[] var4 = new SpritePixels[class544.SpriteBuffer_spriteCount]; // L: 26

			for (int var5 = 0; var5 < class544.SpriteBuffer_spriteCount; ++var5) { // L: 27
				SpritePixels var6 = var4[var5] = new SpritePixels(); // L: 28
				var6.width = class159.SpriteBuffer_spriteWidth; // L: 29
				var6.height = class500.SpriteBuffer_spriteHeight; // L: 30
				var6.xOffset = class326.SpriteBuffer_xOffsets[var5]; // L: 31
				var6.yOffset = ModelData0.SpriteBuffer_yOffsets[var5]; // L: 32
				var6.subWidth = class59.SpriteBuffer_spriteWidths[var5]; // L: 33
				var6.subHeight = class544.SpriteBuffer_spriteHeights[var5]; // L: 34
				int var7 = var6.subWidth * var6.subHeight; // L: 35
				byte[] var8 = class414.SpriteBuffer_pixels[var5]; // L: 36
				var6.pixels = new int[var7]; // L: 37

				for (int var9 = 0; var9 < var7; ++var9) { // L: 38
					var6.pixels[var9] = class372.SpriteBuffer_spritePalette[var8[var9] & 255];
				}
			}

			class407.method7453(); // L: 40
			return var4; // L: 43
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lom;Lom;ZIB)V",
		garbageValue = "-22"
	)
	static void method2328(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 207
			if (var3 == 4) { // L: 208
				GameEngine.method647(4); // L: 209
			}

		} else {
			if (var3 == 0) { // L: 213
				MusicPatchNode2.method5929(var2); // L: 214
			} else {
				GameEngine.method647(var3); // L: 217
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 219
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 220
			PcmPlayer.leftTitleSprite = Frames.method4854(var4); // L: 221
			Login.rightTitleSprite = PcmPlayer.leftTitleSprite.mirrorHorizontally(); // L: 222
			TextureProvider.method4884(var1, Client.worldProperties); // L: 223
			Login.titleboxSprite = class167.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 224
			VarcInt.field1964 = class167.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 225
			Login.field929 = class167.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 226
			class364.field3941 = class167.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 227
			class167.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 228
			Login.field948 = InvDefinition.method3618(var1, "runes", ""); // L: 229
			Login.title_muteSprite = InvDefinition.method3618(var1, "title_mute", ""); // L: 230
			class519.field5077 = class167.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 231
			class305.field3128 = class167.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 232
			class534.field5198 = class167.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 233
			ClanChannel.field1779 = class167.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 234
			class274.field2991 = class519.field5077.subWidth; // L: 235
			class202.field2025 = class519.field5077.subHeight; // L: 236
			class544.loginScreenRunesAnimation = new LoginScreenAnimation(Login.field948); // L: 237
			if (var2) { // L: 238
				Login.Login_username = ""; // L: 239
				Login.Login_password = ""; // L: 240
				Login.field947 = new String[8]; // L: 241
				Login.field946 = 0; // L: 242
			}

			ClientPreferences.field1295 = 0; // L: 244
			class186.otp = ""; // L: 245
			Login.field951 = true; // L: 246
			Login.worldSelectOpen = false; // L: 247
			if (!class91.clientPreferences.method2503()) { // L: 248
				ArrayList var5 = new ArrayList(); // L: 249
				var5.add(new class331(CollisionMap.field2392, "scape main", "", 255, false)); // L: 250
				class148.method3166(var5, 0, 0, 0, 100, false); // L: 251
			} else {
				ItemComposition.method4136(0, 0); // L: 253
			}

			class470.method8459(); // L: 254
			class13.method167().method7000(false); // L: 255
			Login.clearLoginScreen = true; // L: 256
			Login.xPadding = (class340.canvasWidth - 765) / 2; // L: 257
			Login.loginBoxX = Login.xPadding + 202; // L: 258
			class379.loginBoxCenter = Login.loginBoxX + 180; // L: 259
			PcmPlayer.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 260
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 261
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 262
		}
	} // L: 211 263

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "77"
	)
	static final int method2330(int var0, int var1) {
		if (var0 == -1) { // L: 976
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 977
			if (var1 < 2) { // L: 978
				var1 = 2;
			} else if (var1 > 126) { // L: 979
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 980
		}
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1310629797"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class304.method5860(); // L: 12289
		class309.method5867(); // L: 12290
		int var1 = class150.VarpDefinition_get(var0).type; // L: 12291
		if (var1 != 0) { // L: 12292
			int var2 = Varps.Varps_main[var0]; // L: 12293
			if (var1 == 1) { // L: 12294
				if (var2 == 1) { // L: 12295
					JagexCache.method3533(0.9D);
				}

				if (var2 == 2) { // L: 12296
					JagexCache.method3533(0.8D);
				}

				if (var2 == 3) { // L: 12297
					JagexCache.method3533(0.7D);
				}

				if (var2 == 4) { // L: 12298
					JagexCache.method3533(0.6D);
				}
			}

			if (var1 == 3) { // L: 12300
				if (var2 == 0) { // L: 12301
					JagexCache.method3540(255);
				}

				if (var2 == 1) { // L: 12302
					JagexCache.method3540(192);
				}

				if (var2 == 2) { // L: 12303
					JagexCache.method3540(128);
				}

				if (var2 == 3) { // L: 12304
					JagexCache.method3540(64);
				}

				if (var2 == 4) { // L: 12305
					JagexCache.method3540(0);
				}
			}

			if (var1 == 4) { // L: 12307
				if (var2 == 0) { // L: 12308
					FloorOverlayDefinition.method4148(127);
				}

				if (var2 == 1) { // L: 12309
					FloorOverlayDefinition.method4148(96);
				}

				if (var2 == 2) { // L: 12310
					FloorOverlayDefinition.method4148(64);
				}

				if (var2 == 3) { // L: 12311
					FloorOverlayDefinition.method4148(32);
				}

				if (var2 == 4) { // L: 12312
					FloorOverlayDefinition.method4148(0);
				}
			}

			if (var1 == 5) { // L: 12314
				Client.field745 = var2 == 1;
			}

			if (var1 == 6) { // L: 12315
				Client.chatEffects = var2;
			}

			if (var1 == 9) { // L: 12316
			}

			if (var1 == 10) { // L: 12317
				if (var2 == 0) { // L: 12318
					class198.method3736(127);
				}

				if (var2 == 1) { // L: 12319
					class198.method3736(96);
				}

				if (var2 == 2) { // L: 12320
					class198.method3736(64);
				}

				if (var2 == 3) { // L: 12321
					class198.method3736(32);
				}

				if (var2 == 4) { // L: 12322
					class198.method3736(0);
				}
			}

			if (var1 == 17) { // L: 12324
				Client.followerIndex = var2 & 65535; // L: 12325
			}

			if (var1 == 18) { // L: 12327
				Client.playerAttackOption = (AttackOption)SequenceDefinition.findEnumerated(ClientPreferences.method2604(), var2); // L: 12328
				if (Client.playerAttackOption == null) { // L: 12329
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) { // L: 12331
				if (var2 == -1) { // L: 12332
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 12333
				}
			}

			if (var1 == 22) { // L: 12335
				Client.npcAttackOption = (AttackOption)SequenceDefinition.findEnumerated(ClientPreferences.method2604(), var2); // L: 12336
				if (Client.npcAttackOption == null) { // L: 12337
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 12339

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "-1009991511"
	)
	static String method2315(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 12733
		if (Client.gameBuild == 1) { // L: 12734
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 12735
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 12736
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 12737
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 12738
			var0 = "local";
		}

		String var3 = ""; // L: 12739
		if (HealthBarDefinition.field1995 != null) { // L: 12740
			var3 = "/p=" + HealthBarDefinition.field1995;
		}

		String var4 = "runescape.com"; // L: 12741
		return var2 + var0 + "." + var4 + "/l=" + WorldMapLabelSize.clientLanguage + "/a=" + WorldMapIcon_1.field2916 + var3 + "/"; // L: 12742
	}
}
