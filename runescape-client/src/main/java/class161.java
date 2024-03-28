import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public class class161 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 2768228157651656441L
	)
	long field1780;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = -310999304387576023L
	)
	public long field1781;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	IterableNodeDeque field1786;

	@ObfuscatedSignature(
		descriptor = "(Lur;)V"
	)
	public class161(Buffer var1) {
		this.field1781 = -1L; // L: 10
		this.field1786 = new IterableNodeDeque(); // L: 11
		this.method3356(var1); // L: 19
	} // L: 20

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "79"
	)
	void method3356(Buffer var1) {
		this.field1780 = var1.readLong(); // L: 23
		this.field1781 = var1.readLong(); // L: 24

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 25 26 36
			Object var3;
			if (var2 == 1) { // L: 28
				var3 = new class156(this);
			} else if (var2 == 4) { // L: 29
				var3 = new class167(this);
			} else if (var2 == 3) { // L: 30
				var3 = new class152(this);
			} else if (var2 == 2) { // L: 31
				var3 = new class150(this);
			} else {
				if (var2 != 5) { // L: 32
					throw new RuntimeException(""); // L: 33
				}

				var3 = new class157(this);
			}

			((class160)var3).vmethod3414(var1); // L: 34
			this.field1786.addFirst((Node)var3); // L: 35
		}

	} // L: 38

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgi;B)V",
		garbageValue = "2"
	)
	public void method3357(ClanChannel var1) {
		if (this.field1780 == var1.key && this.field1781 == var1.field1795) { // L: 41
			for (class160 var2 = (class160)this.field1786.last(); var2 != null; var2 = (class160)this.field1786.previous()) { // L: 44
				var2.vmethod3413(var1); // L: 45
			}

			++var1.field1795; // L: 47
		} else {
			throw new RuntimeException(""); // L: 42
		}
	} // L: 48
}
