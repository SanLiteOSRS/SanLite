import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
@Implements("Buddy")
public class Buddy extends Nameable {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1767210019
	)
	@Export("world")
	public int world;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1595280059
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -894638573
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1; // L: 4
	} // L: 8

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-87975301"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1; // L: 11
		this.int2 = var2; // L: 12
	} // L: 13

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1755298116"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world; // L: 16
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1364221450"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0; // L: 20
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1992575835"
	)
	static final void method7626(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 10819
		int var7 = var3 - var1; // L: 10820
		int var8 = var6 >= 0 ? var6 : -var6; // L: 10821
		int var9 = var7 >= 0 ? var7 : -var7; // L: 10822
		int var10 = var8; // L: 10823
		if (var8 < var9) { // L: 10824
			var10 = var9;
		}

		if (var10 != 0) { // L: 10825
			int var11 = (var6 << 16) / var10; // L: 10826
			int var12 = (var7 << 16) / var10; // L: 10827
			if (var12 <= var11) { // L: 10828
				var11 = -var11;
			} else {
				var12 = -var12; // L: 10829
			}

			int var13 = var5 * var12 >> 17; // L: 10830
			int var14 = var5 * var12 + 1 >> 17; // L: 10831
			int var15 = var5 * var11 >> 17; // L: 10832
			int var16 = var5 * var11 + 1 >> 17; // L: 10833
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 10834
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 10835
			int var17 = var0 + var13; // L: 10836
			int var18 = var0 - var14; // L: 10837
			int var19 = var0 + var6 - var14; // L: 10838
			int var20 = var0 + var6 + var13; // L: 10839
			int var21 = var15 + var1; // L: 10840
			int var22 = var1 - var16; // L: 10841
			int var23 = var7 + var1 - var16; // L: 10842
			int var24 = var15 + var7 + var1; // L: 10843
			Rasterizer3D.method4321(var17, var18, var19); // L: 10844
			Rasterizer3D.method4326(var21, var22, var23, var17, var18, var19, var4); // L: 10845
			Rasterizer3D.method4321(var17, var19, var20); // L: 10846
			Rasterizer3D.method4326(var21, var23, var24, var17, var19, var20, var4); // L: 10847
		}
	} // L: 10848
}
