import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hm")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = -591353031
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -146107061
	)
	final int field2679;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1294860383
	)
	final int field2680;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -266370173
	)
	final int field2678;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2679 = var1; // L: 19
		this.field2680 = var2; // L: 20
		this.field2678 = var3; // L: 21
	} // L: 22

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "1471087645"
	)
	boolean method4450(float var1) {
		return var1 >= (float)this.field2678; // L: 25
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhm;",
		garbageValue = "1555481893"
	)
	static WorldMapLabelSize[] method4455() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_medium, WorldMapLabelSize_small, WorldMapLabelSize_large}; // L: 15
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1503008254"
	)
	public static int method4459(int var0) {
		return class402.field4447[var0 & 16383]; // L: 37
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2090272148"
	)
	static final void method4449(String var0) {
		class4.method20(var0 + " is already on your friend list"); // L: 113
	} // L: 114

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-1000138777"
	)
	static int method4451(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget; // L: 1210
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1211
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.itemId; // L: 1212
			return 1; // L: 1213
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1215
			if (var3.itemId != -1) { // L: 1216
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 1217
			}

			return 1; // L: 1218
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1220
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1221
			return 1; // L: 1222
		} else if (var0 == 1707) { // L: 1224
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.method5562() ? 1 : 0; // L: 1225
			return 1; // L: 1226
		} else if (var0 == 1708) { // L: 1228
			return class154.method3103(var3); // L: 1229
		} else {
			return var0 == 1709 ? AttackOption.method2360(var3) : 2; // L: 1231 1232 1234
		}
	}
}
