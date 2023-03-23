import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public class class127 {
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("aj")
	boolean field1508;
	@ObfuscatedName("al")
	boolean field1498;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	class125 field1499;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	class125 field1512;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Leq;"
	)
	class122[] field1501;
	@ObfuscatedName("ao")
	boolean field1519;
	@ObfuscatedName("av")
	float field1505;
	@ObfuscatedName("aq")
	float field1504;
	@ObfuscatedName("ap")
	float field1521;
	@ObfuscatedName("ar")
	float field1506;
	@ObfuscatedName("ak")
	float field1507;
	@ObfuscatedName("ax")
	float field1500;
	@ObfuscatedName("as")
	float field1509;
	@ObfuscatedName("ay")
	float field1510;
	@ObfuscatedName("am")
	float field1511;
	@ObfuscatedName("az")
	float field1520;
	@ObfuscatedName("ae")
	boolean field1513;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2048973097
	)
	int field1503;
	@ObfuscatedName("ag")
	float[] field1515;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 856746677
	)
	int field1516;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -125025945
	)
	int field1517;
	@ObfuscatedName("ai")
	float field1518;
	@ObfuscatedName("aw")
	float field1514;

	class127() {
		this.field1513 = true; // L: 24
		this.field1503 = 0; // L: 25
	} // L: 32

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;IB)I",
		garbageValue = "-73"
	)
	int method2972(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort(); // L: 35
		class152.method3268(var1.readUnsignedByte()); // L: 36
		this.field1499 = ApproximateRouteStrategy.method1203(var1.readUnsignedByte()); // L: 37
		this.field1512 = ApproximateRouteStrategy.method1203(var1.readUnsignedByte()); // L: 38
		this.field1508 = var1.readUnsignedByte() != 0; // L: 39
		this.field1501 = new class122[var3]; // L: 40
		class122 var4 = null; // L: 41

		for (int var5 = 0; var5 < var3; ++var5) { // L: 42
			class122 var6 = new class122(); // L: 43
			var6.method2892(var1, var2); // L: 44
			this.field1501[var5] = var6; // L: 45
			if (var4 != null) { // L: 46
				var4.field1451 = var6; // L: 47
			}

			var4 = var6; // L: 49
		}

		return var3; // L: 51
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "11"
	)
	void method2995() {
		this.field1516 = this.field1501[0].field1455; // L: 55
		this.field1517 = this.field1501[this.method2980() - 1].field1455; // L: 56
		this.field1515 = new float[this.method2977() + 1]; // L: 58

		for (int var1 = this.method2983(); var1 <= this.method2976(); ++var1) { // L: 59
			this.field1515[var1 - this.method2983()] = AttackOption.method2646(this, (float)var1); // L: 60
		}

		this.field1501 = null; // L: 62
		this.field1518 = AttackOption.method2646(this, (float)(this.method2983() - 1)); // L: 64
		this.field1514 = AttackOption.method2646(this, (float)(this.method2976() + 1)); // L: 65
	} // L: 66

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-58733500"
	)
	public float method2974(int var1) {
		if (var1 < this.method2983()) { // L: 70
			return this.field1518; // L: 71
		} else {
			return var1 > this.method2976() ? this.field1514 : this.field1515[var1 - this.method2983()]; // L: 73 74 76
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-71"
	)
	int method2983() {
		return this.field1516; // L: 81
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-920980756"
	)
	int method2976() {
		return this.field1517; // L: 85
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-594070844"
	)
	int method2977() {
		return this.method2976() - this.method2983(); // L: 89
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "1606006629"
	)
	int method2997(float var1) {
		if (this.field1503 < 0 || (float)this.field1501[this.field1503].field1455 > var1 || this.field1501[this.field1503].field1451 != null && (float)this.field1501[this.field1503].field1451.field1455 <= var1) { // L: 93
			if (var1 >= (float)this.method2983() && var1 <= (float)this.method2976()) { // L: 96
				int var2 = this.method2980(); // L: 99
				int var3 = this.field1503; // L: 100
				if (var2 > 0) { // L: 101
					int var4 = 0; // L: 102
					int var5 = var2 - 1; // L: 103

					do {
						int var6 = var4 + var5 >> 1; // L: 105
						if (var1 < (float)this.field1501[var6].field1455) { // L: 106
							if (var1 > (float)this.field1501[var6 - 1].field1455) { // L: 107
								var3 = var6 - 1; // L: 108
								break;
							}

							var5 = var6 - 1; // L: 112
						} else {
							if (var1 <= (float)this.field1501[var6].field1455) { // L: 115
								var3 = var6; // L: 125
								break; // L: 126
							}

							if (var1 < (float)this.field1501[var6 + 1].field1455) { // L: 116
								var3 = var6; // L: 117
								break; // L: 118
							}

							var4 = var6 + 1; // L: 121
						}
					} while(var4 <= var5); // L: 128
				}

				if (var3 != this.field1503) { // L: 130
					this.field1503 = var3; // L: 131
					this.field1513 = true; // L: 132
				}

				return this.field1503; // L: 134
			} else {
				return -1; // L: 97
			}
		} else {
			return this.field1503; // L: 94
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(FI)Leq;",
		garbageValue = "1483862611"
	)
	class122 method2978(float var1) {
		int var2 = this.method2997(var1); // L: 138
		return var2 >= 0 && var2 < this.field1501.length ? this.field1501[var2] : null; // L: 139 140 143
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-61"
	)
	int method2980() {
		return this.field1501 == null ? 0 : this.field1501.length; // L: 148 149
	}
}
