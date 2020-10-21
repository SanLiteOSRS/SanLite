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
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 796277423
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -866488291
	)
	@Export("size")
	int size;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "[Ljh;"
	)
	@Export("array")
	Nameable[] array;
	@ObfuscatedName("k")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("c")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("u")
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)Ljh;",
		garbageValue = "-1664145399"
	)
	@Export("newInstance")
	abstract Nameable newInstance();

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IB)[Ljh;",
		garbageValue = "-35"
	)
	@Export("newTypedArray")
	abstract Nameable[] newTypedArray(int var1);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1055831029"
	)
	@Export("clear")
	public void clear() {
		this.size = 0;
		Arrays.fill(this.array, (Object)null);
		this.usernamesMap.clear();
		this.previousUsernamesMap.clear();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1841589615"
	)
	@Export("getSize")
	public int getSize() {
		return this.size;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "39"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.capacity == this.size;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Lkm;B)Z",
		garbageValue = "6"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) {
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(Lkm;I)Ljh;",
		garbageValue = "-1592102187"
	)
	@Export("getByUsername")
	public Nameable getByUsername(Username var1) {
		Nameable var2 = this.getByCurrentUsername(var1);
		return var2 != null ? var2 : this.getByPreviousUsername(var1);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(Lkm;I)Ljh;",
		garbageValue = "705820719"
	)
	@Export("getByCurrentUsername")
	Nameable getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.usernamesMap.get(var1);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(Lkm;B)Ljh;",
		garbageValue = "63"
	)
	@Export("getByPreviousUsername")
	Nameable getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.previousUsernamesMap.get(var1);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(Lkm;I)Z",
		garbageValue = "-539388005"
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(Ljh;I)V",
		garbageValue = "1784418658"
	)
	@Export("remove")
	final void remove(Nameable var1) {
		int var2 = this.indexOf(var1);
		if (var2 != -1) {
			this.arrayRemove(var2);
			this.mapRemove(var1);
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(Lkm;B)Ljh;",
		garbageValue = "1"
	)
	@Export("addLastNoPreviousUsername")
	Nameable addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Lkm;Lkm;I)Ljh;",
		garbageValue = "-1324246236"
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(IB)Ljh;",
		garbageValue = "20"
	)
	@Export("get")
	public final Nameable get(int var1) {
		if (var1 >= 0 && var1 < this.size) {
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "0"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) {
			Arrays.sort(this.array, 0, this.size);
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		signature = "(Ljh;Lkm;Lkm;I)V",
		garbageValue = "226433495"
	)
	@Export("changeName")
	final void changeName(Nameable var1, Username var2, Username var3) {
		this.mapRemove(var1);
		var1.set(var2, var3);
		this.mapPut(var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "(Ljh;B)I",
		garbageValue = "-67"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		signature = "(Ljh;I)V",
		garbageValue = "-2111985492"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "(Ljh;I)V",
		garbageValue = "2106732917"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(Nameable var1) {
		this.array[++this.size - 1] = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		signature = "(Ljh;I)V",
		garbageValue = "885880161"
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1356379849"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size;
		if (var1 < this.size) {
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-73"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		signature = "(Ljava/util/Comparator;I)V",
		garbageValue = "-1563194016"
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
