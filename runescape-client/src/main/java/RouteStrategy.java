import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = 1077493760
	)
	static int field2198;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 58129171
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -980043277
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -393157049
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 312616933
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIILgl;B)Z",
		garbageValue = "57"
	)
	@Export("hasArrived")
	public abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ldj;[F[FB)V",
		garbageValue = "0"
	)
	static void method3813(class117 var0, float[] var1, float[] var2) {
		if (var0 != null) { // L: 247
			float var3 = var1[3] - var1[0]; // L: 250
			if ((double)var3 != 0.0D) { // L: 251
				float var4 = var1[1] - var1[0]; // L: 254
				float var5 = var1[2] - var1[0]; // L: 255
				Float var6 = var4 / var3; // L: 256
				Float var7 = var5 / var3; // L: 257
				var0.field1442 = var6 == 0.33333334F && var7 == 0.6666667F; // L: 258
				float var8 = var6;
				float var9 = var7;
				if ((double)var6 < 0.0D) {
					var6 = 0.0F;
				}

				if ((double)var7 > 1.0D) { // L: 262
					var7 = 1.0F;
				}

				if ((double)var6 > 1.0D || var7 < -1.0F) {
					Float var10 = var6; // L: 264
					Float var11 = 1.0F - var7; // L: 267
					if (var6 < 0.0F) { // L: 268
						var10 = 0.0F;
					}

					if (var11 < 0.0F) { // L: 269
						var11 = 0.0F;
					}

					if (var10 > 1.0F || var11 > 1.0F) { // L: 270
						float var12 = (float)((double)(var10 * (var10 - 2.0F + var11)) + (double)var11 * ((double)var11 - 2.0D) + 1.0D); // L: 271
						if (var12 + class114.field1410 > 0.0F) { // L: 272
							class143.method3003(var10, var11); // L: 273
						}
					}

					var11 = 1.0F - var11; // L: 276
				}

				if (var6 != var8) { // L: 279
					var1[1] = var1[0] + var6 * var3; // L: 280
					if (0.0D != (double)var8) { // L: 281
						var2[1] = var2[0] + (var2[1] - var2[0]) * var6 / var8; // L: 282
					}
				}

				if (var7 != var9) { // L: 285
					var1[2] = var1[0] + var7 * var3; // L: 286
					if (1.0D != (double)var9) { // L: 287
						var2[2] = (float)((double)var2[3] - (double)(var2[3] - var2[2]) * (1.0D - (double)var7) / (1.0D - (double)var9)); // L: 288
					}
				}

				var0.field1437 = var1[0]; // L: 291
				var0.field1444 = var1[3]; // L: 292
				SpotAnimationDefinition.method3448(0.0F, var6, var7, 1.0F, var0.field1445); // L: 293
				SpotAnimationDefinition.method3448(var2[0], var2[1], var2[2], var2[3], var0.field1440); // L: 294
			}
		}
	} // L: 248 252 295

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "7"
	)
	public static int[] method3814() {
		int[] var0 = new int[KeyHandler.field138]; // L: 259

		for (int var1 = 0; var1 < KeyHandler.field138; ++var1) { // L: 260
			var0[var1] = KeyHandler.field137[var1]; // L: 261
		}

		return var0; // L: 263
	}

	@ObfuscatedName("jj")
	static final void method3811(double var0) {
		Rasterizer3D.Rasterizer3D_setBrightness(var0); // L: 11610
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(var0); // L: 11611
		class269.method5150(); // L: 11612
		FriendsChatMember.clientPreferences.method2234(var0); // L: 11613
	} // L: 11614
}
