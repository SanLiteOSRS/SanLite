import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("uk")
public class class542 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1606110677
	)
	public final int field5267;
	@ObfuscatedName("aw")
	public Object field5268;

	public class542(int var1) {
		this.field5267 = var1; // L: 8
	} // L: 9

	public class542(int var1, Object var2) {
		this.field5267 = var1; // L: 12
		this.field5268 = var2; // L: 13
	} // L: 14

	public int hashCode() {
		return super.hashCode(); // L: 18
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class542)) { // L: 23
			return false;
		} else {
			class542 var2 = (class542)var1; // L: 24
			if (var2.field5268 == null && this.field5268 != null) { // L: 25
				return false;
			} else if (this.field5268 == null && var2.field5268 != null) { // L: 26
				return false;
			} else {
				return var2.field5267 == this.field5267 && var2.field5268.equals(this.field5268); // L: 27
			}
		}
	}
}
