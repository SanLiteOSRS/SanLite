import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
@Implements("UserComparator1")
public class UserComparator1 implements Comparator {
	@ObfuscatedName("o")
	@Export("reversed")
	final boolean reversed;

	public UserComparator1(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lnd;I)I",
		garbageValue = "314043355"
	)
	@Export("compare_bridged")
	int compare_bridged(Nameable var1, Nameable var2) {
		return this.reversed ? var1.compareTo_user(var2) : var2.compareTo_user(var1); // L: 14
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Nameable)var1, (Nameable)var2); // L: 18
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1852683966"
	)
	public static void method8034() {
		VarpDefinition.VarpDefinition_cached.clear(); // L: 46
	} // L: 47
}
