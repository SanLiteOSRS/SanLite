import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class132 implements class371 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class132 field1581;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class132 field1582;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class132 field1564;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class132 field1565;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class132 field1569;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class132 field1567;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class132 field1568;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class132 field1572;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class132 field1563;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class132 field1571;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class132 field1562;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class132 field1573;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class132 field1574;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class132 field1575;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class132 field1576;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class132 field1577;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class132 field1578;
	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	static Fonts field1580;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 302418989
	)
	final int field1579;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 297493853
	)
	final int field1566;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1644716683
	)
	final int field1570;

	static {
		field1581 = new class132(0, 0, (String)null, -1, -1); // L: 46
		field1582 = new class132(1, 1, (String)null, 0, 2); // L: 47
		field1564 = new class132(2, 2, (String)null, 1, 2); // L: 48
		field1565 = new class132(3, 3, (String)null, 2, 2); // L: 49
		field1569 = new class132(4, 4, (String)null, 3, 1); // L: 50
		field1567 = new class132(5, 5, (String)null, 4, 1); // L: 51
		field1568 = new class132(6, 6, (String)null, 5, 1); // L: 52
		field1572 = new class132(7, 7, (String)null, 6, 3); // L: 53
		field1563 = new class132(8, 8, (String)null, 7, 3); // L: 54
		field1571 = new class132(9, 9, (String)null, 8, 3); // L: 55
		field1562 = new class132(10, 10, (String)null, 0, 7); // L: 56
		field1573 = new class132(11, 11, (String)null, 1, 7); // L: 57
		field1574 = new class132(12, 12, (String)null, 2, 7); // L: 58
		field1575 = new class132(13, 13, (String)null, 3, 7); // L: 59
		field1576 = new class132(14, 14, (String)null, 4, 7); // L: 60
		field1577 = new class132(15, 15, (String)null, 5, 7); // L: 61
		field1578 = new class132(16, 16, (String)null, 0, 5); // L: 62
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class132(int var1, int var2, String var3, int var4, int var5) {
		this.field1579 = var1; // L: 72
		this.field1566 = var2; // L: 73
		this.field1570 = var4; // L: 74
	} // L: 75

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1233989967"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1566; // L: 78
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-229624010"
	)
	int method3117() {
		return this.field1570; // L: 82
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(Lme;IS)Ljava/lang/String;",
		garbageValue = "255"
	)
	static String method3125(Widget var0, int var1) {
		if (!class231.method4798(class19.getWidgetFlags(var0), var1) && var0.onOp == null) { // L: 12693
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null; // L: 12694 12695 12697
		}
	}
}
