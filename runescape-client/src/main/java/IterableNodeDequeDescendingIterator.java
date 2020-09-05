import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Ljv;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lgw;"
	)
	Node field3562;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lgw;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		signature = "(Ljv;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(Ljv;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("w")
	@Export("start")
	void start() {
		this.field3562 = this.deque != null ? this.deque.sentinel.previous : null;
		this.last = null;
	}

	public Object next() {
		Node var1 = this.field3562;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field3562 = null;
		} else {
			this.field3562 = var1.previous;
		}

		this.last = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field3562;
	}

	public void remove() {
		if (this.last == null) {
			throw new IllegalStateException();
		} else {
			this.last.remove();
			this.last = null;
		}
	}
}
