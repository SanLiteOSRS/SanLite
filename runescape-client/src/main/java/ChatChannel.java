import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bi")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Lbb;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 639141811
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 78
	} // L: 81

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbb;",
		garbageValue = "73"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99]; // L: 84

		for (int var6 = this.count; var6 > 0; --var6) { // L: 85
			if (var6 != 100) { // L: 86
				this.messages[var6] = this.messages[var6 - 1]; // L: 87
			}
		}

		if (var5 == null) { // L: 89
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove(); // L: 91
			var5.removeDual(); // L: 92
			var5.set(var1, var2, var4, var3); // L: 93
		}

		this.messages[0] = var5; // L: 95
		if (this.count < 100) { // L: 96
			++this.count;
		}

		return var5; // L: 97
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lbb;",
		garbageValue = "1075069300"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 101 102
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1590892673"
	)
	@Export("size")
	int size() {
		return this.count; // L: 106
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-1255212161"
	)
	static char method1958(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0; // L: 61 62
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "89"
	)
	static int method1964(int var0, Script var1, boolean var2) {
		Widget var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 1352
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1353
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1354
			return 1; // L: 1355
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1357
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1358
			return 1; // L: 1359
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1361
			Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3.text; // L: 1362
			return 1; // L: 1363
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1365
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1366
			return 1; // L: 1367
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1369
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1370
			return 1; // L: 1371
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1373
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1374
			return 1; // L: 1375
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1377
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1378
			return 1; // L: 1379
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1381
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1382
			return 1; // L: 1383
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1385
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1386
			return 1; // L: 1387
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1389
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1390
			return 1; // L: 1391
		} else if (var0 == 2610) { // L: 1393
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1394
			return 1; // L: 1395
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1397
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.color; // L: 1398
			return 1; // L: 1399
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1401
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.color2; // L: 1402
			return 1; // L: 1403
		} else if (var0 == 2613) { // L: 1405
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1406
			return 1; // L: 1407
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1409
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1410
			return 1; // L: 1411
		} else if (var0 != 2615 && var0 != 2616) { // L: 1413
			return 2; // L: 1417
		} else {
			++Nameable.Interpreter_intStackSize; // L: 1414
			return 1; // L: 1415
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "1547645670"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		CollisionMap.method3809(var0, var1, var2, var3, var4, var5, -1, false); // L: 9388
	} // L: 9389
}
