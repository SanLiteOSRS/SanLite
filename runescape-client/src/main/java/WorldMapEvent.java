import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1769091939
	)
	static int field2141;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 2110399815
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILia;Lia;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("z")
	public static boolean method3714(long var0) {
		return (int)(var0 >>> 16 & 1L) == 1;
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Occluder.method4090();
		Client.menuActions[0] = "Cancel";
		Client.menuTargets[0] = "";
		Client.menuOpcodes[0] = 1006;
		Client.menuShiftClick[0] = false;
		Client.menuOptionsCount = 1;
	}
}
