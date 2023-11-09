import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rf")
@Implements("Link")
public class Link {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lrf;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lrf;"
	)
	@Export("next")
	public Link next;

	@ObfuscatedName("ai")
	@Export("remove")
	public void remove() {
		if (this.next != null) { // L: 8
			this.next.previous = this.previous; // L: 9
			this.previous.next = this.next; // L: 10
			this.previous = null; // L: 11
			this.next = null; // L: 12
		}
	} // L: 13
}
