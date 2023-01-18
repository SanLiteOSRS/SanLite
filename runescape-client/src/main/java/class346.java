import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
public class class346 {
	static {
		new HashMap();
	} // L: 9

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lly;Lly;ZLnv;I)V",
		garbageValue = "-2018074733"
	)
	public static void method6684(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		ItemComposition.ItemComposition_archive = var0; // L: 88
		class306.ItemComposition_modelArchive = var1; // L: 89
		Clock.ItemComposition_inMembersWorld = var2; // L: 90
		ItemComposition.ItemComposition_fileCount = ItemComposition.ItemComposition_archive.getGroupFileCount(10); // L: 91
		class262.ItemComposition_fontPlain11 = var3; // L: 92
	} // L: 93

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "-1098096483"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return class190.method3772(var0, 10, true); // L: 35
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)Ljava/lang/Object;",
		garbageValue = "6"
	)
	static Object method6683(class456 var0) {
		if (var0 == null) { // L: 5114
			throw new IllegalStateException("popValueOfType() failure - null baseVarType"); // L: 5115
		} else {
			switch(var0.field4872) { // L: 5117
			case 0:
				return Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 5121
			case 1:
				return Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 5119
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type"); // L: 5123
			}
		}
	}
}
