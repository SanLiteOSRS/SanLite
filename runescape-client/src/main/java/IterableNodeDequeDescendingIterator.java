import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	Node field4321;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		descriptor = "(Lni;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null; // L: 9
		this.setDeque(var1); // L: 12
	} // L: 13

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lni;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1; // L: 16
		this.start(); // L: 17
	} // L: 18

	@ObfuscatedName("al")
	@Export("start")
	void start() {
		this.field4321 = this.deque != null ? this.deque.sentinel.previous : null; // L: 21
		this.last = null; // L: 22
	} // L: 23

	public Object next() {
		Node var1 = this.field4321; // L: 27
		if (var1 == this.deque.sentinel) { // L: 28
			var1 = null; // L: 29
			this.field4321 = null; // L: 30
		} else {
			this.field4321 = var1.previous; // L: 32
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

	public boolean hasNext() {
		return this.deque.sentinel != this.field4321 && this.field4321 != null; // L: 38
	}
}
