import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = -399122963
	)
	static int field2776;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1191953879
	)
	@Export("x")
	int x;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 78700651
	)
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1925734805
	)
	@Export("z")
	int z;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 822146547
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Ljl;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z; // L: 14
		this.magnitude = var1.magnitude; // L: 15
	} // L: 16
}
