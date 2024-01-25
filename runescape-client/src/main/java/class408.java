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

@ObfuscatedName("pn")
public class class408 extends AbstractQueue {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lpp;"
	)
	class406[] field4519;
	@ObfuscatedName("ap")
	Map field4521;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -147827643
	)
	int field4520;
	@ObfuscatedName("aj")
	final Comparator field4522;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -215157783
	)
	int field4523;

	public class408(int var1, Comparator var2) {
		this.field4523 = 0; // L: 10
		this.field4519 = new class406[var1]; // L: 17
		this.field4521 = new HashMap(); // L: 18
		this.field4522 = var2; // L: 19
	} // L: 20

	public class408(int var1) {
		this(var1, (Comparator)null); // L: 13
	} // L: 14

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "34"
	)
	void method7563() {
		int var1 = (this.field4519.length << 1) + 1; // L: 23
		this.field4519 = (class406[])((class406[])Arrays.copyOf(this.field4519, var1)); // L: 24
	} // L: 25

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "57"
	)
	void method7568(int var1) {
		class406 var2;
		int var3;
		for (var2 = this.field4519[var1]; var1 > 0; var1 = var3) { // L: 96 97 108
			var3 = var1 - 1 >>> 1; // L: 98
			class406 var4 = this.field4519[var3]; // L: 99
			if (this.field4522 != null) { // L: 100
				if (this.field4522.compare(var2.field4512, var4.field4512) >= 0) { // L: 101
					break;
				}
			} else if (((Comparable)var2.field4512).compareTo(var4.field4512) >= 0) { // L: 104
				break;
			}

			this.field4519[var1] = var4; // L: 106
			this.field4519[var1].field4513 = var1; // L: 107
		}

		this.field4519[var1] = var2; // L: 110
		this.field4519[var1].field4513 = var1; // L: 111
	} // L: 112

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1633022080"
	)
	void method7567(int var1) {
		class406 var2 = this.field4519[var1]; // L: 116

		int var8;
		for (int var3 = this.field4520 >>> 1; var1 < var3; var1 = var8) { // L: 118 140
			int var4 = (var1 << 1) + 1;
			class406 var5 = this.field4519[var4];
			int var6 = (var1 << 1) + 2;
			class406 var7 = this.field4519[var6]; // L: 122
			if (this.field4522 != null) { // L: 124
				if (var6 < this.field4520 && this.field4522.compare(var5.field4512, var7.field4512) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field4520 && ((Comparable)var5.field4512).compareTo(var7.field4512) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field4522 != null) { // L: 132
				if (this.field4522.compare(var2.field4512, this.field4519[var8].field4512) <= 0) { // L: 133
					break;
				}
			} else if (((Comparable)var2.field4512).compareTo(this.field4519[var8].field4512) <= 0) { // L: 136
				break;
			}

			this.field4519[var1] = this.field4519[var8]; // L: 138
			this.field4519[var1].field4513 = var1; // L: 139
		}

		this.field4519[var1] = var2; // L: 142
		this.field4519[var1].field4513 = var1; // L: 143
	} // L: 144

	public boolean remove(Object var1) {
		class406 var2 = (class406)this.field4521.remove(var1); // L: 77
		if (var2 == null) { // L: 78
			return false;
		} else {
			++this.field4523; // L: 79
			--this.field4520; // L: 80
			if (this.field4520 == var2.field4513) { // L: 81
				this.field4519[this.field4520] = null; // L: 82
				return true; // L: 83
			} else {
				class406 var3 = this.field4519[this.field4520]; // L: 85
				this.field4519[this.field4520] = null; // L: 86
				this.field4519[var2.field4513] = var3; // L: 87
				this.field4519[var2.field4513].field4513 = var2.field4513; // L: 88
				this.method7567(var2.field4513); // L: 89
				if (var3 == this.field4519[var2.field4513]) { // L: 90
					this.method7568(var2.field4513);
				}

				return true; // L: 91
			}
		}
	}

	public Object peek() {
		return this.field4520 == 0 ? null : this.field4519[0].field4512; // L: 54 55
	}

	public int size() {
		return this.field4520; // L: 29
	}

	public boolean contains(Object var1) {
		return this.field4521.containsKey(var1); // L: 148
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray(); // L: 154
		if (this.field4522 != null) {
			Arrays.sort(var1, this.field4522); // L: 155
		} else {
			Arrays.sort(var1); // L: 156
		}

		return var1; // L: 157
	}

	public boolean offer(Object var1) {
		if (this.field4521.containsKey(var1)) { // L: 34
			throw new IllegalArgumentException("");
		} else {
			++this.field4523; // L: 35
			int var2 = this.field4520; // L: 36
			if (var2 >= this.field4519.length) { // L: 37
				this.method7563();
			}

			++this.field4520; // L: 38
			if (var2 == 0) { // L: 39
				this.field4519[0] = new class406(var1, 0); // L: 40
				this.field4521.put(var1, this.field4519[0]); // L: 41
			} else {
				this.field4519[var2] = new class406(var1, var2); // L: 44
				this.field4521.put(var1, this.field4519[var2]); // L: 45
				this.method7568(var2); // L: 46
			}

			return true; // L: 48
		}
	}

	public Object poll() {
		if (this.field4520 == 0) { // L: 61
			return null;
		} else {
			++this.field4523; // L: 62
			Object var1 = this.field4519[0].field4512; // L: 63
			this.field4521.remove(var1); // L: 64
			--this.field4520; // L: 65
			if (this.field4520 == 0) {
				this.field4519[this.field4520] = null; // L: 66
			} else {
				this.field4519[0] = this.field4519[this.field4520]; // L: 68
				this.field4519[0].field4513 = 0; // L: 69
				this.field4519[this.field4520] = null; // L: 70
				this.method7567(0); // L: 71
			}

			return var1; // L: 73
		}
	}

	public Iterator iterator() {
		return new class407(this); // L: 162
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-93"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 117

		try {
			var0 = Huffman.getPreferencesFile("", class1.field3.name, true); // L: 119
			Buffer var1 = class93.clientPreferences.toBuffer(); // L: 120
			var0.write(var1.array, 0, var1.offset); // L: 121
		} catch (Exception var3) { // L: 123
		}

		try {
			if (var0 != null) { // L: 125
				var0.closeSync(true); // L: 126
			}
		} catch (Exception var2) { // L: 129
		}

	} // L: 130

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	static void method7592(boolean var0) {
		byte var1 = 0; // L: 1224
		if (!GrandExchangeOfferUnitPriceComparator.method7241()) { // L: 1225
			var1 = 12; // L: 1226
		} else if (VertexNormal.client.method1791() || VertexNormal.client.isOtlTokenRequesterInitialized() || VertexNormal.client.method1257()) { // L: 1228
			var1 = 10; // L: 1229
		}

		Actor.method2489(var1); // L: 1231
		if (var0) { // L: 1232
			Login.Login_username = ""; // L: 1233
			Login.Login_password = ""; // L: 1234
			class130.field1525 = 0; // L: 1235
			class148.otp = ""; // L: 1236
		}

		LoginPacket.method5996(); // L: 1238
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 1240
			Login.currentLoginField = 1; // L: 1241
		} else {
			Login.currentLoginField = 0; // L: 1244
		}

	} // L: 1247
}
