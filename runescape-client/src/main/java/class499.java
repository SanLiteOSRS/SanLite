import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("tl")
final class class499 implements class498 {
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("archive6")
	static Archive archive6;

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ltm;I)V",
		garbageValue = "465506048"
	)
	public void vmethod8928(Object var1, Buffer var2) {
		this.method8896((Integer)var1, var2); // L: 21
	} // L: 22

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)Ljava/lang/Object;",
		garbageValue = "-295239457"
	)
	public Object vmethod8926(Buffer var1) {
		return var1.readInt(); // L: 17
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Ltm;S)V",
		garbageValue = "128"
	)
	void method8896(Integer var1, Buffer var2) {
		var2.writeInt(var1); // L: 12
	} // L: 13

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "1972049883"
	)
	static int method8897(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1593
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1610
				var7 = var2 ? GameObject.scriptDotWidget : SceneTilePaint.field2808; // L: 1611
				var4 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 1612
				if (var4 >= 1 && var4 <= 10) { // L: 1613
					class102 var8 = new class102(var4, var7.id, var7.childIndex, var7.itemId); // L: 1616
					Interpreter.field889.add(var8); // L: 1617
					return 1; // L: 1618
				} else {
					throw new RuntimeException(); // L: 1614
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1620
				SoundCache.Interpreter_intStackSize -= 3; // L: 1621
				int var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 1622
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 1623
				int var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 1624
				if (var5 >= 1 && var5 <= 10) { // L: 1625
					class102 var6 = new class102(var5, var3, var4, class92.getWidget(var3).itemId); // L: 1628
					Interpreter.field889.add(var6); // L: 1629
					return 1; // L: 1630
				} else {
					throw new RuntimeException(); // L: 1626
				}
			} else {
				return 2; // L: 1632
			}
		} else if (Interpreter.field890 >= 10) { // L: 1594
			throw new RuntimeException(); // L: 1595
		} else {
			if (var0 >= 2000) { // L: 1598
				var7 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 1599
			} else {
				var7 = var2 ? GameObject.scriptDotWidget : SceneTilePaint.field2808; // L: 1601
			}

			if (var7.onResize == null) { // L: 1602
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1603
				var9.widget = var7; // L: 1604
				var9.args = var7.onResize; // L: 1605
				var9.field1093 = Interpreter.field890 + 1; // L: 1606
				Client.scriptEvents.addFirst(var9); // L: 1607
				return 1; // L: 1608
			}
		}
	}
}
