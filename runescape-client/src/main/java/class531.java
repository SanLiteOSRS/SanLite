import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("um")
public class class531 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -997455741
	)
	int field5197;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 597211021
	)
	int field5202;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1090312765
	)
	int field5193;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -65935437
	)
	int field5192;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -18103323
	)
	int field5201;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1366894113
	)
	int field5196;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1108900903
	)
	int field5198;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -99099019
	)
	int field5199;
	@ObfuscatedName("ap")
	boolean field5200;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 447786457
	)
	int field5194;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 604972151
	)
	int field5191;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1544407821
	)
	int field5203;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -226431901
	)
	int field5204;

	public class531() {
		this.field5198 = 0; // L: 18
		this.field5199 = 0; // L: 19
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "-1361284824"
	)
	public void method9715(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5197 = var1; // L: 27
		this.field5202 = var2; // L: 28
		this.field5193 = var3; // L: 29
		this.field5192 = var4; // L: 30
		this.field5201 = var5; // L: 31
		this.field5196 = var6; // L: 32
		this.field5198 = var7; // L: 33
		this.field5199 = var8; // L: 34
		this.field5200 = var9; // L: 35
	} // L: 36

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1931379058"
	)
	public void method9722(int var1, int var2, int var3, int var4) {
		this.field5194 = var1; // L: 39
		this.field5191 = var2; // L: 40
		this.field5203 = var3; // L: 41
		this.field5204 = var4; // L: 42
	} // L: 43

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lpt;Lpc;I)V",
		garbageValue = "-1345335842"
	)
	public void method9713(class395 var1, Font var2) {
		if (var2 != null) { // L: 46
			int var3 = var2.ascent; // L: 47
			int var4 = Math.min(this.field5192, (int)((float)var3 * 0.9F)); // L: 48
			int var5 = var1.method7344(this.field5193); // L: 49
			int var6 = var1.method7345(this.field5192); // L: 50
			int var7 = var5 + (this.field5197 - this.field5201); // L: 51
			int var8 = var3 + var6 + (this.field5202 - this.field5196); // L: 52
			Rasterizer2D.Rasterizer2D_setClip(this.field5197, this.field5202, this.field5197 + this.field5193, this.field5202 + this.field5192); // L: 53
			int var9 = this.field5199; // L: 54
			int var10 = this.field5198; // L: 55
			if (var9 > var10) { // L: 56
				int var11 = var9; // L: 57
				var9 = var10; // L: 58
				var10 = var11; // L: 59
			}

			class399 var21 = var1.method7422(0, var9); // L: 61
			class399 var12 = var1.method7422(var9, var10); // L: 62
			class399 var13 = var1.method7422(var10, var1.method7316()); // L: 63
			class399 var14 = var1.method7422(0, this.field5198); // L: 64
			int var16;
			int var18;
			if (!var12.method7584()) { // L: 65
				int var15 = var2.maxAscent + var2.maxDescent; // L: 66

				for (var16 = 0; var16 < var12.method7585(); ++var16) { // L: 67
					class397 var23 = var12.method7589(var16); // L: 68
					var18 = var7 + var23.field4479; // L: 69
					int var19 = var2.charWidth(var23.field4480); // L: 70
					int var20 = var8 + var23.field4481 - var3; // L: 71
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5204); // L: 72
				}
			}

			if (!var21.method7584()) { // L: 75
				var2.method7505(var21, var7, var8, this.field5194, this.field5191, -1); // L: 76
			}

			if (!var12.method7584()) { // L: 78
				var2.method7505(var12, var7, var8, this.field5203, this.field5191, -1); // L: 79
			}

			if (!var13.method7584()) { // L: 81
				var2.method7505(var13, var7, var8, this.field5194, this.field5191, -1); // L: 82
			}

			if (this.field5200) { // L: 84
				class486 var22 = var14.method7588(); // L: 85
				var16 = var7 + (Integer)var22.field4964; // L: 86
				int var17 = var8 + (Integer)var22.field4962; // L: 87
				var18 = var17 - var4; // L: 88
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5194); // L: 89
				if (this.field5191 != -1) { // L: 90
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5191); // L: 91
				}
			}

		}
	} // L: 94
}
