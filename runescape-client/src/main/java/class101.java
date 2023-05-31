import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
final class class101 implements class308 {
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = -2041029009
	)
	static int field1328;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lmq;)V"
	)
	class101(Widget var1) {
		this.val$cc = var1; // L: 508
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "427135973"
	)
	public void vmethod6027() {
		if (this.val$cc != null && this.val$cc.method6395().field3503 != null) { // L: 510
			ScriptEvent var1 = new ScriptEvent(); // L: 511
			var1.method2256(this.val$cc); // L: 512
			var1.setArgs(this.val$cc.method6395().field3503); // L: 513
			GrandExchangeOfferAgeComparator.method6838().addFirst(var1); // L: 514
		}

	} // L: 516

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "262535457"
	)
	static final String method2690(int var0) {
		if (var0 < 100000) { // L: 442
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>"; // L: 443 444
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-9"
	)
	static final int method2691(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 1008
		int var4 = var0 & var2 - 1; // L: 1009
		int var5 = var1 / var2; // L: 1010
		int var6 = var1 & var2 - 1; // L: 1011
		int var7 = class383.method7540(var3, var5); // L: 1012
		int var8 = class383.method7540(var3 + 1, var5); // L: 1013
		int var9 = class383.method7540(var3, var5 + 1); // L: 1014
		int var10 = class383.method7540(var3 + 1, var5 + 1); // L: 1015
		int var11 = JagexCache.method3578(var7, var8, var4, var2); // L: 1016
		int var12 = JagexCache.method3578(var9, var10, var4, var2); // L: 1017
		return JagexCache.method3578(var11, var12, var6, var2); // L: 1018
	}
}
