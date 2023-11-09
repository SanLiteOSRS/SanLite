import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -216598991
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1288412757
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Llb;Llb;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1; // L: 13
		this.coord2 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1645421540"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lku;",
		garbageValue = "-2043987595"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1623088499"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "435365367"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-65"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) { // L: 18
			return true; // L: 19
		} else {
			return this.labelFitsScreen(var1, var2); // L: 21
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1824088404"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0; // L: 33
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2000208750"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) { // L: 37
			return false;
		} else {
			WorldMapElement var3 = class354.WorldMapElement_get(this.getElement()); // L: 38
			int var4 = this.getSubWidth(); // L: 39
			int var5 = this.getSubHeight(); // L: 40
			switch(var3.horizontalAlignment.value) { // L: 41
			case 0:
				if (var1 <= this.screenX - var4 || var1 > this.screenX) { // L: 44
					return false;
				}
				break;
			case 1:
				if (var1 >= this.screenX && var1 < var4 + this.screenX) { // L: 49
					break;
				}

				return false;
			case 2:
				if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) { // L: 54
					return false;
				}
			}

			switch(var3.verticalAlignment.value) { // L: 58
			case 0:
				if (var2 >= this.screenY && var2 < var5 + this.screenY) { // L: 66
					break;
				}

				return false;
			case 1:
				if (var2 >= this.screenY - var5 / 2 && var2 <= var5 / 2 + this.screenY) { // L: 61
					break;
				}

				return false;
			case 2:
				if (var2 <= this.screenY - var5 || var2 > this.screenY) { // L: 71
					return false;
				}
			}

			return true; // L: 75
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1064122109"
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
}
