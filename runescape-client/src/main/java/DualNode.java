import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("cc")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("cb")
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
