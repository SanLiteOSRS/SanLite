import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
@Implements("Node")
public class Node {
	@ObfuscatedName("fs")
	@Export("key")
	public long key;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("ef")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("eh")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
