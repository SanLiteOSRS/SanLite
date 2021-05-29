import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
@Implements("Link")
public class Link {
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	@Export("next")
	public Link next;

	@ObfuscatedName("v")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}
}
