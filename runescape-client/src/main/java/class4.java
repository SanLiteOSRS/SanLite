import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("z")
public final class class4 {
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("ItemComposition_archive")
	public static AbstractArchive ItemComposition_archive;
	@ObfuscatedName("ib")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([Lmb;II)Lmb;",
		garbageValue = "1096060078"
	)
	@Export("findEnumerated")
	public static class349 findEnumerated(class349[] var0, int var1) {
		class349[] var2 = var0; // L: 17

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 18
			class349 var4 = var2[var3]; // L: 19
			if (var1 == var4.rsOrdinal()) {
				return var4; // L: 21
			}
		}

		return null; // L: 25
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Lgk;",
		garbageValue = "1400820827"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < GrandExchangeOfferNameComparator.WorldMapElement_cached.length && GrandExchangeOfferNameComparator.WorldMapElement_cached[var0] != null ? GrandExchangeOfferNameComparator.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 62 63
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "103"
	)
	public static int method21(int var0) {
		--var0; // L: 52
		var0 |= var0 >>> 1; // L: 53
		var0 |= var0 >>> 2; // L: 54
		var0 |= var0 >>> 4; // L: 55
		var0 |= var0 >>> 8; // L: 56
		var0 |= var0 >>> 16; // L: 57
		return var0 + 1; // L: 58
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-669376956"
	)
	static final int method17(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 968
		int var4 = var0 & var2 - 1; // L: 969
		int var5 = var1 / var2; // L: 970
		int var6 = var1 & var2 - 1; // L: 971
		int var7 = Message.method1192(var3, var5); // L: 972
		int var8 = Message.method1192(var3 + 1, var5); // L: 973
		int var9 = Message.method1192(var3, var5 + 1); // L: 974
		int var10 = Message.method1192(var3 + 1, var5 + 1); // L: 975
		int var11 = class123.method3037(var7, var8, var4, var2); // L: 976
		int var12 = class123.method3037(var9, var10, var4, var2); // L: 977
		return class123.method3037(var11, var12, var6, var2); // L: 978
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "1899720097"
	)
	static int method22(int var0, Script var1, boolean var2) {
		if (var0 == 7463) { // L: 4934
			boolean var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 4935
			class194.method3809(var3); // L: 4936
			return 1; // L: 4937
		} else {
			return 2; // L: 4939
		}
	}
}
