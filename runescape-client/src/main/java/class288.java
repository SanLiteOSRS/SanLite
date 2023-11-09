import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@lw
@ObfuscatedName("lv")
public final class class288 {
	@ObfuscatedName("ac")
	static final HashMap field3300;

	static {
		field3300 = new HashMap(); // L: 11
		java.util.Calendar.getInstance(method5478("Europe/London")); // L: 14
	} // L: 15

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;",
		garbageValue = "-1918615757"
	)
	static TimeZone method5478(String var0) {
		synchronized(field3300) { // L: 22
			TimeZone var2 = (TimeZone)field3300.get(var0); // L: 23
			if (var2 == null) { // L: 24
				var2 = TimeZone.getTimeZone(var0); // L: 25
				field3300.put(var0, var2);
			}

			return var2;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lne;Lne;Lne;Llz;I)Z",
		garbageValue = "1516727558"
	)
	public static boolean method5482(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, MidiPcmStream var3) {
		class293.musicPatchesArchive = var0; // L: 26
		class293.musicSamplesArchive = var1; // L: 27
		class293.soundEffectsArchive = var2; // L: 28
		class293.midiPcmStream = var3; // L: 29
		return true; // L: 30
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lbr;Loe;Loe;B)V",
		garbageValue = "11"
	)
	static void method5481(GameEngine var0, Font var1, Font var2) {
		int var4;
		int var5;
		int var6;
		int var45;
		if (Login.worldSelectOpen) { // L: 371
			class208 var43 = Calendar.method6292(); // L: 373

			while (true) {
				if (!var43.method4081()) { // L: 374
					if (MouseHandler.MouseHandler_lastButton != 1 && (class319.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) { // L: 395
						break;
					}

					var4 = Login.xPadding + 280; // L: 396
					if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 397
						MusicPatchNode2.changeWorldSelectSorting(0, 0); // L: 398
						break; // L: 399
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 401
						MusicPatchNode2.changeWorldSelectSorting(0, 1); // L: 402
						break; // L: 403
					}

					var5 = Login.xPadding + 390; // L: 405
					if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 406
						MusicPatchNode2.changeWorldSelectSorting(1, 0); // L: 407
						break; // L: 408
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 410
						MusicPatchNode2.changeWorldSelectSorting(1, 1); // L: 411
						break; // L: 412
					}

					var6 = Login.xPadding + 500; // L: 414
					if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var6 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 415
						MusicPatchNode2.changeWorldSelectSorting(2, 0); // L: 416
						break; // L: 417
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var6 + 15 && MouseHandler.MouseHandler_lastPressedX <= var6 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 419
						MusicPatchNode2.changeWorldSelectSorting(2, 1); // L: 420
						break; // L: 421
					}

					var45 = Login.xPadding + 610; // L: 423
					if (MouseHandler.MouseHandler_lastPressedX >= var45 && MouseHandler.MouseHandler_lastPressedX <= var45 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 424
						MusicPatchNode2.changeWorldSelectSorting(3, 0); // L: 425
						break; // L: 426
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var45 + 15 && MouseHandler.MouseHandler_lastPressedX <= var45 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 428
						MusicPatchNode2.changeWorldSelectSorting(3, 1); // L: 429
						break; // L: 430
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 432
						class88.method2291(); // L: 433
						break; // L: 434
					}

					if (Login.hoveredWorldIndex != -1) { // L: 436
						World var8 = class260.World_worlds[Login.hoveredWorldIndex]; // L: 437
						VarbitComposition.changeWorld(var8); // L: 438
						Login.worldSelectOpen = false; // L: 440
						Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 441
						class419.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 442
						Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 443
					} else {
						if (Login.worldSelectPage > 0 && class12.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class12.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class143.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class143.canvasHeight / 2 + 50) { // L: 447
							--Login.worldSelectPage; // L: 448
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && class208.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GameEngine.canvasWidth - class208.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GameEngine.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class143.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class143.canvasHeight / 2 + 50) { // L: 450
							++Login.worldSelectPage; // L: 451
						}
					}
					break;
				}

				if (var43.field2299 == 13) { // L: 375
					Login.worldSelectOpen = false; // L: 377
					Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 378
					class419.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 379
					Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 380
					break; // L: 382
				}

				if (var43.field2299 == 96) { // L: 384
					if (Login.worldSelectPage > 0 && class12.worldSelectLeftSprite != null) { // L: 385
						--Login.worldSelectPage; // L: 386
					}
				} else if (var43.field2299 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class208.worldSelectRightSprite != null) { // L: 389 390
					++Login.worldSelectPage; // L: 391
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class319.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 457
				WorldMapSectionType.clientPreferences.method2500(!WorldMapSectionType.clientPreferences.method2445()); // L: 458
				if (!WorldMapSectionType.clientPreferences.method2445()) { // L: 459
					Archive var3 = class308.archive6; // L: 460
					var4 = var3.getGroupId("scape main"); // L: 462
					var5 = var3.getFileId(var4, ""); // L: 463
					class163.method3352(var3, var4, var5, 255, false); // L: 464
				} else {
					class258.method5232(); // L: 467
				}
			}

			if (Client.gameState != 5) { // L: 469
				if (Login.field922 == -1L) { // L: 470
					Login.field922 = WorldMapSection2.method4844() + 1000L; // L: 471
				}

				long var24 = WorldMapSection2.method4844(); // L: 473
				boolean var44;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 476
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) { // L: 480
							var44 = true; // L: 488
							break;
						}

						ArchiveLoader var26 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 481
						if (!var26.isLoaded()) { // L: 482
							var44 = false; // L: 483
							break; // L: 484
						}

						++Client.archiveLoadersDone; // L: 486
					}
				} else {
					var44 = true; // L: 477
				}

				if (var44 && Login.field923 == -1L) { // L: 490 491
					Login.field923 = var24; // L: 492
					if (Login.field923 > Login.field922) { // L: 493
						Login.field922 = Login.field923; // L: 494
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 498
					if (Language.Language_EN == class69.clientLanguage) { // L: 499
						if (MouseHandler.MouseHandler_lastButton == 1 || !class319.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 500
							var6 = Login.xPadding + 5; // L: 501
							short var7 = 463; // L: 502
							byte var27 = 100; // L: 503
							byte var9 = 35; // L: 504
							if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var27 + var6 && MouseHandler.MouseHandler_lastPressedY >= var7 && MouseHandler.MouseHandler_lastPressedY <= var7 + var9) { // L: 505
								Client.method1774(); // L: 506
								return; // L: 507
							}
						}

						if (class16.World_request != null) { // L: 510
							Client.method1774();
						}
					}

					var6 = MouseHandler.MouseHandler_lastButton; // L: 512
					var45 = MouseHandler.MouseHandler_lastPressedX; // L: 513
					int var55 = MouseHandler.MouseHandler_lastPressedY; // L: 514
					if (var6 == 0) { // L: 515
						var45 = MouseHandler.MouseHandler_x; // L: 516
						var55 = MouseHandler.MouseHandler_y; // L: 517
					}

					if (!class319.mouseCam && var6 == 4) { // L: 519
						var6 = 1;
					}

					class208 var28 = Calendar.method6292(); // L: 520
					short var47;
					int var48;
					if (Login.loginIndex == 0) { // L: 521
						boolean var53 = false; // L: 522

						while (var28.method4081()) { // L: 523
							if (var28.field2299 == 84) { // L: 524
								var53 = true; // L: 525
							}
						}

						var48 = Login.loginBoxCenter - 80; // L: 528
						var47 = 291; // L: 529
						if (var6 == 1 && var45 >= var48 - 75 && var45 <= var48 + 75 && var55 >= var47 - 20 && var55 <= var47 + 20) { // L: 530
							class25.openURL(class154.method3285("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 531
						}

						var48 = Login.loginBoxCenter + 80; // L: 533
						if (var6 == 1 && var45 >= var48 - 75 && var45 <= var48 + 75 && var55 >= var47 - 20 && var55 <= var47 + 20 || var53) { // L: 534
							if ((Client.worldProperties & 33554432) != 0) { // L: 535
								Login.Login_response0 = ""; // L: 536
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 537
								Login.Login_response2 = "Your normal account will not be affected."; // L: 538
								Login.Login_response3 = ""; // L: 539
								class14.method173(1); // L: 540
								ReflectionCheck.method678(); // L: 541
							} else if ((Client.worldProperties & 4) != 0) { // L: 543
								if ((Client.worldProperties & 1024) != 0) { // L: 544
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 545
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 546
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 547
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 550
									Login.Login_response2 = "Players can attack each other"; // L: 551
									Login.Login_response3 = "almost everywhere."; // L: 552
								}

								Login.Login_response0 = "Warning!"; // L: 554
								class14.method173(1); // L: 555
								ReflectionCheck.method678(); // L: 556
							} else if ((Client.worldProperties & 1024) != 0) { // L: 558
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 559
								Login.Login_response2 = "The Protect Item prayer will"; // L: 560
								Login.Login_response3 = "not work on this world."; // L: 561
								Login.Login_response0 = "Warning!"; // L: 562
								class14.method173(1); // L: 563
								ReflectionCheck.method678(); // L: 564
							} else {
								FontName.Login_promptCredentials(false); // L: 567
							}
						}
					} else {
						int var10;
						short var11;
						if (Login.loginIndex == 1) { // L: 571
							while (true) {
								if (!var28.method4081()) { // L: 572
									var10 = Login.loginBoxCenter - 80; // L: 580
									var11 = 321; // L: 581
									if (var6 == 1 && var45 >= var10 - 75 && var45 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 582
										FontName.Login_promptCredentials(false); // L: 583
									}

									var10 = Login.loginBoxCenter + 80; // L: 585
									if (var6 == 1 && var45 >= var10 - 75 && var45 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 586
										class14.method173(0); // L: 587
									}
									break;
								}

								if (var28.field2299 == 84) { // L: 573
									FontName.Login_promptCredentials(false); // L: 574
								} else if (var28.field2299 == 13) { // L: 576
									class14.method173(0); // L: 577
								}
							}
						} else {
							int var15;
							short var46;
							boolean var49;
							if (Login.loginIndex == 2) { // L: 590
								var46 = 201; // L: 591
								var10 = var46 + 52; // L: 592
								if (var6 == 1 && var55 >= var10 - 12 && var55 < var10 + 2) { // L: 593
									Login.currentLoginField = 0;
								}

								var10 += 15; // L: 594
								if (var6 == 1 && var55 >= var10 - 12 && var55 < var10 + 2) { // L: 595
									Login.currentLoginField = 1;
								}

								var10 += 15; // L: 596
								var46 = 361; // L: 597
								if (WorldMapSectionType.field2932 != null) { // L: 598
									var48 = WorldMapSectionType.field2932.highX / 2; // L: 599
									if (var6 == 1 && var45 >= WorldMapSectionType.field2932.lowX - var48 && var45 <= var48 + WorldMapSectionType.field2932.lowX && var55 >= var46 - 15 && var55 < var46) { // L: 600
										switch(Login.field887) { // L: 601
										case 1:
											Tile.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 604
											class14.method173(5); // L: 605
											return; // L: 606
										case 2:
											class25.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 610
										}
									}
								}

								var48 = Login.loginBoxCenter - 80; // L: 616
								var47 = 321; // L: 617
								if (var6 == 1 && var45 >= var48 - 75 && var45 <= var48 + 75 && var55 >= var47 - 20 && var55 <= var47 + 20) { // L: 618
									Login.Login_username = Login.Login_username.trim(); // L: 619
									if (Login.Login_username.length() == 0) { // L: 620
										Tile.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 621
										return; // L: 622
									}

									if (Login.Login_password.length() == 0) { // L: 624
										Tile.setLoginResponseString("", "Please enter your password.", ""); // L: 625
										return; // L: 626
									}

									Tile.setLoginResponseString("", "Connecting to server...", ""); // L: 628
									class130.method3030(false); // L: 629
									class19.method280(20); // L: 630
									return; // L: 631
								}

								var48 = Login.loginBoxX + 180 + 80; // L: 633
								if (var6 == 1 && var45 >= var48 - 75 && var45 <= var48 + 75 && var55 >= var47 - 20 && var55 <= var47 + 20) { // L: 634
									class14.method173(0); // L: 635
									Login.Login_username = ""; // L: 636
									Login.Login_password = ""; // L: 637
									FriendSystem.field800 = 0; // L: 638
									NetFileRequest.otp = ""; // L: 639
									Login.field914 = true; // L: 640
								}

								var48 = Login.loginBoxCenter + -117; // L: 642
								var47 = 277; // L: 643
								Login.field900 = var45 >= var48 && var45 < var48 + Message.field466 && var55 >= var47 && var55 < var47 + class465.field4857; // L: 644
								if (var6 == 1 && Login.field900) { // L: 645
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 646
									if (!Client.Login_isUsernameRemembered && WorldMapSectionType.clientPreferences.method2446() != null) { // L: 647
										WorldMapSectionType.clientPreferences.method2439((String)null); // L: 648
									}
								}

								var48 = Login.loginBoxCenter + 24; // L: 651
								var47 = 277; // L: 652
								Login.field913 = var45 >= var48 && var45 < var48 + Message.field466 && var55 >= var47 && var55 < var47 + class465.field4857; // L: 653
								if (var6 == 1 && Login.field913) { // L: 654
									WorldMapSectionType.clientPreferences.method2459(!WorldMapSectionType.clientPreferences.method2429()); // L: 655
									if (!WorldMapSectionType.clientPreferences.method2429()) { // L: 656
										Login.Login_username = ""; // L: 657
										WorldMapSectionType.clientPreferences.method2439((String)null); // L: 658
										ReflectionCheck.method678(); // L: 659
									}
								}

								label1528:
								while (true) {
									Transferable var57;
									do {
										while (true) {
											char var51;
											label1492:
											do {
												while (true) {
													while (var28.method4081()) { // L: 662
														if (var28.field2299 != 13) { // L: 663
															if (Login.currentLoginField != 0) { // L: 672
																continue label1492;
															}

															Interpreter.method2027(var28.field2300); // L: 673
															if (var28.field2299 == 85 && Login.Login_username.length() > 0) { // L: 674
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var28.field2299 == 84 || var28.field2299 == 80) { // L: 675
																Login.currentLoginField = 1;
															}

															var51 = var28.field2300; // L: 677
															var49 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var51) != -1; // L: 679
															if (var49 && Login.Login_username.length() < 320) { // L: 681
																Login.Login_username = Login.Login_username + var28.field2300;
															}
														} else {
															class14.method173(0); // L: 664
															Login.Login_username = ""; // L: 665
															Login.Login_password = ""; // L: 666
															FriendSystem.field800 = 0; // L: 667
															NetFileRequest.otp = ""; // L: 668
															Login.field914 = true; // L: 669
														}
													}

													return; // L: 1208
												}
											} while(Login.currentLoginField != 1); // L: 683

											if (var28.field2299 == 85 && Login.Login_password.length() > 0) { // L: 684
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 685
											} else if (var28.field2299 == 84 || var28.field2299 == 80) { // L: 687
												Login.currentLoginField = 0; // L: 688
												if (var28.field2299 == 84) { // L: 689
													Login.Login_username = Login.Login_username.trim(); // L: 690
													if (Login.Login_username.length() == 0) { // L: 691
														Tile.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 692
														return; // L: 693
													}

													if (Login.Login_password.length() == 0) { // L: 695
														Tile.setLoginResponseString("", "Please enter your password.", ""); // L: 696
														return; // L: 697
													}

													Tile.setLoginResponseString("", "Connecting to server...", ""); // L: 699
													class130.method3030(false); // L: 700
													class19.method280(20); // L: 701
													return; // L: 702
												}
											}

											if ((var28.method4074(82) || var28.method4074(87)) && var28.field2299 == 67) { // L: 705
												Clipboard var56 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 706
												var57 = var56.getContents(class392.client); // L: 707
												var15 = 20 - Login.Login_password.length(); // L: 708
												break;
											}

											if (ReflectionCheck.method680(var28.field2300)) { // L: 733
												var51 = var28.field2300; // L: 735
												var49 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var51) != -1; // L: 737
												if (var49 && Login.Login_password.length() < 20) { // L: 739 740
													Login.Login_password = Login.Login_password + var28.field2300; // L: 741
												}
											}
										}
									} while(var15 <= 0); // L: 709

									try {
										String var16 = (String)var57.getTransferData(DataFlavor.stringFlavor); // L: 711
										int var17 = Math.min(var15, var16.length()); // L: 712
										int var52 = 0;

										while (true) {
											if (var52 >= var17) {
												Login.Login_password = Login.Login_password + var16.substring(0, var17); // L: 727
												continue label1528;
											}

											if (!ReflectionCheck.method680(var16.charAt(var52))) { // L: 715
												break;
											}

											char var54 = var16.charAt(var52); // L: 717
											boolean var19 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var54) != -1; // L: 719
											if (!var19) { // L: 721
												break;
											}

											++var52; // L: 713
										}

										class14.method173(3); // L: 723
										return; // L: 724
									} catch (UnsupportedFlavorException var41) { // L: 729
									} catch (IOException var42) { // L: 730
									}
								}
							} else {
								Bounds var31;
								if (Login.loginIndex == 3) { // L: 749
									var10 = Login.loginBoxX + 180; // L: 750
									var11 = 241; // L: 751
									var31 = var1.method7149(0, "<col=ffd200>Download it here.</col>".length(), "<col=ffd200>Download it here.</col>", var10, var11); // L: 752
									if (var6 == 1 && var31.method7770(var45, var55)) { // L: 753
										class25.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 754
									}

									var10 = Login.loginBoxX + 180; // L: 756
									var11 = 276; // L: 757
									if (var6 == 1 && var45 >= var10 - 75 && var45 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 758
										KeyHandler.method426(false); // L: 759
									}

									var10 = Login.loginBoxX + 180; // L: 761
									var11 = 326; // L: 762
									if (var6 == 1 && var45 >= var10 - 75 && var45 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 763
										Tile.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 764
										class14.method173(5); // L: 765
										return; // L: 766
									}
								} else {
									int var13;
									if (Login.loginIndex == 4) { // L: 769
										var10 = Login.loginBoxX + 180 - 80; // L: 770
										var11 = 321; // L: 771
										if (var6 == 1 && var45 >= var10 - 75 && var45 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 772
											NetFileRequest.otp.trim(); // L: 773
											if (NetFileRequest.otp.length() != 6) { // L: 774
												Tile.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 775
												return; // L: 776
											}

											FriendSystem.field800 = Integer.parseInt(NetFileRequest.otp); // L: 778
											NetFileRequest.otp = ""; // L: 779
											class130.method3030(true); // L: 780
											Tile.setLoginResponseString("", "Connecting to server...", ""); // L: 781
											class19.method280(20); // L: 782
											return; // L: 783
										}

										if (var6 == 1 && var45 >= Login.loginBoxX + 180 - 9 && var45 <= Login.loginBoxX + 180 + 130 && var55 >= 263 && var55 <= 296) { // L: 785
											Login.field914 = !Login.field914; // L: 786
										}

										if (var6 == 1 && var45 >= Login.loginBoxX + 180 - 34 && var45 <= Login.loginBoxX + 34 + 180 && var55 >= 351 && var55 <= 363) { // L: 788
											class25.openURL(class154.method3285("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 789
										}

										var10 = Login.loginBoxX + 180 + 80; // L: 791
										if (var6 == 1 && var45 >= var10 - 75 && var45 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 792
											class14.method173(0); // L: 793
											Login.Login_username = ""; // L: 794
											Login.Login_password = ""; // L: 795
											FriendSystem.field800 = 0; // L: 796
											NetFileRequest.otp = ""; // L: 797
										}

										while (var28.method4081()) { // L: 799
											boolean var12 = false; // L: 800

											for (var13 = 0; var13 < "1234567890".length(); ++var13) { // L: 801
												if (var28.field2300 == "1234567890".charAt(var13)) { // L: 802
													var12 = true; // L: 803
													break; // L: 804
												}
											}

											if (var28.field2299 == 13) { // L: 807
												class14.method173(0); // L: 808
												Login.Login_username = ""; // L: 809
												Login.Login_password = ""; // L: 810
												FriendSystem.field800 = 0; // L: 811
												NetFileRequest.otp = ""; // L: 812
											} else {
												if (var28.field2299 == 85 && NetFileRequest.otp.length() > 0) { // L: 815
													NetFileRequest.otp = NetFileRequest.otp.substring(0, NetFileRequest.otp.length() - 1);
												}

												if (var28.field2299 == 84) { // L: 816
													NetFileRequest.otp.trim(); // L: 817
													if (NetFileRequest.otp.length() != 6) { // L: 818
														Tile.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 819
														return; // L: 820
													}

													FriendSystem.field800 = Integer.parseInt(NetFileRequest.otp); // L: 822
													NetFileRequest.otp = ""; // L: 823
													class130.method3030(true); // L: 824
													Tile.setLoginResponseString("", "Connecting to server...", ""); // L: 825
													class19.method280(20); // L: 826
													return; // L: 827
												}

												if (var12 && NetFileRequest.otp.length() < 6) { // L: 829
													NetFileRequest.otp = NetFileRequest.otp + var28.field2300;
												}
											}
										}
									} else {
										int var14;
										if (Login.loginIndex == 5) { // L: 833
											var10 = Login.loginBoxX + 180 - 80; // L: 834
											var11 = 321; // L: 835
											if (var6 == 1 && var45 >= var10 - 75 && var45 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 836
												DecorativeObject.method4776(); // L: 837
												return; // L: 838
											}

											var10 = Login.loginBoxX + 180 + 80; // L: 840
											if (var6 == 1 && var45 >= var10 - 75 && var45 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 841
												FontName.Login_promptCredentials(true); // L: 842
											}

											var47 = 361; // L: 844
											if (DevicePcmPlayerProvider.field118 != null) { // L: 845
												var13 = DevicePcmPlayerProvider.field118.highX / 2; // L: 846
												if (var6 == 1 && var45 >= DevicePcmPlayerProvider.field118.lowX - var13 && var45 <= var13 + DevicePcmPlayerProvider.field118.lowX && var55 >= var47 - 15 && var55 < var47) { // L: 847
													class25.openURL(class154.method3285("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 848
												}
											}

											while (var28.method4081()) { // L: 851
												var49 = false; // L: 852

												for (var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var14) { // L: 853
													if (var28.field2300 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14)) { // L: 854
														var49 = true; // L: 855
														break; // L: 856
													}
												}

												if (var28.field2299 == 13) { // L: 859
													FontName.Login_promptCredentials(true); // L: 860
												} else {
													if (var28.field2299 == 85 && Login.Login_username.length() > 0) { // L: 863
														Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
													}

													if (var28.field2299 == 84) { // L: 864
														DecorativeObject.method4776(); // L: 865
														return; // L: 866
													}

													if (var49 && Login.Login_username.length() < 320) { // L: 868
														Login.Login_username = Login.Login_username + var28.field2300;
													}
												}
											}
										} else if (Login.loginIndex != 6) { // L: 872
											if (Login.loginIndex == 7) { // L: 883
												if (class157.field1742 && !Client.onMobile) { // L: 884
													var10 = Login.loginBoxCenter - 150; // L: 885
													var48 = var10 + 40 + 240 + 25; // L: 886
													var47 = 231; // L: 887
													var13 = var47 + 40; // L: 888
													if (var6 == 1 && var45 >= var10 && var45 <= var48 && var55 >= var47 && var55 <= var13) { // L: 889
														var15 = var10; // L: 891
														int var32 = 0;

														while (true) {
															if (var32 >= 8) {
																var14 = 0; // L: 901
																break;
															}

															if (var45 <= var15 + 30) { // L: 894
																var14 = var32; // L: 895
																break; // L: 896
															}

															var15 += 30; // L: 898
															var15 += var32 != 1 && var32 != 3 ? 5 : 20; // L: 899
															++var32; // L: 893
														}

														Login.field909 = var14; // L: 903
													}

													var14 = Login.loginBoxX + 180 - 80; // L: 905
													short var50 = 321; // L: 906
													boolean var18;
													boolean var20;
													String[] var21;
													int var22;
													String var23;
													SimpleDateFormat var33;
													StringBuilder var34;
													Date var35;
													Date var36;
													boolean var58;
													java.util.Calendar var59;
													Date var60;
													if (var6 == 1 && var45 >= var14 - 75 && var45 <= var14 + 75 && var55 >= var50 - 20 && var55 <= var50 + 20) { // L: 907
														label1371: {
															try {
																var33 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 914
																var33.setLenient(false); // L: 915
																var34 = new StringBuilder(); // L: 916
																var21 = Login.field908; // L: 918
																var22 = 0;

																while (true) {
																	if (var22 < var21.length) {
																		var23 = var21[var22]; // L: 920
																		if (var23 != null) { // L: 922
																			var34.append(var23); // L: 927
																			++var22; // L: 919
																			continue;
																		}

																		method5479("Date not valid.", "Please ensure all characters are populated.", ""); // L: 923
																		var35 = null; // L: 924
																	} else {
																		var34.append("12"); // L: 931
																		var35 = var33.parse(var34.toString()); // L: 932
																	}

																	var36 = var35; // L: 934
																	break;
																}
															} catch (ParseException var40) { // L: 936
																method5479("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 937
																var58 = false; // L: 938
																break label1371; // L: 939
															}

															if (var36 == null) { // L: 941
																var58 = false; // L: 942
															} else {
																var59 = java.util.Calendar.getInstance(); // L: 947
																var59.set(1, var59.get(1) - 13); // L: 948
																var59.set(5, var59.get(5) + 1); // L: 949
																var59.set(11, 0); // L: 950
																var59.set(12, 0); // L: 951
																var59.set(13, 0); // L: 952
																var59.set(14, 0); // L: 953
																var60 = var59.getTime(); // L: 954
																var18 = var36.before(var60); // L: 955
																var20 = class83.method2253(var36); // L: 958
																if (!var20) { // L: 959
																	method5479("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 960
																	var58 = false; // L: 961
																} else {
																	if (!var18) { // L: 964
																		class31.field167 = 8388607; // L: 965
																	} else {
																		class31.field167 = (int)(var36.getTime() / 86400000L - 11745L); // L: 968
																	}

																	var58 = true; // L: 970
																}
															}
														}

														if (var58) { // L: 973
															class19.method280(50); // L: 974
															return; // L: 975
														}
													}

													var14 = Login.loginBoxX + 180 + 80; // L: 978
													if (var6 == 1 && var45 >= var14 - 75 && var45 <= var14 + 75 && var55 >= var50 - 20 && var55 <= var50 + 20) { // L: 979
														Login.field908 = new String[8]; // L: 980
														FontName.Login_promptCredentials(true); // L: 981
													}

													while (var28.method4081()) { // L: 983
														if (var28.field2299 == 101) { // L: 984
															Login.field908[Login.field909] = null; // L: 985
														}

														if (var28.field2299 == 85) { // L: 987
															if (Login.field908[Login.field909] == null && Login.field909 > 0) { // L: 988
																--Login.field909; // L: 989
															}

															Login.field908[Login.field909] = null; // L: 991
														}

														if (var28.field2300 >= '0' && var28.field2300 <= '9') { // L: 993
															Login.field908[Login.field909] = "" + var28.field2300; // L: 994
															if (Login.field909 < 7) { // L: 995
																++Login.field909; // L: 996
															}
														}

														if (var28.field2299 == 84) { // L: 999
															label1300: {
																try {
																	var33 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 1006
																	var33.setLenient(false); // L: 1007
																	var34 = new StringBuilder(); // L: 1008
																	var21 = Login.field908; // L: 1010
																	var22 = 0;

																	while (true) {
																		if (var22 >= var21.length) {
																			var34.append("12"); // L: 1023
																			var35 = var33.parse(var34.toString()); // L: 1024
																			break;
																		}

																		var23 = var21[var22]; // L: 1012
																		if (var23 == null) { // L: 1014
																			method5479("Date not valid.", "Please ensure all characters are populated.", ""); // L: 1015
																			var35 = null; // L: 1016
																			break; // L: 1017
																		}

																		var34.append(var23); // L: 1019
																		++var22; // L: 1011
																	}

																	var36 = var35; // L: 1026
																} catch (ParseException var39) { // L: 1028
																	method5479("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1029
																	var58 = false; // L: 1030
																	break label1300; // L: 1031
																}

																if (var36 == null) { // L: 1033
																	var58 = false; // L: 1034
																} else {
																	var59 = java.util.Calendar.getInstance(); // L: 1039
																	var59.set(1, var59.get(1) - 13); // L: 1040
																	var59.set(5, var59.get(5) + 1); // L: 1041
																	var59.set(11, 0); // L: 1042
																	var59.set(12, 0); // L: 1043
																	var59.set(13, 0); // L: 1044
																	var59.set(14, 0); // L: 1045
																	var60 = var59.getTime(); // L: 1046
																	var18 = var36.before(var60); // L: 1047
																	var20 = class83.method2253(var36); // L: 1050
																	if (!var20) { // L: 1051
																		method5479("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1052
																		var58 = false; // L: 1053
																	} else {
																		if (!var18) { // L: 1056
																			class31.field167 = 8388607; // L: 1057
																		} else {
																			class31.field167 = (int)(var36.getTime() / 86400000L - 11745L); // L: 1060
																		}

																		var58 = true; // L: 1062
																	}
																}
															}

															if (var58) { // L: 1065
																class19.method280(50); // L: 1066
															}

															return; // L: 1068
														}
													}
												} else {
													var10 = Login.loginBoxX + 180 - 80; // L: 1073
													var11 = 321; // L: 1074
													if (var6 == 1 && var45 >= var10 - 75 && var45 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 1075
														class25.openURL(class154.method3285("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1076
														Tile.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1077
														class14.method173(6); // L: 1078
														return; // L: 1079
													}

													var10 = Login.loginBoxX + 180 + 80; // L: 1081
													if (var6 == 1 && var45 >= var10 - 75 && var45 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 1082
														FontName.Login_promptCredentials(true); // L: 1083
													}
												}
											} else if (Login.loginIndex == 8) { // L: 1087
												var10 = Login.loginBoxX + 180 - 80; // L: 1088
												var11 = 321; // L: 1089
												if (var6 == 1 && var45 >= var10 - 75 && var45 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 1090
													class25.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1091
													Tile.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1092
													class14.method173(6); // L: 1093
													return; // L: 1094
												}

												var10 = Login.loginBoxX + 180 + 80; // L: 1096
												if (var6 == 1 && var45 >= var10 - 75 && var45 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 1097
													FontName.Login_promptCredentials(true); // L: 1098
												}
											} else if (Login.loginIndex == 9) { // L: 1101
												var10 = Login.loginBoxX + 180; // L: 1102
												var11 = 311; // L: 1103
												if (var28.field2299 == 84 || var28.field2299 == 13 || var6 == 1 && var45 >= var10 - 75 && var45 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 1104
													KeyHandler.method426(false); // L: 1105
												}
											} else if (Login.loginIndex == 10) { // L: 1108
												var10 = Login.loginBoxX + 180; // L: 1109
												var11 = 209; // L: 1110
												if (var28.field2299 == 84 || var6 == 1 && var45 >= var10 - 109 && var45 <= var10 + 109 && var55 >= var11 && var55 <= var11 + 68) { // L: 1111
													Tile.setLoginResponseString("", "Connecting to server...", ""); // L: 1112
													Client.field519 = class482.field4956; // L: 1113
													class130.method3030(false); // L: 1114
													class19.method280(20); // L: 1115
												}
											} else if (Login.loginIndex == 12) { // L: 1118
												var10 = Login.loginBoxCenter; // L: 1119
												var11 = 233; // L: 1120
												var31 = var2.method7149(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11); // L: 1121
												Bounds var29 = var2.method7149(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11); // L: 1122
												Bounds var30 = var2.method7149(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11); // L: 1123
												var48 = var11 + 17; // L: 1124
												Bounds var37 = var2.method7149(0, 34, "<col=ffd200>agreement (EULA)</col>.", var10, var48); // L: 1125
												if (var6 == 1) { // L: 1126
													if (var31.method7770(var45, var55)) { // L: 1127
														class25.openURL("https://www.jagex.com/terms", true, false); // L: 1128
													} else if (var29.method7770(var45, var55)) { // L: 1130
														class25.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1131
													} else if (var30.method7770(var45, var55) || var37.method7770(var45, var55)) { // L: 1133
														class25.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 1134
													}
												}

												var10 = Login.loginBoxCenter - 80; // L: 1137
												var11 = 311; // L: 1138
												if (var6 == 1 && var45 >= var10 - 75 && var45 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 1139
													WorldMapSectionType.clientPreferences.method2447(Client.field486); // L: 1141
													KeyHandler.method426(true); // L: 1143
												}

												var10 = Login.loginBoxCenter + 80; // L: 1145
												if (var6 == 1 && var45 >= var10 - 75 && var45 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 1146
													Login.loginIndex = 13; // L: 1147
												}
											} else if (Login.loginIndex == 13) { // L: 1150
												var10 = Login.loginBoxCenter; // L: 1151
												var11 = 321; // L: 1152
												if (var6 == 1 && var45 >= var10 - 75 && var45 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 1153
													KeyHandler.method426(true); // L: 1154
												}
											} else if (Login.loginIndex == 14) { // L: 1157
												String var38 = ""; // L: 1158
												switch(Login.field901) { // L: 1159
												case 0:
													var38 = "https://secure.runescape.com/m=offence-appeal/account-history"; // L: 1161
													break; // L: 1162
												case 1:
													var38 = "https://secure.runescape.com/m=accountappeal/passwordrecovery"; // L: 1167
													break; // L: 1168
												case 2:
													var38 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance"; // L: 1164
													break; // L: 1165
												default:
													FontName.Login_promptCredentials(false); // L: 1170
												}

												var48 = Login.loginBoxX + 180; // L: 1173
												var47 = 276; // L: 1174
												if (var6 == 1 && var45 >= var48 - 75 && var45 <= var48 + 75 && var55 >= var47 - 20 && var55 <= var47 + 20) { // L: 1175
													class25.openURL(var38, true, false); // L: 1176
													Tile.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1177
													class14.method173(6); // L: 1178
													return; // L: 1179
												}

												var48 = Login.loginBoxX + 180; // L: 1181
												var47 = 326; // L: 1182
												if (var6 == 1 && var45 >= var48 - 75 && var45 <= var48 + 75 && var55 >= var47 - 20 && var55 <= var47 + 20) { // L: 1183
													FontName.Login_promptCredentials(false); // L: 1184
												}
											} else if (Login.loginIndex == 24) { // L: 1187
												var10 = Login.loginBoxX + 180; // L: 1188
												var11 = 301; // L: 1189
												if (var6 == 1 && var45 >= var10 - 75 && var45 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 1190
													KeyHandler.method426(false); // L: 1191
												}
											} else if (Login.loginIndex == 26) { // L: 1194
												var10 = Login.loginBoxX + 180 - 80; // L: 1195
												var11 = 321; // L: 1196
												if (var6 == 1 && var45 >= var10 - 75 && var45 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 1197
													class25.openURL(class154.method3285("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1198
													Tile.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1199
													class14.method173(6); // L: 1200
													return; // L: 1201
												}

												var10 = Login.loginBoxX + 180 + 80; // L: 1203
												if (var6 == 1 && var45 >= var10 - 75 && var45 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) { // L: 1204
													FontName.Login_promptCredentials(true); // L: 1205
												}
											}
										} else {
											while (true) {
												do {
													if (!var28.method4081()) { // L: 873
														var46 = 321; // L: 878
														if (var6 == 1 && var55 >= var46 - 20 && var55 <= var46 + 20) { // L: 879
															FontName.Login_promptCredentials(true); // L: 880
														}

														return;
													}
												} while(var28.field2299 != 84 && var28.field2299 != 13); // L: 874

												FontName.Login_promptCredentials(true); // L: 875
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
	} // L: 455

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "317154293"
	)
	static void method5479(String var0, String var1, String var2) {
		class14.method173(7); // L: 1224
		Tile.setLoginResponseString(var0, var1, var2); // L: 1225
	} // L: 1226
}
