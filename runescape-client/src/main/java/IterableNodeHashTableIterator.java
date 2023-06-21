import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sc")
@Implements("IterableNodeHashTableIterator")
public class IterableNodeHashTableIterator implements Iterator {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	@Export("hashTable")
	IterableNodeHashTable hashTable;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	@Export("head")
	Node head;
	@ObfuscatedName("av")
	@Export("index")
	int index;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		descriptor = "(Lsv;)V"
	)
	public IterableNodeHashTableIterator(IterableNodeHashTable var1) {
		this.last = null; // L: 10
		this.hashTable = var1; // L: 13
		this.start(); // L: 14
	} // L: 15

	@ObfuscatedName("at")
	@Export("start")
	void start() {
		this.head = this.hashTable.buckets[0].previous; // L: 18
		this.index = 1; // L: 19
		this.last = null; // L: 20
	} // L: 21

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lrz;"
	)
	public Node method8589() {
		this.start(); // L: 24
		return (Node)this.next(); // L: 25
	}

	public Object next() {
		Node var1;
		if (this.hashTable.buckets[this.index - 1] != this.head) { // L: 30
			var1 = this.head; // L: 31
			this.head = var1.previous; // L: 32
			this.last = var1; // L: 33
			return var1; // L: 34
		} else {
			do {
				if (this.index >= this.hashTable.size) { // L: 36
					return null; // L: 44
				}

				var1 = this.hashTable.buckets[this.index++].previous; // L: 37
			} while(var1 == this.hashTable.buckets[this.index - 1]); // L: 38

			this.head = var1.previous; // L: 39
			this.last = var1; // L: 40
			return var1; // L: 41
		}
	}

	public void remove() {
		if (this.last == null) { // L: 62
			throw new IllegalStateException();
		} else {
			this.last.remove(); // L: 63
			this.last = null; // L: 64
		}
	} // L: 65

	public boolean hasNext() {
		if (this.hashTable.buckets[this.index - 1] != this.head) { // L: 48
			return true;
		} else {
			while (this.index < this.hashTable.size) { // L: 49
				if (this.hashTable.buckets[this.index++].previous != this.hashTable.buckets[this.index - 1]) { // L: 50
					this.head = this.hashTable.buckets[this.index - 1].previous; // L: 51
					return true; // L: 52
				}

				this.head = this.hashTable.buckets[this.index - 1]; // L: 55
			}

			return false; // L: 58
		}
	}
}
