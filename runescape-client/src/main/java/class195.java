import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
public class class195 extends DualNode {
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	static Archive field2101;

	static {
		new EvictingDualNodeHashTable(64);
	} // L: 10

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1489168609"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63; // L: 9
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)V",
		garbageValue = "-1754928363"
	)
	public static void method3873(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0; // L: 21
	} // L: 22

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lht;",
		garbageValue = "-680528429"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0); // L: 25
			var1 = new StructComposition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 28
			StructComposition.StructDefinition_cached.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1880318814"
	)
	static final boolean method3874(int var0, int var1) {
		ObjectComposition var2 = class144.getObjectDefinition(var0); // L: 1071
		if (var1 == 11) { // L: 1072
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4; // L: 1073
		}

		return var2.method3982(var1); // L: 1074
	}
}
