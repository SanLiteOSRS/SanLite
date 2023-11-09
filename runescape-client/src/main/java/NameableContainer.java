import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qu")
@Implements("NameableContainer")
public abstract class NameableContainer {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1300443849
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2000752617
	)
	@Export("size")
	int size;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lqd;"
	)
	@Export("array")
	Nameable[] array;
	@ObfuscatedName("aw")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("ae")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("ah")
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lqd;",
		garbageValue = "-99"
	)
	@Export("newInstance")
	abstract Nameable newInstance();

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)[Lqd;",
		garbageValue = "-213375432"
	)
	@Export("newTypedArray")
	abstract Nameable[] newTypedArray(int var1);

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-22724"
	)
	@Export("clear")
	public void clear() {
		this.size = 0; // L: 24
		Arrays.fill(this.array, (Object)null); // L: 25
		this.usernamesMap.clear(); // L: 26
		this.previousUsernamesMap.clear(); // L: 27
	} // L: 28

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1537256021"
	)
	@Export("getSize")
	public int getSize() {
		return this.size; // L: 31
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2075682472"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.size == this.capacity; // L: 35
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Luy;I)Z",
		garbageValue = "2063009557"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) { // L: 39
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1); // L: 40 41
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Luy;I)Lqd;",
		garbageValue = "-2076293528"
	)
	@Export("getByUsername")
	public Nameable getByUsername(Username var1) {
		Nameable var2 = this.getByCurrentUsername(var1); // L: 45
		return var2 != null ? var2 : this.getByPreviousUsername(var1); // L: 46 47
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Luy;B)Lqd;",
		garbageValue = "119"
	)
	@Export("getByCurrentUsername")
	Nameable getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.usernamesMap.get(var1); // L: 51 52
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Luy;I)Lqd;",
		garbageValue = "1942831402"
	)
	@Export("getByPreviousUsername")
	Nameable getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.previousUsernamesMap.get(var1); // L: 56 57
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Luy;B)Z",
		garbageValue = "3"
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

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lqd;B)V",
		garbageValue = "-13"
	)
	@Export("remove")
	final void remove(Nameable var1) {
		int var2 = this.indexOf(var1); // L: 68
		if (var2 != -1) { // L: 69
			this.arrayRemove(var2); // L: 70
			this.mapRemove(var1); // L: 71
		}
	} // L: 72

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Luy;I)Lqd;",
		garbageValue = "905604310"
	)
	@Export("addLastNoPreviousUsername")
	Nameable addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null); // L: 75
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Luy;Luy;I)Lqd;",
		garbageValue = "-161612180"
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

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqd;",
		garbageValue = "4"
	)
	@Export("get")
	public final Nameable get(int var1) {
		if (var1 >= 0 && var1 < this.size) { // L: 88
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1); // L: 89
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) { // L: 93
			Arrays.sort(this.array, 0, this.size); // L: 94
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator); // L: 97
		}

	} // L: 99

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lqd;Luy;Luy;B)V",
		garbageValue = "-128"
	)
	@Export("changeName")
	final void changeName(Nameable var1, Username var2, Username var3) {
		this.mapRemove(var1); // L: 102
		var1.set(var2, var3); // L: 103
		this.mapPut(var1); // L: 104
	} // L: 105

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lqd;I)I",
		garbageValue = "-1775431955"
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

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lqd;B)V",
		garbageValue = "12"
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

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lqd;B)V",
		garbageValue = "-100"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(Nameable var1) {
		this.array[++this.size - 1] = var1; // L: 120
	} // L: 121

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lqd;I)V",
		garbageValue = "-625311941"
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

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-24"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size; // L: 134
		if (var1 < this.size) { // L: 135
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1); // L: 136
		}

	} // L: 138

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1244506915"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null; // L: 144
	} // L: 145

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "-586370333"
	)
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) { // L: 148
			this.comparator = var1; // L: 149
		} else if (this.comparator instanceof AbstractUserComparator) { // L: 151
			((AbstractUserComparator)this.comparator).addComparator(var1); // L: 152
		}

	} // L: 154

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIB)V",
		garbageValue = "-109"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4497
			int var3 = class149.SequenceDefinition_get(var1).field2277; // L: 4498
			if (var3 == 1) { // L: 4499
				var0.sequenceFrame = 0; // L: 4500
				var0.sequenceFrameCycle = 0; // L: 4501
				var0.sequenceDelay = var2; // L: 4502
				var0.field1188 = 0; // L: 4503
			}

			if (var3 == 2) { // L: 4505
				var0.field1188 = 0; // L: 4506
			}
		} else if (var1 == -1 || var0.sequence == -1 || class149.SequenceDefinition_get(var1).field2285 >= class149.SequenceDefinition_get(var0.sequence).field2285) { // L: 4509
			var0.sequence = var1; // L: 4510
			var0.sequenceFrame = 0; // L: 4511
			var0.sequenceFrameCycle = 0; // L: 4512
			var0.sequenceDelay = var2; // L: 4513
			var0.field1188 = 0; // L: 4514
			var0.field1214 = var0.pathLength; // L: 4515
		}

	} // L: 4517
}
