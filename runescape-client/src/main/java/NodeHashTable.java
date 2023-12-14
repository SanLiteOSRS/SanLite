import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tw")
@Implements("NodeHashTable")
public final class NodeHashTable {
	@ObfuscatedName("at")
	@Export("size")
	int size;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lsh;"
	)
	@Export("buckets")
	Node[] buckets;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("currentGet")
	Node currentGet;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("current")
	Node current;
	@ObfuscatedName("ab")
	@Export("index")
	int index;

	public NodeHashTable(int var1) {
		this.index = 0; // L: 10
		this.size = var1; // L: 13
		this.buckets = new Node[var1]; // L: 14

		for (int var2 = 0; var2 < var1; ++var2) { // L: 15
			Node var3 = this.buckets[var2] = new Node(); // L: 16
			var3.previous = var3; // L: 17
			var3.next = var3; // L: 18
		}

	} // L: 20

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(J)Lsh;"
	)
	@Export("get")
	public Node get(long var1) {
		Node var3 = this.buckets[(int)(var1 & (long)(this.size - 1))]; // L: 23

		for (this.currentGet = var3.previous; var3 != this.currentGet; this.currentGet = this.currentGet.previous) { // L: 24 25 31
			if (this.currentGet.key == var1) { // L: 26
				Node var4 = this.currentGet; // L: 27
				this.currentGet = this.currentGet.previous; // L: 28
				return var4; // L: 29
			}
		}

		this.currentGet = null; // L: 33
		return null; // L: 34
	}

	@ObfuscatedName("ah")
	@Export("load")
	public int load() {
		int var1 = 0; // L: 38

		for (int var2 = 0; var2 < this.size; ++var2) { // L: 39
			Node var3 = this.buckets[var2]; // L: 40

			for (Node var4 = var3.previous; var4 != var3; var4 = var4.previous) { // L: 41 42 44
				++var1; // L: 43
			}
		}

		return var1; // L: 47
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lsh;J)V"
	)
	@Export("put")
	public void put(Node var1, long var2) {
		if (var1.next != null) { // L: 51
			var1.remove();
		}

		Node var4 = this.buckets[(int)(var2 & (long)(this.size - 1))]; // L: 52
		var1.next = var4.next; // L: 53
		var1.previous = var4; // L: 54
		var1.next.previous = var1; // L: 55
		var1.previous.next = var1; // L: 56
		var1.key = var2; // L: 57
	} // L: 58

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lsh;"
	)
	@Export("first")
	public Node first() {
		this.index = 0; // L: 61
		return this.next(); // L: 62
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Lsh;"
	)
	@Export("next")
	public Node next() {
		Node var1;
		if (this.index > 0 && this.buckets[this.index - 1] != this.current) { // L: 66
			var1 = this.current; // L: 67
			this.current = var1.previous; // L: 68
			return var1; // L: 69
		} else {
			do {
				if (this.index >= this.size) { // L: 71
					return null; // L: 78
				}

				var1 = this.buckets[this.index++].previous; // L: 72
			} while(var1 == this.buckets[this.index - 1]); // L: 73

			this.current = var1.previous; // L: 74
			return var1; // L: 75
		}
	}
}
