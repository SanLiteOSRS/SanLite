import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	static final DefaultsGroup field4002;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = -1669753129
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -253275399
	)
	@Export("group")
	final int group;

	static {
		field4002 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1517479091"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var3 = class392.getTileHeight(var0, var1, GrandExchangeOfferTotalQuantityComparator.Client_plane) - var2;
			var0 -= WorldMapSectionType.cameraX;
			var3 -= class174.cameraY;
			var1 -= class65.cameraZ;
			int var4 = Rasterizer3D.Rasterizer3D_sine[class121.cameraPitch];
			int var5 = Rasterizer3D.Rasterizer3D_cosine[class121.cameraPitch];
			int var6 = Rasterizer3D.Rasterizer3D_sine[WorldMapRegion.cameraYaw];
			int var7 = Rasterizer3D.Rasterizer3D_cosine[WorldMapRegion.cameraYaw];
			int var8 = var6 * var1 + var0 * var7 >> 16;
			var1 = var7 * var1 - var0 * var6 >> 16;
			var0 = var8;
			var8 = var3 * var5 - var4 * var1 >> 16;
			var1 = var5 * var1 + var4 * var3 >> 16;
			if (var1 >= 50) {
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
				Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}
}
