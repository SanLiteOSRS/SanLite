import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tp")
public class class518 {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1385058011
	)
	int field5140;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1143828017
	)
	int field5152;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -929566641
	)
	int field5142;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -748501875
	)
	int field5144;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 144336047
	)
	int field5139;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1260451615
	)
	int field5145;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1913074375
	)
	int field5146;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 862556277
	)
	int field5143;
	@ObfuscatedName("ag")
	boolean field5147;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 68309817
	)
	int field5149;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1170749057
	)
	int field5150;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1760639873
	)
	int field5151;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -50868951
	)
	int field5148;

	public class518() {
		this.field5146 = 0; // L: 18
		this.field5143 = 0; // L: 19
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "1698290331"
	)
	public void method9580(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5140 = var1; // L: 27
		this.field5152 = var2; // L: 28
		this.field5142 = var3; // L: 29
		this.field5144 = var4; // L: 30
		this.field5139 = var5; // L: 31
		this.field5145 = var6; // L: 32
		this.field5146 = var7; // L: 33
		this.field5143 = var8; // L: 34
		this.field5147 = var9; // L: 35
	} // L: 36

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "-2227"
	)
	public void method9577(int var1, int var2, int var3, int var4) {
		this.field5149 = var1; // L: 39
		this.field5150 = var2; // L: 40
		this.field5151 = var3; // L: 41
		this.field5148 = var4; // L: 42
	} // L: 43

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lpf;Lpa;I)V",
		garbageValue = "1611064575"
	)
	public void method9578(class392 var1, Font var2) {
		if (var2 != null) { // L: 46
			int var3 = var2.ascent; // L: 47
			int var4 = Math.min(this.field5144, (int)((float)var3 * 0.9F)); // L: 48
			int var5 = var1.method7336(this.field5142); // L: 49
			int var6 = var1.method7285(this.field5144); // L: 50
			int var7 = var5 + (this.field5140 - this.field5139); // L: 51
			int var8 = var3 + var6 + (this.field5152 - this.field5145); // L: 52
			Rasterizer2D.Rasterizer2D_setClip(this.field5140, this.field5152, this.field5140 + this.field5142, this.field5152 + this.field5144); // L: 53
			int var9 = this.field5143; // L: 54
			int var10 = this.field5146; // L: 55
			if (var9 > var10) { // L: 56
				int var11 = var9; // L: 57
				var9 = var10; // L: 58
				var10 = var11; // L: 59
			}

			class396 var21 = var1.method7265(0, var9); // L: 61
			class396 var12 = var1.method7265(var9, var10); // L: 62
			class396 var13 = var1.method7265(var10, var1.method7256()); // L: 63
			class396 var14 = var1.method7265(0, this.field5146); // L: 64
			int var16;
			int var18;
			if (!var12.method7516()) { // L: 65
				int var15 = var2.maxAscent + var2.maxDescent; // L: 66

				for (var16 = 0; var16 < var12.method7526(); ++var16) { // L: 67
					class394 var23 = var12.method7528(var16); // L: 68
					var18 = var7 + var23.field4451; // L: 69
					int var19 = var2.charWidth(var23.field4454); // L: 70
					int var20 = var8 + var23.field4455 - var3; // L: 71
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5148); // L: 72
				}
			}

			if (!var21.method7516()) { // L: 75
				var2.method7412(var21, var7, var8, this.field5149, this.field5150, -1); // L: 76
			}

			if (!var12.method7516()) { // L: 78
				var2.method7412(var12, var7, var8, this.field5151, this.field5150, -1); // L: 79
			}

			if (!var13.method7516()) { // L: 81
				var2.method7412(var13, var7, var8, this.field5149, this.field5150, -1); // L: 82
			}

			if (this.field5147) { // L: 84
				class473 var22 = var14.method7512(); // L: 85
				var16 = var7 + (Integer)var22.field4909; // L: 86
				int var17 = var8 + (Integer)var22.field4908; // L: 87
				var18 = var17 - var4; // L: 88
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5149); // L: 89
				if (this.field5150 != -1) { // L: 90
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5150); // L: 91
				}
			}

		}
	} // L: 94
}
