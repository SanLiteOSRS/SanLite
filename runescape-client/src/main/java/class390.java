import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
public class class390 extends AbstractQueue {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lou;"
	)
	class388[] field4416;
	@ObfuscatedName("an")
	Map field4413;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -198371055
	)
	int field4412;
	@ObfuscatedName("as")
	final Comparator field4415;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 490326883
	)
	int field4414;

	public class390(int var1, Comparator var2) {
		this.field4414 = 0; // L: 10
		this.field4416 = new class388[var1]; // L: 17
		this.field4413 = new HashMap(); // L: 18
		this.field4415 = var2; // L: 19
	} // L: 20

	public class390(int var1) {
		this(var1, (Comparator)null); // L: 13
	} // L: 14

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	void method7226() {
		int var1 = (this.field4416.length << 1) + 1; // L: 23
		this.field4416 = (class388[])((class388[])Arrays.copyOf(this.field4416, var1)); // L: 24
	} // L: 25

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "980463966"
	)
	void method7227(int var1) {
		class388 var2;
		int var3;
		for (var2 = this.field4416[var1]; var1 > 0; var1 = var3) { // L: 96 97 108
			var3 = var1 - 1 >>> 1; // L: 98
			class388 var4 = this.field4416[var3]; // L: 99
			if (this.field4415 != null) { // L: 100
				if (this.field4415.compare(var2.field4406, var4.field4406) >= 0) { // L: 101
					break;
				}
			} else if (((Comparable)var2.field4406).compareTo(var4.field4406) >= 0) { // L: 104
				break;
			}

			this.field4416[var1] = var4; // L: 106
			this.field4416[var1].field4407 = var1; // L: 107
		}

		this.field4416[var1] = var2; // L: 110
		this.field4416[var1].field4407 = var1; // L: 111
	} // L: 112

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "22"
	)
	void method7225(int var1) {
		class388 var2 = this.field4416[var1]; // L: 116

		int var8;
		for (int var3 = this.field4412 >>> 1; var1 < var3; var1 = var8) { // L: 117 118 140
			int var4 = (var1 << 1) + 1; // L: 119
			class388 var5 = this.field4416[var4]; // L: 120
			int var6 = (var1 << 1) + 2; // L: 121
			class388 var7 = this.field4416[var6]; // L: 122
			if (this.field4415 != null) { // L: 124
				if (var6 < this.field4412 && this.field4415.compare(var5.field4406, var7.field4406) > 0) { // L: 125
					var8 = var6;
				} else {
					var8 = var4; // L: 126
				}
			} else if (var6 < this.field4412 && ((Comparable)var5.field4406).compareTo(var7.field4406) > 0) { // L: 129
				var8 = var6;
			} else {
				var8 = var4; // L: 130
			}

			if (this.field4415 != null) { // L: 132
				if (this.field4415.compare(var2.field4406, this.field4416[var8].field4406) <= 0) { // L: 133
					break;
				}
			} else if (((Comparable)var2.field4406).compareTo(this.field4416[var8].field4406) <= 0) { // L: 136
				break;
			}

			this.field4416[var1] = this.field4416[var8]; // L: 138
			this.field4416[var1].field4407 = var1; // L: 139
		}

		this.field4416[var1] = var2; // L: 142
		this.field4416[var1].field4407 = var1; // L: 143
	} // L: 144

	public boolean remove(Object var1) {
		class388 var2 = (class388)this.field4413.remove(var1); // L: 77
		if (var2 == null) { // L: 78
			return false;
		} else {
			++this.field4414; // L: 79
			--this.field4412; // L: 80
			if (this.field4412 == var2.field4407) { // L: 81
				this.field4416[this.field4412] = null; // L: 82
				return true; // L: 83
			} else {
				class388 var3 = this.field4416[this.field4412]; // L: 85
				this.field4416[this.field4412] = null; // L: 86
				this.field4416[var2.field4407] = var3; // L: 87
				this.field4416[var2.field4407].field4407 = var2.field4407; // L: 88
				this.method7225(var2.field4407); // L: 89
				if (var3 == this.field4416[var2.field4407]) { // L: 90
					this.method7227(var2.field4407);
				}

				return true; // L: 91
			}
		}
	}

	public Object peek() {
		return this.field4412 == 0 ? null : this.field4416[0].field4406; // L: 54 55
	}

	public boolean contains(Object var1) {
		return this.field4413.containsKey(var1); // L: 148
	}

	public int size() {
		return this.field4412; // L: 29
	}

	public Object poll() {
		if (this.field4412 == 0) { // L: 61
			return null;
		} else {
			++this.field4414; // L: 62
			Object var1 = this.field4416[0].field4406; // L: 63
			this.field4413.remove(var1); // L: 64
			--this.field4412; // L: 65
			if (this.field4412 == 0) {
				this.field4416[this.field4412] = null; // L: 66
			} else {
				this.field4416[0] = this.field4416[this.field4412]; // L: 68
				this.field4416[0].field4407 = 0; // L: 69
				this.field4416[this.field4412] = null; // L: 70
				this.method7225(0); // L: 71
			}

			return var1; // L: 73
		}
	}

	public Iterator iterator() {
		return new class389(this); // L: 162
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray(); // L: 154
		if (this.field4415 != null) {
			Arrays.sort(var1, this.field4415); // L: 155
		} else {
			Arrays.sort(var1); // L: 156
		}

		return var1; // L: 157
	}

	public boolean offer(Object var1) {
		if (this.field4413.containsKey(var1)) { // L: 34
			throw new IllegalArgumentException("");
		} else {
			++this.field4414; // L: 35
			int var2 = this.field4412; // L: 36
			if (var2 >= this.field4416.length) { // L: 37
				this.method7226();
			}

			++this.field4412; // L: 38
			if (var2 == 0) { // L: 39
				this.field4416[0] = new class388(var1, 0); // L: 40
				this.field4413.put(var1, this.field4416[0]); // L: 41
			} else {
				this.field4416[var2] = new class388(var1, var2); // L: 44
				this.field4413.put(var1, this.field4416[var2]); // L: 45
				this.method7227(var2); // L: 46
			}

			return true; // L: 48
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	static void method7249(int var0) {
		if (var0 != Login.loginIndex) { // L: 2066
			Login.loginIndex = var0; // L: 2067
		}
	} // L: 2068
}
