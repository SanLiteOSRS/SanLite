import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
@Implements("NameableContainer")
public abstract class NameableContainer {
	@ObfuscatedName("fw")
	@ObfuscatedGetter(
		intValue = -101600863
	)
	static int field4331;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 467089255
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -239528243
	)
	@Export("size")
	int size;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "[Lnd;"
	)
	@Export("array")
	Nameable[] array;
	@ObfuscatedName("n")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("x")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("g")
	@Export("comparator")
	Comparator comparator;

	NameableContainer(int var1) {
		this.size = 0; // L: 10
		this.comparator = null; // L: 14
		this.capacity = var1; // L: 17
		this.array = this.newTypedArray(var1); // L: 18
		this.usernamesMap = new HashMap(var1 / 8); // L: 19
		this.previousUsernamesMap = new HashMap(var1 / 8); // L: 20
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Lnd;",
		garbageValue = "12"
	)
	@Export("newInstance")
	abstract Nameable newInstance();

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)[Lnd;",
		garbageValue = "-1607059691"
	)
	@Export("newTypedArray")
	abstract Nameable[] newTypedArray(int var1);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1713729845"
	)
	@Export("clear")
	public void clear() {
		this.size = 0;
		Arrays.fill(this.array, (Object)null);
		this.usernamesMap.clear();
		this.previousUsernamesMap.clear(); // L: 27
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-846803733"
	)
	@Export("getSize")
	public int getSize() {
		return this.size; // L: 31
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1618539079"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.capacity == this.size;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lqi;B)Z",
		garbageValue = "9"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) { // L: 39
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1); // L: 40 41
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqi;I)Lnd;",
		garbageValue = "-1189586238"
	)
	@Export("getByUsername")
	public Nameable getByUsername(Username var1) {
		Nameable var2 = this.getByCurrentUsername(var1); // L: 45
		return var2 != null ? var2 : this.getByPreviousUsername(var1); // L: 46 47
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lqi;B)Lnd;",
		garbageValue = "-92"
	)
	@Export("getByCurrentUsername")
	Nameable getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.usernamesMap.get(var1); // L: 51 52
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lqi;B)Lnd;",
		garbageValue = "-34"
	)
	@Export("getByPreviousUsername")
	Nameable getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.previousUsernamesMap.get(var1); // L: 56 57
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lqi;I)Z",
		garbageValue = "-2098239373"
	)
	@Export("removeByUsername")
	public final boolean removeByUsername(Username var1) {
		Nameable var2 = this.getByCurrentUsername(var1); // L: 61
		if (var2 == null) { // L: 62
			return false;
		} else {
			this.remove(var2); // L: 63
			return true; // L: 64
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-106911697"
	)
	@Export("remove")
	final void remove(Nameable var1) {
		int var2 = this.indexOf(var1); // L: 68
		if (var2 != -1) { // L: 69
			this.arrayRemove(var2); // L: 70
			this.mapRemove(var1); // L: 71
		}
	} // L: 72

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lqi;I)Lnd;",
		garbageValue = "993935093"
	)
	@Export("addLastNoPreviousUsername")
	Nameable addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null); // L: 75
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lqi;Lqi;I)Lnd;",
		garbageValue = "-154321526"
	)
	@Export("addLast")
	Nameable addLast(Username var1, Username var2) {
		if (this.getByCurrentUsername(var1) != null) { // L: 79
			throw new IllegalStateException();
		} else {
			Nameable var3 = this.newInstance(); // L: 80
			var3.set(var1, var2); // L: 81
			this.arrayAddLast(var3); // L: 82
			this.mapPut(var3); // L: 83
			return var3; // L: 84
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Lnd;",
		garbageValue = "80"
	)
	@Export("get")
	public final Nameable get(int var1) {
		if (var1 >= 0 && var1 < this.size) { // L: 88
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1); // L: 89
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "532327817"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) { // L: 93
			Arrays.sort(this.array, 0, this.size); // L: 94
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator); // L: 97
		}

	} // L: 99

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lqi;Lqi;B)V",
		garbageValue = "-55"
	)
	@Export("changeName")
	final void changeName(Nameable var1, Username var2, Username var3) {
		this.mapRemove(var1); // L: 102
		var1.set(var2, var3); // L: 103
		this.mapPut(var1); // L: 104
	} // L: 105

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)I",
		garbageValue = "-98"
	)
	@Export("indexOf")
	final int indexOf(Nameable var1) {
		for (int var2 = 0; var2 < this.size; ++var2) { // L: 108
			if (this.array[var2] == var1) { // L: 109
				return var2;
			}
		}

		return -1; // L: 111
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-920288527"
	)
	@Export("mapRemove")
	final void mapRemove(Nameable var1) {
		if (this.usernamesMap.remove(var1.username) == null) { // L: 115
			throw new IllegalStateException();
		} else {
			if (var1.previousUsername != null) {
				this.previousUsernamesMap.remove(var1.previousUsername); // L: 116
			}

		}
	} // L: 117

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "1604475672"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(Nameable var1) {
		this.array[++this.size - 1] = var1; // L: 120
	} // L: 121

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "2126464584"
	)
	@Export("mapPut")
	final void mapPut(Nameable var1) {
		this.usernamesMap.put(var1.username, var1); // L: 124
		if (var1.previousUsername != null) { // L: 125
			Nameable var2 = (Nameable)this.previousUsernamesMap.put(var1.previousUsername, var1); // L: 126
			if (var2 != null && var2 != var1) { // L: 127
				var2.previousUsername = null; // L: 128
			}
		}

	} // L: 131

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-9263"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size; // L: 134
		if (var1 < this.size) { // L: 135
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1); // L: 136
		}

	} // L: 138

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-90"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null; // L: 144
	} // L: 145

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "-1520318068"
	)
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) { // L: 148
			this.comparator = var1; // L: 149
		} else if (this.comparator instanceof AbstractUserComparator) { // L: 151
			((AbstractUserComparator)this.comparator).addComparator(var1); // L: 152
		}

	} // L: 154

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;I)I",
		garbageValue = "-126269322"
	)
	public static int method6809(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length(); // L: 21
		int var4 = var1; // L: 22

		for (int var5 = 0; var5 < var3; ++var5) { // L: 23
			char var6 = var2.charAt(var5); // L: 24
			if (var6 <= 127) { // L: 25
				var0[var4++] = (byte)var6; // L: 26
			} else if (var6 <= 2047) { // L: 28
				var0[var4++] = (byte)(192 | var6 >> 6); // L: 29
				var0[var4++] = (byte)(128 | var6 & '?'); // L: 30
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f'); // L: 33
				var0[var4++] = (byte)(128 | var6 >> 6 & 63); // L: 34
				var0[var4++] = (byte)(128 | var6 & '?'); // L: 35
			}
		}

		return var4 - var1; // L: 38
	}
}
