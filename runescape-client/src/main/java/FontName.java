import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pz")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static ClanChannel field4758;
	@ObfuscatedName("y")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full"); // L: 9
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular"); // L: 12
	}

	FontName(String var1) {
		this.name = var1; // L: 20
	} // L: 21

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)[Lpz;",
		garbageValue = "57"
	)
	public static FontName[] method8076() {
		return new FontName[]{FontName_plain11, FontName_verdana13, FontName_verdana15, FontName_bold12, FontName_plain12, FontName_verdana11}; // L: 16
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lae;Lnl;I)V",
		garbageValue = "-354010538"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1) {
		int var4;
		int var5;
		int var34;
		int var35;
		if (Login.worldSelectOpen) { // L: 286
			class199 var32 = Client.field733; // L: 290
			class199 var3 = var32; // L: 292

			while (true) {
				if (!var3.method3981()) { // L: 293
					if (MouseHandler.MouseHandler_lastButton != 1 && (class82.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) { // L: 309
						break;
					}

					var4 = Login.xPadding + 280; // L: 310
					if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 311
						class278.changeWorldSelectSorting(0, 0); // L: 312
						break; // L: 313
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 315
						class278.changeWorldSelectSorting(0, 1); // L: 316
						break; // L: 317
					}

					var5 = Login.xPadding + 390; // L: 319
					if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 320
						class278.changeWorldSelectSorting(1, 0); // L: 321
						break; // L: 322
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 324
						class278.changeWorldSelectSorting(1, 1); // L: 325
						break; // L: 326
					}

					var34 = Login.xPadding + 500; // L: 328
					if (MouseHandler.MouseHandler_lastPressedX >= var34 && MouseHandler.MouseHandler_lastPressedX <= var34 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 329
						class278.changeWorldSelectSorting(2, 0); // L: 330
						break; // L: 331
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var34 + 15 && MouseHandler.MouseHandler_lastPressedX <= var34 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 333
						class278.changeWorldSelectSorting(2, 1); // L: 334
						break; // L: 335
					}

					var35 = Login.xPadding + 610; // L: 337
					if (MouseHandler.MouseHandler_lastPressedX >= var35 && MouseHandler.MouseHandler_lastPressedX <= var35 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 338
						class278.changeWorldSelectSorting(3, 0); // L: 339
						break; // L: 340
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var35 + 15 && MouseHandler.MouseHandler_lastPressedX <= var35 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 342
						class278.changeWorldSelectSorting(3, 1); // L: 343
						break; // L: 344
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 346
						class20.method289(); // L: 347
						break; // L: 348
					}

					if (Login.hoveredWorldIndex != -1) { // L: 350
						World var36 = class412.World_worlds[Login.hoveredWorldIndex]; // L: 351
						Client.changeWorld(var36); // L: 352
						class20.method289(); // L: 353
					} else {
						if (Login.worldSelectPage > 0 && GameObject.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= GameObject.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class10.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class10.canvasHeight / 2 + 50) { // L: 356
							--Login.worldSelectPage; // L: 357
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && DevicePcmPlayerProvider.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GameEngine.canvasWidth - DevicePcmPlayerProvider.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GameEngine.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class10.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class10.canvasHeight / 2 + 50) { // L: 359
							++Login.worldSelectPage; // L: 360
						}
					}
					break;
				}

				if (var3.field2252 == 13) { // L: 294
					class20.method289(); // L: 295
					break; // L: 296
				}

				if (var3.field2252 == 96) { // L: 298
					if (Login.worldSelectPage > 0 && GameObject.worldSelectLeftSprite != null) { // L: 299
						--Login.worldSelectPage; // L: 300
					}
				} else if (var3.field2252 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && DevicePcmPlayerProvider.worldSelectRightSprite != null) { // L: 303 304
					++Login.worldSelectPage; // L: 305
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class82.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 366
				BufferedSink.clientPreferences.method2382(!BufferedSink.clientPreferences.method2383()); // L: 367
				if (!BufferedSink.clientPreferences.method2383()) { // L: 368
					Archive var2 = ReflectionCheck.archive6; // L: 369
					int var19 = var2.getGroupId("scape main"); // L: 371
					var4 = var2.getFileId(var19, ""); // L: 372
					class18.method266(var2, var19, var4, 255, false); // L: 373
				} else {
					class283.midiPcmStream.clear(); // L: 377
					class283.musicPlayerStatus = 1; // L: 378
					DevicePcmPlayerProvider.musicTrackArchive = null; // L: 379
				}
			}

			if (Client.gameState != 5) { // L: 382
				if (-1L == Login.field926) { // L: 383
					Login.field926 = UserComparator8.method2748() + 1000L; // L: 384
				}

				long var20 = UserComparator8.method2748(); // L: 386
				boolean var33;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 389
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) { // L: 393
							var33 = true; // L: 401
							break;
						}

						ArchiveLoader var22 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 394
						if (!var22.isLoaded()) { // L: 395
							var33 = false; // L: 396
							break; // L: 397
						}

						++Client.archiveLoadersDone; // L: 399
					}
				} else {
					var33 = true; // L: 390
				}

				if (var33 && -1L == Login.field918) { // L: 403 404
					Login.field918 = var20; // L: 405
					if (Login.field918 > Login.field926) { // L: 406
						Login.field926 = Login.field918; // L: 407
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 411
					if (Language.Language_EN == class103.clientLanguage) { // L: 412
						if (MouseHandler.MouseHandler_lastButton == 1 || !class82.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 413
							var5 = Login.xPadding + 5; // L: 414
							short var6 = 463; // L: 415
							byte var7 = 100; // L: 416
							byte var23 = 35; // L: 417
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + var7 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var23 + var6) { // L: 418
								if (GrandExchangeEvent.loadWorlds()) { // L: 420
									Login.worldSelectOpen = true; // L: 421
									Login.worldSelectPage = 0; // L: 422
									Login.worldSelectPagesCount = 0; // L: 423
								}

								return; // L: 426
							}
						}

						if (class96.World_request != null && GrandExchangeEvent.loadWorlds()) { // L: 429 430
							Login.worldSelectOpen = true; // L: 431
							Login.worldSelectPage = 0; // L: 432
							Login.worldSelectPagesCount = 0; // L: 433
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton; // L: 437
					var34 = MouseHandler.MouseHandler_lastPressedX; // L: 438
					var35 = MouseHandler.MouseHandler_lastPressedY; // L: 439
					if (var5 == 0) { // L: 440
						var34 = MouseHandler.MouseHandler_x; // L: 441
						var35 = MouseHandler.MouseHandler_y; // L: 442
					}

					if (!class82.mouseCam && var5 == 4) { // L: 444
						var5 = 1;
					}

					class199 var8 = Client.field733; // L: 447
					class199 var9 = var8; // L: 449
					int var38;
					short var39;
					if (Login.loginIndex == 0) { // L: 450
						boolean var43 = false; // L: 451

						while (var9.method3981()) { // L: 452
							if (var9.field2252 == 84) { // L: 453
								var43 = true; // L: 454
							}
						}

						var38 = Canvas.loginBoxCenter - 80; // L: 457
						var39 = 291; // L: 458
						if (var5 == 1 && var34 >= var38 - 75 && var34 <= var38 + 75 && var35 >= var39 - 20 && var35 <= var39 + 20) { // L: 459
							UrlRequester.openURL(class135.method2990("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 460
						}

						var38 = Canvas.loginBoxCenter + 80; // L: 462
						if (var5 == 1 && var34 >= var38 - 75 && var34 <= var38 + 75 && var35 >= var39 - 20 && var35 <= var39 + 20 || var43) { // L: 463
							if ((Client.worldProperties & 33554432) != 0) { // L: 464
								Login.Login_response0 = ""; // L: 465
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 466
								Login.Login_response2 = "Your normal account will not be affected."; // L: 467
								Login.Login_response3 = ""; // L: 468
								GrandExchangeOfferOwnWorldComparator.method1171(1); // L: 469
								class283.method5450(); // L: 470
							} else if ((Client.worldProperties & 4) != 0) { // L: 472
								if ((Client.worldProperties & 1024) != 0) { // L: 473
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 474
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 475
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 476
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 479
									Login.Login_response2 = "Players can attack each other"; // L: 480
									Login.Login_response3 = "almost everywhere."; // L: 481
								}

								Login.Login_response0 = "Warning!"; // L: 483
								GrandExchangeOfferOwnWorldComparator.method1171(1); // L: 484
								class283.method5450(); // L: 485
							} else if ((Client.worldProperties & 1024) != 0) { // L: 487
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 488
								Login.Login_response2 = "The Protect Item prayer will"; // L: 489
								Login.Login_response3 = "not work on this world."; // L: 490
								Login.Login_response0 = "Warning!"; // L: 491
								GrandExchangeOfferOwnWorldComparator.method1171(1); // L: 492
								class283.method5450(); // L: 493
							} else {
								FriendsChatManager.Login_promptCredentials(false); // L: 496
							}
						}
					} else {
						int var10;
						short var11;
						if (Login.loginIndex == 1) { // L: 500
							while (true) {
								if (!var9.method3981()) { // L: 501
									var10 = Canvas.loginBoxCenter - 80; // L: 509
									var11 = 321; // L: 510
									if (var5 == 1 && var34 >= var10 - 75 && var34 <= var10 + 75 && var35 >= var11 - 20 && var35 <= var11 + 20) { // L: 511
										FriendsChatManager.Login_promptCredentials(false); // L: 512
									}

									var10 = Canvas.loginBoxCenter + 80; // L: 514
									if (var5 == 1 && var34 >= var10 - 75 && var34 <= var10 + 75 && var35 >= var11 - 20 && var35 <= var11 + 20) { // L: 515
										GrandExchangeOfferOwnWorldComparator.method1171(0); // L: 516
									}
									break;
								}

								if (var9.field2252 == 84) { // L: 502
									FriendsChatManager.Login_promptCredentials(false); // L: 503
								} else if (var9.field2252 == 13) { // L: 505
									GrandExchangeOfferOwnWorldComparator.method1171(0); // L: 506
								}
							}
						} else {
							short var37;
							if (Login.loginIndex == 2) { // L: 519
								var37 = 201; // L: 520
								var10 = var37 + 52; // L: 521
								if (var5 == 1 && var35 >= var10 - 12 && var35 < var10 + 2) { // L: 522
									Login.currentLoginField = 0;
								}

								var10 += 15; // L: 523
								if (var5 == 1 && var35 >= var10 - 12 && var35 < var10 + 2) { // L: 524
									Login.currentLoginField = 1;
								}

								var10 += 15; // L: 525
								var37 = 361; // L: 526
								if (class459.field4855 != null) { // L: 527
									var38 = class459.field4855.highX / 2; // L: 528
									if (var5 == 1 && var34 >= class459.field4855.lowX - var38 && var34 <= var38 + class459.field4855.lowX && var35 >= var37 - 15 && var35 < var37) { // L: 529
										switch(Login.field925) { // L: 530
										case 1:
											MusicPatchNode2.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 538
											GrandExchangeOfferOwnWorldComparator.method1171(5); // L: 539
											return; // L: 540
										case 2:
											UrlRequester.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 533
										}
									}
								}

								var38 = Canvas.loginBoxCenter - 80; // L: 545
								var39 = 321; // L: 546
								if (var5 == 1 && var34 >= var38 - 75 && var34 <= var38 + 75 && var35 >= var39 - 20 && var35 <= var39 + 20) { // L: 547
									Login.Login_username = Login.Login_username.trim(); // L: 548
									if (Login.Login_username.length() == 0) { // L: 549
										MusicPatchNode2.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 550
										return; // L: 551
									}

									if (Login.Login_password.length() == 0) { // L: 553
										MusicPatchNode2.setLoginResponseString("", "Please enter your password.", ""); // L: 554
										return; // L: 555
									}

									MusicPatchNode2.setLoginResponseString("", "Connecting to server...", ""); // L: 557
									SoundCache.method874(false); // L: 558
									class21.method305(20); // L: 559
									return; // L: 560
								}

								var38 = Login.loginBoxX + 180 + 80; // L: 562
								if (var5 == 1 && var34 >= var38 - 75 && var34 <= var38 + 75 && var35 >= var39 - 20 && var35 <= var39 + 20) { // L: 563
									GrandExchangeOfferOwnWorldComparator.method1171(0); // L: 564
									Login.Login_username = ""; // L: 565
									Login.Login_password = ""; // L: 566
									class360.field4308 = 0; // L: 567
									class355.otp = ""; // L: 568
									Login.field900 = true; // L: 569
								}

								var38 = Canvas.loginBoxCenter + -117; // L: 571
								var39 = 277; // L: 572
								Login.field916 = var34 >= var38 && var34 < var38 + ModeWhere.field4271 && var35 >= var39 && var35 < var39 + Login.field915; // L: 573
								if (var5 == 1 && Login.field916) { // L: 574
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 575
									if (!Client.Login_isUsernameRemembered && BufferedSink.clientPreferences.method2397() != null) { // L: 576
										BufferedSink.clientPreferences.method2385((String)null); // L: 577
									}
								}

								var38 = Canvas.loginBoxCenter + 24; // L: 580
								var39 = 277; // L: 581
								Login.field917 = var34 >= var38 && var34 < var38 + ModeWhere.field4271 && var35 >= var39 && var35 < var39 + Login.field915; // L: 582
								if (var5 == 1 && Login.field917) { // L: 583
									BufferedSink.clientPreferences.method2430(!BufferedSink.clientPreferences.method2381()); // L: 584
									if (!BufferedSink.clientPreferences.method2381()) { // L: 585
										Login.Login_username = ""; // L: 586
										BufferedSink.clientPreferences.method2385((String)null); // L: 587
										class283.method5450(); // L: 588
									}
								}

								while (true) {
									Transferable var41;
									int var42;
									do {
										while (true) {
											label1372:
											do {
												while (true) {
													while (var9.method3981()) { // L: 591
														if (var9.field2252 != 13) { // L: 592
															if (Login.currentLoginField != 0) { // L: 601
																continue label1372;
															}

															VarpDefinition.method3415(var9.field2256); // L: 602
															if (var9.field2252 == 85 && Login.Login_username.length() > 0) { // L: 603
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var9.field2252 == 84 || var9.field2252 == 80) { // L: 604
																Login.currentLoginField = 1;
															}

															if (class199.method3997(var9.field2256) && Login.Login_username.length() < 320) { // L: 605
																Login.Login_username = Login.Login_username + var9.field2256;
															}
														} else {
															GrandExchangeOfferOwnWorldComparator.method1171(0); // L: 593
															Login.Login_username = ""; // L: 594
															Login.Login_password = ""; // L: 595
															class360.field4308 = 0; // L: 596
															class355.otp = ""; // L: 597
															Login.field900 = true; // L: 598
														}
													}

													return; // L: 966
												}
											} while(Login.currentLoginField != 1); // L: 607

											if (var9.field2252 == 85 && Login.Login_password.length() > 0) { // L: 608
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 609
											} else if (var9.field2252 == 84 || var9.field2252 == 80) { // L: 611
												Login.currentLoginField = 0; // L: 612
												if (var9.field2252 == 84) { // L: 613
													Login.Login_username = Login.Login_username.trim(); // L: 614
													if (Login.Login_username.length() == 0) { // L: 615
														MusicPatchNode2.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 616
														return; // L: 617
													}

													if (Login.Login_password.length() == 0) { // L: 619
														MusicPatchNode2.setLoginResponseString("", "Please enter your password.", ""); // L: 620
														return; // L: 621
													}

													MusicPatchNode2.setLoginResponseString("", "Connecting to server...", ""); // L: 623
													SoundCache.method874(false); // L: 624
													class21.method305(20); // L: 625
													return; // L: 626
												}
											}

											if ((var9.method3956(82) || var9.method3956(87)) && var9.field2252 == 67) { // L: 629
												Clipboard var40 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 630
												var41 = var40.getContents(ClanChannelMember.client); // L: 631
												var42 = 20 - Login.Login_password.length(); // L: 632
												break;
											}

											if (class283.method5443(var9.field2256) && class199.method3997(var9.field2256) && Login.Login_password.length() < 20) { // L: 649
												Login.Login_password = Login.Login_password + var9.field2256; // L: 650
											}
										}
									} while(var42 <= 0); // L: 633

									try {
										String var16 = (String)var41.getTransferData(DataFlavor.stringFlavor); // L: 635
										int var17 = Math.min(var42, var16.length()); // L: 636

										for (int var18 = 0; var18 < var17; ++var18) { // L: 637
											if (!class283.method5443(var16.charAt(var18)) || !class199.method3997(var16.charAt(var18))) { // L: 638
												GrandExchangeOfferOwnWorldComparator.method1171(3); // L: 639
												return; // L: 640
											}
										}

										Login.Login_password = Login.Login_password + var16.substring(0, var17); // L: 643
									} catch (UnsupportedFlavorException var30) { // L: 645
									} catch (IOException var31) { // L: 646
									}
								}
							} else if (Login.loginIndex == 3) { // L: 656
								var10 = Login.loginBoxX + 180; // L: 657
								var11 = 276; // L: 658
								if (var5 == 1 && var34 >= var10 - 75 && var34 <= var10 + 75 && var35 >= var11 - 20 && var35 <= var11 + 20) { // L: 659
									GrandExchangeEvents.method6463(false); // L: 660
								}

								var10 = Login.loginBoxX + 180; // L: 662
								var11 = 326; // L: 663
								if (var5 == 1 && var34 >= var10 - 75 && var34 <= var10 + 75 && var35 >= var11 - 20 && var35 <= var11 + 20) { // L: 664
									MusicPatchNode2.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 665
									GrandExchangeOfferOwnWorldComparator.method1171(5); // L: 666
									return; // L: 667
								}
							} else {
								int var24;
								if (Login.loginIndex == 4) { // L: 670
									var10 = Login.loginBoxX + 180 - 80; // L: 671
									var11 = 321; // L: 672
									if (var5 == 1 && var34 >= var10 - 75 && var34 <= var10 + 75 && var35 >= var11 - 20 && var35 <= var11 + 20) { // L: 673
										class355.otp.trim(); // L: 674
										if (class355.otp.length() != 6) { // L: 675
											MusicPatchNode2.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 676
											return; // L: 677
										}

										class360.field4308 = Integer.parseInt(class355.otp); // L: 679
										class355.otp = ""; // L: 680
										SoundCache.method874(true); // L: 681
										MusicPatchNode2.setLoginResponseString("", "Connecting to server...", ""); // L: 682
										class21.method305(20); // L: 683
										return; // L: 684
									}

									if (var5 == 1 && var34 >= Login.loginBoxX + 180 - 9 && var34 <= Login.loginBoxX + 180 + 130 && var35 >= 263 && var35 <= 296) { // L: 686
										Login.field900 = !Login.field900; // L: 687
									}

									if (var5 == 1 && var34 >= Login.loginBoxX + 180 - 34 && var34 <= Login.loginBoxX + 34 + 180 && var35 >= 351 && var35 <= 363) { // L: 689
										UrlRequester.openURL(class135.method2990("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 690
									}

									var10 = Login.loginBoxX + 180 + 80; // L: 692
									if (var5 == 1 && var34 >= var10 - 75 && var34 <= var10 + 75 && var35 >= var11 - 20 && var35 <= var11 + 20) { // L: 693
										GrandExchangeOfferOwnWorldComparator.method1171(0); // L: 694
										Login.Login_username = ""; // L: 695
										Login.Login_password = ""; // L: 696
										class360.field4308 = 0; // L: 697
										class355.otp = ""; // L: 698
									}

									while (var9.method3981()) { // L: 700
										boolean var12 = false; // L: 701

										for (var24 = 0; var24 < "1234567890".length(); ++var24) { // L: 702
											if (var9.field2256 == "1234567890".charAt(var24)) { // L: 703
												var12 = true; // L: 704
												break; // L: 705
											}
										}

										if (var9.field2252 == 13) { // L: 708
											GrandExchangeOfferOwnWorldComparator.method1171(0); // L: 709
											Login.Login_username = ""; // L: 710
											Login.Login_password = ""; // L: 711
											class360.field4308 = 0; // L: 712
											class355.otp = ""; // L: 713
										} else {
											if (var9.field2252 == 85 && class355.otp.length() > 0) { // L: 716
												class355.otp = class355.otp.substring(0, class355.otp.length() - 1);
											}

											if (var9.field2252 == 84) { // L: 717
												class355.otp.trim(); // L: 718
												if (class355.otp.length() != 6) { // L: 719
													MusicPatchNode2.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 720
													return; // L: 721
												}

												class360.field4308 = Integer.parseInt(class355.otp); // L: 723
												class355.otp = ""; // L: 724
												SoundCache.method874(true); // L: 725
												MusicPatchNode2.setLoginResponseString("", "Connecting to server...", ""); // L: 726
												class21.method305(20); // L: 727
												return; // L: 728
											}

											if (var12 && class355.otp.length() < 6) { // L: 730
												class355.otp = class355.otp + var9.field2256;
											}
										}
									}
								} else {
									int var25;
									if (Login.loginIndex == 5) { // L: 734
										var10 = Login.loginBoxX + 180 - 80; // L: 735
										var11 = 321; // L: 736
										if (var5 == 1 && var34 >= var10 - 75 && var34 <= var10 + 75 && var35 >= var11 - 20 && var35 <= var11 + 20) { // L: 737
											class362.method6840(); // L: 738
											return; // L: 739
										}

										var10 = Login.loginBoxX + 180 + 80; // L: 741
										if (var5 == 1 && var34 >= var10 - 75 && var34 <= var10 + 75 && var35 >= var11 - 20 && var35 <= var11 + 20) { // L: 742
											FriendsChatManager.Login_promptCredentials(true); // L: 743
										}

										var39 = 361; // L: 745
										if (WorldMapID.field2925 != null) { // L: 746
											var24 = WorldMapID.field2925.highX / 2; // L: 747
											if (var5 == 1 && var34 >= WorldMapID.field2925.lowX - var24 && var34 <= var24 + WorldMapID.field2925.lowX && var35 >= var39 - 15 && var35 < var39) { // L: 748
												UrlRequester.openURL(class135.method2990("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 749
											}
										}

										while (var9.method3981()) { // L: 752
											boolean var44 = false; // L: 753

											for (var25 = 0; var25 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var25) { // L: 754
												if (var9.field2256 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var25)) { // L: 755
													var44 = true; // L: 756
													break; // L: 757
												}
											}

											if (var9.field2252 == 13) { // L: 760
												FriendsChatManager.Login_promptCredentials(true); // L: 761
											} else {
												if (var9.field2252 == 85 && Login.Login_username.length() > 0) { // L: 764
													Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
												}

												if (var9.field2252 == 84) { // L: 765
													class362.method6840(); // L: 766
													return; // L: 767
												}

												if (var44 && Login.Login_username.length() < 320) { // L: 769
													Login.Login_username = Login.Login_username + var9.field2256;
												}
											}
										}
									} else if (Login.loginIndex != 6) { // L: 773
										if (Login.loginIndex == 7) { // L: 784
											if (ItemContainer.field1020 && !Client.onMobile) { // L: 785
												var10 = Canvas.loginBoxCenter - 150; // L: 786
												var38 = var10 + 40 + 240 + 25; // L: 787
												var39 = 231; // L: 788
												var24 = var39 + 40; // L: 789
												if (var5 == 1 && var34 >= var10 && var34 <= var38 && var35 >= var39 && var35 <= var24) { // L: 790
													Login.field913 = SecureRandomCallable.method2203(var10, var34); // L: 791
												}

												var25 = Login.loginBoxX + 180 - 80; // L: 793
												short var15 = 321; // L: 794
												boolean var26;
												if (var5 == 1 && var34 >= var25 - 75 && var34 <= var25 + 75 && var35 >= var15 - 20 && var35 <= var15 + 20) { // L: 795
													var26 = FloorUnderlayDefinition.method3622(); // L: 796
													if (var26) { // L: 797
														class21.method305(50); // L: 798
														return; // L: 799
													}
												}

												var25 = Login.loginBoxX + 180 + 80; // L: 802
												if (var5 == 1 && var34 >= var25 - 75 && var34 <= var25 + 75 && var35 >= var15 - 20 && var35 <= var15 + 20) { // L: 803
													Login.field914 = new String[8]; // L: 804
													FriendsChatManager.Login_promptCredentials(true); // L: 805
												}

												while (var9.method3981()) { // L: 807
													if (var9.field2252 == 101) { // L: 808
														Login.field914[Login.field913] = null; // L: 809
													}

													if (var9.field2252 == 85) { // L: 811
														if (Login.field914[Login.field913] == null && Login.field913 > 0) { // L: 812
															--Login.field913; // L: 813
														}

														Login.field914[Login.field913] = null; // L: 815
													}

													if (var9.field2256 >= '0' && var9.field2256 <= '9') { // L: 817
														Login.field914[Login.field913] = "" + var9.field2256; // L: 818
														if (Login.field913 < 7) { // L: 819
															++Login.field913; // L: 820
														}
													}

													if (var9.field2252 == 84) { // L: 823
														var26 = FloorUnderlayDefinition.method3622(); // L: 824
														if (var26) { // L: 825
															class21.method305(50); // L: 826
														}

														return; // L: 828
													}
												}
											} else {
												var10 = Login.loginBoxX + 180 - 80; // L: 833
												var11 = 321; // L: 834
												if (var5 == 1 && var34 >= var10 - 75 && var34 <= var10 + 75 && var35 >= var11 - 20 && var35 <= var11 + 20) { // L: 835
													UrlRequester.openURL(class135.method2990("secure", true) + "m=dob/set_dob.ws", true, false); // L: 836
													MusicPatchNode2.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 837
													GrandExchangeOfferOwnWorldComparator.method1171(6); // L: 838
													return; // L: 839
												}

												var10 = Login.loginBoxX + 180 + 80; // L: 841
												if (var5 == 1 && var34 >= var10 - 75 && var34 <= var10 + 75 && var35 >= var11 - 20 && var35 <= var11 + 20) { // L: 842
													FriendsChatManager.Login_promptCredentials(true); // L: 843
												}
											}
										} else if (Login.loginIndex == 8) { // L: 847
											var10 = Login.loginBoxX + 180 - 80; // L: 848
											var11 = 321; // L: 849
											if (var5 == 1 && var34 >= var10 - 75 && var34 <= var10 + 75 && var35 >= var11 - 20 && var35 <= var11 + 20) { // L: 850
												UrlRequester.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 851
												MusicPatchNode2.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 852
												GrandExchangeOfferOwnWorldComparator.method1171(6); // L: 853
												return; // L: 854
											}

											var10 = Login.loginBoxX + 180 + 80; // L: 856
											if (var5 == 1 && var34 >= var10 - 75 && var34 <= var10 + 75 && var35 >= var11 - 20 && var35 <= var11 + 20) { // L: 857
												FriendsChatManager.Login_promptCredentials(true); // L: 858
											}
										} else if (Login.loginIndex == 9) { // L: 861
											var10 = Login.loginBoxX + 180; // L: 862
											var11 = 311; // L: 863
											if (var8.field2252 == 84 || var8.field2252 == 13 || var5 == 1 && var34 >= var10 - 75 && var34 <= var10 + 75 && var35 >= var11 - 20 && var35 <= var11 + 20) { // L: 864
												GrandExchangeEvents.method6463(false); // L: 865
											}
										} else if (Login.loginIndex == 10) { // L: 868
											var10 = Login.loginBoxX + 180; // L: 869
											var11 = 209; // L: 870
											if (var8.field2252 == 84 || var5 == 1 && var34 >= var10 - 109 && var34 <= var10 + 109 && var35 >= var11 && var35 <= var11 + 68) { // L: 871
												MusicPatchNode2.setLoginResponseString("", "Connecting to server...", ""); // L: 872
												Client.field615 = class467.field4919; // L: 873
												SoundCache.method874(false); // L: 874
												class21.method305(20); // L: 875
											}
										} else if (Login.loginIndex == 12) { // L: 878
											var10 = Canvas.loginBoxCenter; // L: 879
											var11 = 233; // L: 880
											Bounds var27 = var1.method7001(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11); // L: 881
											Bounds var13 = var1.method7001(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11); // L: 882
											Bounds var14 = var1.method7001(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11); // L: 883
											var38 = var11 + 17; // L: 884
											Bounds var28 = var1.method7001(0, 34, "<col=ffd200>agreement (EULA)</col>.", var10, var38); // L: 885
											if (var5 == 1) { // L: 886
												if (var27.method7574(var34, var35)) { // L: 887
													UrlRequester.openURL("https://www.jagex.com/terms", true, false); // L: 888
												} else if (var13.method7574(var34, var35)) { // L: 890
													UrlRequester.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 891
												} else if (var14.method7574(var34, var35) || var28.method7574(var34, var35)) { // L: 893
													UrlRequester.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 894
												}
											}

											var10 = Canvas.loginBoxCenter - 80; // L: 897
											var11 = 311; // L: 898
											if (var5 == 1 && var34 >= var10 - 75 && var34 <= var10 + 75 && var35 >= var11 - 20 && var35 <= var11 + 20) { // L: 899
												Client.method1726(); // L: 900
												GrandExchangeEvents.method6463(true); // L: 901
											}

											var10 = Canvas.loginBoxCenter + 80; // L: 903
											if (var5 == 1 && var34 >= var10 - 75 && var34 <= var10 + 75 && var35 >= var11 - 20 && var35 <= var11 + 20) { // L: 904
												Login.loginIndex = 13; // L: 905
											}
										} else if (Login.loginIndex == 13) { // L: 908
											var10 = Canvas.loginBoxCenter; // L: 909
											var11 = 321; // L: 910
											if (var5 == 1 && var34 >= var10 - 75 && var34 <= var10 + 75 && var35 >= var11 - 20 && var35 <= var11 + 20) { // L: 911
												GrandExchangeEvents.method6463(true); // L: 912
											}
										} else if (Login.loginIndex == 14) { // L: 915
											String var29 = ""; // L: 916
											switch(Login.field907) { // L: 917
											case 0:
												var29 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans"; // L: 919
												break; // L: 920
											case 1:
												var29 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked"; // L: 922
												break; // L: 923
											case 2:
												var29 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance"; // L: 925
												break; // L: 926
											default:
												FriendsChatManager.Login_promptCredentials(false); // L: 928
											}

											var38 = Login.loginBoxX + 180; // L: 931
											var39 = 276; // L: 932
											if (var5 == 1 && var34 >= var38 - 75 && var34 <= var38 + 75 && var35 >= var39 - 20 && var35 <= var39 + 20) { // L: 933
												UrlRequester.openURL(var29, true, false); // L: 934
												MusicPatchNode2.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 935
												GrandExchangeOfferOwnWorldComparator.method1171(6); // L: 936
												return; // L: 937
											}

											var38 = Login.loginBoxX + 180; // L: 939
											var39 = 326; // L: 940
											if (var5 == 1 && var34 >= var38 - 75 && var34 <= var38 + 75 && var35 >= var39 - 20 && var35 <= var39 + 20) { // L: 941
												FriendsChatManager.Login_promptCredentials(false); // L: 942
											}
										} else if (Login.loginIndex == 24) { // L: 945
											var10 = Login.loginBoxX + 180; // L: 946
											var11 = 301; // L: 947
											if (var5 == 1 && var34 >= var10 - 75 && var34 <= var10 + 75 && var35 >= var11 - 20 && var35 <= var11 + 20) { // L: 948
												GrandExchangeEvents.method6463(false); // L: 949
											}
										} else if (Login.loginIndex == 26) { // L: 952
											var10 = Login.loginBoxX + 180 - 80; // L: 953
											var11 = 321; // L: 954
											if (var5 == 1 && var34 >= var10 - 75 && var34 <= var10 + 75 && var35 >= var11 - 20 && var35 <= var11 + 20) { // L: 955
												UrlRequester.openURL(class135.method2990("secure", true) + "m=dob/set_dob.ws", true, false); // L: 956
												MusicPatchNode2.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 957
												GrandExchangeOfferOwnWorldComparator.method1171(6);
												return;
											}

											var10 = Login.loginBoxX + 180 + 80; // L: 961
											if (var5 == 1 && var34 >= var10 - 75 && var34 <= var10 + 75 && var35 >= var11 - 20 && var35 <= var11 + 20) { // L: 962
												FriendsChatManager.Login_promptCredentials(true); // L: 963
											}
										}
									} else {
										while (true) {
											do {
												if (!var9.method3981()) { // L: 774
													var37 = 321; // L: 779
													if (var5 == 1 && var35 >= var37 - 20 && var35 <= var37 + 20) { // L: 780
														FriendsChatManager.Login_promptCredentials(true); // L: 781
													}

													return;
												}
											} while(var9.field2252 != 84 && var9.field2252 != 13); // L: 775

											FriendsChatManager.Login_promptCredentials(true); // L: 776
										}
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 364

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "85"
	)
	static final void method8080() {
		Scene.Scene_isLowDetail = false; // L: 958
		Client.isLowDetail = false; // L: 959
	} // L: 960

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(Lco;III)V",
		garbageValue = "2015329443"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4414
			int var3 = WorldMapElement.SequenceDefinition_get(var1).field2232; // L: 4415
			if (var3 == 1) { // L: 4416
				var0.sequenceFrame = 0; // L: 4417
				var0.sequenceFrameCycle = 0; // L: 4418
				var0.sequenceDelay = var2; // L: 4419
				var0.field1210 = 0; // L: 4420
			}

			if (var3 == 2) { // L: 4422
				var0.field1210 = 0; // L: 4423
			}
		} else if (var1 == -1 || var0.sequence == -1 || WorldMapElement.SequenceDefinition_get(var1).field2225 >= WorldMapElement.SequenceDefinition_get(var0.sequence).field2225) { // L: 4426
			var0.sequence = var1; // L: 4427
			var0.sequenceFrame = 0; // L: 4428
			var0.sequenceFrameCycle = 0; // L: 4429
			var0.sequenceDelay = var2; // L: 4430
			var0.field1210 = 0; // L: 4431
			var0.field1211 = var0.pathLength; // L: 4432
		}

	} // L: 4434

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1202961922"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		SoundCache.method878(); // L: 12485
		if (MenuAction.friendsChatManager != null) { // L: 12486
			MenuAction.friendsChatManager.invalidateIgnoreds(); // L: 12487
		}

	} // L: 12489
}
