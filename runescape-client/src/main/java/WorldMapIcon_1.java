import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -887698533
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1970765317
	)
	@Export("element")
	int element;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -609134761
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1799535623
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lie;Lie;ILfk;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1060359040"
	)
	@Export("init")
	void init() {
		this.element = KitDefinition.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(ItemComposition.WorldMapElement_get(this.element));
		WorldMapElement var1 = ItemComposition.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1660589105"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Lga;",
		garbageValue = "0"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "374350712"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1569056170"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}
}
