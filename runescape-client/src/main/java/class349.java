import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
public class class349 {
	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(ZLto;B)V",
		garbageValue = "-101"
	)
	static final void method6619(boolean var0, PacketBuffer var1) {
		while (true) {
			byte var2 = 16; // L: 8827
			int var3 = 1 << var2; // L: 8828
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= var2 + 12) { // L: 8829
				int var4 = var1.readBits(var2); // L: 8830
				if (var4 != var3 - 1) { // L: 8831
					boolean var5 = false; // L: 8832
					if (Client.npcs[var4] == null) { // L: 8833
						Client.npcs[var4] = new NPC(); // L: 8834
						var5 = true; // L: 8835
					}

					NPC var6 = Client.npcs[var4]; // L: 8837
					Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8838
					var6.npcCycle = Client.cycle; // L: 8839
					int var8;
					if (var0) { // L: 8843
						var8 = var1.readBits(8); // L: 8844
						if (var8 > 127) { // L: 8845
							var8 -= 256;
						}
					} else {
						var8 = var1.readBits(5); // L: 8848
						if (var8 > 15) { // L: 8849
							var8 -= 32;
						}
					}

					boolean var10 = var1.readBits(1) == 1; // L: 8851
					if (var10) { // L: 8852
						var1.readBits(32); // L: 8853
					}

					int var7 = var1.readBits(1); // L: 8855
					int var11 = Client.field707[var1.readBits(3)]; // L: 8856
					if (var5) { // L: 8857
						var6.orientation = var6.rotation = var11;
					}

					var6.definition = class90.getNpcDefinition(var1.readBits(14)); // L: 8858
					int var12 = var1.readBits(1); // L: 8859
					if (var12 == 1) { // L: 8860
						Client.field737[++Client.field640 - 1] = var4;
					}

					int var9;
					if (var0) { // L: 8861
						var9 = var1.readBits(8); // L: 8862
						if (var9 > 127) { // L: 8863
							var9 -= 256;
						}
					} else {
						var9 = var1.readBits(5); // L: 8866
						if (var9 > 15) { // L: 8867
							var9 -= 32;
						}
					}

					ItemLayer.method4266(var6); // L: 8869
					if (var6.field1266 == 0) { // L: 8870
						var6.rotation = 0;
					}

					var6.method2574(VarbitComposition.localPlayer.pathX[0] + var8, VarbitComposition.localPlayer.pathY[0] + var9, var7 == 1); // L: 8871
					continue; // L: 8872
				}
			}

			var1.exportIndex(); // L: 8873
			return; // L: 8874
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "87449786"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Frames.method4718(); // L: 9202
		Client.menuActions[0] = "Cancel"; // L: 9203
		Client.menuTargets[0] = ""; // L: 9204
		Client.menuOpcodes[0] = 1006; // L: 9205
		Client.menuShiftClick[0] = false; // L: 9206
		Client.menuOptionsCount = 1; // L: 9207
	} // L: 9208
}
