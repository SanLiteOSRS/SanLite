import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
public final class class346 {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Lpm;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("o")
	final Object field4185;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1666879287
	)
	int field4184;

	class346(Object var1, int var2) {
		this.field4185 = var1; // L: 170
		this.field4184 = var2; // L: 171
	} // L: 172

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "903011029"
	)
	public static void method6353() {
		if (KeyHandler.KeyHandler_instance != null) { // L: 130
			synchronized(KeyHandler.KeyHandler_instance) { // L: 131
				KeyHandler.KeyHandler_instance = null; // L: 132
			} // L: 133
		}

	} // L: 135

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lae;I)V",
		garbageValue = "1359963642"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 266
		if (var0.sound != null) { // L: 267
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 268
		}

	} // L: 269
}
