import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
public final class class412 implements Comparable {
	@ObfuscatedName("at")
	Object field4568;
	@ObfuscatedName("an")
	Object field4565;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 7321283968849207253L
	)
	long field4566;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = 4832211410537122593L
	)
	long field4567;

	class412(Object var1, Object var2) {
		this.field4568 = var1; // L: 10
		this.field4565 = var2; // L: 11
	} // L: 12

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lpl;I)I",
		garbageValue = "1099912009"
	)
	int method7716(class412 var1) {
		if (this.field4567 < var1.field4567) {
			return -1; // L: 15
		} else {
			return this.field4567 > var1.field4567 ? 1 : 0; // L: 16 17
		}
	}

	public int hashCode() {
		return this.field4565.hashCode(); // L: 28
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class412) { // L: 22
			return this.field4565.equals(((class412)var1).field4565);
		} else {
			throw new IllegalArgumentException(); // L: 23
		}
	}

	public int compareTo(Object var1) {
		return this.method7716((class412)var1); // L: 32
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldd;",
		garbageValue = "-995918564"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = class439.method8155(var1, var0); // L: 38
		Script var4 = UserComparator8.method2854(var3, var0); // L: 39
		if (var4 != null) { // L: 40
			return var4; // L: 41
		} else {
			var3 = ModeWhere.method6930(var2, var0); // L: 43
			var4 = UserComparator8.method2854(var3, var0); // L: 44
			if (var4 != null) { // L: 45
				return var4; // L: 46
			} else {
				int var5 = var0 + -512; // L: 50
				var4 = UserComparator8.method2854(var5, var0); // L: 53
				return var4 != null ? var4 : null; // L: 54 57
			}
		}
	}
}
