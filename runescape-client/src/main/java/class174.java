import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public class class174 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lab;Lmg;I)V",
		garbageValue = "445754216"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1) {
		int var5;
		if (Login.worldSelectOpen) { // L: 282
			while (true) {
				if (!ParamComposition.isKeyDown()) { // L: 284
					if (MouseHandler.MouseHandler_lastButton != 1 && (Bounds.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) { // L: 300
						break;
					}

					int var2 = Login.xPadding + 280; // L: 301
					if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 302
						PlayerComposition.changeWorldSelectSorting(0, 0); // L: 303
						break; // L: 304
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 306
						PlayerComposition.changeWorldSelectSorting(0, 1); // L: 307
						break; // L: 308
					}

					int var3 = Login.xPadding + 390; // L: 310
					if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 311
						PlayerComposition.changeWorldSelectSorting(1, 0); // L: 312
						break; // L: 313
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 315
						PlayerComposition.changeWorldSelectSorting(1, 1); // L: 316
						break; // L: 317
					}

					int var40 = Login.xPadding + 500; // L: 319
					if (MouseHandler.MouseHandler_lastPressedX >= var40 && MouseHandler.MouseHandler_lastPressedX <= var40 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 320
						PlayerComposition.changeWorldSelectSorting(2, 0); // L: 321
						break; // L: 322
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var40 + 15 && MouseHandler.MouseHandler_lastPressedX <= var40 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 324
						PlayerComposition.changeWorldSelectSorting(2, 1); // L: 325
						break; // L: 326
					}

					var5 = Login.xPadding + 610; // L: 328
					if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 329
						PlayerComposition.changeWorldSelectSorting(3, 0); // L: 330
						break; // L: 331
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 333
						PlayerComposition.changeWorldSelectSorting(3, 1); // L: 334
						break; // L: 335
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 337
						class144.method3010(); // L: 338
						break; // L: 339
					}

					if (Login.hoveredWorldIndex != -1) { // L: 341
						World var6 = World.World_worlds[Login.hoveredWorldIndex]; // L: 342
						WorldMapID.changeWorld(var6); // L: 343
						class144.method3010(); // L: 344
					} else {
						if (Login.worldSelectPage > 0 && class17.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class17.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= DecorativeObject.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= DecorativeObject.canvasHeight / 2 + 50) { // L: 347
							--Login.worldSelectPage; // L: 348
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && class14.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class7.canvasWidth - class14.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class7.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= DecorativeObject.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= DecorativeObject.canvasHeight / 2 + 50) { // L: 350
							++Login.worldSelectPage; // L: 351
						}
					}
					break;
				}

				if (class145.field1653 == 13) { // L: 285
					class144.method3010(); // L: 286
					break; // L: 287
				}

				if (class145.field1653 == 96) { // L: 289
					if (Login.worldSelectPage > 0 && class17.worldSelectLeftSprite != null) { // L: 290
						--Login.worldSelectPage; // L: 291
					}
				} else if (class145.field1653 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class14.worldSelectRightSprite != null) { // L: 294 295
					++Login.worldSelectPage; // L: 296
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !Bounds.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 357
				FriendsChatMember.clientPreferences.method2212(!FriendsChatMember.clientPreferences.method2213()); // L: 358
				if (!FriendsChatMember.clientPreferences.method2213()) { // L: 359
					Renderable.method4229(PacketBuffer.archive6, "scape main", "", 255, false);
				} else {
					VarcInt.method3328(); // L: 360
				}
			}

			if (Client.gameState != 5) { // L: 362
				if (-1L == Login.field889) { // L: 363
					Login.field889 = class181.method3483() + 1000L; // L: 364
				}

				long var22 = class181.method3483(); // L: 366
				boolean var4;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 369
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) { // L: 373
							var4 = true; // L: 381
							break;
						}

						ArchiveLoader var24 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 374
						if (!var24.isLoaded()) { // L: 375
							var4 = false; // L: 376
							break; // L: 377
						}

						++Client.archiveLoadersDone; // L: 379
					}
				} else {
					var4 = true; // L: 370
				}

				if (var4 && -1L == Login.field910) { // L: 383 384
					Login.field910 = var22; // L: 385
					if (Login.field910 > Login.field889) { // L: 386
						Login.field889 = Login.field910; // L: 387
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 391
					if (Language.Language_EN == MilliClock.clientLanguage) { // L: 392
						if (MouseHandler.MouseHandler_lastButton == 1 || !Bounds.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 393
							var5 = Login.xPadding + 5; // L: 394
							short var25 = 463; // L: 395
							byte var7 = 100; // L: 396
							byte var8 = 35; // L: 397
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var7 + var5 && MouseHandler.MouseHandler_lastPressedY >= var25 && MouseHandler.MouseHandler_lastPressedY <= var8 + var25) { // L: 398
								if (class4.loadWorlds()) { // L: 400
									Login.worldSelectOpen = true; // L: 401
									Login.worldSelectPage = 0; // L: 402
									Login.worldSelectPagesCount = 0; // L: 403
								}

								return; // L: 406
							}
						}

						if (class258.World_request != null && class4.loadWorlds()) { // L: 409 410
							Login.worldSelectOpen = true; // L: 411
							Login.worldSelectPage = 0; // L: 412
							Login.worldSelectPagesCount = 0; // L: 413
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton; // L: 417
					int var54 = MouseHandler.MouseHandler_lastPressedX; // L: 418
					int var41 = MouseHandler.MouseHandler_lastPressedY; // L: 419
					if (var5 == 0) { // L: 420
						var54 = MouseHandler.MouseHandler_x; // L: 421
						var41 = MouseHandler.MouseHandler_y; // L: 422
					}

					if (!Bounds.mouseCam && var5 == 4) { // L: 424
						var5 = 1;
					}

					int var44;
					short var45;
					if (Login.loginIndex == 0) { // L: 425
						boolean var52 = false; // L: 426

						while (ParamComposition.isKeyDown()) { // L: 427
							if (class145.field1653 == 84) { // L: 428
								var52 = true; // L: 429
							}
						}

						var44 = Login.loginBoxCenter - 80; // L: 432
						var45 = 291; // L: 433
						if (var5 == 1 && var54 >= var44 - 75 && var54 <= var44 + 75 && var41 >= var45 - 20 && var41 <= var45 + 20) { // L: 434
							class400.openURL(ModeWhere.method6005("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 435
						}

						var44 = Login.loginBoxCenter + 80; // L: 437
						if (var5 == 1 && var54 >= var44 - 75 && var54 <= var44 + 75 && var41 >= var45 - 20 && var41 <= var45 + 20 || var52) { // L: 438
							if ((Client.worldProperties & 33554432) != 0) { // L: 439
								Login.Login_response0 = ""; // L: 440
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 441
								Login.Login_response2 = "Your normal account will not be affected."; // L: 442
								Login.Login_response3 = ""; // L: 443
								class116.method2683(1); // L: 444
								ReflectionCheck.method580(); // L: 445
							} else if ((Client.worldProperties & 4) != 0) { // L: 447
								if ((Client.worldProperties & 1024) != 0) { // L: 448
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 449
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 450
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 451
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 454
									Login.Login_response2 = "Players can attack each other"; // L: 455
									Login.Login_response3 = "almost everywhere."; // L: 456
								}

								Login.Login_response0 = "Warning!"; // L: 458
								class116.method2683(1); // L: 459
								ReflectionCheck.method580(); // L: 460
							} else if ((Client.worldProperties & 1024) != 0) { // L: 462
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 463
								Login.Login_response2 = "The Protect Item prayer will"; // L: 464
								Login.Login_response3 = "not work on this world."; // L: 465
								Login.Login_response0 = "Warning!"; // L: 466
								class116.method2683(1); // L: 467
								ReflectionCheck.method580(); // L: 468
							} else {
								class6.Login_promptCredentials(false); // L: 471
							}
						}
					} else {
						short var9;
						int var42;
						if (Login.loginIndex == 1) { // L: 475
							while (true) {
								if (!ParamComposition.isKeyDown()) { // L: 476
									var42 = Login.loginBoxCenter - 80; // L: 484
									var9 = 321; // L: 485
									if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) { // L: 486
										class6.Login_promptCredentials(false); // L: 487
									}

									var42 = Login.loginBoxCenter + 80; // L: 489
									if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) { // L: 490
										class116.method2683(0); // L: 491
									}
									break;
								}

								if (class145.field1653 == 84) { // L: 477
									class6.Login_promptCredentials(false); // L: 478
								} else if (class145.field1653 == 13) { // L: 480
									class116.method2683(0); // L: 481
								}
							}
						} else {
							int var12;
							short var43;
							boolean var46;
							if (Login.loginIndex == 2) { // L: 494
								var43 = 201; // L: 495
								var42 = var43 + 52; // L: 496
								if (var5 == 1 && var41 >= var42 - 12 && var41 < var42 + 2) { // L: 497
									Login.currentLoginField = 0;
								}

								var42 += 15; // L: 498
								if (var5 == 1 && var41 >= var42 - 12 && var41 < var42 + 2) { // L: 499
									Login.currentLoginField = 1;
								}

								var42 += 15; // L: 500
								var43 = 361; // L: 501
								if (class11.field60 != null) { // L: 502
									var44 = class11.field60.highX / 2; // L: 503
									if (var5 == 1 && var54 >= class11.field60.lowX - var44 && var54 <= var44 + class11.field60.lowX && var41 >= var43 - 15 && var41 < var43) { // L: 504
										switch(Login.field875) { // L: 505
										case 1:
											ItemComposition.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 513
											class116.method2683(5); // L: 514
											return; // L: 515
										case 2:
											class400.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 508
										}
									}
								}

								var44 = Login.loginBoxCenter - 80; // L: 520
								var45 = 321; // L: 521
								if (var5 == 1 && var54 >= var44 - 75 && var54 <= var44 + 75 && var41 >= var45 - 20 && var41 <= var45 + 20) { // L: 522
									Login.Login_username = Login.Login_username.trim(); // L: 523
									if (Login.Login_username.length() == 0) { // L: 524
										ItemComposition.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 525
										return; // L: 526
									}

									if (Login.Login_password.length() == 0) { // L: 528
										ItemComposition.setLoginResponseString("", "Please enter your password.", ""); // L: 529
										return; // L: 530
									}

									ItemComposition.setLoginResponseString("", "Connecting to server...", ""); // L: 532
									method3382(false); // L: 533
									class4.updateGameState(20); // L: 534
									return; // L: 535
								}

								var44 = Login.loginBoxX + 180 + 80; // L: 537
								if (var5 == 1 && var54 >= var44 - 75 && var54 <= var44 + 75 && var41 >= var45 - 20 && var41 <= var45 + 20) { // L: 538
									class116.method2683(0); // L: 539
									Login.Login_username = ""; // L: 540
									Login.Login_password = ""; // L: 541
									class19.field100 = 0; // L: 542
									KeyHandler.otp = ""; // L: 543
									Login.field895 = true; // L: 544
								}

								var44 = Login.loginBoxCenter + -117; // L: 546
								var45 = 277; // L: 547
								Login.field868 = var54 >= var44 && var54 < var44 + ClientPreferences.field1245 && var41 >= var45 && var41 < var45 + class141.field1635; // L: 548
								if (var5 == 1 && Login.field868) { // L: 549
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 550
									if (!Client.Login_isUsernameRemembered && FriendsChatMember.clientPreferences.method2227() != null) { // L: 551
										FriendsChatMember.clientPreferences.method2268((String)null); // L: 552
									}
								}

								var44 = Login.loginBoxCenter + 24; // L: 555
								var45 = 277; // L: 556
								Login.field894 = var54 >= var44 && var54 < var44 + ClientPreferences.field1245 && var41 >= var45 && var41 < var45 + class141.field1635; // L: 557
								if (var5 == 1 && Login.field894) { // L: 558
									FriendsChatMember.clientPreferences.method2210(!FriendsChatMember.clientPreferences.method2211()); // L: 559
									if (!FriendsChatMember.clientPreferences.method2211()) { // L: 560
										Login.Login_username = ""; // L: 561
										FriendsChatMember.clientPreferences.method2268((String)null); // L: 562
										ReflectionCheck.method580(); // L: 563
									}
								}

								while (true) {
									int var48;
									Transferable var56;
									do {
										while (true) {
											label1460:
											do {
												while (true) {
													while (ParamComposition.isKeyDown()) { // L: 566
														if (class145.field1653 != 13) { // L: 567
															if (Login.currentLoginField != 0) { // L: 576
																continue label1460;
															}

															char var47 = WallObject.field2636; // L: 577

															for (var12 = 0; var12 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var47 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var12); ++var12) { // L: 579 580
															}

															if (class145.field1653 == 85 && Login.Login_username.length() > 0) { // L: 583
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (class145.field1653 == 84 || class145.field1653 == 80) { // L: 584
																Login.currentLoginField = 1;
															}

															if (WorldMapSectionType.method4879(WallObject.field2636) && Login.Login_username.length() < 320) { // L: 585
																Login.Login_username = Login.Login_username + WallObject.field2636;
															}
														} else {
															class116.method2683(0); // L: 568
															Login.Login_username = ""; // L: 569
															Login.Login_password = ""; // L: 570
															class19.field100 = 0; // L: 571
															KeyHandler.otp = ""; // L: 572
															Login.field895 = true; // L: 573
														}
													}

													return; // L: 1090
												}
											} while(Login.currentLoginField != 1); // L: 587

											if (class145.field1653 == 85 && Login.Login_password.length() > 0) { // L: 588
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 589
											} else if (class145.field1653 == 84 || class145.field1653 == 80) { // L: 591
												Login.currentLoginField = 0; // L: 592
												if (class145.field1653 == 84) { // L: 593
													Login.Login_username = Login.Login_username.trim(); // L: 594
													if (Login.Login_username.length() == 0) { // L: 595
														ItemComposition.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 596
														return; // L: 597
													}

													if (Login.Login_password.length() == 0) { // L: 599
														ItemComposition.setLoginResponseString("", "Please enter your password.", ""); // L: 600
														return; // L: 601
													}

													ItemComposition.setLoginResponseString("", "Connecting to server...", ""); // L: 603
													method3382(false); // L: 604
													class4.updateGameState(20); // L: 605
													return; // L: 606
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && class145.field1653 == 67) { // L: 609
												Clipboard var55 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 610
												var56 = var55.getContents(AbstractByteArrayCopier.client); // L: 611
												var48 = 20 - Login.Login_password.length(); // L: 612
												break;
											}

											char var49 = WallObject.field2636; // L: 654
											if (var49 >= ' ' && var49 < 127 || var49 > 127 && var49 < 160 || var49 > 160 && var49 <= 255) { // L: 656
												var46 = true; // L: 657
											} else {
												label1696: {
													if (var49 != 0) { // L: 660
														char[] var57 = class341.cp1252AsciiExtension; // L: 662

														for (int var58 = 0; var58 < var57.length; ++var58) { // L: 663
															char var15 = var57[var58]; // L: 664
															if (var15 == var49) { // L: 666
																var46 = true; // L: 667
																break label1696; // L: 668
															}
														}
													}

													var46 = false; // L: 674
												}
											}

											if (var46 && WorldMapSectionType.method4879(WallObject.field2636) && Login.Login_password.length() < 20) { // L: 676
												Login.Login_password = Login.Login_password + WallObject.field2636; // L: 677
											}
										}
									} while(var48 <= 0); // L: 613

									try {
										String var14 = (String)var56.getTransferData(DataFlavor.stringFlavor); // L: 615
										int var50 = Math.min(var48, var14.length()); // L: 616

										for (int var51 = 0; var51 < var50; ++var51) { // L: 617
											char var53 = var14.charAt(var51); // L: 619
											boolean var17;
											if ((var53 < ' ' || var53 >= 127) && (var53 <= 127 || var53 >= 160) && (var53 <= 160 || var53 > 255)) { // L: 621
												label1683: {
													if (var53 != 0) { // L: 625
														char[] var19 = class341.cp1252AsciiExtension; // L: 627

														for (int var20 = 0; var20 < var19.length; ++var20) { // L: 628
															char var21 = var19[var20]; // L: 629
															if (var21 == var53) { // L: 631
																var17 = true; // L: 632
																break label1683; // L: 633
															}
														}
													}

													var17 = false; // L: 639
												}
											} else {
												var17 = true; // L: 622
											}

											if (!var17 || !WorldMapSectionType.method4879(var14.charAt(var51))) { // L: 641
												class116.method2683(3); // L: 642
												return; // L: 643
											}
										}

										Login.Login_password = Login.Login_password + var14.substring(0, var50); // L: 646
									} catch (UnsupportedFlavorException var38) { // L: 648
									} catch (IOException var39) { // L: 649
									}
								}
							} else if (Login.loginIndex == 3) { // L: 684
								var42 = Login.loginBoxX + 180; // L: 685
								var9 = 276; // L: 686
								if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) { // L: 687
									class33.method572(false); // L: 688
								}

								var42 = Login.loginBoxX + 180; // L: 690
								var9 = 326; // L: 691
								if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) { // L: 692
									ItemComposition.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 693
									class116.method2683(5); // L: 694
									return; // L: 695
								}
							} else {
								int var11;
								if (Login.loginIndex == 4) { // L: 698
									var42 = Login.loginBoxX + 180 - 80; // L: 699
									var9 = 321; // L: 700
									if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) { // L: 701
										KeyHandler.otp.trim(); // L: 702
										if (KeyHandler.otp.length() != 6) { // L: 703
											ItemComposition.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 704
											return; // L: 705
										}

										class19.field100 = Integer.parseInt(KeyHandler.otp); // L: 707
										KeyHandler.otp = ""; // L: 708
										method3382(true); // L: 709
										ItemComposition.setLoginResponseString("", "Connecting to server...", ""); // L: 710
										class4.updateGameState(20); // L: 711
										return; // L: 712
									}

									if (var5 == 1 && var54 >= Login.loginBoxX + 180 - 9 && var54 <= Login.loginBoxX + 180 + 130 && var41 >= 263 && var41 <= 296) { // L: 714
										Login.field895 = !Login.field895; // L: 715
									}

									if (var5 == 1 && var54 >= Login.loginBoxX + 180 - 34 && var54 <= Login.loginBoxX + 34 + 180 && var41 >= 351 && var41 <= 363) { // L: 717
										class400.openURL(ModeWhere.method6005("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 718
									}

									var42 = Login.loginBoxX + 180 + 80; // L: 720
									if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) { // L: 721
										class116.method2683(0); // L: 722
										Login.Login_username = ""; // L: 723
										Login.Login_password = ""; // L: 724
										class19.field100 = 0; // L: 725
										KeyHandler.otp = ""; // L: 726
									}

									while (ParamComposition.isKeyDown()) { // L: 728
										boolean var10 = false; // L: 729

										for (var11 = 0; var11 < "1234567890".length(); ++var11) { // L: 730
											if (WallObject.field2636 == "1234567890".charAt(var11)) { // L: 731
												var10 = true; // L: 732
												break; // L: 733
											}
										}

										if (class145.field1653 == 13) { // L: 736
											class116.method2683(0); // L: 737
											Login.Login_username = ""; // L: 738
											Login.Login_password = ""; // L: 739
											class19.field100 = 0; // L: 740
											KeyHandler.otp = ""; // L: 741
										} else {
											if (class145.field1653 == 85 && KeyHandler.otp.length() > 0) { // L: 744
												KeyHandler.otp = KeyHandler.otp.substring(0, KeyHandler.otp.length() - 1);
											}

											if (class145.field1653 == 84) { // L: 745
												KeyHandler.otp.trim(); // L: 746
												if (KeyHandler.otp.length() != 6) { // L: 747
													ItemComposition.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 748
													return; // L: 749
												}

												class19.field100 = Integer.parseInt(KeyHandler.otp); // L: 751
												KeyHandler.otp = ""; // L: 752
												method3382(true); // L: 753
												ItemComposition.setLoginResponseString("", "Connecting to server...", ""); // L: 754
												class4.updateGameState(20); // L: 755
												return; // L: 756
											}

											if (var10 && KeyHandler.otp.length() < 6) { // L: 758
												KeyHandler.otp = KeyHandler.otp + WallObject.field2636;
											}
										}
									}
								} else if (Login.loginIndex == 5) { // L: 762
									var42 = Login.loginBoxX + 180 - 80; // L: 763
									var9 = 321; // L: 764
									if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) { // L: 765
										UserComparator7.method2558(); // L: 766
										return; // L: 767
									}

									var42 = Login.loginBoxX + 180 + 80; // L: 769
									if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) { // L: 770
										class6.Login_promptCredentials(true); // L: 771
									}

									var45 = 361; // L: 773
									if (UrlRequester.field1346 != null) { // L: 774
										var11 = UrlRequester.field1346.highX / 2; // L: 775
										if (var5 == 1 && var54 >= UrlRequester.field1346.lowX - var11 && var54 <= var11 + UrlRequester.field1346.lowX && var41 >= var45 - 15 && var41 < var45) { // L: 776
											class400.openURL(ModeWhere.method6005("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 777
										}
									}

									while (ParamComposition.isKeyDown()) { // L: 780
										var46 = false; // L: 781

										for (var12 = 0; var12 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var12) { // L: 782
											if (WallObject.field2636 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var12)) { // L: 783
												var46 = true; // L: 784
												break; // L: 785
											}
										}

										if (class145.field1653 == 13) { // L: 788
											class6.Login_promptCredentials(true); // L: 789
										} else {
											if (class145.field1653 == 85 && Login.Login_username.length() > 0) { // L: 792
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (class145.field1653 == 84) { // L: 793
												UserComparator7.method2558(); // L: 794
												return; // L: 795
											}

											if (var46 && Login.Login_username.length() < 320) { // L: 797
												Login.Login_username = Login.Login_username + WallObject.field2636;
											}
										}
									}
								} else if (Login.loginIndex != 6) { // L: 801
									if (Login.loginIndex == 7) { // L: 812
										if (class82.field1066 && !Client.onMobile) { // L: 813
											var42 = Login.loginBoxCenter - 150; // L: 814
											var44 = var42 + 40 + 240 + 25; // L: 815
											var45 = 231; // L: 816
											var11 = var45 + 40; // L: 817
											if (var5 == 1 && var54 >= var42 && var54 <= var44 && var41 >= var45 && var41 <= var11) { // L: 818
												Login.field891 = WorldMapSection0.method4869(var42, var54); // L: 819
											}

											var12 = Login.loginBoxX + 180 - 80; // L: 821
											short var13 = 321; // L: 822
											boolean var16;
											boolean var18;
											boolean var29;
											Date var30;
											java.util.Calendar var32;
											Date var33;
											if (var5 == 1 && var54 >= var12 - 75 && var54 <= var12 + 75 && var41 >= var13 - 20 && var41 <= var13 + 20) { // L: 823
												label1355: {
													try {
														var30 = Friend.method6595(); // L: 828
													} catch (ParseException var37) { // L: 830
														class116.method2683(7); // L: 832
														ItemComposition.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 833
														var29 = false; // L: 835
														break label1355; // L: 836
													}

													if (var30 == null) { // L: 838
														var29 = false; // L: 839
													} else {
														var32 = java.util.Calendar.getInstance(); // L: 844
														var32.set(1, var32.get(1) - 13); // L: 845
														var32.set(5, var32.get(5) + 1); // L: 846
														var32.set(11, 0); // L: 847
														var32.set(12, 0); // L: 848
														var32.set(13, 0); // L: 849
														var32.set(14, 0); // L: 850
														var33 = var32.getTime(); // L: 851
														var16 = var30.before(var33); // L: 852
														var18 = class134.method2858(var30); // L: 855
														if (!var18) { // L: 856
															class116.method2683(7); // L: 858
															ItemComposition.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 859
															var29 = false; // L: 861
														} else {
															if (!var16) { // L: 864
																Bounds.field4379 = 8388607; // L: 865
															} else {
																Bounds.field4379 = (int)(var30.getTime() / 86400000L - 11745L); // L: 868
															}

															var29 = true; // L: 870
														}
													}
												}

												if (var29) { // L: 873
													class4.updateGameState(50); // L: 874
													return; // L: 875
												}
											}

											var12 = Login.loginBoxX + 180 + 80; // L: 878
											if (var5 == 1 && var54 >= var12 - 75 && var54 <= var12 + 75 && var41 >= var13 - 20 && var41 <= var13 + 20) { // L: 879
												Login.field892 = new String[8]; // L: 880
												class6.Login_promptCredentials(true); // L: 881
											}

											while (ParamComposition.isKeyDown()) { // L: 883
												if (class145.field1653 == 101) { // L: 884
													Login.field892[Login.field891] = null; // L: 885
												}

												if (class145.field1653 == 85) { // L: 887
													if (Login.field892[Login.field891] == null && Login.field891 > 0) { // L: 888
														--Login.field891; // L: 889
													}

													Login.field892[Login.field891] = null; // L: 891
												}

												if (WallObject.field2636 >= '0' && WallObject.field2636 <= '9') { // L: 893
													Login.field892[Login.field891] = "" + WallObject.field2636; // L: 894
													if (Login.field891 < 7) { // L: 895
														++Login.field891; // L: 896
													}
												}

												if (class145.field1653 == 84) { // L: 899
													label1291: {
														try {
															var30 = Friend.method6595(); // L: 904
														} catch (ParseException var36) { // L: 906
															class116.method2683(7); // L: 908
															ItemComposition.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 909
															var29 = false; // L: 911
															break label1291; // L: 912
														}

														if (var30 == null) { // L: 914
															var29 = false; // L: 915
														} else {
															var32 = java.util.Calendar.getInstance(); // L: 920
															var32.set(1, var32.get(1) - 13); // L: 921
															var32.set(5, var32.get(5) + 1); // L: 922
															var32.set(11, 0); // L: 923
															var32.set(12, 0); // L: 924
															var32.set(13, 0); // L: 925
															var32.set(14, 0); // L: 926
															var33 = var32.getTime(); // L: 927
															var16 = var30.before(var33); // L: 928
															var18 = class134.method2858(var30); // L: 931
															if (!var18) { // L: 932
																class116.method2683(7); // L: 934
																ItemComposition.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 935
																var29 = false; // L: 937
															} else {
																if (!var16) { // L: 940
																	Bounds.field4379 = 8388607; // L: 941
																} else {
																	Bounds.field4379 = (int)(var30.getTime() / 86400000L - 11745L); // L: 944
																}

																var29 = true; // L: 946
															}
														}
													}

													if (var29) { // L: 949
														class4.updateGameState(50); // L: 950
													}

													return; // L: 952
												}
											}
										} else {
											var42 = Login.loginBoxX + 180 - 80; // L: 957
											var9 = 321; // L: 958
											if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) { // L: 959
												class400.openURL(ModeWhere.method6005("secure", true) + "m=dob/set_dob.ws", true, false); // L: 960
												ItemComposition.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 961
												class116.method2683(6); // L: 962
												return; // L: 963
											}

											var42 = Login.loginBoxX + 180 + 80; // L: 965
											if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) { // L: 966
												class6.Login_promptCredentials(true); // L: 967
											}
										}
									} else if (Login.loginIndex == 8) { // L: 971
										var42 = Login.loginBoxX + 180 - 80; // L: 972
										var9 = 321; // L: 973
										if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) { // L: 974
											class400.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 975
											ItemComposition.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 976
											class116.method2683(6); // L: 977
											return; // L: 978
										}

										var42 = Login.loginBoxX + 180 + 80; // L: 980
										if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) { // L: 981
											class6.Login_promptCredentials(true); // L: 982
										}
									} else if (Login.loginIndex == 9) { // L: 985
										var42 = Login.loginBoxX + 180; // L: 986
										var9 = 311; // L: 987
										if (class145.field1653 == 84 || class145.field1653 == 13 || var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) { // L: 988
											class33.method572(false); // L: 989
										}
									} else if (Login.loginIndex == 10) { // L: 992
										var42 = Login.loginBoxX + 180; // L: 993
										var9 = 209; // L: 994
										if (class145.field1653 == 84 || var5 == 1 && var54 >= var42 - 109 && var54 <= var42 + 109 && var41 >= var9 && var41 <= var9 + 68) { // L: 995
											ItemComposition.setLoginResponseString("", "Connecting to server...", ""); // L: 996
											Client.field512 = class447.field4757; // L: 997
											method3382(false); // L: 998
											class4.updateGameState(20); // L: 999
										}
									} else if (Login.loginIndex == 12) { // L: 1002
										var42 = Login.loginBoxCenter; // L: 1003
										var9 = 233; // L: 1004
										Bounds var34 = var1.method6357(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var42, var9); // L: 1005
										Bounds var26 = var1.method6357(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var42, var9); // L: 1006
										Bounds var27 = var1.method6357(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var42, var9); // L: 1007
										var44 = var9 + 17; // L: 1008
										Bounds var28 = var1.method6357(0, 34, "<col=ffd200>agreement (EULA)</col>.", var42, var44); // L: 1009
										if (var5 == 1) { // L: 1010
											if (var34.method6853(var54, var41)) { // L: 1011
												class400.openURL("https://www.jagex.com/terms", true, false); // L: 1012
											} else if (var26.method6853(var54, var41)) { // L: 1014
												class400.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1015
											} else if (var27.method6853(var54, var41) || var28.method6853(var54, var41)) { // L: 1017
												class400.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 1018
											}
										}

										var42 = Login.loginBoxCenter - 80; // L: 1021
										var9 = 311; // L: 1022
										if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) { // L: 1023
											class1.method10(); // L: 1024
											class33.method572(true); // L: 1025
										}

										var42 = Login.loginBoxCenter + 80; // L: 1027
										if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) { // L: 1028
											Login.loginIndex = 13; // L: 1029
										}
									} else if (Login.loginIndex == 13) { // L: 1032
										var42 = Login.loginBoxCenter; // L: 1033
										var9 = 321; // L: 1034
										if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) { // L: 1035
											class33.method572(true); // L: 1036
										}
									} else if (Login.loginIndex == 14) { // L: 1039
										String var35 = ""; // L: 1040
										switch(Login.field882) { // L: 1041
										case 0:
											var35 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans"; // L: 1046
											break; // L: 1047
										case 1:
											var35 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked"; // L: 1049
											break; // L: 1050
										case 2:
											var35 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance"; // L: 1052
											break;
										default:
											class6.Login_promptCredentials(false); // L: 1043
										}

										var44 = Login.loginBoxX + 180; // L: 1055
										var45 = 276; // L: 1056
										if (var5 == 1 && var54 >= var44 - 75 && var54 <= var44 + 75 && var41 >= var45 - 20 && var41 <= var45 + 20) { // L: 1057
											class400.openURL(var35, true, false); // L: 1058
											ItemComposition.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 1059
											class116.method2683(6); // L: 1060
											return; // L: 1061
										}

										var44 = Login.loginBoxX + 180; // L: 1063
										var45 = 326; // L: 1064
										if (var5 == 1 && var54 >= var44 - 75 && var54 <= var44 + 75 && var41 >= var45 - 20 && var41 <= var45 + 20) { // L: 1065
											class6.Login_promptCredentials(false); // L: 1066
										}
									} else if (Login.loginIndex == 24) { // L: 1069
										var42 = Login.loginBoxX + 180; // L: 1070
										var9 = 301; // L: 1071
										if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) { // L: 1072
											class33.method572(false); // L: 1073
										}
									} else if (Login.loginIndex == 26) { // L: 1076
										var42 = Login.loginBoxX + 180 - 80; // L: 1077
										var9 = 321; // L: 1078
										if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) { // L: 1079
											class400.openURL(ModeWhere.method6005("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1080
											ItemComposition.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 1081
											class116.method2683(6); // L: 1082
											return; // L: 1083
										}

										var42 = Login.loginBoxX + 180 + 80; // L: 1085
										if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) { // L: 1086
											class6.Login_promptCredentials(true); // L: 1087
										}
									}
								} else {
									while (true) {
										do {
											if (!ParamComposition.isKeyDown()) { // L: 802
												var43 = 321; // L: 807
												if (var5 == 1 && var41 >= var43 - 20 && var41 <= var43 + 20) { // L: 808
													class6.Login_promptCredentials(true); // L: 809
												}

												return;
											}
										} while(class145.field1653 != 84 && class145.field1653 != 13); // L: 803

										class6.Login_promptCredentials(true); // L: 804
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 355

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-13"
	)
	static final void method3382(boolean var0) {
		if (var0) { // L: 2937
			Client.field511 = Login.field895 ? class124.field1522 : class124.field1520; // L: 2938
		} else {
			LinkedHashMap var1 = FriendsChatMember.clientPreferences.parameters; // L: 2941
			String var3 = Login.Login_username; // L: 2943
			int var4 = var3.length(); // L: 2945
			int var5 = 0; // L: 2946

			for (int var6 = 0; var6 < var4; ++var6) { // L: 2947
				var5 = (var5 << 5) - var5 + var3.charAt(var6);
			}

			Client.field511 = var1.containsKey(var5) ? class124.field1519 : class124.field1521; // L: 2950
		}

	} // L: 2952
}
