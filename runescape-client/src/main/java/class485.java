import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sh")
public class class485 {
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	static IndexedSprite field4965;
	@ObfuscatedName("ai")
	public final Object field4964;
	@ObfuscatedName("aj")
	public final Object field4962;

	public class485(Object var1, Object var2) {
		this.field4964 = var1; // L: 8
		this.field4962 = var2; // L: 9
	} // L: 10

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class485) { // L: 20
			class485 var2 = (class485)var1; // L: 23
			if (this.field4964 == null) { // L: 24
				if (var2.field4964 != null) { // L: 25
					return false;
				}
			} else if (!this.field4964.equals(var2.field4964)) { // L: 27
				return false;
			}

			if (this.field4962 == null) { // L: 28
				if (var2.field4962 != null) { // L: 29
					return false;
				}
			} else if (!this.field4962.equals(var2.field4962)) { // L: 31
				return false;
			}

			return true; // L: 32
		} else {
			return false; // L: 21
		}
	}

	public String toString() {
		return this.field4964 + ", " + this.field4962; // L: 14
	}

	public int hashCode() {
		int var1 = 0; // L: 37
		if (this.field4964 != null) { // L: 38
			var1 += this.field4964.hashCode();
		}

		if (this.field4962 != null) {
			var1 += 31 * this.field4962.hashCode(); // L: 39
		}

		return var1; // L: 40
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[Luh;",
		garbageValue = "-1474530707"
	)
	@Export("FillMode_values")
	public static class524[] FillMode_values() {
		return new class524[]{class524.field5145, class524.field5144, class524.SOLID}; // L: 15
	}
}
