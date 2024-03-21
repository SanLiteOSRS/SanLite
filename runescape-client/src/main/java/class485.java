import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sl")
public class class485 {
	@ObfuscatedName("as")
	static int[] field4908;
	@ObfuscatedName("aa")
	public static int[] field4904;

	static {
		field4908 = new int[32768]; // L: 14

		for (int var0 = 0; var0 < 32768; ++var0) { // L: 15
			field4908[var0] = method8807(var0);
		}

		if (field4904 == null) { // L: 17
			field4904 = new int[65536]; // L: 18
			double var25 = 0.949999988079071D; // L: 19

			for (int var2 = 0; var2 < 65536; ++var2) { // L: 20
				double var3 = (double)(var2 >> 10 & 63) / 64.0D + 0.0078125D; // L: 21
				double var5 = 0.0625D + (double)(var2 >> 7 & 7) / 8.0D; // L: 22
				double var7 = (double)(var2 & 127) / 128.0D; // L: 23
				double var9 = var7; // L: 24
				double var11 = var7; // L: 25
				double var13 = var7; // L: 26
				if (var5 != 0.0D) { // L: 27
					double var15;
					if (var7 < 0.5D) { // L: 29
						var15 = (var5 + 1.0D) * var7;
					} else {
						var15 = var7 + var5 - var5 * var7; // L: 30
					}

					double var17 = var7 * 2.0D - var15; // L: 31
					double var19 = 0.3333333333333333D + var3; // L: 32
					if (var19 > 1.0D) { // L: 33
						--var19;
					}

					double var23 = var3 - 0.3333333333333333D; // L: 35
					if (var23 < 0.0D) { // L: 36
						++var23;
					}

					if (var19 * 6.0D < 1.0D) { // L: 37
						var9 = var17 + var19 * 6.0D * (var15 - var17);
					} else if (2.0D * var19 < 1.0D) { // L: 38
						var9 = var15;
					} else if (var19 * 3.0D < 2.0D) { // L: 39
						var9 = (var15 - var17) * (0.6666666666666666D - var19) * 6.0D + var17;
					} else {
						var9 = var17; // L: 40
					}

					if (var3 * 6.0D < 1.0D) { // L: 41
						var11 = (var15 - var17) * 6.0D * var3 + var17;
					} else if (var3 * 2.0D < 1.0D) { // L: 42
						var11 = var15;
					} else if (3.0D * var3 < 2.0D) { // L: 43
						var11 = 6.0D * (0.6666666666666666D - var3) * (var15 - var17) + var17;
					} else {
						var11 = var17; // L: 44
					}

					if (var23 * 6.0D < 1.0D) { // L: 45
						var13 = var17 + (var15 - var17) * 6.0D * var23;
					} else if (var23 * 2.0D < 1.0D) { // L: 46
						var13 = var15;
					} else if (3.0D * var23 < 2.0D) { // L: 47
						var13 = 6.0D * (0.6666666666666666D - var23) * (var15 - var17) + var17;
					} else {
						var13 = var17; // L: 48
					}
				}

				var9 = Math.pow(var9, var25); // L: 50
				var11 = Math.pow(var11, var25); // L: 51
				var13 = Math.pow(var13, var25); // L: 52
				int var27 = (int)(256.0D * var9); // L: 53
				int var16 = (int)(256.0D * var11); // L: 54
				int var28 = (int)(256.0D * var13); // L: 55
				int var18 = var28 + (var16 << 8) + (var27 << 16); // L: 56
				field4904[var2] = var18 & 16777215; // L: 57
			}
		}

	} // L: 60

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "67"
	)
	static final int method8807(int var0) {
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
		double var15 = (var7 + var9) / 2.0D; // L: 78
		if (var9 != var7) { // L: 79
			if (var15 < 0.5D) { // L: 80
				var13 = (var9 - var7) / (var9 + var7);
			}

			if (var15 >= 0.5D) { // L: 81
				var13 = (var9 - var7) / (2.0D - var9 - var7);
			}

			if (var1 == var9) { // L: 82
				var11 = (var3 - var5) / (var9 - var7);
			} else if (var9 == var3) { // L: 83
				var11 = 2.0D + (var5 - var1) / (var9 - var7);
			} else if (var5 == var9) { // L: 84
				var11 = 4.0D + (var1 - var3) / (var9 - var7);
			}
		}

		int var17 = (int)(var11 * 256.0D / 6.0D); // L: 86
		var17 &= 255; // L: 87
		double var18 = var13 * 256.0D; // L: 88
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
		return (var20 << 7) + (int)(var15 * 128.0D); // L: 109
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "43"
	)
	public static int method8809(int var0) {
		return 255 - (var0 & 255); // L: 113
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "100962176"
	)
	static void method8806() {
		if ((Client.worldProperties & class529.field5183.rsOrdinal()) != 0) { // L: 1170
			Login.Login_response0 = ""; // L: 1171
			Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 1172
			Login.Login_response2 = "Your normal account will not be affected."; // L: 1173
			Login.Login_response3 = ""; // L: 1174
			JagexCache.method4224(1); // L: 1175
			Message.method1182(); // L: 1176
		} else if ((Client.worldProperties & class529.field5160.rsOrdinal()) != 0) { // L: 1178
			if ((Client.worldProperties & class529.field5162.rsOrdinal()) != 0) { // L: 1179
				Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 1180
				Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 1181
				Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 1182
			} else {
				Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 1185
				Login.Login_response2 = "Players can attack each other"; // L: 1186
				Login.Login_response3 = "almost everywhere."; // L: 1187
			}

			Login.Login_response0 = "Warning!"; // L: 1189
			JagexCache.method4224(1); // L: 1190
			Message.method1182(); // L: 1191
		} else if ((Client.worldProperties & class529.field5162.rsOrdinal()) != 0) { // L: 1193
			Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 1194
			Login.Login_response2 = "The Protect Item prayer will"; // L: 1195
			Login.Login_response3 = "not work on this world."; // L: 1196
			Login.Login_response0 = "Warning!"; // L: 1197
			JagexCache.method4224(1); // L: 1198
			Message.method1182(); // L: 1199
		} else {
			class148.Login_promptCredentials(false); // L: 1202
		}

	} // L: 1204

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "28265915"
	)
	static final int method8808(int var0, int var1) {
		if (var0 == -2) { // L: 1008
			return 12345678;
		} else if (var0 == -1) { // L: 1009
			if (var1 < 2) { // L: 1010
				var1 = 2;
			} else if (var1 > 126) { // L: 1011
				var1 = 126;
			}

			return var1; // L: 1012
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 1014
			if (var1 < 2) { // L: 1015
				var1 = 2;
			} else if (var1 > 126) { // L: 1016
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1017
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(B)Lts;",
		garbageValue = "115"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return Tiles.worldMap; // L: 751
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
	)
	static final void method8804() {
		Client.packetWriter.close(); // L: 2990
		class133.method3119(); // L: 2991
		Actor.scene.clear(); // L: 2992

		for (int var0 = 0; var0 < 4; ++var0) { // L: 2993
			Client.collisionMaps[var0].clear();
		}

		Client.field737.method4394(); // L: 2994
		System.gc(); // L: 2995
		class169.method3521(0, 0); // L: 2996
		GrandExchangeOfferOwnWorldComparator.method1192(); // L: 2997
		Client.playingJingle = false; // L: 2998
		InterfaceParent.method2350(); // L: 2999
		Interpreter.method2106(10); // L: 3000
		VarbitComposition.method3830().method4265(); // L: 3001
		VarbitComposition.method3830().method4266(); // L: 3002
	} // L: 3003

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Ldj;III)V",
		garbageValue = "-776891660"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4607
			int var3 = MilliClock.SequenceDefinition_get(var1).field2272; // L: 4608
			if (var3 == 1) { // L: 4609
				var0.sequenceFrame = 0; // L: 4610
				var0.sequenceFrameCycle = 0; // L: 4611
				var0.sequenceDelay = var2; // L: 4612
				var0.field1254 = 0; // L: 4613
			}

			if (var3 == 2) { // L: 4615
				var0.field1254 = 0; // L: 4616
			}
		} else if (var1 == -1 || var0.sequence == -1 || MilliClock.SequenceDefinition_get(var1).field2266 >= MilliClock.SequenceDefinition_get(var0.sequence).field2266) { // L: 4619
			var0.sequence = var1; // L: 4620
			var0.sequenceFrame = 0; // L: 4621
			var0.sequenceFrameCycle = 0; // L: 4622
			var0.sequenceDelay = var2; // L: 4623
			var0.field1254 = 0; // L: 4624
			var0.field1280 = var0.pathLength; // L: 4625
		}

	} // L: 4627
}
