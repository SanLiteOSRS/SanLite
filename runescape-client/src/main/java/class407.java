import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
public class class407 extends AbstractQueue {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lpd;"
	)
	class405[] field4502;
	@ObfuscatedName("al")
	Map field4499;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1212922095
	)
	int field4500;
	@ObfuscatedName("ax")
	final Comparator field4501;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1972894601
	)
	int field4498;

	public class407(int var1, Comparator var2) {
		this.field4498 = 0; // L: 10
		this.field4502 = new class405[var1]; // L: 17
		this.field4499 = new HashMap(); // L: 18
		this.field4501 = var2; // L: 19
	} // L: 20

	public class407(int var1) {
		this(var1, (Comparator)null); // L: 13
	} // L: 14

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "677116728"
	)
	void method7425() {
		int var1 = (this.field4502.length << 1) + 1; // L: 23
		this.field4502 = (class405[])((class405[])Arrays.copyOf(this.field4502, var1)); // L: 24
	} // L: 25

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "733556183"
	)
	void method7454(int var1) {
		class405 var2;
		int var3;
		for (var2 = this.field4502[var1]; var1 > 0; var1 = var3) { // L: 96 97 108
			var3 = var1 - 1 >>> 1; // L: 98
			class405 var4 = this.field4502[var3]; // L: 99
			if (this.field4501 != null) { // L: 100
				if (this.field4501.compare(var2.field4493, var4.field4493) >= 0) { // L: 101
					break;
				}
			} else if (((Comparable)var2.field4493).compareTo(var4.field4493) >= 0) { // L: 104
				break;
			}

			this.field4502[var1] = var4; // L: 106
			this.field4502[var1].field4494 = var1; // L: 107
		}

		this.field4502[var1] = var2; // L: 110
		this.field4502[var1].field4494 = var1; // L: 111
	} // L: 112

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1866393303"
	)
	void method7430(int var1) {
		class405 var2 = this.field4502[var1]; // L: 116

		int var8;
		for (int var3 = this.field4500 >>> 1; var1 < var3; var1 = var8) { // L: 117 118 140
			int var4 = (var1 << 1) + 1; // L: 119
			class405 var5 = this.field4502[var4]; // L: 120
			int var6 = (var1 << 1) + 2; // L: 121
			class405 var7 = this.field4502[var6]; // L: 122
			if (this.field4501 != null) { // L: 124
				if (var6 < this.field4500 && this.field4501.compare(var5.field4493, var7.field4493) > 0) { // L: 125
					var8 = var6;
				} else {
					var8 = var4; // L: 126
				}
			} else if (var6 < this.field4500 && ((Comparable)var5.field4493).compareTo(var7.field4493) > 0) { // L: 129
				var8 = var6;
			} else {
				var8 = var4; // L: 130
			}

			if (this.field4501 != null) { // L: 132
				if (this.field4501.compare(var2.field4493, this.field4502[var8].field4493) <= 0) { // L: 133
					break;
				}
			} else if (((Comparable)var2.field4493).compareTo(this.field4502[var8].field4493) <= 0) { // L: 136
				break;
			}

			this.field4502[var1] = this.field4502[var8]; // L: 138
			this.field4502[var1].field4494 = var1; // L: 139
		}

		this.field4502[var1] = var2; // L: 142
		this.field4502[var1].field4494 = var1; // L: 143
	} // L: 144

	public boolean remove(Object var1) {
		class405 var2 = (class405)this.field4499.remove(var1); // L: 77
		if (var2 == null) { // L: 78
			return false;
		} else {
			++this.field4498; // L: 79
			--this.field4500; // L: 80
			if (this.field4500 == var2.field4494) { // L: 81
				this.field4502[this.field4500] = null; // L: 82
				return true; // L: 83
			} else {
				class405 var3 = this.field4502[this.field4500]; // L: 85
				this.field4502[this.field4500] = null; // L: 86
				this.field4502[var2.field4494] = var3; // L: 87
				this.field4502[var2.field4494].field4494 = var2.field4494; // L: 88
				this.method7430(var2.field4494); // L: 89
				if (var3 == this.field4502[var2.field4494]) { // L: 90
					this.method7454(var2.field4494);
				}

				return true; // L: 91
			}
		}
	}

	public Object peek() {
		return this.field4500 == 0 ? null : this.field4502[0].field4493; // L: 54 55
	}

	public int size() {
		return this.field4500; // L: 29
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray(); // L: 154
		if (this.field4501 != null) {
			Arrays.sort(var1, this.field4501); // L: 155
		} else {
			Arrays.sort(var1); // L: 156
		}

		return var1; // L: 157
	}

	public Iterator iterator() {
		return new class406(this); // L: 162
	}

	public boolean contains(Object var1) {
		return this.field4499.containsKey(var1); // L: 148
	}

	public Object poll() {
		if (this.field4500 == 0) { // L: 61
			return null;
		} else {
			++this.field4498; // L: 62
			Object var1 = this.field4502[0].field4493; // L: 63
			this.field4499.remove(var1); // L: 64
			--this.field4500; // L: 65
			if (this.field4500 == 0) {
				this.field4502[this.field4500] = null; // L: 66
			} else {
				this.field4502[0] = this.field4502[this.field4500]; // L: 68
				this.field4502[0].field4494 = 0; // L: 69
				this.field4502[this.field4500] = null; // L: 70
				this.method7430(0); // L: 71
			}

			return var1; // L: 73
		}
	}

	public boolean offer(Object var1) {
		if (this.field4499.containsKey(var1)) { // L: 34
			throw new IllegalArgumentException("");
		} else {
			++this.field4498; // L: 35
			int var2 = this.field4500; // L: 36
			if (var2 >= this.field4502.length) { // L: 37
				this.method7425();
			}

			++this.field4500; // L: 38
			if (var2 == 0) { // L: 39
				this.field4502[0] = new class405(var1, 0); // L: 40
				this.field4499.put(var1, this.field4502[0]); // L: 41
			} else {
				this.field4502[var2] = new class405(var1, var2); // L: 44
				this.field4499.put(var1, this.field4502[var2]); // L: 45
				this.method7454(var2); // L: 46
			}

			return true; // L: 48
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-105"
	)
	public static void method7453() {
		class326.SpriteBuffer_xOffsets = null; // L: 221
		ModelData0.SpriteBuffer_yOffsets = null; // L: 222
		class59.SpriteBuffer_spriteWidths = null; // L: 223
		class544.SpriteBuffer_spriteHeights = null; // L: 224
		class372.SpriteBuffer_spritePalette = null; // L: 225
		class414.SpriteBuffer_pixels = null; // L: 226
	} // L: 227
}
