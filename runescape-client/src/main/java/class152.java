import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
public class class152 extends class128 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1608830795
	)
	int field1696;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -5624748645665028423L
	)
	long field1694;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lei;)V"
	)
	class152(class131 var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-885940784"
	)
	void vmethod3087(Buffer var1) {
		this.field1696 = var1.readInt(); // L: 310
		this.field1694 = var1.readLong(); // L: 311
	} // L: 312

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Leh;B)V",
		garbageValue = "0"
	)
	void vmethod3084(ClanSettings var1) {
		var1.method2916(this.field1696, this.field1694); // L: 315
	} // L: 316

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lls;Lls;I)V",
		garbageValue = "1712865622"
	)
	public static void method3079(AbstractArchive var0, AbstractArchive var1) {
		KitDefinition.KitDefinition_archive = var0; // L: 27
		KitDefinition.KitDefinition_modelsArchive = var1; // L: 28
		KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3); // L: 29
	} // L: 30
}
