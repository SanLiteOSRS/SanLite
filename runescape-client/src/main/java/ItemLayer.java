import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2064997173
	)
	@Export("z")
	int z;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1473635399
	)
	@Export("x")
	int x;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1839139071
	)
	@Export("y")
	int y;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -8562400470617197071L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1118938495
	)
	@Export("height")
	int height;

	ItemLayer() {
	} // L: 13

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2088433826"
	)
	public static boolean method4307(int var0) {
		return var0 >= WorldMapDecorationType.field3768.id && var0 <= WorldMapDecorationType.field3769.id; // L: 43
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(ZLsq;I)V",
		garbageValue = "-875746645"
	)
	static final void method4306(boolean var0, PacketBuffer var1) {
		while (true) {
			byte var2 = 16; // L: 8507
			int var3 = 1 << var2; // L: 8508
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= var2 + 12) { // L: 8509
				int var4 = var1.readBits(var2); // L: 8510
				if (var4 != var3 - 1) { // L: 8511
					boolean var5 = false; // L: 8512
					if (Client.npcs[var4] == null) { // L: 8513
						Client.npcs[var4] = new NPC(); // L: 8514
						var5 = true; // L: 8515
					}

					NPC var6 = Client.npcs[var4]; // L: 8517
					Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8518
					var6.npcCycle = Client.cycle; // L: 8519
					int var9;
					if (var0) { // L: 8523
						var9 = var1.readBits(8); // L: 8524
						if (var9 > 127) { // L: 8525
							var9 -= 256;
						}
					} else {
						var9 = var1.readBits(5); // L: 8528
						if (var9 > 15) { // L: 8529
							var9 -= 32;
						}
					}

					boolean var10 = var1.readBits(1) == 1; // L: 8531
					if (var10) { // L: 8532
						var1.readBits(32); // L: 8533
					}

					int var11 = var1.readBits(1); // L: 8535
					if (var11 == 1) { // L: 8536
						Client.field549[++Client.field548 - 1] = var4;
					}

					int var7 = var1.readBits(1); // L: 8537
					var6.definition = AbstractArchive.getNpcDefinition(var1.readBits(14)); // L: 8538
					int var8;
					if (var0) { // L: 8539
						var8 = var1.readBits(8); // L: 8540
						if (var8 > 127) { // L: 8541
							var8 -= 256;
						}
					} else {
						var8 = var1.readBits(5); // L: 8544
						if (var8 > 15) { // L: 8545
							var8 -= 32;
						}
					}

					int var12 = Client.field693[var1.readBits(3)]; // L: 8547
					if (var5) { // L: 8548
						var6.orientation = var6.rotation = var12;
					}

					class142.method3236(var6); // L: 8549
					if (var6.field1190 == 0) { // L: 8550
						var6.rotation = 0;
					}

					var6.method2563(MusicPatchNode.localPlayer.pathX[0] + var8, MusicPatchNode.localPlayer.pathY[0] + var9, var7 == 1); // L: 8551
					continue; // L: 8552
				}
			}

			var1.exportIndex(); // L: 8553
			return; // L: 8554
		}
	}
}
