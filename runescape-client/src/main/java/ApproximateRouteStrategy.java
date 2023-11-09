import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	ApproximateRouteStrategy() {
	} // L: 12740

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIILir;I)Z",
		garbageValue = "23201528"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 12744
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lni;II)Lln;",
		garbageValue = "2050790209"
	)
	static MusicPatch method1199(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 25
		return var2 == null ? null : new MusicPatch(var2); // L: 26
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "1480670253"
	)
	static final int method1196(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16; // L: 9
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ler;FS)F",
		garbageValue = "17469"
	)
	static float method1194(class129 var0, float var1) {
		if (var0 == null) { // L: 190
			return 0.0F; // L: 191
		} else {
			float var2 = var1 - var0.field1511; // L: 193
			return var0.field1516 + (var0.field1515 + (var0.field1514 + var2 * var0.field1526) * var2) * var2; // L: 194
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lnv;IIIBZI)V",
		garbageValue = "-652783981"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2); // L: 101
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6); // L: 102
		if (var8 == null) { // L: 103
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6); // L: 104
			if (var8 == null) { // L: 105
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6); // L: 106
				if (var8 != null) { // L: 107
					if (var5) { // L: 108
						var8.removeDual(); // L: 109
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 110
						--NetCache.NetCache_pendingWritesCount; // L: 111
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 112
					}

				} else {
					if (!var5) { // L: 116
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6); // L: 117
						if (var8 != null) { // L: 118
							return;
						}
					}

					var8 = new NetFileRequest(); // L: 120
					var8.archive = var0; // L: 121
					var8.crc = var3; // L: 122
					var8.padding = var4; // L: 123
					if (var5) { // L: 124
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 125
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 126
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8); // L: 129
						NetCache.NetCache_pendingWrites.put(var8, var6); // L: 130
						++NetCache.NetCache_pendingWritesCount; // L: 131
					}

				}
			}
		}
	} // L: 114 133

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "708423212"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 39
		if (var4 == null) { // L: 40
			var4 = new ItemContainer(); // L: 41
			ItemContainer.itemContainers.put(var4, (long)var0); // L: 42
		}

		if (var4.ids.length <= var1) { // L: 44
			int[] var5 = new int[var1 + 1]; // L: 45
			int[] var6 = new int[var1 + 1]; // L: 46

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) { // L: 47
				var5[var7] = var4.ids[var7]; // L: 48
				var6[var7] = var4.quantities[var7]; // L: 49
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) { // L: 51
				var5[var7] = -1; // L: 52
				var6[var7] = 0; // L: 53
			}

			var4.ids = var5; // L: 55
			var4.quantities = var6; // L: 56
		}

		var4.ids[var1] = var2; // L: 58
		var4.quantities[var1] = var3; // L: 59
	} // L: 60
}
