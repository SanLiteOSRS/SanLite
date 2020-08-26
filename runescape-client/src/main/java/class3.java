import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
public class class3 implements Enumerated {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lt;"
	)
	static final class3 field23;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lt;"
	)
	static final class3 field13;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lt;"
	)
	static final class3 field24;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1676805267
	)
	static int field25;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lhq;"
	)
	static Widget field12;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1942324961
	)
	final int field15;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -83927061
	)
	public final int field16;
	@ObfuscatedName("o")
	public final Class field17;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lz;"
	)
	final class0 field18;

	static {
		field23 = new class3(0, 0, Integer.class, new class1());
		field13 = new class3(1, 1, Long.class, new class2());
		field24 = new class3(2, 2, String.class, new class4());
	}

	@ObfuscatedSignature(
		signature = "(IILjava/lang/Class;Lz;)V"
	)
	class3(int var1, int var2, Class var3, class0 var4) {
		this.field15 = var1;
		this.field16 = var2;
		this.field17 = var3;
		this.field18 = var4;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "385513888"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field16;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Lkf;I)Ljava/lang/Object;",
		garbageValue = "101023804"
	)
	public Object method46(Buffer var1) {
		return this.field18.vmethod61(var1);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)[Lt;",
		garbageValue = "-127122137"
	)
	public static class3[] method47() {
		return new class3[]{field23, field13, field24};
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Object;Lkf;B)V",
		garbageValue = "69"
	)
	public static void method43(Object var0, Buffer var1) {
		Class var3 = var0.getClass();
		class3[] var5 = method47();
		int var6 = 0;

		class3 var4;
		while (true) {
			if (var6 >= var5.length) {
				var4 = null;
				break;
			}

			class3 var7 = var5[var6];
			if (var3 == var7.field17) {
				var4 = var7;
				break;
			}

			++var6;
		}

		if (var4 == null) {
			throw new IllegalArgumentException();
		} else {
			class0 var2 = var4.field18;
			var2.vmethod70(var0, var1);
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(Lbw;I)V",
		garbageValue = "823083332"
	)
	@Export("doCycleTitle")
	static void doCycleTitle(GameEngine var0) {
		if (Login.worldSelectOpen) {
			GameBuild.method4217(var0);
		} else {
			int var3;
			if ((MouseHandler.MouseHandler_lastButton == 1 || !ScriptEvent.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				Tile.clientPreferences.titleMusicDisabled = !Tile.clientPreferences.titleMusicDisabled;
				WorldMapData_1.savePreferences();
				if (!Tile.clientPreferences.titleMusicDisabled) {
					Archive var1 = CollisionMap.archive6;
					int var2 = var1.getGroupId("scape main");
					var3 = var1.getFileId(var2, "");
					Script.method2322(var1, var2, var3, 255, false);
				} else {
					class206.midiPcmStream.clear();
					class206.field2437 = 1;
					class204.musicTrackArchive = null;
				}
			}

			if (Client.gameState != 5) {
				if (-1L == Login.field1232) {
					Login.field1232 = PacketWriter.currentTimeMillis() + 1000L;
				}

				long var30 = PacketWriter.currentTimeMillis();
				if (GrandExchangeOffer.method207() && -1L == Login.field1233) {
					Login.field1233 = var30;
					if (Login.field1233 > Login.field1232) {
						Login.field1232 = Login.field1233;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					if (Language.Language_EN == class58.clientLanguage) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !ScriptEvent.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var3 = Login.xPadding + 5;
							short var4 = 463;
							byte var5 = 100;
							byte var6 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + var5 && MouseHandler.MouseHandler_lastPressedY >= var4 && MouseHandler.MouseHandler_lastPressedY <= var4 + var6) {
								if (ScriptFrame.loadWorlds()) {
									Login.worldSelectOpen = true;
									Login.worldSelectPage = 0;
									Login.worldSelectPagesCount = 0;
								}

								return;
							}
						}

						if (WorldMapScaleHandler.World_request != null && ScriptFrame.loadWorlds()) {
							Login.worldSelectOpen = true;
							Login.worldSelectPage = 0;
							Login.worldSelectPagesCount = 0;
						}
					}

					var3 = MouseHandler.MouseHandler_lastButton;
					int var54 = MouseHandler.MouseHandler_lastPressedX;
					int var55 = MouseHandler.MouseHandler_lastPressedY;
					if (var3 == 0) {
						var54 = MouseHandler.MouseHandler_x;
						var55 = MouseHandler.MouseHandler_y;
					}

					if (!ScriptEvent.mouseCam && var3 == 4) {
						var3 = 1;
					}

					short var58;
					int var59;
					if (Login.loginIndex == 0) {
						boolean var65 = false;

						while (class60.isKeyDown()) {
							if (PlayerComposition.field2581 == 84) {
								var65 = true;
							}
						}

						var59 = IsaacCipher.loginBoxCenter - 80;
						var58 = 291;
						if (var3 == 1 && var54 >= var59 - 75 && var54 <= var59 + 75 && var55 >= var58 - 20 && var55 <= var58 + 20) {
							class280.openURL(HealthBarDefinition.method4563("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var59 = IsaacCipher.loginBoxCenter + 80;
						if (var3 == 1 && var54 >= var59 - 75 && var54 <= var59 + 75 && var55 >= var58 - 20 && var55 <= var58 + 20 || var65) {
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
								class41.Login_promptCredentials(false);
							}
						}
					} else {
						short var7;
						int var56;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!class60.isKeyDown()) {
									var56 = IsaacCipher.loginBoxCenter - 80;
									var7 = 321;
									if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) {
										class41.Login_promptCredentials(false);
									}

									var56 = IsaacCipher.loginBoxCenter + 80;
									if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) {
										Login.loginIndex = 0;
									}
									break;
								}

								if (PlayerComposition.field2581 == 84) {
									class41.Login_promptCredentials(false);
								} else if (PlayerComposition.field2581 == 13) {
									Login.loginIndex = 0;
								}
							}
						} else {
							int var10;
							String var12;
							short var57;
							boolean var61;
							if (Login.loginIndex == 2) {
								var57 = 201;
								var56 = var57 + 52;
								if (var3 == 1 && var55 >= var56 - 12 && var55 < var56 + 2) {
									Login.currentLoginField = 0;
								}

								var56 += 15;
								if (var3 == 1 && var55 >= var56 - 12 && var55 < var56 + 2) {
									Login.currentLoginField = 1;
								}

								var56 += 15;
								var57 = 361;
								if (GrandExchangeOfferNameComparator.field112 != null) {
									var59 = GrandExchangeOfferNameComparator.field112.highX / 2;
									if (var3 == 1 && var54 >= GrandExchangeOfferNameComparator.field112.lowX - var59 && var54 <= var59 + GrandExchangeOfferNameComparator.field112.lowX && var55 >= var57 - 15 && var55 < var57) {
										switch(Login.field1213) {
										case 1:
											UrlRequester.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
											Login.loginIndex = 5;
											return;
										case 2:
											class280.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var59 = IsaacCipher.loginBoxCenter - 80;
								var58 = 321;
								if (var3 == 1 && var54 >= var59 - 75 && var54 <= var59 + 75 && var55 >= var58 - 20 && var55 <= var58 + 20) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										UrlRequester.setLoginResponseString("", "Please enter your username/email address.", "");
										return;
									}

									if (Login.Login_password.length() == 0) {
										UrlRequester.setLoginResponseString("", "Please enter your password.", "");
										return;
									}

									UrlRequester.setLoginResponseString("", "Connecting to server...", "");
									class22.method245(false);
									CollisionMap.updateGameState(20);
									return;
								}

								var59 = Login.loginBoxX + 180 + 80;
								if (var3 == 1 && var54 >= var59 - 75 && var54 <= var59 + 75 && var55 >= var58 - 20 && var55 <= var58 + 20) {
									Login.loginIndex = 0;
									Login.Login_username = "";
									Login.Login_password = "";
									LoginScreenAnimation.field1070 = 0;
									WorldMapLabelSize.otp = "";
									Login.field1223 = true;
								}

								var59 = IsaacCipher.loginBoxCenter + -117;
								var58 = 277;
								Login.field1224 = var54 >= var59 && var54 < var59 + GrandExchangeOfferNameComparator.field114 && var55 >= var58 && var55 < var58 + ReflectionCheck.field1364;
								if (var3 == 1 && Login.field1224) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && Tile.clientPreferences.rememberedUsername != null) {
										Tile.clientPreferences.rememberedUsername = null;
										WorldMapData_1.savePreferences();
									}
								}

								var59 = IsaacCipher.loginBoxCenter + 24;
								var58 = 277;
								Login.field1201 = var54 >= var59 && var54 < var59 + GrandExchangeOfferNameComparator.field114 && var55 >= var58 && var55 < var58 + ReflectionCheck.field1364;
								if (var3 == 1 && Login.field1201) {
									Tile.clientPreferences.hideUsername = !Tile.clientPreferences.hideUsername;
									if (!Tile.clientPreferences.hideUsername) {
										Login.Login_username = "";
										Tile.clientPreferences.rememberedUsername = null;
										if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
											Login.currentLoginField = 1;
										} else {
											Login.currentLoginField = 0;
										}
									}

									WorldMapData_1.savePreferences();
								}

								label1256:
								while (true) {
									Transferable var33;
									int var68;
									do {
										while (true) {
											label1220:
											do {
												while (true) {
													while (class60.isKeyDown()) {
														if (PlayerComposition.field2581 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1220;
															}

															char var63 = PacketWriter.field1350;

															for (var10 = 0; var10 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var63 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var10); ++var10) {
															}

															if (PlayerComposition.field2581 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (PlayerComposition.field2581 == 84 || PlayerComposition.field2581 == 80) {
																Login.currentLoginField = 1;
															}

															char var67 = PacketWriter.field1350;
															boolean var64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var67) != -1;
															if (var64 && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + PacketWriter.field1350;
															}
														} else {
															Login.loginIndex = 0;
															Login.Login_username = "";
															Login.Login_password = "";
															LoginScreenAnimation.field1070 = 0;
															WorldMapLabelSize.otp = "";
															Login.field1223 = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (PlayerComposition.field2581 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (PlayerComposition.field2581 == 84 || PlayerComposition.field2581 == 80) {
												Login.currentLoginField = 0;
												if (PlayerComposition.field2581 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														UrlRequester.setLoginResponseString("", "Please enter your username/email address.", "");
														return;
													}

													if (Login.Login_password.length() == 0) {
														UrlRequester.setLoginResponseString("", "Please enter your password.", "");
														return;
													}

													UrlRequester.setLoginResponseString("", "Connecting to server...", "");
													class22.method245(false);
													CollisionMap.updateGameState(20);
													return;
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && PlayerComposition.field2581 == 67) {
												Clipboard var32 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var33 = var32.getContents(class2.client);
												var68 = 20 - Login.Login_password.length();
												break;
											}

											if (Tiles.method1187(PacketWriter.field1350)) {
												char var66 = PacketWriter.field1350;
												var61 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var66) != -1;
												if (var61 && Login.Login_password.length() < 20) {
													Login.Login_password = Login.Login_password + PacketWriter.field1350;
												}
											}
										}
									} while(var68 <= 0);

									try {
										var12 = (String)var33.getTransferData(DataFlavor.stringFlavor);
										int var69 = Math.min(var68, var12.length());
										int var14 = 0;

										while (true) {
											if (var14 >= var69) {
												Login.Login_password = Login.Login_password + var12.substring(0, var69);
												continue label1256;
											}

											if (!Tiles.method1187(var12.charAt(var14))) {
												break;
											}

											char var16 = var12.charAt(var14);
											boolean var15 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var16) != -1;
											if (!var15) {
												break;
											}

											++var14;
										}

										Login.loginIndex = 3;
										return;
									} catch (UnsupportedFlavorException var52) {
									} catch (IOException var53) {
									}
								}
							} else if (Login.loginIndex == 3) {
								var56 = Login.loginBoxX + 180;
								var7 = 276;
								if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) {
									class41.Login_promptCredentials(false);
								}

								var56 = Login.loginBoxX + 180;
								var7 = 326;
								if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) {
									UrlRequester.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
									Login.loginIndex = 5;
									return;
								}
							} else {
								int var9;
								if (Login.loginIndex == 4) {
									var56 = Login.loginBoxX + 180 - 80;
									var7 = 321;
									if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) {
										WorldMapLabelSize.otp.trim();
										if (WorldMapLabelSize.otp.length() != 6) {
											UrlRequester.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
											return;
										}

										LoginScreenAnimation.field1070 = Integer.parseInt(WorldMapLabelSize.otp);
										WorldMapLabelSize.otp = "";
										class22.method245(true);
										UrlRequester.setLoginResponseString("", "Connecting to server...", "");
										CollisionMap.updateGameState(20);
										return;
									}

									if (var3 == 1 && var54 >= Login.loginBoxX + 180 - 9 && var54 <= Login.loginBoxX + 180 + 130 && var55 >= 263 && var55 <= 296) {
										Login.field1223 = !Login.field1223;
									}

									if (var3 == 1 && var54 >= Login.loginBoxX + 180 - 34 && var54 <= Login.loginBoxX + 34 + 180 && var55 >= 351 && var55 <= 363) {
										class280.openURL(HealthBarDefinition.method4563("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
									}

									var56 = Login.loginBoxX + 180 + 80;
									if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) {
										Login.loginIndex = 0;
										Login.Login_username = "";
										Login.Login_password = "";
										LoginScreenAnimation.field1070 = 0;
										WorldMapLabelSize.otp = "";
									}

									while (class60.isKeyDown()) {
										boolean var8 = false;

										for (var9 = 0; var9 < "1234567890".length(); ++var9) {
											if (PacketWriter.field1350 == "1234567890".charAt(var9)) {
												var8 = true;
												break;
											}
										}

										if (PlayerComposition.field2581 == 13) {
											Login.loginIndex = 0;
											Login.Login_username = "";
											Login.Login_password = "";
											LoginScreenAnimation.field1070 = 0;
											WorldMapLabelSize.otp = "";
										} else {
											if (PlayerComposition.field2581 == 85 && WorldMapLabelSize.otp.length() > 0) {
												WorldMapLabelSize.otp = WorldMapLabelSize.otp.substring(0, WorldMapLabelSize.otp.length() - 1);
											}

											if (PlayerComposition.field2581 == 84) {
												WorldMapLabelSize.otp.trim();
												if (WorldMapLabelSize.otp.length() != 6) {
													UrlRequester.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
													return;
												}

												LoginScreenAnimation.field1070 = Integer.parseInt(WorldMapLabelSize.otp);
												WorldMapLabelSize.otp = "";
												class22.method245(true);
												UrlRequester.setLoginResponseString("", "Connecting to server...", "");
												CollisionMap.updateGameState(20);
												return;
											}

											if (var8 && WorldMapLabelSize.otp.length() < 6) {
												WorldMapLabelSize.otp = WorldMapLabelSize.otp + PacketWriter.field1350;
											}
										}
									}
								} else if (Login.loginIndex == 5) {
									var56 = Login.loginBoxX + 180 - 80;
									var7 = 321;
									if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) {
										Login.Login_username = Login.Login_username.trim();
										if (Login.Login_username.length() == 0) {
											UrlRequester.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
										} else {
											long var34 = class13.method134();
											byte var60;
											if (0L == var34) {
												var60 = 5;
											} else {
												var12 = Login.Login_username;
												Random var36 = new Random();
												Buffer var76 = new Buffer(128);
												Buffer var77 = new Buffer(128);
												int[] var78 = new int[]{var36.nextInt(), var36.nextInt(), (int)(var34 >> 32), (int)var34};
												var76.writeByte(10);

												int var17;
												for (var17 = 0; var17 < 4; ++var17) {
													var76.writeInt(var36.nextInt());
												}

												var76.writeInt(var78[0]);
												var76.writeInt(var78[1]);
												var76.writeLong(var34);
												var76.writeLong(0L);

												for (var17 = 0; var17 < 4; ++var17) {
													var76.writeInt(var36.nextInt());
												}

												var76.encryptRsa(class89.field1161, class89.field1164);
												var77.writeByte(10);

												for (var17 = 0; var17 < 3; ++var17) {
													var77.writeInt(var36.nextInt());
												}

												var77.writeLong(var36.nextLong());
												var77.writeLongMedium(var36.nextLong());
												WorldMapData_1.method783(var77);
												var77.writeLong(var36.nextLong());
												var77.encryptRsa(class89.field1161, class89.field1164);
												var17 = Decimator.stringCp1252NullTerminatedByteSize(var12);
												if (var17 % 8 != 0) {
													var17 += 8 - var17 % 8;
												}

												Buffer var70 = new Buffer(var17);
												var70.writeStringCp1252NullTerminated(var12);
												var70.offset = var17;
												var70.xteaEncryptAll(var78);
												Buffer var19 = new Buffer(var70.offset + var76.offset + var77.offset + 5);
												var19.writeByte(2);
												var19.writeByte(var76.offset);
												var19.writeBytes(var76.array, 0, var76.offset);
												var19.writeByte(var77.offset);
												var19.writeBytes(var77.array, 0, var77.offset);
												var19.writeShort(var70.offset);
												var19.writeBytes(var70.array, 0, var70.offset);
												String var71 = class2.method40(var19.array);

												byte var11;
												try {
													URL var72 = new URL(HealthBarDefinition.method4563("services", false) + "m=accountappeal/login.ws");
													URLConnection var73 = var72.openConnection();
													var73.setDoInput(true);
													var73.setDoOutput(true);
													var73.setConnectTimeout(5000);
													OutputStreamWriter var74 = new OutputStreamWriter(var73.getOutputStream());
													var74.write("data2=" + class298.method5386(var71) + "&dest=" + class298.method5386("passwordchoice.ws"));
													var74.flush();
													InputStream var75 = var73.getInputStream();
													var19 = new Buffer(new byte[1000]);

													while (true) {
														int var25 = var75.read(var19.array, var19.offset, 1000 - var19.offset);
														if (var25 == -1) {
															var74.close();
															var75.close();
															String var79 = new String(var19.array);
															if (var79.startsWith("OFFLINE")) {
																var11 = 4;
															} else if (var79.startsWith("WRONG")) {
																var11 = 7;
															} else if (var79.startsWith("RELOAD")) {
																var11 = 3;
															} else if (var79.startsWith("Not permitted for social network accounts.")) {
																var11 = 6;
															} else {
																var19.xteaDecryptAll(var78);

																while (var19.offset > 0 && var19.array[var19.offset - 1] == 0) {
																	--var19.offset;
																}

																var79 = new String(var19.array, 0, var19.offset);
																boolean var26;
																if (var79 == null) {
																	var26 = false;
																} else {
																	label1379: {
																		try {
																			new URL(var79);
																		} catch (MalformedURLException var48) {
																			var26 = false;
																			break label1379;
																		}

																		var26 = true;
																	}
																}

																if (var26) {
																	class280.openURL(var79, true, false);
																	var11 = 2;
																} else {
																	var11 = 5;
																}
															}
															break;
														}

														var19.offset += var25;
														if (var19.offset >= 1000) {
															var11 = 5;
															break;
														}
													}
												} catch (Throwable var49) {
													var49.printStackTrace();
													var11 = 5;
												}

												var60 = var11;
											}

											switch(var60) {
											case 2:
												UrlRequester.setLoginResponseString(Strings.field3067, Strings.field3015, Strings.field3069);
												Login.loginIndex = 6;
												break;
											case 3:
												UrlRequester.setLoginResponseString("", "Error connecting to server.", "");
												break;
											case 4:
												UrlRequester.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
												break;
											case 5:
												UrlRequester.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
												break;
											case 6:
												UrlRequester.setLoginResponseString("", "Error connecting to server.", "");
												break;
											case 7:
												UrlRequester.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
											}
										}

										return;
									}

									var56 = Login.loginBoxX + 180 + 80;
									if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) {
										class41.Login_promptCredentials(true);
									}

									var58 = 361;
									if (MusicPatchPcmStream.field2519 != null) {
										var9 = MusicPatchPcmStream.field2519.highX / 2;
										if (var3 == 1 && var54 >= MusicPatchPcmStream.field2519.lowX - var9 && var54 <= var9 + MusicPatchPcmStream.field2519.lowX && var55 >= var58 - 15 && var55 < var58) {
											class280.openURL(HealthBarDefinition.method4563("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
										}
									}

									while (class60.isKeyDown()) {
										var61 = false;

										for (var10 = 0; var10 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var10) {
											if (PacketWriter.field1350 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var10)) {
												var61 = true;
												break;
											}
										}

										if (PlayerComposition.field2581 == 13) {
											class41.Login_promptCredentials(true);
										} else {
											if (PlayerComposition.field2581 == 85 && Login.Login_username.length() > 0) {
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (PlayerComposition.field2581 == 84) {
												Login.Login_username = Login.Login_username.trim();
												if (Login.Login_username.length() == 0) {
													UrlRequester.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
												} else {
													long var41 = class13.method134();
													byte var62;
													if (var41 == 0L) {
														var62 = 5;
													} else {
														String var37 = Login.Login_username;
														Random var38 = new Random();
														Buffer var39 = new Buffer(128);
														Buffer var43 = new Buffer(128);
														int[] var18 = new int[]{var38.nextInt(), var38.nextInt(), (int)(var41 >> 32), (int)var41};
														var39.writeByte(10);

														int var44;
														for (var44 = 0; var44 < 4; ++var44) {
															var39.writeInt(var38.nextInt());
														}

														var39.writeInt(var18[0]);
														var39.writeInt(var18[1]);
														var39.writeLong(var41);
														var39.writeLong(0L);

														for (var44 = 0; var44 < 4; ++var44) {
															var39.writeInt(var38.nextInt());
														}

														var39.encryptRsa(class89.field1161, class89.field1164);
														var43.writeByte(10);

														for (var44 = 0; var44 < 3; ++var44) {
															var43.writeInt(var38.nextInt());
														}

														var43.writeLong(var38.nextLong());
														var43.writeLongMedium(var38.nextLong());
														WorldMapData_1.method783(var43);
														var43.writeLong(var38.nextLong());
														var43.encryptRsa(class89.field1161, class89.field1164);
														var44 = Decimator.stringCp1252NullTerminatedByteSize(var37);
														if (var44 % 8 != 0) {
															var44 += 8 - var44 % 8;
														}

														Buffer var20 = new Buffer(var44);
														var20.writeStringCp1252NullTerminated(var37);
														var20.offset = var44;
														var20.xteaEncryptAll(var18);
														Buffer var21 = new Buffer(var20.offset + var39.offset + var43.offset + 5);
														var21.writeByte(2);
														var21.writeByte(var39.offset);
														var21.writeBytes(var39.array, 0, var39.offset);
														var21.writeByte(var43.offset);
														var21.writeBytes(var43.array, 0, var43.offset);
														var21.writeShort(var20.offset);
														var21.writeBytes(var20.array, 0, var20.offset);
														String var22 = class2.method40(var21.array);

														byte var13;
														try {
															URL var23 = new URL(HealthBarDefinition.method4563("services", false) + "m=accountappeal/login.ws");
															URLConnection var24 = var23.openConnection();
															var24.setDoInput(true);
															var24.setDoOutput(true);
															var24.setConnectTimeout(5000);
															OutputStreamWriter var40 = new OutputStreamWriter(var24.getOutputStream());
															var40.write("data2=" + class298.method5386(var22) + "&dest=" + class298.method5386("passwordchoice.ws"));
															var40.flush();
															InputStream var45 = var24.getInputStream();
															var21 = new Buffer(new byte[1000]);

															while (true) {
																int var46 = var45.read(var21.array, var21.offset, 1000 - var21.offset);
																if (var46 == -1) {
																	var40.close();
																	var45.close();
																	String var27 = new String(var21.array);
																	if (var27.startsWith("OFFLINE")) {
																		var13 = 4;
																	} else if (var27.startsWith("WRONG")) {
																		var13 = 7;
																	} else if (var27.startsWith("RELOAD")) {
																		var13 = 3;
																	} else if (var27.startsWith("Not permitted for social network accounts.")) {
																		var13 = 6;
																	} else {
																		var21.xteaDecryptAll(var18);

																		while (var21.offset > 0 && var21.array[var21.offset - 1] == 0) {
																			--var21.offset;
																		}

																		var27 = new String(var21.array, 0, var21.offset);
																		boolean var28;
																		if (var27 == null) {
																			var28 = false;
																		} else {
																			label1381: {
																				try {
																					new URL(var27);
																				} catch (MalformedURLException var50) {
																					var28 = false;
																					break label1381;
																				}

																				var28 = true;
																			}
																		}

																		if (var28) {
																			class280.openURL(var27, true, false);
																			var13 = 2;
																		} else {
																			var13 = 5;
																		}
																	}
																	break;
																}

																var21.offset += var46;
																if (var21.offset >= 1000) {
																	var13 = 5;
																	break;
																}
															}
														} catch (Throwable var51) {
															var51.printStackTrace();
															var13 = 5;
														}

														var62 = var13;
													}

													switch(var62) {
													case 2:
														UrlRequester.setLoginResponseString(Strings.field3067, Strings.field3015, Strings.field3069);
														Login.loginIndex = 6;
														break;
													case 3:
														UrlRequester.setLoginResponseString("", "Error connecting to server.", "");
														break;
													case 4:
														UrlRequester.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
														break;
													case 5:
														UrlRequester.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
														break;
													case 6:
														UrlRequester.setLoginResponseString("", "Error connecting to server.", "");
														break;
													case 7:
														UrlRequester.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
													}
												}

												return;
											}

											if (var61 && Login.Login_username.length() < 320) {
												Login.Login_username = Login.Login_username + PacketWriter.field1350;
											}
										}
									}
								} else if (Login.loginIndex != 6) {
									if (Login.loginIndex == 7) {
										var56 = Login.loginBoxX + 180 - 80;
										var7 = 321;
										if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) {
											class280.openURL(HealthBarDefinition.method4563("secure", true) + "m=dob/set_dob.ws", true, false);
											UrlRequester.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var56 = Login.loginBoxX + 180 + 80;
										if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) {
											class41.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 8) {
										var56 = Login.loginBoxX + 180 - 80;
										var7 = 321;
										if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) {
											class280.openURL("https://www.jagex.com/terms/privacy", true, false);
											UrlRequester.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var56 = Login.loginBoxX + 180 + 80;
										if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) {
											class41.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 12) {
										String var47 = "";
										switch(Login.field1210) {
										case 0:
											var47 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
											break;
										case 1:
											var47 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
											break;
										default:
											class41.Login_promptCredentials(false);
										}

										var59 = Login.loginBoxX + 180;
										var58 = 276;
										if (var3 == 1 && var54 >= var59 - 75 && var54 <= var59 + 75 && var55 >= var58 - 20 && var55 <= var58 + 20) {
											class280.openURL(var47, true, false);
											UrlRequester.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var59 = Login.loginBoxX + 180;
										var58 = 326;
										if (var3 == 1 && var54 >= var59 - 75 && var54 <= var59 + 75 && var55 >= var58 - 20 && var55 <= var58 + 20) {
											class41.Login_promptCredentials(false);
										}
									} else if (Login.loginIndex == 24) {
										var56 = Login.loginBoxX + 180;
										var7 = 301;
										if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) {
											class41.Login_promptCredentials(false);
										}
									}
								} else {
									while (true) {
										do {
											if (!class60.isKeyDown()) {
												var57 = 321;
												if (var3 == 1 && var55 >= var57 - 20 && var55 <= var57 + 20) {
													class41.Login_promptCredentials(true);
												}

												return;
											}
										} while(PlayerComposition.field2581 != 84 && PlayerComposition.field2581 != 13);

										class41.Login_promptCredentials(true);
									}
								}
							}
						}
					}

				}
			}
		}
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1948911757"
	)
	@Export("load")
	static void load() {
		int var0;
		if (Client.titleLoadingStage == 0) {
			ScriptEvent.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

			for (var0 = 0; var0 < 4; ++var0) {
				Client.collisionMaps[var0] = new CollisionMap(104, 104);
			}

			ApproximateRouteStrategy.sceneMinimapSprite = new SpritePixels(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = 5;
			Client.titleLoadingStage = 20;
		} else if (Client.titleLoadingStage == 20) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = 10;
			Client.titleLoadingStage = 30;
		} else if (Client.titleLoadingStage == 30) {
			class182.archive0 = WorldMapLabelSize.newArchive(0, false, true, true);
			Client.archive1 = WorldMapLabelSize.newArchive(1, false, true, true);
			NetFileRequest.archive2 = WorldMapLabelSize.newArchive(2, true, false, true);
			WorldMapID.archive3 = WorldMapLabelSize.newArchive(3, false, true, true);
			GrandExchangeOfferUnitPriceComparator.archive4 = WorldMapLabelSize.newArchive(4, false, true, true);
			WorldMapLabel.archive5 = WorldMapLabelSize.newArchive(5, true, true, true);
			CollisionMap.archive6 = WorldMapLabelSize.newArchive(6, true, true, true);
			WorldMapSection1.archive7 = WorldMapLabelSize.newArchive(7, false, true, true);
			Huffman.archive8 = WorldMapLabelSize.newArchive(8, false, true, true);
			UrlRequester.archive9 = WorldMapLabelSize.newArchive(9, false, true, true);
			Occluder.archive10 = WorldMapLabelSize.newArchive(10, false, true, true);
			GrandExchangeEvent.archive11 = WorldMapLabelSize.newArchive(11, false, true, true);
			ApproximateRouteStrategy.archive12 = WorldMapLabelSize.newArchive(12, false, true, true);
			SceneTilePaint.archive13 = WorldMapLabelSize.newArchive(13, true, false, true);
			PlayerComposition.archive14 = WorldMapLabelSize.newArchive(14, false, true, true);
			PlayerComposition.archive15 = WorldMapLabelSize.newArchive(15, false, true, true);
			archive17 = WorldMapLabelSize.newArchive(17, true, true, true);
			MouseRecorder.archive18 = WorldMapLabelSize.newArchive(18, false, true, true);
			WorldMapData_1.archive19 = WorldMapLabelSize.newArchive(19, false, true, true);
			FontName.archive20 = WorldMapLabelSize.newArchive(20, false, true, true);
			Login.Login_loadingText = "Connecting to update server";
			Login.Login_loadingPercent = 20;
			Client.titleLoadingStage = 40;
		} else if (Client.titleLoadingStage == 40) {
			byte var34 = 0;
			var0 = var34 + class182.archive0.percentage() * 4 / 100;
			var0 += Client.archive1.percentage() * 4 / 100;
			var0 += NetFileRequest.archive2.percentage() * 2 / 100;
			var0 += WorldMapID.archive3.percentage() * 2 / 100;
			var0 += GrandExchangeOfferUnitPriceComparator.archive4.percentage() * 6 / 100;
			var0 += WorldMapLabel.archive5.percentage() * 4 / 100;
			var0 += CollisionMap.archive6.percentage() * 2 / 100;
			var0 += WorldMapSection1.archive7.percentage() * 56 / 100;
			var0 += Huffman.archive8.percentage() * 2 / 100;
			var0 += UrlRequester.archive9.percentage() * 2 / 100;
			var0 += Occluder.archive10.percentage() * 2 / 100;
			var0 += GrandExchangeEvent.archive11.percentage() * 2 / 100;
			var0 += ApproximateRouteStrategy.archive12.percentage() * 2 / 100;
			var0 += SceneTilePaint.archive13.percentage() * 2 / 100;
			var0 += PlayerComposition.archive14.percentage() * 2 / 100;
			var0 += PlayerComposition.archive15.percentage() * 2 / 100;
			var0 += WorldMapData_1.archive19.percentage() / 100;
			var0 += MouseRecorder.archive18.percentage() / 100;
			var0 += FontName.archive20.percentage() / 100;
			var0 += archive17.method4340() && archive17.isFullyLoaded() ? 1 : 0;
			if (var0 != 100) {
				if (var0 != 0) {
					Login.Login_loadingText = "Checking for updates - " + var0 + "%";
				}

				Login.Login_loadingPercent = 30;
			} else {
				ViewportMouse.method3082(class182.archive0, "Animations");
				ViewportMouse.method3082(Client.archive1, "Skeletons");
				ViewportMouse.method3082(GrandExchangeOfferUnitPriceComparator.archive4, "Sound FX");
				ViewportMouse.method3082(WorldMapLabel.archive5, "Maps");
				ViewportMouse.method3082(CollisionMap.archive6, "Music Tracks");
				ViewportMouse.method3082(WorldMapSection1.archive7, "Models");
				ViewportMouse.method3082(Huffman.archive8, "Sprites");
				ViewportMouse.method3082(GrandExchangeEvent.archive11, "Music Jingles");
				ViewportMouse.method3082(PlayerComposition.archive14, "Music Samples");
				ViewportMouse.method3082(PlayerComposition.archive15, "Music Patches");
				ViewportMouse.method3082(WorldMapData_1.archive19, "World Map");
				ViewportMouse.method3082(MouseRecorder.archive18, "World Map Geography");
				ViewportMouse.method3082(FontName.archive20, "World Map Ground");
				NetSocket.spriteIds = new GraphicsDefaults();
				NetSocket.spriteIds.decode(archive17);
				Login.Login_loadingText = "Loaded update list";
				Login.Login_loadingPercent = 30;
				Client.titleLoadingStage = 45;
			}
		} else if (Client.titleLoadingStage == 45) {
			class2.method37(22050, !Client.isLowDetail, 2);
			MidiPcmStream var36 = new MidiPcmStream();
			var36.method3813(9, 128);
			WorldMapManager.pcmPlayer0 = TileItem.method2205(GameEngine.taskHandler, 0, 22050);
			WorldMapManager.pcmPlayer0.setStream(var36);
			BoundaryObject.method3385(PlayerComposition.archive15, PlayerComposition.archive14, GrandExchangeOfferUnitPriceComparator.archive4, var36);
			IntHashTable.pcmPlayer1 = TileItem.method2205(GameEngine.taskHandler, 1, 2048);
			Players.pcmStreamMixer = new PcmStreamMixer();
			IntHashTable.pcmPlayer1.setStream(Players.pcmStreamMixer);
			class9.decimator = new Decimator(22050, PcmPlayer.field1447);
			Login.Login_loadingText = "Prepared sound engine";
			Login.Login_loadingPercent = 35;
			Client.titleLoadingStage = 50;
			DevicePcmPlayerProvider.WorldMapElement_fonts = new Fonts(Huffman.archive8, SceneTilePaint.archive13);
		} else if (Client.titleLoadingStage == 50) {
			var0 = FontName.method5439().length;
			Client.fontsMap = DevicePcmPlayerProvider.WorldMapElement_fonts.createMap(FontName.method5439());
			if (Client.fontsMap.size() < var0) {
				Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var0 + "%";
				Login.Login_loadingPercent = 40;
			} else {
				DynamicObject.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
				ItemComposition.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
				class4.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
				WorldMapArea.platformInfo = Client.platformInfoProvider.get();
				Login.Login_loadingText = "Loaded fonts";
				Login.Login_loadingPercent = 40;
				Client.titleLoadingStage = 60;
			}
		} else {
			Archive var1;
			Archive var2;
			int var3;
			if (Client.titleLoadingStage == 60) {
				var1 = Occluder.archive10;
				var2 = Huffman.archive8;
				var3 = 0;
				if (var1.tryLoadFileByNames("title.jpg", "")) {
					++var3;
				}

				if (var2.tryLoadFileByNames("logo", "")) {
					++var3;
				}

				if (var2.tryLoadFileByNames("logo_deadman_mode", "")) {
					++var3;
				}

				if (var2.tryLoadFileByNames("logo_seasonal_mode", "")) {
					++var3;
				}

				if (var2.tryLoadFileByNames("titlebox", "")) {
					++var3;
				}

				if (var2.tryLoadFileByNames("titlebutton", "")) {
					++var3;
				}

				if (var2.tryLoadFileByNames("runes", "")) {
					++var3;
				}

				if (var2.tryLoadFileByNames("title_mute", "")) {
					++var3;
				}

				if (var2.tryLoadFileByNames("options_radio_buttons,0", "")) {
					++var3;
				}

				if (var2.tryLoadFileByNames("options_radio_buttons,2", "")) {
					++var3;
				}

				if (var2.tryLoadFileByNames("options_radio_buttons,4", "")) {
					++var3;
				}

				if (var2.tryLoadFileByNames("options_radio_buttons,6", "")) {
					++var3;
				}

				var2.tryLoadFileByNames("sl_back", "");
				var2.tryLoadFileByNames("sl_flags", "");
				var2.tryLoadFileByNames("sl_arrows", "");
				var2.tryLoadFileByNames("sl_stars", "");
				var2.tryLoadFileByNames("sl_button", "");
				byte var33 = 12;
				if (var3 < var33) {
					Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var33 + "%";
					Login.Login_loadingPercent = 50;
				} else {
					Login.Login_loadingText = "Loaded title screen";
					Login.Login_loadingPercent = 50;
					CollisionMap.updateGameState(5);
					Client.titleLoadingStage = 70;
				}
			} else if (Client.titleLoadingStage == 70) {
				if (!NetFileRequest.archive2.isFullyLoaded()) {
					Login.Login_loadingText = "Loading config - " + NetFileRequest.archive2.loadPercent() + "%";
					Login.Login_loadingPercent = 60;
				} else {
					Archive var35 = NetFileRequest.archive2;
					class1.FloorOverlayDefinition_archive = var35;
					Varcs.method2257(NetFileRequest.archive2);
					Renderable.method3381(NetFileRequest.archive2, WorldMapSection1.archive7);
					var1 = NetFileRequest.archive2;
					var2 = WorldMapSection1.archive7;
					boolean var32 = Client.isLowDetail;
					ObjectComposition.ObjectDefinition_archive = var1;
					DirectByteArrayCopier.ObjectDefinition_modelsArchive = var2;
					ObjectComposition.ObjectDefinition_isLowDetail = var32;
					Archive var28 = NetFileRequest.archive2;
					Archive var29 = WorldMapSection1.archive7;
					NPCComposition.NpcDefinition_archive = var28;
					NPCComposition.NpcDefinition_modelArchive = var29;
					Script.method2325(NetFileRequest.archive2);
					UserComparator9.method3487(NetFileRequest.archive2, WorldMapSection1.archive7, Client.isMembersWorld, DynamicObject.fontPlain11);
					Archive var6 = NetFileRequest.archive2;
					Archive var7 = class182.archive0;
					Archive var8 = Client.archive1;
					SequenceDefinition.SequenceDefinition_archive = var6;
					SequenceDefinition.SequenceDefinition_animationsArchive = var7;
					GrandExchangeOfferAgeComparator.SequenceDefinition_skeletonsArchive = var8;
					Archive var9 = NetFileRequest.archive2;
					Archive var10 = WorldMapSection1.archive7;
					SpotAnimationDefinition.SpotAnimationDefinition_archive = var9;
					SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var10;
					Archive var11 = NetFileRequest.archive2;
					VarbitComposition.VarbitDefinition_archive = var11;
					class227.method4185(NetFileRequest.archive2);
					Archive var12 = WorldMapID.archive3;
					Archive var13 = WorldMapSection1.archive7;
					Archive var14 = Huffman.archive8;
					Archive var15 = SceneTilePaint.archive13;
					Widget.Widget_archive = var12;
					Widget.Widget_modelsArchive = var13;
					Messages.Widget_spritesArchive = var14;
					HealthBar.Widget_fontsArchive = var15;
					Widget.Widget_interfaceComponents = new Widget[Widget.Widget_archive.getGroupCount()][];
					Bounds.Widget_loadedInterfaces = new boolean[Widget.Widget_archive.getGroupCount()];
					class4.method73(NetFileRequest.archive2);
					class225.method4129(NetFileRequest.archive2);
					Archive var16 = NetFileRequest.archive2;
					VarcInt.VarcInt_archive = var16;
					Archive var17 = NetFileRequest.archive2;
					ParamDefinition.ParamDefinition_archive = var17;
					ClientPreferences.varcs = new Varcs();
					Archive var18 = NetFileRequest.archive2;
					Archive var19 = Huffman.archive8;
					Archive var20 = SceneTilePaint.archive13;
					HitSplatDefinition.HitSplatDefinition_archive = var18;
					HitSplatDefinition.field3364 = var19;
					HitSplatDefinition.HitSplatDefinition_fontsArchive = var20;
					Archive var21 = NetFileRequest.archive2;
					Archive var22 = Huffman.archive8;
					HealthBarDefinition.HealthBarDefinition_archive = var21;
					HealthBarDefinition.HitSplatDefinition_spritesArchive = var22;
					Archive var23 = NetFileRequest.archive2;
					Archive var24 = Huffman.archive8;
					WorldMapElement.WorldMapElement_archive = var24;
					if (var23.isFullyLoaded()) {
						WorldMapElement.WorldMapElement_count = var23.getGroupFileCount(35);
						WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

						for (int var25 = 0; var25 < WorldMapElement.WorldMapElement_count; ++var25) {
							byte[] var26 = var23.takeFile(35, var25);
							WorldMapElement.WorldMapElement_cached[var25] = new WorldMapElement(var25);
							if (var26 != null) {
								WorldMapElement.WorldMapElement_cached[var25].decode(new Buffer(var26));
								WorldMapElement.WorldMapElement_cached[var25].method4469();
							}
						}
					}

					Login.Login_loadingText = "Loaded config";
					Login.Login_loadingPercent = 60;
					Client.titleLoadingStage = 80;
				}
			} else if (Client.titleLoadingStage == 80) {
				var0 = 0;
				if (LoginPacket.compass == null) {
					LoginPacket.compass = AbstractUserComparator.SpriteBuffer_getSprite(Huffman.archive8, NetSocket.spriteIds.compass, 0);
				} else {
					++var0;
				}

				if (FontName.redHintArrowSprite == null) {
					FontName.redHintArrowSprite = AbstractUserComparator.SpriteBuffer_getSprite(Huffman.archive8, NetSocket.spriteIds.field3831, 0);
				} else {
					++var0;
				}

				if (ReflectionCheck.mapSceneSprites == null) {
					ReflectionCheck.mapSceneSprites = UserComparator5.method3515(Huffman.archive8, NetSocket.spriteIds.mapScenes, 0);
				} else {
					++var0;
				}

				if (class279.headIconPkSprites == null) {
					class279.headIconPkSprites = GameBuild.method4214(Huffman.archive8, NetSocket.spriteIds.headIconsPk, 0);
				} else {
					++var0;
				}

				if (Client.headIconPrayerSprites == null) {
					Client.headIconPrayerSprites = GameBuild.method4214(Huffman.archive8, NetSocket.spriteIds.field3839, 0);
				} else {
					++var0;
				}

				if (Varcs.headIconHintSprites == null) {
					Varcs.headIconHintSprites = GameBuild.method4214(Huffman.archive8, NetSocket.spriteIds.field3835, 0);
				} else {
					++var0;
				}

				if (VarbitComposition.mapMarkerSprites == null) {
					VarbitComposition.mapMarkerSprites = GameBuild.method4214(Huffman.archive8, NetSocket.spriteIds.field3838, 0);
				} else {
					++var0;
				}

				if (ArchiveLoader.crossSprites == null) {
					ArchiveLoader.crossSprites = GameBuild.method4214(Huffman.archive8, NetSocket.spriteIds.field3837, 0);
				} else {
					++var0;
				}

				if (class235.mapDotSprites == null) {
					class235.mapDotSprites = GameBuild.method4214(Huffman.archive8, NetSocket.spriteIds.field3836, 0);
				} else {
					++var0;
				}

				if (GrandExchangeEvent.scrollBarSprites == null) {
					GrandExchangeEvent.scrollBarSprites = UserComparator5.method3515(Huffman.archive8, NetSocket.spriteIds.field3834, 0);
				} else {
					++var0;
				}

				if (GrandExchangeOfferWorldComparator.modIconSprites == null) {
					GrandExchangeOfferWorldComparator.modIconSprites = UserComparator5.method3515(Huffman.archive8, NetSocket.spriteIds.field3840, 0);
				} else {
					++var0;
				}

				if (var0 < 11) {
					Login.Login_loadingText = "Loading sprites - " + var0 * 100 / 12 + "%";
					Login.Login_loadingPercent = 70;
				} else {
					AbstractFont.AbstractFont_modIconSprites = GrandExchangeOfferWorldComparator.modIconSprites;
					FontName.redHintArrowSprite.normalize();
					int var30 = (int)(Math.random() * 21.0D) - 10;
					int var31 = (int)(Math.random() * 21.0D) - 10;
					var3 = (int)(Math.random() * 21.0D) - 10;
					int var4 = (int)(Math.random() * 41.0D) - 20;
					ReflectionCheck.mapSceneSprites[0].shiftColors(var4 + var30, var31 + var4, var4 + var3);
					Login.Login_loadingText = "Loaded sprites";
					Login.Login_loadingPercent = 70;
					Client.titleLoadingStage = 90;
				}
			} else if (Client.titleLoadingStage == 90) {
				if (!UrlRequester.archive9.isFullyLoaded()) {
					Login.Login_loadingText = "Loading textures - " + "0%";
					Login.Login_loadingPercent = 90;
				} else {
					class41.textureProvider = new TextureProvider(UrlRequester.archive9, Huffman.archive8, 20, 0.8D, Client.isLowDetail ? 64 : 128);
					Rasterizer3D.Rasterizer3D_setTextureLoader(class41.textureProvider);
					Rasterizer3D.Rasterizer3D_setBrightness(0.8D);
					Client.titleLoadingStage = 100;
				}
			} else if (Client.titleLoadingStage == 100) {
				var0 = class41.textureProvider.getLoadedPercentage();
				if (var0 < 100) {
					Login.Login_loadingText = "Loading textures - " + var0 + "%";
					Login.Login_loadingPercent = 90;
				} else {
					Login.Login_loadingText = "Loaded textures";
					Login.Login_loadingPercent = 90;
					Client.titleLoadingStage = 110;
				}
			} else if (Client.titleLoadingStage == 110) {
				ByteArrayPool.mouseRecorder = new MouseRecorder();
				GameEngine.taskHandler.newThreadTask(ByteArrayPool.mouseRecorder, 10);
				Login.Login_loadingText = "Loaded input handler";
				Login.Login_loadingPercent = 92;
				Client.titleLoadingStage = 120;
			} else if (Client.titleLoadingStage == 120) {
				if (!Occluder.archive10.tryLoadFileByNames("huffman", "")) {
					Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
					Login.Login_loadingPercent = 94;
				} else {
					Huffman var27 = new Huffman(Occluder.archive10.takeFileByNames("huffman", ""));
					class219.huffman = var27;
					Login.Login_loadingText = "Loaded wordpack";
					Login.Login_loadingPercent = 94;
					Client.titleLoadingStage = 130;
				}
			} else if (Client.titleLoadingStage == 130) {
				if (!WorldMapID.archive3.isFullyLoaded()) {
					Login.Login_loadingText = "Loading interfaces - " + WorldMapID.archive3.loadPercent() * 4 / 5 + "%";
					Login.Login_loadingPercent = 96;
				} else if (!ApproximateRouteStrategy.archive12.isFullyLoaded()) {
					Login.Login_loadingText = "Loading interfaces - " + (80 + ApproximateRouteStrategy.archive12.loadPercent() / 6) + "%";
					Login.Login_loadingPercent = 96;
				} else if (!SceneTilePaint.archive13.isFullyLoaded()) {
					Login.Login_loadingText = "Loading interfaces - " + (96 + SceneTilePaint.archive13.loadPercent() / 50) + "%";
					Login.Login_loadingPercent = 96;
				} else {
					Login.Login_loadingText = "Loaded interfaces";
					Login.Login_loadingPercent = 98;
					Client.titleLoadingStage = 140;
				}
			} else if (Client.titleLoadingStage == 140) {
				Login.Login_loadingPercent = 100;
				if (!WorldMapData_1.archive19.tryLoadGroupByName(WorldMapCacheName.field322.name)) {
					Login.Login_loadingText = "Loading world map - " + WorldMapData_1.archive19.groupLoadPercentByName(WorldMapCacheName.field322.name) / 10 + "%";
				} else {
					if (Message.worldMap == null) {
						Message.worldMap = new WorldMap();
						Message.worldMap.init(WorldMapData_1.archive19, MouseRecorder.archive18, FontName.archive20, class4.fontBold12, Client.fontsMap, ReflectionCheck.mapSceneSprites);
					}

					Login.Login_loadingText = "Loaded world map";
					Client.titleLoadingStage = 150;
				}
			} else if (Client.titleLoadingStage == 150) {
				CollisionMap.updateGameState(10);
			}
		}
	}
}
