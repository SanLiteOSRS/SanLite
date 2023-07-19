import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1843995115
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -898755973
	)
	@Export("element")
	int element;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1613568489
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1872849949
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lmk;Lmk;ILjj;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2); // L: 17
		this.objectDefId = var3; // L: 18
		this.region = var4; // L: 19
		this.init(); // L: 20
	} // L: 21

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2008738009"
	)
	@Export("init")
	void init() {
		this.element = Language.getObjectDefinition(this.objectDefId).transform().mapIconId; // L: 24
		this.label = this.region.createMapLabel(class127.WorldMapElement_get(this.element)); // L: 25
		WorldMapElement var1 = class127.WorldMapElement_get(this.getElement()); // L: 26
		SpritePixels var2 = var1.getSpriteBool(false); // L: 27
		if (var2 != null) { // L: 28
			this.subWidth = var2.subWidth; // L: 29
			this.subHeight = var2.subHeight; // L: 30
		} else {
			this.subWidth = 0; // L: 33
			this.subHeight = 0; // L: 34
		}

	} // L: 36

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1344079947"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 40
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lkc;",
		garbageValue = "-248484486"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 45
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1481600529"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 50
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-33"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 55
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1936961381"
	)
	static void method5152() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear(); // L: 47
	} // L: 48
}
