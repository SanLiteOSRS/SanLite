import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dc")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2077563345
	)
	static int field1011;

	SecureRandomCallable() {
	} // L: 36

	public Object call() {
		return class392.method7406(); // L: 46
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lcv;",
		garbageValue = "-447418058"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class167.archive12.takeFile(var0, 0); // L: 28
			if (var2 == null) { // L: 29
				return null; // L: 30
			} else {
				var1 = class4.newScript(var2); // L: 32
				Script.Script_cached.put(var1, (long)var0); // L: 33
				return var1; // L: 34
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "-17500"
	)
	static int method2220(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 14
		if (var2 == null) { // L: 15
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1; // L: 16 17
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lsh;",
		garbageValue = "1556690357"
	)
	public static class472 method2223(int var0) {
		class472 var1 = (class472)class472.DBRowType_cache.get((long)var0); // L: 20
		if (var1 != null) { // L: 21
			return var1;
		} else {
			byte[] var2 = class472.field4881.takeFile(38, var0); // L: 22
			var1 = new class472(); // L: 23
			if (var2 != null) { // L: 24
				var1.method8519(new Buffer(var2));
			}

			var1.method8524(); // L: 25
			class472.DBRowType_cache.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2055202439"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 48
		return var1 == null ? 0 : var1.size(); // L: 49 50
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZI)I",
		garbageValue = "-1440847049"
	)
	static int method2229(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? GameObject.scriptDotWidget : SoundSystem.field319; // L: 1543
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1544
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapDecorationType.Widget_unpackTargetMask(ParamComposition.getWidgetFlags(var3)); // L: 1545
			return 1; // L: 1546
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1548
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1555
				if (var3.dataText == null) { // L: 1556
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1557
				}

				return 1; // L: 1558
			} else {
				return 2; // L: 1560
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1549
			--var4; // L: 1550
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1551
				Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1552
			} else {
				Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1553
		}
	}
}
