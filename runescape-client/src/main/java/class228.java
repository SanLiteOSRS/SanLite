import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
public abstract class class228 extends Rasterizer2D {
	@ObfuscatedName("au")
	boolean field2553;
	@ObfuscatedName("ae")
	boolean field2548;
	@ObfuscatedName("az")
	int[] field2552;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	class244 field2547;

	@ObfuscatedSignature(
		descriptor = "(Ljl;)V"
	)
	class228(class244 var1) {
		this.field2553 = false; // L: 8
		this.field2548 = false; // L: 9
		this.field2552 = Rasterizer3D.Rasterizer3D_colorPalette; // L: 18
		this.field2547 = var1; // L: 19
	} // L: 20

	@ObfuscatedName("au")
	void method4482(int[] var1, int var2, int var3, float[] var4) {
		Rasterizer2D.method9367(var1, var2, var3, var4); // L: 23
	} // L: 24

	@ObfuscatedName("at")
	void method4485(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
		var10 = method4512(var10, var13, var14, var15, var16); // L: 51
		var11 = method4512(var11, var13, var14, var15, var16); // L: 52
		var12 = method4512(var12, var13, var14, var15, var16); // L: 53
		this.vmethod5020(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12); // L: 54
	} // L: 55

	@ObfuscatedName("ac")
	void method4481(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
		int var15 = method4512(var10, var11, var12, var13, var14); // L: 58
		var10 = this.field2552[var15]; // L: 59
		this.vmethod4972(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10); // L: 60
	} // L: 61

	@ObfuscatedName("ai")
	abstract void vmethod5020(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfuscatedName("az")
	abstract void vmethod4972(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

	@ObfuscatedName("ap")
	abstract void vmethod4967(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("aa")
	abstract void vmethod4981(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("ae")
	static int method4512(int var0, byte var1, byte var2, byte var3, byte var4) {
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

	@ObfuscatedName("ao")
	static final int method4484(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7; // L: 44
		if (var1 < 2) { // L: 45
			var1 = 2;
		} else if (var1 > 126) { // L: 46
			var1 = 126;
		}

		return (var0 & 65408) + var1; // L: 47
	}
}
