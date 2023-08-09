import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public enum class90 implements class372 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1100(0, -1),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1099(1, 2),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1107(2, 3),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1101(3, 4),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1102(4, 5),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1103(5, 6);

	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1818991059
	)
	static int field1109;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -783531589
	)
	static int field1108;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 544385807
	)
	final int field1104;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1773308819
	)
	final int field1105;

	class90(int var3, int var4) {
		this.field1104 = var3; // L: 21
		this.field1105 = var4; // L: 22
	} // L: 23

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1105; // L: 27
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lhb;",
		garbageValue = "-1281408867"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0); // L: 73
		if (var1 != null) { // L: 74
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0); // L: 75
			var1 = new ObjectComposition(); // L: 76
			var1.id = var0; // L: 77
			if (var2 != null) { // L: 78
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 79
			if (var1.isSolid) { // L: 80
				var1.interactType = 0; // L: 81
				var1.boolean1 = false; // L: 82
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0); // L: 84
			return var1; // L: 85
		}
	}
}
