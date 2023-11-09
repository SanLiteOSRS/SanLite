import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
public class class130 {
	@ObfuscatedName("ai")
	boolean field1531;
	@ObfuscatedName("aj")
	boolean field1542;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	class128 field1532;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	class128 field1544;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Ley;"
	)
	class125[] field1534;
	@ObfuscatedName("ap")
	boolean field1535;
	@ObfuscatedName("av")
	float field1536;
	@ObfuscatedName("an")
	float field1537;
	@ObfuscatedName("au")
	float field1538;
	@ObfuscatedName("az")
	float field1549;
	@ObfuscatedName("ab")
	float field1540;
	@ObfuscatedName("ao")
	float field1541;
	@ObfuscatedName("as")
	float field1545;
	@ObfuscatedName("am")
	float field1543;
	@ObfuscatedName("ag")
	float field1530;
	@ObfuscatedName("aa")
	float field1533;
	@ObfuscatedName("ar")
	boolean field1546;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1489994659
	)
	int field1547;
	@ObfuscatedName("at")
	float[] field1548;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 247904423
	)
	int field1539;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 132430485
	)
	int field1550;
	@ObfuscatedName("al")
	float field1551;
	@ObfuscatedName("aq")
	float field1552;

	class130() {
		this.field1546 = true; // L: 24
		this.field1547 = 0; // L: 25
	} // L: 32

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;IB)I",
		garbageValue = "5"
	)
	int method3076(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort(); // L: 35
		int var4 = var1.readUnsignedByte(); // L: 36
		class139[] var5 = new class139[]{class139.field1618, class139.field1626, class139.field1617, class139.field1615, class139.field1616, class139.field1612, class139.field1613, class139.field1619, class139.field1620}; // L: 40
		class139 var6 = (class139)class93.findEnumerated(var5, var4); // L: 42
		if (var6 == null) { // L: 43
			var6 = class139.field1620;
		}

		int var12 = var1.readUnsignedByte(); // L: 46
		class128[] var7 = new class128[]{class128.field1516, class128.field1519, class128.field1517, class128.field1518, class128.field1523}; // L: 50
		class128 var8 = (class128)class93.findEnumerated(var7, var12); // L: 52
		if (var8 == null) { // L: 53
			var8 = class128.field1516;
		}

		this.field1532 = var8; // L: 56
		int var13 = var1.readUnsignedByte(); // L: 58
		class128[] var9 = new class128[]{class128.field1516, class128.field1519, class128.field1517, class128.field1518, class128.field1523}; // L: 62
		class128 var10 = (class128)class93.findEnumerated(var9, var13); // L: 64
		if (var10 == null) { // L: 65
			var10 = class128.field1516;
		}

		this.field1544 = var10; // L: 68
		this.field1531 = var1.readUnsignedByte() != 0; // L: 69
		this.field1534 = new class125[var3]; // L: 70
		class125 var15 = null; // L: 71

		for (int var14 = 0; var14 < var3; ++var14) { // L: 72
			class125 var11 = new class125(); // L: 73
			var11.method2987(var1, var2); // L: 74
			this.field1534[var14] = var11; // L: 75
			if (var15 != null) { // L: 76
				var15.field1488 = var11; // L: 77
			}

			var15 = var11; // L: 79
		}

		return var3; // L: 81
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "52"
	)
	void method3059() {
		this.field1539 = this.field1534[0].field1489; // L: 85
		this.field1550 = this.field1534[this.method3085() - 1].field1489; // L: 86
		this.field1548 = new float[this.method3062() + 1]; // L: 88

		for (int var1 = this.method3083(); var1 <= this.method3070(); ++var1) { // L: 89
			this.field1548[var1 - this.method3083()] = Clock.method3657(this, (float)var1); // L: 90
		}

		this.field1534 = null; // L: 92
		this.field1551 = Clock.method3657(this, (float)(this.method3083() - 1)); // L: 94
		this.field1552 = Clock.method3657(this, (float)(this.method3070() + 1)); // L: 95
	} // L: 96

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IS)F",
		garbageValue = "255"
	)
	public float method3060(int var1) {
		if (var1 < this.method3083()) { // L: 100
			return this.field1551; // L: 101
		} else {
			return var1 > this.method3070() ? this.field1552 : this.field1548[var1 - this.method3083()]; // L: 103 104 106
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "811682719"
	)
	int method3083() {
		return this.field1539; // L: 111
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1193164478"
	)
	int method3070() {
		return this.field1550; // L: 115
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-67"
	)
	int method3062() {
		return this.method3070() - this.method3083(); // L: 119
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "-705938547"
	)
	int method3063(float var1) {
		if (this.field1547 < 0 || (float)this.field1534[this.field1547].field1489 > var1 || this.field1534[this.field1547].field1488 != null && (float)this.field1534[this.field1547].field1488.field1489 <= var1) { // L: 123
			if (var1 >= (float)this.method3083() && var1 <= (float)this.method3070()) { // L: 126
				int var2 = this.method3085(); // L: 129
				int var3 = this.field1547; // L: 130
				if (var2 > 0) { // L: 131
					int var4 = 0; // L: 132
					int var5 = var2 - 1; // L: 133

					do {
						int var6 = var4 + var5 >> 1; // L: 135
						if (var1 < (float)this.field1534[var6].field1489) { // L: 136
							if (var1 > (float)this.field1534[var6 - 1].field1489) { // L: 137
								var3 = var6 - 1; // L: 138
								break;
							}

							var5 = var6 - 1; // L: 142
						} else {
							if (var1 <= (float)this.field1534[var6].field1489) { // L: 145
								var3 = var6; // L: 155
								break; // L: 156
							}

							if (var1 < (float)this.field1534[var6 + 1].field1489) { // L: 146
								var3 = var6; // L: 147
								break; // L: 148
							}

							var4 = var6 + 1; // L: 151
						}
					} while(var4 <= var5); // L: 158
				}

				if (var3 != this.field1547) { // L: 160
					this.field1547 = var3; // L: 161
					this.field1546 = true; // L: 162
				}

				return this.field1547; // L: 164
			} else {
				return -1; // L: 127
			}
		} else {
			return this.field1547; // L: 124
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FB)Ley;",
		garbageValue = "-1"
	)
	class125 method3064(float var1) {
		int var2 = this.method3063(var1); // L: 168
		return var2 >= 0 && var2 < this.field1534.length ? this.field1534[var2] : null; // L: 169 170 173
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "25"
	)
	int method3085() {
		return this.field1534 == null ? 0 : this.field1534.length; // L: 178 179
	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-98208733"
	)
	static void method3094() {
		if (Client.oculusOrbState == 1) { // L: 12791
			Client.field596 = true; // L: 12792
		}

	} // L: 12794
}
