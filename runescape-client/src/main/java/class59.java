import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
public class class59 {
	@ObfuscatedName("wn")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	static class374 field452;
	@ObfuscatedName("ah")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("af")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("cz")
	static String field450;
	@ObfuscatedName("hp")
	static String field453;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	VorbisFloor field445;
	@ObfuscatedName("al")
	boolean field443;
	@ObfuscatedName("ak")
	int[] field455;
	@ObfuscatedName("ax")
	int[] field449;
	@ObfuscatedName("ao")
	boolean[] field446;

	@ObfuscatedSignature(
		descriptor = "(Lbc;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field445 = var1; // L: 11
		this.field443 = var2; // L: 12
		this.field455 = var3; // L: 13
		this.field449 = var4; // L: 14
		this.field446 = var5; // L: 15
	} // L: 16

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([FII)V",
		garbageValue = "2130530034"
	)
	void method1160(float[] var1, int var2) {
		int var3 = this.field445.field282.length; // L: 19
		VorbisFloor var10000 = this.field445; // L: 20
		int var4 = VorbisFloor.field286[this.field445.multiplier - 1];
		boolean[] var5 = this.field446; // L: 21
		this.field446[1] = true; // L: 22
		var5[0] = true; // L: 23

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) { // L: 24
			var7 = this.field445.method763(this.field455, var6); // L: 25
			var8 = this.field445.method757(this.field455, var6); // L: 26
			var9 = this.field445.method758(this.field455[var7], this.field449[var7], this.field455[var8], this.field449[var8], this.field455[var6]); // L: 27
			var10 = this.field449[var6]; // L: 28
			int var11 = var4 - var9; // L: 29
			int var13 = (var11 < var9 ? var11 : var9) << 1; // L: 31
			if (var10 != 0) { // L: 32
				boolean[] var14 = this.field446; // L: 33
				this.field446[var8] = true; // L: 35
				var14[var7] = true; // L: 36
				this.field446[var6] = true; // L: 37
				if (var10 >= var13) { // L: 38
					this.field449[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1; // L: 39
				} else {
					this.field449[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9; // L: 42
				}
			} else {
				this.field446[var6] = false; // L: 46
				this.field449[var6] = var9; // L: 47
			}
		}

		this.VarbisFloor_sort(0, var3 - 1); // L: 50
		var6 = 0; // L: 51
		var7 = this.field445.multiplier * this.field449[0]; // L: 52

		for (var8 = 1; var8 < var3; ++var8) { // L: 53
			if (this.field446[var8]) { // L: 54
				var9 = this.field455[var8]; // L: 55
				var10 = this.field445.multiplier * this.field449[var8]; // L: 56
				this.field445.method774(var6, var7, var9, var10, var1, var2); // L: 57
				if (var9 >= var2) { // L: 58
					return;
				}

				var6 = var9; // L: 59
				var7 = var10; // L: 60
			}
		}

		var10000 = this.field445; // L: 63
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) { // L: 64
			var1[var9] *= var16;
		}

	} // L: 65

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "467756903"
	)
	boolean method1161() {
		return this.field443; // L: 68
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2030001337"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) { // L: 72
			int var3 = var1; // L: 73
			int var4 = this.field455[var1]; // L: 74
			int var5 = this.field449[var1]; // L: 75
			boolean var6 = this.field446[var1]; // L: 76

			for (int var7 = var1 + 1; var7 <= var2; ++var7) { // L: 77
				int var8 = this.field455[var7]; // L: 78
				if (var8 < var4) { // L: 79
					this.field455[var3] = var8; // L: 80
					this.field449[var3] = this.field449[var7]; // L: 81
					this.field446[var3] = this.field446[var7]; // L: 82
					++var3; // L: 83
					this.field455[var7] = this.field455[var3]; // L: 84
					this.field449[var7] = this.field449[var3]; // L: 85
					this.field446[var7] = this.field446[var3]; // L: 86
				}
			}

			this.field455[var3] = var4; // L: 89
			this.field449[var3] = var5; // L: 90
			this.field446[var3] = var6; // L: 91
			this.VarbisFloor_sort(var1, var3 - 1); // L: 92
			this.VarbisFloor_sort(var3 + 1, var2); // L: 93
		}
	} // L: 94
}
