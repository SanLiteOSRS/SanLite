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
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1532544579
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 432517863
	)
	@Export("size")
	int size;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "[Llt;"
	)
	@Export("array")
	Nameable[] array;
	@ObfuscatedName("m")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("d")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("c")
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
		signature = "(I)Llt;",
		garbageValue = "-1522637653"
	)
	@Export("newInstance")
	abstract Nameable newInstance();

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)[Llt;",
		garbageValue = "1232560537"
	)
	@Export("newTypedArray")
	abstract Nameable[] newTypedArray(int var1);

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "115"
	)
	@Export("clear")
	public void clear() {
		this.size = 0;
		Arrays.fill(this.array, (Object)null);
		this.usernamesMap.clear();
		this.previousUsernamesMap.clear();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "78"
	)
	@Export("getSize")
	public int getSize() {
		return this.size;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "2143346405"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.size == this.capacity;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		signature = "(Llw;I)Z",
		garbageValue = "-382653222"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) {
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		signature = "(Llw;I)Llt;",
		garbageValue = "-1399672858"
	)
	@Export("getByUsername")
	public Nameable getByUsername(Username var1) {
		Nameable var2 = this.getByCurrentUsername(var1);
		return var2 != null ? var2 : this.getByPreviousUsername(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		signature = "(Llw;B)Llt;",
		garbageValue = "11"
	)
	@Export("getByCurrentUsername")
	Nameable getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.usernamesMap.get(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		signature = "(Llw;I)Llt;",
		garbageValue = "2131806982"
	)
	@Export("getByPreviousUsername")
	Nameable getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.previousUsernamesMap.get(var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		signature = "(Llw;I)Z",
		garbageValue = "-1769483355"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		signature = "(Llt;I)V",
		garbageValue = "2115617221"
	)
	@Export("remove")
	final void remove(Nameable var1) {
		int var2 = this.indexOf(var1);
		if (var2 != -1) {
			this.arrayRemove(var2);
			this.mapRemove(var1);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		signature = "(Llw;I)Llt;",
		garbageValue = "-2090976352"
	)
	@Export("addLastNoPreviousUsername")
	Nameable addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		signature = "(Llw;Llw;B)Llt;",
		garbageValue = "52"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "(II)Llt;",
		garbageValue = "1309219130"
	)
	@Export("get")
	public final Nameable get(int var1) {
		if (var1 >= 0 && var1 < this.size) {
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "697370657"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) {
			Arrays.sort(this.array, 0, this.size);
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "(Llt;Llw;Llw;I)V",
		garbageValue = "1904626398"
	)
	@Export("changeName")
	final void changeName(Nameable var1, Username var2, Username var3) {
		this.mapRemove(var1);
		var1.set(var2, var3);
		this.mapPut(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		signature = "(Llt;I)I",
		garbageValue = "-1638157420"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		signature = "(Llt;I)V",
		garbageValue = "-1033271588"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		signature = "(Llt;B)V",
		garbageValue = "-1"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(Nameable var1) {
		this.array[++this.size - 1] = var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		signature = "(Llt;I)V",
		garbageValue = "-1125941169"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1138258430"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size;
		if (var1 < this.size) {
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1483962639"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "(Ljava/util/Comparator;B)V",
		garbageValue = "-92"
	)
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) {
			this.comparator = var1;
		} else if (this.comparator instanceof AbstractUserComparator) {
			((AbstractUserComparator)this.comparator).addComparator(var1);
		}

	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		signature = "([Lhu;Lhu;ZB)V",
		garbageValue = "1"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width;
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height;
		Message.resizeInterface(var0, var1.id, var3, var4, var2);
		if (var1.children != null) {
			Message.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
		if (var5 != null) {
			int var6 = var5.group;
			if (class15.loadInterface(var6)) {
				Message.resizeInterface(Widget.Widget_interfaceComponents[var6], -1, var3, var4, var2);
			}
		}

		if (var1.contentType == 1337) {
		}

	}
}
