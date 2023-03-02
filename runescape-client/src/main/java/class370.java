import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
public class class370 extends AbstractQueue {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Lnf;"
	)
	class368[] field4387;
	@ObfuscatedName("w")
	Map field4384;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 53756609
	)
	int field4385;
	@ObfuscatedName("s")
	final Comparator field4383;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 480929613
	)
	int field4386;

	public class370(int var1, Comparator var2) {
		this.field4386 = 0; // L: 10
		this.field4387 = new class368[var1]; // L: 17
		this.field4384 = new HashMap(); // L: 18
		this.field4383 = var2;
	}

	public class370(int var1) {
		this(var1, (Comparator)null);
	} // L: 14

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "119219884"
	)
	void method7038() {
		int var1 = (this.field4387.length << 1) + 1;
		this.field4387 = (class368[])((class368[])Arrays.copyOf(this.field4387, var1));
	} // L: 25

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	void method7043(int var1) {
		class368 var2;
		int var3;
		for (var2 = this.field4387[var1]; var1 > 0; var1 = var3) { // L: 96 97 108
			var3 = var1 - 1 >>> 1; // L: 98
			class368 var4 = this.field4387[var3]; // L: 99
			if (this.field4383 != null) { // L: 100
				if (this.field4383.compare(var2.field4377, var4.field4377) >= 0) { // L: 101
					break;
				}
			} else if (((Comparable)var2.field4377).compareTo(var4.field4377) >= 0) { // L: 104
				break;
			}

			this.field4387[var1] = var4; // L: 106
			this.field4387[var1].field4376 = var1; // L: 107
		}

		this.field4387[var1] = var2; // L: 110
		this.field4387[var1].field4376 = var1; // L: 111
	} // L: 112

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-95"
	)
	void method7040(int var1) {
		class368 var2 = this.field4387[var1]; // L: 116

		int var8;
		for (int var3 = this.field4385 >>> 1; var1 < var3; var1 = var8) { // L: 117 118 140
			int var4 = (var1 << 1) + 1; // L: 119
			class368 var5 = this.field4387[var4]; // L: 120
			int var6 = (var1 << 1) + 2; // L: 121
			class368 var7 = this.field4387[var6]; // L: 122
			if (this.field4383 != null) { // L: 124
				if (var6 < this.field4385 && this.field4383.compare(var5.field4377, var7.field4377) > 0) { // L: 125
					var8 = var6;
				} else {
					var8 = var4; // L: 126
				}
			} else if (var6 < this.field4385 && ((Comparable)var5.field4377).compareTo(var7.field4377) > 0) { // L: 129
				var8 = var6;
			} else {
				var8 = var4; // L: 130
			}

			if (this.field4383 != null) { // L: 132
				if (this.field4383.compare(var2.field4377, this.field4387[var8].field4377) <= 0) { // L: 133
					break;
				}
			} else if (((Comparable)var2.field4377).compareTo(this.field4387[var8].field4377) <= 0) { // L: 136
				break;
			}

			this.field4387[var1] = this.field4387[var8]; // L: 138
			this.field4387[var1].field4376 = var1; // L: 139
		}

		this.field4387[var1] = var2; // L: 142
		this.field4387[var1].field4376 = var1; // L: 143
	} // L: 144

	public boolean remove(Object var1) {
		class368 var2 = (class368)this.field4384.remove(var1); // L: 77
		if (var2 == null) { // L: 78
			return false;
		} else {
			++this.field4386; // L: 79
			--this.field4385; // L: 80
			if (var2.field4376 == this.field4385) { // L: 81
				this.field4387[this.field4385] = null; // L: 82
				return true; // L: 83
			} else {
				class368 var3 = this.field4387[this.field4385]; // L: 85
				this.field4387[this.field4385] = null; // L: 86
				this.field4387[var2.field4376] = var3; // L: 87
				this.field4387[var2.field4376].field4376 = var2.field4376; // L: 88
				this.method7040(var2.field4376); // L: 89
				if (var3 == this.field4387[var2.field4376]) { // L: 90
					this.method7043(var2.field4376);
				}

				return true; // L: 91
			}
		}
	}

	public Object peek() {
		return this.field4385 == 0 ? null : this.field4387[0].field4377; // L: 54 55
	}

	public int size() {
		return this.field4385;
	}

	public boolean offer(Object var1) {
		if (this.field4384.containsKey(var1)) { // L: 34
			throw new IllegalArgumentException("");
		} else {
			++this.field4386; // L: 35
			int var2 = this.field4385; // L: 36
			if (var2 >= this.field4387.length) { // L: 37
				this.method7038();
			}

			++this.field4385; // L: 38
			if (var2 == 0) { // L: 39
				this.field4387[0] = new class368(var1, 0); // L: 40
				this.field4384.put(var1, this.field4387[0]); // L: 41
			} else {
				this.field4387[var2] = new class368(var1, var2); // L: 44
				this.field4384.put(var1, this.field4387[var2]); // L: 45
				this.method7043(var2); // L: 46
			}

			return true; // L: 48
		}
	}

	public Object poll() {
		if (this.field4385 == 0) { // L: 61
			return null;
		} else {
			++this.field4386; // L: 62
			Object var1 = this.field4387[0].field4377; // L: 63
			this.field4384.remove(var1); // L: 64
			--this.field4385; // L: 65
			if (this.field4385 == 0) {
				this.field4387[this.field4385] = null; // L: 66
			} else {
				this.field4387[0] = this.field4387[this.field4385]; // L: 68
				this.field4387[0].field4376 = 0; // L: 69
				this.field4387[this.field4385] = null; // L: 70
				this.method7040(0); // L: 71
			}

			return var1; // L: 73
		}
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray(); // L: 154
		if (this.field4383 != null) {
			Arrays.sort(var1, this.field4383); // L: 155
		} else {
			Arrays.sort(var1); // L: 156
		}

		return var1; // L: 157
	}

	public boolean contains(Object var1) {
		return this.field4384.containsKey(var1); // L: 148
	}

	public Iterator iterator() {
		return new class369(this); // L: 162
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "78"
	)
	public static int method7065(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0; // L: 12 13 15
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqn;",
		garbageValue = "-49"
	)
	public static class463 method7047(int var0) {
		int var1 = class461.field4893[var0]; // L: 19
		if (var1 == 1) { // L: 20
			return class463.field4897; // L: 21
		} else if (var1 == 2) { // L: 23
			return class463.field4903; // L: 24
		} else {
			return var1 == 3 ? class463.field4898 : null; // L: 26 27 29
		}
	}
}
