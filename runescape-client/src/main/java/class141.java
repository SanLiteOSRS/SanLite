import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public class class141 extends class143 {
	@ObfuscatedName("ue")
	@ObfuscatedGetter(
		intValue = -845764415
	)
	static int field1619;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -1412807259645931177L
	)
	long field1617;
	@ObfuscatedName("an")
	String field1618;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class141(class146 var1) {
		this.this$0 = var1;
		this.field1617 = -1L; // L: 74
		this.field1618 = null; // L: 75
	} // L: 77

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "1"
	)
	void vmethod3345(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 80
			--var1.offset; // L: 81
			this.field1617 = var1.readLong(); // L: 82
		}

		this.field1618 = var1.readStringCp1252NullTerminatedOrNull(); // L: 84
	} // L: 85

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V",
		garbageValue = "-621392079"
	)
	void vmethod3346(ClanSettings var1) {
		var1.method3201(this.field1617, this.field1618, 0); // L: 88
	} // L: 89

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-101"
	)
	public static void method3089() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 42
				var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 43
			} // L: 44

			if (var0 == null) {
				return; // L: 45
			}

			var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false); // L: 46
		}
	}
}
