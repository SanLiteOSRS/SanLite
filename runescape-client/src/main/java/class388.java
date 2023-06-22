import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
public final class class388 {
	@ObfuscatedName("ax")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("at")
	final Object field4406;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -373962089
	)
	int field4407;

	class388(Object var1, int var2) {
		this.field4406 = var1; // L: 170
		this.field4407 = var2; // L: 171
	} // L: 172

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)J",
		garbageValue = "-211423517"
	)
	static long method7211(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1); // L: 38
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1526063691"
	)
	public static int method7210(int var0) {
		return 255 - (var0 & 255); // L: 111
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "385267"
	)
	static int method7212(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 426
			return GrandExchangeOfferOwnWorldComparator.method1195(var0, var1, var2);
		} else if (var0 < 1100) { // L: 427
			return class171.method3486(var0, var1, var2);
		} else if (var0 < 1200) { // L: 428
			return class180.method3540(var0, var1, var2);
		} else if (var0 < 1300) { // L: 429
			return NPCComposition.method3745(var0, var1, var2);
		} else if (var0 < 1400) { // L: 430
			return class13.method165(var0, var1, var2);
		} else if (var0 < 1500) { // L: 431
			return Occluder.method4726(var0, var1, var2);
		} else if (var0 < 1600) { // L: 432
			return class411.method7695(var0, var1, var2);
		} else if (var0 < 1700) { // L: 433
			return ByteArrayPool.method7598(var0, var1, var2);
		} else if (var0 < 1800) { // L: 434
			return WorldMapSection2.method5101(var0, var1, var2);
		} else if (var0 < 1900) { // L: 435
			return VarpDefinition.method3586(var0, var1, var2);
		} else if (var0 < 2000) { // L: 436
			return class112.method2828(var0, var1, var2);
		} else if (var0 < 2100) { // L: 437
			return class171.method3486(var0, var1, var2);
		} else if (var0 < 2200) { // L: 438
			return class180.method3540(var0, var1, var2);
		} else if (var0 < 2300) { // L: 439
			return NPCComposition.method3745(var0, var1, var2);
		} else if (var0 < 2400) { // L: 440
			return class13.method165(var0, var1, var2);
		} else if (var0 < 2500) { // L: 441
			return Occluder.method4726(var0, var1, var2);
		} else if (var0 < 2600) { // L: 442
			return class213.method4210(var0, var1, var2);
		} else if (var0 < 2700) { // L: 443
			return class161.method3327(var0, var1, var2);
		} else if (var0 < 2800) { // L: 444
			return class92.method2342(var0, var1, var2);
		} else if (var0 < 2900) { // L: 445
			return WorldMapSectionType.method5425(var0, var1, var2);
		} else if (var0 < 3000) { // L: 446
			return class112.method2828(var0, var1, var2);
		} else if (var0 < 3200) { // L: 447
			return class107.method2700(var0, var1, var2);
		} else if (var0 < 3300) { // L: 448
			return class156.method3294(var0, var1, var2);
		} else if (var0 < 3400) { // L: 449
			return class13.method168(var0, var1, var2);
		} else if (var0 < 3500) { // L: 450
			return class211.method4140(var0, var1, var2);
		} else if (var0 < 3600) { // L: 451
			return ModeWhere.method6927(var0, var1, var2);
		} else if (var0 < 3700) { // L: 452
			return SpotAnimationDefinition.method3777(var0, var1, var2);
		} else if (var0 < 3800) { // L: 453
			return MidiPcmStream.method5848(var0, var1, var2);
		} else if (var0 < 3900) { // L: 454
			return VertexNormal.method4922(var0, var1, var2);
		} else if (var0 < 4000) { // L: 455
			return class4.method12(var0, var1, var2);
		} else if (var0 < 4100) { // L: 456
			return class136.method3075(var0, var1, var2);
		} else if (var0 < 4200) {
			return BufferedNetSocket.method7977(var0, var1, var2); // L: 457
		} else if (var0 < 4300) { // L: 458
			return class60.method1133(var0, var1, var2);
		} else if (var0 < 5100) { // L: 459
			return Players.method2699(var0, var1, var2);
		} else if (var0 < 5400) { // L: 460
			return Renderable.method4715(var0, var1, var2);
		} else if (var0 < 5600) { // L: 461
			return ModeWhere.method6928(var0, var1, var2);
		} else if (var0 < 5700) { // L: 462
			return Client.method1335(var0, var1, var2);
		} else if (var0 < 6300) { // L: 463
			return VerticalAlignment.method3754(var0, var1, var2);
		} else if (var0 < 6600) { // L: 464
			return ObjectSound.method1881(var0, var1, var2);
		} else if (var0 < 6700) { // L: 465
			return ModelData0.method5025(var0, var1, var2);
		} else if (var0 < 6800) { // L: 466
			return class211.method4168(var0, var1, var2);
		} else if (var0 < 6900) { // L: 467
			return class299.method5682(var0, var1, var2);
		} else if (var0 < 7000) { // L: 468
			return class11.method111(var0, var1, var2);
		} else if (var0 < 7100) { // L: 469
			return class135.method3047(var0, var1, var2);
		} else if (var0 < 7200) { // L: 470
			return class130.method3007(var0, var1, var2);
		} else if (var0 < 7300) { // L: 471
			return DevicePcmPlayerProvider.method316(var0, var1, var2);
		} else if (var0 < 7500) { // L: 472
			return Frames.method4722(var0, var1, var2);
		} else if (var0 < 7600) { // L: 473
			return NPCComposition.method3746(var0, var1, var2);
		} else {
			return var0 < 7700 ? class47.method843(var0, var1, var2) : 2; // L: 474 475
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "50"
	)
	public static int method7213(int var0, int var1) {
		int var2 = var0 >>> 31; // L: 87
		return (var0 + var2) / var1 - var2; // L: 88
	}
}
