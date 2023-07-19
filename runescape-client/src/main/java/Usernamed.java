import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(S)Lur;",
		garbageValue = "-11631"
	)
	@Export("username")
	Username username();
}
