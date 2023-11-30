import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ch")
public class class72 {
	@ObfuscatedName("ab")
	static final BigInteger field870;
	@ObfuscatedName("au")
	static final BigInteger field871;

	static {
		field870 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049"); // L: 20
		field871 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"); // L: 21
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lep;",
		garbageValue = "1917414227"
	)
	static class129 method2135(int var0) {
		class129[] var1 = new class129[]{class129.field1513, class129.field1514, class129.field1512, class129.field1518, class129.field1510}; // L: 138
		class129 var2 = (class129)class12.findEnumerated(var1, var0); // L: 140
		if (var2 == null) { // L: 141
			var2 = class129.field1513;
		}

		return var2; // L: 142
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public static void method2136() {
		class182.field1885.clear(); // L: 14
	} // L: 15

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lol;IS)V",
		garbageValue = "-25767"
	)
	public static void method2137(AbstractArchive var0, int var1) {
		if (!class316.field3424.isEmpty()) { // L: 148
			ArrayList var2 = new ArrayList(); // L: 151
			Iterator var3 = class316.field3424.iterator(); // L: 152

			while (var3.hasNext()) {
				class328 var4 = (class328)var3.next(); // L: 153
				var4.field3524 = false; // L: 155
				var4.field3536 = false; // L: 156
				var4.field3530 = false; // L: 157
				var4.field3526 = false; // L: 158
				var4.field3535 = var0; // L: 159
				var4.field3525 = var1; // L: 160
				var4.field3528 = 0.0F; // L: 161
				var2.add(var4); // L: 162
			}

			PendingSpawn.method2459(var2, class316.field3421, class316.field3418, class316.field3419, class316.field3417, false); // L: 165
		}
	} // L: 149 166

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1084979795"
	)
	static int method2138(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 4362
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.getWindowedMode(); // L: 4363
			return 1; // L: 4364
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 4366
				var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4367
				if (var3 == 1 || var3 == 2) { // L: 4368
					class9.setWindowedMode(var3);
				}

				return 1; // L: 4369
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 4371
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = WorldMapIcon_1.clientPreferences.method2564(); // L: 4372
				return 1; // L: 4373
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 4375
				if (var0 == 5310) { // L: 4382
					--class517.Interpreter_intStackSize; // L: 4383
					return 1; // L: 4384
				} else {
					return 2; // L: 4386
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4376
				if (var3 == 1 || var3 == 2) { // L: 4377
					WorldMapIcon_1.clientPreferences.method2563(var3); // L: 4378
				}

				return 1; // L: 4380
			}
		}
	}
}
