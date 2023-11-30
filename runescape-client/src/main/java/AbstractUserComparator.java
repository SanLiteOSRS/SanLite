import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rn")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
	@ObfuscatedName("ah")
	@Export("nextComparator")
	Comparator nextComparator;

	protected AbstractUserComparator() {
	} // L: 8

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "1936813741"
	)
	@Export("addComparator")
	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) { // L: 11
			this.nextComparator = var1; // L: 12
		} else if (this.nextComparator instanceof AbstractUserComparator) { // L: 14
			((AbstractUserComparator)this.nextComparator).addComparator(var1); // L: 15
		}

	} // L: 17

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrf;Lrf;I)I",
		garbageValue = "-94519432"
	)
	@Export("compareUser")
	protected final int compareUser(Nameable var1, Nameable var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2); // L: 20 21
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 25
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-50"
	)
	static final void method8173(String var0) {
		WorldMapArea.method4622("Please remove " + var0 + " from your ignore list first"); // L: 132
	} // L: 133
}
