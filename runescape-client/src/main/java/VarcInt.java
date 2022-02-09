import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("VarcInt_archive")
	static AbstractArchive VarcInt_archive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("VarcInt_cached")
	static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("q")
	static int[] field1789;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("s")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64);
	}

	VarcInt() {
		this.persist = false;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-972393082"
	)
	void method3202(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method3195(var1, var2);
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IB)V",
		garbageValue = "121"
	)
	void method3195(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}

	}
}
