import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
public class class215 {
	@ObfuscatedName("ay")
	final int[][] field2374;
	@ObfuscatedName("an")
	final int[][] field2373;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1149161287
	)
	int field2378;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1127965099
	)
	int field2375;
	@ObfuscatedName("at")
	final int[] field2376;
	@ObfuscatedName("ax")
	final int[] field2377;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1139272687
	)
	final int field2372;

	class215(int var1, int var2) {
		this.field2374 = new int[var1][var2]; // L: 15
		this.field2373 = new int[var1][var2]; // L: 16
		int var3 = var2 * var1; // L: 17
		int var4 = class298.method5751(var3 / 4); // L: 18
		this.field2376 = new int[var4]; // L: 19
		this.field2377 = new int[var4]; // L: 20
		this.field2372 = var4 - 1; // L: 21
	} // L: 22

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2063997424"
	)
	void method4188() {
		for (int var1 = 0; var1 < this.field2374.length; ++var1) { // L: 25
			for (int var2 = 0; var2 < this.field2374[var1].length; ++var2) { // L: 26
				this.field2374[var1][var2] = 0; // L: 27
				this.field2373[var1][var2] = 99999999; // L: 28
			}
		}

	} // L: 31

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "7"
	)
	void method4160(int var1, int var2) {
		this.field2378 = var1; // L: 34
		this.field2375 = var2; // L: 35
	} // L: 36

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "43"
	)
	int method4161() {
		return this.field2378; // L: 39
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1893387300"
	)
	int method4162() {
		return this.field2375; // L: 43
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-15"
	)
	int method4175() {
		return this.field2374.length; // L: 47
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-13585974"
	)
	int method4163() {
		return this.field2374[0].length; // L: 51
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "789263071"
	)
	int[][] method4164() {
		return this.field2374; // L: 55
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)[[I",
		garbageValue = "-14"
	)
	int[][] method4191() {
		return this.field2373; // L: 59
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1629915811"
	)
	int[] method4166() {
		return this.field2376; // L: 63
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "0"
	)
	int[] method4167() {
		return this.field2377; // L: 67
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "117"
	)
	int method4168() {
		return this.field2372; // L: 71
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lct;Lct;IZB)I",
		garbageValue = "-107"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 221
			int var4 = var0.population; // L: 222
			int var5 = var1.population; // L: 223
			if (!var3) { // L: 224
				if (var4 == -1) { // L: 225
					var4 = 2001;
				}

				if (var5 == -1) { // L: 226
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 228
		} else if (var2 == 2) { // L: 230
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 231
			if (var0.activity.equals("-")) { // L: 232
				if (var1.activity.equals("-")) { // L: 233
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 234
				}
			} else if (var1.activity.equals("-")) { // L: 236
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 237
			}
		} else if (var2 == 4) { // L: 239
			return var0.method1809() ? (var1.method1809() ? 0 : 1) : (var1.method1809() ? -1 : 0);
		} else if (var2 == 5) { // L: 240
			return var0.method1773() ? (var1.method1773() ? 0 : 1) : (var1.method1773() ? -1 : 0);
		} else if (var2 == 6) { // L: 241
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 242
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 243
		}
	}
}
