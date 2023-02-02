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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public class class175 {
	@ObfuscatedName("v")
	public short[] field1913;
	@ObfuscatedName("x")
	public short[] field1914;

	public class175(int var1) {
		ItemComposition var2 = NPCComposition.ItemComposition_get(var1); // L: 12
		if (var2.method3963()) { // L: 13
			this.field1913 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1913, 0, this.field1913.length); // L: 15
		}

		if (var2.method3941()) { // L: 17
			this.field1914 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1914, 0, this.field1914.length); // L: 19
		}

	} // L: 21

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1790788447"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var2 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 26
		VarbitComposition var1;
		if (var2 != null) { // L: 27
			var1 = var2; // L: 28
		} else {
			byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 31
			var2 = new VarbitComposition(); // L: 32
			if (var3 != null) { // L: 33
				var2.decode(new Buffer(var3));
			}

			VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0); // L: 34
			var1 = var2; // L: 35
		}

		int var7 = var1.baseVar; // L: 38
		int var4 = var1.startBit; // L: 39
		int var5 = var1.endBit; // L: 40
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 41
		return Varps.Varps_main[var7] >> var4 & var6; // L: 42
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Lkd;",
		garbageValue = "1101221337"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16; // L: 242
		int var2 = var0 & 65535; // L: 243
		if (class71.Widget_interfaceComponents[var1] == null || class71.Widget_interfaceComponents[var1][var2] == null) { // L: 244
			boolean var3 = Players.loadInterface(var1); // L: 245
			if (!var3) { // L: 246
				return null;
			}
		}

		return class71.Widget_interfaceComponents[var1][var2]; // L: 248
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lan;Lnv;B)V",
		garbageValue = "0"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1) {
		int var4;
		int var81;
		int var82;
		if (Login.worldSelectOpen) { // L: 374
			class201 var80 = Client.field747; // L: 378
			class201 var3 = var80; // L: 380

			while (true) {
				if (!var3.method4114()) { // L: 381
					if (MouseHandler.MouseHandler_lastButton != 1 && (SceneTilePaint.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) { // L: 402
						break;
					}

					var4 = Login.xPadding + 280; // L: 403
					if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 404
						class9.changeWorldSelectSorting(0, 0); // L: 405
						break; // L: 406
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 408
						class9.changeWorldSelectSorting(0, 1); // L: 409
						break; // L: 410
					}

					var81 = Login.xPadding + 390; // L: 412
					if (MouseHandler.MouseHandler_lastPressedX >= var81 && MouseHandler.MouseHandler_lastPressedX <= var81 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 413
						class9.changeWorldSelectSorting(1, 0); // L: 414
						break; // L: 415
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var81 + 15 && MouseHandler.MouseHandler_lastPressedX <= var81 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 417
						class9.changeWorldSelectSorting(1, 1); // L: 418
						break; // L: 419
					}

					var82 = Login.xPadding + 500; // L: 421
					if (MouseHandler.MouseHandler_lastPressedX >= var82 && MouseHandler.MouseHandler_lastPressedX <= var82 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 422
						class9.changeWorldSelectSorting(2, 0); // L: 423
						break; // L: 424
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var82 + 15 && MouseHandler.MouseHandler_lastPressedX <= var82 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 426
						class9.changeWorldSelectSorting(2, 1); // L: 427
						break; // L: 428
					}

					int var83 = Login.xPadding + 610; // L: 430
					if (MouseHandler.MouseHandler_lastPressedX >= var83 && MouseHandler.MouseHandler_lastPressedX <= var83 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 431
						class9.changeWorldSelectSorting(3, 0); // L: 432
						break; // L: 433
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var83 + 15 && MouseHandler.MouseHandler_lastPressedX <= var83 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 435
						class9.changeWorldSelectSorting(3, 1); // L: 436
						break; // L: 437
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 439
						Login.worldSelectOpen = false; // L: 441
						SecureRandomCallable.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 442
						class9.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 443
						Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 444
						break; // L: 446
					}

					if (Login.hoveredWorldIndex != -1) { // L: 448
						World var84 = World.World_worlds[Login.hoveredWorldIndex]; // L: 449
						UserComparator6.changeWorld(var84); // L: 450
						Login.worldSelectOpen = false; // L: 452
						SecureRandomCallable.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 453
						class9.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 454
						Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 455
					} else {
						if (Login.worldSelectPage > 0 && BufferedNetSocket.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= BufferedNetSocket.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= Language.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= Language.canvasHeight / 2 + 50) { // L: 459
							--Login.worldSelectPage; // L: 460
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && class140.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= CollisionMap.canvasWidth - class140.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= CollisionMap.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= Language.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= Language.canvasHeight / 2 + 50) { // L: 462
							++Login.worldSelectPage; // L: 463
						}
					}
					break;
				}

				if (var3.field2328 == 13) { // L: 382
					Login.worldSelectOpen = false; // L: 384
					SecureRandomCallable.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 385
					class9.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 386
					Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 387
					break; // L: 389
				}

				if (var3.field2328 == 96) { // L: 391
					if (Login.worldSelectPage > 0 && BufferedNetSocket.worldSelectLeftSprite != null) { // L: 392
						--Login.worldSelectPage; // L: 393
					}
				} else if (var3.field2328 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class140.worldSelectRightSprite != null) { // L: 396 397
					++Login.worldSelectPage; // L: 398
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !SceneTilePaint.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 469
				StructComposition.clientPreferences.method2448(!StructComposition.clientPreferences.method2428()); // L: 470
				if (!StructComposition.clientPreferences.method2428()) { // L: 471
					Archive var2 = class162.archive6; // L: 472
					int var35 = var2.getGroupId("scape main"); // L: 474
					var4 = var2.getFileId(var35, ""); // L: 475
					KeyHandler.method426(var2, var35, var4, 255, false); // L: 476
				} else {
					class6.method39(); // L: 479
				}
			}

			if (Client.gameState != 5) { // L: 481
				if (-1L == Login.field937) { // L: 482
					Login.field937 = Message.method1197() + 1000L; // L: 483
				}

				long var36 = Message.method1197(); // L: 485
				if (HitSplatDefinition.method3824() && Login.field950 == -1L) { // L: 486 487
					Login.field950 = var36; // L: 488
					if (Login.field950 > Login.field937) { // L: 489
						Login.field937 = Login.field950; // L: 490
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 494
					if (Language.Language_EN == class173.clientLanguage) { // L: 495
						if (MouseHandler.MouseHandler_lastButton == 1 || !SceneTilePaint.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 496
							var4 = Login.xPadding + 5; // L: 497
							short var5 = 463; // L: 498
							byte var6 = 100; // L: 499
							byte var7 = 35; // L: 500
							if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + var6 && MouseHandler.MouseHandler_lastPressedY >= var5 && MouseHandler.MouseHandler_lastPressedY <= var5 + var7) { // L: 501
								WorldMapSection0.method5228(); // L: 502
								return; // L: 503
							}
						}

						if (class1.World_request != null) { // L: 506
							WorldMapSection0.method5228();
						}
					}

					var4 = MouseHandler.MouseHandler_lastButton; // L: 508
					var81 = MouseHandler.MouseHandler_lastPressedX; // L: 509
					var82 = MouseHandler.MouseHandler_lastPressedY; // L: 510
					if (var4 == 0) { // L: 511
						var81 = MouseHandler.MouseHandler_x; // L: 512
						var82 = MouseHandler.MouseHandler_y; // L: 513
					}

					if (!SceneTilePaint.mouseCam && var4 == 4) { // L: 515
						var4 = 1;
					}

					class201 var38 = Client.field747; // L: 518
					class201 var8 = var38; // L: 520
					int var86;
					short var87;
					if (Login.loginIndex == 0) { // L: 521
						boolean var95 = false; // L: 522

						while (var8.method4114()) { // L: 523
							if (var8.field2328 == 84) { // L: 524
								var95 = true; // L: 525
							}
						}

						var86 = UrlRequest.loginBoxCenter - 80; // L: 528
						var87 = 291; // L: 529
						if (var4 == 1 && var81 >= var86 - 75 && var81 <= var86 + 75 && var82 >= var87 - 20 && var82 <= var87 + 20) { // L: 530
							ModeWhere.openURL(ScriptFrame.method1169("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 531
						}

						var86 = UrlRequest.loginBoxCenter + 80; // L: 533
						if (var4 == 1 && var81 >= var86 - 75 && var81 <= var86 + 75 && var82 >= var87 - 20 && var82 <= var87 + 20 || var95) { // L: 534
							if ((Client.worldProperties & 33554432) != 0) { // L: 535
								Login.Login_response0 = ""; // L: 536
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 537
								Login.Login_response2 = "Your normal account will not be affected."; // L: 538
								Login.Login_response3 = ""; // L: 539
								class12.method155(1); // L: 540
								SoundSystem.method873(); // L: 541
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
								class12.method155(1); // L: 555
								SoundSystem.method873(); // L: 556
							} else if ((Client.worldProperties & 1024) != 0) { // L: 558
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 559
								Login.Login_response2 = "The Protect Item prayer will"; // L: 560
								Login.Login_response3 = "not work on this world."; // L: 561
								Login.Login_response0 = "Warning!"; // L: 562
								class12.method155(1); // L: 563
								SoundSystem.method873(); // L: 564
							} else {
								class343.Login_promptCredentials(false); // L: 567
							}
						}
					} else {
						int var9;
						short var10;
						if (Login.loginIndex == 1) { // L: 571
							while (true) {
								if (!var8.method4114()) { // L: 572
									var9 = UrlRequest.loginBoxCenter - 80; // L: 580
									var10 = 321; // L: 581
									if (var4 == 1 && var81 >= var9 - 75 && var81 <= var9 + 75 && var82 >= var10 - 20 && var82 <= var10 + 20) { // L: 582
										class343.Login_promptCredentials(false); // L: 583
									}

									var9 = UrlRequest.loginBoxCenter + 80; // L: 585
									if (var4 == 1 && var81 >= var9 - 75 && var81 <= var9 + 75 && var82 >= var10 - 20 && var82 <= var10 + 20) { // L: 586
										class12.method155(0); // L: 587
									}
									break;
								}

								if (var8.field2328 == 84) { // L: 573
									class343.Login_promptCredentials(false); // L: 574
								} else if (var8.field2328 == 13) { // L: 576
									class12.method155(0); // L: 577
								}
							}
						} else {
							int var13;
							int var14;
							short var85;
							if (Login.loginIndex == 2) { // L: 590
								var85 = 201; // L: 591
								var9 = var85 + 52; // L: 592
								if (var4 == 1 && var82 >= var9 - 12 && var82 < var9 + 2) { // L: 593
									Login.currentLoginField = 0;
								}

								var9 += 15; // L: 594
								if (var4 == 1 && var82 >= var9 - 12 && var82 < var9 + 2) { // L: 595
									Login.currentLoginField = 1;
								}

								var9 += 15; // L: 596
								var85 = 361; // L: 597
								if (class379.field4467 != null) { // L: 598
									var86 = class379.field4467.highX / 2; // L: 599
									if (var4 == 1 && var81 >= class379.field4467.lowX - var86 && var81 <= var86 + class379.field4467.lowX && var82 >= var85 - 15 && var82 < var85) { // L: 600
										switch(Login.field928) { // L: 601
										case 1:
											TaskHandler.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 604
											class12.method155(5); // L: 605
											return; // L: 606
										case 2:
											ModeWhere.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 610
										}
									}
								}

								var86 = UrlRequest.loginBoxCenter - 80; // L: 616
								var87 = 321; // L: 617
								if (var4 == 1 && var81 >= var86 - 75 && var81 <= var86 + 75 && var82 >= var87 - 20 && var82 <= var87 + 20) { // L: 618
									Login.Login_username = Login.Login_username.trim(); // L: 619
									if (Login.Login_username.length() == 0) { // L: 620
										TaskHandler.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 621
										return; // L: 622
									}

									if (Login.Login_password.length() == 0) { // L: 624
										TaskHandler.setLoginResponseString("", "Please enter your password.", ""); // L: 625
										return; // L: 626
									}

									TaskHandler.setLoginResponseString("", "Connecting to server...", ""); // L: 628
									InterfaceParent.method2251(false); // L: 629
									class140.method3102(20); // L: 630
									return; // L: 631
								}

								var86 = Login.loginBoxX + 180 + 80; // L: 633
								if (var4 == 1 && var81 >= var86 - 75 && var81 <= var86 + 75 && var82 >= var87 - 20 && var82 <= var87 + 20) { // L: 634
									class12.method155(0); // L: 635
									Login.Login_username = ""; // L: 636
									Login.Login_password = ""; // L: 637
									class143.field1697 = 0; // L: 638
									class141.otp = ""; // L: 639
									Login.field930 = true; // L: 640
								}

								var86 = UrlRequest.loginBoxCenter + -117; // L: 642
								var87 = 277; // L: 643
								Login.field939 = var81 >= var86 && var81 < var86 + class126.field1569 && var82 >= var87 && var82 < var87 + WorldMapSection1.field2998; // L: 644
								if (var4 == 1 && Login.field939) { // L: 645
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 646
									if (!Client.Login_isUsernameRemembered && StructComposition.clientPreferences.method2430() != null) { // L: 647
										StructComposition.clientPreferences.method2429((String)null); // L: 648
									}
								}

								var86 = UrlRequest.loginBoxCenter + 24; // L: 651
								var87 = 277; // L: 652
								Login.field955 = var81 >= var86 && var81 < var86 + class126.field1569 && var82 >= var87 && var82 < var87 + WorldMapSection1.field2998; // L: 653
								if (var4 == 1 && Login.field955) { // L: 654
									StructComposition.clientPreferences.method2461(!StructComposition.clientPreferences.method2413()); // L: 655
									if (!StructComposition.clientPreferences.method2413()) { // L: 656
										Login.Login_username = ""; // L: 657
										StructComposition.clientPreferences.method2429((String)null); // L: 658
										SoundSystem.method873(); // L: 659
									}
								}

								while (true) {
									Transferable var112;
									do {
										while (true) {
											label1863:
											do {
												while (true) {
													while (var8.method4114()) { // L: 662
														if (var8.field2328 != 13) { // L: 663
															if (Login.currentLoginField != 0) { // L: 672
																continue label1863;
															}

															char var91 = var8.field2315; // L: 673

															for (var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var91 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13); ++var13) { // L: 675 676
															}

															if (var8.field2328 == 85 && Login.Login_username.length() > 0) { // L: 679
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var8.field2328 == 84 || var8.field2328 == 80) { // L: 680
																Login.currentLoginField = 1;
															}

															if (class4.method22(var8.field2315) && Login.Login_username.length() < 320) { // L: 681
																Login.Login_username = Login.Login_username + var8.field2315;
															}
														} else {
															class12.method155(0); // L: 664
															Login.Login_username = ""; // L: 665
															Login.Login_password = ""; // L: 666
															class143.field1697 = 0; // L: 667
															class141.otp = ""; // L: 668
															Login.field930 = true; // L: 669
														}
													}

													return; // L: 1593
												}
											} while(Login.currentLoginField != 1); // L: 683

											if (var8.field2328 == 85 && Login.Login_password.length() > 0) { // L: 684
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 685
											} else if (var8.field2328 == 84 || var8.field2328 == 80) { // L: 687
												Login.currentLoginField = 0; // L: 688
												if (var8.field2328 == 84) { // L: 689
													Login.Login_username = Login.Login_username.trim(); // L: 690
													if (Login.Login_username.length() == 0) { // L: 691
														TaskHandler.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 692
														return; // L: 693
													}

													if (Login.Login_password.length() == 0) { // L: 695
														TaskHandler.setLoginResponseString("", "Please enter your password.", ""); // L: 696
														return; // L: 697
													}

													TaskHandler.setLoginResponseString("", "Connecting to server...", ""); // L: 699
													InterfaceParent.method2251(false); // L: 700
													class140.method3102(20); // L: 701
													return; // L: 702
												}
											}

											if ((var8.method4106(82) || var8.method4106(87)) && var8.field2328 == 67) { // L: 705
												Clipboard var111 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 706
												var112 = var111.getContents(BuddyRankComparator.client); // L: 707
												var14 = 20 - Login.Login_password.length(); // L: 708
												break;
											}

											if (ObjectSound.method1871(var8.field2315) && class4.method22(var8.field2315) && Login.Login_password.length() < 20) { // L: 725
												Login.Login_password = Login.Login_password + var8.field2315; // L: 726
											}
										}
									} while(var14 <= 0); // L: 709

									try {
										String var93 = (String)var112.getTransferData(DataFlavor.stringFlavor); // L: 711
										int var99 = Math.min(var14, var93.length()); // L: 712

										for (int var94 = 0; var94 < var99; ++var94) { // L: 713
											if (!ObjectSound.method1871(var93.charAt(var94)) || !class4.method22(var93.charAt(var94))) { // L: 714
												class12.method155(3); // L: 715
												return; // L: 716
											}
										}

										Login.Login_password = Login.Login_password + var93.substring(0, var99); // L: 719
									} catch (UnsupportedFlavorException var78) { // L: 721
									} catch (IOException var79) { // L: 722
									}
								}
							} else if (Login.loginIndex == 3) { // L: 732
								var9 = Login.loginBoxX + 180; // L: 733
								var10 = 276; // L: 734
								if (var4 == 1 && var81 >= var9 - 75 && var81 <= var9 + 75 && var82 >= var10 - 20 && var82 <= var10 + 20) { // L: 735
									class124.method2939(false); // L: 736
								}

								var9 = Login.loginBoxX + 180; // L: 738
								var10 = 326; // L: 739
								if (var4 == 1 && var81 >= var9 - 75 && var81 <= var9 + 75 && var82 >= var10 - 20 && var82 <= var10 + 20) { // L: 740
									TaskHandler.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 741
									class12.method155(5); // L: 742
									return; // L: 743
								}
							} else {
								int var12;
								if (Login.loginIndex == 4) { // L: 746
									var9 = Login.loginBoxX + 180 - 80; // L: 747
									var10 = 321; // L: 748
									if (var4 == 1 && var81 >= var9 - 75 && var81 <= var9 + 75 && var82 >= var10 - 20 && var82 <= var10 + 20) { // L: 749
										class141.otp.trim(); // L: 750
										if (class141.otp.length() != 6) { // L: 751
											TaskHandler.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 752
											return; // L: 753
										}

										class143.field1697 = Integer.parseInt(class141.otp); // L: 755
										class141.otp = ""; // L: 756
										InterfaceParent.method2251(true); // L: 757
										TaskHandler.setLoginResponseString("", "Connecting to server...", ""); // L: 758
										class140.method3102(20); // L: 759
										return; // L: 760
									}

									if (var4 == 1 && var81 >= Login.loginBoxX + 180 - 9 && var81 <= Login.loginBoxX + 180 + 130 && var82 >= 263 && var82 <= 296) { // L: 762
										Login.field930 = !Login.field930; // L: 763
									}

									if (var4 == 1 && var81 >= Login.loginBoxX + 180 - 34 && var81 <= Login.loginBoxX + 34 + 180 && var82 >= 351 && var82 <= 363) { // L: 765
										ModeWhere.openURL(ScriptFrame.method1169("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 766
									}

									var9 = Login.loginBoxX + 180 + 80; // L: 768
									if (var4 == 1 && var81 >= var9 - 75 && var81 <= var9 + 75 && var82 >= var10 - 20 && var82 <= var10 + 20) { // L: 769
										class12.method155(0); // L: 770
										Login.Login_username = ""; // L: 771
										Login.Login_password = ""; // L: 772
										class143.field1697 = 0; // L: 773
										class141.otp = ""; // L: 774
									}

									while (var8.method4114()) { // L: 776
										boolean var11 = false; // L: 777

										for (var12 = 0; var12 < "1234567890".length(); ++var12) { // L: 778
											if (var8.field2315 == "1234567890".charAt(var12)) { // L: 779
												var11 = true; // L: 780
												break; // L: 781
											}
										}

										if (var8.field2328 == 13) { // L: 784
											class12.method155(0); // L: 785
											Login.Login_username = ""; // L: 786
											Login.Login_password = ""; // L: 787
											class143.field1697 = 0; // L: 788
											class141.otp = ""; // L: 789
										} else {
											if (var8.field2328 == 85 && class141.otp.length() > 0) { // L: 792
												class141.otp = class141.otp.substring(0, class141.otp.length() - 1);
											}

											if (var8.field2328 == 84) { // L: 793
												class141.otp.trim(); // L: 794
												if (class141.otp.length() != 6) { // L: 795
													TaskHandler.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 796
													return; // L: 797
												}

												class143.field1697 = Integer.parseInt(class141.otp); // L: 799
												class141.otp = ""; // L: 800
												InterfaceParent.method2251(true); // L: 801
												TaskHandler.setLoginResponseString("", "Connecting to server...", ""); // L: 802
												class140.method3102(20); // L: 803
												return; // L: 804
											}

											if (var11 && class141.otp.length() < 6) { // L: 806
												class141.otp = class141.otp + var8.field2315;
											}
										}
									}
								} else {
									int var55;
									if (Login.loginIndex == 5) { // L: 810
										var9 = Login.loginBoxX + 180 - 80; // L: 811
										var10 = 321; // L: 812
										Buffer var20;
										int var24;
										if (var4 == 1 && var81 >= var9 - 75 && var81 <= var9 + 75 && var82 >= var10 - 20 && var82 <= var10 + 20) { // L: 813
											Login.Login_username = Login.Login_username.trim(); // L: 815
											if (Login.Login_username.length() == 0) { // L: 816
												TaskHandler.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 817
											} else {
												long var44;
												try {
													URL var41 = new URL(ScriptFrame.method1169("services", false) + "m=accountappeal/login.ws"); // L: 824
													URLConnection var15 = var41.openConnection(); // L: 825
													var15.setRequestProperty("connection", "close"); // L: 826
													var15.setDoInput(true); // L: 827
													var15.setDoOutput(true); // L: 828
													var15.setConnectTimeout(5000); // L: 829
													OutputStreamWriter var114 = new OutputStreamWriter(var15.getOutputStream()); // L: 830
													var114.write("data1=req"); // L: 831
													var114.flush(); // L: 832
													InputStream var116 = var15.getInputStream(); // L: 833
													Buffer var96 = new Buffer(new byte[1000]); // L: 834

													while (true) {
														int var19 = var116.read(var96.array, var96.offset, 1000 - var96.offset); // L: 836
														if (var19 == -1) { // L: 837
															var96.offset = 0; // L: 844
															long var46 = var96.readLong(); // L: 845
															var44 = var46; // L: 846
															break;
														}

														var96.offset += var19; // L: 838
														if (var96.offset >= 1000) { // L: 839
															var44 = 0L; // L: 840
															break;
														}
													}
												} catch (Exception var71) { // L: 848
													var44 = 0L; // L: 849
												}

												byte var88;
												if (var44 == 0L) { // L: 853
													var88 = 5;
												} else {
													String var117 = Login.Login_username; // L: 856
													Random var97 = new Random(); // L: 858
													Buffer var120 = new Buffer(128); // L: 859
													var20 = new Buffer(128); // L: 860
													int[] var104 = new int[]{var97.nextInt(), var97.nextInt(), (int)(var44 >> 32), (int)var44}; // L: 861 862 863 864 865
													var120.writeByte(10); // L: 866

													int var22;
													for (var22 = 0; var22 < 4; ++var22) { // L: 867
														var120.method8536(var97.nextInt()); // L: 868
													}

													var120.method8536(var104[0]); // L: 870
													var120.method8536(var104[1]); // L: 871
													var120.writeLong(var44); // L: 872
													var120.writeLong(0L); // L: 873

													for (var22 = 0; var22 < 4; ++var22) { // L: 874
														var120.method8536(var97.nextInt()); // L: 875
													}

													var120.encryptRsa(class69.field889, class69.field887); // L: 877
													var20.writeByte(10); // L: 878

													for (var22 = 0; var22 < 3; ++var22) { // L: 879
														var20.method8536(var97.nextInt()); // L: 880
													}

													var20.writeLong(var97.nextLong()); // L: 882
													var20.writeLongMedium(var97.nextLong()); // L: 883
													if (Client.randomDatData != null) { // L: 885
														var20.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 886
													} else {
														byte[] var105 = new byte[24]; // L: 891

														try {
															JagexCache.JagexCache_randomDat.seek(0L); // L: 893
															JagexCache.JagexCache_randomDat.readFully(var105); // L: 894

															for (var24 = 0; var24 < 24 && var105[var24] == 0; ++var24) { // L: 895 896 897
															}

															if (var24 >= 24) { // L: 899
																throw new IOException();
															}
														} catch (Exception var70) {
															for (int var25 = 0; var25 < 24; ++var25) { // L: 902
																var105[var25] = -1;
															}
														}

														var20.writeBytes(var105, 0, var105.length); // L: 907
													}

													var20.writeLong(var97.nextLong()); // L: 909
													var20.encryptRsa(class69.field889, class69.field887); // L: 910
													var22 = class13.stringCp1252NullTerminatedByteSize(var117); // L: 911
													if (var22 % 8 != 0) { // L: 912
														var22 += 8 - var22 % 8;
													}

													Buffer var106 = new Buffer(var22); // L: 913
													var106.writeStringCp1252NullTerminated(var117); // L: 914
													var106.offset = var22; // L: 915
													var106.xteaEncryptAll(var104); // L: 916
													Buffer var51 = new Buffer(var20.offset + var120.offset + var106.offset + 5); // L: 917
													var51.writeByte(2); // L: 918
													var51.writeByte(var120.offset); // L: 919
													var51.writeBytes(var120.array, 0, var120.offset); // L: 920
													var51.writeByte(var20.offset); // L: 921
													var51.writeBytes(var20.array, 0, var20.offset); // L: 922
													var51.writeShort(var106.offset); // L: 923
													var51.writeBytes(var106.array, 0, var106.offset); // L: 924
													String var125 = EnumComposition.method3650(var51.array); // L: 925

													byte var16;
													try {
														URL var107 = new URL(ScriptFrame.method1169("services", false) + "m=accountappeal/login.ws"); // L: 927
														URLConnection var108 = var107.openConnection(); // L: 928
														var108.setDoInput(true); // L: 929
														var108.setDoOutput(true); // L: 930
														var108.setConnectTimeout(5000); // L: 931
														OutputStreamWriter var109 = new OutputStreamWriter(var108.getOutputStream()); // L: 932
														var109.write("data2=" + class459.method8435(var125) + "&dest=" + class459.method8435("passwordchoice.ws")); // L: 933
														var109.flush(); // L: 934
														InputStream var110 = var108.getInputStream(); // L: 935
														var51 = new Buffer(new byte[1000]); // L: 936

														while (true) {
															int var30 = var110.read(var51.array, var51.offset, 1000 - var51.offset); // L: 938
															if (var30 == -1) { // L: 939
																var109.close(); // L: 946
																var110.close(); // L: 947
																String var126 = new String(var51.array); // L: 948
																if (var126.startsWith("OFFLINE")) { // L: 949
																	var16 = 4; // L: 950
																} else if (var126.startsWith("WRONG")) { // L: 953
																	var16 = 7; // L: 954
																} else if (var126.startsWith("RELOAD")) { // L: 957
																	var16 = 3; // L: 958
																} else if (var126.startsWith("Not permitted for social network accounts.")) { // L: 961
																	var16 = 6; // L: 962
																} else {
																	var51.xteaDecryptAll(var104); // L: 965

																	while (var51.offset > 0 && var51.array[var51.offset - 1] == 0) { // L: 966
																		--var51.offset; // L: 967
																	}

																	var126 = new String(var51.array, 0, var51.offset); // L: 969
																	boolean var31;
																	if (var126 == null) { // L: 972
																		var31 = false; // L: 973
																	} else {
																		label2026: {
																			try {
																				new URL(var126);
																			} catch (MalformedURLException var68) { // L: 979
																				var31 = false; // L: 980
																				break label2026; // L: 981
																			}

																			var31 = true; // L: 983
																		}
																	}

																	if (var31) { // L: 985
																		ModeWhere.openURL(var126, true, false); // L: 986
																		var16 = 2; // L: 987
																	} else {
																		var16 = 5; // L: 989
																	}
																}
																break;
															}

															var51.offset += var30; // L: 940
															if (var51.offset >= 1000) { // L: 941
																var16 = 5; // L: 942
																break;
															}
														}
													} catch (Throwable var69) { // L: 991
														var69.printStackTrace(); // L: 992
														var16 = 5; // L: 993
													}

													var88 = var16; // L: 996
												}

												switch(var88) { // L: 998
												case 2:
													TaskHandler.setLoginResponseString(Strings.field4095, Strings.field4096, Strings.field3832); // L: 1006
													class12.method155(6); // L: 1007
													break; // L: 1008
												case 3:
													TaskHandler.setLoginResponseString("", "Error connecting to server.", ""); // L: 1016
													break;
												case 4:
													TaskHandler.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 1003
													break; // L: 1004
												case 5:
													TaskHandler.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 1010
													break; // L: 1011
												case 6:
													TaskHandler.setLoginResponseString("", "Error connecting to server.", ""); // L: 1013
													break; // L: 1014
												case 7:
													TaskHandler.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 1000
												}
											}

											return; // L: 1020
										}

										var9 = Login.loginBoxX + 180 + 80; // L: 1022
										if (var4 == 1 && var81 >= var9 - 75 && var81 <= var9 + 75 && var82 >= var10 - 20 && var82 <= var10 + 20) { // L: 1023
											class343.Login_promptCredentials(true); // L: 1024
										}

										var87 = 361; // L: 1026
										if (class151.field1763 != null) { // L: 1027
											var12 = class151.field1763.highX / 2; // L: 1028
											if (var4 == 1 && var81 >= class151.field1763.lowX - var12 && var81 <= var12 + class151.field1763.lowX && var82 >= var87 - 15 && var82 < var87) { // L: 1029
												ModeWhere.openURL(ScriptFrame.method1169("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 1030
											}
										}

										while (var8.method4114()) { // L: 1033
											boolean var89 = false; // L: 1034

											for (var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var13) { // L: 1035
												if (var8.field2315 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13)) { // L: 1036
													var89 = true; // L: 1037
													break; // L: 1038
												}
											}

											if (var8.field2328 == 13) { // L: 1041
												class343.Login_promptCredentials(true); // L: 1042
											} else {
												if (var8.field2328 == 85 && Login.Login_username.length() > 0) { // L: 1045
													Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
												}

												if (var8.field2328 == 84) { // L: 1046
													Login.Login_username = Login.Login_username.trim(); // L: 1048
													if (Login.Login_username.length() == 0) { // L: 1049
														TaskHandler.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 1050
													} else {
														long var48;
														try {
															URL var42 = new URL(ScriptFrame.method1169("services", false) + "m=accountappeal/login.ws"); // L: 1057
															URLConnection var43 = var42.openConnection(); // L: 1058
															var43.setRequestProperty("connection", "close"); // L: 1059
															var43.setDoInput(true); // L: 1060
															var43.setDoOutput(true); // L: 1061
															var43.setConnectTimeout(5000); // L: 1062
															OutputStreamWriter var18 = new OutputStreamWriter(var43.getOutputStream()); // L: 1063
															var18.write("data1=req"); // L: 1064
															var18.flush(); // L: 1065
															InputStream var50 = var43.getInputStream(); // L: 1066
															var20 = new Buffer(new byte[1000]); // L: 1067

															while (true) {
																var55 = var50.read(var20.array, var20.offset, 1000 - var20.offset); // L: 1069
																if (var55 == -1) { // L: 1070
																	var20.offset = 0; // L: 1077
																	long var56 = var20.readLong(); // L: 1078
																	var48 = var56; // L: 1079
																	break;
																}

																var20.offset += var55; // L: 1071
																if (var20.offset >= 1000) { // L: 1072
																	var48 = 0L; // L: 1073
																	break;
																}
															}
														} catch (Exception var75) { // L: 1081
															var48 = 0L; // L: 1082
														}

														byte var90;
														if (var48 == 0L) { // L: 1086
															var90 = 5;
														} else {
															String var119 = Login.Login_username; // L: 1089
															Random var102 = new Random(); // L: 1091
															Buffer var21 = new Buffer(128); // L: 1092
															Buffer var52 = new Buffer(128); // L: 1093
															int[] var23 = new int[]{var102.nextInt(), var102.nextInt(), (int)(var48 >> 32), (int)var48}; // L: 1094 1095 1096 1097 1098
															var21.writeByte(10); // L: 1099

															for (var24 = 0; var24 < 4; ++var24) { // L: 1100
																var21.method8536(var102.nextInt()); // L: 1101
															}

															var21.method8536(var23[0]); // L: 1103
															var21.method8536(var23[1]); // L: 1104
															var21.writeLong(var48); // L: 1105
															var21.writeLong(0L); // L: 1106

															for (var24 = 0; var24 < 4; ++var24) { // L: 1107
																var21.method8536(var102.nextInt()); // L: 1108
															}

															var21.encryptRsa(class69.field889, class69.field887); // L: 1110
															var52.writeByte(10); // L: 1111

															for (var24 = 0; var24 < 3; ++var24) { // L: 1112
																var52.method8536(var102.nextInt()); // L: 1113
															}

															var52.writeLong(var102.nextLong()); // L: 1115
															var52.writeLongMedium(var102.nextLong()); // L: 1116
															if (Client.randomDatData != null) { // L: 1118
																var52.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 1119
															} else {
																byte[] var53 = new byte[24]; // L: 1124

																try {
																	JagexCache.JagexCache_randomDat.seek(0L); // L: 1126
																	JagexCache.JagexCache_randomDat.readFully(var53); // L: 1127

																	int var60;
																	for (var60 = 0; var60 < 24 && var53[var60] == 0; ++var60) { // L: 1128 1129 1130
																	}

																	if (var60 >= 24) { // L: 1132
																		throw new IOException();
																	}
																} catch (Exception var74) {
																	for (int var61 = 0; var61 < 24; ++var61) { // L: 1135
																		var53[var61] = -1;
																	}
																}

																var52.writeBytes(var53, 0, var53.length); // L: 1140
															}

															var52.writeLong(var102.nextLong()); // L: 1142
															var52.encryptRsa(class69.field889, class69.field887); // L: 1143
															var24 = class13.stringCp1252NullTerminatedByteSize(var119); // L: 1144
															if (var24 % 8 != 0) { // L: 1145
																var24 += 8 - var24 % 8;
															}

															Buffer var124 = new Buffer(var24); // L: 1146
															var124.writeStringCp1252NullTerminated(var119); // L: 1147
															var124.offset = var24; // L: 1148
															var124.xteaEncryptAll(var23); // L: 1149
															Buffer var26 = new Buffer(var52.offset + var21.offset + var124.offset + 5); // L: 1150
															var26.writeByte(2); // L: 1151
															var26.writeByte(var21.offset); // L: 1152
															var26.writeBytes(var21.array, 0, var21.offset); // L: 1153
															var26.writeByte(var52.offset); // L: 1154
															var26.writeBytes(var52.array, 0, var52.offset); // L: 1155
															var26.writeShort(var124.offset); // L: 1156
															var26.writeBytes(var124.array, 0, var124.offset); // L: 1157
															String var27 = EnumComposition.method3650(var26.array); // L: 1158

															byte var64;
															try {
																URL var28 = new URL(ScriptFrame.method1169("services", false) + "m=accountappeal/login.ws"); // L: 1160
																URLConnection var29 = var28.openConnection(); // L: 1161
																var29.setDoInput(true); // L: 1162
																var29.setDoOutput(true); // L: 1163
																var29.setConnectTimeout(5000); // L: 1164
																OutputStreamWriter var54 = new OutputStreamWriter(var29.getOutputStream()); // L: 1165
																var54.write("data2=" + class459.method8435(var27) + "&dest=" + class459.method8435("passwordchoice.ws")); // L: 1166
																var54.flush(); // L: 1167
																InputStream var62 = var29.getInputStream(); // L: 1168
																var26 = new Buffer(new byte[1000]); // L: 1169

																while (true) {
																	int var63 = var62.read(var26.array, var26.offset, 1000 - var26.offset); // L: 1171
																	if (var63 == -1) { // L: 1172
																		var54.close(); // L: 1179
																		var62.close(); // L: 1180
																		String var32 = new String(var26.array); // L: 1181
																		if (var32.startsWith("OFFLINE")) { // L: 1182
																			var64 = 4; // L: 1183
																		} else if (var32.startsWith("WRONG")) { // L: 1186
																			var64 = 7; // L: 1187
																		} else if (var32.startsWith("RELOAD")) { // L: 1190
																			var64 = 3; // L: 1191
																		} else if (var32.startsWith("Not permitted for social network accounts.")) { // L: 1194
																			var64 = 6; // L: 1195
																		} else {
																			var26.xteaDecryptAll(var23); // L: 1198

																			while (var26.offset > 0 && var26.array[var26.offset - 1] == 0) { // L: 1199
																				--var26.offset; // L: 1200
																			}

																			var32 = new String(var26.array, 0, var26.offset); // L: 1202
																			boolean var33;
																			if (var32 == null) { // L: 1205
																				var33 = false; // L: 1206
																			} else {
																				label2028: {
																					try {
																						new URL(var32);
																					} catch (MalformedURLException var72) { // L: 1212
																						var33 = false; // L: 1213
																						break label2028; // L: 1214
																					}

																					var33 = true; // L: 1216
																				}
																			}

																			if (var33) { // L: 1218
																				ModeWhere.openURL(var32, true, false); // L: 1219
																				var64 = 2; // L: 1220
																			} else {
																				var64 = 5; // L: 1222
																			}
																		}
																		break;
																	}

																	var26.offset += var63; // L: 1173
																	if (var26.offset >= 1000) { // L: 1174
																		var64 = 5; // L: 1175
																		break;
																	}
																}
															} catch (Throwable var73) { // L: 1224
																var73.printStackTrace(); // L: 1225
																var64 = 5; // L: 1226
															}

															var90 = var64; // L: 1229
														}

														switch(var90) { // L: 1231
														case 2:
															TaskHandler.setLoginResponseString(Strings.field4095, Strings.field4096, Strings.field3832); // L: 1233
															class12.method155(6); // L: 1234
															break; // L: 1235
														case 3:
															TaskHandler.setLoginResponseString("", "Error connecting to server.", ""); // L: 1246
															break; // L: 1247
														case 4:
															TaskHandler.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 1240
															break; // L: 1241
														case 5:
															TaskHandler.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 1249
															break;
														case 6:
															TaskHandler.setLoginResponseString("", "Error connecting to server.", ""); // L: 1243
															break; // L: 1244
														case 7:
															TaskHandler.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 1237
														}
													}

													return; // L: 1253
												}

												if (var89 && Login.Login_username.length() < 320) { // L: 1255
													Login.Login_username = Login.Login_username + var8.field2315;
												}
											}
										}
									} else if (Login.loginIndex != 6) { // L: 1259
										if (Login.loginIndex == 7) { // L: 1270
											if (class155.field1785 && !Client.onMobile) { // L: 1271
												var9 = UrlRequest.loginBoxCenter - 150; // L: 1272
												var86 = var9 + 40 + 240 + 25; // L: 1273
												var87 = 231; // L: 1274
												var12 = var87 + 40; // L: 1275
												if (var4 == 1 && var81 >= var9 && var81 <= var86 && var82 >= var87 && var82 <= var12) { // L: 1276
													var14 = var9; // L: 1278
													int var65 = 0;

													while (true) {
														if (var65 >= 8) {
															var13 = 0; // L: 1288
															break;
														}

														if (var81 <= var14 + 30) { // L: 1281
															var13 = var65; // L: 1282
															break; // L: 1283
														}

														var14 += 30; // L: 1285
														var14 += var65 != 1 && var65 != 3 ? 5 : 20; // L: 1286
														++var65; // L: 1280
													}

													Login.field938 = var13; // L: 1290
												}

												var13 = Login.loginBoxX + 180 - 80; // L: 1292
												short var92 = 321; // L: 1293
												boolean var17;
												SimpleDateFormat var98;
												java.util.Calendar var100;
												boolean var101;
												String[] var103;
												Date var115;
												Date var118;
												StringBuilder var121;
												Date var122;
												String var123;
												boolean var127;
												if (var4 == 1 && var81 >= var13 - 75 && var81 <= var13 + 75 && var82 >= var92 - 20 && var82 <= var92 + 20) { // L: 1294
													label1734: {
														try {
															var98 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 1301
															var98.setLenient(false); // L: 1302
															var121 = new StringBuilder(); // L: 1303
															var103 = Login.field915; // L: 1305
															var55 = 0;

															while (true) {
																if (var55 >= var103.length) {
																	var121.append("12"); // L: 1318
																	var118 = var98.parse(var121.toString()); // L: 1319
																	break;
																}

																var123 = var103[var55]; // L: 1307
																if (var123 == null) { // L: 1309
																	Player.method2329("Date not valid.", "Please ensure all characters are populated.", ""); // L: 1310
																	var118 = null; // L: 1311
																	break; // L: 1312
																}

																var121.append(var123); // L: 1314
																++var55; // L: 1306
															}

															var115 = var118; // L: 1321
														} catch (ParseException var77) { // L: 1323
															Player.method2329("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1324
															var127 = false; // L: 1325
															break label1734; // L: 1326
														}

														if (var115 == null) { // L: 1328
															var127 = false; // L: 1329
														} else {
															var100 = java.util.Calendar.getInstance(); // L: 1334
															var100.set(1, var100.get(1) - 13); // L: 1335
															var100.set(5, var100.get(5) + 1); // L: 1336
															var100.set(11, 0); // L: 1337
															var100.set(12, 0); // L: 1338
															var100.set(13, 0); // L: 1339
															var100.set(14, 0); // L: 1340
															var122 = var100.getTime(); // L: 1341
															var17 = var115.before(var122); // L: 1342
															var101 = class410.method7833(var115); // L: 1345
															if (!var101) { // L: 1346
																Player.method2329("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1347
																var127 = false; // L: 1348
															} else {
																if (!var17) { // L: 1351
																	KeyHandler.field172 = 8388607; // L: 1352
																} else {
																	KeyHandler.field172 = (int)(var115.getTime() / 86400000L - 11745L); // L: 1355
																}

																var127 = true; // L: 1357
															}
														}
													}

													if (var127) { // L: 1360
														class140.method3102(50); // L: 1361
														return; // L: 1362
													}
												}

												var13 = Login.loginBoxX + 180 + 80; // L: 1365
												if (var4 == 1 && var81 >= var13 - 75 && var81 <= var13 + 75 && var82 >= var92 - 20 && var82 <= var92 + 20) { // L: 1366
													Login.field915 = new String[8]; // L: 1367
													class343.Login_promptCredentials(true); // L: 1368
												}

												while (var8.method4114()) { // L: 1370
													if (var8.field2328 == 101) { // L: 1371
														Login.field915[Login.field938] = null; // L: 1372
													}

													if (var8.field2328 == 85) { // L: 1374
														if (Login.field915[Login.field938] == null && Login.field938 > 0) { // L: 1375
															--Login.field938; // L: 1376
														}

														Login.field915[Login.field938] = null; // L: 1378
													}

													if (var8.field2315 >= '0' && var8.field2315 <= '9') { // L: 1380
														Login.field915[Login.field938] = "" + var8.field2315; // L: 1381
														if (Login.field938 < 7) { // L: 1382
															++Login.field938; // L: 1383
														}
													}

													if (var8.field2328 == 84) { // L: 1386
														label1662: {
															try {
																var98 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 1393
																var98.setLenient(false); // L: 1394
																var121 = new StringBuilder(); // L: 1395
																var103 = Login.field915; // L: 1397
																var55 = 0;

																while (true) {
																	if (var55 < var103.length) {
																		var123 = var103[var55]; // L: 1399
																		if (var123 != null) { // L: 1401
																			var121.append(var123); // L: 1406
																			++var55; // L: 1398
																			continue;
																		}

																		Player.method2329("Date not valid.", "Please ensure all characters are populated.", ""); // L: 1402
																		var118 = null; // L: 1403
																	} else {
																		var121.append("12"); // L: 1410
																		var118 = var98.parse(var121.toString()); // L: 1411
																	}

																	var115 = var118; // L: 1413
																	break;
																}
															} catch (ParseException var76) { // L: 1415
																Player.method2329("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1416
																var127 = false; // L: 1417
																break label1662; // L: 1418
															}

															if (var115 == null) { // L: 1420
																var127 = false; // L: 1421
															} else {
																var100 = java.util.Calendar.getInstance(); // L: 1426
																var100.set(1, var100.get(1) - 13); // L: 1427
																var100.set(5, var100.get(5) + 1); // L: 1428
																var100.set(11, 0); // L: 1429
																var100.set(12, 0); // L: 1430
																var100.set(13, 0); // L: 1431
																var100.set(14, 0); // L: 1432
																var122 = var100.getTime(); // L: 1433
																var17 = var115.before(var122); // L: 1434
																var101 = class410.method7833(var115); // L: 1437
																if (!var101) { // L: 1438
																	Player.method2329("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1439
																	var127 = false; // L: 1440
																} else {
																	if (!var17) { // L: 1443
																		KeyHandler.field172 = 8388607; // L: 1444
																	} else {
																		KeyHandler.field172 = (int)(var115.getTime() / 86400000L - 11745L); // L: 1447
																	}

																	var127 = true; // L: 1449
																}
															}
														}

														if (var127) { // L: 1452
															class140.method3102(50); // L: 1453
														}

														return; // L: 1455
													}
												}
											} else {
												var9 = Login.loginBoxX + 180 - 80; // L: 1460
												var10 = 321; // L: 1461
												if (var4 == 1 && var81 >= var9 - 75 && var81 <= var9 + 75 && var82 >= var10 - 20 && var82 <= var10 + 20) { // L: 1462
													ModeWhere.openURL(ScriptFrame.method1169("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1463
													TaskHandler.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 1464
													class12.method155(6); // L: 1465
													return; // L: 1466
												}

												var9 = Login.loginBoxX + 180 + 80; // L: 1468
												if (var4 == 1 && var81 >= var9 - 75 && var81 <= var9 + 75 && var82 >= var10 - 20 && var82 <= var10 + 20) { // L: 1469
													class343.Login_promptCredentials(true); // L: 1470
												}
											}
										} else if (Login.loginIndex == 8) { // L: 1474
											var9 = Login.loginBoxX + 180 - 80; // L: 1475
											var10 = 321; // L: 1476
											if (var4 == 1 && var81 >= var9 - 75 && var81 <= var9 + 75 && var82 >= var10 - 20 && var82 <= var10 + 20) { // L: 1477
												ModeWhere.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1478
												TaskHandler.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 1479
												class12.method155(6); // L: 1480
												return; // L: 1481
											}

											var9 = Login.loginBoxX + 180 + 80; // L: 1483
											if (var4 == 1 && var81 >= var9 - 75 && var81 <= var9 + 75 && var82 >= var10 - 20 && var82 <= var10 + 20) { // L: 1484
												class343.Login_promptCredentials(true); // L: 1485
											}
										} else if (Login.loginIndex == 9) { // L: 1488
											var9 = Login.loginBoxX + 180; // L: 1489
											var10 = 311; // L: 1490
											if (var38.field2328 == 84 || var38.field2328 == 13 || var4 == 1 && var81 >= var9 - 75 && var81 <= var9 + 75 && var82 >= var10 - 20 && var82 <= var10 + 20) { // L: 1491
												class124.method2939(false); // L: 1492
											}
										} else if (Login.loginIndex == 10) { // L: 1495
											var9 = Login.loginBoxX + 180; // L: 1496
											var10 = 209; // L: 1497
											if (var38.field2328 == 84 || var4 == 1 && var81 >= var9 - 109 && var81 <= var9 + 109 && var82 >= var10 && var82 <= var10 + 68) { // L: 1498
												TaskHandler.setLoginResponseString("", "Connecting to server...", ""); // L: 1499
												Client.field640 = class471.field4969; // L: 1500
												InterfaceParent.method2251(false); // L: 1501
												class140.method3102(20); // L: 1502
											}
										} else if (Login.loginIndex == 12) { // L: 1505
											var9 = UrlRequest.loginBoxCenter; // L: 1506
											var10 = 233; // L: 1507
											Bounds var66 = var1.method7169(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 1508
											Bounds var39 = var1.method7169(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 1509
											Bounds var40 = var1.method7169(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 1510
											var86 = var10 + 17; // L: 1511
											Bounds var113 = var1.method7169(0, 34, "<col=ffd200>agreement (EULA)</col>.", var9, var86); // L: 1512
											if (var4 == 1) { // L: 1513
												if (var66.method7724(var81, var82)) { // L: 1514
													ModeWhere.openURL("https://www.jagex.com/terms", true, false); // L: 1515
												} else if (var39.method7724(var81, var82)) { // L: 1517
													ModeWhere.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1518
												} else if (var40.method7724(var81, var82) || var113.method7724(var81, var82)) { // L: 1520
													ModeWhere.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 1521
												}
											}

											var9 = UrlRequest.loginBoxCenter - 80; // L: 1524
											var10 = 311; // L: 1525
											if (var4 == 1 && var81 >= var9 - 75 && var81 <= var9 + 75 && var82 >= var10 - 20 && var82 <= var10 + 20) { // L: 1526
												WorldMapData_0.method4848(); // L: 1527
												class124.method2939(true); // L: 1528
											}

											var9 = UrlRequest.loginBoxCenter + 80; // L: 1530
											if (var4 == 1 && var81 >= var9 - 75 && var81 <= var9 + 75 && var82 >= var10 - 20 && var82 <= var10 + 20) { // L: 1531
												Login.loginIndex = 13; // L: 1532
											}
										} else if (Login.loginIndex == 13) { // L: 1535
											var9 = UrlRequest.loginBoxCenter; // L: 1536
											var10 = 321; // L: 1537
											if (var4 == 1 && var81 >= var9 - 75 && var81 <= var9 + 75 && var82 >= var10 - 20 && var82 <= var10 + 20) { // L: 1538
												class124.method2939(true); // L: 1539
											}
										} else if (Login.loginIndex == 14) { // L: 1542
											String var67 = ""; // L: 1543
											switch(Login.field924) { // L: 1544
											case 0:
												var67 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans"; // L: 1549
												break; // L: 1550
											case 1:
												var67 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked"; // L: 1552
												break; // L: 1553
											case 2:
												var67 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance"; // L: 1555
												break;
											default:
												class343.Login_promptCredentials(false); // L: 1546
											}

											var86 = Login.loginBoxX + 180; // L: 1558
											var87 = 276; // L: 1559
											if (var4 == 1 && var81 >= var86 - 75 && var81 <= var86 + 75 && var82 >= var87 - 20 && var82 <= var87 + 20) { // L: 1560
												ModeWhere.openURL(var67, true, false); // L: 1561
												TaskHandler.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 1562
												class12.method155(6); // L: 1563
												return; // L: 1564
											}

											var86 = Login.loginBoxX + 180; // L: 1566
											var87 = 326; // L: 1567
											if (var4 == 1 && var81 >= var86 - 75 && var81 <= var86 + 75 && var82 >= var87 - 20 && var82 <= var87 + 20) { // L: 1568
												class343.Login_promptCredentials(false); // L: 1569
											}
										} else if (Login.loginIndex == 24) { // L: 1572
											var9 = Login.loginBoxX + 180; // L: 1573
											var10 = 301; // L: 1574
											if (var4 == 1 && var81 >= var9 - 75 && var81 <= var9 + 75 && var82 >= var10 - 20 && var82 <= var10 + 20) { // L: 1575
												class124.method2939(false); // L: 1576
											}
										} else if (Login.loginIndex == 26) { // L: 1579
											var9 = Login.loginBoxX + 180 - 80; // L: 1580
											var10 = 321; // L: 1581
											if (var4 == 1 && var81 >= var9 - 75 && var81 <= var9 + 75 && var82 >= var10 - 20 && var82 <= var10 + 20) { // L: 1582
												ModeWhere.openURL(ScriptFrame.method1169("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1583
												TaskHandler.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 1584
												class12.method155(6); // L: 1585
												return; // L: 1586
											}

											var9 = Login.loginBoxX + 180 + 80; // L: 1588
											if (var4 == 1 && var81 >= var9 - 75 && var81 <= var9 + 75 && var82 >= var10 - 20 && var82 <= var10 + 20) { // L: 1589
												class343.Login_promptCredentials(true); // L: 1590
											}
										}
									} else {
										while (true) {
											do {
												if (!var8.method4114()) { // L: 1260
													var85 = 321; // L: 1265
													if (var4 == 1 && var82 >= var85 - 20 && var82 <= var85 + 20) { // L: 1266
														class343.Login_promptCredentials(true); // L: 1267
													}

													return;
												}
											} while(var8.field2328 != 84 && var8.field2328 != 13); // L: 1261

											class343.Login_promptCredentials(true); // L: 1262
										}
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 467
}
