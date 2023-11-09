import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("r")
public class class7 {
	@ObfuscatedName("h")
	ExecutorService field23;
	@ObfuscatedName("e")
	Future field24;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	final Buffer field25;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class3 field28;

	@ObfuscatedSignature(
		descriptor = "(Lqy;Lx;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field23 = Executors.newSingleThreadExecutor(); // L: 10
		this.field25 = var1; // L: 16
		this.field28 = var2; // L: 17
		this.method46(); // L: 18
	} // L: 19

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "10"
	)
	public boolean method57() {
		return this.field24.isDone(); // L: 22
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "67"
	)
	public void method45() {
		this.field23.shutdown(); // L: 26
		this.field23 = null; // L: 27
	} // L: 28

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lqy;",
		garbageValue = "1313541740"
	)
	public Buffer method56() {
		try {
			return (Buffer)this.field24.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "117"
	)
	void method46() {
		this.field24 = this.field23.submit(new class1(this, this.field25, this.field28)); // L: 40
	} // L: 41

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "-831312501"
	)
	static int method54(int var0, Script var1, boolean var2) {
		Widget var3 = class175.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 1632
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1633
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1634
			return 1; // L: 1635
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1637
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1638
			return 1; // L: 1639
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1641
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text; // L: 1642
			return 1; // L: 1643
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1645
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1646
			return 1; // L: 1647
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1649
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1650
			return 1; // L: 1651
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1653
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1654
			return 1; // L: 1655
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1657
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1658
			return 1; // L: 1659
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1661
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1662
			return 1; // L: 1663
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1665
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1666
			return 1; // L: 1667
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1669
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1670
			return 1; // L: 1671
		} else if (var0 == 2610) { // L: 1673
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1674
			return 1; // L: 1675
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1677
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.color; // L: 1678
			return 1; // L: 1679
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1681
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.color2; // L: 1682
			return 1; // L: 1683
		} else if (var0 == 2613) { // L: 1685
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1686
			return 1; // L: 1687
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1689
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1690
			return 1; // L: 1691
		} else {
			class298 var4;
			if (var0 == 2617) { // L: 1693
				var4 = var3.method6293(); // L: 1694
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4 != null ? var4.field3454 : 0; // L: 1695
			}

			if (var0 == 2618) { // L: 1697
				var4 = var3.method6293(); // L: 1698
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4 != null ? var4.field3456 : 0; // L: 1699
				return 1; // L: 1700
			} else {
				class303 var7;
				if (var0 == 2619) { // L: 1702
					var7 = var3.method6167(); // L: 1703
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5893().method7091() : ""; // L: 1704
					return 1; // L: 1705
				} else if (var0 == 2620) { // L: 1707
					var4 = var3.method6293(); // L: 1708
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4 != null ? var4.field3455 : 0; // L: 1709
					return 1; // L: 1710
				} else if (var0 == 2621) { // L: 1712
					var7 = var3.method6167(); // L: 1713
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method5939() : 0; // L: 1714
					return 1; // L: 1715
				} else if (var0 == 2622) { // L: 1717
					var7 = var3.method6167(); // L: 1718
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method5940() : 0; // L: 1719
					return 1; // L: 1720
				} else if (var0 == 2623) { // L: 1722
					var7 = var3.method6167(); // L: 1723
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method6111() : 0; // L: 1724
					return 1; // L: 1725
				} else if (var0 == 2624) { // L: 1727
					var7 = var3.method6167(); // L: 1728
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null && var7.method5963() ? 1 : 0; // L: 1729
					return 1; // L: 1730
				} else if (var0 != 2625) { // L: 1732
					if (var0 == 2626) { // L: 1737
						var7 = var3.method6167(); // L: 1738
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5930().method7272() : ""; // L: 1739
						return 1; // L: 1740
					} else if (var0 == 2627) { // L: 1742
						var7 = var3.method6167(); // L: 1743
						int var5 = var7 != null ? var7.method5913() : 0; // L: 1744
						int var6 = var7 != null ? var7.method5934() : 0; // L: 1745
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1746
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1747
						return 1; // L: 1748
					} else if (var0 == 2628) { // L: 1750
						var7 = var3.method6167(); // L: 1751
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method5934() : 0; // L: 1752
						return 1; // L: 1753
					} else if (var0 == 2629) { // L: 1755
						var7 = var3.method6167(); // L: 1756
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method6054() : 0; // L: 1757
						return 1; // L: 1758
					} else if (var0 == 2630) { // L: 1760
						var7 = var3.method6167(); // L: 1761
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method5942() : 0; // L: 1762
						return 1; // L: 1763
					} else if (var0 == 2631) { // L: 1765
						var7 = var3.method6167(); // L: 1766
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method5944() : 0; // L: 1767
						return 1; // L: 1768
					} else if (var0 == 2632) { // L: 1770
						var7 = var3.method6167(); // L: 1771
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method6024() : 0; // L: 1772
						return 1; // L: 1773
					} else {
						class28 var8;
						if (var0 == 2633) { // L: 1775
							var8 = var3.method6187(); // L: 1776
							Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1] = var8 != null ? var8.method393(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1]) : 0; // L: 1777
							return 1; // L: 1778
						} else if (var0 == 2634) { // L: 1780
							var8 = var3.method6187(); // L: 1781
							Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1] = var8 != null ? var8.method396((char)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1]) : 0; // L: 1782
							return 1; // L: 1783
						} else {
							return 2; // L: 1785
						}
					}
				} else {
					var7 = var3.method6167(); // L: 1733
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null && var7.method5878() ? 1 : 0; // L: 1734
					return 1; // L: 1735
				}
			}
		}
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "255"
	)
	static final void method43(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 12191
		StructComposition.clientPreferences.updateSoundEffectVolume(var0); // L: 12192
	} // L: 12193

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lcx;",
		garbageValue = "-413394938"
	)
	static final InterfaceParent method44(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 12313
		var3.group = var1; // L: 12314
		var3.type = var2; // L: 12315
		Client.interfaceParents.put(var3, (long)var0); // L: 12316
		class69.Widget_resetModelFrames(var1); // L: 12317
		Widget var4 = class175.getWidget(var0); // L: 12318
		class69.invalidateWidget(var4); // L: 12319
		if (Client.meslayerContinueWidget != null) { // L: 12320
			class69.invalidateWidget(Client.meslayerContinueWidget); // L: 12321
			Client.meslayerContinueWidget = null; // L: 12322
		}

		class169.revalidateWidgetScroll(class71.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 12324
		class31.runWidgetOnLoadListener(var1); // L: 12325
		if (Client.rootInterface != -1) { // L: 12326
			GrandExchangeOfferAgeComparator.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 12327
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1774309040"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = class136.getPacketBufferNode(ClientPacket.field3145, Client.packetWriter.isaacCipher); // L: 12548
		var0.packetBuffer.writeByte(0); // L: 12549
		Client.packetWriter.addNode(var0); // L: 12550
	} // L: 12551
}
