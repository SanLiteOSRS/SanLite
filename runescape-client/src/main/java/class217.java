import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
public class class217 {
	@ObfuscatedName("aw")
	final int[][] field2372;
	@ObfuscatedName("ay")
	final int[][] field2369;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1777762751
	)
	int field2373;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1982630591
	)
	int field2371;
	@ObfuscatedName("as")
	final int[] field2374;
	@ObfuscatedName("aj")
	final int[] field2368;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 567035663
	)
	final int field2370;

	public class217(int var1, int var2) {
		this.field2372 = new int[var1][var2]; // L: 15
		this.field2369 = new int[var1][var2]; // L: 16
		int var3 = var2 * var1; // L: 17
		int var4 = UrlRequest.method2837(var3 / 4); // L: 18
		this.field2374 = new int[var4]; // L: 19
		this.field2368 = new int[var4]; // L: 20
		this.field2370 = var4 - 1; // L: 21
	} // L: 22

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-570470539"
	)
	void method4232() {
		for (int var1 = 0; var1 < this.field2372.length; ++var1) { // L: 25
			for (int var2 = 0; var2 < this.field2372[var1].length; ++var2) { // L: 26
				this.field2372[var1][var2] = 0; // L: 27
				this.field2369[var1][var2] = 99999999; // L: 28
			}
		}

	} // L: 31

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "527120358"
	)
	void method4233(int var1, int var2) {
		this.field2373 = var1; // L: 34
		this.field2371 = var2; // L: 35
	} // L: 36

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1077711185"
	)
	int method4234() {
		return this.field2373; // L: 39
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1117442087"
	)
	int method4257() {
		return this.field2371; // L: 43
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "793127968"
	)
	int method4236() {
		return this.field2372.length; // L: 47
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-58"
	)
	int method4237() {
		return this.field2372[0].length; // L: 51
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "-1369726044"
	)
	int[][] method4238() {
		return this.field2372; // L: 55
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)[[I",
		garbageValue = "-1"
	)
	int[][] method4260() {
		return this.field2369; // L: 59
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1326597582"
	)
	int[] method4240() {
		return this.field2374; // L: 63
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-59"
	)
	int[] method4241() {
		return this.field2368; // L: 67
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-8466104"
	)
	int method4242() {
		return this.field2370; // L: 71
	}
}
