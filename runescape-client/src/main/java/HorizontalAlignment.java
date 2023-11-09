import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements class371 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	field1996(0, 0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(1, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	field1997(2, 2);

	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1025336699
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 30873773
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 18
		this.id = var4; // L: 19
	} // L: 20

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1233989967"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 24
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-33"
	)
	static void method3807() {
		if (IgnoreList.field4609 == null) { // L: 73
			IgnoreList.field4609 = new int[65536]; // L: 74
			double var0 = 0.949999988079071D; // L: 75

			for (int var2 = 0; var2 < 65536; ++var2) { // L: 76
				double var3 = (double)(var2 >> 10 & 63) / 64.0D + 0.0078125D; // L: 77
				double var5 = (double)(var2 >> 7 & 7) / 8.0D + 0.0625D; // L: 78
				double var7 = (double)(var2 & 127) / 128.0D; // L: 79
				double var9 = var7; // L: 80
				double var11 = var7; // L: 81
				double var13 = var7; // L: 82
				if (var5 != 0.0D) { // L: 83
					double var15;
					if (var7 < 0.5D) { // L: 85
						var15 = var7 * (1.0D + var5);
					} else {
						var15 = var5 + var7 - var7 * var5; // L: 86
					}

					double var17 = 2.0D * var7 - var15; // L: 87
					double var19 = var3 + 0.3333333333333333D; // L: 88
					if (var19 > 1.0D) { // L: 89
						--var19;
					}

					double var23 = var3 - 0.3333333333333333D; // L: 91
					if (var23 < 0.0D) { // L: 92
						++var23;
					}

					if (var19 * 6.0D < 1.0D) { // L: 93
						var9 = var17 + 6.0D * (var15 - var17) * var19;
					} else if (2.0D * var19 < 1.0D) { // L: 94
						var9 = var15;
					} else if (3.0D * var19 < 2.0D) { // L: 95
						var9 = (var15 - var17) * (0.6666666666666666D - var19) * 6.0D + var17;
					} else {
						var9 = var17; // L: 96
					}

					if (6.0D * var3 < 1.0D) { // L: 97
						var11 = var17 + var3 * (var15 - var17) * 6.0D;
					} else if (2.0D * var3 < 1.0D) { // L: 98
						var11 = var15;
					} else if (3.0D * var3 < 2.0D) { // L: 99
						var11 = var17 + 6.0D * (var15 - var17) * (0.6666666666666666D - var3);
					} else {
						var11 = var17; // L: 100
					}

					if (var23 * 6.0D < 1.0D) { // L: 101
						var13 = var17 + 6.0D * (var15 - var17) * var23;
					} else if (2.0D * var23 < 1.0D) { // L: 102
						var13 = var15;
					} else if (3.0D * var23 < 2.0D) { // L: 103
						var13 = var17 + 6.0D * (var15 - var17) * (0.6666666666666666D - var23);
					} else {
						var13 = var17; // L: 104
					}
				}

				var9 = Math.pow(var9, var0); // L: 106
				var11 = Math.pow(var11, var0); // L: 107
				var13 = Math.pow(var13, var0); // L: 108
				int var25 = (int)(var9 * 256.0D); // L: 109
				int var16 = (int)(var11 * 256.0D); // L: 110
				int var26 = (int)(var13 * 256.0D); // L: 111
				int var18 = var26 + (var16 << 8) + (var25 << 16); // L: 112
				IgnoreList.field4609[var2] = var18 & 16777215; // L: 113
			}

		}
	} // L: 115

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "9"
	)
	static final int method3806(int var0, int var1) {
		int var2 = ApproximateRouteStrategy.method1230(var0 + 45365, 91923 + var1, 4) - 128 + (ApproximateRouteStrategy.method1230(var0 + 10294, 37821 + var1, 2) - 128 >> 1) + (ApproximateRouteStrategy.method1230(var0, var1, 1) - 128 >> 2); // L: 891
		var2 = (int)((double)var2 * 0.3D) + 35; // L: 892
		if (var2 < 10) { // L: 893
			var2 = 10;
		} else if (var2 > 60) { // L: 894
			var2 = 60;
		}

		return var2; // L: 895
	}
}
