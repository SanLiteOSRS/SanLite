import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	Node field3706;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		descriptor = "(Lki;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lki;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("n")
	@Export("start")
	void start() {
		this.field3706 = this.deque != null ? this.deque.sentinel.previous : null;
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
		return this.deque.sentinel != this.field3706;
	}

	public Object next() {
		Node var1 = this.field3706;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field3706 = null;
		} else {
			this.field3706 = var1.previous;
		}

		this.last = var1;
		return var1;
	}
}
