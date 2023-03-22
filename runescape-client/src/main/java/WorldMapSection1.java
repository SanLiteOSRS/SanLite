import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 392246011
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1656122133
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 746959191
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1499687973
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 308206289
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -443053619
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	} // L: 14

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljw;B)V",
		garbageValue = "-27"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) { // L: 18
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX; // L: 19
		}

		if (var1.regionLowY > this.regionEndY) { // L: 20
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) { // L: 21
			var1.regionHighY = this.regionEndY;
		}

	} // L: 22

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-779320103"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) { // L: 26
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY; // L: 29
		} else {
			return false; // L: 27
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "207934155"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY; // L: 34
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-1684969021"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 39
			return null; // L: 40
		} else {
			int[] var4 = new int[]{this.regionEndX * 64 - this.regionStartX * 64 + var2, var3 + (this.regionEndY * 64 - this.regionStartY * 64)}; // L: 42 43 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Llt;",
		garbageValue = "2016097062"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 50
			return null; // L: 51
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1; // L: 53
			int var4 = this.regionStartY * 64 - this.regionEndY * 64 + var2; // L: 54
			return new Coord(this.minPlane, var3, var4); // L: 55
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "1437872186"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 60
		this.planes = var1.readUnsignedByte(); // L: 61
		this.regionStartX = var1.readUnsignedShort(); // L: 62
		this.regionStartY = var1.readUnsignedShort(); // L: 63
		this.regionEndX = var1.readUnsignedShort(); // L: 64
		this.regionEndY = var1.readUnsignedShort(); // L: 65
		this.postRead(); // L: 66
	} // L: 67

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "10421"
	)
	@Export("postRead")
	void postRead() {
	} // L: 69

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lmy;",
		garbageValue = "1167671998"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16; // L: 234
		int var2 = var0 & 65535; // L: 235
		if (class155.Widget_interfaceComponents[var1] == null || class155.Widget_interfaceComponents[var1][var2] == null) { // L: 236
			boolean var3 = GrandExchangeEvent.loadInterface(var1); // L: 237
			if (!var3) { // L: 238
				return null;
			}
		}

		return class155.Widget_interfaceComponents[var1][var2]; // L: 240
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "92"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 5215
			if (GrandExchangeEvent.loadInterface(var0)) { // L: 5216
				Widget[] var1 = class155.Widget_interfaceComponents[var0]; // L: 5217

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 5218
					Widget var3 = var1[var2]; // L: 5219
					if (var3.onLoad != null) { // L: 5220
						ScriptEvent var4 = new ScriptEvent(); // L: 5221
						var4.widget = var3; // L: 5222
						var4.args = var3.onLoad; // L: 5223
						class14.runScript(var4, 5000000, 0); // L: 5224
					}
				}

			}
		}
	} // L: 5227
}
