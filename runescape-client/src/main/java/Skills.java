import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
@Implements("Skills")
public class Skills {
	@ObfuscatedName("aj")
	@Export("Skills_enabled")
	public static final boolean[] Skills_enabled;
	@ObfuscatedName("ac")
	@Export("Skills_experienceTable")
	public static int[] Skills_experienceTable;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 508642651
	)
	static int field3830;

	static {
		Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false}; // L: 5
		Skills_experienceTable = new int[99]; // L: 6
		int var0 = 0; // L: 9

		for (int var1 = 0; var1 < 99; ++var1) { // L: 10
			int var2 = var1 + 1; // L: 11
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D)); // L: 12
			var0 += var3; // L: 13
			Skills_experienceTable[var1] = var0 / 4; // L: 14
		}

	} // L: 16

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIILiz;Lig;Lis;B)Z",
		garbageValue = "-48"
	)
	public static final boolean method6648(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, class216 var5) {
		int var6 = var5.method4344(); // L: 134
		int var7 = var5.method4340(); // L: 135
		int[][] var8 = var5.method4347(); // L: 136
		int[][] var9 = var5.method4339(); // L: 137
		int[] var10 = var5.method4348(); // L: 138
		int[] var11 = var5.method4349(); // L: 139
		int var12 = var5.method4350(); // L: 140
		int var13 = var0; // L: 141
		int var14 = var1; // L: 142
		int var15 = var6 >> 1; // L: 143
		int var16 = var7 >> 1; // L: 144
		int var17 = var0 - var15; // L: 145
		int var18 = var1 - var16; // L: 146
		var9[var15][var16] = 99; // L: 147
		var8[var15][var16] = 0; // L: 148
		byte var19 = 0; // L: 149
		int var20 = 0; // L: 150
		var10[var19] = var0; // L: 151
		int var26 = var19 + 1; // L: 152
		var11[var19] = var1;
		int[][] var21 = var4.flags; // L: 153

		while (true) {
			label306:
			while (true) {
				int var22;
				int var23;
				int var24;
				int var25;
				do {
					do {
						do {
							label283:
							do {
								if (var26 == var20) { // L: 154
									var5.method4341(var13, var14); // L: 272
									return false; // L: 273
								}

								var13 = var10[var20]; // L: 155
								var14 = var11[var20]; // L: 156
								var20 = var20 + 1 & var12; // L: 157
								var15 = var13 - var17; // L: 158
								var16 = var14 - var18; // L: 159
								var22 = var13 - var4.xInset; // L: 160
								var23 = var14 - var4.yInset; // L: 161
								if (var3.hasArrived(var2, var13, var14, var4)) { // L: 162
									var5.method4341(var13, var14); // L: 163
									return true; // L: 164
								}

								var24 = var8[var15][var16] + 1; // L: 166
								if (var15 > 0 && var9[var15 - 1][var16] == 0 && (var21[var22 - 1][var23] & 19136782) == 0 && (var21[var22 - 1][var23 + var2 - 1] & 19136824) == 0) { // L: 167 168 169 170
									var25 = 1;

									while (true) {
										if (var25 >= var2 - 1) {
											var10[var26] = var13 - 1; // L: 174
											var11[var26] = var14; // L: 175
											var26 = var26 + 1 & var12; // L: 176
											var9[var15 - 1][var16] = 2; // L: 177
											var8[var15 - 1][var16] = var24; // L: 178
											break;
										}

										if ((var21[var22 - 1][var23 + var25] & 19136830) != 0) { // L: 172
											break;
										}

										++var25; // L: 171
									}
								}

								if (var15 < var6 - var2 && var9[var15 + 1][var16] == 0 && (var21[var22 + var2][var23] & 19136899) == 0 && (var21[var22 + var2][var23 + var2 - 1] & 19136992) == 0) { // L: 180 181 182 183
									var25 = 1;

									while (true) {
										if (var25 >= var2 - 1) {
											var10[var26] = var13 + 1; // L: 187
											var11[var26] = var14; // L: 188
											var26 = var26 + 1 & var12; // L: 189
											var9[var15 + 1][var16] = 8; // L: 190
											var8[var15 + 1][var16] = var24; // L: 191
											break;
										}

										if ((var21[var22 + var2][var23 + var25] & 19136995) != 0) { // L: 185
											break;
										}

										++var25; // L: 184
									}
								}

								if (var16 > 0 && var9[var15][var16 - 1] == 0 && (var21[var22][var23 - 1] & 19136782) == 0 && (var21[var22 + var2 - 1][var23 - 1] & 19136899) == 0) { // L: 193 194 195 196
									var25 = 1;

									while (true) {
										if (var25 >= var2 - 1) {
											var10[var26] = var13; // L: 200
											var11[var26] = var14 - 1; // L: 201
											var26 = var26 + 1 & var12; // L: 202
											var9[var15][var16 - 1] = 1; // L: 203
											var8[var15][var16 - 1] = var24; // L: 204
											break;
										}

										if ((var21[var25 + var22][var23 - 1] & 19136911) != 0) { // L: 198
											break;
										}

										++var25; // L: 197
									}
								}

								if (var16 < var7 - var2 && var9[var15][var16 + 1] == 0 && (var21[var22][var23 + var2] & 19136824) == 0 && (var21[var22 + var2 - 1][var23 + var2] & 19136992) == 0) { // L: 206 207 208 209
									var25 = 1;

									while (true) {
										if (var25 >= var2 - 1) {
											var10[var26] = var13; // L: 213
											var11[var26] = var14 + 1; // L: 214
											var26 = var26 + 1 & var12; // L: 215
											var9[var15][var16 + 1] = 4; // L: 216
											var8[var15][var16 + 1] = var24; // L: 217
											break;
										}

										if ((var21[var22 + var25][var23 + var2] & 19137016) != 0) { // L: 211
											break;
										}

										++var25; // L: 210
									}
								}

								if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && (var21[var22 - 1][var23 - 1] & 19136782) == 0) { // L: 219 220 221
									var25 = 1;

									while (true) {
										if (var25 >= var2) {
											var10[var26] = var13 - 1; // L: 226
											var11[var26] = var14 - 1; // L: 227
											var26 = var26 + 1 & var12; // L: 228
											var9[var15 - 1][var16 - 1] = 3; // L: 229
											var8[var15 - 1][var16 - 1] = var24; // L: 230
											break;
										}

										if ((var21[var22 - 1][var25 + (var23 - 1)] & 19136830) != 0 || (var21[var25 + (var22 - 1)][var23 - 1] & 19136911) != 0) { // L: 223 224
											break;
										}

										++var25; // L: 222
									}
								}

								if (var15 < var6 - var2 && var16 > 0 && var9[var15 + 1][var16 - 1] == 0 && (var21[var22 + var2][var23 - 1] & 19136899) == 0) { // L: 232 233 234
									var25 = 1;

									while (true) {
										if (var25 >= var2) {
											var10[var26] = var13 + 1; // L: 239
											var11[var26] = var14 - 1; // L: 240
											var26 = var26 + 1 & var12; // L: 241
											var9[var15 + 1][var16 - 1] = 9; // L: 242
											var8[var15 + 1][var16 - 1] = var24; // L: 243
											break;
										}

										if ((var21[var22 + var2][var25 + (var23 - 1)] & 19136995) != 0 || (var21[var25 + var22][var23 - 1] & 19136911) != 0) { // L: 236 237
											break;
										}

										++var25; // L: 235
									}
								}

								if (var15 > 0 && var16 < var7 - var2 && var9[var15 - 1][var16 + 1] == 0 && (var21[var22 - 1][var23 + var2] & 19136824) == 0) { // L: 245 246 247
									for (var25 = 1; var25 < var2; ++var25) { // L: 248
										if ((var21[var22 - 1][var23 + var25] & 19136830) != 0 || (var21[var25 + (var22 - 1)][var23 + var2] & 19137016) != 0) { // L: 249 250
											continue label283;
										}
									}

									var10[var26] = var13 - 1; // L: 252
									var11[var26] = var14 + 1; // L: 253
									var26 = var26 + 1 & var12; // L: 254
									var9[var15 - 1][var16 + 1] = 6; // L: 255
									var8[var15 - 1][var16 + 1] = var24; // L: 256
								}
							} while(var15 >= var6 - var2); // L: 258
						} while(var16 >= var7 - var2);
					} while(var9[var15 + 1][var16 + 1] != 0); // L: 259
				} while((var21[var22 + var2][var23 + var2] & 19136992) != 0); // L: 260

				for (var25 = 1; var25 < var2; ++var25) { // L: 261
					if ((var21[var25 + var22][var23 + var2] & 19137016) != 0 || (var21[var22 + var2][var23 + var25] & 19136995) != 0) { // L: 262 263
						continue label306;
					}
				}

				var10[var26] = var13 + 1; // L: 265
				var11[var26] = var14 + 1; // L: 266
				var26 = var26 + 1 & var12; // L: 267
				var9[var15 + 1][var16 + 1] = 12; // L: 268
				var8[var15 + 1][var16 + 1] = var24; // L: 269
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-34"
	)
	public static void method6650() {
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 77
		HealthBarDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 78
	} // L: 79

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(Lik;IIII)V",
		garbageValue = "1878895433"
	)
	static void method6649(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && ScriptFrame.clientPreferences.method2571() != 0) { // L: 3719
			if (var0.field2300 != null && var0.field2300.containsKey(var1)) { // L: 3720
				class383.method7203((Integer)var0.field2300.get(var1), var2, var3); // L: 3721
			}
		}
	} // L: 3722
}
