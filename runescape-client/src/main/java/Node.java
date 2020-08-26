import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("Node")
public class Node {
	@ObfuscatedName("cp")
	@Export("key")
	public long key;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		signature = "Lgw;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		signature = "Lgw;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("fa")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("fh")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
