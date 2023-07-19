import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("ai")
	int field400;

	@ObfuscatedName("ai")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lbu;)I"
	)
	@Export("update")
	abstract int update();
}
