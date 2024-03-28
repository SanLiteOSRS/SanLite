import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
@Implements("Huffman")
public class Huffman {
	@ObfuscatedName("az")
	@Export("masks")
	int[] masks;
	@ObfuscatedName("ah")
	@Export("bits")
	byte[] bits;
	@ObfuscatedName("af")
	@Export("keys")
	int[] keys;

	public Huffman(byte[] var1) {
		int var2 = var1.length; // L: 9
		this.masks = new int[var2]; // L: 10
		this.bits = var1; // L: 11
		int[] var3 = new int[33]; // L: 12
		this.keys = new int[8]; // L: 13
		int var4 = 0; // L: 14

		for (int var5 = 0; var5 < var2; ++var5) { // L: 15
			byte var6 = var1[var5]; // L: 16
			if (var6 != 0) { // L: 17
				int var7 = 1 << 32 - var6; // L: 18
				int var8 = var3[var6]; // L: 19
				this.masks[var5] = var8; // L: 20
				int var9;
				int var10;
				int var11;
				int var12;
				if ((var8 & var7) != 0) { // L: 22
					var9 = var3[var6 - 1];
				} else {
					var9 = var8 | var7; // L: 24

					for (var10 = var6 - 1; var10 >= 1; --var10) { // L: 25
						var11 = var3[var10]; // L: 26
						if (var8 != var11) { // L: 27
							break;
						}

						var12 = 1 << 32 - var10; // L: 28
						if ((var11 & var12) != 0) { // L: 29
							var3[var10] = var3[var10 - 1];
							break;
						}

						var3[var10] = var11 | var12; // L: 33
					}
				}

				var3[var6] = var9; // L: 38

				for (var10 = var6 + 1; var10 <= 32; ++var10) { // L: 39
					if (var8 == var3[var10]) { // L: 40
						var3[var10] = var9;
					}
				}

				var10 = 0; // L: 42

				for (var11 = 0; var11 < var6; ++var11) { // L: 43
					var12 = Integer.MIN_VALUE >>> var11; // L: 44
					if ((var8 & var12) != 0) { // L: 45
						if (this.keys[var10] == 0) { // L: 46
							this.keys[var10] = var4;
						}

						var10 = this.keys[var10]; // L: 47
					} else {
						++var10; // L: 49
					}

					if (var10 >= this.keys.length) { // L: 50
						int[] var13 = new int[this.keys.length * 2]; // L: 51

						for (int var14 = 0; var14 < this.keys.length; ++var14) { // L: 52
							var13[var14] = this.keys[var14];
						}

						this.keys = var13; // L: 53
					}

					var12 >>>= 1; // L: 55
				}

				this.keys[var10] = ~var5; // L: 57
				if (var10 >= var4) { // L: 58
					var4 = var10 + 1;
				}
			}
		}

	} // L: 60

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BII[BII)I",
		garbageValue = "-1453891319"
	)
	@Export("compress")
	int compress(byte[] var1, int var2, int var3, byte[] var4, int var5) {
		int var6 = 0; // L: 63
		int var7 = var5 << 3; // L: 64

		for (var3 += var2; var2 < var3; ++var2) { // L: 65 66
			int var8 = var1[var2] & 255; // L: 67
			int var9 = this.masks[var8]; // L: 68
			byte var10 = this.bits[var8]; // L: 69
			if (var10 == 0) { // L: 70
				throw new RuntimeException("" + var8);
			}

			int var11 = var7 >> 3; // L: 71
			int var12 = var7 & 7; // L: 72
			var6 &= -var12 >> 31; // L: 73
			int var13 = (var10 + var12 - 1 >> 3) + var11; // L: 74
			var12 += 24; // L: 76
			var4[var11] = (byte)(var6 |= var9 >>> var12); // L: 77
			if (var11 < var13) { // L: 78
				++var11; // L: 79
				var12 -= 8; // L: 80
				var4[var11] = (byte)(var6 = var9 >>> var12); // L: 81
				if (var11 < var13) { // L: 82
					++var11; // L: 83
					var12 -= 8; // L: 84
					var4[var11] = (byte)(var6 = var9 >>> var12); // L: 85
					if (var11 < var13) { // L: 86
						++var11; // L: 87
						var12 -= 8; // L: 88
						var4[var11] = (byte)(var6 = var9 >>> var12); // L: 89
						if (var11 < var13) { // L: 90
							++var11; // L: 91
							var12 -= 8; // L: 92
							var4[var11] = (byte)(var6 = var9 << -var12); // L: 93
						}
					}
				}
			}

			var7 += var10; // L: 95
		}

		return (var7 + 7 >> 3) - var5; // L: 97
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([BI[BIII)I",
		garbageValue = "-1825869816"
	)
	@Export("decompress")
	int decompress(byte[] var1, int var2, byte[] var3, int var4, int var5) {
		if (var5 == 0) { // L: 101
			return 0;
		} else {
			int var6 = 0; // L: 102
			var5 += var4; // L: 103
			int var7 = var2;

			while (true) {
				byte var8 = var1[var7]; // L: 106
				if (var8 < 0) { // L: 108
					var6 = this.keys[var6];
				} else {
					++var6; // L: 109
				}

				int var9;
				if ((var9 = this.keys[var6]) < 0) { // L: 110
					var3[var4++] = (byte)(~var9); // L: 111
					if (var4 >= var5) { // L: 112
						break;
					}

					var6 = 0; // L: 113
				}

				if ((var8 & 64) != 0) { // L: 115
					var6 = this.keys[var6];
				} else {
					++var6; // L: 116
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 117
					var3[var4++] = (byte)(~var9); // L: 118
					if (var4 >= var5) { // L: 119
						break;
					}

					var6 = 0; // L: 120
				}

				if ((var8 & 32) != 0) { // L: 122
					var6 = this.keys[var6];
				} else {
					++var6; // L: 123
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 124
					var3[var4++] = (byte)(~var9); // L: 125
					if (var4 >= var5) { // L: 126
						break;
					}

					var6 = 0; // L: 127
				}

				if ((var8 & 16) != 0) { // L: 129
					var6 = this.keys[var6];
				} else {
					++var6; // L: 130
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 131
					var3[var4++] = (byte)(~var9); // L: 132
					if (var4 >= var5) { // L: 133
						break;
					}

					var6 = 0; // L: 134
				}

				if ((var8 & 8) != 0) { // L: 136
					var6 = this.keys[var6];
				} else {
					++var6; // L: 137
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 138
					var3[var4++] = (byte)(~var9); // L: 139
					if (var4 >= var5) { // L: 140
						break;
					}

					var6 = 0; // L: 141
				}

				if ((var8 & 4) != 0) { // L: 143
					var6 = this.keys[var6];
				} else {
					++var6; // L: 144
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 145
					var3[var4++] = (byte)(~var9); // L: 146
					if (var4 >= var5) { // L: 147
						break;
					}

					var6 = 0; // L: 148
				}

				if ((var8 & 2) != 0) { // L: 150
					var6 = this.keys[var6];
				} else {
					++var6; // L: 151
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 152
					var3[var4++] = (byte)(~var9); // L: 153
					if (var4 >= var5) { // L: 154
						break;
					}

					var6 = 0; // L: 155
				}

				if ((var8 & 1) != 0) { // L: 157
					var6 = this.keys[var6];
				} else {
					++var6; // L: 158
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 159
					var3[var4++] = (byte)(~var9); // L: 160
					if (var4 >= var5) { // L: 161
						break;
					}

					var6 = 0; // L: 162
				}

				++var7; // L: 105
			}

			return var7 + 1 - var2; // L: 165
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lok;",
		garbageValue = "-1274553546"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field4347, PlayerType.field4346, PlayerType.field4341, PlayerType.PlayerType_ironman, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_ultimateIronman, PlayerType.field4339, PlayerType.field4342, PlayerType.field4345, PlayerType.field4348, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_normal, PlayerType.field4344, PlayerType.field4350, PlayerType.field4352, PlayerType.field4343, PlayerType.PlayerType_playerModerator}; // L: 30
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lbx;Lpx;Lpx;I)V",
		garbageValue = "1403933499"
	)
	static void method6808(GameEngine var0, Font var1, Font var2) {
		int var6;
		int var10;
		int var37;
		boolean var41;
		if (Login.worldSelectOpen) { // L: 331
			class228 var35 = class522.method9126(); // L: 333

			while (true) {
				if (!var35.method4337()) { // L: 334
					if (MouseHandler.MouseHandler_lastButton != 1 && (class412.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) { // L: 350
						break;
					}

					int var4 = Login.xPadding + 280; // L: 351
					if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 352
						DynamicObject.changeWorldSelectSorting(0, 0); // L: 353
						break; // L: 354
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 356
						DynamicObject.changeWorldSelectSorting(0, 1); // L: 357
						break; // L: 358
					}

					int var36 = Login.xPadding + 390; // L: 360
					if (MouseHandler.MouseHandler_lastPressedX >= var36 && MouseHandler.MouseHandler_lastPressedX <= var36 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 361
						DynamicObject.changeWorldSelectSorting(1, 0); // L: 362
						break; // L: 363
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var36 + 15 && MouseHandler.MouseHandler_lastPressedX <= var36 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 365
						DynamicObject.changeWorldSelectSorting(1, 1); // L: 366
						break; // L: 367
					}

					var6 = Login.xPadding + 500; // L: 369
					if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var6 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 370
						DynamicObject.changeWorldSelectSorting(2, 0); // L: 371
						break; // L: 372
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var6 + 15 && MouseHandler.MouseHandler_lastPressedX <= var6 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 374
						DynamicObject.changeWorldSelectSorting(2, 1); // L: 375
						break; // L: 376
					}

					var37 = Login.xPadding + 610; // L: 378
					if (MouseHandler.MouseHandler_lastPressedX >= var37 && MouseHandler.MouseHandler_lastPressedX <= var37 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 379
						DynamicObject.changeWorldSelectSorting(3, 0); // L: 380
						break; // L: 381
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var37 + 15 && MouseHandler.MouseHandler_lastPressedX <= var37 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 383
						DynamicObject.changeWorldSelectSorting(3, 1); // L: 384
						break; // L: 385
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 387
						Varps.method6255(); // L: 388
						break; // L: 389
					}

					if (Login.hoveredWorldIndex != -1) { // L: 391
						World var8 = World.World_worlds[Login.hoveredWorldIndex]; // L: 392
						var10 = Client.worldProperties; // L: 394
						class530 var11 = class530.field5203; // L: 395
						boolean var38 = (var10 & var11.rsOrdinal()) != 0; // L: 397
						var41 = var8.isDeadman(); // L: 400
						ScriptFrame.field460 = var41; // L: 401
						var8.field831 = var41 ? "beta" : var8.field831; // L: 402
						class30.changeWorld(var8); // L: 403
						Varps.method6255(); // L: 404
						if (var38 != var41) { // L: 405
							class441.method7995(); // L: 406
						}
					} else {
						if (Login.worldSelectPage > 0 && UserComparator2.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= UserComparator2.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class342.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class342.canvasHeight / 2 + 50) { // L: 410
							--Login.worldSelectPage; // L: 411
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && DirectByteArrayCopier.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class148.canvasWidth - DirectByteArrayCopier.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class148.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class342.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class342.canvasHeight / 2 + 50) { // L: 413
							++Login.worldSelectPage; // L: 414
						}
					}
					break;
				}

				if (var35.field2440 == 13) { // L: 335
					Varps.method6255(); // L: 336
					break; // L: 337
				}

				if (var35.field2440 == 96) { // L: 339
					if (Login.worldSelectPage > 0 && UserComparator2.worldSelectLeftSprite != null) { // L: 340
						--Login.worldSelectPage; // L: 341
					}
				} else if (var35.field2440 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && DirectByteArrayCopier.worldSelectRightSprite != null) { // L: 344 345
					++Login.worldSelectPage; // L: 346
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class412.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 420
				NPC.clientPreferences.method2520(!NPC.clientPreferences.method2463()); // L: 421
				if (!NPC.clientPreferences.method2463()) { // L: 423
					ArrayList var3 = new ArrayList(); // L: 424
					var3.add(new class333(UserComparator6.field1508, "scape main", "", 255, false)); // L: 425
					Renderable.method4881(var3, 0, 0, 0, 100, false); // L: 426
				} else {
					class11.method108(0, 0); // L: 428
				}

				UserComparator5.method2897(); // L: 430
			}

			if (Client.gameState != 5) { // L: 432
				if (-1L == Login.field959) { // L: 433
					Login.field959 = VerticalAlignment.method3924() + 1000L; // L: 434
				}

				long var21 = VerticalAlignment.method3924(); // L: 436
				boolean var5;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 439
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) { // L: 443
							var5 = true; // L: 451
							break;
						}

						ArchiveLoader var23 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 444
						if (!var23.isLoaded()) { // L: 445
							var5 = false; // L: 446
							break; // L: 447
						}

						++Client.archiveLoadersDone; // L: 449
					}
				} else {
					var5 = true; // L: 440
				}

				if (var5 && -1L == Login.field960) { // L: 453 454
					Login.field960 = var21; // L: 455
					if (Login.field960 > Login.field959) { // L: 456
						Login.field959 = Login.field960; // L: 457
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 461
					if (GraphicsObject.clientLanguage == Language.Language_EN) { // L: 462
						if (MouseHandler.MouseHandler_lastButton == 1 || !class412.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 463
							var6 = Login.xPadding + 5; // L: 464
							short var7 = 463; // L: 465
							byte var24 = 100; // L: 466
							byte var9 = 35; // L: 467
							if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var24 + var6 && MouseHandler.MouseHandler_lastPressedY >= var7 && MouseHandler.MouseHandler_lastPressedY <= var9 + var7) { // L: 468
								class127.method2958(); // L: 469
								return; // L: 470
							}
						}

						if (class529.World_request != null) { // L: 473
							class127.method2958();
						}
					}

					var6 = MouseHandler.MouseHandler_lastButton; // L: 475
					var37 = MouseHandler.MouseHandler_lastPressedX; // L: 476
					int var48 = MouseHandler.MouseHandler_lastPressedY; // L: 477
					if (var6 == 0) { // L: 478
						var37 = MouseHandler.MouseHandler_x; // L: 479
						var48 = MouseHandler.MouseHandler_y; // L: 480
					}

					if (!class412.mouseCam && var6 == 4) { // L: 482
						var6 = 1;
					}

					class228 var25 = class522.method9126(); // L: 483
					short var40;
					int var50;
					if (Login.loginIndex == 0) { // L: 484
						boolean var47 = false; // L: 485

						while (var25.method4337()) { // L: 486
							if (var25.field2440 == 84) { // L: 487
								var47 = true; // L: 488
							}
						}

						var50 = ReflectionCheck.loginBoxCenter - 80; // L: 491
						var40 = 291; // L: 492
						if (var6 == 1 && var37 >= var50 - 75 && var37 <= var50 + 75 && var48 >= var40 - 20 && var48 <= var40 + 20) { // L: 493
							class129.openURL(WorldMapData_0.method5235("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 494
						}

						var50 = ReflectionCheck.loginBoxCenter + 80; // L: 496
						if (var6 == 1 && var37 >= var50 - 75 && var37 <= var50 + 75 && var48 >= var40 - 20 && var48 <= var40 + 20 || var47) { // L: 497
							class228.method4350(); // L: 498
						}
					} else {
						short var26;
						if (Login.loginIndex == 1) { // L: 501
							while (true) {
								if (!var25.method4337()) { // L: 502
									var10 = ReflectionCheck.loginBoxCenter - 80; // L: 510
									var26 = 321; // L: 511
									if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) { // L: 512
										class130.Login_promptCredentials(false); // L: 513
									}

									var10 = ReflectionCheck.loginBoxCenter + 80; // L: 515
									if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) { // L: 516
										class210.method3930(0); // L: 517
									}
									break;
								}

								if (var25.field2440 == 84) { // L: 503
									class130.Login_promptCredentials(false); // L: 504
								} else if (var25.field2440 == 13) { // L: 506
									class210.method3930(0); // L: 507
								}
							}
						} else {
							int var14;
							int var15;
							short var39;
							if (Login.loginIndex == 2) { // L: 520
								var39 = 201; // L: 521
								var10 = var39 + 52; // L: 522
								if (var6 == 1 && var48 >= var10 - 12 && var48 < var10 + 2) { // L: 523
									Login.currentLoginField = 0;
								}

								var10 += 15; // L: 524
								if (var6 == 1 && var48 >= var10 - 12 && var48 < var10 + 2) { // L: 525
									Login.currentLoginField = 1;
								}

								var10 += 15; // L: 526
								var39 = 361; // L: 527
								if (Players.field1381 != null) { // L: 528
									var50 = Players.field1381.highX / 2; // L: 529
									if (var6 == 1 && var37 >= Players.field1381.lowX - var50 && var37 <= var50 + Players.field1381.lowX && var48 >= var39 - 15 && var48 < var39) { // L: 530
										switch(Login.field938) { // L: 531
										case 1:
											class129.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false); // L: 539
											return; // L: 540
										case 2:
											class129.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 534
										}
									}
								}

								var50 = ReflectionCheck.loginBoxCenter - 80; // L: 545
								var40 = 321; // L: 546
								if (var6 == 1 && var37 >= var50 - 75 && var37 <= var50 + 75 && var48 >= var40 - 20 && var48 <= var40 + 20) { // L: 547
									Login.Login_username = Login.Login_username.trim(); // L: 549
									if (Login.Login_username.length() == 0) { // L: 550
										class59.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 551
									} else if (Login.Login_password.length() == 0) { // L: 554
										class59.setLoginResponseString("", "Please enter your password.", ""); // L: 555
									} else {
										class59.setLoginResponseString("", "Connecting to server...", ""); // L: 558
										class27.method399(false); // L: 559
										FaceNormal.method4886(20); // L: 560
									}

									return; // L: 562
								}

								var50 = Login.loginBoxX + 180 + 80; // L: 564
								if (var6 == 1 && var37 >= var50 - 75 && var37 <= var50 + 75 && var48 >= var40 - 20 && var48 <= var40 + 20) { // L: 565
									class210.method3930(0); // L: 566
									Login.Login_username = ""; // L: 567
									Login.Login_password = ""; // L: 568
									SpriteMask.field3628 = 0; // L: 569
									class27.otp = ""; // L: 570
									Login.field951 = true; // L: 571
								}

								var50 = ReflectionCheck.loginBoxCenter + -117; // L: 573
								var40 = 277; // L: 574
								Login.field949 = var37 >= var50 && var37 < var50 + MouseHandler.field228 && var48 >= var40 && var48 < var40 + class227.field2427; // L: 575
								if (var6 == 1 && Login.field949) { // L: 576
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 577
									if (!Client.Login_isUsernameRemembered && NPC.clientPreferences.method2547() != null) { // L: 578
										NPC.clientPreferences.method2476((String)null); // L: 579
									}
								}

								var50 = ReflectionCheck.loginBoxCenter + 24; // L: 582
								var40 = 277; // L: 583
								Login.field950 = var37 >= var50 && var37 < var50 + MouseHandler.field228 && var48 >= var40 && var48 < var40 + class227.field2427; // L: 584
								if (var6 == 1 && Login.field950) { // L: 585
									NPC.clientPreferences.method2538(!NPC.clientPreferences.method2461()); // L: 586
									if (!NPC.clientPreferences.method2461()) { // L: 587
										Login.Login_username = ""; // L: 588
										NPC.clientPreferences.method2476((String)null); // L: 589
										Friend.method8099(); // L: 590
									}
								}

								label1501:
								while (true) {
									Transferable var51;
									do {
										while (true) {
											label1465:
											do {
												while (true) {
													while (var25.method4337()) { // L: 593
														if (var25.field2440 != 13) { // L: 594
															if (Login.currentLoginField != 0) { // L: 603
																continue label1465;
															}

															char var42 = var25.field2428; // L: 604

															for (var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var42 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14); ++var14) { // L: 606 607
															}

															if (var25.field2440 == 85 && Login.Login_username.length() > 0) { // L: 610
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var25.field2440 == 84 || var25.field2440 == 80) { // L: 611
																Login.currentLoginField = 1;
															}

															char var44 = var25.field2428; // L: 613
															boolean var45 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var44) != -1; // L: 615
															if (var45 && Login.Login_username.length() < 320) { // L: 617
																Login.Login_username = Login.Login_username + var25.field2428;
															}
														} else {
															class210.method3930(0); // L: 595
															Login.Login_username = ""; // L: 596
															Login.Login_password = ""; // L: 597
															SpriteMask.field3628 = 0; // L: 598
															class27.otp = ""; // L: 599
															Login.field951 = true; // L: 600
														}
													}

													return; // L: 1033
												}
											} while(Login.currentLoginField != 1); // L: 619

											if (var25.field2440 == 85 && Login.Login_password.length() > 0) { // L: 620
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 621
											} else if (var25.field2440 == 84 || var25.field2440 == 80) { // L: 623
												Login.currentLoginField = 0; // L: 624
												if (var25.field2440 == 84) { // L: 625
													Login.Login_username = Login.Login_username.trim(); // L: 627
													if (Login.Login_username.length() == 0) { // L: 628
														class59.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 629
													} else if (Login.Login_password.length() == 0) { // L: 632
														class59.setLoginResponseString("", "Please enter your password.", ""); // L: 633
													} else {
														class59.setLoginResponseString("", "Connecting to server...", ""); // L: 636
														class27.method399(false); // L: 637
														FaceNormal.method4886(20); // L: 638
													}

													return; // L: 640
												}
											}

											if ((var25.method4318(82) || var25.method4318(87)) && var25.field2440 == 67) { // L: 643
												Clipboard var49 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 644
												var51 = var49.getContents(UrlRequest.client); // L: 645
												var15 = 20 - Login.Login_password.length(); // L: 646
												break;
											}

											if (HealthBar.method2576(var25.field2428)) { // L: 671
												char var46 = var25.field2428; // L: 673
												var41 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var46) != -1; // L: 675
												if (var41 && Login.Login_password.length() < 20) { // L: 677 678
													Login.Login_password = Login.Login_password + var25.field2428; // L: 679
												}
											}
										}
									} while(var15 <= 0); // L: 647

									try {
										String var16 = (String)var51.getTransferData(DataFlavor.stringFlavor); // L: 649
										int var17 = Math.min(var15, var16.length()); // L: 650
										int var18 = 0;

										while (true) {
											if (var18 >= var17) {
												Login.Login_password = Login.Login_password + var16.substring(0, var17); // L: 665
												continue label1501;
											}

											if (!HealthBar.method2576(var16.charAt(var18))) { // L: 653
												break;
											}

											char var20 = var16.charAt(var18); // L: 655
											boolean var19 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var20) != -1; // L: 657
											if (!var19) { // L: 659
												break;
											}

											++var18; // L: 651
										}

										class210.method3930(3); // L: 661
										return; // L: 662
									} catch (UnsupportedFlavorException var33) { // L: 667
									} catch (IOException var34) { // L: 668
									}
								}
							} else {
								Bounds var29;
								if (Login.loginIndex == 3) { // L: 687
									var10 = Login.loginBoxX + 180; // L: 688
									var26 = 241; // L: 689
									var29 = var1.method7662(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var10, var26); // L: 690
									if (var6 == 1 && var29.method8344(var37, var48)) { // L: 691
										class129.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 692
									}

									var10 = Login.loginBoxX + 180; // L: 694
									var26 = 276; // L: 695
									if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) { // L: 696
										class172.method3497(false); // L: 697
									}

									var10 = Login.loginBoxX + 180; // L: 699
									var26 = 326; // L: 700
									if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) { // L: 701
										class129.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false); // L: 702
										return; // L: 703
									}
								} else {
									int var13;
									if (Login.loginIndex == 4) { // L: 706
										var10 = Login.loginBoxX + 180 - 80; // L: 707
										var26 = 321; // L: 708
										if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) { // L: 709
											class27.otp.trim(); // L: 711
											if (class27.otp.length() != 6) { // L: 712
												class59.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 713
											} else {
												SpriteMask.field3628 = Integer.parseInt(class27.otp); // L: 716
												class27.otp = ""; // L: 717
												class27.method399(true); // L: 718
												class59.setLoginResponseString("", "Connecting to server...", ""); // L: 719
												FaceNormal.method4886(20); // L: 720
											}

											return; // L: 722
										}

										if (var6 == 1 && var37 >= Login.loginBoxX + 180 - 9 && var37 <= Login.loginBoxX + 180 + 130 && var48 >= 263 && var48 <= 296) { // L: 724
											Login.field951 = !Login.field951; // L: 725
										}

										if (var6 == 1 && var37 >= Login.loginBoxX + 180 - 34 && var37 <= Login.loginBoxX + 34 + 180 && var48 >= 351 && var48 <= 363) { // L: 727
											class129.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false); // L: 728
										}

										var10 = Login.loginBoxX + 180 + 80; // L: 730
										if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) { // L: 731
											class210.method3930(0); // L: 732
											Login.Login_username = ""; // L: 733
											Login.Login_password = ""; // L: 734
											SpriteMask.field3628 = 0; // L: 735
											class27.otp = ""; // L: 736
										}

										while (var25.method4337()) { // L: 738
											boolean var12 = false; // L: 739

											for (var13 = 0; var13 < "1234567890".length(); ++var13) { // L: 740
												if (var25.field2428 == "1234567890".charAt(var13)) { // L: 741
													var12 = true; // L: 742
													break; // L: 743
												}
											}

											if (var25.field2440 == 13) { // L: 746
												class210.method3930(0); // L: 747
												Login.Login_username = ""; // L: 748
												Login.Login_password = ""; // L: 749
												SpriteMask.field3628 = 0; // L: 750
												class27.otp = ""; // L: 751
											} else {
												if (var25.field2440 == 85 && class27.otp.length() > 0) { // L: 754
													class27.otp = class27.otp.substring(0, class27.otp.length() - 1);
												}

												if (var25.field2440 == 84) { // L: 755
													class27.otp.trim(); // L: 757
													if (class27.otp.length() != 6) { // L: 758
														class59.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 759
													} else {
														SpriteMask.field3628 = Integer.parseInt(class27.otp); // L: 762
														class27.otp = ""; // L: 763
														class27.method399(true); // L: 764
														class59.setLoginResponseString("", "Connecting to server...", ""); // L: 765
														FaceNormal.method4886(20); // L: 766
													}

													return; // L: 768
												}

												if (var12 && class27.otp.length() < 6) { // L: 770
													class27.otp = class27.otp + var25.field2428;
												}
											}
										}
									} else if (Login.loginIndex == 5) { // L: 774
										var10 = Login.loginBoxX + 180 - 80; // L: 775
										var26 = 321; // L: 776
										if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) { // L: 777
											WorldMapIcon_0.method5610(); // L: 778
											return; // L: 779
										}

										var10 = Login.loginBoxX + 180 + 80; // L: 781
										if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) { // L: 782
											class130.Login_promptCredentials(true); // L: 783
										}

										var40 = 361; // L: 785
										if (class136.field1626 != null) { // L: 786
											var13 = class136.field1626.highX / 2; // L: 787
											if (var6 == 1 && var37 >= class136.field1626.lowX - var13 && var37 <= var13 + class136.field1626.lowX && var48 >= var40 - 15 && var48 < var40) { // L: 788
												class129.openURL(WorldMapData_0.method5235("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 789
											}
										}

										while (var25.method4337()) { // L: 792
											var41 = false; // L: 793

											for (var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var14) { // L: 794
												if (var25.field2428 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14)) { // L: 795
													var41 = true; // L: 796
													break; // L: 797
												}
											}

											if (var25.field2440 == 13) { // L: 800
												class130.Login_promptCredentials(true); // L: 801
											} else {
												if (var25.field2440 == 85 && Login.Login_username.length() > 0) { // L: 804
													Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
												}

												if (var25.field2440 == 84) { // L: 805
													WorldMapIcon_0.method5610(); // L: 806
													return; // L: 807
												}

												if (var41 && Login.Login_username.length() < 320) { // L: 809
													Login.Login_username = Login.Login_username + var25.field2428;
												}
											}
										}
									} else if (Login.loginIndex != 6) { // L: 813
										if (Login.loginIndex == 7) { // L: 824
											if (WorldMapRectangle.field3108 && !Client.onMobile) { // L: 825
												var10 = ReflectionCheck.loginBoxCenter - 150; // L: 826
												var50 = var10 + 40 + 240 + 25; // L: 827
												var40 = 231; // L: 828
												var13 = var40 + 40; // L: 829
												if (var6 == 1 && var37 >= var10 && var37 <= var50 && var48 >= var40 && var48 <= var13) { // L: 830
													var15 = var10; // L: 832
													int var30 = 0;

													while (true) {
														if (var30 >= 8) {
															var14 = 0; // L: 842
															break;
														}

														if (var37 <= var15 + 30) { // L: 835
															var14 = var30; // L: 836
															break; // L: 837
														}

														var15 += 30; // L: 839
														var15 += var30 != 1 && var30 != 3 ? 5 : 20; // L: 840
														++var30; // L: 834
													}

													Login.field946 = var14; // L: 844
												}

												var14 = Login.loginBoxX + 180 - 80; // L: 846
												short var43 = 321; // L: 847
												boolean var52;
												if (var6 == 1 && var37 >= var14 - 75 && var37 <= var14 + 75 && var48 >= var43 - 20 && var48 <= var43 + 20) { // L: 848
													var52 = class130.method3011(); // L: 849
													if (var52) { // L: 850
														FaceNormal.method4886(50); // L: 851
														return; // L: 852
													}
												}

												var14 = Login.loginBoxX + 180 + 80; // L: 855
												if (var6 == 1 && var37 >= var14 - 75 && var37 <= var14 + 75 && var48 >= var43 - 20 && var48 <= var43 + 20) { // L: 856
													Login.field931 = new String[8]; // L: 857
													class130.Login_promptCredentials(true); // L: 858
												}

												while (var25.method4337()) { // L: 860
													if (var25.field2440 == 101) { // L: 861
														Login.field931[Login.field946] = null; // L: 862
													}

													if (var25.field2440 == 85) { // L: 864
														if (Login.field931[Login.field946] == null && Login.field946 > 0) { // L: 865
															--Login.field946; // L: 866
														}

														Login.field931[Login.field946] = null; // L: 868
													}

													if (var25.field2428 >= '0' && var25.field2428 <= '9') { // L: 870
														Login.field931[Login.field946] = "" + var25.field2428; // L: 871
														if (Login.field946 < 7) { // L: 872
															++Login.field946; // L: 873
														}
													}

													if (var25.field2440 == 84) { // L: 876
														var52 = class130.method3011(); // L: 877
														if (var52) { // L: 878
															FaceNormal.method4886(50); // L: 879
														}

														return; // L: 881
													}
												}
											} else {
												var10 = Login.loginBoxX + 180 - 80; // L: 886
												var26 = 321; // L: 887
												if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) { // L: 888
													class129.openURL(WorldMapData_0.method5235("secure", true) + "m=dob/set_dob.ws", true, false); // L: 889
													class59.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 890
													class210.method3930(6); // L: 891
													return; // L: 892
												}

												var10 = Login.loginBoxX + 180 + 80; // L: 894
												if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) { // L: 895
													class130.Login_promptCredentials(true); // L: 896
												}
											}
										} else if (Login.loginIndex == 8) { // L: 900
											var10 = Login.loginBoxX + 180 - 80; // L: 901
											var26 = 321; // L: 902
											if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) { // L: 903
												class129.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 904
												class59.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 905
												class210.method3930(6); // L: 906
												return; // L: 907
											}

											var10 = Login.loginBoxX + 180 + 80; // L: 909
											if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) { // L: 910
												class130.Login_promptCredentials(true); // L: 911
											}
										} else if (Login.loginIndex == 9) { // L: 914
											var10 = Login.loginBoxX + 180; // L: 915
											var26 = 311; // L: 916
											if (var25.field2440 == 84 || var25.field2440 == 13 || var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) { // L: 917
												class172.method3497(false); // L: 918
											}
										} else if (Login.loginIndex == 10) { // L: 921
											var10 = Login.loginBoxX + 180; // L: 922
											var26 = 209; // L: 923
											if (var25.field2440 == 84 || var6 == 1 && var37 >= var10 - 109 && var37 <= var10 + 109 && var48 >= var26 && var48 <= var26 + 68) { // L: 924
												class59.setLoginResponseString("", "Connecting to server...", ""); // L: 925
												Client.field810 = class539.field5285; // L: 926
												class27.method399(false); // L: 927
												FaceNormal.method4886(20); // L: 928
											}
										} else if (Login.loginIndex == 12) { // L: 931
											var10 = ReflectionCheck.loginBoxCenter; // L: 932
											var26 = 233; // L: 933
											var29 = var2.method7662(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var26); // L: 934
											Bounds var27 = var2.method7662(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var26); // L: 935
											Bounds var28 = var2.method7662(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var26); // L: 936
											var50 = var26 + 17; // L: 937
											Bounds var31 = var2.method7662(0, 34, "<col=ffd200>agreement (EULA)</col>.", var10, var50); // L: 938
											if (var6 == 1) { // L: 939
												if (var29.method8344(var37, var48)) { // L: 940
													class129.openURL("https://www.jagex.com/terms", true, false); // L: 941
												} else if (var27.method8344(var37, var48)) { // L: 943
													class129.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 944
												} else if (var28.method8344(var37, var48) || var31.method8344(var37, var48)) { // L: 946
													class129.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 947
												}
											}

											var10 = ReflectionCheck.loginBoxCenter - 80; // L: 950
											var26 = 311; // L: 951
											if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) { // L: 952
												NPC.clientPreferences.method2478(Client.field513); // L: 954
												class172.method3497(true); // L: 956
											}

											var10 = ReflectionCheck.loginBoxCenter + 80; // L: 958
											if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) { // L: 959
												Login.loginIndex = 13; // L: 960
											}
										} else if (Login.loginIndex == 13) { // L: 963
											var10 = ReflectionCheck.loginBoxCenter; // L: 964
											var26 = 321; // L: 965
											if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) { // L: 966
												class172.method3497(true); // L: 967
											}
										} else if (Login.loginIndex == 14) { // L: 970
											String var32 = ""; // L: 971
											switch(Login.field957) { // L: 972
											case 0:
												var32 = "https://secure.runescape.com/m=offence-appeal/account-history"; // L: 977
												break; // L: 978
											case 1:
												var32 = "https://secure.runescape.com/m=accountappeal/passwordrecovery"; // L: 983
												break;
											case 2:
												var32 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance"; // L: 980
												break; // L: 981
											default:
												class130.Login_promptCredentials(false); // L: 974
											}

											var50 = Login.loginBoxX + 180; // L: 986
											var40 = 276; // L: 987
											if (var6 == 1 && var37 >= var50 - 75 && var37 <= var50 + 75 && var48 >= var40 - 20 && var48 <= var40 + 20) { // L: 988
												class129.openURL(var32, true, false); // L: 989
												class59.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 990
												class210.method3930(6); // L: 991
												return; // L: 992
											}

											var50 = Login.loginBoxX + 180; // L: 994
											var40 = 326; // L: 995
											if (var6 == 1 && var37 >= var50 - 75 && var37 <= var50 + 75 && var48 >= var40 - 20 && var48 <= var40 + 20) { // L: 996
												class130.Login_promptCredentials(false); // L: 997
											}
										} else if (Login.loginIndex == 24) { // L: 1000
											var10 = Login.loginBoxX + 180; // L: 1001
											var26 = 301; // L: 1002
											if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) { // L: 1003
												class172.method3497(false); // L: 1004
											}
										} else if (Login.loginIndex == 32) { // L: 1007
											var10 = Login.loginBoxX + 180 - 80; // L: 1008
											var26 = 321; // L: 1009
											if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) { // L: 1010
												class129.openURL(WorldMapData_0.method5235("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1011
												class59.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1012
												class210.method3930(6); // L: 1013
												return; // L: 1014
											}

											var10 = Login.loginBoxX + 180 + 80; // L: 1016
											if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) { // L: 1017
												class130.Login_promptCredentials(true); // L: 1018
											}
										} else if (Login.loginIndex == 33) { // L: 1021
											var10 = Login.loginBoxX + 180; // L: 1022
											var26 = 276; // L: 1023
											if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) { // L: 1024
												class129.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 1025
											}

											var10 = Login.loginBoxX + 180; // L: 1027
											var26 = 326; // L: 1028
											if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) { // L: 1029
												class130.Login_promptCredentials(true); // L: 1030
											}
										}
									} else {
										while (true) {
											do {
												if (!var25.method4337()) { // L: 814
													var39 = 321; // L: 819
													if (var6 == 1 && var48 >= var39 - 20 && var48 <= var39 + 20) { // L: 820
														class130.Login_promptCredentials(true); // L: 821
													}

													return;
												}
											} while(var25.field2440 != 84 && var25.field2440 != 13); // L: 815

											class130.Login_promptCredentials(true); // L: 816
										}
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 418
}
