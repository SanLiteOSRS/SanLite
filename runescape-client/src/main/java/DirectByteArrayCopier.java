import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kc")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 2768850440823628545L
	)
	public static long field3653;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "[Lri;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("a")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	DirectByteArrayCopier() {
	} // L: 10

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "2"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()]; // L: 13
		this.directBuffer.position(0); // L: 14
		this.directBuffer.get(var1); // L: 15
		return var1; // L: 16
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-622381156"
	)
	@Export("set")
	void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length); // L: 20
		this.directBuffer.position(0); // L: 21
		this.directBuffer.put(var1); // L: 22
	} // L: 23

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-1548833033"
	)
	static int method6228(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 3267
			var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3268
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 3269
			return 1; // L: 3270
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 3272
			var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3273
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 3274
			return 1; // L: 3275
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 3277
			var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3278
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 3279
			return 1; // L: 3280
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 3282
			var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3283
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 3284
			return 1; // L: 3285
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 3287
			var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3288
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 3289
			return 1; // L: 3290
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 3292
			var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3293
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 3294
			return 1; // L: 3295
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 3297
				var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3298
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3299
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 3300
				return 1; // L: 3301
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 3303
				var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3304
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3305
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 3306
				return 1; // L: 3307
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 3309
				var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3310
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3311
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 3312
				return 1; // L: 3313
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 3315
				var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3316
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3317
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 3318
				return 1; // L: 3319
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 3321
					var12 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 3322
					if (WorldMapCacheName.grandExchangeEvents != null) { // L: 3323
						WorldMapCacheName.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 3324
					}

					return 1; // L: 3326
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 3328
					var12 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 3329
					if (WorldMapCacheName.grandExchangeEvents != null) { // L: 3330
						WorldMapCacheName.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 3331
					}

					return 1; // L: 3333
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 3335
					class379.Interpreter_intStackSize -= 2; // L: 3336
					var12 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize] == 1; // L: 3337
					boolean var11 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1] == 1; // L: 3338
					if (WorldMapCacheName.grandExchangeEvents != null) { // L: 3339
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 3340
						WorldMapCacheName.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 3341
					}

					return 1; // L: 3343
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 3345
					var12 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 3346
					if (WorldMapCacheName.grandExchangeEvents != null) { // L: 3347
						WorldMapCacheName.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 3348
					}

					return 1; // L: 3350
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 3352
					var12 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 3353
					if (WorldMapCacheName.grandExchangeEvents != null) { // L: 3354
						WorldMapCacheName.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 3355
					}

					return 1; // L: 3357
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 3359
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = WorldMapCacheName.grandExchangeEvents == null ? 0 : WorldMapCacheName.grandExchangeEvents.events.size(); // L: 3360
					return 1; // L: 3361
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 3363
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3364
						var4 = (GrandExchangeEvent)WorldMapCacheName.grandExchangeEvents.events.get(var3); // L: 3365
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.world; // L: 3366
						return 1; // L: 3367
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 3369
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3370
						var4 = (GrandExchangeEvent)WorldMapCacheName.grandExchangeEvents.events.get(var3); // L: 3371
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 3372
						return 1; // L: 3373
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 3375
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3376
						var4 = (GrandExchangeEvent)WorldMapCacheName.grandExchangeEvents.events.get(var3); // L: 3377
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 3378
						return 1; // L: 3379
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 3381
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3382
						var4 = (GrandExchangeEvent)WorldMapCacheName.grandExchangeEvents.events.get(var3); // L: 3383
						long var5 = UserComparator8.method2748() - class101.field1307 - var4.age; // L: 3384
						int var7 = (int)(var5 / 3600000L); // L: 3385
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 3386
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 3387
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 3388
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var10; // L: 3389
						return 1; // L: 3390
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 3392
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3393
						var4 = (GrandExchangeEvent)WorldMapCacheName.grandExchangeEvents.events.get(var3); // L: 3394
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 3395
						return 1; // L: 3396
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 3398
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3399
						var4 = (GrandExchangeEvent)WorldMapCacheName.grandExchangeEvents.events.get(var3); // L: 3400
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 3401
						return 1; // L: 3402
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 3404
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3405
						var4 = (GrandExchangeEvent)WorldMapCacheName.grandExchangeEvents.events.get(var3); // L: 3406
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 3407
						return 1; // L: 3408
					} else {
						return 2; // L: 3410
					}
				}
			}
		}
	}
}
