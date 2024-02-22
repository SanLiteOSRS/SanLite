import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
public class class255 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	static final class255 field2655;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	static final class255 field2653;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1886188331
	)
	@Export("value")
	final int value;

	static {
		field2655 = new class255(0); // L: 4
		field2653 = new class255(1); // L: 5
	}

	class255(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1731550026"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menuOptionsCount = 0; // L: 9231
		Client.isMenuOpen = false; // L: 9232
		Client.menuActions[0] = "Cancel"; // L: 9234
		Client.menuTargets[0] = ""; // L: 9235
		Client.menuOpcodes[0] = 1006; // L: 9236
		Client.menuShiftClick[0] = false; // L: 9237
		Client.menuOptionsCount = 1; // L: 9238
	} // L: 9239
}
