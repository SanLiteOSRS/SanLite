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

@ObfuscatedName("pt")
public class class412 extends AbstractQueue {
	@ObfuscatedName("dd")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lpi;"
	)
	class410[] field4584;
	@ObfuscatedName("ah")
	Map field4578;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 26940847
	)
	int field4580;
	@ObfuscatedName("at")
	final Comparator field4581;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1456283695
	)
	int field4582;

	public class412(int var1, Comparator var2) {
		this.field4582 = 0; // L: 10
		this.field4584 = new class410[var1]; // L: 17
		this.field4578 = new HashMap(); // L: 18
		this.field4581 = var2; // L: 19
	} // L: 20

	public class412(int var1) {
		this(var1, (Comparator)null); // L: 13
	} // L: 14

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "887913874"
	)
	void method7493() {
		int var1 = (this.field4584.length << 1) + 1; // L: 23
		this.field4584 = (class410[])((class410[])Arrays.copyOf(this.field4584, var1)); // L: 24
	} // L: 25

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2091204403"
	)
	void method7475(int var1) {
		class410 var2;
		int var3;
		for (var2 = this.field4584[var1]; var1 > 0; var1 = var3) { // L: 96 97 108
			var3 = var1 - 1 >>> 1; // L: 98
			class410 var4 = this.field4584[var3]; // L: 99
			if (this.field4581 != null) { // L: 100
				if (this.field4581.compare(var2.field4573, var4.field4573) >= 0) { // L: 101
					break;
				}
			} else if (((Comparable)var2.field4573).compareTo(var4.field4573) >= 0) { // L: 104
				break;
			}

			this.field4584[var1] = var4; // L: 106
			this.field4584[var1].field4572 = var1; // L: 107
		}

		this.field4584[var1] = var2; // L: 110
		this.field4584[var1].field4572 = var1; // L: 111
	} // L: 112

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-1"
	)
	void method7476(int var1) {
		class410 var2 = this.field4584[var1]; // L: 116

		int var8;
		for (int var3 = this.field4580 >>> 1; var1 < var3; var1 = var8) { // L: 117 118 140
			int var4 = (var1 << 1) + 1; // L: 119
			class410 var5 = this.field4584[var4]; // L: 120
			int var6 = (var1 << 1) + 2; // L: 121
			class410 var7 = this.field4584[var6]; // L: 122
			if (this.field4581 != null) { // L: 124
				if (var6 < this.field4580 && this.field4581.compare(var5.field4573, var7.field4573) > 0) { // L: 125
					var8 = var6;
				} else {
					var8 = var4; // L: 126
				}
			} else if (var6 < this.field4580 && ((Comparable)var5.field4573).compareTo(var7.field4573) > 0) { // L: 129
				var8 = var6;
			} else {
				var8 = var4; // L: 130
			}

			if (this.field4581 != null) { // L: 132
				if (this.field4581.compare(var2.field4573, this.field4584[var8].field4573) <= 0) { // L: 133
					break;
				}
			} else if (((Comparable)var2.field4573).compareTo(this.field4584[var8].field4573) <= 0) { // L: 136
				break;
			}

			this.field4584[var1] = this.field4584[var8]; // L: 138
			this.field4584[var1].field4572 = var1; // L: 139
		}

		this.field4584[var1] = var2; // L: 142
		this.field4584[var1].field4572 = var1; // L: 143
	} // L: 144

	public boolean remove(Object var1) {
		class410 var2 = (class410)this.field4578.remove(var1); // L: 77
		if (var2 == null) { // L: 78
			return false;
		} else {
			++this.field4582; // L: 79
			--this.field4580; // L: 80
			if (var2.field4572 == this.field4580) { // L: 81
				this.field4584[this.field4580] = null; // L: 82
				return true; // L: 83
			} else {
				class410 var3 = this.field4584[this.field4580]; // L: 85
				this.field4584[this.field4580] = null; // L: 86
				this.field4584[var2.field4572] = var3; // L: 87
				this.field4584[var2.field4572].field4572 = var2.field4572; // L: 88
				this.method7476(var2.field4572); // L: 89
				if (var3 == this.field4584[var2.field4572]) { // L: 90
					this.method7475(var2.field4572);
				}

				return true; // L: 91
			}
		}
	}

	public Object peek() {
		return this.field4580 == 0 ? null : this.field4584[0].field4573; // L: 54 55
	}

	public Object poll() {
		if (this.field4580 == 0) { // L: 61
			return null;
		} else {
			++this.field4582; // L: 62
			Object var1 = this.field4584[0].field4573; // L: 63
			this.field4578.remove(var1); // L: 64
			--this.field4580; // L: 65
			if (this.field4580 == 0) {
				this.field4584[this.field4580] = null; // L: 66
			} else {
				this.field4584[0] = this.field4584[this.field4580]; // L: 68
				this.field4584[0].field4572 = 0; // L: 69
				this.field4584[this.field4580] = null; // L: 70
				this.method7476(0); // L: 71
			}

			return var1; // L: 73
		}
	}

	public boolean offer(Object var1) {
		if (this.field4578.containsKey(var1)) { // L: 34
			throw new IllegalArgumentException("");
		} else {
			++this.field4582; // L: 35
			int var2 = this.field4580; // L: 36
			if (var2 >= this.field4584.length) { // L: 37
				this.method7493();
			}

			++this.field4580; // L: 38
			if (var2 == 0) { // L: 39
				this.field4584[0] = new class410(var1, 0); // L: 40
				this.field4578.put(var1, this.field4584[0]); // L: 41
			} else {
				this.field4584[var2] = new class410(var1, var2); // L: 44
				this.field4578.put(var1, this.field4584[var2]); // L: 45
				this.method7475(var2); // L: 46
			}

			return true; // L: 48
		}
	}

	public int size() {
		return this.field4580; // L: 29
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray(); // L: 154
		if (this.field4581 != null) {
			Arrays.sort(var1, this.field4581); // L: 155
		} else {
			Arrays.sort(var1); // L: 156
		}

		return var1; // L: 157
	}

	public Iterator iterator() {
		return new class411(this); // L: 162
	}

	public boolean contains(Object var1) {
		return this.field4578.containsKey(var1); // L: 148
	}
}
