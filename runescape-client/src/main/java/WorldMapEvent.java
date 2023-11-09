import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1710474049
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILko;Lko;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-92"
	)
	public static void method5469(int var0, int var1) {
		VarbitComposition var2 = VarpDefinition.method3597(var0); // L: 33
		int var3 = var2.baseVar; // L: 34
		int var4 = var2.startBit; // L: 35
		int var5 = var2.endBit; // L: 36
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 37
		if (var1 < 0 || var1 > var6) { // L: 38
			var1 = 0;
		}

		var6 <<= var4; // L: 39
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6; // L: 40
	} // L: 41

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(CLmn;I)I",
		garbageValue = "-678431768"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 104
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 105
			var0 = Character.toLowerCase(var0); // L: 106
			var2 = (var0 << 4) + 1; // L: 107
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 109
			var2 = 1762;
		}

		return var2; // L: 110
	}
}
