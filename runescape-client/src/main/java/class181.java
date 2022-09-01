import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class181 extends DualNode {
	@ObfuscatedName("o")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;

	static {
		new EvictingDualNodeHashTable(64); // L: 9
	} // L: 10

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1284170470"
	)
	public static final synchronized long method3483() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class269.field3178) { // L: 15
			class269.field3180 += class269.field3178 - var0; // L: 16
		}

		class269.field3178 = var0; // L: 18
		return class269.field3180 + var0; // L: 19
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(ZLqz;I)V",
		garbageValue = "-736067315"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5457
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) { // L: 5458
			int var2 = var1.readUnsignedShort(); // L: 5459
			var3 = var1.method7640(); // L: 5460
			var4 = var1.readUnsignedShort(); // L: 5461
			class220.xteaKeys = new int[var4][4]; // L: 5462

			for (var5 = 0; var5 < var4; ++var5) { // L: 5463
				for (var6 = 0; var6 < 4; ++var6) { // L: 5464
					class220.xteaKeys[var5][var6] = var1.readInt(); // L: 5465
				}
			}

			class394.regions = new int[var4]; // L: 5468
			Archive.regionMapArchiveIds = new int[var4]; // L: 5469
			NetFileRequest.regionLandArchiveIds = new int[var4]; // L: 5470
			TaskHandler.regionLandArchives = new byte[var4][]; // L: 5471
			Varcs.regionMapArchives = new byte[var4][]; // L: 5472
			var4 = 0; // L: 5473

			for (var5 = (var3 - 6) / 8; var5 <= (var3 + 6) / 8; ++var5) { // L: 5474
				for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) { // L: 5475
					var7 = var6 + (var5 << 8); // L: 5476
					class394.regions[var4] = var7; // L: 5477
					Archive.regionMapArchiveIds[var4] = class120.archive9.getGroupId("m" + var5 + "_" + var6); // L: 5478
					NetFileRequest.regionLandArchiveIds[var4] = class120.archive9.getGroupId("l" + var5 + "_" + var6); // L: 5479
					++var4; // L: 5480
				}
			}

			DevicePcmPlayerProvider.method348(var3, var2, true); // L: 5483
		} else {
			boolean var15 = var1.method7786() == 1; // L: 5486
			var3 = var1.readUnsignedShort(); // L: 5487
			var4 = var1.method7677(); // L: 5488
			var5 = var1.readUnsignedShort(); // L: 5489
			var1.importIndex(); // L: 5490

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5491
				for (var7 = 0; var7 < 13; ++var7) { // L: 5492
					for (var8 = 0; var8 < 13; ++var8) { // L: 5493
						var9 = var1.readBits(1); // L: 5494
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5495
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5496
						}
					}
				}
			}

			var1.exportIndex(); // L: 5500
			class220.xteaKeys = new int[var5][4]; // L: 5501

			for (var6 = 0; var6 < var5; ++var6) { // L: 5502
				for (var7 = 0; var7 < 4; ++var7) { // L: 5503
					class220.xteaKeys[var6][var7] = var1.readInt(); // L: 5504
				}
			}

			class394.regions = new int[var5]; // L: 5507
			Archive.regionMapArchiveIds = new int[var5]; // L: 5508
			NetFileRequest.regionLandArchiveIds = new int[var5]; // L: 5509
			TaskHandler.regionLandArchives = new byte[var5][]; // L: 5510
			Varcs.regionMapArchives = new byte[var5][]; // L: 5511
			var5 = 0; // L: 5512

			for (var6 = 0; var6 < 4; ++var6) { // L: 5513
				for (var7 = 0; var7 < 13; ++var7) { // L: 5514
					for (var8 = 0; var8 < 13; ++var8) { // L: 5515
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5516
						if (var9 != -1) { // L: 5517
							int var10 = var9 >> 14 & 1023; // L: 5518
							int var11 = var9 >> 3 & 2047; // L: 5519
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5520

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5521
								if (class394.regions[var13] == var12) {
									var12 = -1; // L: 5522
									break;
								}
							}

							if (var12 != -1) { // L: 5525
								class394.regions[var5] = var12; // L: 5526
								var13 = var12 >> 8 & 255; // L: 5527
								int var14 = var12 & 255; // L: 5528
								Archive.regionMapArchiveIds[var5] = class120.archive9.getGroupId("m" + var13 + "_" + var14); // L: 5529
								NetFileRequest.regionLandArchiveIds[var5] = class120.archive9.getGroupId("l" + var13 + "_" + var14); // L: 5530
								++var5; // L: 5531
							}
						}
					}
				}
			}

			DevicePcmPlayerProvider.method348(var4, var3, !var15); // L: 5537
		}

	} // L: 5539

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "([Lkn;Lkn;ZB)V",
		garbageValue = "6"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width; // L: 10355
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height; // L: 10356
		Canvas.resizeInterface(var0, var1.id, var3, var4, var2); // L: 10357
		if (var1.children != null) {
			Canvas.resizeInterface(var1.children, var1.id, var3, var4, var2); // L: 10358
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 10359
		if (var5 != null) { // L: 10360
			int var6 = var5.group; // L: 10361
			if (ParamComposition.loadInterface(var6)) { // L: 10363
				Canvas.resizeInterface(class358.Widget_interfaceComponents[var6], -1, var3, var4, var2); // L: 10364
			}
		}

		if (var1.contentType == 1337) { // L: 10367
		}

	} // L: 10368

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1351544774"
	)
	static final void method3480(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 11640
		FriendsChatMember.clientPreferences.updateSoundEffectVolume(var0); // L: 11641
	} // L: 11642
}
