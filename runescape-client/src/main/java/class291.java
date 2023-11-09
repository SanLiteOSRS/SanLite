import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
public class class291 {
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = 1518960023
	)
	@Export("cameraYaw")
	static int cameraYaw;

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-248616806"
	)
	public static void method5661() {
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 171
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 172
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 173
	} // L: 174
}
