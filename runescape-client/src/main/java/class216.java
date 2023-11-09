import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
public class class216 {
	@ObfuscatedName("au")
	final int[][] field2402;
	@ObfuscatedName("ae")
	final int[][] field2398;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1394945579
	)
	int field2399;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 190927925
	)
	int field2400;
	@ObfuscatedName("ac")
	final int[] field2403;
	@ObfuscatedName("ai")
	final int[] field2397;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1383698847
	)
	final int field2401;

	public class216(int var1, int var2) {
		this.field2402 = new int[var1][var2]; // L: 15
		this.field2398 = new int[var1][var2]; // L: 16
		int var3 = var2 * var1; // L: 17
		int var4 = WorldMapIcon_1.method5088(var3 / 4);
		this.field2403 = new int[var4];
		this.field2397 = new int[var4];
		this.field2401 = var4 - 1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "87"
	)
	void method4234() {
		for (int var1 = 0; var1 < this.field2402.length; ++var1) { // L: 25
			for (int var2 = 0; var2 < this.field2402[var1].length; ++var2) { // L: 26
				this.field2402[var1][var2] = 0; // L: 27
				this.field2398[var1][var2] = 99999999; // L: 28
			}
		}

	} // L: 31

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "335221263"
	)
	void method4196(int var1, int var2) {
		this.field2399 = var1; // L: 34
		this.field2400 = var2; // L: 35
	} // L: 36

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	int method4197() {
		return this.field2399; // L: 39
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	int method4198() {
		return this.field2400; // L: 43
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1220057291"
	)
	int method4199() {
		return this.field2402.length; // L: 47
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "63"
	)
	int method4216() {
		return this.field2402[0].length; // L: 51
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "1666372984"
	)
	int[][] method4222() {
		return this.field2402; // L: 55
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "-1771437641"
	)
	int[][] method4202() {
		return this.field2398; // L: 59
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1724623959"
	)
	int[] method4203() {
		return this.field2403; // L: 63
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-968317767"
	)
	int[] method4204() {
		return this.field2397; // L: 67
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	int method4205() {
		return this.field2401; // L: 71
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltm;Ljava/lang/String;I)I",
		garbageValue = "-1998833421"
	)
	public static int method4235(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 18
		byte[] var3 = TextureProvider.method4752(var1); // L: 19
		var0.writeSmartByteShort(var3.length); // L: 20
		var0.offset += class334.huffman.compress(var3, 0, var3.length, var0.array, var0.offset); // L: 21
		return var0.offset - var2; // L: 22
	}
}
