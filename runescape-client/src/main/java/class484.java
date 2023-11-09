import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rd")
public class class484 {
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -544764579
	)
	int field5035;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 407056329
	)
	int field5043;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 718401383
	)
	int field5036;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1169119765
	)
	int field5037;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1800251423
	)
	int field5033;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2136683631
	)
	int field5040;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1280823113
	)
	int field5042;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1066251557
	)
	int field5039;
	@ObfuscatedName("b")
	boolean field5034;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -491304047
	)
	int field5038;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -888747591
	)
	int field5044;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1604343367
	)
	int field5045;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 587876815
	)
	int field5046;

	public class484() {
		this.field5042 = 0; // L: 18
		this.field5039 = 0; // L: 19
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIZI)V",
		garbageValue = "1188082077"
	)
	public void method9152(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11) {
		this.field5035 = var1; // L: 27
		this.field5043 = var2; // L: 28
		this.field5036 = var3; // L: 29
		this.field5037 = var4; // L: 30
		this.field5033 = var5; // L: 31
		this.field5040 = var6; // L: 32
		this.field5042 = var9; // L: 33
		this.field5039 = var10; // L: 34
		this.field5034 = var11; // L: 35
	} // L: 36

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-990498874"
	)
	public void method9144(int var1, int var2, int var3, int var4) {
		this.field5038 = var1; // L: 39
		this.field5044 = var2; // L: 40
		this.field5045 = var3; // L: 41
		this.field5046 = var4; // L: 42
	} // L: 43

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Lnv;B)V",
		garbageValue = "-5"
	)
	public void method9143(class368 var1, Font var2) {
		if (var2 != null) { // L: 46
			int var3 = var2.ascent; // L: 47
			int var4 = Math.min(this.field5037, (int)(0.9F * (float)var3)); // L: 48
			int var5 = this.field5035 - this.field5033; // L: 49
			int var6 = var3 + (this.field5043 - this.field5040); // L: 50
			Rasterizer2D.Rasterizer2D_setClip(this.field5035, this.field5043, this.field5036 + this.field5035, this.field5043 + this.field5037); // L: 51
			int var7 = this.field5039; // L: 52
			int var8 = this.field5042; // L: 53
			if (var7 > var8) { // L: 54
				int var9 = var7; // L: 55
				var7 = var8; // L: 56
				var8 = var9; // L: 57
			}

			class372 var19 = var1.method7092(0, var7); // L: 59
			class372 var10 = var1.method7092(var7, var8); // L: 60
			class372 var11 = var1.method7092(var8, var1.method7041()); // L: 61
			class372 var12 = var1.method7092(0, this.field5042); // L: 62
			int var14;
			int var16;
			if (!var10.method7251()) { // L: 63
				int var13 = var2.maxDescent + var2.maxAscent; // L: 64

				for (var14 = 0; var14 < var10.method7269(); ++var14) { // L: 65
					class370 var21 = var10.method7256(var14); // L: 66
					var16 = var5 + var21.field4398; // L: 67
					int var17 = var2.charWidth(var21.field4395); // L: 68
					int var18 = var6 + var21.field4397 - var3; // L: 69
					Rasterizer2D.Rasterizer2D_fillRectangle(var16, var18, var17, var13, this.field5046); // L: 70
				}
			}

			if (!var19.method7251()) { // L: 73
				var2.method7166(var19, var5, var6, this.field5038, this.field5044, -1); // L: 74
			}

			if (!var10.method7251()) { // L: 76
				var2.method7166(var10, var5, var6, this.field5045, this.field5044, -1); // L: 77
			}

			if (!var11.method7251()) { // L: 79
				var2.method7166(var11, var5, var6, this.field5038, this.field5044, -1); // L: 80
			}

			if (this.field5034) { // L: 82
				class440 var20 = var12.method7255(); // L: 83
				var14 = var5 + (Integer)var20.field4811; // L: 84
				int var15 = var6 + (Integer)var20.field4809; // L: 85
				var16 = var15 - var4; // L: 86
				Rasterizer2D.Rasterizer2D_drawLine(var14, var15, var14, var16, this.field5038); // L: 87
				if (this.field5044 != -1) { // L: 88
					Rasterizer2D.Rasterizer2D_drawLine(var14 + 1, var15 + 1, var14 + 1, var16 + 1, this.field5044); // L: 89
				}
			}

		}
	} // L: 92
}
