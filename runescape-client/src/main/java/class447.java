import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qd")
public class class447 {
	@ObfuscatedName("f")
	public final Object field4832;
	@ObfuscatedName("w")
	public final Object field4833;

	public class447(Object var1, Object var2) {
		this.field4832 = var1; // L: 8
		this.field4833 = var2; // L: 9
	} // L: 10

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class447) { // L: 20
			class447 var2 = (class447)var1; // L: 23
			if (this.field4832 == null) { // L: 24
				if (var2.field4832 != null) { // L: 25
					return false;
				}
			} else if (!this.field4832.equals(var2.field4832)) { // L: 27
				return false;
			}

			if (this.field4833 == null) { // L: 28
				if (var2.field4833 != null) { // L: 29
					return false;
				}
			} else if (!this.field4833.equals(var2.field4833)) { // L: 31
				return false;
			}

			return true; // L: 32
		} else {
			return false; // L: 21
		}
	}

	public String toString() {
		return this.field4832 + ", " + this.field4833; // L: 14
	}

	public int hashCode() {
		int var1 = 0; // L: 37
		if (this.field4832 != null) { // L: 38
			var1 += this.field4832.hashCode();
		}

		if (this.field4833 != null) {
			var1 += 31 * this.field4833.hashCode(); // L: 39
		}

		return var1; // L: 40
	}
}
