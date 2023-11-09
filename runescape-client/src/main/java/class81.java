import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
public class class81 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lln;B)V",
		garbageValue = "2"
	)
	public static void method2307(AbstractArchive var0) {
		EnumComposition.EnumDefinition_archive = var0; // L: 25
	} // L: 26

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "2080105393"
	)
	static char method2306(char var0) {
		if (var0 == 198) { // L: 95
			return 'E';
		} else if (var0 == 230) { // L: 96
			return 'e';
		} else if (var0 == 223) {
			return 's'; // L: 97
		} else if (var0 == 338) { // L: 98
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000'); // L: 99 100
		}
	}
}
