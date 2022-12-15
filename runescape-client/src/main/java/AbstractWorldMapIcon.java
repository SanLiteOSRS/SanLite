import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -2136203537
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -108942395
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lky;Lky;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1; // L: 13
		this.coord2 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2098413555"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lii;",
		garbageValue = "849546905"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-520723785"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1290081241"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-587750672"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) { // L: 18
			return true; // L: 19
		} else {
			return this.labelFitsScreen(var1, var2); // L: 21
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "3416"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0; // L: 33
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "949717302"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) { // L: 37
			return false;
		} else {
			WorldMapElement var3 = JagexCache.WorldMapElement_get(this.getElement()); // L: 38
			int var4 = this.getSubWidth(); // L: 39
			int var5 = this.getSubHeight(); // L: 40
			switch(var3.horizontalAlignment.value) { // L: 41
			case 0:
				if (var1 >= this.screenX && var1 < var4 + this.screenX) { // L: 54
					break;
				}

				return false;
			case 1:
				if (var1 >= this.screenX - var4 / 2 && var1 <= var4 / 2 + this.screenX) { // L: 49
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
				if (var2 > this.screenY - var5 && var2 <= this.screenY) { // L: 61
					break;
				}

				return false;
			case 1:
				if (var2 >= this.screenY && var2 < var5 + this.screenY) { // L: 71
					break;
				}

				return false;
			case 2:
				if (var2 < this.screenY - var5 / 2 || var2 > var5 / 2 + this.screenY) { // L: 66
					return false;
				}
			}

			return true; // L: 75
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "74"
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
