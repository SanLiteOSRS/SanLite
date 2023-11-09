import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public class class166 extends class144 {
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = 754666393
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("ud")
	@ObfuscatedGetter(
		intValue = -888258395
	)
	static int field1794;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 7573698202379011265L
	)
	long field1795;
	@ObfuscatedName("aj")
	String field1796;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lft;)V"
	)
	class166(class147 var1) {
		this.this$0 = var1;
		this.field1795 = -1L; // L: 194
		this.field1796 = null; // L: 195
	} // L: 197

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-25252119"
	)
	void vmethod3458(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1795 = var1.readLong(); // L: 202
		}

		this.field1796 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "-1582049647"
	)
	void vmethod3460(ClanSettings var1) {
		var1.method3296(this.field1795, this.field1796); // L: 208
	} // L: 209

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Lnr;Lnr;I)V",
		garbageValue = "-1931160616"
	)
	public static void method3445(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		SequenceDefinition.SequenceDefinition_archive = var0; // L: 51
		GrandExchangeOfferOwnWorldComparator.SequenceDefinition_animationsArchive = var1; // L: 52
		SequenceDefinition.SequenceDefinition_skeletonsArchive = var2; // L: 53
	} // L: 54
}
