import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ed")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("ag")
	static byte[][][] field1474;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("Widget_spritesArchive")
	public static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("aw")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lqa;Lqa;I)I",
		garbageValue = "1605409711"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lnd;ZII)V",
		garbageValue = "1893975915"
	)
	static void method2904(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 185
			if (var3 == 4) { // L: 186
				class328.method6115(4); // L: 187
			}

		} else {
			if (var3 == 0) { // L: 191
				class333.method6591(var2); // L: 192
			} else {
				class328.method6115(var3); // L: 195
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 197
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 198
			class407.leftTitleSprite = ClanChannelMember.method3152(var4); // L: 199
			ScriptFrame.rightTitleSprite = class407.leftTitleSprite.mirrorHorizontally(); // L: 200
			class425.method7865(var1, Client.worldProperties); // L: 201
			Login.titleboxSprite = class451.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 202
			Login.field923 = class451.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 203
			Login.field924 = class451.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 204
			DirectByteArrayCopier.field3792 = class451.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 205
			class451.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 206
			Login.field920 = DesktopPlatformInfoProvider.method8449(var1, "runes", ""); // L: 207
			class304.title_muteSprite = DesktopPlatformInfoProvider.method8449(var1, "title_mute", ""); // L: 208
			WorldMapLabelSize.field2862 = class451.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 209
			class4.field10 = class451.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 210
			class11.field63 = class451.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 211
			Message.field504 = class451.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 212
			class139.field1627 = WorldMapLabelSize.field2862.subWidth; // L: 213
			class453.field4760 = WorldMapLabelSize.field2862.subHeight; // L: 214
			class165.loginScreenRunesAnimation = new LoginScreenAnimation(Login.field920); // L: 215
			if (var2) { // L: 216
				Login.Login_username = ""; // L: 217
				Login.Login_password = ""; // L: 218
				Login.field953 = new String[8]; // L: 219
				Login.field938 = 0; // L: 220
			}

			class424.field4622 = 0; // L: 222
			Login.otp = ""; // L: 223
			Login.field943 = true; // L: 224
			Login.worldSelectOpen = false; // L: 225
			if (!class150.clientPreferences.method2469()) { // L: 226
				ArrayList var5 = new ArrayList(); // L: 227
				var5.add(new class318(class13.archive11, "scape main", "", 255, false)); // L: 228
				UserComparator4.method2858(var5, 0, 0, 0, 100, false); // L: 229
			} else {
				RouteStrategy.method4227(0, 0); // L: 231
			}

			class306.field3398.clear(); // L: 233
			class360 var6 = class153.field1700; // L: 237
			var6.method6845(false); // L: 239
			Login.clearLoginScreen = true; // L: 240
			Login.xPadding = (GrandExchangeOfferTotalQuantityComparator.canvasWidth - 765) / 2; // L: 241
			Login.loginBoxX = Login.xPadding + 202; // L: 242
			Script.loginBoxCenter = Login.loginBoxX + 180; // L: 243
			class407.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 244
			ScriptFrame.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 245
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 246
		}
	} // L: 189 247

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)Z",
		garbageValue = "41"
	)
	static boolean method2902(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 39
			boolean var3 = false; // L: 40
			boolean var4 = false; // L: 41
			int var5 = 0; // L: 42
			int var6 = var0.length(); // L: 43

			for (int var7 = 0; var7 < var6; ++var7) { // L: 44
				char var8 = var0.charAt(var7); // L: 45
				if (var7 == 0) { // L: 46
					if (var8 == '-') { // L: 47
						var3 = true; // L: 48
						continue;
					}

					if (var8 == '+') { // L: 51
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 53
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7'; // L: 54
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 55
						return false; // L: 56
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 57
					return false;
				}

				if (var3) { // L: 58
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1; // L: 59
				if (var9 / var1 != var5) { // L: 60
					return false;
				}

				var5 = var9; // L: 61
				var4 = true; // L: 62
			}

			return var4; // L: 64
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "0"
	)
	static int method2903(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 570
		Widget var4;
		if (var0 >= 2000) { // L: 572
			var0 -= 1000; // L: 573
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 574
			var4 = VarbitComposition.getWidget(var3); // L: 575
		} else {
			var4 = var2 ? class36.scriptDotWidget : class351.field3896; // L: 577
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 578
			Interpreter.Interpreter_intStackSize -= 4; // L: 579
			var4.rawX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 580
			var4.rawY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 581
			var4.xAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 582
			var4.yAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 583
			class200.invalidateWidget(var4); // L: 584
			TileItem.client.alignWidget(var4); // L: 585
			if (var3 != -1 && var4.type == 0) { // L: 586
				SoundCache.revalidateWidgetScroll(ArchiveLoader.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 587
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 589
			Interpreter.Interpreter_intStackSize -= 4; // L: 590
			var4.rawWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 591
			var4.rawHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 592
			var4.widthAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 593
			var4.heightAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 594
			class200.invalidateWidget(var4); // L: 595
			TileItem.client.alignWidget(var4); // L: 596
			if (var3 != -1 && var4.type == 0) { // L: 597
				SoundCache.revalidateWidgetScroll(ArchiveLoader.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 598
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 600
			boolean var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 601
			if (var5 != var4.isHidden) { // L: 602
				var4.isHidden = var5; // L: 603
				class200.invalidateWidget(var4); // L: 604
			}

			return 1; // L: 606
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 608
			var4.noClickThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 609
			return 1; // L: 610
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 612
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 613
			return 1; // L: 614
		} else {
			return 2; // L: 616
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1405780494"
	)
	static final int method2897(int var0, int var1) {
		int var2 = class419.method7756(var0 + 45365, var1 + 91923, 4) - 128 + (class419.method7756(var0 + 10294, var1 + 37821, 2) - 128 >> 1) + (class419.method7756(var0, var1, 1) - 128 >> 2); // L: 942
		var2 = (int)(0.3D * (double)var2) + 35; // L: 943
		if (var2 < 10) { // L: 944
			var2 = 10;
		} else if (var2 > 60) { // L: 945
			var2 = 60;
		}

		return var2; // L: 946
	}
}
