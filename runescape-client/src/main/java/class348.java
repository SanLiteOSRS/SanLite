import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
public class class348 extends AbstractQueue {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lmo;"
	)
	class346[] field4168;
	@ObfuscatedName("h")
	Map field4170;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 54853697
	)
	int field4169;
	@ObfuscatedName("v")
	final Comparator field4171;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 155497715
	)
	int field4172;

	public class348(int var1, Comparator var2) {
		this.field4172 = 0; // L: 10
		this.field4168 = new class346[var1]; // L: 17
		this.field4170 = new HashMap(); // L: 18
		this.field4171 = var2; // L: 19
	} // L: 20

	public class348(int var1) {
		this(var1, (Comparator)null); // L: 13
	} // L: 14

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1355594095"
	)
	void method6266() {
		int var1 = (this.field4168.length << 1) + 1; // L: 23
		this.field4168 = (class346[])((class346[])Arrays.copyOf(this.field4168, var1)); // L: 24
	} // L: 25

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-888931848"
	)
	void method6288(int var1) {
		class346 var2;
		int var3;
		for (var2 = this.field4168[var1]; var1 > 0; var1 = var3) { // L: 96 97 108
			var3 = var1 - 1 >>> 1; // L: 98
			class346 var4 = this.field4168[var3]; // L: 99
			if (this.field4171 != null) { // L: 100
				if (this.field4171.compare(var2.field4160, var4.field4160) >= 0) { // L: 101
					break;
				}
			} else if (((Comparable)var2.field4160).compareTo(var4.field4160) >= 0) { // L: 104
				break;
			}

			this.field4168[var1] = var4; // L: 106
			this.field4168[var1].field4161 = var1; // L: 107
		}

		this.field4168[var1] = var2; // L: 110
		this.field4168[var1].field4161 = var1; // L: 111
	} // L: 112

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1674692897"
	)
	void method6264(int var1) {
		class346 var2 = this.field4168[var1]; // L: 116

		int var8;
		for (int var3 = this.field4169 >>> 1; var1 < var3; var1 = var8) { // L: 117 118 140
			int var4 = (var1 << 1) + 1; // L: 119
			class346 var5 = this.field4168[var4]; // L: 120
			int var6 = (var1 << 1) + 2; // L: 121
			class346 var7 = this.field4168[var6]; // L: 122
			if (this.field4171 != null) { // L: 124
				if (var6 < this.field4169 && this.field4171.compare(var5.field4160, var7.field4160) > 0) { // L: 125
					var8 = var6;
				} else {
					var8 = var4; // L: 126
				}
			} else if (var6 < this.field4169 && ((Comparable)var5.field4160).compareTo(var7.field4160) > 0) { // L: 129
				var8 = var6;
			} else {
				var8 = var4; // L: 130
			}

			if (this.field4171 != null) { // L: 132
				if (this.field4171.compare(var2.field4160, this.field4168[var8].field4160) <= 0) { // L: 133
					break;
				}
			} else if (((Comparable)var2.field4160).compareTo(this.field4168[var8].field4160) <= 0) { // L: 136
				break;
			}

			this.field4168[var1] = this.field4168[var8]; // L: 138
			this.field4168[var1].field4161 = var1; // L: 139
		}

		this.field4168[var1] = var2; // L: 142
		this.field4168[var1].field4161 = var1; // L: 143
	} // L: 144

	public boolean remove(Object var1) {
		class346 var2 = (class346)this.field4170.remove(var1); // L: 77
		if (var2 == null) { // L: 78
			return false;
		} else {
			++this.field4172; // L: 79
			--this.field4169; // L: 80
			if (this.field4169 == var2.field4161) { // L: 81
				this.field4168[this.field4169] = null; // L: 82
				return true; // L: 83
			} else {
				class346 var3 = this.field4168[this.field4169]; // L: 85
				this.field4168[this.field4169] = null; // L: 86
				this.field4168[var2.field4161] = var3; // L: 87
				this.field4168[var2.field4161].field4161 = var2.field4161; // L: 88
				this.method6264(var2.field4161); // L: 89
				if (var3 == this.field4168[var2.field4161]) { // L: 90
					this.method6288(var2.field4161);
				}

				return true; // L: 91
			}
		}
	}

	public Object peek() {
		return this.field4169 == 0 ? null : this.field4168[0].field4160; // L: 54 55
	}

	public Object poll() {
		if (this.field4169 == 0) { // L: 61
			return null;
		} else {
			++this.field4172; // L: 62
			Object var1 = this.field4168[0].field4160; // L: 63
			this.field4170.remove(var1); // L: 64
			--this.field4169; // L: 65
			if (this.field4169 == 0) {
				this.field4168[this.field4169] = null; // L: 66
			} else {
				this.field4168[0] = this.field4168[this.field4169]; // L: 68
				this.field4168[0].field4161 = 0; // L: 69
				this.field4168[this.field4169] = null; // L: 70
				this.method6264(0); // L: 71
			}

			return var1; // L: 73
		}
	}

	public int size() {
		return this.field4169; // L: 29
	}

	public boolean contains(Object var1) {
		return this.field4170.containsKey(var1); // L: 148
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray(); // L: 154
		if (this.field4171 != null) {
			Arrays.sort(var1, this.field4171); // L: 155
		} else {
			Arrays.sort(var1); // L: 156
		}

		return var1; // L: 157
	}

	public boolean offer(Object var1) {
		if (this.field4170.containsKey(var1)) { // L: 34
			throw new IllegalArgumentException("");
		} else {
			++this.field4172; // L: 35
			int var2 = this.field4169; // L: 36
			if (var2 >= this.field4168.length) { // L: 37
				this.method6266();
			}

			++this.field4169; // L: 38
			if (var2 == 0) { // L: 39
				this.field4168[0] = new class346(var1, 0); // L: 40
				this.field4170.put(var1, this.field4168[0]); // L: 41
			} else {
				this.field4168[var2] = new class346(var1, var2); // L: 44
				this.field4170.put(var1, this.field4168[var2]); // L: 45
				this.method6288(var2); // L: 46
			}

			return true; // L: 48
		}
	}

	public Iterator iterator() {
		return new class347(this); // L: 162
	}
}
