import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("te")
public class class497 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -52705447
	)
	public final int field5058;
	@ObfuscatedName("an")
	public Object field5057;

	public class497(int var1) {
		this.field5058 = var1; // L: 8
	} // L: 9

	public class497(int var1, Object var2) {
		this.field5058 = var1; // L: 12
		this.field5057 = var2; // L: 13
	} // L: 14

	public int hashCode() {
		return super.hashCode(); // L: 18
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class497)) { // L: 23
			return false;
		} else {
			class497 var2 = (class497)var1; // L: 24
			if (var2.field5057 == null && this.field5057 != null) { // L: 25
				return false;
			} else if (this.field5057 == null && var2.field5057 != null) { // L: 26
				return false;
			} else {
				return var2.field5058 == this.field5058 && var2.field5057.equals(this.field5057); // L: 27
			}
		}
	}
}
