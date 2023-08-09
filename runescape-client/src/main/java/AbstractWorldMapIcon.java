import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "[Luu;"
	)
	static IndexedSprite[] field3044;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -677752819
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 266387541
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lmr;Lmr;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1; // L: 13
		this.coord2 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1799088869"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)Lka;",
		garbageValue = "8220"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "81"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-565304787"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2144265772"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) { // L: 18
			return true; // L: 19
		} else {
			return this.labelFitsScreen(var1, var2); // L: 21
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-588256332"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0; // L: 33
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1786751810"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) { // L: 37
			return false;
		} else {
			WorldMapElement var3 = SequenceDefinition.WorldMapElement_get(this.getElement()); // L: 38
			int var4 = this.getSubWidth(); // L: 39
			int var5 = this.getSubHeight(); // L: 40
			switch(var3.horizontalAlignment.value) { // L: 41
			case 0:
				if (var1 >= this.screenX - var4 / 2 && var1 <= var4 / 2 + this.screenX) { // L: 54
					break;
				}

				return false;
			case 1:
				if (var1 > this.screenX - var4 && var1 <= this.screenX) { // L: 49
					break;
				}

				return false;
			case 2:
				if (var1 < this.screenX || var1 >= var4 + this.screenX) { // L: 44
					return false;
				}
			}

			switch(var3.verticalAlignment.value) { // L: 58
			case 0:
				if (var2 > this.screenY - var5 && var2 <= this.screenY) { // L: 71
					break;
				}

				return false;
			case 1:
				if (var2 >= this.screenY && var2 < var5 + this.screenY) { // L: 66
					break;
				}

				return false;
			case 2:
				if (var2 < this.screenY - var5 / 2 || var2 > var5 / 2 + this.screenY) { // L: 61
					return false;
				}
			}

			return true; // L: 75
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-55"
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

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIB)V",
		garbageValue = "-47"
	)
	static final void method5565(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		PendingSpawn var10 = null; // L: 8410

		for (PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8411 8412 8417
			if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) { // L: 8413
				var10 = var11; // L: 8414
				break;
			}
		}

		if (var10 == null) { // L: 8419
			var10 = new PendingSpawn(); // L: 8420
			var10.plane = var0; // L: 8421
			var10.type = var3; // L: 8422
			var10.x = var1; // L: 8423
			var10.y = var2; // L: 8424
			var10.field1172 = -1; // L: 8425
			class11.method112(var10); // L: 8426
			Client.pendingSpawns.addFirst(var10); // L: 8427
		}

		var10.field1173 = var4; // L: 8429
		var10.field1170 = var5; // L: 8430
		var10.field1171 = var6; // L: 8431
		var10.delay = var8; // L: 8432
		var10.hitpoints = var9; // L: 8433
		var10.method2376(var7); // L: 8434
	} // L: 8435
}
