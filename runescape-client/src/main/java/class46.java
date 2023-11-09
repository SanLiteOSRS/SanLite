import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
public class class46 {
	@ObfuscatedName("aw")
	int field349;
	@ObfuscatedName("ay")
	int field350;
	@ObfuscatedName("ar")
	int field346;
	@ObfuscatedName("am")
	int field347;
	@ObfuscatedName("as")
	int field348;
	@ObfuscatedName("aj")
	int field351;
	@ObfuscatedName("ag")
	int[] field352;

	class46() {
		class60 var1 = VorbisSample.field415; // L: 15
		this.field349 = var1.method1184(16); // L: 16
		this.field350 = var1.method1184(24); // L: 17
		this.field346 = var1.method1184(24); // L: 18
		this.field347 = var1.method1184(24) + 1; // L: 19
		this.field348 = var1.method1184(6) + 1; // L: 20
		this.field351 = var1.method1184(8); // L: 21
		int[] var2 = new int[this.field348]; // L: 22

		int var3;
		for (var3 = 0; var3 < this.field348; ++var3) { // L: 23
			int var4 = 0; // L: 24
			int var5 = var1.method1184(3); // L: 25
			boolean var6 = var1.method1185() != 0; // L: 26
			if (var6) { // L: 27
				var4 = var1.method1184(5);
			}

			var2[var3] = var4 << 3 | var5; // L: 28
		}

		this.field352 = new int[this.field348 * 8]; // L: 30

		for (var3 = 0; var3 < this.field348 * 8; ++var3) { // L: 31
			this.field352[var3] = (var2[var3 >> 3] & 1 << (var3 & 7)) != 0 ? var1.method1184(8) : -1;
		}

	} // L: 32

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([FIZLce;)V"
	)
	void method878(float[] var1, int var2, boolean var3, class60 var4) {
		int var5;
		for (var5 = 0; var5 < var2; ++var5) { // L: 35
			var1[var5] = 0.0F;
		}

		if (!var3) { // L: 36
			var5 = VorbisSample.field402[this.field351].field384; // L: 37
			int var6 = this.field346 - this.field350; // L: 38
			int var7 = var6 / this.field347; // L: 39
			int[] var8 = new int[var7]; // L: 40

			for (int var9 = 0; var9 < 8; ++var9) { // L: 41
				int var10 = 0; // L: 42

				while (var10 < var7) { // L: 43
					int var11;
					int var12;
					if (var9 == 0) { // L: 44
						var11 = VorbisSample.field402[this.field351].method1083(var4); // L: 46

						for (var12 = var5 - 1; var12 >= 0; --var12) { // L: 47
							if (var10 + var12 < var7) { // L: 48
								var8[var10 + var12] = var11 % this.field348;
							}

							var11 /= this.field348; // L: 49
						}
					}

					for (var11 = 0; var11 < var5; ++var11) { // L: 53
						var12 = var8[var10]; // L: 55
						int var13 = this.field352[var9 + var12 * 8]; // L: 56
						if (var13 >= 0) { // L: 57
							int var14 = var10 * this.field347 + this.field350; // L: 58
							VorbisCodebook var15 = VorbisSample.field402[var13]; // L: 59
							int var16;
							if (this.field349 == 0) { // L: 60
								var16 = this.field347 / var15.field384; // L: 61

								for (int var20 = 0; var20 < var16; ++var20) { // L: 62
									float[] var21 = var15.method1081(var4); // L: 63

									for (int var19 = 0; var19 < var15.field384; ++var19) { // L: 64
										var1[var14 + var20 + var19 * var16] += var21[var19];
									}
								}
							} else {
								var16 = 0; // L: 68

								while (var16 < this.field347) { // L: 69
									float[] var17 = var15.method1081(var4); // L: 70

									for (int var18 = 0; var18 < var15.field384; ++var18) { // L: 71
										var1[var14 + var16] += var17[var18]; // L: 72
										++var16; // L: 73
									}
								}
							}
						}

						++var10; // L: 79
						if (var10 >= var7) { // L: 80
							break;
						}
					}
				}
			}

		}
	} // L: 84
}
