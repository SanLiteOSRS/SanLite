import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ei")
public class class105 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	static final class105 field1359;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	static final class105 field1358;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	static final class105 field1347;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	static final class105 field1354;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	static final class105 field1349;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	static final class105 field1350;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	static final class105 field1355;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	static final class105 field1360;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	static final class105 field1353;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	static final class105 field1345;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	static final class105 field1348;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	static final class105 field1356;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	static final class105 field1357;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	static final class105 field1351;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -2006504803
	)
	int field1352;

	static {
		field1359 = new class105(0); // L: 2231
		field1358 = new class105(1); // L: 2232
		field1347 = new class105(2); // L: 2233
		field1354 = new class105(3); // L: 2234
		field1349 = new class105(4); // L: 2235
		field1350 = new class105(5); // L: 2236
		field1355 = new class105(6); // L: 2237
		field1360 = new class105(7); // L: 2238
		field1353 = new class105(8); // L: 2239
		field1345 = new class105(9); // L: 2240
		field1348 = new class105(10); // L: 2241
		field1356 = new class105(11); // L: 2242
		field1357 = new class105(12); // L: 2243
		field1351 = new class105(13); // L: 2244
	}

	class105(int var1) {
		this.field1352 = var1; // L: 2248
	} // L: 2249

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZB)I",
		garbageValue = "-35"
	)
	static int method2691(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 4303
			Interpreter.Interpreter_intStackSize -= 2; // L: 4304
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4305
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4306
			if (!Client.isCameraLocked) { // L: 4307
				Client.camAngleX = var3; // L: 4308
				Client.camAngleY = var4; // L: 4309
			}

			return 1; // L: 4311
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 4313
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 4314
			return 1; // L: 4315
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 4317
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 4318
			return 1; // L: 4319
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 4321
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4322
			if (var3 < 0) { // L: 4323
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 4324
			return 1; // L: 4325
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 4327
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 4328
			return 1; // L: 4329
		} else {
			return 2; // L: 4331
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1729736934"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 601
		if (class135.garbageCollector == null || !class135.garbageCollector.isValid()) { // L: 602
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 604

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 605
					if (var2.isValid()) { // L: 607
						class135.garbageCollector = var2; // L: 608
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 609
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 610
					}
				}
			} catch (Throwable var11) { // L: 615
			}
		}

		if (class135.garbageCollector != null) { // L: 617
			long var9 = WorldMapSection2.method4844(); // L: 618
			long var3 = class135.garbageCollector.getCollectionTime(); // L: 619
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) { // L: 620
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 621
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 622
				if (var7 != 0L) { // L: 623
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 625
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 626
		}

		return var0; // L: 628
	}
}
