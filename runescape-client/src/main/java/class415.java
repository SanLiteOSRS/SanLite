import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
public class class415 {
	@ObfuscatedName("bg")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Ljz;",
		garbageValue = "-1534490882"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 345
		if (var1 != null) { // L: 346
			return var1;
		} else {
			AbstractArchive var3 = GrandExchangeOfferOwnWorldComparator.SequenceDefinition_animationsArchive; // L: 348
			AbstractArchive var4 = SequenceDefinition.SequenceDefinition_skeletonsArchive; // L: 349
			boolean var5 = true; // L: 351
			int[] var6 = var3.getGroupFileIds(var0); // L: 352

			for (int var7 = 0; var7 < var6.length; ++var7) { // L: 353
				byte[] var8 = var3.getFile(var0, var6[var7]); // L: 354
				if (var8 == null) { // L: 355
					var5 = false; // L: 356
				} else {
					int var9 = (var8[0] & 255) << 8 | var8[1] & 255; // L: 359
					byte[] var10 = var4.getFile(var9, 0); // L: 362
					if (var10 == null) { // L: 363
						var5 = false;
					}
				}
			}

			Frames var2;
			if (!var5) { // L: 365
				var2 = null; // L: 366
			} else {
				try {
					var2 = new Frames(var3, var4, var0, false); // L: 370
				} catch (Exception var12) { // L: 372
					var2 = null; // L: 373
				}
			}

			if (var2 != null) { // L: 377
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var2, (long)var0);
			}

			return var2; // L: 378
		}
	}
}
