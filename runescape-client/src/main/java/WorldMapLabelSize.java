import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	static GameBuild field2882;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1949670383
	)
	final int field2879;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1008526791
	)
	final int field2880;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1148385691
	)
	final int field2881;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(2, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(0, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(1, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2879 = var1; // L: 15
		this.field2880 = var2; // L: 16
		this.field2881 = var3; // L: 17
	} // L: 18

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "-122455389"
	)
	boolean method5058(float var1) {
		return var1 >= (float)this.field2881; // L: 21
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(Lmi;I)Lmi;",
		garbageValue = "1356224559"
	)
	static Widget method5059(Widget var0) {
		Widget var1 = BuddyRankComparator.method2916(var0); // L: 12126
		if (var1 == null) {
			var1 = var0.parent; // L: 12127
		}

		return var1; // L: 12128
	}
}
