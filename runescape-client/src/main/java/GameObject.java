import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hs")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("vg")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("dv")
	static boolean field2733;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1345253947
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1315903907
	)
	@Export("z")
	int z;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1038617169
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -2072639915
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -40540361
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 2020879011
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 446674919
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1537502895
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 73378603
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 901536547
	)
	int field2737;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 529946671
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = -7922081182251728711L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1855102213
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L; // L: 16
		this.flags = 0; // L: 17
	} // L: 19

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "2067332128"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I[B[BI)V",
		garbageValue = "1711616226"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3562 == null) { // L: 1180
			if (var2 == null) { // L: 1181
				return; // L: 1187
			}

			var0.field3562 = new byte[11][]; // L: 1182
			var0.field3563 = new byte[11][]; // L: 1183
			var0.field3611 = new int[11]; // L: 1184
			var0.field3565 = new int[11]; // L: 1185
		}

		var0.field3562[var1] = var2; // L: 1189
		if (var2 != null) {
			var0.field3561 = true; // L: 1190
		} else {
			var0.field3561 = false; // L: 1192

			for (int var4 = 0; var4 < var0.field3562.length; ++var4) { // L: 1193
				if (var0.field3562[var4] != null) { // L: 1194
					var0.field3561 = true; // L: 1195
					break;
				}
			}
		}

		var0.field3563[var1] = var3; // L: 1200
	} // L: 1201

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-2089814826"
	)
	static int method4663(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class140.scriptDotWidget : class136.field1589; // L: 1305
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1306
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.x; // L: 1307
			return 1; // L: 1308
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1310
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.y; // L: 1311
			return 1; // L: 1312
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1314
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.width; // L: 1315
			return 1; // L: 1316
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1318
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.height; // L: 1319
			return 1; // L: 1320
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1322
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1323
			return 1; // L: 1324
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1326
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.parentId; // L: 1327
			return 1; // L: 1328
		} else {
			return 2; // L: 1330
		}
	}
}
