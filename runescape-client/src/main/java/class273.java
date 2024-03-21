import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
public abstract class class273 extends Rasterizer2D {
	@ObfuscatedName("aq")
	boolean field2828;
	@ObfuscatedName("aw")
	boolean field2835;
	@ObfuscatedName("aa")
	int[] field2834;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	class289 field2829;

	@ObfuscatedSignature(
		descriptor = "(Lle;)V"
	)
	class273(class289 var1) {
		this.field2828 = false; // L: 8
		this.field2835 = false; // L: 9
		this.field2834 = Rasterizer3D.Rasterizer3D_colorPalette; // L: 18
		this.field2829 = var1; // L: 19
	} // L: 20

	@ObfuscatedName("aq")
	void method5383(int[] var1, int var2, int var3, float[] var4) {
		Rasterizer2D.method9822(var1, var2, var3, var4); // L: 23
	} // L: 24

	@ObfuscatedName("ai")
	void method5378(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
		var10 = method5379(var10, var13, var14, var15, var16); // L: 51
		var11 = method5379(var11, var13, var14, var15, var16); // L: 52
		var12 = method5379(var12, var13, var14, var15, var16); // L: 53
		this.vmethod5923(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12); // L: 54
	} // L: 55

	@ObfuscatedName("ar")
	void method5382(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
		int var15 = method5379(var10, var11, var12, var13, var14); // L: 58
		var10 = this.field2834[var15]; // L: 59
		this.vmethod5938(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10); // L: 60
	} // L: 61

	@ObfuscatedName("as")
	abstract void vmethod5923(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfuscatedName("aa")
	abstract void vmethod5938(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

	@ObfuscatedName("az")
	abstract void vmethod5890(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("ao")
	abstract void vmethod5897(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("aw")
	static int method5379(int var0, byte var1, byte var2, byte var3, byte var4) {
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

	@ObfuscatedName("al")
	static final int method5377(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7; // L: 44
		if (var1 < 2) { // L: 45
			var1 = 2;
		} else if (var1 > 126) { // L: 46
			var1 = 126;
		}

		return (var0 & 65408) + var1; // L: 47
	}
}
