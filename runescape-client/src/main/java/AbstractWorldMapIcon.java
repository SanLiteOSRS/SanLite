import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 640013743
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 654240679
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1395795845
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lnn;Lnn;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1; // L: 13
		this.coord2 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1650655075"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lkz;",
		garbageValue = "-2083618685"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "139624089"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1778353617"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "10"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) { // L: 18
			return true; // L: 19
		} else {
			return this.labelFitsScreen(var1, var2); // L: 21
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-96"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0; // L: 33
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "523862636"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) { // L: 37
			return false;
		} else {
			WorldMapElement var3 = class340.WorldMapElement_get(this.getElement()); // L: 38
			int var4 = this.getSubWidth(); // L: 39
			int var5 = this.getSubHeight(); // L: 40
			switch(var3.horizontalAlignment.value) { // L: 41
			case 0:
				if (var1 < this.screenX || var1 >= var4 + this.screenX) { // L: 44
					return false;
				}
				break;
			case 1:
				if (var1 > this.screenX - var4 && var1 <= this.screenX) { // L: 49
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
				if (var2 > this.screenY - var5 && var2 <= this.screenY) { // L: 66
					break;
				}

				return false;
			case 1:
				if (var2 >= this.screenY && var2 < var5 + this.screenY) { // L: 61
					break;
				}

				return false;
			case 2:
				if (var2 < this.screenY - var5 / 2 || var2 > var5 / 2 + this.screenY) { // L: 71
					return false;
				}
			}

			return true; // L: 75
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-908887082"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1735548780"
	)
	static final void method5748() {
		class6.method40("Your friend list is full. Max of 200 for free users, and 400 for members"); // L: 126
	} // L: 127

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(Lig;IIILde;I)V",
		garbageValue = "-600779663"
	)
	static void method5729(SequenceDefinition var0, int var1, int var2, int var3, Actor var4) {
		if (Client.soundEffectCount < 50) { // L: 3816
			if (var0.field2374 != null && var1 < var0.field2374.length && var0.field2374[var1] != null) { // L: 3817
				int var5 = var0.field2374[var1].field2241 & 31; // L: 3818
				if ((var5 <= 0 || NPC.clientPreferences.method2475() != 0) && (var5 != 0 || NPC.clientPreferences.method2473() != 0)) { // L: 3819
					class311.method5913(var0.field2374[var1], var2, var3, var4 == class133.localPlayer); // L: 3820
				}
			}
		}
	} // L: 3821

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1795217828"
	)
	static final boolean method5750() {
		return Client.isMenuOpen; // L: 9281
	}
}
