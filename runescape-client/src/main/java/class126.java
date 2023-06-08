import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class class126 {
	@ObfuscatedName("ub")
	@ObfuscatedGetter(
		intValue = 277955456
	)
	static int field1469;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1150635435
	)
	public final int field1477;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	public class126 field1470;
	@ObfuscatedName("av")
	float[][] field1471;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lqp;"
	)
	final class438[] field1479;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lqp;"
	)
	class438[] field1473;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lqp;"
	)
	class438[] field1474;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	class438 field1475;
	@ObfuscatedName("ak")
	boolean field1484;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	class438 field1482;
	@ObfuscatedName("af")
	boolean field1478;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	class438 field1476;
	@ObfuscatedName("aa")
	float[][] field1483;
	@ObfuscatedName("aj")
	float[][] field1481;
	@ObfuscatedName("ad")
	float[][] field1472;

	@ObfuscatedSignature(
		descriptor = "(ILtz;Z)V"
	)
	public class126(int var1, Buffer var2, boolean var3) {
		this.field1475 = new class438(); // L: 13
		this.field1484 = true; // L: 14
		this.field1482 = new class438(); // L: 15
		this.field1478 = true; // L: 16
		this.field1476 = new class438(); // L: 17
		this.field1477 = var2.readShort(); // L: 23
		this.field1479 = new class438[var1]; // L: 24
		this.field1473 = new class438[this.field1479.length];
		this.field1474 = new class438[this.field1479.length]; // L: 26
		this.field1471 = new float[this.field1479.length][3]; // L: 27

		for (int var4 = 0; var4 < this.field1479.length; ++var4) { // L: 28
			this.field1479[var4] = new class438(var2, var3); // L: 29
			this.field1471[var4][0] = var2.method8916(); // L: 30
			this.field1471[var4][1] = var2.method8916(); // L: 31
			this.field1471[var4][2] = var2.method8916(); // L: 32
		}

		this.method2955(); // L: 34
	} // L: 35

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "580765599"
	)
	void method2955() {
		this.field1483 = new float[this.field1479.length][3]; // L: 38
		this.field1481 = new float[this.field1479.length][3]; // L: 39
		this.field1472 = new float[this.field1479.length][3]; // L: 40
		class438 var1 = class396.method7554(); // L: 41

		for (int var2 = 0; var2 < this.field1479.length; ++var2) { // L: 42
			class438 var3 = this.method2922(var2); // L: 43
			var1.method8096(var3); // L: 44
			var1.method8139(); // L: 45
			this.field1483[var2] = var1.method8097(); // L: 46
			this.field1481[var2][0] = var3.field4685[12]; // L: 47
			this.field1481[var2][1] = var3.field4685[13]; // L: 48
			this.field1481[var2][2] = var3.field4685[14]; // L: 49
			this.field1472[var2] = var3.method8116(); // L: 50
		}

		var1.method8119(); // L: 52
	} // L: 53

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqp;",
		garbageValue = "9"
	)
	class438 method2922(int var1) {
		return this.field1479[var1]; // L: 56
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lqp;",
		garbageValue = "1829867791"
	)
	class438 method2923(int var1) {
		if (this.field1473[var1] == null) { // L: 60
			this.field1473[var1] = new class438(this.method2922(var1)); // L: 61
			if (this.field1470 != null) { // L: 62
				this.field1473[var1].method8104(this.field1470.method2923(var1)); // L: 63
			} else {
				this.field1473[var1].method8104(class438.field4686); // L: 66
			}
		}

		return this.field1473[var1]; // L: 69
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqp;",
		garbageValue = "105"
	)
	class438 method2924(int var1) {
		if (this.field1474[var1] == null) { // L: 73
			this.field1474[var1] = new class438(this.method2923(var1)); // L: 74
			this.field1474[var1].method8139(); // L: 75
		}

		return this.field1474[var1]; // L: 77
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqp;I)V",
		garbageValue = "-1088629176"
	)
	void method2939(class438 var1) {
		this.field1475.method8096(var1); // L: 81
		this.field1484 = true; // L: 82
		this.field1478 = true; // L: 83
	} // L: 84

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lqp;",
		garbageValue = "882573661"
	)
	class438 method2945() {
		return this.field1475; // L: 87
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lqp;",
		garbageValue = "-1922889317"
	)
	class438 method2927() {
		if (this.field1484) { // L: 91
			this.field1482.method8096(this.method2945()); // L: 92
			if (this.field1470 != null) { // L: 93
				this.field1482.method8104(this.field1470.method2927()); // L: 94
			}

			this.field1484 = false; // L: 96
		}

		return this.field1482; // L: 98
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lqp;",
		garbageValue = "-2072769178"
	)
	public class438 method2928(int var1) {
		if (this.field1478) { // L: 102
			this.field1476.method8096(this.method2924(var1)); // L: 103
			this.field1476.method8104(this.method2927()); // L: 104
			this.field1478 = false; // L: 105
		}

		return this.field1476; // L: 107
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-1185833224"
	)
	float[] method2929(int var1) {
		return this.field1483[var1]; // L: 111
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "-16"
	)
	float[] method2930(int var1) {
		return this.field1481[var1]; // L: 115
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-1165674685"
	)
	float[] method2931(int var1) {
		return this.field1472[var1]; // L: 119
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lik;",
		garbageValue = "-839433864"
	)
	static class213[] method2956() {
		return new class213[]{class213.field2370, class213.field2376, class213.field2373, class213.field2372, class213.field2371, class213.field2377, class213.field2367}; // L: 25
	}
}
