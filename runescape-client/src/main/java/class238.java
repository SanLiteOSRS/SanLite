import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
public class class238 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	static final class238 field2843;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	static final class238 field2842;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 488116779
	)
	@Export("value")
	final int value;

	static {
		field2843 = new class238(0); // L: 4
		field2842 = new class238(1); // L: 5
	}

	class238(int var1) {
		this.value = var1; // L: 9
	} // L: 10
}
