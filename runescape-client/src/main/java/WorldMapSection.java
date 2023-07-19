import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljh;I)V",
		garbageValue = "-821781156"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1764737995"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1249387971"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-560637356"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)Lmk;",
		garbageValue = "-1072096611"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "1760890975"
	)
	@Export("read")
	void read(Buffer var1);
}
