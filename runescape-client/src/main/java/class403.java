import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pg")
public class class403 implements Iterator {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	class404 field4478;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1176280827
	)
	int field4477;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -60441427
	)
	int field4476;

	@ObfuscatedSignature(
		descriptor = "(Lps;)V"
	)
	class403(class404 var1) {
		this.field4477 = 0; // L: 177
		this.field4476 = this.field4478.field4483; // L: 178
		this.field4478 = var1; // L: 181
	} // L: 182

	public boolean hasNext() {
		return this.field4477 < this.field4478.field4485; // L: 186
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 203
	}

	public Object next() {
		if (this.field4478.field4483 != this.field4476) { // L: 192
			throw new ConcurrentModificationException();
		} else if (this.field4477 < this.field4478.field4485) { // L: 193
			Object var1 = this.field4478.field4481[this.field4477].field4474; // L: 194
			++this.field4477; // L: 195
			return var1; // L: 196
		} else {
			throw new NoSuchElementException(); // L: 198
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "14"
	)
	static final int method7480(int var0, int var1) {
		if (var0 == -2) { // L: 1008
			return 12345678;
		} else if (var0 == -1) { // L: 1009
			if (var1 < 2) { // L: 1010
				var1 = 2;
			} else if (var1 > 126) { // L: 1011
				var1 = 126;
			}

			return var1; // L: 1012
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 1014
			if (var1 < 2) { // L: 1015
				var1 = 2;
			} else if (var1 > 126) { // L: 1016
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1017
		}
	}
}
