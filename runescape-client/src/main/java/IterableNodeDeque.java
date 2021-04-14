import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("IterableNodeDeque")
public class IterableNodeDeque implements Iterable, Collection {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lmh;"
	)
	@Export("sentinel")
	Node sentinel;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lmh;"
	)
	Node field3385;

	public IterableNodeDeque() {
		this.sentinel = new Node();
		this.sentinel.previous = this.sentinel;
		this.sentinel.next = this.sentinel;
	}

	@ObfuscatedName("f")
	@Export("rsClear")
	public void rsClear() {
		while (this.sentinel.previous != this.sentinel) {
			this.sentinel.previous.remove();
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lmh;)V"
	)
	@Export("addFirst")
	public void addFirst(Node var1) {
		if (var1.next != null) {
			var1.remove();
		}

		var1.next = this.sentinel.next;
		var1.previous = this.sentinel;
		var1.next.previous = var1;
		var1.previous.next = var1;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lmh;)V"
	)
	@Export("addLast")
	public void addLast(Node var1) {
		if (var1.next != null) {
			var1.remove();
		}

		var1.next = this.sentinel;
		var1.previous = this.sentinel.previous;
		var1.next.previous = var1;
		var1.previous.next = var1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "()Lmh;"
	)
	@Export("last")
	public Node last() {
		return this.method4788((Node)null);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Lmh;)Lmh;"
	)
	Node method4788(Node var1) {
		Node var2;
		if (var1 == null) {
			var2 = this.sentinel.previous;
		} else {
			var2 = var1;
		}

		if (var2 == this.sentinel) {
			this.field3385 = null;
			return null;
		} else {
			this.field3385 = var2.previous;
			return var2;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "()Lmh;"
	)
	@Export("previous")
	public Node previous() {
		Node var1 = this.field3385;
		if (var1 == this.sentinel) {
			this.field3385 = null;
			return null;
		} else {
			this.field3385 = var1.previous;
			return var1;
		}
	}

	@ObfuscatedName("g")
	int method4826() {
		int var1 = 0;

		for (Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) {
			++var1;
		}

		return var1;
	}

	@ObfuscatedName("h")
	public boolean method4787() {
		return this.sentinel.previous == this.sentinel;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "()[Lmh;"
	)
	Node[] method4833() {
		Node[] var1 = new Node[this.method4826()];
		int var2 = 0;

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Lmh;)Z"
	)
	boolean method4791(Node var1) {
		this.addFirst(var1);
		return true;
	}

	public Iterator iterator() {
		return new IterableNodeDequeDescendingIterator(this);
	}

	public int size() {
		return this.method4826();
	}

	public boolean isEmpty() {
		return this.method4787();
	}

	public boolean remove(Object var1) {
		throw new RuntimeException();
	}

	public boolean contains(Object var1) {
		throw new RuntimeException();
	}

	public boolean addAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	public void clear() {
		this.rsClear();
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean add(Object var1) {
		return this.method4791((Node)var1);
	}

	public Object[] toArray() {
		return this.method4833();
	}

	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	public Object[] toArray(Object[] var1) {
		int var2 = 0;

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}

		return var1;
	}

	public boolean containsAll(Collection var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Lmh;Lmh;)V"
	)
	@Export("IterableNodeDeque_addBefore")
	public static void IterableNodeDeque_addBefore(Node var0, Node var1) {
		if (var0.next != null) {
			var0.remove();
		}

		var0.next = var1;
		var0.previous = var1.previous;
		var0.next.previous = var0;
		var0.previous.next = var0;
	}
}
