import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
public class class390 extends AbstractQueue {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Los;"
	)
	class388[] field4428;
	@ObfuscatedName("an")
	Map field4426;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 509396797
	)
	int field4427;
	@ObfuscatedName("ab")
	final Comparator field4429;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1627687859
	)
	int field4430;

	public class390(int var1, Comparator var2) {
		this.field4430 = 0; // L: 10
		this.field4428 = new class388[var1]; // L: 17
		this.field4426 = new HashMap(); // L: 18
		this.field4429 = var2; // L: 19
	} // L: 20

	public class390(int var1) {
		this(var1, (Comparator)null); // L: 13
	} // L: 14

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2137400992"
	)
	void method7214() {
		int var1 = (this.field4428.length << 1) + 1; // L: 23
		this.field4428 = (class388[])((class388[])Arrays.copyOf(this.field4428, var1)); // L: 24
	} // L: 25

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-719124421"
	)
	void method7213(int var1) {
		class388 var2;
		int var3;
		for (var2 = this.field4428[var1]; var1 > 0; var1 = var3) { // L: 96 97 108
			var3 = var1 - 1 >>> 1; // L: 98
			class388 var4 = this.field4428[var3]; // L: 99
			if (this.field4429 != null) { // L: 100
				if (this.field4429.compare(var2.field4419, var4.field4419) >= 0) { // L: 101
					break;
				}
			} else if (((Comparable)var2.field4419).compareTo(var4.field4419) >= 0) { // L: 104
				break;
			}

			this.field4428[var1] = var4; // L: 106
			this.field4428[var1].field4418 = var1; // L: 107
		}

		this.field4428[var1] = var2; // L: 110
		this.field4428[var1].field4418 = var1; // L: 111
	} // L: 112

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1997396033"
	)
	void method7238(int var1) {
		class388 var2 = this.field4428[var1]; // L: 116

		int var8;
		for (int var3 = this.field4427 >>> 1; var1 < var3; var1 = var8) { // L: 117 118 140
			int var4 = (var1 << 1) + 1; // L: 119
			class388 var5 = this.field4428[var4]; // L: 120
			int var6 = (var1 << 1) + 2; // L: 121
			class388 var7 = this.field4428[var6]; // L: 122
			if (this.field4429 != null) { // L: 124
				if (var6 < this.field4427 && this.field4429.compare(var5.field4419, var7.field4419) > 0) { // L: 125
					var8 = var6;
				} else {
					var8 = var4; // L: 126
				}
			} else if (var6 < this.field4427 && ((Comparable)var5.field4419).compareTo(var7.field4419) > 0) { // L: 129
				var8 = var6;
			} else {
				var8 = var4; // L: 130
			}

			if (this.field4429 != null) { // L: 132
				if (this.field4429.compare(var2.field4419, this.field4428[var8].field4419) <= 0) { // L: 133
					break;
				}
			} else if (((Comparable)var2.field4419).compareTo(this.field4428[var8].field4419) <= 0) { // L: 136
				break;
			}

			this.field4428[var1] = this.field4428[var8]; // L: 138
			this.field4428[var1].field4418 = var1; // L: 139
		}

		this.field4428[var1] = var2; // L: 142
		this.field4428[var1].field4418 = var1; // L: 143
	} // L: 144

	public boolean remove(Object var1) {
		class388 var2 = (class388)this.field4426.remove(var1); // L: 77
		if (var2 == null) { // L: 78
			return false;
		} else {
			++this.field4430; // L: 79
			--this.field4427; // L: 80
			if (this.field4427 == var2.field4418) { // L: 81
				this.field4428[this.field4427] = null; // L: 82
				return true; // L: 83
			} else {
				class388 var3 = this.field4428[this.field4427]; // L: 85
				this.field4428[this.field4427] = null; // L: 86
				this.field4428[var2.field4418] = var3; // L: 87
				this.field4428[var2.field4418].field4418 = var2.field4418; // L: 88
				this.method7238(var2.field4418); // L: 89
				if (var3 == this.field4428[var2.field4418]) { // L: 90
					this.method7213(var2.field4418);
				}

				return true; // L: 91
			}
		}
	}

	public Object peek() {
		return this.field4427 == 0 ? null : this.field4428[0].field4419; // L: 54 55
	}

	public int size() {
		return this.field4427; // L: 29
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray(); // L: 154
		if (this.field4429 != null) {
			Arrays.sort(var1, this.field4429); // L: 155
		} else {
			Arrays.sort(var1); // L: 156
		}

		return var1; // L: 157
	}

	public Iterator iterator() {
		return new class389(this); // L: 162
	}

	public boolean contains(Object var1) {
		return this.field4426.containsKey(var1); // L: 148
	}

	public Object poll() {
		if (this.field4427 == 0) { // L: 61
			return null;
		} else {
			++this.field4430; // L: 62
			Object var1 = this.field4428[0].field4419; // L: 63
			this.field4426.remove(var1); // L: 64
			--this.field4427; // L: 65
			if (this.field4427 == 0) {
				this.field4428[this.field4427] = null; // L: 66
			} else {
				this.field4428[0] = this.field4428[this.field4427]; // L: 68
				this.field4428[0].field4418 = 0; // L: 69
				this.field4428[this.field4427] = null; // L: 70
				this.method7238(0); // L: 71
			}

			return var1; // L: 73
		}
	}

	public boolean offer(Object var1) {
		if (this.field4426.containsKey(var1)) { // L: 34
			throw new IllegalArgumentException("");
		} else {
			++this.field4430; // L: 35
			int var2 = this.field4427; // L: 36
			if (var2 >= this.field4428.length) { // L: 37
				this.method7214();
			}

			++this.field4427; // L: 38
			if (var2 == 0) { // L: 39
				this.field4428[0] = new class388(var1, 0); // L: 40
				this.field4426.put(var1, this.field4428[0]); // L: 41
			} else {
				this.field4428[var2] = new class388(var1, var2); // L: 44
				this.field4426.put(var1, this.field4428[var2]); // L: 45
				this.method7213(var2); // L: 46
			}

			return true; // L: 48
		}
	}
}
