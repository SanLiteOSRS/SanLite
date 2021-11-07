import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	Node field3813;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		descriptor = "(Lkf;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lkf;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("w")
	@Export("start")
	void start() {
		this.field3813 = this.deque != null ? this.deque.sentinel.previous : null;
		this.last = null;
	}

	public Object next() {
		Node var1 = this.field3813;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field3813 = null;
		} else {
			this.field3813 = var1.previous;
		}

		this.last = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field3813 && this.field3813 != null;
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
