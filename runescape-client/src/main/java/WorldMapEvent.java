import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 941661619
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILmo;Lmo;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIB)V",
		garbageValue = "124"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4590
			int var3 = class36.SequenceDefinition_get(var1).field2340; // L: 4591
			if (var3 == 1) { // L: 4592
				var0.sequenceFrame = 0; // L: 4593
				var0.sequenceFrameCycle = 0; // L: 4594
				var0.sequenceDelay = var2; // L: 4595
				var0.field1235 = 0; // L: 4596
			}

			if (var3 == 2) { // L: 4598
				var0.field1235 = 0; // L: 4599
			}
		} else if (var1 == -1 || var0.sequence == -1 || class36.SequenceDefinition_get(var1).field2333 >= class36.SequenceDefinition_get(var0.sequence).field2333) { // L: 4602
			var0.sequence = var1; // L: 4603
			var0.sequenceFrame = 0; // L: 4604
			var0.sequenceFrameCycle = 0; // L: 4605
			var0.sequenceDelay = var2; // L: 4606
			var0.field1235 = 0; // L: 4607
			var0.field1261 = var0.pathLength; // L: 4608
		}

	} // L: 4610
}
