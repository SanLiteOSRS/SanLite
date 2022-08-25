import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eq")
public class class142 extends class128 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -30851657
	)
	int field1637;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lei;)V"
	)
	class142(class131 var1) {
		this.this$0 = var1;
		this.field1637 = -1; // L: 213
	} // L: 215

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-885940784"
	)
	void vmethod3087(Buffer var1) {
		this.field1637 = var1.readUnsignedShort(); // L: 218
	} // L: 219

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Leh;B)V",
		garbageValue = "0"
	)
	void vmethod3084(ClanSettings var1) {
		var1.method2942(this.field1637); // L: 222
	} // L: 223

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "1084730426"
	)
	static int method2982(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 869
		Widget var4;
		if (var0 >= 2000) { // L: 871
			var0 -= 1000; // L: 872
			var4 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 873
			var3 = false; // L: 874
		} else {
			var4 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget; // L: 876
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 877
			var11 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] - 1; // L: 878
			if (var11 >= 0 && var11 <= 9) { // L: 879
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]); // L: 883
				return 1; // L: 884
			} else {
				--UserComparator8.Interpreter_stringStackSize; // L: 880
				return 1; // L: 881
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 886
				Nameable.Interpreter_intStackSize -= 2; // L: 887
				var11 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 888
				var6 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 889
				var4.parent = class128.getWidgetChild(var11, var6); // L: 890
				return 1; // L: 891
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 893
				var4.isScrollBar = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 894
				return 1; // L: 895
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 897
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 898
				return 1; // L: 899
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 901
				var4.dragThreshold = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 902
				return 1; // L: 903
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 905
				var4.dataText = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 906
				return 1; // L: 907
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 909
				var4.spellActionName = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 910
				return 1; // L: 911
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 913
				var4.actions = null; // L: 914
				return 1; // L: 915
			} else if (var0 == 1308) { // L: 917
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 918
				return 1; // L: 919
			} else if (var0 == 1309) { // L: 921
				--Nameable.Interpreter_intStackSize; // L: 922
				return 1; // L: 923
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 925
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 955
						Nameable.Interpreter_intStackSize -= 2; // L: 956
						var5 = 10; // L: 957
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]}; // L: 958
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]}; // L: 959
						World.Widget_setKey(var4, var5, var8, var9); // L: 960
						return 1; // L: 961
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 963
						Nameable.Interpreter_intStackSize -= 3; // L: 964
						var11 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize] - 1; // L: 965
						var6 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 966
						var7 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 2]; // L: 967
						if (var11 >= 0 && var11 <= 9) { // L: 968
							KeyHandler.Widget_setKeyRate(var4, var11, var6, var7); // L: 971
							return 1; // L: 972
						} else {
							throw new RuntimeException(); // L: 969
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 974
						var5 = 10; // L: 975
						var6 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 976
						var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 977
						KeyHandler.Widget_setKeyRate(var4, var5, var6, var7); // L: 978
						return 1; // L: 979
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 981
						--Nameable.Interpreter_intStackSize; // L: 982
						var11 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize] - 1; // L: 983
						if (var11 >= 0 && var11 <= 9) { // L: 984
							Client.Widget_setKeyIgnoreHeld(var4, var11); // L: 987
							return 1; // L: 988
						} else {
							throw new RuntimeException(); // L: 985
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 990
						var5 = 10; // L: 991
						Client.Widget_setKeyIgnoreHeld(var4, var5); // L: 992
						return 1; // L: 993
					} else {
						return 2; // L: 995
					}
				} else {
					byte[] var10 = null; // L: 926
					var8 = null; // L: 927
					if (var3) { // L: 928
						Nameable.Interpreter_intStackSize -= 10; // L: 929

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + Nameable.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 931 932
						}

						if (var7 > 0) { // L: 934
							var10 = new byte[var7 / 2]; // L: 935
							var8 = new byte[var7 / 2]; // L: 936

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 937
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Nameable.Interpreter_intStackSize]; // L: 938
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Nameable.Interpreter_intStackSize + 1]; // L: 939
							}
						}
					} else {
						Nameable.Interpreter_intStackSize -= 2; // L: 944
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]}; // L: 945
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]}; // L: 946
					}

					var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] - 1; // L: 948
					if (var7 >= 0 && var7 <= 9) { // L: 949
						World.Widget_setKey(var4, var7, var10, var8); // L: 952
						return 1; // L: 953
					} else {
						throw new RuntimeException(); // L: 950
					}
				}
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)Lgn;",
		garbageValue = "152498733"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 342
		if (var1 != null) { // L: 343
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive; // L: 345
			AbstractArchive var4 = GZipDecompressor.SequenceDefinition_skeletonsArchive; // L: 346
			boolean var5 = true; // L: 348
			int[] var6 = var3.getGroupFileIds(var0); // L: 349

			for (int var7 = 0; var7 < var6.length; ++var7) { // L: 350
				byte[] var8 = var3.getFile(var0, var6[var7]); // L: 351
				if (var8 == null) { // L: 352
					var5 = false; // L: 353
				} else {
					int var9 = (var8[0] & 255) << 8 | var8[1] & 255; // L: 356
					byte[] var10 = var4.getFile(var9, 0); // L: 359
					if (var10 == null) { // L: 360
						var5 = false;
					}
				}
			}

			Frames var2;
			if (!var5) { // L: 362
				var2 = null; // L: 363
			} else {
				try {
					var2 = new Frames(var3, var4, var0, false); // L: 367
				} catch (Exception var12) { // L: 369
					var2 = null; // L: 370
				}
			}

			if (var2 != null) { // L: 374
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var2, (long)var0);
			}

			return var2; // L: 375
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "1760692663"
	)
	static int method2989(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1481
			var7 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 1482
			VarcInt.addGameMessage(0, "", var7); // L: 1483
			return 1; // L: 1484
		} else if (var0 == ScriptOpcodes.ANIM) {
			Nameable.Interpreter_intStackSize -= 2; // L: 1487
			Strings.performPlayerAnimation(ScriptFrame.localPlayer, Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]); // L: 1488
			return 1; // L: 1489
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field816) { // L: 1492
				Interpreter.field820 = true; // L: 1493
			}

			return 1; // L: 1495
		} else {
			int var16;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 1498
				var16 = 0; // L: 1499
				if (class228.isNumber(var7)) { // L: 1500
					var16 = AbstractUserComparator.method6644(var7);
				}

				PacketBufferNode var14 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2983, Client.packetWriter.isaacCipher); // L: 1502
				var14.packetBuffer.writeInt(var16); // L: 1503
				Client.packetWriter.addNode(var14); // L: 1504
				return 1; // L: 1505
			} else {
				PacketBufferNode var12;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 1508
					var12 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3015, Client.packetWriter.isaacCipher); // L: 1510
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1511
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1512
					Client.packetWriter.addNode(var12); // L: 1513
					return 1; // L: 1514
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 1517
					var12 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2925, Client.packetWriter.isaacCipher); // L: 1519
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1520
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1521
					Client.packetWriter.addNode(var12); // L: 1522
					return 1; // L: 1523
				} else {
					int var3;
					String var11;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 1526
						var11 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 1527
						WorldMapEvent.method5063(var3, var11); // L: 1528
						return 1; // L: 1529
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						Nameable.Interpreter_intStackSize -= 3; // L: 1532
						var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 1533
						var16 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 1534
						int var9 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 2]; // L: 1535
						Widget var15 = HitSplatDefinition.getWidget(var9); // L: 1536
						class229.clickWidget(var15, var3, var16); // L: 1537
						return 1; // L: 1538
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						Nameable.Interpreter_intStackSize -= 2; // L: 1541
						var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 1542
						var16 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 1543
						Widget var13 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget; // L: 1544
						class229.clickWidget(var13, var3, var16); // L: 1545
						return 1; // L: 1546
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						Bounds.mouseCam = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 1549
						return 1; // L: 1550
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = FriendsChatMember.clientPreferences.method2209() ? 1 : 0; // L: 1553
						return 1; // L: 1554
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						FriendsChatMember.clientPreferences.method2241(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1); // L: 1557
						return 1; // L: 1558
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 1561
						boolean var8 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 1562
						class400.openURL(var7, var8, false); // L: 1563
						return 1; // L: 1564
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 1567
						var12 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2950, Client.packetWriter.isaacCipher); // L: 1569
						var12.packetBuffer.writeShort(var3); // L: 1570
						Client.packetWriter.addNode(var12); // L: 1571
						return 1; // L: 1572
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 1575
						UserComparator8.Interpreter_stringStackSize -= 2; // L: 1576
						var11 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize]; // L: 1577
						String var5 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize + 1]; // L: 1578
						if (var11.length() > 500) { // L: 1579
							return 1;
						} else if (var5.length() > 500) { // L: 1580
							return 1;
						} else {
							PacketBufferNode var6 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3005, Client.packetWriter.isaacCipher); // L: 1581
							var6.packetBuffer.writeShort(1 + class309.stringCp1252NullTerminatedByteSize(var11) + class309.stringCp1252NullTerminatedByteSize(var5)); // L: 1582
							var6.packetBuffer.method7878(var3); // L: 1583
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1584
							var6.packetBuffer.writeStringCp1252NullTerminated(var11); // L: 1585
							Client.packetWriter.addNode(var6); // L: 1586
							return 1; // L: 1587
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 1590
						return 1; // L: 1591
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 1594
						return 1; // L: 1595
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 1598
						return 1; // L: 1599
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1) { // L: 1602
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 1603
						}

						return 1; // L: 1604
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1) { // L: 1607
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 1608
						}

						return 1; // L: 1609
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1) { // L: 1612
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 1613
						}

						return 1; // L: 1614
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1) { // L: 1617
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 1618
						}

						return 1; // L: 1619
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 1622
						return 1; // L: 1623
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 1626
						return 1; // L: 1627
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 1630
						return 1; // L: 1631
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						KeyHandler.setTapToDrop(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1); // L: 1634
						return 1; // L: 1635
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = UserComparator8.getTapToDrop() ? 1 : 0; // L: 1638
						return 1; // L: 1639
					} else if (var0 == 3129) {
						Nameable.Interpreter_intStackSize -= 2; // L: 1642
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 1643
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 1644
						return 1; // L: 1645
					} else if (var0 == 3130) {
						Nameable.Interpreter_intStackSize -= 2; // L: 1648
						return 1; // L: 1649
					} else if (var0 == 3131) {
						--Nameable.Interpreter_intStackSize; // L: 1652
						return 1; // L: 1653
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class7.canvasWidth; // L: 1656
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = DecorativeObject.canvasHeight; // L: 1657
						return 1; // L: 1658
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--Nameable.Interpreter_intStackSize; // L: 1661
						return 1; // L: 1662
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 1665
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						Nameable.Interpreter_intStackSize -= 2; // L: 1668
						return 1; // L: 1669
					} else if (var0 == 3136) {
						Client.field741 = 3; // L: 1672
						Client.field652 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 1673
						return 1; // L: 1674
					} else if (var0 == 3137) {
						Client.field741 = 2; // L: 1677
						Client.field652 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 1678
						return 1; // L: 1679
					} else if (var0 == 3138) {
						Client.field741 = 0; // L: 1682
						return 1; // L: 1683
					} else if (var0 == 3139) {
						Client.field741 = 1; // L: 1686
						return 1; // L: 1687
					} else if (var0 == 3140) {
						Client.field741 = 3; // L: 1690
						Client.field652 = var2 ? SoundSystem.scriptDotWidget.id : Ignored.scriptActiveWidget.id; // L: 1691
						return 1; // L: 1692
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 1695
							FriendsChatMember.clientPreferences.method2210(var10); // L: 1696
							return 1; // L: 1697
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = FriendsChatMember.clientPreferences.method2211() ? 1 : 0; // L: 1700
							return 1; // L: 1701
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 1704
							Client.Login_isUsernameRemembered = var10; // L: 1705
							if (!var10) { // L: 1706
								FriendsChatMember.clientPreferences.method2268(""); // L: 1707
							}

							return 1; // L: 1709
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 1712
							return 1; // L: 1713
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 1716
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 1719
							FriendsChatMember.clientPreferences.method2212(!var10); // L: 1720
							return 1; // L: 1721
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = FriendsChatMember.clientPreferences.method2213() ? 0 : 1; // L: 1724
							return 1; // L: 1725
						} else if (var0 == 3148) {
							return 1; // L: 1728
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 1731
							return 1; // L: 1732
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 1735
							return 1; // L: 1736
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 1739
							return 1; // L: 1740
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 1743
							return 1; // L: 1744
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 1747
							return 1; // L: 1748
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = method2991(); // L: 1751
							return 1; // L: 1752
						} else if (var0 == 3155) {
							--UserComparator8.Interpreter_stringStackSize; // L: 1755
							return 1; // L: 1756
						} else if (var0 == 3156) {
							return 1; // L: 1759
						} else if (var0 == 3157) {
							Nameable.Interpreter_intStackSize -= 2; // L: 1762
							return 1; // L: 1763
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 1766
							return 1; // L: 1767
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 1770
							return 1; // L: 1771
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 1774
							return 1; // L: 1775
						} else if (var0 == 3161) {
							--Nameable.Interpreter_intStackSize; // L: 1778
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 1779
							return 1; // L: 1780
						} else if (var0 == 3162) {
							--Nameable.Interpreter_intStackSize; // L: 1783
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 1784
							return 1; // L: 1785
						} else if (var0 == 3163) {
							--UserComparator8.Interpreter_stringStackSize; // L: 1788
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 1789
							return 1; // L: 1790
						} else if (var0 == 3164) {
							--Nameable.Interpreter_intStackSize; // L: 1793
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 1794
							return 1; // L: 1795
						} else if (var0 == 3165) {
							--Nameable.Interpreter_intStackSize; // L: 1798
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 1799
							return 1; // L: 1800
						} else if (var0 == 3166) {
							Nameable.Interpreter_intStackSize -= 2; // L: 1803
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 1804
							return 1; // L: 1805
						} else if (var0 == 3167) {
							Nameable.Interpreter_intStackSize -= 2; // L: 1808
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 1809
							return 1; // L: 1810
						} else if (var0 == 3168) {
							Nameable.Interpreter_intStackSize -= 2; // L: 1813
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 1814
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 1815
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 1816
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 1817
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 1818
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 1819
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 1820
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 1821
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 1822
							return 1; // L: 1823
						} else if (var0 == 3169) {
							return 1; // L: 1826
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 1829
							return 1; // L: 1830
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 1833
							return 1; // L: 1834
						} else if (var0 == 3172) {
							--Nameable.Interpreter_intStackSize; // L: 1837
							return 1; // L: 1838
						} else if (var0 == 3173) {
							--Nameable.Interpreter_intStackSize; // L: 1841
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 1842
							return 1; // L: 1843
						} else if (var0 == 3174) {
							--Nameable.Interpreter_intStackSize; // L: 1846
							return 1; // L: 1847
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 1850
							return 1; // L: 1851
						} else if (var0 == 3176) {
							return 1; // L: 1854
						} else if (var0 == 3177) {
							return 1; // L: 1857
						} else if (var0 == 3178) {
							--UserComparator8.Interpreter_stringStackSize; // L: 1860
							return 1; // L: 1861
						} else if (var0 == 3179) {
							return 1; // L: 1864
						} else if (var0 == 3180) {
							--UserComparator8.Interpreter_stringStackSize; // L: 1867
							return 1; // L: 1868
						} else if (var0 == 3181) {
							WorldMapLabel.method4918(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 1871
							return 1; // L: 1872
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = WorldMapSection2.method4502(); // L: 1875
							return 1; // L: 1876
						} else if (var0 != 3183 && var0 != 3184) {
							if (var0 == 3187) {
								UserComparator8.Interpreter_stringStackSize -= 2; // L: 1883
								return 1; // L: 1884
							} else if (var0 == 3188) {
								return 1; // L: 1887
							} else if (var0 == 3189) {
								var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 1890
								SequenceDefinition var4 = ByteArrayPool.SequenceDefinition_get(var3); // L: 1891
								if (var4.isCachedModelIdSet()) { // L: 1892
									StructComposition.method3543(var4.SequenceDefinition_cachedModelId); // L: 1893
								}

								return 1; // L: 1895
							} else {
								return 2; // L: 1897
							}
						} else {
							--Nameable.Interpreter_intStackSize; // L: 1879
							return 1; // L: 1880
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "499292662"
	)
	static int method2991() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1453
			int var0 = 0; // L: 1454

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1455
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1456
			}

			return var0 * 10000 / Client.field509; // L: 1458
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-171272537"
	)
	static boolean method2990() {
		return Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81]; // L: 10768
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "17565"
	)
	static void method2983(int var0) {
		WorldMapSprite.tempMenuAction = new MenuAction(); // L: 11453
		WorldMapSprite.tempMenuAction.param0 = Client.menuArguments1[var0]; // L: 11454
		WorldMapSprite.tempMenuAction.param1 = Client.menuArguments2[var0]; // L: 11455
		WorldMapSprite.tempMenuAction.opcode = Client.menuOpcodes[var0]; // L: 11456
		WorldMapSprite.tempMenuAction.identifier = Client.menuIdentifiers[var0]; // L: 11457
		WorldMapSprite.tempMenuAction.field859 = Client.field630[var0]; // L: 11458
		WorldMapSprite.tempMenuAction.field857 = Client.menuActions[var0]; // L: 11459
		WorldMapSprite.tempMenuAction.action = Client.menuTargets[var0]; // L: 11460
	} // L: 11461
}
