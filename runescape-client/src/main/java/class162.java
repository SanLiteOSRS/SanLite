import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class class162 extends class143 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1637706179
	)
	int field1760;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class162(class146 var1) {
		this.this$0 = var1;
		this.field1760 = -1; // L: 144
	} // L: 146

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "1"
	)
	void vmethod3345(Buffer var1) {
		this.field1760 = var1.readUnsignedShort(); // L: 149
	} // L: 150

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V",
		garbageValue = "-621392079"
	)
	void vmethod3346(ClanSettings var1) {
		var1.method3191(this.field1760); // L: 153
	} // L: 154

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lni;Lni;B)V",
		garbageValue = "59"
	)
	public static void method3309(AbstractArchive var0, AbstractArchive var1) {
		KitDefinition.KitDefinition_archive = var0; // L: 29
		class291.KitDefinition_modelsArchive = var1; // L: 30
		KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3); // L: 31
	} // L: 32
}
