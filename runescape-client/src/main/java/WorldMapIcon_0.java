import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 682025441
	)
	@Export("element")
	final int element;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1813509073
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1064337023
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Llt;Llt;ILjb;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2); // L: 14
		this.element = var3; // L: 15
		this.label = var4; // L: 16
		WorldMapElement var5 = class123.WorldMapElement_get(this.getElement()); // L: 17
		SpritePixels var6 = var5.getSpriteBool(false); // L: 18
		if (var6 != null) { // L: 19
			this.subWidth = var6.subWidth; // L: 20
			this.subHeight = var6.subHeight; // L: 21
		} else {
			this.subWidth = 0; // L: 24
			this.subHeight = 0; // L: 25
		}

	} // L: 27

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-81"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 31
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljb;",
		garbageValue = "-166366580"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 36
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "638535000"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 41
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "36"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 46
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZI)I",
		garbageValue = "-169498723"
	)
	static int method5159(int var0, Script var1, boolean var2) {
		return 2; // L: 5039
	}
}
