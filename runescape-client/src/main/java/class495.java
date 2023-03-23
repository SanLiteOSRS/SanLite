import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tl")
public class class495 {
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = 1361227103
	)
	static int field5036;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2069391415
	)
	int field5023;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1674937461
	)
	int field5024;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -544898867
	)
	int field5025;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 60223199
	)
	int field5026;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1880572091
	)
	int field5035;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1400577347
	)
	int field5029;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 159467181
	)
	int field5027;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -893539005
	)
	int field5030;
	@ObfuscatedName("ar")
	boolean field5031;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1512490637
	)
	int field5022;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 237262701
	)
	int field5028;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1953491027
	)
	int field5034;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1021787325
	)
	int field5032;

	public class495() {
		this.field5027 = 0; // L: 18
		this.field5030 = 0; // L: 19
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "-1262493748"
	)
	public void method9209(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5023 = var1; // L: 27
		this.field5024 = var2; // L: 28
		this.field5025 = var3; // L: 29
		this.field5026 = var4; // L: 30
		this.field5035 = var5; // L: 31
		this.field5029 = var6; // L: 32
		this.field5027 = var7; // L: 33
		this.field5030 = var8; // L: 34
		this.field5031 = var9; // L: 35
	} // L: 36

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1697791116"
	)
	public void method9203(int var1, int var2, int var3, int var4) {
		this.field5022 = var1; // L: 39
		this.field5028 = var2; // L: 40
		this.field5034 = var3; // L: 41
		this.field5032 = var4; // L: 42
	} // L: 43

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Low;Loe;I)V",
		garbageValue = "1245058623"
	)
	public void method9204(class375 var1, Font var2) {
		if (var2 != null) { // L: 46
			int var3 = var2.ascent; // L: 47
			int var4 = Math.min(this.field5026, (int)((float)var3 * 0.9F)); // L: 48
			int var5 = var1.method7069(this.field5025); // L: 49
			int var6 = var1.method7033(this.field5026); // L: 50
			int var7 = var5 + (this.field5023 - this.field5035); // L: 51
			int var8 = var3 + var6 + (this.field5024 - this.field5029); // L: 52
			Rasterizer2D.Rasterizer2D_setClip(this.field5023, this.field5024, this.field5025 + this.field5023, this.field5026 + this.field5024); // L: 53
			int var9 = this.field5030; // L: 54
			int var10 = this.field5027; // L: 55
			if (var9 > var10) { // L: 56
				int var11 = var9; // L: 57
				var9 = var10; // L: 58
				var10 = var11; // L: 59
			}

			class379 var21 = var1.method7007(0, var9); // L: 61
			class379 var12 = var1.method7007(var9, var10); // L: 62
			class379 var13 = var1.method7007(var10, var1.method6998()); // L: 63
			class379 var14 = var1.method7007(0, this.field5027); // L: 64
			int var16;
			int var18;
			if (!var12.method7246()) { // L: 65
				int var15 = var2.maxDescent + var2.maxAscent; // L: 66

				for (var16 = 0; var16 < var12.method7247(); ++var16) { // L: 67
					class377 var23 = var12.method7251(var16); // L: 68
					var18 = var7 + var23.field4379; // L: 69
					int var19 = var2.charWidth(var23.field4380); // L: 70
					int var20 = var8 + var23.field4378 - var3; // L: 71
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5032); // L: 72
				}
			}

			if (!var21.method7246()) { // L: 75
				var2.method7155(var21, var7, var8, this.field5022, this.field5028, -1); // L: 76
			}

			if (!var12.method7246()) { // L: 78
				var2.method7155(var12, var7, var8, this.field5034, this.field5028, -1); // L: 79
			}

			if (!var13.method7246()) { // L: 81
				var2.method7155(var13, var7, var8, this.field5022, this.field5028, -1); // L: 82
			}

			if (this.field5031) { // L: 84
				class451 var22 = var14.method7268(); // L: 85
				var16 = var7 + (Integer)var22.field4798; // L: 86
				int var17 = var8 + (Integer)var22.field4799; // L: 87
				var18 = var17 - var4; // L: 88
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5022); // L: 89
				if (this.field5028 != -1) { // L: 90
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5028); // L: 91
				}
			}

		}
	} // L: 94
}
