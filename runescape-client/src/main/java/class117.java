import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
public class class117 implements MouseWheel {
	@ObfuscatedName("sx")
	@ObfuscatedGetter(
		intValue = -1106281963
	)
	static int field1433;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	static final class117 field1425;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	static final class117 field1444;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	static final class117 field1430;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	static final class117 field1427;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	static final class117 field1428;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	static final class117 field1429;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	static final class117 field1442;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	static final class117 field1431;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	static final class117 field1432;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	static final class117 field1424;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	static final class117 field1434;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	static final class117 field1435;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	static final class117 field1436;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	static final class117 field1437;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	static final class117 field1438;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	static final class117 field1439;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	static final class117 field1440;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1755047429
	)
	final int field1441;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -438304939
	)
	final int field1426;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 614342417
	)
	final int field1443;

	static {
		field1425 = new class117(0, 0, (String)null, -1, -1);
		field1444 = new class117(1, 1, (String)null, 0, 2);
		field1430 = new class117(2, 2, (String)null, 1, 2);
		field1427 = new class117(3, 3, (String)null, 2, 2);
		field1428 = new class117(4, 4, (String)null, 3, 1);
		field1429 = new class117(5, 5, (String)null, 4, 1);
		field1442 = new class117(6, 6, (String)null, 5, 1);
		field1431 = new class117(7, 7, (String)null, 6, 3);
		field1432 = new class117(8, 8, (String)null, 7, 3);
		field1424 = new class117(9, 9, (String)null, 8, 3);
		field1434 = new class117(10, 10, (String)null, 0, 7);
		field1435 = new class117(11, 11, (String)null, 1, 7);
		field1436 = new class117(12, 12, (String)null, 2, 7);
		field1437 = new class117(13, 13, (String)null, 3, 7);
		field1438 = new class117(14, 14, (String)null, 4, 7);
		field1439 = new class117(15, 15, (String)null, 5, 7);
		field1440 = new class117(16, 16, (String)null, 0, 5);
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class117(int var1, int var2, String var3, int var4, int var5) {
		this.field1441 = var1;
		this.field1426 = var2;
		this.field1443 = var4;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1426;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-202233185"
	)
	int method2674() {
		return this.field1443;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "8"
	)
	public static boolean method2676(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field130[var0] : false;
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static final void method2682() {
		if (class121.field1470) {
			for (int var0 = 0; var0 < Players.Players_count; ++var0) {
				Player var1 = Client.players[Players.Players_indices[var0]];
				var1.method2186();
			}

			class121.field1470 = false;
		}

	}
}
