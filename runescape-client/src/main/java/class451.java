import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rv")
public class class451 {
	@ObfuscatedName("aj")
	public final Object field4798;
	@ObfuscatedName("al")
	public final Object field4799;

	public class451(Object var1, Object var2) {
		this.field4798 = var1; // L: 8
		this.field4799 = var2; // L: 9
	} // L: 10

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class451) { // L: 20
			class451 var2 = (class451)var1; // L: 23
			if (this.field4798 == null) { // L: 24
				if (var2.field4798 != null) { // L: 25
					return false;
				}
			} else if (!this.field4798.equals(var2.field4798)) { // L: 27
				return false;
			}

			if (this.field4799 == null) { // L: 28
				if (var2.field4799 != null) { // L: 29
					return false;
				}
			} else if (!this.field4799.equals(var2.field4799)) { // L: 31
				return false;
			}

			return true; // L: 32
		} else {
			return false; // L: 21
		}
	}

	public String toString() {
		return this.field4798 + ", " + this.field4799; // L: 14
	}

	public int hashCode() {
		int var1 = 0; // L: 37
		if (this.field4798 != null) { // L: 38
			var1 += this.field4798.hashCode();
		}

		if (this.field4799 != null) {
			var1 += 31 * this.field4799.hashCode(); // L: 39
		}

		return var1; // L: 40
	}
}
