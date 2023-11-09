import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Loz;Loz;I)I",
		garbageValue = "456180240"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1); // L: 28
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 36
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 32
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldh;",
		garbageValue = "1291618963"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = (var1 << 8) + var0; // L: 40
		Script var5 = ModeWhere.method6961(var3, var0); // L: 43
		if (var5 != null) { // L: 44
			return var5; // L: 45
		} else {
			int var6 = (-3 - var2 << 8) + var0; // L: 49
			var5 = ModeWhere.method6961(var6, var0); // L: 52
			if (var5 != null) { // L: 53
				return var5; // L: 54
			} else {
				int var7 = var0 + -512; // L: 58
				var5 = ModeWhere.method6961(var7, var0); // L: 61
				return var5 != null ? var5 : null; // L: 62 65
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lbm;Lpi;Lpi;I)V",
		garbageValue = "-567709199"
	)
	static void method6860(GameEngine var0, Font var1, Font var2) {
		int var5;
		boolean var11;
		int var35;
		int var36;
		boolean var45;
		if (Login.worldSelectOpen) { // L: 265
			class212 var34 = AbstractWorldMapData.method5477(); // L: 267

			while (true) {
				if (!var34.method4124()) { // L: 268
					if (MouseHandler.MouseHandler_lastButton != 1 && (class183.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) { // L: 284
						break;
					}

					int var4 = Login.xPadding + 280; // L: 285
					if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 286
						class153.changeWorldSelectSorting(0, 0); // L: 287
						break; // L: 288
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 290
						class153.changeWorldSelectSorting(0, 1); // L: 291
						break; // L: 292
					}

					var5 = Login.xPadding + 390; // L: 294
					if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 295
						class153.changeWorldSelectSorting(1, 0); // L: 296
						break; // L: 297
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 299
						class153.changeWorldSelectSorting(1, 1); // L: 300
						break; // L: 301
					}

					var35 = Login.xPadding + 500; // L: 303
					if (MouseHandler.MouseHandler_lastPressedX >= var35 && MouseHandler.MouseHandler_lastPressedX <= var35 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 304
						class153.changeWorldSelectSorting(2, 0); // L: 305
						break; // L: 306
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var35 + 15 && MouseHandler.MouseHandler_lastPressedX <= var35 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 308
						class153.changeWorldSelectSorting(2, 1); // L: 309
						break; // L: 310
					}

					var36 = Login.xPadding + 610; // L: 312
					if (MouseHandler.MouseHandler_lastPressedX >= var36 && MouseHandler.MouseHandler_lastPressedX <= var36 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 313
						class153.changeWorldSelectSorting(3, 0); // L: 314
						break; // L: 315
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var36 + 15 && MouseHandler.MouseHandler_lastPressedX <= var36 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 317
						class153.changeWorldSelectSorting(3, 1); // L: 318
						break; // L: 319
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 321
						WorldMapData_1.method5372(); // L: 322
						break; // L: 323
					}

					if (Login.hoveredWorldIndex != -1) { // L: 325
						World var37 = class176.World_worlds[Login.hoveredWorldIndex]; // L: 326
						if (var37.isDeadman()) { // L: 327
							var37.field847 = "beta"; // L: 328
						}

						var45 = false; // L: 330
						if (var37.properties != Client.worldProperties) { // L: 331
							boolean var46 = (Client.worldProperties & class510.field5077.rsOrdinal()) != 0; // L: 332
							var11 = var37.isDeadman(); // L: 333
							if (var46 && !var11 || !var46 && var11) { // L: 334
								var45 = true; // L: 335
							}
						}

						ModeWhere.changeWorld(var37); // L: 338
						WorldMapData_1.method5372(); // L: 339
						if (var45) { // L: 340
							class415.method7708(); // L: 341
						}
					} else {
						if (Login.worldSelectPage > 0 && class85.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class85.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class177.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class177.canvasHeight / 2 + 50) { // L: 345
							--Login.worldSelectPage; // L: 346
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && Skeleton.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class113.canvasWidth - Skeleton.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class113.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class177.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class177.canvasHeight / 2 + 50) { // L: 348
							++Login.worldSelectPage; // L: 349
						}
					}
					break;
				}

				if (var34.field2369 == 13) { // L: 269
					WorldMapData_1.method5372(); // L: 270
					break; // L: 271
				}

				if (var34.field2369 == 96) { // L: 273
					if (Login.worldSelectPage > 0 && class85.worldSelectLeftSprite != null) { // L: 274
						--Login.worldSelectPage; // L: 275
					}
				} else if (var34.field2369 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && Skeleton.worldSelectRightSprite != null) { // L: 278 279
					++Login.worldSelectPage; // L: 280
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class183.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 355
				class449.clientPreferences.method2474(!class449.clientPreferences.method2484()); // L: 356
				if (!class449.clientPreferences.method2484()) { // L: 357
					ArrayList var3 = new ArrayList(); // L: 358
					var3.add(new class317(class385.archive11, "scape main", "", 255, false)); // L: 359
					class53.method1097(var3, 0, 0, 0, 100, false); // L: 360
				} else {
					Script.method2180(0, 0); // L: 362
				}

				UrlRequester.method2829(); // L: 363
			}

			if (Client.gameState != 5) { // L: 365
				if (-1L == Login.field955) { // L: 366
					Login.field955 = GameEngine.method661() + 1000L; // L: 367
				}

				long var23 = GameEngine.method661(); // L: 369
				if (ChatChannel.method2190() && -1L == Login.field966) { // L: 370 371
					Login.field966 = var23; // L: 372
					if (Login.field966 > Login.field955) { // L: 373
						Login.field955 = Login.field966; // L: 374
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 378
					if (ClanChannelMember.clientLanguage == Language.Language_EN) { // L: 379
						if (MouseHandler.MouseHandler_lastButton == 1 || !class183.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 380
							var5 = Login.xPadding + 5; // L: 381
							short var6 = 463; // L: 382
							byte var7 = 100; // L: 383
							byte var25 = 35; // L: 384
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var7 + var5 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var25 + var6) { // L: 385
								if (class125.loadWorlds()) { // L: 387
									Login.worldSelectOpen = true; // L: 388
									Login.worldSelectPage = 0; // L: 389
									Login.worldSelectPagesCount = 0; // L: 390
								}

								return; // L: 393
							}
						}

						if (WorldMapLabelSize.World_request != null) { // L: 396
							class53.method1095();
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton; // L: 398
					var35 = MouseHandler.MouseHandler_lastPressedX; // L: 399
					var36 = MouseHandler.MouseHandler_lastPressedY; // L: 400
					if (var5 == 0) { // L: 401
						var35 = MouseHandler.MouseHandler_x; // L: 402
						var36 = MouseHandler.MouseHandler_y; // L: 403
					}

					if (!class183.mouseCam && var5 == 4) { // L: 405
						var5 = 1;
					}

					class212 var8 = AbstractWorldMapData.method5477(); // L: 406
					short var39;
					int var40;
					if (Login.loginIndex == 0) { // L: 407
						var45 = false; // L: 408

						while (var8.method4124()) { // L: 409
							if (var8.field2369 == 84) { // L: 410
								var45 = true; // L: 411
							}
						}

						var40 = class452.loginBoxCenter - 80; // L: 414
						var39 = 291; // L: 415
						if (var5 == 1 && var35 >= var40 - 75 && var35 <= var40 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20) { // L: 416
							class30.openURL(HorizontalAlignment.method3682("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 417
						}

						var40 = class452.loginBoxCenter + 80; // L: 419
						if (var5 == 1 && var35 >= var40 - 75 && var35 <= var40 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20 || var45) { // L: 420
							if ((Client.worldProperties & class510.field5086.rsOrdinal()) != 0) { // L: 421
								Login.Login_response0 = ""; // L: 422
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 423
								Login.Login_response2 = "Your normal account will not be affected."; // L: 424
								Login.Login_response3 = ""; // L: 425
								PcmPlayer.method838(1); // L: 426
								ObjectComposition.method3936(); // L: 427
							} else if ((Client.worldProperties & class510.field5071.rsOrdinal()) != 0) { // L: 429
								if ((Client.worldProperties & class510.field5092.rsOrdinal()) != 0) { // L: 430
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 431
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 432
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 433
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 436
									Login.Login_response2 = "Players can attack each other"; // L: 437
									Login.Login_response3 = "almost everywhere."; // L: 438
								}

								Login.Login_response0 = "Warning!"; // L: 440
								PcmPlayer.method838(1); // L: 441
								ObjectComposition.method3936(); // L: 442
							} else if ((Client.worldProperties & class510.field5092.rsOrdinal()) != 0) { // L: 444
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 445
								Login.Login_response2 = "The Protect Item prayer will"; // L: 446
								Login.Login_response3 = "not work on this world."; // L: 447
								Login.Login_response0 = "Warning!"; // L: 448
								PcmPlayer.method838(1); // L: 449
								ObjectComposition.method3936(); // L: 450
							} else {
								WorldMapAreaData.Login_promptCredentials(false); // L: 453
							}
						}
					} else {
						int var9;
						short var10;
						if (Login.loginIndex == 1) { // L: 457
							while (true) {
								if (!var8.method4124()) { // L: 458
									var9 = class452.loginBoxCenter - 80; // L: 466
									var10 = 321; // L: 467
									if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) { // L: 468
										WorldMapAreaData.Login_promptCredentials(false); // L: 469
									}

									var9 = class452.loginBoxCenter + 80; // L: 471
									if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) { // L: 472
										PcmPlayer.method838(0); // L: 473
									}
									break;
								}

								if (var8.field2369 == 84) { // L: 459
									WorldMapAreaData.Login_promptCredentials(false); // L: 460
								} else if (var8.field2369 == 13) { // L: 462
									PcmPlayer.method838(0); // L: 463
								}
							}
						} else {
							int var14;
							int var29;
							short var38;
							boolean var47;
							if (Login.loginIndex == 2) { // L: 476
								var38 = 201; // L: 477
								var9 = var38 + 52; // L: 478
								if (var5 == 1 && var36 >= var9 - 12 && var36 < var9 + 2) { // L: 479
									Login.currentLoginField = 0;
								}

								var9 += 15; // L: 480
								if (var5 == 1 && var36 >= var9 - 12 && var36 < var9 + 2) { // L: 481
									Login.currentLoginField = 1;
								}

								var9 += 15; // L: 482
								var38 = 361; // L: 483
								if (class102.field1343 != null) { // L: 484
									var40 = class102.field1343.highX / 2; // L: 485
									if (var5 == 1 && var35 >= class102.field1343.lowX - var40 && var35 <= var40 + class102.field1343.lowX && var36 >= var38 - 15 && var36 < var38) { // L: 486
										switch(Login.field943) { // L: 487
										case 1:
											class30.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false); // L: 495
											return; // L: 496
										case 2:
											class30.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 490
										}
									}
								}

								var40 = class452.loginBoxCenter - 80; // L: 501
								var39 = 321; // L: 502
								if (var5 == 1 && var35 >= var40 - 75 && var35 <= var40 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20) { // L: 503
									Login.Login_username = Login.Login_username.trim(); // L: 504
									if (Login.Login_username.length() == 0) { // L: 505
										class318.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 506
										return; // L: 507
									}

									if (Login.Login_password.length() == 0) { // L: 509
										class318.setLoginResponseString("", "Please enter your password.", ""); // L: 510
										return; // L: 511
									}

									class318.setLoginResponseString("", "Connecting to server...", ""); // L: 513
									PendingSpawn.method2368(false); // L: 514
									class317.method6014(20); // L: 515
									return; // L: 516
								}

								var40 = Login.loginBoxX + 180 + 80; // L: 518
								if (var5 == 1 && var35 >= var40 - 75 && var35 <= var40 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20) { // L: 519
									PcmPlayer.method838(0); // L: 520
									Login.Login_username = ""; // L: 521
									Login.Login_password = ""; // L: 522
									class503.field5039 = 0; // L: 523
									class369.otp = ""; // L: 524
									Login.field956 = true; // L: 525
								}

								var40 = class452.loginBoxCenter + -117; // L: 527
								var39 = 277; // L: 528
								Login.field935 = var35 >= var40 && var35 < var40 + class136.field1615 && var36 >= var39 && var36 < var39 + Nameable.field4657; // L: 529
								if (var5 == 1 && Login.field935) { // L: 530
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 531
									if (!Client.Login_isUsernameRemembered && class449.clientPreferences.method2466() != null) { // L: 532
										class449.clientPreferences.method2465((String)null); // L: 533
									}
								}

								var40 = class452.loginBoxCenter + 24; // L: 536
								var39 = 277; // L: 537
								Login.field963 = var35 >= var40 && var35 < var40 + class136.field1615 && var36 >= var39 && var36 < var39 + Nameable.field4657; // L: 538
								if (var5 == 1 && Login.field963) { // L: 539
									class449.clientPreferences.method2494(!class449.clientPreferences.method2454()); // L: 540
									if (!class449.clientPreferences.method2454()) { // L: 541
										Login.Login_username = ""; // L: 542
										class449.clientPreferences.method2465((String)null); // L: 543
										ObjectComposition.method3936(); // L: 544
									}
								}

								while (true) {
									Transferable var42;
									do {
										while (true) {
											label1508:
											do {
												while (true) {
													while (var8.method4124()) { // L: 547
														if (var8.field2369 != 13) { // L: 548
															if (Login.currentLoginField != 0) { // L: 557
																continue label1508;
															}

															class148.method3144(var8.field2356); // L: 558
															if (var8.field2369 == 85 && Login.Login_username.length() > 0) { // L: 559
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var8.field2369 == 84 || var8.field2369 == 80) { // L: 560
																Login.currentLoginField = 1;
															}

															if (class157.method3256(var8.field2356) && Login.Login_username.length() < 320) { // L: 561
																Login.Login_username = Login.Login_username + var8.field2356;
															}
														} else {
															PcmPlayer.method838(0); // L: 549
															Login.Login_username = ""; // L: 550
															Login.Login_password = ""; // L: 551
															class503.field5039 = 0; // L: 552
															class369.otp = ""; // L: 553
															Login.field956 = true; // L: 554
														}
													}

													return; // L: 1000
												}
											} while(Login.currentLoginField != 1); // L: 563

											if (var8.field2369 == 85 && Login.Login_password.length() > 0) { // L: 564
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 565
											} else if (var8.field2369 == 84 || var8.field2369 == 80) { // L: 567
												Login.currentLoginField = 0; // L: 568
												if (var8.field2369 == 84) { // L: 569
													Login.Login_username = Login.Login_username.trim(); // L: 570
													if (Login.Login_username.length() == 0) { // L: 571
														class318.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 572
														return; // L: 573
													}

													if (Login.Login_password.length() == 0) { // L: 575
														class318.setLoginResponseString("", "Please enter your password.", ""); // L: 576
														return; // L: 577
													}

													class318.setLoginResponseString("", "Connecting to server...", ""); // L: 579
													PendingSpawn.method2368(false); // L: 580
													class317.method6014(20); // L: 581
													return; // L: 582
												}
											}

											if ((var8.method4120(82) || var8.method4120(87)) && var8.field2369 == 67) { // L: 585
												Clipboard var41 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 586
												var42 = var41.getContents(class219.client); // L: 587
												var14 = 20 - Login.Login_password.length(); // L: 588
												break;
											}

											char var48 = var8.field2356; // L: 630
											if ((var48 < ' ' || var48 >= 127) && (var48 <= 127 || var48 >= 160) && (var48 <= 160 || var48 > 255)) { // L: 632
												label1726: {
													if (var48 != 0) { // L: 636
														char[] var49 = class384.cp1252AsciiExtension; // L: 638

														for (var29 = 0; var29 < var49.length; ++var29) { // L: 639
															char var16 = var49[var29]; // L: 640
															if (var16 == var48) { // L: 642
																var47 = true; // L: 643
																break label1726; // L: 644
															}
														}
													}

													var47 = false; // L: 650
												}
											} else {
												var47 = true; // L: 633
											}

											if (var47 && class157.method3256(var8.field2356) && Login.Login_password.length() < 20) { // L: 652
												Login.Login_password = Login.Login_password + var8.field2356; // L: 653
											}
										}
									} while(var14 <= 0); // L: 589

									try {
										String var15 = (String)var42.getTransferData(DataFlavor.stringFlavor); // L: 591
										int var44 = Math.min(var14, var15.length()); // L: 592

										for (int var17 = 0; var17 < var44; ++var17) { // L: 593
											char var19 = var15.charAt(var17); // L: 595
											boolean var18;
											if ((var19 < ' ' || var19 >= 127) && (var19 <= 127 || var19 >= 160) && (var19 <= 160 || var19 > 255)) { // L: 597
												label1729: {
													if (var19 != 0) { // L: 601
														char[] var20 = class384.cp1252AsciiExtension; // L: 603

														for (int var21 = 0; var21 < var20.length; ++var21) { // L: 604
															char var22 = var20[var21]; // L: 605
															if (var22 == var19) { // L: 607
																var18 = true; // L: 608
																break label1729; // L: 609
															}
														}
													}

													var18 = false; // L: 615
												}
											} else {
												var18 = true; // L: 598
											}

											if (!var18 || !class157.method3256(var15.charAt(var17))) { // L: 617
												PcmPlayer.method838(3); // L: 618
												return; // L: 619
											}
										}

										Login.Login_password = Login.Login_password + var15.substring(0, var44); // L: 622
									} catch (UnsupportedFlavorException var32) { // L: 624
									} catch (IOException var33) { // L: 625
									}
								}
							} else {
								Bounds var30;
								if (Login.loginIndex == 3) { // L: 660
									var9 = Login.loginBoxX + 180; // L: 661
									var10 = 241; // L: 662
									var30 = var1.method7430(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var9, var10); // L: 663
									if (var5 == 1 && var30.method8120(var35, var36)) { // L: 664
										class30.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 665
									}

									var9 = Login.loginBoxX + 180; // L: 667
									var10 = 276; // L: 668
									if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) { // L: 669
										WorldMapAreaData.method5584(false); // L: 670
									}

									var9 = Login.loginBoxX + 180; // L: 672
									var10 = 326; // L: 673
									if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) { // L: 674
										class30.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false); // L: 675
										return; // L: 676
									}
								} else {
									int var27;
									if (Login.loginIndex == 4) { // L: 679
										var9 = Login.loginBoxX + 180 - 80; // L: 680
										var10 = 321; // L: 681
										if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) { // L: 682
											class369.otp.trim(); // L: 683
											if (class369.otp.length() != 6) { // L: 684
												class318.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 685
												return; // L: 686
											}

											class503.field5039 = Integer.parseInt(class369.otp); // L: 688
											class369.otp = ""; // L: 689
											PendingSpawn.method2368(true); // L: 690
											class318.setLoginResponseString("", "Connecting to server...", ""); // L: 691
											class317.method6014(20); // L: 692
											return; // L: 693
										}

										if (var5 == 1 && var35 >= Login.loginBoxX + 180 - 9 && var35 <= Login.loginBoxX + 180 + 130 && var36 >= 263 && var36 <= 296) { // L: 695
											Login.field956 = !Login.field956; // L: 696
										}

										if (var5 == 1 && var35 >= Login.loginBoxX + 180 - 34 && var35 <= Login.loginBoxX + 34 + 180 && var36 >= 351 && var36 <= 363) { // L: 698
											class30.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false); // L: 699
										}

										var9 = Login.loginBoxX + 180 + 80; // L: 701
										if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) { // L: 702
											PcmPlayer.method838(0); // L: 703
											Login.Login_username = ""; // L: 704
											Login.Login_password = ""; // L: 705
											class503.field5039 = 0; // L: 706
											class369.otp = ""; // L: 707
										}

										while (var8.method4124()) { // L: 709
											var11 = false; // L: 710

											for (var27 = 0; var27 < "1234567890".length(); ++var27) { // L: 711
												if (var8.field2356 == "1234567890".charAt(var27)) { // L: 712
													var11 = true; // L: 713
													break; // L: 714
												}
											}

											if (var8.field2369 == 13) { // L: 717
												PcmPlayer.method838(0); // L: 718
												Login.Login_username = ""; // L: 719
												Login.Login_password = ""; // L: 720
												class503.field5039 = 0; // L: 721
												class369.otp = ""; // L: 722
											} else {
												if (var8.field2369 == 85 && class369.otp.length() > 0) { // L: 725
													class369.otp = class369.otp.substring(0, class369.otp.length() - 1);
												}

												if (var8.field2369 == 84) { // L: 726
													class369.otp.trim(); // L: 727
													if (class369.otp.length() != 6) { // L: 728
														class318.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 729
														return; // L: 730
													}

													class503.field5039 = Integer.parseInt(class369.otp); // L: 732
													class369.otp = ""; // L: 733
													PendingSpawn.method2368(true); // L: 734
													class318.setLoginResponseString("", "Connecting to server...", ""); // L: 735
													class317.method6014(20); // L: 736
													return; // L: 737
												}

												if (var11 && class369.otp.length() < 6) { // L: 739
													class369.otp = class369.otp + var8.field2356;
												}
											}
										}
									} else {
										int var26;
										if (Login.loginIndex == 5) { // L: 743
											var9 = Login.loginBoxX + 180 - 80; // L: 744
											var10 = 321; // L: 745
											if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) { // L: 746
												class108.method2715(); // L: 747
												return; // L: 748
											}

											var9 = Login.loginBoxX + 180 + 80; // L: 750
											if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) { // L: 751
												WorldMapAreaData.Login_promptCredentials(true); // L: 752
											}

											var39 = 361; // L: 754
											if (class90.field1117 != null) { // L: 755
												var27 = class90.field1117.highX / 2; // L: 756
												if (var5 == 1 && var35 >= class90.field1117.lowX - var27 && var35 <= var27 + class90.field1117.lowX && var36 >= var39 - 15 && var36 < var39) { // L: 757
													class30.openURL(HorizontalAlignment.method3682("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 758
												}
											}

											while (var8.method4124()) { // L: 761
												var47 = false; // L: 762

												for (var26 = 0; var26 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var26) { // L: 763
													if (var8.field2356 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var26)) { // L: 764
														var47 = true; // L: 765
														break; // L: 766
													}
												}

												if (var8.field2369 == 13) { // L: 769
													WorldMapAreaData.Login_promptCredentials(true); // L: 770
												} else {
													if (var8.field2369 == 85 && Login.Login_username.length() > 0) { // L: 773
														Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
													}

													if (var8.field2369 == 84) { // L: 774
														class108.method2715(); // L: 775
														return; // L: 776
													}

													if (var47 && Login.Login_username.length() < 320) { // L: 778
														Login.Login_username = Login.Login_username + var8.field2356;
													}
												}
											}
										} else if (Login.loginIndex != 6) { // L: 782
											if (Login.loginIndex == 7) { // L: 793
												if (ModeWhere.field4404 && !Client.onMobile) { // L: 794
													var9 = class452.loginBoxCenter - 150; // L: 795
													var40 = var9 + 40 + 240 + 25; // L: 796
													var39 = 231; // L: 797
													var27 = var39 + 40; // L: 798
													if (var5 == 1 && var35 >= var9 && var35 <= var40 && var36 >= var39 && var36 <= var27) { // L: 799
														var14 = var9; // L: 801
														var29 = 0;

														while (true) {
															if (var29 >= 8) {
																var26 = 0; // L: 811
																break;
															}

															if (var35 <= var14 + 30) { // L: 804
																var26 = var29; // L: 805
																break; // L: 806
															}

															var14 += 30; // L: 808
															var14 += var29 != 1 && var29 != 3 ? 5 : 20; // L: 809
															++var29; // L: 803
														}

														Login.field951 = var26; // L: 813
													}

													var26 = Login.loginBoxX + 180 - 80; // L: 815
													short var43 = 321; // L: 816
													boolean var50;
													if (var5 == 1 && var35 >= var26 - 75 && var35 <= var26 + 75 && var36 >= var43 - 20 && var36 <= var43 + 20) { // L: 817
														var50 = UserComparator6.method2923(); // L: 818
														if (var50) { // L: 819
															class317.method6014(50); // L: 820
															return; // L: 821
														}
													}

													var26 = Login.loginBoxX + 180 + 80; // L: 824
													if (var5 == 1 && var35 >= var26 - 75 && var35 <= var26 + 75 && var36 >= var43 - 20 && var36 <= var43 + 20) { // L: 825
														Login.field954 = new String[8]; // L: 826
														WorldMapAreaData.Login_promptCredentials(true); // L: 827
													}

													while (var8.method4124()) { // L: 829
														if (var8.field2369 == 101) { // L: 830
															Login.field954[Login.field951] = null; // L: 831
														}

														if (var8.field2369 == 85) { // L: 833
															if (Login.field954[Login.field951] == null && Login.field951 > 0) { // L: 834
																--Login.field951; // L: 835
															}

															Login.field954[Login.field951] = null; // L: 837
														}

														if (var8.field2356 >= '0' && var8.field2356 <= '9') { // L: 839
															Login.field954[Login.field951] = "" + var8.field2356; // L: 840
															if (Login.field951 < 7) { // L: 841
																++Login.field951; // L: 842
															}
														}

														if (var8.field2369 == 84) { // L: 845
															var50 = UserComparator6.method2923(); // L: 846
															if (var50) { // L: 847
																class317.method6014(50); // L: 848
															}

															return; // L: 850
														}
													}
												} else {
													var9 = Login.loginBoxX + 180 - 80; // L: 855
													var10 = 321; // L: 856
													if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) { // L: 857
														class30.openURL(HorizontalAlignment.method3682("secure", true) + "m=dob/set_dob.ws", true, false); // L: 858
														class318.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 859
														PcmPlayer.method838(6); // L: 860
														return; // L: 861
													}

													var9 = Login.loginBoxX + 180 + 80; // L: 863
													if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) { // L: 864
														WorldMapAreaData.Login_promptCredentials(true); // L: 865
													}
												}
											} else if (Login.loginIndex == 8) { // L: 869
												var9 = Login.loginBoxX + 180 - 80; // L: 870
												var10 = 321; // L: 871
												if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) { // L: 872
													class30.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 873
													class318.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 874
													PcmPlayer.method838(6); // L: 875
													return; // L: 876
												}

												var9 = Login.loginBoxX + 180 + 80; // L: 878
												if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) { // L: 879
													WorldMapAreaData.Login_promptCredentials(true); // L: 880
												}
											} else if (Login.loginIndex == 9) { // L: 883
												var9 = Login.loginBoxX + 180; // L: 884
												var10 = 311; // L: 885
												if (var8.field2369 == 84 || var8.field2369 == 13 || var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) { // L: 886
													WorldMapAreaData.method5584(false); // L: 887
												}
											} else if (Login.loginIndex == 10) { // L: 890
												var9 = Login.loginBoxX + 180; // L: 891
												var10 = 209; // L: 892
												if (var8.field2369 == 84 || var5 == 1 && var35 >= var9 - 109 && var35 <= var9 + 109 && var36 >= var10 && var36 <= var10 + 68) { // L: 893
													class318.setLoginResponseString("", "Connecting to server...", ""); // L: 894
													Client.field571 = class519.field5164; // L: 895
													PendingSpawn.method2368(false); // L: 896
													class317.method6014(20); // L: 897
												}
											} else if (Login.loginIndex == 12) { // L: 900
												var9 = class452.loginBoxCenter; // L: 901
												var10 = 233; // L: 902
												var30 = var2.method7430(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 903
												Bounds var12 = var2.method7430(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 904
												Bounds var13 = var2.method7430(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 905
												var40 = var10 + 17; // L: 906
												Bounds var28 = var2.method7430(0, 34, "<col=ffd200>agreement (EULA)</col>.", var9, var40); // L: 907
												if (var5 == 1) { // L: 908
													if (var30.method8120(var35, var36)) { // L: 909
														class30.openURL("https://www.jagex.com/terms", true, false); // L: 910
													} else if (var12.method8120(var35, var36)) { // L: 912
														class30.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 913
													} else if (var13.method8120(var35, var36) || var28.method8120(var35, var36)) { // L: 915
														class30.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 916
													}
												}

												var9 = class452.loginBoxCenter - 80; // L: 919
												var10 = 311; // L: 920
												if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) { // L: 921
													class9.method75(); // L: 922
													WorldMapAreaData.method5584(true); // L: 923
												}

												var9 = class452.loginBoxCenter + 80; // L: 925
												if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) { // L: 926
													Login.loginIndex = 13; // L: 927
												}
											} else if (Login.loginIndex == 13) { // L: 930
												var9 = class452.loginBoxCenter; // L: 931
												var10 = 321; // L: 932
												if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) { // L: 933
													WorldMapAreaData.method5584(true); // L: 934
												}
											} else if (Login.loginIndex == 14) { // L: 937
												String var31 = ""; // L: 938
												switch(Login.field942) { // L: 939
												case 0:
													var31 = "https://secure.runescape.com/m=offence-appeal/account-history"; // L: 950
													break;
												case 1:
													var31 = "https://secure.runescape.com/m=accountappeal/passwordrecovery"; // L: 944
													break; // L: 945
												case 2:
													var31 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance"; // L: 941
													break; // L: 942
												default:
													WorldMapAreaData.Login_promptCredentials(false); // L: 947
												}

												var40 = Login.loginBoxX + 180; // L: 953
												var39 = 276; // L: 954
												if (var5 == 1 && var35 >= var40 - 75 && var35 <= var40 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20) { // L: 955
													class30.openURL(var31, true, false); // L: 956
													class318.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 957
													PcmPlayer.method838(6); // L: 958
													return; // L: 959
												}

												var40 = Login.loginBoxX + 180; // L: 961
												var39 = 326; // L: 962
												if (var5 == 1 && var35 >= var40 - 75 && var35 <= var40 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20) { // L: 963
													WorldMapAreaData.Login_promptCredentials(false); // L: 964
												}
											} else if (Login.loginIndex == 24) { // L: 967
												var9 = Login.loginBoxX + 180; // L: 968
												var10 = 301; // L: 969
												if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) { // L: 970
													WorldMapAreaData.method5584(false); // L: 971
												}
											} else if (Login.loginIndex == 32) { // L: 974
												var9 = Login.loginBoxX + 180 - 80; // L: 975
												var10 = 321; // L: 976
												if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) { // L: 977
													class30.openURL(HorizontalAlignment.method3682("secure", true) + "m=dob/set_dob.ws", true, false); // L: 978
													class318.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 979
													PcmPlayer.method838(6); // L: 980
													return; // L: 981
												}

												var9 = Login.loginBoxX + 180 + 80; // L: 983
												if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) { // L: 984
													WorldMapAreaData.Login_promptCredentials(true); // L: 985
												}
											} else if (Login.loginIndex == 33) { // L: 988
												var9 = Login.loginBoxX + 180; // L: 989
												var10 = 276; // L: 990
												if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) { // L: 991
													class30.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 992
												}

												var9 = Login.loginBoxX + 180; // L: 994
												var10 = 326; // L: 995
												if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) { // L: 996
													WorldMapAreaData.Login_promptCredentials(true); // L: 997
												}
											}
										} else {
											while (true) {
												do {
													if (!var8.method4124()) { // L: 783
														var38 = 321; // L: 788
														if (var5 == 1 && var36 >= var38 - 20 && var36 <= var38 + 20) { // L: 789
															WorldMapAreaData.Login_promptCredentials(true); // L: 790
														}

														return;
													}
												} while(var8.field2369 != 84 && var8.field2369 != 13); // L: 784

												WorldMapAreaData.Login_promptCredentials(true); // L: 785
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
	} // L: 353
}
