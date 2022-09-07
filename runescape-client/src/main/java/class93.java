import java.util.List;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cr")
public class class93 {
	@ObfuscatedName("ul")
	static List field1281;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -340699385
	)
	int field1277;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 882908169
	)
	int field1276;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1947140465
	)
	int field1279;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -23287801
	)
	int field1278;

	class93(int var1, int var2, int var3, int var4) {
		this.field1277 = var1; // L: 10
		this.field1276 = var2; // L: 11
		this.field1279 = var3; // L: 12
		this.field1278 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "5"
	)
	int method2354() {
		return this.field1277; // L: 17
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2096471202"
	)
	int method2346() {
		return this.field1276; // L: 21
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-23"
	)
	int method2352() {
		return this.field1279; // L: 25
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-82"
	)
	int method2347() {
		return this.field1278; // L: 29
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "-19"
	)
	static int method2345(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) { // L: 3058
			Nameable.Interpreter_intStackSize -= 2; // L: 3059
			var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3060
			var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3061
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var4 + var3; // L: 3062
			return 1; // L: 3063
		} else if (var0 == ScriptOpcodes.SUB) { // L: 3065
			Nameable.Interpreter_intStackSize -= 2; // L: 3066
			var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3067
			var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3068
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3 - var4; // L: 3069
			return 1; // L: 3070
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 3072
			Nameable.Interpreter_intStackSize -= 2; // L: 3073
			var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3074
			var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3075
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3 * var4; // L: 3076
			return 1; // L: 3077
		} else if (var0 == ScriptOpcodes.DIV) { // L: 3079
			Nameable.Interpreter_intStackSize -= 2; // L: 3080
			var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3081
			var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3082
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3 / var4; // L: 3083
			return 1; // L: 3084
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 3086
			var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3087
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3); // L: 3088
			return 1; // L: 3089
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 3091
			var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3092
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1)); // L: 3093
			return 1; // L: 3094
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 3096
				Nameable.Interpreter_intStackSize -= 5; // L: 3097
				var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3098
				var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3099
				var5 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 2]; // L: 3100
				var6 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 3]; // L: 3101
				var7 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 4]; // L: 3102
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5); // L: 3103
				return 1; // L: 3104
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 3106
				Nameable.Interpreter_intStackSize -= 2; // L: 3107
				var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3108
				var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3109
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3 + var3 * var4 / 100; // L: 3110
				return 1; // L: 3111
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 3113
				Nameable.Interpreter_intStackSize -= 2; // L: 3114
				var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3115
				var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3116
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3 | 1 << var4; // L: 3117
				return 1; // L: 3118
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 3120
				Nameable.Interpreter_intStackSize -= 2; // L: 3121
				var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3122
				var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3123
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4); // L: 3124
				return 1; // L: 3125
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 3127
				Nameable.Interpreter_intStackSize -= 2; // L: 3128
				var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3129
				var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3130
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0; // L: 3131
				return 1; // L: 3132
			} else if (var0 == ScriptOpcodes.MOD) { // L: 3134
				Nameable.Interpreter_intStackSize -= 2; // L: 3135
				var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3136
				var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3137
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3 % var4; // L: 3138
				return 1; // L: 3139
			} else if (var0 == ScriptOpcodes.POW) { // L: 3141
				Nameable.Interpreter_intStackSize -= 2; // L: 3142
				var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3143
				var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3144
				if (var3 == 0) { // L: 3145
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4); // L: 3146
				}

				return 1; // L: 3147
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 3149
				Nameable.Interpreter_intStackSize -= 2; // L: 3150
				var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3151
				var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3152
				if (var3 == 0) { // L: 3153
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 3154
					return 1; // L: 3155
				} else {
					switch(var4) { // L: 3157
					case 0:
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 3185
						break;
					case 1:
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3; // L: 3160
						break;
					case 2:
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3); // L: 3165
						break; // L: 3166
					case 3:
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3); // L: 3170
						break; // L: 3171
					case 4:
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3)); // L: 3175
						break; // L: 3176
					default:
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4); // L: 3180
					}

					return 1; // L: 3189
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 3191
				Nameable.Interpreter_intStackSize -= 2; // L: 3192
				var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3193
				var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3194
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3 & var4; // L: 3195
				return 1; // L: 3196
			} else if (var0 == ScriptOpcodes.OR) { // L: 3198
				Nameable.Interpreter_intStackSize -= 2; // L: 3199
				var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3200
				var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3201
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3 | var4; // L: 3202
				return 1; // L: 3203
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 3205
				Nameable.Interpreter_intStackSize -= 3; // L: 3206
				long var9 = (long)Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3207
				long var11 = (long)Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3208
				long var13 = (long)Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 2]; // L: 3209
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = (int)(var9 * var13 / var11); // L: 3210
				return 1; // L: 3211
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 3213
				var3 = WorldMapManager.method4750(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 3214
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3; // L: 3215
				return 1; // L: 3216
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 3218
				Nameable.Interpreter_intStackSize -= 2; // L: 3219
				var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3220
				var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3221
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3 ^ 1 << var4; // L: 3222
				return 1; // L: 3223
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 3225
				Nameable.Interpreter_intStackSize -= 3; // L: 3226
				var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3227
				var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3228
				var5 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 2]; // L: 3229
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Tile.method3935(var3, var4, var5); // L: 3230
				return 1; // L: 3231
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3233
				Nameable.Interpreter_intStackSize -= 3; // L: 3234
				var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3235
				var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3236
				var5 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 2]; // L: 3237
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = NPC.method2334(var3, var4, var5); // L: 3238
				return 1; // L: 3239
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3241
				Nameable.Interpreter_intStackSize -= 3; // L: 3242
				var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3243
				var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3244
				var5 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 2]; // L: 3245
				var6 = 31 - var5; // L: 3246
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3 << var6 >>> var6 + var4; // L: 3247
				return 1; // L: 3248
			} else if (var0 == 4030) { // L: 3250
				Nameable.Interpreter_intStackSize -= 4; // L: 3251
				var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3252
				var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3253
				var5 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 2]; // L: 3254
				var6 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 3]; // L: 3255
				var3 = NPC.method2334(var3, var5, var6); // L: 3256
				var7 = class14.method171(var6 - var5 + 1); // L: 3257
				if (var4 > var7) { // L: 3258
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3 | var4 << var5; // L: 3259
				return 1; // L: 3260
			} else if (var0 == 4032) { // L: 3262
				Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize - 1] = class16.method205(Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize - 1]); // L: 3263
				return 1; // L: 3264
			} else if (var0 == 4033) { // L: 3266
				Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize - 1] = WorldMapLabelSize.method4459(Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize - 1]); // L: 3267
				return 1; // L: 3268
			} else if (var0 == 4034) { // L: 3270
				Nameable.Interpreter_intStackSize -= 2; // L: 3271
				var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3272
				var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3273
				var5 = class343.method6236(var3, var4); // L: 3274
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var5; // L: 3275
				return 1; // L: 3276
			} else if (var0 == 4035) { // L: 3278
				Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize - 1]); // L: 3279
				return 1; // L: 3280
			} else {
				return 2; // L: 3282
			}
		}
	}
}
