import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("k")
class class12 extends SSLSocket {
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	static IndexedSprite field54;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1033236073
	)
	public static int field55;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("i")
	Certificate[] field53;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Lu;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1;
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public String[] getEnabledProtocols() {
		return null;
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream();
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close();
	}

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	public boolean getEnableSessionCreation() {
		return false;
	}

	public String[] getEnabledCipherSuites() {
		return null;
	}

	public String[] getSupportedProtocols() {
		return null;
	}

	public String[] getSupportedCipherSuites() {
		return null;
	}

	public void setEnableSessionCreation(boolean var1) {
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	public void setEnabledCipherSuites(String[] var1) {
	}

	public void setNeedClientAuth(boolean var1) {
	}

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this));
	}

	public SSLSession getSession() {
		return new class17(this);
	}

	public void setWantClientAuth(boolean var1) {
	}

	public void setEnabledProtocols(String[] var1) {
	}

	public boolean getWantClientAuth() {
		return false;
	}

	public boolean getNeedClientAuth() {
		return false;
	}

	public void setUseClientMode(boolean var1) {
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
	}

	public boolean getUseClientMode() {
		return false;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lle;Lle;Lle;I)V",
		garbageValue = "31635471"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (GameEngine.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		Login.loginBoxCenter = Login.loginBoxX + 180;
		byte var3;
		int var4;
		int var8;
		boolean var15;
		int var16;
		int var25;
		int var33;
		int var43;
		if (Login.worldSelectOpen) {
			int var47;
			if (DirectByteArrayCopier.worldSelectBackSprites == null) {
				Archive var44 = GrandExchangeOfferOwnWorldComparator.archive8;
				var43 = var44.getGroupId("sl_back");
				var47 = var44.getFileId(var43, "");
				SpritePixels[] var45 = class21.method312(var44, var43, var47);
				DirectByteArrayCopier.worldSelectBackSprites = var45;
			}

			if (UserComparator7.worldSelectFlagSprites == null) {
				UserComparator7.worldSelectFlagSprites = class393.SpriteBuffer_getSpritePixelsByName(GrandExchangeOfferOwnWorldComparator.archive8, "sl_flags", "");
			}

			if (class54.worldSelectArrows == null) {
				class54.worldSelectArrows = class393.SpriteBuffer_getSpritePixelsByName(GrandExchangeOfferOwnWorldComparator.archive8, "sl_arrows", "");
			}

			if (KeyHandler.worldSelectStars == null) {
				KeyHandler.worldSelectStars = class393.SpriteBuffer_getSpritePixelsByName(GrandExchangeOfferOwnWorldComparator.archive8, "sl_stars", "");
			}

			if (UserComparator6.worldSelectLeftSprite == null) {
				UserComparator6.worldSelectLeftSprite = Script.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOfferOwnWorldComparator.archive8, "leftarrow", "");
			}

			if (class81.worldSelectRightSprite == null) {
				class81.worldSelectRightSprite = Script.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOfferOwnWorldComparator.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
			if (KeyHandler.worldSelectStars != null) {
				KeyHandler.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
				KeyHandler.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
			}

			if (class54.worldSelectArrows != null) {
				var33 = Login.xPadding + 280;
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
					class54.worldSelectArrows[2].drawAt(var33, 4);
				} else {
					class54.worldSelectArrows[0].drawAt(var33, 4);
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
					class54.worldSelectArrows[3].drawAt(var33 + 15, 4);
				} else {
					class54.worldSelectArrows[1].drawAt(var33 + 15, 4);
				}

				var0.draw("World", var33 + 32, 17, 16777215, -1);
				var4 = Login.xPadding + 390;
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
					class54.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					class54.worldSelectArrows[0].drawAt(var4, 4);
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
					class54.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					class54.worldSelectArrows[1].drawAt(var4 + 15, 4);
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1);
				var43 = Login.xPadding + 500;
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
					class54.worldSelectArrows[2].drawAt(var43, 4);
				} else {
					class54.worldSelectArrows[0].drawAt(var43, 4);
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
					class54.worldSelectArrows[3].drawAt(var43 + 15, 4);
				} else {
					class54.worldSelectArrows[1].drawAt(var43 + 15, 4);
				}

				var0.draw("Location", var43 + 32, 17, 16777215, -1);
				var47 = Login.xPadding + 610;
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
					class54.worldSelectArrows[2].drawAt(var47, 4);
				} else {
					class54.worldSelectArrows[0].drawAt(var47, 4);
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
					class54.worldSelectArrows[3].drawAt(var47 + 15, 4);
				} else {
					class54.worldSelectArrows[1].drawAt(var47 + 15, 4);
				}

				var0.draw("Type", var47 + 32, 17, 16777215, -1);
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
			Login.hoveredWorldIndex = -1;
			if (DirectByteArrayCopier.worldSelectBackSprites != null) {
				var3 = 88;
				byte var39 = 19;
				var43 = 765 / (var3 + 1) - 1;
				var47 = 480 / (var39 + 1);

				do {
					var25 = var47;
					var8 = var43;
					if (var47 * (var43 - 1) >= World.World_count) {
						--var43;
					}

					if (var43 * (var47 - 1) >= World.World_count) {
						--var47;
					}

					if (var43 * (var47 - 1) >= World.World_count) {
						--var47;
					}
				} while(var47 != var25 || var43 != var8);

				var25 = (765 - var3 * var43) / (var43 + 1);
				if (var25 > 5) {
					var25 = 5;
				}

				var8 = (480 - var39 * var47) / (var47 + 1);
				if (var8 > 5) {
					var8 = 5;
				}

				int var28 = (765 - var3 * var43 - var25 * (var43 - 1)) / 2;
				int var37 = (480 - var39 * var47 - var8 * (var47 - 1)) / 2;
				int var38 = (var47 + World.World_count - 1) / var47;
				Login.worldSelectPagesCount = var38 - var43;
				if (UserComparator6.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
					UserComparator6.worldSelectLeftSprite.drawAt(8, KeyHandler.canvasHeight / 2 - UserComparator6.worldSelectLeftSprite.subHeight * 470302976 / 2);
				}

				if (class81.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
					class81.worldSelectRightSprite.drawAt(GameEngine.canvasWidth - class81.worldSelectRightSprite.subWidth - 8, KeyHandler.canvasHeight / 2 - class81.worldSelectRightSprite.subHeight * 470302976 / 2);
				}

				int var29 = var37 + 23;
				int var30 = var28 + Login.xPadding;
				int var40 = 0;
				var15 = false;
				var16 = Login.worldSelectPage;

				int var41;
				for (var41 = var16 * var47; var41 < World.World_count && var16 - Login.worldSelectPage < var43; ++var41) {
					World var18 = WorldMapEvent.World_worlds[var41];
					boolean var19 = true;
					String var20 = Integer.toString(var18.population);
					if (var18.population == -1) {
						var20 = "OFF";
						var19 = false;
					} else if (var18.population > 1980) {
						var20 = "FULL";
						var19 = false;
					}

					int var22 = 0;
					byte var21;
					if (var18.isBeta()) {
						if (var18.isMembersOnly()) {
							var21 = 7;
						} else {
							var21 = 6;
						}
					} else if (var18.isDeadman()) {
						var22 = 16711680;
						if (var18.isMembersOnly()) {
							var21 = 5;
						} else {
							var21 = 4;
						}
					} else if (var18.method1652()) {
						if (var18.isMembersOnly()) {
							var21 = 9;
						} else {
							var21 = 8;
						}
					} else if (var18.isPvp()) {
						if (var18.isMembersOnly()) {
							var21 = 3;
						} else {
							var21 = 2;
						}
					} else if (var18.isMembersOnly()) {
						var21 = 1;
					} else {
						var21 = 0;
					}

					if (MouseHandler.MouseHandler_x >= var30 && MouseHandler.MouseHandler_y >= var29 && MouseHandler.MouseHandler_x < var3 + var30 && MouseHandler.MouseHandler_y < var29 + var39 && var19) {
						Login.hoveredWorldIndex = var41;
						DirectByteArrayCopier.worldSelectBackSprites[var21].drawTransOverlayAt(var30, var29, 128, 16777215);
						var15 = true;
					} else {
						DirectByteArrayCopier.worldSelectBackSprites[var21].drawAt(var30, var29);
					}

					if (UserComparator7.worldSelectFlagSprites != null) {
						UserComparator7.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var30 + 29, var29);
					}

					var0.drawCentered(Integer.toString(var18.id), var30 + 15, var39 / 2 + var29 + 5, var22, -1);
					var1.drawCentered(var20, var30 + 60, var39 / 2 + var29 + 5, 268435455, -1);
					var29 = var29 + var8 + var39;
					++var40;
					if (var40 >= var47) {
						var29 = var37 + 23;
						var30 = var30 + var3 + var25;
						var40 = 0;
						++var16;
					}
				}

				if (var15) {
					var41 = var1.stringWidth(WorldMapEvent.World_worlds[Login.hoveredWorldIndex].activity) + 6;
					int var31 = var1.ascent + 8;
					int var42 = MouseHandler.MouseHandler_y + 25;
					if (var31 + var42 > 480) {
						var42 = MouseHandler.MouseHandler_y - 25 - var31;
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var41 / 2, var42, var41, var31, 16777120);
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var41 / 2, var42, var41, var31, 0);
					var1.drawCentered(WorldMapEvent.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var42 + var1.ascent + 4, 0, -1);
				}
			}

			Canvas.rasterProvider.drawFull(0, 0);
		} else {
			RouteStrategy.leftTitleSprite.drawAt(Login.xPadding, 0);
			class139.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class16.logoSprite.drawAt(Login.xPadding + 382 - class16.logoSprite.subWidth / 2, 18);
			if (Client.gameState == 0 || Client.gameState == 5) {
				var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}

			String var5;
			String var6;
			String var7;
			short var32;
			short var34;
			if (Client.gameState == 20) {
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight * 470302976 / 2);
				var32 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0);
				var33 = var32 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0);
				var33 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0);
				var33 += 15;
				var33 += 7;
				if (Login.loginIndex != 4 && Login.loginIndex != 10) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var33, 16777215, 0);
					var34 = 200;
					var5 = class408.clientPreferences.hideUsername ? class115.method2555(Login.Login_username) : Login.Login_username;

					for (var6 = var5; var0.stringWidth(var6) > var34; var6 = var6.substring(0, var6.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var33, 16777215, 0);
					var33 += 15;

					for (var7 = class115.method2555(Login.Login_password); var0.stringWidth(var7) > var34; var7 = var7.substring(1)) {
					}

					var0.draw("Password: " + var7, Login.loginBoxX + 180 - 108, var33, 16777215, 0);
					var33 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11) {
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var23;
				if (Login.loginIndex == 0) {
					var32 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var32, 16776960, 0);
					var33 = var32 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 291;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var32 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0);
					var33 = var32 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0);
					var33 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0);
					var33 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 321;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0);
				} else if (Login.loginIndex == 2) {
					var32 = 201;
					var0.drawCentered(Login.Login_response1, Login.loginBoxCenter, var32, 16776960, 0);
					var33 = var32 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxCenter, var33, 16776960, 0);
					var33 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxCenter, var33, 16776960, 0);
					var33 += 15;
					var33 += 7;
					var0.draw("Login: ", Login.loginBoxCenter - 110, var33, 16777215, 0);
					var34 = 200;
					var5 = class408.clientPreferences.hideUsername ? class115.method2555(Login.Login_username) : Login.Login_username;

					for (var6 = var5; var0.stringWidth(var6) > var34; var6 = var6.substring(1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? MouseHandler.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter - 70, var33, 16777215, 0);
					var33 += 15;

					for (var7 = class115.method2555(Login.Login_password); var0.stringWidth(var7) > var34; var7 = var7.substring(1)) {
					}

					var0.draw("Password: " + var7 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? MouseHandler.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter - 108, var33, 16777215, 0);
					var33 += 15;
					var32 = 277;
					var8 = Login.loginBoxCenter + -117;
					boolean var10 = Client.Login_isUsernameRemembered;
					boolean var11 = Login.field873;
					IndexedSprite var9 = var10 ? (var11 ? FriendsChatMember.field3950 : class9.options_buttons_2Sprite) : (var11 ? Login.field868 : NetSocket.options_buttons_0Sprite);
					var9.drawAt(var8, var32);
					var8 = var8 + var9.subWidth + 5;
					var1.draw("Remember username", var8, var32 + 13, 16776960, 0);
					var8 = Login.loginBoxCenter + 24;
					boolean var14 = class408.clientPreferences.hideUsername;
					var15 = Login.field860;
					IndexedSprite var13 = var14 ? (var15 ? FriendsChatMember.field3950 : class9.options_buttons_2Sprite) : (var15 ? Login.field868 : NetSocket.options_buttons_0Sprite);
					var13.drawAt(var8, var32);
					var8 = var8 + var13.subWidth + 5;
					var1.draw("Hide username", var8, var32 + 13, 16776960, 0);
					var33 = var32 + 15;
					var16 = Login.loginBoxCenter - 80;
					short var17 = 321;
					Login.titlebuttonSprite.drawAt(var16 - 73, var17 - 20);
					var0.drawCentered("Login", var16, var17 + 5, 16777215, 0);
					var16 = Login.loginBoxCenter + 80;
					Login.titlebuttonSprite.drawAt(var16 - 73, var17 - 20);
					var0.drawCentered("Cancel", var16, var17 + 5, 16777215, 0);
					var32 = 357;
					switch(Login.field865) {
					case 2:
						UserComparator6.field1340 = "Having trouble logging in?";
						break;
					default:
						UserComparator6.field1340 = "Can't login? Click here.";
					}

					class114.field1359 = new Bounds(Login.loginBoxCenter, var32, var1.stringWidth(UserComparator6.field1340), 11);
					ItemContainer.field998 = new Bounds(Login.loginBoxCenter, var32, var1.stringWidth("Still having trouble logging in?"), 11);
					var1.drawCentered(UserComparator6.field1340, Login.loginBoxCenter, var32, 16777215, 0);
				} else if (Login.loginIndex == 3) {
					var32 = 201;
					var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var32, 16776960, 0);
					var33 = var32 + 20;
					var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var33, 16776960, 0);
					var33 += 15;
					var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var33, 16776960, 0);
					var33 += 15;
					var4 = Login.loginBoxX + 180;
					var23 = 276;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180;
					var23 = 326;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0);
				} else {
					short var36;
					if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var32 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0);
						var33 = var32 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0);
						var33 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0);
						var33 += 15;
						var0.draw("PIN: " + class115.method2555(Tiles.otp) + (Client.cycle % 40 < 20 ? MouseHandler.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var33, 16777215, 0);
						var33 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var33, 16776960, 0);
						var33 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var33, 16776960, 0);
						var4 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15;
						var43 = var33 - var0.ascent;
						IndexedSprite var35;
						if (Login.field875) {
							var35 = class9.options_buttons_2Sprite;
						} else {
							var35 = NetSocket.options_buttons_0Sprite;
						}

						var35.drawAt(var4, var43);
						var33 += 15;
						var25 = Login.loginBoxX + 180 - 80;
						var36 = 321;
						Login.titlebuttonSprite.drawAt(var25 - 73, var36 - 20);
						var0.drawCentered("Continue", var25, var36 + 5, 16777215, 0);
						var25 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var25 - 73, var36 - 20);
						var0.drawCentered("Cancel", var25, var36 + 5, 16777215, 0);
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var36 + 36, 255, 0);
					} else if (Login.loginIndex == 5) {
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
						var32 = 221;
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0);
						var33 = var32 + 15;
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 15;
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 15;
						var33 += 14;
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var33, 16777215, 0);
						var34 = 174;
						var5 = class408.clientPreferences.hideUsername ? class115.method2555(Login.Login_username) : Login.Login_username;

						for (var6 = var5; var0.stringWidth(var6) > var34; var6 = var6.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? MouseHandler.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var33, 16777215, 0);
						var33 += 15;
						var25 = Login.loginBoxX + 180 - 80;
						var36 = 321;
						Login.titlebuttonSprite.drawAt(var25 - 73, var36 - 20);
						var0.drawCentered("Recover", var25, var36 + 5, 16777215, 0);
						var25 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var25 - 73, var36 - 20);
						var0.drawCentered("Back", var25, var36 + 5, 16777215, 0);
						var36 = 356;
						var1.drawCentered("Still having trouble logging in?", Login.loginBoxCenter, var36, 268435455, 0);
					} else if (Login.loginIndex == 6) {
						var32 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0);
						var33 = var32 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 321;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 7) {
						var32 = 216;
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var32, 16776960, 0);
						var33 = var32 + 15;
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 15;
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 8) {
						var32 = 216;
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var32, 16776960, 0);
						var33 = var32 + 15;
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 15;
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 9) {
						var32 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0);
						var33 = var32 + 25;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 25;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 311;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 10) {
						var33 = Login.loginBoxX + 180;
						var34 = 209;
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var34, 16776960, 0);
						var4 = var34 + 20;
						Login.field854.drawAt(var33 - 109, var4);
						class29.field159.drawAt(var33 - 48, var4 + 18);
					} else if (Login.loginIndex == 12) {
						var33 = Login.loginBoxCenter;
						var34 = 216;
						var2.drawCentered("Before using this app, please read and accept our", var33, var34, 16777215, 0);
						var4 = var34 + 17;
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var33, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var33, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("By accepting, you agree to these documents.", var33, var4, 16777215, 0);
						var33 = Login.loginBoxCenter - 80;
						var34 = 311;
						Login.titlebuttonSprite.drawAt(var33 - 73, var34 - 20);
						var0.drawCentered("Accept", var33, var34 + 5, 16777215, 0);
						var33 = Login.loginBoxCenter + 80;
						Login.titlebuttonSprite.drawAt(var33 - 73, var34 - 20);
						var0.drawCentered("Decline", var33, var34 + 5, 16777215, 0);
					} else if (Login.loginIndex == 13) {
						var32 = 231;
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var32, 16777215, 0);
						var33 = var32 + 20;
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var33, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var32 = 311;
						Login.titlebuttonSprite.drawAt(var4 - 73, var32 - 20);
						var0.drawCentered("Back", var4, var32 + 5, 16777215, 0);
					} else if (Login.loginIndex == 14) {
						var32 = 201;
						String var24 = "";
						var5 = "";
						var6 = "";
						switch(Login.field866) {
						case 0:
							var24 = "Your account has been disabled.";
							var5 = Strings.field3501;
							var6 = "";
							break;
						case 1:
							var24 = "Account locked as we suspect it has been stolen.";
							var5 = Strings.field3446;
							var6 = "";
							break;
						default:
							class1.Login_promptCredentials(false);
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var32, 16776960, 0);
						var33 = var32 + 15;
						var2.drawCentered(var5, Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 15;
						var2.drawCentered(var6, Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 15;
						var25 = Login.loginBoxX + 180;
						var36 = 276;
						Login.titlebuttonSprite.drawAt(var25 - 73, var36 - 20);
						var0.drawCentered("Support Page", var25, var36 + 5, 16777215, 0);
						var25 = Login.loginBoxX + 180;
						var36 = 326;
						Login.titlebuttonSprite.drawAt(var25 - 73, var36 - 20);
						var0.drawCentered("Back", var25, var36 + 5, 16777215, 0);
					} else if (Login.loginIndex == 24) {
						var32 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0);
						var33 = var32 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0);
						var33 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0);
						var33 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 301;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0);
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var26 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var26);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, KeyHandler.canvasHeight);
				Login.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				Login.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var26);
			}

			VarpDefinition.title_muteSprite[class408.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && Language.Language_EN == MouseHandler.clientLanguage) {
				if (field54 != null) {
					var33 = Login.xPadding + 5;
					var34 = 463;
					byte var46 = 100;
					byte var27 = 35;
					field54.drawAt(var33, var34);
					var0.drawCentered("World" + " " + Client.worldId, var46 / 2 + var33, var27 / 2 + var34 - 2, 16777215, 0);
					if (class21.World_request != null) {
						var1.drawCentered("Loading...", var46 / 2 + var33, var27 / 2 + var34 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var46 / 2 + var33, var27 / 2 + var34 + 12, 16777215, 0);
					}
				} else {
					field54 = Script.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOfferOwnWorldComparator.archive8, "sl_button", "");
				}
			}

		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-2090753673"
	)
	static int method171(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = MusicPatch.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = class20.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = class91.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
					var7 = null;

					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == WorldMapEvent.World_worlds[var8].id) {
							var7 = WorldMapEvent.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					class14.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 3] == 1;
					class11.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							class14.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
							var5 = Buffer.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ScriptFrame.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ScriptFrame.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							class14.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
							var5 = Buffer.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = KitDefinition.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = KitDefinition.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							class14.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
							var5 = Buffer.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = TaskHandler.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = TaskHandler.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							class14.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
							var5 = Buffer.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = class275.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class275.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.clientType & 3;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--class295.Interpreter_stringStackSize;
							--class14.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--class295.Interpreter_stringStackSize;
							--class14.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.field469;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = WorldMapEvent.World_worlds[var3];
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1284893568"
	)
	static void method170(int var0) {
		class274.tempMenuAction = new MenuAction();
		class274.tempMenuAction.param0 = Client.menuArguments1[var0];
		class274.tempMenuAction.param1 = Client.menuArguments2[var0];
		class274.tempMenuAction.opcode = Client.menuOpcodes[var0];
		class274.tempMenuAction.identifier = Client.menuIdentifiers[var0];
		class274.tempMenuAction.action = Client.menuActions[var0];
	}
}
