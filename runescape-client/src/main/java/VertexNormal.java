import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -530812609
	)
	@Export("x")
	int x;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2129765855
	)
	@Export("y")
	int y;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1401636457
	)
	@Export("z")
	int z;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1745933887
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lgv;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}
}
