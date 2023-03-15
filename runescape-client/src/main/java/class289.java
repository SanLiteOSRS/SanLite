import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
public final class class289 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -5825280197012614897L
	)
	static long field3305;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = 3919516759646943281L
	)
	static long field3306;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-30547"
	)
	public static void method5486(int var0) {
		if (var0 != -1) { // L: 275
			if (class123.Widget_loadedInterfaces[var0]) { // L: 276
				MouseRecorder.Widget_archive.clearFilesGroup(var0); // L: 277
				if (class155.Widget_interfaceComponents[var0] != null) { // L: 278
					for (int var1 = 0; var1 < class155.Widget_interfaceComponents[var0].length; ++var1) { // L: 279
						if (class155.Widget_interfaceComponents[var0][var1] != null) { // L: 280
							class155.Widget_interfaceComponents[var0][var1] = null; // L: 281
						}
					}

					class155.Widget_interfaceComponents[var0] = null; // L: 284
					class123.Widget_loadedInterfaces[var0] = false; // L: 285
				}
			}
		}
	} // L: 286

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "71128846"
	)
	static void method5485() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 61

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 62
			var1.clearIsFromFriend(); // L: 64
		}

	} // L: 67
}
