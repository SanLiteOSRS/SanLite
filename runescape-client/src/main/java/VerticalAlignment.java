import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements class352 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	field2034(1, 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(2, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	field2036(0, 2);

	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1414458079
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2110724161
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3; // L: 18
		this.id = var4; // L: 19
	} // L: 20

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1409646049"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 24
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1334130459"
	)
	public static void method3716() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 44
				var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 45
			} // L: 46

			if (var0 == null) { // L: 47
				return;
			}

			var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false); // L: 48
		}
	}
}
