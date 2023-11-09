import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("d")
	public static short[] field2859;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1984485843
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1274844871
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lkp;Lkp;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1; // L: 13
		this.coord2 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2045439656"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Liy;",
		garbageValue = "1"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2147415720"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "740963101"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1902929704"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) { // L: 18
			return true;
		} else {
			return this.labelFitsScreen(var1, var2);
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "32"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0; // L: 33
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-34"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) { // L: 37
			return false;
		} else {
			WorldMapElement var3 = TileItem.WorldMapElement_get(this.getElement()); // L: 38
			int var4 = this.getSubWidth(); // L: 39
			int var5 = this.getSubHeight(); // L: 40
			switch(var3.horizontalAlignment.value) { // L: 41
			case 0:
				if (var1 >= this.screenX && var1 < var4 + this.screenX) { // L: 49
					break;
				}

				return false;
			case 1:
				if (var1 >= this.screenX - var4 / 2 && var1 <= var4 / 2 + this.screenX) { // L: 54
					break;
				}

				return false;
			case 2:
				if (var1 <= this.screenX - var4 || var1 > this.screenX) { // L: 44
					return false;
				}
			}

			switch(var3.verticalAlignment.value) { // L: 58
			case 0:
				if (var2 > this.screenY - var5 && var2 <= this.screenY) { // L: 66
					break;
				}

				return false;
			case 1:
				if (var2 >= this.screenY - var5 / 2 && var2 <= var5 / 2 + this.screenY) { // L: 71
					break;
				}

				return false;
			case 2:
				if (var2 < this.screenY || var2 >= var5 + this.screenY) { // L: 61
					return false;
				}
			}

			return true; // L: 75
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "686248728"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel(); // L: 79
		if (var3 == null) { // L: 80
			return false; // L: 81
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) { // L: 83
			return var2 >= this.screenY && var2 <= this.screenY + var3.height; // L: 84
		} else {
			return false; // L: 85
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lpy;",
		garbageValue = "2052552812"
	)
	public static class433 method5044(int var0) {
		int var1 = class431.field4660[var0]; // L: 19
		if (var1 == 1) { // L: 20
			return class433.field4671; // L: 21
		} else if (var1 == 2) { // L: 23
			return class433.field4676; // L: 24
		} else {
			return var1 == 3 ? class433.field4668 : null; // L: 26 27 29
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1174105091"
	)
	static void method5045() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear(); // L: 47
	} // L: 48

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1057423277"
	)
	static boolean method5047() {
		return class260.clientPreferences.method2333() >= Client.field504; // L: 12441
	}
}
