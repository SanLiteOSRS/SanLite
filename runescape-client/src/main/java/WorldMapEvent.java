import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2124516847
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lhk;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lhk;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		signature = "(ILhk;Lhk;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "1623045574"
	)
	public static boolean method3267(int var0) {
		return (var0 & 1) != 0;
	}
}
