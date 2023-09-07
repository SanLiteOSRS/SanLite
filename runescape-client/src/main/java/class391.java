import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
public class class391 implements Iterator {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	class392 field4442;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 150272453
	)
	int field4443;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1979527987
	)
	int field4444;

	@ObfuscatedSignature(
		descriptor = "(Lpa;)V"
	)
	class391(class392 var1) {
		this.field4443 = 0; // L: 177
		this.field4444 = this.field4442.field4446; // L: 178
		this.field4442 = var1; // L: 181
	} // L: 182

	public boolean hasNext() {
		return this.field4443 < this.field4442.field4450; // L: 186
	}

	public Object next() {
		if (this.field4442.field4446 != this.field4444) { // L: 192
			throw new ConcurrentModificationException();
		} else if (this.field4443 < this.field4442.field4450) { // L: 193
			Object var1 = this.field4442.field4448[this.field4443].field4440; // L: 194
			++this.field4443; // L: 195
			return var1; // L: 196
		} else {
			throw new NoSuchElementException(); // L: 198
		}
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 203
	}
}
