import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lju;B)V",
		garbageValue = "-106"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "0"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "326256885"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIS)[I",
		garbageValue = "3148"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Lms;",
		garbageValue = "-2137162191"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "8"
	)
	@Export("read")
	void read(Buffer var1);
}
