import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("IterableNodeDeque")
public class IterableNodeDeque implements Iterable, Collection {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("sentinel")
	Node sentinel;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	Node field4171;

	public IterableNodeDeque() {
		this.sentinel = new Node(); // L: 7
		this.sentinel.previous = this.sentinel; // L: 11
		this.sentinel.next = this.sentinel; // L: 12
	} // L: 13

	@ObfuscatedName("c")
	@Export("rsClear")
	public void rsClear() {
		while (this.sentinel.previous != this.sentinel) { // L: 16
			this.sentinel.previous.remove(); // L: 17
		}

	} // L: 19

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lov;)V"
	)
	@Export("addFirst")
	public void addFirst(Node var1) {
		if (var1.next != null) { // L: 22
			var1.remove();
		}

		var1.next = this.sentinel.next; // L: 23
		var1.previous = this.sentinel; // L: 24
		var1.next.previous = var1; // L: 25
		var1.previous.next = var1; // L: 26
	} // L: 27

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lov;)V"
	)
	@Export("addLast")
	public void addLast(Node var1) {
		if (var1.next != null) { // L: 30
			var1.remove();
		}

		var1.next = this.sentinel; // L: 31
		var1.previous = this.sentinel.previous; // L: 32
		var1.next.previous = var1; // L: 33
		var1.previous.next = var1; // L: 34
	} // L: 35

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "()Lov;"
	)
	@Export("last")
	public Node last() {
		return this.method6306((Node)null); // L: 46
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lov;)Lov;"
	)
	Node method6306(Node var1) {
		Node var2;
		if (var1 == null) { // L: 52
			var2 = this.sentinel.previous;
		} else {
			var2 = var1; // L: 53
		}

		if (var2 == this.sentinel) { // L: 54
			this.field4171 = null; // L: 55
			return null; // L: 56
		} else {
			this.field4171 = var2.previous; // L: 58
			return var2; // L: 59
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "()Lov;"
	)
	@Export("previous")
	public Node previous() {
		Node var1 = this.field4171; // L: 64
		if (var1 == this.sentinel) { // L: 65
			this.field4171 = null; // L: 66
			return null; // L: 67
		} else {
			this.field4171 = var1.previous; // L: 69
			return var1; // L: 70
		}
	}

	@ObfuscatedName("q")
	int method6308() {
		int var1 = 0; // L: 74

		for (Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) { // L: 75 76 78
			++var1; // L: 77
		}

		return var1; // L: 80
	}

	@ObfuscatedName("m")
	public boolean method6309() {
		return this.sentinel.previous == this.sentinel; // L: 84
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "()[Lov;"
	)
	Node[] method6364() {
		Node[] var1 = new Node[this.method6308()]; // L: 88
		int var2 = 0; // L: 89

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) { // L: 90 91 93
			var1[var2++] = var3; // L: 92
		}

		return var1; // L: 95
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lov;)Z"
	)
	boolean method6310(Node var1) {
		this.addFirst(var1); // L: 135
		return true; // L: 136
	}

	public int hashCode() {
		return super.hashCode(); // L: 178
	}

	public void clear() {
		this.rsClear(); // L: 166
	} // L: 167

	public Iterator iterator() {
		return new IterableNodeDequeDescendingIterator(this); // L: 99
	}

	public int size() {
		return this.method6308(); // L: 104
	}

	public boolean isEmpty() {
		return this.method6309(); // L: 109
	}

	public boolean contains(Object var1) {
		throw new RuntimeException(); // L: 114
	}

	public Object[] toArray() {
		return this.method6364(); // L: 119
	}

	public Object[] toArray(Object[] var1) {
		int var2 = 0; // L: 125

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) { // L: 126 127 129
			var1[var2++] = var3; // L: 128
		}

		return var1; // L: 131
	}

	public boolean remove(Object var1) {
		throw new RuntimeException(); // L: 141
	}

	public boolean addAll(Collection var1) {
		throw new RuntimeException(); // L: 151
	}

	public boolean removeAll(Collection var1) {
		throw new RuntimeException(); // L: 156
	}

	public boolean retainAll(Collection var1) {
		throw new RuntimeException(); // L: 161
	}

	public boolean add(Object var1) {
		return this.method6310((Node)var1); // L: 170
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 174
	}

	public boolean containsAll(Collection var1) {
		throw new RuntimeException(); // L: 146
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lov;Lov;)V"
	)
	@Export("IterableNodeDeque_addBefore")
	public static void IterableNodeDeque_addBefore(Node var0, Node var1) {
		if (var0.next != null) { // L: 38
			var0.remove();
		}

		var0.next = var1; // L: 39
		var0.previous = var1.previous; // L: 40
		var0.next.previous = var0; // L: 41
		var0.previous.next = var0; // L: 42
	} // L: 43
}
