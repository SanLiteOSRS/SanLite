import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public class class123 {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1087900785
	)
	public final int field1516;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	public class123 field1513;
	@ObfuscatedName("v")
	float[][] field1514;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[Loj;"
	)
	final class410[] field1515;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "[Loj;"
	)
	class410[] field1512;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Loj;"
	)
	class410[] field1517;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	class410 field1518;
	@ObfuscatedName("r")
	boolean field1522;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	class410 field1524;
	@ObfuscatedName("b")
	boolean field1521;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	class410 field1519;
	@ObfuscatedName("g")
	float[][] field1520;
	@ObfuscatedName("i")
	float[][] field1523;
	@ObfuscatedName("o")
	float[][] field1525;

	@ObfuscatedSignature(
		descriptor = "(ILqy;Z)V"
	)
	public class123(int var1, Buffer var2, boolean var3) {
		this.field1518 = new class410(); // L: 13
		this.field1522 = true; // L: 14
		this.field1524 = new class410(); // L: 15
		this.field1521 = true; // L: 16
		this.field1519 = new class410(); // L: 17
		this.field1516 = var2.readShort(); // L: 23
		this.field1515 = new class410[var1]; // L: 24
		this.field1512 = new class410[this.field1515.length]; // L: 25
		this.field1517 = new class410[this.field1515.length]; // L: 26
		this.field1514 = new float[this.field1515.length][3]; // L: 27

		for (int var4 = 0; var4 < this.field1515.length; ++var4) { // L: 28
			this.field1515[var4] = new class410(var2, var3); // L: 29
			this.field1514[var4][0] = var2.method8556(); // L: 30
			this.field1514[var4][1] = var2.method8556(); // L: 31
			this.field1514[var4][2] = var2.method8556(); // L: 32
		}

		this.method2900(); // L: 34
	} // L: 35

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-114"
	)
	void method2900() {
		this.field1520 = new float[this.field1515.length][3]; // L: 38
		this.field1523 = new float[this.field1515.length][3]; // L: 39
		this.field1525 = new float[this.field1515.length][3]; // L: 40
		class410 var1 = class326.method6395(); // L: 41

		for (int var2 = 0; var2 < this.field1515.length; ++var2) { // L: 42
			class410 var3 = this.method2931(var2); // L: 43
			var1.method7784(var3); // L: 44
			var1.method7792(); // L: 45
			this.field1520[var2] = var1.method7781(); // L: 46
			this.field1523[var2][0] = var3.field4612[12]; // L: 47
			this.field1523[var2][1] = var3.field4612[13]; // L: 48
			this.field1523[var2][2] = var3.field4612[14]; // L: 49
			this.field1525[var2] = var3.method7794(); // L: 50
		}

		var1.method7795(); // L: 52
	} // L: 53

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Loj;",
		garbageValue = "-197286260"
	)
	class410 method2931(int var1) {
		return this.field1515[var1]; // L: 56
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Loj;",
		garbageValue = "-39"
	)
	class410 method2903(int var1) {
		if (this.field1512[var1] == null) { // L: 60
			this.field1512[var1] = new class410(this.method2931(var1)); // L: 61
			if (this.field1513 != null) { // L: 62
				this.field1512[var1].method7788(this.field1513.method2903(var1)); // L: 63
			} else {
				this.field1512[var1].method7788(class410.field4613); // L: 66
			}
		}

		return this.field1512[var1]; // L: 69
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IS)Loj;",
		garbageValue = "-1313"
	)
	class410 method2930(int var1) {
		if (this.field1517[var1] == null) { // L: 73
			this.field1517[var1] = new class410(this.method2903(var1)); // L: 74
			this.field1517[var1].method7792(); // L: 75
		}

		return this.field1517[var1]; // L: 77
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Loj;I)V",
		garbageValue = "-969750342"
	)
	void method2907(class410 var1) {
		this.field1518.method7784(var1); // L: 81
		this.field1522 = true; // L: 82
		this.field1521 = true; // L: 83
	} // L: 84

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Loj;",
		garbageValue = "1985387676"
	)
	class410 method2906() {
		return this.field1518; // L: 87
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Loj;",
		garbageValue = "46823189"
	)
	class410 method2913() {
		if (this.field1522) { // L: 91
			this.field1524.method7784(this.method2906()); // L: 92
			if (this.field1513 != null) { // L: 93
				this.field1524.method7788(this.field1513.method2913()); // L: 94
			}

			this.field1522 = false; // L: 96
		}

		return this.field1524; // L: 98
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)Loj;",
		garbageValue = "1286617605"
	)
	public class410 method2904(int var1) {
		if (this.field1521) { // L: 102
			this.field1519.method7784(this.method2930(var1)); // L: 103
			this.field1519.method7788(this.method2913()); // L: 104
			this.field1521 = false; // L: 105
		}

		return this.field1519; // L: 107
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "0"
	)
	float[] method2909(int var1) {
		return this.field1520[var1]; // L: 111
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-2100029248"
	)
	float[] method2910(int var1) {
		return this.field1523[var1]; // L: 115
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IS)[F",
		garbageValue = "1900"
	)
	float[] method2911(int var1) {
		return this.field1525[var1]; // L: 119
	}
}
