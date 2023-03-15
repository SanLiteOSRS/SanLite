import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class50 {
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	static Bounds field118;

	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lbd;",
		garbageValue = "1985011377"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 11
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lha;",
		garbageValue = "341640175"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0); // L: 32
		if (var1 != null) { // L: 33
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0); // L: 34
			var1 = new SpotAnimationDefinition(); // L: 35
			var1.id = var0; // L: 36
			if (var2 != null) { // L: 37
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 38
			return var1; // L: 39
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lmx;IIIBZB)V",
		garbageValue = "10"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2); // L: 62
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6); // L: 63
		if (var8 == null) { // L: 64
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6); // L: 65
			if (var8 == null) { // L: 66
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6); // L: 67
				if (var8 != null) { // L: 68
					if (var5) { // L: 69
						var8.removeDual(); // L: 70
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 71
						--NetCache.NetCache_pendingWritesCount; // L: 72
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 73
					}

				} else {
					if (!var5) { // L: 77
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6); // L: 78
						if (var8 != null) { // L: 79
							return;
						}
					}

					var8 = new NetFileRequest(); // L: 81
					var8.archive = var0; // L: 82
					var8.crc = var3; // L: 83
					var8.padding = var4; // L: 84
					if (var5) { // L: 85
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 86
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 87
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8); // L: 90
						NetCache.NetCache_pendingWrites.put(var8, var6); // L: 91
						++NetCache.NetCache_pendingWritesCount; // L: 92
					}

				}
			}
		}
	} // L: 75 94
}
