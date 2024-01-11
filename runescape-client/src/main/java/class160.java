import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
public class class160 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = 565344863230423851L
	)
	long field1745;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -1369878872476871757L
	)
	public long field1744;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	IterableNodeDeque field1746;

	@ObfuscatedSignature(
		descriptor = "(Luk;)V"
	)
	public class160(Buffer var1) {
		this.field1744 = -1L; // L: 10
		this.field1746 = new IterableNodeDeque(); // L: 11
		this.method3464(var1); // L: 19
	} // L: 20

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "1434557141"
	)
	void method3464(Buffer var1) {
		this.field1745 = var1.readLong(); // L: 23
		this.field1744 = var1.readLong(); // L: 24

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 25 26 36
			Object var3;
			if (var2 == 1) { // L: 28
				var3 = new class155(this);
			} else if (var2 == 4) { // L: 29
				var3 = new class166(this);
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

			((class159)var3).vmethod3518(var1); // L: 34
			this.field1746.addFirst((Node)var3); // L: 35
		}

	} // L: 38

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "-1792731556"
	)
	public void method3465(ClanChannel var1) {
		if (var1.key == this.field1745 && this.field1744 == var1.field1764) { // L: 41
			for (class159 var2 = (class159)this.field1746.last(); var2 != null; var2 = (class159)this.field1746.previous()) { // L: 44
				var2.vmethod3519(var1); // L: 45
			}

			++var1.field1764; // L: 47
		} else {
			throw new RuntimeException(""); // L: 42
		}
	} // L: 48
}
