import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class160 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 2945497093796173499L
	)
	long field1756;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 793512225881550387L
	)
	long field1757;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	IterableNodeDeque field1761;

	@ObfuscatedSignature(
		descriptor = "(Lty;)V"
	)
	public class160(Buffer var1) {
		this.field1757 = -1L; // L: 10
		this.field1761 = new IterableNodeDeque(); // L: 11
		this.method3338(var1); // L: 19
	} // L: 20

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "-1382103151"
	)
	void method3338(Buffer var1) {
		this.field1756 = var1.readLong(); // L: 23
		this.field1757 = var1.readLong(); // L: 24

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 25 26 36
			Object var3;
			if (var2 == 1) { // L: 28
				var3 = new class155(this);
			} else if (var2 == 4) {
				var3 = new class166(this); // L: 29
			} else if (var2 == 3) { // L: 30
				var3 = new class151(this);
			} else if (var2 == 2) { // L: 31
				var3 = new class149(this);
			} else {
				if (var2 != 5) { // L: 32
					throw new RuntimeException(""); // L: 33
				}

				var3 = new class156(this);
			}

			((class159)var3).vmethod3411(var1); // L: 34
			this.field1761.addFirst((Node)var3); // L: 35
		}

	} // L: 38

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "1629184454"
	)
	public void method3339(ClanChannel var1) {
		if (this.field1756 == var1.key && this.field1757 == var1.field1773) { // L: 41
			for (class159 var2 = (class159)this.field1761.last(); var2 != null; var2 = (class159)this.field1761.previous()) { // L: 42
				var2.vmethod3404(var1); // L: 43
			}

			++var1.field1773; // L: 45
		} else {
			throw new RuntimeException("");
		}
	} // L: 46
}
