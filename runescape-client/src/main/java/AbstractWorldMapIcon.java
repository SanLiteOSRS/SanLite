import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 492608601
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2039666003
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lmc;Lmc;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1; // L: 13
		this.coord2 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2135662389"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lkq;",
		garbageValue = "-2114244458"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-655814171"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-816534170"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1870658726"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) { // L: 18
			return true; // L: 19
		} else {
			return this.labelFitsScreen(var1, var2);
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1935416179"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0; // L: 33
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1283166598"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) { // L: 37
			return false;
		} else {
			WorldMapElement var3 = class138.WorldMapElement_get(this.getElement()); // L: 38
			int var4 = this.getSubWidth(); // L: 39
			int var5 = this.getSubHeight(); // L: 40
			switch(var3.horizontalAlignment.value) { // L: 41
			case 0:
				if (var1 > this.screenX - var4 && var1 <= this.screenX) { // L: 54
					break;
				}

				return false;
			case 1:
				if (var1 >= this.screenX && var1 < var4 + this.screenX) { // L: 49
					break;
				}

				return false;
			case 2:
				if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) { // L: 44
					return false;
				}
			}

			switch(var3.verticalAlignment.value) { // L: 58
			case 0:
				if (var2 >= this.screenY - var5 / 2 && var2 <= var5 / 2 + this.screenY) { // L: 61
					break;
				}

				return false;
			case 1:
				if (var2 > this.screenY - var5 && var2 <= this.screenY) { // L: 71
					break;
				}

				return false;
			case 2:
				if (var2 < this.screenY || var2 >= var5 + this.screenY) { // L: 66
					return false;
				}
			}

			return true; // L: 75
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-731770826"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel(); // L: 79
		if (var3 == null) { // L: 80
			return false; // L: 81
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) { // L: 83
			return var2 >= this.screenY && var2 <= var3.height + this.screenY; // L: 84
		} else {
			return false; // L: 85
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1637064671"
	)
	static final float method5550(int var0) {
		float var1 = 10075.0F - (float)var0; // L: 21
		return (1.0075567F * var1 - 75.56675F) / var1; // L: 22
	}
}
