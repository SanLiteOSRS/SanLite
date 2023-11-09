import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("er")
class class132 implements Callable {
	@ObfuscatedName("i")
	@Export("SpriteBuffer_spriteHeights")
	public static int[] SpriteBuffer_spriteHeights;
	@ObfuscatedName("o")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	final class133 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lrd;"
	)
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lei;Lrd;I)V"
	)
	class132(class133 var1, Buffer var2, int var3) {
		this.this$0 = var1; // L: 72
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3114(this.val$p, this.val$version); // L: 75
		return null; // L: 76
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "-1917361698"
	)
	static int method3090(int var0, Script var1, boolean var2) {
		Widget var3 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 1603
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1604
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.x; // L: 1605
			return 1; // L: 1606
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1608
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.y; // L: 1609
			return 1; // L: 1610
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1612
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.width; // L: 1613
			return 1; // L: 1614
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1616
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.height; // L: 1617
			return 1; // L: 1618
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1620
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1621
			return 1; // L: 1622
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1624
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.parentId; // L: 1625
			return 1; // L: 1626
		} else {
			return 2; // L: 1628
		}
	}
}
