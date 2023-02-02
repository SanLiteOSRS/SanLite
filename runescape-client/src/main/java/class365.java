import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nx")
public class class365 implements Iterator {
	@ObfuscatedName("hq")
	@ObfuscatedGetter(
		intValue = -1083525607
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	class366 field4364;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1835580561
	)
	int field4365;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -541714235
	)
	int field4366;

	@ObfuscatedSignature(
		descriptor = "(Lnm;)V"
	)
	class365(class366 var1) {
		this.field4365 = 0; // L: 177
		this.field4366 = this.field4364.field4372; // L: 178
		this.field4364 = var1; // L: 181
	} // L: 182

	public boolean hasNext() {
		return this.field4365 < this.field4364.field4369; // L: 186
	}

	public Object next() {
		if (this.field4364.field4372 != this.field4366) { // L: 192
			throw new ConcurrentModificationException();
		} else if (this.field4365 < this.field4364.field4369) { // L: 193
			Object var1 = this.field4364.field4373[this.field4365].field4362; // L: 194
			++this.field4365; // L: 195
			return var1; // L: 196
		} else {
			throw new NoSuchElementException(); // L: 198
		}
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 203
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "-337661484"
	)
	static int method7000(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1560
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1577
				var7 = var2 ? class190.scriptDotWidget : class360.field4354; // L: 1578
				var4 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 1579
				if (var4 >= 1 && var4 <= 10) { // L: 1580
					class98 var8 = new class98(var4, var7.id, var7.childIndex, var7.itemId); // L: 1583
					Interpreter.field867.add(var8); // L: 1584
					return 1; // L: 1585
				} else {
					throw new RuntimeException(); // L: 1581
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1587
				class87.Interpreter_intStackSize -= 3; // L: 1588
				int var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 1589
				var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 1590
				int var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]; // L: 1591
				if (var5 >= 1 && var5 <= 10) { // L: 1592
					class98 var6 = new class98(var5, var3, var4, class175.getWidget(var3).itemId); // L: 1595
					Interpreter.field867.add(var6); // L: 1596
					return 1; // L: 1597
				} else {
					throw new RuntimeException(); // L: 1593
				}
			} else {
				return 2; // L: 1599
			}
		} else if (Interpreter.field874 >= 10) { // L: 1561
			throw new RuntimeException(); // L: 1562
		} else {
			if (var0 >= 2000) { // L: 1565
				var7 = class175.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 1566
			} else {
				var7 = var2 ? class190.scriptDotWidget : class360.field4354; // L: 1568
			}

			if (var7.onResize == null) { // L: 1569
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1570
				var9.widget = var7; // L: 1571
				var9.args = var7.onResize; // L: 1572
				var9.field1084 = Interpreter.field874 + 1; // L: 1573
				Client.scriptEvents.addFirst(var9); // L: 1574
				return 1; // L: 1575
			}
		}
	}
}
