import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
public class class385 {
	@ObfuscatedName("am")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("af")
	int[] field4435;
	@ObfuscatedName("aj")
	int[] field4436;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1612452097
	)
	int field4437;

	public class385() {
		this.spriteMap = new HashMap(); // L: 10
		this.bounds = new Bounds(0, 0); // L: 11
		this.field4435 = new int[2048]; // L: 12
		this.field4436 = new int[2048]; // L: 13
		this.field4437 = 0; // L: 14
		WorldMapID.method5029(); // L: 21
	} // L: 22

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1970958700"
	)
	void method7263(int var1) {
		int var2 = var1 * 2 + 1; // L: 46
		double var4 = (double)((float)var1 / 3.0F); // L: 48
		int var6 = var1 * 2 + 1; // L: 50
		double[] var7 = new double[var6]; // L: 51
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			double var20 = class270.method5321((double)(var8 - 0) / var4) / var4; // L: 57
			var7[var9] = var20; // L: 59
			++var8;
		}

		double[] var14 = var7;
		double var15 = var7[var1] * var7[var1]; // L: 64
		int[] var17 = new int[var2 * var2]; // L: 65
		boolean var10 = false;

		for (int var11 = 0; var11 < var2; ++var11) { // L: 67
			for (int var12 = 0; var12 < var2; ++var12) {
				int var13 = var17[var12 + var11 * var2] = (int)(256.0D * (var14[var12] * var14[var11] / var15)); // L: 69
				if (!var10 && var13 > 0) { // L: 70
					var10 = true; // L: 71
				}
			}
		}

		SpritePixels var18 = new SpritePixels(var17, var2, var2); // L: 75
		this.spriteMap.put(var1, var18); // L: 76
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Luc;",
		garbageValue = "2088097415"
	)
	SpritePixels method7251(int var1) {
		if (!this.spriteMap.containsKey(var1)) { // L: 80
			this.method7263(var1); // L: 81
		}

		return (SpritePixels)this.spriteMap.get(var1); // L: 83
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1877407016"
	)
	public final void method7252(int var1, int var2) {
		if (this.field4437 < this.field4435.length) { // L: 87
			this.field4435[this.field4437] = var1; // L: 88
			this.field4436[this.field4437] = var2;
			++this.field4437; // L: 90
		}
	} // L: 91

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "23"
	)
	public final void method7264() {
		this.field4437 = 0; // L: 94
	} // L: 95

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IILuc;FB)V",
		garbageValue = "-41"
	)
	public final void method7254(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(var4 * 18.0F);
		SpritePixels var6 = this.method7251(var5); // L: 99
		int var7 = var5 * 2 + 1; // L: 100
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight); // L: 101
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7); // L: 103
		System.nanoTime(); // L: 104

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4437; ++var10) {
			var11 = this.field4435[var10]; // L: 106
			var12 = this.field4436[var10]; // L: 107
			int var13 = (int)(var4 * (float)(var11 - var1)) - var5; // L: 108
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5; // L: 109
			this.bounds.setLow(var13, var14); // L: 110
			this.bounds.method8483(var8, var9); // L: 111
			this.method7255(var6, var3, var9); // L: 112
		}

		System.nanoTime(); // L: 114
		System.nanoTime(); // L: 115

		for (var10 = 0; var10 < var3.pixels.length; ++var10) {
			if (var3.pixels[var10] == 0) { // L: 117
				var3.pixels[var10] = -16777216; // L: 118
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256;
				if (var11 <= 0) { // L: 122
					var3.pixels[var10] = -16777216; // L: 123
				} else {
					if (var11 > TaskHandler.field2295.length) { // L: 126
						var11 = TaskHandler.field2295.length;
					}

					var12 = TaskHandler.field2295[var11 - 1]; // L: 127
					var3.pixels[var10] = -16777216 | var12; // L: 128
				}
			}
		}

		System.nanoTime(); // L: 130
	} // L: 131

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Luc;Luc;Lry;B)V",
		garbageValue = "-8"
	)
	void method7255(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) { // L: 134
			int var4 = 0; // L: 135
			int var5 = 0; // L: 136
			if (var3.lowX == 0) { // L: 137
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) { // L: 138
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth; // L: 139
			int var7 = var3.lowX + var2.subWidth * var3.lowY; // L: 140

			for (int var8 = 0; var8 < var3.highY; ++var8) { // L: 141
				for (int var9 = 0; var9 < var3.highX; ++var9) { // L: 142
					int[] var10000 = var2.pixels; // L: 143
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX; // L: 145
				var7 += var2.subWidth - var3.highX; // L: 146
			}

		}
	} // L: 148

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "1264334945"
	)
	public static char method7273(char var0) {
		switch(var0) { // L: 52
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_'; // L: 82
		case '#':
		case '[':
		case ']':
			return var0; // L: 102
		case 'À':
		case 'Á':
		case 'Â':
		case 'Ã':
		case 'Ä':
		case 'à':
		case 'á':
		case 'â':
		case 'ã':
		case 'ä':
			return 'a'; // L: 63
		case 'Ç':
		case 'ç':
			return 'c'; // L: 66
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e'; // L: 77
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i'; // L: 89
		case 'Ñ':
		case 'ñ':
			return 'n'; // L: 105
		case 'Ò':
		case 'Ó':
		case 'Ô':
		case 'Õ':
		case 'Ö':
		case 'ò':
		case 'ó':
		case 'ô':
		case 'õ':
		case 'ö':
			return 'o'; // L: 116
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u'; // L: 98
		case 'ß':
			return 'b'; // L: 68
		case 'ÿ':
		case 'Ÿ':
			return 'y'; // L: 119
		default:
			return Character.toLowerCase(var0); // L: 121
		}
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "-858669799"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		Huffman.method6893(var0, var1, var2, var3, var4, var5, -1, false); // L: 10157
	} // L: 10158
}
