import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("EvictingDualNodeHashTable")
public final class EvictingDualNodeHashTable {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	DualNode field2561;
	@ObfuscatedName("c")
	@Export("capacity")
	int capacity;
	@ObfuscatedName("o")
	@Export("remainingCapacity")
	int remainingCapacity;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("hashTable")
	IterableNodeHashTable hashTable;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("deque")
	IterableDualNodeQueue deque;

	public EvictingDualNodeHashTable(int var1) {
		this.field2561 = new DualNode();
		this.deque = new IterableDualNodeQueue();
		this.capacity = var1;
		this.remainingCapacity = var1;

		int var2;
		for (var2 = 1; var2 + var2 < var1; var2 += var2) {
		}

		this.hashTable = new IterableNodeHashTable(var2);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(J)Lmf;"
	)
	@Export("get")
	public DualNode get(long var1) {
		DualNode var3 = (DualNode)this.hashTable.get(var1);
		if (var3 != null) {
			this.deque.add(var3);
		}

		return var3;
	}

	@ObfuscatedName("c")
	@Export("remove")
	public void remove(long var1) {
		DualNode var3 = (DualNode)this.hashTable.get(var1);
		if (var3 != null) {
			var3.remove();
			var3.removeDual();
			++this.remainingCapacity;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lmf;J)V"
	)
	@Export("put")
	public void put(DualNode var1, long var2) {
		if (this.remainingCapacity == 0) {
			DualNode var4 = this.deque.removeLast();
			var4.remove();
			var4.removeDual();
			if (var4 == this.field2561) {
				var4 = this.deque.removeLast();
				var4.remove();
				var4.removeDual();
			}
		} else {
			--this.remainingCapacity;
		}

		this.hashTable.put(var1, var2);
		this.deque.add(var1);
	}

	@ObfuscatedName("g")
	@Export("clear")
	public void clear() {
		this.deque.clear();
		this.hashTable.clear();
		this.field2561 = new DualNode();
		this.remainingCapacity = this.capacity;
	}
}
