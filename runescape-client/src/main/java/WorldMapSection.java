import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lak;I)V",
		garbageValue = "-1645245778"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IIIB)Z",
		garbageValue = "51"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(IIB)Z",
		garbageValue = "10"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(IIIB)[I",
		garbageValue = "-25"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IIB)Lhw;",
		garbageValue = "1"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Lkb;I)V",
		garbageValue = "-222098123"
	)
	@Export("read")
	void read(Buffer var1);
}
