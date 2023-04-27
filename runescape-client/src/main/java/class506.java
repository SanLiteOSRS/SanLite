import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tz")
public class class506 {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2074411675
	)
	int field5115;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1392698185
	)
	int field5116;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2079060143
	)
	int field5117;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -942838135
	)
	int field5118;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 795400289
	)
	int field5119;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -417354641
	)
	int field5120;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -729151693
	)
	int field5123;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -335536107
	)
	int field5122;
	@ObfuscatedName("aa")
	boolean field5125;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1499601627
	)
	int field5124;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 812242279
	)
	int field5114;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 933331403
	)
	int field5126;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1287309
	)
	int field5127;

	public class506() {
		this.field5123 = 0; // L: 18
		this.field5122 = 0; // L: 19
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "1599579546"
	)
	public void method9643(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5115 = var1; // L: 27
		this.field5116 = var2; // L: 28
		this.field5117 = var3; // L: 29
		this.field5118 = var4; // L: 30
		this.field5119 = var5; // L: 31
		this.field5120 = var6; // L: 32
		this.field5123 = var7; // L: 33
		this.field5122 = var8; // L: 34
		this.field5125 = var9; // L: 35
	} // L: 36

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-379953391"
	)
	public void method9648(int var1, int var2, int var3, int var4) {
		this.field5124 = var1; // L: 39
		this.field5114 = var2; // L: 40
		this.field5126 = var3; // L: 41
		this.field5127 = var4; // L: 42
	} // L: 43

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Loq;Lon;B)V",
		garbageValue = "-24"
	)
	public void method9645(class379 var1, Font var2) {
		if (var2 != null) { // L: 46
			int var3 = var2.ascent; // L: 47
			int var4 = Math.min(this.field5118, (int)((float)var3 * 0.9F)); // L: 48
			int var5 = var1.method7381(this.field5117); // L: 49
			int var6 = var1.method7383(this.field5118); // L: 50
			int var7 = var5 + (this.field5115 - this.field5119); // L: 51
			int var8 = var6 + var3 + (this.field5116 - this.field5120); // L: 52
			Rasterizer2D.Rasterizer2D_setClip(this.field5115, this.field5116, this.field5117 + this.field5115, this.field5118 + this.field5116); // L: 53
			int var9 = this.field5122; // L: 54
			int var10 = this.field5123; // L: 55
			if (var9 > var10) { // L: 56
				int var11 = var9; // L: 57
				var9 = var10; // L: 58
				var10 = var11; // L: 59
			}

			class383 var21 = var1.method7341(0, var9); // L: 61
			class383 var12 = var1.method7341(var9, var10); // L: 62
			class383 var13 = var1.method7341(var10, var1.method7264()); // L: 63
			class383 var14 = var1.method7341(0, this.field5123); // L: 64
			int var16;
			int var18;
			if (!var12.method7513()) { // L: 65
				int var15 = var2.maxAscent + var2.maxDescent; // L: 66

				for (var16 = 0; var16 < var12.method7514(); ++var16) { // L: 67
					class381 var23 = var12.method7515(var16); // L: 68
					var18 = var7 + var23.field4427; // L: 69
					int var19 = var2.charWidth(var23.field4428); // L: 70
					int var20 = var8 + var23.field4430 - var3; // L: 71
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5127); // L: 72
				}
			}

			if (!var21.method7513()) { // L: 75
				var2.method7415(var21, var7, var8, this.field5124, this.field5114, -1); // L: 76
			}

			if (!var12.method7513()) { // L: 78
				var2.method7415(var12, var7, var8, this.field5126, this.field5114, -1); // L: 79
			}

			if (!var13.method7513()) { // L: 81
				var2.method7415(var13, var7, var8, this.field5124, this.field5114, -1); // L: 82
			}

			if (this.field5125) { // L: 84
				class461 var22 = var14.method7512(); // L: 85
				var16 = var7 + (Integer)var22.field4886; // L: 86
				int var17 = var8 + (Integer)var22.field4887; // L: 87
				var18 = var17 - var4; // L: 88
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5124); // L: 89
				if (this.field5114 != -1) { // L: 90
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5114); // L: 91
				}
			}

		}
	} // L: 94
}
