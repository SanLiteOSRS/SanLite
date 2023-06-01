import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	Node field4387;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		descriptor = "(Lod;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null; // L: 9
		this.setDeque(var1); // L: 12
	} // L: 13

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lod;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1; // L: 16
		this.start(); // L: 17
	} // L: 18

	@ObfuscatedName("an")
	@Export("start")
	void start() {
		this.field4387 = this.deque != null ? this.deque.sentinel.previous : null; // L: 21
		this.last = null; // L: 22
	} // L: 23

	public boolean hasNext() {
		return this.deque.sentinel != this.field4387 && this.field4387 != null; // L: 38
	}

	public Object next() {
		Node var1 = this.field4387; // L: 27
		if (var1 == this.deque.sentinel) { // L: 28
			var1 = null; // L: 29
			this.field4387 = null; // L: 30
		} else {
			this.field4387 = var1.previous; // L: 32
		}

		this.last = var1; // L: 33
		return var1; // L: 34
	}

	public void remove() {
		if (this.last == null) { // L: 42
			throw new IllegalStateException();
		} else {
			this.last.remove(); // L: 43
			this.last = null; // L: 44
		}
	} // L: 45
}
