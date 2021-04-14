import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lhk;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lhk;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 288833025
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1238552841
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		signature = "(Lhk;Lhk;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1;
		this.coord2 = var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-52"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)Lfi;",
		garbageValue = "634413820"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1975622360"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1420825097"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(IIB)Z",
		garbageValue = "-68"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) {
			return true;
		} else {
			return this.labelFitsScreen(var1, var2);
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "716812015"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(IIB)Z",
		garbageValue = "117"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) {
			return false;
		} else {
			WorldMapElement var3 = ByteArrayPool.WorldMapElement_get(this.getElement());
			int var4 = this.getSubWidth();
			int var5 = this.getSubHeight();
			switch(var3.horizontalAlignment.value) {
			case 0:
				if (var1 > this.screenX - var4 && var1 <= this.screenX) {
					break;
				}

				return false;
			case 1:
				if (var1 >= this.screenX - var4 / 2 && var1 <= var4 / 2 + this.screenX) {
					break;
				}

				return false;
			case 2:
				if (var1 < this.screenX || var1 >= var4 + this.screenX) {
					return false;
				}
			}

			switch(var3.verticalAlignment.value) {
			case 0:
				if (var2 < this.screenY - var5 / 2 || var2 > var5 / 2 + this.screenY) {
					return false;
				}
				break;
			case 1:
				if (var2 <= this.screenY - var5 || var2 > this.screenY) {
					return false;
				}
				break;
			case 2:
				if (var2 < this.screenY || var2 >= var5 + this.screenY) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(III)Z",
		garbageValue = "-1156651084"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel();
		if (var3 == null) {
			return false;
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) {
			return var2 >= this.screenY && var2 <= var3.height + this.screenY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "519921718"
	)
	static void method3186() {
		for (int var0 = 0; var0 < Client.menuOptionsCount; ++var0) {
			if (RouteStrategy.method2653(Client.menuOpcodes[var0])) {
				if (var0 < Client.menuOptionsCount - 1) {
					for (int var1 = var0; var1 < Client.menuOptionsCount - 1; ++var1) {
						Client.menuActions[var1] = Client.menuActions[var1 + 1];
						Client.menuTargets[var1] = Client.menuTargets[var1 + 1];
						Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1];
						Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1];
						Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1];
						Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1];
						Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1];
					}
				}

				--var0;
				--Client.menuOptionsCount;
			}
		}

		SpriteMask.method4172(Player.menuWidth / 2 + class16.menuX, FontName.menuY);
	}
}
