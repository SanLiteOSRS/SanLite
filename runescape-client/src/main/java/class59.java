import java.util.Collections;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
public class class59 {
	@ObfuscatedName("am")
	static int[] field430;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	VorbisFloor field431;
	@ObfuscatedName("aj")
	boolean field424;
	@ObfuscatedName("ac")
	int[] field426;
	@ObfuscatedName("aw")
	int[] field423;
	@ObfuscatedName("ay")
	boolean[] field427;

	@ObfuscatedSignature(
		descriptor = "(Lbp;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field431 = var1; // L: 11
		this.field424 = var2; // L: 12
		this.field426 = var3; // L: 13
		this.field423 = var4; // L: 14
		this.field427 = var5; // L: 15
	} // L: 16

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([FIB)V",
		garbageValue = "-59"
	)
	void method1175(float[] var1, int var2) {
		int var3 = this.field431.field264.length; // L: 19
		VorbisFloor var10000 = this.field431; // L: 20
		int var4 = VorbisFloor.field267[this.field431.multiplier - 1];
		boolean[] var5 = this.field427; // L: 21
		this.field427[1] = true; // L: 22
		var5[0] = true; // L: 23

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) { // L: 24
			var7 = this.field431.method760(this.field426, var6); // L: 25
			var8 = this.field431.method759(this.field426, var6); // L: 26
			var9 = this.field431.method761(this.field426[var7], this.field423[var7], this.field426[var8], this.field423[var8], this.field426[var6]); // L: 27
			var10 = this.field423[var6]; // L: 28
			int var11 = var4 - var9; // L: 29
			int var13 = (var11 < var9 ? var11 : var9) << 1; // L: 31
			if (var10 != 0) { // L: 32
				boolean[] var14 = this.field427; // L: 33
				this.field427[var8] = true; // L: 35
				var14[var7] = true; // L: 36
				this.field427[var6] = true; // L: 37
				if (var10 >= var13) { // L: 38
					this.field423[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1; // L: 39
				} else {
					this.field423[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9; // L: 42
				}
			} else {
				this.field427[var6] = false;
				this.field423[var6] = var9;
			}
		}

		this.VarbisFloor_sort(0, var3 - 1);
		var6 = 0;
		var7 = this.field431.multiplier * this.field423[0];

		for (var8 = 1; var8 < var3; ++var8) {
			if (this.field427[var8]) {
				var9 = this.field426[var8];
				var10 = this.field431.multiplier * this.field423[var8]; // L: 56
				this.field431.method762(var6, var7, var9, var10, var1, var2);
				if (var9 >= var2) {
					return;
				}

				var6 = var9; // L: 59
				var7 = var10; // L: 60
			}
		}

		var10000 = this.field431; // L: 63
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) { // L: 64
			var1[var9] *= var16;
		}

	} // L: 65

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2116037244"
	)
	boolean method1165() {
		return this.field424; // L: 68
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "738706931"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) { // L: 72
			int var3 = var1; // L: 73
			int var4 = this.field426[var1]; // L: 74
			int var5 = this.field423[var1]; // L: 75
			boolean var6 = this.field427[var1]; // L: 76

			for (int var7 = var1 + 1; var7 <= var2; ++var7) { // L: 77
				int var8 = this.field426[var7]; // L: 78
				if (var8 < var4) { // L: 79
					this.field426[var3] = var8; // L: 80
					this.field423[var3] = this.field423[var7]; // L: 81
					this.field427[var3] = this.field427[var7]; // L: 82
					++var3; // L: 83
					this.field426[var7] = this.field426[var3]; // L: 84
					this.field423[var7] = this.field423[var3]; // L: 85
					this.field427[var7] = this.field427[var3]; // L: 86
				}
			}

			this.field426[var3] = var4; // L: 89
			this.field423[var3] = var5; // L: 90
			this.field427[var3] = var6; // L: 91
			this.VarbisFloor_sort(var1, var3 - 1); // L: 92
			this.VarbisFloor_sort(var3 + 1, var2); // L: 93
		}
	} // L: 94

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([I[II)V",
		garbageValue = "651022686"
	)
	public static void method1176(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) { // L: 43
			UserComparator5.ByteArrayPool_alternativeSizes = var0; // L: 50
			class125.ByteArrayPool_altSizeArrayCounts = new int[var0.length]; // L: 51
			class140.ByteArrayPool_arrays = new byte[var0.length][][]; // L: 52

			for (int var2 = 0; var2 < UserComparator5.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 53
				class140.ByteArrayPool_arrays[var2] = new byte[var1[var2]][]; // L: 54
				ByteArrayPool.field4540.add(var0[var2]); // L: 55
			}

			Collections.sort(ByteArrayPool.field4540); // L: 57
		} else {
			UserComparator5.ByteArrayPool_alternativeSizes = null; // L: 44
			class125.ByteArrayPool_altSizeArrayCounts = null; // L: 45
			class140.ByteArrayPool_arrays = null; // L: 46
			class384.method7207(); // L: 47
		}
	} // L: 48 58

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1300882685"
	)
	static String method1170(int var0) {
		return "<img=" + var0 + ">"; // L: 18
	}
}
