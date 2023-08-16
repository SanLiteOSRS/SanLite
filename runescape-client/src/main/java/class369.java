import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
public class class369 {
	@ObfuscatedName("ck")
	@Export("otp")
	static String otp;
	@ObfuscatedName("au")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("ao")
	int[] field4361;
	@ObfuscatedName("at")
	int[] field4362;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -705777851
	)
	int field4365;

	public class369() {
		this.spriteMap = new HashMap(); // L: 10
		this.bounds = new Bounds(0, 0); // L: 11
		this.field4361 = new int[2048]; // L: 12
		this.field4362 = new int[2048]; // L: 13
		this.field4365 = 0; // L: 14
		ArchiveDiskActionHandler.method6647(); // L: 21
	} // L: 22

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "915989256"
	)
	void method6915(int var1) {
		int var2 = var1 * 2 + 1; // L: 46
		double[] var3 = Clock.method3544(0.0D, (double)((float)var1 / 3.0F), var1); // L: 47
		double var4 = var3[var1] * var3[var1]; // L: 48
		int[] var6 = new int[var2 * var2]; // L: 49
		boolean var7 = false; // L: 50

		for (int var8 = 0; var8 < var2; ++var8) { // L: 51
			for (int var9 = 0; var9 < var2; ++var9) { // L: 52
				int var10 = var6[var9 + var8 * var2] = (int)(256.0D * (var3[var8] * var3[var9] / var4)); // L: 53
				if (!var7 && var10 > 0) { // L: 54
					var7 = true; // L: 55
				}
			}
		}

		SpritePixels var11 = new SpritePixels(var6, var2, var2); // L: 59
		this.spriteMap.put(var1, var11); // L: 60
	} // L: 61

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Lui;",
		garbageValue = "63"
	)
	SpritePixels method6897(int var1) {
		if (!this.spriteMap.containsKey(var1)) { // L: 64
			this.method6915(var1); // L: 65
		}

		return (SpritePixels)this.spriteMap.get(var1); // L: 67
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1621400552"
	)
	public final void method6898(int var1, int var2) {
		if (this.field4365 < this.field4361.length) { // L: 71
			this.field4361[this.field4365] = var1; // L: 72
			this.field4362[this.field4365] = var2; // L: 73
			++this.field4365; // L: 74
		}
	} // L: 75

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1492834453"
	)
	public final void method6899() {
		this.field4365 = 0; // L: 78
	} // L: 79

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IILui;FI)V",
		garbageValue = "435818307"
	)
	public final void method6903(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(var4 * 18.0F); // L: 82
		SpritePixels var6 = this.method6897(var5); // L: 83
		int var7 = var5 * 2 + 1; // L: 84
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight); // L: 85
		Bounds var9 = new Bounds(0, 0); // L: 86
		this.bounds.setHigh(var7, var7); // L: 87
		System.nanoTime(); // L: 88

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4365; ++var10) { // L: 89
			var11 = this.field4361[var10]; // L: 90
			var12 = this.field4362[var10]; // L: 91
			int var13 = (int)(var4 * (float)(var11 - var1)) - var5; // L: 92
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5; // L: 93
			this.bounds.setLow(var13, var14); // L: 94
			this.bounds.method8121(var8, var9); // L: 95
			this.method6924(var6, var3, var9); // L: 96
		}

		System.nanoTime(); // L: 98
		System.nanoTime(); // L: 99

		for (var10 = 0; var10 < var3.pixels.length; ++var10) { // L: 100
			if (var3.pixels[var10] == 0) { // L: 101
				var3.pixels[var10] = -16777216; // L: 102
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256; // L: 105
				if (var11 <= 0) { // L: 106
					var3.pixels[var10] = -16777216; // L: 107
				} else {
					if (var11 > ItemComposition.field2285.length) { // L: 110
						var11 = ItemComposition.field2285.length;
					}

					var12 = ItemComposition.field2285[var11 - 1]; // L: 111
					var3.pixels[var10] = -16777216 | var12; // L: 112
				}
			}
		}

		System.nanoTime(); // L: 114
	} // L: 115

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lui;Lui;Lrb;I)V",
		garbageValue = "-1016036720"
	)
	void method6924(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) { // L: 118
			int var4 = 0; // L: 119
			int var5 = 0; // L: 120
			if (var3.lowX == 0) { // L: 121
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) { // L: 122
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth; // L: 123
			int var7 = var2.subWidth * var3.lowY + var3.lowX; // L: 124

			for (int var8 = 0; var8 < var3.highY; ++var8) { // L: 125
				for (int var9 = 0; var9 < var3.highX; ++var9) { // L: 126
					int[] var10000 = var2.pixels; // L: 127
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX; // L: 129
				var7 += var2.subWidth - var3.highX; // L: 130
			}

		}
	} // L: 132

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(Lmi;IIZI)V",
		garbageValue = "1138527751"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 11085
		int var5 = var0.height; // L: 11086
		if (var0.widthAlignment == 0) { // L: 11087
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 11088
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 11089
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 11090
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 11091
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) { // L: 11092
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) { // L: 11093
			var0.width = var0.field3766 * var0.height / var0.field3664;
		}

		if (var0.heightAlignment == 4) { // L: 11094
			var0.height = var0.width * var0.field3664 / var0.field3766;
		}

		if (var0.contentType == 1337) { // L: 11095
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) { // L: 11096
			var0.method6532().method6111(var0.width, var0.height); // L: 11097
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 11099
			ScriptEvent var6 = new ScriptEvent(); // L: 11100
			var6.widget = var0; // L: 11101
			var6.args = var0.onResize; // L: 11102
			Client.scriptEvents.addFirst(var6); // L: 11103
		}

	} // L: 11105
}
