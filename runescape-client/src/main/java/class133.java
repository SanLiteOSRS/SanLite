import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class133 implements class383 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class133 field1575;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class133 field1559;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class133 field1568;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class133 field1579;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class133 field1562;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class133 field1560;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class133 field1564;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class133 field1565;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class133 field1566;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class133 field1567;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class133 field1563;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class133 field1573;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class133 field1570;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class133 field1571;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class133 field1572;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class133 field1561;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class133 field1569;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 334167201
	)
	final int field1574;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -956935297
	)
	final int field1576;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 636962001
	)
	final int field1577;

	static {
		field1575 = new class133(0, 0, (String)null, -1, -1); // L: 46
		field1559 = new class133(1, 1, (String)null, 0, 2); // L: 47
		field1568 = new class133(2, 2, (String)null, 1, 2); // L: 48
		field1579 = new class133(3, 3, (String)null, 2, 2); // L: 49
		field1562 = new class133(4, 4, (String)null, 3, 1); // L: 50
		field1560 = new class133(5, 5, (String)null, 4, 1); // L: 51
		field1564 = new class133(6, 6, (String)null, 5, 1); // L: 52
		field1565 = new class133(7, 7, (String)null, 6, 3); // L: 53
		field1566 = new class133(8, 8, (String)null, 7, 3); // L: 54
		field1567 = new class133(9, 9, (String)null, 8, 3); // L: 55
		field1563 = new class133(10, 10, (String)null, 0, 7); // L: 56
		field1573 = new class133(11, 11, (String)null, 1, 7); // L: 57
		field1570 = new class133(12, 12, (String)null, 2, 7); // L: 58
		field1571 = new class133(13, 13, (String)null, 3, 7); // L: 59
		field1572 = new class133(14, 14, (String)null, 4, 7); // L: 60
		field1561 = new class133(15, 15, (String)null, 5, 7); // L: 61
		field1569 = new class133(16, 16, (String)null, 0, 5); // L: 62
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class133(int var1, int var2, String var3, int var4, int var5) {
		this.field1574 = var1; // L: 68
		this.field1576 = var2; // L: 69
		this.field1577 = var4; // L: 70
	} // L: 71

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2145781629"
	)
	int method3140() {
		return this.field1577; // L: 78
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1576; // L: 74
	}
}
