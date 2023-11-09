import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("StructDefinition_archive")
	public static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("StructDefinition_cached")
	public static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64); // L: 13
	}

	StructComposition() {
	} // L: 16

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-35"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 29

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "-50"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 33
			if (var2 == 0) { // L: 34
				return; // L: 37
			}

			this.decodeNext(var1, var2); // L: 35
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "-458084373"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = FaceNormal.readStringIntParameters(var1, this.params); // L: 40
		}

	} // L: 42

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1059246046"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return Language.method6584(this.params, var1, var2); // L: 45
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-348365462"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return FriendLoginUpdate.method7304(this.params, var1, var2); // L: 49
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "473934492"
	)
	public static float method3677(int var0) {
		var0 &= 16383; // L: 24
		return (float)(6.283185307179586D * (double)((float)var0 / 16384.0F)); // L: 25
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-268428904"
	)
	public static void method3676() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 120
			if (ArchiveDiskActionHandler.field4122 != 0) { // L: 121
				ArchiveDiskActionHandler.field4122 = 1; // L: 122

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 124
				} catch (InterruptedException var3) { // L: 126
				}
			}

		}
	} // L: 129

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-969804644"
	)
	static int method3661(int var0) {
		return var0 * 3 + 600; // L: 1639
	}
}
