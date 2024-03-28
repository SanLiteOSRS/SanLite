import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("uz")
public class class543 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 987007089
	)
	public final int field5299;
	@ObfuscatedName("ah")
	public Object field5300;

	public class543(int var1) {
		this.field5299 = var1; // L: 8
	} // L: 9

	public class543(int var1, Object var2) {
		this.field5299 = var1; // L: 12
		this.field5300 = var2; // L: 13
	} // L: 14

	public int hashCode() {
		return super.hashCode(); // L: 18
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class543)) { // L: 23
			return false;
		} else {
			class543 var2 = (class543)var1; // L: 24
			if (var2.field5300 == null && this.field5300 != null) { // L: 25
				return false;
			} else if (this.field5300 == null && var2.field5300 != null) { // L: 26
				return false;
			} else {
				return var2.field5299 == this.field5299 && var2.field5300.equals(this.field5300); // L: 27
			}
		}
	}
}
