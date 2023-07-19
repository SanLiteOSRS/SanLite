import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
public class class338 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1021389417
	)
	static int field3791;

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "213286707"
	)
	static boolean method6631() {
		return ScriptFrame.clientPreferences.method2582() >= Client.field503; // L: 12840
	}
}
