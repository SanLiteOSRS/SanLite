import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
public class class88 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IILia;Lif;I)Z",
		garbageValue = "1568495332"
	)
	static final boolean method2359(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0; // L: 223
		int var5 = var1; // L: 224
		byte var6 = 64; // L: 225
		byte var7 = 64; // L: 226
		int var8 = var0 - var6; // L: 227
		int var9 = var1 - var7; // L: 228
		class211.directions[var6][var7] = 99; // L: 229
		class211.distances[var6][var7] = 0; // L: 230
		byte var10 = 0; // L: 231
		int var11 = 0; // L: 232
		class211.bufferX[var10] = var0; // L: 233
		byte var10001 = var10;
		int var18 = var10 + 1;
		class211.bufferY[var10001] = var1; // L: 234
		int[][] var12 = var3.flags; // L: 235

		while (var11 != var18) { // L: 238
			var4 = class211.bufferX[var11]; // L: 239
			var5 = class211.bufferY[var11]; // L: 240
			var11 = var11 + 1 & 4095; // L: 241
			int var16 = var4 - var8; // L: 242
			int var17 = var5 - var9; // L: 243
			int var13 = var4 - var3.xInset; // L: 244
			int var14 = var5 - var3.yInset; // L: 245
			if (var2.hasArrived(1, var4, var5, var3)) { // L: 246
				class18.field94 = var4; // L: 247
				class397.field4534 = var5; // L: 248
				return true; // L: 249
			}

			int var15 = class211.distances[var16][var17] + 1; // L: 251
			if (var16 > 0 && class211.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136776) == 0) { // L: 252
				class211.bufferX[var18] = var4 - 1; // L: 253
				class211.bufferY[var18] = var5; // L: 254
				var18 = var18 + 1 & 4095; // L: 255
				class211.directions[var16 - 1][var17] = 2; // L: 256
				class211.distances[var16 - 1][var17] = var15; // L: 257
			}

			if (var16 < 127 && class211.directions[var16 + 1][var17] == 0 && (var12[var13 + 1][var14] & 19136896) == 0) { // L: 259
				class211.bufferX[var18] = var4 + 1; // L: 260
				class211.bufferY[var18] = var5; // L: 261
				var18 = var18 + 1 & 4095; // L: 262
				class211.directions[var16 + 1][var17] = 8; // L: 263
				class211.distances[var16 + 1][var17] = var15; // L: 264
			}

			if (var17 > 0 && class211.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 266
				class211.bufferX[var18] = var4; // L: 267
				class211.bufferY[var18] = var5 - 1; // L: 268
				var18 = var18 + 1 & 4095; // L: 269
				class211.directions[var16][var17 - 1] = 1; // L: 270
				class211.distances[var16][var17 - 1] = var15; // L: 271
			}

			if (var17 < 127 && class211.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 273
				class211.bufferX[var18] = var4; // L: 274
				class211.bufferY[var18] = var5 + 1; // L: 275
				var18 = var18 + 1 & 4095; // L: 276
				class211.directions[var16][var17 + 1] = 4; // L: 277
				class211.distances[var16][var17 + 1] = var15; // L: 278
			}

			if (var16 > 0 && var17 > 0 && class211.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 280
				class211.bufferX[var18] = var4 - 1; // L: 281
				class211.bufferY[var18] = var5 - 1; // L: 282
				var18 = var18 + 1 & 4095; // L: 283
				class211.directions[var16 - 1][var17 - 1] = 3; // L: 284
				class211.distances[var16 - 1][var17 - 1] = var15; // L: 285
			}

			if (var16 < 127 && var17 > 0 && class211.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 287
				class211.bufferX[var18] = var4 + 1; // L: 288
				class211.bufferY[var18] = var5 - 1; // L: 289
				var18 = var18 + 1 & 4095; // L: 290
				class211.directions[var16 + 1][var17 - 1] = 9; // L: 291
				class211.distances[var16 + 1][var17 - 1] = var15; // L: 292
			}

			if (var16 > 0 && var17 < 127 && class211.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 294
				class211.bufferX[var18] = var4 - 1; // L: 295
				class211.bufferY[var18] = var5 + 1; // L: 296
				var18 = var18 + 1 & 4095; // L: 297
				class211.directions[var16 - 1][var17 + 1] = 6; // L: 298
				class211.distances[var16 - 1][var17 + 1] = var15; // L: 299
			}

			if (var16 < 127 && var17 < 127 && class211.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 1] & 19136992) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 301
				class211.bufferX[var18] = var4 + 1; // L: 302
				class211.bufferY[var18] = var5 + 1; // L: 303
				var18 = var18 + 1 & 4095; // L: 304
				class211.directions[var16 + 1][var17 + 1] = 12; // L: 305
				class211.distances[var16 + 1][var17 + 1] = var15; // L: 306
			}
		}

		class18.field94 = var4; // L: 309
		class397.field4534 = var5; // L: 310
		return false; // L: 311
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(I)Lrb;",
		garbageValue = "1134308322"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return class126.worldMap; // L: 717
	}
}
