import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ti")
public class class497 {
	@ObfuscatedName("at")
	public final Object field4996;
	@ObfuscatedName("ah")
	public final Object field4997;

	public class497(Object var1, Object var2) {
		this.field4996 = var1; // L: 8
		this.field4997 = var2; // L: 9
	} // L: 10

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class497) { // L: 20
			class497 var2 = (class497)var1; // L: 23
			if (this.field4996 == null) { // L: 24
				if (var2.field4996 != null) { // L: 25
					return false;
				}
			} else if (!this.field4996.equals(var2.field4996)) { // L: 27
				return false;
			}

			if (this.field4997 == null) { // L: 28
				if (var2.field4997 != null) { // L: 29
					return false;
				}
			} else if (!this.field4997.equals(var2.field4997)) { // L: 31
				return false;
			}

			return true; // L: 32
		} else {
			return false; // L: 21
		}
	}

	public String toString() {
		return this.field4996 + ", " + this.field4997; // L: 14
	}

	public int hashCode() {
		int var1 = 0; // L: 37
		if (this.field4996 != null) { // L: 38
			var1 += this.field4996.hashCode();
		}

		if (this.field4997 != null) {
			var1 += 31 * this.field4997.hashCode(); // L: 39
		}

		return var1; // L: 40
	}
}
