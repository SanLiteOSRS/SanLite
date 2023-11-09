import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1668264303
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILmk;Lmk;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "13"
	)
	public static int method5678(int var0, int var1, int var2) {
		int var3 = class217.method4380(var2 - var1 + 1); // L: 50
		var3 <<= var1; // L: 51
		return var0 & ~var3; // L: 52
	}
}
