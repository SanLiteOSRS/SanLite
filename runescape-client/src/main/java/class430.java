import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qv")
public class class430 {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("ge")
	static String field4669;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 640416659
	)
	int field4664;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1733050771
	)
	int field4668;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1846309625
	)
	int field4666;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1994337597
	)
	int field4667;

	public String toString() {
		boolean var1 = true; // L: 15
		int var2 = 10 - Integer.toString(this.field4664).length(); // L: 16
		int var3 = 10 - Integer.toString(this.field4666).length(); // L: 17
		int var4 = 10 - Integer.toString(this.field4668).length(); // L: 18
		String var5 = "          ".substring(10 - var2); // L: 19
		String var6 = "          ".substring(10 - var3); // L: 20
		String var7 = "          ".substring(10 - var4); // L: 21
		return "    Size: " + this.field4664 + var5 + "Created: " + this.field4668 + var7 + "Total used: " + this.field4666 + var6 + "Max-In-Use: " + this.field4667; // L: 22
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)Z",
		garbageValue = "134581591"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 12809
	}
}
