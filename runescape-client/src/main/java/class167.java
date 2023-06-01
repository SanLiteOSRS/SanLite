import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class167 extends class143 {
	@ObfuscatedName("uu")
	@ObfuscatedGetter(
		intValue = -1103206757
	)
	static int field1798;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1549497375
	)
	static int field1793;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("ItemComposition_fontPlain11")
	public static Font ItemComposition_fontPlain11;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1490516225
	)
	int field1795;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = 7943670806656934331L
	)
	long field1794;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class167(class146 var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "1"
	)
	void vmethod3345(Buffer var1) {
		this.field1795 = var1.readInt(); // L: 310
		this.field1794 = var1.readLong(); // L: 311
	} // L: 312

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V",
		garbageValue = "-621392079"
	)
	void vmethod3346(ClanSettings var1) {
		var1.method3206(this.field1795, this.field1794); // L: 315
	} // L: 316

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1642555198"
	)
	public static boolean method3350(int var0) {
		return (var0 >> 22 & 1) != 0; // L: 21
	}
}
