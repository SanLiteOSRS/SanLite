import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
public class class131 {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -1316992101
	)
	@Export("selectedItemId")
	static int selectedItemId;

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Lhw;",
		garbageValue = "-1224453305"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 405
		if (var1 != null) { // L: 406
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive; // L: 408
			AbstractArchive var4 = class16.SequenceDefinition_skeletonsArchive; // L: 409
			boolean var5 = true; // L: 411
			int[] var6 = var3.getGroupFileIds(var0); // L: 412

			for (int var7 = 0; var7 < var6.length; ++var7) { // L: 413
				byte[] var8 = var3.getFile(var0, var6[var7]); // L: 414
				if (var8 == null) { // L: 415
					var5 = false; // L: 416
				} else {
					int var9 = (var8[0] & 255) << 8 | var8[1] & 255; // L: 419
					byte[] var10 = var4.getFile(var9, 0); // L: 422
					if (var10 == null) { // L: 423
						var5 = false;
					}
				}
			}

			Frames var2;
			if (!var5) { // L: 425
				var2 = null; // L: 426
			} else {
				try {
					var2 = new Frames(var3, var4, var0, false); // L: 430
				} catch (Exception var12) { // L: 432
					var2 = null; // L: 433
				}
			}

			if (var2 != null) { // L: 437
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var2, (long)var0);
			}

			return var2; // L: 438
		}
	}
}
