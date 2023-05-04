import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -707716855
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -362754265
	)
	@Export("element")
	int element;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -756068071
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1550869583
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Llb;Llb;ILjr;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2); // L: 17
		this.objectDefId = var3; // L: 18
		this.region = var4; // L: 19
		this.init(); // L: 20
	} // L: 21

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1844375559"
	)
	@Export("init")
	void init() {
		this.element = class144.getObjectDefinition(this.objectDefId).transform().mapIconId; // L: 24
		this.label = this.region.createMapLabel(class354.WorldMapElement_get(this.element)); // L: 25
		WorldMapElement var1 = class354.WorldMapElement_get(this.getElement()); // L: 26
		SpritePixels var2 = var1.getSpriteBool(false); // L: 27
		if (var2 != null) { // L: 28
			this.subWidth = var2.subWidth; // L: 29
			this.subHeight = var2.subHeight; // L: 30
		} else {
			this.subWidth = 0; // L: 33
			this.subHeight = 0; // L: 34
		}

	} // L: 36

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1645421540"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 40
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lku;",
		garbageValue = "-2043987595"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 45
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1623088499"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 50
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "435365367"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 55
	}
}
