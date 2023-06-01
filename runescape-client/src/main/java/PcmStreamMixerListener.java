import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("ay")
	int field387;

	@ObfuscatedName("ay")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lbt;)I"
	)
	@Export("update")
	abstract int update();
}
