import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class148 extends class143 {
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = -607814879
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1269845755
	)
	int field1669;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -4986227
	)
	int field1666;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 57408083
	)
	int field1668;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1191160211
	)
	int field1667;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfr;)V"
	)
	class148(class146 var1) {
		this.this$0 = var1; // L: 289
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "1"
	)
	void vmethod3412(Buffer var1) {
		this.field1669 = var1.readInt(); // L: 292
		this.field1667 = var1.readInt(); // L: 293
		this.field1666 = var1.readUnsignedByte(); // L: 294
		this.field1668 = var1.readUnsignedByte(); // L: 295
	} // L: 296

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfx;B)V",
		garbageValue = "-72"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3237(this.field1669, this.field1667, this.field1666, this.field1668); // L: 299
	} // L: 300

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILrg;Lny;B)V",
		garbageValue = "98"
	)
	static void method3170(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 21
		var3.type = 1; // L: 22
		var3.key = (long)var0; // L: 23
		var3.archiveDisk = var1; // L: 24
		var3.archive = var2; // L: 25
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 26
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 27
		} // L: 28

		class292.method5721(); // L: 29
	} // L: 30
}
