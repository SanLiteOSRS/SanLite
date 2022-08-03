import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
	@ObfuscatedName("q")
	@Export("nextComparator")
	Comparator nextComparator;

	protected AbstractUserComparator() {
	} // L: 8

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "-1687142666"
	)
	@Export("addComparator")
	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) { // L: 11
			this.nextComparator = var1; // L: 12
		} else if (this.nextComparator instanceof AbstractUserComparator) { // L: 14
			((AbstractUserComparator)this.nextComparator).addComparator(var1); // L: 15
		}

	} // L: 17

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lnd;I)I",
		garbageValue = "1954545684"
	)
	@Export("compareUser")
	protected final int compareUser(Nameable var1, Nameable var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2); // L: 20 21
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 25
	}
}
