import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class132 {
	@ObfuscatedName("ac")
	boolean field1558;
	@ObfuscatedName("al")
	boolean field1548;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	class130 field1547;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	class130 field1553;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lef;"
	)
	class127[] field1541;
	@ObfuscatedName("ah")
	boolean field1556;
	@ObfuscatedName("ar")
	float field1543;
	@ObfuscatedName("ab")
	float field1544;
	@ObfuscatedName("am")
	float field1545;
	@ObfuscatedName("av")
	float field1546;
	@ObfuscatedName("ag")
	float field1538;
	@ObfuscatedName("aa")
	float field1542;
	@ObfuscatedName("ap")
	float field1549;
	@ObfuscatedName("ay")
	float field1550;
	@ObfuscatedName("as")
	float field1551;
	@ObfuscatedName("aj")
	float field1554;
	@ObfuscatedName("an")
	boolean field1552;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 801900729
	)
	int field1539;
	@ObfuscatedName("ai")
	float[] field1555;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -742290347
	)
	int field1537;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -912700741
	)
	int field1557;
	@ObfuscatedName("aq")
	float field1540;
	@ObfuscatedName("az")
	float field1559;

	class132() {
		this.field1552 = true; // L: 24
		this.field1539 = 0; // L: 25
	} // L: 32

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;II)I",
		garbageValue = "-1968596819"
	)
	int method3029(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort(); // L: 35
		AbstractByteArrayCopier.method6759(var1.readUnsignedByte()); // L: 36
		int var5 = var1.readUnsignedByte(); // L: 38
		class130 var6 = (class130)SequenceDefinition.findEnumerated(class186.method3601(), var5); // L: 40
		if (var6 == null) { // L: 41
			var6 = class130.field1524;
		}

		this.field1547 = var6; // L: 44
		int var7 = var1.readUnsignedByte(); // L: 46
		class130 var8 = (class130)SequenceDefinition.findEnumerated(class186.method3601(), var7); // L: 48
		if (var8 == null) { // L: 49
			var8 = class130.field1524;
		}

		this.field1553 = var8; // L: 52
		this.field1558 = var1.readUnsignedByte() != 0; // L: 53
		this.field1541 = new class127[var3]; // L: 54
		class127 var11 = null; // L: 55

		for (int var9 = 0; var9 < var3; ++var9) { // L: 56
			class127 var10 = new class127(); // L: 57
			var10.method2943(var1, var2); // L: 58
			this.field1541[var9] = var10; // L: 59
			if (var11 != null) { // L: 60
				var11.field1493 = var10; // L: 61
			}

			var11 = var10; // L: 63
		}

		return var3; // L: 65
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "25701091"
	)
	void method3021() {
		this.field1537 = this.field1541[0].field1492; // L: 69
		this.field1557 = this.field1541[this.method3017() - 1].field1492; // L: 70
		this.field1555 = new float[this.method3023() + 1]; // L: 72

		for (int var1 = this.method3018(); var1 <= this.method3020(); ++var1) { // L: 73
			this.field1555[var1 - this.method3018()] = class183.method3586(this, (float)var1); // L: 74
		}

		this.field1541 = null; // L: 76
		this.field1540 = class183.method3586(this, (float)(this.method3018() - 1)); // L: 78
		this.field1559 = class183.method3586(this, (float)(this.method3020() + 1)); // L: 79
	} // L: 80

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-1862749488"
	)
	public float method3022(int var1) {
		if (var1 < this.method3018()) { // L: 84
			return this.field1540; // L: 85
		} else {
			return var1 > this.method3020() ? this.field1559 : this.field1555[var1 - this.method3018()]; // L: 87 88 90
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "103"
	)
	int method3018() {
		return this.field1537; // L: 95
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "115"
	)
	int method3020() {
		return this.field1557; // L: 99
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	int method3023() {
		return this.method3020() - this.method3018(); // L: 103
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "1249933275"
	)
	int method3024(float var1) {
		if (this.field1539 < 0 || (float)this.field1541[this.field1539].field1492 > var1 || this.field1541[this.field1539].field1493 != null && (float)this.field1541[this.field1539].field1493.field1492 <= var1) { // L: 107
			if (var1 >= (float)this.method3018() && var1 <= (float)this.method3020()) { // L: 110
				int var2 = this.method3017(); // L: 113
				int var3 = this.field1539; // L: 114
				if (var2 > 0) { // L: 115
					int var4 = 0; // L: 116
					int var5 = var2 - 1; // L: 117

					do {
						int var6 = var5 + var4 >> 1; // L: 119
						if (var1 < (float)this.field1541[var6].field1492) { // L: 120
							if (var1 > (float)this.field1541[var6 - 1].field1492) { // L: 121
								var3 = var6 - 1; // L: 122
								break;
							}

							var5 = var6 - 1; // L: 126
						} else {
							if (var1 <= (float)this.field1541[var6].field1492) { // L: 129
								var3 = var6; // L: 139
								break; // L: 140
							}

							if (var1 < (float)this.field1541[var6 + 1].field1492) { // L: 130
								var3 = var6; // L: 131
								break; // L: 132
							}

							var4 = var6 + 1; // L: 135
						}
					} while(var4 <= var5); // L: 142
				}

				if (var3 != this.field1539) { // L: 144
					this.field1539 = var3; // L: 145
					this.field1552 = true; // L: 146
				}

				return this.field1539; // L: 148
			} else {
				return -1; // L: 111
			}
		} else {
			return this.field1539; // L: 108
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FB)Lef;",
		garbageValue = "6"
	)
	class127 method3030(float var1) {
		int var2 = this.method3024(var1); // L: 152
		return var2 >= 0 && var2 < this.field1541.length ? this.field1541[var2] : null; // L: 153 154 157
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2119570978"
	)
	int method3017() {
		return this.field1541 == null ? 0 : this.field1541.length; // L: 162 163
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1742739576"
	)
	public static int method3046(int var0, int var1) {
		return (var0 << 8) + var1; // L: 14
	}
}
