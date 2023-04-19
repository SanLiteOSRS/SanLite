import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("af")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpb;Lpb;I)I",
		garbageValue = "150312401"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-798861149"
	)
	static void method2933() {
		if (class441.field4729 == null) { // L: 68
			class441.field4729 = new int[65536]; // L: 69
			double var0 = 0.949999988079071D; // L: 70

			for (int var2 = 0; var2 < 65536; ++var2) { // L: 71
				double var3 = 0.0078125D + (double)(var2 >> 10 & 63) / 64.0D; // L: 72
				double var5 = (double)(var2 >> 7 & 7) / 8.0D + 0.0625D; // L: 73
				double var7 = (double)(var2 & 127) / 128.0D; // L: 74
				double var9 = var7; // L: 75
				double var11 = var7; // L: 76
				double var13 = var7; // L: 77
				if (var5 != 0.0D) { // L: 78
					double var15;
					if (var7 < 0.5D) { // L: 80
						var15 = var7 * (1.0D + var5);
					} else {
						var15 = var5 + var7 - var5 * var7; // L: 81
					}

					double var17 = var7 * 2.0D - var15; // L: 82
					double var19 = 0.3333333333333333D + var3; // L: 83
					if (var19 > 1.0D) { // L: 84
						--var19;
					}

					double var23 = var3 - 0.3333333333333333D;
					if (var23 < 0.0D) {
						++var23;
					}

					if (6.0D * var19 < 1.0D) {
						var9 = var17 + var19 * 6.0D * (var15 - var17);
					} else if (var19 * 2.0D < 1.0D) { // L: 89
						var9 = var15;
					} else if (3.0D * var19 < 2.0D) { // L: 90
						var9 = var17 + 6.0D * (var15 - var17) * (0.6666666666666666D - var19);
					} else {
						var9 = var17; // L: 91
					}

					if (6.0D * var3 < 1.0D) { // L: 92
						var11 = 6.0D * (var15 - var17) * var3 + var17;
					} else if (2.0D * var3 < 1.0D) { // L: 93
						var11 = var15;
					} else if (3.0D * var3 < 2.0D) { // L: 94
						var11 = (var15 - var17) * (0.6666666666666666D - var3) * 6.0D + var17;
					} else {
						var11 = var17; // L: 95
					}

					if (var23 * 6.0D < 1.0D) { // L: 96
						var13 = var23 * 6.0D * (var15 - var17) + var17;
					} else if (var23 * 2.0D < 1.0D) { // L: 97
						var13 = var15;
					} else if (3.0D * var23 < 2.0D) { // L: 98
						var13 = 6.0D * (0.6666666666666666D - var23) * (var15 - var17) + var17;
					} else {
						var13 = var17; // L: 99
					}
				}

				var9 = Math.pow(var9, var0); // L: 101
				var11 = Math.pow(var11, var0); // L: 102
				var13 = Math.pow(var13, var0); // L: 103
				int var25 = (int)(256.0D * var9); // L: 104
				int var16 = (int)(var11 * 256.0D); // L: 105
				int var26 = (int)(var13 * 256.0D); // L: 106
				int var18 = var26 + (var16 << 8) + (var25 << 16); // L: 107
				class441.field4729[var2] = var18 & 16777215; // L: 108
			}

		}
	} // L: 110

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lec;",
		garbageValue = "-500821406"
	)
	static class127 method2940(int var0) {
		class127 var1 = (class127)StructComposition.findEnumerated(class121.method2989(), var0); // L: 86
		if (var1 == null) {
			var1 = class127.field1545; // L: 87
		}

		return var1; // L: 88
	}
}
