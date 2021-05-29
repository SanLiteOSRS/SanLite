import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
public class class285 {
	@ObfuscatedName("v")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("f")
	int[] field3664;
	@ObfuscatedName("y")
	int[] field3665;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 686309897
	)
	int field3666;

	public class285() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field3664 = new int[2048];
		this.field3665 = new int[2048];
		this.field3666 = 0;
		WorldMapID.field2112 = new int[2000];
		int var1 = 0;
		int var2 = 240;

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) {
			var4 = WorldMapRegion.method3437((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.075F + (float)var1 * 0.425F / 16.0F));
			WorldMapID.field2112[var1] = var4;
			++var1;
		}

		var2 = 48;

		for (int var6 = var2 / 6; var1 < WorldMapID.field2112.length; var2 -= var6) {
			var4 = var1 * 2;

			for (int var5 = WorldMapRegion.method3437((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < WorldMapID.field2112.length; ++var1) {
				WorldMapID.field2112[var1] = var5;
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-969189545"
	)
	void method5113(int var1) {
		int var2 = var1 * 2 + 1;
		double var4 = (double)((float)var1 / 3.0F);
		int var6 = var1 * 2 + 1;
		double[] var7 = new double[var6];
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			var7[var9] = class13.method182((double)var8, 0.0D, var4);
			++var8;
		}

		double[] var14 = var7;
		double var15 = var7[var1] * var7[var1];
		int[] var17 = new int[var2 * var2];
		boolean var10 = false;

		for (int var11 = 0; var11 < var2; ++var11) {
			for (int var12 = 0; var12 < var2; ++var12) {
				int var13 = var17[var12 + var11 * var2] = (int)(var14[var12] * var14[var11] / var15 * 256.0D);
				if (!var10 && var13 > 0) {
					var10 = true;
				}
			}
		}

		SpritePixels var18 = new SpritePixels(var17, var2, var2);
		this.spriteMap.put(var1, var18);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Loh;",
		garbageValue = "-158733567"
	)
	SpritePixels method5115(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method5113(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "14"
	)
	public final void method5117(int var1, int var2) {
		if (this.field3666 < this.field3664.length) {
			this.field3664[this.field3666] = var1;
			this.field3665[this.field3666] = var2;
			++this.field3666;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2075850075"
	)
	public final void method5126() {
		this.field3666 = 0;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IILoh;FI)V",
		garbageValue = "-7099286"
	)
	public final void method5116(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4);
		SpritePixels var6 = this.method5115(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field3666; ++var10) {
			var11 = this.field3664[var10];
			var12 = this.field3665[var10];
			int var13 = (int)((float)(var11 - var1) * var4) - var5;
			int var14 = (int)((float)var3.subHeight - var4 * (float)(var12 - var2)) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method5977(var8, var9);
			this.method5118(var6, var3, var9);
		}

		System.nanoTime();
		System.nanoTime();

		for (var10 = 0; var10 < var3.pixels.length; ++var10) {
			if (var3.pixels[var10] == 0) {
				var3.pixels[var10] = -16777216;
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256;
				if (var11 <= 0) {
					var3.pixels[var10] = -16777216;
				} else {
					if (var11 > WorldMapID.field2112.length) {
						var11 = WorldMapID.field2112.length;
					}

					var12 = WorldMapID.field2112[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Loh;Loh;Lli;I)V",
		garbageValue = "1348286634"
	)
	void method5118(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) {
			int var4 = 0;
			int var5 = 0;
			if (var3.lowX == 0) {
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) {
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth;
			int var7 = var2.subWidth * var3.lowY + var3.lowX;

			for (int var8 = 0; var8 < var3.highY; ++var8) {
				for (int var9 = 0; var9 < var3.highX; ++var9) {
					int[] var10000 = var2.pixels;
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX;
				var7 += var2.subWidth - var3.highX;
			}

		}
	}
}
