import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
public class class175 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	public UrlRequest field1844;
	@ObfuscatedName("an")
	public float[] field1841;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	final class169 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgi;)V"
	)
	class175(class169 var1) {
		this.this$0 = var1;
		this.field1841 = new float[4]; // L: 348
	} // L: 350

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lhx;",
		garbageValue = "-1869741163"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0); // L: 79
		if (var1 != null) { // L: 80
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0); // L: 81
			var1 = new ObjectComposition(); // L: 82
			var1.id = var0; // L: 83
			if (var2 != null) { // L: 84
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 85
			if (var1.isSolid) { // L: 86
				var1.interactType = 0; // L: 87
				var1.boolean1 = false; // L: 88
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0); // L: 90
			return var1; // L: 91
		}
	}
}
