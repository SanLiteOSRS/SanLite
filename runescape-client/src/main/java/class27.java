import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
public class class27 {
	@ObfuscatedName("gx")
	static String field144;
	@ObfuscatedName("az")
	int[] field142;
	@ObfuscatedName("ap")
	int[] field143;

	public class27() {
		this.field142 = new int[112]; // L: 12
		this.field143 = new int[192]; // L: 13
		Arrays.fill(this.field142, 3); // L: 16
		Arrays.fill(this.field143, 3); // L: 17
	} // L: 18

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "4993"
	)
	public void method394(int var1, int var2) {
		if (this.method421(var1) && this.method396(var2)) { // L: 21
			this.field142[var1] = var2; // L: 22
		}

	} // L: 24

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(CIB)V",
		garbageValue = "4"
	)
	public void method419(char var1, int var2) {
		if (this.method390(var1) && this.method396(var2)) { // L: 27
			this.field143[var1] = var2; // L: 28
		}

	} // L: 30

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1011466688"
	)
	public int method389(int var1) {
		return this.method421(var1) ? this.field142[var1] : 0; // L: 33 34 36
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CB)I",
		garbageValue = "41"
	)
	public int method395(char var1) {
		return this.method390(var1) ? this.field143[var1] : 0; // L: 40 41 43
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2032631567"
	)
	public boolean method385(int var1) {
		return this.method421(var1) && (this.field142[var1] == 1 || this.field142[var1] == 3); // L: 47
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "1"
	)
	public boolean method391(char var1) {
		return this.method390(var1) && (this.field143[var1] == 1 || this.field143[var1] == 3); // L: 51
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "55"
	)
	public boolean method420(int var1) {
		return this.method421(var1) && (this.field142[var1] == 2 || this.field142[var1] == 3); // L: 55
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-479848257"
	)
	public boolean method388(char var1) {
		return this.method390(var1) && (this.field143[var1] == 2 || this.field143[var1] == 3); // L: 59
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "516675311"
	)
	boolean method421(int var1) {
		if (var1 >= 0 && var1 < 112) { // L: 63
			return true; // L: 67
		} else {
			System.out.println("Invalid keycode: " + var1); // L: 64
			return false; // L: 65
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "67"
	)
	boolean method390(char var1) {
		if (var1 >= 0 && var1 < 192) { // L: 71
			return true; // L: 75
		} else {
			System.out.println("Invalid keychar: " + var1); // L: 72
			return false; // L: 73
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-13"
	)
	boolean method396(int var1) {
		if (var1 >= 0 && var1 < 4) { // L: 79
			return true; // L: 83
		} else {
			System.out.println("Invalid mode: " + var1); // L: 80
			return false; // L: 81
		}
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1897607215"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class449.clientPreferences.method2462() != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3581
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3582
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3583
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3584
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3585
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3586
			++Client.soundEffectCount; // L: 3587
		}

	} // L: 3589

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(Lmi;B)Z",
		garbageValue = "14"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 11178
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 11179
				int var2 = UserComparator9.method2900(var0, var1); // L: 11180
				int var3 = var0.cs1ComparisonValues[var1]; // L: 11181
				if (var0.cs1Comparisons[var1] == 2) { // L: 11182
					if (var2 >= var3) { // L: 11183
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 11185
					if (var2 <= var3) { // L: 11186
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 11188
					if (var3 == var2) { // L: 11189
						return false;
					}
				} else if (var2 != var3) { // L: 11191
					return false;
				}
			}

			return true; // L: 11193
		}
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(Ltm;II)V",
		garbageValue = "1204243161"
	)
	static void method423(Buffer var0, int var1) {
		byte[] var2 = var0.array; // L: 12785
		if (Client.randomDatData == null) { // L: 12787
			Client.randomDatData = new byte[24];
		}

		class409.writeRandomDat(var2, var1, Client.randomDatData, 0, 24); // L: 12788
		class13.method160(var0, var1); // L: 12790
	} // L: 12791
}
