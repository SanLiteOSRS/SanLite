import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
@Implements("Node")
public class Node {
	@ObfuscatedName("fk")
	@Export("key")
	public long key;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		signature = "Lmh;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		signature = "Lmh;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("ex")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("ed")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
