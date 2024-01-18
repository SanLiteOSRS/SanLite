import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class146 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = -4675098848837362585L
	)
	long field1646;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 228954545
	)
	public int field1645;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	IterableNodeDeque field1647;

	@ObfuscatedSignature(
		descriptor = "(Luk;)V"
	)
	public class146(Buffer var1) {
		this.field1645 = -1; // L: 9
		this.field1647 = new IterableNodeDeque(); // L: 10
		this.method3252(var1); // L: 28
	} // L: 29

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-116965688"
	)
	void method3252(Buffer var1) {
		this.field1646 = var1.readLong(); // L: 32
		this.field1645 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 35 55
			Object var3;
			if (var2 == 3) { // L: 37
				var3 = new class165(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class141(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class158(this);
			} else if (var2 == 4) { // L: 40
				var3 = new class150(this);
			} else if (var2 == 6) { // L: 41
				var3 = new class157(this);
			} else if (var2 == 5) { // L: 42
				var3 = new class142(this);
			} else if (var2 == 2) { // L: 43
				var3 = new class147(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class140(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class144(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class161(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class167(this);
			} else if (var2 == 10) {
				var3 = new class153(this); // L: 48
			} else if (var2 == 11) { // L: 49
				var3 = new class148(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class152(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException(""); // L: 52
				}

				var3 = new class162(this);
			}

			((class143)var3).vmethod3531(var1); // L: 53
			this.field1647.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfn;S)V",
		garbageValue = "17442"
	)
	public void method3253(ClanSettings var1) {
		if (this.field1646 == var1.field1694 && this.field1645 == var1.field1716) { // L: 60
			for (class143 var2 = (class143)this.field1647.last(); var2 != null; var2 = (class143)this.field1647.previous()) { // L: 61
				var2.vmethod3529(var1); // L: 62
			}

			++var1.field1716; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65
}
