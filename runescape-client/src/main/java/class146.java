import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class146 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 3862277302558925181L
	)
	long field1644;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1750189439
	)
	int field1639;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	IterableNodeDeque field1641;

	@ObfuscatedSignature(
		descriptor = "(Ltc;)V"
	)
	public class146(Buffer var1) {
		this.field1639 = -1; // L: 9
		this.field1641 = new IterableNodeDeque(); // L: 10
		this.method3123(var1); // L: 28
	} // L: 29

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)V",
		garbageValue = "-1784198920"
	)
	void method3123(Buffer var1) {
		this.field1644 = var1.readLong(); // L: 32
		this.field1639 = var1.readInt(); // L: 33

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

			((class143)var3).vmethod3345(var1); // L: 53
			this.field1641.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfb;B)V",
		garbageValue = "8"
	)
	public void method3124(ClanSettings var1) {
		if (this.field1644 == var1.field1705 && this.field1639 == var1.field1693) { // L: 60
			for (class143 var2 = (class143)this.field1641.last(); var2 != null; var2 = (class143)this.field1641.previous()) { // L: 61
				var2.vmethod3346(var1); // L: 62
			}

			++var1.field1693; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1504430322"
	)
	public static int method3128(int var0) {
		return ReflectionCheck.method692(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 76
	}
}
