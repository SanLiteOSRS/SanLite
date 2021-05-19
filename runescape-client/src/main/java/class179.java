import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class179 {
	@ObfuscatedName("tx")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	static final class179 field2097;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	static final class179 field2094;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 243264849
	)
	@Export("value")
	final int value;

	static {
		field2097 = new class179(0);
		field2094 = new class179(1);
	}

	class179(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Laq;S)V",
		garbageValue = "11379"
	)
	@Export("doCycleTitle")
	static void doCycleTitle(GameEngine var0) {
		int var4;
		if (Login.worldSelectOpen) {
			while (true) {
				if (!class17.isKeyDown()) {
					if (MouseHandler.MouseHandler_lastButton != 1 && (class229.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) {
						break;
					}

					int var1 = Login.xPadding + 280;
					if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class303.changeWorldSelectSorting(0, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class303.changeWorldSelectSorting(0, 1);
						break;
					}

					int var2 = Login.xPadding + 390;
					if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class303.changeWorldSelectSorting(1, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class303.changeWorldSelectSorting(1, 1);
						break;
					}

					int var49 = Login.xPadding + 500;
					if (MouseHandler.MouseHandler_lastPressedX >= var49 && MouseHandler.MouseHandler_lastPressedX <= var49 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class303.changeWorldSelectSorting(2, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var49 + 15 && MouseHandler.MouseHandler_lastPressedX <= var49 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class303.changeWorldSelectSorting(2, 1);
						break;
					}

					var4 = Login.xPadding + 610;
					if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class303.changeWorldSelectSorting(3, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class303.changeWorldSelectSorting(3, 1);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
						class69.method1151();
						break;
					}

					if (Login.hoveredWorldIndex != -1) {
						World var5 = Messages.World_worlds[Login.hoveredWorldIndex];
						PlatformInfo.changeWorld(var5);
						class69.method1151();
					} else {
						if (Login.worldSelectPage > 0 && class285.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class285.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= HealthBarDefinition.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= HealthBarDefinition.canvasHeight / 2 + 50) {
							--Login.worldSelectPage;
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && Nameable.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GameEngine.canvasWidth - Nameable.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GameEngine.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= HealthBarDefinition.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= HealthBarDefinition.canvasHeight / 2 + 50) {
							++Login.worldSelectPage;
						}
					}
					break;
				}

				if (MenuAction.field982 == 13) {
					class69.method1151();
					break;
				}

				if (MenuAction.field982 == 96) {
					if (Login.worldSelectPage > 0 && class285.worldSelectLeftSprite != null) {
						--Login.worldSelectPage;
					}
				} else if (MenuAction.field982 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && Nameable.worldSelectRightSprite != null) {
					++Login.worldSelectPage;
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class229.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				class12.clientPreferences.titleMusicDisabled = !class12.clientPreferences.titleMusicDisabled;
				KeyHandler.savePreferences();
				if (!class12.clientPreferences.titleMusicDisabled) {
					MouseRecorder.method2124(class29.archive6, "scape main", "", 255, false);
				} else {
					ViewportMouse.method4193();
				}
			}

			if (Client.gameState != 5) {
				if (Login.field1001 == -1L) {
					Login.field1001 = Archive.currentTimeMillis() + 1000L;
				}

				long var21 = Archive.currentTimeMillis();
				boolean var3;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) {
							var3 = true;
							break;
						}

						ArchiveLoader var23 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
						if (!var23.isLoaded()) {
							var3 = false;
							break;
						}

						++Client.archiveLoadersDone;
					}
				} else {
					var3 = true;
				}

				if (var3 && Login.field1019 == -1L) {
					Login.field1019 = var21;
					if (Login.field1019 > Login.field1001) {
						Login.field1001 = Login.field1019;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					if (Language.Language_EN == class7.clientLanguage) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !class229.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var4 = Login.xPadding + 5;
							short var24 = 463;
							byte var6 = 100;
							byte var7 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var6 + var4 && MouseHandler.MouseHandler_lastPressedY >= var24 && MouseHandler.MouseHandler_lastPressedY <= var24 + var7) {
								WorldMapCacheName.method3648();
								return;
							}
						}

						if (World.World_request != null) {
							WorldMapCacheName.method3648();
						}
					}

					var4 = MouseHandler.MouseHandler_lastButton;
					int var68 = MouseHandler.MouseHandler_lastPressedX;
					int var50 = MouseHandler.MouseHandler_lastPressedY;
					if (var4 == 0) {
						var68 = MouseHandler.MouseHandler_x;
						var50 = MouseHandler.MouseHandler_y;
					}

					if (!class229.mouseCam && var4 == 4) {
						var4 = 1;
					}

					short var53;
					int var54;
					if (Login.loginIndex == 0) {
						boolean var62 = false;

						while (class17.isKeyDown()) {
							if (MenuAction.field982 == 84) {
								var62 = true;
							}
						}

						var54 = class21.loginBoxCenter - 80;
						var53 = 291;
						if (var4 == 1 && var68 >= var54 - 75 && var68 <= var54 + 75 && var50 >= var53 - 20 && var50 <= var53 + 20) {
							Interpreter.openURL(class4.method57("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var54 = class21.loginBoxCenter + 80;
						if (var4 == 1 && var68 >= var54 - 75 && var68 <= var54 + 75 && var50 >= var53 - 20 && var50 <= var53 + 20 || var62) {
							if ((Client.worldProperties & 33554432) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								Login.loginIndex = 1;
								GrandExchangeOfferOwnWorldComparator.method1213();
							} else if ((Client.worldProperties & 4) != 0) {
								if ((Client.worldProperties & 1024) != 0) {
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other almost everywhere";
									Login.Login_response3 = "and the Protect Item prayer won't work.";
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other";
									Login.Login_response3 = "almost everywhere.";
								}

								Login.Login_response0 = "Warning!";
								Login.loginIndex = 1;
								GrandExchangeOfferOwnWorldComparator.method1213();
							} else if ((Client.worldProperties & 1024) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								Login.loginIndex = 1;
								GrandExchangeOfferOwnWorldComparator.method1213();
							} else {
								BufferedSink.Login_promptCredentials(false);
							}
						}
					} else {
						short var8;
						int var51;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!class17.isKeyDown()) {
									var51 = class21.loginBoxCenter - 80;
									var8 = 321;
									if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) {
										BufferedSink.Login_promptCredentials(false);
									}

									var51 = class21.loginBoxCenter + 80;
									if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) {
										Login.loginIndex = 0;
									}
									break;
								}

								if (MenuAction.field982 == 84) {
									BufferedSink.Login_promptCredentials(false);
								} else if (MenuAction.field982 == 13) {
									Login.loginIndex = 0;
								}
							}
						} else {
							int var11;
							int var19;
							short var52;
							boolean var56;
							if (Login.loginIndex == 2) {
								var52 = 201;
								var51 = var52 + 52;
								if (var4 == 1 && var50 >= var51 - 12 && var50 < var51 + 2) {
									Login.currentLoginField = 0;
								}

								var51 += 15;
								if (var4 == 1 && var50 >= var51 - 12 && var50 < var51 + 2) {
									Login.currentLoginField = 1;
								}

								var51 += 15;
								var52 = 361;
								if (class18.field155 != null) {
									var54 = class18.field155.highX / 2;
									if (var4 == 1 && var68 >= class18.field155.lowX - var54 && var68 <= var54 + class18.field155.lowX && var50 >= var52 - 15 && var50 < var52) {
										switch(Login.field997) {
										case 1:
											class44.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
											Login.loginIndex = 5;
											return;
										case 2:
											Interpreter.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var54 = class21.loginBoxCenter - 80;
								var53 = 321;
								if (var4 == 1 && var68 >= var54 - 75 && var68 <= var54 + 75 && var50 >= var53 - 20 && var50 <= var53 + 20) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										class44.setLoginResponseString("", "Please enter your username/email address.", "");
										return;
									}

									if (Login.Login_password.length() == 0) {
										class44.setLoginResponseString("", "Please enter your password.", "");
										return;
									}

									class44.setLoginResponseString("", "Connecting to server...", "");
									HealthBarUpdate.method2204(false);
									Client.updateGameState(20);
									return;
								}

								var54 = Login.loginBoxX + 180 + 80;
								if (var4 == 1 && var68 >= var54 - 75 && var68 <= var54 + 75 && var50 >= var53 - 20 && var50 <= var53 + 20) {
									Login.loginIndex = 0;
									Login.Login_username = "";
									Login.Login_password = "";
									PendingSpawn.field1204 = 0;
									class16.otp = "";
									Login.field1008 = true;
								}

								var54 = class21.loginBoxCenter + -117;
								var53 = 277;
								Login.field1006 = var68 >= var54 && var68 < var54 + TaskHandler.field1466 && var50 >= var53 && var50 < var53 + class125.field1456;
								if (var4 == 1 && Login.field1006) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && class12.clientPreferences.rememberedUsername != null) {
										class12.clientPreferences.rememberedUsername = null;
										KeyHandler.savePreferences();
									}
								}

								var54 = class21.loginBoxCenter + 24;
								var53 = 277;
								Login.field1007 = var68 >= var54 && var68 < var54 + TaskHandler.field1466 && var50 >= var53 && var50 < var53 + class125.field1456;
								if (var4 == 1 && Login.field1007) {
									class12.clientPreferences.hideUsername = !class12.clientPreferences.hideUsername;
									if (!class12.clientPreferences.hideUsername) {
										Login.Login_username = "";
										class12.clientPreferences.rememberedUsername = null;
										GrandExchangeOfferOwnWorldComparator.method1213();
									}

									KeyHandler.savePreferences();
								}

								label1335:
								while (true) {
									Transferable var26;
									int var59;
									do {
										while (true) {
											label1253:
											do {
												while (true) {
													while (class17.isKeyDown()) {
														if (MenuAction.field982 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1253;
															}

															char var57 = class25.field207;

															for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var57 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11); ++var11) {
															}

															if (MenuAction.field982 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (MenuAction.field982 == 84 || MenuAction.field982 == 80) {
																Login.currentLoginField = 1;
															}

															char var12 = class25.field207;
															boolean var60 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var12) != -1;
															if (var60 && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + class25.field207;
															}
														} else {
															Login.loginIndex = 0;
															Login.Login_username = "";
															Login.Login_password = "";
															PendingSpawn.field1204 = 0;
															class16.otp = "";
															Login.field1008 = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (MenuAction.field982 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (MenuAction.field982 == 84 || MenuAction.field982 == 80) {
												Login.currentLoginField = 0;
												if (MenuAction.field982 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														class44.setLoginResponseString("", "Please enter your username/email address.", "");
														return;
													}

													if (Login.Login_password.length() == 0) {
														class44.setLoginResponseString("", "Please enter your password.", "");
														return;
													}

													class44.setLoginResponseString("", "Connecting to server...", "");
													HealthBarUpdate.method2204(false);
													Client.updateGameState(20);
													return;
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && MenuAction.field982 == 67) {
												Clipboard var25 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var26 = var25.getContents(class303.client);
												var59 = 20 - Login.Login_password.length();
												break;
											}

											char var63 = class25.field207;
											if ((var63 < ' ' || var63 >= 127) && (var63 <= 127 || var63 >= 160) && (var63 <= 160 || var63 > 255)) {
												label1464: {
													if (var63 != 0) {
														char[] var69 = class301.cp1252AsciiExtension;

														for (int var29 = 0; var29 < var69.length; ++var29) {
															char var14 = var69[var29];
															if (var14 == var63) {
																var56 = true;
																break label1464;
															}
														}
													}

													var56 = false;
												}
											} else {
												var56 = true;
											}

											if (var56) {
												char var70 = class25.field207;
												boolean var58 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var70) != -1;
												if (var58 && Login.Login_password.length() < 20) {
													Login.Login_password = Login.Login_password + class25.field207;
												}
											}
										}
									} while(var59 <= 0);

									try {
										String var61 = (String)var26.getTransferData(DataFlavor.stringFlavor);
										int var64 = Math.min(var59, var61.length());
										int var15 = 0;

										while (true) {
											if (var15 >= var64) {
												Login.Login_password = Login.Login_password + var61.substring(0, var64);
												continue label1335;
											}

											char var65 = var61.charAt(var15);
											boolean var16;
											if ((var65 < ' ' || var65 >= 127) && (var65 <= 127 || var65 >= 160) && (var65 <= 160 || var65 > 255)) {
												label1467: {
													if (var65 != 0) {
														char[] var66 = class301.cp1252AsciiExtension;

														for (var19 = 0; var19 < var66.length; ++var19) {
															char var20 = var66[var19];
															if (var20 == var65) {
																var16 = true;
																break label1467;
															}
														}
													}

													var16 = false;
												}
											} else {
												var16 = true;
											}

											if (!var16) {
												break;
											}

											char var67 = var61.charAt(var15);
											boolean var27 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var67) != -1;
											if (!var27) {
												break;
											}

											++var15;
										}

										Login.loginIndex = 3;
										return;
									} catch (UnsupportedFlavorException var47) {
									} catch (IOException var48) {
									}
								}
							} else if (Login.loginIndex == 3) {
								var51 = Login.loginBoxX + 180;
								var8 = 276;
								if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) {
									BufferedSink.Login_promptCredentials(false);
								}

								var51 = Login.loginBoxX + 180;
								var8 = 326;
								if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) {
									class44.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
									Login.loginIndex = 5;
									return;
								}
							} else {
								int var10;
								if (Login.loginIndex == 4) {
									var51 = Login.loginBoxX + 180 - 80;
									var8 = 321;
									if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) {
										class16.otp.trim();
										if (class16.otp.length() != 6) {
											class44.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
											return;
										}

										PendingSpawn.field1204 = Integer.parseInt(class16.otp);
										class16.otp = "";
										HealthBarUpdate.method2204(true);
										class44.setLoginResponseString("", "Connecting to server...", "");
										Client.updateGameState(20);
										return;
									}

									if (var4 == 1 && var68 >= Login.loginBoxX + 180 - 9 && var68 <= Login.loginBoxX + 180 + 130 && var50 >= 263 && var50 <= 296) {
										Login.field1008 = !Login.field1008;
									}

									if (var4 == 1 && var68 >= Login.loginBoxX + 180 - 34 && var68 <= Login.loginBoxX + 34 + 180 && var50 >= 351 && var50 <= 363) {
										Interpreter.openURL(class4.method57("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
									}

									var51 = Login.loginBoxX + 180 + 80;
									if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) {
										Login.loginIndex = 0;
										Login.Login_username = "";
										Login.Login_password = "";
										PendingSpawn.field1204 = 0;
										class16.otp = "";
									}

									while (class17.isKeyDown()) {
										boolean var9 = false;

										for (var10 = 0; var10 < "1234567890".length(); ++var10) {
											if (class25.field207 == "1234567890".charAt(var10)) {
												var9 = true;
												break;
											}
										}

										if (MenuAction.field982 == 13) {
											Login.loginIndex = 0;
											Login.Login_username = "";
											Login.Login_password = "";
											PendingSpawn.field1204 = 0;
											class16.otp = "";
										} else {
											if (MenuAction.field982 == 85 && class16.otp.length() > 0) {
												class16.otp = class16.otp.substring(0, class16.otp.length() - 1);
											}

											if (MenuAction.field982 == 84) {
												class16.otp.trim();
												if (class16.otp.length() != 6) {
													class44.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
													return;
												}

												PendingSpawn.field1204 = Integer.parseInt(class16.otp);
												class16.otp = "";
												HealthBarUpdate.method2204(true);
												class44.setLoginResponseString("", "Connecting to server...", "");
												Client.updateGameState(20);
												return;
											}

											if (var9 && class16.otp.length() < 6) {
												class16.otp = class16.otp + class25.field207;
											}
										}
									}
								} else if (Login.loginIndex == 5) {
									var51 = Login.loginBoxX + 180 - 80;
									var8 = 321;
									if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) {
										Login.Login_username = Login.Login_username.trim();
										if (Login.Login_username.length() == 0) {
											class44.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
										} else {
											long var33;
											try {
												URL var28 = new URL(class4.method57("services", false) + "m=accountappeal/login.ws");
												URLConnection var13 = var28.openConnection();
												var13.setRequestProperty("connection", "close");
												var13.setDoInput(true);
												var13.setDoOutput(true);
												var13.setConnectTimeout(5000);
												OutputStreamWriter var71 = new OutputStreamWriter(var13.getOutputStream());
												var71.write("data1=req");
												var71.flush();
												InputStream var72 = var13.getInputStream();
												Buffer var73 = new Buffer(new byte[1000]);

												while (true) {
													int var17 = var72.read(var73.array, var73.offset, 1000 - var73.offset);
													if (var17 == -1) {
														var73.offset = 0;
														long var35 = var73.readLong();
														var33 = var35;
														break;
													}

													var73.offset += var17;
													if (var73.offset >= 1000) {
														var33 = 0L;
														break;
													}
												}
											} catch (Exception var45) {
												var33 = 0L;
											}

											int var55;
											if (var33 == 0L) {
												var55 = 5;
											} else {
												var55 = PendingSpawn.method2180(var33, Login.Login_username);
											}

											switch(var55) {
											case 2:
												class44.setLoginResponseString(Strings.field3439, Strings.field3503, Strings.field3512);
												Login.loginIndex = 6;
												break;
											case 3:
												class44.setLoginResponseString("", "Error connecting to server.", "");
												break;
											case 4:
												class44.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
												break;
											case 5:
												class44.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
												break;
											case 6:
												class44.setLoginResponseString("", "Error connecting to server.", "");
												break;
											case 7:
												class44.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
											}
										}

										return;
									}

									var51 = Login.loginBoxX + 180 + 80;
									if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) {
										BufferedSink.Login_promptCredentials(true);
									}

									var53 = 361;
									if (WorldMapElement.field1572 != null) {
										var10 = WorldMapElement.field1572.highX / 2;
										if (var4 == 1 && var68 >= WorldMapElement.field1572.lowX - var10 && var68 <= var10 + WorldMapElement.field1572.lowX && var50 >= var53 - 15 && var50 < var53) {
											Interpreter.openURL(class4.method57("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
										}
									}

									while (class17.isKeyDown()) {
										var56 = false;

										for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var11) {
											if (class25.field207 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11)) {
												var56 = true;
												break;
											}
										}

										if (MenuAction.field982 == 13) {
											BufferedSink.Login_promptCredentials(true);
										} else {
											if (MenuAction.field982 == 85 && Login.Login_username.length() > 0) {
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (MenuAction.field982 == 84) {
												Login.Login_username = Login.Login_username.trim();
												if (Login.Login_username.length() == 0) {
													class44.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
												} else {
													long var37;
													try {
														URL var30 = new URL(class4.method57("services", false) + "m=accountappeal/login.ws");
														URLConnection var31 = var30.openConnection();
														var31.setRequestProperty("connection", "close");
														var31.setDoInput(true);
														var31.setDoOutput(true);
														var31.setConnectTimeout(5000);
														OutputStreamWriter var32 = new OutputStreamWriter(var31.getOutputStream());
														var32.write("data1=req");
														var32.flush();
														InputStream var39 = var31.getInputStream();
														Buffer var18 = new Buffer(new byte[1000]);

														while (true) {
															var19 = var39.read(var18.array, var18.offset, 1000 - var18.offset);
															if (var19 == -1) {
																var18.offset = 0;
																long var40 = var18.readLong();
																var37 = var40;
																break;
															}

															var18.offset += var19;
															if (var18.offset >= 1000) {
																var37 = 0L;
																break;
															}
														}
													} catch (Exception var46) {
														var37 = 0L;
													}

													if (var37 == 0L) {
														var11 = 5;
													} else {
														var11 = PendingSpawn.method2180(var37, Login.Login_username);
													}

													switch(var11) {
													case 2:
														class44.setLoginResponseString(Strings.field3439, Strings.field3503, Strings.field3512);
														Login.loginIndex = 6;
														break;
													case 3:
														class44.setLoginResponseString("", "Error connecting to server.", "");
														break;
													case 4:
														class44.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
														break;
													case 5:
														class44.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
														break;
													case 6:
														class44.setLoginResponseString("", "Error connecting to server.", "");
														break;
													case 7:
														class44.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
													}
												}

												return;
											}

											if (var56 && Login.Login_username.length() < 320) {
												Login.Login_username = Login.Login_username + class25.field207;
											}
										}
									}
								} else if (Login.loginIndex != 6) {
									if (Login.loginIndex == 7) {
										var51 = Login.loginBoxX + 180 - 80;
										var8 = 321;
										if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) {
											Interpreter.openURL(class4.method57("secure", true) + "m=dob/set_dob.ws", true, false);
											class44.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var51 = Login.loginBoxX + 180 + 80;
										if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) {
											BufferedSink.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 8) {
										var51 = Login.loginBoxX + 180 - 80;
										var8 = 321;
										if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) {
											Interpreter.openURL("https://www.jagex.com/terms/privacy", true, false);
											class44.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var51 = Login.loginBoxX + 180 + 80;
										if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) {
											BufferedSink.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 12) {
										String var44 = "";
										switch(Login.field996) {
										case 0:
											var44 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
											break;
										case 1:
											var44 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
											break;
										default:
											BufferedSink.Login_promptCredentials(false);
										}

										var54 = Login.loginBoxX + 180;
										var53 = 276;
										if (var4 == 1 && var68 >= var54 - 75 && var68 <= var54 + 75 && var50 >= var53 - 20 && var50 <= var53 + 20) {
											Interpreter.openURL(var44, true, false);
											class44.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var54 = Login.loginBoxX + 180;
										var53 = 326;
										if (var4 == 1 && var68 >= var54 - 75 && var68 <= var54 + 75 && var50 >= var53 - 20 && var50 <= var53 + 20) {
											BufferedSink.Login_promptCredentials(false);
										}
									} else if (Login.loginIndex == 24) {
										var51 = Login.loginBoxX + 180;
										var8 = 301;
										if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) {
											BufferedSink.Login_promptCredentials(false);
										}
									}
								} else {
									while (true) {
										do {
											if (!class17.isKeyDown()) {
												var52 = 321;
												if (var4 == 1 && var50 >= var52 - 20 && var50 <= var52 + 20) {
													BufferedSink.Login_promptCredentials(true);
												}

												return;
											}
										} while(MenuAction.field982 != 84 && MenuAction.field982 != 13);

										BufferedSink.Login_promptCredentials(true);
									}
								}
							}
						}
					}

				}
			}
		}
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-89"
	)
	static final void method3586(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field825[var4] = true;
			}
		}

	}
}
