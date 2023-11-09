import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
public class class131 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = -3274018055934261563L
	)
	long field1550;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 587642307
	)
	int field1558;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	IterableNodeDeque field1551;

	@ObfuscatedSignature(
		descriptor = "(Lqr;)V"
	)
	public class131(Buffer var1) {
		this.field1558 = -1; // L: 9
		this.field1551 = new IterableNodeDeque(); // L: 10
		this.method2821(var1); // L: 28
	} // L: 29

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "7"
	)
	void method2821(Buffer var1) {
		this.field1550 = var1.readLong(); // L: 32
		this.field1558 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 35 55
			Object var3;
			if (var2 == 3) { // L: 37
				var3 = new class150(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class126(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class143(this);
			} else if (var2 == 4) { // L: 40
				var3 = new class135(this);
			} else if (var2 == 6) { // L: 41
				var3 = new class142(this);
			} else if (var2 == 5) {
				var3 = new class127(this); // L: 42
			} else if (var2 == 2) { // L: 43
				var3 = new class132(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class125(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class129(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class146(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class152(this);
			} else if (var2 == 10) {
				var3 = new class138(this); // L: 48
			} else if (var2 == 11) { // L: 49
				var3 = new class133(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class137(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException(""); // L: 52
				}

				var3 = new class147(this);
			}

			((class128)var3).vmethod3087(var1); // L: 53
			this.field1551.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Leh;B)V",
		garbageValue = "89"
	)
	public void method2822(ClanSettings var1) {
		if (this.field1550 == var1.field1602 && this.field1558 == var1.field1603) { // L: 60
			for (class128 var2 = (class128)this.field1551.last(); var2 != null; var2 = (class128)this.field1551.previous()) { // L: 61
				var2.vmethod3084(var1); // L: 62
			}

			++var1.field1603; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lls;B)V",
		garbageValue = "-2"
	)
	public static void method2827(AbstractArchive var0) {
	} // L: 16
}
