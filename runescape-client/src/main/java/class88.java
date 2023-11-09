import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
public enum class88 implements class352 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1083(0, -1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1077(1, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1078(2, 3),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1080(3, 4),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1081(4, 5),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1082(5, 6);

	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1067235471
	)
	final int field1079;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2135585345
	)
	final int field1084;

	class88(int var3, int var4) {
		this.field1079 = var3; // L: 21
		this.field1084 = var4; // L: 22
	} // L: 23

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1409646049"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1084; // L: 27
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lqo;FFFI)F",
		garbageValue = "-1526430028"
	)
	static float method2292(class423 var0, float var1, float var2, float var3) {
		float var4 = class102.method2665(var0.field4625, var0.field4626, var1); // L: 116
		if (Math.abs(var4) < class123.field1459) { // L: 117
			return var1;
		} else {
			float var5 = class102.method2665(var0.field4625, var0.field4626, var2); // L: 118
			if (Math.abs(var5) < class123.field1459) { // L: 119
				return var2;
			} else {
				float var6 = 0.0F; // L: 120
				float var7 = 0.0F; // L: 121
				float var8 = 0.0F; // L: 122
				float var13 = 0.0F; // L: 127
				boolean var14 = true; // L: 128
				boolean var15 = false; // L: 129

				do {
					var15 = false; // L: 131
					if (var14) { // L: 132
						var6 = var1; // L: 133
						var13 = var4; // L: 134
						var7 = var2 - var1; // L: 135
						var8 = var7; // L: 136
						var14 = false; // L: 137
					}

					if (Math.abs(var13) < Math.abs(var5)) { // L: 139
						var1 = var2; // L: 140
						var2 = var6; // L: 141
						var6 = var1; // L: 142
						var4 = var5; // L: 143
						var5 = var13; // L: 144
						var13 = var4; // L: 145
					}

					float var16 = class123.field1457 * Math.abs(var2) + 0.5F * var3; // L: 147
					float var17 = (var6 - var2) * 0.5F; // L: 148
					boolean var18 = Math.abs(var17) > var16 && 0.0F != var5; // L: 149
					if (var18) { // L: 150
						if (Math.abs(var8) >= var16 && Math.abs(var4) > Math.abs(var5)) { // L: 151
							float var12 = var5 / var4; // L: 156
							float var9;
							float var10;
							if (var1 == var6) { // L: 157
								var9 = var17 * 2.0F * var12; // L: 158
								var10 = 1.0F - var12; // L: 159
							} else {
								var10 = var4 / var13; // L: 162
								float var11 = var5 / var13; // L: 163
								var9 = (var17 * 2.0F * var10 * (var10 - var11) - (var2 - var1) * (var11 - 1.0F)) * var12; // L: 164
								var10 = (var10 - 1.0F) * (var11 - 1.0F) * (var12 - 1.0F); // L: 165
							}

							if ((double)var9 > 0.0D) { // L: 167
								var10 = -var10;
							} else {
								var9 = -var9;
							}

							var12 = var8;
							var8 = var7; // L: 170
							if (var9 * 2.0F < var10 * var17 * 3.0F - Math.abs(var16 * var10) && var9 < Math.abs(var10 * 0.5F * var12)) { // L: 171
								var7 = var9 / var10; // L: 172
							} else {
								var7 = var17; // L: 175
								var8 = var17; // L: 176
							}
						} else {
							var7 = var17; // L: 152
							var8 = var17; // L: 153
						}

						var1 = var2; // L: 179
						var4 = var5; // L: 180
						if (Math.abs(var7) > var16) { // L: 181
							var2 += var7;
						} else if ((double)var17 > 0.0D) { // L: 182
							var2 += var16;
						} else {
							var2 -= var16; // L: 183
						}

						var5 = class102.method2665(var0.field4625, var0.field4626, var2); // L: 184
						if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0D) { // L: 185
							var14 = true; // L: 186
							var15 = true; // L: 187
						} else {
							var15 = true; // L: 190
						}
					}
				} while(var15);

				return var2; // L: 194
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1282503334"
	)
	public static String method2287(String var0) {
		return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : ""; // L: 168 169
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1078907147"
	)
	static void method2291() {
		Login.worldSelectOpen = false; // L: 2215
		Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 2216
		class419.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 2217
		Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 2218
	} // L: 2219
}
