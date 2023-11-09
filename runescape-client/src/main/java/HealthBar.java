import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("um")
	static Iterator field1255;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lfi;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque(); // L: 12
		this.definition = var1; // L: 15
	} // L: 16

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-548199087"
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)Lca;",
		garbageValue = "3"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method6165(); // L: 55
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)I",
		garbageValue = "410728992"
	)
	static int method2410(Widget var0) {
		if (var0.type != 11) { // L: 1248
			Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 1249
			return 1; // L: 1250
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 1252
			Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var0.method5642(var1); // L: 1253
			return 1; // L: 1254
		}
	}
}
