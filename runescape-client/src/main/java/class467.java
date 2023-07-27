import java.awt.Image;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
public class class467 {
	@ObfuscatedName("aj")
	static int[] field4802;
	@ObfuscatedName("ag")
	public static int[] field4797;
	@ObfuscatedName("bp")
	static Image field4803;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = -568930795
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;

	static {
		field4802 = new int[32768]; // L: 14

		for (int var0 = 0; var0 < 32768; ++var0) { // L: 15
			field4802[var0] = method8431(var0);
		}

		method8427(); // L: 16
	} // L: 17

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "94"
	)
	static final int method8431(int var0) {
		double var1 = (double)(var0 >> 10 & 31) / 31.0D; // L: 24
		double var3 = (double)(var0 >> 5 & 31) / 31.0D; // L: 25
		double var5 = (double)(var0 & 31) / 31.0D; // L: 26
		double var7 = var1; // L: 27
		if (var3 < var1) { // L: 28
			var7 = var3;
		}

		if (var5 < var7) { // L: 29
			var7 = var5;
		}

		double var9 = var1; // L: 30
		if (var3 > var1) { // L: 31
			var9 = var3;
		}

		if (var5 > var9) { // L: 32
			var9 = var5;
		}

		double var11 = 0.0D; // L: 33
		double var13 = 0.0D; // L: 34
		double var15 = (var7 + var9) / 2.0D; // L: 35
		if (var7 != var9) { // L: 36
			if (var15 < 0.5D) { // L: 37
				var13 = (var9 - var7) / (var9 + var7);
			}

			if (var15 >= 0.5D) { // L: 38
				var13 = (var9 - var7) / (2.0D - var9 - var7);
			}

			if (var9 == var1) { // L: 39
				var11 = (var3 - var5) / (var9 - var7);
			} else if (var3 == var9) { // L: 40
				var11 = (var5 - var1) / (var9 - var7) + 2.0D;
			} else if (var9 == var5) { // L: 41
				var11 = 4.0D + (var1 - var3) / (var9 - var7);
			}
		}

		int var17 = (int)(var11 * 256.0D / 6.0D); // L: 43
		var17 &= 255;
		double var18 = 256.0D * var13; // L: 45
		if (var18 < 0.0D) { // L: 46
			var18 = 0.0D;
		} else if (var18 > 255.0D) { // L: 47
			var18 = 255.0D;
		}

		if (var15 > 0.7D) { // L: 48
			var18 /= 2.0D; // L: 49
			var18 = Math.floor(var18); // L: 50
		}

		if (var15 > 0.75D) { // L: 52
			var18 /= 2.0D; // L: 53
			var18 = Math.floor(var18); // L: 54
		}

		if (var15 > 0.85D) { // L: 56
			var18 /= 2.0D; // L: 57
			var18 = Math.floor(var18); // L: 58
		}

		if (var15 > 0.95D) { // L: 60
			var18 /= 2.0D; // L: 61
			var18 = Math.floor(var18); // L: 62
		}

		if (var15 > 0.995D) { // L: 64
			var15 = 0.995D;
		}

		int var20 = (int)((double)(var17 / 4 * 8) + var18 / 32.0D); // L: 65
		return (int)(128.0D * var15) + (var20 << 7); // L: 66
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "176921584"
	)
	public static int method8426() {
		return ViewportMouse.ViewportMouse_entityCount; // L: 44
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1544009428"
	)
	static void method8427() {
		if (field4797 == null) { // L: 70
			field4797 = new int[65536]; // L: 71
			double var0 = 0.949999988079071D; // L: 72

			for (int var2 = 0; var2 < 65536; ++var2) { // L: 73
				double var3 = (double)(var2 >> 10 & 63) / 64.0D + 0.0078125D; // L: 74
				double var5 = (double)(var2 >> 7 & 7) / 8.0D + 0.0625D; // L: 75
				double var7 = (double)(var2 & 127) / 128.0D; // L: 76
				double var9 = var7; // L: 77
				double var11 = var7; // L: 78
				double var13 = var7; // L: 79
				if (0.0D != var5) { // L: 80
					double var15;
					if (var7 < 0.5D) { // L: 82
						var15 = var7 * (1.0D + var5);
					} else {
						var15 = var5 + var7 - var7 * var5; // L: 83
					}

					double var17 = 2.0D * var7 - var15; // L: 84
					double var19 = 0.3333333333333333D + var3; // L: 85
					if (var19 > 1.0D) { // L: 86
						--var19;
					}

					double var23 = var3 - 0.3333333333333333D; // L: 88
					if (var23 < 0.0D) { // L: 89
						++var23;
					}

					if (var19 * 6.0D < 1.0D) { // L: 90
						var9 = var17 + var19 * 6.0D * (var15 - var17);
					} else if (2.0D * var19 < 1.0D) { // L: 91
						var9 = var15;
					} else if (3.0D * var19 < 2.0D) { // L: 92
						var9 = var17 + 6.0D * (0.6666666666666666D - var19) * (var15 - var17);
					} else {
						var9 = var17; // L: 93
					}

					if (var3 * 6.0D < 1.0D) { // L: 94
						var11 = var17 + var3 * (var15 - var17) * 6.0D;
					} else if (var3 * 2.0D < 1.0D) { // L: 95
						var11 = var15;
					} else if (var3 * 3.0D < 2.0D) { // L: 96
						var11 = (var15 - var17) * (0.6666666666666666D - var3) * 6.0D + var17;
					} else {
						var11 = var17; // L: 97
					}

					if (var23 * 6.0D < 1.0D) { // L: 98
						var13 = 6.0D * (var15 - var17) * var23 + var17;
					} else if (2.0D * var23 < 1.0D) { // L: 99
						var13 = var15;
					} else if (3.0D * var23 < 2.0D) { // L: 100
						var13 = (var15 - var17) * (0.6666666666666666D - var23) * 6.0D + var17;
					} else {
						var13 = var17; // L: 101
					}
				}

				var9 = Math.pow(var9, var0); // L: 103
				var11 = Math.pow(var11, var0); // L: 104
				var13 = Math.pow(var13, var0); // L: 105
				int var25 = (int)(var9 * 256.0D); // L: 106
				int var16 = (int)(256.0D * var11); // L: 107
				int var26 = (int)(256.0D * var13); // L: 108
				int var18 = var26 + (var16 << 8) + (var25 << 16); // L: 109
				field4797[var2] = var18 & 16777215; // L: 110
			}

		}
	} // L: 112

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "172911680"
	)
	public static int method8428(int var0) {
		return 255 - (var0 & 255); // L: 115
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-17"
	)
	public static void method8434() {
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 471
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 472
		SequenceDefinition.SequenceDefinition_cachedModel.clear(); // L: 473
	} // L: 474

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1878130101"
	)
	static int method8435(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2862
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2863
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field750.method4151(var3) ? 1 : 0; // L: 2864
			return 1; // L: 2865
		} else if (var0 == 3501) { // L: 2867
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2868
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field750.method4150(var3) ? 1 : 0; // L: 2869
			return 1; // L: 2870
		} else if (var0 == 3502) { // L: 2872
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2873
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field750.method4152(var3) ? 1 : 0; // L: 2874
			return 1; // L: 2875
		} else {
			return 2; // L: 2877
		}
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(Lmt;B)Z",
		garbageValue = "0"
	)
	static final boolean method8437(Widget var0) {
		int var1 = var0.contentType; // L: 12473
		if (var1 == 205) { // L: 12474
			Client.logoutTimer = 250; // L: 12475
			return true; // L: 12476
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 12478
				var2 = (var1 - 300) / 2; // L: 12479
				var3 = var1 & 1; // L: 12480
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 12481
			}

			if (var1 >= 314 && var1 <= 323) { // L: 12483
				var2 = (var1 - 314) / 2; // L: 12484
				var3 = var1 & 1; // L: 12485
				Client.playerAppearance.method6143(var2, var3 == 1); // L: 12486
			}

			if (var1 == 324) {
				Client.playerAppearance.method6122(0); // L: 12488
			}

			if (var1 == 325) { // L: 12489
				Client.playerAppearance.method6122(1);
			}

			if (var1 == 326) { // L: 12490
				PacketBufferNode var4 = class503.getPacketBufferNode(ClientPacket.field3111, Client.packetWriter.isaacCipher); // L: 12492
				Client.playerAppearance.write(var4.packetBuffer); // L: 12493
				Client.packetWriter.addNode(var4); // L: 12494
				return true; // L: 12495
			} else {
				return false; // L: 12497
			}
		}
	}
}
