import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
public class class129 {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -189400369
	)
	static int field1520;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 360733507
	)
	public final int field1521;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	public class129 field1506;
	@ObfuscatedName("ak")
	float[][] field1519;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lrb;"
	)
	final class465[] field1508;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lrb;"
	)
	class465[] field1509;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lrb;"
	)
	class465[] field1507;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	class465 field1510;
	@ObfuscatedName("ab")
	boolean field1505;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	class465 field1513;
	@ObfuscatedName("av")
	boolean field1514;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	class465 field1515;
	@ObfuscatedName("aa")
	float[][] field1516;
	@ObfuscatedName("ap")
	float[][] field1517;
	@ObfuscatedName("ay")
	float[][] field1518;

	@ObfuscatedSignature(
		descriptor = "(ILul;Z)V"
	)
	public class129(int var1, Buffer var2, boolean var3) {
		this.field1510 = new class465(); // L: 13
		this.field1505 = true; // L: 14
		this.field1513 = new class465(); // L: 15
		this.field1514 = true; // L: 16
		this.field1515 = new class465(); // L: 17
		this.field1521 = var2.readShort(); // L: 23
		this.field1508 = new class465[var1]; // L: 24
		this.field1509 = new class465[this.field1508.length]; // L: 25
		this.field1507 = new class465[this.field1508.length]; // L: 26
		this.field1519 = new float[this.field1508.length][3]; // L: 27

		for (int var4 = 0; var4 < this.field1508.length; ++var4) { // L: 28
			this.field1508[var4] = new class465(var2, var3); // L: 29
			this.field1519[var4][0] = var2.method9211(); // L: 30
			this.field1519[var4][1] = var2.method9211(); // L: 31
			this.field1519[var4][2] = var2.method9211(); // L: 32
		}

		this.method2964(); // L: 34
	} // L: 35

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-13"
	)
	void method2964() {
		this.field1516 = new float[this.field1508.length][3]; // L: 38
		this.field1517 = new float[this.field1508.length][3]; // L: 39
		this.field1518 = new float[this.field1508.length][3]; // L: 40
		class465 var1 = ParamComposition.method3936(); // L: 41

		for (int var2 = 0; var2 < this.field1508.length; ++var2) { // L: 42
			class465 var3 = this.method2965(var2); // L: 43
			var1.method8356(var3); // L: 44
			var1.method8363(); // L: 45
			this.field1516[var2] = var1.method8353(); // L: 46
			this.field1517[var2][0] = var3.field4785[12]; // L: 47
			this.field1517[var2][1] = var3.field4785[13]; // L: 48
			this.field1517[var2][2] = var3.field4785[14]; // L: 49
			this.field1518[var2] = var3.method8348(); // L: 50
		}

		var1.method8399(); // L: 52
	} // L: 53

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lrb;",
		garbageValue = "-1380153125"
	)
	class465 method2965(int var1) {
		return this.field1508[var1]; // L: 56
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lrb;",
		garbageValue = "-1405133305"
	)
	class465 method2966(int var1) {
		if (this.field1509[var1] == null) { // L: 60
			this.field1509[var1] = new class465(this.method2965(var1)); // L: 61
			if (this.field1506 != null) { // L: 62
				this.field1509[var1].method8359(this.field1506.method2966(var1)); // L: 63
			} else {
				this.field1509[var1].method8359(class465.field4782); // L: 66
			}
		}

		return this.field1509[var1]; // L: 69
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Lrb;",
		garbageValue = "-1214410602"
	)
	class465 method2976(int var1) {
		if (this.field1507[var1] == null) { // L: 73
			this.field1507[var1] = new class465(this.method2966(var1)); // L: 74
			this.field1507[var1].method8363(); // L: 75
		}

		return this.field1507[var1]; // L: 77
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lrb;I)V",
		garbageValue = "2009872809"
	)
	void method2988(class465 var1) {
		this.field1510.method8356(var1); // L: 81
		this.field1505 = true; // L: 82
		this.field1514 = true; // L: 83
	} // L: 84

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lrb;",
		garbageValue = "1"
	)
	class465 method2969() {
		return this.field1510; // L: 87
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lrb;",
		garbageValue = "-1187043704"
	)
	class465 method2970() {
		if (this.field1505) { // L: 91
			this.field1513.method8356(this.method2969()); // L: 92
			if (this.field1506 != null) { // L: 93
				this.field1513.method8359(this.field1506.method2970()); // L: 94
			}

			this.field1505 = false; // L: 96
		}

		return this.field1513; // L: 98
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lrb;",
		garbageValue = "295548775"
	)
	public class465 method2963(int var1) {
		if (this.field1514) { // L: 102
			this.field1515.method8356(this.method2976(var1)); // L: 103
			this.field1515.method8359(this.method2970()); // L: 104
			this.field1514 = false; // L: 105
		}

		return this.field1515; // L: 107
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "1329468643"
	)
	float[] method2972(int var1) {
		return this.field1516[var1]; // L: 111
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-1277196406"
	)
	float[] method2981(int var1) {
		return this.field1517[var1]; // L: 115
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "996106282"
	)
	float[] method2974(int var1) {
		return this.field1518[var1]; // L: 119
	}
}
