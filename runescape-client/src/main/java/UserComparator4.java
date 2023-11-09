import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("r")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("s")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnt;Lnt;I)I",
		garbageValue = "-668032566"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 14
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2); // L: 18
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1201413197"
	)
	public static void method2535() {
		KitDefinition.KitDefinition_cached.clear(); // L: 136
	} // L: 137

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Lln;",
		garbageValue = "1667153978"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null; // L: 1884
		if (JagexCache.JagexCache_dat2File != null) { // L: 1885
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class115.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var5, class11.masterDisk, var0, var1, var2, var3, var4); // L: 1886
	}
}
