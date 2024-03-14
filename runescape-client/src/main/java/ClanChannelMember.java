import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("aq")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -98830189
	)
	@Export("world")
	public int world;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvn;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	} // L: 10

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "1398041784"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		synchronized(ByteArrayPool.field4643) { // L: 52
			byte[] var3;
			if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool.ByteArrayPool_smallCount > 0) { // L: 53
				var3 = ByteArrayPool.ByteArrayPool_small[--ByteArrayPool.ByteArrayPool_smallCount]; // L: 54
				ByteArrayPool.ByteArrayPool_small[ByteArrayPool.ByteArrayPool_smallCount] = null; // L: 55
				return var3; // L: 56
			}

			if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool.ByteArrayPool_mediumCount > 0) { // L: 58
				var3 = ByteArrayPool.ByteArrayPool_medium[--ByteArrayPool.ByteArrayPool_mediumCount]; // L: 59
				ByteArrayPool.ByteArrayPool_medium[ByteArrayPool.ByteArrayPool_mediumCount] = null; // L: 60
				return var3; // L: 61
			}

			if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool.ByteArrayPool_largeCount > 0) { // L: 63
				var3 = ByteArrayPool.ByteArrayPool_large[--ByteArrayPool.ByteArrayPool_largeCount]; // L: 64
				ByteArrayPool.ByteArrayPool_large[ByteArrayPool.ByteArrayPool_largeCount] = null; // L: 65
				return var3; // L: 66
			}

			if ((var0 == 30000 || var0 < 30000 && var1) && ByteArrayPool.field4650 > 0) { // L: 68
				var3 = ByteArrayPool.field4658[--ByteArrayPool.field4650]; // L: 69
				ByteArrayPool.field4658[ByteArrayPool.field4650] = null; // L: 70
				return var3; // L: 71
			}

			int var6;
			if (Varcs.ByteArrayPool_arrays != null) { // L: 73
				for (var6 = 0; var6 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var6) { // L: 74
					if ((ByteArrayPool.ByteArrayPool_alternativeSizes[var6] == var0 || var0 < ByteArrayPool.ByteArrayPool_alternativeSizes[var6] && var1) && class130.ByteArrayPool_altSizeArrayCounts[var6] > 0) { // L: 75
						byte[] var4 = Varcs.ByteArrayPool_arrays[var6][--class130.ByteArrayPool_altSizeArrayCounts[var6]]; // L: 76
						Varcs.ByteArrayPool_arrays[var6][class130.ByteArrayPool_altSizeArrayCounts[var6]] = null; // L: 77
						return var4; // L: 78
					}
				}
			}

			if (var1 && ByteArrayPool.ByteArrayPool_alternativeSizes != null) { // L: 82 83
				for (var6 = 0; var6 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var6) { // L: 84
					if (var0 <= ByteArrayPool.ByteArrayPool_alternativeSizes[var6] && class130.ByteArrayPool_altSizeArrayCounts[var6] < Varcs.ByteArrayPool_arrays[var6].length) { // L: 85
						return new byte[ByteArrayPool.ByteArrayPool_alternativeSizes[var6]]; // L: 86
					}
				}
			}
		}

		return new byte[var0]; // L: 92
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1231060837"
	)
	@Export("ByteArrayPool_release")
	public static void ByteArrayPool_release(byte[] var0) {
		synchronized(ByteArrayPool.field4643) { // L: 100
			if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4651) { // L: 101
				ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 102
			} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4652) { // L: 105
				ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0; // L: 106
			} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4653) { // L: 109
				ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0; // L: 110
			} else if (var0.length == 30000 && ByteArrayPool.field4650 < ByteArrayPool.field4654) { // L: 113
				ByteArrayPool.field4658[++ByteArrayPool.field4650 - 1] = var0; // L: 114
			} else {
				if (Varcs.ByteArrayPool_arrays != null) { // L: 117
					for (int var2 = 0; var2 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 118
						if (var0.length == ByteArrayPool.ByteArrayPool_alternativeSizes[var2] && class130.ByteArrayPool_altSizeArrayCounts[var2] < Varcs.ByteArrayPool_arrays[var2].length) { // L: 119
							Varcs.ByteArrayPool_arrays[var2][class130.ByteArrayPool_altSizeArrayCounts[var2]++] = var0; // L: 120
							return; // L: 121
						}
					}
				}

			}
		}
	} // L: 103 107 111 115 126

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1597695959"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 5769
			int var3 = class272.getTileHeight(var0, var1, class473.Client_plane) - var2; // L: 5774
			var0 -= FriendsChatMember.cameraX; // L: 5775
			var3 -= class18.cameraY; // L: 5776
			var1 -= class317.cameraZ; // L: 5777
			int var4 = Rasterizer3D.Rasterizer3D_sine[FriendSystem.cameraPitch]; // L: 5778
			int var5 = Rasterizer3D.Rasterizer3D_cosine[FriendSystem.cameraPitch]; // L: 5779
			int var6 = Rasterizer3D.Rasterizer3D_sine[Script.cameraYaw]; // L: 5780
			int var7 = Rasterizer3D.Rasterizer3D_cosine[Script.cameraYaw]; // L: 5781
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 5782
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5783
			var0 = var8; // L: 5784
			var8 = var3 * var5 - var4 * var1 >> 16; // L: 5785
			var1 = var5 * var1 + var3 * var4 >> 16; // L: 5786
			if (var1 >= 50) { // L: 5788
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5789
				Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1; // L: 5790
			} else {
				Client.viewportTempX = -1; // L: 5793
				Client.viewportTempY = -1; // L: 5794
			}

		} else {
			Client.viewportTempX = -1; // L: 5770
			Client.viewportTempY = -1; // L: 5771
		}
	} // L: 5772 5796
}
