import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vv")
public class class552 {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1732648451
	)
	int field5358;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 157066741
	)
	int field5359;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 986573419
	)
	int field5360;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 546767775
	)
	int field5366;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -997731419
	)
	int field5365;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -963426569
	)
	int field5357;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1937689463
	)
	int field5364;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2113199757
	)
	int field5370;
	@ObfuscatedName("al")
	boolean field5363;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 572467897
	)
	int field5367;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -677739811
	)
	int field5368;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 179988305
	)
	int field5369;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 162745567
	)
	int field5361;

	public class552() {
		this.field5364 = 0; // L: 18
		this.field5370 = 0; // L: 19
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "1748951487"
	)
	public void method9871(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5358 = var1; // L: 27
		this.field5359 = var2; // L: 28
		this.field5360 = var3; // L: 29
		this.field5366 = var4; // L: 30
		this.field5365 = var5; // L: 31
		this.field5357 = var6; // L: 32
		this.field5364 = var7; // L: 33
		this.field5370 = var8; // L: 34
		this.field5363 = var9; // L: 35
	} // L: 36

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "84"
	)
	public void method9872(int var1, int var2, int var3, int var4) {
		this.field5367 = var1; // L: 39
		this.field5368 = var2; // L: 40
		this.field5369 = var3; // L: 41
		this.field5361 = var4; // L: 42
	} // L: 43

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpl;Lpx;I)V",
		garbageValue = "84496727"
	)
	public void method9873(class414 var1, Font var2) {
		if (var2 != null) { // L: 46
			int var3 = var2.ascent; // L: 47
			int var4 = Math.min(this.field5366, (int)((float)var3 * 0.9F)); // L: 48
			int var5 = var1.method7549(this.field5360); // L: 49
			int var6 = var1.method7542(this.field5366); // L: 50
			int var7 = var5 + (this.field5358 - this.field5365); // L: 51
			int var8 = var3 + var6 + (this.field5359 - this.field5357); // L: 52
			Rasterizer2D.Rasterizer2D_setClip(this.field5358, this.field5359, this.field5358 + this.field5360, this.field5359 + this.field5366); // L: 53
			int var9 = this.field5370; // L: 54
			int var10 = this.field5364; // L: 55
			if (var9 > var10) { // L: 56
				int var11 = var9; // L: 57
				var9 = var10; // L: 58
				var10 = var11; // L: 59
			}

			class418 var21 = var1.method7522(0, var9); // L: 61
			class418 var12 = var1.method7522(var9, var10); // L: 62
			class418 var13 = var1.method7522(var10, var1.method7513()); // L: 63
			class418 var14 = var1.method7522(0, this.field5364); // L: 64
			int var16;
			int var18;
			if (!var12.method7783()) { // L: 65
				int var15 = var2.maxAscent + var2.maxDescent; // L: 66

				for (var16 = 0; var16 < var12.method7766(); ++var16) { // L: 67
					class416 var23 = var12.method7762(var16); // L: 68
					var18 = var7 + var23.field4606; // L: 69
					int var19 = var2.charWidth(var23.field4607); // L: 70
					int var20 = var8 + var23.field4605 - var3; // L: 71
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5361); // L: 72
				}
			}

			if (!var21.method7783()) { // L: 75
				var2.method7700(var21, var7, var8, this.field5367, this.field5368, -1); // L: 76
			}

			if (!var12.method7783()) { // L: 78
				var2.method7700(var12, var7, var8, this.field5369, this.field5368, -1); // L: 79
			}

			if (!var13.method7783()) { // L: 81
				var2.method7700(var13, var7, var8, this.field5367, this.field5368, -1); // L: 82
			}

			if (this.field5363) { // L: 84
				class505 var22 = var14.method7768(); // L: 85
				var16 = var7 + (Integer)var22.field5090; // L: 86
				int var17 = var8 + (Integer)var22.field5089; // L: 87
				var18 = var17 - var4; // L: 88
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5367); // L: 89
				if (this.field5368 != -1) { // L: 90
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5368); // L: 91
				}
			}

		}
	} // L: 94
}
