import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
public class class226 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lec;"
	)
	class126[] field2522;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1022329731
	)
	int field2521;

	@ObfuscatedSignature(
		descriptor = "(Ltc;I)V"
	)
	class226(Buffer var1, int var2) {
		this.field2522 = new class126[var2]; // L: 13
		this.field2521 = var1.readUnsignedByte(); // L: 14

		for (int var3 = 0; var3 < this.field2522.length; ++var3) {
			class126 var4 = new class126(this.field2521, var1, false);
			this.field2522[var3] = var4;
		}

		this.method4405();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "22"
	)
	void method4405() {
		class126[] var1 = this.field2522;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class126 var3 = var1[var2]; // L: 26
			if (var3.field1481 >= 0) {
				var3.field1488 = this.field2522[var3.field1481]; // L: 29
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-123"
	)
	public int method4411() {
		return this.field2522.length;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Lec;",
		garbageValue = "-1943594170"
	)
	class126 method4407(int var1) {
		return var1 >= this.method4411() ? null : this.field2522[var1]; // L: 42
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Lec;",
		garbageValue = "13"
	)
	class126[] method4408() {
		return this.field2522; // L: 48
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lfx;IB)V",
		garbageValue = "78"
	)
	void method4410(class137 var1, int var2) {
		this.method4409(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lfx;I[ZZI)V",
		garbageValue = "-1824572511"
	)
	void method4409(class137 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3038();
		int var6 = 0;
		class126[] var7 = this.method4408(); // L: 59

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class126 var9 = var7[var8]; // L: 61
			if (var3 == null || var4 == var3[var6]) {
				var1.method3040(var2, var9, var6, var5);
			}

			++var6;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([FIFZFZ[FI)I",
		garbageValue = "-774236032"
	)
	public static int method4430(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F; // L: 15

		for (int var8 = 0; var8 < var1 + 1; ++var8) { // L: 16
			var7 += Math.abs(var0[var8]); // L: 17
		}

		float var24 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class125.field1468; // L: 19
		if (var7 <= var24) { // L: 20
			return -1; // L: 21
		} else {
			float[] var9 = new float[var1 + 1]; // L: 23

			int var10;
			for (var10 = 0; var10 < var1 + 1; ++var10) { // L: 24
				var9[var10] = 1.0F / var7 * var0[var10]; // L: 25
			}

			while (Math.abs(var9[var1]) < var24) { // L: 27
				--var1; // L: 28
			}

			var10 = 0; // L: 30
			if (var1 == 0) { // L: 31
				return var10; // L: 32
			} else if (var1 == 1) { // L: 34
				var6[0] = -var9[0] / var9[1]; // L: 35
				boolean var22 = var3 ? var2 < var6[0] + var24 : var2 < var6[0] - var24; // L: 36
				boolean var23 = var5 ? var4 > var6[0] - var24 : var4 > var6[0] + var24; // L: 37
				var10 = var22 && var23 ? 1 : 0; // L: 38
				if (var10 > 0) { // L: 39
					if (var3 && var6[0] < var2) { // L: 40
						var6[0] = var2; // L: 41
					} else if (var5 && var6[0] > var4) { // L: 43
						var6[0] = var4; // L: 44
					}
				}

				return var10; // L: 47
			} else {
				class440 var11 = new class440(var9, var1); // L: 50
				float[] var12 = new float[var1 + 1]; // L: 51

				for (int var13 = 1; var13 <= var1; ++var13) { // L: 52
					var12[var13 - 1] = (float)var13 * var9[var13]; // L: 53
				}

				float[] var21 = new float[var1 + 1]; // L: 55
				int var14 = method4430(var12, var1 - 1, var2, false, var4, false, var21); // L: 56
				if (var14 == -1) { // L: 57
					return 0; // L: 58
				} else {
					boolean var15 = false; // L: 60
					float var17 = 0.0F; // L: 62
					float var18 = 0.0F; // L: 63
					float var19 = 0.0F; // L: 64

					for (int var20 = 0; var20 <= var14; ++var20) { // L: 65
						if (var10 > var1) { // L: 66
							return var10;
						}

						float var16;
						if (var20 == 0) { // L: 67
							var16 = var2; // L: 68
							var18 = DirectByteArrayCopier.method6617(var9, var1, var2); // L: 69
							if (Math.abs(var18) <= var24 && var3) { // L: 70
								var6[var10++] = var2;
							}
						} else {
							var16 = var19; // L: 73
							var18 = var17; // L: 74
						}

						if (var20 == var14) { // L: 76
							var19 = var4; // L: 77
							var15 = false; // L: 78
						} else {
							var19 = var21[var20]; // L: 81
						}

						var17 = DirectByteArrayCopier.method6617(var9, var1, var19); // L: 83
						if (var15) { // L: 84
							var15 = false; // L: 85
						} else if (Math.abs(var17) < var24) { // L: 88
							if (var20 != var14 || var5) { // L: 89
								var6[var10++] = var19; // L: 90
								var15 = true; // L: 91
							}
						} else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) { // L: 94
							var6[var10++] = class454.method8346(var11, var16, var19, 0.0F); // L: 95
							if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var24) { // L: 96
								var6[var10 - 2] = (var6[var10 - 2] + var6[var10 - 1]) * 0.5F; // L: 97
								--var10; // L: 98
							}
						}
					}

					return var10; // L: 104
				}
			}
		}
	}
}
