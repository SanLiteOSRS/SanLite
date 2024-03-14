import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pm")
public class class410 implements Iterator {
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = -1593024751
	)
	static int field4556;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	class411 field4558;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1806140175
	)
	int field4557;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -591196913
	)
	int field4559;

	@ObfuscatedSignature(
		descriptor = "(Lpj;)V"
	)
	class410(class411 var1) {
		this.field4557 = 0; // L: 177
		this.field4559 = this.field4558.field4561; // L: 178
		this.field4558 = var1; // L: 181
	} // L: 182

	public void remove() {
		throw new UnsupportedOperationException(); // L: 203
	}

	public Object next() {
		if (this.field4558.field4561 != this.field4559) { // L: 192
			throw new ConcurrentModificationException();
		} else if (this.field4557 < this.field4558.field4563) { // L: 193
			Object var1 = this.field4558.field4562[this.field4557].field4554; // L: 194
			++this.field4557; // L: 195
			return var1; // L: 196
		} else {
			throw new NoSuchElementException(); // L: 198
		}
	}

	public boolean hasNext() {
		return this.field4557 < this.field4558.field4563; // L: 186
	}
}
