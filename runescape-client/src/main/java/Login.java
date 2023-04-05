import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cp")
@Implements("Login")
public class Login {
	@ObfuscatedName("al")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1829519957
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lsp;"
	)
	static IndexedSprite[] field888;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	static IndexedSprite field912;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	static IndexedSprite field892;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	static IndexedSprite field904;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1797050063
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 647465325
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 813109745
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("ah")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 589427449
	)
	static int field901;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -550556813
	)
	static int field887;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1020695771
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("cl")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("ca")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("cb")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("co")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cj")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("cn")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 621584615
	)
	static int field909;
	@ObfuscatedName("cc")
	static String[] field908;
	@ObfuscatedName("cg")
	static String field911;
	@ObfuscatedName("cw")
	static boolean field900;
	@ObfuscatedName("cp")
	static boolean field913;
	@ObfuscatedName("cv")
	static boolean field914;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -67843131
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dp")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -611355623
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 1145129403
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 1942540433
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		longValue = 1083052260744045781L
	)
	static long field922;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		longValue = -3783900184507538293L
	)
	static long field923;
	@ObfuscatedName("db")
	static String[] field924;
	@ObfuscatedName("dm")
	static String[] field925;
	@ObfuscatedName("dz")
	static String[] field926;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = -398912461
	)
	@Export("menuY")
	static int menuY;

	static {
		xPadding = 0; // L: 49
		loginBoxX = xPadding + 202; // L: 68
		Login_loadingPercent = 10; // L: 70
		Login_loadingText = ""; // L: 71
		field901 = -1; // L: 91
		field887 = 1; // L: 94
		loginIndex = 0; // L: 98
		Login_response0 = ""; // L: 99
		Login_response1 = ""; // L: 100
		Login_response2 = ""; // L: 101
		Login_response3 = ""; // L: 102
		Login_username = ""; // L: 103
		Login_password = ""; // L: 104
		field909 = 0; // L: 106
		field908 = new String[8]; // L: 107
		field911 = ""; // L: 112
		field900 = false; // L: 119
		field913 = false; // L: 120
		field914 = true; // L: 123
		currentLoginField = 0; // L: 124
		worldSelectOpen = false; // L: 128
		hoveredWorldIndex = -1; // L: 136
		worldSelectPage = 0; // L: 137
		worldSelectPagesCount = 0; // L: 138
		new DecimalFormat("##0.00"); // L: 141
		new class130();
		field922 = -1L; // L: 149
		field923 = -1L; // L: 150
		field924 = new String[]{"title.jpg"}; // L: 153
		field925 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"}; // L: 156
		field926 = new String[]{"logo_speedrunning"}; // L: 159
	}

	@ObfuscatedName("aj")
	public static final void method2088(long var0) {
		if (var0 > 0L) { // L: 9
			if (0L == var0 % 10L) { // L: 10
				class169.method3466(var0 - 1L); // L: 11
				class169.method3466(1L); // L: 12
			} else {
				class169.method3466(var0); // L: 14
			}

		}
	} // L: 15

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;S)I",
		garbageValue = "977"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 132
		int var2 = 0; // L: 133

		for (int var3 = 0; var3 < var1; ++var3) { // L: 134
			var2 = (var2 << 5) - var2 + class18.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 135
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZB)I",
		garbageValue = "27"
	)
	static int method2107(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 3360
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3361
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 3362
			return 1; // L: 3363
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 3365
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3366
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 3367
			return 1; // L: 3368
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 3370
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3371
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 3372
			return 1; // L: 3373
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 3375
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3376
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 3377
			return 1; // L: 3378
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 3380
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3381
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 3382
			return 1; // L: 3383
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 3385
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3386
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 3387
			return 1; // L: 3388
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 3390
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3391
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3392
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 3393
				return 1; // L: 3394
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 3396
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3397
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3398
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 3399
				return 1; // L: 3400
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 3402
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3403
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3404
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 3405
				return 1; // L: 3406
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 3408
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3409
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3410
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 3411
				return 1; // L: 3412
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 3414
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3415
					if (Projectile.grandExchangeEvents != null) { // L: 3416
						Projectile.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 3417
					}

					return 1; // L: 3419
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 3421
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3422
					if (Projectile.grandExchangeEvents != null) { // L: 3423
						Projectile.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 3424
					}

					return 1; // L: 3426
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 3428
					Interpreter.Interpreter_intStackSize -= 2; // L: 3429
					var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == 1; // L: 3430
					boolean var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 3431
					if (Projectile.grandExchangeEvents != null) { // L: 3432
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 3433
						Projectile.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 3434
					}

					return 1; // L: 3436
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 3438
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3439
					if (Projectile.grandExchangeEvents != null) { // L: 3440
						Projectile.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 3441
					}

					return 1; // L: 3443
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 3445
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3446
					if (Projectile.grandExchangeEvents != null) { // L: 3447
						Projectile.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 3448
					}

					return 1; // L: 3450
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 3452
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Projectile.grandExchangeEvents == null ? 0 : Projectile.grandExchangeEvents.events.size(); // L: 3453
					return 1; // L: 3454
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 3456
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3457
						var4 = (GrandExchangeEvent)Projectile.grandExchangeEvents.events.get(var3); // L: 3458
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.world; // L: 3459
						return 1; // L: 3460
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 3462
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3463
						var4 = (GrandExchangeEvent)Projectile.grandExchangeEvents.events.get(var3); // L: 3464
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 3465
						return 1; // L: 3466
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 3468
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3469
						var4 = (GrandExchangeEvent)Projectile.grandExchangeEvents.events.get(var3); // L: 3470
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 3471
						return 1; // L: 3472
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 3474
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3475
						var4 = (GrandExchangeEvent)Projectile.grandExchangeEvents.events.get(var3); // L: 3476
						long var5 = WorldMapSection2.method4844() - GrandExchangeOfferWorldComparator.field4254 - var4.age; // L: 3477
						int var7 = (int)(var5 / 3600000L); // L: 3478
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 3479
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 3480
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 3481
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var10; // L: 3482
						return 1; // L: 3483
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 3485
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3486
						var4 = (GrandExchangeEvent)Projectile.grandExchangeEvents.events.get(var3); // L: 3487
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 3488
						return 1; // L: 3489
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 3491
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3492
						var4 = (GrandExchangeEvent)Projectile.grandExchangeEvents.events.get(var3); // L: 3493
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 3494
						return 1; // L: 3495
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 3497
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3498
						var4 = (GrandExchangeEvent)Projectile.grandExchangeEvents.events.get(var3); // L: 3499
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 3500
						return 1; // L: 3501
					} else {
						return 2; // L: 3503
					}
				}
			}
		}
	}
}
