import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rj")
public class class491 {
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "[Lrs;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static class458 HitSplatDefinition_cachedSprites;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -42963947
	)
	int field5068;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1689191285
	)
	int field5056;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 180812541
	)
	int field5058;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -584953017
	)
	int field5065;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 181291809
	)
	int field5059;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -556891651
	)
	int field5061;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1072514907
	)
	int field5057;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1491874313
	)
	int field5063;
	@ObfuscatedName("k")
	boolean field5064;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2139830753
	)
	int field5060;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -940735735
	)
	int field5066;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -583765577
	)
	int field5067;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -529230503
	)
	int field5062;

	public class491() {
		this.field5057 = 0; // L: 18
		this.field5063 = 0; // L: 19
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIZB)V",
		garbageValue = "86"
	)
	public void method9237(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11) {
		this.field5068 = var1; // L: 27
		this.field5056 = var2; // L: 28
		this.field5058 = var3; // L: 29
		this.field5065 = var4; // L: 30
		this.field5059 = var5; // L: 31
		this.field5061 = var6; // L: 32
		this.field5057 = var9; // L: 33
		this.field5063 = var10; // L: 34
		this.field5064 = var11; // L: 35
	} // L: 36

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-169216674"
	)
	public void method9232(int var1, int var2, int var3, int var4) {
		this.field5060 = var1; // L: 39
		this.field5066 = var2; // L: 40
		this.field5067 = var3; // L: 41
		this.field5062 = var4; // L: 42
	} // L: 43

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnp;Lnv;I)V",
		garbageValue = "887975010"
	)
	public void method9236(class372 var1, Font var2) {
		if (var2 != null) { // L: 46
			int var3 = var2.ascent; // L: 47
			int var4 = Math.min(this.field5065, (int)(0.9F * (float)var3)); // L: 48
			int var5 = this.field5068 - this.field5059; // L: 49
			int var6 = var3 + (this.field5056 - this.field5061); // L: 50
			Rasterizer2D.Rasterizer2D_setClip(this.field5068, this.field5056, this.field5058 + this.field5068, this.field5065 + this.field5056); // L: 51
			int var7 = this.field5063; // L: 52
			int var8 = this.field5057; // L: 53
			if (var7 > var8) { // L: 54
				int var9 = var7; // L: 55
				var7 = var8; // L: 56
				var8 = var9; // L: 57
			}

			class376 var19 = var1.method7140(0, var7); // L: 59
			class376 var10 = var1.method7140(var7, var8); // L: 60
			class376 var11 = var1.method7140(var8, var1.method7173()); // L: 61
			class376 var12 = var1.method7140(0, this.field5057); // L: 62
			int var14;
			int var16;
			if (!var10.method7297()) { // L: 63
				int var13 = var2.maxDescent + var2.maxAscent; // L: 64

				for (var14 = 0; var14 < var10.method7300(); ++var14) { // L: 65
					class374 var21 = var10.method7304(var14); // L: 66
					var16 = var5 + var21.field4408; // L: 67
					int var17 = var2.charWidth(var21.field4411); // L: 68
					int var18 = var6 + var21.field4410 - var3; // L: 69
					Rasterizer2D.Rasterizer2D_fillRectangle(var16, var18, var17, var13, this.field5062); // L: 70
				}
			}

			if (!var19.method7297()) { // L: 73
				var2.method7205(var19, var5, var6, this.field5060, this.field5066, -1); // L: 74
			}

			if (!var10.method7297()) { // L: 76
				var2.method7205(var10, var5, var6, this.field5067, this.field5066, -1); // L: 77
			}

			if (!var11.method7297()) { // L: 79
				var2.method7205(var11, var5, var6, this.field5060, this.field5066, -1); // L: 80
			}

			if (this.field5064) { // L: 82
				class447 var20 = var12.method7303(); // L: 83
				var14 = var5 + (Integer)var20.field4832; // L: 84
				int var15 = var6 + (Integer)var20.field4833; // L: 85
				var16 = var15 - var4; // L: 86
				Rasterizer2D.Rasterizer2D_drawLine(var14, var15, var14, var16, this.field5060); // L: 87
				if (this.field5066 != -1) { // L: 88
					Rasterizer2D.Rasterizer2D_drawLine(var14 + 1, var15 + 1, var14 + 1, var16 + 1, this.field5066); // L: 89
				}
			}

		}
	} // L: 92
}
