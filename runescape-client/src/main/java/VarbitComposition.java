import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("sg")
	static boolean field2116;
	@ObfuscatedName("vi")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("VarbitDefinition_cached")
	static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("j")
	static final int[] field2114;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -849337785
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -926382043
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1686633587
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
		field2114 = new int[32]; // L: 15
		int var0 = 2; // L: 18

		for (int var1 = 0; var1 < 32; ++var1) { // L: 19
			field2114[var1] = var0 - 1; // L: 20
			var0 += var0; // L: 21
		}

	} // L: 23

	VarbitComposition() {
	} // L: 25

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "-2142044850"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 43
			if (var2 == 0) { // L: 44
				return; // L: 47
			}

			this.decodeNext(var1, var2); // L: 45
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lrd;IB)V",
		garbageValue = "8"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 50
			this.baseVar = var1.readUnsignedShort(); // L: 51
			this.startBit = var1.readUnsignedByte(); // L: 52
			this.endBit = var1.readUnsignedByte(); // L: 53
		}

	} // L: 56

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lbw;B)V",
		garbageValue = "-31"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 1845
			Client.isMembersWorld = var0.isMembersOnly(); // L: 1846
			StructComposition.method3868(var0.isMembersOnly()); // L: 1847
		}

		if (var0.properties != Client.worldProperties) { // L: 1849
			ObjectComposition.method3948(WorldMapEvent.archive8, var0.properties); // L: 1850
		}

		NetCache.worldHost = var0.host; // L: 1852
		Client.worldId = var0.id; // L: 1853
		Client.worldProperties = var0.properties; // L: 1854
		class1.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 1855
		class10.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 1856
		Calendar.currentPort = class1.worldPort; // L: 1857
	} // L: 1858

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-119"
	)
	static final void method3812() {
		for (int var0 = 0; var0 < Client.npcCount; ++var0) { // L: 4231
			int var1 = Client.npcIndices[var0]; // L: 4232
			NPC var2 = Client.npcs[var1]; // L: 4233
			if (var2 != null) { // L: 4234
				PcmPlayer.updateActorSequence(var2, var2.definition.size); // L: 4235
			}
		}

	} // L: 4238
}
