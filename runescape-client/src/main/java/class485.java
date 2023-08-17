import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ss")
public class class485 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("au")
	public final Object field4966;
	@ObfuscatedName("ae")
	public final Object field4965;

	public class485(Object var1, Object var2) {
		this.field4966 = var1; // L: 8
		this.field4965 = var2; // L: 9
	} // L: 10

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class485) { // L: 20
			class485 var2 = (class485)var1; // L: 23
			if (this.field4966 == null) { // L: 24
				if (var2.field4966 != null) { // L: 25
					return false;
				}
			} else if (!this.field4966.equals(var2.field4966)) { // L: 27
				return false;
			}

			if (this.field4965 == null) { // L: 28
				if (var2.field4965 != null) { // L: 29
					return false;
				}
			} else if (!this.field4965.equals(var2.field4965)) { // L: 31
				return false;
			}

			return true; // L: 32
		} else {
			return false; // L: 21
		}
	}

	public int hashCode() {
		int var1 = 0; // L: 37
		if (this.field4966 != null) { // L: 38
			var1 += this.field4966.hashCode();
		}

		if (this.field4965 != null) {
			var1 += 31 * this.field4965.hashCode(); // L: 39
		}

		return var1; // L: 40
	}

	public String toString() {
		return this.field4966 + ", " + this.field4965; // L: 14
	}
}
