import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Ljs;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lgn;"
	)
	Node field3563;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lgn;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		signature = "(Ljs;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Ljs;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("o")
	@Export("start")
	void start() {
		this.field3563 = this.deque != null ? this.deque.sentinel.previous : null;
		this.last = null;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field3563;
	}

	public void remove() {
		if (this.last == null) {
			throw new IllegalStateException();
		} else {
			this.last.remove();
			this.last = null;
		}
	}

	public Object next() {
		Node var1 = this.field3563;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field3563 = null;
		} else {
			this.field3563 = var1.previous;
		}

		this.last = var1;
		return var1;
	}
}
