import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ce")
public class class60 {
	@ObfuscatedName("aw")
	byte[] field459;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -610120235
	)
	int field456;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1582066203
	)
	int field457;

	class60() {
		this.field459 = null; // L: 4
		this.field456 = 0; // L: 5
		this.field457 = 0; // L: 6
	} // L: 8

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2044027415"
	)
	int method1184(int var1) {
		int var2 = 0; // L: 11

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field457; var1 -= var4) { // L: 12 13 20
			var4 = 8 - this.field457; // L: 14
			int var5 = (1 << var4) - 1; // L: 15
			var2 += (this.field459[this.field456] >> this.field457 & var5) << var3; // L: 16
			this.field457 = 0; // L: 17
			++this.field456; // L: 18
			var3 += var4; // L: 19
		}

		if (var1 > 0) { // L: 22
			var4 = (1 << var1) - 1; // L: 23
			var2 += (this.field459[this.field456] >> this.field457 & var4) << var3; // L: 24
			this.field457 += var1; // L: 25
		}

		return var2; // L: 27
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "92"
	)
	int method1185() {
		int var1 = this.field459[this.field456] >> this.field457 & 1; // L: 31
		++this.field457; // L: 32
		this.field456 += this.field457 >> 3; // L: 33
		this.field457 &= 7; // L: 34
		return var1; // L: 35
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "706879560"
	)
	void method1186(byte[] var1, int var2) {
		this.field459 = var1; // L: 39
		this.field456 = var2; // L: 40
		this.field457 = 0; // L: 41
	} // L: 42

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-881348723"
	)
	static int method1195(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1001
			var0 -= 1000; // L: 1002
			var3 = VarbitComposition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1003
		} else {
			var3 = var2 ? class36.scriptDotWidget : class351.field3896; // L: 1005
		}

		class200.invalidateWidget(var3); // L: 1006
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 1007
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 1027
				var3.modelType = 2; // L: 1028
				var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1029
				return 1; // L: 1030
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 1032
				var3.modelType = 3; // L: 1033
				var3.modelId = class136.localPlayer.appearance.getChatHeadId(); // L: 1034
				return 1; // L: 1035
			} else if (var0 == 1207) { // L: 1037
				boolean var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1038
				WorldMapManager.method5373(var3, class136.localPlayer.appearance, var7); // L: 1039
				return 1; // L: 1040
			} else if (var0 == 1208) { // L: 1042
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1043
				if (var3.field3681 == null) { // L: 1044
					throw new RuntimeException(""); // L: 1045
				} else {
					UserComparator9.method2889(var3, var4); // L: 1047
					return 1; // L: 1048
				}
			} else if (var0 == 1209) { // L: 1050
				Interpreter.Interpreter_intStackSize -= 2; // L: 1051
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1052
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1053
				if (var3.field3681 == null) { // L: 1054
					throw new RuntimeException(""); // L: 1055
				} else {
					class310.method6007(var3, var4, var5); // L: 1057
					return 1; // L: 1058
				}
			} else if (var0 == 1210) { // L: 1060
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1061
				if (var3.field3681 == null) { // L: 1062
					throw new RuntimeException(""); // L: 1063
				} else {
					TaskHandler.method3518(var3, class136.localPlayer.appearance.field3563, var4); // L: 1065
					return 1; // L: 1066
				}
			} else {
				return 2; // L: 1068
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 2; // L: 1008
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1009
			var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1010
			var3.itemId = var4; // L: 1011
			var3.itemQuantity = var5; // L: 1012
			ItemComposition var6 = class125.ItemComposition_get(var4); // L: 1013
			var3.modelAngleX = var6.xan2d; // L: 1014
			var3.modelAngleY = var6.yan2d; // L: 1015
			var3.modelAngleZ = var6.zan2d; // L: 1016
			var3.modelOffsetX = var6.offsetX2d; // L: 1017
			var3.modelOffsetY = var6.offsetY2d; // L: 1018
			var3.modelZoom = var6.zoom2d; // L: 1019
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 1020
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) { // L: 1021
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 1022
			}

			if (var3.field3679 > 0) { // L: 1023
				var3.modelZoom = var3.modelZoom * 32 / var3.field3679;
			} else if (var3.rawWidth > 0) { // L: 1024
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 1025
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1862862390"
	)
	static boolean method1183(char var0) {
		for (int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var1) { // L: 1118
			if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var1)) { // L: 1119
				return true;
			}
		}

		return false; // L: 1121
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Ldf;I)Z",
		garbageValue = "1187792462"
	)
	static boolean method1192(Player var0) {
		if (Client.drawPlayerNames == 0) { // L: 5143
			return false;
		} else {
			boolean var1;
			if (class136.localPlayer != var0) { // L: 5144
				var1 = (Client.drawPlayerNames & 4) != 0; // L: 5147
				return var1 || WorldMapIcon_1.method5108() && var0.method2319() || ModeWhere.method7013() && var0.method2330(); // L: 5149
			} else {
				var1 = (Client.drawPlayerNames & 8) != 0; // L: 5154
				return var1; // L: 5156
			}
		}
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "14"
	)
	static final void method1193(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) { // L: 9356
			var2 -= 2000;
		}

		NPC var9;
		PacketBufferNode var11;
		if (var2 == 1003) { // L: 9357
			Client.mouseCrossX = var7; // L: 9358
			Client.mouseCrossY = var8; // L: 9359
			Client.mouseCrossColor = 2; // L: 9360
			Client.mouseCrossState = 0; // L: 9361
			var9 = Client.npcs[var3]; // L: 9362
			if (var9 != null) { // L: 9363
				NPCComposition var10 = var9.definition; // L: 9364
				if (var10.transforms != null) { // L: 9365
					var10 = var10.transform();
				}

				if (var10 != null) { // L: 9366
					var11 = class503.getPacketBufferNode(ClientPacket.field3120, Client.packetWriter.isaacCipher); // L: 9368
					var11.packetBuffer.method9126(var10.id); // L: 9369
					Client.packetWriter.addNode(var11); // L: 9370
				}
			}
		}

		PacketBufferNode var15;
		if (var2 == 7) { // L: 9374
			var9 = Client.npcs[var3]; // L: 9375
			if (var9 != null) { // L: 9376
				Client.mouseCrossX = var7; // L: 9377
				Client.mouseCrossY = var8; // L: 9378
				Client.mouseCrossColor = 2; // L: 9379
				Client.mouseCrossState = 0; // L: 9380
				Client.destinationX = var0; // L: 9381
				Client.destinationY = var1; // L: 9382
				var15 = class503.getPacketBufferNode(ClientPacket.field3159, Client.packetWriter.isaacCipher); // L: 9384
				var15.packetBuffer.method9126(class301.field3359); // L: 9385
				var15.packetBuffer.writeIntME(SecureRandomCallable.field1039); // L: 9386
				var15.packetBuffer.method9139(DirectByteArrayCopier.field3796); // L: 9387
				var15.packetBuffer.method9126(var3); // L: 9388
				var15.packetBuffer.writeByte(Client.field750.method4151(82) ? 1 : 0); // L: 9389
				Client.packetWriter.addNode(var15); // L: 9390
			}
		}

		Player var14;
		if (var2 == 49) { // L: 9393
			var14 = Client.players[var3]; // L: 9394
			if (var14 != null) { // L: 9395
				Client.mouseCrossX = var7; // L: 9396
				Client.mouseCrossY = var8; // L: 9397
				Client.mouseCrossColor = 2; // L: 9398
				Client.mouseCrossState = 0; // L: 9399
				Client.destinationX = var0; // L: 9400
				Client.destinationY = var1; // L: 9401
				var15 = class503.getPacketBufferNode(ClientPacket.field3140, Client.packetWriter.isaacCipher); // L: 9403
				var15.packetBuffer.writeIntME(var3); // L: 9404
				var15.packetBuffer.method9118(Client.field750.method4151(82) ? 1 : 0); // L: 9405
				Client.packetWriter.addNode(var15); // L: 9406
			}
		}

		if (var2 == 9) { // L: 9409
			var9 = Client.npcs[var3]; // L: 9410
			if (var9 != null) { // L: 9411
				Client.mouseCrossX = var7; // L: 9412
				Client.mouseCrossY = var8; // L: 9413
				Client.mouseCrossColor = 2; // L: 9414
				Client.mouseCrossState = 0; // L: 9415
				Client.destinationX = var0; // L: 9416
				Client.destinationY = var1; // L: 9417
				var15 = class503.getPacketBufferNode(ClientPacket.field3126, Client.packetWriter.isaacCipher); // L: 9419
				var15.packetBuffer.writeByte(Client.field750.method4151(82) ? 1 : 0); // L: 9420
				var15.packetBuffer.writeIntME(var3); // L: 9421
				Client.packetWriter.addNode(var15); // L: 9422
			}
		}

		if (var2 == 45) { // L: 9425
			var14 = Client.players[var3]; // L: 9426
			if (var14 != null) { // L: 9427
				Client.mouseCrossX = var7; // L: 9428
				Client.mouseCrossY = var8; // L: 9429
				Client.mouseCrossColor = 2; // L: 9430
				Client.mouseCrossState = 0; // L: 9431
				Client.destinationX = var0; // L: 9432
				Client.destinationY = var1; // L: 9433
				var15 = class503.getPacketBufferNode(ClientPacket.field3152, Client.packetWriter.isaacCipher); // L: 9435
				var15.packetBuffer.writeIntME(var3); // L: 9436
				var15.packetBuffer.method9244(Client.field750.method4151(82) ? 1 : 0); // L: 9437
				Client.packetWriter.addNode(var15); // L: 9438
			}
		}

		if (var2 == 51) { // L: 9441
			var14 = Client.players[var3]; // L: 9442
			if (var14 != null) { // L: 9443
				Client.mouseCrossX = var7; // L: 9444
				Client.mouseCrossY = var8; // L: 9445
				Client.mouseCrossColor = 2; // L: 9446
				Client.mouseCrossState = 0; // L: 9447
				Client.destinationX = var0; // L: 9448
				Client.destinationY = var1; // L: 9449
				var15 = class503.getPacketBufferNode(ClientPacket.field3116, Client.packetWriter.isaacCipher); // L: 9451
				var15.packetBuffer.writeIntME(var3); // L: 9452
				var15.packetBuffer.method9118(Client.field750.method4151(82) ? 1 : 0); // L: 9453
				Client.packetWriter.addNode(var15); // L: 9454
			}
		}

		PacketBufferNode var16;
		if (var2 == 1002) { // L: 9457
			Client.mouseCrossX = var7; // L: 9458
			Client.mouseCrossY = var8; // L: 9459
			Client.mouseCrossColor = 2; // L: 9460
			Client.mouseCrossState = 0; // L: 9461
			var16 = class503.getPacketBufferNode(ClientPacket.field3166, Client.packetWriter.isaacCipher); // L: 9463
			var16.packetBuffer.writeShort(var3); // L: 9464
			Client.packetWriter.addNode(var16); // L: 9465
		}

		if (var2 == 48) { // L: 9467
			var14 = Client.players[var3]; // L: 9468
			if (var14 != null) { // L: 9469
				Client.mouseCrossX = var7; // L: 9470
				Client.mouseCrossY = var8; // L: 9471
				Client.mouseCrossColor = 2; // L: 9472
				Client.mouseCrossState = 0; // L: 9473
				Client.destinationX = var0; // L: 9474
				Client.destinationY = var1; // L: 9475
				var15 = class503.getPacketBufferNode(ClientPacket.field3156, Client.packetWriter.isaacCipher); // L: 9477
				var15.packetBuffer.method9126(var3); // L: 9478
				var15.packetBuffer.method9244(Client.field750.method4151(82) ? 1 : 0); // L: 9479
				Client.packetWriter.addNode(var15); // L: 9480
			}
		}

		if (var2 == 1001) { // L: 9483
			Client.mouseCrossX = var7; // L: 9484
			Client.mouseCrossY = var8; // L: 9485
			Client.mouseCrossColor = 2; // L: 9486
			Client.mouseCrossState = 0; // L: 9487
			Client.destinationX = var0; // L: 9488
			Client.destinationY = var1; // L: 9489
			var16 = class503.getPacketBufferNode(ClientPacket.field3125, Client.packetWriter.isaacCipher); // L: 9491
			var16.packetBuffer.writeByte(Client.field750.method4151(82) ? 1 : 0); // L: 9492
			var16.packetBuffer.writeIntME(var3); // L: 9493
			var16.packetBuffer.writeIntME(class148.baseY * 64 + var1); // L: 9494
			var16.packetBuffer.writeIntME(AbstractArchive.baseX * 64 + var0); // L: 9495
			Client.packetWriter.addNode(var16); // L: 9496
		}

		if (var2 == 12) { // L: 9498
			var9 = Client.npcs[var3]; // L: 9499
			if (var9 != null) { // L: 9500
				Client.mouseCrossX = var7; // L: 9501
				Client.mouseCrossY = var8; // L: 9502
				Client.mouseCrossColor = 2; // L: 9503
				Client.mouseCrossState = 0; // L: 9504
				Client.destinationX = var0; // L: 9505
				Client.destinationY = var1; // L: 9506
				var15 = class503.getPacketBufferNode(ClientPacket.field3175, Client.packetWriter.isaacCipher); // L: 9508
				var15.packetBuffer.method9143(var3); // L: 9509
				var15.packetBuffer.writeByte(Client.field750.method4151(82) ? 1 : 0); // L: 9510
				Client.packetWriter.addNode(var15); // L: 9511
			}
		}

		Widget var17;
		if (var2 == 58) { // L: 9514
			var17 = MouseRecorder.getWidgetChild(var1, var0); // L: 9515
			if (var17 != null) { // L: 9516
				if (var17.field3628 != null) { // L: 9517
					ScriptEvent var18 = new ScriptEvent(); // L: 9518
					var18.widget = var17; // L: 9519
					var18.opIndex = var3; // L: 9520
					var18.targetName = var6; // L: 9521
					var18.args = var17.field3628; // L: 9522
					GrandExchangeOfferOwnWorldComparator.runScriptEvent(var18); // L: 9523
				}

				var15 = class503.getPacketBufferNode(ClientPacket.field3110, Client.packetWriter.isaacCipher); // L: 9526
				var15.packetBuffer.method9126(Client.selectedSpellItemId); // L: 9527
				var15.packetBuffer.method9143(var0); // L: 9528
				var15.packetBuffer.method9126(Client.selectedSpellChildIndex); // L: 9529
				var15.packetBuffer.writeIntME(var4); // L: 9530
				var15.packetBuffer.method9138(class33.selectedSpellWidget); // L: 9531
				var15.packetBuffer.method9138(var1); // L: 9532
				Client.packetWriter.addNode(var15); // L: 9533
			}
		}

		if (var2 == 8) { // L: 9536
			var9 = Client.npcs[var3]; // L: 9537
			if (var9 != null) { // L: 9538
				Client.mouseCrossX = var7; // L: 9539
				Client.mouseCrossY = var8; // L: 9540
				Client.mouseCrossColor = 2; // L: 9541
				Client.mouseCrossState = 0; // L: 9542
				Client.destinationX = var0; // L: 9543
				Client.destinationY = var1; // L: 9544
				var15 = class503.getPacketBufferNode(ClientPacket.field3103, Client.packetWriter.isaacCipher); // L: 9545
				var15.packetBuffer.method9139(class33.selectedSpellWidget); // L: 9546
				var15.packetBuffer.method9143(Client.selectedSpellChildIndex); // L: 9547
				var15.packetBuffer.method9143(Client.selectedSpellItemId); // L: 9548
				var15.packetBuffer.method9143(var3); // L: 9549
				var15.packetBuffer.writeByte(Client.field750.method4151(82) ? 1 : 0); // L: 9550
				Client.packetWriter.addNode(var15); // L: 9551
			}
		}

		if (var2 == 1) { // L: 9554
			Client.mouseCrossX = var7; // L: 9555
			Client.mouseCrossY = var8; // L: 9556
			Client.mouseCrossColor = 2; // L: 9557
			Client.mouseCrossState = 0; // L: 9558
			Client.destinationX = var0; // L: 9559
			Client.destinationY = var1; // L: 9560
			var16 = class503.getPacketBufferNode(ClientPacket.field3134, Client.packetWriter.isaacCipher); // L: 9562
			var16.packetBuffer.method9143(var3); // L: 9563
			var16.packetBuffer.method9143(SecureRandomCallable.field1039); // L: 9564
			var16.packetBuffer.method9143(class301.field3359); // L: 9565
			var16.packetBuffer.method9143(AbstractArchive.baseX * 64 + var0); // L: 9566
			var16.packetBuffer.method9188(Client.field750.method4151(82) ? 1 : 0); // L: 9567
			var16.packetBuffer.writeInt(DirectByteArrayCopier.field3796); // L: 9568
			var16.packetBuffer.method9143(class148.baseY * 64 + var1); // L: 9569
			Client.packetWriter.addNode(var16); // L: 9570
		}

		if (var2 == 47) { // L: 9572
			var14 = Client.players[var3]; // L: 9573
			if (var14 != null) { // L: 9574
				Client.mouseCrossX = var7; // L: 9575
				Client.mouseCrossY = var8; // L: 9576
				Client.mouseCrossColor = 2; // L: 9577
				Client.mouseCrossState = 0; // L: 9578
				Client.destinationX = var0; // L: 9579
				Client.destinationY = var1; // L: 9580
				var15 = class503.getPacketBufferNode(ClientPacket.field3150, Client.packetWriter.isaacCipher); // L: 9582
				var15.packetBuffer.method9126(var3); // L: 9583
				var15.packetBuffer.writeByte(Client.field750.method4151(82) ? 1 : 0); // L: 9584
				Client.packetWriter.addNode(var15); // L: 9585
			}
		}

		if (var2 == 44) { // L: 9588
			var14 = Client.players[var3]; // L: 9589
			if (var14 != null) { // L: 9590
				Client.mouseCrossX = var7; // L: 9591
				Client.mouseCrossY = var8; // L: 9592
				Client.mouseCrossColor = 2; // L: 9593
				Client.mouseCrossState = 0; // L: 9594
				Client.destinationX = var0; // L: 9595
				Client.destinationY = var1; // L: 9596
				var15 = class503.getPacketBufferNode(ClientPacket.field3174, Client.packetWriter.isaacCipher); // L: 9598
				var15.packetBuffer.writeIntME(var3); // L: 9599
				var15.packetBuffer.method9118(Client.field750.method4151(82) ? 1 : 0); // L: 9600
				Client.packetWriter.addNode(var15); // L: 9601
			}
		}

		if (var2 == 11) { // L: 9604
			var9 = Client.npcs[var3]; // L: 9605
			if (var9 != null) { // L: 9606
				Client.mouseCrossX = var7; // L: 9607
				Client.mouseCrossY = var8; // L: 9608
				Client.mouseCrossColor = 2; // L: 9609
				Client.mouseCrossState = 0; // L: 9610
				Client.destinationX = var0; // L: 9611
				Client.destinationY = var1; // L: 9612
				var15 = class503.getPacketBufferNode(ClientPacket.field3162, Client.packetWriter.isaacCipher); // L: 9614
				var15.packetBuffer.writeShort(var3); // L: 9615
				var15.packetBuffer.method9188(Client.field750.method4151(82) ? 1 : 0); // L: 9616
				Client.packetWriter.addNode(var15); // L: 9617
			}
		}

		int var12;
		Widget var19;
		if (var2 == 29) { // L: 9620
			var16 = class503.getPacketBufferNode(ClientPacket.field3191, Client.packetWriter.isaacCipher); // L: 9622
			var16.packetBuffer.writeInt(var1); // L: 9623
			Client.packetWriter.addNode(var16); // L: 9624
			var19 = VarbitComposition.getWidget(var1); // L: 9625
			if (var19 != null && var19.cs1Instructions != null && var19.cs1Instructions[0][0] == 5) { // L: 9626
				var12 = var19.cs1Instructions[0][1]; // L: 9627
				if (Varps.Varps_main[var12] != var19.cs1ComparisonValues[0]) { // L: 9628
					Varps.Varps_main[var12] = var19.cs1ComparisonValues[0]; // L: 9629
					MenuAction.changeGameOptions(var12); // L: 9630
				}
			}
		}

		if (var2 == 22) { // L: 9634
			Client.mouseCrossX = var7; // L: 9635
			Client.mouseCrossY = var8; // L: 9636
			Client.mouseCrossColor = 2; // L: 9637
			Client.mouseCrossState = 0; // L: 9638
			Client.destinationX = var0; // L: 9639
			Client.destinationY = var1; // L: 9640
			var16 = class503.getPacketBufferNode(ClientPacket.field3095, Client.packetWriter.isaacCipher); // L: 9642
			var16.packetBuffer.method9126(AbstractArchive.baseX * 64 + var0); // L: 9643
			var16.packetBuffer.method9188(Client.field750.method4151(82) ? 1 : 0); // L: 9644
			var16.packetBuffer.method9126(var3); // L: 9645
			var16.packetBuffer.method9126(class148.baseY * 64 + var1); // L: 9646
			Client.packetWriter.addNode(var16); // L: 9647
		}

		if (var2 == 50) { // L: 9649
			var14 = Client.players[var3]; // L: 9650
			if (var14 != null) { // L: 9651
				Client.mouseCrossX = var7; // L: 9652
				Client.mouseCrossY = var8; // L: 9653
				Client.mouseCrossColor = 2; // L: 9654
				Client.mouseCrossState = 0; // L: 9655
				Client.destinationX = var0; // L: 9656
				Client.destinationY = var1; // L: 9657
				var15 = class503.getPacketBufferNode(ClientPacket.field3189, Client.packetWriter.isaacCipher); // L: 9659
				var15.packetBuffer.writeShort(var3); // L: 9660
				var15.packetBuffer.method9244(Client.field750.method4151(82) ? 1 : 0); // L: 9661
				Client.packetWriter.addNode(var15); // L: 9662
			}
		}

		if (var2 == 14) { // L: 9665
			var14 = Client.players[var3]; // L: 9666
			if (var14 != null) { // L: 9667
				Client.mouseCrossX = var7; // L: 9668
				Client.mouseCrossY = var8; // L: 9669
				Client.mouseCrossColor = 2; // L: 9670
				Client.mouseCrossState = 0; // L: 9671
				Client.destinationX = var0; // L: 9672
				Client.destinationY = var1; // L: 9673
				var15 = class503.getPacketBufferNode(ClientPacket.field3179, Client.packetWriter.isaacCipher); // L: 9675
				var15.packetBuffer.writeIntME(SecureRandomCallable.field1039); // L: 9676
				var15.packetBuffer.writeIntME(class301.field3359); // L: 9677
				var15.packetBuffer.method9137(DirectByteArrayCopier.field3796); // L: 9678
				var15.packetBuffer.writeShort(var3); // L: 9679
				var15.packetBuffer.writeByte(Client.field750.method4151(82) ? 1 : 0); // L: 9680
				Client.packetWriter.addNode(var15); // L: 9681
			}
		}

		if (var2 == 26) { // L: 9684
			class390.method7262(); // L: 9685
		}

		if (var2 == 23) { // L: 9687
			if (Client.isMenuOpen) { // L: 9688
				UserComparator5.scene.setViewportWalking(); // L: 9689
			} else {
				UserComparator5.scene.menuOpen(class36.Client_plane, var0, var1, true); // L: 9692
			}
		}

		if (var2 == 16) { // L: 9695
			Client.mouseCrossX = var7; // L: 9696
			Client.mouseCrossY = var8; // L: 9697
			Client.mouseCrossColor = 2; // L: 9698
			Client.mouseCrossState = 0; // L: 9699
			Client.destinationX = var0; // L: 9700
			Client.destinationY = var1; // L: 9701
			var16 = class503.getPacketBufferNode(ClientPacket.field3130, Client.packetWriter.isaacCipher); // L: 9703
			var16.packetBuffer.method9143(class301.field3359); // L: 9704
			var16.packetBuffer.method9143(SecureRandomCallable.field1039); // L: 9705
			var16.packetBuffer.method9143(var3); // L: 9706
			var16.packetBuffer.method9143(class148.baseY * 64 + var1); // L: 9707
			var16.packetBuffer.writeIntME(AbstractArchive.baseX * 64 + var0); // L: 9708
			var16.packetBuffer.method9188(Client.field750.method4151(82) ? 1 : 0); // L: 9709
			var16.packetBuffer.method9138(DirectByteArrayCopier.field3796); // L: 9710
			Client.packetWriter.addNode(var16); // L: 9711
		}

		if (var2 == 57 || var2 == 1007) { // L: 9713
			var17 = MouseRecorder.getWidgetChild(var1, var0); // L: 9714
			if (var17 != null) { // L: 9715
				BufferedSource.widgetDefaultMenuAction(var3, var1, var0, var4, var6); // L: 9716
			}
		}

		if (var2 == 25) { // L: 9719
			var17 = MouseRecorder.getWidgetChild(var1, var0); // L: 9720
			if (var17 != null) { // L: 9721
				SoundCache.Widget_runOnTargetLeave(); // L: 9722
				ArchiveDiskAction.selectSpell(var1, var0, class273.Widget_unpackTargetMask(UserComparator8.getWidgetFlags(var17)), var4); // L: 9723
				Client.isItemSelected = 0; // L: 9724
				Client.field636 = class13.Widget_getSpellActionName(var17); // L: 9725
				if (Client.field636 == null) { // L: 9726
					Client.field636 = "null";
				}

				if (var17.isIf3) { // L: 9727
					Client.field734 = var17.dataText + MusicPatchPcmStream.colorStartTag(16777215);
				} else {
					Client.field734 = MusicPatchPcmStream.colorStartTag(65280) + var17.field3752 + MusicPatchPcmStream.colorStartTag(16777215); // L: 9728
				}
			}

		} else {
			if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) { // L: 9732
				class127.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 9733
			}

			if (var2 == 46) { // L: 9735
				var14 = Client.players[var3]; // L: 9736
				if (var14 != null) { // L: 9737
					Client.mouseCrossX = var7; // L: 9738
					Client.mouseCrossY = var8; // L: 9739
					Client.mouseCrossColor = 2; // L: 9740
					Client.mouseCrossState = 0; // L: 9741
					Client.destinationX = var0; // L: 9742
					Client.destinationY = var1; // L: 9743
					var15 = class503.getPacketBufferNode(ClientPacket.field3135, Client.packetWriter.isaacCipher); // L: 9745
					var15.packetBuffer.writeByte(Client.field750.method4151(82) ? 1 : 0); // L: 9746
					var15.packetBuffer.writeShort(var3); // L: 9747
					Client.packetWriter.addNode(var15); // L: 9748
				}
			}

			if (var2 == 15) { // L: 9751
				var14 = Client.players[var3]; // L: 9752
				if (var14 != null) { // L: 9753
					Client.mouseCrossX = var7; // L: 9754
					Client.mouseCrossY = var8; // L: 9755
					Client.mouseCrossColor = 2; // L: 9756
					Client.mouseCrossState = 0; // L: 9757
					Client.destinationX = var0; // L: 9758
					Client.destinationY = var1; // L: 9759
					var15 = class503.getPacketBufferNode(ClientPacket.field3185, Client.packetWriter.isaacCipher); // L: 9760
					var15.packetBuffer.method9126(var3); // L: 9761
					var15.packetBuffer.method9138(class33.selectedSpellWidget); // L: 9762
					var15.packetBuffer.writeByte(Client.field750.method4151(82) ? 1 : 0); // L: 9763
					var15.packetBuffer.writeShort(Client.selectedSpellItemId); // L: 9764
					var15.packetBuffer.method9143(Client.selectedSpellChildIndex); // L: 9765
					Client.packetWriter.addNode(var15); // L: 9766
				}
			}

			if (var2 == 6) { // L: 9769
				Client.mouseCrossX = var7; // L: 9770
				Client.mouseCrossY = var8; // L: 9771
				Client.mouseCrossColor = 2; // L: 9772
				Client.mouseCrossState = 0; // L: 9773
				Client.destinationX = var0; // L: 9774
				Client.destinationY = var1; // L: 9775
				var16 = class503.getPacketBufferNode(ClientPacket.field3154, Client.packetWriter.isaacCipher); // L: 9777
				var16.packetBuffer.writeIntME(class148.baseY * 64 + var1); // L: 9778
				var16.packetBuffer.method9143(AbstractArchive.baseX * 64 + var0); // L: 9779
				var16.packetBuffer.writeShort(var3); // L: 9780
				var16.packetBuffer.method9188(Client.field750.method4151(82) ? 1 : 0); // L: 9781
				Client.packetWriter.addNode(var16); // L: 9782
			}

			if (var2 == 20) { // L: 9784
				Client.mouseCrossX = var7; // L: 9785
				Client.mouseCrossY = var8; // L: 9786
				Client.mouseCrossColor = 2; // L: 9787
				Client.mouseCrossState = 0; // L: 9788
				Client.destinationX = var0; // L: 9789
				Client.destinationY = var1; // L: 9790
				var16 = class503.getPacketBufferNode(ClientPacket.field3167, Client.packetWriter.isaacCipher); // L: 9792
				var16.packetBuffer.method9126(AbstractArchive.baseX * 64 + var0); // L: 9793
				var16.packetBuffer.method9126(var3); // L: 9794
				var16.packetBuffer.method9143(class148.baseY * 64 + var1); // L: 9795
				var16.packetBuffer.method9244(Client.field750.method4151(82) ? 1 : 0); // L: 9796
				Client.packetWriter.addNode(var16); // L: 9797
			}

			if (var2 == 17) { // L: 9799
				Client.mouseCrossX = var7; // L: 9800
				Client.mouseCrossY = var8; // L: 9801
				Client.mouseCrossColor = 2; // L: 9802
				Client.mouseCrossState = 0; // L: 9803
				Client.destinationX = var0; // L: 9804
				Client.destinationY = var1; // L: 9805
				var16 = class503.getPacketBufferNode(ClientPacket.field3158, Client.packetWriter.isaacCipher); // L: 9806
				var16.packetBuffer.method9143(class148.baseY * 64 + var1); // L: 9807
				var16.packetBuffer.method9126(Client.selectedSpellChildIndex); // L: 9808
				var16.packetBuffer.method9126(var3); // L: 9809
				var16.packetBuffer.method9137(class33.selectedSpellWidget); // L: 9810
				var16.packetBuffer.method9126(Client.selectedSpellItemId); // L: 9811
				var16.packetBuffer.method9244(Client.field750.method4151(82) ? 1 : 0); // L: 9812
				var16.packetBuffer.writeShort(AbstractArchive.baseX * 64 + var0); // L: 9813
				Client.packetWriter.addNode(var16); // L: 9814
			}

			if (var2 == 19) { // L: 9816
				Client.mouseCrossX = var7; // L: 9817
				Client.mouseCrossY = var8; // L: 9818
				Client.mouseCrossColor = 2; // L: 9819
				Client.mouseCrossState = 0; // L: 9820
				Client.destinationX = var0; // L: 9821
				Client.destinationY = var1; // L: 9822
				var16 = class503.getPacketBufferNode(ClientPacket.field3153, Client.packetWriter.isaacCipher); // L: 9824
				var16.packetBuffer.method9143(AbstractArchive.baseX * 64 + var0); // L: 9825
				var16.packetBuffer.method9244(Client.field750.method4151(82) ? 1 : 0); // L: 9826
				var16.packetBuffer.method9143(var3); // L: 9827
				var16.packetBuffer.writeIntME(class148.baseY * 64 + var1); // L: 9828
				Client.packetWriter.addNode(var16); // L: 9829
			}

			if (var2 == 10) { // L: 9831
				var9 = Client.npcs[var3]; // L: 9832
				if (var9 != null) { // L: 9833
					Client.mouseCrossX = var7; // L: 9834
					Client.mouseCrossY = var8; // L: 9835
					Client.mouseCrossColor = 2; // L: 9836
					Client.mouseCrossState = 0; // L: 9837
					Client.destinationX = var0; // L: 9838
					Client.destinationY = var1; // L: 9839
					var15 = class503.getPacketBufferNode(ClientPacket.field3171, Client.packetWriter.isaacCipher); // L: 9841
					var15.packetBuffer.writeByte(Client.field750.method4151(82) ? 1 : 0); // L: 9842
					var15.packetBuffer.method9143(var3); // L: 9843
					Client.packetWriter.addNode(var15); // L: 9844
				}
			}

			if (var2 == 2) { // L: 9847
				Client.mouseCrossX = var7; // L: 9848
				Client.mouseCrossY = var8; // L: 9849
				Client.mouseCrossColor = 2; // L: 9850
				Client.mouseCrossState = 0; // L: 9851
				Client.destinationX = var0; // L: 9852
				Client.destinationY = var1; // L: 9853
				var16 = class503.getPacketBufferNode(ClientPacket.field3184, Client.packetWriter.isaacCipher); // L: 9854
				var16.packetBuffer.method9244(Client.field750.method4151(82) ? 1 : 0); // L: 9855
				var16.packetBuffer.writeShort(Client.selectedSpellItemId); // L: 9856
				var16.packetBuffer.writeShort(var3); // L: 9857
				var16.packetBuffer.writeShort(class148.baseY * 64 + var1); // L: 9858
				var16.packetBuffer.method9126(AbstractArchive.baseX * 64 + var0); // L: 9859
				var16.packetBuffer.method9143(Client.selectedSpellChildIndex); // L: 9860
				var16.packetBuffer.method9139(class33.selectedSpellWidget); // L: 9861
				Client.packetWriter.addNode(var16); // L: 9862
			}

			if (var2 == 3) { // L: 9864
				Client.mouseCrossX = var7; // L: 9865
				Client.mouseCrossY = var8; // L: 9866
				Client.mouseCrossColor = 2; // L: 9867
				Client.mouseCrossState = 0; // L: 9868
				Client.destinationX = var0; // L: 9869
				Client.destinationY = var1; // L: 9870
				var16 = class503.getPacketBufferNode(ClientPacket.field3132, Client.packetWriter.isaacCipher); // L: 9872
				var16.packetBuffer.method9143(class148.baseY * 64 + var1); // L: 9873
				var16.packetBuffer.method9143(AbstractArchive.baseX * 64 + var0); // L: 9874
				var16.packetBuffer.method9118(Client.field750.method4151(82) ? 1 : 0); // L: 9875
				var16.packetBuffer.writeShort(var3); // L: 9876
				Client.packetWriter.addNode(var16); // L: 9877
			}

			if (var2 == 24) { // L: 9879
				var17 = VarbitComposition.getWidget(var1); // L: 9880
				if (var17 != null) { // L: 9881
					boolean var13 = true; // L: 9882
					if (var17.contentType > 0) { // L: 9883
						var13 = class467.method8437(var17);
					}

					if (var13) { // L: 9884
						var11 = class503.getPacketBufferNode(ClientPacket.field3191, Client.packetWriter.isaacCipher); // L: 9886
						var11.packetBuffer.writeInt(var1); // L: 9887
						Client.packetWriter.addNode(var11); // L: 9888
					}
				}
			}

			if (var2 == 5) { // L: 9892
				Client.mouseCrossX = var7; // L: 9893
				Client.mouseCrossY = var8; // L: 9894
				Client.mouseCrossColor = 2; // L: 9895
				Client.mouseCrossState = 0; // L: 9896
				Client.destinationX = var0; // L: 9897
				Client.destinationY = var1; // L: 9898
				var16 = class503.getPacketBufferNode(ClientPacket.field3146, Client.packetWriter.isaacCipher); // L: 9900
				var16.packetBuffer.method9126(AbstractArchive.baseX * 64 + var0); // L: 9901
				var16.packetBuffer.method9118(Client.field750.method4151(82) ? 1 : 0); // L: 9902
				var16.packetBuffer.method9126(class148.baseY * 64 + var1); // L: 9903
				var16.packetBuffer.writeIntME(var3); // L: 9904
				Client.packetWriter.addNode(var16); // L: 9905
			}

			if (var2 == 21) { // L: 9907
				Client.mouseCrossX = var7; // L: 9908
				Client.mouseCrossY = var8; // L: 9909
				Client.mouseCrossColor = 2; // L: 9910
				Client.mouseCrossState = 0; // L: 9911
				Client.destinationX = var0; // L: 9912
				Client.destinationY = var1; // L: 9913
				var16 = class503.getPacketBufferNode(ClientPacket.field3148, Client.packetWriter.isaacCipher); // L: 9915
				var16.packetBuffer.method9118(Client.field750.method4151(82) ? 1 : 0); // L: 9916
				var16.packetBuffer.method9143(var3); // L: 9917
				var16.packetBuffer.writeIntME(class148.baseY * 64 + var1); // L: 9918
				var16.packetBuffer.writeIntME(AbstractArchive.baseX * 64 + var0); // L: 9919
				Client.packetWriter.addNode(var16); // L: 9920
			}

			if (var2 == 18) { // L: 9922
				Client.mouseCrossX = var7; // L: 9923
				Client.mouseCrossY = var8; // L: 9924
				Client.mouseCrossColor = 2; // L: 9925
				Client.mouseCrossState = 0; // L: 9926
				Client.destinationX = var0; // L: 9927
				Client.destinationY = var1; // L: 9928
				var16 = class503.getPacketBufferNode(ClientPacket.field3102, Client.packetWriter.isaacCipher); // L: 9930
				var16.packetBuffer.method9118(Client.field750.method4151(82) ? 1 : 0); // L: 9931
				var16.packetBuffer.writeIntME(class148.baseY * 64 + var1); // L: 9932
				var16.packetBuffer.writeIntME(var3); // L: 9933
				var16.packetBuffer.writeIntME(AbstractArchive.baseX * 64 + var0); // L: 9934
				Client.packetWriter.addNode(var16); // L: 9935
			}

			if (var2 == 30 && Client.meslayerContinueWidget == null) { // L: 9937 9938
				WorldMapArea.resumePauseWidget(var1, var0); // L: 9939
				Client.meslayerContinueWidget = MouseRecorder.getWidgetChild(var1, var0); // L: 9940
				class200.invalidateWidget(Client.meslayerContinueWidget); // L: 9941
			}

			if (var2 == 1004) { // L: 9944
				Client.mouseCrossX = var7; // L: 9945
				Client.mouseCrossY = var8; // L: 9946
				Client.mouseCrossColor = 2; // L: 9947
				Client.mouseCrossState = 0; // L: 9948
				var16 = class503.getPacketBufferNode(ClientPacket.field3107, Client.packetWriter.isaacCipher); // L: 9950
				var16.packetBuffer.method9143(AbstractArchive.baseX * 64 + var0); // L: 9951
				var16.packetBuffer.method9126(var3); // L: 9952
				var16.packetBuffer.writeIntME(class148.baseY * 64 + var1); // L: 9953
				Client.packetWriter.addNode(var16); // L: 9954
			}

			if (var2 == 4) { // L: 9956
				Client.mouseCrossX = var7; // L: 9957
				Client.mouseCrossY = var8; // L: 9958
				Client.mouseCrossColor = 2; // L: 9959
				Client.mouseCrossState = 0; // L: 9960
				Client.destinationX = var0; // L: 9961
				Client.destinationY = var1; // L: 9962
				var16 = class503.getPacketBufferNode(ClientPacket.field3104, Client.packetWriter.isaacCipher); // L: 9964
				var16.packetBuffer.method9143(class148.baseY * 64 + var1); // L: 9965
				var16.packetBuffer.writeIntME(var3); // L: 9966
				var16.packetBuffer.writeByte(Client.field750.method4151(82) ? 1 : 0); // L: 9967
				var16.packetBuffer.method9126(AbstractArchive.baseX * 64 + var0); // L: 9968
				Client.packetWriter.addNode(var16); // L: 9969
			}

			if (var2 == 28) { // L: 9971
				var16 = class503.getPacketBufferNode(ClientPacket.field3191, Client.packetWriter.isaacCipher); // L: 9973
				var16.packetBuffer.writeInt(var1); // L: 9974
				Client.packetWriter.addNode(var16); // L: 9975
				var19 = VarbitComposition.getWidget(var1); // L: 9976
				if (var19 != null && var19.cs1Instructions != null && var19.cs1Instructions[0][0] == 5) { // L: 9977
					var12 = var19.cs1Instructions[0][1]; // L: 9978
					Varps.Varps_main[var12] = 1 - Varps.Varps_main[var12]; // L: 9979
					MenuAction.changeGameOptions(var12); // L: 9980
				}
			}

			if (var2 == 13) { // L: 9983
				var9 = Client.npcs[var3]; // L: 9984
				if (var9 != null) { // L: 9985
					Client.mouseCrossX = var7; // L: 9986
					Client.mouseCrossY = var8; // L: 9987
					Client.mouseCrossColor = 2; // L: 9988
					Client.mouseCrossState = 0; // L: 9989
					Client.destinationX = var0; // L: 9990
					Client.destinationY = var1; // L: 9991
					var15 = class503.getPacketBufferNode(ClientPacket.field3164, Client.packetWriter.isaacCipher); // L: 9993
					var15.packetBuffer.method9118(Client.field750.method4151(82) ? 1 : 0); // L: 9994
					var15.packetBuffer.writeShort(var3); // L: 9995
					Client.packetWriter.addNode(var15); // L: 9996
				}
			}

			if (Client.isItemSelected != 0) { // L: 9999
				Client.isItemSelected = 0; // L: 10000
				class200.invalidateWidget(VarbitComposition.getWidget(DirectByteArrayCopier.field3796)); // L: 10001
			}

			if (Client.isSpellSelected) { // L: 10003
				SoundCache.Widget_runOnTargetLeave();
			}

		}
	} // L: 9730 10004
}
