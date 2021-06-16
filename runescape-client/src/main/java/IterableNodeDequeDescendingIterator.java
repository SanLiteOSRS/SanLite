import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	Node field3711;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		descriptor = "(Lkz;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lkz;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("e")
	@Export("start")
	void start() {
		this.field3711 = this.deque != null ? this.deque.sentinel.previous : null;
		this.last = null;
	}

	public Object next() {
		Node var1 = this.field3711;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field3711 = null;
		} else {
			this.field3711 = var1.previous;
		}

		this.last = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field3711;
	}

	public void remove() {
		this.last.remove();
		this.last = null;
	}
}
