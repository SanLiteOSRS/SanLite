import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("ax")
	public static short[] field2956;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1767565411
	)
	@Export("element")
	final int element;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1314083237
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1694335235
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Llb;Llb;ILku;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2); // L: 14
		this.element = var3; // L: 15
		this.label = var4; // L: 16
		WorldMapElement var5 = class354.WorldMapElement_get(this.getElement()); // L: 17
		SpritePixels var6 = var5.getSpriteBool(false); // L: 18
		if (var6 != null) { // L: 19
			this.subWidth = var6.subWidth; // L: 20
			this.subHeight = var6.subHeight; // L: 21
		} else {
			this.subWidth = 0; // L: 24
			this.subHeight = 0; // L: 25
		}

	} // L: 27

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1645421540"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 31
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lku;",
		garbageValue = "-2043987595"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 36
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1623088499"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 41
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "435365367"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 46
	}
}
