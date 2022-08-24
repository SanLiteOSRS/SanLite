import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public class class145 {
	@ObfuscatedName("ao")
	static String field1650;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1348266069
	)
	public static int field1653;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = -8272204923837980529L
	)
	long field1652;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -9190614716111529967L
	)
	long field1648;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	IterableNodeDeque field1649;

	@ObfuscatedSignature(
		descriptor = "(Lqr;)V"
	)
	public class145(Buffer var1) {
		this.field1648 = -1L; // L: 10
		this.field1649 = new IterableNodeDeque(); // L: 11
		this.method3014(var1); // L: 19
	} // L: 20

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "116"
	)
	void method3014(Buffer var1) {
		this.field1652 = var1.readLong(); // L: 23
		this.field1648 = var1.readLong(); // L: 24

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 25 26 36
			Object var3;
			if (var2 == 1) { // L: 28
				var3 = new class140(this);
			} else if (var2 == 4) {
				var3 = new class151(this); // L: 29
			} else if (var2 == 3) { // L: 30
				var3 = new class136(this);
			} else if (var2 == 2) { // L: 31
				var3 = new class134(this);
			} else {
				if (var2 != 5) { // L: 32
					throw new RuntimeException(""); // L: 33
				}

				var3 = new class141(this);
			}

			((class144)var3).vmethod3074(var1); // L: 34
			this.field1649.addFirst((Node)var3); // L: 35
		}

	} // L: 38

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lec;I)V",
		garbageValue = "-248253496"
	)
	public void method3016(ClanChannel var1) {
		if (this.field1652 == var1.key && var1.field1670 == this.field1648) { // L: 41
			for (class144 var2 = (class144)this.field1649.last(); var2 != null; var2 = (class144)this.field1649.previous()) { // L: 42
				var2.vmethod3073(var1); // L: 43
			}

			++var1.field1670; // L: 45
		} else {
			throw new RuntimeException("");
		}
	} // L: 46

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "8"
	)
	public static int method3023(int var0) {
		return var0 >>> 12; // L: 18
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "945988163"
	)
	public static void method3021() {
		NPCComposition.NpcDefinition_cached.clear(); // L: 282
		NPCComposition.NpcDefinition_cachedModels.clear(); // L: 283
	} // L: 284

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-933087174"
	)
	public static int method3015(String var0) {
		return var0.length() + 2; // L: 128
	}
}
