import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
public abstract class class228 extends Rasterizer2D {
	@ObfuscatedName("ai")
	boolean field2541;
	@ObfuscatedName("aj")
	boolean field2535;
	@ObfuscatedName("av")
	int[] field2538;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	class244 field2540;

	@ObfuscatedSignature(
		descriptor = "(Ljd;)V"
	)
	class228(class244 var1) {
		this.field2541 = false; // L: 8
		this.field2535 = false; // L: 9
		this.field2538 = Rasterizer3D.Rasterizer3D_colorPalette; // L: 18
		this.field2540 = var1; // L: 19
	} // L: 20

	@ObfuscatedName("ai")
	void method4598(int[] var1, int var2, int var3, float[] var4) {
		Rasterizer2D.method9393(var1, var2, var3, var4); // L: 23
	} // L: 24

	@ObfuscatedName("aw")
	void method4606(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
		var10 = method4584(var10, var13, var14, var15, var16); // L: 51
		var11 = method4584(var11, var13, var14, var15, var16); // L: 52
		var12 = method4584(var12, var13, var14, var15, var16); // L: 53
		this.vmethod5052(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12); // L: 54
	} // L: 55

	@ObfuscatedName("ay")
	void method4583(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
		int var15 = method4584(var10, var11, var12, var13, var14); // L: 58
		var10 = this.field2538[var15]; // L: 59
		this.vmethod5055(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10); // L: 60
	} // L: 61

	@ObfuscatedName("ap")
	abstract void vmethod5052(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfuscatedName("av")
	abstract void vmethod5055(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

	@ObfuscatedName("an")
	abstract void vmethod5057(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("au")
	abstract void vmethod5064(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("aj")
	static int method4584(int var0, byte var1, byte var2, byte var3, byte var4) {
		int var5 = var0 >> 10 & 63; // L: 27
		int var6 = var0 >> 7 & 7; // L: 28
		int var7 = var0 & 127; // L: 29
		int var8 = var4 & 255; // L: 30
		if (var1 != -1) { // L: 31
			var5 += var8 * (var1 - var5) >> 7; // L: 32
		}

		if (var2 != -1) { // L: 34
			var6 += var8 * (var2 - var6) >> 7; // L: 35
		}

		if (var3 != -1) { // L: 37
			var7 += var8 * (var3 - var7) >> 7; // L: 38
		}

		return (var5 << 10 | var6 << 7 | var7) & 65535; // L: 40
	}

	@ObfuscatedName("ac")
	static final int method4585(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7; // L: 44
		if (var1 < 2) { // L: 45
			var1 = 2;
		} else if (var1 > 126) { // L: 46
			var1 = 126;
		}

		return (var0 & 65408) + var1; // L: 47
	}
}
