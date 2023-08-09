import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("StructDefinition_archive")
	static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("StructDefinition_cached")
	static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64); // L: 13
	}

	StructComposition() {
	} // L: 16

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "448946158"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 33

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "1"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 37
			if (var2 == 0) { // L: 38
				return; // L: 41
			}

			this.decodeNext(var1, var2); // L: 39
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "595587202"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = class141.readStringIntParameters(var1, this.params); // L: 44
		}

	} // L: 46

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-154725242"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return FileSystem.method3540(this.params, var1, var2); // L: 49
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-86"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 54
		String var3;
		if (var4 == null) { // L: 56
			var3 = var2; // L: 57
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 60
			if (var5 == null) { // L: 61
				var3 = var2; // L: 62
			} else {
				var3 = (String)var5.obj; // L: 65
			}
		}

		return var3; // L: 67
	}
}
