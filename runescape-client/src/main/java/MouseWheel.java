import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
@Implements("MouseWheel")
public interface MouseWheel {
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "-7695",
		signature = "(S)I"
	)
	@Export("useRotation")
	int useRotation();
}
