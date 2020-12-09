import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		signature = "(I)Lki;",
		garbageValue = "82536799"
	)
	@Export("username")
	Username username();
}
