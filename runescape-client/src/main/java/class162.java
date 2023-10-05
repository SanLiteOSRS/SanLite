import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
public class class162 {
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 7172631523158354997L
	)
	long field1756;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = -6325307052126072157L
	)
	public long field1758;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	IterableNodeDeque field1757;

	@ObfuscatedSignature(
		descriptor = "(Lul;)V"
	)
	public class162(Buffer var1) {
		this.field1758 = -1L; // L: 10
		this.field1757 = new IterableNodeDeque(); // L: 11
		this.method3352(var1); // L: 19
	} // L: 20

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V",
		garbageValue = "90"
	)
	void method3352(Buffer var1) {
		this.field1756 = var1.readLong(); // L: 23
		this.field1758 = var1.readLong(); // L: 24

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 25 26 36
			Object var3;
			if (var2 == 1) { // L: 28
				var3 = new class157(this);
			} else if (var2 == 4) {
				var3 = new class168(this); // L: 29
			} else if (var2 == 3) { // L: 30
				var3 = new class153(this);
			} else if (var2 == 2) { // L: 31
				var3 = new class151(this);
			} else {
				if (var2 != 5) { // L: 32
					throw new RuntimeException(""); // L: 33
				}

				var3 = new class158(this);
			}

			((class161)var3).vmethod3405(var1); // L: 34
			this.field1757.addFirst((Node)var3); // L: 35
		}

	} // L: 38

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgb;I)V",
		garbageValue = "-913420137"
	)
	public void method3353(ClanChannel var1) {
		if (this.field1756 == var1.key && var1.field1775 == this.field1758) { // L: 41
			for (class161 var2 = (class161)this.field1757.last(); var2 != null; var2 = (class161)this.field1757.previous()) { // L: 44
				var2.vmethod3411(var1); // L: 45
			}

			++var1.field1775; // L: 47
		} else {
			throw new RuntimeException(""); // L: 42
		}
	} // L: 48
}
