import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Ljc;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lmh;"
	)
	Node field3383;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lmh;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		signature = "(Ljc;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Ljc;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("o")
	@Export("start")
	void start() {
		this.field3383 = this.deque != null ? this.deque.sentinel.previous : null;
		this.last = null;
	}

	public void remove() {
		if (this.last == null) {
			throw new IllegalStateException();
		} else {
			this.last.remove();
			this.last = null;
		}
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field3383;
	}

	public Object next() {
		Node var1 = this.field3383;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field3383 = null;
		} else {
			this.field3383 = var1.previous;
		}

		this.last = var1;
		return var1;
	}
}
