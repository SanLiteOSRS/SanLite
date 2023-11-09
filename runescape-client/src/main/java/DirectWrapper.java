import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ka")
@Implements("DirectWrapper")
public class DirectWrapper extends Wrapper {
	@ObfuscatedName("aj")
	@Export("obj")
	Object obj;

	DirectWrapper(Object var1, int var2) {
		super(var2); // L: 7
		this.obj = var1; // L: 8
	} // L: 9

	@ObfuscatedName("aj")
	@Export("get")
	Object get() {
		return this.obj; // L: 12
	}

	@ObfuscatedName("al")
	@Export("isSoft")
	boolean isSoft() {
		return false; // L: 16
	}
}
