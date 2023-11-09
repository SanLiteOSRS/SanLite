import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
public class class480 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2023135889
	)
	int field4986;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 459487259
	)
	int field4987;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1019277499
	)
	int field4997;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1525421915
	)
	int field4989;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -195568033
	)
	int field4985;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 856154769
	)
	int field4996;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1833236829
	)
	int field4992;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1195309361
	)
	int field4993;
	@ObfuscatedName("r")
	boolean field4990;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -630143305
	)
	int field4995;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -534048577
	)
	int field4988;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1995385909
	)
	int field4994;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 20632691
	)
	int field4998;

	public class480() {
		this.field4992 = 0; // L: 18
		this.field4993 = 0; // L: 19
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIZI)V",
		garbageValue = "204682544"
	)
	public void method8980(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11) {
		this.field4986 = var1; // L: 27
		this.field4987 = var2; // L: 28
		this.field4997 = var3; // L: 29
		this.field4989 = var4; // L: 30
		this.field4985 = var5; // L: 31
		this.field4996 = var6; // L: 32
		this.field4992 = var9; // L: 33
		this.field4993 = var10; // L: 34
		this.field4990 = var11; // L: 35
	} // L: 36

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "319504055"
	)
	public void method8981(int var1, int var2, int var3, int var4) {
		this.field4995 = var1; // L: 39
		this.field4988 = var2; // L: 40
		this.field4994 = var3; // L: 41
		this.field4998 = var4; // L: 42
	} // L: 43

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnz;Lnl;I)V",
		garbageValue = "2063892125"
	)
	public void method8979(class365 var1, Font var2) {
		if (var2 != null) { // L: 46
			int var3 = var2.ascent; // L: 47
			int var4 = Math.min(this.field4989, (int)((float)var3 * 0.9F)); // L: 48
			int var5 = this.field4986 - this.field4985; // L: 49
			int var6 = var3 + (this.field4987 - this.field4996); // L: 50
			Rasterizer2D.Rasterizer2D_setClip(this.field4986, this.field4987, this.field4986 + this.field4997, this.field4989 + this.field4987); // L: 51
			int var7 = this.field4993; // L: 52
			int var8 = this.field4992; // L: 53
			if (var7 > var8) { // L: 54
				int var9 = var7; // L: 55
				var7 = var8; // L: 56
				var8 = var9; // L: 57
			}

			class369 var19 = var1.method6891(0, var7); // L: 59
			class369 var10 = var1.method6891(var7, var8); // L: 60
			class369 var11 = var1.method6891(var8, var1.method6943()); // L: 61
			class369 var12 = var1.method6891(0, this.field4992); // L: 62
			int var14;
			int var16;
			if (!var10.method7097()) { // L: 63
				int var13 = var2.maxAscent + var2.maxDescent; // L: 64

				for (var14 = 0; var14 < var10.method7098(); ++var14) { // L: 65
					class367 var21 = var10.method7114(var14); // L: 66
					var16 = var5 + var21.field4341; // L: 67
					int var17 = var2.charWidth(var21.field4347); // L: 68
					int var18 = var6 + var21.field4343 - var3; // L: 69
					Rasterizer2D.Rasterizer2D_fillRectangle(var16, var18, var17, var13, this.field4998); // L: 70
				}
			}

			if (!var19.method7097()) { // L: 73
				var2.method7007(var19, var5, var6, this.field4995, this.field4988, -1); // L: 74
			}

			if (!var10.method7097()) { // L: 76
				var2.method7007(var10, var5, var6, this.field4994, this.field4988, -1); // L: 77
			}

			if (!var11.method7097()) { // L: 79
				var2.method7007(var11, var5, var6, this.field4995, this.field4988, -1); // L: 80
			}

			if (this.field4990) { // L: 82
				class437 var20 = var12.method7101(); // L: 83
				var14 = var5 + (Integer)var20.field4764; // L: 84
				int var15 = var6 + (Integer)var20.field4765; // L: 85
				var16 = var15 - var4; // L: 86
				Rasterizer2D.Rasterizer2D_drawLine(var14, var15, var14, var16, this.field4995); // L: 87
				if (this.field4988 != -1) { // L: 88
					Rasterizer2D.Rasterizer2D_drawLine(var14 + 1, var15 + 1, var14 + 1, var16 + 1, this.field4988); // L: 89
				}
			}

		}
	} // L: 92
}
