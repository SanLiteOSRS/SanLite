import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("ns")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2088013585
	)
	public int field4296;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("w")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4296 = (int)(class181.method3483() / 1000L);
		this.username = var1; // L: 110
		this.world = (short)var2; // L: 111
	} // L: 112

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Z",
		garbageValue = "-65"
	)
	static boolean method6597(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 56
			try {
				if (!class29.field167.startsWith("win")) { // L: 58
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 59
					throw new Exception();
				} else {
					String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 60

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 61
						if (var13.indexOf(var0.charAt(var4)) == -1) { // L: 62
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 64
					return true; // L: 65
				}
			} catch (Throwable var8) { // L: 67
				return false; // L: 68
			}
		} else if (var1 == 1) { // L: 71
			try {
				Applet var7 = class29.field174; // L: 74
				Object[] var5 = new Object[]{(new URL(class29.field174.getCodeBase(), var0)).toString()}; // L: 75
				Object var3 = JSObject.getWindow(var7).call(var2, var5); // L: 78
				return var3 != null; // L: 81
			} catch (Throwable var9) { // L: 83
				return false; // L: 84
			}
		} else if (var1 == 2) { // L: 87
			try {
				class29.field174.getAppletContext().showDocument(new URL(class29.field174.getCodeBase(), var0), "_blank"); // L: 89
				return true; // L: 90
			} catch (Exception var10) { // L: 92
				return false; // L: 93
			}
		} else if (var1 == 3) { // L: 96
			try {
				class27.method384(class29.field174, "loggedout"); // L: 98
			} catch (Throwable var12) { // L: 100
			}

			try {
				class29.field174.getAppletContext().showDocument(new URL(class29.field174.getCodeBase(), var0), "_top"); // L: 102
				return true; // L: 103
			} catch (Exception var11) { // L: 105
				return false; // L: 106
			}
		} else {
			throw new IllegalArgumentException(); // L: 109
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lqz;ILcq;II)V",
		garbageValue = "-885879954"
	)
	static final void method6596(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class192.field2205.field2208; // L: 453
		if ((var3 & 256) != 0) { // L: 454
			var2.field1178 = var0.method7658(); // L: 455
			var2.field1127 = var0.method7672(); // L: 456
			var2.field1179 = var0.readByte(); // L: 457
			var2.field1181 = var0.method7671(); // L: 458
			var2.field1182 = var0.method7640() + Client.cycle; // L: 459
			var2.field1183 = var0.method7654() + Client.cycle; // L: 460
			var2.field1136 = var0.method7677(); // L: 461
			if (var2.field1111) { // L: 462
				var2.field1178 += var2.tileX; // L: 463
				var2.field1127 += var2.tileY; // L: 464
				var2.field1179 += var2.tileX; // L: 465
				var2.field1181 += var2.tileY; // L: 466
				var2.pathLength = 0; // L: 467
			} else {
				var2.field1178 += var2.pathX[0]; // L: 470
				var2.field1127 += var2.pathY[0]; // L: 471
				var2.field1179 += var2.pathX[0]; // L: 472
				var2.field1181 += var2.pathY[0]; // L: 473
				var2.pathLength = 1; // L: 474
			}

			var2.field1201 = 0; // L: 476
		}

		int var5;
		int var8;
		int var9;
		int var12;
		if ((var3 & 16) != 0) { // L: 478
			var5 = var0.method7654(); // L: 479
			PlayerType var6 = (PlayerType)GameEngine.findEnumerated(class220.PlayerType_values(), var0.method7708()); // L: 480
			boolean var7 = var0.method7786() == 1; // L: 481
			var8 = var0.method7786(); // L: 482
			var9 = var0.offset; // L: 483
			if (var2.username != null && var2.appearance != null) { // L: 484
				boolean var10 = false; // L: 485
				if (var6.isUser && class321.friendSystem.isIgnored(var2.username)) { // L: 486 487
					var10 = true;
				}

				if (!var10 && Client.field601 == 0 && !var2.isHidden) { // L: 489
					Players.field1309.offset = 0; // L: 490
					var0.method7692(Players.field1309.array, 0, var8); // L: 491
					Players.field1309.offset = 0; // L: 492
					String var11 = AbstractFont.escapeBrackets(AbstractWorldMapData.method4895(class229.method4813(Players.field1309))); // L: 493
					var2.overheadText = var11.trim(); // L: 494
					var2.overheadTextColor = var5 >> 8; // L: 495
					var2.overheadTextEffect = var5 & 255; // L: 496
					var2.overheadTextCyclesRemaining = 150; // L: 497
					var2.isAutoChatting = var7; // L: 498
					var2.field1164 = var2 != ScriptFrame.localPlayer && var6.isUser && "" != Client.field711 && var11.toLowerCase().indexOf(Client.field711) == -1; // L: 499
					if (var6.isPrivileged) { // L: 501
						var12 = var7 ? 91 : 1;
					} else {
						var12 = var7 ? 90 : 2; // L: 502
					}

					if (var6.modIcon != -1) { // L: 503
						VarcInt.addGameMessage(var12, SoundSystem.method740(var6.modIcon) + var2.username.getName(), var11);
					} else {
						VarcInt.addGameMessage(var12, var2.username.getName(), var11); // L: 504
					}
				}
			}

			var0.offset = var9 + var8; // L: 507
		}

		if ((var3 & 64) != 0) { // L: 509
			var2.targetIndex = var0.method7677(); // L: 510
			if (var2.targetIndex == 65535) { // L: 511
				var2.targetIndex = -1;
			}
		}

		if ((var3 & 2048) != 0) { // L: 513
			class192[] var13 = Players.field1298; // L: 514
			class192[] var15 = new class192[]{class192.field2207, class192.field2209, class192.field2205, class192.field2206}; // L: 518
			var13[var1] = (class192)GameEngine.findEnumerated(var15, var0.method7672()); // L: 520
		}

		int var14;
		if ((var3 & 2) != 0) { // L: 522
			var5 = var0.method7677(); // L: 523
			if (var5 == 65535) { // L: 524
				var5 = -1;
			}

			var14 = var0.method7786(); // L: 525
			Strings.performPlayerAnimation(var2, var5, var14); // L: 526
		}

		if ((var3 & 8192) != 0) { // L: 528
			var2.field1187 = Client.cycle + var0.method7640(); // L: 529
			var2.field1188 = Client.cycle + var0.method7654(); // L: 530
			var2.field1189 = var0.method7672(); // L: 531
			var2.field1131 = var0.method7672(); // L: 532
			var2.field1191 = var0.method7658(); // L: 533
			var2.field1192 = (byte)var0.method7670(); // L: 534
		}

		if ((var3 & 512) != 0) { // L: 536
			for (var5 = 0; var5 < 3; ++var5) { // L: 537
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 16384) != 0) { // L: 539
			var4 = var0.method7658(); // L: 540
		}

		if ((var3 & 4) != 0) { // L: 542
			var5 = var0.method7708(); // L: 543
			byte[] var17 = new byte[var5]; // L: 544
			Buffer var22 = new Buffer(var17); // L: 545
			var0.readBytes(var17, 0, var5); // L: 546
			Players.field1308[var1] = var22; // L: 547
			var2.read(var22); // L: 548
		}

		if ((var3 & 1024) != 0) { // L: 550
			var2.spotAnimation = var0.method7677(); // L: 551
			var5 = var0.method7690(); // L: 552
			var2.field1195 = var5 >> 16; // L: 553
			var2.field1176 = (var5 & 65535) + Client.cycle; // L: 554
			var2.spotAnimationFrame = 0; // L: 555
			var2.field1175 = 0; // L: 556
			if (var2.field1176 > Client.cycle) { // L: 557
				var2.spotAnimationFrame = -1;
			}

			if (var2.spotAnimation == 65535) { // L: 558
				var2.spotAnimation = -1;
			}
		}

		if ((var3 & 8) != 0) { // L: 560
			var2.field1162 = var0.method7677(); // L: 561
			if (var2.pathLength == 0) { // L: 562
				var2.orientation = var2.field1162; // L: 563
				var2.field1162 = -1; // L: 564
			}
		}

		if ((var3 & 1) != 0) { // L: 567
			var2.overheadText = var0.readStringCp1252NullTerminated(); // L: 568
			if (var2.overheadText.charAt(0) == '~') { // L: 569
				var2.overheadText = var2.overheadText.substring(1); // L: 570
				VarcInt.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 571
			} else if (var2 == ScriptFrame.localPlayer) { // L: 573
				VarcInt.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 574
			}

			var2.isAutoChatting = false; // L: 576
			var2.overheadTextColor = 0; // L: 577
			var2.overheadTextEffect = 0; // L: 578
			var2.overheadTextCyclesRemaining = 150; // L: 579
		}

		if ((var3 & 128) != 0) { // L: 581
			var5 = var0.readUnsignedByte(); // L: 582
			int var16;
			int var19;
			int var20;
			if (var5 > 0) { // L: 583
				for (var14 = 0; var14 < var5; ++var14) { // L: 584
					var8 = -1; // L: 586
					var9 = -1; // L: 587
					var20 = -1; // L: 588
					var19 = var0.readUShortSmart(); // L: 589
					if (var19 == 32767) { // L: 590
						var19 = var0.readUShortSmart(); // L: 591
						var9 = var0.readUShortSmart(); // L: 592
						var8 = var0.readUShortSmart(); // L: 593
						var20 = var0.readUShortSmart(); // L: 594
					} else if (var19 != 32766) { // L: 596
						var9 = var0.readUShortSmart(); // L: 597
					} else {
						var19 = -1; // L: 599
					}

					var16 = var0.readUShortSmart(); // L: 600
					var2.addHitSplat(var19, var9, var8, var20, Client.cycle, var16); // L: 601
				}
			}

			var14 = var0.method7708(); // L: 604
			if (var14 > 0) { // L: 605
				for (var19 = 0; var19 < var14; ++var19) { // L: 606
					var8 = var0.readUShortSmart(); // L: 607
					var9 = var0.readUShortSmart(); // L: 608
					if (var9 != 32767) { // L: 609
						var20 = var0.readUShortSmart(); // L: 610
						var16 = var0.readUnsignedByte(); // L: 611
						var12 = var9 > 0 ? var0.method7786() : var16; // L: 612
						var2.addHealthBar(var8, Client.cycle, var9, var20, var16, var12); // L: 613
					} else {
						var2.removeHealthBar(var8); // L: 615
					}
				}
			}
		}

		if (var2.field1111) { // L: 619
			if (var4 == 127) { // L: 620
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class192 var21;
				if (var4 != class192.field2205.field2208) { // L: 623
					class192[] var18 = new class192[]{class192.field2207, class192.field2209, class192.field2205, class192.field2206}; // L: 626
					var21 = (class192)GameEngine.findEnumerated(var18, var4); // L: 628
				} else {
					var21 = Players.field1298[var1]; // L: 630
				}

				var2.method2131(var2.tileX, var2.tileY, var21); // L: 631
			}
		}

	} // L: 635
}
