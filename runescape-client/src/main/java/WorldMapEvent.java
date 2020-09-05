import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1732221889
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lhg;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lhg;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		signature = "(ILhg;Lhg;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(ILcy;ZI)I",
		garbageValue = "-1029806693"
	)
	static int method830(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return ApproximateRouteStrategy.method1274(var0, var1, var2);
		} else if (var0 < 1100) {
			return GameBuild.method4218(var0, var1, var2);
		} else if (var0 < 1200) {
			return WorldMapLabel.method497(var0, var1, var2);
		} else if (var0 < 1300) {
			return class1.method22(var0, var1, var2);
		} else if (var0 < 1400) {
			return UrlRequester.method3419(var0, var1, var2);
		} else if (var0 < 1500) {
			return SecureRandomCallable.method1200(var0, var1, var2);
		} else if (var0 < 1600) {
			return AttackOption.method2152(var0, var1, var2);
		} else if (var0 < 1700) {
			return WorldMapLabelSize.method279(var0, var1, var2);
		} else if (var0 < 1800) {
			return WorldMapIcon_1.method378(var0, var1, var2);
		} else if (var0 < 1900) {
			return PendingSpawn.method1794(var0, var1, var2);
		} else if (var0 < 2000) {
			return HitSplatDefinition.method4698(var0, var1, var2);
		} else if (var0 < 2100) {
			return GameBuild.method4218(var0, var1, var2);
		} else if (var0 < 2200) {
			return WorldMapLabel.method497(var0, var1, var2);
		} else if (var0 < 2300) {
			return class1.method22(var0, var1, var2);
		} else if (var0 < 2400) {
			return UrlRequester.method3419(var0, var1, var2);
		} else if (var0 < 2500) {
			return SecureRandomCallable.method1200(var0, var1, var2);
		} else if (var0 < 2600) {
			return KeyHandler.method888(var0, var1, var2);
		} else if (var0 < 2700) {
			return KeyHandler.method890(var0, var1, var2);
		} else if (var0 < 2800) {
			return GrandExchangeOfferNameComparator.method231(var0, var1, var2);
		} else if (var0 < 2900) {
			return WorldMapDecoration.method405(var0, var1, var2);
		} else if (var0 < 3000) {
			return HitSplatDefinition.method4698(var0, var1, var2);
		} else if (var0 < 3200) {
			return GrandExchangeOfferWorldComparator.method141(var0, var1, var2);
		} else if (var0 < 3300) {
			return WorldMapID.method617(var0, var1, var2);
		} else if (var0 < 3400) {
			return WorldMapArea.method485(var0, var1, var2);
		} else if (var0 < 3500) {
			return class169.method3542(var0, var1, var2);
		} else if (var0 < 3700) {
			return Actor.method1798(var0, var1, var2);
		} else if (var0 < 4000) {
			return HealthBar.method2112(var0, var1, var2);
		} else if (var0 < 4100) {
			return class303.method5451(var0, var1, var2);
		} else if (var0 < 4200) {
			return GrandExchangeEvents.method144(var0, var1, var2);
		} else if (var0 < 4300) {
			return ArchiveDiskAction.method4231(var0, var1, var2);
		} else if (var0 < 5100) {
			return class171.method3544(var0, var1, var2);
		} else if (var0 < 5400) {
			return UserComparator7.method3513(var0, var1, var2);
		} else if (var0 < 5600) {
			return SoundCache.method2607(var0, var1, var2);
		} else if (var0 < 5700) {
			return AbstractWorldMapData.method351(var0, var1, var2);
		} else if (var0 < 6300) {
			return class336.method6380(var0, var1, var2);
		} else if (var0 < 6600) {
			return ItemComposition.method4793(var0, var1, var2);
		} else {
			return var0 < 6700 ? Player.method1324(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(B)Lct;",
		garbageValue = "-13"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? AbstractByteArrayCopier.World_worlds[++World.World_listCount - 1] : null;
	}
}
