import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
public class class272 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lai;Lle;I)V",
		garbageValue = "-740150909"
	)
	static void method5197(GameEngine var0, Font var1) {
		if (Login.worldSelectOpen) {
			PcmPlayer.method757(var0);
		} else {
			int var4;
			if ((MouseHandler.MouseHandler_lastButton == 1 || !ApproximateRouteStrategy.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				class408.clientPreferences.titleMusicDisabled = !class408.clientPreferences.titleMusicDisabled;
				Login.savePreferences();
				if (!class408.clientPreferences.titleMusicDisabled) {
					Archive var2 = Messages.archive6;
					int var3 = var2.getGroupId("scape main");
					var4 = var2.getFileId(var3, "");
					class247.musicPlayerStatus = 1;
					class128.musicTrackArchive = var2;
					FillMode.musicTrackGroupId = var3;
					ArchiveDiskActionHandler.musicTrackFileId = var4;
					class247.musicTrackVolume = 255;
					SecureRandomCallable.musicTrackBoolean = false;
					class247.pcmSampleLength = 10000;
				} else {
					WorldMapCacheName.method4027();
				}
			}

			if (Client.gameState != 5) {
				if (Login.field876 == -1L) {
					Login.field876 = class111.method2516() + 1000L;
				}

				long var16 = class111.method2516();
				if (Client.method1643() && Login.field884 == -1L) {
					Login.field884 = var16;
					if (Login.field884 > Login.field876) {
						Login.field876 = Login.field884;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					if (MouseHandler.clientLanguage == Language.Language_EN) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !ApproximateRouteStrategy.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var4 = Login.xPadding + 5;
							short var5 = 463;
							byte var6 = 100;
							byte var7 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var6 + var4 && MouseHandler.MouseHandler_lastPressedY >= var5 && MouseHandler.MouseHandler_lastPressedY <= var5 + var7) {
								if (MusicPatch.loadWorlds()) {
									Login.worldSelectOpen = true;
									Login.worldSelectPage = 0;
									Login.worldSelectPagesCount = 0;
								}

								return;
							}
						}

						if (class21.World_request != null && MusicPatch.loadWorlds()) {
							Login.worldSelectOpen = true;
							Login.worldSelectPage = 0;
							Login.worldSelectPagesCount = 0;
						}
					}

					var4 = MouseHandler.MouseHandler_lastButton;
					int var25 = MouseHandler.MouseHandler_lastPressedX;
					int var26 = MouseHandler.MouseHandler_lastPressedY;
					if (var4 == 0) {
						var25 = MouseHandler.MouseHandler_x;
						var26 = MouseHandler.MouseHandler_y;
					}

					if (!ApproximateRouteStrategy.mouseCam && var4 == 4) {
						var4 = 1;
					}

					short var29;
					int var31;
					if (Login.loginIndex == 0) {
						boolean var33 = false;

						while (WorldMapElement.isKeyDown()) {
							if (class12.field55 == 84) {
								var33 = true;
							}
						}

						var31 = Login.loginBoxCenter - 80;
						var29 = 291;
						if (var4 == 1 && var25 >= var31 - 75 && var25 <= var31 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20) {
							class91.openURL(HealthBar.method2246("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var31 = Login.loginBoxCenter + 80;
						if (var4 == 1 && var25 >= var31 - 75 && var25 <= var31 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20 || var33) {
							if ((Client.worldProperties & 33554432) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								class275.method5201(1);
								ParamComposition.method3216();
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
								class275.method5201(1);
								ParamComposition.method3216();
							} else if ((Client.worldProperties & 1024) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								class275.method5201(1);
								ParamComposition.method3216();
							} else {
								class1.Login_promptCredentials(false);
							}
						}
					} else {
						short var8;
						int var27;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!WorldMapElement.isKeyDown()) {
									var27 = Login.loginBoxCenter - 80;
									var8 = 321;
									if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
										class1.Login_promptCredentials(false);
									}

									var27 = Login.loginBoxCenter + 80;
									if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
										class275.method5201(0);
									}
									break;
								}

								if (class12.field55 == 84) {
									class1.Login_promptCredentials(false);
								} else if (class12.field55 == 13) {
									class275.method5201(0);
								}
							}
						} else {
							int var11;
							short var28;
							if (Login.loginIndex == 2) {
								var28 = 201;
								var27 = var28 + 52;
								if (var4 == 1 && var26 >= var27 - 12 && var26 < var27 + 2) {
									Login.currentLoginField = 0;
								}

								var27 += 15;
								if (var4 == 1 && var26 >= var27 - 12 && var26 < var27 + 2) {
									Login.currentLoginField = 1;
								}

								var27 += 15;
								var28 = 361;
								if (class114.field1359 != null) {
									var31 = class114.field1359.highX / 2;
									if (var4 == 1 && var25 >= class114.field1359.lowX - var31 && var25 <= var31 + class114.field1359.lowX && var26 >= var28 - 15 && var26 < var28) {
										switch(Login.field865) {
										case 1:
											class1.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
											class275.method5201(5);
											return;
										case 2:
											class91.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var31 = Login.loginBoxCenter - 80;
								var29 = 321;
								if (var4 == 1 && var25 >= var31 - 75 && var25 <= var31 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										class1.setLoginResponseString("", "Please enter your username/email address.", "");
										return;
									}

									if (Login.Login_password.length() == 0) {
										class1.setLoginResponseString("", "Please enter your password.", "");
										return;
									}

									class1.setLoginResponseString("", "Connecting to server...", "");
									WorldMapSection2.method3584(false);
									WorldMapData_1.updateGameState(20);
									return;
								}

								var31 = Login.loginBoxX + 180 + 80;
								if (var4 == 1 && var25 >= var31 - 75 && var25 <= var31 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20) {
									class275.method5201(0);
									Login.Login_username = "";
									Login.Login_password = "";
									ReflectionCheck.field429 = 0;
									Tiles.otp = "";
									Login.field875 = true;
								}

								var31 = Login.loginBoxCenter + -117;
								var29 = 277;
								Login.field873 = var25 >= var31 && var25 < var31 + class327.field3908 && var26 >= var29 && var26 < var29 + UserComparator9.field1326;
								if (var4 == 1 && Login.field873) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && class408.clientPreferences.rememberedUsername != null) {
										class408.clientPreferences.rememberedUsername = null;
										Login.savePreferences();
									}
								}

								var31 = Login.loginBoxCenter + 24;
								var29 = 277;
								Login.field860 = var25 >= var31 && var25 < var31 + class327.field3908 && var26 >= var29 && var26 < var29 + UserComparator9.field1326;
								if (var4 == 1 && Login.field860) {
									class408.clientPreferences.hideUsername = !class408.clientPreferences.hideUsername;
									if (!class408.clientPreferences.hideUsername) {
										Login.Login_username = "";
										class408.clientPreferences.rememberedUsername = null;
										ParamComposition.method3216();
									}

									Login.savePreferences();
								}

								while (true) {
									int var12;
									Transferable var35;
									do {
										while (true) {
											label1030:
											do {
												while (true) {
													while (WorldMapElement.isKeyDown()) {
														if (class12.field55 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1030;
															}

															char var32 = class319.field3858;

															for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var32 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11); ++var11) {
															}

															if (class12.field55 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (class12.field55 == 84 || class12.field55 == 80) {
																Login.currentLoginField = 1;
															}

															if (DynamicObject.method2001(class319.field3858) && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + class319.field3858;
															}
														} else {
															class275.method5201(0);
															Login.Login_username = "";
															Login.Login_password = "";
															ReflectionCheck.field429 = 0;
															Tiles.otp = "";
															Login.field875 = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (class12.field55 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (class12.field55 == 84 || class12.field55 == 80) {
												Login.currentLoginField = 0;
												if (class12.field55 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														class1.setLoginResponseString("", "Please enter your username/email address.", "");
														return;
													}

													if (Login.Login_password.length() == 0) {
														class1.setLoginResponseString("", "Please enter your password.", "");
														return;
													}

													class1.setLoginResponseString("", "Connecting to server...", "");
													WorldMapSection2.method3584(false);
													WorldMapData_1.updateGameState(20);
													return;
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && class12.field55 == 67) {
												Clipboard var34 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var35 = var34.getContents(ArchiveLoader.client);
												var12 = 20 - Login.Login_password.length();
												break;
											}

											if (GrandExchangeOffer.method5473(class319.field3858) && DynamicObject.method2001(class319.field3858) && Login.Login_password.length() < 20) {
												Login.Login_password = Login.Login_password + class319.field3858;
											}
										}
									} while(var12 <= 0);

									try {
										String var13 = (String)var35.getTransferData(DataFlavor.stringFlavor);
										int var14 = Math.min(var12, var13.length());

										for (int var15 = 0; var15 < var14; ++var15) {
											if (!GrandExchangeOffer.method5473(var13.charAt(var15)) || !DynamicObject.method2001(var13.charAt(var15))) {
												class275.method5201(3);
												return;
											}
										}

										Login.Login_password = Login.Login_password + var13.substring(0, var14);
									} catch (UnsupportedFlavorException var23) {
									} catch (IOException var24) {
									}
								}
							} else if (Login.loginIndex == 3) {
								var27 = Login.loginBoxX + 180;
								var8 = 276;
								if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
									EnumComposition.method3097(false);
								}

								var27 = Login.loginBoxX + 180;
								var8 = 326;
								if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
									class1.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
									class275.method5201(5);
									return;
								}
							} else {
								int var10;
								if (Login.loginIndex == 4) {
									var27 = Login.loginBoxX + 180 - 80;
									var8 = 321;
									if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
										Tiles.otp.trim();
										if (Tiles.otp.length() != 6) {
											class1.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
											return;
										}

										ReflectionCheck.field429 = Integer.parseInt(Tiles.otp);
										Tiles.otp = "";
										WorldMapSection2.method3584(true);
										class1.setLoginResponseString("", "Connecting to server...", "");
										WorldMapData_1.updateGameState(20);
										return;
									}

									if (var4 == 1 && var25 >= Login.loginBoxX + 180 - 9 && var25 <= Login.loginBoxX + 180 + 130 && var26 >= 263 && var26 <= 296) {
										Login.field875 = !Login.field875;
									}

									if (var4 == 1 && var25 >= Login.loginBoxX + 180 - 34 && var25 <= Login.loginBoxX + 34 + 180 && var26 >= 351 && var26 <= 363) {
										class91.openURL(HealthBar.method2246("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
									}

									var27 = Login.loginBoxX + 180 + 80;
									if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
										class275.method5201(0);
										Login.Login_username = "";
										Login.Login_password = "";
										ReflectionCheck.field429 = 0;
										Tiles.otp = "";
									}

									while (WorldMapElement.isKeyDown()) {
										boolean var9 = false;

										for (var10 = 0; var10 < "1234567890".length(); ++var10) {
											if (class319.field3858 == "1234567890".charAt(var10)) {
												var9 = true;
												break;
											}
										}

										if (class12.field55 == 13) {
											class275.method5201(0);
											Login.Login_username = "";
											Login.Login_password = "";
											ReflectionCheck.field429 = 0;
											Tiles.otp = "";
										} else {
											if (class12.field55 == 85 && Tiles.otp.length() > 0) {
												Tiles.otp = Tiles.otp.substring(0, Tiles.otp.length() - 1);
											}

											if (class12.field55 == 84) {
												Tiles.otp.trim();
												if (Tiles.otp.length() != 6) {
													class1.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
													return;
												}

												ReflectionCheck.field429 = Integer.parseInt(Tiles.otp);
												Tiles.otp = "";
												WorldMapSection2.method3584(true);
												class1.setLoginResponseString("", "Connecting to server...", "");
												WorldMapData_1.updateGameState(20);
												return;
											}

											if (var9 && Tiles.otp.length() < 6) {
												Tiles.otp = Tiles.otp + class319.field3858;
											}
										}
									}
								} else if (Login.loginIndex == 5) {
									var27 = Login.loginBoxX + 180 - 80;
									var8 = 321;
									if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
										Occluder.method4482();
										return;
									}

									var27 = Login.loginBoxX + 180 + 80;
									if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
										class1.Login_promptCredentials(true);
									}

									var29 = 361;
									if (ItemContainer.field998 != null) {
										var10 = ItemContainer.field998.highX / 2;
										if (var4 == 1 && var25 >= ItemContainer.field998.lowX - var10 && var25 <= var10 + ItemContainer.field998.lowX && var26 >= var29 - 15 && var26 < var29) {
											class91.openURL(HealthBar.method2246("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
										}
									}

									while (WorldMapElement.isKeyDown()) {
										boolean var30 = false;

										for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var11) {
											if (class319.field3858 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11)) {
												var30 = true;
												break;
											}
										}

										if (class12.field55 == 13) {
											class1.Login_promptCredentials(true);
										} else {
											if (class12.field55 == 85 && Login.Login_username.length() > 0) {
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (class12.field55 == 84) {
												Occluder.method4482();
												return;
											}

											if (var30 && Login.Login_username.length() < 320) {
												Login.Login_username = Login.Login_username + class319.field3858;
											}
										}
									}
								} else if (Login.loginIndex != 6) {
									if (Login.loginIndex == 7) {
										var27 = Login.loginBoxX + 180 - 80;
										var8 = 321;
										if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
											class91.openURL(HealthBar.method2246("secure", true) + "m=dob/set_dob.ws", true, false);
											class1.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											class275.method5201(6);
											return;
										}

										var27 = Login.loginBoxX + 180 + 80;
										if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
											class1.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 8) {
										var27 = Login.loginBoxX + 180 - 80;
										var8 = 321;
										if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
											class91.openURL("https://www.jagex.com/terms/privacy", true, false);
											class1.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											class275.method5201(6);
											return;
										}

										var27 = Login.loginBoxX + 180 + 80;
										if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
											class1.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 9) {
										var27 = Login.loginBoxX + 180;
										var8 = 311;
										if (class12.field55 == 84 || class12.field55 == 13 || var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
											EnumComposition.method3097(false);
										}
									} else if (Login.loginIndex == 10) {
										var27 = Login.loginBoxX + 180;
										var8 = 209;
										if (class12.field55 == 84 || var4 == 1 && var25 >= var27 - 109 && var25 <= var27 + 109 && var26 >= var8 && var26 <= var8 + 68) {
											class1.setLoginResponseString("", "Connecting to server...", "");
											Client.field500 = class404.field4352;
											WorldMapSection2.method3584(false);
											WorldMapData_1.updateGameState(20);
										}
									} else if (Login.loginIndex == 12) {
										var27 = Login.loginBoxCenter;
										var8 = 233;
										Bounds var20 = var1.method5745(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var27, var8);
										Bounds var18 = var1.method5745(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var27, var8);
										Bounds var19 = var1.method5745(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var27, var8);
										var31 = var8 + 17;
										Bounds var21 = var1.method5745(0, 34, "<col=ffd200>agreement (EULA)</col>.", var27, var31);
										if (var4 == 1) {
											if (var20.method6341(var25, var26)) {
												class91.openURL("https://www.jagex.com/terms", true, false);
											} else if (var18.method6341(var25, var26)) {
												class91.openURL("https://www.jagex.com/terms/privacy", true, false);
											} else if (var19.method6341(var25, var26) || var21.method6341(var25, var26)) {
												class91.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
											}
										}

										var27 = Login.loginBoxCenter - 80;
										var8 = 311;
										if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
											class408.clientPreferences.field1182 = Client.field467;
											Login.savePreferences();
											EnumComposition.method3097(true);
										}

										var27 = Login.loginBoxCenter + 80;
										if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
											Login.loginIndex = 13;
										}
									} else if (Login.loginIndex == 13) {
										var27 = Login.loginBoxCenter;
										var8 = 321;
										if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
											EnumComposition.method3097(true);
										}
									} else if (Login.loginIndex == 14) {
										String var22 = "";
										switch(Login.field866) {
										case 0:
											var22 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
											break;
										case 1:
											var22 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
											break;
										default:
											class1.Login_promptCredentials(false);
										}

										var31 = Login.loginBoxX + 180;
										var29 = 276;
										if (var4 == 1 && var25 >= var31 - 75 && var25 <= var31 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20) {
											class91.openURL(var22, true, false);
											class1.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											class275.method5201(6);
											return;
										}

										var31 = Login.loginBoxX + 180;
										var29 = 326;
										if (var4 == 1 && var25 >= var31 - 75 && var25 <= var31 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20) {
											class1.Login_promptCredentials(false);
										}
									} else if (Login.loginIndex == 24) {
										var27 = Login.loginBoxX + 180;
										var8 = 301;
										if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
											EnumComposition.method3097(false);
										}
									}
								} else {
									while (true) {
										do {
											if (!WorldMapElement.isKeyDown()) {
												var28 = 321;
												if (var4 == 1 && var26 >= var28 - 20 && var26 <= var28 + 20) {
													class1.Login_promptCredentials(true);
												}

												return;
											}
										} while(class12.field55 != 84 && class12.field55 != 13);

										class1.Login_promptCredentials(true);
									}
								}
							}
						}
					}

				}
			}
		}
	}
}
