import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1019858505
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1874940309
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1995099473
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1; // L: 9
		this.decoration = var2; // L: 10
		this.rotation = var3; // L: 11
	} // L: 12

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lig;",
		garbageValue = "-122"
	)
	static RouteStrategy method5461(int var0, int var1) {
		Client.field804.approxDestinationX = var0; // L: 9089
		Client.field804.approxDestinationY = var1; // L: 9090
		Client.field804.approxDestinationSizeX = 1; // L: 9091
		Client.field804.approxDestinationSizeY = 1; // L: 9092
		return Client.field804; // L: 9093
	}
}
