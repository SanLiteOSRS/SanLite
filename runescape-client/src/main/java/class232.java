import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
public class class232 {
	@ObfuscatedName("aq")
	final int[][] field2462;
	@ObfuscatedName("aw")
	final int[][] field2468;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 301048157
	)
	int field2461;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -921590971
	)
	int field2464;
	@ObfuscatedName("ar")
	final int[] field2463;
	@ObfuscatedName("as")
	final int[] field2466;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 748486583
	)
	final int field2467;

	class232(int var1, int var2) {
		this.field2462 = new int[var1][var2]; // L: 15
		this.field2468 = new int[var1][var2]; // L: 16
		int var3 = var2 * var1; // L: 17
		int var4 = class318.method6083(var3 / 4); // L: 18
		this.field2463 = new int[var4]; // L: 19
		this.field2466 = new int[var4]; // L: 20
		this.field2467 = var4 - 1; // L: 21
	} // L: 22

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1608928141"
	)
	void method4519() {
		for (int var1 = 0; var1 < this.field2462.length; ++var1) { // L: 25
			for (int var2 = 0; var2 < this.field2462[var1].length; ++var2) { // L: 26
				this.field2462[var1][var2] = 0; // L: 27
				this.field2468[var1][var2] = 99999999; // L: 28
			}
		}

	} // L: 31

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-568406997"
	)
	void method4520(int var1, int var2) {
		this.field2461 = var1; // L: 34
		this.field2464 = var2; // L: 35
	} // L: 36

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "56"
	)
	int method4552() {
		return this.field2461; // L: 39
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	int method4557() {
		return this.field2464; // L: 43
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "115"
	)
	int method4523() {
		return this.field2462.length; // L: 47
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1744860747"
	)
	int method4524() {
		return this.field2462[0].length; // L: 51
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "1119637625"
	)
	int[][] method4546() {
		return this.field2462; // L: 55
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "1174942864"
	)
	int[][] method4526() {
		return this.field2468; // L: 59
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1882943904"
	)
	int[] method4527() {
		return this.field2463; // L: 63
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1914104479"
	)
	int[] method4528() {
		return this.field2466; // L: 67
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-43299646"
	)
	int method4529() {
		return this.field2467; // L: 71
	}
}
