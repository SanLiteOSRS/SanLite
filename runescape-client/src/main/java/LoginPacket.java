import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("LoginPacket")
public class LoginPacket implements class293 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static final LoginPacket field3365;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	static final LoginPacket field3364;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static final LoginPacket field3359;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static final LoginPacket field3360;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static final LoginPacket field3361;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	static final LoginPacket field3362;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Llk;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -85411471
	)
	@Export("id")
	public final int id;

	static {
		field3365 = new LoginPacket(14, 0); // L: 5
		field3364 = new LoginPacket(15, 4); // L: 6
		field3359 = new LoginPacket(16, -2); // L: 7
		field3360 = new LoginPacket(18, -2); // L: 8
		field3361 = new LoginPacket(19, -2); // L: 9
		field3362 = new LoginPacket(27, 0); // L: 10
		LoginPacket_indexedValues = new LoginPacket[32]; // L: 12
		LoginPacket[] var0 = new LoginPacket[]{field3365, field3364, field3360, field3362, field3361, field3359}; // L: 17
		LoginPacket[] var1 = var0; // L: 19

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 20
			LoginPacket_indexedValues[var1[var2].id] = var1[var2]; // L: 21
		}

	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1; // L: 26
	} // L: 27

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IILiw;Lis;Lij;S)Z",
		garbageValue = "24346"
	)
	static final boolean method5713(int var0, int var1, RouteStrategy var2, CollisionMap var3, class216 var4) {
		int var5 = var4.method4199(); // L: 195
		int var6 = var4.method4216(); // L: 196
		int[][] var7 = var4.method4202(); // L: 197
		int[][] var8 = var4.method4222(); // L: 198
		int[] var9 = var4.method4203(); // L: 199
		int[] var10 = var4.method4204(); // L: 200
		int var11 = var4.method4205(); // L: 201
		int var12 = var0; // L: 202
		int var13 = var1; // L: 203
		int var14 = var5 >> 1; // L: 204
		int var15 = var6 >> 1; // L: 205
		int var16 = var0 - var14; // L: 206
		int var17 = var1 - var15; // L: 207
		var8[var14][var15] = 99; // L: 208
		var7[var14][var15] = 0; // L: 209
		byte var18 = 0; // L: 210
		int var19 = 0; // L: 211
		var9[var18] = var0; // L: 212
		byte var10001 = var18;
		int var24 = var18 + 1; // L: 213
		var10[var10001] = var1;
		int[][] var20 = var3.flags; // L: 214

		while (var19 != var24) { // L: 215
			var12 = var9[var19]; // L: 216
			var13 = var10[var19]; // L: 217
			var19 = var19 + 1 & var11; // L: 218
			var14 = var12 - var16; // L: 219
			var15 = var13 - var17; // L: 220
			int var21 = var12 - var3.xInset; // L: 221
			int var22 = var13 - var3.yInset; // L: 222
			if (var2.hasArrived(2, var12, var13, var3)) { // L: 223
				var4.method4196(var12, var13); // L: 224
				return true; // L: 225
			}

			int var23 = var7[var14][var15] + 1; // L: 227
			if (var14 > 0 && var8[var14 - 1][var15] == 0 && (var20[var21 - 1][var22] & 19136782) == 0 && (var20[var21 - 1][var22 + 1] & 19136824) == 0) { // L: 228 229 230 231
				var9[var24] = var12 - 1; // L: 232
				var10[var24] = var13; // L: 233
				var24 = var24 + 1 & var11; // L: 234
				var8[var14 - 1][var15] = 2; // L: 235
				var7[var14 - 1][var15] = var23; // L: 236
			}

			if (var14 < var5 - 2 && var8[var14 + 1][var15] == 0 && (var20[var21 + 2][var22] & 19136899) == 0 && (var20[var21 + 2][var22 + 1] & 19136992) == 0) { // L: 238 239 240 241
				var9[var24] = var12 + 1; // L: 242
				var10[var24] = var13; // L: 243
				var24 = var24 + 1 & var11; // L: 244
				var8[var14 + 1][var15] = 8; // L: 245
				var7[var14 + 1][var15] = var23; // L: 246
			}

			if (var15 > 0 && var8[var14][var15 - 1] == 0 && (var20[var21][var22 - 1] & 19136782) == 0 && (var20[var21 + 1][var22 - 1] & 19136899) == 0) { // L: 248 249 250 251
				var9[var24] = var12; // L: 252
				var10[var24] = var13 - 1; // L: 253
				var24 = var24 + 1 & var11; // L: 254
				var8[var14][var15 - 1] = 1; // L: 255
				var7[var14][var15 - 1] = var23; // L: 256
			}

			if (var15 < var6 - 2 && var8[var14][var15 + 1] == 0 && (var20[var21][var22 + 2] & 19136824) == 0 && (var20[var21 + 1][var22 + 2] & 19136992) == 0) { // L: 258 259 260 261
				var9[var24] = var12; // L: 262
				var10[var24] = var13 + 1; // L: 263
				var24 = var24 + 1 & var11; // L: 264
				var8[var14][var15 + 1] = 4; // L: 265
				var7[var14][var15 + 1] = var23; // L: 266
			}

			if (var14 > 0 && var15 > 0 && var8[var14 - 1][var15 - 1] == 0 && (var20[var21 - 1][var22] & 19136830) == 0 && (var20[var21 - 1][var22 - 1] & 19136782) == 0 && (var20[var21][var22 - 1] & 19136911) == 0) { // L: 268 269 270 271 272
				var9[var24] = var12 - 1; // L: 273
				var10[var24] = var13 - 1; // L: 274
				var24 = var24 + 1 & var11; // L: 275
				var8[var14 - 1][var15 - 1] = 3; // L: 276
				var7[var14 - 1][var15 - 1] = var23; // L: 277
			}

			if (var14 < var5 - 2 && var15 > 0 && var8[var14 + 1][var15 - 1] == 0 && (var20[var21 + 1][var22 - 1] & 19136911) == 0 && (var20[var21 + 2][var22 - 1] & 19136899) == 0 && (var20[var21 + 2][var22] & 19136995) == 0) { // L: 279 280 281 282 283
				var9[var24] = var12 + 1; // L: 284
				var10[var24] = var13 - 1; // L: 285
				var24 = var24 + 1 & var11; // L: 286
				var8[var14 + 1][var15 - 1] = 9; // L: 287
				var7[var14 + 1][var15 - 1] = var23; // L: 288
			}

			if (var14 > 0 && var15 < var6 - 2 && var8[var14 - 1][var15 + 1] == 0 && (var20[var21 - 1][var22 + 1] & 19136830) == 0 && (var20[var21 - 1][var22 + 2] & 19136824) == 0 && (var20[var21][var22 + 2] & 19137016) == 0) { // L: 290 291 292 293 294
				var9[var24] = var12 - 1; // L: 295
				var10[var24] = var13 + 1; // L: 296
				var24 = var24 + 1 & var11; // L: 297
				var8[var14 - 1][var15 + 1] = 6; // L: 298
				var7[var14 - 1][var15 + 1] = var23; // L: 299
			}

			if (var14 < var5 - 2 && var15 < var6 - 2 && var8[var14 + 1][var15 + 1] == 0 && (var20[var21 + 1][var22 + 2] & 19137016) == 0 && (var20[var21 + 2][var22 + 2] & 19136992) == 0 && (var20[var21 + 2][var22 + 1] & 19136995) == 0) { // L: 301 302 303 304 305
				var9[var24] = var12 + 1; // L: 306
				var10[var24] = var13 + 1; // L: 307
				var24 = var24 + 1 & var11; // L: 308
				var8[var14 + 1][var15 + 1] = 12; // L: 309
				var7[var14 + 1][var15 + 1] = var23; // L: 310
			}
		}

		var4.method4196(var12, var13); // L: 313
		return false; // L: 314
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Lnu;IIB)Lpi;",
		garbageValue = "69"
	)
	public static Font method5712(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		return !ApproximateRouteStrategy.method1228(var0, var2, var3) ? null : HealthBarDefinition.method3642(var1.takeFile(var2, var3)); // L: 38 39
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BIB)I",
		garbageValue = "88"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 99

		for (int var6 = 0; var6 < var5; ++var6) { // L: 100
			char var7 = var0.charAt(var6 + var1); // L: 101
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 102
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 103
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 104
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 105
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 106
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 107
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 108
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 109
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120; // L: 110
			} else if (var7 == 8240) { // L: 111
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 112
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 113
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 114
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 115
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 116
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 117
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 118
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 119
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 120
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) { // L: 121
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) { // L: 122
				var3[var6 + var4] = -105;
			} else if (var7 == 732) { // L: 123
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 124
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 125
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 126
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 127
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 128
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 129
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 130
			}
		}

		return var5; // L: 132
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-245858333"
	)
	static void method5710() {
		ItemContainer.itemContainers = new NodeHashTable(32); // L: 78
	} // L: 79
}
