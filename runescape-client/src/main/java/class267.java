import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
public class class267 {
	@ObfuscatedName("aq")
	@Export("ByteArrayPool_altSizeArrayCounts")
	static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	static Archive field2778;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lej;"
	)
	class128[] field2777;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1061697901
	)
	int field2779;

	@ObfuscatedSignature(
		descriptor = "(Luj;I)V"
	)
	class267(Buffer var1, int var2) {
		this.field2777 = new class128[var2]; // L: 13
		this.field2779 = var1.readUnsignedByte(); // L: 14

		for (int var3 = 0; var3 < this.field2777.length; ++var3) { // L: 15
			class128 var4 = new class128(this.field2779, var1, false); // L: 16
			this.field2777[var3] = var4; // L: 17
		}

		this.method5268(); // L: 19
	} // L: 20

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1372666290"
	)
	void method5268() {
		class128[] var1 = this.field2777; // L: 24

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 25
			class128 var3 = var1[var2]; // L: 26
			if (var3.field1507 >= 0) { // L: 28
				var3.field1497 = this.field2777[var3.field1507]; // L: 29
			}
		}

	} // L: 34

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "4095"
	)
	public int method5269() {
		return this.field2777.length; // L: 37
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Lej;",
		garbageValue = "-2147483647"
	)
	class128 method5270(int var1) {
		return var1 >= this.method5269() ? null : this.field2777[var1]; // L: 41 42 44
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[Lej;",
		garbageValue = "-943395454"
	)
	class128[] method5271() {
		return this.field2777; // L: 48
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lfo;IB)V",
		garbageValue = "-54"
	)
	void method5272(class139 var1, int var2) {
		this.method5282(var1, var2, (boolean[])null, false); // L: 52
	} // L: 53

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lfo;I[ZZI)V",
		garbageValue = "-869028175"
	)
	void method5282(class139 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3190(); // L: 56
		int var6 = 0; // L: 57
		class128[] var7 = this.method5271(); // L: 59

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 60
			class128 var9 = var7[var8]; // L: 61
			if (var3 == null || var4 == var3[var6]) { // L: 63
				var1.method3167(var2, var9, var6, var5); // L: 64
			}

			++var6; // L: 66
		}

	} // L: 70

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "618264850"
	)
	public static void method5275() {
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 429
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 430
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 431
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 432
	} // L: 433
}
