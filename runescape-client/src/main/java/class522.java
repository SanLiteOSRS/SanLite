import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("uh")
public class class522 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1675474073
	)
	public final int field5135;
	@ObfuscatedName("ay")
	public Object field5134;

	public class522(int var1) {
		this.field5135 = var1; // L: 8
	} // L: 9

	public class522(int var1, Object var2) {
		this.field5135 = var1; // L: 12
		this.field5134 = var2; // L: 13
	} // L: 14

	public int hashCode() {
		return super.hashCode(); // L: 18
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class522)) { // L: 23
			return false;
		} else {
			class522 var2 = (class522)var1; // L: 24
			if (var2.field5134 == null && this.field5134 != null) { // L: 25
				return false;
			} else if (this.field5134 == null && var2.field5134 != null) { // L: 26
				return false;
			} else {
				return var2.field5135 == this.field5135 && var2.field5134.equals(this.field5134); // L: 27
			}
		}
	}
}
