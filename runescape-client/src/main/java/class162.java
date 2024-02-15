import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class162 {
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -906448207537196297L
	)
	long field1786;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 6665924676591181619L
	)
	public long field1785;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	IterableNodeDeque field1787;

	@ObfuscatedSignature(
		descriptor = "(Luq;)V"
	)
	public class162(Buffer var1) {
		this.field1785 = -1L; // L: 10
		this.field1787 = new IterableNodeDeque(); // L: 11
		this.method3441(var1); // L: 19
	} // L: 20

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-175058432"
	)
	void method3441(Buffer var1) {
		this.field1786 = var1.readLong(); // L: 23
		this.field1785 = var1.readLong(); // L: 24

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

			((class161)var3).vmethod3504(var1); // L: 34
			this.field1787.addFirst((Node)var3); // L: 35
		}

	} // L: 38

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "2036232616"
	)
	public void method3442(ClanChannel var1) {
		if (var1.key == this.field1786 && var1.field1808 == this.field1785) { // L: 41
			for (class161 var2 = (class161)this.field1787.last(); var2 != null; var2 = (class161)this.field1787.previous()) { // L: 44
				var2.vmethod3509(var1); // L: 45
			}

			++var1.field1808; // L: 47
		} else {
			throw new RuntimeException(""); // L: 42
		}
	} // L: 48
}
