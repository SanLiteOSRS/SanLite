import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
public class class369 implements Iterator {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	class370 field4381;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 842453265
	)
	int field4380;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1011695549
	)
	int field4382;

	@ObfuscatedSignature(
		descriptor = "(Lng;)V"
	)
	class369(class370 var1) {
		this.field4380 = 0; // L: 177
		this.field4382 = this.field4381.field4386; // L: 178
		this.field4381 = var1; // L: 181
	} // L: 182

	public void remove() {
		throw new UnsupportedOperationException(); // L: 203
	}

	public Object next() {
		if (this.field4381.field4386 != this.field4382) { // L: 192
			throw new ConcurrentModificationException();
		} else if (this.field4380 < this.field4381.field4385) { // L: 193
			Object var1 = this.field4381.field4387[this.field4380].field4377; // L: 194
			++this.field4380; // L: 195
			return var1; // L: 196
		} else {
			throw new NoSuchElementException(); // L: 198
		}
	}

	public boolean hasNext() {
		return this.field4380 < this.field4381.field4385; // L: 186
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1585797932"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4]; // L: 63
		int[] var3 = new int[4]; // L: 64
		var2[0] = var0; // L: 65
		var3[0] = var1; // L: 66
		int var4 = 1; // L: 67

		for (int var5 = 0; var5 < 4; ++var5) { // L: 68
			if (World.World_sortOption1[var5] != var0) { // L: 69
				var2[var4] = World.World_sortOption1[var5]; // L: 70
				var3[var4] = World.World_sortOption2[var5]; // L: 71
				++var4; // L: 72
			}
		}

		World.World_sortOption1 = var2; // L: 75
		World.World_sortOption2 = var3; // L: 76
		class156.sortWorlds(class88.World_worlds, 0, class88.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 77
	} // L: 78
}
