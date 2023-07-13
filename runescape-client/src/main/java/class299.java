import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@mn
@ObfuscatedName("ls")
public final class class299 {
	@ObfuscatedName("av")
	static final HashMap field3356;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;

	static {
		field3356 = new HashMap(); // L: 11
		TimeZone var0;
		synchronized(field3356) { // L: 16
			TimeZone var2 = (TimeZone)field3356.get("Europe/London"); // L: 17
			if (var2 == null) { // L: 18
				var2 = TimeZone.getTimeZone("Europe/London"); // L: 19
				field3356.put("Europe/London", var2); // L: 20
			}

			var0 = var2; // L: 22
		}

		java.util.Calendar.getInstance(var0); // L: 25
	} // L: 26

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "-69"
	)
	static int method5682(int var0, Script var1, boolean var2) {
		if (var0 == 6809) { // L: 5043
			int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5044
			ObjectComposition var4 = class175.getObjectDefinition(var3); // L: 5045
			Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 5046
			return 1; // L: 5047
		} else {
			return 2; // L: 5049
		}
	}
}
