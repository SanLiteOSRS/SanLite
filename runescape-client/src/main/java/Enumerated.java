import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
@Implements("Enumerated")
public interface Enumerated {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "63",
		signature = "(B)I"
	)
	@Export("rsOrdinal")
	int rsOrdinal();
}
