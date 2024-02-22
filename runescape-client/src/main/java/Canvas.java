import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("aq")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1; // L: 11
	} // L: 12

	public final void update(Graphics var1) {
		this.component.update(var1); // L: 15
	} // L: 16

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	} // L: 20

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "67"
	)
	static int method297() {
		return ++Messages.Messages_count - 1; // L: 19
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1372269351"
	)
	static int method296(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 430
			return class228.method4468(var0, var1, var2);
		} else if (var0 < 1100) { // L: 431
			return class357.method6983(var0, var1, var2);
		} else if (var0 < 1200) { // L: 432
			return class103.method2749(var0, var1, var2);
		} else if (var0 < 1300) { // L: 433
			return class193.method3783(var0, var1, var2);
		} else if (var0 < 1400) { // L: 434
			return class175.method3549(var0, var1, var2);
		} else if (var0 < 1500) { // L: 435
			return class12.method145(var0, var1, var2);
		} else if (var0 < 1600) { // L: 436
			return class155.method3310(var0, var1, var2);
		} else if (var0 < 1700) { // L: 437
			return VarbitComposition.method3832(var0, var1, var2);
		} else if (var0 < 1800) { // L: 438
			return class136.method3143(var0, var1, var2);
		} else if (var0 < 1900) { // L: 439
			return class9.method83(var0, var1, var2);
		} else if (var0 < 2000) { // L: 440
			return UserComparator4.method2936(var0, var1, var2);
		} else if (var0 < 2100) { // L: 441
			return class357.method6983(var0, var1, var2);
		} else if (var0 < 2200) { // L: 442
			return class103.method2749(var0, var1, var2);
		} else if (var0 < 2300) { // L: 443
			return class193.method3783(var0, var1, var2);
		} else if (var0 < 2400) { // L: 444
			return class175.method3549(var0, var1, var2);
		} else if (var0 < 2500) { // L: 445
			return class12.method145(var0, var1, var2);
		} else if (var0 < 2600) { // L: 446
			return Occluder.method5636(var0, var1, var2);
		} else if (var0 < 2700) { // L: 447
			return ArchiveDiskAction.method7035(var0, var1, var2);
		} else if (var0 < 2800) { // L: 448
			return class11.method106(var0, var1, var2);
		} else if (var0 < 2900) { // L: 449
			return class9.method82(var0, var1, var2);
		} else if (var0 < 3000) { // L: 450
			return UserComparator4.method2936(var0, var1, var2);
		} else if (var0 < 3200) { // L: 451
			return Archive.method7100(var0, var1, var2);
		} else if (var0 < 3300) { // L: 452
			return FloorUnderlayDefinition.method3816(var0, var1, var2);
		} else if (var0 < 3400) { // L: 453
			return Player.method2437(var0, var1, var2);
		} else if (var0 < 3500) { // L: 454
			return class257.method5057(var0, var1, var2);
		} else if (var0 < 3600) { // L: 455
			return class366.method7007(var0, var1, var2);
		} else if (var0 < 3700) { // L: 456
			return class209.method4124(var0, var1, var2);
		} else if (var0 < 3800) { // L: 457
			return CollisionMap.method4470(var0, var1, var2);
		} else if (var0 < 3900) { // L: 458
			return class371.method7019(var0, var1, var2);
		} else if (var0 < 4000) { // L: 459
			return class19.method255(var0, var1, var2);
		} else if (var0 < 4100) { // L: 460
			return WorldMapSprite.method5040(var0, var1, var2);
		} else if (var0 < 4200) { // L: 461
			return class161.method3440(var0, var1, var2);
		} else if (var0 < 4300) { // L: 462
			return class218.method4259(var0, var1, var2);
		} else if (var0 < 5100) { // L: 463
			return StructComposition.method3875(var0, var1, var2);
		} else if (var0 < 5400) { // L: 464
			return TextureProvider.method5671(var0, var1, var2);
		} else if (var0 < 5600) { // L: 465
			return class67.method1207(var0, var1, var2);
		} else if (var0 < 5700) { // L: 466
			return class10.method98(var0, var1, var2);
		} else if (var0 < 6300) { // L: 467
			return class93.method2439(var0, var1, var2);
		} else if (var0 < 6600) { // L: 468
			return class182.method3658(var0, var1, var2);
		} else if (var0 < 6700) { // L: 469
			return WorldMapData_0.method4613(var0, var1, var2);
		} else if (var0 < 6800) { // L: 470
			return Login.method2199(var0, var1, var2);
		} else if (var0 < 6900) { // L: 471
			return class276.method5619(var0, var1, var2);
		} else if (var0 < 7000) { // L: 472
			return BuddyRankComparator.method2976(var0, var1, var2);
		} else if (var0 < 7100) { // L: 473
			return WorldMapID.method5043(var0, var1, var2);
		} else if (var0 < 7200) { // L: 474
			return class4.method19(var0, var1, var2);
		} else if (var0 < 7300) { // L: 475
			return FloorOverlayDefinition.method4052(var0, var1, var2);
		} else if (var0 < 7500) { // L: 476
			return class11.method100(var0, var1, var2);
		} else if (var0 < 7600) { // L: 477
			return PcmPlayer.method790(var0, var1, var2);
		} else if (var0 < 7700) { // L: 478
			return Client.method1531(var0, var1, var2);
		} else {
			return var0 < 8100 ? CollisionMap.method4501(var0, var1, var2) : 2; // L: 479 480
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1833781181"
	)
	static final int method295(int var0, int var1) {
		if (var0 == -1) { // L: 1000
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 1001
			if (var1 < 2) {
				var1 = 2; // L: 1002
			} else if (var1 > 126) { // L: 1003
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1004
		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "15632"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class485.method8804(); // L: 3006
		switch(var0) { // L: 3007
		case 1:
			JagexCache.method4224(24); // L: 3016
			class114.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 3017
			break;
		case 2:
			class75.method2122(); // L: 3010
		}

	} // L: 3022

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "595411787"
	)
	static final void method292(int var0, int var1) {
		if (ArchiveLoader.field1070.method6437(var0)) { // L: 12010
			class128.runComponentCloseListeners(ArchiveLoader.field1070.field3633[var0], var1); // L: 12011
		}
	} // L: 12012
}
