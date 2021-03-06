import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
@Implements("NameableContainer")
public abstract class NameableContainer {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1596118633
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 201704809
	)
	@Export("size")
	int size;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "[Ljn;"
	)
	@Export("array")
	Nameable[] array;
	@ObfuscatedName("z")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("e")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("q")
	@Export("comparator")
	Comparator comparator;

	NameableContainer(int var1) {
		this.size = 0;
		this.comparator = null;
		this.capacity = var1;
		this.array = this.newTypedArray(var1);
		this.usernamesMap = new HashMap(var1 / 8);
		this.previousUsernamesMap = new HashMap(var1 / 8);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "-315842787",
		signature = "(I)Ljn;"
	)
	@Export("newInstance")
	abstract Nameable newInstance();

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "1723641195",
		signature = "(II)[Ljn;"
	)
	@Export("newTypedArray")
	abstract Nameable[] newTypedArray(int var1);

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "-16027",
		signature = "(S)V"
	)
	@Export("clear")
	public void clear() {
		this.size = 0;
		Arrays.fill(this.array, (Object)null);
		this.usernamesMap.clear();
		this.previousUsernamesMap.clear();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		garbageValue = "687",
		signature = "(S)I"
	)
	@Export("getSize")
	public int getSize() {
		return this.size;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "0",
		signature = "(B)Z"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.size == this.capacity;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		garbageValue = "-1403863390",
		signature = "(Lkk;I)Z"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) {
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		garbageValue = "2091513607",
		signature = "(Lkk;I)Ljn;"
	)
	@Export("getByUsername")
	public Nameable getByUsername(Username var1) {
		Nameable var2 = this.getByCurrentUsername(var1);
		return var2 != null ? var2 : this.getByPreviousUsername(var1);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "1389255330",
		signature = "(Lkk;I)Ljn;"
	)
	@Export("getByCurrentUsername")
	Nameable getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.usernamesMap.get(var1);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		garbageValue = "106",
		signature = "(Lkk;B)Ljn;"
	)
	@Export("getByPreviousUsername")
	Nameable getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.previousUsernamesMap.get(var1);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		garbageValue = "925545602",
		signature = "(Lkk;I)Z"
	)
	@Export("removeByUsername")
	public final boolean removeByUsername(Username var1) {
		Nameable var2 = this.getByCurrentUsername(var1);
		if (var2 == null) {
			return false;
		} else {
			this.remove(var2);
			return true;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		garbageValue = "1008503929",
		signature = "(Ljn;I)V"
	)
	@Export("remove")
	final void remove(Nameable var1) {
		int var2 = this.indexOf(var1);
		if (var2 != -1) {
			this.arrayRemove(var2);
			this.mapRemove(var1);
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		garbageValue = "1681859445",
		signature = "(Lkk;I)Ljn;"
	)
	@Export("addLastNoPreviousUsername")
	Nameable addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		garbageValue = "1304686486",
		signature = "(Lkk;Lkk;I)Ljn;"
	)
	@Export("addLast")
	Nameable addLast(Username var1, Username var2) {
		if (this.getByCurrentUsername(var1) != null) {
			throw new IllegalStateException();
		} else {
			Nameable var3 = this.newInstance();
			var3.set(var1, var2);
			this.arrayAddLast(var3);
			this.mapPut(var3);
			return var3;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		garbageValue = "12",
		signature = "(IB)Ljn;"
	)
	@Export("get")
	public final Nameable get(int var1) {
		if (var1 >= 0 && var1 < this.size) {
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		garbageValue = "-1849487850",
		signature = "(I)V"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) {
			Arrays.sort(this.array, 0, this.size);
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator);
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		garbageValue = "1325828813",
		signature = "(Ljn;Lkk;Lkk;I)V"
	)
	@Export("changeName")
	final void changeName(Nameable var1, Username var2, Username var3) {
		this.mapRemove(var1);
		var1.set(var2, var3);
		this.mapPut(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		garbageValue = "113",
		signature = "(Ljn;B)I"
	)
	@Export("indexOf")
	final int indexOf(Nameable var1) {
		for (int var2 = 0; var2 < this.size; ++var2) {
			if (this.array[var2] == var1) {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		garbageValue = "-1644008169",
		signature = "(Ljn;I)V"
	)
	@Export("mapRemove")
	final void mapRemove(Nameable var1) {
		if (this.usernamesMap.remove(var1.username) == null) {
			throw new IllegalStateException();
		} else {
			if (var1.previousUsername != null) {
				this.previousUsernamesMap.remove(var1.previousUsername);
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		garbageValue = "-53",
		signature = "(Ljn;B)V"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(Nameable var1) {
		this.array[++this.size - 1] = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		garbageValue = "-669871077",
		signature = "(Ljn;I)V"
	)
	@Export("mapPut")
	final void mapPut(Nameable var1) {
		this.usernamesMap.put(var1.username, var1);
		if (var1.previousUsername != null) {
			Nameable var2 = (Nameable)this.previousUsernamesMap.put(var1.previousUsername, var1);
			if (var2 != null && var2 != var1) {
				var2.previousUsername = null;
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		garbageValue = "53",
		signature = "(IB)V"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size;
		if (var1 < this.size) {
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		garbageValue = "-1607977980",
		signature = "(I)V"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		garbageValue = "-22",
		signature = "(Ljava/util/Comparator;B)V"
	)
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) {
			this.comparator = var1;
		} else if (this.comparator instanceof AbstractUserComparator) {
			((AbstractUserComparator)this.comparator).addComparator(var1);
		}

	}
}
