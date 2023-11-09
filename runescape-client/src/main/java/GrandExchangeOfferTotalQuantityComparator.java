import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oq")
@Implements("GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("fontBold12")
	static Font fontBold12;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;I)I",
		garbageValue = "-2047796467"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1); // L: 69
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 77
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 73
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lnn;B)I",
		garbageValue = "0"
	)
	static int method7080(Widget var0) {
		if (var0.type != 11) { // L: 1572
			Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize - 1] = ""; // L: 1573
			return 1; // L: 1574
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 1576
			Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var0.method6765(var1); // L: 1577
			return 1; // L: 1578
		}
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZS)V",
		garbageValue = "14887"
	)
	static final void method7091(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!Client.isMenuOpen) { // L: 10351
			if (Client.menuOptionsCount < 500) { // L: 10352
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 10353
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 10354
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 10355
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 10356
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 10357
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 10358
				Client.field639[Client.menuOptionsCount] = var6; // L: 10359
				Client.menuShiftClick[Client.menuOptionsCount] = var7; // L: 10360
				++Client.menuOptionsCount; // L: 10361
			}

		}
	} // L: 10363
}
