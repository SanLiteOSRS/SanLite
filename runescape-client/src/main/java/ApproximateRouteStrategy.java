import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;

	ApproximateRouteStrategy() {
	} // L: 13147

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIILix;I)Z",
		garbageValue = "173564567"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 13151
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1464238055"
	)
	static void method1181() {
		Tiles.Tiles_minPlane = 99; // L: 45
		Tiles.field1030 = new short[4][104][104]; // L: 46
		AccessFile.field5129 = new short[4][104][104]; // L: 47
		Tiles.field1031 = new byte[4][104][104]; // L: 48
		Tiles.field1028 = new byte[4][104][104]; // L: 49
		class168.field1833 = new int[4][105][105]; // L: 50
		TextureProvider.field2750 = new byte[4][105][105]; // L: 51
		class306.field3195 = new int[105][105]; // L: 52
		World.Tiles_hue = new int[104]; // L: 53
		WorldMapLabelSize.Tiles_saturation = new int[104]; // L: 54
		class539.Tiles_lightness = new int[104]; // L: 55
		Tiles.Tiles_hueMultiplier = new int[104]; // L: 56
		class384.field4473 = new int[104]; // L: 57
	} // L: 58

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;B)V",
		garbageValue = "1"
	)
	public static void method1185(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0; // L: 17
	} // L: 18

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1991559965"
	)
	static final void method1186(int var0) {
		if (class243.field2620.method6285(var0)) { // L: 12275
			Widget[] var1 = class243.field2620.field3645[var0]; // L: 12276

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12277
				Widget var3 = var1[var2]; // L: 12278
				if (var3 != null) { // L: 12279
					var3.modelFrame = 0; // L: 12280
					var3.modelFrameCycle = 0; // L: 12281
				}
			}

		}
	} // L: 12283
}
