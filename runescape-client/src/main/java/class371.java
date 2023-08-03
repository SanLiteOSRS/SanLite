import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
public class class371 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	static final class371 field4369;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	static final class371 field4368;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	static final class371 field4370;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	static final class371 field4371;

	static {
		field4369 = new class371(); // L: 4
		field4368 = new class371(); // L: 5
		field4370 = new class371(); // L: 6
		field4371 = new class371(); // L: 7
	}

	class371() {
	} // L: 9

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lhm;",
		garbageValue = "238508398"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0); // L: 27
			var1 = new EnumComposition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}
}
