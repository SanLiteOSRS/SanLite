import java.io.File;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public class class165 extends class143 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = 5068354842123857345L
	)
	long field1815;
	@ObfuscatedName("ae")
	String field1813;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class165(class146 var1) {
		this.this$0 = var1;
		this.field1815 = -1L; // L: 194
		this.field1813 = null; // L: 195
	} // L: 197

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "209179459"
	)
	void vmethod3337(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1815 = var1.readLong(); // L: 202
		}

		this.field1813 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "73"
	)
	void vmethod3339(ClanSettings var1) {
		var1.method3187(this.field1815, this.field1813); // L: 208
	} // L: 209

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "1715361402"
	)
	static void method3330(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(JagexCache.field1869, "rw", 10000L); // L: 217
			Buffer var3 = new Buffer(500); // L: 218
			var3.writeByte(3); // L: 219
			var3.writeByte(var1 != null ? 1 : 0); // L: 220
			var3.writeCESU8(var0.getPath()); // L: 221
			if (var1 != null) {
				var3.writeCESU8(""); // L: 222
			}

			var2.write(var3.array, 0, var3.offset); // L: 223
			var2.close(); // L: 224
		} catch (IOException var4) { // L: 226
			var4.printStackTrace(); // L: 227
		}

	} // L: 229

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "97"
	)
	static final void method3325() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8419 8420 8426
			if (var0.hitpoints == -1) { // L: 8421
				var0.delay = 0; // L: 8422
				PacketWriter.method2805(var0); // L: 8423
			} else {
				var0.remove(); // L: 8425
			}
		}

	} // L: 8428
}
