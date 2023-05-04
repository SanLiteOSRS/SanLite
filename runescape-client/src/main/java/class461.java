import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rg")
public class class461 {
	@ObfuscatedName("af")
	public final Object field4886;
	@ObfuscatedName("an")
	public final Object field4887;

	public class461(Object var1, Object var2) {
		this.field4886 = var1; // L: 8
		this.field4887 = var2; // L: 9
	} // L: 10

	public String toString() {
		return this.field4886 + ", " + this.field4887; // L: 14
	}

	public int hashCode() {
		int var1 = 0; // L: 37
		if (this.field4886 != null) { // L: 38
			var1 += this.field4886.hashCode();
		}

		if (this.field4887 != null) {
			var1 += 31 * this.field4887.hashCode(); // L: 39
		}

		return var1; // L: 40
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class461) { // L: 20
			class461 var2 = (class461)var1; // L: 23
			if (this.field4886 == null) { // L: 24
				if (var2.field4886 != null) { // L: 25
					return false;
				}
			} else if (!this.field4886.equals(var2.field4886)) { // L: 27
				return false;
			}

			if (this.field4887 == null) { // L: 28
				if (var2.field4887 != null) { // L: 29
					return false;
				}
			} else if (!this.field4887.equals(var2.field4887)) { // L: 31
				return false;
			}

			return true; // L: 32
		} else {
			return false; // L: 21
		}
	}
}
