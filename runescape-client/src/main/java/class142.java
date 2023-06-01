import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class142 extends class143 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1258249959
	)
	int field1623;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class142(class146 var1) {
		this.this$0 = var1;
		this.field1623 = -1; // L: 114
	} // L: 116

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "1"
	)
	void vmethod3345(Buffer var1) {
		this.field1623 = var1.readUnsignedShort(); // L: 119
	} // L: 120

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V",
		garbageValue = "-621392079"
	)
	void vmethod3346(ClanSettings var1) {
		var1.method3197(this.field1623); // L: 123
	} // L: 124

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfx;",
		garbageValue = "0"
	)
	public static class137 method3102(int var0) {
		class137 var1 = (class137)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 378
		if (var1 != null) { // L: 379
			return var1;
		} else {
			var1 = class305.method5811(class105.SequenceDefinition_animationsArchive, class396.SequenceDefinition_skeletonsArchive, var0, false); // L: 380
			if (var1 != null) { // L: 381
				SequenceDefinition.SequenceDefinition_cachedModel.put(var1, (long)var0);
			}

			return var1; // L: 382
		}
	}
}
