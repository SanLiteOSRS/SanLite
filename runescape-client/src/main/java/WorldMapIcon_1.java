import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2085532593
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -204262685
	)
	@Export("element")
	int element;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1397963449
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1893994907
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lnn;Lnn;ILkr;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2); // L: 17
		this.objectDefId = var3; // L: 18
		this.region = var4; // L: 19
		this.init(); // L: 20
	} // L: 21

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1169709590"
	)
	@Export("init")
	void init() {
		this.element = MouseRecorder.getObjectDefinition(this.objectDefId).transform().mapIconId; // L: 24
		this.label = this.region.createMapLabel(class340.WorldMapElement_get(this.element)); // L: 25
		WorldMapElement var1 = class340.WorldMapElement_get(this.getElement()); // L: 26
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
		garbageValue = "-1650655075"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 40
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lkz;",
		garbageValue = "-2083618685"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 45
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "139624089"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 50
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1778353617"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 55
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-996049144"
	)
	static int method5262(int var0, Script var1, boolean var2) {
		if (var0 == 6809) { // L: 5142
			int var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 5143
			ObjectComposition var4 = MouseRecorder.getObjectDefinition(var3); // L: 5144
			Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 5145
			return 1; // L: 5146
		} else {
			return 2; // L: 5148
		}
	}
}
