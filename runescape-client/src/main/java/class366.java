import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
public class class366 extends AbstractQueue {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Lnb;"
	)
	class364[] field4373;
	@ObfuscatedName("e")
	Map field4368;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1410749845
	)
	int field4369;
	@ObfuscatedName("x")
	final Comparator field4371;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1565326987
	)
	int field4372;

	public class366(int var1, Comparator var2) {
		this.field4372 = 0; // L: 10
		this.field4373 = new class364[var1]; // L: 17
		this.field4368 = new HashMap(); // L: 18
		this.field4371 = var2; // L: 19
	} // L: 20

	public class366(int var1) {
		this(var1, (Comparator)null); // L: 13
	} // L: 14

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-417662224"
	)
	void method7014() {
		int var1 = (this.field4373.length << 1) + 1; // L: 23
		this.field4373 = (class364[])((class364[])Arrays.copyOf(this.field4373, var1)); // L: 24
	} // L: 25

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-77"
	)
	void method7006(int var1) {
		class364 var2;
		int var3;
		for (var2 = this.field4373[var1]; var1 > 0; var1 = var3) { // L: 96 97 108
			var3 = var1 - 1 >>> 1; // L: 98
			class364 var4 = this.field4373[var3]; // L: 99
			if (this.field4371 != null) { // L: 100
				if (this.field4371.compare(var2.field4362, var4.field4362) >= 0) { // L: 101
					break;
				}
			} else if (((Comparable)var2.field4362).compareTo(var4.field4362) >= 0) { // L: 104
				break;
			}

			this.field4373[var1] = var4; // L: 106
			this.field4373[var1].field4363 = var1; // L: 107
		}

		this.field4373[var1] = var2; // L: 110
		this.field4373[var1].field4363 = var1; // L: 111
	} // L: 112

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	void method7007(int var1) {
		class364 var2 = this.field4373[var1]; // L: 116

		int var8;
		for (int var3 = this.field4369 >>> 1; var1 < var3; var1 = var8) { // L: 117 118 140
			int var4 = (var1 << 1) + 1; // L: 119
			class364 var5 = this.field4373[var4]; // L: 120
			int var6 = (var1 << 1) + 2; // L: 121
			class364 var7 = this.field4373[var6]; // L: 122
			if (this.field4371 != null) { // L: 124
				if (var6 < this.field4369 && this.field4371.compare(var5.field4362, var7.field4362) > 0) { // L: 125
					var8 = var6;
				} else {
					var8 = var4; // L: 126
				}
			} else if (var6 < this.field4369 && ((Comparable)var5.field4362).compareTo(var7.field4362) > 0) { // L: 129
				var8 = var6;
			} else {
				var8 = var4; // L: 130
			}

			if (this.field4371 != null) { // L: 132
				if (this.field4371.compare(var2.field4362, this.field4373[var8].field4362) <= 0) { // L: 133
					break;
				}
			} else if (((Comparable)var2.field4362).compareTo(this.field4373[var8].field4362) <= 0) { // L: 136
				break;
			}

			this.field4373[var1] = this.field4373[var8]; // L: 138
			this.field4373[var1].field4363 = var1; // L: 139
		}

		this.field4373[var1] = var2; // L: 142
		this.field4373[var1].field4363 = var1; // L: 143
	} // L: 144

	public boolean remove(Object var1) {
		class364 var2 = (class364)this.field4368.remove(var1); // L: 77
		if (var2 == null) { // L: 78
			return false;
		} else {
			++this.field4372; // L: 79
			--this.field4369; // L: 80
			if (this.field4369 == var2.field4363) { // L: 81
				this.field4373[this.field4369] = null; // L: 82
				return true; // L: 83
			} else {
				class364 var3 = this.field4373[this.field4369]; // L: 85
				this.field4373[this.field4369] = null; // L: 86
				this.field4373[var2.field4363] = var3; // L: 87
				this.field4373[var2.field4363].field4363 = var2.field4363; // L: 88
				this.method7007(var2.field4363); // L: 89
				if (var3 == this.field4373[var2.field4363]) { // L: 90
					this.method7006(var2.field4363);
				}

				return true; // L: 91
			}
		}
	}

	public Object peek() {
		return this.field4369 == 0 ? null : this.field4373[0].field4362; // L: 54 55
	}

	public int size() {
		return this.field4369; // L: 29
	}

	public Object poll() {
		if (this.field4369 == 0) { // L: 61
			return null;
		} else {
			++this.field4372; // L: 62
			Object var1 = this.field4373[0].field4362; // L: 63
			this.field4368.remove(var1); // L: 64
			--this.field4369; // L: 65
			if (this.field4369 == 0) {
				this.field4373[this.field4369] = null; // L: 66
			} else {
				this.field4373[0] = this.field4373[this.field4369]; // L: 68
				this.field4373[0].field4363 = 0; // L: 69
				this.field4373[this.field4369] = null; // L: 70
				this.method7007(0); // L: 71
			}

			return var1; // L: 73
		}
	}

	public boolean contains(Object var1) {
		return this.field4368.containsKey(var1); // L: 148
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray(); // L: 154
		if (this.field4371 != null) {
			Arrays.sort(var1, this.field4371); // L: 155
		} else {
			Arrays.sort(var1); // L: 156
		}

		return var1; // L: 157
	}

	public Iterator iterator() {
		return new class365(this); // L: 162
	}

	public boolean offer(Object var1) {
		if (this.field4368.containsKey(var1)) { // L: 34
			throw new IllegalArgumentException("");
		} else {
			++this.field4372; // L: 35
			int var2 = this.field4369; // L: 36
			if (var2 >= this.field4373.length) { // L: 37
				this.method7014();
			}

			++this.field4369; // L: 38
			if (var2 == 0) { // L: 39
				this.field4373[0] = new class364(var1, 0); // L: 40
				this.field4368.put(var1, this.field4373[0]); // L: 41
			} else {
				this.field4373[var2] = new class364(var1, var2); // L: 44
				this.field4368.put(var1, this.field4373[var2]); // L: 45
				this.method7006(var2); // L: 46
			}

			return true; // L: 48
		}
	}
}
