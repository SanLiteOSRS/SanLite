import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -753712769
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2021484941
	)
	@Export("element")
	int element;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1567556681
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1291079453
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lmg;Lmg;ILjm;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3; // L: 18
		this.region = var4; // L: 19
		this.init(); // L: 20
	} // L: 21

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1681614322"
	)
	@Export("init")
	void init() {
		this.element = class175.getObjectDefinition(this.objectDefId).transform().mapIconId; // L: 24
		this.label = this.region.createMapLabel(class147.WorldMapElement_get(this.element)); // L: 25
		WorldMapElement var1 = class147.WorldMapElement_get(this.getElement()); // L: 26
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
		garbageValue = "1551656659"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 40
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lks;",
		garbageValue = "1263568545"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 45
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-44"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 50
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-96"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 55
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "15"
	)
	static int method5081(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 14
		if (var2 == null) { // L: 15
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1; // L: 16 17
		}
	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "373970265"
	)
	static void method5068(int var0) {
		SequenceDefinition var1 = WorldMapLabelSize.SequenceDefinition_get(var0); // L: 12809
		if (var1.isCachedModelIdSet()) { // L: 12810
			int var3 = var1.SequenceDefinition_cachedModelId; // L: 12814
			class136 var4 = HealthBar.method2553(var3); // L: 12816
			int var2;
			if (var4 == null) { // L: 12817
				var2 = 2; // L: 12818
			} else {
				var2 = var4.method3051() ? 0 : 1; // L: 12821
			}

			if (var2 == 2) { // L: 12823
				Client.field800.add(var1.SequenceDefinition_cachedModelId); // L: 12824
			}

		}
	} // L: 12811 12826
}
