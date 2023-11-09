import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
public enum class123 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	field1511(0, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	field1503(1, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	field1504(2, 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	field1505(3, 3),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	field1506(4, 4),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	field1507(5, 5),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	field1508(6, 6),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	field1509(7, 7),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	field1510(8, 8);

	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = 1097174801
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1329363673
	)
	final int field1512;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1617021773
	)
	final int field1514;

	class123(int var3, int var4) {
		this.field1512 = var3; // L: 117
		this.field1514 = var4; // L: 118
	} // L: 119

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1790946346"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1514; // L: 122
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Las;Lmx;I)V",
		garbageValue = "447657503"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1) {
		int var5;
		if (Login.worldSelectOpen) { // L: 281
			while (true) {
				if (!WorldMapSectionType.isKeyDown()) { // L: 283
					if (MouseHandler.MouseHandler_lastButton != 1 && (ObjectSound.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) { // L: 304
						break;
					}

					int var2 = Login.xPadding + 280; // L: 305
					if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 306
						class155.changeWorldSelectSorting(0, 0); // L: 307
						break; // L: 308
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 310
						class155.changeWorldSelectSorting(0, 1); // L: 311
						break; // L: 312
					}

					int var3 = Login.xPadding + 390; // L: 314
					if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 315
						class155.changeWorldSelectSorting(1, 0); // L: 316
						break; // L: 317
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 319
						class155.changeWorldSelectSorting(1, 1); // L: 320
						break; // L: 321
					}

					int var41 = Login.xPadding + 500; // L: 323
					if (MouseHandler.MouseHandler_lastPressedX >= var41 && MouseHandler.MouseHandler_lastPressedX <= var41 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 324
						class155.changeWorldSelectSorting(2, 0); // L: 325
						break; // L: 326
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var41 + 15 && MouseHandler.MouseHandler_lastPressedX <= var41 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 328
						class155.changeWorldSelectSorting(2, 1); // L: 329
						break; // L: 330
					}

					var5 = Login.xPadding + 610; // L: 332
					if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 333
						class155.changeWorldSelectSorting(3, 0); // L: 334
						break; // L: 335
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 337
						class155.changeWorldSelectSorting(3, 1); // L: 338
						break; // L: 339
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 341
						Login.worldSelectOpen = false; // L: 343
						SpriteMask.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 344
						class356.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 345
						Canvas.logoSprite.drawAt(Login.xPadding + 382 - Canvas.logoSprite.subWidth / 2, 18); // L: 346
						break; // L: 348
					}

					if (Login.hoveredWorldIndex != -1) { // L: 350
						World var6 = class93.World_worlds[Login.hoveredWorldIndex]; // L: 351
						FriendSystem.changeWorld(var6); // L: 352
						Login.worldSelectOpen = false; // L: 354
						SpriteMask.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 355
						class356.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 356
						Canvas.logoSprite.drawAt(Login.xPadding + 382 - Canvas.logoSprite.subWidth / 2, 18); // L: 357
					} else {
						if (Login.worldSelectPage > 0 && class118.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class118.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class228.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class228.canvasHeight / 2 + 50) { // L: 361
							--Login.worldSelectPage; // L: 362
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && class33.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class352.canvasWidth - class33.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class352.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class228.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class228.canvasHeight / 2 + 50) { // L: 364
							++Login.worldSelectPage; // L: 365
						}
					}
					break;
				}

				if (SequenceDefinition.field2176 == 13) { // L: 284
					Login.worldSelectOpen = false; // L: 286
					SpriteMask.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 287
					class356.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 288
					Canvas.logoSprite.drawAt(Login.xPadding + 382 - Canvas.logoSprite.subWidth / 2, 18); // L: 289
					break; // L: 291
				}

				if (SequenceDefinition.field2176 == 96) { // L: 293
					if (Login.worldSelectPage > 0 && class118.worldSelectLeftSprite != null) { // L: 294
						--Login.worldSelectPage; // L: 295
					}
				} else if (SequenceDefinition.field2176 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class33.worldSelectRightSprite != null) { // L: 298 299
					++Login.worldSelectPage; // L: 300
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !ObjectSound.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 371
				class260.clientPreferences.method2347(!class260.clientPreferences.method2316()); // L: 372
				if (!class260.clientPreferences.method2316()) { // L: 373
					class154.method3167(MouseHandler.archive6, "scape main", "", 255, false);
				} else {
					LoginPacket.method5207(); // L: 374
				}
			}

			if (Client.gameState != 5) { // L: 376
				if (Login.field928 == -1L) { // L: 377
					Login.field928 = class131.method2916() + 1000L; // L: 378
				}

				long var22 = class131.method2916(); // L: 380
				boolean var4;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 383
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) { // L: 387
							var4 = true; // L: 395
							break;
						}

						ArchiveLoader var24 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 388
						if (!var24.isLoaded()) { // L: 389
							var4 = false; // L: 390
							break; // L: 391
						}

						++Client.archiveLoadersDone; // L: 393
					}
				} else {
					var4 = true; // L: 384
				}

				if (var4 && Login.field929 == -1L) { // L: 397 398
					Login.field929 = var22; // L: 399
					if (Login.field929 > Login.field928) { // L: 400
						Login.field928 = Login.field929; // L: 401
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 405
					if (Language.Language_EN == class21.clientLanguage) { // L: 406
						if (MouseHandler.MouseHandler_lastButton == 1 || !ObjectSound.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 407
							var5 = Login.xPadding + 5; // L: 408
							short var25 = 463; // L: 409
							byte var7 = 100; // L: 410
							byte var8 = 35; // L: 411
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var7 + var5 && MouseHandler.MouseHandler_lastPressedY >= var25 && MouseHandler.MouseHandler_lastPressedY <= var25 + var8) { // L: 412
								class282.method5487(); // L: 413
								return; // L: 414
							}
						}

						if (class144.World_request != null) { // L: 417
							class282.method5487();
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton; // L: 419
					int var56 = MouseHandler.MouseHandler_lastPressedX; // L: 420
					int var42 = MouseHandler.MouseHandler_lastPressedY; // L: 421
					if (var5 == 0) { // L: 422
						var56 = MouseHandler.MouseHandler_x; // L: 423
						var42 = MouseHandler.MouseHandler_y; // L: 424
					}

					if (!ObjectSound.mouseCam && var5 == 4) { // L: 426
						var5 = 1;
					}

					int var45;
					short var46;
					if (Login.loginIndex == 0) { // L: 427
						boolean var53 = false; // L: 428

						while (WorldMapSectionType.isKeyDown()) { // L: 429
							if (SequenceDefinition.field2176 == 84) { // L: 430
								var53 = true; // L: 431
							}
						}

						var45 = Login.loginBoxCenter - 80; // L: 434
						var46 = 291; // L: 435
						if (var5 == 1 && var56 >= var45 - 75 && var56 <= var45 + 75 && var42 >= var46 - 20 && var42 <= var46 + 20) { // L: 436
							class238.openURL(ScriptFrame.method1055("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 437
						}

						var45 = Login.loginBoxCenter + 80; // L: 439
						if (var5 == 1 && var56 >= var45 - 75 && var56 <= var45 + 75 && var42 >= var46 - 20 && var42 <= var46 + 20 || var53) { // L: 440
							if ((Client.worldProperties & 33554432) != 0) { // L: 441
								Login.Login_response0 = ""; // L: 442
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 443
								Login.Login_response2 = "Your normal account will not be affected."; // L: 444
								Login.Login_response3 = ""; // L: 445
								UserComparator6.method2701(1); // L: 446
								FloorOverlayDefinition.method3799(); // L: 447
							} else if ((Client.worldProperties & 4) != 0) { // L: 449
								if ((Client.worldProperties & 1024) != 0) { // L: 450
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 451
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 452
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 453
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 456
									Login.Login_response2 = "Players can attack each other"; // L: 457
									Login.Login_response3 = "almost everywhere."; // L: 458
								}

								Login.Login_response0 = "Warning!"; // L: 460
								UserComparator6.method2701(1); // L: 461
								FloorOverlayDefinition.method3799(); // L: 462
							} else if ((Client.worldProperties & 1024) != 0) { // L: 464
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 465
								Login.Login_response2 = "The Protect Item prayer will"; // L: 466
								Login.Login_response3 = "not work on this world."; // L: 467
								Login.Login_response0 = "Warning!"; // L: 468
								UserComparator6.method2701(1); // L: 469
								FloorOverlayDefinition.method3799(); // L: 470
							} else {
								class152.Login_promptCredentials(false); // L: 473
							}
						}
					} else {
						short var9;
						int var43;
						if (Login.loginIndex == 1) { // L: 477
							while (true) {
								if (!WorldMapSectionType.isKeyDown()) { // L: 478
									var43 = Login.loginBoxCenter - 80; // L: 486
									var9 = 321; // L: 487
									if (var5 == 1 && var56 >= var43 - 75 && var56 <= var43 + 75 && var42 >= var9 - 20 && var42 <= var9 + 20) { // L: 488
										class152.Login_promptCredentials(false); // L: 489
									}

									var43 = Login.loginBoxCenter + 80; // L: 491
									if (var5 == 1 && var56 >= var43 - 75 && var56 <= var43 + 75 && var42 >= var9 - 20 && var42 <= var9 + 20) { // L: 492
										UserComparator6.method2701(0); // L: 493
									}
									break;
								}

								if (SequenceDefinition.field2176 == 84) { // L: 479
									class152.Login_promptCredentials(false); // L: 480
								} else if (SequenceDefinition.field2176 == 13) { // L: 482
									UserComparator6.method2701(0); // L: 483
								}
							}
						} else {
							int var13;
							int var30;
							short var44;
							boolean var47;
							if (Login.loginIndex == 2) { // L: 496
								var44 = 201; // L: 497
								var43 = var44 + 52; // L: 498
								if (var5 == 1 && var42 >= var43 - 12 && var42 < var43 + 2) { // L: 499
									Login.currentLoginField = 0;
								}

								var43 += 15; // L: 500
								if (var5 == 1 && var42 >= var43 - 12 && var42 < var43 + 2) { // L: 501
									Login.currentLoginField = 1;
								}

								var43 += 15; // L: 502
								var44 = 361; // L: 503
								if (KitDefinition.field1860 != null) { // L: 504
									var45 = KitDefinition.field1860.highX / 2; // L: 505
									if (var5 == 1 && var56 >= KitDefinition.field1860.lowX - var45 && var56 <= var45 + KitDefinition.field1860.lowX && var42 >= var44 - 15 && var42 < var44) { // L: 506
										switch(Login.field919) { // L: 507
										case 1:
											HealthBarUpdate.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 515
											UserComparator6.method2701(5); // L: 516
											return; // L: 517
										case 2:
											class238.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 510
										}
									}
								}

								var45 = Login.loginBoxCenter - 80; // L: 522
								var46 = 321; // L: 523
								if (var5 == 1 && var56 >= var45 - 75 && var56 <= var45 + 75 && var42 >= var46 - 20 && var42 <= var46 + 20) { // L: 524
									Login.Login_username = Login.Login_username.trim(); // L: 525
									if (Login.Login_username.length() == 0) { // L: 526
										HealthBarUpdate.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 527
										return; // L: 528
									}

									if (Login.Login_password.length() == 0) { // L: 530
										HealthBarUpdate.setLoginResponseString("", "Please enter your password.", ""); // L: 531
										return; // L: 532
									}

									HealthBarUpdate.setLoginResponseString("", "Connecting to server...", ""); // L: 534
									FriendSystem.method1762(false); // L: 535
									class82.updateGameState(20); // L: 536
									return; // L: 537
								}

								var45 = Login.loginBoxX + 180 + 80; // L: 539
								if (var5 == 1 && var56 >= var45 - 75 && var56 <= var45 + 75 && var42 >= var46 - 20 && var42 <= var46 + 20) { // L: 540
									UserComparator6.method2701(0); // L: 541
									Login.Login_username = ""; // L: 542
									Login.Login_password = ""; // L: 543
									class260.field2908 = 0; // L: 544
									Login.otp = ""; // L: 545
									Login.field893 = true; // L: 546
								}

								var45 = Login.loginBoxCenter + -117; // L: 548
								var46 = 277; // L: 549
								Login.field892 = var56 >= var45 && var56 < var45 + WorldMapCacheName.field2862 && var42 >= var46 && var42 < var46 + HealthBarDefinition.field1864; // L: 550
								if (var5 == 1 && Login.field892) { // L: 551
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 552
									if (!Client.Login_isUsernameRemembered && class260.clientPreferences.method2331() != null) { // L: 553
										class260.clientPreferences.method2330((String)null); // L: 554
									}
								}

								var45 = Login.loginBoxCenter + 24; // L: 557
								var46 = 277; // L: 558
								Login.field918 = var56 >= var45 && var56 < var45 + WorldMapCacheName.field2862 && var42 >= var46 && var42 < var46 + HealthBarDefinition.field1864; // L: 559
								if (var5 == 1 && Login.field918) { // L: 560
									class260.clientPreferences.method2389(!class260.clientPreferences.method2326()); // L: 561
									if (!class260.clientPreferences.method2326()) { // L: 562
										Login.Login_username = ""; // L: 563
										class260.clientPreferences.method2330((String)null); // L: 564
										FloorOverlayDefinition.method3799(); // L: 565
									}
								}

								label1582:
								while (true) {
									Transferable var58;
									do {
										while (true) {
											char var49;
											label1498:
											do {
												while (true) {
													while (WorldMapSectionType.isKeyDown()) { // L: 568
														if (SequenceDefinition.field2176 != 13) { // L: 569
															if (Login.currentLoginField != 0) { // L: 578
																continue label1498;
															}

															class7.method50(Clock.field1797); // L: 579
															if (SequenceDefinition.field2176 == 85 && Login.Login_username.length() > 0) { // L: 580
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (SequenceDefinition.field2176 == 84 || SequenceDefinition.field2176 == 80) { // L: 581
																Login.currentLoginField = 1;
															}

															var49 = Clock.field1797; // L: 583
															var47 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var49) != -1; // L: 585
															if (var47 && Login.Login_username.length() < 320) { // L: 587
																Login.Login_username = Login.Login_username + Clock.field1797;
															}
														} else {
															UserComparator6.method2701(0); // L: 570
															Login.Login_username = ""; // L: 571
															Login.Login_password = ""; // L: 572
															class260.field2908 = 0; // L: 573
															Login.otp = ""; // L: 574
															Login.field893 = true; // L: 575
														}
													}

													return; // L: 1110
												}
											} while(Login.currentLoginField != 1); // L: 589

											if (SequenceDefinition.field2176 == 85 && Login.Login_password.length() > 0) { // L: 590
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 591
											} else if (SequenceDefinition.field2176 == 84 || SequenceDefinition.field2176 == 80) { // L: 593
												Login.currentLoginField = 0; // L: 594
												if (SequenceDefinition.field2176 == 84) { // L: 595
													Login.Login_username = Login.Login_username.trim(); // L: 596
													if (Login.Login_username.length() == 0) { // L: 597
														HealthBarUpdate.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 598
														return; // L: 599
													}

													if (Login.Login_password.length() == 0) { // L: 601
														HealthBarUpdate.setLoginResponseString("", "Please enter your password.", ""); // L: 602
														return; // L: 603
													}

													HealthBarUpdate.setLoginResponseString("", "Connecting to server...", ""); // L: 605
													FriendSystem.method1762(false); // L: 606
													class82.updateGameState(20); // L: 607
													return; // L: 608
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && SequenceDefinition.field2176 == 67) { // L: 611
												Clipboard var57 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 612
												var58 = var57.getContents(class329.client); // L: 613
												var13 = 20 - Login.Login_password.length(); // L: 614
												break;
											}

											var49 = Clock.field1797; // L: 664
											if ((var49 < ' ' || var49 >= 127) && (var49 <= 127 || var49 >= 160) && (var49 <= 160 || var49 > 255)) { // L: 666
												label1733: {
													if (var49 != 0) { // L: 670
														char[] var59 = class341.cp1252AsciiExtension; // L: 672

														for (var30 = 0; var30 < var59.length; ++var30) { // L: 673
															char var15 = var59[var30]; // L: 674
															if (var49 == var15) { // L: 676
																var47 = true; // L: 677
																break label1733; // L: 678
															}
														}
													}

													var47 = false; // L: 684
												}
											} else {
												var47 = true; // L: 667
											}

											if (var47) { // L: 686
												char var61 = Clock.field1797; // L: 688
												boolean var50 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var61) != -1; // L: 690
												if (var50 && Login.Login_password.length() < 20) { // L: 692 693
													Login.Login_password = Login.Login_password + Clock.field1797; // L: 694
												}
											}
										}
									} while(var13 <= 0); // L: 615

									try {
										String var14 = (String)var58.getTransferData(DataFlavor.stringFlavor); // L: 617
										int var51 = Math.min(var13, var14.length()); // L: 618
										int var52 = 0;

										while (true) {
											if (var52 >= var51) {
												Login.Login_password = Login.Login_password + var14.substring(0, var51); // L: 656
												continue label1582;
											}

											char var54 = var14.charAt(var52); // L: 622
											boolean var17;
											if (var54 >= ' ' && var54 < 127 || var54 > 127 && var54 < 160 || var54 > 160 && var54 <= 255) { // L: 624
												var17 = true; // L: 625
											} else {
												label1751: {
													if (var54 != 0) { // L: 628
														char[] var19 = class341.cp1252AsciiExtension; // L: 630

														for (int var20 = 0; var20 < var19.length; ++var20) { // L: 631
															char var21 = var19[var20]; // L: 632
															if (var54 == var21) { // L: 634
																var17 = true; // L: 635
																break label1751; // L: 636
															}
														}
													}

													var17 = false; // L: 642
												}
											}

											if (!var17) { // L: 644
												break;
											}

											char var55 = var14.charAt(var52); // L: 646
											boolean var28 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var55) != -1; // L: 648
											if (!var28) { // L: 650
												break;
											}

											++var52; // L: 619
										}

										UserComparator6.method2701(3); // L: 652
										return; // L: 653
									} catch (UnsupportedFlavorException var39) { // L: 658
									} catch (IOException var40) { // L: 659
									}
								}
							} else if (Login.loginIndex == 3) { // L: 703
								var43 = Login.loginBoxX + 180; // L: 704
								var9 = 276; // L: 705
								if (var5 == 1 && var56 >= var43 - 75 && var56 <= var43 + 75 && var42 >= var9 - 20 && var42 <= var9 + 20) { // L: 706
									WorldMapID.method4981(false); // L: 707
								}

								var43 = Login.loginBoxX + 180; // L: 709
								var9 = 326; // L: 710
								if (var5 == 1 && var56 >= var43 - 75 && var56 <= var43 + 75 && var42 >= var9 - 20 && var42 <= var9 + 20) { // L: 711
									HealthBarUpdate.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 712
									UserComparator6.method2701(5); // L: 713
									return; // L: 714
								}
							} else {
								int var11;
								if (Login.loginIndex == 4) { // L: 717
									var43 = Login.loginBoxX + 180 - 80; // L: 718
									var9 = 321; // L: 719
									if (var5 == 1 && var56 >= var43 - 75 && var56 <= var43 + 75 && var42 >= var9 - 20 && var42 <= var9 + 20) { // L: 720
										Login.otp.trim(); // L: 721
										if (Login.otp.length() != 6) { // L: 722
											HealthBarUpdate.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 723
											return; // L: 724
										}

										class260.field2908 = Integer.parseInt(Login.otp); // L: 726
										Login.otp = ""; // L: 727
										FriendSystem.method1762(true); // L: 728
										HealthBarUpdate.setLoginResponseString("", "Connecting to server...", ""); // L: 729
										class82.updateGameState(20); // L: 730
										return; // L: 731
									}

									if (var5 == 1 && var56 >= Login.loginBoxX + 180 - 9 && var56 <= Login.loginBoxX + 180 + 130 && var42 >= 263 && var42 <= 296) { // L: 733
										Login.field893 = !Login.field893; // L: 734
									}

									if (var5 == 1 && var56 >= Login.loginBoxX + 180 - 34 && var56 <= Login.loginBoxX + 34 + 180 && var42 >= 351 && var42 <= 363) { // L: 736
										class238.openURL(ScriptFrame.method1055("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 737
									}

									var43 = Login.loginBoxX + 180 + 80; // L: 739
									if (var5 == 1 && var56 >= var43 - 75 && var56 <= var43 + 75 && var42 >= var9 - 20 && var42 <= var9 + 20) { // L: 740
										UserComparator6.method2701(0); // L: 741
										Login.Login_username = ""; // L: 742
										Login.Login_password = ""; // L: 743
										class260.field2908 = 0; // L: 744
										Login.otp = ""; // L: 745
									}

									while (WorldMapSectionType.isKeyDown()) { // L: 747
										boolean var10 = false; // L: 748

										for (var11 = 0; var11 < "1234567890".length(); ++var11) { // L: 749
											if (Clock.field1797 == "1234567890".charAt(var11)) { // L: 750
												var10 = true; // L: 751
												break; // L: 752
											}
										}

										if (SequenceDefinition.field2176 == 13) { // L: 755
											UserComparator6.method2701(0); // L: 756
											Login.Login_username = ""; // L: 757
											Login.Login_password = ""; // L: 758
											class260.field2908 = 0; // L: 759
											Login.otp = ""; // L: 760
										} else {
											if (SequenceDefinition.field2176 == 85 && Login.otp.length() > 0) { // L: 763
												Login.otp = Login.otp.substring(0, Login.otp.length() - 1);
											}

											if (SequenceDefinition.field2176 == 84) { // L: 764
												Login.otp.trim(); // L: 765
												if (Login.otp.length() != 6) { // L: 766
													HealthBarUpdate.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 767
													return; // L: 768
												}

												class260.field2908 = Integer.parseInt(Login.otp); // L: 770
												Login.otp = ""; // L: 771
												FriendSystem.method1762(true); // L: 772
												HealthBarUpdate.setLoginResponseString("", "Connecting to server...", ""); // L: 773
												class82.updateGameState(20); // L: 774
												return; // L: 775
											}

											if (var10 && Login.otp.length() < 6) { // L: 777
												Login.otp = Login.otp + Clock.field1797;
											}
										}
									}
								} else {
									int var12;
									if (Login.loginIndex == 5) { // L: 781
										var43 = Login.loginBoxX + 180 - 80; // L: 782
										var9 = 321; // L: 783
										if (var5 == 1 && var56 >= var43 - 75 && var56 <= var43 + 75 && var42 >= var9 - 20 && var42 <= var9 + 20) { // L: 784
											MouseHandler.method597(); // L: 785
											return; // L: 786
										}

										var43 = Login.loginBoxX + 180 + 80; // L: 788
										if (var5 == 1 && var56 >= var43 - 75 && var56 <= var43 + 75 && var42 >= var9 - 20 && var42 <= var9 + 20) { // L: 789
											class152.Login_promptCredentials(true); // L: 790
										}

										var46 = 361; // L: 792
										if (WorldMapSectionType.field2781 != null) { // L: 793
											var11 = WorldMapSectionType.field2781.highX / 2; // L: 794
											if (var5 == 1 && var56 >= WorldMapSectionType.field2781.lowX - var11 && var56 <= var11 + WorldMapSectionType.field2781.lowX && var42 >= var46 - 15 && var42 < var46) { // L: 795
												class238.openURL(ScriptFrame.method1055("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 796
											}
										}

										while (WorldMapSectionType.isKeyDown()) { // L: 799
											var47 = false; // L: 800

											for (var12 = 0; var12 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var12) { // L: 801
												if (Clock.field1797 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var12)) { // L: 802
													var47 = true; // L: 803
													break; // L: 804
												}
											}

											if (SequenceDefinition.field2176 == 13) { // L: 807
												class152.Login_promptCredentials(true); // L: 808
											} else {
												if (SequenceDefinition.field2176 == 85 && Login.Login_username.length() > 0) { // L: 811
													Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
												}

												if (SequenceDefinition.field2176 == 84) { // L: 812
													MouseHandler.method597(); // L: 813
													return; // L: 814
												}

												if (var47 && Login.Login_username.length() < 320) { // L: 816
													Login.Login_username = Login.Login_username + Clock.field1797;
												}
											}
										}
									} else if (Login.loginIndex != 6) { // L: 820
										if (Login.loginIndex == 7) { // L: 831
											if (FriendsChatManager.field4305 && !Client.onMobile) { // L: 832
												var43 = Login.loginBoxCenter - 150; // L: 833
												var45 = var43 + 40 + 240 + 25; // L: 834
												var46 = 231; // L: 835
												var11 = var46 + 40; // L: 836
												if (var5 == 1 && var56 >= var43 && var56 <= var45 && var42 >= var46 && var42 <= var11) { // L: 837
													var13 = var43; // L: 839
													var30 = 0;

													while (true) {
														if (var30 >= 8) {
															var12 = 0; // L: 849
															break;
														}

														if (var56 <= var13 + 30) { // L: 842
															var12 = var30; // L: 843
															break; // L: 844
														}

														var13 += 30; // L: 846
														var13 += var30 != 1 && var30 != 3 ? 5 : 20; // L: 847
														++var30; // L: 841
													}

													Login.field912 = var12; // L: 851
												}

												var12 = Login.loginBoxX + 180 - 80; // L: 853
												short var48 = 321; // L: 854
												boolean var16;
												boolean var18;
												Date var31;
												java.util.Calendar var33;
												Date var34;
												boolean var60;
												if (var5 == 1 && var56 >= var12 - 75 && var56 <= var12 + 75 && var42 >= var48 - 20 && var42 <= var48 + 20) { // L: 855
													label1377: {
														try {
															var31 = SecureRandomCallable.method2118(); // L: 860
														} catch (ParseException var38) { // L: 862
															PendingSpawn.method2249("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 863
															var60 = false; // L: 864
															break label1377; // L: 865
														}

														if (var31 == null) { // L: 867
															var60 = false; // L: 868
														} else {
															var33 = java.util.Calendar.getInstance(); // L: 873
															var33.set(1, var33.get(1) - 13); // L: 874
															var33.set(5, var33.get(5) + 1); // L: 875
															var33.set(11, 0); // L: 876
															var33.set(12, 0); // L: 877
															var33.set(13, 0); // L: 878
															var33.set(14, 0); // L: 879
															var34 = var33.getTime(); // L: 880
															var16 = var31.before(var34); // L: 881
															var18 = class388.method7052(var31); // L: 884
															if (!var18) { // L: 885
																PendingSpawn.method2249("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 886
																var60 = false; // L: 887
															} else {
																if (!var16) { // L: 890
																	Projectile.field950 = 8388607; // L: 891
																} else {
																	Projectile.field950 = (int)(var31.getTime() / 86400000L - 11745L); // L: 894
																}

																var60 = true; // L: 896
															}
														}
													}

													if (var60) { // L: 899
														class82.updateGameState(50); // L: 900
														return; // L: 901
													}
												}

												var12 = Login.loginBoxX + 180 + 80; // L: 904
												if (var5 == 1 && var56 >= var12 - 75 && var56 <= var12 + 75 && var42 >= var48 - 20 && var42 <= var48 + 20) { // L: 905
													Login.field901 = new String[8]; // L: 906
													class152.Login_promptCredentials(true); // L: 907
												}

												while (WorldMapSectionType.isKeyDown()) { // L: 909
													if (SequenceDefinition.field2176 == 101) { // L: 910
														Login.field901[Login.field912] = null; // L: 911
													}

													if (SequenceDefinition.field2176 == 85) { // L: 913
														if (Login.field901[Login.field912] == null && Login.field912 > 0) { // L: 914
															--Login.field912; // L: 915
														}

														Login.field901[Login.field912] = null; // L: 917
													}

													if (Clock.field1797 >= '0' && Clock.field1797 <= '9') { // L: 919
														Login.field901[Login.field912] = "" + Clock.field1797; // L: 920
														if (Login.field912 < 7) { // L: 921
															++Login.field912; // L: 922
														}
													}

													if (SequenceDefinition.field2176 == 84) { // L: 925
														label1313: {
															try {
																var31 = SecureRandomCallable.method2118(); // L: 930
															} catch (ParseException var37) { // L: 932
																PendingSpawn.method2249("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 933
																var60 = false; // L: 934
																break label1313; // L: 935
															}

															if (var31 == null) { // L: 937
																var60 = false; // L: 938
															} else {
																var33 = java.util.Calendar.getInstance(); // L: 943
																var33.set(1, var33.get(1) - 13); // L: 944
																var33.set(5, var33.get(5) + 1); // L: 945
																var33.set(11, 0); // L: 946
																var33.set(12, 0); // L: 947
																var33.set(13, 0); // L: 948
																var33.set(14, 0); // L: 949
																var34 = var33.getTime(); // L: 950
																var16 = var31.before(var34); // L: 951
																var18 = class388.method7052(var31); // L: 954
																if (!var18) { // L: 955
																	PendingSpawn.method2249("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 956
																	var60 = false; // L: 957
																} else {
																	if (!var16) { // L: 960
																		Projectile.field950 = 8388607; // L: 961
																	} else {
																		Projectile.field950 = (int)(var31.getTime() / 86400000L - 11745L); // L: 964
																	}

																	var60 = true; // L: 966
																}
															}
														}

														if (var60) { // L: 969
															class82.updateGameState(50); // L: 970
														}

														return; // L: 972
													}
												}
											} else {
												var43 = Login.loginBoxX + 180 - 80; // L: 977
												var9 = 321; // L: 978
												if (var5 == 1 && var56 >= var43 - 75 && var56 <= var43 + 75 && var42 >= var9 - 20 && var42 <= var9 + 20) { // L: 979
													class238.openURL(ScriptFrame.method1055("secure", true) + "m=dob/set_dob.ws", true, false); // L: 980
													HealthBarUpdate.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 981
													UserComparator6.method2701(6); // L: 982
													return; // L: 983
												}

												var43 = Login.loginBoxX + 180 + 80; // L: 985
												if (var5 == 1 && var56 >= var43 - 75 && var56 <= var43 + 75 && var42 >= var9 - 20 && var42 <= var9 + 20) { // L: 986
													class152.Login_promptCredentials(true); // L: 987
												}
											}
										} else if (Login.loginIndex == 8) { // L: 991
											var43 = Login.loginBoxX + 180 - 80; // L: 992
											var9 = 321; // L: 993
											if (var5 == 1 && var56 >= var43 - 75 && var56 <= var43 + 75 && var42 >= var9 - 20 && var42 <= var9 + 20) { // L: 994
												class238.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 995
												HealthBarUpdate.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 996
												UserComparator6.method2701(6); // L: 997
												return; // L: 998
											}

											var43 = Login.loginBoxX + 180 + 80; // L: 1000
											if (var5 == 1 && var56 >= var43 - 75 && var56 <= var43 + 75 && var42 >= var9 - 20 && var42 <= var9 + 20) { // L: 1001
												class152.Login_promptCredentials(true); // L: 1002
											}
										} else if (Login.loginIndex == 9) { // L: 1005
											var43 = Login.loginBoxX + 180; // L: 1006
											var9 = 311; // L: 1007
											if (SequenceDefinition.field2176 == 84 || SequenceDefinition.field2176 == 13 || var5 == 1 && var56 >= var43 - 75 && var56 <= var43 + 75 && var42 >= var9 - 20 && var42 <= var9 + 20) { // L: 1008
												WorldMapID.method4981(false); // L: 1009
											}
										} else if (Login.loginIndex == 10) { // L: 1012
											var43 = Login.loginBoxX + 180; // L: 1013
											var9 = 209; // L: 1014
											if (SequenceDefinition.field2176 == 84 || var5 == 1 && var56 >= var43 - 109 && var56 <= var43 + 109 && var42 >= var9 && var42 <= var9 + 68) { // L: 1015
												HealthBarUpdate.setLoginResponseString("", "Connecting to server...", ""); // L: 1016
												Client.field741 = class447.field4761; // L: 1017
												FriendSystem.method1762(false); // L: 1018
												class82.updateGameState(20); // L: 1019
											}
										} else if (Login.loginIndex == 12) { // L: 1022
											var43 = Login.loginBoxCenter; // L: 1023
											var9 = 233; // L: 1024
											Bounds var35 = var1.method6408(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var43, var9); // L: 1025
											Bounds var26 = var1.method6408(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var43, var9); // L: 1026
											Bounds var27 = var1.method6408(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var43, var9); // L: 1027
											var45 = var9 + 17; // L: 1028
											Bounds var29 = var1.method6408(0, 34, "<col=ffd200>agreement (EULA)</col>.", var43, var45); // L: 1029
											if (var5 == 1) { // L: 1030
												if (var35.method6950(var56, var42)) { // L: 1031
													class238.openURL("https://www.jagex.com/terms", true, false); // L: 1032
												} else if (var26.method6950(var56, var42)) { // L: 1034
													class238.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1035
												} else if (var27.method6950(var56, var42) || var29.method6950(var56, var42)) { // L: 1037
													class238.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 1038
												}
											}

											var43 = Login.loginBoxCenter - 80; // L: 1041
											var9 = 311; // L: 1042
											if (var5 == 1 && var56 >= var43 - 75 && var56 <= var43 + 75 && var42 >= var9 - 20 && var42 <= var9 + 20) { // L: 1043
												FaceNormal.method4304(); // L: 1044
												WorldMapID.method4981(true); // L: 1045
											}

											var43 = Login.loginBoxCenter + 80; // L: 1047
											if (var5 == 1 && var56 >= var43 - 75 && var56 <= var43 + 75 && var42 >= var9 - 20 && var42 <= var9 + 20) { // L: 1048
												Login.loginIndex = 13; // L: 1049
											}
										} else if (Login.loginIndex == 13) { // L: 1052
											var43 = Login.loginBoxCenter; // L: 1053
											var9 = 321; // L: 1054
											if (var5 == 1 && var56 >= var43 - 75 && var56 <= var43 + 75 && var42 >= var9 - 20 && var42 <= var9 + 20) { // L: 1055
												WorldMapID.method4981(true); // L: 1056
											}
										} else if (Login.loginIndex == 14) { // L: 1059
											String var36 = ""; // L: 1060
											switch(Login.field906) { // L: 1061
											case 0:
												var36 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans"; // L: 1066
												break; // L: 1067
											case 1:
												var36 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked"; // L: 1069
												break; // L: 1070
											case 2:
												var36 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance"; // L: 1063
												break; // L: 1064
											default:
												class152.Login_promptCredentials(false); // L: 1072
											}

											var45 = Login.loginBoxX + 180; // L: 1075
											var46 = 276; // L: 1076
											if (var5 == 1 && var56 >= var45 - 75 && var56 <= var45 + 75 && var42 >= var46 - 20 && var42 <= var46 + 20) { // L: 1077
												class238.openURL(var36, true, false); // L: 1078
												HealthBarUpdate.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 1079
												UserComparator6.method2701(6); // L: 1080
												return; // L: 1081
											}

											var45 = Login.loginBoxX + 180; // L: 1083
											var46 = 326; // L: 1084
											if (var5 == 1 && var56 >= var45 - 75 && var56 <= var45 + 75 && var42 >= var46 - 20 && var42 <= var46 + 20) { // L: 1085
												class152.Login_promptCredentials(false); // L: 1086
											}
										} else if (Login.loginIndex == 24) { // L: 1089
											var43 = Login.loginBoxX + 180; // L: 1090
											var9 = 301; // L: 1091
											if (var5 == 1 && var56 >= var43 - 75 && var56 <= var43 + 75 && var42 >= var9 - 20 && var42 <= var9 + 20) { // L: 1092
												WorldMapID.method4981(false); // L: 1093
											}
										} else if (Login.loginIndex == 26) { // L: 1096
											var43 = Login.loginBoxX + 180 - 80; // L: 1097
											var9 = 321; // L: 1098
											if (var5 == 1 && var56 >= var43 - 75 && var56 <= var43 + 75 && var42 >= var9 - 20 && var42 <= var9 + 20) { // L: 1099
												class238.openURL(ScriptFrame.method1055("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1100
												HealthBarUpdate.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 1101
												UserComparator6.method2701(6); // L: 1102
												return; // L: 1103
											}

											var43 = Login.loginBoxX + 180 + 80; // L: 1105
											if (var5 == 1 && var56 >= var43 - 75 && var56 <= var43 + 75 && var42 >= var9 - 20 && var42 <= var9 + 20) { // L: 1106
												class152.Login_promptCredentials(true); // L: 1107
											}
										}
									} else {
										while (true) {
											do {
												if (!WorldMapSectionType.isKeyDown()) { // L: 821
													var44 = 321; // L: 826
													if (var5 == 1 && var42 >= var44 - 20 && var42 <= var44 + 20) { // L: 827
														class152.Login_promptCredentials(true); // L: 828
													}

													return;
												}
											} while(SequenceDefinition.field2176 != 84 && SequenceDefinition.field2176 != 13); // L: 822

											class152.Login_promptCredentials(true); // L: 823
										}
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 369

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "967533715"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 64
		if (var1 == null) { // L: 65
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 66 67
		}
	}
}
