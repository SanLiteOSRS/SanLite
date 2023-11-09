import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
public class class127 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 422812915
	)
	public final int field1515;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	public class127 field1525;
	@ObfuscatedName("ao")
	float[][] field1516;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lrz;"
	)
	final class450[] field1517;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lrz;"
	)
	class450[] field1518;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lrz;"
	)
	class450[] field1519;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	class450 field1520;
	@ObfuscatedName("ap")
	boolean field1523;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	class450 field1522;
	@ObfuscatedName("af")
	boolean field1527;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	class450 field1514;
	@ObfuscatedName("aq")
	float[][] field1524;
	@ObfuscatedName("al")
	float[][] field1521;
	@ObfuscatedName("an")
	float[][] field1526;

	@ObfuscatedSignature(
		descriptor = "(ILtm;Z)V"
	)
	public class127(int var1, Buffer var2, boolean var3) {
		this.field1520 = new class450();
		this.field1523 = true; // L: 14
		this.field1522 = new class450();
		this.field1527 = true; // L: 16
		this.field1514 = new class450(); // L: 17
		this.field1515 = var2.readShort(); // L: 23
		this.field1517 = new class450[var1]; // L: 24
		this.field1518 = new class450[this.field1517.length]; // L: 25
		this.field1519 = new class450[this.field1517.length]; // L: 26
		this.field1516 = new float[this.field1517.length][3]; // L: 27

		for (int var4 = 0; var4 < this.field1517.length; ++var4) { // L: 28
			this.field1517[var4] = new class450(var2, var3); // L: 29
			this.field1516[var4][0] = var2.method9066(); // L: 30
			this.field1516[var4][1] = var2.method9066(); // L: 31
			this.field1516[var4][2] = var2.method9066(); // L: 32
		}

		this.method2944(); // L: 34
	} // L: 35

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-431712200"
	)
	void method2944() {
		this.field1524 = new float[this.field1517.length][3]; // L: 38
		this.field1521 = new float[this.field1517.length][3]; // L: 39
		this.field1526 = new float[this.field1517.length][3]; // L: 40
		class450 var1;
		synchronized(class450.field4737) { // L: 43
			if (class462.field4778 == 0) { // L: 44
				var1 = new class450();
			} else {
				class450.field4737[--class462.field4778].method8194(); // L: 46
				var1 = class450.field4737[class462.field4778]; // L: 47
			}
		}

		class450 var2 = var1; // L: 51

		for (int var5 = 0; var5 < this.field1517.length; ++var5) { // L: 52
			class450 var4 = this.method2975(var5); // L: 53
			var2.method8221(var4); // L: 54
			var2.method8254(); // L: 55
			this.field1524[var5] = var2.method8193(); // L: 56
			this.field1521[var5][0] = var4.field4739[12]; // L: 57
			this.field1521[var5][1] = var4.field4739[13]; // L: 58
			this.field1521[var5][2] = var4.field4739[14]; // L: 59
			this.field1526[var5] = var4.method8205(); // L: 60
		}

		var2.method8235(); // L: 62
	} // L: 63

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrz;",
		garbageValue = "1"
	)
	class450 method2975(int var1) {
		return this.field1517[var1]; // L: 66
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IS)Lrz;",
		garbageValue = "18304"
	)
	class450 method2946(int var1) {
		if (this.field1518[var1] == null) { // L: 70
			this.field1518[var1] = new class450(this.method2975(var1)); // L: 71
			if (this.field1525 != null) { // L: 72
				this.field1518[var1].method8237(this.field1525.method2946(var1)); // L: 73
			} else {
				this.field1518[var1].method8237(class450.field4740); // L: 76
			}
		}

		return this.field1518[var1]; // L: 79
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lrz;",
		garbageValue = "1066264654"
	)
	class450 method2965(int var1) {
		if (this.field1519[var1] == null) { // L: 83
			this.field1519[var1] = new class450(this.method2946(var1)); // L: 84
			this.field1519[var1].method8254(); // L: 85
		}

		return this.field1519[var1]; // L: 87
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lrz;I)V",
		garbageValue = "-799671526"
	)
	void method2947(class450 var1) {
		this.field1520.method8221(var1); // L: 91
		this.field1523 = true; // L: 92
		this.field1527 = true; // L: 93
	} // L: 94

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Lrz;",
		garbageValue = "-23"
	)
	class450 method2949() {
		return this.field1520; // L: 97
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lrz;",
		garbageValue = "1930419113"
	)
	class450 method2950() {
		if (this.field1523) { // L: 101
			this.field1522.method8221(this.method2949()); // L: 102
			if (this.field1525 != null) { // L: 103
				this.field1522.method8237(this.field1525.method2950()); // L: 104
			}

			this.field1523 = false; // L: 106
		}

		return this.field1522; // L: 108
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lrz;",
		garbageValue = "1508889675"
	)
	public class450 method2945(int var1) {
		if (this.field1527) { // L: 112
			this.field1514.method8221(this.method2965(var1)); // L: 113
			this.field1514.method8237(this.method2950()); // L: 114
			this.field1527 = false; // L: 115
		}

		return this.field1514; // L: 117
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "1706055895"
	)
	float[] method2952(int var1) {
		return this.field1524[var1]; // L: 121
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "12"
	)
	float[] method2953(int var1) {
		return this.field1521[var1]; // L: 125
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "1605437767"
	)
	float[] method2954(int var1) {
		return this.field1526[var1]; // L: 129
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	public static int method2979(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0; // L: 12 13 15
	}
}
