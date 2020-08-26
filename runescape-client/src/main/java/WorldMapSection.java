import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lar;B)V",
		garbageValue = "100"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(IIII)Z",
		garbageValue = "-339896458"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(III)Z",
		garbageValue = "-2135820245"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(IIII)[I",
		garbageValue = "-1761492451"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(III)Lhg;",
		garbageValue = "-1553504587"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lkf;I)V",
		garbageValue = "2144381737"
	)
	@Export("read")
	void read(Buffer var1);
}
