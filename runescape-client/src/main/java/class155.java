import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public class class155 extends class140 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[[Lmy;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -6769972256510885513L
	)
	long field1732;
	@ObfuscatedName("al")
	String field1737;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1699447461
	)
	int field1733;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	final class143 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfo;)V"
	)
	class155(class143 var1) {
		this.this$0 = var1;
		this.field1732 = -1L; // L: 93
		this.field1737 = null; // L: 94
		this.field1733 = 0; // L: 95
	} // L: 97

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "-1979280996"
	)
	void vmethod3361(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 100
			--var1.offset; // L: 101
			this.field1732 = var1.readLong(); // L: 102
		}

		this.field1737 = var1.readStringCp1252NullTerminatedOrNull(); // L: 104
		this.field1733 = var1.readUnsignedShort(); // L: 105
	} // L: 106

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "29"
	)
	void vmethod3362(ClanSettings var1) {
		var1.method3199(this.field1732, this.field1737, this.field1733); // L: 109
	} // L: 110

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "11"
	)
	public static void method3293() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 117
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear(); // L: 118
	} // L: 119
}
