import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
public class class156 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = 5227141310100233771L
	)
	long field1756;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = 3503076607081773961L
	)
	long field1755;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	IterableNodeDeque field1758;

	@ObfuscatedSignature(
		descriptor = "(Lsg;)V"
	)
	public class156(Buffer var1) {
		this.field1755 = -1L; // L: 10
		this.field1758 = new IterableNodeDeque(); // L: 11
		this.method3395(var1); // L: 19
	} // L: 20

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "-1593521254"
	)
	void method3395(Buffer var1) {
		this.field1756 = var1.readLong(); // L: 23
		this.field1755 = var1.readLong(); // L: 24

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 25 26 36
			Object var3;
			if (var2 == 1) { // L: 28
				var3 = new class151(this);
			} else if (var2 == 4) {
				var3 = new class162(this); // L: 29
			} else if (var2 == 3) { // L: 30
				var3 = new class147(this);
			} else if (var2 == 2) { // L: 31
				var3 = new class145(this);
			} else {
				if (var2 != 5) { // L: 32
					throw new RuntimeException(""); // L: 33
				}

				var3 = new class152(this);
			}

			((class155)var3).vmethod3448(var1); // L: 34
			this.field1758.addFirst((Node)var3); // L: 35
		}

	} // L: 38

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgj;B)V",
		garbageValue = "-101"
	)
	public void method3396(ClanChannel var1) {
		if (this.field1756 == var1.key && this.field1755 == var1.field1771) { // L: 41
			for (class155 var2 = (class155)this.field1758.last(); var2 != null; var2 = (class155)this.field1758.previous()) { // L: 42
				var2.vmethod3450(var1); // L: 43
			}

			++var1.field1771; // L: 45
		} else {
			throw new RuntimeException("");
		}
	} // L: 46

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-742935767"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menuOptionsCount = 0; // L: 8600
		Client.isMenuOpen = false; // L: 8601
		Client.menuActions[0] = "Cancel"; // L: 8603
		Client.menuTargets[0] = ""; // L: 8604
		Client.menuOpcodes[0] = 1006; // L: 8605
		Client.menuShiftClick[0] = false; // L: 8606
		Client.menuOptionsCount = 1; // L: 8607
	} // L: 8608
}
