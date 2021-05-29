import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
@Implements("Node")
public class Node {
	@ObfuscatedName("ff")
	@Export("key")
	public long key;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("eq")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("fz")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
