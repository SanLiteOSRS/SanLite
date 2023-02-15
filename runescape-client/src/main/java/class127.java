import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
public class class127 implements class349 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static final class127 field1566;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static final class127 field1559;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static final class127 field1568;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static final class127 field1560;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static final class127 field1562;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static final class127 field1578;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static final class127 field1564;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static final class127 field1565;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static final class127 field1561;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static final class127 field1567;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static final class127 field1563;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static final class127 field1569;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static final class127 field1570;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static final class127 field1571;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static final class127 field1572;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static final class127 field1573;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static final class127 field1574;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1659069287
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 501208477
	)
	final int field1575;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 954569001
	)
	final int field1576;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -562475213
	)
	final int field1577;

	static {
		field1566 = new class127(0, 0, (String)null, -1, -1); // L: 42
		field1559 = new class127(1, 1, (String)null, 0, 2); // L: 43
		field1568 = new class127(2, 2, (String)null, 1, 2); // L: 44
		field1560 = new class127(3, 3, (String)null, 2, 2); // L: 45
		field1562 = new class127(4, 4, (String)null, 3, 1); // L: 46
		field1578 = new class127(5, 5, (String)null, 4, 1); // L: 47
		field1564 = new class127(6, 6, (String)null, 5, 1); // L: 48
		field1565 = new class127(7, 7, (String)null, 6, 3); // L: 49
		field1561 = new class127(8, 8, (String)null, 7, 3); // L: 50
		field1567 = new class127(9, 9, (String)null, 8, 3); // L: 51
		field1563 = new class127(10, 10, (String)null, 0, 7); // L: 52
		field1569 = new class127(11, 11, (String)null, 1, 7); // L: 53
		field1570 = new class127(12, 12, (String)null, 2, 7); // L: 54
		field1571 = new class127(13, 13, (String)null, 3, 7); // L: 55
		field1572 = new class127(14, 14, (String)null, 4, 7); // L: 56
		field1573 = new class127(15, 15, (String)null, 5, 7); // L: 57
		field1574 = new class127(16, 16, (String)null, 0, 5); // L: 58
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class127(int var1, int var2, String var3, int var4, int var5) {
		this.field1575 = var1; // L: 68
		this.field1576 = var2; // L: 69
		this.field1577 = var4; // L: 70
	} // L: 71

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1576; // L: 74
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "608537711"
	)
	int method3076() {
		return this.field1577; // L: 78
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lrd;Lqu;S)Lqu;",
		garbageValue = "640"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) { // L: 17
			var3 = class4.method21(var2); // L: 18
			var1 = new IterableNodeHashTable(var3); // L: 19
		}

		for (var3 = 0; var3 < var2; ++var3) { // L: 21
			boolean var4 = var0.readUnsignedByte() == 1; // L: 22
			int var5 = var0.readMedium(); // L: 23
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated()); // L: 25
			} else {
				var6 = new IntegerNode(var0.readInt()); // L: 26
			}

			var1.put((Node)var6, (long)var5); // L: 27
		}

		return var1; // L: 29
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1463549710"
	)
	static final void method3082() {
		boolean var0 = false; // L: 10404

		while (!var0) { // L: 10405
			var0 = true; // L: 10406

			for (int var1 = 0; var1 < Client.menuOptionsCount - 1; ++var1) { // L: 10407
				if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) { // L: 10408
					String var2 = Client.menuTargets[var1]; // L: 10409
					Client.menuTargets[var1] = Client.menuTargets[var1 + 1]; // L: 10410
					Client.menuTargets[var1 + 1] = var2; // L: 10411
					String var3 = Client.menuActions[var1]; // L: 10412
					Client.menuActions[var1] = Client.menuActions[var1 + 1]; // L: 10413
					Client.menuActions[var1 + 1] = var3; // L: 10414
					int var4 = Client.menuOpcodes[var1]; // L: 10415
					Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1]; // L: 10416
					Client.menuOpcodes[var1 + 1] = var4; // L: 10417
					var4 = Client.menuArguments1[var1]; // L: 10418
					Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1]; // L: 10419
					Client.menuArguments1[var1 + 1] = var4; // L: 10420
					var4 = Client.menuArguments2[var1]; // L: 10421
					Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1]; // L: 10422
					Client.menuArguments2[var1 + 1] = var4; // L: 10423
					var4 = Client.menuIdentifiers[var1]; // L: 10424
					Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1]; // L: 10425
					Client.menuIdentifiers[var1 + 1] = var4; // L: 10426
					var4 = Client.field655[var1]; // L: 10427
					Client.field655[var1] = Client.field655[var1 + 1]; // L: 10428
					Client.field655[var1 + 1] = var4; // L: 10429
					boolean var5 = Client.menuShiftClick[var1]; // L: 10430
					Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1]; // L: 10431
					Client.menuShiftClick[var1 + 1] = var5; // L: 10432
					var0 = false; // L: 10433
				}
			}
		}

	} // L: 10437
}
