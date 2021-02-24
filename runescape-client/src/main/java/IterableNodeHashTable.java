import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
@Implements("IterableNodeHashTable")
public final class IterableNodeHashTable implements Iterable {
	@ObfuscatedName("n")
	@Export("size")
	int size;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "[Lga;"
	)
	@Export("buckets")
	Node[] buckets;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lga;"
	)
	@Export("currentGet")
	Node currentGet;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lga;"
	)
	@Export("current")
	Node current;
	@ObfuscatedName("y")
	@Export("index")
	int index;

	public IterableNodeHashTable(int var1) {
		this.index = 0;
		this.size = var1;
		this.buckets = new Node[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			Node var3 = this.buckets[var2] = new Node();
			var3.previous = var3;
			var3.next = var3;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(J)Lga;"
	)
	@Export("get")
	public Node get(long var1) {
		Node var3 = this.buckets[(int)(var1 & (long)(this.size - 1))];

		for (this.currentGet = var3.previous; var3 != this.currentGet; this.currentGet = this.currentGet.previous) {
			if (this.currentGet.key == var1) {
				Node var4 = this.currentGet;
				this.currentGet = this.currentGet.previous;
				return var4;
			}
		}

		this.currentGet = null;
		return null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(Lga;J)V"
	)
	@Export("put")
	public void put(Node var1, long var2) {
		if (var1.next != null) {
			var1.remove();
		}

		Node var4 = this.buckets[(int)(var2 & (long)(this.size - 1))];
		var1.next = var4.next;
		var1.previous = var4;
		var1.next.previous = var1;
		var1.previous.next = var1;
		var1.key = var2;
	}

	@ObfuscatedName("d")
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.size; ++var1) {
			Node var2 = this.buckets[var1];

			while (true) {
				Node var3 = var2.previous;
				if (var3 == var2) {
					break;
				}

				var3.remove();
			}
		}

		this.currentGet = null;
		this.current = null;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "()Lga;"
	)
	@Export("first")
	public Node first() {
		this.index = 0;
		return this.next();
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "()Lga;"
	)
	@Export("next")
	public Node next() {
		Node var1;
		if (this.index > 0 && this.buckets[this.index - 1] != this.current) {
			var1 = this.current;
			this.current = var1.previous;
			return var1;
		} else {
			do {
				if (this.index >= this.size) {
					return null;
				}

				var1 = this.buckets[this.index++].previous;
			} while(var1 == this.buckets[this.index - 1]);

			this.current = var1.previous;
			return var1;
		}
	}

	public Iterator iterator() {
		return new IterableNodeHashTableIterator(this);
	}
}
