import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("th")
public class class509 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -712880825
	)
	public final int field5081;
	@ObfuscatedName("an")
	public Object field5080;

	public class509(int var1) {
		this.field5081 = var1; // L: 8
	} // L: 9

	public class509(int var1, Object var2) {
		this.field5081 = var1; // L: 12
		this.field5080 = var2; // L: 13
	} // L: 14

	public int hashCode() {
		return super.hashCode(); // L: 18
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class509)) { // L: 23
			return false;
		} else {
			class509 var2 = (class509)var1; // L: 24
			if (var2.field5080 == null && this.field5080 != null) { // L: 25
				return false;
			} else if (this.field5080 == null && var2.field5080 != null) { // L: 26
				return false;
			} else {
				return this.field5081 == var2.field5081 && var2.field5080.equals(this.field5080); // L: 27
			}
		}
	}
}
