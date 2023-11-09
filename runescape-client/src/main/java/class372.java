import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
public class class372 implements Iterator {
	@ObfuscatedName("ja")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	class373 field4355;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1576368141
	)
	int field4354;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 81874847
	)
	int field4356;

	@ObfuscatedSignature(
		descriptor = "(Lop;)V"
	)
	class372(class373 var1) {
		this.field4354 = 0; // L: 177
		this.field4356 = this.field4355.field4362; // L: 178
		this.field4355 = var1; // L: 181
	} // L: 182

	public boolean hasNext() {
		return this.field4354 < this.field4355.field4359; // L: 186
	}

	public Object next() {
		if (this.field4355.field4362 != this.field4356) { // L: 192
			throw new ConcurrentModificationException();
		} else if (this.field4354 < this.field4355.field4359) { // L: 193
			Object var1 = this.field4355.field4360[this.field4354].field4353; // L: 194
			++this.field4354; // L: 195
			return var1; // L: 196
		} else {
			throw new NoSuchElementException(); // L: 198
		}
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 203
	}
}
