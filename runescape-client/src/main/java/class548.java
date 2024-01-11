import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vv")
public class class548 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1328503803
	)
	int field5304;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2119627241
	)
	int field5302;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1255610115
	)
	int field5303;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1034802355
	)
	int field5309;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1795992977
	)
	int field5313;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1943933507
	)
	int field5306;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 768422423
	)
	int field5301;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -48582359
	)
	int field5308;
	@ObfuscatedName("aa")
	boolean field5305;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 398818373
	)
	int field5310;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 200315381
	)
	int field5311;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1713010181
	)
	int field5312;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2130024127
	)
	int field5300;

	public class548() {
		this.field5301 = 0; // L: 18
		this.field5308 = 0; // L: 19
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "-1391771731"
	)
	public void method9979(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5304 = var1; // L: 27
		this.field5302 = var2; // L: 28
		this.field5303 = var3; // L: 29
		this.field5309 = var4; // L: 30
		this.field5313 = var5; // L: 31
		this.field5306 = var6; // L: 32
		this.field5301 = var7; // L: 33
		this.field5308 = var8; // L: 34
		this.field5305 = var9; // L: 35
	} // L: 36

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "76"
	)
	public void method9978(int var1, int var2, int var3, int var4) {
		this.field5310 = var1; // L: 39
		this.field5311 = var2; // L: 40
		this.field5312 = var3; // L: 41
		this.field5300 = var4; // L: 42
	} // L: 43

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpv;B)V",
		garbageValue = "123"
	)
	public void method9981(class410 var1, Font var2) {
		if (var2 != null) { // L: 46
			int var3 = var2.ascent; // L: 47
			int var4 = Math.min(this.field5309, (int)((float)var3 * 0.9F)); // L: 48
			int var5 = var1.method7623(this.field5303); // L: 49
			int var6 = var1.method7636(this.field5309); // L: 50
			int var7 = var5 + (this.field5304 - this.field5313); // L: 51
			int var8 = var6 + var3 + (this.field5302 - this.field5306); // L: 52
			Rasterizer2D.Rasterizer2D_setClip(this.field5304, this.field5302, this.field5304 + this.field5303, this.field5302 + this.field5309); // L: 53
			int var9 = this.field5308; // L: 54
			int var10 = this.field5301; // L: 55
			if (var9 > var10) { // L: 56
				int var11 = var9; // L: 57
				var9 = var10; // L: 58
				var10 = var11; // L: 59
			}

			class414 var21 = var1.method7616(0, var9); // L: 61
			class414 var12 = var1.method7616(var9, var10); // L: 62
			class414 var13 = var1.method7616(var10, var1.method7701()); // L: 63
			class414 var14 = var1.method7616(0, this.field5301); // L: 64
			int var16;
			int var18;
			if (!var12.method7882()) { // L: 65
				int var15 = var2.maxDescent + var2.maxAscent; // L: 66

				for (var16 = 0; var16 < var12.method7895(); ++var16) { // L: 67
					class412 var23 = var12.method7902(var16); // L: 68
					var18 = var7 + var23.field4544; // L: 69
					int var19 = var2.charWidth(var23.field4545); // L: 70
					int var20 = var8 + var23.field4546 - var3; // L: 71
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5300); // L: 72
				}
			}

			if (!var21.method7882()) { // L: 75
				var2.method7768(var21, var7, var8, this.field5310, this.field5311, -1); // L: 76
			}

			if (!var12.method7882()) { // L: 78
				var2.method7768(var12, var7, var8, this.field5312, this.field5311, -1); // L: 79
			}

			if (!var13.method7882()) { // L: 81
				var2.method7768(var13, var7, var8, this.field5310, this.field5311, -1); // L: 82
			}

			if (this.field5305) { // L: 84
				class501 var22 = var14.method7886(); // L: 85
				var16 = var7 + (Integer)var22.field5041; // L: 86
				int var17 = var8 + (Integer)var22.field5042; // L: 87
				var18 = var17 - var4; // L: 88
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5310); // L: 89
				if (this.field5311 != -1) { // L: 90
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5311); // L: 91
				}
			}

		}
	} // L: 94
}
