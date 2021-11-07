import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public class class174 {
	@ObfuscatedName("s")
	@Export("directions")
	public static int[][] directions;
	@ObfuscatedName("a")
	@Export("distances")
	public static int[][] distances;
	@ObfuscatedName("p")
	@Export("bufferX")
	public static int[] bufferX;
	@ObfuscatedName("j")
	@Export("bufferY")
	public static int[] bufferY;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		intValue = -1116273289
	)
	@Export("cameraY")
	static int cameraY;

	static {
		directions = new int[128][128];
		distances = new int[128][128];
		bufferX = new int[4096];
		bufferY = new int[4096];
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Low;IIII)V",
		garbageValue = "-1139186342"
	)
	static void method3512(SpritePixels var0, int var1, int var2, int var3) {
		WorldMapRegion.WorldMapRegion_cachedSprites.put(var0, NetSocket.method2923(var1, var2, var3), var0.pixels.length * 4);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "18"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (class132.Widget_loadedInterfaces[var0]) {
			return true;
		} else if (!class283.Widget_archive.tryLoadGroup(var0)) {
			return false;
		} else {
			int var1 = class283.Widget_archive.getGroupFileCount(var0);
			if (var1 == 0) {
				class132.Widget_loadedInterfaces[var0] = true;
				return true;
			} else {
				if (WorldMapSection1.Widget_interfaceComponents[var0] == null) {
					WorldMapSection1.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) {
					if (WorldMapSection1.Widget_interfaceComponents[var0][var2] == null) {
						byte[] var3 = class283.Widget_archive.takeFile(var0, var2);
						if (var3 != null) {
							WorldMapSection1.Widget_interfaceComponents[var0][var2] = new Widget();
							WorldMapSection1.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
							if (var3[0] == -1) {
								WorldMapSection1.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								WorldMapSection1.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
							}
						}
					}
				}

				class132.Widget_loadedInterfaces[var0] = true;
				return true;
			}
		}
	}
}
