import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
public class class304 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luy;II)Z",
		garbageValue = "-1822480707"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 627
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 628
			if (var0.readBits(1) != 0) { // L: 629
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 630
			var4 = var0.readBits(13); // L: 631
			boolean var12 = var0.readBits(1) == 1; // L: 632
			if (var12) { // L: 633
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 634
				throw new RuntimeException(); // L: 635
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 637
				var11.index = var1; // L: 638
				if (Players.field1373[var1] != null) { // L: 639
					var11.read(Players.field1373[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 640
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 641
				var7 = Players.Players_regions[var1]; // L: 642
				var8 = var7 >> 28; // L: 643
				var9 = var7 >> 14 & 255; // L: 644
				var10 = var7 & 255; // L: 645
				var11.pathTraversed[0] = Players.field1370[var1]; // L: 646
				var11.plane = (byte)var8; // L: 647
				var11.resetPath((var9 << 13) + var3 - class20.baseX * 64, (var10 << 13) + var4 - class19.baseY * 64); // L: 648
				var11.field1124 = false; // L: 649
				return true; // L: 650
			}
		} else if (var2 == 1) { // L: 652
			var3 = var0.readBits(2); // L: 653
			var4 = Players.Players_regions[var1]; // L: 654
			Players.Players_regions[var1] = (((var4 >> 28) + var3 & 3) << 28) + (var4 & 268435455); // L: 655
			return false; // L: 656
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 658
				var3 = var0.readBits(5); // L: 659
				var4 = var3 >> 3; // L: 660
				var5 = var3 & 7; // L: 661
				var6 = Players.Players_regions[var1]; // L: 662
				var7 = (var6 >> 28) + var4 & 3; // L: 663
				var8 = var6 >> 14 & 255; // L: 664
				var9 = var6 & 255; // L: 665
				if (var5 == 0) { // L: 666
					--var8; // L: 667
					--var9; // L: 668
				}

				if (var5 == 1) { // L: 670
					--var9;
				}

				if (var5 == 2) { // L: 671
					++var8; // L: 672
					--var9; // L: 673
				}

				if (var5 == 3) { // L: 675
					--var8;
				}

				if (var5 == 4) { // L: 676
					++var8;
				}

				if (var5 == 5) { // L: 677
					--var8; // L: 678
					++var9; // L: 679
				}

				if (var5 == 6) { // L: 681
					++var9;
				}

				if (var5 == 7) { // L: 682
					++var8; // L: 683
					++var9; // L: 684
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 686
				return false; // L: 687
			} else {
				var3 = var0.readBits(18); // L: 689
				var4 = var3 >> 16; // L: 690
				var5 = var3 >> 8 & 255; // L: 691
				var6 = var3 & 255; // L: 692
				var7 = Players.Players_regions[var1]; // L: 693
				var8 = (var7 >> 28) + var4 & 3; // L: 694
				var9 = var5 + (var7 >> 14) & 255; // L: 695
				var10 = var6 + var7 & 255; // L: 696
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 697
				return false; // L: 698
			}
		}
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1658366352"
	)
	static long method5858() {
		return Client.field538; // L: 2966
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "703311848"
	)
	static void method5860() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12125
			int var1 = var0.group; // L: 12126
			if (class33.field184.method6242(var1)) { // L: 12127
				boolean var2 = true; // L: 12128
				Widget[] var3 = class33.field184.field3587[var1]; // L: 12129

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 12130
					if (var3[var4] != null) { // L: 12131
						var2 = var3[var4].isIf3; // L: 12132
						break;
					}
				}

				if (!var2) { // L: 12136
					var4 = (int)var0.key; // L: 12137
					Widget var5 = class33.field184.method6240(var4); // L: 12138
					if (var5 != null) { // L: 12139
						ClanChannelMember.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 12143
}
