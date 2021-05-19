import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("NameableContainer")
public abstract class NameableContainer {
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1178695315
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 584872955
	)
	@Export("size")
	int size;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "[Llm;"
	)
	@Export("array")
	Nameable[] array;
	@ObfuscatedName("x")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("k")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("r")
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Llm;",
		garbageValue = "-1768347101"
	)
	@Export("newInstance")
	abstract Nameable newInstance();

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)[Llm;",
		garbageValue = "836907267"
	)
	@Export("newTypedArray")
	abstract Nameable[] newTypedArray(int var1);

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "1788"
	)
	@Export("clear")
	public void clear() {
		this.size = 0;
		Arrays.fill(this.array, (Object)null);
		this.usernamesMap.clear();
		this.previousUsernamesMap.clear();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1551225838"
	)
	@Export("getSize")
	public int getSize() {
		return this.size;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-402639237"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.size == this.capacity;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)Z",
		garbageValue = "1332419914"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) {
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)Llm;",
		garbageValue = "-412605520"
	)
	@Export("getByUsername")
	public Nameable getByUsername(Username var1) {
		Nameable var2 = this.getByCurrentUsername(var1);
		return var2 != null ? var2 : this.getByPreviousUsername(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lla;B)Llm;",
		garbageValue = "4"
	)
	@Export("getByCurrentUsername")
	Nameable getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.usernamesMap.get(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)Llm;",
		garbageValue = "-1984147584"
	)
	@Export("getByPreviousUsername")
	Nameable getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.previousUsernamesMap.get(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lla;B)Z",
		garbageValue = "1"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Llm;I)V",
		garbageValue = "-1344539203"
	)
	@Export("remove")
	final void remove(Nameable var1) {
		int var2 = this.indexOf(var1);
		if (var2 != -1) {
			this.arrayRemove(var2);
			this.mapRemove(var1);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)Llm;",
		garbageValue = "-1013627827"
	)
	@Export("addLastNoPreviousUsername")
	Nameable addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lla;Lla;I)Llm;",
		garbageValue = "-88748057"
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Llm;",
		garbageValue = "0"
	)
	@Export("get")
	public final Nameable get(int var1) {
		if (var1 >= 0 && var1 < this.size) {
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-539238258"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) {
			Arrays.sort(this.array, 0, this.size);
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator);
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Llm;Lla;Lla;B)V",
		garbageValue = "26"
	)
	@Export("changeName")
	final void changeName(Nameable var1, Username var2, Username var3) {
		this.mapRemove(var1);
		var1.set(var2, var3);
		this.mapPut(var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Llm;S)I",
		garbageValue = "1103"
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Llm;I)V",
		garbageValue = "-189402228"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Llm;I)V",
		garbageValue = "-1209514498"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(Nameable var1) {
		this.array[++this.size - 1] = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Llm;B)V",
		garbageValue = "1"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "44"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size;
		if (var1 < this.size) {
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "180"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "1024776023"
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
