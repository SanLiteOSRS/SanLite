import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -451067503
	)
	@Export("id")
	int id;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1361737769
	)
	@Export("count")
	int count;
	@ObfuscatedName("d")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("n")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	class211 field2451;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1; // L: 19
		Buffer var3 = new Buffer(var2); // L: 20
		this.count = var3.readUnsignedByte(); // L: 21
		this.transformTypes = new int[this.count]; // L: 22
		this.labels = new int[this.count][]; // L: 23

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) { // L: 24
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 25
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 26
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) { // L: 27
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) { // L: 29
			var4 = var3.readUnsignedShort(); // L: 30
			if (var4 > 0) { // L: 31
				this.field2451 = new class211(var3, var4); // L: 32
			}
		}

	} // L: 35

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2136592192"
	)
	public int method4262() {
		return this.count; // L: 38
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Lhh;",
		garbageValue = "-52"
	)
	public class211 method4263() {
		return this.field2451; // L: 42
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1488956825"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 5510
			int var3 = class132.getTileHeight(var0, var1, ApproximateRouteStrategy.Client_plane) - var2; // L: 5515
			var0 -= TextureProvider.cameraX; // L: 5516
			var3 -= class31.cameraY; // L: 5517
			var1 -= class313.cameraZ; // L: 5518
			int var4 = Rasterizer3D.Rasterizer3D_sine[class408.cameraPitch]; // L: 5519
			int var5 = Rasterizer3D.Rasterizer3D_cosine[class408.cameraPitch]; // L: 5520
			int var6 = Rasterizer3D.Rasterizer3D_sine[WorldMapSection1.cameraYaw]; // L: 5521
			int var7 = Rasterizer3D.Rasterizer3D_cosine[WorldMapSection1.cameraYaw]; // L: 5522
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 5523
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5524
			var0 = var8; // L: 5525
			var8 = var3 * var5 - var4 * var1 >> 16; // L: 5526
			var1 = var4 * var3 + var5 * var1 >> 16; // L: 5527
			if (var1 >= 50) { // L: 5529
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5530
				Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1; // L: 5531
			} else {
				Client.viewportTempX = -1; // L: 5534
				Client.viewportTempY = -1; // L: 5535
			}

		} else {
			Client.viewportTempX = -1; // L: 5511
			Client.viewportTempY = -1; // L: 5512
		}
	} // L: 5513 5537
}
