import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("cu")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		signature = "Lgj;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		signature = "Lgj;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("cm")
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
