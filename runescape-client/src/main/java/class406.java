import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
public final class class406 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[Loy;"
	)
	static class406[] field4561;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1187313523
	)
	static int field4556;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 561992607
	)
	static int field4560;
	@ObfuscatedName("x")
	float field4555;
	@ObfuscatedName("h")
	float field4558;
	@ObfuscatedName("j")
	float field4559;
	@ObfuscatedName("y")
	float field4557;

	static {
		field4561 = new class406[0]; // L: 4
		field4556 = 100; // L: 10
		field4561 = new class406[100]; // L: 11
		field4560 = 0; // L: 12
		new class406();
	} // L: 18

	class406() {
		this.method7633(); // L: 42
	} // L: 43

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-34"
	)
	public void method7623() {
		synchronized(field4561) { // L: 36
			if (field4560 < field4556 - 1) { // L: 37
				field4561[++field4560 - 1] = this;
			}

		}
	} // L: 39

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "193585192"
	)
	void method7617(float var1, float var2, float var3, float var4) {
		this.field4558 = var1; // L: 46
		this.field4555 = var2; // L: 47
		this.field4559 = var3; // L: 48
		this.field4557 = var4; // L: 49
	} // L: 50

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "1805256714"
	)
	public void method7638(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F)); // L: 53
		float var6 = (float)Math.cos((double)(var4 * 0.5F)); // L: 54
		this.field4558 = var1 * var5; // L: 55
		this.field4555 = var2 * var5; // L: 56
		this.field4559 = var5 * var3; // L: 57
		this.field4557 = var6; // L: 58
	} // L: 59

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	final void method7633() {
		this.field4559 = 0.0F; // L: 62
		this.field4555 = 0.0F; // L: 63
		this.field4558 = 0.0F; // L: 64
		this.field4557 = 1.0F; // L: 65
	} // L: 66

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Loy;I)V",
		garbageValue = "788551228"
	)
	public final void method7615(class406 var1) {
		this.method7617(var1.field4558 * this.field4557 + this.field4558 * var1.field4557 + this.field4559 * var1.field4555 - this.field4555 * var1.field4559, var1.field4559 * this.field4558 + var1.field4555 * this.field4557 + (var1.field4557 * this.field4555 - this.field4559 * var1.field4558), this.field4559 * var1.field4557 + this.field4555 * var1.field4558 - var1.field4555 * this.field4558 + var1.field4559 * this.field4557, var1.field4557 * this.field4557 - this.field4558 * var1.field4558 - var1.field4555 * this.field4555 - var1.field4559 * this.field4559); // L: 69
	} // L: 70

	public boolean equals(Object var1) {
		if (!(var1 instanceof class406)) { // L: 74
			return false; // L: 78
		} else {
			class406 var2 = (class406)var1; // L: 75
			return var2.field4558 == this.field4558 && this.field4555 == var2.field4555 && this.field4559 == var2.field4559 && var2.field4557 == this.field4557; // L: 76
		}
	}

	public int hashCode() {
		boolean var1 = true; // L: 83
		float var2 = 1.0F; // L: 84
		var2 = var2 * 31.0F + this.field4558; // L: 85
		var2 = var2 * 31.0F + this.field4555; // L: 86
		var2 = this.field4559 + 31.0F * var2; // L: 87
		var2 = var2 * 31.0F + this.field4557; // L: 88
		return (int)var2; // L: 89
	}

	public String toString() {
		return this.field4558 + "," + this.field4555 + "," + this.field4559 + "," + this.field4557; // L: 94
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Loo;FFFB)F",
		garbageValue = "18"
	)
	static float method7618(class409 var0, float var1, float var2, float var3) {
		float var4 = class1.method8(var0.field4583, var0.field4582, var1); // L: 116
		if (Math.abs(var4) < class121.field1454) { // L: 117
			return var1;
		} else {
			float var5 = class1.method8(var0.field4583, var0.field4582, var2); // L: 118
			if (Math.abs(var5) < class121.field1454) { // L: 119
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

					float var16 = class121.field1452 * Math.abs(var2) + var3 * 0.5F; // L: 147
					float var17 = 0.5F * (var6 - var2); // L: 148
					boolean var18 = Math.abs(var17) > var16 && 0.0F != var5; // L: 149
					if (var18) { // L: 150
						if (Math.abs(var8) >= var16 && Math.abs(var4) > Math.abs(var5)) { // L: 151
							float var12 = var5 / var4; // L: 156
							float var9;
							float var10;
							if (var6 == var1) { // L: 157
								var9 = var17 * 2.0F * var12; // L: 158
								var10 = 1.0F - var12; // L: 159
							} else {
								var10 = var4 / var13; // L: 162
								float var11 = var5 / var13; // L: 163
								var9 = var12 * (var10 * var17 * 2.0F * (var10 - var11) - (var2 - var1) * (var11 - 1.0F)); // L: 164
								var10 = (var12 - 1.0F) * (var11 - 1.0F) * (var10 - 1.0F); // L: 165
							}

							if ((double)var9 > 0.0D) { // L: 167
								var10 = -var10;
							} else {
								var9 = -var9; // L: 168
							}

							var12 = var8; // L: 169
							var8 = var7; // L: 170
							if (2.0F * var9 < var10 * var17 * 3.0F - Math.abs(var16 * var10) && var9 < Math.abs(var10 * var12 * 0.5F)) { // L: 171
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

						var5 = class1.method8(var0.field4583, var0.field4582, var2); // L: 184
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

	@ObfuscatedName("x")
	public static int method7640(long var0) {
		return (int)(var0 >>> 0 & 127L); // L: 68
	}
}
