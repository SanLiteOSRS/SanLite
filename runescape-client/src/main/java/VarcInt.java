import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("aq")
	@Export("ItemComposition_inMembersWorld")
	public static boolean ItemComposition_inMembersWorld;
	@ObfuscatedName("ac")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public VarcInt() {
		this.persist = false; // L: 12
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "1857783206"
	)
	public void method3588(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 16
			if (var2 == 0) { // L: 17
				return; // L: 20
			}

			this.method3592(var1, var2); // L: 18
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsy;II)V",
		garbageValue = "-1286505504"
	)
	void method3592(Buffer var1, int var2) {
		if (var2 == 2) { // L: 23
			this.persist = true; // L: 24
		}

	} // L: 27

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lis;",
		garbageValue = "-353492841"
	)
	public static class211[] method3594() {
		return new class211[]{class211.field2336, class211.field2332, class211.field2333, class211.field2335}; // L: 14
	}
}
