import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
public class class197 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	static final class197 field2058;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	static final class197 field2052;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	static final class197 field2053;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	static final class197 field2054;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	static final class197 field2057;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	static final class197 field2056;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	static final class197 field2055;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		longValue = -4902417916876254953L
	)
	static long field2059;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive2")
	static Archive archive2;

	static {
		field2058 = new class197(0, class210.field2294); // L: 4
		field2052 = new class197(1, class210.field2297); // L: 5
		field2053 = new class197(2, class210.field2290); // L: 6
		field2054 = new class197(3, class210.field2301); // L: 7
		field2057 = new class197(4, class210.field2300); // L: 8
		field2056 = new class197(5, class210.field2293); // L: 9
		field2055 = new class197(6, class210.field2296); // L: 10
	}

	@ObfuscatedSignature(
		descriptor = "(ILis;)V"
	)
	class197(int var1, class210 var2) {
	} // L: 12

	@ObfuscatedName("am")
	public static int method3772(long var0) {
		return (int)(var0 >>> 7 & 127L); // L: 56
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(Lny;Ljava/lang/String;I)V",
		garbageValue = "1681789978"
	)
	static void method3771(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1447
		Client.archiveLoaders.add(var2); // L: 1448
		Client.field814 += var2.groupCount; // L: 1449
	} // L: 1450

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(Ldx;I)V",
		garbageValue = "-971627157"
	)
	static final void method3773(Actor var0) {
		boolean var1 = var0.field1239 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0; // L: 4423
		if (!var1) { // L: 4424
			SequenceDefinition var2 = class135.SequenceDefinition_get(var0.sequence); // L: 4425
			if (var2 != null && !var2.isCachedModelIdSet()) { // L: 4426
				var1 = var0.sequenceFrameCycle + 1 > var2.frameLengths[var0.sequenceFrame]; // L: 4430
			} else {
				var1 = true; // L: 4427
			}
		}

		if (var1) { // L: 4433
			int var8 = var0.field1239 - var0.spotAnimation; // L: 4434
			int var3 = Client.cycle - var0.spotAnimation; // L: 4435
			int var4 = var0.field1234 * 128 + var0.field1223 * 64; // L: 4436
			int var5 = var0.field1236 * 128 + var0.field1223 * 64; // L: 4437
			int var6 = var0.field1196 * 128 + var0.field1223 * 64; // L: 4438
			int var7 = var0.field1224 * 128 + var0.field1223 * 64; // L: 4439
			var0.x = (var3 * var6 + var4 * (var8 - var3)) / var8; // L: 4440
			var0.y = (var7 * var3 + var5 * (var8 - var3)) / var8; // L: 4441
		}

		var0.field1256 = 0; // L: 4443
		var0.orientation = var0.field1232; // L: 4444
		var0.rotation = var0.orientation; // L: 4445
	} // L: 4446
}
