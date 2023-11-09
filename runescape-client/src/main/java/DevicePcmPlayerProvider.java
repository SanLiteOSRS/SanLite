import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class47 {
	@ObfuscatedName("fy")
	static String field156;

	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Laf;",
		garbageValue = "-43"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 11
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljb;Lqb;B)Ljg;",
		garbageValue = "-79"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 24
			var2 = new PacketBufferNode(); // L: 25
		} else {
			var2 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 28
		}

		var2.clientPacket = var0; // L: 31
		var2.clientPacketLength = var0.length; // L: 32
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260); // L: 33
		} else if (var2.clientPacketLength == -2) { // L: 34
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) { // L: 35
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) { // L: 36
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260); // L: 37
		}

		var2.packetBuffer.setIsaacCipher(var1); // L: 38
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id); // L: 39
		var2.index = 0; // L: 40
		return var2; // L: 41
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-63"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 596
		if (WorldMapID.garbageCollector == null || !WorldMapID.garbageCollector.isValid()) { // L: 597
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 599

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 600
					if (var2.isValid()) { // L: 602
						WorldMapID.garbageCollector = var2; // L: 603
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 604
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 605
					}
				}
			} catch (Throwable var11) { // L: 610
			}
		}

		if (WorldMapID.garbageCollector != null) { // L: 612
			long var9 = class181.method3483(); // L: 613
			long var3 = WorldMapID.garbageCollector.getCollectionTime(); // L: 614
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) { // L: 615
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 616
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 617
				if (var7 != 0L) { // L: 618
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 620
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 621
		}

		return var0; // L: 623
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "111"
	)
	static final void method348(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class352.field4196 || class20.field105 != var1) { // L: 5542
			class352.field4196 = var0; // L: 5545
			class20.field105 = var1; // L: 5546
			class4.updateGameState(25); // L: 5547
			class20.drawLoadingMessage("Loading - please wait.", true); // L: 5548
			int var3 = Decimator.baseX * 64; // L: 5549
			int var4 = class7.baseY * 64; // L: 5550
			Decimator.baseX = (var0 - 6) * 8; // L: 5551
			class7.baseY = (var1 - 6) * 8; // L: 5552
			int var5 = Decimator.baseX * 64 - var3; // L: 5553
			int var6 = class7.baseY * 64 - var4; // L: 5554
			var3 = Decimator.baseX * 64; // L: 5555
			var4 = class7.baseY * 64; // L: 5556

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) { // L: 5557
				NPC var19 = Client.npcs[var7]; // L: 5558
				if (var19 != null) { // L: 5559
					for (var9 = 0; var9 < 10; ++var9) { // L: 5560
						var10000 = var19.pathX; // L: 5561
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5562
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5564
					var19.y -= var6 * 128; // L: 5565
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5568
				Player var22 = Client.players[var7]; // L: 5569
				if (var22 != null) { // L: 5570
					for (var9 = 0; var9 < 10; ++var9) { // L: 5571
						var10000 = var22.pathX; // L: 5572
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5573
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5575
					var22.y -= var6 * 128; // L: 5576
				}
			}

			byte var20 = 0; // L: 5579
			byte var8 = 104; // L: 5580
			byte var21 = 1; // L: 5581
			if (var5 < 0) { // L: 5582
				var20 = 103; // L: 5583
				var8 = -1; // L: 5584
				var21 = -1; // L: 5585
			}

			byte var10 = 0; // L: 5587
			byte var11 = 104; // L: 5588
			byte var12 = 1; // L: 5589
			if (var6 < 0) { // L: 5590
				var10 = 103; // L: 5591
				var11 = -1; // L: 5592
				var12 = -1; // L: 5593
			}

			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) { // L: 5595
				for (var14 = var10; var11 != var14; var14 += var12) { // L: 5596
					int var15 = var13 + var5; // L: 5597
					int var16 = var6 + var14; // L: 5598

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5599
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) { // L: 5600
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5601
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5605 5606 5610
				var18.x -= var5; // L: 5607
				var18.y -= var6; // L: 5608
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5609
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5612
				Client.destinationX -= var5; // L: 5613
				Client.destinationY -= var6; // L: 5614
			}

			Client.soundEffectCount = 0; // L: 5616
			Client.isCameraLocked = false; // L: 5617
			class16.cameraX -= var5 << 7; // L: 5618
			class269.cameraZ -= var6 << 7; // L: 5619
			FloorOverlayDefinition.oculusOrbFocalPointX -= var5 << 7; // L: 5620
			AbstractUserComparator.oculusOrbFocalPointY -= var6 << 7; // L: 5621
			Client.field720 = -1; // L: 5622
			Client.graphicsObjects.clear(); // L: 5623
			Client.projectiles.clear(); // L: 5624

			for (var14 = 0; var14 < 4; ++var14) { // L: 5625
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5543 5626

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-762895060"
	)
	static final void method352(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) { // L: 8203
			if (Client.showMouseOverText) { // L: 8204
				int var2 = Client.menuOptionsCount - 1; // L: 8207
				String var4;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) { // L: 8211
					var4 = "Use" + " " + Client.selectedItemName + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) { // L: 8212
					var4 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
				} else {
					var4 = ScriptFrame.method1034(var2); // L: 8213
				}

				if (Client.menuOptionsCount > 2) { // L: 8214
					var4 = var4 + Clock.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}

				WorldMapSection2.fontBold12.drawRandomAlphaAndSpacing(var4, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000); // L: 8215
			}
		}
	} // L: 8216
}
