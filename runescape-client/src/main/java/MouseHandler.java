import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bd")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	@Export("KeyHandler_instance")
	public static MouseHandler KeyHandler_instance;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -119381545
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1968896183
	)
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 445060765
	)
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -386183297
	)
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -2839494544011084867L
	)
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 114417019
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2063363905
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1224153235
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = -1090234605399222665L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1491866359
	)
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1746356811
	)
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 635605553
	)
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = -6850231559915013785L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1222491879
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2020601481
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1163896205
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -1442809844282041895L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;

	static {
		KeyHandler_instance = new MouseHandler(); // L: 15
		MouseHandler_idleCycles = 0; // L: 16
		MouseHandler_currentButtonVolatile = 0; // L: 17
		MouseHandler_xVolatile = -1; // L: 18
		MouseHandler_yVolatile = -1; // L: 19
		MouseHandler_lastMovedVolatile = -1L; // L: 20
		MouseHandler_currentButton = 0; // L: 21
		MouseHandler_x = 0; // L: 22
		MouseHandler_y = 0; // L: 23
		MouseHandler_millis = 0L; // L: 24
		MouseHandler_lastButtonVolatile = 0; // L: 25
		MouseHandler_lastPressedXVolatile = 0; // L: 26
		MouseHandler_lastPressedYVolatile = 0; // L: 27
		MouseHandler_lastPressedTimeMillisVolatile = 0L; // L: 28
		MouseHandler_lastButton = 0; // L: 29
		MouseHandler_lastPressedX = 0; // L: 30
		MouseHandler_lastPressedY = 0; // L: 31
		MouseHandler_lastPressedTimeMillis = 0L; // L: 32
	}

	MouseHandler() {
	} // L: 34

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;B)I",
		garbageValue = "-121"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 55
		if (!var1.isAltDown() && var2 != 2) { // L: 56
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 57 58
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (KeyHandler_instance != null) { // L: 103
			MouseHandler_idleCycles = 0; // L: 104
			MouseHandler_xVolatile = var1.getX(); // L: 105
			MouseHandler_yVolatile = var1.getY(); // L: 106
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 107
		}

	} // L: 109

	public final synchronized void mousePressed(MouseEvent var1) {
		if (KeyHandler_instance != null) { // L: 62
			MouseHandler_idleCycles = 0; // L: 63
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 64
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 65
			MouseHandler_lastPressedTimeMillisVolatile = class96.method2634(); // L: 66
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 67
			if (MouseHandler_lastButtonVolatile != 0) { // L: 68
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 70
			var1.consume();
		}

	} // L: 71

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (KeyHandler_instance != null) { // L: 74
			MouseHandler_idleCycles = 0; // L: 75
			MouseHandler_currentButtonVolatile = 0; // L: 76
		}

		if (var1.isPopupTrigger()) { // L: 78
			var1.consume();
		}

	} // L: 79

	public final synchronized void mouseExited(MouseEvent var1) {
		if (KeyHandler_instance != null) { // L: 90
			MouseHandler_idleCycles = 0; // L: 91
			MouseHandler_xVolatile = -1; // L: 92
			MouseHandler_yVolatile = -1; // L: 93
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 94
		}

	} // L: 96

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 82
			var1.consume();
		}

	} // L: 83

	public final void focusGained(FocusEvent var1) {
	} // L: 111

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) { // L: 114
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 115

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 86
	} // L: 87

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 99
	} // L: 100

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-2111294595"
	)
	public static boolean method714(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) { // L: 45
			return true;
		} else {
			if (var0 != 0) { // L: 46
				char[] var1 = class369.cp1252AsciiExtension; // L: 48

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 49
					char var3 = var1[var2]; // L: 50
					if (var0 == var3) { // L: 52
						return true; // L: 53
					}
				}
			}

			return false; // L: 59
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZB)I",
		garbageValue = "-15"
	)
	static int method713(int var0, Script var1, boolean var2) {
		Widget var3 = class165.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1657
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1658
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1659
			return 1; // L: 1660
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1662
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1663
			return 1; // L: 1664
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1666
			Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3.text; // L: 1667
			return 1; // L: 1668
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1670
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1671
			return 1; // L: 1672
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1674
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1675
			return 1; // L: 1676
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1678
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1679
			return 1; // L: 1680
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1682
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1683
			return 1; // L: 1684
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1686
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1687
			return 1; // L: 1688
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1690
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1691
			return 1; // L: 1692
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1694
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1695
			return 1; // L: 1696
		} else if (var0 == 2610) { // L: 1698
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1699
			return 1; // L: 1700
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1702
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1703
			return 1; // L: 1704
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1706
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1707
			return 1; // L: 1708
		} else if (var0 == 2613) { // L: 1710
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1711
			return 1; // L: 1712
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1714
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1715
			return 1; // L: 1716
		} else {
			class309 var4;
			if (var0 == 2617) { // L: 1718
				var4 = var3.method6394(); // L: 1719
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3493 : 0; // L: 1720
			}

			if (var0 == 2618) { // L: 1722
				var4 = var3.method6394(); // L: 1723
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3489 : 0; // L: 1724
				return 1; // L: 1725
			} else {
				class314 var7;
				if (var0 == 2619) { // L: 1727
					var7 = var3.method6392(); // L: 1728
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6136().method7265() : ""; // L: 1729
					return 1; // L: 1730
				} else if (var0 == 2620) { // L: 1732
					var4 = var3.method6394(); // L: 1733
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3491 : 0; // L: 1734
					return 1; // L: 1735
				} else if (var0 == 2621) { // L: 1737
					var7 = var3.method6392(); // L: 1738
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6146() : 0; // L: 1739
					return 1; // L: 1740
				} else if (var0 == 2622) { // L: 1742
					var7 = var3.method6392(); // L: 1743
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6329() : 0; // L: 1744
					return 1; // L: 1745
				} else if (var0 == 2623) { // L: 1747
					var7 = var3.method6392(); // L: 1748
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6099() : 0; // L: 1749
					return 1; // L: 1750
				} else if (var0 == 2624) { // L: 1752
					var7 = var3.method6392(); // L: 1753
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6138() ? 1 : 0; // L: 1754
					return 1; // L: 1755
				} else if (var0 != 2625) { // L: 1757
					if (var0 == 2626) { // L: 1762
						var7 = var3.method6392(); // L: 1763
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6137().method7522() : ""; // L: 1764
						return 1; // L: 1765
					} else if (var0 == 2627) { // L: 1767
						var7 = var3.method6392(); // L: 1768
						int var5 = var7 != null ? var7.method6142() : 0; // L: 1769
						int var6 = var7 != null ? var7.method6141() : 0; // L: 1770
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1771
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1772
						return 1; // L: 1773
					} else if (var0 == 2628) { // L: 1775
						var7 = var3.method6392(); // L: 1776
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6141() : 0; // L: 1777
						return 1; // L: 1778
					} else if (var0 == 2629) { // L: 1780
						var7 = var3.method6392(); // L: 1781
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6148() : 0; // L: 1782
						return 1; // L: 1783
					} else if (var0 == 2630) { // L: 1785
						var7 = var3.method6392(); // L: 1786
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6149() : 0; // L: 1787
						return 1; // L: 1788
					} else if (var0 == 2631) { // L: 1790
						var7 = var3.method6392(); // L: 1791
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6151() : 0; // L: 1792
						return 1; // L: 1793
					} else if (var0 == 2632) { // L: 1795
						var7 = var3.method6392(); // L: 1796
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6152() : 0; // L: 1797
						return 1; // L: 1798
					} else {
						class27 var8;
						if (var0 == 2633) { // L: 1800
							var8 = var3.method6367(); // L: 1801
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method409(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1802
							return 1; // L: 1803
						} else if (var0 == 2634) { // L: 1805
							var8 = var3.method6367(); // L: 1806
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method410((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1807
							return 1; // L: 1808
						} else {
							return 2; // L: 1810
						}
					}
				} else {
					var7 = var3.method6392(); // L: 1758
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6139() ? 1 : 0; // L: 1759
					return 1; // L: 1760
				}
			}
		}
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-372100645"
	)
	static int method710() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1451
			int var0 = 0; // L: 1452

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1453
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1454
			}

			return var0 * 10000 / Client.field529; // L: 1456
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(Ldv;ZI)V",
		garbageValue = "-1861126010"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 4756
			var0.isUnanimated = false; // L: 4757
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.idleSequence == var0.movementSequence) { // L: 4758 4759
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 4761
			int var3 = var0.y >> 7; // L: 4762
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 4763
				long var4 = FaceNormal.calculateTag(0, 0, 0, false, var0.index); // L: 4764
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 4765
					var0.isUnanimated = false; // L: 4766
					var0.tileHeight = class147.getTileHeight(var0.x, var0.y, GameEngine.Client_plane); // L: 4767
					var0.playerCycle = Client.cycle; // L: 4768
					class31.scene.addNullableObject(GameEngine.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY); // L: 4769
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 4772
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 4773
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 4774
					}

					var0.tileHeight = class147.getTileHeight(var0.x, var0.y, GameEngine.Client_plane); // L: 4776
					var0.playerCycle = Client.cycle; // L: 4777
					class31.scene.drawEntity(GameEngine.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 4778
				}
			}
		}

	} // L: 4782

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(Lmq;I)V",
		garbageValue = "1973631354"
	)
	static final void method712(Widget var0) {
		int var1 = var0.contentType; // L: 11737
		if (var1 == 324) { // L: 11738
			if (Client.field772 == -1) { // L: 11739
				Client.field772 = var0.spriteId2; // L: 11740
				Client.field773 = var0.spriteId; // L: 11741
			}

			if (Client.playerAppearance.field3521 == 1) { // L: 11743
				var0.spriteId2 = Client.field772;
			} else {
				var0.spriteId2 = Client.field773; // L: 11744
			}

		} else if (var1 == 325) { // L: 11747
			if (Client.field772 == -1) { // L: 11748
				Client.field772 = var0.spriteId2; // L: 11749
				Client.field773 = var0.spriteId; // L: 11750
			}

			if (Client.playerAppearance.field3521 == 1) { // L: 11752
				var0.spriteId2 = Client.field773;
			} else {
				var0.spriteId2 = Client.field772; // L: 11753
			}

		} else if (var1 == 327) { // L: 11756
			var0.modelAngleX = 150; // L: 11757
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11758
			var0.modelType = 5; // L: 11759
			var0.modelId = 0; // L: 11760
		} else if (var1 == 328) { // L: 11763
			var0.modelAngleX = 150; // L: 11764
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11765
			var0.modelType = 5; // L: 11766
			var0.modelId = 1; // L: 11767
		}
	} // L: 11745 11754 11761 11768 11770
}
