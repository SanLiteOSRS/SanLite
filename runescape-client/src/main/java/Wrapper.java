import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("iz")
@Implements("Wrapper")
public abstract class Wrapper extends DualNode {
	@ObfuscatedName("p")
	@Export("size")
	final int size;

	Wrapper(int var1) {
		this.size = var1; // L: 9
	} // L: 10

	@ObfuscatedName("c")
	@Export("get")
	abstract Object get();

	@ObfuscatedName("p")
	@Export("isSoft")
	abstract boolean isSoft();
}
