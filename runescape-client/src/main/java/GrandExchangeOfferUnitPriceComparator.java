import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;I)I",
		garbageValue = "714689738"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1); // L: 43
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 47
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 51
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1588481788"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		ArchiveLoader.addChatMessage(var0, var1, var2, (String)null); // L: 19
	} // L: 20

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(ZLuo;ZI)V",
		garbageValue = "151188621"
	)
	static final void method7146(boolean var0, PacketBuffer var1, boolean var2) {
		Client.field595 = var0; // L: 5703
		int var3;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.field595) { // L: 5704
			int var4;
			if (var2) { // L: 5708
				var1.method9306(); // L: 5709
				var4 = var1.readUnsignedShort(); // L: 5710
				var3 = var1.readUnsignedShort(); // L: 5711
				var5 = var1.readUnsignedShort(); // L: 5712
			} else {
				var4 = var1.readUnsignedShort(); // L: 5715
				var3 = var1.method9303(); // L: 5716
				var5 = var1.readUnsignedShort(); // L: 5717
			}

			Varcs.field1394 = new int[var5][4]; // L: 5719

			for (var6 = 0; var6 < var5; ++var6) { // L: 5720
				for (var7 = 0; var7 < 4; ++var7) { // L: 5721
					Varcs.field1394[var6][var7] = var1.readInt(); // L: 5722
				}
			}

			KitDefinition.field1864 = new int[var5]; // L: 5725
			UserComparator7.field1444 = new int[var5]; // L: 5726
			UserComparator3.field1448 = new int[var5]; // L: 5727
			WorldMapData_1.field2511 = new byte[var5][]; // L: 5728
			GrandExchangeEvent.field4369 = new byte[var5][]; // L: 5729
			var5 = 0; // L: 5730

			for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) { // L: 5731
				for (var7 = (var4 - 6) / 8; var7 <= (var4 + 6) / 8; ++var7) { // L: 5732
					var8 = var7 + (var6 << 8); // L: 5733
					KitDefinition.field1864[var5] = var8; // L: 5734
					UserComparator7.field1444[var5] = WorldMapSection0.field2532.getGroupId("m" + var6 + "_" + var7); // L: 5735
					UserComparator3.field1448[var5] = WorldMapSection0.field2532.getGroupId("l" + var6 + "_" + var7); // L: 5736
					++var5; // L: 5737
				}
			}

			class292.method5834(var3, var4, true); // L: 5740
		} else {
			var3 = var1.method9303(); // L: 5743
			boolean var16 = var1.readUnsignedByte() == 1; // L: 5744
			var5 = var1.readUnsignedShort(); // L: 5745
			var6 = var1.readUnsignedShort(); // L: 5746
			var1.importIndex(); // L: 5747

			int var9;
			int var10;
			for (var7 = 0; var7 < 4; ++var7) { // L: 5748
				for (var8 = 0; var8 < 13; ++var8) { // L: 5749
					for (var9 = 0; var9 < 13; ++var9) { // L: 5750
						var10 = var1.readBits(1); // L: 5751
						if (var10 == 1) {
							Client.field562[var7][var8][var9] = var1.readBits(26); // L: 5752
						} else {
							Client.field562[var7][var8][var9] = -1; // L: 5753
						}
					}
				}
			}

			var1.exportIndex(); // L: 5757
			Varcs.field1394 = new int[var6][4]; // L: 5758

			for (var7 = 0; var7 < var6; ++var7) { // L: 5759
				for (var8 = 0; var8 < 4; ++var8) { // L: 5760
					Varcs.field1394[var7][var8] = var1.readInt(); // L: 5761
				}
			}

			KitDefinition.field1864 = new int[var6]; // L: 5764
			UserComparator7.field1444 = new int[var6]; // L: 5765
			UserComparator3.field1448 = new int[var6]; // L: 5766
			WorldMapData_1.field2511 = new byte[var6][]; // L: 5767
			GrandExchangeEvent.field4369 = new byte[var6][]; // L: 5768
			var6 = 0; // L: 5769

			for (var7 = 0; var7 < 4; ++var7) { // L: 5770
				for (var8 = 0; var8 < 13; ++var8) { // L: 5771
					for (var9 = 0; var9 < 13; ++var9) { // L: 5772
						var10 = Client.field562[var7][var8][var9]; // L: 5773
						if (var10 != -1) { // L: 5774
							int var11 = var10 >> 14 & 1023; // L: 5775
							int var12 = var10 >> 3 & 2047; // L: 5776
							int var13 = (var11 / 8 << 8) + var12 / 8; // L: 5777

							int var14;
							for (var14 = 0; var14 < var6; ++var14) { // L: 5778
								if (KitDefinition.field1864[var14] == var13) {
									var13 = -1; // L: 5779
									break; // L: 5780
								}
							}

							if (var13 != -1) { // L: 5782
								KitDefinition.field1864[var6] = var13; // L: 5783
								var14 = var13 >> 8 & 255; // L: 5784
								int var15 = var13 & 255; // L: 5785
								UserComparator7.field1444[var6] = WorldMapSection0.field2532.getGroupId("m" + var14 + "_" + var15); // L: 5786
								UserComparator3.field1448[var6] = WorldMapSection0.field2532.getGroupId("l" + var14 + "_" + var15); // L: 5787
								++var6; // L: 5788
							}
						}
					}
				}
			}

			class292.method5834(var5, var3, !var16); // L: 5794
		}

	} // L: 5796
}
