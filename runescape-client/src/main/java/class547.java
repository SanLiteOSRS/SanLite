import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vz")
public class class547 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1349877309
	)
	int field5264;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1841245853
	)
	int field5257;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -821107777
	)
	int field5269;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1581863441
	)
	int field5261;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -982399101
	)
	int field5262;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 537521583
	)
	int field5263;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -886515011
	)
	int field5268;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 27615469
	)
	int field5265;
	@ObfuscatedName("av")
	boolean field5266;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1969486397
	)
	int field5259;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 876959897
	)
	int field5260;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1640830113
	)
	int field5258;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -750793119
	)
	int field5270;

	public class547() {
		this.field5268 = 0; // L: 18
		this.field5265 = 0; // L: 19
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "-1556835629"
	)
	public void method9826(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5264 = var1; // L: 27
		this.field5257 = var2; // L: 28
		this.field5269 = var3; // L: 29
		this.field5261 = var4; // L: 30
		this.field5262 = var5; // L: 31
		this.field5263 = var6; // L: 32
		this.field5268 = var7; // L: 33
		this.field5265 = var8; // L: 34
		this.field5266 = var9; // L: 35
	} // L: 36

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "826854600"
	)
	public void method9830(int var1, int var2, int var3, int var4) {
		this.field5259 = var1; // L: 39
		this.field5260 = var2; // L: 40
		this.field5258 = var3; // L: 41
		this.field5270 = var4; // L: 42
	} // L: 43

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lpp;Lpu;B)V",
		garbageValue = "0"
	)
	public void method9827(class409 var1, Font var2) {
		if (var2 != null) { // L: 46
			int var3 = var2.ascent; // L: 47
			int var4 = Math.min(this.field5261, (int)(0.9F * (float)var3)); // L: 48
			int var5 = var1.method7495(this.field5269); // L: 49
			int var6 = var1.method7595(this.field5261); // L: 50
			int var7 = var5 + (this.field5264 - this.field5262); // L: 51
			int var8 = var6 + var3 + (this.field5257 - this.field5263); // L: 52
			Rasterizer2D.Rasterizer2D_setClip(this.field5264, this.field5257, this.field5269 + this.field5264, this.field5261 + this.field5257); // L: 53
			int var9 = this.field5265; // L: 54
			int var10 = this.field5268; // L: 55
			if (var9 > var10) { // L: 56
				int var11 = var9; // L: 57
				var9 = var10; // L: 58
				var10 = var11; // L: 59
			}

			class413 var21 = var1.method7549(0, var9); // L: 61
			class413 var12 = var1.method7549(var9, var10); // L: 62
			class413 var13 = var1.method7549(var10, var1.method7467()); // L: 63
			class413 var14 = var1.method7549(0, this.field5268); // L: 64
			int var16;
			int var18;
			if (!var12.method7707()) { // L: 65
				int var15 = var2.maxAscent + var2.maxDescent; // L: 66

				for (var16 = 0; var16 < var12.method7709(); ++var16) { // L: 67
					class411 var23 = var12.method7712(var16); // L: 68
					var18 = var7 + var23.field4524; // L: 69
					int var19 = var2.charWidth(var23.field4523); // L: 70
					int var20 = var8 + var23.field4525 - var3; // L: 71
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5270); // L: 72
				}
			}

			if (!var21.method7707()) { // L: 75
				var2.method7702(var21, var7, var8, this.field5259, this.field5260, -1); // L: 76
			}

			if (!var12.method7707()) { // L: 78
				var2.method7702(var12, var7, var8, this.field5258, this.field5260, -1); // L: 79
			}

			if (!var13.method7707()) { // L: 81
				var2.method7702(var13, var7, var8, this.field5259, this.field5260, -1); // L: 82
			}

			if (this.field5266) { // L: 84
				class500 var22 = var14.method7711(); // L: 85
				var16 = var7 + (Integer)var22.field5003; // L: 86
				int var17 = var8 + (Integer)var22.field5004; // L: 87
				var18 = var17 - var4; // L: 88
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5259); // L: 89
				if (this.field5260 != -1) { // L: 90
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5260); // L: 91
				}
			}

		}
	} // L: 94
}
