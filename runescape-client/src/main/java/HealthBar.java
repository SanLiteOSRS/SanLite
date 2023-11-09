import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lgi;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque(); // L: 12
		this.definition = var1; // L: 15
	} // L: 16

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2137835977"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null; // L: 19
		int var6 = 0; // L: 20

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) { // L: 21
			++var6; // L: 22
			if (var7.cycle == var1) { // L: 23
				var7.set(var1, var2, var3, var4); // L: 24
				return; // L: 25
			}

			if (var7.cycle <= var1) {
				var5 = var7; // L: 27
			}
		}

		if (var5 == null) { // L: 29
			if (var6 < 4) { // L: 30
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5); // L: 33
			if (var6 >= 4) {
				this.updates.last().remove(); // L: 34
			}

		}
	} // L: 31 35

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Lcz;",
		garbageValue = "1621839790"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last(); // L: 38
		if (var2 != null && var2.cycle <= var1) { // L: 39
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) { // L: 40 41
				var2.remove(); // L: 42
				var2 = var3; // L: 43
			}

			if (this.definition.int5 + var2.cycleOffset + var2.cycle > var1) { // L: 47
				return var2;
			} else {
				var2.remove(); // L: 49
				return null; // L: 50
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "776562128"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method6900(); // L: 55
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "97534508"
	)
	static boolean method2611(int var0, int var1, int var2) {
		return var0 >= 0 && var0 < 4 && var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104; // L: 13
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1489961954"
	)
	public static boolean method2609(int var0) {
		return var0 == WorldMapDecorationType.field3765.id; // L: 51
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Laj;I)V",
		garbageValue = "-644486874"
	)
	static void method2610(GameEngine var0) {
		class205 var1 = Client.field702; // L: 1769
		class205 var2 = var1; // L: 1771

		while (var2.method4141()) { // L: 1772
			if (var2.field2339 == 13) { // L: 1773
				class17.method270(); // L: 1774
				return; // L: 1775
			}

			if (var2.field2339 == 96) { // L: 1777
				if (Login.worldSelectPage > 0 && StudioGame.worldSelectLeftSprite != null) { // L: 1778
					--Login.worldSelectPage; // L: 1779
				}
			} else if (var2.field2339 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class205.worldSelectRightSprite != null) { // L: 1782 1783
				++Login.worldSelectPage; // L: 1784
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !FriendsChatMember.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 1788
			int var3 = Login.xPadding + 280; // L: 1789
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1790
				class369.changeWorldSelectSorting(0, 0); // L: 1791
				return; // L: 1792
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1794
				class369.changeWorldSelectSorting(0, 1); // L: 1795
				return; // L: 1796
			}

			int var4 = Login.xPadding + 390; // L: 1798
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1799
				class369.changeWorldSelectSorting(1, 0); // L: 1800
				return; // L: 1801
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1803
				class369.changeWorldSelectSorting(1, 1); // L: 1804
				return; // L: 1805
			}

			int var5 = Login.xPadding + 500; // L: 1807
			if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1808
				class369.changeWorldSelectSorting(2, 0); // L: 1809
				return; // L: 1810
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1812
				class369.changeWorldSelectSorting(2, 1); // L: 1813
				return; // L: 1814
			}

			int var6 = Login.xPadding + 610; // L: 1816
			if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var6 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1817
				class369.changeWorldSelectSorting(3, 0); // L: 1818
				return; // L: 1819
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var6 + 15 && MouseHandler.MouseHandler_lastPressedX <= var6 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1821
				class369.changeWorldSelectSorting(3, 1); // L: 1822
				return; // L: 1823
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 1825
				class17.method270(); // L: 1826
				return; // L: 1827
			}

			if (Login.hoveredWorldIndex != -1) { // L: 1829
				World var7 = class88.World_worlds[Login.hoveredWorldIndex]; // L: 1830
				VarbitComposition.changeWorld(var7); // L: 1831
				class17.method270(); // L: 1832
				return; // L: 1833
			}

			if (Login.worldSelectPage > 0 && StudioGame.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= StudioGame.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class127.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class127.canvasHeight / 2 + 50) { // L: 1835
				--Login.worldSelectPage; // L: 1836
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && class205.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GameEngine.canvasWidth - class205.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GameEngine.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class127.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class127.canvasHeight / 2 + 50) { // L: 1838
				++Login.worldSelectPage; // L: 1839
			}
		}

	} // L: 1842
}
