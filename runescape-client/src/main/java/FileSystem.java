import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("ay")
	@Export("FileSystem_hasPermissions")
	public static boolean FileSystem_hasPermissions;
	@ObfuscatedName("an")
	@Export("FileSystem_cacheDir")
	public static File FileSystem_cacheDir;
	@ObfuscatedName("ar")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;

	static {
		FileSystem_hasPermissions = false; // L: 7
		FileSystem_cacheFiles = new Hashtable(16);
	} // L: 9

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lhc;",
		garbageValue = "619507511"
	)
	public static HealthBarDefinition method3483(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0); // L: 32
		if (var1 != null) { // L: 33
			return var1;
		} else {
			byte[] var2 = GrandExchangeOfferNameComparator.HealthBarDefinition_archive.takeFile(33, var0); // L: 34
			var1 = new HealthBarDefinition(); // L: 35
			var1.field1959 = var0; // L: 36
			if (var2 != null) { // L: 37
				var1.decode(new Buffer(var2)); // L: 38
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0); // L: 40
			return var1; // L: 41
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZB)I",
		garbageValue = "1"
	)
	static int method3485(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 426
			return TileItem.method2649(var0, var1, var2);
		} else if (var0 < 1100) { // L: 427
			return class12.method113(var0, var1, var2);
		} else if (var0 < 1200) { // L: 428
			return VarpDefinition.method3555(var0, var1, var2);
		} else if (var0 < 1300) { // L: 429
			return UserComparator10.method2886(var0, var1, var2);
		} else if (var0 < 1400) { // L: 430
			return NPCComposition.method3720(var0, var1, var2);
		} else if (var0 < 1500) { // L: 431
			return class438.method8213(var0, var1, var2);
		} else if (var0 < 1600) { // L: 432
			return class190.method3642(var0, var1, var2);
		} else if (var0 < 1700) { // L: 433
			return PendingSpawn.method2345(var0, var1, var2);
		} else if (var0 < 1800) { // L: 434
			return MusicPatch.method6009(var0, var1, var2);
		} else if (var0 < 1900) { // L: 435
			return PcmPlayer.method821(var0, var1, var2);
		} else if (var0 < 2000) { // L: 436
			return Bounds.method8069(var0, var1, var2);
		} else if (var0 < 2100) { // L: 437
			return class12.method113(var0, var1, var2);
		} else if (var0 < 2200) { // L: 438
			return VarpDefinition.method3555(var0, var1, var2);
		} else if (var0 < 2300) { // L: 439
			return UserComparator10.method2886(var0, var1, var2);
		} else if (var0 < 2400) { // L: 440
			return NPCComposition.method3720(var0, var1, var2);
		} else if (var0 < 2500) { // L: 441
			return class438.method8213(var0, var1, var2);
		} else if (var0 < 2600) { // L: 442
			return class7.method54(var0, var1, var2);
		} else if (var0 < 2700) { // L: 443
			return class133.method3026(var0, var1, var2);
		} else if (var0 < 2800) { // L: 444
			return class60.method1151(var0, var1, var2);
		} else if (var0 < 2900) { // L: 445
			return class218.method4223(var0, var1, var2);
		} else if (var0 < 3000) { // L: 446
			return Bounds.method8069(var0, var1, var2);
		} else if (var0 < 3200) { // L: 447
			return class392.method7392(var0, var1, var2);
		} else if (var0 < 3300) { // L: 448
			return class439.method8237(var0, var1, var2);
		} else if (var0 < 3400) { // L: 449
			return MusicPatchNode.method6049(var0, var1, var2);
		} else if (var0 < 3500) { // L: 450
			return class516.method9559(var0, var1, var2);
		} else if (var0 < 3600) { // L: 451
			return class4.method19(var0, var1, var2);
		} else if (var0 < 3700) { // L: 452
			return ViewportMouse.method4905(var0, var1, var2);
		} else if (var0 < 3800) { // L: 453
			return class216.method4198(var0, var1, var2);
		} else if (var0 < 3900) { // L: 454
			return ParamComposition.method3785(var0, var1, var2);
		} else if (var0 < 4000) { // L: 455
			return ClanChannelMember.method3122(var0, var1, var2);
		} else if (var0 < 4100) { // L: 456
			return class1.method9(var0, var1, var2);
		} else if (var0 < 4200) { // L: 457
			return class107.method2678(var0, var1, var2);
		} else if (var0 < 4300) { // L: 458
			return class151.method3172(var0, var1, var2);
		} else if (var0 < 5100) { // L: 459
			return class138.method3076(var0, var1, var2);
		} else if (var0 < 5400) { // L: 460
			return MenuAction.method2050(var0, var1, var2);
		} else if (var0 < 5600) { // L: 461
			return SecureRandomCallable.method2211(var0, var1, var2);
		} else if (var0 < 5700) { // L: 462
			return WorldMapManager.method5338(var0, var1, var2);
		} else if (var0 < 6300) { // L: 463
			return GraphicsObject.method2036(var0, var1, var2);
		} else if (var0 < 6600) { // L: 464
			return class151.method3173(var0, var1, var2);
		} else if (var0 < 6700) { // L: 465
			return InterfaceParent.method2239(var0, var1, var2);
		} else if (var0 < 6800) { // L: 466
			return Skeleton.method4470(var0, var1, var2);
		} else if (var0 < 6900) { // L: 467
			return Skills.method6637(var0, var1, var2);
		} else if (var0 < 7000) { // L: 468
			return HealthBarDefinition.method3628(var0, var1, var2);
		} else if (var0 < 7100) { // L: 469
			return Message.method1165(var0, var1, var2);
		} else if (var0 < 7200) { // L: 470
			return class350.method6650(var0, var1, var2);
		} else if (var0 < 7300) { // L: 471
			return MusicPatchNode.method6048(var0, var1, var2);
		} else if (var0 < 7500) { // L: 472
			return WorldMapScaleHandler.method5611(var0, var1, var2);
		} else if (var0 < 7600) { // L: 473
			return class404.method7612(var0, var1, var2);
		} else {
			return var0 < 7700 ? class18.method269(var0, var1, var2) : 2; // L: 474 475
		}
	}

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltk;",
		garbageValue = "-4"
	)
	static class494 method3486(int var0) {
		class494 var1 = (class494)Client.Widget_cachedModels.get((long)var0); // L: 12648
		if (var1 == null) { // L: 12649
			var1 = new class494(class328.field3591, ScriptFrame.method1163(var0), HitSplatDefinition.method3844(var0)); // L: 12650
			Client.Widget_cachedModels.put(var1, (long)var0); // L: 12651
		}

		return var1; // L: 12653
	}
}
