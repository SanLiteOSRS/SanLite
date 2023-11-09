import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
public class class391 implements Iterator {
	@ObfuscatedName("uo")
	@ObfuscatedGetter(
		intValue = -766337823
	)
	static int field4433;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	class392 field4436;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1360877257
	)
	int field4432;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 350077931
	)
	int field4434;

	@ObfuscatedSignature(
		descriptor = "(Lpf;)V"
	)
	class391(class392 var1) {
		this.field4432 = 0; // L: 177
		this.field4434 = this.field4436.field4441; // L: 178
		this.field4436 = var1; // L: 181
	} // L: 182

	public boolean hasNext() {
		return this.field4432 < this.field4436.field4439; // L: 186
	}

	public Object next() {
		if (this.field4436.field4441 != this.field4434) { // L: 192
			throw new ConcurrentModificationException();
		} else if (this.field4432 < this.field4436.field4439) { // L: 193
			Object var1 = this.field4436.field4440[this.field4432].field4426; // L: 194
			++this.field4432; // L: 195
			return var1; // L: 196
		} else {
			throw new NoSuchElementException(); // L: 198
		}
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 203
	}
}
