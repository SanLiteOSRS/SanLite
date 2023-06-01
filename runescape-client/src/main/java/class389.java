import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
public class class389 implements Iterator {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	class390 field4421;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 286831843
	)
	int field4422;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1326954863
	)
	int field4425;

	@ObfuscatedSignature(
		descriptor = "(Lpl;)V"
	)
	class389(class390 var1) {
		this.field4422 = 0; // L: 177
		this.field4425 = this.field4421.field4430; // L: 178
		this.field4421 = var1; // L: 181
	} // L: 182

	public Object next() {
		if (this.field4421.field4430 != this.field4425) { // L: 192
			throw new ConcurrentModificationException();
		} else if (this.field4422 < this.field4421.field4427) { // L: 193
			Object var1 = this.field4421.field4428[this.field4422].field4419; // L: 194
			++this.field4422; // L: 195
			return var1; // L: 196
		} else {
			throw new NoSuchElementException(); // L: 198
		}
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 203
	}

	public boolean hasNext() {
		return this.field4422 < this.field4421.field4427; // L: 186
	}
}
