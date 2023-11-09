import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1661995171
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -521790487
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1028430513
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lmk;)V"
	)
	public Coord(Coord var1) {
		this.plane = var1.plane; // L: 15
		this.x = var1.x; // L: 16
		this.y = var1.y; // L: 17
	} // L: 18

	public Coord(int var1, int var2, int var3) {
		this.plane = var1; // L: 9
		this.x = var2; // L: 10
		this.y = var3; // L: 11
	} // L: 12

	public Coord(int var1) {
		if (var1 == -1) { // L: 21
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3; // L: 23
			this.x = var1 >> 14 & 16383; // L: 24
			this.y = var1 & 16383; // L: 25
		}

	} // L: 27

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "416360192"
	)
	@Export("packed")
	public int packed() {
		return WorldMapElement.method3691(this.plane, this.x, this.y); // L: 30
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lmk;I)Z",
		garbageValue = "-69405029"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) { // L: 45
			return false;
		} else if (this.x != var1.x) { // L: 46
			return false;
		} else {
			return this.y == var1.y; // L: 47
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "785579845"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63); // L: 61
	}

	public boolean equals(Object var1) {
		if (this == var1) { // L: 39
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1); // L: 40 41
		}
	}

	public int hashCode() {
		return this.packed(); // L: 53
	}

	public String toString() {
		return this.toString(","); // L: 57
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lbi;Lpj;Lpj;I)V",
		garbageValue = "-1224785414"
	)
	static void method6108(GameEngine var0, Font var1, Font var2) {
		int var5;
		boolean var11;
		int var30;
		int var31;
		boolean var39;
		if (Login.worldSelectOpen) { // L: 355
			class212 var29 = Messages.method2838(); // L: 357

			while (true) {
				if (!var29.method4277()) { // L: 358
					if (MouseHandler.MouseHandler_lastButton != 1 && (class412.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) { // L: 374
						break;
					}

					int var4 = Login.xPadding + 280; // L: 375
					if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 376
						WorldMapSprite.changeWorldSelectSorting(0, 0); // L: 377
						break; // L: 378
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 380
						WorldMapSprite.changeWorldSelectSorting(0, 1); // L: 381
						break; // L: 382
					}

					var5 = Login.xPadding + 390; // L: 384
					if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 385
						WorldMapSprite.changeWorldSelectSorting(1, 0); // L: 386
						break; // L: 387
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 389
						WorldMapSprite.changeWorldSelectSorting(1, 1); // L: 390
						break; // L: 391
					}

					var30 = Login.xPadding + 500; // L: 393
					if (MouseHandler.MouseHandler_lastPressedX >= var30 && MouseHandler.MouseHandler_lastPressedX <= var30 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 394
						WorldMapSprite.changeWorldSelectSorting(2, 0); // L: 395
						break; // L: 396
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var30 + 15 && MouseHandler.MouseHandler_lastPressedX <= var30 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 398
						WorldMapSprite.changeWorldSelectSorting(2, 1); // L: 399
						break; // L: 400
					}

					var31 = Login.xPadding + 610; // L: 402
					if (MouseHandler.MouseHandler_lastPressedX >= var31 && MouseHandler.MouseHandler_lastPressedX <= var31 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 403
						WorldMapSprite.changeWorldSelectSorting(3, 0); // L: 404
						break; // L: 405
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var31 + 15 && MouseHandler.MouseHandler_lastPressedX <= var31 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 407
						WorldMapSprite.changeWorldSelectSorting(3, 1); // L: 408
						break; // L: 409
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 411
						class18.method303(); // L: 412
						break; // L: 413
					}

					if (Login.hoveredWorldIndex != -1) { // L: 415
						World var32 = class16.World_worlds[Login.hoveredWorldIndex]; // L: 416
						if (var32.isDeadman()) { // L: 417
							var32.field815 = "beta"; // L: 418
						}

						var39 = false; // L: 420
						if (var32.properties != Client.worldProperties) { // L: 421
							boolean var40 = (Client.worldProperties & 65536) != 0; // L: 422
							var11 = var32.isDeadman(); // L: 423
							if (var40 && !var11 || !var40 && var11) { // L: 424
								var39 = true; // L: 425
							}
						}

						GrandExchangeEvent.changeWorld(var32); // L: 428
						class18.method303(); // L: 429
						if (var39) { // L: 430
							class405.method7622(); // L: 431
						}
					} else {
						if (Login.worldSelectPage > 0 && class25.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class25.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class370.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class370.canvasHeight / 2 + 50) { // L: 435
							--Login.worldSelectPage; // L: 436
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && class14.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= VarbitComposition.canvasWidth - class14.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= VarbitComposition.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class370.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class370.canvasHeight / 2 + 50) { // L: 438
							++Login.worldSelectPage; // L: 439
						}
					}
					break;
				}

				if (var29.field2346 == 13) { // L: 359
					class18.method303(); // L: 360
					break; // L: 361
				}

				if (var29.field2346 == 96) { // L: 363
					if (Login.worldSelectPage > 0 && class25.worldSelectLeftSprite != null) { // L: 364
						--Login.worldSelectPage; // L: 365
					}
				} else if (var29.field2346 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class14.worldSelectRightSprite != null) { // L: 368 369
					++Login.worldSelectPage; // L: 370
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class412.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 445
				ScriptFrame.clientPreferences.method2566(!ScriptFrame.clientPreferences.method2507()); // L: 446
				if (!ScriptFrame.clientPreferences.method2507()) { // L: 447
					ArrayList var3 = new ArrayList(); // L: 448
					var3.add(new class317(class329.archive11, "scape main", "", 255, false)); // L: 449
					NPCComposition.method3873(var3, 0, 0, 0, 100, false); // L: 450
				} else {
					class90.method2339(0, 0); // L: 452
				}

				WorldMapDecorationType.method6641(); // L: 453
			}

			if (Client.gameState != 5) { // L: 455
				if (-1L == Login.field948) { // L: 456
					Login.field948 = AttackOption.method2714() + 1000L; // L: 457
				}

				long var18 = AttackOption.method2714(); // L: 459
				if (class19.method307() && Login.field949 == -1L) { // L: 460 461
					Login.field949 = var18; // L: 462
					if (Login.field949 > Login.field948) { // L: 463
						Login.field948 = Login.field949; // L: 464
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 468
					if (Language.Language_EN == WorldMapElement.clientLanguage) { // L: 469
						if (MouseHandler.MouseHandler_lastButton == 1 || !class412.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 470
							var5 = Login.xPadding + 5; // L: 471
							short var6 = 463; // L: 472
							byte var7 = 100; // L: 473
							byte var20 = 35; // L: 474
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var7 + var5 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var6 + var20) { // L: 475
								if (SoundSystem.loadWorlds()) { // L: 477
									Login.worldSelectOpen = true; // L: 478
									Login.worldSelectPage = 0; // L: 479
									Login.worldSelectPagesCount = 0; // L: 480
								}

								return; // L: 483
							}
						}

						if (World.World_request != null && SoundSystem.loadWorlds()) { // L: 486 487
							Login.worldSelectOpen = true; // L: 488
							Login.worldSelectPage = 0; // L: 489
							Login.worldSelectPagesCount = 0; // L: 490
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton; // L: 494
					var30 = MouseHandler.MouseHandler_lastPressedX; // L: 495
					var31 = MouseHandler.MouseHandler_lastPressedY; // L: 496
					if (var5 == 0) { // L: 497
						var30 = MouseHandler.MouseHandler_x; // L: 498
						var31 = MouseHandler.MouseHandler_y; // L: 499
					}

					if (!class412.mouseCam && var5 == 4) { // L: 501
						var5 = 1;
					}

					class212 var8 = Messages.method2838(); // L: 502
					short var34;
					int var35;
					if (Login.loginIndex == 0) { // L: 503
						var39 = false; // L: 504

						while (var8.method4277()) { // L: 505
							if (var8.field2346 == 84) { // L: 506
								var39 = true; // L: 507
							}
						}

						var35 = class324.loginBoxCenter - 80; // L: 510
						var34 = 291; // L: 511
						if (var5 == 1 && var30 >= var35 - 75 && var30 <= var35 + 75 && var31 >= var34 - 20 && var31 <= var34 + 20) { // L: 512
							class339.openURL(class490.method8767("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 513
						}

						var35 = class324.loginBoxCenter + 80; // L: 515
						if (var5 == 1 && var30 >= var35 - 75 && var30 <= var35 + 75 && var31 >= var34 - 20 && var31 <= var34 + 20 || var39) { // L: 516
							if ((Client.worldProperties & 33554432) != 0) { // L: 517
								Login.Login_response0 = ""; // L: 518
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 519
								Login.Login_response2 = "Your normal account will not be affected."; // L: 520
								Login.Login_response3 = ""; // L: 521
								ObjectSound.method1926(1); // L: 522
								Message.method1227(); // L: 523
							} else if ((Client.worldProperties & 4) != 0) { // L: 525
								if ((Client.worldProperties & 1024) != 0) { // L: 526
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 527
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 528
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 529
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 532
									Login.Login_response2 = "Players can attack each other"; // L: 533
									Login.Login_response3 = "almost everywhere."; // L: 534
								}

								Login.Login_response0 = "Warning!"; // L: 536
								ObjectSound.method1926(1); // L: 537
								Message.method1227(); // L: 538
							} else if ((Client.worldProperties & 1024) != 0) { // L: 540
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 541
								Login.Login_response2 = "The Protect Item prayer will"; // L: 542
								Login.Login_response3 = "not work on this world."; // L: 543
								Login.Login_response0 = "Warning!"; // L: 544
								ObjectSound.method1926(1); // L: 545
								Message.method1227(); // L: 546
							} else {
								ScriptFrame.Login_promptCredentials(false); // L: 549
							}
						}
					} else {
						int var9;
						short var10;
						if (Login.loginIndex == 1) { // L: 553
							while (true) {
								if (!var8.method4277()) { // L: 554
									var9 = class324.loginBoxCenter - 80; // L: 562
									var10 = 321; // L: 563
									if (var5 == 1 && var30 >= var9 - 75 && var30 <= var9 + 75 && var31 >= var10 - 20 && var31 <= var10 + 20) { // L: 564
										ScriptFrame.Login_promptCredentials(false); // L: 565
									}

									var9 = class324.loginBoxCenter + 80; // L: 567
									if (var5 == 1 && var30 >= var9 - 75 && var30 <= var9 + 75 && var31 >= var10 - 20 && var31 <= var10 + 20) { // L: 568
										ObjectSound.method1926(0); // L: 569
									}
									break;
								}

								if (var8.field2346 == 84) { // L: 555
									ScriptFrame.Login_promptCredentials(false); // L: 556
								} else if (var8.field2346 == 13) { // L: 558
									ObjectSound.method1926(0); // L: 559
								}
							}
						} else {
							int var14;
							short var33;
							if (Login.loginIndex == 2) { // L: 572
								var33 = 201; // L: 573
								var9 = var33 + 52; // L: 574
								if (var5 == 1 && var31 >= var9 - 12 && var31 < var9 + 2) { // L: 575
									Login.currentLoginField = 0;
								}

								var9 += 15; // L: 576
								if (var5 == 1 && var31 >= var9 - 12 && var31 < var9 + 2) { // L: 577
									Login.currentLoginField = 1;
								}

								var9 += 15; // L: 578
								var33 = 361; // L: 579
								if (class305.field3405 != null) { // L: 580
									var35 = class305.field3405.highX / 2; // L: 581
									if (var5 == 1 && var30 >= class305.field3405.lowX - var35 && var30 <= var35 + class305.field3405.lowX && var31 >= var33 - 15 && var31 < var33) { // L: 582
										switch(Login.field927) { // L: 583
										case 1:
											class156.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 591
											ObjectSound.method1926(5); // L: 592
											return; // L: 593
										case 2:
											class339.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 586
										}
									}
								}

								var35 = class324.loginBoxCenter - 80; // L: 598
								var34 = 321; // L: 599
								if (var5 == 1 && var30 >= var35 - 75 && var30 <= var35 + 75 && var31 >= var34 - 20 && var31 <= var34 + 20) { // L: 600
									Login.Login_username = Login.Login_username.trim(); // L: 601
									if (Login.Login_username.length() == 0) { // L: 602
										class156.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 603
										return; // L: 604
									}

									if (Login.Login_password.length() == 0) { // L: 606
										class156.setLoginResponseString("", "Please enter your password.", ""); // L: 607
										return; // L: 608
									}

									class156.setLoginResponseString("", "Connecting to server...", ""); // L: 610
									class159.method3385(false); // L: 611
									AttackOption.method2723(20); // L: 612
									return; // L: 613
								}

								var35 = Login.loginBoxX + 180 + 80; // L: 615
								if (var5 == 1 && var30 >= var35 - 75 && var30 <= var35 + 75 && var31 >= var34 - 20 && var31 <= var34 + 20) { // L: 616
									ObjectSound.method1926(0); // L: 617
									Login.Login_username = ""; // L: 618
									Login.Login_password = ""; // L: 619
									Skills.field3830 = 0; // L: 620
									class165.otp = ""; // L: 621
									Login.field917 = true; // L: 622
								}

								var35 = class324.loginBoxCenter + -117; // L: 624
								var34 = 277; // L: 625
								Login.field914 = var30 >= var35 && var30 < var35 + class352.field4209 && var31 >= var34 && var31 < var34 + DevicePcmPlayerProvider.field105; // L: 626
								if (var5 == 1 && Login.field914) { // L: 627
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 628
									if (!Client.Login_isUsernameRemembered && ScriptFrame.clientPreferences.method2504() != null) { // L: 629
										ScriptFrame.clientPreferences.method2521((String)null); // L: 630
									}
								}

								var35 = class324.loginBoxCenter + 24; // L: 633
								var34 = 277; // L: 634
								Login.field940 = var30 >= var35 && var30 < var35 + class352.field4209 && var31 >= var34 && var31 < var34 + DevicePcmPlayerProvider.field105; // L: 635
								if (var5 == 1 && Login.field940) { // L: 636
									ScriptFrame.clientPreferences.method2589(!ScriptFrame.clientPreferences.method2505()); // L: 637
									if (!ScriptFrame.clientPreferences.method2505()) { // L: 638
										Login.Login_username = ""; // L: 639
										ScriptFrame.clientPreferences.method2521((String)null); // L: 640
										Message.method1227(); // L: 641
									}
								}

								while (true) {
									Transferable var37;
									do {
										while (true) {
											label1476:
											do {
												while (true) {
													while (var8.method4277()) { // L: 644
														if (var8.field2346 != 13) { // L: 645
															if (Login.currentLoginField != 0) { // L: 654
																continue label1476;
															}

															Language.method7008(var8.field2345); // L: 655
															if (var8.field2346 == 85 && Login.Login_username.length() > 0) { // L: 656
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var8.field2346 == 84 || var8.field2346 == 80) { // L: 657
																Login.currentLoginField = 1;
															}

															if (class126.method2994(var8.field2345) && Login.Login_username.length() < 320) { // L: 658
																Login.Login_username = Login.Login_username + var8.field2345;
															}
														} else {
															ObjectSound.method1926(0); // L: 646
															Login.Login_username = ""; // L: 647
															Login.Login_password = ""; // L: 648
															Skills.field3830 = 0; // L: 649
															class165.otp = ""; // L: 650
															Login.field917 = true; // L: 651
														}
													}

													return; // L: 1052
												}
											} while(Login.currentLoginField != 1); // L: 660

											if (var8.field2346 == 85 && Login.Login_password.length() > 0) { // L: 661
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 662
											} else if (var8.field2346 == 84 || var8.field2346 == 80) { // L: 664
												Login.currentLoginField = 0; // L: 665
												if (var8.field2346 == 84) { // L: 666
													Login.Login_username = Login.Login_username.trim(); // L: 667
													if (Login.Login_username.length() == 0) { // L: 668
														class156.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 669
														return; // L: 670
													}

													if (Login.Login_password.length() == 0) { // L: 672
														class156.setLoginResponseString("", "Please enter your password.", ""); // L: 673
														return; // L: 674
													}

													class156.setLoginResponseString("", "Connecting to server...", ""); // L: 676
													class159.method3385(false); // L: 677
													AttackOption.method2723(20); // L: 678
													return; // L: 679
												}
											}

											if ((var8.method4285(82) || var8.method4285(87)) && var8.field2346 == 67) { // L: 682
												Clipboard var36 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 683
												var37 = var36.getContents(class415.client); // L: 684
												var14 = 20 - Login.Login_password.length(); // L: 685
												break;
											}

											if (class218.method4387(var8.field2345) && class126.method2994(var8.field2345) && Login.Login_password.length() < 20) { // L: 702
												Login.Login_password = Login.Login_password + var8.field2345; // L: 703
											}
										}
									} while(var14 <= 0); // L: 686

									try {
										String var15 = (String)var37.getTransferData(DataFlavor.stringFlavor); // L: 688
										int var16 = Math.min(var14, var15.length()); // L: 689

										for (int var17 = 0; var17 < var16; ++var17) { // L: 690
											if (!class218.method4387(var15.charAt(var17)) || !class126.method2994(var15.charAt(var17))) { // L: 691
												ObjectSound.method1926(3); // L: 692
												return; // L: 693
											}
										}

										Login.Login_password = Login.Login_password + var15.substring(0, var16); // L: 696
									} catch (UnsupportedFlavorException var27) { // L: 698
									} catch (IOException var28) { // L: 699
									}
								}
							} else {
								Bounds var21;
								if (Login.loginIndex == 3) { // L: 709
									var9 = Login.loginBoxX + 180; // L: 710
									var10 = 241; // L: 711
									var21 = var1.method7479(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var9, var10); // L: 712
									if (var5 == 1 && var21.method8146(var30, var31)) { // L: 713
										class339.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 714
									}

									var9 = Login.loginBoxX + 180; // L: 716
									var10 = 276; // L: 717
									if (var5 == 1 && var30 >= var9 - 75 && var30 <= var9 + 75 && var31 >= var10 - 20 && var31 <= var10 + 20) { // L: 718
										class93.method2410(false); // L: 719
									}

									var9 = Login.loginBoxX + 180; // L: 721
									var10 = 326; // L: 722
									if (var5 == 1 && var30 >= var9 - 75 && var30 <= var9 + 75 && var31 >= var10 - 20 && var31 <= var10 + 20) { // L: 723
										class156.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 724
										ObjectSound.method1926(5); // L: 725
										return; // L: 726
									}
								} else {
									int var22;
									if (Login.loginIndex == 4) { // L: 729
										var9 = Login.loginBoxX + 180 - 80; // L: 730
										var10 = 321; // L: 731
										if (var5 == 1 && var30 >= var9 - 75 && var30 <= var9 + 75 && var31 >= var10 - 20 && var31 <= var10 + 20) { // L: 732
											class165.otp.trim(); // L: 733
											if (class165.otp.length() != 6) { // L: 734
												class156.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 735
												return; // L: 736
											}

											Skills.field3830 = Integer.parseInt(class165.otp); // L: 738
											class165.otp = ""; // L: 739
											class159.method3385(true); // L: 740
											class156.setLoginResponseString("", "Connecting to server...", ""); // L: 741
											AttackOption.method2723(20); // L: 742
											return; // L: 743
										}

										if (var5 == 1 && var30 >= Login.loginBoxX + 180 - 9 && var30 <= Login.loginBoxX + 180 + 130 && var31 >= 263 && var31 <= 296) { // L: 745
											Login.field917 = !Login.field917; // L: 746
										}

										if (var5 == 1 && var30 >= Login.loginBoxX + 180 - 34 && var30 <= Login.loginBoxX + 34 + 180 && var31 >= 351 && var31 <= 363) { // L: 748
											class339.openURL(class490.method8767("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 749
										}

										var9 = Login.loginBoxX + 180 + 80; // L: 751
										if (var5 == 1 && var30 >= var9 - 75 && var30 <= var9 + 75 && var31 >= var10 - 20 && var31 <= var10 + 20) { // L: 752
											ObjectSound.method1926(0); // L: 753
											Login.Login_username = ""; // L: 754
											Login.Login_password = ""; // L: 755
											Skills.field3830 = 0; // L: 756
											class165.otp = ""; // L: 757
										}

										while (var8.method4277()) { // L: 759
											var11 = false; // L: 760

											for (var22 = 0; var22 < "1234567890".length(); ++var22) { // L: 761
												if (var8.field2345 == "1234567890".charAt(var22)) { // L: 762
													var11 = true; // L: 763
													break; // L: 764
												}
											}

											if (var8.field2346 == 13) { // L: 767
												ObjectSound.method1926(0); // L: 768
												Login.Login_username = ""; // L: 769
												Login.Login_password = ""; // L: 770
												Skills.field3830 = 0; // L: 771
												class165.otp = ""; // L: 772
											} else {
												if (var8.field2346 == 85 && class165.otp.length() > 0) { // L: 775
													class165.otp = class165.otp.substring(0, class165.otp.length() - 1);
												}

												if (var8.field2346 == 84) { // L: 776
													class165.otp.trim(); // L: 777
													if (class165.otp.length() != 6) { // L: 778
														class156.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 779
														return; // L: 780
													}

													Skills.field3830 = Integer.parseInt(class165.otp); // L: 782
													class165.otp = ""; // L: 783
													class159.method3385(true); // L: 784
													class156.setLoginResponseString("", "Connecting to server...", ""); // L: 785
													AttackOption.method2723(20); // L: 786
													return; // L: 787
												}

												if (var11 && class165.otp.length() < 6) { // L: 789
													class165.otp = class165.otp + var8.field2345;
												}
											}
										}
									} else {
										int var23;
										if (Login.loginIndex == 5) { // L: 793
											var9 = Login.loginBoxX + 180 - 80; // L: 794
											var10 = 321; // L: 795
											if (var5 == 1 && var30 >= var9 - 75 && var30 <= var9 + 75 && var31 >= var10 - 20 && var31 <= var10 + 20) { // L: 796
												Interpreter.method2076(); // L: 797
												return; // L: 798
											}

											var9 = Login.loginBoxX + 180 + 80; // L: 800
											if (var5 == 1 && var30 >= var9 - 75 && var30 <= var9 + 75 && var31 >= var10 - 20 && var31 <= var10 + 20) { // L: 801
												ScriptFrame.Login_promptCredentials(true); // L: 802
											}

											var34 = 361; // L: 804
											if (class372.field4350 != null) { // L: 805
												var22 = class372.field4350.highX / 2; // L: 806
												if (var5 == 1 && var30 >= class372.field4350.lowX - var22 && var30 <= var22 + class372.field4350.lowX && var31 >= var34 - 15 && var31 < var34) { // L: 807
													class339.openURL(class490.method8767("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 808
												}
											}

											while (var8.method4277()) { // L: 811
												boolean var41 = false; // L: 812

												for (var23 = 0; var23 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var23) { // L: 813
													if (var8.field2345 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var23)) { // L: 814
														var41 = true; // L: 815
														break; // L: 816
													}
												}

												if (var8.field2346 == 13) { // L: 819
													ScriptFrame.Login_promptCredentials(true); // L: 820
												} else {
													if (var8.field2346 == 85 && Login.Login_username.length() > 0) { // L: 823
														Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
													}

													if (var8.field2346 == 84) { // L: 824
														Interpreter.method2076(); // L: 825
														return; // L: 826
													}

													if (var41 && Login.Login_username.length() < 320) { // L: 828
														Login.Login_username = Login.Login_username + var8.field2345;
													}
												}
											}
										} else if (Login.loginIndex != 6) { // L: 832
											if (Login.loginIndex == 7) { // L: 843
												if (class496.field5021 && !Client.onMobile) { // L: 844
													var9 = class324.loginBoxCenter - 150; // L: 845
													var35 = var9 + 40 + 240 + 25; // L: 846
													var34 = 231; // L: 847
													var22 = var34 + 40; // L: 848
													if (var5 == 1 && var30 >= var9 && var30 <= var35 && var31 >= var34 && var31 <= var22) { // L: 849
														var14 = var9; // L: 851
														int var24 = 0;

														while (true) {
															if (var24 >= 8) {
																var23 = 0; // L: 861
																break;
															}

															if (var30 <= var14 + 30) { // L: 854
																var23 = var24; // L: 855
																break; // L: 856
															}

															var14 += 30; // L: 858
															var14 += var24 != 1 && var24 != 3 ? 5 : 20; // L: 859
															++var24; // L: 853
														}

														Login.field918 = var23; // L: 863
													}

													var23 = Login.loginBoxX + 180 - 80; // L: 865
													short var38 = 321; // L: 866
													boolean var42;
													if (var5 == 1 && var30 >= var23 - 75 && var30 <= var23 + 75 && var31 >= var38 - 20 && var31 <= var38 + 20) { // L: 867
														var42 = class145.method3227(); // L: 868
														if (var42) { // L: 869
															AttackOption.method2723(50); // L: 870
															return; // L: 871
														}
													}

													var23 = Login.loginBoxX + 180 + 80; // L: 874
													if (var5 == 1 && var30 >= var23 - 75 && var30 <= var23 + 75 && var31 >= var38 - 20 && var31 <= var38 + 20) { // L: 875
														Login.field936 = new String[8]; // L: 876
														ScriptFrame.Login_promptCredentials(true); // L: 877
													}

													while (var8.method4277()) { // L: 879
														if (var8.field2346 == 101) { // L: 880
															Login.field936[Login.field918] = null; // L: 881
														}

														if (var8.field2346 == 85) { // L: 883
															if (Login.field936[Login.field918] == null && Login.field918 > 0) { // L: 884
																--Login.field918; // L: 885
															}

															Login.field936[Login.field918] = null; // L: 887
														}

														if (var8.field2345 >= '0' && var8.field2345 <= '9') { // L: 889
															Login.field936[Login.field918] = "" + var8.field2345; // L: 890
															if (Login.field918 < 7) { // L: 891
																++Login.field918; // L: 892
															}
														}

														if (var8.field2346 == 84) { // L: 895
															var42 = class145.method3227(); // L: 896
															if (var42) { // L: 897
																AttackOption.method2723(50); // L: 898
															}

															return; // L: 900
														}
													}
												} else {
													var9 = Login.loginBoxX + 180 - 80; // L: 905
													var10 = 321; // L: 906
													if (var5 == 1 && var30 >= var9 - 75 && var30 <= var9 + 75 && var31 >= var10 - 20 && var31 <= var10 + 20) { // L: 907
														class339.openURL(class490.method8767("secure", true) + "m=dob/set_dob.ws", true, false); // L: 908
														class156.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 909
														ObjectSound.method1926(6); // L: 910
														return; // L: 911
													}

													var9 = Login.loginBoxX + 180 + 80; // L: 913
													if (var5 == 1 && var30 >= var9 - 75 && var30 <= var9 + 75 && var31 >= var10 - 20 && var31 <= var10 + 20) { // L: 914
														ScriptFrame.Login_promptCredentials(true); // L: 915
													}
												}
											} else if (Login.loginIndex == 8) { // L: 919
												var9 = Login.loginBoxX + 180 - 80; // L: 920
												var10 = 321; // L: 921
												if (var5 == 1 && var30 >= var9 - 75 && var30 <= var9 + 75 && var31 >= var10 - 20 && var31 <= var10 + 20) { // L: 922
													class339.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 923
													class156.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 924
													ObjectSound.method1926(6); // L: 925
													return; // L: 926
												}

												var9 = Login.loginBoxX + 180 + 80; // L: 928
												if (var5 == 1 && var30 >= var9 - 75 && var30 <= var9 + 75 && var31 >= var10 - 20 && var31 <= var10 + 20) { // L: 929
													ScriptFrame.Login_promptCredentials(true); // L: 930
												}
											} else if (Login.loginIndex == 9) { // L: 933
												var9 = Login.loginBoxX + 180; // L: 934
												var10 = 311; // L: 935
												if (var8.field2346 == 84 || var8.field2346 == 13 || var5 == 1 && var30 >= var9 - 75 && var30 <= var9 + 75 && var31 >= var10 - 20 && var31 <= var10 + 20) { // L: 936
													class93.method2410(false); // L: 937
												}
											} else if (Login.loginIndex == 10) { // L: 940
												var9 = Login.loginBoxX + 180; // L: 941
												var10 = 209; // L: 942
												if (var8.field2346 == 84 || var5 == 1 && var30 >= var9 - 109 && var30 <= var9 + 109 && var31 >= var10 && var31 <= var10 + 68) { // L: 943
													class156.setLoginResponseString("", "Connecting to server...", ""); // L: 944
													Client.field539 = class517.field5118; // L: 945
													class159.method3385(false); // L: 946
													AttackOption.method2723(20); // L: 947
												}
											} else if (Login.loginIndex == 12) { // L: 950
												var9 = class324.loginBoxCenter; // L: 951
												var10 = 233; // L: 952
												var21 = var2.method7479(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 953
												Bounds var12 = var2.method7479(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 954
												Bounds var13 = var2.method7479(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 955
												var35 = var10 + 17; // L: 956
												Bounds var25 = var2.method7479(0, 34, "<col=ffd200>agreement (EULA)</col>.", var9, var35); // L: 957
												if (var5 == 1) { // L: 958
													if (var21.method8146(var30, var31)) { // L: 959
														class339.openURL("https://www.jagex.com/terms", true, false); // L: 960
													} else if (var12.method8146(var30, var31)) { // L: 962
														class339.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 963
													} else if (var13.method8146(var30, var31) || var25.method8146(var30, var31)) { // L: 965
														class339.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 966
													}
												}

												var9 = class324.loginBoxCenter - 80; // L: 969
												var10 = 311; // L: 970
												if (var5 == 1 && var30 >= var9 - 75 && var30 <= var9 + 75 && var31 >= var10 - 20 && var31 <= var10 + 20) { // L: 971
													ScriptFrame.clientPreferences.method2517(Client.field503); // L: 973
													class93.method2410(true); // L: 975
												}

												var9 = class324.loginBoxCenter + 80; // L: 977
												if (var5 == 1 && var30 >= var9 - 75 && var30 <= var9 + 75 && var31 >= var10 - 20 && var31 <= var10 + 20) { // L: 978
													Login.loginIndex = 13; // L: 979
												}
											} else if (Login.loginIndex == 13) { // L: 982
												var9 = class324.loginBoxCenter; // L: 983
												var10 = 321; // L: 984
												if (var5 == 1 && var30 >= var9 - 75 && var30 <= var9 + 75 && var31 >= var10 - 20 && var31 <= var10 + 20) { // L: 985
													class93.method2410(true); // L: 986
												}
											} else if (Login.loginIndex == 14) { // L: 989
												String var26 = ""; // L: 990
												switch(Login.field938) { // L: 991
												case 0:
													var26 = "https://secure.runescape.com/m=offence-appeal/account-history"; // L: 1002
													break;
												case 1:
													var26 = "https://secure.runescape.com/m=accountappeal/passwordrecovery"; // L: 993
													break; // L: 994
												case 2:
													var26 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance"; // L: 996
													break; // L: 997
												default:
													ScriptFrame.Login_promptCredentials(false); // L: 999
												}

												var35 = Login.loginBoxX + 180; // L: 1005
												var34 = 276; // L: 1006
												if (var5 == 1 && var30 >= var35 - 75 && var30 <= var35 + 75 && var31 >= var34 - 20 && var31 <= var34 + 20) { // L: 1007
													class339.openURL(var26, true, false); // L: 1008
													class156.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1009
													ObjectSound.method1926(6); // L: 1010
													return; // L: 1011
												}

												var35 = Login.loginBoxX + 180; // L: 1013
												var34 = 326; // L: 1014
												if (var5 == 1 && var30 >= var35 - 75 && var30 <= var35 + 75 && var31 >= var34 - 20 && var31 <= var34 + 20) { // L: 1015
													ScriptFrame.Login_promptCredentials(false); // L: 1016
												}
											} else if (Login.loginIndex == 24) { // L: 1019
												var9 = Login.loginBoxX + 180; // L: 1020
												var10 = 301; // L: 1021
												if (var5 == 1 && var30 >= var9 - 75 && var30 <= var9 + 75 && var31 >= var10 - 20 && var31 <= var10 + 20) { // L: 1022
													class93.method2410(false); // L: 1023
												}
											} else if (Login.loginIndex == 32) { // L: 1026
												var9 = Login.loginBoxX + 180 - 80; // L: 1027
												var10 = 321; // L: 1028
												if (var5 == 1 && var30 >= var9 - 75 && var30 <= var9 + 75 && var31 >= var10 - 20 && var31 <= var10 + 20) { // L: 1029
													class339.openURL(class490.method8767("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1030
													class156.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1031
													ObjectSound.method1926(6); // L: 1032
													return; // L: 1033
												}

												var9 = Login.loginBoxX + 180 + 80; // L: 1035
												if (var5 == 1 && var30 >= var9 - 75 && var30 <= var9 + 75 && var31 >= var10 - 20 && var31 <= var10 + 20) { // L: 1036
													ScriptFrame.Login_promptCredentials(true); // L: 1037
												}
											} else if (Login.loginIndex == 33) { // L: 1040
												var9 = Login.loginBoxX + 180; // L: 1041
												var10 = 276; // L: 1042
												if (var5 == 1 && var30 >= var9 - 75 && var30 <= var9 + 75 && var31 >= var10 - 20 && var31 <= var10 + 20) { // L: 1043
													class339.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 1044
												}

												var9 = Login.loginBoxX + 180; // L: 1046
												var10 = 326; // L: 1047
												if (var5 == 1 && var30 >= var9 - 75 && var30 <= var9 + 75 && var31 >= var10 - 20 && var31 <= var10 + 20) { // L: 1048
													ScriptFrame.Login_promptCredentials(true); // L: 1049
												}
											}
										} else {
											while (true) {
												do {
													if (!var8.method4277()) { // L: 833
														var33 = 321; // L: 838
														if (var5 == 1 && var31 >= var33 - 20 && var31 <= var33 + 20) { // L: 839
															ScriptFrame.Login_promptCredentials(true); // L: 840
														}

														return;
													}
												} while(var8.field2346 != 84 && var8.field2346 != 13); // L: 834

												ScriptFrame.Login_promptCredentials(true); // L: 835
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
	} // L: 443
}
