import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bp")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("s")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("h")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor(); // L: 10
		this.future = this.executor.submit(new SecureRandomCallable()); // L: 14
	} // L: 15

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-35"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown(); // L: 18
		this.executor = null; // L: 19
	} // L: 20

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1809149421"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone(); // L: 23
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/security/SecureRandom;",
		garbageValue = "1001"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get(); // L: 28
		} catch (Exception var2) { // L: 30
			return Script.method1936(); // L: 31
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "1497596653"
	)
	static int method1932(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget; // L: 1259
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1260
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = ModeWhere.Widget_unpackTargetMask(class193.getWidgetFlags(var3)); // L: 1261
			return 1; // L: 1262
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1264
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1271
				if (var3.dataText == null) { // L: 1272
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1273
				}

				return 1; // L: 1274
			} else {
				return 2; // L: 1276
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 1265
			--var4; // L: 1266
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1267
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1268
			} else {
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1269
		}
	}
}
