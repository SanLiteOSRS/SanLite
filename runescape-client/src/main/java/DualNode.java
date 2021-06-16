import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("cy")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("ce")
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
