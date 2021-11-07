import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("ar")
	protected static String field1645;
	@ObfuscatedName("s")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64);
	}

	public VarcInt() {
		this.persist = false;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-1726990903"
	)
	public void method3026(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method3027(var1, var2);
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lop;II)V",
		garbageValue = "-1102307189"
	)
	void method3027(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}

	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2018767281"
	)
	static final void method3033() {
		Client.field679 = Client.cycleCntr;
	}
}
