import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mb")
public class class352 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1578837673
	)
	public static int field4222;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 577343627
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1610276333
	)
	int field4221;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 932264621
	)
	int field4218;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1636774755
	)
	int field4220;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 548824251
	)
	int field4219;

	public String toString() {
		boolean var1 = true; // L: 15
		int var2 = 10 - Integer.toString(this.field4221).length(); // L: 16
		int var3 = 10 - Integer.toString(this.field4220).length(); // L: 17
		int var4 = 10 - Integer.toString(this.field4218).length(); // L: 18
		String var5 = "          ".substring(10 - var2); // L: 19
		String var6 = "          ".substring(10 - var3); // L: 20
		String var7 = "          ".substring(10 - var4); // L: 21
		return "    Size: " + this.field4221 + var5 + "Created: " + this.field4218 + var7 + "Total used: " + this.field4220 + var6 + "Max-In-Use: " + this.field4219; // L: 22
	}
}
