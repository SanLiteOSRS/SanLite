import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dp")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("o")
	@Export("position")
	int position;

	AbstractSound() {
	}
}
