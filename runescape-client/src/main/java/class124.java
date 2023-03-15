import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public class class124 {
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		intValue = 1050251481
	)
	static int field1471;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(
		intValue = 1841925967
	)
	static int field1479;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1984831557
	)
	public final int field1465;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	public class124 field1474;
	@ObfuscatedName("ac")
	float[][] field1481;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lqt;"
	)
	final class421[] field1467;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lqt;"
	)
	class421[] field1468;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lqt;"
	)
	class421[] field1469;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	class421 field1470;
	@ObfuscatedName("aq")
	boolean field1464;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	class421 field1472;
	@ObfuscatedName("ar")
	boolean field1473;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	class421 field1466;
	@ObfuscatedName("ax")
	float[][] field1475;
	@ObfuscatedName("as")
	float[][] field1476;
	@ObfuscatedName("ay")
	float[][] field1477;

	@ObfuscatedSignature(
		descriptor = "(ILsy;Z)V"
	)
	public class124(int var1, Buffer var2, boolean var3) {
		this.field1470 = new class421(); // L: 13
		this.field1464 = true; // L: 14
		this.field1472 = new class421(); // L: 15
		this.field1473 = true; // L: 16
		this.field1466 = new class421(); // L: 17
		this.field1465 = var2.readShort(); // L: 23
		this.field1467 = new class421[var1]; // L: 24
		this.field1468 = new class421[this.field1467.length]; // L: 25
		this.field1469 = new class421[this.field1467.length]; // L: 26
		this.field1481 = new float[this.field1467.length][3]; // L: 27

		for (int var4 = 0; var4 < this.field1467.length; ++var4) { // L: 28
			this.field1467[var4] = new class421(var2, var3); // L: 29
			this.field1481[var4][0] = var2.method8626(); // L: 30
			this.field1481[var4][1] = var2.method8626(); // L: 31
			this.field1481[var4][2] = var2.method8626(); // L: 32
		}

		this.method2927(); // L: 34
	} // L: 35

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2063624266"
	)
	void method2927() {
		this.field1475 = new float[this.field1467.length][3]; // L: 38
		this.field1476 = new float[this.field1467.length][3]; // L: 39
		this.field1477 = new float[this.field1467.length][3]; // L: 40
		class421 var1;
		synchronized(class421.field4611) { // L: 43
			if (class421.field4610 == 0) { // L: 44
				var1 = new class421();
			} else {
				class421.field4611[--class421.field4610].method7856(); // L: 46
				var1 = class421.field4611[class421.field4610]; // L: 47
			}
		}

		class421 var2 = var1; // L: 51

		for (int var5 = 0; var5 < this.field1467.length; ++var5) { // L: 52
			class421 var4 = this.method2928(var5); // L: 53
			var2.method7850(var4); // L: 54
			var2.method7855(); // L: 55
			this.field1475[var5] = var2.method7858(); // L: 56
			this.field1476[var5][0] = var4.field4608[12]; // L: 57
			this.field1476[var5][1] = var4.field4608[13]; // L: 58
			this.field1476[var5][2] = var4.field4608[14]; // L: 59
			this.field1477[var5] = var4.method7857(); // L: 60
		}

		var2.method7888(); // L: 62
	} // L: 63

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqt;",
		garbageValue = "49"
	)
	class421 method2928(int var1) {
		return this.field1467[var1]; // L: 66
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lqt;",
		garbageValue = "-1175337484"
	)
	class421 method2929(int var1) {
		if (this.field1468[var1] == null) { // L: 70
			this.field1468[var1] = new class421(this.method2928(var1)); // L: 71
			if (this.field1474 != null) { // L: 72
				this.field1468[var1].method7851(this.field1474.method2929(var1)); // L: 73
			} else {
				this.field1468[var1].method7851(class421.field4612); // L: 76
			}
		}

		return this.field1468[var1]; // L: 79
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqt;",
		garbageValue = "-71"
	)
	class421 method2930(int var1) {
		if (this.field1469[var1] == null) { // L: 83
			this.field1469[var1] = new class421(this.method2929(var1)); // L: 84
			this.field1469[var1].method7855(); // L: 85
		}

		return this.field1469[var1]; // L: 87
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "1219238582"
	)
	void method2944(class421 var1) {
		this.field1470.method7850(var1); // L: 91
		this.field1464 = true; // L: 92
		this.field1473 = true; // L: 93
	} // L: 94

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Lqt;",
		garbageValue = "83"
	)
	class421 method2926() {
		return this.field1470; // L: 97
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lqt;",
		garbageValue = "1330180428"
	)
	class421 method2933() {
		if (this.field1464) { // L: 101
			this.field1472.method7850(this.method2926()); // L: 102
			if (this.field1474 != null) { // L: 103
				this.field1472.method7851(this.field1474.method2933()); // L: 104
			}

			this.field1464 = false; // L: 106
		}

		return this.field1472; // L: 108
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lqt;",
		garbageValue = "1012813641"
	)
	public class421 method2934(int var1) {
		if (this.field1473) { // L: 112
			this.field1466.method7850(this.method2930(var1)); // L: 113
			this.field1466.method7851(this.method2933()); // L: 114
			this.field1473 = false; // L: 115
		}

		return this.field1466; // L: 117
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-2121032861"
	)
	float[] method2935(int var1) {
		return this.field1475[var1]; // L: 121
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "1356694558"
	)
	float[] method2936(int var1) {
		return this.field1476[var1]; // L: 125
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "-24"
	)
	float[] method2937(int var1) {
		return this.field1477[var1]; // L: 129
	}
}
