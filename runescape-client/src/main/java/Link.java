import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
@Implements("Link")
public class Link {
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
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
