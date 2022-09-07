import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pu")
public class class436 extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static AbstractArchive field4669;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("DBTableType_cache")
	static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("w")
	public int[][] field4668;
	@ObfuscatedName("v")
	public Object[][] field4671;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class436() {
	} // L: 16

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "2102275490"
	)
	void method7532(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 31
			if (var2 == 0) { // L: 32
				return; // L: 35
			}

			this.method7524(var1, var2); // L: 33
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;IB)V",
		garbageValue = "0"
	)
	void method7524(Buffer var1, int var2) {
		if (var2 == 1) { // L: 38
			int var3 = var1.readUnsignedByte(); // L: 39
			if (this.field4668 == null) { // L: 40
				this.field4668 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 41 42 69
				int var5 = var4 & 127; // L: 43
				boolean var6 = (var4 & 128) != 0; // L: 44
				int[] var7 = new int[var1.readUnsignedByte()]; // L: 45

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 46
					var7[var8] = var1.readUShortSmart(); // L: 47
				}

				this.field4668[var5] = var7; // L: 49
				if (var6) { // L: 50
					if (this.field4671 == null) {
						this.field4671 = new Object[this.field4668.length][]; // L: 51
					}

					Object[][] var17 = this.field4671; // L: 52
					int var11 = var1.readUShortSmart(); // L: 56
					Object[] var12 = new Object[var7.length * var11]; // L: 57

					for (int var13 = 0; var13 < var11; ++var13) { // L: 58
						for (int var14 = 0; var14 < var7.length; ++var14) { // L: 59
							int var15 = var14 + var7.length * var13; // L: 60
							class433 var16 = class19.method285(var7[var14]); // L: 61
							var12[var15] = var16.method7493(var1); // L: 62
						}
					}

					var17[var5] = var12; // L: 67
				}
			}
		}

	} // L: 73

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1626541562"
	)
	void method7523() {
	} // L: 75

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZS)I",
		garbageValue = "4902"
	)
	static int method7535(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 2911
			var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2912
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 2913
			return 1; // L: 2914
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 2916
			var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2917
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 2918
			return 1; // L: 2919
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 2921
			var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2922
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 2923
			return 1; // L: 2924
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 2926
			var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2927
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 2928
			return 1; // L: 2929
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 2931
			var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2932
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 2933
			return 1; // L: 2934
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 2936
			var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2937
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 2938
			return 1; // L: 2939
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 2941
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2942
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2943
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 2944
				return 1; // L: 2945
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 2947
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2948
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2949
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 2950
				return 1; // L: 2951
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 2953
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2954
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2955
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 2956
				return 1; // L: 2957
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 2959
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2960
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2961
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 2962
				return 1; // L: 2963
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 2965
					var12 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2966
					if (UserComparator3.grandExchangeEvents != null) { // L: 2967
						UserComparator3.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 2968
					}

					return 1; // L: 2970
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 2972
					var12 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2973
					if (UserComparator3.grandExchangeEvents != null) { // L: 2974
						UserComparator3.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 2975
					}

					return 1; // L: 2977
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 2979
					Nameable.Interpreter_intStackSize -= 2; // L: 2980
					var12 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize] == 1; // L: 2981
					boolean var11 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1] == 1; // L: 2982
					if (UserComparator3.grandExchangeEvents != null) { // L: 2983
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 2984
						UserComparator3.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 2985
					}

					return 1; // L: 2987
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 2989
					var12 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2990
					if (UserComparator3.grandExchangeEvents != null) { // L: 2991
						UserComparator3.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 2992
					}

					return 1; // L: 2994
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 2996
					var12 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2997
					if (UserComparator3.grandExchangeEvents != null) { // L: 2998
						UserComparator3.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 2999
					}

					return 1; // L: 3001
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 3003
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = UserComparator3.grandExchangeEvents == null ? 0 : UserComparator3.grandExchangeEvents.events.size(); // L: 3004
					return 1; // L: 3005
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 3007
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3008
						var4 = (GrandExchangeEvent)UserComparator3.grandExchangeEvents.events.get(var3); // L: 3009
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var4.world; // L: 3010
						return 1; // L: 3011
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 3013
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3014
						var4 = (GrandExchangeEvent)UserComparator3.grandExchangeEvents.events.get(var3); // L: 3015
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 3016
						return 1; // L: 3017
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 3019
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3020
						var4 = (GrandExchangeEvent)UserComparator3.grandExchangeEvents.events.get(var3); // L: 3021
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 3022
						return 1; // L: 3023
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 3025
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3026
						var4 = (GrandExchangeEvent)UserComparator3.grandExchangeEvents.events.get(var3); // L: 3027
						long var5 = class181.method3483() - FontName.field4587 - var4.age; // L: 3028
						int var7 = (int)(var5 / 3600000L); // L: 3029
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 3030
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 3031
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 3032
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var10; // L: 3033
						return 1; // L: 3034
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 3036
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3037
						var4 = (GrandExchangeEvent)UserComparator3.grandExchangeEvents.events.get(var3); // L: 3038
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 3039
						return 1; // L: 3040
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 3042
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3043
						var4 = (GrandExchangeEvent)UserComparator3.grandExchangeEvents.events.get(var3); // L: 3044
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 3045
						return 1; // L: 3046
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 3048
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3049
						var4 = (GrandExchangeEvent)UserComparator3.grandExchangeEvents.events.get(var3); // L: 3050
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 3051
						return 1; // L: 3052
					} else {
						return 2; // L: 3054
					}
				}
			}
		}
	}
}
