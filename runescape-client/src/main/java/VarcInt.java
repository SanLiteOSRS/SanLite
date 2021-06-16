import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("VarcInt_cached")
	static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("h")
	public static short[] field1581;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		longValue = 7886092133437125099L
	)
	static long field1586;
	@ObfuscatedName("v")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64);
	}

	VarcInt() {
		this.persist = false;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnt;S)V",
		garbageValue = "-1375"
	)
	void method2745(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method2748(var1, var2);
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)V",
		garbageValue = "1509691720"
	)
	void method2748(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}

	}
}
