import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("td")
public class class508 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -976721955
	)
	static final int field5053;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1922893771
	)
	static final int field5054;

	static {
		field5053 = (int)(Math.pow(2.0D, 4.0D) - 1.0D); // L: 10
		field5054 = (int)(Math.pow(2.0D, 8.0D) - 1.0D); // L: 11
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "74"
	)
	public static int method8984(String var0) {
		return var0.length() + 2; // L: 136
	}
}
