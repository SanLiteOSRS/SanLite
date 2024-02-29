import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2021684473
	)
	@Export("x")
	int x;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1683760819
	)
	@Export("y")
	int y;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -423675421
	)
	@Export("z")
	int z;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1425529543
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Llr;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z; // L: 14
		this.magnitude = var1.magnitude; // L: 15
	} // L: 16

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(DDII)[D",
		garbageValue = "-1487725012"
	)
	public static double[] method5839(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1; // L: 17
		double[] var6 = new double[var5]; // L: 18
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			var6[var8] = class10.method84((double)var7, var0, var2); // L: 20
			++var7; // L: 19
		}

		return var6; // L: 22
	}
}
