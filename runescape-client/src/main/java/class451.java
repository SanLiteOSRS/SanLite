import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qp")
public class class451 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -946255737
	)
	public final int field4769;
	@ObfuscatedName("h")
	public Object field4768;

	public class451(int var1) {
		this.field4769 = var1; // L: 8
	} // L: 9

	public class451(int var1, Object var2) {
		this.field4769 = var1; // L: 12
		this.field4768 = var2; // L: 13
	} // L: 14

	public boolean equals(Object var1) {
		if (!(var1 instanceof class451)) { // L: 23
			return false;
		} else {
			class451 var2 = (class451)var1; // L: 24
			if (var2.field4768 == null && this.field4768 != null) { // L: 25
				return false;
			} else if (this.field4768 == null && var2.field4768 != null) { // L: 26
				return false;
			} else {
				return this.field4769 == var2.field4769 && var2.field4768.equals(this.field4768); // L: 27
			}
		}
	}

	public int hashCode() {
		return super.hashCode(); // L: 18
	}
}
