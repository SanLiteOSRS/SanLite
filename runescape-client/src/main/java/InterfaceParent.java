import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 675621627
	)
	@Export("group")
	int group;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2067999467
	)
	@Export("type")
	int type;
	@ObfuscatedName("c")
	boolean field1037;

	InterfaceParent() {
		this.field1037 = false; // L: 8
	} // L: 10

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgm;",
		garbageValue = "-104"
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
