import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qi")
public class class426 {
	@ObfuscatedName("cc")
	static String field4608;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 275907375
	)
	int field4607;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1847575995
	)
	int field4610;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1080458511
	)
	int field4606;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1172611517
	)
	int field4609;

	public String toString() {
		boolean var1 = true; // L: 15
		int var2 = 10 - Integer.toString(this.field4607).length(); // L: 16
		int var3 = 10 - Integer.toString(this.field4606).length(); // L: 17
		int var4 = 10 - Integer.toString(this.field4610).length(); // L: 18
		String var5 = "          ".substring(10 - var2); // L: 19
		String var6 = "          ".substring(10 - var3); // L: 20
		String var7 = "          ".substring(10 - var4); // L: 21
		return "    Size: " + this.field4607 + var5 + "Created: " + this.field4610 + var7 + "Total used: " + this.field4606 + var6 + "Max-In-Use: " + this.field4609; // L: 22
	}
}
