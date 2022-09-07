import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ie")
@Implements("Wrapper")
public abstract class Wrapper extends DualNode {
	@ObfuscatedName("h")
	@Export("size")
	final int size;

	Wrapper(int var1) {
		this.size = var1; // L: 9
	} // L: 10

	@ObfuscatedName("s")
	@Export("get")
	abstract Object get();

	@ObfuscatedName("h")
	@Export("isSoft")
	abstract boolean isSoft();
}
