import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("ai")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = -264909595
	)
	static int field2446;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 293274175
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1418028301
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 462429505
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1664197873
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIILii;I)Z",
		garbageValue = "-1725376681"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1186461625"
	)
	public static int method4509(int var0) {
		return var0 >>> 12; // L: 18
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "26"
	)
	static int method4507(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 430
			return KeyHandler.method437(var0, var1, var2);
		} else if (var0 < 1100) { // L: 431
			return class421.method7948(var0, var1, var2);
		} else if (var0 < 1200) { // L: 432
			return class131.method3092(var0, var1, var2);
		} else if (var0 < 1300) { // L: 433
			return MouseHandler.method721(var0, var1, var2);
		} else if (var0 < 1400) { // L: 434
			return GrandExchangeOfferOwnWorldComparator.method1247(var0, var1, var2);
		} else if (var0 < 1500) { // L: 435
			return Occluder.method5586(var0, var1, var2);
		} else if (var0 < 1600) { // L: 436
			return class367.method6958(var0, var1, var2);
		} else if (var0 < 1700) { // L: 437
			return class313.method5998(var0, var1, var2);
		} else if (var0 < 1800) { // L: 438
			return class402.method7522(var0, var1, var2);
		} else if (var0 < 1900) { // L: 439
			return KitDefinition.method3640(var0, var1, var2);
		} else if (var0 < 2000) { // L: 440
			return KeyHandler.method433(var0, var1, var2);
		} else if (var0 < 2100) { // L: 441
			return class421.method7948(var0, var1, var2);
		} else if (var0 < 2200) { // L: 442
			return class131.method3092(var0, var1, var2);
		} else if (var0 < 2300) { // L: 443
			return MouseHandler.method721(var0, var1, var2);
		} else if (var0 < 2400) { // L: 444
			return GrandExchangeOfferOwnWorldComparator.method1247(var0, var1, var2);
		} else if (var0 < 2500) { // L: 445
			return Occluder.method5586(var0, var1, var2);
		} else if (var0 < 2600) { // L: 446
			return class33.method494(var0, var1, var2);
		} else if (var0 < 2700) { // L: 447
			return class386.method7275(var0, var1, var2);
		} else if (var0 < 2800) { // L: 448
			return ReflectionCheck.method735(var0, var1, var2);
		} else if (var0 < 2900) { // L: 449
			return VerticalAlignment.method3786(var0, var1, var2);
		} else if (var0 < 3000) { // L: 450
			return KeyHandler.method433(var0, var1, var2);
		} else if (var0 < 3200) { // L: 451
			return class93.method2440(var0, var1, var2);
		} else if (var0 < 3300) { // L: 452
			return UserComparator3.method2972(var0, var1, var2);
		} else if (var0 < 3400) { // L: 453
			return GameBuild.method6935(var0, var1, var2);
		} else if (var0 < 3500) { // L: 454
			return AbstractArchive.method7038(var0, var1, var2);
		} else if (var0 < 3600) { // L: 455
			return SecureRandomCallable.method2323(var0, var1, var2);
		} else if (var0 < 3700) { // L: 456
			return SecureRandomFuture.method2233(var0, var1, var2);
		} else if (var0 < 3800) { // L: 457
			return class222.method4381(var0, var1, var2);
		} else if (var0 < 3900) { // L: 458
			return class148.method3276(var0, var1, var2);
		} else if (var0 < 4000) { // L: 459
			return PcmPlayer.method860(var0, var1, var2);
		} else if (var0 < 4100) {
			return class358.method6930(var0, var1, var2); // L: 460
		} else if (var0 < 4200) { // L: 461
			return UrlRequest.method2929(var0, var1, var2);
		} else if (var0 < 4300) { // L: 462
			return Occluder.method5590(var0, var1, var2);
		} else if (var0 < 5100) { // L: 463
			return class184.method3709(var0, var1, var2);
		} else if (var0 < 5400) { // L: 464
			return GrandExchangeOfferAgeComparator.method7193(var0, var1, var2);
		} else if (var0 < 5600) { // L: 465
			return Coord.method6328(var0, var1, var2);
		} else if (var0 < 5700) { // L: 466
			return class169.method3544(var0, var1, var2);
		} else if (var0 < 6300) { // L: 467
			return class20.method303(var0, var1, var2);
		} else if (var0 < 6600) { // L: 468
			return class208.method4155(var0, var1, var2);
		} else if (var0 < 6700) { // L: 469
			return class30.method455(var0, var1, var2);
		} else if (var0 < 6800) { // L: 470
			return class314.method6006(var0, var1, var2);
		} else if (var0 < 6900) { // L: 471
			return class400.method7497(var0, var1, var2);
		} else if (var0 < 7000) { // L: 472
			return class1.method10(var0, var1, var2);
		} else if (var0 < 7100) { // L: 473
			return class400.method7498(var0, var1, var2);
		} else if (var0 < 7200) { // L: 474
			return class174.method3571(var0, var1, var2);
		} else if (var0 < 7300) { // L: 475
			return class184.method3708(var0, var1, var2);
		} else if (var0 < 7500) { // L: 476
			return class235.method4604(var0, var1, var2);
		} else if (var0 < 7600) { // L: 477
			return class101.method2719(var0, var1, var2);
		} else if (var0 < 7700) { // L: 478
			return class59.method1186(var0, var1, var2);
		} else {
			return var0 < 8100 ? class139.method3189(var0, var1, var2) : 2; // L: 479 480
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1319131518"
	)
	public static int method4508(int var0) {
		class138 var1 = class430.method8064(var0); // L: 380
		if (var1 == null) { // L: 381
			return 2; // L: 382
		} else {
			return var1.method3159() ? 0 : 1; // L: 384
		}
	}

	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "458248434"
	)
	static void method4506(int var0) {
		Client.oculusOrbState = var0; // L: 12691
	} // L: 12692
}
