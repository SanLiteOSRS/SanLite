import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("ay")
	@Export("state")
	byte state;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1822531931
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1249089151
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 950407611
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1779141629
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -791618513
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	} // L: 13

	@ObfuscatedSignature(
		descriptor = "(Ltc;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte(); // L: 16
		this.id = var1.readUnsignedShort(); // L: 17
		this.unitPrice = var1.readInt(); // L: 18
		this.totalQuantity = var1.readInt(); // L: 19
		this.currentQuantity = var1.readInt(); // L: 20
		this.currentPrice = var1.readInt(); // L: 21
	} // L: 22

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-28"
	)
	@Export("status")
	public int status() {
		return this.state & 7; // L: 50
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-8"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0; // L: 54
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1625008392"
	)
	void method6880(int var1) {
		this.state &= -8; // L: 58
		this.state = (byte)(this.state | var1 & 7); // L: 59
	} // L: 60

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-768708348"
	)
	void method6886(int var1) {
		this.state &= -9; // L: 63
		if (var1 == 1) {
			this.state = (byte)(this.state | 8); // L: 64
		}

	} // L: 65

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2023609336"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 5659
			int var3 = class208.getTileHeight(var0, var1, NetFileRequest.Client_plane) - var2; // L: 5664
			var0 -= class19.cameraX; // L: 5665
			var3 -= DynamicObject.cameraY; // L: 5666
			var1 -= BuddyRankComparator.cameraZ; // L: 5667
			int var4 = Rasterizer3D.Rasterizer3D_sine[ObjectComposition.cameraPitch]; // L: 5668
			int var5 = Rasterizer3D.Rasterizer3D_cosine[ObjectComposition.cameraPitch]; // L: 5669
			int var6 = Rasterizer3D.Rasterizer3D_sine[Coord.cameraYaw]; // L: 5670
			int var7 = Rasterizer3D.Rasterizer3D_cosine[Coord.cameraYaw]; // L: 5671
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 5672
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5673
			var0 = var8; // L: 5674
			var8 = var5 * var3 - var4 * var1 >> 16; // L: 5675
			var1 = var4 * var3 + var5 * var1 >> 16; // L: 5676
			if (var1 >= 50) { // L: 5678
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5679
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2; // L: 5680
			} else {
				Client.viewportTempX = -1; // L: 5683
				Client.viewportTempY = -1; // L: 5684
			}

		} else {
			Client.viewportTempX = -1; // L: 5660
			Client.viewportTempY = -1; // L: 5661
		}
	} // L: 5662 5686
}
