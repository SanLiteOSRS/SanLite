import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("az")
public class class9 implements class383 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	public static final class9 field33;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	public static final class9 field31;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	static final class9 field32;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	static final class9 field37;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	static final class9 field34;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 275629241
	)
	int field30;
	@ObfuscatedName("aa")
	String field36;
	@ObfuscatedName("ac")
	boolean field38;
	@ObfuscatedName("al")
	boolean field35;

	static {
		field33 = new class9(0, "POST", true, true); // L: 6
		field31 = new class9(1, "GET", true, false); // L: 7
		field32 = new class9(2, "PUT", false, true); // L: 8
		field37 = new class9(3, "PATCH", false, true); // L: 9
		field34 = new class9(4, "DELETE", false, true); // L: 10
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field30 = var1; // L: 17
		this.field36 = var2; // L: 18
		this.field38 = var3; // L: 19
		this.field35 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-82"
	)
	boolean method76() {
		return this.field38; // L: 24
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field30; // L: 37
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "62"
	)
	public String method75() {
		return this.field36; // L: 28
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1331729662"
	)
	boolean method74() {
		return this.field35; // L: 32
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Luo;IB)V",
		garbageValue = "10"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1; // L: 448
		if (var2) { // L: 449
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2); // L: 450
		Player var4 = Client.players[var1]; // L: 451
		if (var3 == 0) { // L: 452
			if (var2) { // L: 453
				var4.field1122 = false; // L: 454
			} else if (Client.localPlayerIndex == var1) { // L: 457
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (class187.baseX * 64 + var4.pathX[0] >> 13 << 14) + (class101.baseY * 64 + var4.pathY[0] >> 13); // L: 458
				if (var4.field1208 != -1) { // L: 459
					Players.Players_orientations[var1] = var4.field1208;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 460
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 461
				Client.players[var1] = null; // L: 462
				if (var0.readBits(1) != 0) { // L: 463
					Buddy.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) { // L: 466
				var5 = var0.readBits(3); // L: 467
				var6 = var4.pathX[0]; // L: 468
				var7 = var4.pathY[0]; // L: 469
				if (var5 == 0) { // L: 470
					--var6; // L: 471
					--var7; // L: 472
				} else if (var5 == 1) { // L: 474
					--var7;
				} else if (var5 == 2) { // L: 475
					++var6; // L: 476
					--var7; // L: 477
				} else if (var5 == 3) { // L: 479
					--var6;
				} else if (var5 == 4) { // L: 480
					++var6;
				} else if (var5 == 5) { // L: 481
					--var6; // L: 482
					++var7; // L: 483
				} else if (var5 == 6) { // L: 485
					++var7;
				} else if (var5 == 7) { // L: 486
					++var6; // L: 487
					++var7; // L: 488
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 490
					var4.resetPath(var6, var7); // L: 491
					var4.field1122 = false; // L: 492
				} else if (var2) { // L: 494
					var4.field1122 = true; // L: 495
					var4.tileX = var6; // L: 496
					var4.tileY = var7; // L: 497
				} else {
					var4.field1122 = false; // L: 500
					var4.method2398(var6, var7, Players.field1356[var1]); // L: 501
				}

			} else if (var3 == 2) { // L: 505
				var5 = var0.readBits(4); // L: 506
				var6 = var4.pathX[0]; // L: 507
				var7 = var4.pathY[0]; // L: 508
				if (var5 == 0) { // L: 509
					var6 -= 2; // L: 510
					var7 -= 2; // L: 511
				} else if (var5 == 1) { // L: 513
					--var6; // L: 514
					var7 -= 2; // L: 515
				} else if (var5 == 2) { // L: 517
					var7 -= 2;
				} else if (var5 == 3) { // L: 518
					++var6; // L: 519
					var7 -= 2; // L: 520
				} else if (var5 == 4) { // L: 522
					var6 += 2; // L: 523
					var7 -= 2; // L: 524
				} else if (var5 == 5) { // L: 526
					var6 -= 2; // L: 527
					--var7; // L: 528
				} else if (var5 == 6) { // L: 530
					var6 += 2; // L: 531
					--var7; // L: 532
				} else if (var5 == 7) { // L: 534
					var6 -= 2;
				} else if (var5 == 8) { // L: 535
					var6 += 2;
				} else if (var5 == 9) { // L: 536
					var6 -= 2; // L: 537
					++var7; // L: 538
				} else if (var5 == 10) { // L: 540
					var6 += 2; // L: 541
					++var7; // L: 542
				} else if (var5 == 11) { // L: 544
					var6 -= 2; // L: 545
					var7 += 2; // L: 546
				} else if (var5 == 12) { // L: 548
					--var6; // L: 549
					var7 += 2; // L: 550
				} else if (var5 == 13) { // L: 552
					var7 += 2;
				} else if (var5 == 14) { // L: 553
					++var6; // L: 554
					var7 += 2; // L: 555
				} else if (var5 == 15) { // L: 557
					var6 += 2; // L: 558
					var7 += 2; // L: 559
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 561
					var4.resetPath(var6, var7); // L: 562
					var4.field1122 = false; // L: 563
				} else if (var2) { // L: 565
					var4.field1122 = true; // L: 566
					var4.tileX = var6; // L: 567
					var4.tileY = var7; // L: 568
				} else {
					var4.field1122 = false; // L: 571
					var4.method2398(var6, var7, Players.field1356[var1]); // L: 572
				}

			} else {
				var5 = var0.readBits(1); // L: 576
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) { // L: 577
					var6 = var0.readBits(12); // L: 578
					var7 = var6 >> 10; // L: 579
					var8 = var6 >> 5 & 31; // L: 580
					if (var8 > 15) { // L: 581
						var8 -= 32;
					}

					var9 = var6 & 31; // L: 582
					if (var9 > 15) { // L: 583
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0]; // L: 584
					var11 = var9 + var4.pathY[0]; // L: 585
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 586
						var4.resetPath(var10, var11); // L: 587
						var4.field1122 = false; // L: 588
					} else if (var2) { // L: 590
						var4.field1122 = true; // L: 591
						var4.tileX = var10; // L: 592
						var4.tileY = var11; // L: 593
					} else {
						var4.field1122 = false; // L: 596
						var4.method2398(var10, var11, Players.field1356[var1]); // L: 597
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 599
					if (Client.localPlayerIndex == var1) { // L: 600
						ItemLayer.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 603
					var7 = var6 >> 28; // L: 604
					var8 = var6 >> 14 & 16383; // L: 605
					var9 = var6 & 16383; // L: 606
					var10 = (class187.baseX * 64 + var8 + var4.pathX[0] & 16383) - class187.baseX * 64; // L: 607
					var11 = (class101.baseY * 64 + var9 + var4.pathY[0] & 16383) - class101.baseY * 64; // L: 608
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 609
						var4.resetPath(var10, var11); // L: 610
						var4.field1122 = false; // L: 611
					} else if (var2) { // L: 613
						var4.field1122 = true; // L: 614
						var4.tileX = var10; // L: 615
						var4.tileY = var11; // L: 616
					} else {
						var4.field1122 = false; // L: 619
						var4.method2398(var10, var11, Players.field1356[var1]); // L: 620
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 622
					if (Client.localPlayerIndex == var1) { // L: 623
						ItemLayer.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 455 464 503 574 601 624

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F",
		garbageValue = "-257144128"
	)
	static float[] method84(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4]; // L: 301

		try {
			JSONArray var3 = var0.getJSONArray(var1); // L: 303
			var2[0] = (float)var3.optDouble(0, 0.0D); // L: 304
			var2[1] = (float)var3.optDouble(1, 0.0D); // L: 305
			var2[2] = (float)var3.optDouble(2, 1.0D); // L: 306
			var2[3] = (float)var3.optDouble(3, 1.0D); // L: 307
		} catch (JSONException var4) { // L: 309
			var2[0] = 0.0F; // L: 310
			var2[1] = 0.0F; // L: 311
			var2[2] = 1.0F; // L: 312
			var2[3] = 1.0F; // L: 313
		}

		return var2; // L: 315
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "77503344"
	)
	static final void method85() {
		if (Client.logoutTimer > 0) { // L: 3004
			class13.method177(); // L: 3005
		} else {
			Client.timer.method7924(); // L: 3008
			WorldMapSection2.method4516(40); // L: 3009
			class4.field4 = Client.packetWriter.getSocket(); // L: 3010
			Client.packetWriter.removeSocket(); // L: 3011
		}
	} // L: 3006 3012

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "416478591"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3857
			WorldMapIcon_1.clientPreferences.method2540(!WorldMapIcon_1.clientPreferences.method2541()); // L: 3858
			if (WorldMapIcon_1.clientPreferences.method2541()) { // L: 3859
				GrandExchangeOfferUnitPriceComparator.addGameMessage(99, "", "Roofs are now all hidden"); // L: 3860
			} else {
				GrandExchangeOfferUnitPriceComparator.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3863
			}
		}

		if (var0.startsWith("zbuf")) { // L: 3866
			boolean var1 = Huffman.method6840(var0.substring(5).trim()) == 1; // L: 3867
			SpriteMask.client.method513(var1); // L: 3868
			Rasterizer3D.method5189(var1); // L: 3869
		}

		if (var0.equalsIgnoreCase("z")) { // L: 3871
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3872
			WorldMapIcon_1.clientPreferences.method2547();
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 3873
			Client.field615 = !Client.field615;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) { // L: 3874
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) { // L: 3875
			if (var0.equalsIgnoreCase("errortest")) { // L: 3876
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 3877
				class187.worldMap.field4978 = !class187.worldMap.field4978;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3878
				WorldMapIcon_1.clientPreferences.method2546(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 3879
				WorldMapIcon_1.clientPreferences.method2546(false);
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 3880
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 3881
				method85();
			}
		}

		PacketBufferNode var2 = class113.getPacketBufferNode(ClientPacket.field3183, Client.packetWriter.isaacCipher); // L: 3884
		var2.packetBuffer.writeByte(var0.length() + 1); // L: 3885
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3886
		Client.packetWriter.addNode(var2); // L: 3887
	} // L: 3888

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1070211689"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field716 = 0L; // L: 4546
		if (var0 >= 2) { // L: 4547
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 4548
		}

		if (ApproximateRouteStrategy.getWindowedMode() == 1) { // L: 4549
			SpriteMask.client.setMaxCanvasSize(765, 503); // L: 4550
		} else {
			SpriteMask.client.setMaxCanvasSize(7680, 2160); // L: 4553
		}

		if (Client.gameState >= 25 && Client.packetWriter != null && Client.packetWriter.isaacCipher != null) { // L: 4555 4556
			PacketBufferNode var1 = class113.getPacketBufferNode(ClientPacket.field3209, Client.packetWriter.isaacCipher); // L: 4558
			var1.packetBuffer.writeByte(ApproximateRouteStrategy.getWindowedMode()); // L: 4559
			var1.packetBuffer.writeShort(Language.canvasWidth); // L: 4560
			var1.packetBuffer.writeShort(class47.canvasHeight); // L: 4561
			Client.packetWriter.addNode(var1); // L: 4562
		}

	} // L: 4564
}
