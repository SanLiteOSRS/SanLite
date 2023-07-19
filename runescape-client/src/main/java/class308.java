import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
class class308 implements ThreadFactory {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	static IndexedSprite field3453;
	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	final MidiPcmStream this$0;

	@ObfuscatedSignature(
		descriptor = "(Llm;)V"
	)
	class308(MidiPcmStream var1) {
		this.this$0 = var1; // L: 111
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load"); // L: 114
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "-27822"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 21
		if (var2 == null) { // L: 22
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0; // L: 23 24
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "10"
	)
	public static byte[] method6013(byte[] var0) {
		int var1 = var0.length; // L: 35
		byte[] var2 = new byte[var1]; // L: 36
		System.arraycopy(var0, 0, var2, 0, var1); // L: 37
		return var2; // L: 38
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-21"
	)
	static void method6016() {
		synchronized(ArchiveDiskActionHandler.field4240) { // L: 62
			if (ArchiveDiskActionHandler.field4239 == 0) { // L: 63
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 64
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 65
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 66
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 67
			}

			ArchiveDiskActionHandler.field4239 = 600; // L: 69
			ArchiveDiskActionHandler.field4236 = false; // L: 70
		}
	} // L: 72
}
