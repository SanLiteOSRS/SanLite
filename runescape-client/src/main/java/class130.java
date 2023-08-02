import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class130 {
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = -1809009851
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("aw")
	boolean field1532;
	@ObfuscatedName("ay")
	boolean field1533;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	class128 field1534;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	class128 field1547;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lev;"
	)
	class125[] field1536;
	@ObfuscatedName("aj")
	boolean field1543;
	@ObfuscatedName("ag")
	float field1538;
	@ObfuscatedName("az")
	float field1535;
	@ObfuscatedName("av")
	float field1540;
	@ObfuscatedName("ap")
	float field1541;
	@ObfuscatedName("aq")
	float field1542;
	@ObfuscatedName("at")
	float field1550;
	@ObfuscatedName("ah")
	float field1544;
	@ObfuscatedName("ax")
	float field1553;
	@ObfuscatedName("aa")
	float field1546;
	@ObfuscatedName("au")
	float field1537;
	@ObfuscatedName("ae")
	boolean field1548;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -98448525
	)
	int field1549;
	@ObfuscatedName("ad")
	float[] field1545;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1507953149
	)
	int field1551;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1365091723
	)
	int field1552;
	@ObfuscatedName("ak")
	float field1539;
	@ObfuscatedName("an")
	float field1554;

	class130() {
		this.field1548 = true; // L: 24
		this.field1549 = 0; // L: 25
	} // L: 32

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;IB)I",
		garbageValue = "123"
	)
	int method2991(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort(); // L: 35
		AttackOption.method2668(var1.readUnsignedByte()); // L: 36
		this.field1534 = class74.method2086(var1.readUnsignedByte()); // L: 37
		this.field1547 = class74.method2086(var1.readUnsignedByte()); // L: 38
		this.field1532 = var1.readUnsignedByte() != 0; // L: 39
		this.field1536 = new class125[var3]; // L: 40
		class125 var4 = null; // L: 41

		for (int var5 = 0; var5 < var3; ++var5) { // L: 42
			class125 var6 = new class125(); // L: 43
			var6.method2919(var1, var2); // L: 44
			this.field1536[var5] = var6; // L: 45
			if (var4 != null) { // L: 46
				var4.field1485 = var6; // L: 47
			}

			var4 = var6; // L: 49
		}

		return var3; // L: 51
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-725467027"
	)
	void method2992() {
		this.field1551 = this.field1536[0].field1483; // L: 55
		this.field1552 = this.field1536[this.method2999() - 1].field1483; // L: 56
		this.field1545 = new float[this.method2996() + 1]; // L: 58

		for (int var1 = this.method3009(); var1 <= this.method2995(); ++var1) { // L: 59
			this.field1545[var1 - this.method3009()] = ApproximateRouteStrategy.method1245(this, (float)var1); // L: 60
		}

		this.field1536 = null; // L: 62
		this.field1539 = ApproximateRouteStrategy.method1245(this, (float)(this.method3009() - 1)); // L: 64
		this.field1554 = ApproximateRouteStrategy.method1245(this, (float)(this.method2995() + 1)); // L: 65
	} // L: 66

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-1628852517"
	)
	public float method2993(int var1) {
		if (var1 < this.method3009()) { // L: 70
			return this.field1539; // L: 71
		} else {
			return var1 > this.method2995() ? this.field1554 : this.field1545[var1 - this.method3009()]; // L: 73 74 76
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	int method3009() {
		return this.field1551; // L: 81
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1597544274"
	)
	int method2995() {
		return this.field1552; // L: 85
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "606654204"
	)
	int method2996() {
		return this.method2995() - this.method3009(); // L: 89
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "1218924507"
	)
	int method2997(float var1) {
		if (this.field1549 < 0 || (float)this.field1536[this.field1549].field1483 > var1 || this.field1536[this.field1549].field1485 != null && (float)this.field1536[this.field1549].field1485.field1483 <= var1) { // L: 93
			if (var1 >= (float)this.method3009() && var1 <= (float)this.method2995()) { // L: 96
				int var2 = this.method2999(); // L: 99
				int var3 = this.field1549; // L: 100
				if (var2 > 0) { // L: 101
					int var4 = 0; // L: 102
					int var5 = var2 - 1; // L: 103

					do {
						int var6 = var4 + var5 >> 1; // L: 105
						if (var1 < (float)this.field1536[var6].field1483) { // L: 106
							if (var1 > (float)this.field1536[var6 - 1].field1483) { // L: 107
								var3 = var6 - 1; // L: 108
								break;
							}

							var5 = var6 - 1; // L: 112
						} else {
							if (var1 <= (float)this.field1536[var6].field1483) { // L: 115
								var3 = var6; // L: 125
								break; // L: 126
							}

							if (var1 < (float)this.field1536[var6 + 1].field1483) { // L: 116
								var3 = var6; // L: 117
								break; // L: 118
							}

							var4 = var6 + 1; // L: 121
						}
					} while(var4 <= var5); // L: 128
				}

				if (var3 != this.field1549) { // L: 130
					this.field1549 = var3; // L: 131
					this.field1548 = true; // L: 132
				}

				return this.field1549; // L: 134
			} else {
				return -1; // L: 97
			}
		} else {
			return this.field1549; // L: 94
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(FI)Lev;",
		garbageValue = "-487533983"
	)
	class125 method2998(float var1) {
		int var2 = this.method2997(var1); // L: 138
		return var2 >= 0 && var2 < this.field1536.length ? this.field1536[var2] : null; // L: 139 140 143
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	int method2999() {
		return this.field1536 == null ? 0 : this.field1536.length; // L: 148 149
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Llv;",
		garbageValue = "685705935"
	)
	public static PacketBufferNode method3005() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 22 23
	}
}
