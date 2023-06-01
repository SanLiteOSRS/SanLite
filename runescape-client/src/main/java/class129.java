import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
public class class129 {
	@ObfuscatedName("ay")
	boolean field1517;
	@ObfuscatedName("an")
	boolean field1506;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	class127 field1507;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	class127 field1508;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lem;"
	)
	class124[] field1509;
	@ObfuscatedName("ax")
	boolean field1510;
	@ObfuscatedName("al")
	float field1511;
	@ObfuscatedName("aj")
	float field1512;
	@ObfuscatedName("ac")
	float field1526;
	@ObfuscatedName("ag")
	float field1514;
	@ObfuscatedName("ad")
	float field1515;
	@ObfuscatedName("aw")
	float field1516;
	@ObfuscatedName("ae")
	float field1521;
	@ObfuscatedName("ah")
	float field1518;
	@ObfuscatedName("ap")
	float field1519;
	@ObfuscatedName("as")
	float field1513;
	@ObfuscatedName("am")
	boolean field1520;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1661966229
	)
	int field1525;
	@ObfuscatedName("af")
	float[] field1523;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 381602661
	)
	int field1524;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -275939387
	)
	int field1505;
	@ObfuscatedName("az")
	float field1527;
	@ObfuscatedName("ak")
	float field1522;

	class129() {
		this.field1520 = true; // L: 24
		this.field1525 = 0; // L: 25
	} // L: 32

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;II)I",
		garbageValue = "1184273950"
	)
	int method2997(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort(); // L: 35
		ReflectionCheck.method693(var1.readUnsignedByte()); // L: 36
		this.field1507 = UserComparator6.method2903(var1.readUnsignedByte()); // L: 37
		this.field1508 = UserComparator6.method2903(var1.readUnsignedByte()); // L: 38
		this.field1517 = var1.readUnsignedByte() != 0; // L: 39
		this.field1509 = new class124[var3]; // L: 40
		class124 var4 = null; // L: 41

		for (int var5 = 0; var5 < var3; ++var5) { // L: 42
			class124 var6 = new class124(); // L: 43
			var6.method2906(var1, var2); // L: 44
			this.field1509[var5] = var6; // L: 45
			if (var4 != null) { // L: 46
				var4.field1455 = var6; // L: 47
			}

			var4 = var6; // L: 49
		}

		return var3; // L: 51
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-20"
	)
	void method2965() {
		this.field1524 = this.field1509[0].field1454; // L: 55
		this.field1505 = this.field1509[this.method2970() - 1].field1454; // L: 56
		this.field1523 = new float[this.method2967() + 1]; // L: 58

		for (int var1 = this.method2973(); var1 <= this.method2992(); ++var1) { // L: 59
			this.field1523[var1 - this.method2973()] = World.method1794(this, (float)var1); // L: 60
		}

		this.field1509 = null; // L: 62
		this.field1527 = World.method1794(this, (float)(this.method2973() - 1)); // L: 64
		this.field1522 = World.method1794(this, (float)(this.method2992() + 1)); // L: 65
	} // L: 66

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IS)F",
		garbageValue = "180"
	)
	public float method2964(int var1) {
		if (var1 < this.method2973()) { // L: 70
			return this.field1527; // L: 71
		} else {
			return var1 > this.method2992() ? this.field1522 : this.field1523[var1 - this.method2973()]; // L: 73 74 76
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1848420120"
	)
	int method2973() {
		return this.field1524; // L: 81
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1148025090"
	)
	int method2992() {
		return this.field1505; // L: 85
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "567797057"
	)
	int method2967() {
		return this.method2992() - this.method2973(); // L: 89
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FB)I",
		garbageValue = "-34"
	)
	int method2968(float var1) {
		if (this.field1525 < 0 || (float)this.field1509[this.field1525].field1454 > var1 || this.field1509[this.field1525].field1455 != null && (float)this.field1509[this.field1525].field1455.field1454 <= var1) { // L: 93
			if (var1 >= (float)this.method2973() && var1 <= (float)this.method2992()) { // L: 96
				int var2 = this.method2970(); // L: 99
				int var3 = this.field1525; // L: 100
				if (var2 > 0) { // L: 101
					int var4 = 0; // L: 102
					int var5 = var2 - 1; // L: 103

					do {
						int var6 = var5 + var4 >> 1; // L: 105
						if (var1 < (float)this.field1509[var6].field1454) { // L: 106
							if (var1 > (float)this.field1509[var6 - 1].field1454) { // L: 107
								var3 = var6 - 1; // L: 108
								break;
							}

							var5 = var6 - 1; // L: 112
						} else {
							if (var1 <= (float)this.field1509[var6].field1454) { // L: 115
								var3 = var6; // L: 125
								break; // L: 126
							}

							if (var1 < (float)this.field1509[var6 + 1].field1454) { // L: 116
								var3 = var6; // L: 117
								break; // L: 118
							}

							var4 = var6 + 1; // L: 121
						}
					} while(var4 <= var5); // L: 128
				}

				if (var3 != this.field1525) { // L: 130
					this.field1525 = var3; // L: 131
					this.field1520 = true; // L: 132
				}

				return this.field1525; // L: 134
			} else {
				return -1; // L: 97
			}
		} else {
			return this.field1525; // L: 94
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(FI)Lem;",
		garbageValue = "-1801908826"
	)
	class124 method2969(float var1) {
		int var2 = this.method2968(var1); // L: 138
		return var2 >= 0 && var2 < this.field1509.length ? this.field1509[var2] : null; // L: 139 140 143
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2020997465"
	)
	int method2970() {
		return this.field1509 == null ? 0 : this.field1509.length; // L: 148 149
	}
}
