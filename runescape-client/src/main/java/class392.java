import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
public class class392 extends AbstractQueue {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lph;"
	)
	class390[] field4440;
	@ObfuscatedName("aj")
	Map field4438;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -169487793
	)
	int field4439;
	@ObfuscatedName("aw")
	final Comparator field4437;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2010446999
	)
	int field4441;

	public class392(int var1, Comparator var2) {
		this.field4441 = 0; // L: 10
		this.field4440 = new class390[var1]; // L: 17
		this.field4438 = new HashMap(); // L: 18
		this.field4437 = var2; // L: 19
	} // L: 20

	public class392(int var1) {
		this(var1, (Comparator)null); // L: 13
	} // L: 14

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "11"
	)
	void method7295() {
		int var1 = (this.field4440.length << 1) + 1; // L: 23
		this.field4440 = (class390[])((class390[])Arrays.copyOf(this.field4440, var1)); // L: 24
	} // L: 25

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1889744178"
	)
	void method7297(int var1) {
		class390 var2;
		int var3;
		for (var2 = this.field4440[var1]; var1 > 0; var1 = var3) { // L: 97 108
			var3 = var1 - 1 >>> 1;
			class390 var4 = this.field4440[var3];
			if (this.field4437 != null) { // L: 100
				if (this.field4437.compare(var2.field4426, var4.field4426) >= 0) { // L: 101
					break;
				}
			} else if (((Comparable)var2.field4426).compareTo(var4.field4426) >= 0) { // L: 104
				break;
			}

			this.field4440[var1] = var4; // L: 106
			this.field4440[var1].field4428 = var1; // L: 107
		}

		this.field4440[var1] = var2; // L: 110
		this.field4440[var1].field4428 = var1; // L: 111
	} // L: 112

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1954379919"
	)
	void method7319(int var1) {
		class390 var2 = this.field4440[var1]; // L: 116

		int var8;
		for (int var3 = this.field4439 >>> 1; var1 < var3; var1 = var8) { // L: 117 118 140
			int var4 = (var1 << 1) + 1; // L: 119
			class390 var5 = this.field4440[var4]; // L: 120
			int var6 = (var1 << 1) + 2; // L: 121
			class390 var7 = this.field4440[var6]; // L: 122
			if (this.field4437 != null) { // L: 124
				if (var6 < this.field4439 && this.field4437.compare(var5.field4426, var7.field4426) > 0) { // L: 125
					var8 = var6;
				} else {
					var8 = var4; // L: 126
				}
			} else if (var6 < this.field4439 && ((Comparable)var5.field4426).compareTo(var7.field4426) > 0) { // L: 129
				var8 = var6;
			} else {
				var8 = var4; // L: 130
			}

			if (this.field4437 != null) { // L: 132
				if (this.field4437.compare(var2.field4426, this.field4440[var8].field4426) <= 0) { // L: 133
					break;
				}
			} else if (((Comparable)var2.field4426).compareTo(this.field4440[var8].field4426) <= 0) { // L: 136
				break;
			}

			this.field4440[var1] = this.field4440[var8]; // L: 138
			this.field4440[var1].field4428 = var1; // L: 139
		}

		this.field4440[var1] = var2; // L: 142
		this.field4440[var1].field4428 = var1; // L: 143
	} // L: 144

	public boolean remove(Object var1) {
		class390 var2 = (class390)this.field4438.remove(var1);
		if (var2 == null) { // L: 78
			return false;
		} else {
			++this.field4441;
			--this.field4439;
			if (this.field4439 == var2.field4428) { // L: 81
				this.field4440[this.field4439] = null;
				return true; // L: 83
			} else {
				class390 var3 = this.field4440[this.field4439]; // L: 85
				this.field4440[this.field4439] = null;
				this.field4440[var2.field4428] = var3; // L: 87
				this.field4440[var2.field4428].field4428 = var2.field4428;
				this.method7319(var2.field4428); // L: 89
				if (var3 == this.field4440[var2.field4428]) {
					this.method7297(var2.field4428);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field4439 == 0 ? null : this.field4440[0].field4426; // L: 54
	}

	public boolean offer(Object var1) {
		if (this.field4438.containsKey(var1)) { // L: 34
			throw new IllegalArgumentException("");
		} else {
			++this.field4441; // L: 35
			int var2 = this.field4439;
			if (var2 >= this.field4440.length) {
				this.method7295();
			}

			++this.field4439;
			if (var2 == 0) { // L: 39
				this.field4440[0] = new class390(var1, 0); // L: 40
				this.field4438.put(var1, this.field4440[0]);
			} else {
				this.field4440[var2] = new class390(var1, var2); // L: 44
				this.field4438.put(var1, this.field4440[var2]);
				this.method7297(var2); // L: 46
			}

			return true; // L: 48
		}
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray(); // L: 154
		if (this.field4437 != null) {
			Arrays.sort(var1, this.field4437); // L: 155
		} else {
			Arrays.sort(var1); // L: 156
		}

		return var1; // L: 157
	}

	public Iterator iterator() {
		return new class391(this); // L: 162
	}

	public int size() {
		return this.field4439; // L: 29
	}

	public Object poll() {
		if (this.field4439 == 0) {
			return null;
		} else {
			++this.field4441; // L: 62
			Object var1 = this.field4440[0].field4426; // L: 63
			this.field4438.remove(var1); // L: 64
			--this.field4439;
			if (this.field4439 == 0) {
				this.field4440[this.field4439] = null; // L: 66
			} else {
				this.field4440[0] = this.field4440[this.field4439]; // L: 68
				this.field4440[0].field4428 = 0;
				this.field4440[this.field4439] = null; // L: 70
				this.method7319(0); // L: 71
			}

			return var1;
		}
	}

	public boolean contains(Object var1) {
		return this.field4438.containsKey(var1); // L: 148
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lsl;I)Ljava/lang/String;",
		garbageValue = "2171169"
	)
	public static String method7322(CharSequence var0, LoginType var1) {
		if (var0 == null) { // L: 36
			return null;
		} else {
			int var2 = 0; // L: 37

			int var3;
			boolean var4;
			char var5;
			for (var3 = var0.length(); var2 < var3; ++var2) { // L: 38 41 51
				var5 = var0.charAt(var2); // L: 43
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-'; // L: 45
				if (!var4) { // L: 47
					break;
				}
			}

			while (var3 > var2) { // L: 55
				var5 = var0.charAt(var3 - 1); // L: 57
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-'; // L: 59
				if (!var4) { // L: 61
					break;
				}

				--var3; // L: 65
			}

			int var10 = var3 - var2; // L: 67
			if (var10 >= 1) { // L: 69
				byte var6;
				if (var1 == null) { // L: 73
					var6 = 12; // L: 74
				} else {
					switch(var1.field4989) { // L: 77
					case 5:
						var6 = 20; // L: 79
						break; // L: 80
					default:
						var6 = 12; // L: 82
					}
				}

				if (var10 <= var6) { // L: 86
					StringBuilder var9 = new StringBuilder(var10); // L: 90

					for (int var11 = var2; var11 < var3; ++var11) { // L: 91
						char var7 = var0.charAt(var11); // L: 92
						if (class136.method3133(var7)) { // L: 93
							char var8 = class452.method8285(var7); // L: 94
							if (var8 != 0) { // L: 95
								var9.append(var8); // L: 96
							}
						}
					}

					if (var9.length() == 0) { // L: 98
						return null;
					}

					return var9.toString(); // L: 99
				}
			}

			return null; // L: 88
		}
	}
}
