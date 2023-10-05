import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("ac")
	@Export("ViewportMouse_isInViewport")
	static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 884178361
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -78136905
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("ax")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1661824619
	)
	static int field2808;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -630047283
	)
	static int field2807;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 97003329
	)
	static int field2802;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -77145917
	)
	static int field2809;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1608809895
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("as")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000]; // L: 18
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "-527981427"
	)
	static int method5046(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 429
			return class168.method3407(var0, var1, var2);
		} else if (var0 < 1100) { // L: 430
			return ClientPreferences.method2572(var0, var1, var2);
		} else if (var0 < 1200) { // L: 431
			return class17.method267(var0, var1, var2);
		} else if (var0 < 1300) { // L: 432
			return class76.method2125(var0, var1, var2);
		} else if (var0 < 1400) { // L: 433
			return class4.method17(var0, var1, var2);
		} else if (var0 < 1500) { // L: 434
			return class31.method458(var0, var1, var2);
		} else if (var0 < 1600) { // L: 435
			return class87.method2309(var0, var1, var2);
		} else if (var0 < 1700) { // L: 436
			return class134.method3070(var0, var1, var2);
		} else if (var0 < 1800) { // L: 437
			return class202.method3766(var0, var1, var2);
		} else if (var0 < 1900) { // L: 438
			return class13.method171(var0, var1, var2);
		} else if (var0 < 2000) { // L: 439
			return class20.method299(var0, var1, var2);
		} else if (var0 < 2100) { // L: 440
			return ClientPreferences.method2572(var0, var1, var2);
		} else if (var0 < 2200) { // L: 441
			return class17.method267(var0, var1, var2);
		} else if (var0 < 2300) { // L: 442
			return class76.method2125(var0, var1, var2);
		} else if (var0 < 2400) { // L: 443
			return class4.method17(var0, var1, var2);
		} else if (var0 < 2500) { // L: 444
			return class31.method458(var0, var1, var2);
		} else if (var0 < 2600) { // L: 445
			return class30.method447(var0, var1, var2);
		} else if (var0 < 2700) { // L: 446
			return DevicePcmPlayerProvider.method307(var0, var1, var2);
		} else if (var0 < 2800) { // L: 447
			return Varps.method6215(var0, var1, var2);
		} else if (var0 < 2900) { // L: 448
			return ClientPacket.method5865(var0, var1, var2);
		} else if (var0 < 3000) { // L: 449
			return class20.method299(var0, var1, var2);
		} else if (var0 < 3200) { // L: 450
			return class266.method5209(var0, var1, var2);
		} else if (var0 < 3300) { // L: 451
			return class133.method3058(var0, var1, var2);
		} else if (var0 < 3400) { // L: 452
			return Frames.method4856(var0, var1, var2);
		} else if (var0 < 3500) { // L: 453
			return Buddy.method8164(var0, var1, var2);
		} else if (var0 < 3600) { // L: 454
			return WorldMapElement.method3660(var0, var1, var2);
		} else if (var0 < 3700) { // L: 455
			return ReflectionCheck.method698(var0, var1, var2);
		} else if (var0 < 3800) { // L: 456
			return class470.method8453(var0, var1, var2);
		} else if (var0 < 3900) { // L: 457
			return class13.method163(var0, var1, var2);
		} else if (var0 < 4000) { // L: 458
			return class74.method2118(var0, var1, var2);
		} else if (var0 < 4100) {
			return KitDefinition.method3707(var0, var1, var2); // L: 459
		} else if (var0 < 4200) { // L: 460
			return class141.method3129(var0, var1, var2);
		} else if (var0 < 4300) { // L: 461
			return class18.method278(var0, var1, var2);
		} else if (var0 < 5100) { // L: 462
			return Projectile.method2187(var0, var1, var2);
		} else if (var0 < 5400) { // L: 463
			return PlayerComposition.method6300(var0, var1, var2);
		} else if (var0 < 5600) { // L: 464
			return ObjectSound.method1955(var0, var1, var2);
		} else if (var0 < 5700) { // L: 465
			return HealthBarUpdate.method2457(var0, var1, var2);
		} else if (var0 < 6300) { // L: 466
			return WorldMapAreaData.method5744(var0, var1, var2);
		} else if (var0 < 6600) { // L: 467
			return class319.method5968(var0, var1, var2);
		} else if (var0 < 6700) { // L: 468
			return GrandExchangeOfferNameComparator.method7062(var0, var1, var2);
		} else if (var0 < 6800) { // L: 469
			return class330.method6205(var0, var1, var2);
		} else if (var0 < 6900) { // L: 470
			return class169.method3419(var0, var1, var2);
		} else if (var0 < 7000) { // L: 471
			return class104.method2711(var0, var1, var2);
		} else if (var0 < 7100) { // L: 472
			return class224.method4247(var0, var1, var2);
		} else if (var0 < 7200) { // L: 473
			return class17.method265(var0, var1, var2);
		} else if (var0 < 7300) { // L: 474
			return MouseHandler.method652(var0, var1, var2);
		} else if (var0 < 7500) { // L: 475
			return class472.method8475(var0, var1, var2);
		} else if (var0 < 7600) { // L: 476
			return DynamicObject.method2218(var0, var1, var2);
		} else if (var0 < 7700) { // L: 477
			return class150.method3186(var0, var1, var2);
		} else {
			return var0 < 8100 ? class4.method14(var0, var1, var2) : 2; // L: 478 479
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILnm;IIIII[FI)Lnm;",
		garbageValue = "-357368567"
	)
	static Widget method5076(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget(); // L: 801
		var8.type = var0; // L: 802
		var8.parentId = var1.id; // L: 803
		var8.childIndex = var2; // L: 804
		var8.isIf3 = true; // L: 805
		var8.xAlignment = var3; // L: 806
		var8.yAlignment = var4; // L: 807
		var8.widthAlignment = var5; // L: 808
		var8.heightAlignment = var6; // L: 809
		var8.rawX = (int)(var7[0] * (float)var1.width); // L: 810
		var8.rawY = (int)((float)var1.height * var7[1]); // L: 811
		var8.rawWidth = (int)(var7[2] * (float)var1.width); // L: 812
		var8.rawHeight = (int)((float)var1.height * var7[3]); // L: 813
		return var8; // L: 814
	}
}
