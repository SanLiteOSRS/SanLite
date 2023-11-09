import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
@Implements("Node")
public class Node {
	@ObfuscatedName("hd")
	@Export("key")
	public long key;
	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("gp")
	@Export("remove")
	public void remove() {
		if (this.next != null) { // L: 9
			this.next.previous = this.previous; // L: 10
			this.previous.next = this.next; // L: 11
			this.previous = null; // L: 12
			this.next = null; // L: 13
		}
	} // L: 14

	@ObfuscatedName("gy")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null; // L: 17
	}
}
