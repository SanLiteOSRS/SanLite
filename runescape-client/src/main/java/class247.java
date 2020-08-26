import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
public class class247 {
	@ObfuscatedName("z")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Llr;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("s")
	int[] field3214;
	@ObfuscatedName("t")
	int[] field3213;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1401897115
	)
	int field3216;

	public class247() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field3214 = new int[2048];
		this.field3213 = new int[2048];
		this.field3216 = 0;
		class7.field39 = new int[2000];
		int var1 = 0;
		int var2 = 240;

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) {
			var4 = Frames.method3395((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.075F + 0.425F * (float)var1 / 16.0F));
			class7.field39[var1] = var4;
			++var1;
		}

		var2 = 48;

		for (int var6 = var2 / 6; var1 < class7.field39.length; var2 -= var6) {
			var4 = var1 * 2;

			for (int var5 = Frames.method3395((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < class7.field39.length; ++var1) {
				class7.field39[var1] = var5;
			}
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "1"
	)
	void method4415(int var1) {
		int var2 = var1 * 2 + 1;
		double[] var3 = Client.method1378(0.0D, (double)((float)var1 / 3.0F), var1);
		double var4 = var3[var1] * var3[var1];
		int[] var6 = new int[var2 * var2];
		boolean var7 = false;

		for (int var8 = 0; var8 < var2; ++var8) {
			for (int var9 = 0; var9 < var2; ++var9) {
				int var10 = var6[var9 + var8 * var2] = (int)(256.0D * (var3[var9] * var3[var8] / var4));
				if (!var7 && var10 > 0) {
					var7 = true;
				}
			}
		}

		SpritePixels var11 = new SpritePixels(var6, var2, var2);
		this.spriteMap.put(var1, var11);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(II)Llp;",
		garbageValue = "1281699730"
	)
	SpritePixels method4412(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method4415(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(IIB)V",
		garbageValue = "-58"
	)
	public final void method4423(int var1, int var2) {
		if (this.field3216 < this.field3214.length) {
			this.field3214[this.field3216] = var1;
			this.field3213[this.field3216] = var2;
			++this.field3216;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1013360647"
	)
	public final void method4414() {
		this.field3216 = 0;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(IILlp;FB)V",
		garbageValue = "3"
	)
	public final void method4410(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4);
		SpritePixels var6 = this.method4412(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field3216; ++var10) {
			var11 = this.field3214[var10];
			var12 = this.field3213[var10];
			int var13 = (int)(var4 * (float)(var11 - var1)) - var5;
			int var14 = (int)((float)var3.subHeight - var4 * (float)(var12 - var2)) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method6089(var8, var9);
			this.method4416(var6, var3, var9);
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
					if (var11 > class7.field39.length) {
						var11 = class7.field39.length;
					}

					var12 = class7.field39[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Llp;Llp;Llr;B)V",
		garbageValue = "-42"
	)
	void method4416(SpritePixels var1, SpritePixels var2, Bounds var3) {
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
			int var7 = var3.lowX + var2.subWidth * var3.lowY;

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

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		signature = "(Lhq;Ljq;IIZB)V",
		garbageValue = "0"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions;
		byte var6 = -1;
		String var7 = null;
		if (var5 != null && var5[var3] != null) {
			if (var3 == 0) {
				var6 = 33;
			} else if (var3 == 1) {
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35;
			} else if (var3 == 3) {
				var6 = 36;
			} else {
				var6 = 37;
			}

			var7 = var5[var3];
		} else if (var3 == 4) {
			var6 = 37;
			var7 = "Drop";
		}

		if (var6 != -1 && var7 != null) {
			Tiles.insertMenuItem(var7, WorldMapAreaData.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4);
		}

	}
}
