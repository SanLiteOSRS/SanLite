import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
public class class389 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	static final class389 field4463;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	static final class389 field4461;
	@ObfuscatedName("ac")
	final String field4462;

	static {
		field4463 = new class389("Basic"); // L: 4
		field4461 = new class389("Bearer"); // L: 5
	}

	class389(String var1) {
		this.field4462 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1567314137"
	)
	String method7351() {
		return this.field4462; // L: 13
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1824771862"
	)
	static int method7352() {
		return ++Messages.Messages_count - 1; // L: 19
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "69"
	)
	static void method7353() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 30
			if (var0.stream1 != null) { // L: 31
				class323.pcmStreamMixer.removeSubStream(var0.stream1); // L: 32
				var0.stream1 = null; // L: 33
			}

			if (var0.stream2 != null) { // L: 35
				class323.pcmStreamMixer.removeSubStream(var0.stream2); // L: 36
				var0.stream2 = null; // L: 37
			}
		}

		ObjectSound.objectSounds.clear(); // L: 40
	} // L: 41
}
