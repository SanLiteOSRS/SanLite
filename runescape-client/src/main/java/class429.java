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
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
public class class429 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1041183919
	)
	int field4637;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1790801963
	)
	int field4642;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 216391257
	)
	int field4639;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 965742671
	)
	int field4640;

	public String toString() {
		boolean var1 = true; // L: 15
		int var2 = 10 - Integer.toString(this.field4637).length(); // L: 16
		int var3 = 10 - Integer.toString(this.field4639).length(); // L: 17
		int var4 = 10 - Integer.toString(this.field4642).length(); // L: 18
		String var5 = "          ".substring(10 - var2); // L: 19
		String var6 = "          ".substring(10 - var3); // L: 20
		String var7 = "          ".substring(10 - var4); // L: 21
		return "    Size: " + this.field4637 + var5 + "Created: " + this.field4642 + var7 + "Total used: " + this.field4639 + var6 + "Max-In-Use: " + this.field4640; // L: 22
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lbm;Lpb;Lpb;I)V",
		garbageValue = "-1632590840"
	)
	static void method8088(GameEngine var0, Font var1, Font var2) {
		if (Login.worldSelectOpen) { // L: 357
			class202.method3919(var0); // L: 358
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class524.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 361
				class30.clientPreferences.method2534(!class30.clientPreferences.method2580()); // L: 362
				if (!class30.clientPreferences.method2580()) { // L: 364
					ArrayList var3 = new ArrayList(); // L: 365
					var3.add(new class333(Renderable.field2921, "scape main", "", 255, false)); // L: 366
					PacketWriter.method2891(var3, 0, 0, 0, 100, false); // L: 367
				} else {
					class169.method3521(0, 0); // L: 369
				}

				GrandExchangeOfferOwnWorldComparator.method1192(); // L: 371
			}

			if (Client.gameState != 5) { // L: 373
				if (Login.field974 == -1L) { // L: 374
					Login.field974 = SecureRandomCallable.method2320() + 1000L; // L: 375
				}

				long var24 = SecureRandomCallable.method2320(); // L: 377
				boolean var5;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 380
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) { // L: 384
							var5 = true; // L: 392
							break;
						}

						ArchiveLoader var6 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 385
						if (!var6.isLoaded()) { // L: 386
							var5 = false; // L: 387
							break; // L: 388
						}

						++Client.archiveLoadersDone; // L: 390
					}
				} else {
					var5 = true; // L: 381
				}

				if (var5 && Login.field975 == -1L) { // L: 394 395
					Login.field975 = var24; // L: 396
					if (Login.field975 > Login.field974) { // L: 397
						Login.field974 = Login.field975; // L: 398
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 402
					int var26;
					if (WorldMapCacheName.clientLanguage == Language.Language_EN) { // L: 403
						if (MouseHandler.MouseHandler_lastButton == 1 || !class524.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 404
							var26 = Login.xPadding + 5; // L: 405
							short var7 = 463; // L: 406
							byte var8 = 100; // L: 407
							byte var9 = 35; // L: 408
							if (MouseHandler.MouseHandler_lastPressedX >= var26 && MouseHandler.MouseHandler_lastPressedX <= var8 + var26 && MouseHandler.MouseHandler_lastPressedY >= var7 && MouseHandler.MouseHandler_lastPressedY <= var7 + var9) { // L: 409
								if (FileSystem.loadWorlds()) { // L: 411
									Login.worldSelectOpen = true; // L: 412
									Login.worldSelectPage = 0; // L: 413
									Login.worldSelectPagesCount = 0; // L: 414
								}

								return; // L: 417
							}
						}

						if (PacketBufferNode.World_request != null && FileSystem.loadWorlds()) { // L: 420 421
							Login.worldSelectOpen = true; // L: 422
							Login.worldSelectPage = 0; // L: 423
							Login.worldSelectPagesCount = 0; // L: 424
						}
					}

					var26 = MouseHandler.MouseHandler_lastButton; // L: 428
					int var54 = MouseHandler.MouseHandler_lastPressedX; // L: 429
					int var55 = MouseHandler.MouseHandler_lastPressedY; // L: 430
					if (var26 == 0) { // L: 431
						var54 = MouseHandler.MouseHandler_x; // L: 432
						var55 = MouseHandler.MouseHandler_y; // L: 433
					}

					if (!class524.mouseCam && var26 == 4) { // L: 435
						var26 = 1;
					}

					class228 var27 = PacketBufferNode.method6051(); // L: 436
					short var57;
					int var58;
					if (Login.loginIndex == 0) { // L: 437
						boolean var67 = false; // L: 438

						while (var27.method4431()) { // L: 439
							if (var27.field2434 == 84) { // L: 440
								var67 = true; // L: 441
							}
						}

						var58 = Login.loginBoxCenter - 80; // L: 444
						var57 = 291; // L: 445
						if (var26 == 1 && var54 >= var58 - 75 && var54 <= var58 + 75 && var55 >= var57 - 20 && var55 <= var57 + 20) { // L: 446
							class137.openURL(class317.method6073("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 447
						}

						var58 = Login.loginBoxCenter + 80; // L: 449
						if (var26 == 1 && var54 >= var58 - 75 && var54 <= var58 + 75 && var55 >= var57 - 20 && var55 <= var57 + 20 || var67) { // L: 450
							class485.method8806(); // L: 451
						}
					} else {
						int var10;
						short var11;
						if (Login.loginIndex == 1) { // L: 454
							while (true) {
								if (!var27.method4431()) { // L: 455
									var10 = Login.loginBoxCenter - 80; // L: 463
									var11 = 321; // L: 464
									if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 465
										class148.Login_promptCredentials(false); // L: 466
									}

									var10 = Login.loginBoxCenter + 80; // L: 468
									if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 469
										JagexCache.method4224(0); // L: 470
									}
									break;
								}

								if (var27.field2434 == 84) { // L: 456
									class148.Login_promptCredentials(false); // L: 457
								} else if (var27.field2434 == 13) { // L: 459
									JagexCache.method4224(0); // L: 460
								}
							}
						} else {
							int var14;
							short var56;
							if (Login.loginIndex == 2) { // L: 473
								var56 = 201; // L: 474
								var10 = var56 + 52; // L: 475
								if (var26 == 1 && var55 >= var10 - 12 && var55 < var10 + 2) { // L: 476
									Login.currentLoginField = 0;
								}

								var10 += 15; // L: 477
								if (var26 == 1 && var55 >= var10 - 12 && var55 < var10 + 2) { // L: 478
									Login.currentLoginField = 1;
								}

								var10 += 15; // L: 479
								var56 = 361; // L: 480
								if (class9.field35 != null) { // L: 481
									var58 = class9.field35.highX / 2; // L: 482
									if (var26 == 1 && var54 >= class9.field35.lowX - var58 && var54 <= var58 + class9.field35.lowX && var55 >= var56 - 15 && var55 < var56) { // L: 483
										switch(Login.field977) { // L: 484
										case 1:
											class137.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false); // L: 487
											return; // L: 488
										case 2:
											class137.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 492
										}
									}
								}

								var58 = Login.loginBoxCenter - 80; // L: 498
								var57 = 321; // L: 499
								if (var26 == 1 && var54 >= var58 - 75 && var54 <= var58 + 75 && var55 >= var57 - 20 && var55 <= var57 + 20) { // L: 500
									class109.method2796(); // L: 501
									return; // L: 502
								}

								var58 = Login.loginBoxX + 180 + 80; // L: 504
								if (var26 == 1 && var54 >= var58 - 75 && var54 <= var58 + 75 && var55 >= var57 - 20 && var55 <= var57 + 20) { // L: 505
									JagexCache.method4224(0); // L: 506
									Login.Login_username = ""; // L: 507
									Login.Login_password = ""; // L: 508
									class36.field247 = 0; // L: 509
									MenuAction.otp = ""; // L: 510
									Login.field966 = true; // L: 511
								}

								var58 = Login.loginBoxCenter + -117; // L: 513
								var57 = 277; // L: 514
								Login.field979 = var54 >= var58 && var54 < var58 + FriendSystem.field859 && var55 >= var57 && var55 < var57 + class316.field3448; // L: 515
								if (var26 == 1 && Login.field979) { // L: 516
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 517
									if (!Client.Login_isUsernameRemembered && class30.clientPreferences.method2629() != null) { // L: 518
										class30.clientPreferences.method2548((String)null); // L: 519
									}
								}

								var58 = Login.loginBoxCenter + 24; // L: 522
								var57 = 277; // L: 523
								Login.field965 = var54 >= var58 && var54 < var58 + FriendSystem.field859 && var55 >= var57 && var55 < var57 + class316.field3448; // L: 524
								if (var26 == 1 && Login.field965) { // L: 525
									class30.clientPreferences.method2532(!class30.clientPreferences.method2533()); // L: 526
									if (!class30.clientPreferences.method2533()) { // L: 527
										Login.Login_username = ""; // L: 528
										class30.clientPreferences.method2548((String)null); // L: 529
										Message.method1182(); // L: 530
									}
								}

								while (true) {
									int var62;
									Transferable var70;
									do {
										while (true) {
											label1349:
											do {
												while (true) {
													while (var27.method4431()) { // L: 533
														if (var27.field2434 != 13) { // L: 534
															if (Login.currentLoginField != 0) { // L: 543
																continue label1349;
															}

															char var61 = var27.field2428; // L: 544

															for (var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var61 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14); ++var14) { // L: 546 547
															}

															if (var27.field2434 == 85 && Login.Login_username.length() > 0) { // L: 550
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var27.field2434 == 84 || var27.field2434 == 80) { // L: 551
																Login.currentLoginField = 1;
															}

															if (HorizontalAlignment.method3688(var27.field2428) && Login.Login_username.length() < 320) { // L: 552
																Login.Login_username = Login.Login_username + var27.field2428;
															}
														} else {
															JagexCache.method4224(0); // L: 535
															Login.Login_username = ""; // L: 536
															Login.Login_password = ""; // L: 537
															class36.field247 = 0; // L: 538
															MenuAction.otp = ""; // L: 539
															Login.field966 = true; // L: 540
														}
													}

													return; // L: 1139
												}
											} while(Login.currentLoginField != 1); // L: 554

											if (var27.field2434 == 85 && Login.Login_password.length() > 0) { // L: 555
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 556
											} else if (var27.field2434 == 84 || var27.field2434 == 80) { // L: 558
												Login.currentLoginField = 0; // L: 559
												if (var27.field2434 == 84) { // L: 560
													class109.method2796(); // L: 561
													return; // L: 562
												}
											}

											if ((var27.method4466(82) || var27.method4466(87)) && var27.field2434 == 67) { // L: 565
												Clipboard var69 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 566
												var70 = var69.getContents(class193.client); // L: 567
												var62 = 20 - Login.Login_password.length(); // L: 568
												break;
											}

											if (class344.method6465(var27.field2428) && HorizontalAlignment.method3688(var27.field2428) && Login.Login_password.length() < 20) { // L: 585
												Login.Login_password = Login.Login_password + var27.field2428; // L: 586
											}
										}
									} while(var62 <= 0); // L: 569

									try {
										String var63 = (String)var70.getTransferData(DataFlavor.stringFlavor); // L: 571
										int var17 = Math.min(var62, var63.length()); // L: 572

										for (int var64 = 0; var64 < var17; ++var64) { // L: 573
											if (!class344.method6465(var63.charAt(var64)) || !HorizontalAlignment.method3688(var63.charAt(var64))) { // L: 574
												JagexCache.method4224(3); // L: 575
												return; // L: 576
											}
										}

										Login.Login_password = Login.Login_password + var63.substring(0, var17); // L: 579
									} catch (UnsupportedFlavorException var52) { // L: 581
									} catch (IOException var53) { // L: 582
									}
								}
							} else {
								Bounds var30;
								if (Login.loginIndex == 3) { // L: 592
									var10 = Login.loginBoxX + 180; // L: 593
									var11 = 241; // L: 594
									var30 = var1.method7882(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var10, var11); // L: 595
									if (var26 == 1 && var30.method8552(var54, var55)) { // L: 596
										class137.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 597
									}

									var10 = Login.loginBoxX + 180; // L: 599
									var11 = 276; // L: 600
									if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 601
										PacketBufferNode.method6050(false); // L: 602
									}

									var10 = Login.loginBoxX + 180; // L: 604
									var11 = 326; // L: 605
									if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 606
										class137.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false); // L: 607
										return; // L: 608
									}
								} else {
									int var13;
									if (Login.loginIndex == 4) { // L: 611
										var10 = Login.loginBoxX + 180 - 80; // L: 612
										var11 = 321; // L: 613
										if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 614
											ChatChannel.method2249(); // L: 615
											return; // L: 616
										}

										if (var26 == 1 && var54 >= Login.loginBoxX + 180 - 9 && var54 <= Login.loginBoxX + 180 + 130 && var55 >= 263 && var55 <= 296) { // L: 618
											Login.field966 = !Login.field966; // L: 619
										}

										if (var26 == 1 && var54 >= Login.loginBoxX + 180 - 34 && var54 <= Login.loginBoxX + 34 + 180 && var55 >= 351 && var55 <= 363) { // L: 621
											class137.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false); // L: 622
										}

										var10 = Login.loginBoxX + 180 + 80; // L: 624
										if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 625
											JagexCache.method4224(0); // L: 626
											Login.Login_username = ""; // L: 627
											Login.Login_password = ""; // L: 628
											class36.field247 = 0; // L: 629
											MenuAction.otp = ""; // L: 630
										}

										while (var27.method4431()) { // L: 632
											boolean var12 = false; // L: 633

											for (var13 = 0; var13 < "1234567890".length(); ++var13) { // L: 634
												if (var27.field2428 == "1234567890".charAt(var13)) { // L: 635
													var12 = true; // L: 636
													break; // L: 637
												}
											}

											if (var27.field2434 == 13) { // L: 640
												JagexCache.method4224(0); // L: 641
												Login.Login_username = ""; // L: 642
												Login.Login_password = ""; // L: 643
												class36.field247 = 0; // L: 644
												MenuAction.otp = ""; // L: 645
											} else {
												if (var27.field2434 == 85 && MenuAction.otp.length() > 0) { // L: 648
													MenuAction.otp = MenuAction.otp.substring(0, MenuAction.otp.length() - 1);
												}

												if (var27.field2434 == 84) { // L: 649
													ChatChannel.method2249(); // L: 650
													return; // L: 651
												}

												if (var12 && MenuAction.otp.length() < 6) { // L: 653
													MenuAction.otp = MenuAction.otp + var27.field2428;
												}
											}
										}
									} else {
										int var22;
										if (Login.loginIndex == 5) { // L: 657
											var10 = Login.loginBoxX + 180 - 80; // L: 658
											var11 = 321; // L: 659
											if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 660
												Login.Login_username = Login.Login_username.trim(); // L: 662
												if (Login.Login_username.length() == 0) { // L: 663
													class114.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 664
												} else {
													long var34;
													try {
														URL var31 = new URL(class317.method6073("services", false) + "m=accountappeal/login.ws"); // L: 671
														URLConnection var16 = var31.openConnection(); // L: 672
														var16.setRequestProperty("connection", "close"); // L: 673
														var16.setDoInput(true); // L: 674
														var16.setDoOutput(true); // L: 675
														var16.setConnectTimeout(5000); // L: 676
														OutputStreamWriter var72 = new OutputStreamWriter(var16.getOutputStream()); // L: 677
														var72.write("data1=req"); // L: 678
														var72.flush(); // L: 679
														InputStream var74 = var16.getInputStream(); // L: 680
														Buffer var65 = new Buffer(new byte[1000]); // L: 681

														while (true) {
															int var20 = var74.read(var65.array, var65.offset, 1000 - var65.offset); // L: 683
															if (var20 == -1) { // L: 684
																var65.offset = 0; // L: 691
																long var36 = var65.readLong(); // L: 692
																var34 = var36; // L: 693
																break;
															}

															var65.offset += var20; // L: 685
															if (var65.offset >= 1000) { // L: 686
																var34 = 0L; // L: 687
																break;
															}
														}
													} catch (Exception var48) { // L: 695
														var34 = 0L; // L: 696
													}

													int var59;
													if (0L == var34) { // L: 700
														var59 = 5;
													} else {
														var59 = class196.method3817(var34, Login.Login_username); // L: 701
													}

													switch(var59) { // L: 702
													case 2:
														class114.setLoginResponseString(class369.field4272, class369.field4088, class369.field4274); // L: 713
														JagexCache.method4224(6); // L: 714
														break; // L: 715
													case 3:
														class114.setLoginResponseString("", "Error connecting to server.", ""); // L: 710
														break; // L: 711
													case 4:
														class114.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 717
														break; // L: 718
													case 5:
														class114.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 720
														break;
													case 6:
														class114.setLoginResponseString("", "Error connecting to server.", ""); // L: 704
														break; // L: 705
													case 7:
														class114.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 707
													}
												}

												return; // L: 724
											}

											var10 = Login.loginBoxX + 180 + 80; // L: 726
											if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 727
												class148.Login_promptCredentials(true); // L: 728
											}

											var57 = 361; // L: 730
											if (SpriteMask.field3613 != null) { // L: 731
												var13 = SpriteMask.field3613.highX / 2; // L: 732
												if (var26 == 1 && var54 >= SpriteMask.field3613.lowX - var13 && var54 <= var13 + SpriteMask.field3613.lowX && var55 >= var57 - 15 && var55 < var57) { // L: 733
													class137.openURL(class317.method6073("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 734
												}
											}

											while (var27.method4431()) { // L: 737
												boolean var60 = false; // L: 738

												for (var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var14) { // L: 739
													if (var27.field2428 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14)) { // L: 740
														var60 = true; // L: 741
														break; // L: 742
													}
												}

												if (var27.field2434 == 13) { // L: 745
													class148.Login_promptCredentials(true); // L: 746
												} else {
													if (var27.field2434 == 85 && Login.Login_username.length() > 0) { // L: 749
														Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
													}

													if (var27.field2434 == 84) { // L: 750
														Login.Login_username = Login.Login_username.trim(); // L: 752
														if (Login.Login_username.length() == 0) { // L: 753
															class114.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 754
														} else {
															long var38;
															try {
																URL var32 = new URL(class317.method6073("services", false) + "m=accountappeal/login.ws"); // L: 761
																URLConnection var33 = var32.openConnection(); // L: 762
																var33.setRequestProperty("connection", "close"); // L: 763
																var33.setDoInput(true); // L: 764
																var33.setDoOutput(true); // L: 765
																var33.setConnectTimeout(5000); // L: 766
																OutputStreamWriter var19 = new OutputStreamWriter(var33.getOutputStream()); // L: 767
																var19.write("data1=req"); // L: 768
																var19.flush(); // L: 769
																InputStream var40 = var33.getInputStream(); // L: 770
																Buffer var21 = new Buffer(new byte[1000]); // L: 771

																while (true) {
																	var22 = var40.read(var21.array, var21.offset, 1000 - var21.offset); // L: 773
																	if (var22 == -1) { // L: 774
																		var21.offset = 0; // L: 781
																		long var41 = var21.readLong(); // L: 782
																		var38 = var41; // L: 783
																		break;
																	}

																	var21.offset += var22; // L: 775
																	if (var21.offset >= 1000) { // L: 776
																		var38 = 0L; // L: 777
																		break;
																	}
																}
															} catch (Exception var49) { // L: 785
																var38 = 0L; // L: 786
															}

															if (var38 == 0L) { // L: 790
																var14 = 5;
															} else {
																var14 = class196.method3817(var38, Login.Login_username); // L: 791
															}

															switch(var14) { // L: 792
															case 2:
																class114.setLoginResponseString(class369.field4272, class369.field4088, class369.field4274); // L: 806
																JagexCache.method4224(6); // L: 807
																break; // L: 808
															case 3:
																class114.setLoginResponseString("", "Error connecting to server.", ""); // L: 794
																break; // L: 795
															case 4:
																class114.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 803
																break; // L: 804
															case 5:
																class114.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 810
																break;
															case 6:
																class114.setLoginResponseString("", "Error connecting to server.", ""); // L: 797
																break; // L: 798
															case 7:
																class114.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 800
															}
														}

														return; // L: 814
													}

													if (var60 && Login.Login_username.length() < 320) { // L: 816
														Login.Login_username = Login.Login_username + var27.field2428;
													}
												}
											}
										} else if (Login.loginIndex != 6) { // L: 820
											if (Login.loginIndex == 7) { // L: 831
												if (GameObject.field3131 && !Client.onMobile) { // L: 832
													var10 = Login.loginBoxCenter - 150; // L: 833
													var58 = var10 + 40 + 240 + 25; // L: 834
													var57 = 231; // L: 835
													var13 = var57 + 40; // L: 836
													if (var26 == 1 && var54 >= var10 && var54 <= var58 && var55 >= var57 && var55 <= var13) { // L: 837
														Login.field961 = class93.method2441(var10, var54); // L: 838
													}

													var14 = Login.loginBoxX + 180 - 80; // L: 840
													short var15 = 321; // L: 841
													boolean var18;
													String var23;
													boolean var45;
													boolean var46;
													SimpleDateFormat var66;
													String[] var68;
													Date var73;
													Date var75;
													StringBuilder var76;
													Date var77;
													if (var26 == 1 && var54 >= var14 - 75 && var54 <= var14 + 75 && var55 >= var15 - 20 && var55 <= var15 + 20) { // L: 842
														label1244: {
															try {
																var66 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 849
																var66.setLenient(false); // L: 850
																var76 = new StringBuilder(); // L: 851
																var68 = Login.field962; // L: 853
																var22 = 0;

																while (true) {
																	if (var22 >= var68.length) {
																		var76.append("12"); // L: 866
																		var75 = var66.parse(var76.toString()); // L: 867
																		break;
																	}

																	var23 = var68[var22]; // L: 855
																	if (var23 == null) { // L: 857
																		class36.method659("Date not valid.", "Please ensure all characters are populated.", ""); // L: 858
																		var75 = null; // L: 859
																		break; // L: 860
																	}

																	var76.append(var23); // L: 862
																	++var22; // L: 854
																}

																var73 = var75; // L: 869
															} catch (ParseException var51) { // L: 871
																class36.method659("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 872
																var45 = false; // L: 873
																break label1244; // L: 874
															}

															if (var73 == null) { // L: 876
																var45 = false; // L: 877
															} else {
																var18 = class209.method4123(var73); // L: 880
																var77 = class16.method192(); // L: 883
																var46 = var73.after(var77); // L: 884
																if (!var46) { // L: 887
																	class36.method659("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 888
																	var45 = false; // L: 889
																} else {
																	if (!var18) { // L: 892
																		class318.field3457 = 8388607; // L: 893
																	} else {
																		class318.field3457 = (int)(var73.getTime() / 86400000L - 11745L); // L: 896
																	}

																	var45 = true; // L: 898
																}
															}
														}

														if (var45) { // L: 901
															Interpreter.method2106(50); // L: 902
															return; // L: 903
														}
													}

													var14 = Login.loginBoxX + 180 + 80; // L: 906
													if (var26 == 1 && var54 >= var14 - 75 && var54 <= var14 + 75 && var55 >= var15 - 20 && var55 <= var15 + 20) { // L: 907
														Login.field962 = new String[8]; // L: 908
														class148.Login_promptCredentials(true); // L: 909
													}

													while (var27.method4431()) { // L: 911
														if (var27.field2434 == 101) { // L: 912
															Login.field962[Login.field961] = null; // L: 913
														}

														if (var27.field2434 == 85) { // L: 915
															if (Login.field962[Login.field961] == null && Login.field961 > 0) { // L: 916
																--Login.field961; // L: 917
															}

															Login.field962[Login.field961] = null; // L: 919
														}

														if (var27.field2428 >= '0' && var27.field2428 <= '9') { // L: 921
															Login.field962[Login.field961] = "" + var27.field2428; // L: 922
															if (Login.field961 < 7) { // L: 923
																++Login.field961; // L: 924
															}
														}

														if (var27.field2434 == 84) { // L: 927
															label1172: {
																try {
																	var66 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 934
																	var66.setLenient(false); // L: 935
																	var76 = new StringBuilder(); // L: 936
																	var68 = Login.field962; // L: 938
																	var22 = 0;

																	while (true) {
																		if (var22 < var68.length) {
																			var23 = var68[var22]; // L: 940
																			if (var23 != null) { // L: 942
																				var76.append(var23); // L: 947
																				++var22; // L: 939
																				continue;
																			}

																			class36.method659("Date not valid.", "Please ensure all characters are populated.", ""); // L: 943
																			var75 = null; // L: 944
																		} else {
																			var76.append("12"); // L: 951
																			var75 = var66.parse(var76.toString()); // L: 952
																		}

																		var73 = var75; // L: 954
																		break;
																	}
																} catch (ParseException var50) { // L: 956
																	class36.method659("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 957
																	var45 = false; // L: 958
																	break label1172; // L: 959
																}

																if (var73 == null) { // L: 961
																	var45 = false; // L: 962
																} else {
																	var18 = class209.method4123(var73); // L: 965
																	var77 = class16.method192(); // L: 968
																	var46 = var73.after(var77); // L: 969
																	if (!var46) { // L: 972
																		class36.method659("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 973
																		var45 = false; // L: 974
																	} else {
																		if (!var18) { // L: 977
																			class318.field3457 = 8388607; // L: 978
																		} else {
																			class318.field3457 = (int)(var73.getTime() / 86400000L - 11745L); // L: 981
																		}

																		var45 = true; // L: 983
																	}
																}
															}

															if (var45) { // L: 986
																Interpreter.method2106(50); // L: 987
															}

															return; // L: 989
														}
													}
												} else {
													var10 = Login.loginBoxX + 180 - 80; // L: 994
													var11 = 321; // L: 995
													if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 996
														class137.openURL(class317.method6073("secure", true) + "m=dob/set_dob.ws", true, false); // L: 997
														class114.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 998
														JagexCache.method4224(6); // L: 999
														return; // L: 1000
													}

													var10 = Login.loginBoxX + 180 + 80; // L: 1002
													if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 1003
														class148.Login_promptCredentials(true); // L: 1004
													}
												}
											} else if (Login.loginIndex == 8) { // L: 1008
												var10 = Login.loginBoxX + 180 - 80; // L: 1009
												var11 = 321; // L: 1010
												if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 1011
													class137.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1012
													class114.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1013
													JagexCache.method4224(6); // L: 1014
													return; // L: 1015
												}

												var10 = Login.loginBoxX + 180 + 80; // L: 1017
												if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 1018
													class148.Login_promptCredentials(true); // L: 1019
												}
											} else if (Login.loginIndex == 9) { // L: 1022
												var10 = Login.loginBoxX + 180; // L: 1023
												var11 = 311; // L: 1024
												if (var27.field2434 == 84 || var27.field2434 == 13 || var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 1025
													PacketBufferNode.method6050(false); // L: 1026
												}
											} else if (Login.loginIndex == 10) { // L: 1029
												var10 = Login.loginBoxX + 180; // L: 1030
												var11 = 209; // L: 1031
												if (var27.field2434 == 84 || var26 == 1 && var54 >= var10 - 109 && var54 <= var10 + 109 && var55 >= var11 && var55 <= var11 + 68) { // L: 1032
													class114.setLoginResponseString("", "Connecting to server...", ""); // L: 1033
													Client.field563 = class538.field5253; // L: 1034
													ScriptEvent.method2361(false); // L: 1035
													Interpreter.method2106(20); // L: 1036
												}
											} else if (Login.loginIndex == 12) { // L: 1039
												var10 = Login.loginBoxCenter; // L: 1040
												var11 = 233; // L: 1041
												var30 = var2.method7882(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11); // L: 1042
												Bounds var28 = var2.method7882(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11); // L: 1043
												Bounds var29 = var2.method7882(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11); // L: 1044
												var58 = var11 + 17; // L: 1045
												Bounds var71 = var2.method7882(0, 34, "<col=ffd200>agreement (EULA)</col>.", var10, var58); // L: 1046
												if (var26 == 1) { // L: 1047
													if (var30.method8552(var54, var55)) { // L: 1048
														class137.openURL("https://www.jagex.com/terms", true, false); // L: 1049
													} else if (var28.method8552(var54, var55)) { // L: 1051
														class137.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1052
													} else if (var29.method8552(var54, var55) || var71.method8552(var54, var55)) { // L: 1054
														class137.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 1055
													}
												}

												var10 = Login.loginBoxCenter - 80; // L: 1058
												var11 = 311; // L: 1059
												if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 1060
													class36.method658(); // L: 1061
													PacketBufferNode.method6050(true); // L: 1062
												}

												var10 = Login.loginBoxCenter + 80; // L: 1064
												if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 1065
													Login.loginIndex = 13; // L: 1066
												}
											} else if (Login.loginIndex == 13) { // L: 1069
												var10 = Login.loginBoxCenter; // L: 1070
												var11 = 321; // L: 1071
												if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 1072
													PacketBufferNode.method6050(true); // L: 1073
												}
											} else if (Login.loginIndex == 14) { // L: 1076
												String var47 = ""; // L: 1077
												switch(Login.field952) { // L: 1078
												case 0:
													var47 = "https://secure.runescape.com/m=offence-appeal/account-history"; // L: 1089
													break;
												case 1:
													var47 = "https://secure.runescape.com/m=accountappeal/passwordrecovery"; // L: 1080
													break; // L: 1081
												case 2:
													var47 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance"; // L: 1086
													break; // L: 1087
												default:
													class148.Login_promptCredentials(false); // L: 1083
												}

												var58 = Login.loginBoxX + 180; // L: 1092
												var57 = 276; // L: 1093
												if (var26 == 1 && var54 >= var58 - 75 && var54 <= var58 + 75 && var55 >= var57 - 20 && var55 <= var57 + 20) { // L: 1094
													class137.openURL(var47, true, false); // L: 1095
													class114.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1096
													JagexCache.method4224(6); // L: 1097
													return; // L: 1098
												}

												var58 = Login.loginBoxX + 180; // L: 1100
												var57 = 326; // L: 1101
												if (var26 == 1 && var54 >= var58 - 75 && var54 <= var58 + 75 && var55 >= var57 - 20 && var55 <= var57 + 20) { // L: 1102
													class148.Login_promptCredentials(false); // L: 1103
												}
											} else if (Login.loginIndex == 24) { // L: 1106
												var10 = Login.loginBoxX + 180; // L: 1107
												var11 = 301; // L: 1108
												if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 1109
													PacketBufferNode.method6050(false); // L: 1110
												}
											} else if (Login.loginIndex == 32) { // L: 1113
												var10 = Login.loginBoxX + 180 - 80; // L: 1114
												var11 = 321; // L: 1115
												if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 1116
													class137.openURL(class317.method6073("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1117
													class114.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1118
													JagexCache.method4224(6); // L: 1119
													return; // L: 1120
												}

												var10 = Login.loginBoxX + 180 + 80; // L: 1122
												if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 1123
													class148.Login_promptCredentials(true); // L: 1124
												}
											} else if (Login.loginIndex == 33) { // L: 1127
												var10 = Login.loginBoxX + 180; // L: 1128
												var11 = 276; // L: 1129
												if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 1130
													class137.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 1131
												}

												var10 = Login.loginBoxX + 180; // L: 1133
												var11 = 326; // L: 1134
												if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 1135
													class148.Login_promptCredentials(true); // L: 1136
												}
											}
										} else {
											while (true) {
												do {
													if (!var27.method4431()) { // L: 821
														var56 = 321; // L: 826
														if (var26 == 1 && var55 >= var56 - 20 && var55 <= var56 + 20) { // L: 827
															class148.Login_promptCredentials(true); // L: 828
														}

														return;
													}
												} while(var27.field2434 != 84 && var27.field2434 != 13); // L: 822

												class148.Login_promptCredentials(true); // L: 823
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
	} // L: 359

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(Lng;S)I",
		garbageValue = "-146"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32)); // L: 12774
		return var1 != null ? var1.integer : var0.flags; // L: 12775 12776
	}
}
