import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
@Implements("NameableContainer")
public abstract class NameableContainer {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1878565521
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1107277597
	)
	@Export("size")
	int size;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lrf;"
	)
	@Export("array")
	Nameable[] array;
	@ObfuscatedName("av")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("ax")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("as")
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lrf;",
		garbageValue = "794695059"
	)
	@Export("newInstance")
	abstract Nameable newInstance();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)[Lrf;",
		garbageValue = "-190310061"
	)
	@Export("newTypedArray")
	abstract Nameable[] newTypedArray(int var1);

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1535217845"
	)
	@Export("clear")
	public void clear() {
		this.size = 0;
		Arrays.fill(this.array, (Object)null);
		this.usernamesMap.clear();
		this.previousUsernamesMap.clear();
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1124880837"
	)
	@Export("getSize")
	public int getSize() {
		return this.size; // L: 31
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "458796278"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.capacity == this.size; // L: 35
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lvj;S)Z",
		garbageValue = "18697"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) { // L: 39
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1); // L: 40 41
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)Lrf;",
		garbageValue = "-1933118786"
	)
	@Export("getByUsername")
	public Nameable getByUsername(Username var1) {
		Nameable var2 = this.getByCurrentUsername(var1); // L: 45
		return var2 != null ? var2 : this.getByPreviousUsername(var1); // L: 46 47
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)Lrf;",
		garbageValue = "756260945"
	)
	@Export("getByCurrentUsername")
	Nameable getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.usernamesMap.get(var1); // L: 51 52
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)Lrf;",
		garbageValue = "-858632406"
	)
	@Export("getByPreviousUsername")
	Nameable getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.previousUsernamesMap.get(var1); // L: 56 57
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)Z",
		garbageValue = "-1442833706"
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
		descriptor = "(Lrf;I)V",
		garbageValue = "-1690044546"
	)
	@Export("remove")
	final void remove(Nameable var1) {
		int var2 = this.indexOf(var1); // L: 68
		if (var2 != -1) { // L: 69
			this.arrayRemove(var2); // L: 70
			this.mapRemove(var1); // L: 71
		}
	} // L: 72

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)Lrf;",
		garbageValue = "-83"
	)
	@Export("addLastNoPreviousUsername")
	Nameable addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null); // L: 75
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lvj;Lvj;I)Lrf;",
		garbageValue = "1851941311"
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

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)Lrf;",
		garbageValue = "-56414305"
	)
	@Export("get")
	public final Nameable get(int var1) {
		if (var1 >= 0 && var1 < this.size) { // L: 88
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1); // L: 89
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "76"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) { // L: 93
			Arrays.sort(this.array, 0, this.size); // L: 94
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator); // L: 97
		}

	} // L: 99

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lrf;Lvj;Lvj;B)V",
		garbageValue = "30"
	)
	@Export("changeName")
	final void changeName(Nameable var1, Username var2, Username var3) {
		this.mapRemove(var1); // L: 102
		var1.set(var2, var3); // L: 103
		this.mapPut(var1); // L: 104
	} // L: 105

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lrf;B)I",
		garbageValue = "-102"
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

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lrf;B)V",
		garbageValue = "-78"
	)
	@Export("mapRemove")
	final void mapRemove(Nameable var1) {
		if (var1.previousUsername != null) {
			this.previousUsernamesMap.remove(var1.previousUsername); // L: 116
		}

	} // L: 117

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lrf;I)V",
		garbageValue = "-488058670"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(Nameable var1) {
		this.array[++this.size - 1] = var1; // L: 120
	} // L: 121

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lrf;I)V",
		garbageValue = "-1090734641"
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-312876519"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size; // L: 134
		if (var1 < this.size) { // L: 135
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1); // L: 136
		}

	} // L: 138

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1908013155"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null; // L: 144
	} // L: 145

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;S)V",
		garbageValue = "-18324"
	)
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) { // L: 148
			this.comparator = var1; // L: 149
		} else if (this.comparator instanceof AbstractUserComparator) { // L: 151
			((AbstractUserComparator)this.comparator).addComparator(var1); // L: 152
		}

	} // L: 154

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IS)Lhy;",
		garbageValue = "196"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0); // L: 25
			var1 = new StructComposition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 28
			StructComposition.StructDefinition_cached.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}
}
