import java.io.File;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
public class class329 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "-582278456"
	)
	static void method6346(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(ClanChannelMember.JagexCache_locationFile, "rw", 10000L); // L: 237
			Buffer var3 = new Buffer(500); // L: 238
			var3.writeByte(3); // L: 239
			var3.writeByte(var1 != null ? 1 : 0); // L: 240
			var3.writeCESU8(var0.getPath()); // L: 241
			if (var1 != null) {
				var3.writeCESU8(""); // L: 242
			}

			var2.write(var3.array, 0, var3.offset); // L: 243
			var2.close(); // L: 244
		} catch (IOException var4) { // L: 246
			var4.printStackTrace(); // L: 247
		}

	} // L: 249

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "7768554"
	)
	static int method6345(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 79
		if (var1 == null) { // L: 80
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count; // L: 81 82
		}
	}
}
