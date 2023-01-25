import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("iu")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1092602777
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -939702515
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1065150765
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 346902175
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 337769061
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1809147725
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -651808565
	)
	int field2845;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -957154991
	)
	int field2844;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -394773385
	)
	int field2841;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 403564879
	)
	int field2848;

	WorldMapSection2() {
	} // L: 18

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lit;B)V",
		garbageValue = "86"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2845) { // L: 22
			var1.regionLowX = this.field2845;
		}

		if (var1.regionHighX < this.field2841) {
			var1.regionHighX = this.field2841; // L: 23
		}

		if (var1.regionLowY > this.field2844) { // L: 24
			var1.regionLowY = this.field2844;
		}

		if (var1.regionHighY < this.field2848) { // L: 25
			var1.regionHighY = this.field2848;
		}

	} // L: 26

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "986597458"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) { // L: 30
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIS)Z",
		garbageValue = "-11823"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2845 && var1 >> 6 <= this.field2841 && var2 >> 6 >= this.field2844 && var2 >> 6 <= this.field2848; // L: 38
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-52"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{this.field2845 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2844 * 64 - this.regionStartY * 64)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)Lky;",
		garbageValue = "1584933614"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.regionStartX * 64 - this.field2845 * 64 + var1; // L: 57
			int var4 = this.regionStartY * 64 - this.field2844 * 64 + var2; // L: 58
			return new Coord(this.minPlane, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "1737950913"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 64
		this.planes = var1.readUnsignedByte(); // L: 65
		this.regionStartX = var1.readUnsignedShort(); // L: 66
		this.regionStartY = var1.readUnsignedShort(); // L: 67
		this.regionEndX = var1.readUnsignedShort(); // L: 68
		this.regionEndY = var1.readUnsignedShort(); // L: 69
		this.field2845 = var1.readUnsignedShort(); // L: 70
		this.field2844 = var1.readUnsignedShort(); // L: 71
		this.field2841 = var1.readUnsignedShort(); // L: 72
		this.field2848 = var1.readUnsignedShort(); // L: 73
		this.postRead(); // L: 74
	} // L: 75

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("postRead")
	void postRead() {
	} // L: 77

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1114752689"
	)
	public static boolean method4907(int var0) {
		return (var0 >> 30 & 1) != 0; // L: 21
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "-1887108041"
	)
	static int method4905(int var0, Script var1, boolean var2) {
		Widget var3 = class175.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 1828
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1829
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = PacketWriter.Widget_unpackTargetMask(Clock.getWidgetFlags(var3)); // L: 1830
			return 1; // L: 1831
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1833
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1840
				if (var3.dataText == null) { // L: 1841
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1842
				}

				return 1; // L: 1843
			} else {
				return 2; // L: 1845
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 1834
			--var4; // L: 1835
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1836
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1837
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1838
		}
	}
}
