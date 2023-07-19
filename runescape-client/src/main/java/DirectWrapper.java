import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ly")
@Implements("DirectWrapper")
public class DirectWrapper extends Wrapper {
	@ObfuscatedName("ai")
	@Export("obj")
	Object obj;

	DirectWrapper(Object var1, int var2) {
		super(var2); // L: 7
		this.obj = var1; // L: 8
	} // L: 9

	@ObfuscatedName("ai")
	@Export("get")
	Object get() {
		return this.obj; // L: 12
	}

	@ObfuscatedName("aj")
	@Export("isSoft")
	boolean isSoft() {
		return false; // L: 16
	}
}
