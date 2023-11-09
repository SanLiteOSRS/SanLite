import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("py")
public class class410 {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1989324825
	)
	int field4525;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -294545009
	)
	int field4524;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2082892441
	)
	int field4526;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 211369447
	)
	int field4523;

	public String toString() {
		boolean var1 = true; // L: 15
		int var2 = 10 - Integer.toString(this.field4525).length(); // L: 16
		int var3 = 10 - Integer.toString(this.field4526).length(); // L: 17
		int var4 = 10 - Integer.toString(this.field4524).length(); // L: 18
		String var5 = "          ".substring(10 - var2); // L: 19
		String var6 = "          ".substring(10 - var3); // L: 20
		String var7 = "          ".substring(10 - var4); // L: 21
		return "    Size: " + this.field4525 + var5 + "Created: " + this.field4524 + var7 + "Total used: " + this.field4526 + var6 + "Max-In-Use: " + this.field4523; // L: 22
	}
}
