import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mf")
@Implements("Node")
public class Node {
	@ObfuscatedName("fu")
	@Export("key")
	public long key;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("eo")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("ew")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
