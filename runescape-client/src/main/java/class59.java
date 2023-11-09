import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
public class class59 {
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("js")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lbo;"
	)
	VorbisFloor field455;
	@ObfuscatedName("ae")
	boolean field444;
	@ObfuscatedName("ao")
	int[] field445;
	@ObfuscatedName("at")
	int[] field456;
	@ObfuscatedName("ac")
	boolean[] field448;

	@ObfuscatedSignature(
		descriptor = "(Lbo;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field455 = var1; // L: 11
		this.field444 = var2; // L: 12
		this.field445 = var3; // L: 13
		this.field456 = var4; // L: 14
		this.field448 = var5; // L: 15
	} // L: 16

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([FIB)V",
		garbageValue = "44"
	)
	void method1153(float[] var1, int var2) {
		int var3 = this.field455.field286.length; // L: 19
		VorbisFloor var10000 = this.field455; // L: 20
		int var4 = VorbisFloor.field285[this.field455.multiplier - 1];
		boolean[] var5 = this.field448; // L: 21
		this.field448[1] = true; // L: 22
		var5[0] = true; // L: 23

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) { // L: 24
			var7 = this.field455.method789(this.field445, var6); // L: 25
			var8 = this.field455.method780(this.field445, var6); // L: 26
			var9 = this.field455.method781(this.field445[var7], this.field456[var7], this.field445[var8], this.field456[var8], this.field445[var6]); // L: 27
			var10 = this.field456[var6]; // L: 28
			int var11 = var4 - var9; // L: 29
			int var13 = (var11 < var9 ? var11 : var9) << 1; // L: 31
			if (var10 != 0) { // L: 32
				boolean[] var14 = this.field448; // L: 33
				this.field448[var8] = true; // L: 35
				var14[var7] = true; // L: 36
				this.field448[var6] = true; // L: 37
				if (var10 >= var13) { // L: 38
					this.field456[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1; // L: 39
				} else {
					this.field456[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9; // L: 42
				}
			} else {
				this.field448[var6] = false; // L: 46
				this.field456[var6] = var9; // L: 47
			}
		}

		this.VarbisFloor_sort(0, var3 - 1); // L: 50
		var6 = 0; // L: 51
		var7 = this.field455.multiplier * this.field456[0]; // L: 52

		for (var8 = 1; var8 < var3; ++var8) { // L: 53
			if (this.field448[var8]) { // L: 54
				var9 = this.field445[var8]; // L: 55
				var10 = this.field455.multiplier * this.field456[var8]; // L: 56
				this.field455.method779(var6, var7, var9, var10, var1, var2); // L: 57
				if (var9 >= var2) { // L: 58
					return;
				}

				var6 = var9; // L: 59
				var7 = var10; // L: 60
			}
		}

		var10000 = this.field455; // L: 63
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) { // L: 64
			var1[var9] *= var16;
		}

	} // L: 65

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "81"
	)
	boolean method1154() {
		return this.field444; // L: 68
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1743044108"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) { // L: 72
			int var3 = var1; // L: 73
			int var4 = this.field445[var1]; // L: 74
			int var5 = this.field456[var1]; // L: 75
			boolean var6 = this.field448[var1]; // L: 76

			for (int var7 = var1 + 1; var7 <= var2; ++var7) { // L: 77
				int var8 = this.field445[var7]; // L: 78
				if (var8 < var4) { // L: 79
					this.field445[var3] = var8; // L: 80
					this.field456[var3] = this.field456[var7]; // L: 81
					this.field448[var3] = this.field448[var7]; // L: 82
					++var3; // L: 83
					this.field445[var7] = this.field445[var3]; // L: 84
					this.field456[var7] = this.field456[var3]; // L: 85
					this.field448[var7] = this.field448[var3]; // L: 86
				}
			}

			this.field445[var3] = var4; // L: 89
			this.field456[var3] = var5; // L: 90
			this.field448[var3] = var6; // L: 91
			this.VarbisFloor_sort(var1, var3 - 1); // L: 92
			this.VarbisFloor_sort(var3 + 1, var2); // L: 93
		}
	} // L: 94

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CLon;B)I",
		garbageValue = "82"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 104
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 105
			var0 = Character.toLowerCase(var0); // L: 106
			var2 = (var0 << 4) + 1; // L: 107
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 109
			var2 = 1762;
		}

		return var2; // L: 110
	}
}
