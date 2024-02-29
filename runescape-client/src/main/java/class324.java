import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
class class324 implements ThreadFactory {
	@ObfuscatedName("af")
	static int[] field3538;
	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	static AbstractSocket field3539;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -741637037
	)
	static int field3537;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	final MidiPcmStream this$0;

	@ObfuscatedSignature(
		descriptor = "(Lmo;)V"
	)
	class324(MidiPcmStream var1) {
		this.this$0 = var1; // L: 126
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load"); // L: 129
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;Lta;B)Lta;",
		garbageValue = "-96"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) { // L: 17
			var3 = class318.method6083(var2); // L: 18
			var1 = new IterableNodeHashTable(var3); // L: 19
		}

		for (var3 = 0; var3 < var2; ++var3) { // L: 21
			boolean var4 = var0.readUnsignedByte() == 1; // L: 22
			int var5 = var0.readMedium(); // L: 23
			Object var6;
			if (var4) { // L: 25
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt()); // L: 26
			}

			var1.put((Node)var6, (long)var5); // L: 27
		}

		return var1; // L: 29
	}
}
