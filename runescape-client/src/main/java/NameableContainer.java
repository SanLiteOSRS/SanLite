import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
@Implements("NameableContainer")
public abstract class NameableContainer {
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1701166139
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -809601657
	)
	@Export("size")
	int size;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Lov;"
	)
	@Export("array")
	Nameable[] array;
	@ObfuscatedName("g")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("i")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("o")
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Lov;",
		garbageValue = "47"
	)
	@Export("newInstance")
	abstract Nameable newInstance();

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)[Lov;",
		garbageValue = "1710517567"
	)
	@Export("newTypedArray")
	abstract Nameable[] newTypedArray(int var1);

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-3750"
	)
	@Export("clear")
	public void clear() {
		this.size = 0; // L: 24
		Arrays.fill(this.array, (Object)null); // L: 25
		this.usernamesMap.clear(); // L: 26
		this.previousUsernamesMap.clear(); // L: 27
	} // L: 28

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "994958809"
	)
	@Export("getSize")
	public int getSize() {
		return this.size; // L: 31
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1236533348"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.capacity == this.size; // L: 35
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lrp;B)Z",
		garbageValue = "-94"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) { // L: 39
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1); // L: 41
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lrp;B)Lov;",
		garbageValue = "-51"
	)
	@Export("getByUsername")
	public Nameable getByUsername(Username var1) {
		Nameable var2 = this.getByCurrentUsername(var1); // L: 45
		return var2 != null ? var2 : this.getByPreviousUsername(var1); // L: 46 47
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lrp;B)Lov;",
		garbageValue = "49"
	)
	@Export("getByCurrentUsername")
	Nameable getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.usernamesMap.get(var1); // L: 52
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrp;I)Lov;",
		garbageValue = "-2064272196"
	)
	@Export("getByPreviousUsername")
	Nameable getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.previousUsernamesMap.get(var1); // L: 56 57
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrp;B)Z",
		garbageValue = "88"
	)
	@Export("removeByUsername")
	public final boolean removeByUsername(Username var1) {
		Nameable var2 = this.getByCurrentUsername(var1); // L: 61
		if (var2 == null) { // L: 62
			return false;
		} else {
			this.remove(var2);
			return true; // L: 64
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lov;I)V",
		garbageValue = "1943466022"
	)
	@Export("remove")
	final void remove(Nameable var1) {
		int var2 = this.indexOf(var1);
		if (var2 != -1) { // L: 69
			this.arrayRemove(var2); // L: 70
			this.mapRemove(var1);
		}
	} // L: 72

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lrp;B)Lov;",
		garbageValue = "83"
	)
	@Export("addLastNoPreviousUsername")
	Nameable addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null); // L: 75
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lrp;Lrp;B)Lov;",
		garbageValue = "14"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Lov;",
		garbageValue = "1687746324"
	)
	@Export("get")
	public final Nameable get(int var1) {
		if (var1 >= 0 && var1 < this.size) { // L: 88
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1); // L: 89
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1745034831"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) { // L: 93
			Arrays.sort(this.array, 0, this.size);
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator); // L: 97
		}

	} // L: 99

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lov;Lrp;Lrp;I)V",
		garbageValue = "-2046031890"
	)
	@Export("changeName")
	final void changeName(Nameable var1, Username var2, Username var3) {
		this.mapRemove(var1); // L: 102
		var1.set(var2, var3); // L: 103
		this.mapPut(var1); // L: 104
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lov;I)I",
		garbageValue = "-2074650395"
	)
	@Export("indexOf")
	final int indexOf(Nameable var1) {
		for (int var2 = 0; var2 < this.size; ++var2) { // L: 108
			if (this.array[var2] == var1) {
				return var2;
			}
		}

		return -1; // L: 111
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lov;B)V",
		garbageValue = "0"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lov;I)V",
		garbageValue = "-653934670"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(Nameable var1) {
		this.array[++this.size - 1] = var1; // L: 120
	} // L: 121

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lov;I)V",
		garbageValue = "734290139"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "2"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size; // L: 134
		if (var1 < this.size) { // L: 135
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1); // L: 136
		}

	} // L: 138

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1713851061"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null; // L: 144
	} // L: 145

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "1352931205"
	)
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) { // L: 148
			this.comparator = var1; // L: 149
		} else if (this.comparator instanceof AbstractUserComparator) { // L: 151
			((AbstractUserComparator)this.comparator).addComparator(var1); // L: 152
		}

	} // L: 154

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-852063188"
	)
	public static char method7589(char var0) {
		switch(var0) { // L: 40
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_'; // L: 76
		case '#':
		case '[':
		case ']':
			return var0; // L: 109
		case 'À':
		case 'Á':
		case 'Â':
		case 'Ã':
		case 'Ä':
		case 'à':
		case 'á':
		case 'â':
		case 'ã':
		case 'ä':
			return 'a'; // L: 51
		case 'Ç':
		case 'ç':
			return 'c'; // L: 54
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e'; // L: 63
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i'; // L: 94
		case 'Ñ':
		case 'ñ':
			return 'n'; // L: 66
		case 'Ò':
		case 'Ó':
		case 'Ô':
		case 'Õ':
		case 'Ö':
		case 'ò':
		case 'ó':
		case 'ô':
		case 'õ':
		case 'ö':
			return 'o'; // L: 105
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u'; // L: 85
		case 'ß':
			return 'b'; // L: 87
		case 'ÿ':
		case 'Ÿ':
			return 'y'; // L: 71
		default:
			return Character.toLowerCase(var0); // L: 68
		}
	}
}
