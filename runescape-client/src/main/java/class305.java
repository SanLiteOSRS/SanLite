import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
final class class305 implements ThreadFactory {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("VarpDefinition_archive")
	public static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("ak")
	static byte[][][] field3399;
	@ObfuscatedName("eb")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive9")
	static Archive archive9;

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load"); // L: 105
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Z",
		garbageValue = "-56"
	)
	static final boolean method5722(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 214
		Buffer var4 = new Buffer(var0); // L: 215
		int var5 = -1; // L: 216

		label69:
		while (true) {
			int var6 = var4.method9023(); // L: 218
			if (var6 == 0) { // L: 219
				return var3; // L: 250
			}

			var5 += var6; // L: 220
			int var7 = 0; // L: 221
			boolean var8 = false; // L: 222

			while (true) {
				int var9;
				while (!var8) { // L: 224
					var9 = var4.readUShortSmart(); // L: 230
					if (var9 == 0) { // L: 231
						continue label69;
					}

					var7 += var9 - 1; // L: 232
					int var10 = var7 & 63; // L: 233
					int var11 = var7 >> 6 & 63; // L: 234
					int var12 = var4.readUnsignedByte() >> 2; // L: 235
					int var13 = var11 + var1; // L: 236
					int var14 = var10 + var2; // L: 237
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 238
						ObjectComposition var15 = class175.getObjectDefinition(var5); // L: 239
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 240
							if (!var15.needsModelFiles()) { // L: 241
								++Client.field574; // L: 242
								var3 = false; // L: 243
							}

							var8 = true; // L: 245
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 225
				if (var9 == 0) { // L: 226
					break;
				}

				var4.readUnsignedByte(); // L: 227
			}
		}
	}
}
