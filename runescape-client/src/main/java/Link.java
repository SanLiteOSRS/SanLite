import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
@Implements("Link")
public class Link {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lgm;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lgm;"
	)
	@Export("next")
	public Link next;

	@ObfuscatedName("h")
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
