import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -424537003
	)
	static int field2916;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 272253257
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1088150255
	)
	@Export("element")
	int element;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 78742619
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -338644775
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lmo;Lmo;ILke;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2); // L: 17
		this.objectDefId = var3; // L: 18
		this.region = var4; // L: 19
		this.init(); // L: 20
	} // L: 21

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-19"
	)
	@Export("init")
	void init() {
		this.element = class91.getObjectDefinition(this.objectDefId).transform().mapIconId; // L: 24
		this.label = this.region.createMapLabel(class148.WorldMapElement_get(this.element)); // L: 25
		WorldMapElement var1 = class148.WorldMapElement_get(this.getElement()); // L: 26
		SpritePixels var2 = var1.getSpriteBool(false); // L: 27
		if (var2 != null) { // L: 28
			this.subWidth = var2.subWidth; // L: 29
			this.subHeight = var2.subHeight; // L: 30
		} else {
			this.subWidth = 0; // L: 33
			this.subHeight = 0; // L: 34
		}

	} // L: 36

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1637535390"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Lkd;",
		garbageValue = "5"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 45
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "65"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 50
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1338001743"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 55
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lmh;I)V",
		garbageValue = "-866715691"
	)
	public static void method5236(class325 var0) {
		if (!class319.field3434.contains(var0)) { // L: 37
			class319.field3434.add(var0); // L: 38
		}

	} // L: 40
}
