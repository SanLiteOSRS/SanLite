import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
public class class285 {
	@ObfuscatedName("b")
	static int[] field3675;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("h")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("o")
	int[] field3676;
	@ObfuscatedName("g")
	int[] field3677;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2117277323
	)
	int field3678;

	public class285() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field3676 = new int[2048];
		this.field3677 = new int[2048];
		this.field3678 = 0;
		ClientPacket.method4299();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-70"
	)
	void method5035(int var1) {
		int var2 = var1 * 2 + 1;
		double var4 = (double)((float)var1 / 3.0F);
		int var6 = var1 * 2 + 1;
		double[] var7 = new double[var6];
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			var7[var9] = PacketWriter.method2400((double)var8, 0.0D, var4);
			++var8;
		}

		double[] var14 = var7;
		double var15 = var7[var1] * var7[var1];
		int[] var17 = new int[var2 * var2];
		boolean var10 = false;

		for (int var11 = 0; var11 < var2; ++var11) {
			for (int var12 = 0; var12 < var2; ++var12) {
				int var13 = var17[var12 + var11 * var2] = (int)(256.0D * (var14[var12] * var14[var11] / var15));
				if (!var10 && var13 > 0) {
					var10 = true;
				}
			}
		}

		SpritePixels var18 = new SpritePixels(var17, var2, var2);
		this.spriteMap.put(var1, var18);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Low;",
		garbageValue = "1393112133"
	)
	SpritePixels method5051(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method5035(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "152070039"
	)
	public final void method5037(int var1, int var2) {
		if (this.field3678 < this.field3676.length) {
			this.field3676[this.field3678] = var1;
			this.field3677[this.field3678] = var2;
			++this.field3678;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-34"
	)
	public final void method5048() {
		this.field3678 = 0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IILow;FI)V",
		garbageValue = "-2008023134"
	)
	public final void method5039(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4);
		SpritePixels var6 = this.method5051(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field3678; ++var10) {
			var11 = this.field3676[var10];
			var12 = this.field3677[var10];
			int var13 = (int)((float)(var11 - var1) * var4) - var5;
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method5849(var8, var9);
			this.method5040(var6, var3, var9);
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
					if (var11 > field3675.length) {
						var11 = field3675.length;
					}

					var12 = field3675[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Low;Low;Lle;I)V",
		garbageValue = "-159166525"
	)
	void method5040(SpritePixels var1, SpritePixels var2, Bounds var3) {
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1797269182"
	)
	static void method5055() {
		ItemContainer.itemContainers = new NodeHashTable(32);
	}
}
