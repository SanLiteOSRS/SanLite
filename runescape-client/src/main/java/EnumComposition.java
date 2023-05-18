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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -391109139
	)
	static int field1979;
	@ObfuscatedName("aw")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("ac")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("au")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -635236715
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1067065
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("al")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("at")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("aa")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	EnumComposition() {
		this.defaultStr = "null"; // L: 15
		this.outputCount = 0; // L: 17
	} // L: 22

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsg;B)V",
		garbageValue = "1"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 40
			if (var2 == 0) { // L: 41
				return; // L: 44
			}

			this.decodeNext(var1, var2); // L: 42
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsg;II)V",
		garbageValue = "-1230554018"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 47
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) { // L: 48
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 49
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 50
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) { // L: 51
				this.outputCount = var1.readUnsignedShort(); // L: 52
				this.keys = new int[this.outputCount]; // L: 53
				this.strVals = new String[this.outputCount]; // L: 54

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 55
					this.keys[var3] = var1.readInt(); // L: 56
					this.strVals[var3] = var1.readStringCp1252NullTerminated(); // L: 57
				}
			} else if (var2 == 6) { // L: 60
				this.outputCount = var1.readUnsignedShort(); // L: 61
				this.keys = new int[this.outputCount]; // L: 62
				this.intVals = new int[this.outputCount]; // L: 63

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 64
					this.keys[var3] = var1.readInt(); // L: 65
					this.intVals[var3] = var1.readInt(); // L: 66
				}
			}
		}

	} // L: 70

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1771733315"
	)
	@Export("size")
	public int size() {
		return this.outputCount; // L: 73
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnm;B)V",
		garbageValue = "42"
	)
	public static void method3738(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0; // L: 24
	} // L: 25

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lro;ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "2050135786"
	)
	static String method3750(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) { // L: 34
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1); // L: 35
			return var3 == null ? var2 : (String)var3.obj; // L: 36 37
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lbm;Lon;Lon;I)V",
		garbageValue = "1210826213"
	)
	static void method3752(GameEngine var0, Font var1, Font var2) {
		if (Login.worldSelectOpen) { // L: 303
			class33.method510(var0); // L: 304
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class473.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 307
				class20.clientPreferences.method2531(!class20.clientPreferences.method2534()); // L: 308
				if (!class20.clientPreferences.method2534()) { // L: 309
					class478.method8904(class399.archive6, "scape main", "", 255, false);
				} else {
					FloorUnderlayDefinition.method3865(); // L: 310
				}
			}

			if (Client.gameState != 5) { // L: 312
				if (-1L == Login.field894) { // L: 313
					Login.field894 = class96.method2634() + 1000L; // L: 314
				}

				long var3 = class96.method2634(); // L: 316
				boolean var5;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 319
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) { // L: 323
							var5 = true; // L: 331
							break;
						}

						ArchiveLoader var6 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 324
						if (!var6.isLoaded()) { // L: 325
							var5 = false; // L: 326
							break; // L: 327
						}

						++Client.archiveLoadersDone; // L: 329
					}
				} else {
					var5 = true; // L: 320
				}

				if (var5 && -1L == Login.field923) { // L: 333 334
					Login.field923 = var3; // L: 335
					if (Login.field923 > Login.field894) { // L: 336
						Login.field894 = Login.field923; // L: 337
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 341
					int var33;
					if (ClanSettings.clientLanguage == Language.Language_EN) { // L: 342
						if (MouseHandler.MouseHandler_lastButton == 1 || !class473.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 343
							var33 = Login.xPadding + 5; // L: 344
							short var7 = 463; // L: 345
							byte var8 = 100; // L: 346
							byte var9 = 35; // L: 347
							if (MouseHandler.MouseHandler_lastPressedX >= var33 && MouseHandler.MouseHandler_lastPressedX <= var33 + var8 && MouseHandler.MouseHandler_lastPressedY >= var7 && MouseHandler.MouseHandler_lastPressedY <= var7 + var9) { // L: 348
								Login.method2102(); // L: 349
								return; // L: 350
							}
						}

						if (class11.World_request != null) { // L: 353
							Login.method2102();
						}
					}

					var33 = MouseHandler.MouseHandler_lastButton; // L: 355
					int var60 = MouseHandler.MouseHandler_lastPressedX; // L: 356
					int var61 = MouseHandler.MouseHandler_lastPressedY; // L: 357
					if (var33 == 0) { // L: 358
						var60 = MouseHandler.MouseHandler_x; // L: 359
						var61 = MouseHandler.MouseHandler_y; // L: 360
					}

					if (!class473.mouseCam && var33 == 4) { // L: 362
						var33 = 1;
					}

					class207 var34 = Client.field721; // L: 365
					class207 var10 = var34; // L: 367
					short var63;
					int var64;
					if (Login.loginIndex == 0) { // L: 368
						boolean var76 = false; // L: 369

						while (var10.method4215()) { // L: 370
							if (var10.field2362 == 84) { // L: 371
								var76 = true; // L: 372
							}
						}

						var64 = class143.loginBoxCenter - 80; // L: 375
						var63 = 291; // L: 376
						if (var33 == 1 && var60 >= var64 - 75 && var60 <= var64 + 75 && var61 >= var63 - 20 && var61 <= var63 + 20) { // L: 377
							Ignored.openURL(InvDefinition.method3645("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 378
						}

						var64 = class143.loginBoxCenter + 80; // L: 380
						if (var33 == 1 && var60 >= var64 - 75 && var60 <= var64 + 75 && var61 >= var63 - 20 && var61 <= var63 + 20 || var76) { // L: 381
							if ((Client.worldProperties & 33554432) != 0) { // L: 382
								Login.Login_response0 = ""; // L: 383
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 384
								Login.Login_response2 = "Your normal account will not be affected."; // L: 385
								Login.Login_response3 = ""; // L: 386
								class129.method3124(1); // L: 387
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 389
									Login.currentLoginField = 1; // L: 390
								} else {
									Login.currentLoginField = 0; // L: 393
								}
							} else if ((Client.worldProperties & 4) != 0) { // L: 397
								if ((Client.worldProperties & 1024) != 0) { // L: 398
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 399
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 400
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 401
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 404
									Login.Login_response2 = "Players can attack each other"; // L: 405
									Login.Login_response3 = "almost everywhere."; // L: 406
								}

								Login.Login_response0 = "Warning!"; // L: 408
								class129.method3124(1); // L: 409
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 411
									Login.currentLoginField = 1; // L: 412
								} else {
									Login.currentLoginField = 0; // L: 415
								}
							} else if ((Client.worldProperties & 1024) != 0) { // L: 419
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 420
								Login.Login_response2 = "The Protect Item prayer will"; // L: 421
								Login.Login_response3 = "not work on this world."; // L: 422
								Login.Login_response0 = "Warning!"; // L: 423
								class129.method3124(1); // L: 424
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 426
									Login.currentLoginField = 1; // L: 427
								} else {
									Login.currentLoginField = 0; // L: 430
								}
							} else {
								class6.Login_promptCredentials(false); // L: 435
							}
						}
					} else {
						int var11;
						short var12;
						if (Login.loginIndex == 1) { // L: 439
							while (true) {
								if (!var10.method4215()) { // L: 440
									var11 = class143.loginBoxCenter - 80; // L: 448
									var12 = 321; // L: 449
									if (var33 == 1 && var60 >= var11 - 75 && var60 <= var11 + 75 && var61 >= var12 - 20 && var61 <= var12 + 20) { // L: 450
										class6.Login_promptCredentials(false); // L: 451
									}

									var11 = class143.loginBoxCenter + 80; // L: 453
									if (var33 == 1 && var60 >= var11 - 75 && var60 <= var11 + 75 && var61 >= var12 - 20 && var61 <= var12 + 20) { // L: 454
										class129.method3124(0); // L: 455
									}
									break;
								}

								if (var10.field2362 == 84) { // L: 441
									class6.Login_promptCredentials(false); // L: 442
								} else if (var10.field2362 == 13) { // L: 444
									class129.method3124(0); // L: 445
								}
							}
						} else {
							int var15;
							String var17;
							boolean var20;
							short var62;
							boolean var66;
							int var69;
							if (Login.loginIndex == 2) { // L: 458
								var62 = 201; // L: 459
								var11 = var62 + 52; // L: 460
								if (var33 == 1 && var61 >= var11 - 12 && var61 < var11 + 2) { // L: 461
									Login.currentLoginField = 0;
								}

								var11 += 15; // L: 462
								if (var33 == 1 && var61 >= var11 - 12 && var61 < var11 + 2) { // L: 463
									Login.currentLoginField = 1;
								}

								var11 += 15; // L: 464
								var62 = 361; // L: 465
								if (class96.field1295 != null) { // L: 466
									var64 = class96.field1295.highX / 2; // L: 467
									if (var33 == 1 && var60 >= class96.field1295.lowX - var64 && var60 <= var64 + class96.field1295.lowX && var61 >= var62 - 15 && var61 < var62) { // L: 468
										switch(Login.field916) { // L: 469
										case 1:
											class205.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 477
											class129.method3124(5); // L: 478
											return; // L: 479
										case 2:
											Ignored.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 472
										}
									}
								}

								var64 = class143.loginBoxCenter - 80; // L: 484
								var63 = 321; // L: 485
								if (var33 == 1 && var60 >= var64 - 75 && var60 <= var64 + 75 && var61 >= var63 - 20 && var61 <= var63 + 20) { // L: 486
									Login.Login_username = Login.Login_username.trim(); // L: 487
									if (Login.Login_username.length() == 0) { // L: 488
										class205.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 489
										return; // L: 490
									}

									if (Login.Login_password.length() == 0) { // L: 492
										class205.setLoginResponseString("", "Please enter your password.", ""); // L: 493
										return; // L: 494
									}

									class205.setLoginResponseString("", "Connecting to server...", ""); // L: 496
									class14.method180(false); // L: 497
									class138.method3208(20); // L: 498
									return; // L: 499
								}

								var64 = Login.loginBoxX + 180 + 80; // L: 501
								if (var33 == 1 && var60 >= var64 - 75 && var60 <= var64 + 75 && var61 >= var63 - 20 && var61 <= var63 + 20) { // L: 502
									class129.method3124(0); // L: 503
									Login.Login_username = ""; // L: 504
									Login.Login_password = ""; // L: 505
									class204.field2330 = 0; // L: 506
									Messages.otp = ""; // L: 507
									Login.field914 = true; // L: 508
								}

								var64 = class143.loginBoxCenter + -117; // L: 510
								var63 = 277; // L: 511
								Login.field890 = var60 >= var64 && var60 < var64 + ChatChannel.field992 && var61 >= var63 && var61 < var63 + FloorUnderlayDefinition.field2096; // L: 512
								if (var33 == 1 && Login.field890) { // L: 513
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 514
									if (!Client.Login_isUsernameRemembered && class20.clientPreferences.method2473() != null) { // L: 515
										class20.clientPreferences.method2466((String)null); // L: 516
									}
								}

								var64 = class143.loginBoxCenter + 24; // L: 519
								var63 = 277; // L: 520
								Login.field902 = var60 >= var64 && var60 < var64 + ChatChannel.field992 && var61 >= var63 && var61 < var63 + FloorUnderlayDefinition.field2096; // L: 521
								if (var33 == 1 && Login.field902) { // L: 522
									class20.clientPreferences.method2449(!class20.clientPreferences.method2450()); // L: 523
									if (!class20.clientPreferences.method2450()) { // L: 524
										Login.Login_username = ""; // L: 525
										class20.clientPreferences.method2466((String)null); // L: 526
										if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 528
											Login.currentLoginField = 1; // L: 529
										} else {
											Login.currentLoginField = 0; // L: 532
										}
									}
								}

								label1653:
								while (true) {
									Transferable var85;
									do {
										while (true) {
											label1617:
											do {
												while (true) {
													while (var10.method4215()) { // L: 537
														if (var10.field2362 != 13) { // L: 538
															if (Login.currentLoginField != 0) { // L: 547
																continue label1617;
															}

															char var68 = var10.field2361; // L: 548

															for (var15 = 0; var15 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var68 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var15); ++var15) { // L: 550 551
															}

															if (var10.field2362 == 85 && Login.Login_username.length() > 0) { // L: 554
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var10.field2362 == 84 || var10.field2362 == 80) { // L: 555
																Login.currentLoginField = 1;
															}

															char var74 = var10.field2361; // L: 557
															boolean var70 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var74) != -1; // L: 559
															if (var70 && Login.Login_username.length() < 320) { // L: 561
																Login.Login_username = Login.Login_username + var10.field2361;
															}
														} else {
															class129.method3124(0); // L: 539
															Login.Login_username = ""; // L: 540
															Login.Login_password = ""; // L: 541
															class204.field2330 = 0; // L: 542
															Messages.otp = ""; // L: 543
															Login.field914 = true; // L: 544
														}
													}

													return; // L: 1356
												}
											} while(Login.currentLoginField != 1); // L: 563

											if (var10.field2362 == 85 && Login.Login_password.length() > 0) { // L: 564
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 565
											} else if (var10.field2362 == 84 || var10.field2362 == 80) { // L: 567
												Login.currentLoginField = 0; // L: 568
												if (var10.field2362 == 84) { // L: 569
													Login.Login_username = Login.Login_username.trim(); // L: 570
													if (Login.Login_username.length() == 0) { // L: 571
														class205.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 572
														return; // L: 573
													}

													if (Login.Login_password.length() == 0) { // L: 575
														class205.setLoginResponseString("", "Please enter your password.", ""); // L: 576
														return; // L: 577
													}

													class205.setLoginResponseString("", "Connecting to server...", ""); // L: 579
													class14.method180(false); // L: 580
													class138.method3208(20); // L: 581
													return; // L: 582
												}
											}

											if ((var10.method4229(82) || var10.method4229(87)) && var10.field2362 == 67) { // L: 585
												Clipboard var84 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 586
												var85 = var84.getContents(ScriptFrame.client); // L: 587
												var69 = 20 - Login.Login_password.length(); // L: 588
												break;
											}

											if (MouseHandler.method714(var10.field2361)) { // L: 613
												char var71 = var10.field2361; // L: 615
												var66 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var71) != -1; // L: 617
												if (var66 && Login.Login_password.length() < 20) { // L: 619 620
													Login.Login_password = Login.Login_password + var10.field2361; // L: 621
												}
											}
										}
									} while(var69 <= 0); // L: 589

									try {
										var17 = (String)var85.getTransferData(DataFlavor.stringFlavor); // L: 591
										int var75 = Math.min(var69, var17.length()); // L: 592
										int var72 = 0;

										while (true) {
											if (var72 >= var75) {
												Login.Login_password = Login.Login_password + var17.substring(0, var75); // L: 607
												continue label1653;
											}

											if (!MouseHandler.method714(var17.charAt(var72))) { // L: 595
												break;
											}

											char var21 = var17.charAt(var72); // L: 597
											var20 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var21) != -1; // L: 599
											if (!var20) { // L: 601
												break;
											}

											++var72; // L: 593
										}

										class129.method3124(3); // L: 603
										return; // L: 604
									} catch (UnsupportedFlavorException var58) { // L: 609
									} catch (IOException var59) { // L: 610
									}
								}
							} else {
								Bounds var37;
								if (Login.loginIndex == 3) { // L: 629
									var11 = Login.loginBoxX + 180; // L: 630
									var12 = 241; // L: 631
									var37 = var1.method7408(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var11, var12); // L: 632
									if (var33 == 1 && var37.method8089(var60, var61)) { // L: 633
										Ignored.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 634
									}

									var11 = Login.loginBoxX + 180; // L: 636
									var12 = 276; // L: 637
									if (var33 == 1 && var60 >= var11 - 75 && var60 <= var11 + 75 && var61 >= var12 - 20 && var61 <= var12 + 20) { // L: 638
										Login.method2100(false); // L: 639
									}

									var11 = Login.loginBoxX + 180; // L: 641
									var12 = 326; // L: 642
									if (var33 == 1 && var60 >= var11 - 75 && var60 <= var11 + 75 && var61 >= var12 - 20 && var61 <= var12 + 20) { // L: 643
										class205.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 644
										class129.method3124(5); // L: 645
										return; // L: 646
									}
								} else {
									int var14;
									if (Login.loginIndex == 4) { // L: 649
										var11 = Login.loginBoxX + 180 - 80; // L: 650
										var12 = 321; // L: 651
										if (var33 == 1 && var60 >= var11 - 75 && var60 <= var11 + 75 && var61 >= var12 - 20 && var61 <= var12 + 20) { // L: 652
											Messages.otp.trim(); // L: 653
											if (Messages.otp.length() != 6) { // L: 654
												class205.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 655
												return; // L: 656
											}

											class204.field2330 = Integer.parseInt(Messages.otp); // L: 658
											Messages.otp = ""; // L: 659
											class14.method180(true); // L: 660
											class205.setLoginResponseString("", "Connecting to server...", ""); // L: 661
											class138.method3208(20); // L: 662
											return; // L: 663
										}

										if (var33 == 1 && var60 >= Login.loginBoxX + 180 - 9 && var60 <= Login.loginBoxX + 180 + 130 && var61 >= 263 && var61 <= 296) { // L: 665
											Login.field914 = !Login.field914; // L: 666
										}

										if (var33 == 1 && var60 >= Login.loginBoxX + 180 - 34 && var60 <= Login.loginBoxX + 34 + 180 && var61 >= 351 && var61 <= 363) { // L: 668
											Ignored.openURL(InvDefinition.method3645("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 669
										}

										var11 = Login.loginBoxX + 180 + 80; // L: 671
										if (var33 == 1 && var60 >= var11 - 75 && var60 <= var11 + 75 && var61 >= var12 - 20 && var61 <= var12 + 20) { // L: 672
											class129.method3124(0); // L: 673
											Login.Login_username = ""; // L: 674
											Login.Login_password = ""; // L: 675
											class204.field2330 = 0; // L: 676
											Messages.otp = ""; // L: 677
										}

										while (var10.method4215()) { // L: 679
											boolean var13 = false; // L: 680

											for (var14 = 0; var14 < "1234567890".length(); ++var14) { // L: 681
												if (var10.field2361 == "1234567890".charAt(var14)) { // L: 682
													var13 = true; // L: 683
													break; // L: 684
												}
											}

											if (var10.field2362 == 13) { // L: 687
												class129.method3124(0); // L: 688
												Login.Login_username = ""; // L: 689
												Login.Login_password = ""; // L: 690
												class204.field2330 = 0; // L: 691
												Messages.otp = ""; // L: 692
											} else {
												if (var10.field2362 == 85 && Messages.otp.length() > 0) { // L: 695
													Messages.otp = Messages.otp.substring(0, Messages.otp.length() - 1);
												}

												if (var10.field2362 == 84) { // L: 696
													Messages.otp.trim(); // L: 697
													if (Messages.otp.length() != 6) { // L: 698
														class205.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 699
														return; // L: 700
													}

													class204.field2330 = Integer.parseInt(Messages.otp); // L: 702
													Messages.otp = ""; // L: 703
													class14.method180(true); // L: 704
													class205.setLoginResponseString("", "Connecting to server...", ""); // L: 705
													class138.method3208(20); // L: 706
													return; // L: 707
												}

												if (var13 && Messages.otp.length() < 6) { // L: 709
													Messages.otp = Messages.otp + var10.field2361;
												}
											}
										}
									} else if (Login.loginIndex == 5) { // L: 713
										var11 = Login.loginBoxX + 180 - 80; // L: 714
										var12 = 321; // L: 715
										if (var33 == 1 && var60 >= var11 - 75 && var60 <= var11 + 75 && var61 >= var12 - 20 && var61 <= var12 + 20) { // L: 716
											Login.Login_username = Login.Login_username.trim(); // L: 718
											if (Login.Login_username.length() == 0) { // L: 719
												class205.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 720
											} else {
												long var38 = class264.method5481(); // L: 724
												byte var65;
												if (var38 == 0L) { // L: 725
													var65 = 5;
												} else {
													var17 = Login.Login_username; // L: 728
													Random var40 = new Random(); // L: 730
													Buffer var87 = new Buffer(128); // L: 731
													Buffer var89 = new Buffer(128); // L: 732
													int[] var91 = new int[]{var40.nextInt(), var40.nextInt(), (int)(var38 >> 32), (int)var38}; // L: 733 734 735 736 737
													var87.writeByte(10); // L: 738

													int var22;
													for (var22 = 0; var22 < 4; ++var22) { // L: 739
														var87.writeInt(var40.nextInt()); // L: 740
													}

													var87.writeInt(var91[0]); // L: 742
													var87.writeInt(var91[1]); // L: 743
													var87.writeLong(var38); // L: 744
													var87.writeLong(0L); // L: 745

													for (var22 = 0; var22 < 4; ++var22) { // L: 746
														var87.writeInt(var40.nextInt()); // L: 747
													}

													var87.encryptRsa(class68.field874, class68.field871); // L: 749
													var89.writeByte(10); // L: 750

													for (var22 = 0; var22 < 3; ++var22) { // L: 751
														var89.writeInt(var40.nextInt()); // L: 752
													}

													var89.writeLong(var40.nextLong()); // L: 754
													var89.method9252(var40.nextLong()); // L: 755
													class383.method7541(var89); // L: 756
													var89.writeLong(var40.nextLong()); // L: 757
													var89.encryptRsa(class68.field874, class68.field871); // L: 758
													var22 = DynamicObject.stringCp1252NullTerminatedByteSize(var17); // L: 759
													if (var22 % 8 != 0) { // L: 760
														var22 += 8 - var22 % 8;
													}

													Buffer var77 = new Buffer(var22); // L: 761
													var77.writeStringCp1252NullTerminated(var17); // L: 762
													var77.offset = var22; // L: 763
													var77.xteaEncryptAll(var91); // L: 764
													Buffer var24 = new Buffer(var77.offset + var89.offset + var87.offset + 5); // L: 765
													var24.writeByte(2); // L: 766
													var24.writeByte(var87.offset); // L: 767
													var24.writeBytes(var87.array, 0, var87.offset); // L: 768
													var24.writeByte(var89.offset); // L: 769
													var24.writeBytes(var89.array, 0, var89.offset); // L: 770
													var24.writeShort(var77.offset); // L: 771
													var24.writeBytes(var77.array, 0, var77.offset); // L: 772
													String var79 = WorldMapSectionType.method5427(var24.array); // L: 773

													byte var16;
													try {
														URL var80 = new URL(InvDefinition.method3645("services", false) + "m=accountappeal/login.ws"); // L: 775
														URLConnection var81 = var80.openConnection(); // L: 776
														var81.setDoInput(true); // L: 777
														var81.setDoOutput(true); // L: 778
														var81.setConnectTimeout(5000); // L: 779
														OutputStreamWriter var82 = new OutputStreamWriter(var81.getOutputStream()); // L: 780
														var82.write("data2=" + class397.method7696(var79) + "&dest=" + class397.method7696("passwordchoice.ws")); // L: 781
														var82.flush(); // L: 782
														InputStream var83 = var81.getInputStream(); // L: 783
														var24 = new Buffer(new byte[1000]); // L: 784

														while (true) {
															int var30 = var83.read(var24.array, var24.offset, 1000 - var24.offset); // L: 786
															if (var30 == -1) { // L: 787
																var82.close(); // L: 794
																var83.close(); // L: 795
																String var94 = new String(var24.array); // L: 796
																if (var94.startsWith("OFFLINE")) { // L: 797
																	var16 = 4; // L: 798
																} else if (var94.startsWith("WRONG")) { // L: 801
																	var16 = 7; // L: 802
																} else if (var94.startsWith("RELOAD")) { // L: 805
																	var16 = 3; // L: 806
																} else if (var94.startsWith("Not permitted for social network accounts.")) { // L: 809
																	var16 = 6; // L: 810
																} else {
																	var24.xteaDecryptAll(var91); // L: 813

																	while (var24.offset > 0 && var24.array[var24.offset - 1] == 0) { // L: 814
																		--var24.offset; // L: 815
																	}

																	var94 = new String(var24.array, 0, var24.offset); // L: 817
																	if (AttackOption.method2656(var94)) { // L: 818
																		Ignored.openURL(var94, true, false); // L: 819
																		var16 = 2; // L: 820
																	} else {
																		var16 = 5; // L: 822
																	}
																}
																break;
															}

															var24.offset += var30; // L: 788
															if (var24.offset >= 1000) { // L: 789
																var16 = 5; // L: 790
																break;
															}
														}
													} catch (Throwable var54) { // L: 824
														var54.printStackTrace(); // L: 825
														var16 = 5; // L: 826
													}

													var65 = var16; // L: 829
												}

												switch(var65) { // L: 831
												case 2:
													class205.setLoginResponseString(Strings.field4008, Strings.field4032, Strings.field4117); // L: 842
													class129.method3124(6); // L: 843
													break; // L: 844
												case 3:
													class205.setLoginResponseString("", "Error connecting to server.", ""); // L: 839
													break; // L: 840
												case 4:
													class205.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 849
													break;
												case 5:
													class205.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 836
													break; // L: 837
												case 6:
													class205.setLoginResponseString("", "Error connecting to server.", ""); // L: 846
													break; // L: 847
												case 7:
													class205.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 833
												}
											}

											return; // L: 853
										}

										var11 = Login.loginBoxX + 180 + 80; // L: 855
										if (var33 == 1 && var60 >= var11 - 75 && var60 <= var11 + 75 && var61 >= var12 - 20 && var61 <= var12 + 20) { // L: 856
											class6.Login_promptCredentials(true); // L: 857
										}

										var63 = 361; // L: 859
										if (class19.field103 != null) { // L: 860
											var14 = class19.field103.highX / 2; // L: 861
											if (var33 == 1 && var60 >= class19.field103.lowX - var14 && var60 <= var14 + class19.field103.lowX && var61 >= var63 - 15 && var61 < var63) { // L: 862
												Ignored.openURL(InvDefinition.method3645("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 863
											}
										}

										while (var10.method4215()) { // L: 866
											var66 = false; // L: 867

											for (var15 = 0; var15 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var15) { // L: 868
												if (var10.field2361 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var15)) { // L: 869
													var66 = true; // L: 870
													break; // L: 871
												}
											}

											if (var10.field2362 == 13) { // L: 874
												class6.Login_promptCredentials(true); // L: 875
											} else {
												if (var10.field2362 == 85 && Login.Login_username.length() > 0) { // L: 878
													Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
												}

												if (var10.field2362 == 84) { // L: 879
													Login.Login_username = Login.Login_username.trim(); // L: 881
													if (Login.Login_username.length() == 0) { // L: 882
														class205.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 883
													} else {
														long var45 = class264.method5481(); // L: 887
														byte var67;
														if (var45 == 0L) { // L: 888
															var67 = 5;
														} else {
															String var41 = Login.Login_username; // L: 891
															Random var42 = new Random(); // L: 893
															Buffer var43 = new Buffer(128); // L: 894
															Buffer var47 = new Buffer(128); // L: 895
															int[] var23 = new int[]{var42.nextInt(), var42.nextInt(), (int)(var45 >> 32), (int)var45}; // L: 896 897 898 899 900
															var43.writeByte(10); // L: 901

															int var48;
															for (var48 = 0; var48 < 4; ++var48) { // L: 902
																var43.writeInt(var42.nextInt()); // L: 903
															}

															var43.writeInt(var23[0]); // L: 905
															var43.writeInt(var23[1]); // L: 906
															var43.writeLong(var45); // L: 907
															var43.writeLong(0L); // L: 908

															for (var48 = 0; var48 < 4; ++var48) { // L: 909
																var43.writeInt(var42.nextInt()); // L: 910
															}

															var43.encryptRsa(class68.field874, class68.field871); // L: 912
															var47.writeByte(10); // L: 913

															for (var48 = 0; var48 < 3; ++var48) { // L: 914
																var47.writeInt(var42.nextInt()); // L: 915
															}

															var47.writeLong(var42.nextLong()); // L: 917
															var47.method9252(var42.nextLong()); // L: 918
															class383.method7541(var47); // L: 919
															var47.writeLong(var42.nextLong()); // L: 920
															var47.encryptRsa(class68.field874, class68.field871); // L: 921
															var48 = DynamicObject.stringCp1252NullTerminatedByteSize(var41); // L: 922
															if (var48 % 8 != 0) { // L: 923
																var48 += 8 - var48 % 8;
															}

															Buffer var25 = new Buffer(var48); // L: 924
															var25.writeStringCp1252NullTerminated(var41); // L: 925
															var25.offset = var48; // L: 926
															var25.xteaEncryptAll(var23); // L: 927
															Buffer var26 = new Buffer(var43.offset + var47.offset + var25.offset + 5); // L: 928
															var26.writeByte(2); // L: 929
															var26.writeByte(var43.offset); // L: 930
															var26.writeBytes(var43.array, 0, var43.offset); // L: 931
															var26.writeByte(var47.offset); // L: 932
															var26.writeBytes(var47.array, 0, var47.offset); // L: 933
															var26.writeShort(var25.offset); // L: 934
															var26.writeBytes(var25.array, 0, var25.offset); // L: 935
															String var27 = WorldMapSectionType.method5427(var26.array); // L: 936

															byte var18;
															try {
																URL var28 = new URL(InvDefinition.method3645("services", false) + "m=accountappeal/login.ws"); // L: 938
																URLConnection var29 = var28.openConnection(); // L: 939
																var29.setDoInput(true); // L: 940
																var29.setDoOutput(true); // L: 941
																var29.setConnectTimeout(5000); // L: 942
																OutputStreamWriter var44 = new OutputStreamWriter(var29.getOutputStream()); // L: 943
																var44.write("data2=" + class397.method7696(var27) + "&dest=" + class397.method7696("passwordchoice.ws")); // L: 944
																var44.flush(); // L: 945
																InputStream var31 = var29.getInputStream(); // L: 946
																var26 = new Buffer(new byte[1000]); // L: 947

																while (true) {
																	int var32 = var31.read(var26.array, var26.offset, 1000 - var26.offset); // L: 949
																	if (var32 == -1) { // L: 950
																		var44.close(); // L: 957
																		var31.close(); // L: 958
																		String var49 = new String(var26.array); // L: 959
																		if (var49.startsWith("OFFLINE")) { // L: 960
																			var18 = 4; // L: 961
																		} else if (var49.startsWith("WRONG")) { // L: 964
																			var18 = 7; // L: 965
																		} else if (var49.startsWith("RELOAD")) { // L: 968
																			var18 = 3; // L: 969
																		} else if (var49.startsWith("Not permitted for social network accounts.")) { // L: 972
																			var18 = 6; // L: 973
																		} else {
																			var26.xteaDecryptAll(var23); // L: 976

																			while (var26.offset > 0 && var26.array[var26.offset - 1] == 0) { // L: 977
																				--var26.offset; // L: 978
																			}

																			var49 = new String(var26.array, 0, var26.offset); // L: 980
																			if (AttackOption.method2656(var49)) { // L: 981
																				Ignored.openURL(var49, true, false); // L: 982
																				var18 = 2; // L: 983
																			} else {
																				var18 = 5; // L: 985
																			}
																		}
																		break;
																	}

																	var26.offset += var32; // L: 951
																	if (var26.offset >= 1000) { // L: 952
																		var18 = 5; // L: 953
																		break;
																	}
																}
															} catch (Throwable var55) { // L: 987
																var55.printStackTrace(); // L: 988
																var18 = 5; // L: 989
															}

															var67 = var18; // L: 992
														}

														switch(var67) { // L: 994
														case 2:
															class205.setLoginResponseString(Strings.field4008, Strings.field4032, Strings.field4117); // L: 1005
															class129.method3124(6); // L: 1006
															break; // L: 1007
														case 3:
															class205.setLoginResponseString("", "Error connecting to server.", ""); // L: 999
															break; // L: 1000
														case 4:
															class205.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 1002
															break; // L: 1003
														case 5:
															class205.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 1009
															break; // L: 1010
														case 6:
															class205.setLoginResponseString("", "Error connecting to server.", ""); // L: 996
															break; // L: 997
														case 7:
															class205.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 1012
														}
													}

													return; // L: 1016
												}

												if (var66 && Login.Login_username.length() < 320) { // L: 1018
													Login.Login_username = Login.Login_username + var10.field2361;
												}
											}
										}
									} else if (Login.loginIndex != 6) { // L: 1022
										if (Login.loginIndex == 7) { // L: 1033
											if (WorldMapSectionType.field2983 && !Client.onMobile) { // L: 1034
												var11 = class143.loginBoxCenter - 150; // L: 1035
												var64 = var11 + 40 + 240 + 25; // L: 1036
												var63 = 231; // L: 1037
												var14 = var63 + 40; // L: 1038
												if (var33 == 1 && var60 >= var11 && var60 <= var64 && var61 >= var63 && var61 <= var14) { // L: 1039
													var69 = var11; // L: 1041
													int var50 = 0;

													while (true) {
														if (var50 >= 8) {
															var15 = 0; // L: 1051
															break;
														}

														if (var60 <= var69 + 30) { // L: 1044
															var15 = var50; // L: 1045
															break; // L: 1046
														}

														var69 += 30; // L: 1048
														var69 += var50 != 1 && var50 != 3 ? 5 : 20; // L: 1049
														++var50; // L: 1043
													}

													Login.field909 = var15; // L: 1053
												}

												var15 = Login.loginBoxX + 180 - 80; // L: 1055
												short var73 = 321; // L: 1056
												boolean var19;
												int var51;
												String var78;
												Date var86;
												Date var88;
												SimpleDateFormat var90;
												StringBuilder var92;
												Date var93;
												String[] var95;
												boolean var96;
												if (var33 == 1 && var60 >= var15 - 75 && var60 <= var15 + 75 && var61 >= var73 - 20 && var61 <= var73 + 20) { // L: 1057
													label1469: {
														try {
															var90 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 1064
															var90.setLenient(false); // L: 1065
															var92 = new StringBuilder(); // L: 1066
															var95 = Login.field910; // L: 1068
															var51 = 0;

															while (true) {
																if (var51 >= var95.length) {
																	var92.append("12"); // L: 1081
																	var88 = var90.parse(var92.toString()); // L: 1082
																	break;
																}

																var78 = var95[var51]; // L: 1070
																if (var78 == null) { // L: 1072
																	WorldMapRectangle.method5466("Date not valid.", "Please ensure all characters are populated.", ""); // L: 1073
																	var88 = null; // L: 1074
																	break; // L: 1075
																}

																var92.append(var78); // L: 1077
																++var51; // L: 1069
															}

															var86 = var88; // L: 1084
														} catch (ParseException var57) { // L: 1086
															WorldMapRectangle.method5466("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1087
															var96 = false; // L: 1088
															break label1469; // L: 1089
														}

														if (var86 == null) { // L: 1091
															var96 = false; // L: 1092
														} else {
															var19 = class81.method2247(var86); // L: 1095
															var93 = Varcs.method2747(); // L: 1098
															var20 = var86.after(var93); // L: 1099
															if (!var20) { // L: 1102
																WorldMapRectangle.method5466("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1103
																var96 = false; // L: 1104
															} else {
																if (!var19) { // L: 1107
																	ByteArrayPool.field4478 = 8388607; // L: 1108
																} else {
																	ByteArrayPool.field4478 = (int)(var86.getTime() / 86400000L - 11745L); // L: 1111
																}

																var96 = true; // L: 1113
															}
														}
													}

													if (var96) { // L: 1116
														class138.method3208(50); // L: 1117
														return; // L: 1118
													}
												}

												var15 = Login.loginBoxX + 180 + 80; // L: 1121
												if (var33 == 1 && var60 >= var15 - 75 && var60 <= var15 + 75 && var61 >= var73 - 20 && var61 <= var73 + 20) { // L: 1122
													Login.field910 = new String[8]; // L: 1123
													class6.Login_promptCredentials(true); // L: 1124
												}

												while (var10.method4215()) { // L: 1126
													if (var10.field2362 == 101) { // L: 1127
														Login.field910[Login.field909] = null; // L: 1128
													}

													if (var10.field2362 == 85) { // L: 1130
														if (Login.field910[Login.field909] == null && Login.field909 > 0) { // L: 1131
															--Login.field909; // L: 1132
														}

														Login.field910[Login.field909] = null; // L: 1134
													}

													if (var10.field2361 >= '0' && var10.field2361 <= '9') { // L: 1136
														Login.field910[Login.field909] = "" + var10.field2361; // L: 1137
														if (Login.field909 < 7) { // L: 1138
															++Login.field909; // L: 1139
														}
													}

													if (var10.field2362 == 84) { // L: 1142
														label1397: {
															try {
																var90 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 1149
																var90.setLenient(false); // L: 1150
																var92 = new StringBuilder(); // L: 1151
																var95 = Login.field910; // L: 1153
																var51 = 0;

																while (true) {
																	if (var51 < var95.length) {
																		var78 = var95[var51]; // L: 1155
																		if (var78 != null) { // L: 1157
																			var92.append(var78); // L: 1162
																			++var51; // L: 1154
																			continue;
																		}

																		WorldMapRectangle.method5466("Date not valid.", "Please ensure all characters are populated.", ""); // L: 1158
																		var88 = null; // L: 1159
																	} else {
																		var92.append("12"); // L: 1166
																		var88 = var90.parse(var92.toString()); // L: 1167
																	}

																	var86 = var88; // L: 1169
																	break;
																}
															} catch (ParseException var56) { // L: 1171
																WorldMapRectangle.method5466("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1172
																var96 = false; // L: 1173
																break label1397; // L: 1174
															}

															if (var86 == null) { // L: 1176
																var96 = false; // L: 1177
															} else {
																var19 = class81.method2247(var86); // L: 1180
																var93 = Varcs.method2747(); // L: 1183
																var20 = var86.after(var93); // L: 1184
																if (!var20) { // L: 1187
																	WorldMapRectangle.method5466("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1188
																	var96 = false; // L: 1189
																} else {
																	if (!var19) { // L: 1192
																		ByteArrayPool.field4478 = 8388607; // L: 1193
																	} else {
																		ByteArrayPool.field4478 = (int)(var86.getTime() / 86400000L - 11745L); // L: 1196
																	}

																	var96 = true; // L: 1198
																}
															}
														}

														if (var96) { // L: 1201
															class138.method3208(50); // L: 1202
														}

														return; // L: 1204
													}
												}
											} else {
												var11 = Login.loginBoxX + 180 - 80; // L: 1209
												var12 = 321; // L: 1210
												if (var33 == 1 && var60 >= var11 - 75 && var60 <= var11 + 75 && var61 >= var12 - 20 && var61 <= var12 + 20) { // L: 1211
													Ignored.openURL(InvDefinition.method3645("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1212
													class205.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1213
													class129.method3124(6); // L: 1214
													return; // L: 1215
												}

												var11 = Login.loginBoxX + 180 + 80; // L: 1217
												if (var33 == 1 && var60 >= var11 - 75 && var60 <= var11 + 75 && var61 >= var12 - 20 && var61 <= var12 + 20) { // L: 1218
													class6.Login_promptCredentials(true); // L: 1219
												}
											}
										} else if (Login.loginIndex == 8) { // L: 1223
											var11 = Login.loginBoxX + 180 - 80; // L: 1224
											var12 = 321; // L: 1225
											if (var33 == 1 && var60 >= var11 - 75 && var60 <= var11 + 75 && var61 >= var12 - 20 && var61 <= var12 + 20) { // L: 1226
												Ignored.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1227
												class205.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1228
												class129.method3124(6); // L: 1229
												return; // L: 1230
											}

											var11 = Login.loginBoxX + 180 + 80; // L: 1232
											if (var33 == 1 && var60 >= var11 - 75 && var60 <= var11 + 75 && var61 >= var12 - 20 && var61 <= var12 + 20) { // L: 1233
												class6.Login_promptCredentials(true); // L: 1234
											}
										} else if (Login.loginIndex == 9) { // L: 1237
											var11 = Login.loginBoxX + 180; // L: 1238
											var12 = 311; // L: 1239
											if (var34.field2362 == 84 || var34.field2362 == 13 || var33 == 1 && var60 >= var11 - 75 && var60 <= var11 + 75 && var61 >= var12 - 20 && var61 <= var12 + 20) { // L: 1240
												Login.method2100(false); // L: 1241
											}
										} else if (Login.loginIndex == 10) { // L: 1244
											var11 = Login.loginBoxX + 180; // L: 1245
											var12 = 209; // L: 1246
											if (var34.field2362 == 84 || var33 == 1 && var60 >= var11 - 109 && var60 <= var11 + 109 && var61 >= var12 && var61 <= var12 + 68) { // L: 1247
												class205.setLoginResponseString("", "Connecting to server...", ""); // L: 1248
												Client.field527 = class493.field5044; // L: 1249
												class14.method180(false); // L: 1250
												class138.method3208(20); // L: 1251
											}
										} else if (Login.loginIndex == 12) { // L: 1254
											var11 = class143.loginBoxCenter; // L: 1255
											var12 = 233; // L: 1256
											var37 = var2.method7408(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var11, var12); // L: 1257
											Bounds var35 = var2.method7408(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var11, var12); // L: 1258
											Bounds var36 = var2.method7408(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var11, var12); // L: 1259
											var64 = var12 + 17; // L: 1260
											Bounds var52 = var2.method7408(0, 34, "<col=ffd200>agreement (EULA)</col>.", var11, var64); // L: 1261
											if (var33 == 1) { // L: 1262
												if (var37.method8089(var60, var61)) { // L: 1263
													Ignored.openURL("https://www.jagex.com/terms", true, false); // L: 1264
												} else if (var35.method8089(var60, var61)) { // L: 1266
													Ignored.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1267
												} else if (var36.method8089(var60, var61) || var52.method8089(var60, var61)) { // L: 1269
													Ignored.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 1270
												}
											}

											var11 = class143.loginBoxCenter - 80; // L: 1273
											var12 = 311; // L: 1274
											if (var33 == 1 && var60 >= var11 - 75 && var60 <= var11 + 75 && var61 >= var12 - 20 && var61 <= var12 + 20) { // L: 1275
												class20.clientPreferences.method2468(Client.field493); // L: 1277
												Login.method2100(true); // L: 1279
											}

											var11 = class143.loginBoxCenter + 80; // L: 1281
											if (var33 == 1 && var60 >= var11 - 75 && var60 <= var11 + 75 && var61 >= var12 - 20 && var61 <= var12 + 20) { // L: 1282
												Login.loginIndex = 13; // L: 1283
											}
										} else if (Login.loginIndex == 13) { // L: 1286
											var11 = class143.loginBoxCenter; // L: 1287
											var12 = 321; // L: 1288
											if (var33 == 1 && var60 >= var11 - 75 && var60 <= var11 + 75 && var61 >= var12 - 20 && var61 <= var12 + 20) { // L: 1289
												Login.method2100(true); // L: 1290
											}
										} else if (Login.loginIndex == 14) { // L: 1293
											String var53 = ""; // L: 1294
											switch(Login.field898) { // L: 1295
											case 0:
												var53 = "https://secure.runescape.com/m=offence-appeal/account-history"; // L: 1306
												break;
											case 1:
												var53 = "https://secure.runescape.com/m=accountappeal/passwordrecovery"; // L: 1297
												break; // L: 1298
											case 2:
												var53 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance"; // L: 1300
												break; // L: 1301
											default:
												class6.Login_promptCredentials(false); // L: 1303
											}

											var64 = Login.loginBoxX + 180; // L: 1309
											var63 = 276; // L: 1310
											if (var33 == 1 && var60 >= var64 - 75 && var60 <= var64 + 75 && var61 >= var63 - 20 && var61 <= var63 + 20) { // L: 1311
												Ignored.openURL(var53, true, false); // L: 1312
												class205.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1313
												class129.method3124(6); // L: 1314
												return; // L: 1315
											}

											var64 = Login.loginBoxX + 180; // L: 1317
											var63 = 326; // L: 1318
											if (var33 == 1 && var60 >= var64 - 75 && var60 <= var64 + 75 && var61 >= var63 - 20 && var61 <= var63 + 20) { // L: 1319
												class6.Login_promptCredentials(false); // L: 1320
											}
										} else if (Login.loginIndex == 24) { // L: 1323
											var11 = Login.loginBoxX + 180; // L: 1324
											var12 = 301; // L: 1325
											if (var33 == 1 && var60 >= var11 - 75 && var60 <= var11 + 75 && var61 >= var12 - 20 && var61 <= var12 + 20) { // L: 1326
												Login.method2100(false); // L: 1327
											}
										} else if (Login.loginIndex == 32) { // L: 1330
											var11 = Login.loginBoxX + 180 - 80; // L: 1331
											var12 = 321; // L: 1332
											if (var33 == 1 && var60 >= var11 - 75 && var60 <= var11 + 75 && var61 >= var12 - 20 && var61 <= var12 + 20) { // L: 1333
												Ignored.openURL(InvDefinition.method3645("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1334
												class205.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1335
												class129.method3124(6); // L: 1336
												return; // L: 1337
											}

											var11 = Login.loginBoxX + 180 + 80; // L: 1339
											if (var33 == 1 && var60 >= var11 - 75 && var60 <= var11 + 75 && var61 >= var12 - 20 && var61 <= var12 + 20) { // L: 1340
												class6.Login_promptCredentials(true); // L: 1341
											}
										} else if (Login.loginIndex == 33) { // L: 1344
											var11 = Login.loginBoxX + 180; // L: 1345
											var12 = 276; // L: 1346
											if (var33 == 1 && var60 >= var11 - 75 && var60 <= var11 + 75 && var61 >= var12 - 20 && var61 <= var12 + 20) { // L: 1347
												Ignored.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 1348
											}

											var11 = Login.loginBoxX + 180; // L: 1350
											var12 = 326; // L: 1351
											if (var33 == 1 && var60 >= var11 - 75 && var60 <= var11 + 75 && var61 >= var12 - 20 && var61 <= var12 + 20) { // L: 1352
												class6.Login_promptCredentials(true); // L: 1353
											}
										}
									} else {
										while (true) {
											do {
												if (!var10.method4215()) { // L: 1023
													var62 = 321; // L: 1028
													if (var33 == 1 && var61 >= var62 - 20 && var61 <= var62 + 20) { // L: 1029
														class6.Login_promptCredentials(true); // L: 1030
													}

													return;
												}
											} while(var10.field2362 != 84 && var10.field2362 != 13); // L: 1024

											class6.Login_promptCredentials(true); // L: 1025
										}
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 305

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1074260583"
	)
	static final void method3744() {
		for (int var0 = 0; var0 < Client.npcCount; ++var0) { // L: 3805
			int var1 = Client.npcIndices[var0]; // L: 3806
			NPC var2 = Client.npcs[var1]; // L: 3807
			if (var2 != null) { // L: 3808
				ReflectionCheck.updateActorSequence(var2, var2.definition.size); // L: 3809
			}
		}

	} // L: 3812

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Llm;I)V",
		garbageValue = "-302991134"
	)
	static final void method3751(class287 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 7668
		int var2;
		int var5;
		int var6;
		int var7;
		int var9;
		byte var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var36;
		int var37;
		int var38;
		int var39;
		if (class287.field3200 == var0) { // L: 7669
			var2 = var1.readUnsignedByte(); // L: 7670
			var36 = var1.readUnsignedByte(); // L: 7671
			var37 = (var36 >> 4 & 7) + class9.field43; // L: 7672
			var5 = (var36 & 7) + FontName.field4882; // L: 7673
			var6 = var1.method9039() * 4; // L: 7674
			var7 = var1.method9098(); // L: 7675
			var38 = var1.method9039(); // L: 7676
			var9 = var1.readUnsignedShort(); // L: 7677
			var10 = var1.method9232(); // L: 7678
			var11 = var1.method9090() * 4; // L: 7679
			var12 = var1.readUnsignedShort(); // L: 7680
			var13 = var1.method9117(); // L: 7681
			byte var40 = var1.method9092(); // L: 7682
			var14 = var40 + var37; // L: 7683
			var39 = var10 + var5; // L: 7684
			if (var37 >= 0 && var5 >= 0 && var37 < 104 && var5 < 104 && var14 >= 0 && var39 >= 0 && var14 < 104 && var39 < 104 && var7 != 65535) { // L: 7685
				var37 = var37 * 128 + 64; // L: 7686
				var5 = var5 * 128 + 64; // L: 7687
				var14 = var14 * 128 + 64; // L: 7688
				var39 = var39 * 128 + 64; // L: 7689
				Projectile var35 = new Projectile(var7, GameEngine.Client_plane, var37, var5, class147.getTileHeight(var37, var5, GameEngine.Client_plane) - var11, var9 + Client.cycle, var12 + Client.cycle, var2, var38, var13, var6); // L: 7690
				var35.setDestination(var14, var39, class147.getTileHeight(var14, var39, GameEngine.Client_plane) - var6, var9 + Client.cycle); // L: 7691
				Client.projectiles.addFirst(var35); // L: 7692
			}

		} else {
			if (class287.field3197 == var0) { // L: 7696
				var2 = var1.readUnsignedShort(); // L: 7697
				byte var3 = var1.method9092(); // L: 7698
				byte var4 = var1.method9186(); // L: 7699
				var5 = var1.method9089(); // L: 7700
				var6 = (var5 >> 4 & 7) + class9.field43; // L: 7701
				var7 = (var5 & 7) + FontName.field4882; // L: 7702
				byte var8 = var1.readByte(); // L: 7703
				var9 = var1.readUnsignedShort(); // L: 7704
				var10 = var1.method9186(); // L: 7705
				var11 = var1.readUnsignedByte(); // L: 7706
				var12 = var11 >> 2; // L: 7707
				var13 = var11 & 3; // L: 7708
				var14 = Client.field563[var12]; // L: 7709
				int var15 = var1.method9098(); // L: 7710
				int var16 = var1.method9099(); // L: 7711
				Player var17;
				if (var2 == Client.localPlayerIndex) { // L: 7713
					var17 = MusicPatchNode.localPlayer;
				} else {
					var17 = Client.players[var2]; // L: 7714
				}

				if (var17 != null) { // L: 7715
					ObjectComposition var18 = class144.getObjectDefinition(var16); // L: 7716
					int var19;
					int var20;
					if (var13 != 1 && var13 != 3) { // L: 7719
						var19 = var18.sizeX; // L: 7724
						var20 = var18.sizeY; // L: 7725
					} else {
						var19 = var18.sizeY; // L: 7720
						var20 = var18.sizeX; // L: 7721
					}

					int var21 = var6 + (var19 >> 1); // L: 7727
					int var22 = var6 + (var19 + 1 >> 1); // L: 7728
					int var23 = var7 + (var20 >> 1); // L: 7729
					int var24 = var7 + (var20 + 1 >> 1); // L: 7730
					int[][] var25 = Tiles.Tiles_heights[GameEngine.Client_plane]; // L: 7731
					int var26 = var25[var21][var24] + var25[var22][var23] + var25[var21][var23] + var25[var22][var24] >> 2; // L: 7732
					int var27 = (var6 << 7) + (var19 << 6); // L: 7733
					int var28 = (var7 << 7) + (var20 << 6); // L: 7734
					Model var29 = var18.getModel(var12, var13, var25, var27, var26, var28); // L: 7735
					if (var29 != null) { // L: 7736
						class33.method508(GameEngine.Client_plane, var6, var7, var14, -1, 0, 0, 31, var9 + 1, var15 + 1); // L: 7737
						var17.animationCycleStart = var9 + Client.cycle; // L: 7738
						var17.animationCycleEnd = var15 + Client.cycle; // L: 7739
						var17.model0 = var29; // L: 7740
						var17.field1094 = var6 * 128 + var19 * 64; // L: 7741
						var17.field1098 = var7 * 128 + var20 * 64; // L: 7742
						var17.tileHeight2 = var26; // L: 7743
						byte var30;
						if (var8 > var10) { // L: 7744
							var30 = var8; // L: 7745
							var8 = var10; // L: 7746
							var10 = var30; // L: 7747
						}

						if (var3 > var4) { // L: 7749
							var30 = var3; // L: 7750
							var3 = var4; // L: 7751
							var4 = var30; // L: 7752
						}

						var17.minX = var6 + var8; // L: 7754
						var17.maxX = var6 + var10; // L: 7755
						var17.minY = var7 + var3; // L: 7756
						var17.maxY = var4 + var7; // L: 7757
					}
				}
			}

			if (class287.field3196 == var0) { // L: 7761
				var2 = var1.method9039(); // L: 7762
				var36 = (var2 >> 4 & 7) + class9.field43; // L: 7763
				var37 = (var2 & 7) + FontName.field4882; // L: 7764
				var5 = var1.readInt(); // L: 7765
				var6 = var1.method9099(); // L: 7766
				var7 = var1.readInt(); // L: 7767
				if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) { // L: 7768
					NodeDeque var44 = Client.groundItems[GameEngine.Client_plane][var36][var37]; // L: 7769
					if (var44 != null) { // L: 7770
						for (TileItem var34 = (TileItem)var44.last(); var34 != null; var34 = (TileItem)var44.previous()) { // L: 7771 7772 7777
							if ((var6 & 32767) == var34.id && var7 == var34.quantity) { // L: 7773
								var34.quantity = var5; // L: 7774
								break;
							}
						}

						class121.updateItemPile(var36, var37); // L: 7779
					}
				}

			} else {
				TileItem var41;
				if (class287.field3205 == var0) { // L: 7784
					var1.method9089(); // L: 7785
					var2 = var1.method9110(); // L: 7786
					var36 = var1.method9089(); // L: 7787
					var37 = var1.readUnsignedByte(); // L: 7788
					var5 = (var37 >> 4 & 7) + class9.field43; // L: 7789
					var6 = (var37 & 7) + FontName.field4882; // L: 7790
					var7 = var1.method9098(); // L: 7791
					var1.method9135(); // L: 7792
					var1.method9098(); // L: 7793
					var1.method9090(); // L: 7794
					if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 7795
						var41 = new TileItem(); // L: 7796
						var41.id = var7; // L: 7797
						var41.quantity = var2; // L: 7798
						var41.method2663(var36); // L: 7799
						if (Client.groundItems[GameEngine.Client_plane][var5][var6] == null) { // L: 7800
							Client.groundItems[GameEngine.Client_plane][var5][var6] = new NodeDeque(); // L: 7801
						}

						Client.groundItems[GameEngine.Client_plane][var5][var6].addFirst(var41); // L: 7803
						class121.updateItemPile(var5, var6); // L: 7804
					}

				} else if (class287.field3202 == var0) { // L: 7808
					var2 = var1.readUnsignedByte(); // L: 7809
					var36 = var1.method9039(); // L: 7810
					var37 = (var36 >> 4 & 7) + class9.field43; // L: 7811
					var5 = (var36 & 7) + FontName.field4882; // L: 7812
					var6 = var1.method9090(); // L: 7813
					var7 = var6 >> 2; // L: 7814
					var38 = var6 & 3; // L: 7815
					var9 = Client.field563[var7]; // L: 7816
					var39 = var1.method9135(); // L: 7817
					if (var37 >= 0 && var5 >= 0 && var37 < 104 && var5 < 104) { // L: 7818
						class33.method508(GameEngine.Client_plane, var37, var5, var9, var39, var7, var38, var2, 0, -1); // L: 7819
					}

				} else {
					NodeDeque var33;
					if (class287.field3204 == var0) { // L: 7823
						var2 = var1.method9090(); // L: 7824
						var36 = (var2 >> 4 & 7) + class9.field43; // L: 7825
						var37 = (var2 & 7) + FontName.field4882; // L: 7826
						var5 = var1.method9135(); // L: 7827
						var6 = var1.method9111(); // L: 7828
						if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) { // L: 7829
							var33 = Client.groundItems[GameEngine.Client_plane][var36][var37]; // L: 7830
							if (var33 != null) { // L: 7831
								for (var41 = (TileItem)var33.last(); var41 != null; var41 = (TileItem)var33.previous()) { // L: 7832 7833 7838
									if ((var5 & 32767) == var41.id && var6 == var41.quantity) { // L: 7834
										var41.remove(); // L: 7835
										break;
									}
								}

								if (var33.last() == null) { // L: 7840
									Client.groundItems[GameEngine.Client_plane][var36][var37] = null;
								}

								class121.updateItemPile(var36, var37); // L: 7841
							}
						}

					} else {
						if (class287.field3208 == var0) { // L: 7846
							var2 = var1.method9099(); // L: 7847
							var36 = var1.method9090(); // L: 7848
							var37 = var36 >> 4 & 15; // L: 7849
							var5 = var36 & 7; // L: 7850
							var6 = var1.method9089(); // L: 7851
							var7 = (var6 >> 4 & 7) + class9.field43; // L: 7852
							var38 = (var6 & 7) + FontName.field4882; // L: 7853
							var9 = var1.method9039(); // L: 7854
							if (var7 >= 0 && var38 >= 0 && var7 < 104 && var38 < 104) { // L: 7855
								var39 = var37 + 1; // L: 7856
								if (MusicPatchNode.localPlayer.pathX[0] >= var7 - var39 && MusicPatchNode.localPlayer.pathX[0] <= var39 + var7 && MusicPatchNode.localPlayer.pathY[0] >= var38 - var39 && MusicPatchNode.localPlayer.pathY[0] <= var38 + var39 && class20.clientPreferences.method2465() != 0 && var5 > 0 && Client.soundEffectCount < 50) { // L: 7857 7858
									Client.soundEffectIds[Client.soundEffectCount] = var2; // L: 7859
									Client.queuedSoundEffectLoops[Client.soundEffectCount] = var5; // L: 7860
									Client.queuedSoundEffectDelays[Client.soundEffectCount] = var9; // L: 7861
									Client.soundEffects[Client.soundEffectCount] = null; // L: 7862
									Client.soundLocations[Client.soundEffectCount] = var37 + (var38 << 8) + (var7 << 16); // L: 7863
									++Client.soundEffectCount; // L: 7864
								}
							}
						}

						if (class287.field3203 == var0) { // L: 7869
							var2 = var1.method9099(); // L: 7870
							var36 = var1.method9090(); // L: 7871
							var37 = (var36 >> 4 & 7) + class9.field43; // L: 7872
							var5 = (var36 & 7) + FontName.field4882; // L: 7873
							var6 = var1.method9089(); // L: 7874
							if (var37 >= 0 && var5 >= 0 && var37 < 104 && var5 < 104) { // L: 7875
								var33 = Client.groundItems[GameEngine.Client_plane][var37][var5]; // L: 7876
								if (var33 != null) { // L: 7877
									for (var41 = (TileItem)var33.last(); var41 != null; var41 = (TileItem)var33.previous()) { // L: 7878 7879 7884
										if ((var2 & 32767) == var41.id) { // L: 7880
											var41.method2663(var6); // L: 7881
											break;
										}
									}
								}
							}

						} else if (class287.field3199 != var0) { // L: 7890
							if (class287.field3206 == var0) { // L: 7945
								var2 = var1.method9089(); // L: 7946
								var36 = (var2 >> 4 & 7) + class9.field43; // L: 7947
								var37 = (var2 & 7) + FontName.field4882; // L: 7948
								var5 = var1.readUnsignedByte(); // L: 7949
								var6 = var5 >> 2; // L: 7950
								var7 = var5 & 3; // L: 7951
								var38 = Client.field563[var6]; // L: 7952
								if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) { // L: 7953
									class33.method508(GameEngine.Client_plane, var36, var37, var38, -1, var6, var7, 31, 0, -1); // L: 7954
								}

							} else if (class287.field3201 == var0) { // L: 7958
								var2 = var1.method9090(); // L: 7959
								var36 = var1.readUnsignedShort(); // L: 7960
								var37 = var1.method9039(); // L: 7961
								var5 = (var37 >> 4 & 7) + class9.field43; // L: 7962
								var6 = (var37 & 7) + FontName.field4882; // L: 7963
								var7 = var1.method9135(); // L: 7964
								if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 7965
									var5 = var5 * 128 + 64; // L: 7966
									var6 = var6 * 128 + 64; // L: 7967
									GraphicsObject var31 = new GraphicsObject(var7, GameEngine.Client_plane, var5, var6, class147.getTileHeight(var5, var6, GameEngine.Client_plane) - var2, var36, Client.cycle); // L: 7968
									Client.graphicsObjects.addFirst(var31); // L: 7969
								}

							}
						} else {
							var2 = var1.readUnsignedByte(); // L: 7891
							var36 = (var2 >> 4 & 7) + class9.field43; // L: 7892
							var37 = (var2 & 7) + FontName.field4882; // L: 7893
							var5 = var1.method9135(); // L: 7894
							var6 = var1.method9090(); // L: 7895
							var7 = var6 >> 2; // L: 7896
							var38 = var6 & 3; // L: 7897
							var9 = Client.field563[var7]; // L: 7898
							if (var36 >= 0 && var37 >= 0 && var36 < 103 && var37 < 103) { // L: 7899
								if (var9 == 0) { // L: 7900
									WallObject var32 = class31.scene.method4544(GameEngine.Client_plane, var36, var37); // L: 7901
									if (var32 != null) { // L: 7902
										var11 = InterfaceParent.Entity_unpackID(var32.tag); // L: 7903
										if (var7 == 2) { // L: 7904
											var32.renderable1 = new DynamicObject(var11, 2, var38 + 4, GameEngine.Client_plane, var36, var37, var5, false, var32.renderable1); // L: 7905
											var32.renderable2 = new DynamicObject(var11, 2, var38 + 1 & 3, GameEngine.Client_plane, var36, var37, var5, false, var32.renderable2); // L: 7906
										} else {
											var32.renderable1 = new DynamicObject(var11, var7, var38, GameEngine.Client_plane, var36, var37, var5, false, var32.renderable1); // L: 7908
										}

										return; // L: 7909
									}
								}

								if (var9 == 1) { // L: 7912
									DecorativeObject var42 = class31.scene.method4545(GameEngine.Client_plane, var36, var37); // L: 7913
									if (var42 != null) { // L: 7914
										var11 = InterfaceParent.Entity_unpackID(var42.tag); // L: 7915
										if (var7 != 4 && var7 != 5) { // L: 7916
											if (var7 == 6) { // L: 7917
												var42.renderable1 = new DynamicObject(var11, 4, var38 + 4, GameEngine.Client_plane, var36, var37, var5, false, var42.renderable1);
											} else if (var7 == 7) { // L: 7918
												var42.renderable1 = new DynamicObject(var11, 4, (var38 + 2 & 3) + 4, GameEngine.Client_plane, var36, var37, var5, false, var42.renderable1);
											} else if (var7 == 8) { // L: 7919
												var42.renderable1 = new DynamicObject(var11, 4, var38 + 4, GameEngine.Client_plane, var36, var37, var5, false, var42.renderable1); // L: 7920
												var42.renderable2 = new DynamicObject(var11, 4, (var38 + 2 & 3) + 4, GameEngine.Client_plane, var36, var37, var5, false, var42.renderable2); // L: 7921
											}
										} else {
											var42.renderable1 = new DynamicObject(var11, 4, var38, GameEngine.Client_plane, var36, var37, var5, false, var42.renderable1);
										}

										return; // L: 7923
									}
								}

								if (var9 == 2) { // L: 7926
									GameObject var43 = class31.scene.getGameObject(GameEngine.Client_plane, var36, var37); // L: 7927
									if (var7 == 11) { // L: 7928
										var7 = 10;
									}

									if (var43 != null) { // L: 7929
										var43.renderable = new DynamicObject(InterfaceParent.Entity_unpackID(var43.tag), var7, var38, GameEngine.Client_plane, var36, var37, var5, false, var43.renderable); // L: 7930
										return; // L: 7931
									}
								}

								if (var9 == 3) { // L: 7934
									GroundObject var45 = class31.scene.getGroundObject(GameEngine.Client_plane, var36, var37); // L: 7935
									if (var45 != null) { // L: 7936
										var45.renderable = new DynamicObject(InterfaceParent.Entity_unpackID(var45.tag), 22, var38, GameEngine.Client_plane, var36, var37, var5, false, var45.renderable); // L: 7937
										return; // L: 7938
									}
								}

								class186.method3736(GameEngine.Client_plane, var36, var37, var9, var5); // L: 7941
							}

						}
					}
				}
			}
		}
	} // L: 7694 7782 7806 7821 7844 7888 7943 7956 7971 7973
}
