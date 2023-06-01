import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lri;",
		garbageValue = "-1811530837"
	)
	@Export("get")
	PlatformInfo get();
}
