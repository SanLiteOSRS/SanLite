import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -477807375
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILmh;Lmh;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-2019263957"
	)
	static final int method5098(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16; // L: 9
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2126248771"
	)
	public static void method5097(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0; // L: 48
	} // L: 49

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-890618115"
	)
	static void method5099(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75
}
