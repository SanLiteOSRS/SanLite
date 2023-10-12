import java.applet.Applet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rf")
public class class462 {
	@ObfuscatedName("ac")
	@Export("RunException_applet")
	public static Applet RunException_applet;

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-123351457"
	)
	static void method8308(int var0) {
		SequenceDefinition var1 = class36.SequenceDefinition_get(var0); // L: 12902
		if (var1.isCachedModelIdSet()) { // L: 12903
			int var3 = var1.SequenceDefinition_cachedModelId; // L: 12907
			class139 var5 = (class139)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var3); // L: 12911
			class139 var4;
			if (var5 != null) { // L: 12912
				var4 = var5; // L: 12913
			} else {
				AbstractArchive var7 = SequenceDefinition.SequenceDefinition_animationsArchive; // L: 12917
				AbstractArchive var8 = SequenceDefinition.SequenceDefinition_skeletonsArchive; // L: 12918
				boolean var9 = true; // L: 12920
				byte[] var10 = var7.getFile(var3 >> 16 & 65535, var3 & 65535); // L: 12921
				class139 var6;
				if (var10 == null) { // L: 12922
					var9 = false; // L: 12923
					var6 = null; // L: 12924
				} else {
					int var11 = (var10[1] & 255) << 8 | var10[2] & 255; // L: 12927
					byte[] var12 = var8.getFile(var11, 0); // L: 12930
					if (var12 == null) { // L: 12931
						var9 = false;
					}

					if (!var9) { // L: 12932
						var6 = null; // L: 12933
					} else {
						if (SoundCache.field333 == null) { // L: 12936
							MusicPatchPcmStream.field3510 = Runtime.getRuntime().availableProcessors(); // L: 12937
							SoundCache.field333 = new ThreadPoolExecutor(0, MusicPatchPcmStream.field3510, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(MusicPatchPcmStream.field3510 * 100 + 100), new class73()); // L: 12938
						}

						try {
							var6 = new class139(var7, var8, var3, false); // L: 12946
						} catch (Exception var14) { // L: 12948
							var6 = null; // L: 12949
						}
					}
				}

				if (var6 != null) { // L: 12953
					SequenceDefinition.SequenceDefinition_cachedModel.put(var6, (long)var3);
				}

				var4 = var6; // L: 12954
			}

			int var2;
			if (var4 == null) { // L: 12957
				var2 = 2; // L: 12958
			} else {
				var2 = var4.method3091() ? 0 : 1; // L: 12961
			}

			if (var2 == 2) { // L: 12963
				Client.field815.add(var1.SequenceDefinition_cachedModelId); // L: 12964
			}

		}
	} // L: 12904 12966
}
