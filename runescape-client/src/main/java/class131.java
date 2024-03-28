import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class131 {
	@ObfuscatedName("az")
	boolean field1558;
	@ObfuscatedName("ah")
	boolean field1559;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	class129 field1573;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	class129 field1561;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Leg;"
	)
	class126[] field1562;
	@ObfuscatedName("ao")
	boolean field1563;
	@ObfuscatedName("ab")
	float field1560;
	@ObfuscatedName("aw")
	float field1565;
	@ObfuscatedName("ad")
	float field1581;
	@ObfuscatedName("al")
	float field1580;
	@ObfuscatedName("as")
	float field1564;
	@ObfuscatedName("ag")
	float field1569;
	@ObfuscatedName("ai")
	float field1577;
	@ObfuscatedName("ax")
	float field1571;
	@ObfuscatedName("ar")
	float field1572;
	@ObfuscatedName("aj")
	float field1570;
	@ObfuscatedName("au")
	boolean field1574;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 744600689
	)
	int field1575;
	@ObfuscatedName("ap")
	float[] field1576;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1552902251
	)
	int field1579;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1360708771
	)
	int field1578;
	@ObfuscatedName("aq")
	float field1567;
	@ObfuscatedName("am")
	float field1568;

	class131() {
		this.field1574 = true; // L: 24
		this.field1575 = 0; // L: 25
	} // L: 32

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;IB)I",
		garbageValue = "0"
	)
	int method3017(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort(); // L: 35
		class135.method3074(var1.readUnsignedByte()); // L: 36
		int var5 = var1.readUnsignedByte(); // L: 38
		class129 var6 = (class129)KitDefinition.findEnumerated(class60.method1135(), var5); // L: 40
		if (var6 == null) { // L: 41
			var6 = class129.field1548;
		}

		this.field1573 = var6; // L: 44
		int var7 = var1.readUnsignedByte(); // L: 46
		class129 var8 = (class129)KitDefinition.findEnumerated(class60.method1135(), var7); // L: 48
		if (var8 == null) { // L: 49
			var8 = class129.field1548;
		}

		this.field1561 = var8; // L: 52
		this.field1558 = var1.readUnsignedByte() != 0; // L: 53
		this.field1562 = new class126[var3]; // L: 54
		class126 var11 = null; // L: 55

		for (int var9 = 0; var9 < var3; ++var9) { // L: 56
			class126 var10 = new class126(); // L: 57
			var10.method2945(var1, var2); // L: 58
			this.field1562[var9] = var10; // L: 59
			if (var11 != null) { // L: 60
				var11.field1515 = var10; // L: 61
			}

			var11 = var10; // L: 63
		}

		return var3; // L: 65
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "582132918"
	)
	void method3018() {
		this.field1579 = this.field1562[0].field1512; // L: 69
		this.field1578 = this.field1562[this.method3020() - 1].field1512; // L: 70
		this.field1576 = new float[this.method3022() + 1]; // L: 72

		for (int var1 = this.method3033(); var1 <= this.method3016(); ++var1) { // L: 73
			this.field1576[var1 - this.method3033()] = class406.method7449(this, (float)var1); // L: 74
		}

		this.field1562 = null; // L: 76
		this.field1567 = class406.method7449(this, (float)(this.method3033() - 1)); // L: 78
		this.field1568 = class406.method7449(this, (float)(this.method3016() + 1)); // L: 79
	} // L: 80

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "33410223"
	)
	public float method3025(int var1) {
		if (var1 < this.method3033()) { // L: 84
			return this.field1567; // L: 85
		} else {
			return var1 > this.method3016() ? this.field1568 : this.field1576[var1 - this.method3033()]; // L: 87 88 90
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-49258900"
	)
	int method3033() {
		return this.field1579; // L: 95
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "4"
	)
	int method3016() {
		return this.field1578; // L: 99
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1004983097"
	)
	int method3022() {
		return this.method3016() - this.method3033(); // L: 103
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FB)I",
		garbageValue = "14"
	)
	int method3036(float var1) {
		if (this.field1575 < 0 || (float)this.field1562[this.field1575].field1512 > var1 || this.field1562[this.field1575].field1515 != null && (float)this.field1562[this.field1575].field1515.field1512 <= var1) { // L: 107
			if (var1 >= (float)this.method3033() && var1 <= (float)this.method3016()) { // L: 110
				int var2 = this.method3020(); // L: 113
				int var3 = this.field1575; // L: 114
				if (var2 > 0) { // L: 115
					int var4 = 0; // L: 116
					int var5 = var2 - 1; // L: 117

					do {
						int var6 = var4 + var5 >> 1; // L: 119
						if (var1 < (float)this.field1562[var6].field1512) { // L: 120
							if (var1 > (float)this.field1562[var6 - 1].field1512) { // L: 121
								var3 = var6 - 1; // L: 122
								break;
							}

							var5 = var6 - 1; // L: 126
						} else {
							if (var1 <= (float)this.field1562[var6].field1512) { // L: 129
								var3 = var6; // L: 139
								break; // L: 140
							}

							if (var1 < (float)this.field1562[var6 + 1].field1512) { // L: 130
								var3 = var6; // L: 131
								break; // L: 132
							}

							var4 = var6 + 1; // L: 135
						}
					} while(var4 <= var5); // L: 142
				}

				if (var3 != this.field1575) { // L: 144
					this.field1575 = var3; // L: 145
					this.field1574 = true; // L: 146
				}

				return this.field1575; // L: 148
			} else {
				return -1; // L: 111
			}
		} else {
			return this.field1575; // L: 108
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FB)Leg;",
		garbageValue = "1"
	)
	class126 method3035(float var1) {
		int var2 = this.method3036(var1); // L: 152
		return var2 >= 0 && var2 < this.field1562.length ? this.field1562[var2] : null; // L: 153 154 157
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "34"
	)
	int method3020() {
		return this.field1562 == null ? 0 : this.field1562.length; // L: 162 163
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(I)Lps;",
		garbageValue = "-2118995919"
	)
	public static NodeDeque method3048() {
		return Client.scriptEvents; // L: 5164
	}
}
