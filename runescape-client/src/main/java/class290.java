import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
public class class290 {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	public static Font field3096;
	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("fontBold12")
	static Font fontBold12;

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(ZLtf;B)V",
		garbageValue = "-7"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field628 = 0; // L: 8644
		Client.field559 = 0; // L: 8645
		var1.importIndex(); // L: 8647
		int var2 = var1.readBits(8); // L: 8648
		int var3;
		if (var2 < Client.npcCount) { // L: 8649
			for (var3 = var2; var3 < Client.npcCount; ++var3) { // L: 8650
				Client.field629[++Client.field628 - 1] = Client.npcIndices[var3];
			}
		}

		if (var2 > Client.npcCount) { // L: 8652
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 8653

			int var4;
			int var7;
			int var8;
			int var9;
			for (var3 = 0; var3 < var2; ++var3) { // L: 8654
				var4 = Client.npcIndices[var3]; // L: 8655
				NPC var13 = Client.npcs[var4]; // L: 8656
				int var14 = var1.readBits(1); // L: 8657
				if (var14 == 0) { // L: 8658
					Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8659
					var13.npcCycle = Client.cycle; // L: 8660
				} else {
					var7 = var1.readBits(2); // L: 8663
					if (var7 == 0) { // L: 8664
						Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8665
						var13.npcCycle = Client.cycle; // L: 8666
						Client.field560[++Client.field559 - 1] = var4; // L: 8667
					} else if (var7 == 1) { // L: 8670
						Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8671
						var13.npcCycle = Client.cycle; // L: 8672
						var8 = var1.readBits(3); // L: 8673
						var13.method2675(var8, class217.field2391); // L: 8674
						var9 = var1.readBits(1); // L: 8675
						if (var9 == 1) { // L: 8676
							Client.field560[++Client.field559 - 1] = var4;
						}
					} else if (var7 == 2) { // L: 8679
						Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8680
						var13.npcCycle = Client.cycle; // L: 8681
						if (var1.readBits(1) == 1) { // L: 8682
							var8 = var1.readBits(3); // L: 8683
							var13.method2675(var8, class217.field2395); // L: 8684
							var9 = var1.readBits(3); // L: 8685
							var13.method2675(var9, class217.field2395); // L: 8686
						} else {
							var8 = var1.readBits(3); // L: 8689
							var13.method2675(var8, class217.field2392); // L: 8690
						}

						var8 = var1.readBits(1); // L: 8692
						if (var8 == 1) { // L: 8693
							Client.field560[++Client.field559 - 1] = var4;
						}
					} else if (var7 == 3) { // L: 8696
						Client.field629[++Client.field628 - 1] = var4; // L: 8697
					}
				}
			}

			while (true) {
				byte var15 = 16; // L: 8704
				var3 = 1 << var15; // L: 8705
				if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) < var15 + 12) { // L: 8706
					break;
				}

				var4 = var1.readBits(var15); // L: 8707
				if (var4 == var3 - 1) { // L: 8708
					break;
				}

				boolean var5 = false; // L: 8709
				if (Client.npcs[var4] == null) { // L: 8710
					Client.npcs[var4] = new NPC(); // L: 8711
					var5 = true; // L: 8712
				}

				NPC var6 = Client.npcs[var4]; // L: 8714
				Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8715
				var6.npcCycle = Client.cycle; // L: 8716
				int var10 = var1.readBits(1); // L: 8720
				if (var10 == 1) { // L: 8721
					Client.field560[++Client.field559 - 1] = var4;
				}

				var7 = var1.readBits(1); // L: 8722
				boolean var11 = var1.readBits(1) == 1; // L: 8723
				if (var11) { // L: 8724
					var1.readBits(32); // L: 8725
				}

				if (var0) { // L: 8727
					var9 = var1.readBits(8); // L: 8728
					if (var9 > 127) { // L: 8729
						var9 -= 256;
					}
				} else {
					var9 = var1.readBits(5); // L: 8732
					if (var9 > 15) { // L: 8733
						var9 -= 32;
					}
				}

				if (var0) { // L: 8735
					var8 = var1.readBits(8); // L: 8736
					if (var8 > 127) { // L: 8737
						var8 -= 256;
					}
				} else {
					var8 = var1.readBits(5); // L: 8740
					if (var8 > 15) { // L: 8741
						var8 -= 32;
					}
				}

				var6.definition = class144.getNpcDefinition(var1.readBits(14)); // L: 8743
				int var12 = Client.field755[var1.readBits(3)]; // L: 8744
				if (var5) { // L: 8745
					var6.orientation = var6.rotation = var12;
				}

				class93.method2409(var6); // L: 8746
				if (var6.field1228 == 0) { // L: 8747
					var6.rotation = 0;
				}

				var6.method2662(class27.localPlayer.pathX[0] + var8, class27.localPlayer.pathY[0] + var9, var7 == 1); // L: 8748
			}

			var1.exportIndex(); // L: 8750
			class17.method284(var1); // L: 8752

			for (var2 = 0; var2 < Client.field628; ++var2) { // L: 8753
				var3 = Client.field629[var2]; // L: 8754
				if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 8755
					Client.npcs[var3].definition = null; // L: 8756
					Client.npcs[var3] = null; // L: 8757
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 8760
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength); // L: 8761
			} else {
				for (var2 = 0; var2 < Client.npcCount; ++var2) { // L: 8763
					if (Client.npcs[Client.npcIndices[var2]] == null) { // L: 8764
						throw new RuntimeException(var2 + "," + Client.npcCount); // L: 8765
					}
				}

			}
		}
	} // L: 8768
}
