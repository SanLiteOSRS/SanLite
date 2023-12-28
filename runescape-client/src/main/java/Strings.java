import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("fa")
	public static String field4057;
	@ObfuscatedName("ka")
	public static String field4189;
	@ObfuscatedName("kb")
	public static String field4118;
	@ObfuscatedName("ky")
	public static String field4191;

	static {
		field4057 = "Please visit the support page for assistance."; // L: 137
		field4189 = ""; // L: 284
		field4118 = "Page has opened in the browser."; // L: 285
		field4191 = ""; // L: 286
	} // L: 330

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-80"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 11521
	}
}
