import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ua")
public class class530 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -496634349
	)
	int field5192;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -418165975
	)
	int field5191;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -319500887
	)
	int field5202;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 599142183
	)
	int field5189;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1588777669
	)
	int field5194;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 214170893
	)
	int field5195;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 817135365
	)
	int field5193;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1331920221
	)
	int field5197;
	@ObfuscatedName("az")
	boolean field5198;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2038800043
	)
	int field5199;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 477434313
	)
	int field5200;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1130365237
	)
	int field5201;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2122362447
	)
	int field5190;

	public class530() {
		this.field5193 = 0; // L: 18
		this.field5197 = 0; // L: 19
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "1040105663"
	)
	public void method9677(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5192 = var1; // L: 27
		this.field5191 = var2; // L: 28
		this.field5202 = var3; // L: 29
		this.field5189 = var4; // L: 30
		this.field5194 = var5; // L: 31
		this.field5195 = var6; // L: 32
		this.field5193 = var7; // L: 33
		this.field5197 = var8; // L: 34
		this.field5198 = var9; // L: 35
	} // L: 36

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1040739942"
	)
	public void method9679(int var1, int var2, int var3, int var4) {
		this.field5199 = var1; // L: 39
		this.field5200 = var2; // L: 40
		this.field5201 = var3; // L: 41
		this.field5190 = var4; // L: 42
	} // L: 43

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpz;Lpj;B)V",
		garbageValue = "1"
	)
	public void method9680(class394 var1, Font var2) {
		if (var2 != null) { // L: 46
			int var3 = var2.ascent; // L: 47
			int var4 = Math.min(this.field5189, (int)((float)var3 * 0.9F)); // L: 48
			int var5 = var1.method7421(this.field5202); // L: 49
			int var6 = var1.method7370(this.field5189); // L: 50
			int var7 = var5 + (this.field5192 - this.field5194); // L: 51
			int var8 = var3 + var6 + (this.field5191 - this.field5195); // L: 52
			Rasterizer2D.Rasterizer2D_setClip(this.field5192, this.field5191, this.field5202 + this.field5192, this.field5189 + this.field5191); // L: 53
			int var9 = this.field5197; // L: 54
			int var10 = this.field5193; // L: 55
			if (var9 > var10) { // L: 56
				int var11 = var9; // L: 57
				var9 = var10; // L: 58
				var10 = var11; // L: 59
			}

			class398 var21 = var1.method7350(0, var9); // L: 61
			class398 var12 = var1.method7350(var9, var10); // L: 62
			class398 var13 = var1.method7350(var10, var1.method7341()); // L: 63
			class398 var14 = var1.method7350(0, this.field5193); // L: 64
			int var16;
			int var18;
			if (!var12.method7584()) { // L: 65
				int var15 = var2.maxAscent + var2.maxDescent; // L: 66

				for (var16 = 0; var16 < var12.method7583(); ++var16) { // L: 67
					class396 var23 = var12.method7586(var16); // L: 68
					var18 = var7 + var23.field4464; // L: 69
					int var19 = var2.charWidth(var23.field4465); // L: 70
					int var20 = var8 + var23.field4463 - var3; // L: 71
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5190); // L: 72
				}
			}

			if (!var21.method7584()) { // L: 75
				var2.method7486(var21, var7, var8, this.field5199, this.field5200, -1); // L: 76
			}

			if (!var12.method7584()) { // L: 78
				var2.method7486(var12, var7, var8, this.field5201, this.field5200, -1); // L: 79
			}

			if (!var13.method7584()) { // L: 81
				var2.method7486(var13, var7, var8, this.field5199, this.field5200, -1); // L: 82
			}

			if (this.field5198) { // L: 84
				class485 var22 = var14.method7585(); // L: 85
				var16 = var7 + (Integer)var22.field4964; // L: 86
				int var17 = var8 + (Integer)var22.field4962; // L: 87
				var18 = var17 - var4; // L: 88
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5199); // L: 89
				if (this.field5200 != -1) { // L: 90
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5200); // L: 91
				}
			}

		}
	} // L: 94
}
