import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("bd")
	public static String field3501;
	@ObfuscatedName("cu")
	public static String field3446;
	@ObfuscatedName("jo")
	public static String field3595;
	@ObfuscatedName("jq")
	public static String field3634;
	@ObfuscatedName("ja")
	public static String field3597;

	static {
		field3501 = "Please visit the support page for assistance.";
		field3446 = "Please visit the support page for assistance.";
		field3595 = "";
		field3634 = "Page has opened in a new window.";
		field3597 = "(Please check your popup blocker.)";
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1995982953"
	)
	static void method5220() {
		Messages.Messages_channels.clear();
		Messages.Messages_hashTable.clear();
		Messages.Messages_queue.clear();
		Messages.Messages_count = 0;
	}
}
