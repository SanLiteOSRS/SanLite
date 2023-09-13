import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pa")
public class class392 extends AbstractQueue {
	@ObfuscatedName("wh")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lps;"
	)
	class390[] field4448;
	@ObfuscatedName("ae")
	Map field4447;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1031831555
	)
	int field4450;
	@ObfuscatedName("at")
	final Comparator field4449;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1450073607
	)
	int field4446;

	public class392(int var1, Comparator var2) {
		this.field4446 = 0; // L: 10
		this.field4448 = new class390[var1]; // L: 17
		this.field4447 = new HashMap(); // L: 18
		this.field4449 = var2; // L: 19
	} // L: 20

	public class392(int var1) {
		this(var1, (Comparator)null); // L: 13
	} // L: 14

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method7229() {
		int var1 = (this.field4448.length << 1) + 1; // L: 23
		this.field4448 = (class390[])((class390[])Arrays.copyOf(this.field4448, var1)); // L: 24
	} // L: 25

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-119"
	)
	void method7238(int var1) {
		class390 var2;
		int var3;
		for (var2 = this.field4448[var1]; var1 > 0; var1 = var3) { // L: 96 97 108
			var3 = var1 - 1 >>> 1; // L: 98
			class390 var4 = this.field4448[var3]; // L: 99
			if (this.field4449 != null) { // L: 100
				if (this.field4449.compare(var2.field4440, var4.field4440) >= 0) { // L: 101
					break;
				}
			} else if (((Comparable)var2.field4440).compareTo(var4.field4440) >= 0) { // L: 104
				break;
			}

			this.field4448[var1] = var4; // L: 106
			this.field4448[var1].field4439 = var1; // L: 107
		}

		this.field4448[var1] = var2; // L: 110
		this.field4448[var1].field4439 = var1; // L: 111
	} // L: 112

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-466589419"
	)
	void method7257(int var1) {
		class390 var2 = this.field4448[var1]; // L: 116

		int var8;
		for (int var3 = this.field4450 >>> 1; var1 < var3; var1 = var8) { // L: 117 118 140
			int var4 = (var1 << 1) + 1; // L: 119
			class390 var5 = this.field4448[var4]; // L: 120
			int var6 = (var1 << 1) + 2; // L: 121
			class390 var7 = this.field4448[var6]; // L: 122
			if (this.field4449 != null) { // L: 124
				if (var6 < this.field4450 && this.field4449.compare(var5.field4440, var7.field4440) > 0) { // L: 125
					var8 = var6;
				} else {
					var8 = var4; // L: 126
				}
			} else if (var6 < this.field4450 && ((Comparable)var5.field4440).compareTo(var7.field4440) > 0) { // L: 129
				var8 = var6;
			} else {
				var8 = var4; // L: 130
			}

			if (this.field4449 != null) { // L: 132
				if (this.field4449.compare(var2.field4440, this.field4448[var8].field4440) <= 0) { // L: 133
					break;
				}
			} else if (((Comparable)var2.field4440).compareTo(this.field4448[var8].field4440) <= 0) { // L: 136
				break;
			}

			this.field4448[var1] = this.field4448[var8]; // L: 138
			this.field4448[var1].field4439 = var1; // L: 139
		}

		this.field4448[var1] = var2; // L: 142
		this.field4448[var1].field4439 = var1; // L: 143
	} // L: 144

	public boolean remove(Object var1) {
		class390 var2 = (class390)this.field4447.remove(var1); // L: 77
		if (var2 == null) { // L: 78
			return false;
		} else {
			++this.field4446; // L: 79
			--this.field4450; // L: 80
			if (this.field4450 == var2.field4439) { // L: 81
				this.field4448[this.field4450] = null; // L: 82
				return true; // L: 83
			} else {
				class390 var3 = this.field4448[this.field4450]; // L: 85
				this.field4448[this.field4450] = null; // L: 86
				this.field4448[var2.field4439] = var3; // L: 87
				this.field4448[var2.field4439].field4439 = var2.field4439; // L: 88
				this.method7257(var2.field4439); // L: 89
				if (var3 == this.field4448[var2.field4439]) { // L: 90
					this.method7238(var2.field4439);
				}

				return true; // L: 91
			}
		}
	}

	public Object peek() {
		return this.field4450 == 0 ? null : this.field4448[0].field4440; // L: 54 55
	}

	public boolean offer(Object var1) {
		if (this.field4447.containsKey(var1)) { // L: 34
			throw new IllegalArgumentException("");
		} else {
			++this.field4446; // L: 35
			int var2 = this.field4450; // L: 36
			if (var2 >= this.field4448.length) { // L: 37
				this.method7229();
			}

			++this.field4450; // L: 38
			if (var2 == 0) { // L: 39
				this.field4448[0] = new class390(var1, 0); // L: 40
				this.field4447.put(var1, this.field4448[0]); // L: 41
			} else {
				this.field4448[var2] = new class390(var1, var2); // L: 44
				this.field4447.put(var1, this.field4448[var2]); // L: 45
				this.method7238(var2); // L: 46
			}

			return true; // L: 48
		}
	}

	public boolean contains(Object var1) {
		return this.field4447.containsKey(var1); // L: 148
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray(); // L: 154
		if (this.field4449 != null) {
			Arrays.sort(var1, this.field4449); // L: 155
		} else {
			Arrays.sort(var1); // L: 156
		}

		return var1; // L: 157
	}

	public int size() {
		return this.field4450; // L: 29
	}

	public Iterator iterator() {
		return new class391(this); // L: 162
	}

	public Object poll() {
		if (this.field4450 == 0) { // L: 61
			return null;
		} else {
			++this.field4446; // L: 62
			Object var1 = this.field4448[0].field4440; // L: 63
			this.field4447.remove(var1); // L: 64
			--this.field4450; // L: 65
			if (this.field4450 == 0) {
				this.field4448[this.field4450] = null; // L: 66
			} else {
				this.field4448[0] = this.field4448[this.field4450]; // L: 68
				this.field4448[0].field4439 = 0; // L: 69
				this.field4448[this.field4450] = null; // L: 70
				this.method7257(0); // L: 71
			}

			return var1; // L: 73
		}
	}
}
