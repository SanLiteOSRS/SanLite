import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
public class class377 extends AbstractQueue {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Loh;"
	)
	class375[] field4401;
	@ObfuscatedName("an")
	Map field4399;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1960181101
	)
	int field4403;
	@ObfuscatedName("ac")
	final Comparator field4402;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -874295403
	)
	int field4400;

	public class377(int var1, Comparator var2) {
		this.field4400 = 0; // L: 10
		this.field4401 = new class375[var1]; // L: 17
		this.field4399 = new HashMap(); // L: 18
		this.field4402 = var2; // L: 19
	} // L: 20

	public class377(int var1) {
		this(var1, (Comparator)null); // L: 13
	} // L: 14

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	void method7245() {
		int var1 = (this.field4401.length << 1) + 1; // L: 23
		this.field4401 = (class375[])((class375[])Arrays.copyOf(this.field4401, var1)); // L: 24
	} // L: 25

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-89"
	)
	void method7220(int var1) {
		class375 var2;
		int var3;
		for (var2 = this.field4401[var1]; var1 > 0; var1 = var3) { // L: 96 97 108
			var3 = var1 - 1 >>> 1; // L: 98
			class375 var4 = this.field4401[var3]; // L: 99
			if (this.field4402 != null) { // L: 100
				if (this.field4402.compare(var2.field4389, var4.field4389) >= 0) { // L: 101
					break;
				}
			} else if (((Comparable)var2.field4389).compareTo(var4.field4389) >= 0) { // L: 104
				break;
			}

			this.field4401[var1] = var4; // L: 106
			this.field4401[var1].field4390 = var1; // L: 107
		}

		this.field4401[var1] = var2; // L: 110
		this.field4401[var1].field4390 = var1; // L: 111
	} // L: 112

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "55"
	)
	void method7221(int var1) {
		class375 var2 = this.field4401[var1]; // L: 116

		int var8;
		for (int var3 = this.field4403 >>> 1; var1 < var3; var1 = var8) { // L: 117 118 140
			int var4 = (var1 << 1) + 1; // L: 119
			class375 var5 = this.field4401[var4]; // L: 120
			int var6 = (var1 << 1) + 2; // L: 121
			class375 var7 = this.field4401[var6]; // L: 122
			if (this.field4402 != null) { // L: 124
				if (var6 < this.field4403 && this.field4402.compare(var5.field4389, var7.field4389) > 0) { // L: 125
					var8 = var6;
				} else {
					var8 = var4; // L: 126
				}
			} else if (var6 < this.field4403 && ((Comparable)var5.field4389).compareTo(var7.field4389) > 0) { // L: 129
				var8 = var6;
			} else {
				var8 = var4; // L: 130
			}

			if (this.field4402 != null) { // L: 132
				if (this.field4402.compare(var2.field4389, this.field4401[var8].field4389) <= 0) { // L: 133
					break;
				}
			} else if (((Comparable)var2.field4389).compareTo(this.field4401[var8].field4389) <= 0) { // L: 136
				break;
			}

			this.field4401[var1] = this.field4401[var8]; // L: 138
			this.field4401[var1].field4390 = var1; // L: 139
		}

		this.field4401[var1] = var2; // L: 142
		this.field4401[var1].field4390 = var1; // L: 143
	} // L: 144

	public boolean remove(Object var1) {
		class375 var2 = (class375)this.field4399.remove(var1); // L: 77
		if (var2 == null) { // L: 78
			return false;
		} else {
			++this.field4400; // L: 79
			--this.field4403; // L: 80
			if (var2.field4390 == this.field4403) { // L: 81
				this.field4401[this.field4403] = null; // L: 82
				return true; // L: 83
			} else {
				class375 var3 = this.field4401[this.field4403]; // L: 85
				this.field4401[this.field4403] = null; // L: 86
				this.field4401[var2.field4390] = var3; // L: 87
				this.field4401[var2.field4390].field4390 = var2.field4390; // L: 88
				this.method7221(var2.field4390); // L: 89
				if (var3 == this.field4401[var2.field4390]) { // L: 90
					this.method7220(var2.field4390);
				}

				return true; // L: 91
			}
		}
	}

	public Object peek() {
		return this.field4403 == 0 ? null : this.field4401[0].field4389; // L: 54 55
	}

	public int size() {
		return this.field4403; // L: 29
	}

	public boolean offer(Object var1) {
		if (this.field4399.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4400;
			int var2 = this.field4403;
			if (var2 >= this.field4401.length) { // L: 37
				this.method7245();
			}

			++this.field4403; // L: 38
			if (var2 == 0) {
				this.field4401[0] = new class375(var1, 0); // L: 40
				this.field4399.put(var1, this.field4401[0]); // L: 41
			} else {
				this.field4401[var2] = new class375(var1, var2); // L: 44
				this.field4399.put(var1, this.field4401[var2]); // L: 45
				this.method7220(var2); // L: 46
			}

			return true; // L: 48
		}
	}

	public Object poll() {
		if (this.field4403 == 0) { // L: 61
			return null;
		} else {
			++this.field4400; // L: 62
			Object var1 = this.field4401[0].field4389; // L: 63
			this.field4399.remove(var1); // L: 64
			--this.field4403; // L: 65
			if (this.field4403 == 0) {
				this.field4401[this.field4403] = null; // L: 66
			} else {
				this.field4401[0] = this.field4401[this.field4403]; // L: 68
				this.field4401[0].field4390 = 0; // L: 69
				this.field4401[this.field4403] = null; // L: 70
				this.method7221(0); // L: 71
			}

			return var1; // L: 73
		}
	}

	public boolean contains(Object var1) {
		return this.field4399.containsKey(var1); // L: 148
	}

	public Iterator iterator() {
		return new class376(this); // L: 162
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray(); // L: 154
		if (this.field4402 != null) {
			Arrays.sort(var1, this.field4402); // L: 155
		} else {
			Arrays.sort(var1); // L: 156
		}

		return var1; // L: 157
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsg;[IB)[Ljava/lang/Object;",
		garbageValue = "-86"
	)
	static Object[] method7250(Buffer var0, int[] var1) {
		int var2 = var0.readUShortSmart(); // L: 30
		Object[] var3 = new Object[var1.length * var2]; // L: 31

		for (int var4 = 0; var4 < var2; ++var4) { // L: 32
			for (int var5 = 0; var5 < var1.length; ++var5) { // L: 33
				int var6 = var1.length * var4 + var5; // L: 34
				class478 var7 = class103.method2717(var1[var5]); // L: 35
				var3[var6] = var7.method8895(var0); // L: 36
			}
		}

		return var3; // L: 39
	}
}
