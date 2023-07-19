import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
public enum class89 implements class371 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	field1092(0, -1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	field1091(1, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	field1097(2, 7),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	field1093(3, 8),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	field1094(4, 9);

	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1700710567
	)
	final int field1095;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1193379049
	)
	final int field1096;

	class89(int var3, int var4) {
		this.field1095 = var3; // L: 20
		this.field1096 = var4; // L: 21
	} // L: 22

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1233989967"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1096; // L: 26
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lme;II)V",
		garbageValue = "126946129"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3703 == null) { // L: 1234
			throw new RuntimeException(); // L: 1235
		} else {
			if (var0.field3773 == null) { // L: 1237
				var0.field3773 = new int[var0.field3703.length]; // L: 1238
			}

			var0.field3773[var1] = Integer.MAX_VALUE; // L: 1240
		}
	} // L: 1241

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "0"
	)
	static final int method2330(int var0, int var1) {
		if (var0 == -2) { // L: 945
			return 12345678;
		} else if (var0 == -1) { // L: 946
			if (var1 < 2) {
				var1 = 2; // L: 947
			} else if (var1 > 126) { // L: 948
				var1 = 126;
			}

			return var1; // L: 949
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 951
			if (var1 < 2) { // L: 952
				var1 = 2;
			} else if (var1 > 126) { // L: 953
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 954
		}
	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(Ltl;IB)V",
		garbageValue = "-73"
	)
	static void method2323(Buffer var0, int var1) {
		class364.VorbisSample_setData(var0.array, var1); // L: 12769
		AbstractWorldMapIcon.method5605(var0, var1); // L: 12770
	} // L: 12771
}
