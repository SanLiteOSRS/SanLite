import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class130 {
	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("au")
	boolean field1563;
	@ObfuscatedName("ae")
	boolean field1548;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	class128 field1549;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	class128 field1571;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Leg;"
	)
	class125[] field1551;
	@ObfuscatedName("ai")
	boolean field1550;
	@ObfuscatedName("az")
	float field1553;
	@ObfuscatedName("ap")
	float field1554;
	@ObfuscatedName("aa")
	float field1555;
	@ObfuscatedName("af")
	float field1556;
	@ObfuscatedName("ad")
	float field1557;
	@ObfuscatedName("aq")
	float field1552;
	@ObfuscatedName("al")
	float field1572;
	@ObfuscatedName("an")
	float field1560;
	@ObfuscatedName("ar")
	float field1561;
	@ObfuscatedName("ab")
	float field1547;
	@ObfuscatedName("ag")
	boolean field1564;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -284538355
	)
	int field1562;
	@ObfuscatedName("ax")
	float[] field1565;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 616833209
	)
	int field1566;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1839145601
	)
	int field1567;
	@ObfuscatedName("ay")
	float field1568;
	@ObfuscatedName("aj")
	float field1558;

	class130() {
		this.field1564 = true; // L: 24
		this.field1562 = 0; // L: 25
	} // L: 32

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;IB)I",
		garbageValue = "-47"
	)
	int method2992(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort(); // L: 35
		int var4 = var1.readUnsignedByte(); // L: 36
		class138[] var5 = new class138[]{class138.field1635, class138.field1633, class138.field1634, class138.field1638, class138.field1636, class138.field1637, class138.field1632, class138.field1639, class138.field1640}; // L: 40
		class138 var6 = (class138)class25.findEnumerated(var5, var4); // L: 42
		if (var6 == null) { // L: 43
			var6 = class138.field1640;
		}

		this.field1549 = ArchiveLoader.method2253(var1.readUnsignedByte()); // L: 45
		this.field1571 = ArchiveLoader.method2253(var1.readUnsignedByte()); // L: 46
		this.field1563 = var1.readUnsignedByte() != 0; // L: 47
		this.field1551 = new class125[var3]; // L: 48
		class125 var9 = null; // L: 49

		for (int var8 = 0; var8 < var3; ++var8) { // L: 50
			class125 var7 = new class125(); // L: 51
			var7.method2924(var1, var2); // L: 52
			this.field1551[var8] = var7; // L: 53
			if (var9 != null) { // L: 54
				var9.field1498 = var7; // L: 55
			}

			var9 = var7; // L: 57
		}

		return var3; // L: 59
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-1069"
	)
	void method2993() {
		this.field1566 = this.field1551[0].field1492; // L: 63
		this.field1567 = this.field1551[this.method3000() - 1].field1492; // L: 64
		this.field1565 = new float[this.method3024() + 1]; // L: 66

		for (int var1 = this.method2995(); var1 <= this.method2991(); ++var1) { // L: 67
			this.field1565[var1 - this.method2995()] = Skeleton.method4516(this, (float)var1); // L: 68
		}

		this.field1551 = null; // L: 70
		this.field1568 = Skeleton.method4516(this, (float)(this.method2995() - 1)); // L: 72
		this.field1558 = Skeleton.method4516(this, (float)(this.method2991() + 1)); // L: 73
	} // L: 74

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "-13"
	)
	public float method2994(int var1) {
		if (var1 < this.method2995()) { // L: 78
			return this.field1568; // L: 79
		} else {
			return var1 > this.method2991() ? this.field1558 : this.field1565[var1 - this.method2995()]; // L: 81 82 84
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1409378084"
	)
	int method2995() {
		return this.field1566; // L: 89
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1371661145"
	)
	int method2991() {
		return this.field1567; // L: 93
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1808269392"
	)
	int method3024() {
		return this.method2991() - this.method2995(); // L: 97
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(FB)I",
		garbageValue = "116"
	)
	int method3019(float var1) {
		if (this.field1562 < 0 || (float)this.field1551[this.field1562].field1492 > var1 || this.field1551[this.field1562].field1498 != null && (float)this.field1551[this.field1562].field1498.field1492 <= var1) { // L: 101
			if (var1 >= (float)this.method2995() && var1 <= (float)this.method2991()) { // L: 104
				int var2 = this.method3000(); // L: 107
				int var3 = this.field1562; // L: 108
				if (var2 > 0) { // L: 109
					int var4 = 0; // L: 110
					int var5 = var2 - 1; // L: 111

					do {
						int var6 = var5 + var4 >> 1; // L: 113
						if (var1 < (float)this.field1551[var6].field1492) { // L: 114
							if (var1 > (float)this.field1551[var6 - 1].field1492) { // L: 115
								var3 = var6 - 1; // L: 116
								break;
							}

							var5 = var6 - 1; // L: 120
						} else {
							if (var1 <= (float)this.field1551[var6].field1492) { // L: 123
								var3 = var6; // L: 133
								break; // L: 134
							}

							if (var1 < (float)this.field1551[var6 + 1].field1492) { // L: 124
								var3 = var6; // L: 125
								break; // L: 126
							}

							var4 = var6 + 1; // L: 129
						}
					} while(var4 <= var5); // L: 136
				}

				if (var3 != this.field1562) { // L: 138
					this.field1562 = var3; // L: 139
					this.field1564 = true; // L: 140
				}

				return this.field1562; // L: 142
			} else {
				return -1; // L: 105
			}
		} else {
			return this.field1562; // L: 102
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FI)Leg;",
		garbageValue = "1942643085"
	)
	class125 method2999(float var1) {
		int var2 = this.method3019(var1); // L: 146
		return var2 >= 0 && var2 < this.field1551.length ? this.field1551[var2] : null; // L: 147 148 151
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1392526079"
	)
	int method3000() {
		return this.field1551 == null ? 0 : this.field1551.length; // L: 156 157
	}
}
