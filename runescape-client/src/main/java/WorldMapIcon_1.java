import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jg")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("us")
	@ObfuscatedGetter(
		intValue = -438679936
	)
	static int field2870;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1809018999
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 708898903
	)
	@Export("element")
	int element;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -94495923
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 163787557
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lmr;Lmr;ILjv;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2); // L: 17
		this.objectDefId = var3; // L: 18
		this.region = var4; // L: 19
		this.init(); // L: 20
	} // L: 21

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1295582280"
	)
	@Export("init")
	void init() {
		this.element = class90.getObjectDefinition(this.objectDefId).transform().mapIconId; // L: 24
		this.label = this.region.createMapLabel(SequenceDefinition.WorldMapElement_get(this.element)); // L: 25
		WorldMapElement var1 = SequenceDefinition.WorldMapElement_get(this.getElement()); // L: 26
		SpritePixels var2 = var1.getSpriteBool(false); // L: 27
		if (var2 != null) { // L: 28
			this.subWidth = var2.subWidth; // L: 29
			this.subHeight = var2.subHeight; // L: 30
		} else {
			this.subWidth = 0; // L: 33
			this.subHeight = 0; // L: 34
		}

	} // L: 36

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1799088869"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 40
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)Lka;",
		garbageValue = "8220"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 45
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "81"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 50
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-565304787"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 55
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-2050409235"
	)
	static int method5097(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class36.scriptDotWidget : class351.field3896; // L: 1569
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1570
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class273.Widget_unpackTargetMask(UserComparator8.getWidgetFlags(var3)); // L: 1571
			return 1; // L: 1572
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1574
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1581
				if (var3.dataText == null) { // L: 1582
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1583
				}

				return 1; // L: 1584
			} else {
				return 2; // L: 1586
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1575
			--var4; // L: 1576
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1577
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1578
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1579
		}
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "650679453"
	)
	static boolean method5108() {
		return (Client.drawPlayerNames & 1) != 0; // L: 5135
	}
}
