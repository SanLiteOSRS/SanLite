import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rg")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
	@ObfuscatedName("ah")
	@Export("nextComparator")
	Comparator nextComparator;

	protected AbstractUserComparator() {
	} // L: 8

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;B)V",
		garbageValue = "-72"
	)
	@Export("addComparator")
	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) { // L: 11
			this.nextComparator = var1; // L: 12
		} else if (this.nextComparator instanceof AbstractUserComparator) { // L: 14
			((AbstractUserComparator)this.nextComparator).addComparator(var1); // L: 15
		}

	} // L: 17

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;B)I",
		garbageValue = "24"
	)
	@Export("compareUser")
	protected final int compareUser(Nameable var1, Nameable var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2); // L: 20 21
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 25
	}
}
