import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
@Implements("Players")
public class Players {
	@ObfuscatedName("ar")
	static byte[] field1327;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lip;"
	)
	static class216[] field1342;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Ltc;"
	)
	static Buffer[] field1329;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 422998509
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("al")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -449805329
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("ac")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("ag")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("ad")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("aw")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1648406743
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("ah")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	static Buffer field1336;
	@ObfuscatedName("qp")
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	@Export("varcs")
	static Varcs varcs;

	static {
		field1327 = new byte[2048]; // L: 19
		field1342 = new class216[2048]; // L: 20
		field1329 = new Buffer[2048]; // L: 21
		Players_count = 0; // L: 22
		Players_indices = new int[2048]; // L: 23
		Players_emptyIdxCount = 0; // L: 24
		Players_emptyIndices = new int[2048]; // L: 25
		Players_regions = new int[2048]; // L: 26
		Players_orientations = new int[2048]; // L: 27
		Players_targetIndices = new int[2048]; // L: 28
		Players_pendingUpdateCount = 0; // L: 29
		Players_pendingUpdateIndices = new int[2048]; // L: 30
		field1336 = new Buffer(new byte[5000]); // L: 31
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIILij;Lir;Z[I[IB)I",
		garbageValue = "110"
	)
	public static int method2676(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, boolean var5, int[] var6, int[] var7) {
		class215 var9 = class217.field2388[0]; // L: 34
		var9.method4188(); // L: 36
		int var10 = var9.method4175(); // L: 37
		int var11 = var9.method4163(); // L: 38
		int[][] var12 = var9.method4191(); // L: 39
		int[][] var13 = var9.method4164(); // L: 40
		int[] var14 = var9.method4166(); // L: 41
		int[] var15 = var9.method4167(); // L: 42
		boolean var16;
		boolean var17;
		int var18;
		int var19;
		int[][] var20;
		int[][] var21;
		int[] var22;
		int[] var23;
		int var24;
		int var25;
		int var26;
		int var27;
		int var28;
		int var29;
		int var30;
		byte var31;
		int var32;
		int[][] var33;
		int var34;
		int var35;
		int var36;
		int var43;
		if (var2 == 1) { // L: 44
			var18 = var9.method4175(); // L: 47
			var19 = var9.method4163(); // L: 48
			var20 = var9.method4191(); // L: 49
			var21 = var9.method4164(); // L: 50
			var22 = var9.method4166(); // L: 51
			var23 = var9.method4167(); // L: 52
			var24 = var9.method4168(); // L: 53
			var25 = var0; // L: 54
			var26 = var1; // L: 55
			var27 = var18 >> 1; // L: 56
			var28 = var19 >> 1; // L: 57
			var29 = var0 - var27; // L: 58
			var30 = var1 - var28; // L: 59
			var21[var27][var28] = 99; // L: 60
			var20[var27][var28] = 0; // L: 61
			var31 = 0; // L: 62
			var32 = 0; // L: 63
			var22[var31] = var0; // L: 64
			var43 = var31 + 1; // L: 65
			var23[var31] = var1;
			var33 = var4.flags; // L: 66

			while (true) {
				if (var32 == var43) { // L: 69
					var9.method4160(var25, var26); // L: 140
					var17 = false; // L: 141
					break;
				}

				var25 = var22[var32]; // L: 70
				var26 = var23[var32]; // L: 71
				var32 = var32 + 1 & var24; // L: 72
				var27 = var25 - var29; // L: 73
				var28 = var26 - var30; // L: 74
				var34 = var25 - var4.xInset; // L: 75
				var35 = var26 - var4.yInset; // L: 76
				if (var3.hasArrived(1, var25, var26, var4)) { // L: 77
					var9.method4160(var25, var26); // L: 78
					var17 = true; // L: 79
					break;
				}

				var36 = var20[var27][var28] + 1; // L: 82
				if (var27 > 0 && var21[var27 - 1][var28] == 0 && (var33[var34 - 1][var35] & 19136776) == 0) { // L: 83
					var22[var43] = var25 - 1; // L: 84
					var23[var43] = var26; // L: 85
					var43 = var43 + 1 & var24; // L: 86
					var21[var27 - 1][var28] = 2; // L: 87
					var20[var27 - 1][var28] = var36; // L: 88
				}

				if (var27 < var18 - 1 && var21[var27 + 1][var28] == 0 && (var33[var34 + 1][var35] & 19136896) == 0) { // L: 90
					var22[var43] = var25 + 1; // L: 91
					var23[var43] = var26; // L: 92
					var43 = var43 + 1 & var24; // L: 93
					var21[var27 + 1][var28] = 8; // L: 94
					var20[var27 + 1][var28] = var36; // L: 95
				}

				if (var28 > 0 && var21[var27][var28 - 1] == 0 && (var33[var34][var35 - 1] & 19136770) == 0) { // L: 97
					var22[var43] = var25; // L: 98
					var23[var43] = var26 - 1; // L: 99
					var43 = var43 + 1 & var24; // L: 100
					var21[var27][var28 - 1] = 1; // L: 101
					var20[var27][var28 - 1] = var36; // L: 102
				}

				if (var28 < var19 - 1 && var21[var27][var28 + 1] == 0 && (var33[var34][var35 + 1] & 19136800) == 0) { // L: 104
					var22[var43] = var25; // L: 105
					var23[var43] = var26 + 1; // L: 106
					var43 = var43 + 1 & var24; // L: 107
					var21[var27][var28 + 1] = 4; // L: 108
					var20[var27][var28 + 1] = var36; // L: 109
				}

				if (var27 > 0 && var28 > 0 && var21[var27 - 1][var28 - 1] == 0 && (var33[var34 - 1][var35 - 1] & 19136782) == 0 && (var33[var34 - 1][var35] & 19136776) == 0 && (var33[var34][var35 - 1] & 19136770) == 0) { // L: 111
					var22[var43] = var25 - 1; // L: 112
					var23[var43] = var26 - 1; // L: 113
					var43 = var43 + 1 & var24; // L: 114
					var21[var27 - 1][var28 - 1] = 3; // L: 115
					var20[var27 - 1][var28 - 1] = var36; // L: 116
				}

				if (var27 < var18 - 1 && var28 > 0 && var21[var27 + 1][var28 - 1] == 0 && (var33[var34 + 1][var35 - 1] & 19136899) == 0 && (var33[var34 + 1][var35] & 19136896) == 0 && (var33[var34][var35 - 1] & 19136770) == 0) { // L: 118
					var22[var43] = var25 + 1; // L: 119
					var23[var43] = var26 - 1; // L: 120
					var43 = var43 + 1 & var24; // L: 121
					var21[var27 + 1][var28 - 1] = 9; // L: 122
					var20[var27 + 1][var28 - 1] = var36; // L: 123
				}

				if (var27 > 0 && var28 < var19 - 1 && var21[var27 - 1][var28 + 1] == 0 && (var33[var34 - 1][var35 + 1] & 19136824) == 0 && (var33[var34 - 1][var35] & 19136776) == 0 && (var33[var34][var35 + 1] & 19136800) == 0) { // L: 125
					var22[var43] = var25 - 1; // L: 126
					var23[var43] = var26 + 1; // L: 127
					var43 = var43 + 1 & var24; // L: 128
					var21[var27 - 1][var28 + 1] = 6; // L: 129
					var20[var27 - 1][var28 + 1] = var36; // L: 130
				}

				if (var27 < var18 - 1 && var28 < var19 - 1 && var21[var27 + 1][var28 + 1] == 0 && (var33[var34 + 1][var35 + 1] & 19136992) == 0 && (var33[var34 + 1][var35] & 19136896) == 0 && (var33[var34][var35 + 1] & 19136800) == 0) { // L: 132
					var22[var43] = var25 + 1; // L: 133
					var23[var43] = var26 + 1; // L: 134
					var43 = var43 + 1 & var24; // L: 135
					var21[var27 + 1][var28 + 1] = 12; // L: 136
					var20[var27 + 1][var28 + 1] = var36; // L: 137
				}
			}

			var16 = var17; // L: 143
		} else if (var2 == 2) { // L: 145
			var18 = var9.method4175(); // L: 148
			var19 = var9.method4163(); // L: 149
			var20 = var9.method4191(); // L: 150
			var21 = var9.method4164(); // L: 151
			var22 = var9.method4166(); // L: 152
			var23 = var9.method4167(); // L: 153
			var24 = var9.method4168(); // L: 154
			var25 = var0; // L: 155
			var26 = var1; // L: 156
			var27 = var18 >> 1; // L: 157
			var28 = var19 >> 1; // L: 158
			var29 = var0 - var27; // L: 159
			var30 = var1 - var28; // L: 160
			var21[var27][var28] = 99; // L: 161
			var20[var27][var28] = 0; // L: 162
			var31 = 0; // L: 163
			var32 = 0; // L: 164
			var22[var31] = var0; // L: 165
			var43 = var31 + 1; // L: 166
			var23[var31] = var1;
			var33 = var4.flags; // L: 167

			while (true) {
				if (var32 == var43) { // L: 168
					var9.method4160(var25, var26); // L: 267
					var17 = false; // L: 268
					break;
				}

				var25 = var22[var32]; // L: 169
				var26 = var23[var32]; // L: 170
				var32 = var32 + 1 & var24; // L: 171
				var27 = var25 - var29; // L: 172
				var28 = var26 - var30; // L: 173
				var34 = var25 - var4.xInset; // L: 174
				var35 = var26 - var4.yInset; // L: 175
				if (var3.hasArrived(2, var25, var26, var4)) { // L: 176
					var9.method4160(var25, var26);
					var17 = true;
					break;
				}

				var36 = var20[var27][var28] + 1;
				if (var27 > 0 && var21[var27 - 1][var28] == 0 && (var33[var34 - 1][var35] & 19136782) == 0 && (var33[var34 - 1][var35 + 1] & 19136824) == 0) { // L: 184
					var22[var43] = var25 - 1; // L: 186
					var23[var43] = var26;
					var43 = var43 + 1 & var24;
					var21[var27 - 1][var28] = 2;
					var20[var27 - 1][var28] = var36;
				}

				if (var27 < var18 - 2 && var21[var27 + 1][var28] == 0 && (var33[var34 + 2][var35] & 19136899) == 0 && (var33[var34 + 2][var35 + 1] & 19136992) == 0) { // L: 192 193 195
					var22[var43] = var25 + 1; // L: 196
					var23[var43] = var26; // L: 197
					var43 = var43 + 1 & var24;
					var21[var27 + 1][var28] = 8;
					var20[var27 + 1][var28] = var36; // L: 200
				}

				if (var28 > 0 && var21[var27][var28 - 1] == 0 && (var33[var34][var35 - 1] & 19136782) == 0 && (var33[var34 + 1][var35 - 1] & 19136899) == 0) { // L: 205
					var22[var43] = var25;
					var23[var43] = var26 - 1;
					var43 = var43 + 1 & var24;
					var21[var27][var28 - 1] = 1;
					var20[var27][var28 - 1] = var36; // L: 210
				}

				if (var28 < var19 - 2 && var21[var27][var28 + 1] == 0 && (var33[var34][var35 + 2] & 19136824) == 0 && (var33[var34 + 1][var35 + 2] & 19136992) == 0) { // L: 212
					var22[var43] = var25;
					var23[var43] = var26 + 1; // L: 217
					var43 = var43 + 1 & var24;
					var21[var27][var28 + 1] = 4; // L: 219
					var20[var27][var28 + 1] = var36; // L: 220
				}

				if (var27 > 0 && var28 > 0 && var21[var27 - 1][var28 - 1] == 0 && (var33[var34 - 1][var35] & 19136830) == 0 && (var33[var34 - 1][var35 - 1] & 19136782) == 0 && (var33[var34][var35 - 1] & 19136911) == 0) { // L: 222 223 224 225 226
					var22[var43] = var25 - 1; // L: 227
					var23[var43] = var26 - 1; // L: 228
					var43 = var43 + 1 & var24; // L: 229
					var21[var27 - 1][var28 - 1] = 3; // L: 230
					var20[var27 - 1][var28 - 1] = var36; // L: 231
				}

				if (var27 < var18 - 2 && var28 > 0 && var21[var27 + 1][var28 - 1] == 0 && (var33[var34 + 1][var35 - 1] & 19136911) == 0 && (var33[var34 + 2][var35 - 1] & 19136899) == 0 && (var33[var34 + 2][var35] & 19136995) == 0) { // L: 233 234 235 236 237
					var22[var43] = var25 + 1; // L: 238
					var23[var43] = var26 - 1; // L: 239
					var43 = var43 + 1 & var24; // L: 240
					var21[var27 + 1][var28 - 1] = 9; // L: 241
					var20[var27 + 1][var28 - 1] = var36; // L: 242
				}

				if (var27 > 0 && var28 < var19 - 2 && var21[var27 - 1][var28 + 1] == 0 && (var33[var34 - 1][var35 + 1] & 19136830) == 0 && (var33[var34 - 1][var35 + 2] & 19136824) == 0 && (var33[var34][var35 + 2] & 19137016) == 0) { // L: 244 245 246 247 248
					var22[var43] = var25 - 1; // L: 249
					var23[var43] = var26 + 1; // L: 250
					var43 = var43 + 1 & var24; // L: 251
					var21[var27 - 1][var28 + 1] = 6; // L: 252
					var20[var27 - 1][var28 + 1] = var36; // L: 253
				}

				if (var27 < var18 - 2 && var28 < var19 - 2 && var21[var27 + 1][var28 + 1] == 0 && (var33[var34 + 1][var35 + 2] & 19137016) == 0 && (var33[var34 + 2][var35 + 2] & 19136992) == 0 && (var33[var34 + 2][var35 + 1] & 19136995) == 0) { // L: 255 256 257 258 259
					var22[var43] = var25 + 1; // L: 260
					var23[var43] = var26 + 1; // L: 261
					var43 = var43 + 1 & var24; // L: 262
					var21[var27 + 1][var28 + 1] = 12; // L: 263
					var20[var27 + 1][var28 + 1] = var36; // L: 264
				}
			}

			var16 = var17; // L: 270
		} else {
			var16 = class60.method1142(var0, var1, var2, var3, var4, var9); // L: 272
		}

		int var42 = var0 - (var10 >> 1); // L: 273
		var18 = var1 - (var11 >> 1); // L: 274
		var19 = var9.method4161(); // L: 275
		int var37 = var9.method4162(); // L: 276
		int var8;
		int var38;
		int var39;
		if (!var16) { // L: 277
			var38 = Integer.MAX_VALUE; // L: 279
			var39 = Integer.MAX_VALUE; // L: 280
			byte var40 = 10; // L: 281
			var24 = var3.approxDestinationX; // L: 282
			var25 = var3.approxDestinationY; // L: 283
			var26 = var3.approxDestinationSizeX; // L: 284
			var27 = var3.approxDestinationSizeY; // L: 285

			for (var28 = var24 - var40; var28 <= var24 + var40; ++var28) { // L: 286
				for (var29 = var25 - var40; var29 <= var40 + var25; ++var29) { // L: 287
					var30 = var28 - var42; // L: 288
					var43 = var29 - var18; // L: 289
					if (var30 >= 0 && var43 >= 0 && var30 < var10 && var43 < var11 && var12[var30][var43] < 100) { // L: 290 291
						var32 = 0; // L: 292
						if (var28 < var24) { // L: 293
							var32 = var24 - var28;
						} else if (var28 > var26 + var24 - 1) { // L: 294
							var32 = var28 - (var24 + var26 - 1);
						}

						int var41 = 0; // L: 295
						if (var29 < var25) { // L: 296
							var41 = var25 - var29;
						} else if (var29 > var25 + var27 - 1) { // L: 297
							var41 = var29 - (var27 + var25 - 1);
						}

						var34 = var41 * var41 + var32 * var32; // L: 298
						if (var34 < var38 || var38 == var34 && var12[var30][var43] < var39) { // L: 299
							var38 = var34; // L: 300
							var39 = var12[var30][var43]; // L: 301
							var19 = var28; // L: 302
							var37 = var29; // L: 303
						}
					}
				}
			}

			if (var38 == Integer.MAX_VALUE) { // L: 309
				var8 = -1; // L: 310
				return var8; // L: 351
			}
		}

		if (var0 == var19 && var37 == var1) { // L: 319
			var6[0] = var19; // L: 320
			var7[0] = var37; // L: 321
			var8 = 0; // L: 322
		} else {
			byte var44 = 0; // L: 325
			var14[var44] = var19; // L: 328
			var38 = var44 + 1; // L: 329
			var15[var44] = var37;

			int var45;
			for (var39 = var45 = var13[var19 - var42][var37 - var18]; var0 != var19 || var37 != var1; var39 = var13[var19 - var42][var37 - var18]) { // L: 330 331 341
				if (var39 != var45) { // L: 332
					var45 = var39; // L: 333
					var14[var38] = var19; // L: 334
					var15[var38++] = var37; // L: 335
				}

				if ((var39 & 2) != 0) { // L: 337
					++var19;
				} else if ((var39 & 8) != 0) { // L: 338
					--var19;
				}

				if ((var39 & 1) != 0) { // L: 339
					++var37;
				} else if ((var39 & 4) != 0) { // L: 340
					--var37;
				}
			}

			var24 = 0; // L: 343

			while (var38-- > 0) { // L: 344
				var6[var24] = var14[var38]; // L: 345
				var7[var24++] = var15[var38]; // L: 346
				if (var24 >= var6.length) { // L: 347
					break;
				}
			}

			var8 = var24; // L: 349
		}

		return var8;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZB)V",
		garbageValue = "117"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 177
			int var6 = (var0 + var1) / 2; // L: 178
			int var7 = var0; // L: 179
			World var8 = class20.World_worlds[var6]; // L: 180
			class20.World_worlds[var6] = class20.World_worlds[var1]; // L: 181
			class20.World_worlds[var1] = var8; // L: 182

			for (int var9 = var0; var9 < var1; ++var9) { // L: 183
				World var11 = class20.World_worlds[var9]; // L: 185
				int var12 = class215.compareWorlds(var11, var8, var2, var3); // L: 187
				int var10;
				if (var12 != 0) { // L: 188
					if (var3) { // L: 189
						var10 = -var12; // L: 190
					} else {
						var10 = var12; // L: 194
					}
				} else if (var4 == -1) { // L: 198
					var10 = 0; // L: 199
				} else {
					int var13 = class215.compareWorlds(var11, var8, var4, var5); // L: 202
					if (var5) { // L: 203
						var10 = -var13;
					} else {
						var10 = var13; // L: 204
					}
				}

				if (var10 <= 0) { // L: 206
					World var14 = class20.World_worlds[var9]; // L: 207
					class20.World_worlds[var9] = class20.World_worlds[var7]; // L: 208
					class20.World_worlds[var7++] = var14; // L: 209
				}
			}

			class20.World_worlds[var1] = class20.World_worlds[var7]; // L: 213
			class20.World_worlds[var7] = var8; // L: 214
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 215
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 216
		}

	} // L: 218
}
