import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
public class class59 {
	@ObfuscatedName("wv")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	VorbisFloor field412;
	@ObfuscatedName("ah")
	boolean field415;
	@ObfuscatedName("af")
	int[] field413;
	@ObfuscatedName("at")
	int[] field411;
	@ObfuscatedName("an")
	boolean[] field414;

	@ObfuscatedSignature(
		descriptor = "(Lbb;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field412 = var1; // L: 11
		this.field415 = var2; // L: 12
		this.field413 = var3; // L: 13
		this.field411 = var4; // L: 14
		this.field414 = var5; // L: 15
	} // L: 16

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([FII)V",
		garbageValue = "-1600788598"
	)
	void method1111(float[] var1, int var2) {
		int var3 = this.field412.field261.length; // L: 19
		VorbisFloor var10000 = this.field412; // L: 20
		int var4 = VorbisFloor.field265[this.field412.multiplier - 1];
		boolean[] var5 = this.field414; // L: 21
		this.field414[1] = true; // L: 22
		var5[0] = true; // L: 23

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) { // L: 24
			var7 = this.field412.method747(this.field413, var6); // L: 25
			var8 = this.field412.method731(this.field413, var6); // L: 26
			var9 = this.field412.method736(this.field413[var7], this.field411[var7], this.field413[var8], this.field411[var8], this.field413[var6]); // L: 27
			var10 = this.field411[var6]; // L: 28
			int var11 = var4 - var9; // L: 29
			int var13 = (var11 < var9 ? var11 : var9) << 1; // L: 31
			if (var10 != 0) { // L: 32
				boolean[] var14 = this.field414; // L: 33
				this.field414[var8] = true; // L: 35
				var14[var7] = true; // L: 36
				this.field414[var6] = true; // L: 37
				if (var10 >= var13) { // L: 38
					this.field411[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1; // L: 39
				} else {
					this.field411[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9; // L: 42
				}
			} else {
				this.field414[var6] = false; // L: 46
				this.field411[var6] = var9; // L: 47
			}
		}

		this.VarbisFloor_sort(0, var3 - 1); // L: 50
		var6 = 0; // L: 51
		var7 = this.field412.multiplier * this.field411[0]; // L: 52

		for (var8 = 1; var8 < var3; ++var8) { // L: 53
			if (this.field414[var8]) { // L: 54
				var9 = this.field413[var8]; // L: 55
				var10 = this.field412.multiplier * this.field411[var8]; // L: 56
				this.field412.method746(var6, var7, var9, var10, var1, var2); // L: 57
				if (var9 >= var2) { // L: 58
					return;
				}

				var6 = var9; // L: 59
				var7 = var10; // L: 60
			}
		}

		var10000 = this.field412; // L: 63
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) { // L: 64
			var1[var9] *= var16;
		}

	} // L: 65

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "139624089"
	)
	boolean method1120() {
		return this.field415; // L: 68
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1754879302"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) { // L: 72
			int var3 = var1; // L: 73
			int var4 = this.field413[var1]; // L: 74
			int var5 = this.field411[var1]; // L: 75
			boolean var6 = this.field414[var1]; // L: 76

			for (int var7 = var1 + 1; var7 <= var2; ++var7) { // L: 77
				int var8 = this.field413[var7]; // L: 78
				if (var8 < var4) { // L: 79
					this.field413[var3] = var8; // L: 80
					this.field411[var3] = this.field411[var7]; // L: 81
					this.field414[var3] = this.field414[var7]; // L: 82
					++var3; // L: 83
					this.field413[var7] = this.field413[var3]; // L: 84
					this.field411[var7] = this.field411[var3]; // L: 85
					this.field414[var7] = this.field414[var3]; // L: 86
				}
			}

			this.field413[var3] = var4; // L: 89
			this.field411[var3] = var5; // L: 90
			this.field414[var3] = var6; // L: 91
			this.VarbisFloor_sort(var1, var3 - 1); // L: 92
			this.VarbisFloor_sort(var3 + 1, var2); // L: 93
		}
	} // L: 94

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-785248472"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1970
		Login.Login_response2 = var1; // L: 1971
		Login.Login_response3 = var2; // L: 1972
	} // L: 1973
}
