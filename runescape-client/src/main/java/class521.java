import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uj")
public class class521 {
	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "[Luq;"
	)
	static SpritePixels[] field5130;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 451569483
	)
	public final int field5128;
	@ObfuscatedName("aj")
	public Object field5129;

	public class521(int var1) {
		this.field5128 = var1; // L: 8
	} // L: 9

	public class521(int var1, Object var2) {
		this.field5128 = var1; // L: 12
		this.field5129 = var2; // L: 13
	} // L: 14

	public boolean equals(Object var1) {
		if (!(var1 instanceof class521)) { // L: 23
			return false;
		} else {
			class521 var2 = (class521)var1; // L: 24
			if (var2.field5129 == null && this.field5129 != null) { // L: 25
				return false;
			} else if (this.field5129 == null && var2.field5129 != null) { // L: 26
				return false;
			} else {
				return var2.field5128 == this.field5128 && var2.field5129.equals(this.field5129); // L: 27
			}
		}
	}

	public int hashCode() {
		return super.hashCode(); // L: 18
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnn;",
		garbageValue = "-195783838"
	)
	static class345[] method9388() {
		return new class345[]{class345.field3855, class345.field3856}; // L: 35
	}
}
