import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 545250955
	)
	@Export("group")
	int group;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -829260005
	)
	@Export("type")
	int type;
	@ObfuscatedName("v")
	boolean field1067;

	InterfaceParent() {
		this.field1067 = false; // L: 8
	} // L: 10

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "30"
	)
	static final void method2251(boolean var0) {
		if (var0) { // L: 2795
			Client.field540 = Login.field930 ? class132.field1629 : class132.field1626; // L: 2796
		} else {
			Client.field540 = StructComposition.clientPreferences.method2436(Login.Login_username) ? class132.field1624 : class132.field1625; // L: 2799
		}

	} // L: 2801

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(ZLqx;I)V",
		garbageValue = "-560600334"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5525
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) { // L: 5526
			var2 = var1.method8530(); // L: 5527
			var3 = var1.method8592(); // L: 5528
			int var4 = var1.readUnsignedShort(); // L: 5529
			class104.xteaKeys = new int[var4][4]; // L: 5530

			for (var5 = 0; var5 < var4; ++var5) { // L: 5531
				for (var6 = 0; var6 < 4; ++var6) { // L: 5532
					class104.xteaKeys[var5][var6] = var1.readInt(); // L: 5533
				}
			}

			class205.regions = new int[var4]; // L: 5536
			Client.regionMapArchiveIds = new int[var4]; // L: 5537
			class379.regionLandArchiveIds = new int[var4]; // L: 5538
			class133.regionLandArchives = new byte[var4][]; // L: 5539
			class241.regionMapArchives = new byte[var4][]; // L: 5540
			var4 = 0; // L: 5541

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) { // L: 5542
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) { // L: 5543
					var7 = var6 + (var5 << 8); // L: 5544
					class205.regions[var4] = var7; // L: 5545
					Client.regionMapArchiveIds[var4] = class4.field7.getGroupId("m" + var5 + "_" + var6); // L: 5546
					class379.regionLandArchiveIds[var4] = class4.field7.getGroupId("l" + var5 + "_" + var6); // L: 5547
					++var4; // L: 5548
				}
			}

			class281.method5499(var2, var3, true); // L: 5551
		} else {
			var2 = var1.method8592(); // L: 5554
			var3 = var1.method8592(); // L: 5555
			boolean var15 = var1.method8581() == 1; // L: 5556
			var5 = var1.readUnsignedShort(); // L: 5557
			var1.importIndex(); // L: 5558

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5559
				for (var7 = 0; var7 < 13; ++var7) { // L: 5560
					for (var8 = 0; var8 < 13; ++var8) { // L: 5561
						var9 = var1.readBits(1); // L: 5562
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5563
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5564
						}
					}
				}
			}

			var1.exportIndex(); // L: 5568
			class104.xteaKeys = new int[var5][4]; // L: 5569

			for (var6 = 0; var6 < var5; ++var6) { // L: 5570
				for (var7 = 0; var7 < 4; ++var7) { // L: 5571
					class104.xteaKeys[var6][var7] = var1.readInt(); // L: 5572
				}
			}

			class205.regions = new int[var5]; // L: 5575
			Client.regionMapArchiveIds = new int[var5]; // L: 5576
			class379.regionLandArchiveIds = new int[var5]; // L: 5577
			class133.regionLandArchives = new byte[var5][]; // L: 5578
			class241.regionMapArchives = new byte[var5][]; // L: 5579
			var5 = 0; // L: 5580

			for (var6 = 0; var6 < 4; ++var6) { // L: 5581
				for (var7 = 0; var7 < 13; ++var7) { // L: 5582
					for (var8 = 0; var8 < 13; ++var8) { // L: 5583
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5584
						if (var9 != -1) { // L: 5585
							int var10 = var9 >> 14 & 1023; // L: 5586
							int var11 = var9 >> 3 & 2047; // L: 5587
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5588

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5589
								if (class205.regions[var13] == var12) {
									var12 = -1; // L: 5590
									break; // L: 5591
								}
							}

							if (var12 != -1) { // L: 5593
								class205.regions[var5] = var12; // L: 5594
								var13 = var12 >> 8 & 255; // L: 5595
								int var14 = var12 & 255; // L: 5596
								Client.regionMapArchiveIds[var5] = class4.field7.getGroupId("m" + var13 + "_" + var14); // L: 5597
								class379.regionLandArchiveIds[var5] = class4.field7.getGroupId("l" + var13 + "_" + var14); // L: 5598
								++var5; // L: 5599
							}
						}
					}
				}
			}

			class281.method5499(var2, var3, !var15); // L: 5605
		}

	} // L: 5607
}
