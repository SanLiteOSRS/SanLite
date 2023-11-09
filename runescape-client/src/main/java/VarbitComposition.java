import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("VarbitDefinition_archive")
	static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("ai")
	static final int[] field2123;
	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("us")
	@ObfuscatedGetter(
		intValue = -2079670272
	)
	static int field2127;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 144903653
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 225410143
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1882806955
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
		field2123 = new int[32]; // L: 15
		int var0 = 2; // L: 18

		for (int var1 = 0; var1 < 32; ++var1) { // L: 19
			field2123[var1] = var0 - 1; // L: 20
			var0 += var0; // L: 21
		}

	} // L: 23

	VarbitComposition() {
	} // L: 25

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "1889164320"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 43
			if (var2 == 0) { // L: 44
				return; // L: 47
			}

			this.decodeNext(var1, var2); // L: 45
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltm;II)V",
		garbageValue = "1344279898"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 50
			this.baseVar = var1.readUnsignedShort(); // L: 51
			this.startBit = var1.readUnsignedByte(); // L: 52
			this.endBit = var1.readUnsignedByte(); // L: 53
		}

	} // L: 56

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "14"
	)
	public static int method3800(CharSequence var0) {
		int var1 = var0.length(); // L: 140
		int var2 = 0; // L: 141

		for (int var3 = 0; var3 < var1; ++var3) { // L: 142
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2; // L: 143
	}
}
