import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public class class132 {
	@ObfuscatedName("aq")
	boolean field1565;
	@ObfuscatedName("aw")
	boolean field1555;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	class130 field1557;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	class130 field1574;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Leo;"
	)
	class127[] field1559;
	@ObfuscatedName("as")
	boolean field1560;
	@ObfuscatedName("aa")
	float field1561;
	@ObfuscatedName("az")
	float field1556;
	@ObfuscatedName("ao")
	float field1563;
	@ObfuscatedName("au")
	float field1564;
	@ObfuscatedName("ak")
	float field1562;
	@ObfuscatedName("ah")
	float field1566;
	@ObfuscatedName("aj")
	float field1567;
	@ObfuscatedName("af")
	float field1569;
	@ObfuscatedName("ax")
	float field1573;
	@ObfuscatedName("an")
	float field1570;
	@ObfuscatedName("ag")
	boolean field1571;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -493396629
	)
	int field1572;
	@ObfuscatedName("ad")
	float[] field1558;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 643966185
	)
	int field1568;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -232735027
	)
	int field1575;
	@ObfuscatedName("ae")
	float field1576;
	@ObfuscatedName("ac")
	float field1577;

	class132() {
		this.field1571 = true; // L: 24
		this.field1572 = 0; // L: 25
	} // L: 32

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;IB)I",
		garbageValue = "-26"
	)
	int method3099(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort(); // L: 35
		class218.method4258(var1.readUnsignedByte()); // L: 36
		int var5 = var1.readUnsignedByte(); // L: 38
		class130 var6 = (class130)class356.findEnumerated(class328.method6344(), var5); // L: 40
		if (var6 == null) { // L: 41
			var6 = class130.field1548;
		}

		this.field1557 = var6; // L: 44
		int var7 = var1.readUnsignedByte(); // L: 46
		class130 var8 = (class130)class356.findEnumerated(class328.method6344(), var7); // L: 48
		if (var8 == null) { // L: 49
			var8 = class130.field1548;
		}

		this.field1574 = var8; // L: 52
		this.field1565 = var1.readUnsignedByte() != 0; // L: 53
		this.field1559 = new class127[var3]; // L: 54
		class127 var11 = null; // L: 55

		for (int var9 = 0; var9 < var3; ++var9) { // L: 56
			class127 var10 = new class127(); // L: 57
			var10.method2994(var1, var2); // L: 58
			this.field1559[var9] = var10; // L: 59
			if (var11 != null) { // L: 60
				var11.field1505 = var10; // L: 61
			}

			var11 = var10; // L: 63
		}

		return var3; // L: 65
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	void method3100() {
		this.field1568 = this.field1559[0].field1501; // L: 69
		this.field1575 = this.field1559[this.method3091() - 1].field1501; // L: 70
		this.field1558 = new float[this.method3084() + 1]; // L: 72

		for (int var1 = this.method3086(); var1 <= this.method3101(); ++var1) { // L: 73
			this.field1558[var1 - this.method3086()] = Tile.method5276(this, (float)var1); // L: 74
		}

		this.field1559 = null; // L: 76
		this.field1576 = Tile.method5276(this, (float)(this.method3086() - 1)); // L: 78
		this.field1577 = Tile.method5276(this, (float)(this.method3101() + 1)); // L: 79
	} // L: 80

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "848750842"
	)
	public float method3085(int var1) {
		if (var1 < this.method3086()) { // L: 84
			return this.field1576;
		} else {
			return var1 > this.method3101() ? this.field1577 : this.field1558[var1 - this.method3086()]; // L: 87 88 90
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-125"
	)
	int method3086() {
		return this.field1568; // L: 95
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1086345403"
	)
	int method3101() {
		return this.field1575; // L: 99
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2017937444"
	)
	int method3084() {
		return this.method3101() - this.method3086(); // L: 103
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "-1790231226"
	)
	int method3089(float var1) {
		if (this.field1572 < 0 || (float)this.field1559[this.field1572].field1501 > var1 || this.field1559[this.field1572].field1505 != null && (float)this.field1559[this.field1572].field1505.field1501 <= var1) { // L: 107
			if (var1 >= (float)this.method3086() && var1 <= (float)this.method3101()) { // L: 110
				int var2 = this.method3091(); // L: 113
				int var3 = this.field1572; // L: 114
				if (var2 > 0) { // L: 115
					int var4 = 0; // L: 116
					int var5 = var2 - 1; // L: 117

					do {
						int var6 = var4 + var5 >> 1; // L: 119
						if (var1 < (float)this.field1559[var6].field1501) { // L: 120
							if (var1 > (float)this.field1559[var6 - 1].field1501) { // L: 121
								var3 = var6 - 1; // L: 122
								break;
							}

							var5 = var6 - 1; // L: 126
						} else {
							if (var1 <= (float)this.field1559[var6].field1501) { // L: 129
								var3 = var6; // L: 139
								break; // L: 140
							}

							if (var1 < (float)this.field1559[var6 + 1].field1501) { // L: 130
								var3 = var6; // L: 131
								break; // L: 132
							}

							var4 = var6 + 1; // L: 135
						}
					} while(var4 <= var5); // L: 142
				}

				if (var3 != this.field1572) { // L: 144
					this.field1572 = var3; // L: 145
					this.field1571 = true; // L: 146
				}

				return this.field1572; // L: 148
			} else {
				return -1; // L: 111
			}
		} else {
			return this.field1572; // L: 108
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(FI)Leo;",
		garbageValue = "1624046263"
	)
	class127 method3090(float var1) {
		int var2 = this.method3089(var1); // L: 152
		return var2 >= 0 && var2 < this.field1559.length ? this.field1559[var2] : null; // L: 153 154 157
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "12"
	)
	int method3091() {
		return this.field1559 == null ? 0 : this.field1559.length; // L: 162 163
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "306288239"
	)
	public static void method3109() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 85
	} // L: 86
}
