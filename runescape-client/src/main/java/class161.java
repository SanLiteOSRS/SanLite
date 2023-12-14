import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public class class161 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -3329713020240726457L
	)
	long field1756;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = 756066404053775467L
	)
	public long field1752;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	IterableNodeDeque field1753;

	@ObfuscatedSignature(
		descriptor = "(Luj;)V"
	)
	public class161(Buffer var1) {
		this.field1752 = -1L; // L: 10
		this.field1753 = new IterableNodeDeque(); // L: 11
		this.method3436(var1); // L: 19
	} // L: 20

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;B)V",
		garbageValue = "-62"
	)
	void method3436(Buffer var1) {
		this.field1756 = var1.readLong(); // L: 23
		this.field1752 = var1.readLong(); // L: 24

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

			((class160)var3).vmethod3497(var1); // L: 34
			this.field1753.addFirst((Node)var3); // L: 35
		}

	} // L: 38

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgn;I)V",
		garbageValue = "1259262891"
	)
	public void method3437(ClanChannel var1) {
		if (var1.key == this.field1756 && this.field1752 == var1.field1772) { // L: 41
			for (class160 var2 = (class160)this.field1753.last(); var2 != null; var2 = (class160)this.field1753.previous()) { // L: 44
				var2.vmethod3501(var1); // L: 45
			}

			++var1.field1772; // L: 47
		} else {
			throw new RuntimeException(""); // L: 42
		}
	} // L: 48
}
