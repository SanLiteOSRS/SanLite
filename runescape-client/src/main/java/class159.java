import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
public class class159 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 4655426251579530699L
	)
	long field1743;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -6751957355302241451L
	)
	long field1746;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	IterableNodeDeque field1744;

	@ObfuscatedSignature(
		descriptor = "(Ltz;)V"
	)
	public class159(Buffer var1) {
		this.field1746 = -1L; // L: 10
		this.field1744 = new IterableNodeDeque(); // L: 11
		this.method3312(var1); // L: 19
	} // L: 20

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "-1044770346"
	)
	void method3312(Buffer var1) {
		this.field1743 = var1.readLong(); // L: 23
		this.field1746 = var1.readLong(); // L: 24

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 25 26 36
			Object var3;
			if (var2 == 1) { // L: 28
				var3 = new class154(this);
			} else if (var2 == 4) {
				var3 = new class165(this); // L: 29
			} else if (var2 == 3) { // L: 30
				var3 = new class150(this);
			} else if (var2 == 2) { // L: 31
				var3 = new class148(this);
			} else {
				if (var2 != 5) { // L: 32
					throw new RuntimeException(""); // L: 33
				}

				var3 = new class155(this);
			}

			((class158)var3).vmethod3370(var1); // L: 34
			this.field1744.addFirst((Node)var3); // L: 35
		}

	} // L: 38

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)V",
		garbageValue = "-1146523830"
	)
	public void method3313(ClanChannel var1) {
		if (var1.key == this.field1743 && var1.field1764 == this.field1746) { // L: 41
			for (class158 var2 = (class158)this.field1744.last(); var2 != null; var2 = (class158)this.field1744.previous()) { // L: 42
				var2.vmethod3371(var1); // L: 43
			}

			++var1.field1764; // L: 45
		} else {
			throw new RuntimeException("");
		}
	} // L: 46

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(CS)Z",
		garbageValue = "-14817"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 154
	}
}
