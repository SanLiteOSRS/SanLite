import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
public class class456 implements class345 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	public static final class456 field4874;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	public static final class456 field4870;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	public static final class456 field4871;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1157568029
	)
	public final int field4872;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 984459831
	)
	public final int field4876;
	@ObfuscatedName("q")
	public final Class field4875;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	final class452 field4869;

	static {
		field4874 = new class456(0, 0, Integer.class, new class453()); // L: 10
		field4870 = new class456(2, 1, Long.class, new class455()); // L: 24
		field4871 = new class456(1, 2, String.class, new class457()); // L: 38
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lqu;)V"
	)
	class456(int var1, int var2, Class var3, class452 var4) {
		this.field4872 = var1; // L: 62
		this.field4876 = var2; // L: 63
		this.field4875 = var3; // L: 64
		this.field4869 = var4; // L: 65
	} // L: 66

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "96"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4876; // L: 96
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)Ljava/lang/Object;",
		garbageValue = "-667358219"
	)
	public Object method8396(Buffer var1) {
		return this.field4869.vmethod8414(var1); // L: 100
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(S)[Lqr;",
		garbageValue = "155"
	)
	public static class456[] method8407() {
		return new class456[]{field4874, field4870, field4871}; // L: 58
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-107"
	)
	static String method8410(int var0) {
		return "<img=" + var0 + ">"; // L: 18
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IILgg;Lgw;I)Z",
		garbageValue = "-2047038701"
	)
	static final boolean method8411(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0; // L: 223
		int var5 = var1; // L: 224
		byte var6 = 64; // L: 225
		byte var7 = 64; // L: 226
		int var8 = var0 - var6; // L: 227
		int var9 = var1 - var7; // L: 228
		class205.directions[var6][var7] = 99; // L: 229
		class205.distances[var6][var7] = 0; // L: 230
		byte var10 = 0; // L: 231
		int var11 = 0; // L: 232
		class205.bufferX[var10] = var0; // L: 233
		byte var10001 = var10;
		int var18 = var10 + 1;
		class205.bufferY[var10001] = var1; // L: 234
		int[][] var12 = var3.flags; // L: 235

		while (var18 != var11) { // L: 238
			var4 = class205.bufferX[var11]; // L: 239
			var5 = class205.bufferY[var11]; // L: 240
			var11 = var11 + 1 & 4095; // L: 241
			int var16 = var4 - var8; // L: 242
			int var17 = var5 - var9; // L: 243
			int var13 = var4 - var3.xInset; // L: 244
			int var14 = var5 - var3.yInset; // L: 245
			if (var2.hasArrived(1, var4, var5, var3)) { // L: 246
				class205.field2359 = var4; // L: 247
				class205.field2364 = var5; // L: 248
				return true; // L: 249
			}

			int var15 = class205.distances[var16][var17] + 1; // L: 251
			if (var16 > 0 && class205.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136776) == 0) { // L: 252
				class205.bufferX[var18] = var4 - 1; // L: 253
				class205.bufferY[var18] = var5; // L: 254
				var18 = var18 + 1 & 4095; // L: 255
				class205.directions[var16 - 1][var17] = 2; // L: 256
				class205.distances[var16 - 1][var17] = var15; // L: 257
			}

			if (var16 < 127 && class205.directions[var16 + 1][var17] == 0 && (var12[var13 + 1][var14] & 19136896) == 0) { // L: 259
				class205.bufferX[var18] = var4 + 1; // L: 260
				class205.bufferY[var18] = var5; // L: 261
				var18 = var18 + 1 & 4095; // L: 262
				class205.directions[var16 + 1][var17] = 8; // L: 263
				class205.distances[var16 + 1][var17] = var15; // L: 264
			}

			if (var17 > 0 && class205.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 266
				class205.bufferX[var18] = var4; // L: 267
				class205.bufferY[var18] = var5 - 1; // L: 268
				var18 = var18 + 1 & 4095; // L: 269
				class205.directions[var16][var17 - 1] = 1; // L: 270
				class205.distances[var16][var17 - 1] = var15; // L: 271
			}

			if (var17 < 127 && class205.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 273
				class205.bufferX[var18] = var4; // L: 274
				class205.bufferY[var18] = var5 + 1; // L: 275
				var18 = var18 + 1 & 4095; // L: 276
				class205.directions[var16][var17 + 1] = 4; // L: 277
				class205.distances[var16][var17 + 1] = var15; // L: 278
			}

			if (var16 > 0 && var17 > 0 && class205.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 280
				class205.bufferX[var18] = var4 - 1; // L: 281
				class205.bufferY[var18] = var5 - 1; // L: 282
				var18 = var18 + 1 & 4095; // L: 283
				class205.directions[var16 - 1][var17 - 1] = 3; // L: 284
				class205.distances[var16 - 1][var17 - 1] = var15; // L: 285
			}

			if (var16 < 127 && var17 > 0 && class205.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 287
				class205.bufferX[var18] = var4 + 1; // L: 288
				class205.bufferY[var18] = var5 - 1; // L: 289
				var18 = var18 + 1 & 4095; // L: 290
				class205.directions[var16 + 1][var17 - 1] = 9; // L: 291
				class205.distances[var16 + 1][var17 - 1] = var15; // L: 292
			}

			if (var16 > 0 && var17 < 127 && class205.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 294
				class205.bufferX[var18] = var4 - 1; // L: 295
				class205.bufferY[var18] = var5 + 1; // L: 296
				var18 = var18 + 1 & 4095; // L: 297
				class205.directions[var16 - 1][var17 + 1] = 6; // L: 298
				class205.distances[var16 - 1][var17 + 1] = var15; // L: 299
			}

			if (var16 < 127 && var17 < 127 && class205.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 1] & 19136992) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 301
				class205.bufferX[var18] = var4 + 1; // L: 302
				class205.bufferY[var18] = var5 + 1; // L: 303
				var18 = var18 + 1 & 4095; // L: 304
				class205.directions[var16 + 1][var17 + 1] = 12; // L: 305
				class205.distances[var16 + 1][var17 + 1] = var15; // L: 306
			}
		}

		class205.field2359 = var4; // L: 309
		class205.field2364 = var5; // L: 310
		return false; // L: 311
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;B)Lqr;",
		garbageValue = "56"
	)
	public static class456 method8394(Class var0) {
		class456[] var1 = method8407(); // L: 70

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 71
			class456 var3 = var1[var2]; // L: 72
			if (var3.field4875 == var0) {
				return var3; // L: 74
			}
		}

		return null; // L: 78
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lqy;I)V",
		garbageValue = "383102179"
	)
	public static void method8395(Object var0, Buffer var1) {
		class452 var2 = method8408(var0.getClass()); // L: 83
		var2.vmethod8422(var0, var1); // L: 84
	} // L: 85

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;B)Lqu;",
		garbageValue = "-2"
	)
	static class452 method8408(Class var0) {
		class456 var1 = method8394(var0); // L: 89
		if (var1 == null) {
			throw new IllegalArgumentException(); // L: 90
		} else {
			return var1.field4869; // L: 91
		}
	}
}
