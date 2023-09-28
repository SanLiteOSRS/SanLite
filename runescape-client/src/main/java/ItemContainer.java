import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("al")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("ak")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Ltr;I)Ljava/lang/Object;",
		garbageValue = "1234966456"
	)
	static Object method2290(class517 var0) {
		if (var0 == null) { // L: 5343
			throw new IllegalStateException("popValueOfType() failure - null baseVarType"); // L: 5344
		} else {
			switch(var0.field5068) { // L: 5346
			case 0:
				return Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 5352
			case 2:
				return Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5350
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type"); // L: 5348
			}
		}
	}
}
