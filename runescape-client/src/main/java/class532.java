import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uo")
public class class532 {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2076180179
	)
	int field5244;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1603682849
	)
	int field5232;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1899372153
	)
	int field5234;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 608291053
	)
	int field5235;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 790840067
	)
	int field5236;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1702824015
	)
	int field5237;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1434571801
	)
	int field5233;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -730791395
	)
	int field5239;
	@ObfuscatedName("af")
	boolean field5240;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2137169805
	)
	int field5241;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -120854339
	)
	int field5242;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1579750397
	)
	int field5243;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -729046229
	)
	int field5238;

	public class532() {
		this.field5233 = 0; // L: 18
		this.field5239 = 0; // L: 19
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZB)V",
		garbageValue = "115"
	)
	public void method9669(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5244 = var1; // L: 27
		this.field5232 = var2; // L: 28
		this.field5234 = var3; // L: 29
		this.field5235 = var4; // L: 30
		this.field5236 = var5; // L: 31
		this.field5237 = var6; // L: 32
		this.field5233 = var7; // L: 33
		this.field5239 = var8; // L: 34
		this.field5240 = var9; // L: 35
	} // L: 36

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1487939311"
	)
	public void method9670(int var1, int var2, int var3, int var4) {
		this.field5241 = var1; // L: 39
		this.field5242 = var2; // L: 40
		this.field5243 = var3; // L: 41
		this.field5238 = var4; // L: 42
	} // L: 43

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lpj;Lpi;B)V",
		garbageValue = "-117"
	)
	public void method9672(class394 var1, Font var2) {
		if (var2 != null) { // L: 46
			int var3 = var2.ascent; // L: 47
			int var4 = Math.min(this.field5235, (int)((float)var3 * 0.9F)); // L: 48
			int var5 = var1.method7309(this.field5234); // L: 49
			int var6 = var1.method7310(this.field5235); // L: 50
			int var7 = var5 + (this.field5244 - this.field5236); // L: 51
			int var8 = var6 + var3 + (this.field5232 - this.field5237); // L: 52
			Rasterizer2D.Rasterizer2D_setClip(this.field5244, this.field5232, this.field5244 + this.field5234, this.field5235 + this.field5232); // L: 53
			int var9 = this.field5239; // L: 54
			int var10 = this.field5233; // L: 55
			if (var9 > var10) { // L: 56
				int var11 = var9; // L: 57
				var9 = var10; // L: 58
				var10 = var11; // L: 59
			}

			class398 var21 = var1.method7290(0, var9); // L: 61
			class398 var12 = var1.method7290(var9, var10); // L: 62
			class398 var13 = var1.method7290(var10, var1.method7281()); // L: 63
			class398 var14 = var1.method7290(0, this.field5233); // L: 64
			int var16;
			int var18;
			if (!var12.method7544()) { // L: 65
				int var15 = var2.maxAscent + var2.maxDescent; // L: 66

				for (var16 = 0; var16 < var12.method7545(); ++var16) { // L: 67
					class396 var23 = var12.method7549(var16); // L: 68
					var18 = var7 + var23.field4475; // L: 69
					int var19 = var2.charWidth(var23.field4476); // L: 70
					int var20 = var8 + var23.field4478 - var3; // L: 71
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5238); // L: 72
				}
			}

			if (!var21.method7544()) { // L: 75
				var2.method7437(var21, var7, var8, this.field5241, this.field5242, -1); // L: 76
			}

			if (!var12.method7544()) { // L: 78
				var2.method7437(var12, var7, var8, this.field5243, this.field5242, -1); // L: 79
			}

			if (!var13.method7544()) { // L: 81
				var2.method7437(var13, var7, var8, this.field5241, this.field5242, -1); // L: 82
			}

			if (this.field5240) { // L: 84
				class485 var22 = var14.method7553(); // L: 85
				var16 = var7 + (Integer)var22.field4966; // L: 86
				int var17 = var8 + (Integer)var22.field4965; // L: 87
				var18 = var17 - var4; // L: 88
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5241); // L: 89
				if (this.field5242 != -1) { // L: 90
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5242); // L: 91
				}
			}

		}
	} // L: 94
}
