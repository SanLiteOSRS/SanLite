import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("ub")
	@ObfuscatedGetter(
		intValue = 1270192117
	)
	static int field2505;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1593065305
	)
	@Export("id")
	int id;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2009602779
	)
	@Export("count")
	int count;
	@ObfuscatedName("aq")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("ap")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	class220 field2504;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1; // L: 19
		Buffer var3 = new Buffer(var2); // L: 20
		this.count = var3.readUnsignedByte(); // L: 21
		this.transformTypes = new int[this.count]; // L: 22
		this.labels = new int[this.count][]; // L: 23

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) { // L: 24
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 25
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 26
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) { // L: 27
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) { // L: 29
			var4 = var3.readUnsignedShort(); // L: 30
			if (var4 > 0) { // L: 31
				this.field2504 = new class220(var3, var4); // L: 32
			}
		}

	} // L: 35

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1955897689"
	)
	public int method4380() {
		return this.count; // L: 38
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lik;",
		garbageValue = "1670591230"
	)
	public class220 method4377() {
		return this.field2504; // L: 42
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(ZLsq;I)V",
		garbageValue = "900523512"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5566
		int var2;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) { // L: 5567
			var2 = var1.method8662(); // L: 5568
			int var3 = var1.method8831(); // L: 5569
			var4 = var1.readUnsignedShort(); // L: 5570
			ModelData0.xteaKeys = new int[var4][4]; // L: 5571

			for (var5 = 0; var5 < var4; ++var5) { // L: 5572
				for (var6 = 0; var6 < 4; ++var6) { // L: 5573
					ModelData0.xteaKeys[var5][var6] = var1.readInt(); // L: 5574
				}
			}

			class12.regions = new int[var4]; // L: 5577
			PacketBuffer.regionMapArchiveIds = new int[var4]; // L: 5578
			class123.regionLandArchiveIds = new int[var4]; // L: 5579
			GrandExchangeOfferOwnWorldComparator.regionLandArchives = new byte[var4][]; // L: 5580
			class372.regionMapArchives = new byte[var4][]; // L: 5581
			var4 = 0; // L: 5582

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) { // L: 5583
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) { // L: 5584
					var7 = var6 + (var5 << 8); // L: 5585
					class12.regions[var4] = var7; // L: 5586
					PacketBuffer.regionMapArchiveIds[var4] = ClientPreferences.field1265.getGroupId("m" + var5 + "_" + var6); // L: 5587
					class123.regionLandArchiveIds[var4] = ClientPreferences.field1265.getGroupId("l" + var5 + "_" + var6); // L: 5588
					++var4; // L: 5589
				}
			}

			Coord.method5773(var2, var3, true); // L: 5592
		} else {
			var2 = var1.method8662(); // L: 5595
			boolean var15 = var1.method8650() == 1; // L: 5596
			var4 = var1.method8831(); // L: 5597
			var5 = var1.readUnsignedShort(); // L: 5598
			var1.importIndex(); // L: 5599

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5600
				for (var7 = 0; var7 < 13; ++var7) { // L: 5601
					for (var8 = 0; var8 < 13; ++var8) { // L: 5602
						var9 = var1.readBits(1); // L: 5603
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5604
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5605
						}
					}
				}
			}

			var1.exportIndex(); // L: 5609
			ModelData0.xteaKeys = new int[var5][4]; // L: 5610

			for (var6 = 0; var6 < var5; ++var6) { // L: 5611
				for (var7 = 0; var7 < 4; ++var7) { // L: 5612
					ModelData0.xteaKeys[var6][var7] = var1.readInt(); // L: 5613
				}
			}

			class12.regions = new int[var5]; // L: 5616
			PacketBuffer.regionMapArchiveIds = new int[var5]; // L: 5617
			class123.regionLandArchiveIds = new int[var5]; // L: 5618
			GrandExchangeOfferOwnWorldComparator.regionLandArchives = new byte[var5][]; // L: 5619
			class372.regionMapArchives = new byte[var5][]; // L: 5620
			var5 = 0; // L: 5621

			for (var6 = 0; var6 < 4; ++var6) { // L: 5622
				for (var7 = 0; var7 < 13; ++var7) { // L: 5623
					for (var8 = 0; var8 < 13; ++var8) { // L: 5624
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5625
						if (var9 != -1) { // L: 5626
							int var10 = var9 >> 14 & 1023; // L: 5627
							int var11 = var9 >> 3 & 2047; // L: 5628
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5629

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5630
								if (class12.regions[var13] == var12) {
									var12 = -1; // L: 5631
									break; // L: 5632
								}
							}

							if (var12 != -1) { // L: 5634
								class12.regions[var5] = var12; // L: 5635
								var13 = var12 >> 8 & 255; // L: 5636
								int var14 = var12 & 255; // L: 5637
								PacketBuffer.regionMapArchiveIds[var5] = ClientPreferences.field1265.getGroupId("m" + var13 + "_" + var14); // L: 5638
								class123.regionLandArchiveIds[var5] = ClientPreferences.field1265.getGroupId("l" + var13 + "_" + var14); // L: 5639
								++var5; // L: 5640
							}
						}
					}
				}
			}

			Coord.method5773(var2, var4, !var15); // L: 5646
		}

	} // L: 5648

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2135079356"
	)
	static final void method4384(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0); // L: 11622
		var0 = 100 - var0; // L: 11623
		float var1 = (float)var0 / 200.0F + 0.5F; // L: 11624
		class7.method54((double)var1); // L: 11625
	} // L: 11626
}
