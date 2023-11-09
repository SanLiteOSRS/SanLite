import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
public class class127 implements class356 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	static final class127 field1545;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	static final class127 field1547;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	static final class127 field1546;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	static final class127 field1544;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	static final class127 field1566;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	static final class127 field1560;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	static final class127 field1550;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	static final class127 field1551;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	static final class127 field1552;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	static final class127 field1553;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	static final class127 field1554;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	static final class127 field1548;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	static final class127 field1556;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	static final class127 field1549;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	static final class127 field1555;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	static final class127 field1559;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	static final class127 field1558;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = 814421223
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 551837117
	)
	final int field1561;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1158217209
	)
	final int field1562;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1204354247
	)
	final int field1563;

	static {
		field1545 = new class127(0, 0, (String)null, -1, -1); // L: 46
		field1547 = new class127(1, 1, (String)null, 0, 2); // L: 47
		field1546 = new class127(2, 2, (String)null, 1, 2); // L: 48
		field1544 = new class127(3, 3, (String)null, 2, 2); // L: 49
		field1566 = new class127(4, 4, (String)null, 3, 1); // L: 50
		field1560 = new class127(5, 5, (String)null, 4, 1); // L: 51
		field1550 = new class127(6, 6, (String)null, 5, 1); // L: 52
		field1551 = new class127(7, 7, (String)null, 6, 3); // L: 53
		field1552 = new class127(8, 8, (String)null, 7, 3); // L: 54
		field1553 = new class127(9, 9, (String)null, 8, 3); // L: 55
		field1554 = new class127(10, 10, (String)null, 0, 7); // L: 56
		field1548 = new class127(11, 11, (String)null, 1, 7); // L: 57
		field1556 = new class127(12, 12, (String)null, 2, 7); // L: 58
		field1549 = new class127(13, 13, (String)null, 3, 7); // L: 59
		field1555 = new class127(14, 14, (String)null, 4, 7); // L: 60
		field1559 = new class127(15, 15, (String)null, 5, 7); // L: 61
		field1558 = new class127(16, 16, (String)null, 0, 5); // L: 62
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class127(int var1, int var2, String var3, int var4, int var5) {
		this.field1561 = var1; // L: 72
		this.field1562 = var2; // L: 73
		this.field1563 = var4; // L: 74
	} // L: 75

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "741942848"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1562; // L: 78
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "12"
	)
	int method3105() {
		return this.field1563; // L: 82
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IZIZB)V",
		garbageValue = "-41"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (class31.World_worlds != null) { // L: 171
			class13.doWorldSorting(0, class31.World_worlds.length - 1, var0, var1, var2, var3); // L: 172
		}

	} // L: 174

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1285226307"
	)
	public static void method3118() {
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 578
	} // L: 579

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(ZLsq;B)V",
		garbageValue = "24"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5502
		int var2;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) { // L: 5503
			var2 = var1.method9135(); // L: 5504
			int var3 = var1.method9135(); // L: 5505
			var4 = var1.readUnsignedShort(); // L: 5506
			GameObject.xteaKeys = new int[var4][4]; // L: 5507

			for (var5 = 0; var5 < var4; ++var5) { // L: 5508
				for (var6 = 0; var6 < 4; ++var6) { // L: 5509
					GameObject.xteaKeys[var5][var6] = var1.readInt(); // L: 5510
				}
			}

			WorldMapAreaData.regions = new int[var4]; // L: 5513
			FontName.regionMapArchiveIds = new int[var4]; // L: 5514
			Archive.regionLandArchiveIds = new int[var4]; // L: 5515
			class4.regionLandArchives = new byte[var4][]; // L: 5516
			ObjectSound.regionMapArchives = new byte[var4][]; // L: 5517
			var4 = 0; // L: 5518

			for (var5 = (var3 - 6) / 8; var5 <= (var3 + 6) / 8; ++var5) { // L: 5519
				for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) { // L: 5520
					var7 = var6 + (var5 << 8); // L: 5521
					WorldMapAreaData.regions[var4] = var7; // L: 5522
					FontName.regionMapArchiveIds[var4] = GrandExchangeOfferTotalQuantityComparator.archive9.getGroupId("m" + var5 + "_" + var6); // L: 5523
					Archive.regionLandArchiveIds[var4] = GrandExchangeOfferTotalQuantityComparator.archive9.getGroupId("l" + var5 + "_" + var6); // L: 5524
					++var4; // L: 5525
				}
			}

			Decimator.method1135(var3, var2, true); // L: 5528
		} else {
			var2 = var1.method9135(); // L: 5531
			boolean var15 = var1.readUnsignedByte() == 1; // L: 5532
			var4 = var1.method9099(); // L: 5533
			var5 = var1.readUnsignedShort(); // L: 5534
			var1.importIndex(); // L: 5535

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5536
				for (var7 = 0; var7 < 13; ++var7) { // L: 5537
					for (var8 = 0; var8 < 13; ++var8) { // L: 5538
						var9 = var1.readBits(1); // L: 5539
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5540
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5541
						}
					}
				}
			}

			var1.exportIndex(); // L: 5545
			GameObject.xteaKeys = new int[var5][4]; // L: 5546

			for (var6 = 0; var6 < var5; ++var6) { // L: 5547
				for (var7 = 0; var7 < 4; ++var7) { // L: 5548
					GameObject.xteaKeys[var6][var7] = var1.readInt(); // L: 5549
				}
			}

			WorldMapAreaData.regions = new int[var5]; // L: 5552
			FontName.regionMapArchiveIds = new int[var5]; // L: 5553
			Archive.regionLandArchiveIds = new int[var5]; // L: 5554
			class4.regionLandArchives = new byte[var5][]; // L: 5555
			ObjectSound.regionMapArchives = new byte[var5][]; // L: 5556
			var5 = 0; // L: 5557

			for (var6 = 0; var6 < 4; ++var6) { // L: 5558
				for (var7 = 0; var7 < 13; ++var7) { // L: 5559
					for (var8 = 0; var8 < 13; ++var8) { // L: 5560
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5561
						if (var9 != -1) { // L: 5562
							int var10 = var9 >> 14 & 1023; // L: 5563
							int var11 = var9 >> 3 & 2047; // L: 5564
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5565

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5566
								if (WorldMapAreaData.regions[var13] == var12) {
									var12 = -1; // L: 5567
									break; // L: 5568
								}
							}

							if (var12 != -1) { // L: 5570
								WorldMapAreaData.regions[var5] = var12; // L: 5571
								var13 = var12 >> 8 & 255; // L: 5572
								int var14 = var12 & 255; // L: 5573
								FontName.regionMapArchiveIds[var5] = GrandExchangeOfferTotalQuantityComparator.archive9.getGroupId("m" + var13 + "_" + var14); // L: 5574
								Archive.regionLandArchiveIds[var5] = GrandExchangeOfferTotalQuantityComparator.archive9.getGroupId("l" + var13 + "_" + var14); // L: 5575
								++var5; // L: 5576
							}
						}
					}
				}
			}

			Decimator.method1135(var2, var4, !var15); // L: 5582
		}

	} // L: 5584

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "63"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (SoundSystem.loadInterface(var0)) { // L: 11331
			class143.runComponentCloseListeners(VerticalAlignment.Widget_interfaceComponents[var0], var1); // L: 11332
		}
	} // L: 11333
}
