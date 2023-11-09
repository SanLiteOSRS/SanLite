import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bj")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("de")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = -1822247975
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 212392441
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -278318549
	)
	@Export("x")
	int x;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 593496779
	)
	@Export("y")
	int y;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -191743071
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1980588265
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -772687821
	)
	int field814;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2001625905
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 2058290103
	)
	int field817;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 182876323
	)
	int field823;
	@ObfuscatedName("n")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 228178925
	)
	int field818;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-621060457"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 44
		ObjectComposition var2 = this.obj.transform(); // L: 45
		if (var2 != null) { // L: 46
			this.soundEffectId = var2.ambientSoundId; // L: 47
			this.field814 = var2.int7 * 128; // L: 48
			this.field817 = var2.int5; // L: 49
			this.field823 = var2.int6; // L: 50
			this.soundEffectIds = var2.soundEffectIds; // L: 51
		} else {
			this.soundEffectId = -1; // L: 54
			this.field814 = 0; // L: 55
			this.field817 = 0; // L: 56
			this.field823 = 0; // L: 57
			this.soundEffectIds = null; // L: 58
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 60
			StructComposition.pcmStreamMixer.removeSubStream(this.stream1); // L: 61
			this.stream1 = null; // L: 62
		}

	} // L: 64

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldp;[F[FB)V",
		garbageValue = "1"
	)
	static void method1774(class117 var0, float[] var1, float[] var2) {
		if (var0 != null) { // L: 246
			float var3 = var1[3] - var1[0]; // L: 249
			if (0.0D != (double)var3) { // L: 250
				float var4 = var1[1] - var1[0]; // L: 253
				float var5 = var1[2] - var1[0]; // L: 254
				Float var6 = var4 / var3; // L: 255
				Float var7 = var5 / var3; // L: 256
				var0.field1433 = var6 == 0.33333334F && var7 == 0.6666667F; // L: 257
				float var8 = var6; // L: 258
				float var9 = var7; // L: 259
				if ((double)var6 < 0.0D) { // L: 260
					var6 = 0.0F;
				}

				if ((double)var7 > 1.0D) { // L: 261
					var7 = 1.0F;
				}

				if ((double)var6 > 1.0D || var7 < -1.0F) { // L: 262
					AbstractByteArrayCopier.method5509(var6, var7); // L: 263
				}

				if (var6 != var8) { // L: 265
					var1[1] = var1[0] + var6 * var3; // L: 266
					if (0.0D != (double)var8) { // L: 267
						var2[1] = var2[0] + (var2[1] - var2[0]) * var6 / var8; // L: 268
					}
				}

				if (var7 != var9) { // L: 271
					var1[2] = var1[0] + var7 * var3; // L: 272
					if (1.0D != (double)var9) { // L: 273
						var2[2] = (float)((double)var2[3] - (double)(var2[3] - var2[2]) * (1.0D - (double)var7) / (1.0D - (double)var9)); // L: 274
					}
				}

				var0.field1439 = var1[0]; // L: 277
				var0.field1440 = var1[3]; // L: 278
				float var10 = var6; // L: 279
				float var11 = var7; // L: 280
				float[] var12 = var0.field1441; // L: 281
				float var13 = var10 - 0.0F; // L: 283
				float var14 = var11 - var10; // L: 284
				float var15 = 1.0F - var11; // L: 285
				float var16 = var14 - var13; // L: 286
				var12[3] = var15 - var14 - var16; // L: 287
				var12[2] = var16 + var16 + var16; // L: 288
				var12[1] = var13 + var13 + var13; // L: 289
				var12[0] = 0.0F; // L: 290
				var13 = var2[0]; // L: 292
				var14 = var2[1]; // L: 293
				var15 = var2[2]; // L: 294
				var16 = var2[3]; // L: 295
				float[] var17 = var0.field1442; // L: 296
				float var18 = var14 - var13; // L: 298
				float var19 = var15 - var14; // L: 299
				float var20 = var16 - var15; // L: 300
				float var21 = var19 - var18; // L: 301
				var17[3] = var20 - var19 - var21; // L: 302
				var17[2] = var21 + var21 + var21; // L: 303
				var17[1] = var18 + var18 + var18; // L: 304
				var17[0] = var13; // L: 305
			}
		}
	} // L: 247 251 307

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZB)I",
		garbageValue = "47"
	)
	static int method1770(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 2902
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2903
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 2904
			return 1; // L: 2905
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 2907
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2908
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 2909
			return 1; // L: 2910
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 2912
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2913
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 2914
			return 1; // L: 2915
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 2917
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2918
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 2919
			return 1; // L: 2920
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 2922
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2923
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 2924
			return 1; // L: 2925
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 2927
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2928
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 2929
			return 1; // L: 2930
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 2932
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2933
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2934
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 2935
				return 1; // L: 2936
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 2938
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2939
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2940
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 2941
				return 1; // L: 2942
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 2944
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2945
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2946
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 2947
				return 1; // L: 2948
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 2950
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2951
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2952
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 2953
				return 1; // L: 2954
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 2956
					var12 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2957
					if (class302.grandExchangeEvents != null) { // L: 2958
						class302.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 2959
					}

					return 1; // L: 2961
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 2963
					var12 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2964
					if (class302.grandExchangeEvents != null) { // L: 2965
						class302.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 2966
					}

					return 1; // L: 2968
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 2970
					TaskHandler.Interpreter_intStackSize -= 2; // L: 2971
					var12 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize] == 1; // L: 2972
					boolean var11 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1] == 1; // L: 2973
					if (class302.grandExchangeEvents != null) { // L: 2974
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 2975
						class302.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 2976
					}

					return 1; // L: 2978
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 2980
					var12 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2981
					if (class302.grandExchangeEvents != null) { // L: 2982
						class302.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 2983
					}

					return 1; // L: 2985
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 2987
					var12 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2988
					if (class302.grandExchangeEvents != null) { // L: 2989
						class302.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 2990
					}

					return 1; // L: 2992
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 2994
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class302.grandExchangeEvents == null ? 0 : class302.grandExchangeEvents.events.size(); // L: 2995
					return 1; // L: 2996
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 2998
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2999
						var4 = (GrandExchangeEvent)class302.grandExchangeEvents.events.get(var3); // L: 3000
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.world; // L: 3001
						return 1; // L: 3002
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 3004
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3005
						var4 = (GrandExchangeEvent)class302.grandExchangeEvents.events.get(var3); // L: 3006
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 3007
						return 1; // L: 3008
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 3010
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3011
						var4 = (GrandExchangeEvent)class302.grandExchangeEvents.events.get(var3); // L: 3012
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 3013
						return 1; // L: 3014
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 3016
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3017
						var4 = (GrandExchangeEvent)class302.grandExchangeEvents.events.get(var3); // L: 3018
						long var5 = class131.method2916() - class20.field116 - var4.age; // L: 3019
						int var7 = (int)(var5 / 3600000L); // L: 3020
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 3021
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 3022
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 3023
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var10; // L: 3024
						return 1; // L: 3025
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 3027
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3028
						var4 = (GrandExchangeEvent)class302.grandExchangeEvents.events.get(var3); // L: 3029
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 3030
						return 1; // L: 3031
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 3033
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3034
						var4 = (GrandExchangeEvent)class302.grandExchangeEvents.events.get(var3); // L: 3035
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 3036
						return 1; // L: 3037
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 3039
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3040
						var4 = (GrandExchangeEvent)class302.grandExchangeEvents.events.get(var3); // L: 3041
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 3042
						return 1; // L: 3043
					} else {
						return 2; // L: 3045
					}
				}
			}
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(Lcs;II)V",
		garbageValue = "1067868497"
	)
	static final void method1776(Actor var0, int var1) {
		GrandExchangeOfferOwnWorldComparator.worldToScreen(var0.x, var0.y, var1); // L: 5580
	} // L: 5581
}
