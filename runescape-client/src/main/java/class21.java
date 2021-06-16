import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("c")
public class class21 extends class14 {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 688651321
	)
	static int field180;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 619101743
	)
	static int field171;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -293151227
	)
	int field179;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 64877513
	)
	int field174;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 20782795
	)
	int field173;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -462967025
	)
	int field172;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class21(class2 var1) {
		this.this$0 = var1;
		this.field179 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	void vmethod363(Buffer var1) {
		this.field179 = var1.readUnsignedShort();
		this.field174 = var1.readInt();
		this.field173 = var1.readUnsignedByte();
		this.field172 = var1.readUnsignedByte();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	void vmethod354(ClanSettings var1) {
		var1.method128(this.field179, this.field174, this.field173, this.field172);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Laa;I)V",
		garbageValue = "-863685229"
	)
	@Export("doCycleTitle")
	static void doCycleTitle(GameEngine var0) {
		if (Login.worldSelectOpen) {
			WorldMapManager.method3538(var0);
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !UserComparator3.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				class4.clientPreferences.titleMusicDisabled = !class4.clientPreferences.titleMusicDisabled;
				Actor.savePreferences();
				if (!class4.clientPreferences.titleMusicDisabled) {
					Archive var1 = DynamicObject.archive6;
					int var2 = var1.getGroupId("scape main");
					int var3 = var1.getFileId(var2, "");
					class105.method2357(var1, var2, var3, 255, false);
				} else {
					Decimator.method1169();
				}
			}

			if (Client.gameState != 5) {
				if (-1L == Login.field1019) {
					Login.field1019 = ClientPacket.currentTimeMillis() + 1000L;
				}

				long var16 = ClientPacket.currentTimeMillis();
				boolean var24;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) {
							var24 = true;
							break;
						}

						ArchiveLoader var4 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
						if (!var4.isLoaded()) {
							var24 = false;
							break;
						}

						++Client.archiveLoadersDone;
					}
				} else {
					var24 = true;
				}

				if (var24 && -1L == Login.field1031) {
					Login.field1031 = var16;
					if (Login.field1031 > Login.field1019) {
						Login.field1019 = Login.field1031;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					int var18;
					if (AbstractArchive.clientLanguage == Language.Language_EN) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !UserComparator3.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var18 = Login.xPadding + 5;
							short var5 = 463;
							byte var6 = 100;
							byte var7 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var18 && MouseHandler.MouseHandler_lastPressedX <= var6 + var18 && MouseHandler.MouseHandler_lastPressedY >= var5 && MouseHandler.MouseHandler_lastPressedY <= var7 + var5) {
								if (FaceNormal.loadWorlds()) {
									Login.worldSelectOpen = true;
									Login.worldSelectPage = 0;
									Login.worldSelectPagesCount = 0;
								}

								return;
							}
						}

						if (World.World_request != null) {
							ScriptFrame.method1231();
						}
					}

					var18 = MouseHandler.MouseHandler_lastButton;
					int var25 = MouseHandler.MouseHandler_lastPressedX;
					int var26 = MouseHandler.MouseHandler_lastPressedY;
					if (var18 == 0) {
						var25 = MouseHandler.MouseHandler_x;
						var26 = MouseHandler.MouseHandler_y;
					}

					if (!UserComparator3.mouseCam && var18 == 4) {
						var18 = 1;
					}

					short var29;
					int var30;
					if (Login.loginIndex == 0) {
						boolean var35 = false;

						while (SecureRandomCallable.isKeyDown()) {
							if (SoundCache.field446 == 84) {
								var35 = true;
							}
						}

						var30 = class25.loginBoxCenter - 80;
						var29 = 291;
						if (var18 == 1 && var25 >= var30 - 75 && var25 <= var30 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20) {
							AttackOption.openURL(class19.method283("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var30 = class25.loginBoxCenter + 80;
						if (var18 == 1 && var25 >= var30 - 75 && var25 <= var30 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20 || var35) {
							if ((Client.worldProperties & 33554432) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								Login.loginIndex = 1;
								GameObject.method4433();
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
								GameObject.method4433();
							} else if ((Client.worldProperties & 1024) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								Login.loginIndex = 1;
								GameObject.method4433();
							} else {
								class69.Login_promptCredentials(false);
							}
						}
					} else {
						short var8;
						int var27;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!SecureRandomCallable.isKeyDown()) {
									var27 = class25.loginBoxCenter - 80;
									var8 = 321;
									if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
										class69.Login_promptCredentials(false);
									}

									var27 = class25.loginBoxCenter + 80;
									if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
										Login.loginIndex = 0;
									}
									break;
								}

								if (SoundCache.field446 == 84) {
									class69.Login_promptCredentials(false);
								} else if (SoundCache.field446 == 13) {
									Login.loginIndex = 0;
								}
							}
						} else {
							int var11;
							short var28;
							if (Login.loginIndex == 2) {
								var28 = 201;
								var27 = var28 + 52;
								if (var18 == 1 && var26 >= var27 - 12 && var26 < var27 + 2) {
									Login.currentLoginField = 0;
								}

								var27 += 15;
								if (var18 == 1 && var26 >= var27 - 12 && var26 < var27 + 2) {
									Login.currentLoginField = 1;
								}

								var27 += 15;
								var28 = 361;
								if (Client.field903 != null) {
									var30 = Client.field903.highX / 2;
									if (var18 == 1 && var25 >= Client.field903.lowX - var30 && var25 <= var30 + Client.field903.lowX && var26 >= var28 - 15 && var26 < var28) {
										switch(Login.field1012) {
										case 1:
											CollisionMap.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
											Login.loginIndex = 5;
											return;
										case 2:
											AttackOption.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var30 = class25.loginBoxCenter - 80;
								var29 = 321;
								if (var18 == 1 && var25 >= var30 - 75 && var25 <= var30 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										CollisionMap.setLoginResponseString("", "Please enter your username/email address.", "");
										return;
									}

									if (Login.Login_password.length() == 0) {
										CollisionMap.setLoginResponseString("", "Please enter your password.", "");
										return;
									}

									CollisionMap.setLoginResponseString("", "Connecting to server...", "");
									class19.method281(false);
									Projectile.updateGameState(20);
									return;
								}

								var30 = Login.loginBoxX + 180 + 80;
								if (var18 == 1 && var25 >= var30 - 75 && var25 <= var30 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20) {
									Login.loginIndex = 0;
									Login.Login_username = "";
									Login.Login_password = "";
									class0.field2 = 0;
									ItemLayer.otp = "";
									Login.field1022 = true;
								}

								var30 = class25.loginBoxCenter + -117;
								var29 = 277;
								Login.field1006 = var25 >= var30 && var25 < var30 + class126.field1477 && var26 >= var29 && var26 < var29 + PcmPlayer.field416;
								if (var18 == 1 && Login.field1006) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && class4.clientPreferences.rememberedUsername != null) {
										class4.clientPreferences.rememberedUsername = null;
										Actor.savePreferences();
									}
								}

								var30 = class25.loginBoxCenter + 24;
								var29 = 277;
								Login.field1021 = var25 >= var30 && var25 < var30 + class126.field1477 && var26 >= var29 && var26 < var29 + PcmPlayer.field416;
								if (var18 == 1 && Login.field1021) {
									class4.clientPreferences.hideUsername = !class4.clientPreferences.hideUsername;
									if (!class4.clientPreferences.hideUsername) {
										Login.Login_username = "";
										class4.clientPreferences.rememberedUsername = null;
										GameObject.method4433();
									}

									Actor.savePreferences();
								}

								while (true) {
									Transferable var20;
									int var33;
									do {
										while (true) {
											label903:
											do {
												while (true) {
													while (SecureRandomCallable.isKeyDown()) {
														if (SoundCache.field446 != 13) {
															if (Login.currentLoginField != 0) {
																continue label903;
															}

															char var32 = Timer.field3780;

															for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var32 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11); ++var11) {
															}

															if (SoundCache.field446 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (SoundCache.field446 == 84 || SoundCache.field446 == 80) {
																Login.currentLoginField = 1;
															}

															char var12 = Timer.field3780;
															boolean var34 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var12) != -1;
															if (var34 && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + Timer.field3780;
															}
														} else {
															Login.loginIndex = 0;
															Login.Login_username = "";
															Login.Login_password = "";
															class0.field2 = 0;
															ItemLayer.otp = "";
															Login.field1022 = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (SoundCache.field446 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (SoundCache.field446 == 84 || SoundCache.field446 == 80) {
												Login.currentLoginField = 0;
												if (SoundCache.field446 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														CollisionMap.setLoginResponseString("", "Please enter your username/email address.", "");
														return;
													}

													if (Login.Login_password.length() == 0) {
														CollisionMap.setLoginResponseString("", "Please enter your password.", "");
														return;
													}

													CollisionMap.setLoginResponseString("", "Connecting to server...", "");
													class19.method281(false);
													Projectile.updateGameState(20);
													return;
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && SoundCache.field446 == 67) {
												Clipboard var19 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var20 = var19.getContents(class1.client);
												var33 = 20 - Login.Login_password.length();
												break;
											}

											if (ItemContainer.method2181(Timer.field3780) && PacketWriter.method2496(Timer.field3780) && Login.Login_password.length() < 20) {
												Login.Login_password = Login.Login_password + Timer.field3780;
											}
										}
									} while(var33 <= 0);

									try {
										String var13 = (String)var20.getTransferData(DataFlavor.stringFlavor);
										int var14 = Math.min(var33, var13.length());

										for (int var15 = 0; var15 < var14; ++var15) {
											if (!ItemContainer.method2181(var13.charAt(var15)) || !PacketWriter.method2496(var13.charAt(var15))) {
												Login.loginIndex = 3;
												return;
											}
										}

										Login.Login_password = Login.Login_password + var13.substring(0, var14);
									} catch (UnsupportedFlavorException var22) {
									} catch (IOException var23) {
									}
								}
							} else if (Login.loginIndex == 3) {
								var27 = Login.loginBoxX + 180;
								var8 = 276;
								if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
									class69.Login_promptCredentials(false);
								}

								var27 = Login.loginBoxX + 180;
								var8 = 326;
								if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
									CollisionMap.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
									Login.loginIndex = 5;
									return;
								}
							} else {
								int var10;
								if (Login.loginIndex == 4) {
									var27 = Login.loginBoxX + 180 - 80;
									var8 = 321;
									if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
										ItemLayer.otp.trim();
										if (ItemLayer.otp.length() != 6) {
											CollisionMap.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
											return;
										}

										class0.field2 = Integer.parseInt(ItemLayer.otp);
										ItemLayer.otp = "";
										class19.method281(true);
										CollisionMap.setLoginResponseString("", "Connecting to server...", "");
										Projectile.updateGameState(20);
										return;
									}

									if (var18 == 1 && var25 >= Login.loginBoxX + 180 - 9 && var25 <= Login.loginBoxX + 180 + 130 && var26 >= 263 && var26 <= 296) {
										Login.field1022 = !Login.field1022;
									}

									if (var18 == 1 && var25 >= Login.loginBoxX + 180 - 34 && var25 <= Login.loginBoxX + 34 + 180 && var26 >= 351 && var26 <= 363) {
										AttackOption.openURL(class19.method283("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
									}

									var27 = Login.loginBoxX + 180 + 80;
									if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
										Login.loginIndex = 0;
										Login.Login_username = "";
										Login.Login_password = "";
										class0.field2 = 0;
										ItemLayer.otp = "";
									}

									while (SecureRandomCallable.isKeyDown()) {
										boolean var9 = false;

										for (var10 = 0; var10 < "1234567890".length(); ++var10) {
											if (Timer.field3780 == "1234567890".charAt(var10)) {
												var9 = true;
												break;
											}
										}

										if (SoundCache.field446 == 13) {
											Login.loginIndex = 0;
											Login.Login_username = "";
											Login.Login_password = "";
											class0.field2 = 0;
											ItemLayer.otp = "";
										} else {
											if (SoundCache.field446 == 85 && ItemLayer.otp.length() > 0) {
												ItemLayer.otp = ItemLayer.otp.substring(0, ItemLayer.otp.length() - 1);
											}

											if (SoundCache.field446 == 84) {
												ItemLayer.otp.trim();
												if (ItemLayer.otp.length() != 6) {
													CollisionMap.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
													return;
												}

												class0.field2 = Integer.parseInt(ItemLayer.otp);
												ItemLayer.otp = "";
												class19.method281(true);
												CollisionMap.setLoginResponseString("", "Connecting to server...", "");
												Projectile.updateGameState(20);
												return;
											}

											if (var9 && ItemLayer.otp.length() < 6) {
												ItemLayer.otp = ItemLayer.otp + Timer.field3780;
											}
										}
									}
								} else if (Login.loginIndex == 5) {
									var27 = Login.loginBoxX + 180 - 80;
									var8 = 321;
									if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
										class143.method2810();
										return;
									}

									var27 = Login.loginBoxX + 180 + 80;
									if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
										class69.Login_promptCredentials(true);
									}

									var29 = 361;
									if (DefaultsGroup.field3891 != null) {
										var10 = DefaultsGroup.field3891.highX / 2;
										if (var18 == 1 && var25 >= DefaultsGroup.field3891.lowX - var10 && var25 <= var10 + DefaultsGroup.field3891.lowX && var26 >= var29 - 15 && var26 < var29) {
											AttackOption.openURL(class19.method283("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
										}
									}

									while (SecureRandomCallable.isKeyDown()) {
										boolean var31 = false;

										for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var11) {
											if (Timer.field3780 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11)) {
												var31 = true;
												break;
											}
										}

										if (SoundCache.field446 == 13) {
											class69.Login_promptCredentials(true);
										} else {
											if (SoundCache.field446 == 85 && Login.Login_username.length() > 0) {
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (SoundCache.field446 == 84) {
												class143.method2810();
												return;
											}

											if (var31 && Login.Login_username.length() < 320) {
												Login.Login_username = Login.Login_username + Timer.field3780;
											}
										}
									}
								} else if (Login.loginIndex != 6) {
									if (Login.loginIndex == 7) {
										var27 = Login.loginBoxX + 180 - 80;
										var8 = 321;
										if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
											AttackOption.openURL(class19.method283("secure", true) + "m=dob/set_dob.ws", true, false);
											CollisionMap.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var27 = Login.loginBoxX + 180 + 80;
										if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
											class69.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 8) {
										var27 = Login.loginBoxX + 180 - 80;
										var8 = 321;
										if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
											AttackOption.openURL("https://www.jagex.com/terms/privacy", true, false);
											CollisionMap.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var27 = Login.loginBoxX + 180 + 80;
										if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
											class69.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 12) {
										String var21 = "";
										switch(Login.field1011) {
										case 0:
											var21 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
											break;
										case 1:
											var21 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
											break;
										default:
											class69.Login_promptCredentials(false);
										}

										var30 = Login.loginBoxX + 180;
										var29 = 276;
										if (var18 == 1 && var25 >= var30 - 75 && var25 <= var30 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20) {
											AttackOption.openURL(var21, true, false);
											CollisionMap.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var30 = Login.loginBoxX + 180;
										var29 = 326;
										if (var18 == 1 && var25 >= var30 - 75 && var25 <= var30 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20) {
											class69.Login_promptCredentials(false);
										}
									} else if (Login.loginIndex == 24) {
										var27 = Login.loginBoxX + 180;
										var8 = 301;
										if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
											class69.Login_promptCredentials(false);
										}
									}
								} else {
									while (true) {
										do {
											if (!SecureRandomCallable.isKeyDown()) {
												var28 = 321;
												if (var18 == 1 && var26 >= var28 - 20 && var26 <= var28 + 20) {
													class69.Login_promptCredentials(true);
												}

												return;
											}
										} while(SoundCache.field446 != 84 && SoundCache.field446 != 13);

										class69.Login_promptCredentials(true);
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
