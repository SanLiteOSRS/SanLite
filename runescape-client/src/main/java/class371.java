import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
public class class371 {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	@Export("soundCache")
	public static SoundCache soundCache;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 886460067
	)
	int field4376;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -460186579
	)
	int field4373;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1187049531
	)
	int field4374;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 396141333
	)
	int field4375;

	public String toString() {
		boolean var1 = true; // L: 15
		int var2 = 10 - Integer.toString(this.field4376).length(); // L: 16
		int var3 = 10 - Integer.toString(this.field4374).length(); // L: 17
		int var4 = 10 - Integer.toString(this.field4373).length(); // L: 18
		String var5 = "          ".substring(10 - var2); // L: 19
		String var6 = "          ".substring(10 - var3); // L: 20
		String var7 = "          ".substring(10 - var4); // L: 21
		return "    Size: " + this.field4376 + var5 + "Created: " + this.field4373 + var7 + "Total used: " + this.field4374 + var6 + "Max-In-Use: " + this.field4375; // L: 22
	}
}
