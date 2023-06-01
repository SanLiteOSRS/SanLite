import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qk")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1010838101
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 571022601
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 959720101
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -406939681
	)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2); // L: 14
		this.setHigh(var3, var4); // L: 15
	} // L: 16

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2); // L: 10
	} // L: 11

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "119"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "34921499"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "64"
	)
	public boolean method8065(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.highY + this.lowY; // L: 29
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqk;Lqk;I)V",
		garbageValue = "87380278"
	)
	public void method8081(Bounds var1, Bounds var2) {
		this.method8085(var1, var2); // L: 37
		this.method8075(var1, var2); // L: 38
	} // L: 39

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqk;Lqk;I)V",
		garbageValue = "1477821023"
	)
	void method8085(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 42
		var2.highX = this.highX; // L: 43
		if (this.lowX < var1.lowX) { // L: 44
			var2.highX -= var1.lowX - this.lowX; // L: 45
			var2.lowX = var1.lowX; // L: 46
		}

		if (var2.method8062() > var1.method8062()) { // L: 48
			var2.highX -= var2.method8062() - var1.method8062(); // L: 49
		}

		if (var2.highX < 0) { // L: 51
			var2.highX = 0;
		}

	} // L: 52

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqk;Lqk;I)V",
		garbageValue = "-1465147878"
	)
	void method8075(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 55
		var2.highY = this.highY; // L: 56
		if (this.lowY < var1.lowY) { // L: 57
			var2.highY -= var1.lowY - this.lowY; // L: 58
			var2.lowY = var1.lowY; // L: 59
		}

		if (var2.method8070() > var1.method8070()) { // L: 61
			var2.highY -= var2.method8070() - var1.method8070(); // L: 62
		}

		if (var2.highY < 0) { // L: 64
			var2.highY = 0;
		}

	} // L: 65

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-648909860"
	)
	int method8062() {
		return this.highX + this.lowX; // L: 68
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2143509057"
	)
	int method8070() {
		return this.lowY + this.highY; // L: 72
	}

	public String toString() {
		return null; // L: 33
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "-381854426"
	)
	static int method8069(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1589
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1606
				var7 = var2 ? Interpreter.scriptDotWidget : HealthBarUpdate.field1223; // L: 1607
				var4 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 1608
				if (var4 >= 1 && var4 <= 10) { // L: 1609
					class101 var8 = new class101(var4, var7.id, var7.childIndex, var7.itemId); // L: 1612
					Interpreter.field844.add(var8); // L: 1613
					return 1; // L: 1614
				} else {
					throw new RuntimeException(); // L: 1610
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1616
				class336.Interpreter_intStackSize -= 3; // L: 1617
				int var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 1618
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 1619
				int var5 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2]; // L: 1620
				if (var5 >= 1 && var5 <= 10) { // L: 1621
					class101 var6 = new class101(var5, var3, var4, ArchiveDiskActionHandler.getWidget(var3).itemId); // L: 1624
					Interpreter.field844.add(var6); // L: 1625
					return 1; // L: 1626
				} else {
					throw new RuntimeException(); // L: 1622
				}
			} else {
				return 2; // L: 1628
			}
		} else if (Interpreter.field845 >= 10) { // L: 1590
			throw new RuntimeException(); // L: 1591
		} else {
			if (var0 >= 2000) { // L: 1594
				var7 = ArchiveDiskActionHandler.getWidget(Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]); // L: 1595
			} else {
				var7 = var2 ? Interpreter.scriptDotWidget : HealthBarUpdate.field1223; // L: 1597
			}

			if (var7.onResize == null) { // L: 1598
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1599
				var9.widget = var7; // L: 1600
				var9.args = var7.onResize; // L: 1601
				var9.field1052 = Interpreter.field845 + 1; // L: 1602
				Client.scriptEvents.addFirst(var9); // L: 1603
				return 1; // L: 1604
			}
		}
	}
}
