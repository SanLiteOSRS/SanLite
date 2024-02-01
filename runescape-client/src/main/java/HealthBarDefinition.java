import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	public static AbstractArchive field1884;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = 572364811
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("uv")
	@ObfuscatedGetter(
		intValue = -2022348301
	)
	static int field1890;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -178333295
	)
	public int field1887;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1866394181
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 416175397
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1684325795
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 164541499
	)
	public int field1885;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -784941667
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1134799675
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1718105153
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 30986119
	)
	@Export("width")
	public int width;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1305122669
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(64); // L: 14
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 15
	}

	public HealthBarDefinition() {
		this.int1 = 255; // L: 19
		this.int2 = 255; // L: 20
		this.int3 = -1; // L: 21
		this.field1885 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-468113938"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 31
			if (var2 == 0) { // L: 32
				return; // L: 35
			}

			this.decodeNext(var1, var2); // L: 33
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "2046176426"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 38
			var1.readUnsignedShort(); // L: 39
		} else if (var2 == 2) { // L: 41
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 42
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) { // L: 43
			this.int3 = 0;
		} else if (var2 == 5) { // L: 44
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 45
			var1.readUnsignedByte(); // L: 46
		} else if (var2 == 7) { // L: 48
			this.frontSpriteID = var1.method9547();
		} else if (var2 == 8) { // L: 49
			this.backSpriteID = var1.method9547();
		} else if (var2 == 11) { // L: 50
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 51
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 52
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 54

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Luc;",
		garbageValue = "1785378248"
	)
	public SpritePixels method3671() {
		if (this.frontSpriteID < 0) { // L: 57
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.frontSpriteID); // L: 58
			if (var1 != null) {
				return var1; // L: 59
			} else {
				var1 = class135.SpriteBuffer_getSprite(field1884, this.frontSpriteID, 0); // L: 60
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.frontSpriteID); // L: 61
				}

				return var1; // L: 63
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Luc;",
		garbageValue = "-1259762005"
	)
	public SpritePixels method3673() {
		if (this.backSpriteID < 0) { // L: 67
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.backSpriteID); // L: 68
			if (var1 != null) { // L: 69
				return var1;
			} else {
				var1 = class135.SpriteBuffer_getSprite(field1884, this.backSpriteID, 0); // L: 70
				if (var1 != null) { // L: 71
					HitSplatDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1; // L: 73
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lby;Lpv;Lpv;B)V",
		garbageValue = "-63"
	)
	static void method3669(GameEngine var0, Font var1, Font var2) {
		int var5;
		boolean var11;
		int var40;
		int var41;
		boolean var51;
		if (Login.worldSelectOpen) { // L: 291
			class226 var39 = SoundSystem.method879(); // L: 293

			while (true) {
				if (!var39.method4424()) { // L: 294
					if (MouseHandler.MouseHandler_lastButton != 1 && (SoundCache.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) { // L: 315
						break;
					}

					int var4 = Login.xPadding + 280; // L: 316
					if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 317
						class153.changeWorldSelectSorting(0, 0); // L: 318
						break; // L: 319
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 321
						class153.changeWorldSelectSorting(0, 1); // L: 322
						break; // L: 323
					}

					var5 = Login.xPadding + 390; // L: 325
					if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 326
						class153.changeWorldSelectSorting(1, 0); // L: 327
						break; // L: 328
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 330
						class153.changeWorldSelectSorting(1, 1); // L: 331
						break; // L: 332
					}

					var40 = Login.xPadding + 500; // L: 334
					if (MouseHandler.MouseHandler_lastPressedX >= var40 && MouseHandler.MouseHandler_lastPressedX <= var40 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 335
						class153.changeWorldSelectSorting(2, 0); // L: 336
						break; // L: 337
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var40 + 15 && MouseHandler.MouseHandler_lastPressedX <= var40 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 339
						class153.changeWorldSelectSorting(2, 1); // L: 340
						break; // L: 341
					}

					var41 = Login.xPadding + 610; // L: 343
					if (MouseHandler.MouseHandler_lastPressedX >= var41 && MouseHandler.MouseHandler_lastPressedX <= var41 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 344
						class153.changeWorldSelectSorting(3, 0); // L: 345
						break; // L: 346
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var41 + 15 && MouseHandler.MouseHandler_lastPressedX <= var41 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 348
						class153.changeWorldSelectSorting(3, 1); // L: 349
						break; // L: 350
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 352
						Login.worldSelectOpen = false; // L: 354
						Buddy.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 355
						SecureRandomCallable.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 356
						GrandExchangeEvents.logoSprite.drawAt(Login.xPadding + 382 - GrandExchangeEvents.logoSprite.subWidth / 2, 18); // L: 357
						break; // L: 359
					}

					if (Login.hoveredWorldIndex != -1) { // L: 361
						World var42 = World.World_worlds[Login.hoveredWorldIndex]; // L: 362
						if (var42.isDeadman()) { // L: 363
							var42.field821 = "beta"; // L: 364
						}

						var51 = false; // L: 366
						if (var42.properties != Client.worldProperties) { // L: 367
							boolean var52 = (Client.worldProperties & class526.field5160.rsOrdinal()) != 0; // L: 368
							var11 = var42.isDeadman(); // L: 369
							if (var52 && !var11 || !var52 && var11) { // L: 370
								var51 = true; // L: 371
							}
						}

						class465.changeWorld(var42); // L: 374
						Login.worldSelectOpen = false; // L: 376
						Buddy.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 377
						SecureRandomCallable.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 378
						GrandExchangeEvents.logoSprite.drawAt(Login.xPadding + 382 - GrandExchangeEvents.logoSprite.subWidth / 2, 18); // L: 379
						if (var51) { // L: 381
							class281.method5621(); // L: 382
						}
					} else {
						if (Login.worldSelectPage > 0 && class174.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class174.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= GameEngine.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= GameEngine.canvasHeight / 2 + 50) { // L: 386
							--Login.worldSelectPage; // L: 387
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && Login.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class524.canvasWidth - Login.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class524.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= GameEngine.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= GameEngine.canvasHeight / 2 + 50) { // L: 389
							++Login.worldSelectPage; // L: 390
						}
					}
					break;
				}

				if (var39.field2393 == 13) { // L: 295
					Login.worldSelectOpen = false; // L: 297
					Buddy.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 298
					SecureRandomCallable.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 299
					GrandExchangeEvents.logoSprite.drawAt(Login.xPadding + 382 - GrandExchangeEvents.logoSprite.subWidth / 2, 18); // L: 300
					break; // L: 302
				}

				if (var39.field2393 == 96) { // L: 304
					if (Login.worldSelectPage > 0 && class174.worldSelectLeftSprite != null) { // L: 305
						--Login.worldSelectPage; // L: 306
					}
				} else if (var39.field2393 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && Login.worldSelectRightSprite != null) { // L: 309 310
					++Login.worldSelectPage; // L: 311
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !SoundCache.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 396
				class93.clientPreferences.method2589(!class93.clientPreferences.method2546()); // L: 397
				if (!class93.clientPreferences.method2546()) { // L: 398
					ArrayList var3 = new ArrayList(); // L: 399
					var3.add(new class331(WorldMapSection0.field2587, "scape main", "", 255, false)); // L: 400
					LoginScreenAnimation.method2528(var3, 0, 0, 0, 100, false); // L: 401
				} else {
					Actor.method2488(0, 0); // L: 403
				}

				FontName.method9049(); // L: 404
			}

			if (Client.gameState != 5) { // L: 406
				if (Login.field939 == -1L) { // L: 407
					Login.field939 = UserComparator9.method2973() + 1000L; // L: 408
				}

				long var23 = UserComparator9.method2973(); // L: 410
				if (class10.method99() && -1L == Login.field940) { // L: 411 412
					Login.field940 = var23; // L: 413
					if (Login.field940 > Login.field939) { // L: 414
						Login.field939 = Login.field940; // L: 415
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 419
					if (Language.Language_EN == class92.clientLanguage) { // L: 420
						if (MouseHandler.MouseHandler_lastButton == 1 || !SoundCache.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 421
							var5 = Login.xPadding + 5; // L: 422
							short var6 = 463; // L: 423
							byte var7 = 100; // L: 424
							byte var25 = 35; // L: 425
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var7 + var5 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var6 + var25) { // L: 426
								ItemContainer.method2350(); // L: 427
								return; // L: 428
							}
						}

						if (class101.World_request != null) { // L: 431
							ItemContainer.method2350();
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton; // L: 433
					var40 = MouseHandler.MouseHandler_lastPressedX; // L: 434
					var41 = MouseHandler.MouseHandler_lastPressedY; // L: 435
					if (var5 == 0) { // L: 436
						var40 = MouseHandler.MouseHandler_x; // L: 437
						var41 = MouseHandler.MouseHandler_y; // L: 438
					}

					if (!SoundCache.mouseCam && var5 == 4) { // L: 440
						var5 = 1;
					}

					class226 var8 = SoundSystem.method879(); // L: 441
					short var44;
					int var45;
					if (Login.loginIndex == 0) { // L: 442
						var51 = false; // L: 443

						while (var8.method4424()) { // L: 444
							if (var8.field2393 == 84) { // L: 445
								var51 = true; // L: 446
							}
						}

						var45 = class433.loginBoxCenter - 80; // L: 449
						var44 = 291; // L: 450
						if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20) { // L: 451
							class217.openURL(MouseRecorder.method2371("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 452
						}

						var45 = class433.loginBoxCenter + 80; // L: 454
						if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20 || var51) { // L: 455
							if ((Client.worldProperties & class526.field5151.rsOrdinal()) != 0) { // L: 457
								Login.Login_response0 = ""; // L: 458
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 459
								Login.Login_response2 = "Your normal account will not be affected."; // L: 460
								Login.Login_response3 = ""; // L: 461
								Actor.method2489(1); // L: 462
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 464
									Login.currentLoginField = 1; // L: 465
								} else {
									Login.currentLoginField = 0; // L: 468
								}
							} else if ((Client.worldProperties & class526.field5136.rsOrdinal()) != 0) { // L: 472
								if ((Client.worldProperties & class526.field5135.rsOrdinal()) != 0) { // L: 473
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 474
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 475
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 476
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 479
									Login.Login_response2 = "Players can attack each other"; // L: 480
									Login.Login_response3 = "almost everywhere."; // L: 481
								}

								Login.Login_response0 = "Warning!"; // L: 483
								Actor.method2489(1); // L: 484
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 486
									Login.currentLoginField = 1; // L: 487
								} else {
									Login.currentLoginField = 0; // L: 490
								}
							} else if ((Client.worldProperties & class526.field5135.rsOrdinal()) != 0) { // L: 494
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 495
								Login.Login_response2 = "The Protect Item prayer will"; // L: 496
								Login.Login_response3 = "not work on this world."; // L: 497
								Login.Login_response0 = "Warning!"; // L: 498
								Actor.method2489(1); // L: 499
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 501
									Login.currentLoginField = 1; // L: 502
								} else {
									Login.currentLoginField = 0; // L: 505
								}
							} else {
								GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(false); // L: 510
							}
						}
					} else {
						int var9;
						short var10;
						if (Login.loginIndex == 1) { // L: 515
							while (true) {
								if (!var8.method4424()) { // L: 516
									var9 = class433.loginBoxCenter - 80; // L: 524
									var10 = 321; // L: 525
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 526
										GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(false); // L: 527
									}

									var9 = class433.loginBoxCenter + 80; // L: 529
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 530
										Actor.method2489(0); // L: 531
									}
									break;
								}

								if (var8.field2393 == 84) { // L: 517
									GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(false); // L: 518
								} else if (var8.field2393 == 13) { // L: 520
									Actor.method2489(0); // L: 521
								}
							}
						} else {
							boolean var18;
							short var43;
							boolean var46;
							if (Login.loginIndex == 2) { // L: 534
								var43 = 201; // L: 535
								var9 = var43 + 52; // L: 536
								if (var5 == 1 && var41 >= var9 - 12 && var41 < var9 + 2) { // L: 537
									Login.currentLoginField = 0;
								}

								var9 += 15; // L: 538
								if (var5 == 1 && var41 >= var9 - 12 && var41 < var9 + 2) { // L: 539
									Login.currentLoginField = 1;
								}

								var9 += 15; // L: 540
								var43 = 361; // L: 541
								if (WorldMapSection0.field2593 != null) { // L: 542
									var45 = WorldMapSection0.field2593.highX / 2; // L: 543
									if (var5 == 1 && var40 >= WorldMapSection0.field2593.lowX - var45 && var40 <= var45 + WorldMapSection0.field2593.lowX && var41 >= var43 - 15 && var41 < var43) { // L: 544
										switch(Login.field916) { // L: 545
										case 1:
											class217.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false); // L: 548
											return; // L: 549
										case 2:
											class217.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 553
										}
									}
								}

								var45 = class433.loginBoxCenter - 80; // L: 559
								var44 = 321; // L: 560
								if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20) { // L: 561
									Login.Login_username = Login.Login_username.trim(); // L: 563
									if (Login.Login_username.length() == 0) { // L: 564
										class142.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 565
									} else if (Login.Login_password.length() == 0) { // L: 568
										class142.setLoginResponseString("", "Please enter your password.", ""); // L: 569
									} else {
										class142.setLoginResponseString("", "Connecting to server...", ""); // L: 572
										ParamComposition.method3870(false); // L: 573
										class131.method3087(20); // L: 574
									}

									return; // L: 576
								}

								var45 = Login.loginBoxX + 180 + 80; // L: 578
								if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20) { // L: 579
									Actor.method2489(0); // L: 580
									Login.Login_username = ""; // L: 581
									Login.Login_password = ""; // L: 582
									class130.field1525 = 0; // L: 583
									class148.otp = ""; // L: 584
									Login.field913 = true; // L: 585
								}

								var45 = class433.loginBoxCenter + -117; // L: 587
								var44 = 277; // L: 588
								Login.field928 = var40 >= var45 && var40 < var45 + class31.field168 && var41 >= var44 && var41 < var44 + Skills.field3911; // L: 589
								if (var5 == 1 && Login.field928) { // L: 590
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 591
									if (!Client.Login_isUsernameRemembered && class93.clientPreferences.method2553() != null) { // L: 592
										class93.clientPreferences.method2604((String)null); // L: 593
									}
								}

								var45 = class433.loginBoxCenter + 24; // L: 596
								var44 = 277; // L: 597
								Login.field929 = var40 >= var45 && var40 < var45 + class31.field168 && var41 >= var44 && var41 < var44 + Skills.field3911; // L: 598
								if (var5 == 1 && Login.field929) { // L: 599
									class93.clientPreferences.method2536(!class93.clientPreferences.method2619()); // L: 600
									if (!class93.clientPreferences.method2619()) { // L: 601
										Login.Login_username = ""; // L: 602
										class93.clientPreferences.method2604((String)null); // L: 603
										if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 605
											Login.currentLoginField = 1; // L: 606
										} else {
											Login.currentLoginField = 0; // L: 609
										}
									}
								}

								label1650:
								while (true) {
									int var48;
									Transferable var55;
									do {
										while (true) {
											char var47;
											label1566:
											do {
												while (true) {
													while (var8.method4424()) { // L: 614
														if (var8.field2393 != 13) { // L: 615
															if (Login.currentLoginField != 0) { // L: 624
																continue label1566;
															}

															class331.method6302(var8.field2402); // L: 625
															if (var8.field2393 == 85 && Login.Login_username.length() > 0) { // L: 626
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var8.field2393 == 84 || var8.field2393 == 80) { // L: 627
																Login.currentLoginField = 1;
															}

															var47 = var8.field2402; // L: 629
															var46 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var47) != -1; // L: 631
															if (var46 && Login.Login_username.length() < 320) { // L: 633
																Login.Login_username = Login.Login_username + var8.field2402;
															}
														} else {
															Actor.method2489(0); // L: 616
															Login.Login_username = ""; // L: 617
															Login.Login_password = ""; // L: 618
															class130.field1525 = 0; // L: 619
															class148.otp = ""; // L: 620
															Login.field913 = true; // L: 621
														}
													}

													return; // L: 1127
												}
											} while(Login.currentLoginField != 1); // L: 635

											if (var8.field2393 == 85 && Login.Login_password.length() > 0) { // L: 636
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 637
											} else if (var8.field2393 == 84 || var8.field2393 == 80) { // L: 639
												Login.currentLoginField = 0; // L: 640
												if (var8.field2393 == 84) { // L: 641
													Login.Login_username = Login.Login_username.trim(); // L: 642
													if (Login.Login_username.length() == 0) { // L: 643
														class142.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 644
														return; // L: 645
													}

													if (Login.Login_password.length() == 0) { // L: 647
														class142.setLoginResponseString("", "Please enter your password.", ""); // L: 648
														return; // L: 649
													}

													class142.setLoginResponseString("", "Connecting to server...", ""); // L: 651
													ParamComposition.method3870(false); // L: 652
													class131.method3087(20); // L: 653
													return; // L: 654
												}
											}

											if ((var8.method4426(82) || var8.method4426(87)) && var8.field2393 == 67) { // L: 657
												Clipboard var54 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 658
												var55 = var54.getContents(VertexNormal.client); // L: 659
												var48 = 20 - Login.Login_password.length(); // L: 660
												break;
											}

											var47 = var8.field2402; // L: 710
											if ((var47 < ' ' || var47 >= 127) && (var47 <= 127 || var47 >= 160) && (var47 <= 160 || var47 > 255)) { // L: 712
												label1800: {
													if (var47 != 0) { // L: 716
														char[] var56 = class400.cp1252AsciiExtension; // L: 718

														for (int var57 = 0; var57 < var56.length; ++var57) { // L: 719
															char var16 = var56[var57]; // L: 720
															if (var16 == var47) { // L: 722
																var46 = true; // L: 723
																break label1800; // L: 724
															}
														}
													}

													var46 = false; // L: 730
												}
											} else {
												var46 = true; // L: 713
											}

											if (var46 && MouseHandler.method706(var8.field2402) && Login.Login_password.length() < 20) { // L: 732
												Login.Login_password = Login.Login_password + var8.field2402; // L: 733
											}
										}
									} while(var48 <= 0); // L: 661

									try {
										String var15 = (String)var55.getTransferData(DataFlavor.stringFlavor); // L: 663
										int var49 = Math.min(var48, var15.length()); // L: 664
										int var50 = 0;

										while (true) {
											if (var50 >= var49) {
												Login.Login_password = Login.Login_password + var15.substring(0, var49); // L: 702
												continue label1650;
											}

											char var19 = var15.charAt(var50); // L: 668
											if (var19 >= ' ' && var19 < 127 || var19 > 127 && var19 < 160 || var19 > 160 && var19 <= 255) { // L: 670
												var18 = true; // L: 671
											} else {
												label1815: {
													if (var19 != 0) { // L: 674
														char[] var20 = class400.cp1252AsciiExtension; // L: 676

														for (int var21 = 0; var21 < var20.length; ++var21) { // L: 677
															char var22 = var20[var21]; // L: 678
															if (var19 == var22) { // L: 680
																var18 = true; // L: 681
																break label1815; // L: 682
															}
														}
													}

													var18 = false; // L: 688
												}
											}

											if (!var18) { // L: 690
												break;
											}

											char var53 = var15.charAt(var50); // L: 692
											boolean var28 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var53) != -1; // L: 694
											if (!var28) { // L: 696
												break;
											}

											++var50; // L: 665
										}

										Actor.method2489(3); // L: 698
										return; // L: 699
									} catch (UnsupportedFlavorException var37) { // L: 704
									} catch (IOException var38) { // L: 705
									}
								}
							} else {
								Bounds var31;
								if (Login.loginIndex == 3) { // L: 740
									var9 = Login.loginBoxX + 180; // L: 741
									var10 = 241; // L: 742
									var31 = var1.method7761(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var9, var10); // L: 743
									if (var5 == 1 && var31.method8481(var40, var41)) { // L: 744
										class217.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 745
									}

									var9 = Login.loginBoxX + 180; // L: 747
									var10 = 276; // L: 748
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 749
										class408.method7592(false); // L: 750
									}

									var9 = Login.loginBoxX + 180; // L: 752
									var10 = 326; // L: 753
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 754
										class217.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false); // L: 755
										return; // L: 756
									}
								} else {
									int var12;
									if (Login.loginIndex == 4) { // L: 759
										var9 = Login.loginBoxX + 180 - 80; // L: 760
										var10 = 321; // L: 761
										if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 762
											class148.otp.trim(); // L: 763
											if (class148.otp.length() != 6) { // L: 764
												class142.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 765
												return; // L: 766
											}

											class130.field1525 = Integer.parseInt(class148.otp); // L: 768
											class148.otp = ""; // L: 769
											ParamComposition.method3870(true); // L: 770
											class142.setLoginResponseString("", "Connecting to server...", ""); // L: 771
											class131.method3087(20); // L: 772
											return; // L: 773
										}

										if (var5 == 1 && var40 >= Login.loginBoxX + 180 - 9 && var40 <= Login.loginBoxX + 180 + 130 && var41 >= 263 && var41 <= 296) { // L: 775
											Login.field913 = !Login.field913; // L: 776
										}

										if (var5 == 1 && var40 >= Login.loginBoxX + 180 - 34 && var40 <= Login.loginBoxX + 34 + 180 && var41 >= 351 && var41 <= 363) { // L: 778
											class217.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false); // L: 779
										}

										var9 = Login.loginBoxX + 180 + 80; // L: 781
										if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 782
											Actor.method2489(0); // L: 783
											Login.Login_username = ""; // L: 784
											Login.Login_password = ""; // L: 785
											class130.field1525 = 0; // L: 786
											class148.otp = ""; // L: 787
										}

										while (var8.method4424()) { // L: 789
											var11 = false; // L: 790

											for (var12 = 0; var12 < "1234567890".length(); ++var12) { // L: 791
												if (var8.field2402 == "1234567890".charAt(var12)) { // L: 792
													var11 = true; // L: 793
													break; // L: 794
												}
											}

											if (var8.field2393 == 13) { // L: 797
												Actor.method2489(0); // L: 798
												Login.Login_username = ""; // L: 799
												Login.Login_password = ""; // L: 800
												class130.field1525 = 0; // L: 801
												class148.otp = ""; // L: 802
											} else {
												if (var8.field2393 == 85 && class148.otp.length() > 0) { // L: 805
													class148.otp = class148.otp.substring(0, class148.otp.length() - 1);
												}

												if (var8.field2393 == 84) { // L: 806
													class148.otp.trim(); // L: 807
													if (class148.otp.length() != 6) { // L: 808
														class142.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 809
														return; // L: 810
													}

													class130.field1525 = Integer.parseInt(class148.otp); // L: 812
													class148.otp = ""; // L: 813
													ParamComposition.method3870(true); // L: 814
													class142.setLoginResponseString("", "Connecting to server...", ""); // L: 815
													class131.method3087(20); // L: 816
													return; // L: 817
												}

												if (var11 && class148.otp.length() < 6) { // L: 819
													class148.otp = class148.otp + var8.field2402;
												}
											}
										}
									} else {
										int var13;
										if (Login.loginIndex == 5) { // L: 823
											var9 = Login.loginBoxX + 180 - 80; // L: 824
											var10 = 321; // L: 825
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 826
												MusicPatchNode2.method6037(); // L: 827
												return; // L: 828
											}

											var9 = Login.loginBoxX + 180 + 80; // L: 830
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 831
												GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(true); // L: 832
											}

											var44 = 361; // L: 834
											if (class126.field1486 != null) { // L: 835
												var12 = class126.field1486.highX / 2; // L: 836
												if (var5 == 1 && var40 >= class126.field1486.lowX - var12 && var40 <= var12 + class126.field1486.lowX && var41 >= var44 - 15 && var41 < var44) { // L: 837
													class217.openURL(MouseRecorder.method2371("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 838
												}
											}

											while (var8.method4424()) { // L: 841
												var46 = false; // L: 842

												for (var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var13) { // L: 843
													if (var8.field2402 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13)) { // L: 844
														var46 = true; // L: 845
														break; // L: 846
													}
												}

												if (var8.field2393 == 13) { // L: 849
													GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(true); // L: 850
												} else {
													if (var8.field2393 == 85 && Login.Login_username.length() > 0) { // L: 853
														Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
													}

													if (var8.field2393 == 84) { // L: 854
														MusicPatchNode2.method6037(); // L: 855
														return; // L: 856
													}

													if (var46 && Login.Login_username.length() < 320) { // L: 858
														Login.Login_username = Login.Login_username + var8.field2402;
													}
												}
											}
										} else if (Login.loginIndex != 6) { // L: 862
											if (Login.loginIndex == 7) { // L: 873
												if (class373.field4355 && !Client.onMobile) { // L: 874
													var9 = class433.loginBoxCenter - 150; // L: 875
													var45 = var9 + 40 + 240 + 25; // L: 876
													var44 = 231; // L: 877
													var12 = var44 + 40; // L: 878
													if (var5 == 1 && var40 >= var9 && var40 <= var45 && var41 >= var44 && var41 <= var12) { // L: 879
														Login.field924 = UrlRequester.method2902(var9, var40); // L: 880
													}

													var13 = Login.loginBoxX + 180 - 80; // L: 882
													short var14 = 321; // L: 883
													boolean var17;
													boolean var30;
													Date var32;
													if (var5 == 1 && var40 >= var13 - 75 && var40 <= var13 + 75 && var41 >= var14 - 20 && var41 <= var14 + 20) { // L: 884
														label1450: {
															try {
																var32 = NPCComposition.method3743(); // L: 889
															} catch (ParseException var36) { // L: 891
																ScriptEvent.method2361("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 892
																var30 = false; // L: 893
																break label1450; // L: 894
															}

															if (var32 == null) { // L: 896
																var30 = false; // L: 897
															} else {
																var17 = class314.method6005(var32); // L: 900
																var18 = class151.method3312(var32); // L: 901
																if (!var18) { // L: 902
																	ScriptEvent.method2361("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 903
																	var30 = false; // L: 904
																} else {
																	if (!var17) { // L: 907
																		class105.field1340 = 8388607; // L: 908
																	} else {
																		class105.field1340 = (int)(var32.getTime() / 86400000L - 11745L); // L: 911
																	}

																	var30 = true; // L: 913
																}
															}
														}

														if (var30) { // L: 916
															class131.method3087(50); // L: 917
															return; // L: 918
														}
													}

													var13 = Login.loginBoxX + 180 + 80; // L: 921
													if (var5 == 1 && var40 >= var13 - 75 && var40 <= var13 + 75 && var41 >= var14 - 20 && var41 <= var14 + 20) { // L: 922
														Login.field934 = new String[8]; // L: 923
														GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(true); // L: 924
													}

													while (var8.method4424()) { // L: 926
														if (var8.field2393 == 101) { // L: 927
															Login.field934[Login.field924] = null; // L: 928
														}

														if (var8.field2393 == 85) { // L: 930
															if (Login.field934[Login.field924] == null && Login.field924 > 0) { // L: 931
																--Login.field924; // L: 932
															}

															Login.field934[Login.field924] = null; // L: 934
														}

														if (var8.field2402 >= '0' && var8.field2402 <= '9') { // L: 936
															Login.field934[Login.field924] = "" + var8.field2402; // L: 937
															if (Login.field924 < 7) { // L: 938
																++Login.field924; // L: 939
															}
														}

														if (var8.field2393 == 84) { // L: 942
															label1386: {
																try {
																	var32 = NPCComposition.method3743(); // L: 947
																} catch (ParseException var35) { // L: 949
																	ScriptEvent.method2361("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 950
																	var30 = false; // L: 951
																	break label1386; // L: 952
																}

																if (var32 == null) { // L: 954
																	var30 = false; // L: 955
																} else {
																	var17 = class314.method6005(var32); // L: 958
																	var18 = class151.method3312(var32); // L: 959
																	if (!var18) { // L: 960
																		ScriptEvent.method2361("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 961
																		var30 = false; // L: 962
																	} else {
																		if (!var17) { // L: 965
																			class105.field1340 = 8388607; // L: 966
																		} else {
																			class105.field1340 = (int)(var32.getTime() / 86400000L - 11745L); // L: 969
																		}

																		var30 = true; // L: 971
																	}
																}
															}

															if (var30) { // L: 974
																class131.method3087(50); // L: 975
															}

															return; // L: 977
														}
													}
												} else {
													var9 = Login.loginBoxX + 180 - 80; // L: 982
													var10 = 321; // L: 983
													if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 984
														class217.openURL(MouseRecorder.method2371("secure", true) + "m=dob/set_dob.ws", true, false); // L: 985
														class142.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 986
														Actor.method2489(6); // L: 987
														return; // L: 988
													}

													var9 = Login.loginBoxX + 180 + 80; // L: 990
													if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 991
														GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(true); // L: 992
													}
												}
											} else if (Login.loginIndex == 8) { // L: 996
												var9 = Login.loginBoxX + 180 - 80; // L: 997
												var10 = 321; // L: 998
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 999
													class217.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1000
													class142.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1001
													Actor.method2489(6); // L: 1002
													return; // L: 1003
												}

												var9 = Login.loginBoxX + 180 + 80; // L: 1005
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 1006
													GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(true); // L: 1007
												}
											} else if (Login.loginIndex == 9) { // L: 1010
												var9 = Login.loginBoxX + 180; // L: 1011
												var10 = 311; // L: 1012
												if (var8.field2393 == 84 || var8.field2393 == 13 || var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 1013
													class408.method7592(false); // L: 1014
												}
											} else if (Login.loginIndex == 10) { // L: 1017
												var9 = Login.loginBoxX + 180; // L: 1018
												var10 = 209; // L: 1019
												if (var8.field2393 == 84 || var5 == 1 && var40 >= var9 - 109 && var40 <= var9 + 109 && var41 >= var10 && var41 <= var10 + 68) { // L: 1020
													class142.setLoginResponseString("", "Connecting to server...", ""); // L: 1021
													Client.field626 = class535.field5233; // L: 1022
													ParamComposition.method3870(false); // L: 1023
													class131.method3087(20); // L: 1024
												}
											} else if (Login.loginIndex == 12) { // L: 1027
												var9 = class433.loginBoxCenter; // L: 1028
												var10 = 233; // L: 1029
												var31 = var2.method7761(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 1030
												Bounds var26 = var2.method7761(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 1031
												Bounds var27 = var2.method7761(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 1032
												var45 = var10 + 17; // L: 1033
												Bounds var29 = var2.method7761(0, 34, "<col=ffd200>agreement (EULA)</col>.", var9, var45); // L: 1034
												if (var5 == 1) { // L: 1035
													if (var31.method8481(var40, var41)) { // L: 1036
														class217.openURL("https://www.jagex.com/terms", true, false); // L: 1037
													} else if (var26.method8481(var40, var41)) { // L: 1039
														class217.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1040
													} else if (var27.method8481(var40, var41) || var29.method8481(var40, var41)) { // L: 1042
														class217.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 1043
													}
												}

												var9 = class433.loginBoxCenter - 80; // L: 1046
												var10 = 311; // L: 1047
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 1048
													AbstractWorldMapData.method5016(); // L: 1049
													class408.method7592(true); // L: 1050
												}

												var9 = class433.loginBoxCenter + 80; // L: 1052
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 1053
													Login.loginIndex = 13; // L: 1054
												}
											} else if (Login.loginIndex == 13) { // L: 1057
												var9 = class433.loginBoxCenter; // L: 1058
												var10 = 321; // L: 1059
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 1060
													class408.method7592(true); // L: 1061
												}
											} else if (Login.loginIndex == 14) { // L: 1064
												String var34 = ""; // L: 1065
												switch(Login.field919) { // L: 1066
												case 0:
													var34 = "https://secure.runescape.com/m=offence-appeal/account-history"; // L: 1077
													break;
												case 1:
													var34 = "https://secure.runescape.com/m=accountappeal/passwordrecovery"; // L: 1071
													break; // L: 1072
												case 2:
													var34 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance"; // L: 1074
													break; // L: 1075
												default:
													GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(false); // L: 1068
												}

												var45 = Login.loginBoxX + 180; // L: 1080
												var44 = 276; // L: 1081
												if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20) { // L: 1082
													class217.openURL(var34, true, false); // L: 1083
													class142.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1084
													Actor.method2489(6); // L: 1085
													return; // L: 1086
												}

												var45 = Login.loginBoxX + 180; // L: 1088
												var44 = 326; // L: 1089
												if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20) { // L: 1090
													GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(false); // L: 1091
												}
											} else if (Login.loginIndex == 24) { // L: 1094
												var9 = Login.loginBoxX + 180; // L: 1095
												var10 = 301; // L: 1096
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 1097
													class408.method7592(false); // L: 1098
												}
											} else if (Login.loginIndex == 32) { // L: 1101
												var9 = Login.loginBoxX + 180 - 80; // L: 1102
												var10 = 321; // L: 1103
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 1104
													class217.openURL(MouseRecorder.method2371("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1105
													class142.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1106
													Actor.method2489(6); // L: 1107
													return; // L: 1108
												}

												var9 = Login.loginBoxX + 180 + 80; // L: 1110
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 1111
													GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(true); // L: 1112
												}
											} else if (Login.loginIndex == 33) { // L: 1115
												var9 = Login.loginBoxX + 180; // L: 1116
												var10 = 276; // L: 1117
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 1118
													class217.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 1119
												}

												var9 = Login.loginBoxX + 180; // L: 1121
												var10 = 326; // L: 1122
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 1123
													GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(true); // L: 1124
												}
											}
										} else {
											while (true) {
												do {
													if (!var8.method4424()) { // L: 863
														var43 = 321; // L: 868
														if (var5 == 1 && var41 >= var43 - 20 && var41 <= var43 + 20) { // L: 869
															GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(true); // L: 870
														}

														return;
													}
												} while(var8.field2393 != 84 && var8.field2393 != 13); // L: 864

												GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(true); // L: 865
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
	} // L: 394
}
