import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ur")
public class class539 {
	@ObfuscatedName("au")
	public static short[] field5245;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 326572061
	)
	public final int field5246;
	@ObfuscatedName("ap")
	public Object field5244;

	public class539(int var1) {
		this.field5246 = var1; // L: 8
	} // L: 9

	public class539(int var1, Object var2) {
		this.field5246 = var1; // L: 12
		this.field5244 = var2; // L: 13
	} // L: 14

	public int hashCode() {
		return super.hashCode(); // L: 18
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class539)) { // L: 23
			return false;
		} else {
			class539 var2 = (class539)var1; // L: 24
			if (var2.field5244 == null && this.field5244 != null) { // L: 25
				return false;
			} else if (this.field5244 == null && var2.field5244 != null) { // L: 26
				return false;
			} else {
				return var2.field5246 == this.field5246 && var2.field5244.equals(this.field5244); // L: 27
			}
		}
	}
}
