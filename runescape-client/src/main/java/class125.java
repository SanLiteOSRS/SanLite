import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public class class125 {
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = -1010818347
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("af")
	boolean field1523;
	@ObfuscatedName("an")
	boolean field1508;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	class123 field1512;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	class123 field1528;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lev;"
	)
	class120[] field1511;
	@ObfuscatedName("ab")
	boolean field1509;
	@ObfuscatedName("aq")
	float field1513;
	@ObfuscatedName("al")
	float field1521;
	@ObfuscatedName("at")
	float field1515;
	@ObfuscatedName("aa")
	float field1516;
	@ObfuscatedName("ay")
	float field1529;
	@ObfuscatedName("ao")
	float field1518;
	@ObfuscatedName("ax")
	float field1519;
	@ObfuscatedName("ai")
	float field1520;
	@ObfuscatedName("ag")
	float field1517;
	@ObfuscatedName("ah")
	float field1522;
	@ObfuscatedName("av")
	boolean field1524;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1335067433
	)
	int field1514;
	@ObfuscatedName("am")
	float[] field1525;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1357454691
	)
	int field1526;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -26337941
	)
	int field1527;
	@ObfuscatedName("ak")
	float field1507;
	@ObfuscatedName("az")
	float field1510;

	class125() {
		this.field1524 = true;
		this.field1514 = 0;
	} // L: 32

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsg;IB)I",
		garbageValue = "-26"
	)
	int method3060(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort(); // L: 35
		class160.method3440(var1.readUnsignedByte()); // L: 36
		this.field1512 = LoginScreenAnimation.method2424(var1.readUnsignedByte()); // L: 37
		this.field1528 = LoginScreenAnimation.method2424(var1.readUnsignedByte()); // L: 38
		this.field1523 = var1.readUnsignedByte() != 0; // L: 39
		this.field1511 = new class120[var3]; // L: 40
		class120 var4 = null; // L: 41

		for (int var5 = 0; var5 < var3; ++var5) { // L: 42
			class120 var6 = new class120(); // L: 43
			var6.method2974(var1, var2); // L: 44
			this.field1511[var5] = var6; // L: 45
			if (var4 != null) { // L: 46
				var4.field1454 = var6; // L: 47
			}

			var4 = var6; // L: 49
		}

		return var3; // L: 51
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-83613992"
	)
	void method3083() {
		this.field1526 = this.field1511[0].field1452; // L: 55
		this.field1527 = this.field1511[this.method3068() - 1].field1452; // L: 56
		this.field1525 = new float[this.method3072() + 1]; // L: 58

		for (int var1 = this.method3063(); var1 <= this.method3085(); ++var1) { // L: 59
			this.field1525[var1 - this.method3063()] = GrandExchangeEvent.method6858(this, (float)var1); // L: 60
		}

		this.field1511 = null; // L: 62
		this.field1507 = GrandExchangeEvent.method6858(this, (float)(this.method3063() - 1)); // L: 64
		this.field1510 = GrandExchangeEvent.method6858(this, (float)(this.method3085() + 1)); // L: 65
	} // L: 66

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-1700300783"
	)
	public float method3062(int var1) {
		if (var1 < this.method3063()) { // L: 70
			return this.field1507; // L: 71
		} else {
			return var1 > this.method3085() ? this.field1510 : this.field1525[var1 - this.method3063()]; // L: 73 74 76
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1432792045"
	)
	int method3063() {
		return this.field1526; // L: 81
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2111419338"
	)
	int method3085() {
		return this.field1527; // L: 85
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1952353527"
	)
	int method3072() {
		return this.method3085() - this.method3063(); // L: 89
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "-485646814"
	)
	int method3066(float var1) {
		if (this.field1514 < 0 || (float)this.field1511[this.field1514].field1452 > var1 || this.field1511[this.field1514].field1454 != null && (float)this.field1511[this.field1514].field1454.field1452 <= var1) { // L: 93
			if (var1 >= (float)this.method3063() && var1 <= (float)this.method3085()) { // L: 96
				int var2 = this.method3068(); // L: 99
				int var3 = this.field1514; // L: 100
				if (var2 > 0) { // L: 101
					int var4 = 0; // L: 102
					int var5 = var2 - 1; // L: 103

					do {
						int var6 = var4 + var5 >> 1; // L: 105
						if (var1 < (float)this.field1511[var6].field1452) { // L: 106
							if (var1 > (float)this.field1511[var6 - 1].field1452) { // L: 107
								var3 = var6 - 1; // L: 108
								break;
							}

							var5 = var6 - 1; // L: 112
						} else {
							if (var1 <= (float)this.field1511[var6].field1452) { // L: 115
								var3 = var6; // L: 125
								break; // L: 126
							}

							if (var1 < (float)this.field1511[var6 + 1].field1452) { // L: 116
								var3 = var6; // L: 117
								break; // L: 118
							}

							var4 = var6 + 1; // L: 121
						}
					} while(var4 <= var5); // L: 128
				}

				if (var3 != this.field1514) { // L: 130
					this.field1514 = var3; // L: 131
					this.field1524 = true; // L: 132
				}

				return this.field1514; // L: 134
			} else {
				return -1; // L: 97
			}
		} else {
			return this.field1514; // L: 94
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FI)Lev;",
		garbageValue = "692284858"
	)
	class120 method3067(float var1) {
		int var2 = this.method3066(var1); // L: 138
		return var2 >= 0 && var2 < this.field1511.length ? this.field1511[var2] : null; // L: 139 140 143
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-24242"
	)
	int method3068() {
		return this.field1511 == null ? 0 : this.field1511.length; // L: 148 149
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lsz;",
		garbageValue = "1883775054"
	)
	public static class483 method3093(int var0) {
		class483 var1 = (class483)class483.DBRowType_cache.get((long)var0); // L: 24
		if (var1 != null) { // L: 25
			return var1;
		} else {
			byte[] var2 = class483.field4968.takeFile(38, var0); // L: 26
			var1 = new class483(); // L: 27
			if (var2 != null) { // L: 28
				var1.method8958(new Buffer(var2));
			}

			var1.method8961(); // L: 29
			class483.DBRowType_cache.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}
}
