import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("wz")
	static List field1972;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("VarcInt_cached")
	static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static IndexedSprite field1966;
	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("ao")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	VarcInt() {
		this.persist = false; // L: 12
	} // L: 14

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "-2131192855"
	)
	void method3606(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 28
			if (var2 == 0) { // L: 29
				return; // L: 32
			}

			this.method3604(var1, var2); // L: 30
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;IB)V",
		garbageValue = "-12"
	)
	void method3604(Buffer var1, int var2) {
		if (var2 == 2) { // L: 35
			this.persist = true; // L: 36
		}

	} // L: 39

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lch;",
		garbageValue = "-580226644"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? class176.World_worlds[++World.World_listCount - 1] : null; // L: 243 244
	}
}
