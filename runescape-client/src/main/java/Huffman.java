import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
@Implements("Huffman")
public class Huffman {
	@ObfuscatedName("ve")
	@ObfuscatedGetter(
		intValue = 1973672625
	)
	static int field3870;
	@ObfuscatedName("am")
	@Export("masks")
	int[] masks;
	@ObfuscatedName("ap")
	@Export("bits")
	byte[] bits;
	@ObfuscatedName("af")
	@Export("keys")
	int[] keys;

	public Huffman(byte[] var1) {
		int var2 = var1.length; // L: 9
		this.masks = new int[var2]; // L: 10
		this.bits = var1; // L: 11
		int[] var3 = new int[33]; // L: 12
		this.keys = new int[8]; // L: 13
		int var4 = 0; // L: 14

		for (int var5 = 0; var5 < var2; ++var5) { // L: 15
			byte var6 = var1[var5]; // L: 16
			if (var6 != 0) { // L: 17
				int var7 = 1 << 32 - var6; // L: 18
				int var8 = var3[var6];
				this.masks[var5] = var8; // L: 20
				int var9;
				int var10;
				int var11;
				int var12;
				if ((var8 & var7) != 0) { // L: 22
					var9 = var3[var6 - 1];
				} else {
					var9 = var8 | var7; // L: 24

					for (var10 = var6 - 1; var10 >= 1; --var10) { // L: 25
						var11 = var3[var10]; // L: 26
						if (var11 != var8) { // L: 27
							break;
						}

						var12 = 1 << 32 - var10; // L: 28
						if ((var11 & var12) != 0) { // L: 29
							var3[var10] = var3[var10 - 1]; // L: 30
							break;
						}

						var3[var10] = var11 | var12; // L: 33
					}
				}

				var3[var6] = var9; // L: 38

				for (var10 = var6 + 1; var10 <= 32; ++var10) { // L: 39
					if (var8 == var3[var10]) { // L: 40
						var3[var10] = var9;
					}
				}

				var10 = 0; // L: 42

				for (var11 = 0; var11 < var6; ++var11) { // L: 43
					var12 = Integer.MIN_VALUE >>> var11; // L: 44
					if ((var8 & var12) != 0) { // L: 45
						if (this.keys[var10] == 0) { // L: 46
							this.keys[var10] = var4;
						}

						var10 = this.keys[var10]; // L: 47
					} else {
						++var10; // L: 49
					}

					if (var10 >= this.keys.length) { // L: 50
						int[] var13 = new int[this.keys.length * 2]; // L: 51

						for (int var14 = 0; var14 < this.keys.length; ++var14) { // L: 52
							var13[var14] = this.keys[var14];
						}

						this.keys = var13; // L: 53
					}

					var12 >>>= 1; // L: 55
				}

				this.keys[var10] = ~var5; // L: 57
				if (var10 >= var4) { // L: 58
					var4 = var10 + 1;
				}
			}
		}

	} // L: 60

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([BII[BIB)I",
		garbageValue = "-81"
	)
	@Export("compress")
	int compress(byte[] var1, int var2, int var3, byte[] var4, int var5) {
		int var6 = 0; // L: 63
		int var7 = var5 << 3; // L: 64

		for (var3 += var2; var2 < var3; ++var2) { // L: 65 66
			int var8 = var1[var2] & 255;
			int var9 = this.masks[var8];
			byte var10 = this.bits[var8];
			if (var10 == 0) {
				throw new RuntimeException("" + var8);
			}

			int var11 = var7 >> 3;
			int var12 = var7 & 7;
			var6 &= -var12 >> 31; // L: 73
			int var13 = (var12 + var10 - 1 >> 3) + var11;
			var12 += 24; // L: 76
			var4[var11] = (byte)(var6 |= var9 >>> var12); // L: 77
			if (var11 < var13) {
				++var11; // L: 79
				var12 -= 8; // L: 80
				var4[var11] = (byte)(var6 = var9 >>> var12); // L: 81
				if (var11 < var13) { // L: 82
					++var11; // L: 83
					var12 -= 8; // L: 84
					var4[var11] = (byte)(var6 = var9 >>> var12); // L: 85
					if (var11 < var13) { // L: 86
						++var11; // L: 87
						var12 -= 8; // L: 88
						var4[var11] = (byte)(var6 = var9 >>> var12); // L: 89
						if (var11 < var13) { // L: 90
							++var11; // L: 91
							var12 -= 8; // L: 92
							var4[var11] = (byte)(var6 = var9 << -var12); // L: 93
						}
					}
				}
			}

			var7 += var10; // L: 95
		}

		return (var7 + 7 >> 3) - var5; // L: 97
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([BI[BIIB)I",
		garbageValue = "1"
	)
	@Export("decompress")
	int decompress(byte[] var1, int var2, byte[] var3, int var4, int var5) {
		if (var5 == 0) { // L: 101
			return 0;
		} else {
			int var6 = 0; // L: 102
			var5 += var4; // L: 103
			int var7 = var2;

			while (true) {
				byte var8 = var1[var7]; // L: 106
				if (var8 < 0) { // L: 108
					var6 = this.keys[var6];
				} else {
					++var6; // L: 109
				}

				int var9;
				if ((var9 = this.keys[var6]) < 0) { // L: 110
					var3[var4++] = (byte)(~var9); // L: 111
					if (var4 >= var5) { // L: 112
						break;
					}

					var6 = 0; // L: 113
				}

				if ((var8 & 64) != 0) { // L: 115
					var6 = this.keys[var6];
				} else {
					++var6; // L: 116
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 117
					var3[var4++] = (byte)(~var9); // L: 118
					if (var4 >= var5) { // L: 119
						break;
					}

					var6 = 0; // L: 120
				}

				if ((var8 & 32) != 0) { // L: 122
					var6 = this.keys[var6];
				} else {
					++var6; // L: 123
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 124
					var3[var4++] = (byte)(~var9); // L: 125
					if (var4 >= var5) { // L: 126
						break;
					}

					var6 = 0; // L: 127
				}

				if ((var8 & 16) != 0) { // L: 129
					var6 = this.keys[var6];
				} else {
					++var6; // L: 130
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 131
					var3[var4++] = (byte)(~var9); // L: 132
					if (var4 >= var5) { // L: 133
						break;
					}

					var6 = 0; // L: 134
				}

				if ((var8 & 8) != 0) { // L: 136
					var6 = this.keys[var6];
				} else {
					++var6; // L: 137
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 138
					var3[var4++] = (byte)(~var9); // L: 139
					if (var4 >= var5) { // L: 140
						break;
					}

					var6 = 0; // L: 141
				}

				if ((var8 & 4) != 0) { // L: 143
					var6 = this.keys[var6];
				} else {
					++var6; // L: 144
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 145
					var3[var4++] = (byte)(~var9); // L: 146
					if (var4 >= var5) { // L: 147
						break;
					}

					var6 = 0; // L: 148
				}

				if ((var8 & 2) != 0) { // L: 150
					var6 = this.keys[var6];
				} else {
					++var6; // L: 151
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 152
					var3[var4++] = (byte)(~var9); // L: 153
					if (var4 >= var5) { // L: 154
						break;
					}

					var6 = 0; // L: 155
				}

				if ((var8 & 1) != 0) { // L: 157
					var6 = this.keys[var6];
				} else {
					++var6; // L: 158
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 159
					var3[var4++] = (byte)(~var9); // L: 160
					if (var4 >= var5) { // L: 161
						break;
					}

					var6 = 0; // L: 162
				}

				++var7; // L: 105
			}

			return var7 + 1 - var2; // L: 165
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2797468"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17; // L: 19
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)Ljava/lang/String;",
		garbageValue = "1834780919"
	)
	public static String method6899(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart(); // L: 67
			if (var2 > 32767) { // L: 68
				var2 = 32767;
			}

			byte[] var3 = new byte[var2]; // L: 69
			var0.offset += class353.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 70
			String var4 = UrlRequest.decodeStringCp1252(var3, 0, var2); // L: 71
			var1 = var4; // L: 72
		} catch (Exception var6) { // L: 74
			var1 = "Cabbage"; // L: 75
		}

		return var1; // L: 78
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Ltt;",
		garbageValue = "4"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(class404.cacheDir, "preferences" + var0 + ".dat"); // L: 288
		if (var3.exists()) { // L: 289
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 291
				return var10; // L: 292
			} catch (IOException var9) { // L: 294
			}
		}

		String var4 = ""; // L: 296
		if (class189.cacheGamebuild == 33) { // L: 297
			var4 = "_rc";
		} else if (class189.cacheGamebuild == 34) { // L: 298
			var4 = "_wip";
		}

		File var5 = new File(RouteStrategy.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 299
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 300
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 302
				return var6; // L: 303
			} catch (IOException var8) { // L: 305
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 308
			return var6; // L: 309
		} catch (IOException var7) { // L: 311
			throw new RuntimeException(); // L: 312
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1869012713"
	)
	static final int method6900(int var0, int var1) {
		int var2 = var1 * 57 + var0; // L: 1014
		var2 ^= var2 << 13; // L: 1015
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE; // L: 1016
		return var3 >> 19 & 255; // L: 1017
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V",
		garbageValue = "-1915394593"
	)
	static final void method6893(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!Client.isMenuOpen) { // L: 10165
			if (Client.menuOptionsCount < 500) { // L: 10166
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 10167
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 10168
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 10169
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 10170
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 10171
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 10172
				Client.field687[Client.menuOptionsCount] = var6; // L: 10173
				Client.menuShiftClick[Client.menuOptionsCount] = var7; // L: 10174
				++Client.menuOptionsCount; // L: 10175
			}

		}
	} // L: 10177

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "753364985"
	)
	static final void method6901(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0); // L: 12092
		var0 = 100 - var0; // L: 12093
		float var1 = (float)var0 / 200.0F + 0.5F; // L: 12094
		MidiPcmStream.method6190((double)var1); // L: 12095
	} // L: 12096
}
