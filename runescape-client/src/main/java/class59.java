import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public class class59 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	VorbisFloor field414;
	@ObfuscatedName("an")
	boolean field417;
	@ObfuscatedName("ar")
	int[] field415;
	@ObfuscatedName("ab")
	int[] field416;
	@ObfuscatedName("at")
	boolean[] field413;

	@ObfuscatedSignature(
		descriptor = "(Lbf;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field414 = var1; // L: 11
		this.field417 = var2; // L: 12
		this.field415 = var3; // L: 13
		this.field416 = var4; // L: 14
		this.field413 = var5; // L: 15
	} // L: 16

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([FIB)V",
		garbageValue = "-13"
	)
	void method1127(float[] var1, int var2) {
		int var3 = this.field414.field254.length; // L: 19
		VorbisFloor var10000 = this.field414; // L: 20
		int var4 = VorbisFloor.field260[this.field414.multiplier - 1];
		boolean[] var5 = this.field413;
		this.field413[1] = true;
		var5[0] = true; // L: 23

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) { // L: 24
			var7 = this.field414.method764(this.field415, var6); // L: 25
			var8 = this.field414.method750(this.field415, var6); // L: 26
			var9 = this.field414.method751(this.field415[var7], this.field416[var7], this.field415[var8], this.field416[var8], this.field415[var6]); // L: 27
			var10 = this.field416[var6]; // L: 28
			int var11 = var4 - var9; // L: 29
			int var13 = (var11 < var9 ? var11 : var9) << 1; // L: 31
			if (var10 != 0) { // L: 32
				boolean[] var14 = this.field413;
				this.field413[var8] = true;
				var14[var7] = true;
				this.field413[var6] = true;
				if (var10 >= var13) {
					this.field416[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1; // L: 39
				} else {
					this.field416[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9; // L: 42
				}
			} else {
				this.field413[var6] = false; // L: 46
				this.field416[var6] = var9; // L: 47
			}
		}

		this.VarbisFloor_sort(0, var3 - 1); // L: 50
		var6 = 0; // L: 51
		var7 = this.field414.multiplier * this.field416[0]; // L: 52

		for (var8 = 1; var8 < var3; ++var8) { // L: 53
			if (this.field413[var8]) { // L: 54
				var9 = this.field415[var8]; // L: 55
				var10 = this.field414.multiplier * this.field416[var8]; // L: 56
				this.field414.method752(var6, var7, var9, var10, var1, var2); // L: 57
				if (var9 >= var2) { // L: 58
					return;
				}

				var6 = var9; // L: 59
				var7 = var10; // L: 60
			}
		}

		var10000 = this.field414; // L: 63
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) { // L: 64
			var1[var9] *= var16;
		}

	} // L: 65

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "45"
	)
	boolean method1128() {
		return this.field417; // L: 68
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-75"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) { // L: 72
			int var3 = var1;
			int var4 = this.field415[var1];
			int var5 = this.field416[var1];
			boolean var6 = this.field413[var1];

			for (int var7 = var1 + 1; var7 <= var2; ++var7) {
				int var8 = this.field415[var7];
				if (var8 < var4) {
					this.field415[var3] = var8;
					this.field416[var3] = this.field416[var7];
					this.field413[var3] = this.field413[var7];
					++var3; // L: 83
					this.field415[var7] = this.field415[var3];
					this.field416[var7] = this.field416[var3];
					this.field413[var7] = this.field413[var3]; // L: 86
				}
			}

			this.field415[var3] = var4; // L: 89
			this.field416[var3] = var5; // L: 90
			this.field413[var3] = var6; // L: 91
			this.VarbisFloor_sort(var1, var3 - 1); // L: 92
			this.VarbisFloor_sort(var3 + 1, var2); // L: 93
		}
	} // L: 94

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhi;",
		garbageValue = "63"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0); // L: 73
		if (var1 != null) { // L: 74
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0); // L: 75
			var1 = new ObjectComposition(); // L: 76
			var1.id = var0; // L: 77
			if (var2 != null) { // L: 78
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 79
			if (var1.isSolid) { // L: 80
				var1.interactType = 0; // L: 81
				var1.boolean1 = false; // L: 82
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0); // L: 84
			return var1; // L: 85
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lni;B)V",
		garbageValue = "58"
	)
	public static void method1137(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0; // L: 21
	} // L: 22

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "756432353"
	)
	@Export("hslToRgb")
	static int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 33
			var1 /= 2;
		}

		if (var2 > 192) { // L: 34
			var1 /= 2;
		}

		if (var2 > 217) { // L: 35
			var1 /= 2;
		}

		if (var2 > 243) { // L: 36
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 37
		return var3; // L: 38
	}
}
