import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class class146 extends class128 {
	@ObfuscatedName("x")
	@Export("operatingSystemName")
	static String operatingSystemName;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1115938959
	)
	int field1658;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1203803603
	)
	int field1654;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lei;)V"
	)
	class146(class131 var1) {
		this.this$0 = var1; // L: 271
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-885940784"
	)
	void vmethod3087(Buffer var1) {
		this.field1658 = var1.readInt(); // L: 274
		this.field1654 = var1.readInt(); // L: 275
	} // L: 276

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Leh;B)V",
		garbageValue = "0"
	)
	void vmethod3084(ClanSettings var1) {
		var1.method2914(this.field1658, this.field1654); // L: 279
	} // L: 280

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lah;B)V",
		garbageValue = "1"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 263
		if (var0.sound != null) { // L: 264
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 265
		}

	} // L: 266
}
