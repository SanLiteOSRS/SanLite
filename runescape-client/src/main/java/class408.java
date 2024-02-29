import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
public class class408 extends RuntimeException {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-101"
	)
	public static void method7644() {
		if (MouseHandler.MouseHandler_instance != null) { // L: 37
			synchronized(MouseHandler.MouseHandler_instance) { // L: 38
				MouseHandler.MouseHandler_instance = null; // L: 39
			} // L: 40
		}

	} // L: 42
}
