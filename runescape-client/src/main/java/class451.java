import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qn")
public class class451 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -220176931
	)
	public final int field4771;
	@ObfuscatedName("q")
	public Object field4770;

	public class451(int var1) {
		this.field4771 = var1; // L: 8
	} // L: 9

	public class451(int var1, Object var2) {
		this.field4771 = var1; // L: 12
		this.field4770 = var2; // L: 13
	} // L: 14

	public boolean equals(Object var1) {
		if (!(var1 instanceof class451)) { // L: 23
			return false;
		} else {
			class451 var2 = (class451)var1; // L: 24
			if (var2.field4770 == null && this.field4770 != null) { // L: 25
				return false;
			} else if (this.field4770 == null && var2.field4770 != null) { // L: 26
				return false;
			} else {
				return var2.field4771 == this.field4771 && var2.field4770.equals(this.field4770); // L: 27
			}
		}
	}

	public int hashCode() {
		return super.hashCode(); // L: 18
	}
}
