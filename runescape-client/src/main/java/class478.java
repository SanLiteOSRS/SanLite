import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ss")
public class class478 {
	@ObfuscatedName("au")
	static int[] field4835;
	@ObfuscatedName("aa")
	public static int[] field4836;
	@ObfuscatedName("ti")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;

	static {
		field4835 = new int[32768]; // L: 14

		for (int var0 = 0; var0 < 32768; ++var0) { // L: 15
			field4835[var0] = method8600(var0);
		}

		if (field4836 == null) { // L: 17
			field4836 = new int[65536]; // L: 18
			double var25 = 0.949999988079071D; // L: 19

			for (int var2 = 0; var2 < 65536; ++var2) { // L: 20
				double var3 = 0.0078125D + (double)(var2 >> 10 & 63) / 64.0D; // L: 21
				double var5 = (double)(var2 >> 7 & 7) / 8.0D + 0.0625D; // L: 22
				double var7 = (double)(var2 & 127) / 128.0D; // L: 23
				double var9 = var7; // L: 24
				double var11 = var7; // L: 25
				double var13 = var7; // L: 26
				if (var5 != 0.0D) { // L: 27
					double var15;
					if (var7 < 0.5D) { // L: 29
						var15 = (1.0D + var5) * var7;
					} else {
						var15 = var5 + var7 - var7 * var5; // L: 30
					}

					double var17 = var7 * 2.0D - var15; // L: 31
					double var19 = var3 + 0.3333333333333333D; // L: 32
					if (var19 > 1.0D) { // L: 33
						--var19;
					}

					double var23 = var3 - 0.3333333333333333D; // L: 35
					if (var23 < 0.0D) { // L: 36
						++var23;
					}

					if (var19 * 6.0D < 1.0D) { // L: 37
						var9 = var17 + var19 * (var15 - var17) * 6.0D;
					} else if (2.0D * var19 < 1.0D) { // L: 38
						var9 = var15;
					} else if (3.0D * var19 < 2.0D) { // L: 39
						var9 = var17 + (0.6666666666666666D - var19) * (var15 - var17) * 6.0D;
					} else {
						var9 = var17; // L: 40
					}

					if (var3 * 6.0D < 1.0D) { // L: 41
						var11 = var17 + var3 * (var15 - var17) * 6.0D;
					} else if (2.0D * var3 < 1.0D) { // L: 42
						var11 = var15;
					} else if (3.0D * var3 < 2.0D) { // L: 43
						var11 = var17 + (0.6666666666666666D - var3) * (var15 - var17) * 6.0D;
					} else {
						var11 = var17; // L: 44
					}

					if (6.0D * var23 < 1.0D) { // L: 45
						var13 = var17 + var23 * (var15 - var17) * 6.0D;
					} else if (var23 * 2.0D < 1.0D) { // L: 46
						var13 = var15;
					} else if (var23 * 3.0D < 2.0D) { // L: 47
						var13 = var17 + (var15 - var17) * (0.6666666666666666D - var23) * 6.0D;
					} else {
						var13 = var17; // L: 48
					}
				}

				var9 = Math.pow(var9, var25); // L: 50
				var11 = Math.pow(var11, var25); // L: 51
				var13 = Math.pow(var13, var25); // L: 52
				int var27 = (int)(var9 * 256.0D); // L: 53
				int var16 = (int)(var11 * 256.0D); // L: 54
				int var28 = (int)(256.0D * var13); // L: 55
				int var18 = var28 + (var16 << 8) + (var27 << 16); // L: 56
				field4836[var2] = var18 & 16777215; // L: 57
			}
		}

	} // L: 60

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2145901051"
	)
	static final int method8600(int var0) {
		double var1 = (double)(var0 >> 10 & 31) / 31.0D; // L: 67
		double var3 = (double)(var0 >> 5 & 31) / 31.0D; // L: 68
		double var5 = (double)(var0 & 31) / 31.0D; // L: 69
		double var7 = var1; // L: 70
		if (var3 < var1) { // L: 71
			var7 = var3;
		}

		if (var5 < var7) { // L: 72
			var7 = var5;
		}

		double var9 = var1; // L: 73
		if (var3 > var1) { // L: 74
			var9 = var3;
		}

		if (var5 > var9) { // L: 75
			var9 = var5;
		}

		double var11 = 0.0D; // L: 76
		double var13 = 0.0D; // L: 77
		double var15 = (var9 + var7) / 2.0D; // L: 78
		if (var9 != var7) { // L: 79
			if (var15 < 0.5D) { // L: 80
				var13 = (var9 - var7) / (var7 + var9);
			}

			if (var15 >= 0.5D) { // L: 81
				var13 = (var9 - var7) / (2.0D - var9 - var7);
			}

			if (var1 == var9) { // L: 82
				var11 = (var3 - var5) / (var9 - var7);
			} else if (var9 == var3) { // L: 83
				var11 = 2.0D + (var5 - var1) / (var9 - var7);
			} else if (var5 == var9) { // L: 84
				var11 = (var1 - var3) / (var9 - var7) + 4.0D;
			}
		}

		int var17 = (int)(var11 * 256.0D / 6.0D); // L: 86
		var17 &= 255; // L: 87
		double var18 = 256.0D * var13; // L: 88
		if (var18 < 0.0D) { // L: 89
			var18 = 0.0D;
		} else if (var18 > 255.0D) { // L: 90
			var18 = 255.0D;
		}

		if (var15 > 0.7D) { // L: 91
			var18 /= 2.0D; // L: 92
			var18 = Math.floor(var18); // L: 93
		}

		if (var15 > 0.75D) { // L: 95
			var18 /= 2.0D; // L: 96
			var18 = Math.floor(var18); // L: 97
		}

		if (var15 > 0.85D) { // L: 99
			var18 /= 2.0D; // L: 100
			var18 = Math.floor(var18); // L: 101
		}

		if (var15 > 0.95D) { // L: 103
			var18 /= 2.0D; // L: 104
			var18 = Math.floor(var18); // L: 105
		}

		if (var15 > 0.995D) { // L: 107
			var15 = 0.995D;
		}

		int var20 = (int)((double)(var17 / 4 * 8) + var18 / 32.0D); // L: 108
		return (int)(128.0D * var15) + (var20 << 7); // L: 109
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "124"
	)
	public static int method8602(int var0) {
		return 255 - (var0 & 255); // L: 113
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "930574871"
	)
	static void method8609() {
		Login.Login_username = Login.Login_username.trim(); // L: 1420
		if (Login.Login_username.length() == 0) { // L: 1421
			class139.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 1422
		} else if (Login.Login_password.length() == 0) { // L: 1425
			class139.setLoginResponseString("", "Please enter your password.", ""); // L: 1426
		} else {
			class139.setLoginResponseString("", "Connecting to server...", ""); // L: 1429
			VerticalAlignment.method3754(false); // L: 1430
			WorldMapSection2.method4516(20); // L: 1431
		}
	} // L: 1423 1427 1432

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1143986054"
	)
	static final void method8608(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) { // L: 9274
			if (Client.showMouseOverText) { // L: 9275
				int var2 = Client.menuOptionsCount - 1; // L: 9278
				String var4;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) { // L: 9282
					var4 = "Use" + " " + Client.field767 + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) { // L: 9283
					var4 = Client.field655 + " " + Client.field656 + " " + "->";
				} else {
					var4 = ReflectionCheck.method711(var2); // L: 9284
				}

				if (Client.menuOptionsCount > 2) { // L: 9285
					var4 = var4 + class167.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}

				GrandExchangeOfferTotalQuantityComparator.fontBold12.drawRandomAlphaAndSpacing(var4, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000); // L: 9286
			}
		}
	} // L: 9287
}
