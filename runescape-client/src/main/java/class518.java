import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tw")
public class class518 {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1192074119
	)
	int field5149;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -727782923
	)
	int field5144;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2127809115
	)
	int field5142;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 435121533
	)
	int field5143;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2028737333
	)
	int field5150;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1132819521
	)
	int field5145;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1968792117
	)
	int field5146;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -608921205
	)
	int field5152;
	@ObfuscatedName("af")
	boolean field5148;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2125433009
	)
	int field5140;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -762154251
	)
	int field5147;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1122010955
	)
	int field5151;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -597663969
	)
	int field5141;

	public class518() {
		this.field5146 = 0; // L: 18
		this.field5152 = 0; // L: 19
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "679724207"
	)
	public void method9539(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5149 = var1; // L: 27
		this.field5144 = var2; // L: 28
		this.field5142 = var3; // L: 29
		this.field5143 = var4; // L: 30
		this.field5150 = var5; // L: 31
		this.field5145 = var6; // L: 32
		this.field5146 = var7; // L: 33
		this.field5152 = var8; // L: 34
		this.field5148 = var9; // L: 35
	} // L: 36

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-77"
	)
	public void method9547(int var1, int var2, int var3, int var4) {
		this.field5140 = var1; // L: 39
		this.field5147 = var2; // L: 40
		this.field5151 = var3; // L: 41
		this.field5141 = var4; // L: 42
	} // L: 43

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lpk;Lph;I)V",
		garbageValue = "981010592"
	)
	public void method9545(class392 var1, Font var2) {
		if (var2 != null) { // L: 46
			int var3 = var2.ascent; // L: 47
			int var4 = Math.min(this.field5143, (int)(0.9F * (float)var3)); // L: 48
			int var5 = var1.method7294(this.field5142); // L: 49
			int var6 = var1.method7325(this.field5143); // L: 50
			int var7 = var5 + (this.field5149 - this.field5150); // L: 51
			int var8 = var3 + var6 + (this.field5144 - this.field5145); // L: 52
			Rasterizer2D.Rasterizer2D_setClip(this.field5149, this.field5144, this.field5149 + this.field5142, this.field5143 + this.field5144); // L: 53
			int var9 = this.field5152; // L: 54
			int var10 = this.field5146; // L: 55
			if (var9 > var10) { // L: 56
				int var11 = var9; // L: 57
				var9 = var10; // L: 58
				var10 = var11; // L: 59
			}

			class396 var21 = var1.method7275(0, var9); // L: 61
			class396 var12 = var1.method7275(var9, var10); // L: 62
			class396 var13 = var1.method7275(var10, var1.method7266()); // L: 63
			class396 var14 = var1.method7275(0, this.field5146); // L: 64
			int var16;
			int var18;
			if (!var12.method7531()) { // L: 65
				int var15 = var2.maxAscent + var2.maxDescent; // L: 66

				for (var16 = 0; var16 < var12.method7549(); ++var16) { // L: 67
					class394 var23 = var12.method7536(var16); // L: 68
					var18 = var7 + var23.field4441; // L: 69
					int var19 = var2.charWidth(var23.field4438); // L: 70
					int var20 = var8 + var23.field4440 - var3; // L: 71
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5141); // L: 72
				}
			}

			if (!var21.method7531()) { // L: 75
				var2.method7432(var21, var7, var8, this.field5140, this.field5147, -1); // L: 76
			}

			if (!var12.method7531()) { // L: 78
				var2.method7432(var12, var7, var8, this.field5151, this.field5147, -1); // L: 79
			}

			if (!var13.method7531()) { // L: 81
				var2.method7432(var13, var7, var8, this.field5140, this.field5147, -1); // L: 82
			}

			if (this.field5148) { // L: 84
				class473 var22 = var14.method7541(); // L: 85
				var16 = var7 + (Integer)var22.field4903; // L: 86
				int var17 = var8 + (Integer)var22.field4904; // L: 87
				var18 = var17 - var4; // L: 88
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5140); // L: 89
				if (this.field5147 != -1) { // L: 90
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5147); // L: 91
				}
			}

		}
	} // L: 94
}
