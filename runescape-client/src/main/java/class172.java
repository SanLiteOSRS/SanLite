import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public class class172 {
	@ObfuscatedName("ai")
	static byte[][][] field1855;

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Ljava/lang/String;Ljava/lang/String;I)Luk;",
		garbageValue = "2141415166"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 50
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 51
			int var4 = var0.getFileId(var3, var2); // L: 52
			IndexedSprite var5;
			if (!ApproximateRouteStrategy.method1228(var0, var3, var4)) { // L: 55
				var5 = null; // L: 56
			} else {
				var5 = class493.method8806(); // L: 59
			}

			return var5; // L: 61
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1301151779"
	)
	public static boolean method3457(int var0) {
		if (class305.field3405.isEmpty()) { // L: 134
			return false; // L: 138
		} else {
			class317 var1 = (class317)class305.field3405.get(0); // L: 135
			return var1 != null && var0 == var1.field3511; // L: 136
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Ltb;I)Ljava/lang/Object;",
		garbageValue = "263841727"
	)
	static Object method3458(class502 var0) {
		if (var0 == null) { // L: 5332
			throw new IllegalStateException("popValueOfType() failure - null baseVarType"); // L: 5333
		} else {
			switch(var0.field5031) { // L: 5335
			case 1:
				return Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 5339
			case 2:
				return Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 5341
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type"); // L: 5337
			}
		}
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	static int method3459(int var0) {
		return var0 * 3 + 600; // L: 1509
	}
}
