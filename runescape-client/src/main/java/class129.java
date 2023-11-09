import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class class129 {
	@ObfuscatedName("at")
	boolean field1516;
	@ObfuscatedName("an")
	boolean field1505;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	class127 field1506;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	class127 field1507;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lex;"
	)
	class124[] field1510;
	@ObfuscatedName("ap")
	boolean field1508;
	@ObfuscatedName("ab")
	float field1519;
	@ObfuscatedName("ak")
	float field1511;
	@ObfuscatedName("ae")
	float field1522;
	@ObfuscatedName("af")
	float field1504;
	@ObfuscatedName("ao")
	float field1514;
	@ObfuscatedName("aa")
	float field1515;
	@ObfuscatedName("aj")
	float field1509;
	@ObfuscatedName("ad")
	float field1512;
	@ObfuscatedName("ac")
	float field1518;
	@ObfuscatedName("ag")
	float field1527;
	@ObfuscatedName("ar")
	boolean field1520;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1411924841
	)
	int field1521;
	@ObfuscatedName("az")
	float[] field1517;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1731513771
	)
	int field1523;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 854413591
	)
	int field1524;
	@ObfuscatedName("aq")
	float field1525;
	@ObfuscatedName("aw")
	float field1526;

	class129() {
		this.field1520 = true; // L: 24
		this.field1521 = 0; // L: 25
	} // L: 32

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)I",
		garbageValue = "1263530556"
	)
	int method2976(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort(); // L: 35
		UserComparator5.method2865(var1.readUnsignedByte()); // L: 36
		this.field1506 = class90.method2279(var1.readUnsignedByte()); // L: 37
		this.field1507 = class90.method2279(var1.readUnsignedByte()); // L: 38
		this.field1516 = var1.readUnsignedByte() != 0; // L: 39
		this.field1510 = new class124[var3]; // L: 40
		class124 var4 = null; // L: 41

		for (int var5 = 0; var5 < var3; ++var5) { // L: 42
			class124 var6 = new class124(); // L: 43
			var6.method2901(var1, var2); // L: 44
			this.field1510[var5] = var6; // L: 45
			if (var4 != null) { // L: 46
				var4.field1460 = var6; // L: 47
			}

			var4 = var6; // L: 49
		}

		return var3; // L: 51
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1311556489"
	)
	void method2986() {
		this.field1523 = this.field1510[0].field1457; // L: 55
		this.field1524 = this.field1510[this.method2981() - 1].field1457; // L: 56
		this.field1517 = new float[this.method2985() + 1]; // L: 58

		for (int var1 = this.method2974(); var1 <= this.method3000(); ++var1) { // L: 59
			this.field1517[var1 - this.method2974()] = class130.method3002(this, (float)var1); // L: 60
		}

		this.field1510 = null; // L: 62
		this.field1525 = class130.method3002(this, (float)(this.method2974() - 1)); // L: 64
		this.field1526 = class130.method3002(this, (float)(this.method3000() + 1)); // L: 65
	} // L: 66

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1736495931"
	)
	public float method2975(int var1) {
		if (var1 < this.method2974()) { // L: 70
			return this.field1525; // L: 71
		} else {
			return var1 > this.method3000() ? this.field1526 : this.field1517[var1 - this.method2974()]; // L: 73 74 76
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "53"
	)
	int method2974() {
		return this.field1523; // L: 81
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2116116780"
	)
	int method3000() {
		return this.field1524; // L: 85
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	int method2985() {
		return this.method3000() - this.method2974(); // L: 89
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "1020771596"
	)
	int method2979(float var1) {
		if (this.field1521 < 0 || (float)this.field1510[this.field1521].field1457 > var1 || this.field1510[this.field1521].field1460 != null && (float)this.field1510[this.field1521].field1460.field1457 <= var1) { // L: 93
			if (var1 >= (float)this.method2974() && var1 <= (float)this.method3000()) { // L: 96
				int var2 = this.method2981(); // L: 99
				int var3 = this.field1521; // L: 100
				if (var2 > 0) { // L: 101
					int var4 = 0; // L: 102
					int var5 = var2 - 1; // L: 103

					do {
						int var6 = var4 + var5 >> 1; // L: 105
						if (var1 < (float)this.field1510[var6].field1457) { // L: 106
							if (var1 > (float)this.field1510[var6 - 1].field1457) { // L: 107
								var3 = var6 - 1; // L: 108
								break;
							}

							var5 = var6 - 1; // L: 112
						} else {
							if (var1 <= (float)this.field1510[var6].field1457) { // L: 115
								var3 = var6; // L: 125
								break; // L: 126
							}

							if (var1 < (float)this.field1510[var6 + 1].field1457) { // L: 116
								var3 = var6; // L: 117
								break; // L: 118
							}

							var4 = var6 + 1; // L: 121
						}
					} while(var4 <= var5); // L: 128
				}

				if (var3 != this.field1521) { // L: 130
					this.field1521 = var3; // L: 131
					this.field1520 = true; // L: 132
				}

				return this.field1521; // L: 134
			} else {
				return -1; // L: 97
			}
		} else {
			return this.field1521; // L: 94
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(FB)Lex;",
		garbageValue = "121"
	)
	class124 method2980(float var1) {
		int var2 = this.method2979(var1); // L: 138
		return var2 >= 0 && var2 < this.field1510.length ? this.field1510[var2] : null; // L: 139 140 143
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1739870079"
	)
	int method2981() {
		return this.field1510 == null ? 0 : this.field1510.length; // L: 148 149
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1861125214"
	)
	static final void method3001(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 10972
		int var7 = var3 - var1; // L: 10973
		int var8 = var6 >= 0 ? var6 : -var6; // L: 10974
		int var9 = var7 >= 0 ? var7 : -var7; // L: 10975
		int var10 = var8; // L: 10976
		if (var8 < var9) { // L: 10977
			var10 = var9;
		}

		if (var10 != 0) { // L: 10978
			int var11 = (var6 << 16) / var10; // L: 10979
			int var12 = (var7 << 16) / var10; // L: 10980
			if (var12 <= var11) { // L: 10981
				var11 = -var11;
			} else {
				var12 = -var12; // L: 10982
			}

			int var13 = var5 * var12 >> 17; // L: 10983
			int var14 = var5 * var12 + 1 >> 17; // L: 10984
			int var15 = var5 * var11 >> 17; // L: 10985
			int var16 = var5 * var11 + 1 >> 17; // L: 10986
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 10987
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 10988
			int var17 = var0 + var13; // L: 10989
			int var18 = var0 - var14; // L: 10990
			int var19 = var0 + var6 - var14; // L: 10991
			int var20 = var0 + var6 + var13; // L: 10992
			int var21 = var15 + var1; // L: 10993
			int var22 = var1 - var16; // L: 10994
			int var23 = var7 + var1 - var16; // L: 10995
			int var24 = var15 + var7 + var1; // L: 10996
			Rasterizer3D.method4407(var17, var18, var19); // L: 10997
			Rasterizer3D.method4390(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4); // L: 10998
			Rasterizer3D.method4407(var17, var19, var20); // L: 10999
			Rasterizer3D.method4390(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4); // L: 11000
		}
	} // L: 11001
}
