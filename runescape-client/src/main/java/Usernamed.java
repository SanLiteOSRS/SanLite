import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pm")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(B)Luy;",
		garbageValue = "-8"
	)
	@Export("username")
	Username username();
}
