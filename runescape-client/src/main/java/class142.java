import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public class class142 extends class144 {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = -4320740808923061641L
	)
	long field1645;
	@ObfuscatedName("aj")
	String field1644;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lft;)V"
	)
	class142(class147 var1) {
		this.this$0 = var1;
		this.field1645 = -1L; // L: 74
		this.field1644 = null; // L: 75
	} // L: 77

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-25252119"
	)
	void vmethod3458(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 80
			--var1.offset; // L: 81
			this.field1645 = var1.readLong(); // L: 82
		}

		this.field1644 = var1.readStringCp1252NullTerminatedOrNull(); // L: 84
	} // L: 85

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "-1582049647"
	)
	void vmethod3460(ClanSettings var1) {
		var1.method3293(this.field1645, this.field1644, 0); // L: 88
	} // L: 89

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "72"
	)
	public static void method3199(boolean var0) {
		if (var0 != HealthBarUpdate.ItemComposition_inMembersWorld) { // L: 576
			ItemComposition.ItemComposition_cached.clear(); // L: 578
			ItemComposition.ItemComposition_cachedModels.clear(); // L: 579
			ItemComposition.ItemComposition_cachedSprites.clear(); // L: 580
			HealthBarUpdate.ItemComposition_inMembersWorld = var0; // L: 582
		}

	} // L: 584
}
