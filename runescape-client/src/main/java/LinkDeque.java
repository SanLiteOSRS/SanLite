import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("LinkDeque")
public class LinkDeque {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	@Export("sentinel")
	Link sentinel;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	@Export("current")
	Link current;

	public LinkDeque() {
		this.sentinel = new Link();
		this.sentinel.previous = this.sentinel;
		this.sentinel.next = this.sentinel;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lmk;)V"
	)
	@Export("addFirst")
	public void addFirst(Link var1) {
		if (var1.next != null) {
			var1.remove();
		}

		var1.next = this.sentinel.next;
		var1.previous = this.sentinel;
		var1.next.previous = var1;
		var1.previous.next = var1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "()Lmk;"
	)
	@Export("last")
	public Link last() {
		Link var1 = this.sentinel.previous;
		if (var1 == this.sentinel) {
			this.current = null;
			return null;
		} else {
			this.current = var1.previous;
			return var1;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "()Lmk;"
	)
	@Export("previous")
	public Link previous() {
		Link var1 = this.current;
		if (var1 == this.sentinel) {
			this.current = null;
			return null;
		} else {
			this.current = var1.previous;
			return var1;
		}
	}
}
