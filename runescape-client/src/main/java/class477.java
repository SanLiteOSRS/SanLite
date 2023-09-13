import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sk")
public class class477 extends class479 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 479610193
	)
	int field4867;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2053401073
	)
	int field4864;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1621911947
	)
	int field4865;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1883870413
	)
	int field4866;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 373417651
	)
	int field4863;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 198014367
	)
	int field4868;

	public class477(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8); // L: 12
		this.field4867 = 0; // L: 4
		this.field4864 = 0; // L: 5
		this.field4865 = 0; // L: 6
		this.field4866 = 0; // L: 7
		this.field4863 = 0; // L: 8
		this.field4868 = 0; // L: 9
		this.field4867 = var1; // L: 13
		this.field4864 = var2; // L: 14
		this.field4865 = var3; // L: 15
		this.field4866 = var4; // L: 16
		this.field4863 = var5; // L: 17
		this.field4868 = var6; // L: 18
	} // L: 19

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "818000115"
	)
	public int vmethod8458() {
		double var1 = this.method8473(); // L: 22
		return (int)Math.round((double)(this.field4866 - this.field4867) * var1 + (double)this.field4867); // L: 23
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "363084355"
	)
	public int vmethod8459() {
		double var1 = this.method8473(); // L: 27
		return (int)Math.round(var1 * (double)(this.field4863 - this.field4864) + (double)this.field4864); // L: 28
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1706544959"
	)
	public int vmethod8460() {
		double var1 = this.method8473(); // L: 32
		return (int)Math.round((double)this.field4865 + (double)(this.field4868 - this.field4865) * var1); // L: 33
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([I[IIII)V",
		garbageValue = "-1387907364"
	)
	public static void method8446(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 69
			int var4 = (var3 + var2) / 2; // L: 70
			int var5 = var2; // L: 71
			int var6 = var0[var4]; // L: 72
			var0[var4] = var0[var3]; // L: 73
			var0[var3] = var6; // L: 74
			int var7 = var1[var4]; // L: 75
			var1[var4] = var1[var3]; // L: 76
			var1[var3] = var7; // L: 77
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1; // L: 78

			for (int var9 = var2; var9 < var3; ++var9) { // L: 79
				if (var0[var9] < (var9 & var8) + var6) { // L: 80
					int var10 = var0[var9]; // L: 81
					var0[var9] = var0[var5]; // L: 82
					var0[var5] = var10; // L: 83
					int var11 = var1[var9]; // L: 84
					var1[var9] = var1[var5]; // L: 85
					var1[var5++] = var11; // L: 86
				}
			}

			var0[var3] = var0[var5]; // L: 90
			var0[var5] = var6; // L: 91
			var1[var3] = var1[var5]; // L: 92
			var1[var5] = var7; // L: 93
			method8446(var0, var1, var2, var5 - 1); // L: 94
			method8446(var0, var1, var5 + 1, var3); // L: 95
		}

	} // L: 97
}
