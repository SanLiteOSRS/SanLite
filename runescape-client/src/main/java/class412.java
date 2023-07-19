import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pd")
public class class412 {
	@ObfuscatedName("ez")
	@Export("mouseCam")
	static boolean mouseCam;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1801793015"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 159
	}
}
