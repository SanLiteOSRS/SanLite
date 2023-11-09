import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("pw")
public class class411 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2094209585
	)
	int field4537;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -618386709
	)
	int field4538;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1346449489
	)
	int field4539;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -666028231
	)
	int field4540;

	public String toString() {
		boolean var1 = true; // L: 15
		int var2 = 10 - Integer.toString(this.field4537).length(); // L: 16
		int var3 = 10 - Integer.toString(this.field4539).length(); // L: 17
		int var4 = 10 - Integer.toString(this.field4538).length(); // L: 18
		String var5 = "          ".substring(10 - var2); // L: 19
		String var6 = "          ".substring(10 - var3); // L: 20
		String var7 = "          ".substring(10 - var4); // L: 21
		return "    Size: " + this.field4537 + var5 + "Created: " + this.field4538 + var7 + "Total used: " + this.field4539 + var6 + "Max-In-Use: " + this.field4540; // L: 22
	}
}
