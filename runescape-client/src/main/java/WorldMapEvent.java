import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1659239405
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILmr;Lmr;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1720811535"
	)
	public static int method5646(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) { // L: 98 99 102
			var2 = var2 << 1 | var0 & 1; // L: 100
			var0 >>>= 1; // L: 101
		}

		return var2; // L: 104
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(Lmt;B)Lmt;",
		garbageValue = "84"
	)
	static Widget method5647(Widget var0) {
		int var1 = ClientPacket.method5723(UserComparator8.getWidgetFlags(var0)); // L: 12713
		if (var1 == 0) { // L: 12714
			return null;
		} else {
			for (int var2 = 0; var2 < var1; ++var2) { // L: 12715
				var0 = VarbitComposition.getWidget(var0.parentId); // L: 12716
				if (var0 == null) { // L: 12717
					return null;
				}
			}

			return var0; // L: 12719
		}
	}
}
