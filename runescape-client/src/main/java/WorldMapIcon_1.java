import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("wt")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 819296275
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -949927081
	)
	@Export("element")
	int element;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2079223453
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 331046403
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lmh;Lmh;ILjl;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2); // L: 17
		this.objectDefId = var3; // L: 18
		this.region = var4; // L: 19
		this.init(); // L: 20
	} // L: 21

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-450829681"
	)
	@Export("init")
	void init() {
		this.element = WorldMapSection2.getObjectDefinition(this.objectDefId).transform().mapIconId; // L: 24
		this.label = this.region.createMapLabel(class141.WorldMapElement_get(this.element)); // L: 25
		WorldMapElement var1 = class141.WorldMapElement_get(this.getElement()); // L: 26
		SpritePixels var2 = var1.getSpriteBool(false); // L: 27
		if (var2 != null) { // L: 28
			this.subWidth = var2.subWidth; // L: 29
			this.subHeight = var2.subHeight; // L: 30
		} else {
			this.subWidth = 0; // L: 33
			this.subHeight = 0; // L: 34
		}

	} // L: 36

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "574784276"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 40
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Ljk;",
		garbageValue = "-49"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 45
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "472460923"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 50
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-653051141"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 55
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-26"
	)
	static void method4514(int var0) {
		Client.titleLoadingStage = var0; // L: 12883
	} // L: 12884
}
