import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oc")
public class class381 {
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = -1908109969
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2068189971
	)
	int field4411;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1730419875
	)
	int field4409;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1966537009
	)
	int field4408;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -9429663
	)
	int field4410;

	public String toString() {
		boolean var1 = true; // L: 15
		int var2 = 10 - Integer.toString(this.field4411).length(); // L: 16
		int var3 = 10 - Integer.toString(this.field4408).length(); // L: 17
		int var4 = 10 - Integer.toString(this.field4409).length(); // L: 18
		String var5 = "          ".substring(10 - var2); // L: 19
		String var6 = "          ".substring(10 - var3); // L: 20
		String var7 = "          ".substring(10 - var4); // L: 21
		return "    Size: " + this.field4411 + var5 + "Created: " + this.field4409 + var7 + "Total used: " + this.field4408 + var6 + "Max-In-Use: " + this.field4410; // L: 22
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "24"
	)
	static final boolean method7304() {
		return Client.isMenuOpen; // L: 8704
	}
}
