import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("eq")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lrc;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lrc;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("ez")
	@Export("removeDual")
	public void removeDual() {
		if (this.nextDual != null) { // L: 9
			this.nextDual.previousDual = this.previousDual; // L: 10
			this.previousDual.nextDual = this.nextDual; // L: 11
			this.previousDual = null; // L: 12
			this.nextDual = null; // L: 13
		}
	} // L: 14
}
