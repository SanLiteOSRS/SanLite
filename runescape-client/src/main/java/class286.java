import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
public class class286 {
	@ObfuscatedName("gm")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("f")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("v")
	int[] field3664;
	@ObfuscatedName("y")
	int[] field3665;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1113129793
	)
	int field3663;

	public class286() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field3664 = new int[2048];
		this.field3665 = new int[2048];
		this.field3663 = 0;
		class379.field4145 = new int[2000];
		int var1 = 0;
		int var2 = 240;

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) {
			var4 = class93.method2186((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.425F * (float)var1 / 16.0F + 0.075F));
			class379.field4145[var1] = var4;
			++var1;
		}

		var2 = 48;

		for (int var6 = var2 / 6; var1 < class379.field4145.length; var2 -= var6) {
			var4 = var1 * 2;

			for (int var5 = class93.method2186((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < class379.field4145.length; ++var1) {
				class379.field4145[var1] = var5;
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1586624720"
	)
	void method5250(int var1) {
		int var2 = var1 * 2 + 1;
		double[] var3 = class171.method3616(0.0D, (double)((float)var1 / 3.0F), var1);
		double var4 = var3[var1] * var3[var1];
		int[] var6 = new int[var2 * var2];
		boolean var7 = false;

		for (int var8 = 0; var8 < var2; ++var8) {
			for (int var9 = 0; var9 < var2; ++var9) {
				int var10 = var6[var9 + var2 * var8] = (int)(256.0D * (var3[var8] * var3[var9] / var4));
				if (!var7 && var10 > 0) {
					var7 = true;
				}
			}
		}

		SpritePixels var11 = new SpritePixels(var6, var2, var2);
		this.spriteMap.put(var1, var11);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)Loa;",
		garbageValue = "62"
	)
	SpritePixels method5244(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method5250(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1758461055"
	)
	public final void method5245(int var1, int var2) {
		if (this.field3663 < this.field3664.length) {
			this.field3664[this.field3663] = var1;
			this.field3665[this.field3663] = var2;
			++this.field3663;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-633875575"
	)
	public final void method5246() {
		this.field3663 = 0;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IILoa;FB)V",
		garbageValue = "12"
	)
	public final void method5247(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4);
		SpritePixels var6 = this.method5244(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field3663; ++var10) {
			var11 = this.field3664[var10];
			var12 = this.field3665[var10];
			int var13 = (int)(var4 * (float)(var11 - var1)) - var5;
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method6009(var8, var9);
			this.method5243(var6, var3, var9);
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
					if (var11 > class379.field4145.length) {
						var11 = class379.field4145.length;
					}

					var12 = class379.field4145[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Loa;Loa;Llw;I)V",
		garbageValue = "1918246887"
	)
	void method5243(SpritePixels var1, SpritePixels var2, Bounds var3) {
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
