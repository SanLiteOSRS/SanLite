import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("pg")
public class class440 {
	@ObfuscatedName("h")
	public final Object field4811;
	@ObfuscatedName("e")
	public final Object field4809;

	public class440(Object var1, Object var2) {
		this.field4811 = var1; // L: 8
		this.field4809 = var2; // L: 9
	} // L: 10

	public int hashCode() {
		int var1 = 0; // L: 37
		if (this.field4811 != null) { // L: 38
			var1 += this.field4811.hashCode();
		}

		if (this.field4809 != null) {
			var1 += 31 * this.field4809.hashCode(); // L: 39
		}

		return var1; // L: 40
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class440) { // L: 20
			class440 var2 = (class440)var1; // L: 23
			if (this.field4811 == null) { // L: 24
				if (var2.field4811 != null) { // L: 25
					return false;
				}
			} else if (!this.field4811.equals(var2.field4811)) { // L: 27
				return false;
			}

			if (this.field4809 == null) { // L: 28
				if (var2.field4809 != null) { // L: 29
					return false;
				}
			} else if (!this.field4809.equals(var2.field4809)) { // L: 31
				return false;
			}

			return true; // L: 32
		} else {
			return false; // L: 21
		}
	}

	public String toString() {
		return this.field4811 + ", " + this.field4809; // L: 14
	}
}
