import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;

	SecureRandomCallable() {
	} // L: 42

	public Object call() {
		return class69.method2031(); // L: 52
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Lha;",
		garbageValue = "6"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 342
		if (var1 != null) { // L: 343
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive; // L: 345
			AbstractArchive var4 = BuddyRankComparator.SequenceDefinition_skeletonsArchive; // L: 346
			boolean var5 = true; // L: 348
			int[] var6 = var3.getGroupFileIds(var0); // L: 349

			for (int var7 = 0; var7 < var6.length; ++var7) { // L: 350
				byte[] var8 = var3.getFile(var0, var6[var7]); // L: 351
				if (var8 == null) { // L: 352
					var5 = false; // L: 353
				} else {
					int var9 = (var8[0] & 255) << 8 | var8[1] & 255; // L: 356
					byte[] var10 = var4.getFile(var9, 0); // L: 359
					if (var10 == null) { // L: 360
						var5 = false;
					}
				}
			}

			Frames var2;
			if (!var5) { // L: 362
				var2 = null; // L: 363
			} else {
				try {
					var2 = new Frames(var3, var4, var0, false); // L: 367
				} catch (Exception var12) { // L: 369
					var2 = null; // L: 370
				}
			}

			if (var2 != null) { // L: 374
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var2, (long)var0);
			}

			return var2; // L: 375
		}
	}
}
