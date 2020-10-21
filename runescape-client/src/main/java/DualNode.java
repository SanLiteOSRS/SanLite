import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("cq")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		signature = "Lgp;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		signature = "Lgp;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("cu")
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
