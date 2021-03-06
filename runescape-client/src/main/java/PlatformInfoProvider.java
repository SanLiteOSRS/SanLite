import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "583399336",
		signature = "(I)Lmn;"
	)
	@Export("get")
	PlatformInfo get();
}
