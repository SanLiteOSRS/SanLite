import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
public enum class87 implements class342 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	field1084(0, -1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	field1078(1, 2),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	field1082(2, 3),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	field1080(3, 4),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	field1081(4, 5),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	field1077(5, 6);

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 908608631
	)
	final int field1079;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -383349067
	)
	final int field1088;

	class87(int var3, int var4) {
		this.field1079 = var3; // L: 21
		this.field1088 = var4; // L: 22
	} // L: 23

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1088; // L: 27
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "100"
	)
	static void method2257() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 30
			if (var0.stream1 != null) { // L: 31
				class453.pcmStreamMixer.removeSubStream(var0.stream1); // L: 32
				var0.stream1 = null; // L: 33
			}

			if (var0.stream2 != null) { // L: 35
				class453.pcmStreamMixer.removeSubStream(var0.stream2); // L: 36
				var0.stream2 = null; // L: 37
			}
		}

		ObjectSound.objectSounds.clear(); // L: 40
	} // L: 41
}
