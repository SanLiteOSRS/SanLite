import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
public class class347 implements Iterator {
	@ObfuscatedName("d")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	class348 field4189;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -223501929
	)
	int field4187;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 267058179
	)
	int field4188;

	@ObfuscatedSignature(
		descriptor = "(Lmh;)V"
	)
	class347(class348 var1) {
		this.field4187 = 0; // L: 177
		this.field4188 = this.field4189.field4194; // L: 178
		this.field4189 = var1; // L: 181
	} // L: 182

	public boolean hasNext() {
		return this.field4187 < this.field4189.field4193; // L: 186
	}

	public Object next() {
		if (this.field4189.field4194 != this.field4188) { // L: 192
			throw new ConcurrentModificationException();
		} else if (this.field4187 < this.field4189.field4193) { // L: 193
			Object var1 = this.field4189.field4191[this.field4187].field4185; // L: 194
			++this.field4187; // L: 195
			return var1; // L: 196
		} else {
			throw new NoSuchElementException(); // L: 198
		}
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 203
	}
}
