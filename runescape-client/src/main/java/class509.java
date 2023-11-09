import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ts")
public class class509 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -447516077
	)
	public final int field5084;
	@ObfuscatedName("an")
	public Object field5083;

	public class509(int var1) {
		this.field5084 = var1; // L: 8
	} // L: 9

	public class509(int var1, Object var2) {
		this.field5084 = var1; // L: 12
		this.field5083 = var2; // L: 13
	} // L: 14

	public int hashCode() {
		return super.hashCode(); // L: 18
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class509)) { // L: 23
			return false;
		} else {
			class509 var2 = (class509)var1; // L: 24
			if (var2.field5083 == null && this.field5083 != null) { // L: 25
				return false;
			} else if (this.field5083 == null && var2.field5083 != null) { // L: 26
				return false;
			} else {
				return var2.field5084 == this.field5084 && var2.field5083.equals(this.field5083); // L: 27
			}
		}
	}
}
