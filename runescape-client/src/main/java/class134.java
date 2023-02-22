import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
public enum class134 implements class349 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	field1621(0, 0),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	field1607(1, 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	field1608(2, 2),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	field1609(3, 3),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	field1610(4, 4),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	field1617(5, 5),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	field1612(6, 6),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	field1611(7, 7),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	field1614(8, 8);

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	static StudioGame field1606;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -2047759423
	)
	static int field1613;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1695238653
	)
	final int field1615;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1557384537
	)
	final int field1616;

	class134(int var3, int var4) {
		this.field1615 = var3; // L: 97
		this.field1616 = var4; // L: 98
	} // L: 99

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1616; // L: 102
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-116"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 23
		if (var4 == null) { // L: 24
			var4 = new ChatChannel(); // L: 25
			Messages.Messages_channels.put(var0, var4); // L: 26
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3); // L: 28
		Messages.Messages_hashTable.put(var5, (long)var5.count); // L: 29
		Messages.Messages_queue.add(var5); // L: 30
		Client.chatCycle = Client.cycleCntr; // L: 31
	} // L: 32

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "328947468"
	)
	public static void method3124() {
		KitDefinition.KitDefinition_cached.clear(); // L: 132
	} // L: 133

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZB)I",
		garbageValue = "-33"
	)
	static int method3126(int var0, Script var1, boolean var2) {
		if (var0 == 6754) { // L: 4881
			int var5 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4882
			NPCComposition var6 = class137.getNpcDefinition(var5); // L: 4883
			Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : ""; // L: 4884
			return 1; // L: 4885
		} else {
			NPCComposition var3;
			if (var0 == 6764) { // L: 4887
				class302.Interpreter_intStackSize -= 2; // L: 4888
				var3 = class137.getNpcDefinition(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]); // L: 4889
				int var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 4890
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.method3751(var4); // L: 4891
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.method3734(var4); // L: 4892
				return 1; // L: 4893
			} else if (var0 == 6765) { // L: 4895
				var3 = class137.getNpcDefinition(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 4896
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0; // L: 4897
				return 1; // L: 4898
			} else {
				return 2; // L: 4900
			}
		}
	}
}
