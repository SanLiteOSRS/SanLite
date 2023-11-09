import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ud")
public class class523 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1988875325
	)
	public final int field5178;
	@ObfuscatedName("ae")
	public Object field5177;

	public class523(int var1) {
		this.field5178 = var1; // L: 8
	} // L: 9

	public class523(int var1, Object var2) {
		this.field5178 = var1; // L: 12
		this.field5177 = var2; // L: 13
	} // L: 14

	public int hashCode() {
		return super.hashCode(); // L: 18
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class523)) { // L: 23
			return false;
		} else {
			class523 var2 = (class523)var1; // L: 24
			if (var2.field5177 == null && this.field5177 != null) { // L: 25
				return false;
			} else if (this.field5177 == null && var2.field5177 != null) { // L: 26
				return false;
			} else {
				return var2.field5178 == this.field5178 && var2.field5177.equals(this.field5177); // L: 27
			}
		}
	}
}
