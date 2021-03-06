import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "112",
		signature = "(Lar;B)V"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "-90",
		signature = "(IIIB)Z"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "-5",
		signature = "(IIB)Z"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "-76",
		signature = "(IIIB)[I"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		garbageValue = "-1841969392",
		signature = "(III)Lhd;"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-489268143",
		signature = "(Lkx;I)V"
	)
	@Export("read")
	void read(Buffer var1);
}
