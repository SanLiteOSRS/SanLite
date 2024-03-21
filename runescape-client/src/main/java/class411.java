import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
public class class411 extends AbstractQueue {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lpz;"
	)
	class409[] field4562;
	@ObfuscatedName("aw")
	Map field4564;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1785638983
	)
	int field4563;
	@ObfuscatedName("ai")
	final Comparator field4565;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1500214837
	)
	int field4561;

	public class411(int var1, Comparator var2) {
		this.field4561 = 0; // L: 10
		this.field4562 = new class409[var1]; // L: 17
		this.field4564 = new HashMap(); // L: 18
		this.field4565 = var2; // L: 19
	} // L: 20

	public class411(int var1) {
		this(var1, (Comparator)null); // L: 13
	} // L: 14

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	void method7667() {
		int var1 = (this.field4562.length << 1) + 1; // L: 23
		this.field4562 = (class409[])((class409[])Arrays.copyOf(this.field4562, var1)); // L: 24
	} // L: 25

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-6"
	)
	void method7659(int var1) {
		class409 var2;
		int var3;
		for (var2 = this.field4562[var1]; var1 > 0; var1 = var3) { // L: 96 97 108
			var3 = var1 - 1 >>> 1; // L: 98
			class409 var4 = this.field4562[var3]; // L: 99
			if (this.field4565 != null) { // L: 100
				if (this.field4565.compare(var2.field4554, var4.field4554) >= 0) { // L: 101
					break;
				}
			} else if (((Comparable)var2.field4554).compareTo(var4.field4554) >= 0) { // L: 104
				break;
			}

			this.field4562[var1] = var4; // L: 106
			this.field4562[var1].field4553 = var1; // L: 107
		}

		this.field4562[var1] = var2; // L: 110
		this.field4562[var1].field4553 = var1; // L: 111
	} // L: 112

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-716869550"
	)
	void method7674(int var1) {
		class409 var2 = this.field4562[var1]; // L: 116

		int var8;
		for (int var3 = this.field4563 >>> 1; var1 < var3; var1 = var8) { // L: 117 118 140
			int var4 = (var1 << 1) + 1; // L: 119
			class409 var5 = this.field4562[var4]; // L: 120
			int var6 = (var1 << 1) + 2; // L: 121
			class409 var7 = this.field4562[var6]; // L: 122
			if (this.field4565 != null) { // L: 124
				if (var6 < this.field4563 && this.field4565.compare(var5.field4554, var7.field4554) > 0) { // L: 125
					var8 = var6;
				} else {
					var8 = var4; // L: 126
				}
			} else if (var6 < this.field4563 && ((Comparable)var5.field4554).compareTo(var7.field4554) > 0) { // L: 129
				var8 = var6;
			} else {
				var8 = var4; // L: 130
			}

			if (this.field4565 != null) { // L: 132
				if (this.field4565.compare(var2.field4554, this.field4562[var8].field4554) <= 0) { // L: 133
					break;
				}
			} else if (((Comparable)var2.field4554).compareTo(this.field4562[var8].field4554) <= 0) { // L: 136
				break;
			}

			this.field4562[var1] = this.field4562[var8]; // L: 138
			this.field4562[var1].field4553 = var1; // L: 139
		}

		this.field4562[var1] = var2; // L: 142
		this.field4562[var1].field4553 = var1; // L: 143
	} // L: 144

	public boolean remove(Object var1) {
		class409 var2 = (class409)this.field4564.remove(var1); // L: 77
		if (var2 == null) { // L: 78
			return false;
		} else {
			++this.field4561; // L: 79
			--this.field4563; // L: 80
			if (this.field4563 == var2.field4553) { // L: 81
				this.field4562[this.field4563] = null; // L: 82
				return true; // L: 83
			} else {
				class409 var3 = this.field4562[this.field4563]; // L: 85
				this.field4562[this.field4563] = null; // L: 86
				this.field4562[var2.field4553] = var3; // L: 87
				this.field4562[var2.field4553].field4553 = var2.field4553; // L: 88
				this.method7674(var2.field4553); // L: 89
				if (var3 == this.field4562[var2.field4553]) { // L: 90
					this.method7659(var2.field4553);
				}

				return true; // L: 91
			}
		}
	}

	public Object peek() {
		return this.field4563 == 0 ? null : this.field4562[0].field4554; // L: 54 55
	}

	public int size() {
		return this.field4563; // L: 29
	}

	public boolean offer(Object var1) {
		if (this.field4564.containsKey(var1)) { // L: 34
			throw new IllegalArgumentException("");
		} else {
			++this.field4561; // L: 35
			int var2 = this.field4563; // L: 36
			if (var2 >= this.field4562.length) { // L: 37
				this.method7667();
			}

			++this.field4563; // L: 38
			if (var2 == 0) { // L: 39
				this.field4562[0] = new class409(var1, 0); // L: 40
				this.field4564.put(var1, this.field4562[0]); // L: 41
			} else {
				this.field4562[var2] = new class409(var1, var2); // L: 44
				this.field4564.put(var1, this.field4562[var2]); // L: 45
				this.method7659(var2); // L: 46
			}

			return true; // L: 48
		}
	}

	public Object poll() {
		if (this.field4563 == 0) { // L: 61
			return null;
		} else {
			++this.field4561; // L: 62
			Object var1 = this.field4562[0].field4554; // L: 63
			this.field4564.remove(var1); // L: 64
			--this.field4563; // L: 65
			if (this.field4563 == 0) {
				this.field4562[this.field4563] = null; // L: 66
			} else {
				this.field4562[0] = this.field4562[this.field4563]; // L: 68
				this.field4562[0].field4553 = 0; // L: 69
				this.field4562[this.field4563] = null; // L: 70
				this.method7674(0); // L: 71
			}

			return var1; // L: 73
		}
	}

	public boolean contains(Object var1) {
		return this.field4564.containsKey(var1); // L: 148
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray(); // L: 154
		if (this.field4565 != null) {
			Arrays.sort(var1, this.field4565); // L: 155
		} else {
			Arrays.sort(var1); // L: 156
		}

		return var1; // L: 157
	}

	public Iterator iterator() {
		return new class410(this); // L: 162
	}
}
