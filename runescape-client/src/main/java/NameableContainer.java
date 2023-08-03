import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qs")
@Implements("NameableContainer")
public abstract class NameableContainer {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1922103807
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1218769909
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 351219353
	)
	@Export("size")
	int size;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	@Export("array")
	Nameable[] array;
	@ObfuscatedName("at")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("ah")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("ax")
	@Export("comparator")
	Comparator comparator;

	NameableContainer(int var1) {
		this.size = 0; // L: 10
		this.comparator = null; // L: 14
		this.capacity = var1; // L: 17
		this.array = this.newTypedArray(var1); // L: 18
		this.usernamesMap = new HashMap(var1 / 8); // L: 19
		this.previousUsernamesMap = new HashMap(var1 / 8); // L: 20
	} // L: 21

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)Lqe;",
		garbageValue = "3401"
	)
	@Export("newInstance")
	abstract Nameable newInstance();

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lqe;",
		garbageValue = "7"
	)
	@Export("newTypedArray")
	abstract Nameable[] newTypedArray(int var1);

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "56"
	)
	@Export("clear")
	public void clear() {
		this.size = 0; // L: 24
		Arrays.fill(this.array, (Object)null); // L: 25
		this.usernamesMap.clear(); // L: 26
		this.previousUsernamesMap.clear(); // L: 27
	} // L: 28

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1660680644"
	)
	@Export("getSize")
	public int getSize() {
		return this.size; // L: 31
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-541461543"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.size == this.capacity; // L: 35
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lui;I)Z",
		garbageValue = "-442095941"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) { // L: 39
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1); // L: 40 41
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lui;I)Lqe;",
		garbageValue = "-1674504609"
	)
	@Export("getByUsername")
	public Nameable getByUsername(Username var1) {
		Nameable var2 = this.getByCurrentUsername(var1); // L: 45
		return var2 != null ? var2 : this.getByPreviousUsername(var1); // L: 46 47
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lui;I)Lqe;",
		garbageValue = "132205062"
	)
	@Export("getByCurrentUsername")
	Nameable getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.usernamesMap.get(var1); // L: 51 52
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lui;I)Lqe;",
		garbageValue = "690241029"
	)
	@Export("getByPreviousUsername")
	Nameable getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.previousUsernamesMap.get(var1); // L: 56 57
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lui;I)Z",
		garbageValue = "1922358891"
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

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lqe;I)V",
		garbageValue = "-696802687"
	)
	@Export("remove")
	final void remove(Nameable var1) {
		int var2 = this.indexOf(var1); // L: 68
		if (var2 != -1) { // L: 69
			this.arrayRemove(var2); // L: 70
			this.mapRemove(var1); // L: 71
		}
	} // L: 72

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lui;I)Lqe;",
		garbageValue = "-1994669741"
	)
	@Export("addLastNoPreviousUsername")
	Nameable addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null); // L: 75
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lui;Lui;I)Lqe;",
		garbageValue = "-1347062581"
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

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)Lqe;",
		garbageValue = "260546627"
	)
	@Export("get")
	public final Nameable get(int var1) {
		if (var1 >= 0 && var1 < this.size) { // L: 88
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1); // L: 89
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1082858146"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) { // L: 93
			Arrays.sort(this.array, 0, this.size); // L: 94
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator); // L: 97
		}

	} // L: 99

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lqe;Lui;Lui;B)V",
		garbageValue = "-42"
	)
	@Export("changeName")
	final void changeName(Nameable var1, Username var2, Username var3) {
		this.mapRemove(var1); // L: 102
		var1.set(var2, var3); // L: 103
		this.mapPut(var1); // L: 104
	} // L: 105

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lqe;I)I",
		garbageValue = "-2051354785"
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lqe;I)V",
		garbageValue = "-1083661089"
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lqe;I)V",
		garbageValue = "1263127165"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(Nameable var1) {
		this.array[++this.size - 1] = var1; // L: 120
	} // L: 121

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lqe;I)V",
		garbageValue = "540764510"
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

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1297180412"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size; // L: 134
		if (var1 < this.size) { // L: 135
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1); // L: 136
		}

	} // L: 138

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1813300749"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null; // L: 144
	} // L: 145

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "2145677034"
	)
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) { // L: 148
			this.comparator = var1; // L: 149
		} else if (this.comparator instanceof AbstractUserComparator) { // L: 151
			((AbstractUserComparator)this.comparator).addComparator(var1); // L: 152
		}

	} // L: 154

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1830698191"
	)
	static int method8016(int var0, int var1) {
		int var2 = var1 - 334; // L: 5758
		if (var2 < 0) { // L: 5759
			var2 = 0;
		} else if (var2 > 100) { // L: 5760
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight; // L: 5761
		return var0 * var3 / 256; // L: 5762
	}
}
