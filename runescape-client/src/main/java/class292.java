import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
public class class292 {
	@ObfuscatedName("ce")
	static String field3084;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "[Luu;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)Ljava/lang/String;",
		garbageValue = "-1"
	)
	public static String method5720(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart(); // L: 63
			if (var2 > 32767) { // L: 64
				var2 = 32767;
			}

			byte[] var3 = new byte[var2]; // L: 65
			var0.offset += class335.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 66
			String var4 = LoginType.decodeStringCp1252(var3, 0, var2); // L: 67
			var1 = var4; // L: 68
		} catch (Exception var6) { // L: 70
			var1 = "Cabbage"; // L: 71
		}

		return var1; // L: 74
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-924567891"
	)
	static void method5721() {
		synchronized(ArchiveDiskActionHandler.field4248) { // L: 44
			if (ArchiveDiskActionHandler.field4246 == 0) { // L: 45
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 46
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 47
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 48
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 49
			}

			ArchiveDiskActionHandler.field4246 = 600; // L: 51
			ArchiveDiskActionHandler.field4247 = false; // L: 52
		}
	} // L: 54
}
