import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
public final class class341 {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lny;IIIBZI)V",
		garbageValue = "636317175"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2); // L: 149
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6); // L: 150
		if (var8 == null) { // L: 151
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6); // L: 152
			if (var8 == null) { // L: 153
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6); // L: 154
				if (var8 != null) { // L: 155
					if (var5) { // L: 156
						var8.removeDual(); // L: 157
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 158
						--NetCache.NetCache_pendingWritesCount; // L: 159
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 160
					}

				} else {
					if (!var5) { // L: 164
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6); // L: 165
						if (var8 != null) { // L: 166
							return;
						}
					}

					var8 = new NetFileRequest(); // L: 168
					var8.archive = var0; // L: 169
					var8.crc = var3; // L: 170
					var8.padding = var4; // L: 171
					if (var5) { // L: 172
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 173
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 174
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8); // L: 177
						NetCache.NetCache_pendingWrites.put(var8, var6); // L: 178
						++NetCache.NetCache_pendingWritesCount; // L: 179
					}

				}
			}
		}
	} // L: 162 181
}
