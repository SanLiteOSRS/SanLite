import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("NameableContainer")
public abstract class NameableContainer {
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -562547945
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2048838613
	)
	@Export("size")
	int size;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "[Lju;"
	)
	@Export("array")
	Nameable[] array;
	@ObfuscatedName("n")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("p")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("l")
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
		signature = "(B)Lju;",
		garbageValue = "-99"
	)
	@Export("newInstance")
	abstract Nameable newInstance();

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(II)[Lju;",
		garbageValue = "-1524839332"
	)
	@Export("newTypedArray")
	abstract Nameable[] newTypedArray(int var1);

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-91"
	)
	@Export("clear")
	public void clear() {
		this.size = 0;
		Arrays.fill(this.array, (Object)null);
		this.usernamesMap.clear();
		this.previousUsernamesMap.clear();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1488862486"
	)
	@Export("getSize")
	public int getSize() {
		return this.size;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "1"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.size == this.capacity;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(Lki;B)Z",
		garbageValue = "1"
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
		signature = "(Lki;I)Lju;",
		garbageValue = "709076888"
	)
	@Export("getByUsername")
	public Nameable getByUsername(Username var1) {
		Nameable var2 = this.getByCurrentUsername(var1);
		return var2 != null ? var2 : this.getByPreviousUsername(var1);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Lki;I)Lju;",
		garbageValue = "-2053834091"
	)
	@Export("getByCurrentUsername")
	Nameable getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.usernamesMap.get(var1);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Lki;I)Lju;",
		garbageValue = "2109358184"
	)
	@Export("getByPreviousUsername")
	Nameable getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.previousUsernamesMap.get(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lki;B)Z",
		garbageValue = "0"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		signature = "(Lju;I)V",
		garbageValue = "-202922237"
	)
	@Export("remove")
	final void remove(Nameable var1) {
		int var2 = this.indexOf(var1);
		if (var2 != -1) {
			this.arrayRemove(var2);
			this.mapRemove(var1);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		signature = "(Lki;B)Lju;",
		garbageValue = "8"
	)
	@Export("addLastNoPreviousUsername")
	Nameable addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		signature = "(Lki;Lki;I)Lju;",
		garbageValue = "1547669313"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		signature = "(II)Lju;",
		garbageValue = "1977107439"
	)
	@Export("get")
	public final Nameable get(int var1) {
		if (var1 >= 0 && var1 < this.size) {
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2040277695"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) {
			Arrays.sort(this.array, 0, this.size);
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator);
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		signature = "(Lju;Lki;Lki;I)V",
		garbageValue = "-2012575511"
	)
	@Export("changeName")
	final void changeName(Nameable var1, Username var2, Username var3) {
		this.mapRemove(var1);
		var1.set(var2, var3);
		this.mapPut(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		signature = "(Lju;I)I",
		garbageValue = "1245630013"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		signature = "(Lju;S)V",
		garbageValue = "255"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "(Lju;I)V",
		garbageValue = "1107214584"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(Nameable var1) {
		this.array[++this.size - 1] = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "(Lju;I)V",
		garbageValue = "961436842"
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
		signature = "(II)V",
		garbageValue = "365639793"
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
		signature = "(I)V",
		garbageValue = "1918060687"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		signature = "(Ljava/util/Comparator;I)V",
		garbageValue = "345387098"
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
