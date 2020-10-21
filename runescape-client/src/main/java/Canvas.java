import java.awt.Component;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("f")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Liw;IIIZB)V",
		garbageValue = "-116"
	)
	public static void method952(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class206.musicPlayerStatus = 1;
		class23.musicTrackArchive = var0;
		TileItem.musicTrackGroupId = var1;
		class206.musicTrackFileId = var2;
		class206.musicTrackVolume = var3;
		class195.musicTrackBoolean = var4;
		MusicPatch.pcmSampleLength = 10000;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Liw;Ljava/lang/String;Ljava/lang/String;I)Lle;",
		garbageValue = "1492245151"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		return Skeleton.method3215(var0, var3, var4);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Lba;I)V",
		garbageValue = "-860651108"
	)
	@Export("doCycleTitle")
	static void doCycleTitle(GameEngine var0) {
		int var2;
		int var3;
		int var24;
		if (Login.worldSelectOpen) {
			while (true) {
				if (!Clock.isKeyDown()) {
					if (MouseHandler.MouseHandler_lastButton != 1 && (MusicPatchNode.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) {
						break;
					}

					int var1 = Login.xPadding + 280;
					if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						FriendSystem.changeWorldSelectSorting(0, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						FriendSystem.changeWorldSelectSorting(0, 1);
						break;
					}

					var2 = Login.xPadding + 390;
					if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						FriendSystem.changeWorldSelectSorting(1, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						FriendSystem.changeWorldSelectSorting(1, 1);
						break;
					}

					var3 = Login.xPadding + 500;
					if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						FriendSystem.changeWorldSelectSorting(2, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						FriendSystem.changeWorldSelectSorting(2, 1);
						break;
					}

					var24 = Login.xPadding + 610;
					if (MouseHandler.MouseHandler_lastPressedX >= var24 && MouseHandler.MouseHandler_lastPressedX <= var24 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						FriendSystem.changeWorldSelectSorting(3, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var24 + 15 && MouseHandler.MouseHandler_lastPressedX <= var24 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						FriendSystem.changeWorldSelectSorting(3, 1);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
						Login.worldSelectOpen = false;
						Login.leftTitleSprite.drawAt(Login.xPadding, 0);
						Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						SecureRandomFuture.logoSprite.drawAt(Login.xPadding + 382 - SecureRandomFuture.logoSprite.subWidth / 2, 18);
						break;
					}

					if (Login.hoveredWorldIndex != -1) {
						World var5 = DefaultsGroup.World_worlds[Login.hoveredWorldIndex];
						AbstractByteArrayCopier.changeWorld(var5);
						Login.worldSelectOpen = false;
						Login.leftTitleSprite.drawAt(Login.xPadding, 0);
						Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						SecureRandomFuture.logoSprite.drawAt(Login.xPadding + 382 - SecureRandomFuture.logoSprite.subWidth / 2, 18);
					} else {
						if (Login.worldSelectPage > 0 && class323.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class323.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= HealthBar.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= HealthBar.canvasHeight / 2 + 50) {
							--Login.worldSelectPage;
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && class280.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= ItemContainer.canvasWidth - class280.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= ItemContainer.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= HealthBar.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= HealthBar.canvasHeight / 2 + 50) {
							++Login.worldSelectPage;
						}
					}
					break;
				}

				if (SecureRandomCallable.field555 == 13) {
					Login.worldSelectOpen = false;
					Login.leftTitleSprite.drawAt(Login.xPadding, 0);
					Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
					SecureRandomFuture.logoSprite.drawAt(Login.xPadding + 382 - SecureRandomFuture.logoSprite.subWidth / 2, 18);
					break;
				}

				if (SecureRandomCallable.field555 == 96) {
					if (Login.worldSelectPage > 0 && class323.worldSelectLeftSprite != null) {
						--Login.worldSelectPage;
					}
				} else if (SecureRandomCallable.field555 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class280.worldSelectRightSprite != null) {
					++Login.worldSelectPage;
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !MusicPatchNode.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				GrandExchangeOfferAgeComparator.clientPreferences.titleMusicDisabled = !GrandExchangeOfferAgeComparator.clientPreferences.titleMusicDisabled;
				Tile.savePreferences();
				if (!GrandExchangeOfferAgeComparator.clientPreferences.titleMusicDisabled) {
					Archive var15 = ApproximateRouteStrategy.archive6;
					var2 = var15.getGroupId("scape main");
					var3 = var15.getFileId(var2, "");
					method952(var15, var2, var3, 255, false);
				} else {
					class13.midiPcmStream.clear();
					class206.musicPlayerStatus = 1;
					class23.musicTrackArchive = null;
				}
			}

			if (Client.gameState != 5) {
				if (-1L == Login.field1223) {
					Login.field1223 = Nameable.currentTimeMillis() + 1000L;
				}

				long var16 = Nameable.currentTimeMillis();
				if (class52.method897() && -1L == Login.field1241) {
					Login.field1241 = var16;
					if (Login.field1241 > Login.field1223) {
						Login.field1223 = Login.field1241;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					if (FontName.clientLanguage == Language.Language_EN) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !MusicPatchNode.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var3 = Login.xPadding + 5;
							short var4 = 463;
							byte var18 = 100;
							byte var6 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var18 + var3 && MouseHandler.MouseHandler_lastPressedY >= var4 && MouseHandler.MouseHandler_lastPressedY <= var6 + var4) {
								if (WallDecoration.loadWorlds()) {
									Login.worldSelectOpen = true;
									Login.worldSelectPage = 0;
									Login.worldSelectPagesCount = 0;
								}

								return;
							}
						}

						if (class248.World_request != null && WallDecoration.loadWorlds()) {
							Login.worldSelectOpen = true;
							Login.worldSelectPage = 0;
							Login.worldSelectPagesCount = 0;
						}
					}

					var3 = MouseHandler.MouseHandler_lastButton;
					var24 = MouseHandler.MouseHandler_lastPressedX;
					int var30 = MouseHandler.MouseHandler_lastPressedY;
					if (var3 == 0) {
						var24 = MouseHandler.MouseHandler_x;
						var30 = MouseHandler.MouseHandler_y;
					}

					if (!MusicPatchNode.mouseCam && var3 == 4) {
						var3 = 1;
					}

					short var27;
					int var28;
					if (Login.loginIndex == 0) {
						boolean var29 = false;

						while (Clock.isKeyDown()) {
							if (SecureRandomCallable.field555 == 84) {
								var29 = true;
							}
						}

						var28 = AttackOption.loginBoxCenter - 80;
						var27 = 291;
						if (var3 == 1 && var24 >= var28 - 75 && var24 <= var28 + 75 && var30 >= var27 - 20 && var30 <= var27 + 20) {
							Skeleton.openURL(NPC.method2157("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var28 = AttackOption.loginBoxCenter + 80;
						if (var3 == 1 && var24 >= var28 - 75 && var24 <= var28 + 75 && var30 >= var27 - 20 && var30 <= var27 + 20 || var29) {
							if ((Client.worldProperties & 33554432) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								Login.loginIndex = 1;
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
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
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
							} else if ((Client.worldProperties & 1024) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								Login.loginIndex = 1;
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
							} else {
								HealthBar.Login_promptCredentials(false);
							}
						}
					} else {
						short var7;
						int var25;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!Clock.isKeyDown()) {
									var25 = AttackOption.loginBoxCenter - 80;
									var7 = 321;
									if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) {
										HealthBar.Login_promptCredentials(false);
									}

									var25 = AttackOption.loginBoxCenter + 80;
									if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) {
										Login.loginIndex = 0;
									}
									break;
								}

								if (SecureRandomCallable.field555 == 84) {
									HealthBar.Login_promptCredentials(false);
								} else if (SecureRandomCallable.field555 == 13) {
									Login.loginIndex = 0;
								}
							}
						} else {
							short var26;
							if (Login.loginIndex == 2) {
								var26 = 201;
								var25 = var26 + 52;
								if (var3 == 1 && var30 >= var25 - 12 && var30 < var25 + 2) {
									Login.currentLoginField = 0;
								}

								var25 += 15;
								if (var3 == 1 && var30 >= var25 - 12 && var30 < var25 + 2) {
									Login.currentLoginField = 1;
								}

								var25 += 15;
								var26 = 361;
								if (class89.field1163 != null) {
									var28 = class89.field1163.highX / 2;
									if (var3 == 1 && var24 >= class89.field1163.lowX - var28 && var24 <= var28 + class89.field1163.lowX && var30 >= var26 - 15 && var30 < var26) {
										switch(Login.field1217) {
										case 1:
											GrandExchangeOfferNameComparator.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
											Login.loginIndex = 5;
											return;
										case 2:
											Skeleton.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var28 = AttackOption.loginBoxCenter - 80;
								var27 = 321;
								if (var3 == 1 && var24 >= var28 - 75 && var24 <= var28 + 75 && var30 >= var27 - 20 && var30 <= var27 + 20) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										GrandExchangeOfferNameComparator.setLoginResponseString("", "Please enter your username/email address.", "");
										return;
									}

									if (Login.Login_password.length() == 0) {
										GrandExchangeOfferNameComparator.setLoginResponseString("", "Please enter your password.", "");
										return;
									}

									GrandExchangeOfferNameComparator.setLoginResponseString("", "Connecting to server...", "");
									Message.method1314(false);
									BuddyRankComparator.updateGameState(20);
									return;
								}

								var28 = Login.loginBoxX + 180 + 80;
								if (var3 == 1 && var24 >= var28 - 75 && var24 <= var28 + 75 && var30 >= var27 - 20 && var30 <= var27 + 20) {
									Login.loginIndex = 0;
									Login.Login_username = "";
									Login.Login_password = "";
									class169.field2035 = 0;
									EnumComposition.otp = "";
									Login.field1227 = true;
								}

								var28 = AttackOption.loginBoxCenter + -117;
								var27 = 277;
								Login.field1230 = var24 >= var28 && var24 < var28 + class225.field2576 && var30 >= var27 && var30 < var27 + class232.field2780;
								if (var3 == 1 && Login.field1230) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && GrandExchangeOfferAgeComparator.clientPreferences.rememberedUsername != null) {
										GrandExchangeOfferAgeComparator.clientPreferences.rememberedUsername = null;
										Tile.savePreferences();
									}
								}

								var28 = AttackOption.loginBoxCenter + 24;
								var27 = 277;
								Login.field1229 = var24 >= var28 && var24 < var28 + class225.field2576 && var30 >= var27 && var30 < var27 + class232.field2780;
								if (var3 == 1 && Login.field1229) {
									GrandExchangeOfferAgeComparator.clientPreferences.hideUsername = !GrandExchangeOfferAgeComparator.clientPreferences.hideUsername;
									if (!GrandExchangeOfferAgeComparator.clientPreferences.hideUsername) {
										Login.Login_username = "";
										GrandExchangeOfferAgeComparator.clientPreferences.rememberedUsername = null;
										if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
											Login.currentLoginField = 1;
										} else {
											Login.currentLoginField = 0;
										}
									}

									Tile.savePreferences();
								}

								while (true) {
									Transferable var10;
									int var11;
									do {
										while (true) {
											label1113:
											do {
												while (true) {
													while (Clock.isKeyDown()) {
														if (SecureRandomCallable.field555 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1113;
															}

															class23.method251(WorldMapManager.field335);
															if (SecureRandomCallable.field555 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (SecureRandomCallable.field555 == 84 || SecureRandomCallable.field555 == 80) {
																Login.currentLoginField = 1;
															}

															if (Skeleton.method3212(WorldMapManager.field335) && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + WorldMapManager.field335;
															}
														} else {
															Login.loginIndex = 0;
															Login.Login_username = "";
															Login.Login_password = "";
															class169.field2035 = 0;
															EnumComposition.otp = "";
															Login.field1227 = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (SecureRandomCallable.field555 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (SecureRandomCallable.field555 == 84 || SecureRandomCallable.field555 == 80) {
												Login.currentLoginField = 0;
												if (SecureRandomCallable.field555 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														GrandExchangeOfferNameComparator.setLoginResponseString("", "Please enter your username/email address.", "");
														return;
													}

													if (Login.Login_password.length() == 0) {
														GrandExchangeOfferNameComparator.setLoginResponseString("", "Please enter your password.", "");
														return;
													}

													GrandExchangeOfferNameComparator.setLoginResponseString("", "Connecting to server...", "");
													Message.method1314(false);
													BuddyRankComparator.updateGameState(20);
													return;
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && SecureRandomCallable.field555 == 67) {
												Clipboard var9 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var10 = var9.getContents(ByteArrayPool.client);
												var11 = 20 - Login.Login_password.length();
												break;
											}

											if (Tiles.method1195(WorldMapManager.field335) && Skeleton.method3212(WorldMapManager.field335) && Login.Login_password.length() < 20) {
												Login.Login_password = Login.Login_password + WorldMapManager.field335;
											}
										}
									} while(var11 <= 0);

									try {
										String var12 = (String)var10.getTransferData(DataFlavor.stringFlavor);
										int var13 = Math.min(var11, var12.length());

										for (int var14 = 0; var14 < var13; ++var14) {
											if (!Tiles.method1195(var12.charAt(var14)) || !Skeleton.method3212(var12.charAt(var14))) {
												Login.loginIndex = 3;
												return;
											}
										}

										Login.Login_password = Login.Login_password + var12.substring(0, var13);
									} catch (UnsupportedFlavorException var22) {
									} catch (IOException var23) {
									}
								}
							} else if (Login.loginIndex == 3) {
								var25 = Login.loginBoxX + 180;
								var7 = 276;
								if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) {
									HealthBar.Login_promptCredentials(false);
								}

								var25 = Login.loginBoxX + 180;
								var7 = 326;
								if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) {
									GrandExchangeOfferNameComparator.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
									Login.loginIndex = 5;
									return;
								}
							} else {
								int var19;
								if (Login.loginIndex == 4) {
									var25 = Login.loginBoxX + 180 - 80;
									var7 = 321;
									if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) {
										EnumComposition.otp.trim();
										if (EnumComposition.otp.length() != 6) {
											GrandExchangeOfferNameComparator.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
											return;
										}

										class169.field2035 = Integer.parseInt(EnumComposition.otp);
										EnumComposition.otp = "";
										Message.method1314(true);
										GrandExchangeOfferNameComparator.setLoginResponseString("", "Connecting to server...", "");
										BuddyRankComparator.updateGameState(20);
										return;
									}

									if (var3 == 1 && var24 >= Login.loginBoxX + 180 - 9 && var24 <= Login.loginBoxX + 180 + 130 && var30 >= 263 && var30 <= 296) {
										Login.field1227 = !Login.field1227;
									}

									if (var3 == 1 && var24 >= Login.loginBoxX + 180 - 34 && var24 <= Login.loginBoxX + 34 + 180 && var30 >= 351 && var30 <= 363) {
										Skeleton.openURL(NPC.method2157("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
									}

									var25 = Login.loginBoxX + 180 + 80;
									if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) {
										Login.loginIndex = 0;
										Login.Login_username = "";
										Login.Login_password = "";
										class169.field2035 = 0;
										EnumComposition.otp = "";
									}

									while (Clock.isKeyDown()) {
										boolean var8 = false;

										for (var19 = 0; var19 < "1234567890".length(); ++var19) {
											if (WorldMapManager.field335 == "1234567890".charAt(var19)) {
												var8 = true;
												break;
											}
										}

										if (SecureRandomCallable.field555 == 13) {
											Login.loginIndex = 0;
											Login.Login_username = "";
											Login.Login_password = "";
											class169.field2035 = 0;
											EnumComposition.otp = "";
										} else {
											if (SecureRandomCallable.field555 == 85 && EnumComposition.otp.length() > 0) {
												EnumComposition.otp = EnumComposition.otp.substring(0, EnumComposition.otp.length() - 1);
											}

											if (SecureRandomCallable.field555 == 84) {
												EnumComposition.otp.trim();
												if (EnumComposition.otp.length() != 6) {
													GrandExchangeOfferNameComparator.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
													return;
												}

												class169.field2035 = Integer.parseInt(EnumComposition.otp);
												EnumComposition.otp = "";
												Message.method1314(true);
												GrandExchangeOfferNameComparator.setLoginResponseString("", "Connecting to server...", "");
												BuddyRankComparator.updateGameState(20);
												return;
											}

											if (var8 && EnumComposition.otp.length() < 6) {
												EnumComposition.otp = EnumComposition.otp + WorldMapManager.field335;
											}
										}
									}
								} else if (Login.loginIndex == 5) {
									var25 = Login.loginBoxX + 180 - 80;
									var7 = 321;
									if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) {
										class2.method38();
										return;
									}

									var25 = Login.loginBoxX + 180 + 80;
									if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) {
										HealthBar.Login_promptCredentials(true);
									}

									var27 = 361;
									if (ClientPreferences.field1089 != null) {
										var19 = ClientPreferences.field1089.highX / 2;
										if (var3 == 1 && var24 >= ClientPreferences.field1089.lowX - var19 && var24 <= var19 + ClientPreferences.field1089.lowX && var30 >= var27 - 15 && var30 < var27) {
											Skeleton.openURL(NPC.method2157("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
										}
									}

									while (Clock.isKeyDown()) {
										boolean var31 = false;

										for (int var20 = 0; var20 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var20) {
											if (WorldMapManager.field335 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var20)) {
												var31 = true;
												break;
											}
										}

										if (SecureRandomCallable.field555 == 13) {
											HealthBar.Login_promptCredentials(true);
										} else {
											if (SecureRandomCallable.field555 == 85 && Login.Login_username.length() > 0) {
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (SecureRandomCallable.field555 == 84) {
												class2.method38();
												return;
											}

											if (var31 && Login.Login_username.length() < 320) {
												Login.Login_username = Login.Login_username + WorldMapManager.field335;
											}
										}
									}
								} else if (Login.loginIndex != 6) {
									if (Login.loginIndex == 7) {
										var25 = Login.loginBoxX + 180 - 80;
										var7 = 321;
										if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) {
											Skeleton.openURL(NPC.method2157("secure", true) + "m=dob/set_dob.ws", true, false);
											GrandExchangeOfferNameComparator.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var25 = Login.loginBoxX + 180 + 80;
										if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) {
											HealthBar.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 8) {
										var25 = Login.loginBoxX + 180 - 80;
										var7 = 321;
										if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) {
											Skeleton.openURL("https://www.jagex.com/terms/privacy", true, false);
											GrandExchangeOfferNameComparator.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var25 = Login.loginBoxX + 180 + 80;
										if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) {
											HealthBar.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 12) {
										String var21 = "";
										switch(Login.field1216) {
										case 0:
											var21 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
											break;
										case 1:
											var21 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
											break;
										default:
											HealthBar.Login_promptCredentials(false);
										}

										var28 = Login.loginBoxX + 180;
										var27 = 276;
										if (var3 == 1 && var24 >= var28 - 75 && var24 <= var28 + 75 && var30 >= var27 - 20 && var30 <= var27 + 20) {
											Skeleton.openURL(var21, true, false);
											GrandExchangeOfferNameComparator.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var28 = Login.loginBoxX + 180;
										var27 = 326;
										if (var3 == 1 && var24 >= var28 - 75 && var24 <= var28 + 75 && var30 >= var27 - 20 && var30 <= var27 + 20) {
											HealthBar.Login_promptCredentials(false);
										}
									} else if (Login.loginIndex == 24) {
										var25 = Login.loginBoxX + 180;
										var7 = 301;
										if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) {
											HealthBar.Login_promptCredentials(false);
										}
									}
								} else {
									while (true) {
										do {
											if (!Clock.isKeyDown()) {
												var26 = 321;
												if (var3 == 1 && var30 >= var26 - 20 && var30 <= var26 + 20) {
													HealthBar.Login_promptCredentials(true);
												}

												return;
											}
										} while(SecureRandomCallable.field555 != 84 && SecureRandomCallable.field555 != 13);

										HealthBar.Login_promptCredentials(true);
									}
								}
							}
						}
					}

				}
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "-1888033666"
	)
	static final void method949(String var0) {
		PacketBufferNode var1 = class4.getPacketBufferNode(ClientPacket.field2334, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(SpriteMask.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		signature = "(I)Lmi;",
		garbageValue = "676167972"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return KeyHandler.worldMap;
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		signature = "(IIIIII)V",
		garbageValue = "-123520476"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = ModeWhere.scene.getBoundaryObjectTag(var0, var1, var2);
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (var5 != 0L) {
			var7 = ModeWhere.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = var3;
			if (DevicePcmPlayerProvider.method941(var5)) {
				var10 = var4;
			}

			int[] var11 = InterfaceParent.sceneMinimapSprite.pixels;
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var13 = ObjectSound.Entity_unpackID(var5);
			ObjectComposition var14 = ScriptEvent.getObjectDefinition(var13);
			if (var14.mapSceneId != -1) {
				IndexedSprite var15 = AbstractWorldMapIcon.mapSceneSprites[var14.mapSceneId];
				if (var15 != null) {
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2;
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2;
					var15.drawAt(var1 * 4 + var16 + 48, (104 - var2 - var14.sizeY) * 4 + var17 + 48);
				}
			} else {
				if (var9 == 0 || var9 == 2) {
					if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 1) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 3] = var10;
						var11[var12 + 512 + 3] = var10;
						var11[var12 + 1024 + 3] = var10;
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}

				if (var9 == 3) {
					if (var8 == 0) {
						var11[var12] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) {
					if (var8 == 3) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
						var11[var12 + 512 + 3] = var10;
						var11[var12 + 1024 + 3] = var10;
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}
			}
		}

		var5 = ModeWhere.scene.getGameObjectTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = ModeWhere.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = ObjectSound.Entity_unpackID(var5);
			ObjectComposition var24 = ScriptEvent.getObjectDefinition(var10);
			int var19;
			if (var24.mapSceneId != -1) {
				IndexedSprite var18 = AbstractWorldMapIcon.mapSceneSprites[var24.mapSceneId];
				if (var18 != null) {
					var13 = (var24.sizeX * 4 - var18.subWidth) / 2;
					var19 = (var24.sizeY * 4 - var18.subHeight) / 2;
					var18.drawAt(var13 + var1 * 4 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48);
				}
			} else if (var9 == 9) {
				var12 = 15658734;
				if (DevicePcmPlayerProvider.method941(var5)) {
					var12 = 15597568;
				}

				int[] var23 = InterfaceParent.sceneMinimapSprite.pixels;
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var8 != 0 && var8 != 2) {
					var23[var19] = var12;
					var23[var19 + 1 + 512] = var12;
					var23[var19 + 1024 + 2] = var12;
					var23[var19 + 1536 + 3] = var12;
				} else {
					var23[var19 + 1536] = var12;
					var23[var19 + 1 + 1024] = var12;
					var23[var19 + 512 + 2] = var12;
					var23[var19 + 3] = var12;
				}
			}
		}

		var5 = ModeWhere.scene.getFloorDecorationTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = ObjectSound.Entity_unpackID(var5);
			ObjectComposition var20 = ScriptEvent.getObjectDefinition(var7);
			if (var20.mapSceneId != -1) {
				IndexedSprite var21 = AbstractWorldMapIcon.mapSceneSprites[var20.mapSceneId];
				if (var21 != null) {
					var10 = (var20.sizeX * 4 - var21.subWidth) / 2;
					int var22 = (var20.sizeY * 4 - var21.subHeight) / 2;
					var21.drawAt(var1 * 4 + var10 + 48, var22 + (104 - var2 - var20.sizeY) * 4 + 48);
				}
			}
		}

	}
}
