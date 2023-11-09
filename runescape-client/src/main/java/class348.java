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

@ObfuscatedName("mh")
public class class348 extends AbstractQueue {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lmg;"
	)
	class346[] field4191;
	@ObfuscatedName("q")
	Map field4192;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 567101989
	)
	int field4193;
	@ObfuscatedName("u")
	final Comparator field4195;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1721325885
	)
	int field4194;

	public class348(int var1, Comparator var2) {
		this.field4194 = 0; // L: 10
		this.field4191 = new class346[var1]; // L: 17
		this.field4192 = new HashMap(); // L: 18
		this.field4195 = var2; // L: 19
	} // L: 20

	public class348(int var1) {
		this(var1, (Comparator)null); // L: 13
	} // L: 14

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "123472587"
	)
	void method6372() {
		int var1 = (this.field4191.length << 1) + 1; // L: 23
		this.field4191 = (class346[])((class346[])Arrays.copyOf(this.field4191, var1)); // L: 24
	} // L: 25

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2118557604"
	)
	void method6366(int var1) {
		class346 var2;
		int var3;
		for (var2 = this.field4191[var1]; var1 > 0; var1 = var3) { // L: 96 97 108
			var3 = var1 - 1 >>> 1; // L: 98
			class346 var4 = this.field4191[var3]; // L: 99
			if (this.field4195 != null) { // L: 100
				if (this.field4195.compare(var2.field4185, var4.field4185) >= 0) { // L: 101
					break;
				}
			} else if (((Comparable)var2.field4185).compareTo(var4.field4185) >= 0) { // L: 104
				break;
			}

			this.field4191[var1] = var4; // L: 106
			this.field4191[var1].field4184 = var1; // L: 107
		}

		this.field4191[var1] = var2; // L: 110
		this.field4191[var1].field4184 = var1; // L: 111
	} // L: 112

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-61"
	)
	void method6367(int var1) {
		class346 var2 = this.field4191[var1]; // L: 116

		int var8;
		for (int var3 = this.field4193 >>> 1; var1 < var3; var1 = var8) { // L: 117 118 140
			int var4 = (var1 << 1) + 1; // L: 119
			class346 var5 = this.field4191[var4]; // L: 120
			int var6 = (var1 << 1) + 2; // L: 121
			class346 var7 = this.field4191[var6]; // L: 122
			if (this.field4195 != null) { // L: 124
				if (var6 < this.field4193 && this.field4195.compare(var5.field4185, var7.field4185) > 0) { // L: 125
					var8 = var6;
				} else {
					var8 = var4; // L: 126
				}
			} else if (var6 < this.field4193 && ((Comparable)var5.field4185).compareTo(var7.field4185) > 0) { // L: 129
				var8 = var6;
			} else {
				var8 = var4; // L: 130
			}

			if (this.field4195 != null) { // L: 132
				if (this.field4195.compare(var2.field4185, this.field4191[var8].field4185) <= 0) { // L: 133
					break;
				}
			} else if (((Comparable)var2.field4185).compareTo(this.field4191[var8].field4185) <= 0) { // L: 136
				break;
			}

			this.field4191[var1] = this.field4191[var8]; // L: 138
			this.field4191[var1].field4184 = var1; // L: 139
		}

		this.field4191[var1] = var2; // L: 142
		this.field4191[var1].field4184 = var1; // L: 143
	} // L: 144

	public boolean remove(Object var1) {
		class346 var2 = (class346)this.field4192.remove(var1); // L: 77
		if (var2 == null) { // L: 78
			return false;
		} else {
			++this.field4194; // L: 79
			--this.field4193; // L: 80
			if (var2.field4184 == this.field4193) { // L: 81
				this.field4191[this.field4193] = null; // L: 82
				return true; // L: 83
			} else {
				class346 var3 = this.field4191[this.field4193]; // L: 85
				this.field4191[this.field4193] = null; // L: 86
				this.field4191[var2.field4184] = var3; // L: 87
				this.field4191[var2.field4184].field4184 = var2.field4184; // L: 88
				this.method6367(var2.field4184); // L: 89
				if (var3 == this.field4191[var2.field4184]) { // L: 90
					this.method6366(var2.field4184);
				}

				return true; // L: 91
			}
		}
	}

	public Object peek() {
		return this.field4193 == 0 ? null : this.field4191[0].field4185; // L: 54 55
	}

	public Object poll() {
		if (this.field4193 == 0) { // L: 61
			return null;
		} else {
			++this.field4194; // L: 62
			Object var1 = this.field4191[0].field4185; // L: 63
			this.field4192.remove(var1); // L: 64
			--this.field4193; // L: 65
			if (this.field4193 == 0) {
				this.field4191[this.field4193] = null; // L: 66
			} else {
				this.field4191[0] = this.field4191[this.field4193]; // L: 68
				this.field4191[0].field4184 = 0; // L: 69
				this.field4191[this.field4193] = null; // L: 70
				this.method6367(0); // L: 71
			}

			return var1; // L: 73
		}
	}

	public int size() {
		return this.field4193; // L: 29
	}

	public boolean offer(Object var1) {
		if (this.field4192.containsKey(var1)) { // L: 34
			throw new IllegalArgumentException("");
		} else {
			++this.field4194; // L: 35
			int var2 = this.field4193; // L: 36
			if (var2 >= this.field4191.length) { // L: 37
				this.method6372();
			}

			++this.field4193; // L: 38
			if (var2 == 0) { // L: 39
				this.field4191[0] = new class346(var1, 0); // L: 40
				this.field4192.put(var1, this.field4191[0]); // L: 41
			} else {
				this.field4191[var2] = new class346(var1, var2); // L: 44
				this.field4192.put(var1, this.field4191[var2]); // L: 45
				this.method6366(var2); // L: 46
			}

			return true; // L: 48
		}
	}

	public Iterator iterator() {
		return new class347(this); // L: 162
	}

	public boolean contains(Object var1) {
		return this.field4192.containsKey(var1); // L: 148
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray(); // L: 154
		if (this.field4195 != null) {
			Arrays.sort(var1, this.field4195); // L: 155
		} else {
			Arrays.sort(var1); // L: 156
		}

		return var1; // L: 157
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1891573413"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 10478

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 10479
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 10480
		}

		if (var1.length() > 9) { // L: 10482
			return " " + class82.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + class82.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + class82.colorStartTag(16776960) + var1 + "</col>"; // L: 10483 10484
		}
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(Lku;IIII)V",
		garbageValue = "-748933635"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false); // L: 12123
		if (var4 != null) { // L: 12124
			if (Client.minimapState < 3) { // L: 12125
				class21.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12126
			}

		}
	} // L: 12127
}
