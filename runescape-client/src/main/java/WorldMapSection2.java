import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2029464779
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -529896927
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1578539145
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1842577959
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 613887047
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 2144290581
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 277042001
	)
	int field2882;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -143992327
	)
	int field2883;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 133517413
	)
	int field2876;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1731130235
	)
	int field2884;

	WorldMapSection2() {
	} // L: 18

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lju;B)V",
		garbageValue = "-106"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2882) { // L: 22
			var1.regionLowX = this.field2882;
		}

		if (var1.regionHighX < this.field2876) {
			var1.regionHighX = this.field2876; // L: 23
		}

		if (var1.regionLowY > this.field2883) { // L: 24
			var1.regionLowY = this.field2883;
		}

		if (var1.regionHighY < this.field2884) { // L: 25
			var1.regionHighY = this.field2884;
		}

	} // L: 26

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "0"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) { // L: 30
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "326256885"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2882 && var1 >> 6 <= this.field2876 && var2 >> 6 >= this.field2883 && var2 >> 6 <= this.field2884; // L: 38
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIS)[I",
		garbageValue = "3148"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{this.field2882 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2883 * 64 - this.regionStartY * 64)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Lms;",
		garbageValue = "-2137162191"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.regionStartX * 64 - this.field2882 * 64 + var1; // L: 57
			int var4 = this.regionStartY * 64 - this.field2883 * 64 + var2; // L: 58
			return new Coord(this.minPlane, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "8"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 64
		this.planes = var1.readUnsignedByte(); // L: 65
		this.regionStartX = var1.readUnsignedShort(); // L: 66
		this.regionStartY = var1.readUnsignedShort(); // L: 67
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort(); // L: 69
		this.field2882 = var1.readUnsignedShort(); // L: 70
		this.field2883 = var1.readUnsignedShort(); // L: 71
		this.field2876 = var1.readUnsignedShort(); // L: 72
		this.field2884 = var1.readUnsignedShort(); // L: 73
		this.postRead(); // L: 74
	} // L: 75

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "77737607"
	)
	@Export("postRead")
	void postRead() {
	} // L: 77

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1864573012"
	)
	public static int method5097(int var0) {
		return CollisionMap.method4149(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 68
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
		garbageValue = "-79"
	)
	public static String method5096(CharSequence var0) {
		return InvDefinition.method3535('*', var0.length()); // L: 227
	}
}
