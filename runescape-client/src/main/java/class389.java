import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("of")
public class class389 implements Iterator {
	@ObfuscatedName("si")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	class390 field4410;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1784205805
	)
	int field4409;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1457471961
	)
	int field4408;

	@ObfuscatedSignature(
		descriptor = "(Lpu;)V"
	)
	class389(class390 var1) {
		this.field4409 = 0; // L: 177
		this.field4408 = this.field4410.field4414; // L: 178
		this.field4410 = var1; // L: 181
	} // L: 182

	public boolean hasNext() {
		return this.field4409 < this.field4410.field4412; // L: 186
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 203
	}

	public Object next() {
		if (this.field4410.field4414 != this.field4408) { // L: 192
			throw new ConcurrentModificationException();
		} else if (this.field4409 < this.field4410.field4412) { // L: 193
			Object var1 = this.field4410.field4416[this.field4409].field4406; // L: 194
			++this.field4409; // L: 195
			return var1; // L: 196
		} else {
			throw new NoSuchElementException(); // L: 198
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "840269360"
	)
	static int method7215(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F)); // L: 4373
	}
}
