import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1941999827
	)
	@Export("x")
	int x;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 124229261
	)
	@Export("y")
	int y;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2108671835
	)
	@Export("z")
	int z;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1837445001
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z; // L: 14
		this.magnitude = var1.magnitude; // L: 15
	} // L: 16

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2041739406"
	)
	static int method4909(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F)); // L: 4364
	}
}
