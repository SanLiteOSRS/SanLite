import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
@Implements("Clock")
public abstract class Clock {
	@ObfuscatedName("r")
	@Export("ItemComposition_inMembersWorld")
	static boolean ItemComposition_inMembersWorld;

	Clock() {
	} // L: 4

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "118747683"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1532577739"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIILgg;Lgw;Z[I[II)I",
		garbageValue = "1427210619"
	)
	public static int method3520(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, boolean var5, int[] var6, int[] var7) {
		int var9;
		for (int var8 = 0; var8 < 128; ++var8) { // L: 19
			for (var9 = 0; var9 < 128; ++var9) { // L: 20
				class205.directions[var8][var9] = 0; // L: 21
				class205.distances[var8][var9] = 99999999; // L: 22
			}
		}

		int var10;
		int var11;
		byte var13;
		int var14;
		int var15;
		int var17;
		int var19;
		int var20;
		int var21;
		boolean var28;
		int var30;
		int var31;
		int var33;
		if (var2 == 1) { // L: 26
			var28 = class456.method8411(var0, var1, var3, var4);
		} else if (var2 == 2) { // L: 27
			var10 = var0; // L: 30
			var11 = var1; // L: 31
			byte var12 = 64; // L: 32
			var13 = 64; // L: 33
			var14 = var0 - var12; // L: 34
			var15 = var1 - var13; // L: 35
			class205.directions[var12][var13] = 99; // L: 36
			class205.distances[var12][var13] = 0; // L: 37
			byte var16 = 0; // L: 38
			var17 = 0; // L: 39
			class205.bufferX[var16] = var0; // L: 40
			var33 = var16 + 1;
			class205.bufferY[var16] = var1; // L: 41
			int[][] var18 = var4.flags; // L: 42

			boolean var29;
			while (true) {
				if (var33 == var17) { // L: 43
					class205.field2359 = var10; // L: 143
					class205.field2364 = var11; // L: 144
					var29 = false; // L: 145
					break;
				}

				var10 = class205.bufferX[var17]; // L: 44
				var11 = class205.bufferY[var17]; // L: 45
				var17 = var17 + 1 & 4095; // L: 46
				var30 = var10 - var14; // L: 47
				var31 = var11 - var15; // L: 48
				var19 = var10 - var4.xInset; // L: 49
				var20 = var11 - var4.yInset; // L: 50
				if (var3.hasArrived(2, var10, var11, var4)) { // L: 51
					class205.field2359 = var10; // L: 52
					class205.field2364 = var11; // L: 53
					var29 = true; // L: 54
					break;
				}

				var21 = class205.distances[var30][var31] + 1; // L: 57
				if (var30 > 0 && class205.directions[var30 - 1][var31] == 0 && (var18[var19 - 1][var20] & 19136782) == 0 && (var18[var19 - 1][var20 + 1] & 19136824) == 0) { // L: 58 59 60 61
					class205.bufferX[var33] = var10 - 1; // L: 62
					class205.bufferY[var33] = var11; // L: 63
					var33 = var33 + 1 & 4095; // L: 64
					class205.directions[var30 - 1][var31] = 2; // L: 65
					class205.distances[var30 - 1][var31] = var21; // L: 66
				}

				if (var30 < 126 && class205.directions[var30 + 1][var31] == 0 && (var18[var19 + 2][var20] & 19136899) == 0 && (var18[var19 + 2][var20 + 1] & 19136992) == 0) { // L: 68 69 70 71
					class205.bufferX[var33] = var10 + 1; // L: 72
					class205.bufferY[var33] = var11; // L: 73
					var33 = var33 + 1 & 4095; // L: 74
					class205.directions[var30 + 1][var31] = 8; // L: 75
					class205.distances[var30 + 1][var31] = var21; // L: 76
				}

				if (var31 > 0 && class205.directions[var30][var31 - 1] == 0 && (var18[var19][var20 - 1] & 19136782) == 0 && (var18[var19 + 1][var20 - 1] & 19136899) == 0) { // L: 78 79 80 81
					class205.bufferX[var33] = var10; // L: 82
					class205.bufferY[var33] = var11 - 1; // L: 83
					var33 = var33 + 1 & 4095; // L: 84
					class205.directions[var30][var31 - 1] = 1; // L: 85
					class205.distances[var30][var31 - 1] = var21; // L: 86
				}

				if (var31 < 126 && class205.directions[var30][var31 + 1] == 0 && (var18[var19][var20 + 2] & 19136824) == 0 && (var18[var19 + 1][var20 + 2] & 19136992) == 0) { // L: 88 89 90 91
					class205.bufferX[var33] = var10; // L: 92
					class205.bufferY[var33] = var11 + 1; // L: 93
					var33 = var33 + 1 & 4095; // L: 94
					class205.directions[var30][var31 + 1] = 4; // L: 95
					class205.distances[var30][var31 + 1] = var21; // L: 96
				}

				if (var30 > 0 && var31 > 0 && class205.directions[var30 - 1][var31 - 1] == 0 && (var18[var19 - 1][var20] & 19136830) == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0 && (var18[var19][var20 - 1] & 19136911) == 0) { // L: 98 99 100 101 102
					class205.bufferX[var33] = var10 - 1; // L: 103
					class205.bufferY[var33] = var11 - 1; // L: 104
					var33 = var33 + 1 & 4095; // L: 105
					class205.directions[var30 - 1][var31 - 1] = 3; // L: 106
					class205.distances[var30 - 1][var31 - 1] = var21; // L: 107
				}

				if (var30 < 126 && var31 > 0 && class205.directions[var30 + 1][var31 - 1] == 0 && (var18[var19 + 1][var20 - 1] & 19136911) == 0 && (var18[var19 + 2][var20 - 1] & 19136899) == 0 && (var18[var19 + 2][var20] & 19136995) == 0) { // L: 109 110 111 112 113
					class205.bufferX[var33] = var10 + 1; // L: 114
					class205.bufferY[var33] = var11 - 1; // L: 115
					var33 = var33 + 1 & 4095; // L: 116
					class205.directions[var30 + 1][var31 - 1] = 9; // L: 117
					class205.distances[var30 + 1][var31 - 1] = var21; // L: 118
				}

				if (var30 > 0 && var31 < 126 && class205.directions[var30 - 1][var31 + 1] == 0 && (var18[var19 - 1][var20 + 1] & 19136830) == 0 && (var18[var19 - 1][var20 + 2] & 19136824) == 0 && (var18[var19][var20 + 2] & 19137016) == 0) { // L: 120 121 122 123 124
					class205.bufferX[var33] = var10 - 1; // L: 125
					class205.bufferY[var33] = var11 + 1; // L: 126
					var33 = var33 + 1 & 4095; // L: 127
					class205.directions[var30 - 1][var31 + 1] = 6; // L: 128
					class205.distances[var30 - 1][var31 + 1] = var21; // L: 129
				}

				if (var30 < 126 && var31 < 126 && class205.directions[var30 + 1][var31 + 1] == 0 && (var18[var19 + 1][var20 + 2] & 19137016) == 0 && (var18[var19 + 2][var20 + 2] & 19136992) == 0 && (var18[var19 + 2][var20 + 1] & 19136995) == 0) { // L: 131 132 133 134 135
					class205.bufferX[var33] = var10 + 1; // L: 136
					class205.bufferY[var33] = var11 + 1; // L: 137
					var33 = var33 + 1 & 4095; // L: 138
					class205.directions[var30 + 1][var31 + 1] = 12; // L: 139
					class205.distances[var30 + 1][var31 + 1] = var21; // L: 140
				}
			}

			var28 = var29; // L: 147
		} else {
			var28 = class416.method7888(var0, var1, var2, var3, var4); // L: 149
		}

		var9 = var0 - 64; // L: 150
		var10 = var1 - 64; // L: 151
		var11 = class205.field2359; // L: 152
		var30 = class205.field2364; // L: 153
		if (!var28) { // L: 154
			var31 = Integer.MAX_VALUE; // L: 156
			var14 = Integer.MAX_VALUE; // L: 157
			byte var32 = 10; // L: 158
			var33 = var3.approxDestinationX; // L: 159
			var17 = var3.approxDestinationY; // L: 160
			int var27 = var3.approxDestinationSizeX; // L: 161
			var19 = var3.approxDestinationSizeY; // L: 162

			for (var20 = var33 - var32; var20 <= var33 + var32; ++var20) { // L: 163
				for (var21 = var17 - var32; var21 <= var17 + var32; ++var21) { // L: 164
					int var22 = var20 - var9; // L: 165
					int var23 = var21 - var10; // L: 166
					if (var22 >= 0 && var23 >= 0 && var22 < 128 && var23 < 128 && class205.distances[var22][var23] < 100) { // L: 167 168
						int var24 = 0; // L: 169
						if (var20 < var33) { // L: 170
							var24 = var33 - var20;
						} else if (var20 > var27 + var33 - 1) { // L: 171
							var24 = var20 - (var33 + var27 - 1);
						}

						int var25 = 0; // L: 172
						if (var21 < var17) { // L: 173
							var25 = var17 - var21;
						} else if (var21 > var19 + var17 - 1) { // L: 174
							var25 = var21 - (var17 + var19 - 1);
						}

						int var26 = var24 * var24 + var25 * var25; // L: 175
						if (var26 < var31 || var26 == var31 && class205.distances[var22][var23] < var14) { // L: 176
							var31 = var26; // L: 177
							var14 = class205.distances[var22][var23]; // L: 178
							var11 = var20; // L: 179
							var30 = var21; // L: 180
						}
					}
				}
			}

			if (var31 == Integer.MAX_VALUE) { // L: 186
				return -1;
			}
		}

		if (var0 == var11 && var30 == var1) { // L: 190
			var6[0] = var11; // L: 191
			var7[0] = var30; // L: 192
			return 0; // L: 193
		} else {
			var13 = 0; // L: 195
			class205.bufferX[var13] = var11; // L: 198
			var31 = var13 + 1;
			class205.bufferY[var13] = var30; // L: 199

			for (var14 = var15 = class205.directions[var11 - var9][var30 - var10]; var0 != var11 || var30 != var1; var14 = class205.directions[var11 - var9][var30 - var10]) { // L: 200 201 211
				if (var15 != var14) { // L: 202
					var15 = var14; // L: 203
					class205.bufferX[var31] = var11; // L: 204
					class205.bufferY[var31++] = var30; // L: 205
				}

				if ((var14 & 2) != 0) { // L: 207
					++var11;
				} else if ((var14 & 8) != 0) { // L: 208
					--var11;
				}

				if ((var14 & 1) != 0) { // L: 209
					++var30;
				} else if ((var14 & 4) != 0) { // L: 210
					--var30;
				}
			}

			var33 = 0; // L: 213

			while (var31-- > 0) { // L: 214
				var6[var33] = class205.bufferX[var31]; // L: 215
				var7[var33++] = class205.bufferY[var31]; // L: 216
				if (var33 >= var6.length) { // L: 217
					break;
				}
			}

			return var33; // L: 219
		}
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(Lkd;B)I",
		garbageValue = "63"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32)); // L: 12602
		return var1 != null ? var1.integer : var0.flags; // L: 12603 12604
	}
}
