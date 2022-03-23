import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oh")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("cs")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("dh")
	@Export("removeDual")
	public void removeDual() {
		if (this.nextDual != null) {
			this.nextDual.previousDual = this.previousDual;
			this.previousDual.nextDual = this.nextDual;
			this.previousDual = null;
			this.nextDual = null;
		}
	}
}
