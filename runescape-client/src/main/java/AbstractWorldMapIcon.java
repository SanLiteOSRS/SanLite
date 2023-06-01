import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1603858927
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2109569199
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lms;Lms;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1; // L: 13
		this.coord2 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "52"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lko;",
		garbageValue = "530307957"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1960611596"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1025662810"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "430149932"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) { // L: 18
			return true; // L: 19
		} else {
			return this.labelFitsScreen(var1, var2); // L: 21
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1884012486"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0; // L: 33
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "219013919"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) { // L: 37
			return false;
		} else {
			WorldMapElement var3 = class147.WorldMapElement_get(this.getElement()); // L: 38
			int var4 = this.getSubWidth(); // L: 39
			int var5 = this.getSubHeight(); // L: 40
			switch(var3.horizontalAlignment.value) { // L: 41
			case 0:
				if (var1 > this.screenX - var4 && var1 <= this.screenX) { // L: 49
					break;
				}

				return false;
			case 1:
				if (var1 >= this.screenX && var1 < var4 + this.screenX) { // L: 54
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
				if (var2 <= this.screenY - var5 || var2 > this.screenY) { // L: 71
					return false;
				}
				break;
			case 2:
				if (var2 < this.screenY || var2 >= var5 + this.screenY) { // L: 66
					return false;
				}
			}

			return true; // L: 75
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "8"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1900756312"
	)
	static void method5548() {
		class14.method171(24); // L: 2152
		UrlRequest.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 2153
	} // L: 2154

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZS)V",
		garbageValue = "17236"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4632
			byte var2 = 4; // L: 4633
			int var3 = var2 + 6; // L: 4634
			int var4 = var2 + 6; // L: 4635
			int var5 = class302.fontPlain12.lineWidth(var0, 250); // L: 4636
			int var6 = class302.fontPlain12.lineCount(var0, 250) * 13; // L: 4637
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var6 + var2 + var2, 0); // L: 4638
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215); // L: 4639
			class302.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4640
			class11.method108(var3 - var2, var4 - var2, var2 + var5 + var2, var6 + var2 + var2); // L: 4641
			if (var1) { // L: 4642
				class139.rasterProvider.drawFull(0, 0); // L: 4643
			} else {
				class166.method3341(var3, var4, var5, var6); // L: 4646
			}

		}
	} // L: 4648
}
