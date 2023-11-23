import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
public class class404 extends AbstractQueue {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lpw;"
	)
	class402[] field4481;
	@ObfuscatedName("ah")
	Map field4479;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1698360753
	)
	int field4485;
	@ObfuscatedName("ao")
	final Comparator field4480;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1533083803
	)
	int field4483;

	public class404(int var1, Comparator var2) {
		this.field4483 = 0; // L: 10
		this.field4481 = new class402[var1]; // L: 17
		this.field4479 = new HashMap(); // L: 18
		this.field4480 = var2; // L: 19
	}

	public class404(int var1) {
		this(var1, (Comparator)null); // L: 13
	} // L: 14

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1191377810"
	)
	void method7483() {
		int var1 = (this.field4481.length << 1) + 1;
		this.field4481 = (class402[])((class402[])Arrays.copyOf(this.field4481, var1));
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1780755712"
	)
	void method7485(int var1) {
		class402 var2;
		int var3;
		for (var2 = this.field4481[var1]; var1 > 0; var1 = var3) { // L: 97 108
			var3 = var1 - 1 >>> 1; // L: 98
			class402 var4 = this.field4481[var3]; // L: 99
			if (this.field4480 != null) {
				if (this.field4480.compare(var2.field4474, var4.field4474) >= 0) { // L: 101
					break;
				}
			} else if (((Comparable)var2.field4474).compareTo(var4.field4474) >= 0) { // L: 104
				break;
			}

			this.field4481[var1] = var4;
			this.field4481[var1].field4472 = var1;
		}

		this.field4481[var1] = var2;
		this.field4481[var1].field4472 = var1; // L: 111
	} // L: 112

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1549491018"
	)
	void method7486(int var1) {
		class402 var2 = this.field4481[var1];

		int var8;
		for (int var3 = this.field4485 >>> 1; var1 < var3; var1 = var8) { // L: 118
			int var4 = (var1 << 1) + 1; // L: 119
			class402 var5 = this.field4481[var4]; // L: 120
			int var6 = (var1 << 1) + 2;
			class402 var7 = this.field4481[var6];
			if (this.field4480 != null) {
				if (var6 < this.field4485 && this.field4480.compare(var5.field4474, var7.field4474) > 0) {
					var8 = var6;
				} else {
					var8 = var4; // L: 126
				}
			} else if (var6 < this.field4485 && ((Comparable)var5.field4474).compareTo(var7.field4474) > 0) { // L: 129
				var8 = var6;
			} else {
				var8 = var4; // L: 130
			}

			if (this.field4480 != null) {
				if (this.field4480.compare(var2.field4474, this.field4481[var8].field4474) <= 0) { // L: 133
					break;
				}
			} else if (((Comparable)var2.field4474).compareTo(this.field4481[var8].field4474) <= 0) {
				break;
			}

			this.field4481[var1] = this.field4481[var8];
			this.field4481[var1].field4472 = var1;
		}

		this.field4481[var1] = var2;
		this.field4481[var1].field4472 = var1;
	}

	public boolean remove(Object var1) {
		class402 var2 = (class402)this.field4479.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field4483;
			--this.field4485;
			if (this.field4485 == var2.field4472) {
				this.field4481[this.field4485] = null; // L: 82
				return true;
			} else {
				class402 var3 = this.field4481[this.field4485];
				this.field4481[this.field4485] = null; // L: 86
				this.field4481[var2.field4472] = var3;
				this.field4481[var2.field4472].field4472 = var2.field4472;
				this.method7486(var2.field4472);
				if (var3 == this.field4481[var2.field4472]) {
					this.method7485(var2.field4472);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field4485 == 0 ? null : this.field4481[0].field4474; // L: 54 55
	}

	public boolean contains(Object var1) {
		return this.field4479.containsKey(var1); // L: 148
	}

	public int size() {
		return this.field4485;
	}

	public Object poll() {
		if (this.field4485 == 0) {
			return null;
		} else {
			++this.field4483;
			Object var1 = this.field4481[0].field4474;
			this.field4479.remove(var1);
			--this.field4485;
			if (this.field4485 == 0) {
				this.field4481[this.field4485] = null;
			} else {
				this.field4481[0] = this.field4481[this.field4485]; // L: 68
				this.field4481[0].field4472 = 0; // L: 69
				this.field4481[this.field4485] = null; // L: 70
				this.method7486(0);
			}

			return var1; // L: 73
		}
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4480 != null) {
			Arrays.sort(var1, this.field4480); // L: 155
		} else {
			Arrays.sort(var1); // L: 156
		}

		return var1; // L: 157
	}

	public Iterator iterator() {
		return new class403(this); // L: 162
	}

	public boolean offer(Object var1) {
		if (this.field4479.containsKey(var1)) { // L: 34
			throw new IllegalArgumentException("");
		} else {
			++this.field4483;
			int var2 = this.field4485;
			if (var2 >= this.field4481.length) { // L: 37
				this.method7483();
			}

			++this.field4485;
			if (var2 == 0) {
				this.field4481[0] = new class402(var1, 0);
				this.field4479.put(var1, this.field4481[0]);
			} else {
				this.field4481[var2] = new class402(var1, var2); // L: 44
				this.field4479.put(var1, this.field4481[var2]);
				this.method7485(var2);
			}

			return true;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FB)F",
		garbageValue = "0"
	)
	static float method7512(class131 var0, float var1) {
		if (var0 != null && var0.method3106() != 0) { // L: 20
			if (var1 < (float)var0.field1530[0].field1477) { // L: 23
				return var0.field1535 == class129.field1513 ? var0.field1530[0].field1478 : Decimator.method1152(var0, var1, true); // L: 24 25 27
			} else if (var1 > (float)var0.field1530[var0.method3106() - 1].field1477) { // L: 29
				return var0.field1529 == class129.field1513 ? var0.field1530[var0.method3106() - 1].field1478 : Decimator.method1152(var0, var1, false); // L: 30 31 33
			} else if (var0.field1527) { // L: 35
				return var0.field1530[0].field1478; // L: 36
			} else {
				class126 var2 = var0.method3105(var1); // L: 38
				boolean var3 = false; // L: 39
				boolean var4 = false; // L: 40
				if (var2 == null) { // L: 41
					return 0.0F; // L: 169
				} else {
					float var5;
					float var6;
					float var7;
					if ((double)var2.field1481 == 0.0D && (double)var2.field1482 == 0.0D) { // L: 42
						var3 = true; // L: 43
					} else if (var2.field1481 == Float.MAX_VALUE && Float.MAX_VALUE == var2.field1482) { // L: 45
						var4 = true; // L: 46
					} else if (var2.field1479 != null) { // L: 48
						if (var0.field1542) { // L: 49
							var5 = (float)var2.field1477; // L: 58
							float var9 = var2.field1478; // L: 59
							var6 = var5 + var2.field1481 * 0.33333334F; // L: 60
							float var10 = 0.33333334F * var2.field1482 + var9; // L: 61
							float var8 = (float)var2.field1479.field1477; // L: 62
							float var12 = var2.field1479.field1478; // L: 63
							var7 = var8 - var2.field1479.field1480 * 0.33333334F; // L: 64
							float var11 = var12 - 0.33333334F * var2.field1479.field1483; // L: 65
							if (var0.field1532) { // L: 66
								Language.method7200(var0, var5, var6, var7, var8, var9, var10, var11, var12); // L: 67
							} else if (var0 != null) { // L: 71
								var0.field1538 = var5; // L: 74
								float var13 = var8 - var5; // L: 75
								float var14 = var12 - var9; // L: 76
								float var15 = var6 - var5; // L: 77
								float var16 = 0.0F; // L: 78
								float var17 = 0.0F; // L: 79
								if ((double)var15 != 0.0D) { // L: 80
									var16 = (var10 - var9) / var15; // L: 81
								}

								var15 = var8 - var7; // L: 83
								if (0.0D != (double)var15) { // L: 84
									var17 = (var12 - var11) / var15; // L: 85
								}

								float var18 = 1.0F / (var13 * var13); // L: 87
								float var19 = var16 * var13; // L: 88
								float var20 = var13 * var17; // L: 89
								var0.field1534 = (var20 + var19 - var14 - var14) * var18 / var13; // L: 90
								var0.field1548 = var18 * (var14 + var14 + var14 - var19 - var19 - var20); // L: 91
								var0.field1526 = var16; // L: 92
								var0.field1537 = var9; // L: 93
							}

							var0.field1542 = false; // L: 96
						}
					} else {
						var3 = true; // L: 100
					}

					if (var3) { // L: 102
						return var2.field1478; // L: 103
					} else if (var4) { // L: 105
						return (float)var2.field1477 != var1 && var2.field1479 != null ? var2.field1479.field1478 : var2.field1478; // L: 106 107 110
					} else if (var0.field1532) { // L: 113
						if (var0 == null) { // L: 116
							var5 = 0.0F; // L: 117
						} else {
							if (var0.field1538 == var1) { // L: 121
								var6 = 0.0F; // L: 122
							} else if (var0.field1533 == var1) { // L: 124
								var6 = 1.0F; // L: 125
							} else {
								var6 = (var1 - var0.field1538) / (var0.field1533 - var0.field1538); // L: 128
							}

							if (var0.field1531) { // L: 131
								var7 = var6; // L: 132
							} else {
								class127.field1487[3] = var0.field1537; // L: 135
								class127.field1487[2] = var0.field1526; // L: 136
								class127.field1487[1] = var0.field1548; // L: 137
								class127.field1487[0] = var0.field1534 - var6; // L: 138
								class127.field1489[0] = 0.0F; // L: 139
								class127.field1489[1] = 0.0F; // L: 140
								class127.field1489[2] = 0.0F; // L: 141
								class127.field1489[3] = 0.0F; // L: 142
								class127.field1489[4] = 0.0F; // L: 143
								int var21 = FloorUnderlayDefinition.method3791(class127.field1487, 3, 0.0F, true, 1.0F, true, class127.field1489); // L: 144
								if (var21 == 1) { // L: 145
									var7 = class127.field1489[0]; // L: 146
								} else {
									var7 = 0.0F; // L: 149
								}
							}

							var5 = var7 * (var0.field1539 + (var0.field1540 + var0.field1528 * var7) * var7) + var0.field1546; // L: 152
						}

						return var5; // L: 154
					} else {
						if (var0 == null) { // L: 159
							var5 = 0.0F; // L: 160
						} else {
							var6 = var1 - var0.field1538; // L: 163
							var5 = var0.field1537 + var6 * (var6 * (var0.field1548 + var6 * var0.field1534) + var0.field1526); // L: 164
						}

						return var5; // L: 166
					}
				}
			}
		} else {
			return 0.0F; // L: 21
		}
	}
}
