import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public class class105 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Ljn;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;

	static {
		reflectionChecks = new IterableNodeDeque();
	}
}
