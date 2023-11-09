import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rm")
public class class482 {
	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -307864915
	)
	public final int field5003;
	@ObfuscatedName("w")
	public Object field5004;

	public class482(int var1) {
		this.field5003 = var1; // L: 8
	} // L: 9

	public class482(int var1, Object var2) {
		this.field5003 = var1; // L: 12
		this.field5004 = var2; // L: 13
	} // L: 14

	public int hashCode() {
		return super.hashCode(); // L: 18
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class482)) { // L: 23
			return false;
		} else {
			class482 var2 = (class482)var1; // L: 24
			if (var2.field5004 == null && this.field5004 != null) { // L: 25
				return false;
			} else if (this.field5004 == null && var2.field5004 != null) { // L: 26
				return false;
			} else {
				return this.field5003 == var2.field5003 && var2.field5004.equals(this.field5004); // L: 27
			}
		}
	}
}
