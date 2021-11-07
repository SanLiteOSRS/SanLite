import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1380271839
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 380689567
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lie;Lie;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1;
		this.coord2 = var2;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1660589105"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Lga;",
		garbageValue = "0"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "374350712"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1569056170"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1706303277"
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
		descriptor = "(I)Z",
		garbageValue = "-2053967223"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1990490630"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) {
			return false;
		} else {
			WorldMapElement var3 = ItemComposition.WorldMapElement_get(this.getElement());
			int var4 = this.getSubWidth();
			int var5 = this.getSubHeight();
			switch(var3.horizontalAlignment.value) {
			case 0:
				if (var1 > this.screenX - var4 && var1 <= this.screenX) {
					break;
				}

				return false;
			case 1:
				if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) {
					return false;
				}
				break;
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
				if (var2 < this.screenY || var2 >= var5 + this.screenY) {
					return false;
				}
				break;
			case 2:
				if (var2 <= this.screenY - var5 || var2 > this.screenY) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "84"
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-1528171345"
	)
	static int method4026(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return WorldMapLabelSize.method3540(var0, var1, var2);
		} else if (var0 < 1100) {
			return BZip2State.method7179(var0, var1, var2);
		} else if (var0 < 1200) {
			return class132.method2766(var0, var1, var2);
		} else if (var0 < 1300) {
			return class19.method290(var0, var1, var2);
		} else if (var0 < 1400) {
			return WorldMapEvent.method4105(var0, var1, var2);
		} else if (var0 < 1500) {
			return MusicPatch.method4950(var0, var1, var2);
		} else if (var0 < 1600) {
			return ViewportMouse.method4622(var0, var1, var2);
		} else if (var0 < 1700) {
			return WorldMapSection1.method3999(var0, var1, var2);
		} else if (var0 < 1800) {
			return class54.method1101(var0, var1, var2);
		} else if (var0 < 1900) {
			return GraphicsObject.method1896(var0, var1, var2);
		} else if (var0 < 2000) {
			return InterfaceParent.method2079(var0, var1, var2);
		} else if (var0 < 2100) {
			return BZip2State.method7179(var0, var1, var2);
		} else if (var0 < 2200) {
			return class132.method2766(var0, var1, var2);
		} else if (var0 < 2300) {
			return class19.method290(var0, var1, var2);
		} else if (var0 < 2400) {
			return WorldMapEvent.method4105(var0, var1, var2);
		} else if (var0 < 2500) {
			return MusicPatch.method4950(var0, var1, var2);
		} else if (var0 < 2600) {
			return GrandExchangeOfferWorldComparator.method5439(var0, var1, var2);
		} else if (var0 < 2700) {
			return class196.method3972(var0, var1, var2);
		} else if (var0 < 2800) {
			return class81.method2089(var0, var1, var2);
		} else if (var0 < 2900) {
			return class13.method173(var0, var1, var2);
		} else if (var0 < 3000) {
			return InterfaceParent.method2079(var0, var1, var2);
		} else if (var0 < 3200) {
			return ScriptFrame.method1118(var0, var1, var2);
		} else if (var0 < 3300) {
			return class123.method2618(var0, var1, var2);
		} else if (var0 < 3400) {
			return UrlRequester.method2427(var0, var1, var2);
		} else if (var0 < 3500) {
			return World.method1668(var0, var1, var2);
		} else if (var0 < 3600) {
			return GameEngine.method555(var0, var1, var2);
		} else if (var0 < 3700) {
			return class139.method2837(var0, var1, var2);
		} else if (var0 < 3800) {
			return class129.method2738(var0, var1, var2);
		} else if (var0 < 3900) {
			return SoundCache.method799(var0, var1, var2);
		} else if (var0 < 4000) {
			return Fonts.method6687(var0, var1, var2);
		} else if (var0 < 4100) {
			return class14.method190(var0, var1, var2);
		} else if (var0 < 4200) {
			return class28.method401(var0, var1, var2);
		} else if (var0 < 4300) {
			return TileItem.method2309(var0, var1, var2);
		} else if (var0 < 5100) {
			return class114.method2542(var0, var1, var2);
		} else if (var0 < 5400) {
			return class91.method2271(var0, var1, var2);
		} else if (var0 < 5600) {
			return InvDefinition.method2982(var0, var1, var2);
		} else if (var0 < 5700) {
			return class184.method3871(var0, var1, var2);
		} else if (var0 < 6300) {
			return GrandExchangeOfferOwnWorldComparator.method1158(var0, var1, var2);
		} else if (var0 < 6600) {
			return class12.method171(var0, var1, var2);
		} else if (var0 < 6700) {
			return ArchiveDiskActionHandler.method5257(var0, var1, var2);
		} else if (var0 < 6800) {
			return class123.method2608(var0, var1, var2);
		} else if (var0 < 6900) {
			return class244.method4727(var0, var1, var2);
		} else if (var0 < 7000) {
			return ChatChannel.method2012(var0, var1, var2);
		} else if (var0 < 7100) {
			return class139.method2845(var0, var1, var2);
		} else if (var0 < 7200) {
			return class67.method1914(var0, var1, var2);
		} else {
			return var0 < 7300 ? class28.method402(var0, var1, var2) : 2;
		}
	}
}
