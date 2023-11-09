import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -941369423
	)
	static int field4379;
	@ObfuscatedName("dm")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	@Export("Ignored_cached")
	static class428 Ignored_cached;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1706987485
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 600654443
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1180177163
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1058256337
	)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2); // L: 14
		this.setHigh(var3, var4); // L: 15
	} // L: 16

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2); // L: 10
	} // L: 11

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "77"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1126625188"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1971817218"
	)
	public boolean method6853(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.lowX + this.highX && var2 >= this.lowY && var2 < this.lowY + this.highY; // L: 29
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnh;Lnh;B)V",
		garbageValue = "71"
	)
	public void method6848(Bounds var1, Bounds var2) {
		this.method6847(var1, var2); // L: 37
		this.method6850(var1, var2); // L: 38
	} // L: 39

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnh;Lnh;B)V",
		garbageValue = "-120"
	)
	void method6847(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 42
		var2.highX = this.highX; // L: 43
		if (this.lowX < var1.lowX) { // L: 44
			var2.highX -= var1.lowX - this.lowX; // L: 45
			var2.lowX = var1.lowX; // L: 46
		}

		if (var2.method6851() > var1.method6851()) { // L: 48
			var2.highX -= var2.method6851() - var1.method6851(); // L: 49
		}

		if (var2.highX < 0) { // L: 51
			var2.highX = 0;
		}

	} // L: 52

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lnh;Lnh;I)V",
		garbageValue = "986167182"
	)
	void method6850(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 55
		var2.highY = this.highY; // L: 56
		if (this.lowY < var1.lowY) { // L: 57
			var2.highY -= var1.lowY - this.lowY; // L: 58
			var2.lowY = var1.lowY; // L: 59
		}

		if (var2.method6852() > var1.method6852()) { // L: 61
			var2.highY -= var2.method6852() - var1.method6852(); // L: 62
		}

		if (var2.highY < 0) { // L: 64
			var2.highY = 0;
		}

	} // L: 65

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	int method6851() {
		return this.highX + this.lowX; // L: 68
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	int method6852() {
		return this.highY + this.lowY; // L: 72
	}

	public String toString() {
		return null; // L: 33
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lls;Ljava/lang/String;Ljava/lang/String;I)[Lqe;",
		garbageValue = "-446960317"
	)
	public static IndexedSprite[] method6868(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 137
		int var4 = var0.getFileId(var3, var2); // L: 138
		return DefaultsGroup.method6840(var0, var3, var4); // L: 139
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "816054314"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 5406
			int var3 = ObjectComposition.getTileHeight(var0, var1, class268.Client_plane) - var2; // L: 5411
			var0 -= class16.cameraX; // L: 5412
			var3 -= WorldMapLabel.cameraY; // L: 5413
			var1 -= class269.cameraZ; // L: 5414
			int var4 = Rasterizer3D.Rasterizer3D_sine[class82.cameraPitch]; // L: 5415
			int var5 = Rasterizer3D.Rasterizer3D_cosine[class82.cameraPitch]; // L: 5416
			int var6 = Rasterizer3D.Rasterizer3D_sine[ClientPreferences.cameraYaw]; // L: 5417
			int var7 = Rasterizer3D.Rasterizer3D_cosine[ClientPreferences.cameraYaw]; // L: 5418
			int var8 = var0 * var7 + var6 * var1 >> 16; // L: 5419
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5420
			var0 = var8; // L: 5421
			var8 = var5 * var3 - var4 * var1 >> 16; // L: 5422
			var1 = var5 * var1 + var4 * var3 >> 16; // L: 5423
			if (var1 >= 50) { // L: 5425
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5426
				Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1; // L: 5427
			} else {
				Client.viewportTempX = -1; // L: 5430
				Client.viewportTempY = -1; // L: 5431
			}

		} else {
			Client.viewportTempX = -1; // L: 5407
			Client.viewportTempY = -1; // L: 5408
		}
	} // L: 5409 5433
}
