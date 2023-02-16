import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("db")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("vq")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("ur")
	@ObfuscatedGetter(
		intValue = -2145885545
	)
	static int field1404;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1193707915
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lrd;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1900433183
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("l")
	boolean field1397;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -74398163
	)
	int field1398;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -460541475
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	ServerPacket field1405;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	ServerPacket field1401;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	ServerPacket field1402;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1397 = true; // L: 22
		this.field1398 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "30455"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-60"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) { // L: 37
			this.buffer.offset = 0; // L: 38

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last(); // L: 40
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) { // L: 41 42
					this.socket.write(this.buffer.array, 0, this.buffer.offset); // L: 49
					this.pendingWrites = 0; // L: 50
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index); // L: 43
				this.bufferSize -= var1.index; // L: 44
				var1.remove(); // L: 45
				var1.packetBuffer.releaseArray(); // L: 46
				var1.release(); // L: 47
			}
		}

	} // L: 52

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lji;B)V",
		garbageValue = "35"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lov;S)V",
		garbageValue = "-25572"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-365633246"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Lov;",
		garbageValue = "-5"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Laj;Lnv;I)V",
		garbageValue = "1044238917"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1) {
		if (Login.worldSelectOpen) { // L: 323
			HealthBar.method2610(var0); // L: 324
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !FriendsChatMember.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 327
				clientPreferences.method2563(!clientPreferences.method2570()); // L: 328
				if (!clientPreferences.method2570()) { // L: 329
					Skeleton.method4454(class153.archive6, "scape main", "", 255, false);
				} else {
					class177.method3538(); // L: 330
				}
			}

			if (Client.gameState != 5) { // L: 332
				if (-1L == Login.field921) { // L: 333
					Login.field921 = class153.method3317() + 1000L; // L: 334
				}

				long var2 = class153.method3317(); // L: 336
				boolean var4;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 339
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) { // L: 343
							var4 = true; // L: 351
							break;
						}

						ArchiveLoader var5 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 344
						if (!var5.isLoaded()) { // L: 345
							var4 = false; // L: 346
							break; // L: 347
						}

						++Client.archiveLoadersDone; // L: 349
					}
				} else {
					var4 = true; // L: 340
				}

				if (var4 && -1L == Login.field904) { // L: 353 354
					Login.field904 = var2; // L: 355
					if (Login.field904 > Login.field921) { // L: 356
						Login.field921 = Login.field904; // L: 357
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 361
					int var21;
					if (class36.clientLanguage == Language.Language_EN) { // L: 362
						if (MouseHandler.MouseHandler_lastButton == 1 || !FriendsChatMember.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 363
							var21 = Login.xPadding + 5; // L: 364
							short var6 = 463; // L: 365
							byte var7 = 100; // L: 366
							byte var8 = 35; // L: 367
							if (MouseHandler.MouseHandler_lastPressedX >= var21 && MouseHandler.MouseHandler_lastPressedX <= var7 + var21 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var8 + var6) { // L: 368
								GroundObject.method4315(); // L: 369
								return; // L: 370
							}
						}

						if (ClanChannel.World_request != null) { // L: 373
							GroundObject.method4315();
						}
					}

					var21 = MouseHandler.MouseHandler_lastButton; // L: 375
					int var31 = MouseHandler.MouseHandler_lastPressedX; // L: 376
					int var32 = MouseHandler.MouseHandler_lastPressedY; // L: 377
					if (var21 == 0) { // L: 378
						var31 = MouseHandler.MouseHandler_x; // L: 379
						var32 = MouseHandler.MouseHandler_y; // L: 380
					}

					if (!FriendsChatMember.mouseCam && var21 == 4) { // L: 382
						var21 = 1;
					}

					class205 var22 = Client.field702; // L: 385
					class205 var9 = var22; // L: 387
					int var34;
					short var35;
					if (Login.loginIndex == 0) { // L: 388
						boolean var42 = false; // L: 389

						while (var9.method4141()) { // L: 390
							if (var9.field2339 == 84) { // L: 391
								var42 = true; // L: 392
							}
						}

						var34 = class143.loginBoxCenter - 80; // L: 395
						var35 = 291; // L: 396
						if (var21 == 1 && var31 >= var34 - 75 && var31 <= var34 + 75 && var32 >= var35 - 20 && var32 <= var35 + 20) { // L: 397
							AttackOption.openURL(class310.method6356("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 398
						}

						var34 = class143.loginBoxCenter + 80; // L: 400
						if (var21 == 1 && var31 >= var34 - 75 && var31 <= var34 + 75 && var32 >= var35 - 20 && var32 <= var35 + 20 || var42) { // L: 401
							if ((Client.worldProperties & 33554432) != 0) { // L: 402
								Login.Login_response0 = ""; // L: 403
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 404
								Login.Login_response2 = "Your normal account will not be affected."; // L: 405
								Login.Login_response3 = ""; // L: 406
								ReflectionCheck.method696(1); // L: 407
								class361.method6967(); // L: 408
							} else if ((Client.worldProperties & 4) != 0) { // L: 410
								if ((Client.worldProperties & 1024) != 0) { // L: 411
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 412
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 413
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 414
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 417
									Login.Login_response2 = "Players can attack each other"; // L: 418
									Login.Login_response3 = "almost everywhere."; // L: 419
								}

								Login.Login_response0 = "Warning!"; // L: 421
								ReflectionCheck.method696(1); // L: 422
								class361.method6967(); // L: 423
							} else if ((Client.worldProperties & 1024) != 0) { // L: 425
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 426
								Login.Login_response2 = "The Protect Item prayer will"; // L: 427
								Login.Login_response3 = "not work on this world."; // L: 428
								Login.Login_response0 = "Warning!"; // L: 429
								ReflectionCheck.method696(1); // L: 430
								class361.method6967(); // L: 431
							} else {
								UserComparator6.Login_promptCredentials(false); // L: 434
							}
						}
					} else {
						int var10;
						short var11;
						if (Login.loginIndex == 1) { // L: 438
							while (true) {
								if (!var9.method4141()) { // L: 439
									var10 = class143.loginBoxCenter - 80; // L: 447
									var11 = 321; // L: 448
									if (var21 == 1 && var31 >= var10 - 75 && var31 <= var10 + 75 && var32 >= var11 - 20 && var32 <= var11 + 20) { // L: 449
										UserComparator6.Login_promptCredentials(false); // L: 450
									}

									var10 = class143.loginBoxCenter + 80; // L: 452
									if (var21 == 1 && var31 >= var10 - 75 && var31 <= var10 + 75 && var32 >= var11 - 20 && var32 <= var11 + 20) { // L: 453
										ReflectionCheck.method696(0); // L: 454
									}
									break;
								}

								if (var9.field2339 == 84) { // L: 440
									UserComparator6.Login_promptCredentials(false); // L: 441
								} else if (var9.field2339 == 13) { // L: 443
									ReflectionCheck.method696(0); // L: 444
								}
							}
						} else {
							int var14;
							int var15;
							short var33;
							boolean var36;
							if (Login.loginIndex == 2) { // L: 457
								var33 = 201; // L: 458
								var10 = var33 + 52; // L: 459
								if (var21 == 1 && var32 >= var10 - 12 && var32 < var10 + 2) { // L: 460
									Login.currentLoginField = 0;
								}

								var10 += 15; // L: 461
								if (var21 == 1 && var32 >= var10 - 12 && var32 < var10 + 2) { // L: 462
									Login.currentLoginField = 1;
								}

								var10 += 15; // L: 463
								var33 = 361; // L: 464
								if (Calendar.field3727 != null) { // L: 465
									var34 = Calendar.field3727.highX / 2; // L: 466
									if (var21 == 1 && var31 >= Calendar.field3727.lowX - var34 && var31 <= var34 + Calendar.field3727.lowX && var32 >= var33 - 15 && var32 < var33) { // L: 467
										switch(Login.field917) { // L: 468
										case 1:
											class70.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 471
											ReflectionCheck.method696(5); // L: 472
											return; // L: 473
										case 2:
											AttackOption.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 477
										}
									}
								}

								var34 = class143.loginBoxCenter - 80; // L: 483
								var35 = 321; // L: 484
								if (var21 == 1 && var31 >= var34 - 75 && var31 <= var34 + 75 && var32 >= var35 - 20 && var32 <= var35 + 20) { // L: 485
									Login.Login_username = Login.Login_username.trim(); // L: 486
									if (Login.Login_username.length() == 0) { // L: 487
										class70.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 488
										return; // L: 489
									}

									if (Login.Login_password.length() == 0) { // L: 491
										class70.setLoginResponseString("", "Please enter your password.", ""); // L: 492
										return; // L: 493
									}

									class70.setLoginResponseString("", "Connecting to server...", ""); // L: 495
									class373.method7183(false); // L: 496
									class246.method5251(20); // L: 497
									return; // L: 498
								}

								var34 = Login.loginBoxX + 180 + 80; // L: 500
								if (var21 == 1 && var31 >= var34 - 75 && var31 <= var34 + 75 && var32 >= var35 - 20 && var32 <= var35 + 20) { // L: 501
									ReflectionCheck.method696(0); // L: 502
									Login.Login_username = ""; // L: 503
									Login.Login_password = ""; // L: 504
									UserComparator4.field1429 = 0; // L: 505
									InvDefinition.otp = ""; // L: 506
									Login.field930 = true; // L: 507
								}

								var34 = class143.loginBoxCenter + -117; // L: 509
								var35 = 277; // L: 510
								Login.field939 = var31 >= var34 && var31 < var34 + WorldMapRectangle.field2963 && var32 >= var35 && var32 < var35 + class134.field1613; // L: 511
								if (var21 == 1 && Login.field939) { // L: 512
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 513
									if (!Client.Login_isUsernameRemembered && clientPreferences.method2545() != null) { // L: 514
										clientPreferences.method2500((String)null); // L: 515
									}
								}

								var34 = class143.loginBoxCenter + 24; // L: 518
								var35 = 277; // L: 519
								Login.field934 = var31 >= var34 && var31 < var34 + WorldMapRectangle.field2963 && var32 >= var35 && var32 < var35 + class134.field1613; // L: 520
								if (var21 == 1 && Login.field934) { // L: 521
									clientPreferences.method2483(!clientPreferences.method2484()); // L: 522
									if (!clientPreferences.method2484()) { // L: 523
										Login.Login_username = ""; // L: 524
										clientPreferences.method2500((String)null); // L: 525
										class361.method6967(); // L: 526
									}
								}

								label1246:
								while (true) {
									Transferable var44;
									do {
										while (true) {
											label1210:
											do {
												while (true) {
													while (var9.method4141()) { // L: 529
														if (var9.field2339 != 13) { // L: 530
															if (Login.currentLoginField != 0) { // L: 539
																continue label1210;
															}

															char var37 = var9.field2333; // L: 540

															for (var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var37 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14); ++var14) { // L: 542 543
															}

															if (var9.field2339 == 85 && Login.Login_username.length() > 0) { // L: 546
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var9.field2339 == 84 || var9.field2339 == 80) { // L: 547
																Login.currentLoginField = 1;
															}

															char var39 = var9.field2333; // L: 549
															boolean var40 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var39) != -1; // L: 551
															if (var40 && Login.Login_username.length() < 320) { // L: 553
																Login.Login_username = Login.Login_username + var9.field2333;
															}
														} else {
															ReflectionCheck.method696(0); // L: 531
															Login.Login_username = ""; // L: 532
															Login.Login_password = ""; // L: 533
															UserComparator4.field1429 = 0; // L: 534
															InvDefinition.otp = ""; // L: 535
															Login.field930 = true; // L: 536
														}
													}

													return; // L: 944
												}
											} while(Login.currentLoginField != 1); // L: 555

											if (var9.field2339 == 85 && Login.Login_password.length() > 0) { // L: 556
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 557
											} else if (var9.field2339 == 84 || var9.field2339 == 80) { // L: 559
												Login.currentLoginField = 0; // L: 560
												if (var9.field2339 == 84) { // L: 561
													Login.Login_username = Login.Login_username.trim(); // L: 562
													if (Login.Login_username.length() == 0) { // L: 563
														class70.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 564
														return; // L: 565
													}

													if (Login.Login_password.length() == 0) { // L: 567
														class70.setLoginResponseString("", "Please enter your password.", ""); // L: 568
														return; // L: 569
													}

													class70.setLoginResponseString("", "Connecting to server...", ""); // L: 571
													class373.method7183(false); // L: 572
													class246.method5251(20); // L: 573
													return; // L: 574
												}
											}

											if ((var9.method4143(82) || var9.method4143(87)) && var9.field2339 == 67) { // L: 577
												Clipboard var43 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 578
												var44 = var43.getContents(Decimator.client); // L: 579
												var15 = 20 - Login.Login_password.length(); // L: 580
												break;
											}

											if (MusicPatch.method5789(var9.field2333)) { // L: 605
												char var41 = var9.field2333; // L: 607
												var36 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var41) != -1; // L: 609
												if (var36 && Login.Login_password.length() < 20) { // L: 611 612
													Login.Login_password = Login.Login_password + var9.field2333; // L: 613
												}
											}
										}
									} while(var15 <= 0); // L: 581

									try {
										String var16 = (String)var44.getTransferData(DataFlavor.stringFlavor); // L: 583
										int var17 = Math.min(var15, var16.length()); // L: 584
										int var18 = 0;

										while (true) {
											if (var18 >= var17) {
												Login.Login_password = Login.Login_password + var16.substring(0, var17); // L: 599
												continue label1246;
											}

											if (!MusicPatch.method5789(var16.charAt(var18))) { // L: 587
												break;
											}

											char var20 = var16.charAt(var18); // L: 589
											boolean var19 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var20) != -1; // L: 591
											if (!var19) { // L: 593
												break;
											}

											++var18; // L: 585
										}

										ReflectionCheck.method696(3); // L: 595
										return; // L: 596
									} catch (UnsupportedFlavorException var29) { // L: 601
									} catch (IOException var30) { // L: 602
									}
								}
							} else if (Login.loginIndex == 3) { // L: 621
								var10 = Login.loginBoxX + 180; // L: 622
								var11 = 276; // L: 623
								if (var21 == 1 && var31 >= var10 - 75 && var31 <= var10 + 75 && var32 >= var11 - 20 && var32 <= var11 + 20) { // L: 624
									GrandExchangeOfferNameComparator.method6672(false); // L: 625
								}

								var10 = Login.loginBoxX + 180; // L: 627
								var11 = 326; // L: 628
								if (var21 == 1 && var31 >= var10 - 75 && var31 <= var10 + 75 && var32 >= var11 - 20 && var32 <= var11 + 20) { // L: 629
									class70.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 630
									ReflectionCheck.method696(5); // L: 631
									return; // L: 632
								}
							} else {
								int var13;
								if (Login.loginIndex == 4) { // L: 635
									var10 = Login.loginBoxX + 180 - 80; // L: 636
									var11 = 321; // L: 637
									if (var21 == 1 && var31 >= var10 - 75 && var31 <= var10 + 75 && var32 >= var11 - 20 && var32 <= var11 + 20) { // L: 638
										InvDefinition.otp.trim(); // L: 639
										if (InvDefinition.otp.length() != 6) { // L: 640
											class70.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 641
											return; // L: 642
										}

										UserComparator4.field1429 = Integer.parseInt(InvDefinition.otp); // L: 644
										InvDefinition.otp = ""; // L: 645
										class373.method7183(true); // L: 646
										class70.setLoginResponseString("", "Connecting to server...", ""); // L: 647
										class246.method5251(20); // L: 648
										return; // L: 649
									}

									if (var21 == 1 && var31 >= Login.loginBoxX + 180 - 9 && var31 <= Login.loginBoxX + 180 + 130 && var32 >= 263 && var32 <= 296) { // L: 651
										Login.field930 = !Login.field930; // L: 652
									}

									if (var21 == 1 && var31 >= Login.loginBoxX + 180 - 34 && var31 <= Login.loginBoxX + 34 + 180 && var32 >= 351 && var32 <= 363) { // L: 654
										AttackOption.openURL(class310.method6356("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 655
									}

									var10 = Login.loginBoxX + 180 + 80; // L: 657
									if (var21 == 1 && var31 >= var10 - 75 && var31 <= var10 + 75 && var32 >= var11 - 20 && var32 <= var11 + 20) { // L: 658
										ReflectionCheck.method696(0); // L: 659
										Login.Login_username = ""; // L: 660
										Login.Login_password = ""; // L: 661
										UserComparator4.field1429 = 0; // L: 662
										InvDefinition.otp = ""; // L: 663
									}

									while (var9.method4141()) { // L: 665
										boolean var12 = false; // L: 666

										for (var13 = 0; var13 < "1234567890".length(); ++var13) { // L: 667
											if (var9.field2333 == "1234567890".charAt(var13)) { // L: 668
												var12 = true; // L: 669
												break; // L: 670
											}
										}

										if (var9.field2339 == 13) { // L: 673
											ReflectionCheck.method696(0); // L: 674
											Login.Login_username = ""; // L: 675
											Login.Login_password = ""; // L: 676
											UserComparator4.field1429 = 0; // L: 677
											InvDefinition.otp = ""; // L: 678
										} else {
											if (var9.field2339 == 85 && InvDefinition.otp.length() > 0) { // L: 681
												InvDefinition.otp = InvDefinition.otp.substring(0, InvDefinition.otp.length() - 1);
											}

											if (var9.field2339 == 84) { // L: 682
												InvDefinition.otp.trim(); // L: 683
												if (InvDefinition.otp.length() != 6) { // L: 684
													class70.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 685
													return; // L: 686
												}

												UserComparator4.field1429 = Integer.parseInt(InvDefinition.otp); // L: 688
												InvDefinition.otp = ""; // L: 689
												class373.method7183(true); // L: 690
												class70.setLoginResponseString("", "Connecting to server...", ""); // L: 691
												class246.method5251(20); // L: 692
												return; // L: 693
											}

											if (var12 && InvDefinition.otp.length() < 6) { // L: 695
												InvDefinition.otp = InvDefinition.otp + var9.field2333;
											}
										}
									}
								} else if (Login.loginIndex == 5) { // L: 699
									var10 = Login.loginBoxX + 180 - 80; // L: 700
									var11 = 321; // L: 701
									if (var21 == 1 && var31 >= var10 - 75 && var31 <= var10 + 75 && var32 >= var11 - 20 && var32 <= var11 + 20) { // L: 702
										WorldMapAreaData.method5426(); // L: 703
										return; // L: 704
									}

									var10 = Login.loginBoxX + 180 + 80; // L: 706
									if (var21 == 1 && var31 >= var10 - 75 && var31 <= var10 + 75 && var32 >= var11 - 20 && var32 <= var11 + 20) { // L: 707
										UserComparator6.Login_promptCredentials(true); // L: 708
									}

									var35 = 361; // L: 710
									if (class290.field3364 != null) { // L: 711
										var13 = class290.field3364.highX / 2; // L: 712
										if (var21 == 1 && var31 >= class290.field3364.lowX - var13 && var31 <= var13 + class290.field3364.lowX && var32 >= var35 - 15 && var32 < var35) { // L: 713
											AttackOption.openURL(class310.method6356("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 714
										}
									}

									while (var9.method4141()) { // L: 717
										var36 = false; // L: 718

										for (var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var14) { // L: 719
											if (var9.field2333 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14)) { // L: 720
												var36 = true; // L: 721
												break; // L: 722
											}
										}

										if (var9.field2339 == 13) { // L: 725
											UserComparator6.Login_promptCredentials(true); // L: 726
										} else {
											if (var9.field2339 == 85 && Login.Login_username.length() > 0) { // L: 729
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (var9.field2339 == 84) { // L: 730
												WorldMapAreaData.method5426(); // L: 731
												return; // L: 732
											}

											if (var36 && Login.Login_username.length() < 320) { // L: 734
												Login.Login_username = Login.Login_username + var9.field2333;
											}
										}
									}
								} else if (Login.loginIndex != 6) { // L: 738
									if (Login.loginIndex == 7) { // L: 749
										if (class209.field2376 && !Client.onMobile) { // L: 750
											var10 = class143.loginBoxCenter - 150; // L: 751
											var34 = var10 + 40 + 240 + 25; // L: 752
											var35 = 231; // L: 753
											var13 = var35 + 40; // L: 754
											if (var21 == 1 && var31 >= var10 && var31 <= var34 && var32 >= var35 && var32 <= var13) { // L: 755
												var15 = var10; // L: 757
												int var25 = 0;

												while (true) {
													if (var25 >= 8) {
														var14 = 0; // L: 767
														break;
													}

													if (var31 <= var15 + 30) { // L: 760
														var14 = var25; // L: 761
														break; // L: 762
													}

													var15 += 30; // L: 764
													var15 += var25 != 1 && var25 != 3 ? 5 : 20; // L: 765
													++var25; // L: 759
												}

												Login.field925 = var14; // L: 769
											}

											var14 = Login.loginBoxX + 180 - 80; // L: 771
											short var38 = 321; // L: 772
											boolean var45;
											if (var21 == 1 && var31 >= var14 - 75 && var31 <= var14 + 75 && var32 >= var38 - 20 && var32 <= var38 + 20) { // L: 773
												var45 = Language.method6781(); // L: 774
												if (var45) { // L: 775
													class246.method5251(50); // L: 776
													return; // L: 777
												}
											}

											var14 = Login.loginBoxX + 180 + 80; // L: 780
											if (var21 == 1 && var31 >= var14 - 75 && var31 <= var14 + 75 && var32 >= var38 - 20 && var32 <= var38 + 20) { // L: 781
												Login.field926 = new String[8]; // L: 782
												UserComparator6.Login_promptCredentials(true); // L: 783
											}

											while (var9.method4141()) { // L: 785
												if (var9.field2339 == 101) { // L: 786
													Login.field926[Login.field925] = null; // L: 787
												}

												if (var9.field2339 == 85) { // L: 789
													if (Login.field926[Login.field925] == null && Login.field925 > 0) { // L: 790
														--Login.field925; // L: 791
													}

													Login.field926[Login.field925] = null; // L: 793
												}

												if (var9.field2333 >= '0' && var9.field2333 <= '9') { // L: 795
													Login.field926[Login.field925] = "" + var9.field2333; // L: 796
													if (Login.field925 < 7) { // L: 797
														++Login.field925; // L: 798
													}
												}

												if (var9.field2339 == 84) { // L: 801
													var45 = Language.method6781(); // L: 802
													if (var45) { // L: 803
														class246.method5251(50); // L: 804
													}

													return; // L: 806
												}
											}
										} else {
											var10 = Login.loginBoxX + 180 - 80; // L: 811
											var11 = 321; // L: 812
											if (var21 == 1 && var31 >= var10 - 75 && var31 <= var10 + 75 && var32 >= var11 - 20 && var32 <= var11 + 20) { // L: 813
												AttackOption.openURL(class310.method6356("secure", true) + "m=dob/set_dob.ws", true, false); // L: 814
												class70.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 815
												ReflectionCheck.method696(6); // L: 816
												return; // L: 817
											}

											var10 = Login.loginBoxX + 180 + 80; // L: 819
											if (var21 == 1 && var31 >= var10 - 75 && var31 <= var10 + 75 && var32 >= var11 - 20 && var32 <= var11 + 20) { // L: 820
												UserComparator6.Login_promptCredentials(true); // L: 821
											}
										}
									} else if (Login.loginIndex == 8) { // L: 825
										var10 = Login.loginBoxX + 180 - 80; // L: 826
										var11 = 321; // L: 827
										if (var21 == 1 && var31 >= var10 - 75 && var31 <= var10 + 75 && var32 >= var11 - 20 && var32 <= var11 + 20) { // L: 828
											AttackOption.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 829
											class70.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 830
											ReflectionCheck.method696(6); // L: 831
											return; // L: 832
										}

										var10 = Login.loginBoxX + 180 + 80; // L: 834
										if (var21 == 1 && var31 >= var10 - 75 && var31 <= var10 + 75 && var32 >= var11 - 20 && var32 <= var11 + 20) { // L: 835
											UserComparator6.Login_promptCredentials(true); // L: 836
										}
									} else if (Login.loginIndex == 9) { // L: 839
										var10 = Login.loginBoxX + 180; // L: 840
										var11 = 311; // L: 841
										if (var22.field2339 == 84 || var22.field2339 == 13 || var21 == 1 && var31 >= var10 - 75 && var31 <= var10 + 75 && var32 >= var11 - 20 && var32 <= var11 + 20) { // L: 842
											GrandExchangeOfferNameComparator.method6672(false); // L: 843
										}
									} else if (Login.loginIndex == 10) { // L: 846
										var10 = Login.loginBoxX + 180; // L: 847
										var11 = 209; // L: 848
										if (var22.field2339 == 84 || var21 == 1 && var31 >= var10 - 109 && var31 <= var10 + 109 && var32 >= var11 && var32 <= var11 + 68) { // L: 849
											class70.setLoginResponseString("", "Connecting to server...", ""); // L: 850
											Client.field536 = class478.field4992; // L: 851
											class373.method7183(false); // L: 852
											class246.method5251(20); // L: 853
										}
									} else if (Login.loginIndex == 12) { // L: 856
										var10 = class143.loginBoxCenter; // L: 857
										var11 = 233; // L: 858
										Bounds var26 = var1.method7261(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11); // L: 859
										Bounds var23 = var1.method7261(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11); // L: 860
										Bounds var24 = var1.method7261(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11); // L: 861
										var34 = var11 + 17; // L: 862
										Bounds var27 = var1.method7261(0, 34, "<col=ffd200>agreement (EULA)</col>.", var10, var34); // L: 863
										if (var21 == 1) { // L: 864
											if (var26.method7850(var31, var32)) { // L: 865
												AttackOption.openURL("https://www.jagex.com/terms", true, false); // L: 866
											} else if (var23.method7850(var31, var32)) { // L: 868
												AttackOption.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 869
											} else if (var24.method7850(var31, var32) || var27.method7850(var31, var32)) { // L: 871
												AttackOption.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 872
											}
										}

										var10 = class143.loginBoxCenter - 80; // L: 875
										var11 = 311; // L: 876
										if (var21 == 1 && var31 >= var10 - 75 && var31 <= var10 + 75 && var32 >= var11 - 20 && var32 <= var11 + 20) { // L: 877
											FriendsChatManager.method7572(); // L: 878
											GrandExchangeOfferNameComparator.method6672(true); // L: 879
										}

										var10 = class143.loginBoxCenter + 80; // L: 881
										if (var21 == 1 && var31 >= var10 - 75 && var31 <= var10 + 75 && var32 >= var11 - 20 && var32 <= var11 + 20) { // L: 882
											Login.loginIndex = 13; // L: 883
										}
									} else if (Login.loginIndex == 13) { // L: 886
										var10 = class143.loginBoxCenter; // L: 887
										var11 = 321; // L: 888
										if (var21 == 1 && var31 >= var10 - 75 && var31 <= var10 + 75 && var32 >= var11 - 20 && var32 <= var11 + 20) { // L: 889
											GrandExchangeOfferNameComparator.method6672(true); // L: 890
										}
									} else if (Login.loginIndex == 14) { // L: 893
										String var28 = ""; // L: 894
										switch(Login.field916) { // L: 895
										case 0:
											var28 = "https://secure.runescape.com/m=offence-appeal/account-history"; // L: 897
											break; // L: 898
										case 1:
											var28 = "https://secure.runescape.com/m=accountappeal/passwordrecovery"; // L: 906
											break;
										case 2:
											var28 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance"; // L: 903
											break; // L: 904
										default:
											UserComparator6.Login_promptCredentials(false); // L: 900
										}

										var34 = Login.loginBoxX + 180; // L: 909
										var35 = 276; // L: 910
										if (var21 == 1 && var31 >= var34 - 75 && var31 <= var34 + 75 && var32 >= var35 - 20 && var32 <= var35 + 20) { // L: 911
											AttackOption.openURL(var28, true, false); // L: 912
											class70.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 913
											ReflectionCheck.method696(6); // L: 914
											return; // L: 915
										}

										var34 = Login.loginBoxX + 180; // L: 917
										var35 = 326; // L: 918
										if (var21 == 1 && var31 >= var34 - 75 && var31 <= var34 + 75 && var32 >= var35 - 20 && var32 <= var35 + 20) { // L: 919
											UserComparator6.Login_promptCredentials(false); // L: 920
										}
									} else if (Login.loginIndex == 24) { // L: 923
										var10 = Login.loginBoxX + 180; // L: 924
										var11 = 301; // L: 925
										if (var21 == 1 && var31 >= var10 - 75 && var31 <= var10 + 75 && var32 >= var11 - 20 && var32 <= var11 + 20) { // L: 926
											GrandExchangeOfferNameComparator.method6672(false); // L: 927
										}
									} else if (Login.loginIndex == 26) { // L: 930
										var10 = Login.loginBoxX + 180 - 80; // L: 931
										var11 = 321; // L: 932
										if (var21 == 1 && var31 >= var10 - 75 && var31 <= var10 + 75 && var32 >= var11 - 20 && var32 <= var11 + 20) { // L: 933
											AttackOption.openURL(class310.method6356("secure", true) + "m=dob/set_dob.ws", true, false); // L: 934
											class70.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 935
											ReflectionCheck.method696(6); // L: 936
											return; // L: 937
										}

										var10 = Login.loginBoxX + 180 + 80; // L: 939
										if (var21 == 1 && var31 >= var10 - 75 && var31 <= var10 + 75 && var32 >= var11 - 20 && var32 <= var11 + 20) { // L: 940
											UserComparator6.Login_promptCredentials(true); // L: 941
										}
									}
								} else {
									while (true) {
										do {
											if (!var9.method4141()) { // L: 739
												var33 = 321; // L: 744
												if (var21 == 1 && var32 >= var33 - 20 && var32 <= var33 + 20) { // L: 745
													UserComparator6.Login_promptCredentials(true); // L: 746
												}

												return;
											}
										} while(var9.field2339 != 84 && var9.field2339 != 13); // L: 740

										UserComparator6.Login_promptCredentials(true); // L: 741
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 325

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZB)I",
		garbageValue = "3"
	)
	static int method2847(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 2497
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.cycle; // L: 2498
			return 1; // L: 2499
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 2501
				class302.Interpreter_intStackSize -= 2; // L: 2502
				var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 2503
				var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 2504
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class6.method49(var3, var4); // L: 2505
				return 1; // L: 2506
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 2508
				class302.Interpreter_intStackSize -= 2; // L: 2509
				var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 2510
				var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 2511
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = DefaultsGroup.ItemContainer_getCount(var3, var4); // L: 2512
				return 1; // L: 2513
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 2515
				class302.Interpreter_intStackSize -= 2; // L: 2516
				var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 2517
				var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 2518
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class280.method5545(var3, var4); // L: 2519
				return 1; // L: 2520
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 2522
				var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2523
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.getInvDefinition(var3).size; // L: 2524
				return 1; // L: 2525
			} else if (var0 == ScriptOpcodes.STAT) { // L: 2527
				var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2528
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 2529
				return 1; // L: 2530
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 2532
				var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2533
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 2534
				return 1; // L: 2535
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 2537
				var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2538
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 2539
				return 1; // L: 2540
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 2542
					var3 = class103.Client_plane; // L: 2543
					var4 = ParamComposition.baseX * 64 + (class387.localPlayer.x >> 7); // L: 2544
					var5 = Client.baseY * 64 + (class387.localPlayer.y >> 7); // L: 2545
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 2546
					return 1; // L: 2547
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 2549
					var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2550
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 2551
					return 1; // L: 2552
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 2554
					var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2555
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 >> 28; // L: 2556
					return 1; // L: 2557
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 2559
					var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2560
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 & 16383; // L: 2561
					return 1; // L: 2562
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 2564
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 2565
					return 1; // L: 2566
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 2568
					class302.Interpreter_intStackSize -= 2; // L: 2569
					var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize] + 32768; // L: 2570
					var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 2571
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class6.method49(var3, var4); // L: 2572
					return 1; // L: 2573
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 2575
					class302.Interpreter_intStackSize -= 2; // L: 2576
					var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize] + 32768; // L: 2577
					var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 2578
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = DefaultsGroup.ItemContainer_getCount(var3, var4); // L: 2579
					return 1; // L: 2580
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2582
					class302.Interpreter_intStackSize -= 2; // L: 2583
					var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize] + 32768; // L: 2584
					var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 2585
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class280.method5545(var3, var4); // L: 2586
					return 1; // L: 2587
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2589
					if (Client.staffModLevel >= 2) { // L: 2590
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2591
					}

					return 1; // L: 2592
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2594
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2595
					return 1; // L: 2596
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2598
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.worldId; // L: 2599
					return 1; // L: 2600
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2602
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.field496 / 100; // L: 2603
					return 1; // L: 2604
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2606
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.weight; // L: 2607
					return 1; // L: 2608
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2610
					if (Client.playerMod) { // L: 2611
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2612
					}

					return 1; // L: 2613
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2615
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2616
					return 1; // L: 2617
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2619
					class302.Interpreter_intStackSize -= 4; // L: 2620
					var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 2621
					var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 2622
					var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]; // L: 2623
					int var6 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 3]; // L: 2624
					var3 += var4 << 14; // L: 2625
					var3 += var5 << 28; // L: 2626
					var3 += var6; // L: 2627
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3; // L: 2628
					return 1; // L: 2629
				} else if (var0 == 3326) { // L: 2631
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.field563; // L: 2632
					return 1; // L: 2633
				} else if (var0 == 3327) { // L: 2635
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.field513; // L: 2636
					return 1; // L: 2637
				} else if (var0 == 3331) { // L: 2639
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.field496; // L: 2640
					return 1; // L: 2641
				} else {
					return 2; // L: 2643
				}
			}
		}
	}
}
