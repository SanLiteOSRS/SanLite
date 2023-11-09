import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("aw")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("ay")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("ar")
	@Export("FileSystem_cacheFiles")
	public static Hashtable FileSystem_cacheFiles;

	static {
		FileSystem_hasPermissions = false; // L: 7
		FileSystem_cacheFiles = new Hashtable(16);
	} // L: 9

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lsa;III)I",
		garbageValue = "503830382"
	)
	static int method3540(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) { // L: 33
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1); // L: 34
			return var3 == null ? var2 : var3.integer; // L: 35 36
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lbq;Lpc;Lpc;I)V",
		garbageValue = "-2089610118"
	)
	static void method3539(GameEngine var0, Font var1, Font var2) {
		if (Login.worldSelectOpen) { // L: 326
			class20.method287(var0); // L: 327
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !KeyHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 330
				class150.clientPreferences.method2468(!class150.clientPreferences.method2469()); // L: 331
				if (!class150.clientPreferences.method2469()) { // L: 332
					ArrayList var3 = new ArrayList(); // L: 333
					var3.add(new class318(class13.archive11, "scape main", "", 255, false)); // L: 334
					UserComparator4.method2858(var3, 0, 0, 0, 100, false); // L: 335
				} else {
					RouteStrategy.method4227(0, 0); // L: 337
				}

				class306.field3398.clear(); // L: 339
			}

			if (Client.gameState != 5) { // L: 342
				if (Login.field951 == -1L) { // L: 343
					Login.field951 = class113.method2835() + 1000L; // L: 344
				}

				long var23 = class113.method2835(); // L: 346
				if (KeyHandler.method430() && -1L == Login.field952) { // L: 347 348
					Login.field952 = var23; // L: 349
					if (Login.field952 > Login.field951) { // L: 350
						Login.field951 = Login.field952; // L: 351
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 355
					int var5;
					if (Language.Language_EN == Interpreter.clientLanguage) { // L: 356
						if (MouseHandler.MouseHandler_lastButton == 1 || !KeyHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 357
							var5 = Login.xPadding + 5; // L: 358
							short var6 = 463; // L: 359
							byte var7 = 100; // L: 360
							byte var8 = 35; // L: 361
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + var7 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var8 + var6) { // L: 362
								if (DynamicObject.loadWorlds()) { // L: 364
									Login.worldSelectOpen = true; // L: 365
									Login.worldSelectPage = 0; // L: 366
									Login.worldSelectPagesCount = 0; // L: 367
								}

								return; // L: 370
							}
						}

						if (World.World_request != null && DynamicObject.loadWorlds()) { // L: 373 374
							Login.worldSelectOpen = true; // L: 375
							Login.worldSelectPage = 0; // L: 376
							Login.worldSelectPagesCount = 0; // L: 377
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton; // L: 381
					int var41 = MouseHandler.MouseHandler_lastPressedX; // L: 382
					int var42 = MouseHandler.MouseHandler_lastPressedY; // L: 383
					if (var5 == 0) { // L: 384
						var41 = MouseHandler.MouseHandler_x; // L: 385
						var42 = MouseHandler.MouseHandler_y; // L: 386
					}

					if (!KeyHandler.mouseCam && var5 == 4) { // L: 388
						var5 = 1;
					}

					class213 var25 = SceneTilePaint.method4952(); // L: 389
					short var44;
					int var45;
					if (Login.loginIndex == 0) { // L: 390
						boolean var50 = false; // L: 391

						while (var25.method4162()) { // L: 392
							if (var25.field2330 == 84) { // L: 393
								var50 = true; // L: 394
							}
						}

						var45 = Script.loginBoxCenter - 80; // L: 397
						var44 = 291; // L: 398
						if (var5 == 1 && var41 >= var45 - 75 && var41 <= var45 + 75 && var42 >= var44 - 20 && var42 <= var44 + 20) { // L: 399
							NPC.openURL(UrlRequest.method2850("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 400
						}

						var45 = Script.loginBoxCenter + 80; // L: 402
						if (var5 == 1 && var41 >= var45 - 75 && var41 <= var45 + 75 && var42 >= var44 - 20 && var42 <= var44 + 20 || var50) { // L: 403
							if ((Client.worldProperties & 33554432) != 0) { // L: 404
								Login.Login_response0 = ""; // L: 405
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 406
								Login.Login_response2 = "Your normal account will not be affected."; // L: 407
								Login.Login_response3 = ""; // L: 408
								class328.method6115(1); // L: 409
								class395.method7331(); // L: 410
							} else if ((Client.worldProperties & 4) != 0) { // L: 412
								if ((Client.worldProperties & 1024) != 0) { // L: 413
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 414
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 415
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 416
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 419
									Login.Login_response2 = "Players can attack each other"; // L: 420
									Login.Login_response3 = "almost everywhere."; // L: 421
								}

								Login.Login_response0 = "Warning!"; // L: 423
								class328.method6115(1); // L: 424
								class395.method7331(); // L: 425
							} else if ((Client.worldProperties & 1024) != 0) { // L: 427
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 428
								Login.Login_response2 = "The Protect Item prayer will"; // L: 429
								Login.Login_response3 = "not work on this world."; // L: 430
								Login.Login_response0 = "Warning!"; // L: 431
								class328.method6115(1); // L: 432
								class395.method7331(); // L: 433
							} else {
								PlayerComposition.Login_promptCredentials(false); // L: 436
							}
						}
					} else {
						int var9;
						short var10;
						if (Login.loginIndex == 1) { // L: 440
							while (true) {
								if (!var25.method4162()) { // L: 441
									var9 = Script.loginBoxCenter - 80; // L: 449
									var10 = 321; // L: 450
									if (var5 == 1 && var41 >= var9 - 75 && var41 <= var9 + 75 && var42 >= var10 - 20 && var42 <= var10 + 20) { // L: 451
										PlayerComposition.Login_promptCredentials(false); // L: 452
									}

									var9 = Script.loginBoxCenter + 80; // L: 454
									if (var5 == 1 && var41 >= var9 - 75 && var41 <= var9 + 75 && var42 >= var10 - 20 && var42 <= var10 + 20) { // L: 455
										class328.method6115(0); // L: 456
									}
									break;
								}

								if (var25.field2330 == 84) { // L: 442
									PlayerComposition.Login_promptCredentials(false); // L: 443
								} else if (var25.field2330 == 13) { // L: 445
									class328.method6115(0); // L: 446
								}
							}
						} else {
							short var43;
							boolean var46;
							if (Login.loginIndex == 2) { // L: 459
								var43 = 201; // L: 460
								var9 = var43 + 52; // L: 461
								if (var5 == 1 && var42 >= var9 - 12 && var42 < var9 + 2) { // L: 462
									Login.currentLoginField = 0;
								}

								var9 += 15; // L: 463
								if (var5 == 1 && var42 >= var9 - 12 && var42 < var9 + 2) { // L: 464
									Login.currentLoginField = 1;
								}

								var9 += 15; // L: 465
								var43 = 361; // L: 466
								if (class343.field3840 != null) { // L: 467
									var45 = class343.field3840.highX / 2; // L: 468
									if (var5 == 1 && var41 >= class343.field3840.lowX - var45 && var41 <= var45 + class343.field3840.lowX && var42 >= var43 - 15 && var42 < var43) { // L: 469
										switch(Login.field930) { // L: 470
										case 1:
											Actor.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 478
											class328.method6115(5); // L: 479
											return; // L: 480
										case 2:
											NPC.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 473
										}
									}
								}

								var45 = Script.loginBoxCenter - 80; // L: 485
								var44 = 321; // L: 486
								if (var5 == 1 && var41 >= var45 - 75 && var41 <= var45 + 75 && var42 >= var44 - 20 && var42 <= var44 + 20) { // L: 487
									Login.Login_username = Login.Login_username.trim(); // L: 488
									if (Login.Login_username.length() == 0) { // L: 489
										Actor.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 490
										return; // L: 491
									}

									if (Login.Login_password.length() == 0) { // L: 493
										Actor.setLoginResponseString("", "Please enter your password.", ""); // L: 494
										return; // L: 495
									}

									Actor.setLoginResponseString("", "Connecting to server...", ""); // L: 497
									GrandExchangeOfferTotalQuantityComparator.method6892(false); // L: 498
									class129.method2989(20); // L: 499
									return; // L: 500
								}

								var45 = Login.loginBoxX + 180 + 80; // L: 502
								if (var5 == 1 && var41 >= var45 - 75 && var41 <= var45 + 75 && var42 >= var44 - 20 && var42 <= var44 + 20) { // L: 503
									class328.method6115(0); // L: 504
									Login.Login_username = ""; // L: 505
									Login.Login_password = ""; // L: 506
									class424.field4622 = 0; // L: 507
									Login.otp = ""; // L: 508
									Login.field943 = true; // L: 509
								}

								var45 = Script.loginBoxCenter + -117; // L: 511
								var44 = 277; // L: 512
								Login.field955 = var41 >= var45 && var41 < var45 + class139.field1627 && var42 >= var44 && var42 < var44 + class453.field4760; // L: 513
								if (var5 == 1 && Login.field955) { // L: 514
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 515
									if (!Client.Login_isUsernameRemembered && class150.clientPreferences.method2483() != null) { // L: 516
										class150.clientPreferences.method2482((String)null); // L: 517
									}
								}

								var45 = Script.loginBoxCenter + 24; // L: 520
								var44 = 277; // L: 521
								Login.field947 = var41 >= var45 && var41 < var45 + class139.field1627 && var42 >= var44 && var42 < var44 + class453.field4760; // L: 522
								if (var5 == 1 && Login.field947) { // L: 523
									class150.clientPreferences.method2529(!class150.clientPreferences.method2467()); // L: 524
									if (!class150.clientPreferences.method2467()) { // L: 525
										Login.Login_username = ""; // L: 526
										class150.clientPreferences.method2482((String)null); // L: 527
										class395.method7331(); // L: 528
									}
								}

								label1351:
								while (true) {
									int var48;
									Transferable var54;
									do {
										while (true) {
											char var47;
											label1292:
											do {
												while (true) {
													while (var25.method4162()) { // L: 531
														if (var25.field2330 != 13) { // L: 532
															if (Login.currentLoginField != 0) { // L: 541
																continue label1292;
															}

															class60.method1183(var25.field2329); // L: 542
															if (var25.field2330 == 85 && Login.Login_username.length() > 0) { // L: 543
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var25.field2330 == 84 || var25.field2330 == 80) { // L: 544
																Login.currentLoginField = 1;
															}

															var47 = var25.field2329; // L: 546
															var46 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var47) != -1; // L: 548
															if (var46 && Login.Login_username.length() < 320) { // L: 550
																Login.Login_username = Login.Login_username + var25.field2329;
															}
														} else {
															class328.method6115(0); // L: 533
															Login.Login_username = ""; // L: 534
															Login.Login_password = ""; // L: 535
															class424.field4622 = 0; // L: 536
															Login.otp = ""; // L: 537
															Login.field943 = true; // L: 538
														}
													}

													return; // L: 1067
												}
											} while(Login.currentLoginField != 1); // L: 552

											if (var25.field2330 == 85 && Login.Login_password.length() > 0) { // L: 553
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 554
											} else if (var25.field2330 == 84 || var25.field2330 == 80) { // L: 556
												Login.currentLoginField = 0; // L: 557
												if (var25.field2330 == 84) { // L: 558
													Login.Login_username = Login.Login_username.trim(); // L: 559
													if (Login.Login_username.length() == 0) { // L: 560
														Actor.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 561
														return; // L: 562
													}

													if (Login.Login_password.length() == 0) { // L: 564
														Actor.setLoginResponseString("", "Please enter your password.", ""); // L: 565
														return; // L: 566
													}

													Actor.setLoginResponseString("", "Connecting to server...", ""); // L: 568
													GrandExchangeOfferTotalQuantityComparator.method6892(false); // L: 569
													class129.method2989(20); // L: 570
													return; // L: 571
												}
											}

											if ((var25.method4151(82) || var25.method4151(87)) && var25.field2330 == 67) { // L: 574
												Clipboard var53 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 575
												var54 = var53.getContents(TileItem.client); // L: 576
												var48 = 20 - Login.Login_password.length(); // L: 577
												break;
											}

											if (Script.method2169(var25.field2329)) { // L: 625
												var47 = var25.field2329; // L: 627
												var46 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var47) != -1; // L: 629
												if (var46 && Login.Login_password.length() < 20) { // L: 631 632
													Login.Login_password = Login.Login_password + var25.field2329; // L: 633
												}
											}
										}
									} while(var48 <= 0); // L: 578

									try {
										String var15 = (String)var54.getTransferData(DataFlavor.stringFlavor); // L: 580
										int var16 = Math.min(var48, var15.length()); // L: 581
										int var49 = 0;

										while (true) {
											if (var49 >= var16) {
												Login.Login_password = Login.Login_password + var15.substring(0, var16); // L: 619
												continue label1351;
											}

											char var51 = var15.charAt(var49); // L: 585
											boolean var18;
											if ((var51 < ' ' || var51 >= 127) && (var51 <= 127 || var51 >= 160) && (var51 <= 160 || var51 > 255)) { // L: 587
												label1479: {
													if (var51 != 0) { // L: 591
														char[] var20 = class385.cp1252AsciiExtension; // L: 593

														for (int var21 = 0; var21 < var20.length; ++var21) { // L: 594
															char var22 = var20[var21]; // L: 595
															if (var22 == var51) { // L: 597
																var18 = true; // L: 598
																break label1479; // L: 599
															}
														}
													}

													var18 = false; // L: 605
												}
											} else {
												var18 = true; // L: 588
											}

											if (!var18) { // L: 607
												break;
											}

											char var52 = var15.charAt(var49); // L: 609
											boolean var28 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var52) != -1; // L: 611
											if (!var28) { // L: 613
												break;
											}

											++var49; // L: 582
										}

										class328.method6115(3); // L: 615
										return; // L: 616
									} catch (UnsupportedFlavorException var39) { // L: 621
									} catch (IOException var40) { // L: 622
									}
								}
							} else {
								Bounds var29;
								if (Login.loginIndex == 3) { // L: 641
									var9 = Login.loginBoxX + 180; // L: 642
									var10 = 241; // L: 643
									var29 = var1.method7469(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var9, var10); // L: 644
									if (var5 == 1 && var29.method8205(var41, var42)) { // L: 645
										NPC.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 646
									}

									var9 = Login.loginBoxX + 180; // L: 648
									var10 = 276; // L: 649
									if (var5 == 1 && var41 >= var9 - 75 && var41 <= var9 + 75 && var42 >= var10 - 20 && var42 <= var10 + 20) { // L: 650
										class333.method6591(false); // L: 651
									}

									var9 = Login.loginBoxX + 180; // L: 653
									var10 = 326; // L: 654
									if (var5 == 1 && var41 >= var9 - 75 && var41 <= var9 + 75 && var42 >= var10 - 20 && var42 <= var10 + 20) { // L: 655
										Actor.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 656
										class328.method6115(5); // L: 657
										return; // L: 658
									}
								} else {
									int var12;
									if (Login.loginIndex == 4) { // L: 661
										var9 = Login.loginBoxX + 180 - 80; // L: 662
										var10 = 321; // L: 663
										if (var5 == 1 && var41 >= var9 - 75 && var41 <= var9 + 75 && var42 >= var10 - 20 && var42 <= var10 + 20) { // L: 664
											Login.otp.trim(); // L: 665
											if (Login.otp.length() != 6) { // L: 666
												Actor.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 667
												return; // L: 668
											}

											class424.field4622 = Integer.parseInt(Login.otp); // L: 670
											Login.otp = ""; // L: 671
											GrandExchangeOfferTotalQuantityComparator.method6892(true); // L: 672
											Actor.setLoginResponseString("", "Connecting to server...", ""); // L: 673
											class129.method2989(20); // L: 674
											return; // L: 675
										}

										if (var5 == 1 && var41 >= Login.loginBoxX + 180 - 9 && var41 <= Login.loginBoxX + 180 + 130 && var42 >= 263 && var42 <= 296) { // L: 677
											Login.field943 = !Login.field943; // L: 678
										}

										if (var5 == 1 && var41 >= Login.loginBoxX + 180 - 34 && var41 <= Login.loginBoxX + 34 + 180 && var42 >= 351 && var42 <= 363) { // L: 680
											NPC.openURL(UrlRequest.method2850("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 681
										}

										var9 = Login.loginBoxX + 180 + 80; // L: 683
										if (var5 == 1 && var41 >= var9 - 75 && var41 <= var9 + 75 && var42 >= var10 - 20 && var42 <= var10 + 20) { // L: 684
											class328.method6115(0); // L: 685
											Login.Login_username = ""; // L: 686
											Login.Login_password = ""; // L: 687
											class424.field4622 = 0; // L: 688
											Login.otp = ""; // L: 689
										}

										while (var25.method4162()) { // L: 691
											boolean var11 = false; // L: 692

											for (var12 = 0; var12 < "1234567890".length(); ++var12) { // L: 693
												if (var25.field2329 == "1234567890".charAt(var12)) { // L: 694
													var11 = true; // L: 695
													break; // L: 696
												}
											}

											if (var25.field2330 == 13) { // L: 699
												class328.method6115(0); // L: 700
												Login.Login_username = ""; // L: 701
												Login.Login_password = ""; // L: 702
												class424.field4622 = 0; // L: 703
												Login.otp = ""; // L: 704
											} else {
												if (var25.field2330 == 85 && Login.otp.length() > 0) { // L: 707
													Login.otp = Login.otp.substring(0, Login.otp.length() - 1);
												}

												if (var25.field2330 == 84) { // L: 708
													Login.otp.trim(); // L: 709
													if (Login.otp.length() != 6) { // L: 710
														Actor.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 711
														return; // L: 712
													}

													class424.field4622 = Integer.parseInt(Login.otp); // L: 714
													Login.otp = ""; // L: 715
													GrandExchangeOfferTotalQuantityComparator.method6892(true); // L: 716
													Actor.setLoginResponseString("", "Connecting to server...", ""); // L: 717
													class129.method2989(20); // L: 718
													return; // L: 719
												}

												if (var11 && Login.otp.length() < 6) { // L: 721
													Login.otp = Login.otp + var25.field2329;
												}
											}
										}
									} else {
										int var13;
										if (Login.loginIndex == 5) { // L: 725
											var9 = Login.loginBoxX + 180 - 80; // L: 726
											var10 = 321; // L: 727
											if (var5 == 1 && var41 >= var9 - 75 && var41 <= var9 + 75 && var42 >= var10 - 20 && var42 <= var10 + 20) { // L: 728
												World.method1844(); // L: 729
												return; // L: 730
											}

											var9 = Login.loginBoxX + 180 + 80; // L: 732
											if (var5 == 1 && var41 >= var9 - 75 && var41 <= var9 + 75 && var42 >= var10 - 20 && var42 <= var10 + 20) { // L: 733
												PlayerComposition.Login_promptCredentials(true); // L: 734
											}

											var44 = 361; // L: 736
											if (class313.field3475 != null) { // L: 737
												var12 = class313.field3475.highX / 2; // L: 738
												if (var5 == 1 && var41 >= class313.field3475.lowX - var12 && var41 <= var12 + class313.field3475.lowX && var42 >= var44 - 15 && var42 < var44) { // L: 739
													NPC.openURL(UrlRequest.method2850("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 740
												}
											}

											while (var25.method4162()) { // L: 743
												var46 = false; // L: 744

												for (var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var13) { // L: 745
													if (var25.field2329 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13)) { // L: 746
														var46 = true; // L: 747
														break; // L: 748
													}
												}

												if (var25.field2330 == 13) { // L: 751
													PlayerComposition.Login_promptCredentials(true); // L: 752
												} else {
													if (var25.field2330 == 85 && Login.Login_username.length() > 0) { // L: 755
														Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
													}

													if (var25.field2330 == 84) { // L: 756
														World.method1844(); // L: 757
														return; // L: 758
													}

													if (var46 && Login.Login_username.length() < 320) { // L: 760
														Login.Login_username = Login.Login_username + var25.field2329;
													}
												}
											}
										} else if (Login.loginIndex != 6) { // L: 764
											if (Login.loginIndex == 7) { // L: 775
												if (Message.field506 && !Client.onMobile) { // L: 776
													var9 = Script.loginBoxCenter - 150; // L: 777
													var45 = var9 + 40 + 240 + 25; // L: 778
													var44 = 231; // L: 779
													var12 = var44 + 40; // L: 780
													if (var5 == 1 && var41 >= var9 && var41 <= var45 && var42 >= var44 && var42 <= var12) { // L: 781
														Login.field938 = class152.method3212(var9, var41); // L: 782
													}

													var13 = Login.loginBoxX + 180 - 80; // L: 784
													short var14 = 321; // L: 785
													boolean var17;
													boolean var19;
													Date var30;
													boolean var32;
													java.util.Calendar var33;
													Date var34;
													if (var5 == 1 && var41 >= var13 - 75 && var41 <= var13 + 75 && var42 >= var14 - 20 && var42 <= var14 + 20) { // L: 786
														label1195: {
															try {
																var30 = class16.method215(); // L: 791
															} catch (ParseException var38) { // L: 793
																class328.method6115(7); // L: 795
																Actor.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 796
																var32 = false; // L: 798
																break label1195; // L: 799
															}

															if (var30 == null) { // L: 801
																var32 = false; // L: 802
															} else {
																var33 = java.util.Calendar.getInstance(); // L: 807
																var33.set(1, var33.get(1) - 13); // L: 808
																var33.set(5, var33.get(5) + 1); // L: 809
																var33.set(11, 0); // L: 810
																var33.set(12, 0); // L: 811
																var33.set(13, 0); // L: 812
																var33.set(14, 0); // L: 813
																var34 = var33.getTime(); // L: 814
																var17 = var30.before(var34); // L: 815
																var19 = class453.method8341(var30); // L: 818
																if (!var19) { // L: 819
																	class328.method6115(7); // L: 821
																	Actor.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 822
																	var32 = false; // L: 824
																} else {
																	if (!var17) { // L: 827
																		World.field835 = 8388607; // L: 828
																	} else {
																		World.field835 = (int)(var30.getTime() / 86400000L - 11745L); // L: 831
																	}

																	var32 = true; // L: 833
																}
															}
														}

														if (var32) { // L: 836
															class129.method2989(50); // L: 837
															return; // L: 838
														}
													}

													var13 = Login.loginBoxX + 180 + 80; // L: 841
													if (var5 == 1 && var41 >= var13 - 75 && var41 <= var13 + 75 && var42 >= var14 - 20 && var42 <= var14 + 20) { // L: 842
														Login.field953 = new String[8]; // L: 843
														PlayerComposition.Login_promptCredentials(true); // L: 844
													}

													while (var25.method4162()) { // L: 846
														if (var25.field2330 == 101) { // L: 847
															Login.field953[Login.field938] = null; // L: 848
														}

														if (var25.field2330 == 85) { // L: 850
															if (Login.field953[Login.field938] == null && Login.field938 > 0) { // L: 851
																--Login.field938; // L: 852
															}

															Login.field953[Login.field938] = null; // L: 854
														}

														if (var25.field2329 >= '0' && var25.field2329 <= '9') { // L: 856
															Login.field953[Login.field938] = "" + var25.field2329; // L: 857
															if (Login.field938 < 7) { // L: 858
																++Login.field938; // L: 859
															}
														}

														if (var25.field2330 == 84) { // L: 862
															label1131: {
																try {
																	var30 = class16.method215(); // L: 867
																} catch (ParseException var37) { // L: 869
																	class328.method6115(7); // L: 871
																	Actor.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 872
																	var32 = false; // L: 874
																	break label1131; // L: 875
																}

																if (var30 == null) { // L: 877
																	var32 = false; // L: 878
																} else {
																	var33 = java.util.Calendar.getInstance(); // L: 883
																	var33.set(1, var33.get(1) - 13); // L: 884
																	var33.set(5, var33.get(5) + 1); // L: 885
																	var33.set(11, 0); // L: 886
																	var33.set(12, 0); // L: 887
																	var33.set(13, 0); // L: 888
																	var33.set(14, 0); // L: 889
																	var34 = var33.getTime(); // L: 890
																	var17 = var30.before(var34); // L: 891
																	var19 = class453.method8341(var30); // L: 894
																	if (!var19) { // L: 895
																		class328.method6115(7); // L: 897
																		Actor.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 898
																		var32 = false; // L: 900
																	} else {
																		if (!var17) { // L: 903
																			World.field835 = 8388607; // L: 904
																		} else {
																			World.field835 = (int)(var30.getTime() / 86400000L - 11745L); // L: 907
																		}

																		var32 = true; // L: 909
																	}
																}
															}

															if (var32) { // L: 912
																class129.method2989(50); // L: 913
															}

															return; // L: 915
														}
													}
												} else {
													var9 = Login.loginBoxX + 180 - 80; // L: 920
													var10 = 321; // L: 921
													if (var5 == 1 && var41 >= var9 - 75 && var41 <= var9 + 75 && var42 >= var10 - 20 && var42 <= var10 + 20) { // L: 922
														NPC.openURL(UrlRequest.method2850("secure", true) + "m=dob/set_dob.ws", true, false); // L: 923
														Actor.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 924
														class328.method6115(6); // L: 925
														return; // L: 926
													}

													var9 = Login.loginBoxX + 180 + 80; // L: 928
													if (var5 == 1 && var41 >= var9 - 75 && var41 <= var9 + 75 && var42 >= var10 - 20 && var42 <= var10 + 20) { // L: 929
														PlayerComposition.Login_promptCredentials(true); // L: 930
													}
												}
											} else if (Login.loginIndex == 8) { // L: 934
												var9 = Login.loginBoxX + 180 - 80; // L: 935
												var10 = 321; // L: 936
												if (var5 == 1 && var41 >= var9 - 75 && var41 <= var9 + 75 && var42 >= var10 - 20 && var42 <= var10 + 20) { // L: 937
													NPC.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 938
													Actor.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 939
													class328.method6115(6); // L: 940
													return; // L: 941
												}

												var9 = Login.loginBoxX + 180 + 80; // L: 943
												if (var5 == 1 && var41 >= var9 - 75 && var41 <= var9 + 75 && var42 >= var10 - 20 && var42 <= var10 + 20) { // L: 944
													PlayerComposition.Login_promptCredentials(true); // L: 945
												}
											} else if (Login.loginIndex == 9) { // L: 948
												var9 = Login.loginBoxX + 180; // L: 949
												var10 = 311; // L: 950
												if (var25.field2330 == 84 || var25.field2330 == 13 || var5 == 1 && var41 >= var9 - 75 && var41 <= var9 + 75 && var42 >= var10 - 20 && var42 <= var10 + 20) { // L: 951
													class333.method6591(false); // L: 952
												}
											} else if (Login.loginIndex == 10) { // L: 955
												var9 = Login.loginBoxX + 180; // L: 956
												var10 = 209; // L: 957
												if (var25.field2330 == 84 || var5 == 1 && var41 >= var9 - 109 && var41 <= var9 + 109 && var42 >= var10 && var42 <= var10 + 68) { // L: 958
													Actor.setLoginResponseString("", "Connecting to server...", ""); // L: 959
													Client.field556 = class518.field5122; // L: 960
													GrandExchangeOfferTotalQuantityComparator.method6892(false); // L: 961
													class129.method2989(20); // L: 962
												}
											} else if (Login.loginIndex == 12) { // L: 965
												var9 = Script.loginBoxCenter; // L: 966
												var10 = 233; // L: 967
												var29 = var2.method7469(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 968
												Bounds var26 = var2.method7469(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 969
												Bounds var27 = var2.method7469(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 970
												var45 = var10 + 17; // L: 971
												Bounds var35 = var2.method7469(0, 34, "<col=ffd200>agreement (EULA)</col>.", var9, var45); // L: 972
												if (var5 == 1) { // L: 973
													if (var29.method8205(var41, var42)) { // L: 974
														NPC.openURL("https://www.jagex.com/terms", true, false); // L: 975
													} else if (var26.method8205(var41, var42)) { // L: 977
														NPC.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 978
													} else if (var27.method8205(var41, var42) || var35.method8205(var41, var42)) { // L: 980
														NPC.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 981
													}
												}

												var9 = Script.loginBoxCenter - 80; // L: 984
												var10 = 311; // L: 985
												if (var5 == 1 && var41 >= var9 - 75 && var41 <= var9 + 75 && var42 >= var10 - 20 && var42 <= var10 + 20) { // L: 986
													class150.clientPreferences.method2484(Client.field521); // L: 988
													class333.method6591(true); // L: 990
												}

												var9 = Script.loginBoxCenter + 80; // L: 992
												if (var5 == 1 && var41 >= var9 - 75 && var41 <= var9 + 75 && var42 >= var10 - 20 && var42 <= var10 + 20) { // L: 993
													Login.loginIndex = 13; // L: 994
												}
											} else if (Login.loginIndex == 13) { // L: 997
												var9 = Script.loginBoxCenter; // L: 998
												var10 = 321; // L: 999
												if (var5 == 1 && var41 >= var9 - 75 && var41 <= var9 + 75 && var42 >= var10 - 20 && var42 <= var10 + 20) { // L: 1000
													class333.method6591(true); // L: 1001
												}
											} else if (Login.loginIndex == 14) { // L: 1004
												String var36 = ""; // L: 1005
												switch(Login.field929) { // L: 1006
												case 0:
													var36 = "https://secure.runescape.com/m=offence-appeal/account-history"; // L: 1011
													break; // L: 1012
												case 1:
													var36 = "https://secure.runescape.com/m=accountappeal/passwordrecovery"; // L: 1017
													break;
												case 2:
													var36 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance"; // L: 1008
													break; // L: 1009
												default:
													PlayerComposition.Login_promptCredentials(false); // L: 1014
												}

												var45 = Login.loginBoxX + 180; // L: 1020
												var44 = 276; // L: 1021
												if (var5 == 1 && var41 >= var45 - 75 && var41 <= var45 + 75 && var42 >= var44 - 20 && var42 <= var44 + 20) { // L: 1022
													NPC.openURL(var36, true, false); // L: 1023
													Actor.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1024
													class328.method6115(6); // L: 1025
													return; // L: 1026
												}

												var45 = Login.loginBoxX + 180; // L: 1028
												var44 = 326; // L: 1029
												if (var5 == 1 && var41 >= var45 - 75 && var41 <= var45 + 75 && var42 >= var44 - 20 && var42 <= var44 + 20) { // L: 1030
													PlayerComposition.Login_promptCredentials(false); // L: 1031
												}
											} else if (Login.loginIndex == 24) { // L: 1034
												var9 = Login.loginBoxX + 180; // L: 1035
												var10 = 301; // L: 1036
												if (var5 == 1 && var41 >= var9 - 75 && var41 <= var9 + 75 && var42 >= var10 - 20 && var42 <= var10 + 20) { // L: 1037
													class333.method6591(false); // L: 1038
												}
											} else if (Login.loginIndex == 32) { // L: 1041
												var9 = Login.loginBoxX + 180 - 80; // L: 1042
												var10 = 321; // L: 1043
												if (var5 == 1 && var41 >= var9 - 75 && var41 <= var9 + 75 && var42 >= var10 - 20 && var42 <= var10 + 20) { // L: 1044
													NPC.openURL(UrlRequest.method2850("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1045
													Actor.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1046
													class328.method6115(6); // L: 1047
													return; // L: 1048
												}

												var9 = Login.loginBoxX + 180 + 80; // L: 1050
												if (var5 == 1 && var41 >= var9 - 75 && var41 <= var9 + 75 && var42 >= var10 - 20 && var42 <= var10 + 20) { // L: 1051
													PlayerComposition.Login_promptCredentials(true); // L: 1052
												}
											} else if (Login.loginIndex == 33) { // L: 1055
												var9 = Login.loginBoxX + 180; // L: 1056
												var10 = 276; // L: 1057
												if (var5 == 1 && var41 >= var9 - 75 && var41 <= var9 + 75 && var42 >= var10 - 20 && var42 <= var10 + 20) { // L: 1058
													NPC.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 1059
												}

												var9 = Login.loginBoxX + 180; // L: 1061
												var10 = 326; // L: 1062
												if (var5 == 1 && var41 >= var9 - 75 && var41 <= var9 + 75 && var42 >= var10 - 20 && var42 <= var10 + 20) { // L: 1063
													PlayerComposition.Login_promptCredentials(true); // L: 1064
												}
											}
										} else {
											while (true) {
												do {
													if (!var25.method4162()) { // L: 765
														var43 = 321; // L: 770
														if (var5 == 1 && var42 >= var43 - 20 && var42 <= var43 + 20) { // L: 771
															PlayerComposition.Login_promptCredentials(true); // L: 772
														}

														return;
													}
												} while(var25.field2330 != 84 && var25.field2330 != 13); // L: 766

												PlayerComposition.Login_promptCredentials(true); // L: 767
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
	} // L: 328

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Lud;",
		garbageValue = "-79"
	)
	static SpritePixels method3536() {
		SpritePixels var0 = new SpritePixels(); // L: 191
		var0.width = class528.SpriteBuffer_spriteWidth; // L: 192
		var0.height = class528.SpriteBuffer_spriteHeight; // L: 193
		var0.xOffset = class492.SpriteBuffer_xOffsets[0]; // L: 194
		var0.yOffset = class134.SpriteBuffer_yOffsets[0]; // L: 195
		var0.subWidth = class172.SpriteBuffer_spriteWidths[0]; // L: 196
		var0.subHeight = class528.SpriteBuffer_spriteHeights[0]; // L: 197
		int var1 = var0.subHeight * var0.subWidth; // L: 198
		byte[] var2 = ArchiveDiskAction.SpriteBuffer_pixels[0]; // L: 199
		var0.pixels = new int[var1]; // L: 200

		for (int var3 = 0; var3 < var1; ++var3) { // L: 201
			var0.pixels[var3] = class528.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		class506.method8985(); // L: 202
		return var0; // L: 203
	}
}
