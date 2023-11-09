import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rg")
public abstract class class445 implements class279 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	class490 field4714;

	class445(int var1) {
	} // L: 13

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)V",
		garbageValue = "-1438020298"
	)
	abstract void vmethod8212(Buffer var1, int var2);

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "-62"
	)
	public void method8211(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 17
			if (var2 == 0) { // L: 18
				return; // L: 47
			}

			class441[] var3 = new class441[]{class441.field4704, class441.field4706, class441.field4705, class441.field4702}; // L: 21
			class441 var4 = (class441)GameObject.findEnumerated(var3, var2); // L: 23
			if (var4 != null) { // L: 24
				switch(var4.field4703) { // L: 25
				case 0:
					var1.readStringCp1252NullCircumfixed(); // L: 39
					break; // L: 40
				case 1:
					int var6 = var1.readUnsignedByte(); // L: 34
					this.field4714 = WorldMapRectangle.method5458(var6); // L: 35
					if (this.field4714 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6); // L: 36
				case 2:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4); // L: 42
				case 3:
					class350[] var5 = new class350[]{class350.field4192, class350.field4190, class350.field4195, class350.field4193}; // L: 29
					GameObject.findEnumerated(var5, var1.readUnsignedByte()); // L: 31
				}
			} else {
				this.vmethod8212(var1, var2); // L: 45
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1820418420"
	)
	boolean method8213() {
		return this.field4714 != null; // L: 52
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/Object;",
		garbageValue = "1"
	)
	Object method8214() {
		if (this.field4714 == class490.field4973) { // L: 56
			return 0; // L: 57
		} else if (this.field4714 == class490.field4972) { // L: 59
			return -1L; // L: 60
		} else {
			return this.field4714 == class490.field4976 ? "" : null; // L: 62 63 65
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lba;Lph;Lph;I)V",
		garbageValue = "196820122"
	)
	static void method8221(GameEngine var0, Font var1, Font var2) {
		if (Login.worldSelectOpen) { // L: 376
			class11.method105(var0); // L: 377
		} else {
			int var5;
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class305.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 380
				class10.clientPreferences.method2436(!class10.clientPreferences.method2437()); // L: 381
				if (!class10.clientPreferences.method2437()) { // L: 382
					Archive var3 = ReflectionCheck.archive6; // L: 383
					if (var3.isValidFileName("scape main", "")) { // L: 385
						int var4 = var3.getGroupId("scape main"); // L: 386
						var5 = var3.getFileId(var4, ""); // L: 387
						class368.method6892(var3, var4, var5, 255, false); // L: 388
					}
				} else {
					class304.midiPcmStream.clear(); // L: 393
					class304.musicPlayerStatus = 1; // L: 394
					UserComparator9.musicTrackArchive = null; // L: 395
				}
			}

			if (Client.gameState != 5) { // L: 398
				if (Login.field949 == -1L) { // L: 399
					Login.field949 = WallObject.method5027() + 1000L; // L: 400
				}

				long var23 = WallObject.method5027(); // L: 402
				if (class142.method3125() && -1L == Login.field930) { // L: 403 404
					Login.field930 = var23; // L: 405
					if (Login.field930 > Login.field949) { // L: 406
						Login.field949 = Login.field930; // L: 407
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 411
					if (Language.Language_EN == TriBool.clientLanguage) { // L: 412
						if (MouseHandler.MouseHandler_lastButton == 1 || !class305.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 413
							var5 = Login.xPadding + 5; // L: 414
							short var6 = 463; // L: 415
							byte var7 = 100; // L: 416
							byte var8 = 35; // L: 417
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var7 + var5 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var6 + var8) { // L: 418
								if (class497.loadWorlds()) { // L: 420
									Login.worldSelectOpen = true; // L: 421
									Login.worldSelectPage = 0; // L: 422
									Login.worldSelectPagesCount = 0; // L: 423
								}

								return; // L: 426
							}
						}

						if (World.World_request != null && class497.loadWorlds()) { // L: 429 430
							Login.worldSelectOpen = true; // L: 431
							Login.worldSelectPage = 0; // L: 432
							Login.worldSelectPagesCount = 0; // L: 433
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton; // L: 437
					int var43 = MouseHandler.MouseHandler_lastPressedX; // L: 438
					int var44 = MouseHandler.MouseHandler_lastPressedY; // L: 439
					if (var5 == 0) { // L: 440
						var43 = MouseHandler.MouseHandler_x; // L: 441
						var44 = MouseHandler.MouseHandler_y; // L: 442
					}

					if (!class305.mouseCam && var5 == 4) { // L: 444
						var5 = 1;
					}

					class211 var25 = class350.method6624(); // L: 445
					short var46;
					int var47;
					if (Login.loginIndex == 0) { // L: 446
						boolean var55 = false; // L: 447

						while (var25.method4133()) { // L: 448
							if (var25.field2349 == 84) { // L: 449
								var55 = true; // L: 450
							}
						}

						var47 = class485.loginBoxCenter - 80; // L: 453
						var46 = 291; // L: 454
						if (var5 == 1 && var43 >= var47 - 75 && var43 <= var47 + 75 && var44 >= var46 - 20 && var44 <= var46 + 20) { // L: 455
							class27.openURL(Widget.method6509("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 456
						}

						var47 = class485.loginBoxCenter + 80; // L: 458
						if (var5 == 1 && var43 >= var47 - 75 && var43 <= var47 + 75 && var44 >= var46 - 20 && var44 <= var46 + 20 || var55) { // L: 459
							if ((Client.worldProperties & 33554432) != 0) { // L: 460
								Login.Login_response0 = ""; // L: 461
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 462
								Login.Login_response2 = "Your normal account will not be affected."; // L: 463
								Login.Login_response3 = ""; // L: 464
								class390.method7249(1); // L: 465
								WorldMapSectionType.method5418(); // L: 466
							} else if ((Client.worldProperties & 4) != 0) { // L: 468
								if ((Client.worldProperties & 1024) != 0) { // L: 469
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 470
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 471
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 472
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 475
									Login.Login_response2 = "Players can attack each other"; // L: 476
									Login.Login_response3 = "almost everywhere."; // L: 477
								}

								Login.Login_response0 = "Warning!"; // L: 479
								class390.method7249(1); // L: 480
								WorldMapSectionType.method5418(); // L: 481
							} else if ((Client.worldProperties & 1024) != 0) { // L: 483
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 484
								Login.Login_response2 = "The Protect Item prayer will"; // L: 485
								Login.Login_response3 = "not work on this world."; // L: 486
								Login.Login_response0 = "Warning!"; // L: 487
								class390.method7249(1); // L: 488
								WorldMapSectionType.method5418(); // L: 489
							} else {
								ViewportMouse.Login_promptCredentials(false); // L: 492
							}
						}
					} else {
						int var9;
						short var10;
						if (Login.loginIndex == 1) { // L: 496
							while (true) {
								if (!var25.method4133()) { // L: 497
									var9 = class485.loginBoxCenter - 80; // L: 505
									var10 = 321; // L: 506
									if (var5 == 1 && var43 >= var9 - 75 && var43 <= var9 + 75 && var44 >= var10 - 20 && var44 <= var10 + 20) { // L: 507
										ViewportMouse.Login_promptCredentials(false); // L: 508
									}

									var9 = class485.loginBoxCenter + 80; // L: 510
									if (var5 == 1 && var43 >= var9 - 75 && var43 <= var9 + 75 && var44 >= var10 - 20 && var44 <= var10 + 20) { // L: 511
										class390.method7249(0); // L: 512
									}
									break;
								}

								if (var25.field2349 == 84) { // L: 498
									ViewportMouse.Login_promptCredentials(false); // L: 499
								} else if (var25.field2349 == 13) { // L: 501
									class390.method7249(0); // L: 502
								}
							}
						} else {
							int var13;
							int var21;
							short var45;
							boolean var48;
							if (Login.loginIndex == 2) { // L: 515
								var45 = 201; // L: 516
								var9 = var45 + 52; // L: 517
								if (var5 == 1 && var44 >= var9 - 12 && var44 < var9 + 2) { // L: 518
									Login.currentLoginField = 0;
								}

								var9 += 15; // L: 519
								if (var5 == 1 && var44 >= var9 - 12 && var44 < var9 + 2) { // L: 520
									Login.currentLoginField = 1;
								}

								var9 += 15; // L: 521
								var45 = 361; // L: 522
								if (FriendsList.field4572 != null) { // L: 523
									var47 = FriendsList.field4572.highX / 2; // L: 524
									if (var5 == 1 && var43 >= FriendsList.field4572.lowX - var47 && var43 <= var47 + FriendsList.field4572.lowX && var44 >= var45 - 15 && var44 < var45) { // L: 525
										switch(Login.field929) { // L: 526
										case 1:
											class478.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 529
											class390.method7249(5); // L: 530
											return; // L: 531
										case 2:
											class27.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 535
										}
									}
								}

								var47 = class485.loginBoxCenter - 80; // L: 541
								var46 = 321; // L: 542
								if (var5 == 1 && var43 >= var47 - 75 && var43 <= var47 + 75 && var44 >= var46 - 20 && var44 <= var46 + 20) { // L: 543
									Login.Login_username = Login.Login_username.trim(); // L: 544
									if (Login.Login_username.length() == 0) { // L: 545
										class478.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 546
										return; // L: 547
									}

									if (Login.Login_password.length() == 0) { // L: 549
										class478.setLoginResponseString("", "Please enter your password.", ""); // L: 550
										return; // L: 551
									}

									class478.setLoginResponseString("", "Connecting to server...", ""); // L: 553
									class152.method3194(false); // L: 554
									UserComparator8.method2855(20); // L: 555
									return; // L: 556
								}

								var47 = Login.loginBoxX + 180 + 80; // L: 558
								if (var5 == 1 && var43 >= var47 - 75 && var43 <= var47 + 75 && var44 >= var46 - 20 && var44 <= var46 + 20) { // L: 559
									class390.method7249(0); // L: 560
									Login.Login_username = ""; // L: 561
									Login.Login_password = ""; // L: 562
									class322.field3521 = 0; // L: 563
									SoundSystem.otp = ""; // L: 564
									Login.field942 = true; // L: 565
								}

								var47 = class485.loginBoxCenter + -117; // L: 567
								var46 = 277; // L: 568
								Login.field947 = var43 >= var47 && var43 < var47 + class251.field2858 && var44 >= var46 && var44 < var46 + class60.field443; // L: 569
								if (var5 == 1 && Login.field947) { // L: 570
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 571
									if (!Client.Login_isUsernameRemembered && class10.clientPreferences.method2529() != null) { // L: 572
										class10.clientPreferences.method2432((String)null); // L: 573
									}
								}

								var47 = class485.loginBoxCenter + 24; // L: 576
								var46 = 277; // L: 577
								Login.field941 = var43 >= var47 && var43 < var47 + class251.field2858 && var44 >= var46 && var44 < var46 + class60.field443; // L: 578
								if (var5 == 1 && Login.field941) { // L: 579
									class10.clientPreferences.method2524(!class10.clientPreferences.method2472()); // L: 580
									if (!class10.clientPreferences.method2472()) { // L: 581
										Login.Login_username = ""; // L: 582
										class10.clientPreferences.method2432((String)null); // L: 583
										WorldMapSectionType.method5418(); // L: 584
									}
								}

								label1388:
								while (true) {
									int var51;
									Transferable var61;
									do {
										while (true) {
											label1327:
											do {
												while (true) {
													while (var25.method4133()) { // L: 587
														if (var25.field2349 != 13) { // L: 588
															if (Login.currentLoginField != 0) { // L: 597
																continue label1327;
															}

															char var49 = var25.field2348; // L: 598

															for (var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var49 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13); ++var13) { // L: 600 601
															}

															if (var25.field2349 == 85 && Login.Login_username.length() > 0) { // L: 604
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var25.field2349 == 84 || var25.field2349 == 80) { // L: 605
																Login.currentLoginField = 1;
															}

															char var50 = var25.field2348; // L: 607
															boolean var52 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var50) != -1; // L: 609
															if (var52 && Login.Login_username.length() < 320) { // L: 611
																Login.Login_username = Login.Login_username + var25.field2348;
															}
														} else {
															class390.method7249(0); // L: 589
															Login.Login_username = ""; // L: 590
															Login.Login_password = ""; // L: 591
															class322.field3521 = 0; // L: 592
															SoundSystem.otp = ""; // L: 593
															Login.field942 = true; // L: 594
														}
													}

													return; // L: 1204
												}
											} while(Login.currentLoginField != 1); // L: 613

											if (var25.field2349 == 85 && Login.Login_password.length() > 0) { // L: 614
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 615
											} else if (var25.field2349 == 84 || var25.field2349 == 80) { // L: 617
												Login.currentLoginField = 0; // L: 618
												if (var25.field2349 == 84) { // L: 619
													Login.Login_username = Login.Login_username.trim(); // L: 620
													if (Login.Login_username.length() == 0) { // L: 621
														class478.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 622
														return; // L: 623
													}

													if (Login.Login_password.length() == 0) { // L: 625
														class478.setLoginResponseString("", "Please enter your password.", ""); // L: 626
														return; // L: 627
													}

													class478.setLoginResponseString("", "Connecting to server...", ""); // L: 629
													class152.method3194(false); // L: 630
													UserComparator8.method2855(20); // L: 631
													return; // L: 632
												}
											}

											if ((var25.method4134(82) || var25.method4134(87)) && var25.field2349 == 67) { // L: 635
												Clipboard var60 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 636
												var61 = var60.getContents(class347.client); // L: 637
												var51 = 20 - Login.Login_password.length(); // L: 638
												break;
											}

											if (ClanChannelMember.method3135(var25.field2348)) { // L: 686
												char var53 = var25.field2348; // L: 688
												var48 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var53) != -1; // L: 690
												if (var48 && Login.Login_password.length() < 20) { // L: 692 693
													Login.Login_password = Login.Login_password + var25.field2348; // L: 694
												}
											}
										}
									} while(var51 <= 0); // L: 639

									try {
										String var15 = (String)var61.getTransferData(DataFlavor.stringFlavor); // L: 641
										int var16 = Math.min(var51, var15.length()); // L: 642
										int var54 = 0;

										while (true) {
											if (var54 >= var16) {
												Login.Login_password = Login.Login_password + var15.substring(0, var16); // L: 680
												continue label1388;
											}

											char var56 = var15.charAt(var54); // L: 646
											boolean var18;
											if (var56 >= ' ' && var56 < 127 || var56 > 127 && var56 < 160 || var56 > 160 && var56 <= 255) { // L: 648
												var18 = true; // L: 649
											} else {
												label1528: {
													if (var56 != 0) { // L: 652
														char[] var58 = class382.cp1252AsciiExtension; // L: 654

														for (var21 = 0; var21 < var58.length; ++var21) { // L: 655
															char var22 = var58[var21]; // L: 656
															if (var22 == var56) { // L: 658
																var18 = true; // L: 659
																break label1528; // L: 660
															}
														}
													}

													var18 = false; // L: 666
												}
											}

											if (!var18) { // L: 668
												break;
											}

											char var59 = var15.charAt(var54); // L: 670
											boolean var28 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var59) != -1; // L: 672
											if (!var28) { // L: 674
												break;
											}

											++var54; // L: 643
										}

										class390.method7249(3); // L: 676
										return; // L: 677
									} catch (UnsupportedFlavorException var41) { // L: 682
									} catch (IOException var42) { // L: 683
									}
								}
							} else {
								Bounds var29;
								if (Login.loginIndex == 3) { // L: 702
									var9 = Login.loginBoxX + 180; // L: 703
									var10 = 241; // L: 704
									var29 = var1.method7425(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var9, var10); // L: 705
									if (var5 == 1 && var29.method8029(var43, var44)) { // L: 706
										class27.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 707
									}

									var9 = Login.loginBoxX + 180; // L: 709
									var10 = 276; // L: 710
									if (var5 == 1 && var43 >= var9 - 75 && var43 <= var9 + 75 && var44 >= var10 - 20 && var44 <= var10 + 20) { // L: 711
										class164.method3362(false); // L: 712
									}

									var9 = Login.loginBoxX + 180; // L: 714
									var10 = 326; // L: 715
									if (var5 == 1 && var43 >= var9 - 75 && var43 <= var9 + 75 && var44 >= var10 - 20 && var44 <= var10 + 20) { // L: 716
										class478.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 717
										class390.method7249(5); // L: 718
										return; // L: 719
									}
								} else {
									int var12;
									if (Login.loginIndex == 4) { // L: 722
										var9 = Login.loginBoxX + 180 - 80; // L: 723
										var10 = 321; // L: 724
										if (var5 == 1 && var43 >= var9 - 75 && var43 <= var9 + 75 && var44 >= var10 - 20 && var44 <= var10 + 20) { // L: 725
											SoundSystem.otp.trim(); // L: 726
											if (SoundSystem.otp.length() != 6) { // L: 727
												class478.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 728
												return; // L: 729
											}

											class322.field3521 = Integer.parseInt(SoundSystem.otp); // L: 731
											SoundSystem.otp = ""; // L: 732
											class152.method3194(true); // L: 733
											class478.setLoginResponseString("", "Connecting to server...", ""); // L: 734
											UserComparator8.method2855(20); // L: 735
											return; // L: 736
										}

										if (var5 == 1 && var43 >= Login.loginBoxX + 180 - 9 && var43 <= Login.loginBoxX + 180 + 130 && var44 >= 263 && var44 <= 296) { // L: 738
											Login.field942 = !Login.field942; // L: 739
										}

										if (var5 == 1 && var43 >= Login.loginBoxX + 180 - 34 && var43 <= Login.loginBoxX + 34 + 180 && var44 >= 351 && var44 <= 363) { // L: 741
											class27.openURL(Widget.method6509("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 742
										}

										var9 = Login.loginBoxX + 180 + 80; // L: 744
										if (var5 == 1 && var43 >= var9 - 75 && var43 <= var9 + 75 && var44 >= var10 - 20 && var44 <= var10 + 20) { // L: 745
											class390.method7249(0); // L: 746
											Login.Login_username = ""; // L: 747
											Login.Login_password = ""; // L: 748
											class322.field3521 = 0; // L: 749
											SoundSystem.otp = ""; // L: 750
										}

										while (var25.method4133()) { // L: 752
											boolean var11 = false; // L: 753

											for (var12 = 0; var12 < "1234567890".length(); ++var12) { // L: 754
												if (var25.field2348 == "1234567890".charAt(var12)) { // L: 755
													var11 = true; // L: 756
													break; // L: 757
												}
											}

											if (var25.field2349 == 13) { // L: 760
												class390.method7249(0); // L: 761
												Login.Login_username = ""; // L: 762
												Login.Login_password = ""; // L: 763
												class322.field3521 = 0; // L: 764
												SoundSystem.otp = ""; // L: 765
											} else {
												if (var25.field2349 == 85 && SoundSystem.otp.length() > 0) { // L: 768
													SoundSystem.otp = SoundSystem.otp.substring(0, SoundSystem.otp.length() - 1);
												}

												if (var25.field2349 == 84) { // L: 769
													SoundSystem.otp.trim(); // L: 770
													if (SoundSystem.otp.length() != 6) { // L: 771
														class478.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 772
														return; // L: 773
													}

													class322.field3521 = Integer.parseInt(SoundSystem.otp); // L: 775
													SoundSystem.otp = ""; // L: 776
													class152.method3194(true); // L: 777
													class478.setLoginResponseString("", "Connecting to server...", ""); // L: 778
													UserComparator8.method2855(20); // L: 779
													return; // L: 780
												}

												if (var11 && SoundSystem.otp.length() < 6) { // L: 782
													SoundSystem.otp = SoundSystem.otp + var25.field2348;
												}
											}
										}
									} else if (Login.loginIndex == 5) { // L: 786
										var9 = Login.loginBoxX + 180 - 80; // L: 787
										var10 = 321; // L: 788
										if (var5 == 1 && var43 >= var9 - 75 && var43 <= var9 + 75 && var44 >= var10 - 20 && var44 <= var10 + 20) { // L: 789
											class489.method8753(); // L: 790
											return; // L: 791
										}

										var9 = Login.loginBoxX + 180 + 80; // L: 793
										if (var5 == 1 && var43 >= var9 - 75 && var43 <= var9 + 75 && var44 >= var10 - 20 && var44 <= var10 + 20) { // L: 794
											ViewportMouse.Login_promptCredentials(true); // L: 795
										}

										var46 = 361; // L: 797
										if (Calendar.field3770 != null) { // L: 798
											var12 = Calendar.field3770.highX / 2; // L: 799
											if (var5 == 1 && var43 >= Calendar.field3770.lowX - var12 && var43 <= var12 + Calendar.field3770.lowX && var44 >= var46 - 15 && var44 < var46) { // L: 800
												class27.openURL(Widget.method6509("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 801
											}
										}

										while (var25.method4133()) { // L: 804
											var48 = false; // L: 805

											for (var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var13) { // L: 806
												if (var25.field2348 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13)) { // L: 807
													var48 = true; // L: 808
													break; // L: 809
												}
											}

											if (var25.field2349 == 13) { // L: 812
												ViewportMouse.Login_promptCredentials(true); // L: 813
											} else {
												if (var25.field2349 == 85 && Login.Login_username.length() > 0) { // L: 816
													Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
												}

												if (var25.field2349 == 84) { // L: 817
													class489.method8753(); // L: 818
													return; // L: 819
												}

												if (var48 && Login.Login_username.length() < 320) { // L: 821
													Login.Login_username = Login.Login_username + var25.field2348;
												}
											}
										}
									} else if (Login.loginIndex != 6) { // L: 825
										if (Login.loginIndex == 7) { // L: 836
											if (class112.field1401 && !Client.onMobile) { // L: 837
												var9 = class485.loginBoxCenter - 150; // L: 838
												var47 = var9 + 40 + 240 + 25; // L: 839
												var46 = 231; // L: 840
												var12 = var46 + 40; // L: 841
												if (var5 == 1 && var43 >= var9 && var43 <= var47 && var44 >= var46 && var44 <= var12) { // L: 842
													Login.field935 = ArchiveLoader.method2220(var9, var43); // L: 843
												}

												var13 = Login.loginBoxX + 180 - 80; // L: 845
												short var14 = 321; // L: 846
												boolean var17;
												boolean var19;
												String[] var20;
												SimpleDateFormat var30;
												StringBuilder var31;
												String var32;
												Date var33;
												Date var34;
												boolean var35;
												java.util.Calendar var36;
												Date var57;
												java.util.Calendar var62;
												Date var63;
												if (var5 == 1 && var43 >= var13 - 75 && var43 <= var13 + 75 && var44 >= var14 - 20 && var44 <= var14 + 20) { // L: 847
													label1222: {
														try {
															var30 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 854
															var30.setLenient(false); // L: 855
															var31 = new StringBuilder(); // L: 856
															var20 = Login.field938; // L: 858
															var21 = 0;

															while (true) {
																if (var21 < var20.length) {
																	var32 = var20[var21]; // L: 860
																	if (var32 != null) { // L: 862
																		var31.append(var32); // L: 870
																		++var21; // L: 859
																		continue;
																	}

																	class390.method7249(7); // L: 864
																	class478.setLoginResponseString("Date not valid.", "Please ensure all characters are populated.", ""); // L: 865
																	var33 = null; // L: 867
																} else {
																	var31.append("12"); // L: 874
																	var33 = var30.parse(var31.toString()); // L: 875
																}

																var34 = var33; // L: 877
																break;
															}
														} catch (ParseException var40) { // L: 879
															class390.method7249(7); // L: 881
															class478.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 882
															var35 = false; // L: 884
															break label1222; // L: 885
														}

														if (var34 == null) { // L: 887
															var35 = false; // L: 888
														} else {
															var62 = java.util.Calendar.getInstance(); // L: 893
															var62.set(1, var62.get(1) - 13); // L: 894
															var62.set(5, var62.get(5) + 1); // L: 895
															var62.set(11, 0); // L: 896
															var62.set(12, 0); // L: 897
															var62.set(13, 0); // L: 898
															var62.set(14, 0); // L: 899
															var63 = var62.getTime(); // L: 900
															var17 = var34.before(var63); // L: 901
															var36 = java.util.Calendar.getInstance(); // L: 908
															var36.set(2, 0); // L: 909
															var36.set(5, 1); // L: 910
															var36.set(1, 1900); // L: 911
															var57 = var36.getTime(); // L: 912
															var19 = var34.after(var57); // L: 915
															if (!var19) { // L: 918
																class390.method7249(7); // L: 920
																class478.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 921
																var35 = false; // L: 923
															} else {
																if (!var17) { // L: 926
																	GameObject.field2850 = 8388607; // L: 927
																} else {
																	GameObject.field2850 = (int)(var34.getTime() / 86400000L - 11745L); // L: 930
																}

																var35 = true; // L: 932
															}
														}
													}

													if (var35) { // L: 935
														UserComparator8.method2855(50); // L: 936
														return; // L: 937
													}
												}

												var13 = Login.loginBoxX + 180 + 80; // L: 940
												if (var5 == 1 && var43 >= var13 - 75 && var43 <= var13 + 75 && var44 >= var14 - 20 && var44 <= var14 + 20) { // L: 941
													Login.field938 = new String[8]; // L: 942
													ViewportMouse.Login_promptCredentials(true); // L: 943
												}

												while (var25.method4133()) { // L: 945
													if (var25.field2349 == 101) { // L: 946
														Login.field938[Login.field935] = null; // L: 947
													}

													if (var25.field2349 == 85) { // L: 949
														if (Login.field938[Login.field935] == null && Login.field935 > 0) { // L: 950
															--Login.field935; // L: 951
														}

														Login.field938[Login.field935] = null; // L: 953
													}

													if (var25.field2348 >= '0' && var25.field2348 <= '9') { // L: 955
														Login.field938[Login.field935] = "" + var25.field2348; // L: 956
														if (Login.field935 < 7) { // L: 957
															++Login.field935; // L: 958
														}
													}

													if (var25.field2349 == 84) { // L: 961
														label1151: {
															try {
																var30 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 968
																var30.setLenient(false); // L: 969
																var31 = new StringBuilder(); // L: 970
																var20 = Login.field938; // L: 972
																var21 = 0;

																while (true) {
																	if (var21 >= var20.length) {
																		var31.append("12"); // L: 988
																		var33 = var30.parse(var31.toString()); // L: 989
																		break;
																	}

																	var32 = var20[var21]; // L: 974
																	if (var32 == null) { // L: 976
																		class390.method7249(7); // L: 978
																		class478.setLoginResponseString("Date not valid.", "Please ensure all characters are populated.", ""); // L: 979
																		var33 = null; // L: 981
																		break; // L: 982
																	}

																	var31.append(var32); // L: 984
																	++var21; // L: 973
																}

																var34 = var33; // L: 991
															} catch (ParseException var39) { // L: 993
																class390.method7249(7); // L: 995
																class478.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 996
																var35 = false; // L: 998
																break label1151; // L: 999
															}

															if (var34 == null) { // L: 1001
																var35 = false; // L: 1002
															} else {
																var62 = java.util.Calendar.getInstance(); // L: 1007
																var62.set(1, var62.get(1) - 13); // L: 1008
																var62.set(5, var62.get(5) + 1); // L: 1009
																var62.set(11, 0); // L: 1010
																var62.set(12, 0); // L: 1011
																var62.set(13, 0); // L: 1012
																var62.set(14, 0); // L: 1013
																var63 = var62.getTime(); // L: 1014
																var17 = var34.before(var63); // L: 1015
																var36 = java.util.Calendar.getInstance(); // L: 1022
																var36.set(2, 0); // L: 1023
																var36.set(5, 1); // L: 1024
																var36.set(1, 1900); // L: 1025
																var57 = var36.getTime(); // L: 1026
																var19 = var34.after(var57); // L: 1029
																if (!var19) { // L: 1032
																	class390.method7249(7); // L: 1034
																	class478.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1035
																	var35 = false; // L: 1037
																} else {
																	if (!var17) { // L: 1040
																		GameObject.field2850 = 8388607; // L: 1041
																	} else {
																		GameObject.field2850 = (int)(var34.getTime() / 86400000L - 11745L); // L: 1044
																	}

																	var35 = true; // L: 1046
																}
															}
														}

														if (var35) { // L: 1049
															UserComparator8.method2855(50); // L: 1050
														}

														return; // L: 1052
													}
												}
											} else {
												var9 = Login.loginBoxX + 180 - 80; // L: 1057
												var10 = 321; // L: 1058
												if (var5 == 1 && var43 >= var9 - 75 && var43 <= var9 + 75 && var44 >= var10 - 20 && var44 <= var10 + 20) { // L: 1059
													class27.openURL(Widget.method6509("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1060
													class478.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1061
													class390.method7249(6); // L: 1062
													return; // L: 1063
												}

												var9 = Login.loginBoxX + 180 + 80; // L: 1065
												if (var5 == 1 && var43 >= var9 - 75 && var43 <= var9 + 75 && var44 >= var10 - 20 && var44 <= var10 + 20) { // L: 1066
													ViewportMouse.Login_promptCredentials(true); // L: 1067
												}
											}
										} else if (Login.loginIndex == 8) { // L: 1071
											var9 = Login.loginBoxX + 180 - 80; // L: 1072
											var10 = 321; // L: 1073
											if (var5 == 1 && var43 >= var9 - 75 && var43 <= var9 + 75 && var44 >= var10 - 20 && var44 <= var10 + 20) { // L: 1074
												class27.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1075
												class478.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1076
												class390.method7249(6); // L: 1077
												return; // L: 1078
											}

											var9 = Login.loginBoxX + 180 + 80; // L: 1080
											if (var5 == 1 && var43 >= var9 - 75 && var43 <= var9 + 75 && var44 >= var10 - 20 && var44 <= var10 + 20) { // L: 1081
												ViewportMouse.Login_promptCredentials(true); // L: 1082
											}
										} else if (Login.loginIndex == 9) { // L: 1085
											var9 = Login.loginBoxX + 180; // L: 1086
											var10 = 311; // L: 1087
											if (var25.field2349 == 84 || var25.field2349 == 13 || var5 == 1 && var43 >= var9 - 75 && var43 <= var9 + 75 && var44 >= var10 - 20 && var44 <= var10 + 20) { // L: 1088
												class164.method3362(false); // L: 1089
											}
										} else if (Login.loginIndex == 10) { // L: 1092
											var9 = Login.loginBoxX + 180; // L: 1093
											var10 = 209; // L: 1094
											if (var25.field2349 == 84 || var5 == 1 && var43 >= var9 - 109 && var43 <= var9 + 109 && var44 >= var10 && var44 <= var10 + 68) { // L: 1095
												class478.setLoginResponseString("", "Connecting to server...", ""); // L: 1096
												Client.field633 = class505.field5073; // L: 1097
												class152.method3194(false); // L: 1098
												UserComparator8.method2855(20); // L: 1099
											}
										} else if (Login.loginIndex == 12) { // L: 1102
											var9 = class485.loginBoxCenter; // L: 1103
											var10 = 233; // L: 1104
											var29 = var2.method7425(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 1105
											Bounds var26 = var2.method7425(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 1106
											Bounds var27 = var2.method7425(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 1107
											var47 = var10 + 17; // L: 1108
											Bounds var37 = var2.method7425(0, 34, "<col=ffd200>agreement (EULA)</col>.", var9, var47); // L: 1109
											if (var5 == 1) { // L: 1110
												if (var29.method8029(var43, var44)) { // L: 1111
													class27.openURL("https://www.jagex.com/terms", true, false); // L: 1112
												} else if (var26.method8029(var43, var44)) { // L: 1114
													class27.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1115
												} else if (var27.method8029(var43, var44) || var37.method8029(var43, var44)) { // L: 1117
													class27.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 1118
												}
											}

											var9 = class485.loginBoxCenter - 80; // L: 1121
											var10 = 311; // L: 1122
											if (var5 == 1 && var43 >= var9 - 75 && var43 <= var9 + 75 && var44 >= var10 - 20 && var44 <= var10 + 20) { // L: 1123
												class10.clientPreferences.method2466(Client.field508); // L: 1125
												class164.method3362(true); // L: 1127
											}

											var9 = class485.loginBoxCenter + 80; // L: 1129
											if (var5 == 1 && var43 >= var9 - 75 && var43 <= var9 + 75 && var44 >= var10 - 20 && var44 <= var10 + 20) { // L: 1130
												Login.loginIndex = 13; // L: 1131
											}
										} else if (Login.loginIndex == 13) { // L: 1134
											var9 = class485.loginBoxCenter; // L: 1135
											var10 = 321; // L: 1136
											if (var5 == 1 && var43 >= var9 - 75 && var43 <= var9 + 75 && var44 >= var10 - 20 && var44 <= var10 + 20) { // L: 1137
												class164.method3362(true); // L: 1138
											}
										} else if (Login.loginIndex == 14) { // L: 1141
											String var38 = ""; // L: 1142
											switch(Login.field925) { // L: 1143
											case 0:
												var38 = "https://secure.runescape.com/m=offence-appeal/account-history"; // L: 1148
												break; // L: 1149
											case 1:
												var38 = "https://secure.runescape.com/m=accountappeal/passwordrecovery"; // L: 1151
												break; // L: 1152
											case 2:
												var38 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance"; // L: 1145
												break; // L: 1146
											default:
												ViewportMouse.Login_promptCredentials(false); // L: 1154
											}

											var47 = Login.loginBoxX + 180; // L: 1157
											var46 = 276; // L: 1158
											if (var5 == 1 && var43 >= var47 - 75 && var43 <= var47 + 75 && var44 >= var46 - 20 && var44 <= var46 + 20) { // L: 1159
												class27.openURL(var38, true, false); // L: 1160
												class478.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1161
												class390.method7249(6); // L: 1162
												return; // L: 1163
											}

											var47 = Login.loginBoxX + 180; // L: 1165
											var46 = 326; // L: 1166
											if (var5 == 1 && var43 >= var47 - 75 && var43 <= var47 + 75 && var44 >= var46 - 20 && var44 <= var46 + 20) { // L: 1167
												ViewportMouse.Login_promptCredentials(false); // L: 1168
											}
										} else if (Login.loginIndex == 24) { // L: 1171
											var9 = Login.loginBoxX + 180; // L: 1172
											var10 = 301; // L: 1173
											if (var5 == 1 && var43 >= var9 - 75 && var43 <= var9 + 75 && var44 >= var10 - 20 && var44 <= var10 + 20) { // L: 1174
												class164.method3362(false); // L: 1175
											}
										} else if (Login.loginIndex == 32) { // L: 1178
											var9 = Login.loginBoxX + 180 - 80; // L: 1179
											var10 = 321; // L: 1180
											if (var5 == 1 && var43 >= var9 - 75 && var43 <= var9 + 75 && var44 >= var10 - 20 && var44 <= var10 + 20) { // L: 1181
												class27.openURL(Widget.method6509("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1182
												class478.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1183
												class390.method7249(6); // L: 1184
												return; // L: 1185
											}

											var9 = Login.loginBoxX + 180 + 80; // L: 1187
											if (var5 == 1 && var43 >= var9 - 75 && var43 <= var9 + 75 && var44 >= var10 - 20 && var44 <= var10 + 20) { // L: 1188
												ViewportMouse.Login_promptCredentials(true); // L: 1189
											}
										} else if (Login.loginIndex == 33) { // L: 1192
											var9 = Login.loginBoxX + 180; // L: 1193
											var10 = 276; // L: 1194
											if (var5 == 1 && var43 >= var9 - 75 && var43 <= var9 + 75 && var44 >= var10 - 20 && var44 <= var10 + 20) { // L: 1195
												class27.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 1196
											}

											var9 = Login.loginBoxX + 180; // L: 1198
											var10 = 326; // L: 1199
											if (var5 == 1 && var43 >= var9 - 75 && var43 <= var9 + 75 && var44 >= var10 - 20 && var44 <= var10 + 20) { // L: 1200
												ViewportMouse.Login_promptCredentials(true); // L: 1201
											}
										}
									} else {
										while (true) {
											do {
												if (!var25.method4133()) { // L: 826
													var45 = 321; // L: 831
													if (var5 == 1 && var44 >= var45 - 20 && var44 <= var45 + 20) { // L: 832
														ViewportMouse.Login_promptCredentials(true); // L: 833
													}

													return;
												}
											} while(var25.field2349 != 84 && var25.field2349 != 13); // L: 827

											ViewportMouse.Login_promptCredentials(true); // L: 828
										}
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 378
}
