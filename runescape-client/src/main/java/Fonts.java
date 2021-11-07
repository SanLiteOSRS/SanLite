import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nu")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("s")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1;
		this.fontsArchive = var2;
		this.map = new HashMap();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "([Lny;I)Ljava/util/HashMap;",
		garbageValue = "-870343448"
	)
	@Export("createMap")
	public HashMap createMap(FontName[] var1) {
		HashMap var2 = new HashMap();
		FontName[] var3 = var1;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			FontName var5 = var3[var4];
			if (this.map.containsKey(var5)) {
				var2.put(var5, this.map.get(var5));
			} else {
				Font var6 = UserComparator1.method7234(this.spritesArchive, this.fontsArchive, var5.name, "");
				if (var6 != null) {
					this.map.put(var5, var6);
					var2.put(var5, var6);
				}
			}
		}

		return var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZB)I",
		garbageValue = "31"
	)
	static int method6687(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
			var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
			var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
			var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
			var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
			return 1;
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
					var12 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
					if (JagexCache.grandExchangeEvents != null) {
						JagexCache.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
					var12 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
					if (JagexCache.grandExchangeEvents != null) {
						JagexCache.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
					class14.Interpreter_intStackSize -= 2;
					var12 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] == 1;
					boolean var11 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1] == 1;
					if (JagexCache.grandExchangeEvents != null) {
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11;
						JagexCache.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
					var12 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
					if (JagexCache.grandExchangeEvents != null) {
						JagexCache.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
					var12 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
					if (JagexCache.grandExchangeEvents != null) {
						JagexCache.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = JagexCache.grandExchangeEvents == null ? 0 : JagexCache.grandExchangeEvents.events.size();
					return 1;
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)JagexCache.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.world;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)JagexCache.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.getOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)JagexCache.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)JagexCache.grandExchangeEvents.events.get(var3);
						long var5 = class111.method2516() - GrandExchangeOfferUnitPriceComparator.field3758 - var4.age;
						int var7 = (int)(var5 / 3600000L);
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L);
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var10;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)JagexCache.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)JagexCache.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)JagexCache.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
