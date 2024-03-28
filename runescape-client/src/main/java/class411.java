import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
public class class411 implements Iterator {
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	class412 field4574;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1456196905
	)
	int field4575;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2087093497
	)
	int field4577;

	@ObfuscatedSignature(
		descriptor = "(Lpt;)V"
	)
	class411(class412 var1) {
		this.field4575 = 0; // L: 177
		this.field4577 = this.field4574.field4582; // L: 178
		this.field4574 = var1; // L: 181
	} // L: 182

	public boolean hasNext() {
		return this.field4575 < this.field4574.field4580; // L: 186
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 203
	}

	public Object next() {
		if (this.field4574.field4582 != this.field4577) { // L: 192
			throw new ConcurrentModificationException();
		} else if (this.field4575 < this.field4574.field4580) { // L: 193
			Object var1 = this.field4574.field4584[this.field4575].field4573; // L: 194
			++this.field4575; // L: 195
			return var1; // L: 196
		} else {
			throw new NoSuchElementException(); // L: 198
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Liq;",
		garbageValue = "-114"
	)
	public static FloorUnderlayDefinition method7472(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.field2191.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.field2195.takeFile(1, var0); // L: 23
			var1 = new FloorUnderlayDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 26
			FloorUnderlayDefinition.field2191.put(var1, (long)var0); // L: 27
			return var1; // L: 28
		}
	}
}
