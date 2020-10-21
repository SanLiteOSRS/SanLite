import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bs")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1658510555
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 537531937
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -451639577
	)
	@Export("type")
	int type;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -805517653
	)
	@Export("x")
	int x;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 309622261
	)
	@Export("y")
	int y;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1728058903
	)
	int field960;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -629147525
	)
	int field961;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -922964443
	)
	@Export("id")
	int id;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1252885215
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -743478207
	)
	int field964;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1560488333
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1735849843
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.delay = 0;
		this.hitpoints = -1;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "681625855"
	)
	static final int method1795(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(ILcy;ZB)I",
		garbageValue = "1"
	)
	static int method1794(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Canvas.field438 : class3.field12;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.method176(WorldMapIcon_0.getWidgetClickMask(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}
}
