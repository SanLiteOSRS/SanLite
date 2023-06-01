import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("InvDefinition_archive")
	public static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = 966333683
	)
	static int field1908;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1467213001
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	InvDefinition() {
		this.size = 0; // L: 12
	} // L: 14

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "16"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 28
			if (var2 == 0) { // L: 29
				return; // L: 32
			}

			this.decodeNext(var1, var2); // L: 30
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ltc;IB)V",
		garbageValue = "40"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) { // L: 35
			this.size = var1.readUnsignedShort();
		}

	} // L: 37

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CII)Ljava/lang/String;",
		garbageValue = "-1333620354"
	)
	static String method3535(char var0, int var1) {
		char[] var2 = new char[var1]; // L: 221

		for (int var3 = 0; var3 < var1; ++var3) { // L: 222
			var2[var3] = var0;
		}

		return new String(var2); // L: 223
	}
}
