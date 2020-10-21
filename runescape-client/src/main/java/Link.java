import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
@Implements("Link")
public class Link {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lgr;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lgr;"
	)
	@Export("next")
	public Link next;

	@ObfuscatedName("z")
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
