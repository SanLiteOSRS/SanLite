import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
public class class248 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	static final class248 field2915;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	static final class248 field2919;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -108752475
	)
	@Export("value")
	final int value;

	static {
		field2915 = new class248(0); // L: 4
		field2919 = new class248(1); // L: 5
	}

	class248(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Llg;Llg;Llg;Ljr;I)Z",
		garbageValue = "-949591035"
	)
	public static boolean method5161(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, MidiPcmStream var3) {
		class283.musicPatchesArchive = var0; // L: 26
		class283.musicSamplesArchive = var1; // L: 27
		class283.soundEffectsArchive = var2; // L: 28
		class283.midiPcmStream = var3; // L: 29
		return true; // L: 30
	}

	@ObfuscatedName("f")
	static final void method5160(long var0) {
		try {
			Thread.sleep(var0); // L: 20
		} catch (InterruptedException var3) { // L: 22
		}

	} // L: 23

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "36"
	)
	public static void method5162(int var0) {
		if (class283.musicPlayerStatus != 0) { // L: 44
			Messages.musicTrackVolume = var0;
		} else {
			class283.midiPcmStream.setPcmStreamVolume(var0); // L: 45
		}

	} // L: 46

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1893048295"
	)
	static final boolean method5163() {
		return Client.isMenuOpen; // L: 8684
	}
}
