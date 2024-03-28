import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Ltw;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("az")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrw;Lrw;I)I",
		garbageValue = "-1640560389"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) { // L: 14
			if (var2.world == 0) { // L: 15
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1; // L: 18
		}

		return this.compareUser(var1, var2); // L: 20
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 24
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;B)V",
		garbageValue = "101"
	)
	public static void method2892(AbstractArchive var0) {
		class17.EnumDefinition_archive = var0; // L: 25
	} // L: 26

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "73"
	)
	public static void method2897() {
		class321.field3496.clear(); // L: 119
	} // L: 120

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-996502494"
	)
	static int method2898(int var0) {
		return var0 * 3 + 600; // L: 1496
	}
}
