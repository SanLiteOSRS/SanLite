import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
public class class374 extends RuntimeException {
	@ObfuscatedName("al")
	static ThreadPoolExecutor field4387;

	public class374(String var1, Object[] var2) {
		super(String.format(var1, var2)); // L: 5
	} // L: 6

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2014413605"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 5459
			int var3 = class147.getTileHeight(var0, var1, GameEngine.Client_plane) - var2; // L: 5464
			var0 -= class36.cameraX; // L: 5465
			var3 -= class174.cameraY; // L: 5466
			var1 -= class297.cameraZ; // L: 5467
			int var4 = Rasterizer3D.Rasterizer3D_sine[WorldMapSectionType.cameraPitch]; // L: 5468
			int var5 = Rasterizer3D.Rasterizer3D_cosine[WorldMapSectionType.cameraPitch]; // L: 5469
			int var6 = Rasterizer3D.Rasterizer3D_sine[class125.cameraYaw]; // L: 5470
			int var7 = Rasterizer3D.Rasterizer3D_cosine[class125.cameraYaw]; // L: 5471
			int var8 = var0 * var7 + var6 * var1 >> 16; // L: 5472
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5473
			var0 = var8; // L: 5474
			var8 = var5 * var3 - var4 * var1 >> 16; // L: 5475
			var1 = var5 * var1 + var3 * var4 >> 16; // L: 5476
			if (var1 >= 50) { // L: 5478
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5479
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2; // L: 5480
			} else {
				Client.viewportTempX = -1; // L: 5483
				Client.viewportTempY = -1; // L: 5484
			}

		} else {
			Client.viewportTempX = -1; // L: 5460
			Client.viewportTempY = -1; // L: 5461
		}
	} // L: 5462 5486
}
