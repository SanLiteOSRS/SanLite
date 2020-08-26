import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("cj")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		signature = "Lgs;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		signature = "Lgs;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("dq")
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
