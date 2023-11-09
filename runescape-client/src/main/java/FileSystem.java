import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Deprecated
@ObfuscatedName("fv")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("o")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("q")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("f")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;
	@ObfuscatedName("hh")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = -86846755
	)
	static int field1753;

	static {
		FileSystem_hasPermissions = false; // L: 7
		FileSystem_cacheFiles = new Hashtable(16);
	} // L: 9

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1137884034"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		Interpreter.addChatMessage(var0, var1, var2, (String)null); // L: 19
	} // L: 20

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "2116620804"
	)
	static int method3276(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 435
			return class122.method2853(var0, var1, var2);
		} else if (var0 < 1100) { // L: 436
			return class361.method6591(var0, var1, var2);
		} else if (var0 < 1200) { // L: 437
			return SceneTilePaint.method4490(var0, var1, var2);
		} else if (var0 < 1300) { // L: 438
			return WorldMapRectangle.method4964(var0, var1, var2);
		} else if (var0 < 1400) { // L: 439
			return class291.method5563(var0, var1, var2);
		} else if (var0 < 1500) { // L: 440
			return class268.method5214(var0, var1, var2);
		} else if (var0 < 1600) { // L: 441
			return VarpDefinition.method3351(var0, var1, var2);
		} else if (var0 < 1700) { // L: 442
			return TaskHandler.method3253(var0, var1, var2);
		} else if (var0 < 1800) { // L: 443
			return WorldMapData_1.method4832(var0, var1, var2);
		} else if (var0 < 1900) { // L: 444
			return DirectByteArrayCopier.method5520(var0, var1, var2);
		} else if (var0 < 2000) { // L: 445
			return LoginScreenAnimation.method2307(var0, var1, var2);
		} else if (var0 < 2100) { // L: 446
			return class361.method6591(var0, var1, var2);
		} else if (var0 < 2200) { // L: 447
			return SceneTilePaint.method4490(var0, var1, var2);
		} else if (var0 < 2300) { // L: 448
			return WorldMapRectangle.method4964(var0, var1, var2);
		} else if (var0 < 2400) { // L: 449
			return class291.method5563(var0, var1, var2);
		} else if (var0 < 2500) { // L: 450
			return class268.method5214(var0, var1, var2);
		} else if (var0 < 2600) { // L: 451
			return GameEngine.method562(var0, var1, var2);
		} else if (var0 < 2700) { // L: 452
			return ClanSettings.method2978(var0, var1, var2);
		} else if (var0 < 2800) { // L: 453
			return BufferedNetSocket.method6883(var0, var1, var2);
		} else if (var0 < 2900) { // L: 454
			return class12.method141(var0, var1, var2);
		} else if (var0 < 3000) { // L: 455
			return LoginScreenAnimation.method2307(var0, var1, var2);
		} else if (var0 < 3200) { // L: 456
			return ModeWhere.method6095(var0, var1, var2);
		} else if (var0 < 3300) { // L: 457
			return class361.method6588(var0, var1, var2);
		} else if (var0 < 3400) { // L: 458
			return ApproximateRouteStrategy.method1093(var0, var1, var2);
		} else if (var0 < 3500) { // L: 459
			return class117.method2793(var0, var1, var2);
		} else if (var0 < 3600) { // L: 460
			return ClanChannelMember.method2907(var0, var1, var2);
		} else if (var0 < 3700) { // L: 461
			return ItemContainer.method2144(var0, var1, var2);
		} else if (var0 < 3800) { // L: 462
			return Calendar.method5511(var0, var1, var2);
		} else if (var0 < 3900) { // L: 463
			return SecureRandomCallable.method2120(var0, var1, var2);
		} else if (var0 < 4000) { // L: 464
			return ObjectSound.method1770(var0, var1, var2);
		} else if (var0 < 4100) { // L: 465
			return class122.method2852(var0, var1, var2);
		} else if (var0 < 4200) { // L: 466
			return class193.method3906(var0, var1, var2);
		} else if (var0 < 4300) { // L: 467
			return PacketBufferNode.method5196(var0, var1, var2);
		} else if (var0 < 5100) { // L: 468
			return Login.method1996(var0, var1, var2);
		} else if (var0 < 5400) { // L: 469
			return Message.method1084(var0, var1, var2);
		} else if (var0 < 5600) { // L: 470
			return class7.method42(var0, var1, var2);
		} else if (var0 < 5700) { // L: 471
			return ChatChannel.method2058(var0, var1, var2);
		} else if (var0 < 6300) { // L: 472
			return ScriptFrame.method1056(var0, var1, var2);
		} else if (var0 < 6600) { // L: 473
			return AttackOption.method2466(var0, var1, var2);
		} else if (var0 < 6700) { // L: 474
			return WorldMapElement.method3356(var0, var1, var2);
		} else if (var0 < 6800) { // L: 475
			return Occluder.method4311(var0, var1, var2);
		} else if (var0 < 6900) { // L: 476
			return Login.method1940(var0, var1, var2);
		} else if (var0 < 7000) { // L: 477
			return WorldMapLabelSize.method4539(var0, var1, var2);
		} else if (var0 < 7100) { // L: 478
			return class271.method5246(var0, var1, var2);
		} else if (var0 < 7200) { // L: 479
			return BuddyRankComparator.method2690(var0, var1, var2);
		} else if (var0 < 7300) { // L: 480
			return class201.method4089(var0, var1, var2);
		} else if (var0 < 7500) { // L: 481
			return class83.method2188(var0, var1, var2);
		} else if (var0 < 7600) { // L: 482
			return DirectByteArrayCopier.method5523(var0, var1, var2);
		} else {
			return var0 < 7700 ? Login.method1999(var0, var1, var2) : 2; // L: 483 484
		}
	}
}
