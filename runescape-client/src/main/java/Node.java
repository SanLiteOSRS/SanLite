import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
@Implements("Node")
public class Node {
	@ObfuscatedName("gt")
	@Export("key")
	public long key;
	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("fd")
	@Export("remove")
	public void remove() {
		if (this.next != null) { // L: 9
			this.next.previous = this.previous; // L: 10
			this.previous.next = this.next; // L: 11
			this.previous = null; // L: 12
			this.next = null; // L: 13
		}
	} // L: 14

	@ObfuscatedName("fr")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null; // L: 17
	}
}
