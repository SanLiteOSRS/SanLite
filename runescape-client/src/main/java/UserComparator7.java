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
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dh")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Llg;Llg;I)I",
		garbageValue = "-465902583"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "-770449800"
	)
	static int method2431(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
			var4 = class139.getWidget(var3);
		} else {
			var4 = var2 ? FriendSystem.field905 : class4.field35;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			class16.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 3];
			class29.invalidateWidget(var4);
			class10.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				NameableContainer.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			class16.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 3];
			class29.invalidateWidget(var4);
			class10.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				NameableContainer.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				class29.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Lal;B)V",
		garbageValue = "0"
	)
	@Export("doCycleTitle")
	static void doCycleTitle(GameEngine var0) {
		if (Login.worldSelectOpen) {
			class223.method4238(var0);
		} else {
			int var3;
			if ((MouseHandler.MouseHandler_lastButton == 1 || !MouseHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				Login.clientPreferences.titleMusicDisabled = !Login.clientPreferences.titleMusicDisabled;
				Message.savePreferences();
				if (!Login.clientPreferences.titleMusicDisabled) {
					Archive var1 = class8.archive6;
					int var2 = var1.getGroupId("scape main");
					var3 = var1.getFileId(var2, "");
					PacketBufferNode.method3898(var1, var2, var3, 255, false);
				} else {
					class210.midiPcmStream.clear();
					class210.musicPlayerStatus = 1;
					class210.musicTrackArchive = null;
				}
			}

			if (Client.gameState != 5) {
				if (-1L == Login.field991) {
					Login.field991 = ObjectSound.currentTimeMillis() + 1000L;
				}

				long var15 = ObjectSound.currentTimeMillis();
				if (class3.method63() && -1L == Login.field1016) {
					Login.field1016 = var15;
					if (Login.field1016 > Login.field991) {
						Login.field991 = Login.field1016;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					if (class35.clientLanguage == Language.Language_EN) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !MouseHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var3 = Login.xPadding + 5;
							short var4 = 463;
							byte var5 = 100;
							byte var6 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + var5 && MouseHandler.MouseHandler_lastPressedY >= var4 && MouseHandler.MouseHandler_lastPressedY <= var4 + var6) {
								class18.method283();
								return;
							}
						}

						if (World.World_request != null) {
							class18.method283();
						}
					}

					var3 = MouseHandler.MouseHandler_lastButton;
					int var22 = MouseHandler.MouseHandler_lastPressedX;
					int var23 = MouseHandler.MouseHandler_lastPressedY;
					if (var3 == 0) {
						var22 = MouseHandler.MouseHandler_x;
						var23 = MouseHandler.MouseHandler_y;
					}

					if (!MouseHandler.mouseCam && var3 == 4) {
						var3 = 1;
					}

					short var26;
					int var27;
					if (Login.loginIndex == 0) {
						boolean var30 = false;

						while (class231.isKeyDown()) {
							if (class19.field146 == 84) {
								var30 = true;
							}
						}

						var27 = GraphicsObject.loginBoxCenter - 80;
						var26 = 291;
						if (var3 == 1 && var22 >= var27 - 75 && var22 <= var27 + 75 && var23 >= var26 - 20 && var23 <= var26 + 20) {
							class302.openURL(FontName.method6285("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var27 = GraphicsObject.loginBoxCenter + 80;
						if (var3 == 1 && var22 >= var27 - 75 && var22 <= var27 + 75 && var23 >= var26 - 20 && var23 <= var26 + 20 || var30) {
							if ((Client.worldProperties & 33554432) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								Login.loginIndex = 1;
								Canvas.method481();
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
								Canvas.method481();
							} else if ((Client.worldProperties & 1024) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								Login.loginIndex = 1;
								Canvas.method481();
							} else {
								class25.Login_promptCredentials(false);
							}
						}
					} else {
						short var7;
						int var24;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!class231.isKeyDown()) {
									var24 = GraphicsObject.loginBoxCenter - 80;
									var7 = 321;
									if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) {
										class25.Login_promptCredentials(false);
									}

									var24 = GraphicsObject.loginBoxCenter + 80;
									if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) {
										Login.loginIndex = 0;
									}
									break;
								}

								if (class19.field146 == 84) {
									class25.Login_promptCredentials(false);
								} else if (class19.field146 == 13) {
									Login.loginIndex = 0;
								}
							}
						} else {
							int var10;
							short var25;
							if (Login.loginIndex == 2) {
								var25 = 201;
								var24 = var25 + 52;
								if (var3 == 1 && var23 >= var24 - 12 && var23 < var24 + 2) {
									Login.currentLoginField = 0;
								}

								var24 += 15;
								if (var3 == 1 && var23 >= var24 - 12 && var23 < var24 + 2) {
									Login.currentLoginField = 1;
								}

								var24 += 15;
								var25 = 361;
								if (ChatChannel.field1084 != null) {
									var27 = ChatChannel.field1084.highX / 2;
									if (var3 == 1 && var22 >= ChatChannel.field1084.lowX - var27 && var22 <= var27 + ChatChannel.field1084.lowX && var23 >= var25 - 15 && var23 < var25) {
										switch(Login.field994) {
										case 1:
											class9.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
											Login.loginIndex = 5;
											return;
										case 2:
											class302.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var27 = GraphicsObject.loginBoxCenter - 80;
								var26 = 321;
								if (var3 == 1 && var22 >= var27 - 75 && var22 <= var27 + 75 && var23 >= var26 - 20 && var23 <= var26 + 20) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										class9.setLoginResponseString("", "Please enter your username/email address.", "");
										return;
									}

									if (Login.Login_password.length() == 0) {
										class9.setLoginResponseString("", "Please enter your password.", "");
										return;
									}

									class9.setLoginResponseString("", "Connecting to server...", "");
									TriBool.method5818(false);
									class20.updateGameState(20);
									return;
								}

								var27 = Login.loginBoxX + 180 + 80;
								if (var3 == 1 && var22 >= var27 - 75 && var22 <= var27 + 75 && var23 >= var26 - 20 && var23 <= var26 + 20) {
									Login.loginIndex = 0;
									Login.Login_username = "";
									Login.Login_password = "";
									class139.field1560 = 0;
									Bounds.otp = "";
									Login.field1005 = true;
								}

								var27 = GraphicsObject.loginBoxCenter + -117;
								var26 = 277;
								Login.field1003 = var22 >= var27 && var22 < var27 + class225.field2777 && var23 >= var26 && var23 < var26 + class34.field232;
								if (var3 == 1 && Login.field1003) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && Login.clientPreferences.rememberedUsername != null) {
										Login.clientPreferences.rememberedUsername = null;
										Message.savePreferences();
									}
								}

								var27 = GraphicsObject.loginBoxCenter + 24;
								var26 = 277;
								Login.field1012 = var22 >= var27 && var22 < var27 + class225.field2777 && var23 >= var26 && var23 < var26 + class34.field232;
								if (var3 == 1 && Login.field1012) {
									Login.clientPreferences.hideUsername = !Login.clientPreferences.hideUsername;
									if (!Login.clientPreferences.hideUsername) {
										Login.Login_username = "";
										Login.clientPreferences.rememberedUsername = null;
										Canvas.method481();
									}

									Message.savePreferences();
								}

								while (true) {
									int var11;
									Transferable var18;
									do {
										while (true) {
											label882:
											do {
												while (true) {
													while (class231.isKeyDown()) {
														if (class19.field146 != 13) {
															if (Login.currentLoginField != 0) {
																continue label882;
															}

															char var29 = Message.field591;

															for (var10 = 0; var10 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var29 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var10); ++var10) {
															}

															if (class19.field146 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (class19.field146 == 84 || class19.field146 == 80) {
																Login.currentLoginField = 1;
															}

															if (class4.method76(Message.field591) && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + Message.field591;
															}
														} else {
															Login.loginIndex = 0;
															Login.Login_username = "";
															Login.Login_password = "";
															class139.field1560 = 0;
															Bounds.otp = "";
															Login.field1005 = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (class19.field146 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (class19.field146 == 84 || class19.field146 == 80) {
												Login.currentLoginField = 0;
												if (class19.field146 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														class9.setLoginResponseString("", "Please enter your username/email address.", "");
														return;
													}

													if (Login.Login_password.length() == 0) {
														class9.setLoginResponseString("", "Please enter your password.", "");
														return;
													}

													class9.setLoginResponseString("", "Connecting to server...", "");
													TriBool.method5818(false);
													class20.updateGameState(20);
													return;
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && class19.field146 == 67) {
												Clipboard var17 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var18 = var17.getContents(class10.client);
												var11 = 20 - Login.Login_password.length();
												break;
											}

											if (Players.method2287(Message.field591) && class4.method76(Message.field591) && Login.Login_password.length() < 20) {
												Login.Login_password = Login.Login_password + Message.field591;
											}
										}
									} while(var11 <= 0);

									try {
										String var12 = (String)var18.getTransferData(DataFlavor.stringFlavor);
										int var13 = Math.min(var11, var12.length());

										for (int var14 = 0; var14 < var13; ++var14) {
											if (!Players.method2287(var12.charAt(var14)) || !class4.method76(var12.charAt(var14))) {
												Login.loginIndex = 3;
												return;
											}
										}

										Login.Login_password = Login.Login_password + var12.substring(0, var13);
									} catch (UnsupportedFlavorException var20) {
									} catch (IOException var21) {
									}
								}
							} else if (Login.loginIndex == 3) {
								var24 = Login.loginBoxX + 180;
								var7 = 276;
								if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) {
									class25.Login_promptCredentials(false);
								}

								var24 = Login.loginBoxX + 180;
								var7 = 326;
								if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) {
									class9.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
									Login.loginIndex = 5;
									return;
								}
							} else {
								int var9;
								if (Login.loginIndex == 4) {
									var24 = Login.loginBoxX + 180 - 80;
									var7 = 321;
									if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) {
										Bounds.otp.trim();
										if (Bounds.otp.length() != 6) {
											class9.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
											return;
										}

										class139.field1560 = Integer.parseInt(Bounds.otp);
										Bounds.otp = "";
										TriBool.method5818(true);
										class9.setLoginResponseString("", "Connecting to server...", "");
										class20.updateGameState(20);
										return;
									}

									if (var3 == 1 && var22 >= Login.loginBoxX + 180 - 9 && var22 <= Login.loginBoxX + 180 + 130 && var23 >= 263 && var23 <= 296) {
										Login.field1005 = !Login.field1005;
									}

									if (var3 == 1 && var22 >= Login.loginBoxX + 180 - 34 && var22 <= Login.loginBoxX + 34 + 180 && var23 >= 351 && var23 <= 363) {
										class302.openURL(FontName.method6285("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
									}

									var24 = Login.loginBoxX + 180 + 80;
									if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) {
										Login.loginIndex = 0;
										Login.Login_username = "";
										Login.Login_password = "";
										class139.field1560 = 0;
										Bounds.otp = "";
									}

									while (class231.isKeyDown()) {
										boolean var8 = false;

										for (var9 = 0; var9 < "1234567890".length(); ++var9) {
											if (Message.field591 == "1234567890".charAt(var9)) {
												var8 = true;
												break;
											}
										}

										if (class19.field146 == 13) {
											Login.loginIndex = 0;
											Login.Login_username = "";
											Login.Login_password = "";
											class139.field1560 = 0;
											Bounds.otp = "";
										} else {
											if (class19.field146 == 85 && Bounds.otp.length() > 0) {
												Bounds.otp = Bounds.otp.substring(0, Bounds.otp.length() - 1);
											}

											if (class19.field146 == 84) {
												Bounds.otp.trim();
												if (Bounds.otp.length() != 6) {
													class9.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
													return;
												}

												class139.field1560 = Integer.parseInt(Bounds.otp);
												Bounds.otp = "";
												TriBool.method5818(true);
												class9.setLoginResponseString("", "Connecting to server...", "");
												class20.updateGameState(20);
												return;
											}

											if (var8 && Bounds.otp.length() < 6) {
												Bounds.otp = Bounds.otp + Message.field591;
											}
										}
									}
								} else if (Login.loginIndex == 5) {
									var24 = Login.loginBoxX + 180 - 80;
									var7 = 321;
									if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) {
										class18.method282();
										return;
									}

									var24 = Login.loginBoxX + 180 + 80;
									if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) {
										class25.Login_promptCredentials(true);
									}

									var26 = 361;
									if (ModeWhere.field3378 != null) {
										var9 = ModeWhere.field3378.highX / 2;
										if (var3 == 1 && var22 >= ModeWhere.field3378.lowX - var9 && var22 <= var9 + ModeWhere.field3378.lowX && var23 >= var26 - 15 && var23 < var26) {
											class302.openURL(FontName.method6285("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
										}
									}

									while (class231.isKeyDown()) {
										boolean var28 = false;

										for (var10 = 0; var10 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var10) {
											if (Message.field591 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var10)) {
												var28 = true;
												break;
											}
										}

										if (class19.field146 == 13) {
											class25.Login_promptCredentials(true);
										} else {
											if (class19.field146 == 85 && Login.Login_username.length() > 0) {
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (class19.field146 == 84) {
												class18.method282();
												return;
											}

											if (var28 && Login.Login_username.length() < 320) {
												Login.Login_username = Login.Login_username + Message.field591;
											}
										}
									}
								} else if (Login.loginIndex != 6) {
									if (Login.loginIndex == 7) {
										var24 = Login.loginBoxX + 180 - 80;
										var7 = 321;
										if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) {
											class302.openURL(FontName.method6285("secure", true) + "m=dob/set_dob.ws", true, false);
											class9.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var24 = Login.loginBoxX + 180 + 80;
										if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) {
											class25.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 8) {
										var24 = Login.loginBoxX + 180 - 80;
										var7 = 321;
										if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) {
											class302.openURL("https://www.jagex.com/terms/privacy", true, false);
											class9.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var24 = Login.loginBoxX + 180 + 80;
										if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) {
											class25.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 12) {
										String var19 = "";
										switch(Login.field993) {
										case 0:
											var19 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
											break;
										case 1:
											var19 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
											break;
										default:
											class25.Login_promptCredentials(false);
										}

										var27 = Login.loginBoxX + 180;
										var26 = 276;
										if (var3 == 1 && var22 >= var27 - 75 && var22 <= var27 + 75 && var23 >= var26 - 20 && var23 <= var26 + 20) {
											class302.openURL(var19, true, false);
											class9.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var27 = Login.loginBoxX + 180;
										var26 = 326;
										if (var3 == 1 && var22 >= var27 - 75 && var22 <= var27 + 75 && var23 >= var26 - 20 && var23 <= var26 + 20) {
											class25.Login_promptCredentials(false);
										}
									} else if (Login.loginIndex == 24) {
										var24 = Login.loginBoxX + 180;
										var7 = 301;
										if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) {
											class25.Login_promptCredentials(false);
										}
									}
								} else {
									while (true) {
										do {
											if (!class231.isKeyDown()) {
												var25 = 321;
												if (var3 == 1 && var23 >= var25 - 20 && var23 <= var25 + 20) {
													class25.Login_promptCredentials(true);
												}

												return;
											}
										} while(class19.field146 != 84 && class19.field146 != 13);

										class25.Login_promptCredentials(true);
									}
								}
							}
						}
					}

				}
			}
		}
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		signature = "(IIII)I",
		garbageValue = "-1516268196"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7;
		int var4 = var1 >> 7;
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
			int var5 = var2;
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
				var5 = var2 + 1;
			}

			int var6 = var0 & 127;
			int var7 = var1 & 127;
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4] >> 7;
			int var9 = var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7;
			return var9 * var7 + var8 * (128 - var7) >> 7;
		} else {
			return 0;
		}
	}
}
