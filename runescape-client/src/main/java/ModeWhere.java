import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lk")
@Implements("ModeWhere")
public enum ModeWhere implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	field4138("", 0, new class327[]{class327.field4100}),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	field4129("", 1, new class327[]{class327.field4102, class327.field4100}),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	field4128("", 2, new class327[]{class327.field4102, class327.field4101, class327.field4100}),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	field4131("", 3, new class327[]{class327.field4102}),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	field4130("", 4),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	field4133("", 5, new class327[]{class327.field4102, class327.field4100}),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	field4132("", 6, new class327[]{class327.field4100}),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	field4139("", 8, new class327[]{class327.field4102, class327.field4100}),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	field4134("", 9, new class327[]{class327.field4102, class327.field4101}),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	field4135("", 10, new class327[]{class327.field4102}),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	field4136("", 11, new class327[]{class327.field4102}),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	field4137("", 12, new class327[]{class327.field4102, class327.field4100}),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	field4126("", 13, new class327[]{class327.field4102});

	@ObfuscatedName("k")
	@Export("ByteArrayPool_arrays")
	static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1726511913
	)
	@Export("id")
	final int id;
	@ObfuscatedName("p")
	final Set field4140;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Llp;)V"
	)
	ModeWhere(String var3, int var4, class327[] var5) {
		this.field4140 = new HashSet();
		this.id = var4; // L: 39
		class327[] var6 = var5; // L: 41

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 42
			class327 var8 = var6[var7]; // L: 43
			this.field4140.add(var8); // L: 44
		}

	} // L: 47

	ModeWhere(String var3, int var4) {
		this.field4140 = new HashSet(); // L: 32
		this.id = var4; // L: 35
	} // L: 36

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1790946346"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 51
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "116"
	)
	public static void method6093() {
		synchronized(KeyHandler.KeyHandler_instance) { // L: 138
			++KeyHandler.KeyHandler_idleCycles; // L: 139
			KeyHandler.field148 = KeyHandler.field150; // L: 140
			KeyHandler.field131 = 0; // L: 141
			KeyHandler.field142 = 0; // L: 142
			Arrays.fill(KeyHandler.field137, false); // L: 143
			Arrays.fill(KeyHandler.field138, false); // L: 144
			if (KeyHandler.field141 < 0) { // L: 145
				Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false); // L: 146
				KeyHandler.field141 = KeyHandler.field140; // L: 147
			} else {
				while (KeyHandler.field141 != KeyHandler.field140) { // L: 150
					int var1 = KeyHandler.field139[KeyHandler.field140]; // L: 151
					KeyHandler.field140 = KeyHandler.field140 + 1 & 127; // L: 152
					if (var1 < 0) { // L: 153
						var1 = ~var1; // L: 154
						if (KeyHandler.KeyHandler_pressedKeys[var1]) { // L: 155
							KeyHandler.KeyHandler_pressedKeys[var1] = false; // L: 156
							KeyHandler.field138[var1] = true; // L: 157
							KeyHandler.field135[KeyHandler.field142] = var1; // L: 158
							++KeyHandler.field142; // L: 159
						}
					} else {
						if (!KeyHandler.KeyHandler_pressedKeys[var1] && KeyHandler.field131 < KeyHandler.field146.length - 1) { // L: 163
							KeyHandler.field137[var1] = true; // L: 164
							KeyHandler.field146[++KeyHandler.field131 - 1] = var1; // L: 165
						}

						KeyHandler.KeyHandler_pressedKeys[var1] = true; // L: 167
					}
				}
			}

			if (KeyHandler.field131 > 0) { // L: 171
				KeyHandler.KeyHandler_idleCycles = 0;
			}

			KeyHandler.field150 = KeyHandler.field144; // L: 172
		}
	} // L: 174

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "792876957"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) { // L: 102
			int var3 = var0; // L: 104
			String var2;
			if (var1 && var0 >= 0) { // L: 107
				int var4 = 2; // L: 111

				for (int var5 = var0 / 10; var5 != 0; ++var4) { // L: 112 113 115
					var5 /= 10; // L: 114
				}

				char[] var6 = new char[var4]; // L: 117
				var6[0] = '+'; // L: 118

				for (int var7 = var4 - 1; var7 > 0; --var7) { // L: 119
					int var8 = var3; // L: 120
					var3 /= 10; // L: 121
					int var9 = var8 - var3 * 10; // L: 122
					if (var9 >= 10) { // L: 123
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48); // L: 124
					}
				}

				var2 = new String(var6); // L: 126
			} else {
				var2 = Integer.toString(var0, 10); // L: 108
			}

			return var2; // L: 128
		} else {
			return Integer.toString(var0);
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "1976675323"
	)
	static int method6095(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1480
			var7 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 1481
			FileSystem.addGameMessage(0, "", var7); // L: 1482
			return 1; // L: 1483
		} else if (var0 == ScriptOpcodes.ANIM) {
			TaskHandler.Interpreter_intStackSize -= 2; // L: 1486
			Strings.performPlayerAnimation(class28.localPlayer, Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize], Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]); // L: 1487
			return 1; // L: 1488
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field840) { // L: 1491
				Interpreter.field831 = true; // L: 1492
			}

			return 1; // L: 1494
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 1497
				var15 = 0; // L: 1498
				if (class126.isNumber(var7)) { // L: 1499
					var15 = class121.method2824(var7);
				}

				PacketBufferNode var13 = class433.getPacketBufferNode(ClientPacket.field2938, Client.packetWriter.isaacCipher); // L: 1501
				var13.packetBuffer.writeInt(var15); // L: 1502
				Client.packetWriter.addNode(var13); // L: 1503
				return 1; // L: 1504
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 1507
					var11 = class433.getPacketBufferNode(ClientPacket.field2964, Client.packetWriter.isaacCipher); // L: 1509
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1510
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1511
					Client.packetWriter.addNode(var11); // L: 1512
					return 1; // L: 1513
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 1516
					var11 = class433.getPacketBufferNode(ClientPacket.field2945, Client.packetWriter.isaacCipher); // L: 1518
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1519
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1520
					Client.packetWriter.addNode(var11); // L: 1521
					return 1; // L: 1522
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 1525
						var4 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 1526
						Projectile.method2008(var10, var4); // L: 1527
						return 1; // L: 1528
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						TaskHandler.Interpreter_intStackSize -= 3; // L: 1531
						var10 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 1532
						var15 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 1533
						int var9 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]; // L: 1534
						Widget var14 = FloorUnderlayDefinition.getWidget(var9); // L: 1535
						class19.clickWidget(var14, var10, var15); // L: 1536
						return 1; // L: 1537
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						TaskHandler.Interpreter_intStackSize -= 2; // L: 1540
						var10 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 1541
						var15 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 1542
						Widget var12 = var2 ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget; // L: 1543
						class19.clickWidget(var12, var10, var15); // L: 1544
						return 1; // L: 1545
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						ObjectSound.mouseCam = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 1548
						return 1; // L: 1549
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class260.clientPreferences.method2312() ? 1 : 0; // L: 1552
						return 1; // L: 1553
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class260.clientPreferences.method2311(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1); // L: 1556
						return 1; // L: 1557
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 1560
						boolean var8 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 1561
						class238.openURL(var7, var8, false); // L: 1562
						return 1; // L: 1563
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 1566
						var11 = class433.getPacketBufferNode(ClientPacket.field2982, Client.packetWriter.isaacCipher); // L: 1568
						var11.packetBuffer.writeShort(var10); // L: 1569
						Client.packetWriter.addNode(var11); // L: 1570
						return 1; // L: 1571
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 1574
						GrandExchangeOfferAgeComparator.Interpreter_stringStackSize -= 2; // L: 1575
						var4 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 1576
						String var5 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize + 1]; // L: 1577
						if (var4.length() > 500) { // L: 1578
							return 1;
						} else if (var5.length() > 500) { // L: 1579
							return 1;
						} else {
							PacketBufferNode var6 = class433.getPacketBufferNode(ClientPacket.field2999, Client.packetWriter.isaacCipher); // L: 1580
							var6.packetBuffer.writeShort(1 + class92.stringCp1252NullTerminatedByteSize(var4) + class92.stringCp1252NullTerminatedByteSize(var5)); // L: 1581
							var6.packetBuffer.method7762(var10); // L: 1582
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1583
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1584
							Client.packetWriter.addNode(var6); // L: 1585
							return 1; // L: 1586
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 1589
						return 1; // L: 1590
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 1593
						return 1; // L: 1594
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 1597
						return 1; // L: 1598
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1) { // L: 1601
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 1602
						}

						return 1; // L: 1603
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1) { // L: 1606
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 1607
						}

						return 1; // L: 1608
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1) { // L: 1611
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 1612
						}

						return 1; // L: 1613
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1) { // L: 1616
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 1617
						}

						return 1; // L: 1618
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 1621
						return 1; // L: 1622
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 1625
						return 1; // L: 1626
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 1629
						return 1; // L: 1630
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						GrandExchangeEvents.setTapToDrop(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1); // L: 1633
						return 1; // L: 1634
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class16.getTapToDrop() ? 1 : 0; // L: 1637
						return 1; // L: 1638
					} else if (var0 == 3129) {
						TaskHandler.Interpreter_intStackSize -= 2; // L: 1641
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 1642
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 1643
						return 1; // L: 1644
					} else if (var0 == 3130) {
						TaskHandler.Interpreter_intStackSize -= 2; // L: 1647
						return 1; // L: 1648
					} else if (var0 == 3131) {
						--TaskHandler.Interpreter_intStackSize; // L: 1651
						return 1; // L: 1652
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class352.canvasWidth; // L: 1655
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class228.canvasHeight; // L: 1656
						return 1; // L: 1657
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--TaskHandler.Interpreter_intStackSize; // L: 1660
						return 1; // L: 1661
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 1664
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						TaskHandler.Interpreter_intStackSize -= 2; // L: 1667
						return 1; // L: 1668
					} else if (var0 == 3136) {
						Client.field603 = 3; // L: 1671
						Client.field660 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 1672
						return 1; // L: 1673
					} else if (var0 == 3137) {
						Client.field603 = 2; // L: 1676
						Client.field660 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 1677
						return 1; // L: 1678
					} else if (var0 == 3138) {
						Client.field603 = 0; // L: 1681
						return 1; // L: 1682
					} else if (var0 == 3139) {
						Client.field603 = 1; // L: 1685
						return 1; // L: 1686
					} else if (var0 == 3140) {
						Client.field603 = 3; // L: 1689
						Client.field660 = var2 ? VertexNormal.scriptDotWidget.id : class321.scriptActiveWidget.id; // L: 1690
						return 1; // L: 1691
					} else {
						boolean var3;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 1694
							class260.clientPreferences.method2389(var3); // L: 1695
							return 1; // L: 1696
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class260.clientPreferences.method2326() ? 1 : 0; // L: 1699
							return 1; // L: 1700
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 1703
							Client.Login_isUsernameRemembered = var3; // L: 1704
							if (!var3) { // L: 1705
								class260.clientPreferences.method2330(""); // L: 1706
							}

							return 1; // L: 1708
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 1711
							return 1; // L: 1712
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 1715
						} else if (var0 == 3146) {
							var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 1718
							class260.clientPreferences.method2347(!var3); // L: 1719
							return 1; // L: 1720
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class260.clientPreferences.method2316() ? 0 : 1; // L: 1723
							return 1; // L: 1724
						} else if (var0 == 3148) {
							return 1; // L: 1727
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 1730
							return 1; // L: 1731
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 1734
							return 1; // L: 1735
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 1738
							return 1; // L: 1739
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 1742
							return 1; // L: 1743
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 1746
							return 1; // L: 1747
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ArchiveDiskAction.method5786(); // L: 1750
							return 1; // L: 1751
						} else if (var0 == 3155) {
							--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 1754
							return 1; // L: 1755
						} else if (var0 == 3156) {
							return 1; // L: 1758
						} else if (var0 == 3157) {
							TaskHandler.Interpreter_intStackSize -= 2; // L: 1761
							return 1; // L: 1762
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 1765
							return 1; // L: 1766
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 1769
							return 1; // L: 1770
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 1773
							return 1; // L: 1774
						} else if (var0 == 3161) {
							--TaskHandler.Interpreter_intStackSize; // L: 1777
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 1778
							return 1; // L: 1779
						} else if (var0 == 3162) {
							--TaskHandler.Interpreter_intStackSize; // L: 1782
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 1783
							return 1; // L: 1784
						} else if (var0 == 3163) {
							--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 1787
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 1788
							return 1; // L: 1789
						} else if (var0 == 3164) {
							--TaskHandler.Interpreter_intStackSize; // L: 1792
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 1793
							return 1; // L: 1794
						} else if (var0 == 3165) {
							--TaskHandler.Interpreter_intStackSize; // L: 1797
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 1798
							return 1; // L: 1799
						} else if (var0 == 3166) {
							TaskHandler.Interpreter_intStackSize -= 2; // L: 1802
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 1803
							return 1; // L: 1804
						} else if (var0 == 3167) {
							TaskHandler.Interpreter_intStackSize -= 2; // L: 1807
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 1808
							return 1; // L: 1809
						} else if (var0 == 3168) {
							TaskHandler.Interpreter_intStackSize -= 2; // L: 1812
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 1813
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 1814
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 1815
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 1816
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 1817
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 1818
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 1819
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 1820
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 1821
							return 1; // L: 1822
						} else if (var0 == 3169) {
							return 1; // L: 1825
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 1828
							return 1; // L: 1829
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 1832
							return 1; // L: 1833
						} else if (var0 == 3172) {
							--TaskHandler.Interpreter_intStackSize; // L: 1836
							return 1; // L: 1837
						} else if (var0 == 3173) {
							--TaskHandler.Interpreter_intStackSize; // L: 1840
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 1841
							return 1; // L: 1842
						} else if (var0 == 3174) {
							--TaskHandler.Interpreter_intStackSize; // L: 1845
							return 1; // L: 1846
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 1849
							return 1; // L: 1850
						} else if (var0 == 3176) {
							return 1; // L: 1853
						} else if (var0 == 3177) {
							return 1; // L: 1856
						} else if (var0 == 3178) {
							--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 1859
							return 1; // L: 1860
						} else if (var0 == 3179) {
							return 1; // L: 1863
						} else if (var0 == 3180) {
							--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 1866
							return 1; // L: 1867
						} else if (var0 == 3181) {
							DecorativeObject.method4516(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 1870
							return 1; // L: 1871
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class155.method3238(); // L: 1874
							return 1; // L: 1875
						} else if (var0 != 3183 && var0 != 3184) {
							if (var0 == 3187) {
								GrandExchangeOfferAgeComparator.Interpreter_stringStackSize -= 2; // L: 1882
								return 1; // L: 1883
							} else {
								return var0 == 3188 ? 1 : 2; // L: 1886 1888
							}
						} else {
							--TaskHandler.Interpreter_intStackSize; // L: 1878
							return 1; // L: 1879
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)Z",
		garbageValue = "1852484167"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 12276
	}
}
