import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lls;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Ljv;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1444259663
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lkx;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "Lmw;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lkd;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lgb;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1918231479
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("q")
	boolean field1327;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2141926027
	)
	int field1330;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1260062843
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lgb;"
	)
	ServerPacket field1331;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Lgb;"
	)
	ServerPacket field1333;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lgb;"
	)
	ServerPacket field1334;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1327 = true;
		this.field1330 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-126347974"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "523459495"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) {
			this.buffer.offset = 0;

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last();
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) {
					this.socket.write(this.buffer.array, 0, this.buffer.offset);
					this.pendingWrites = 0;
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index);
				this.bufferSize -= var1.index;
				var1.remove();
				var1.packetBuffer.releaseArray();
				var1.release();
			}
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(Lgk;I)V",
		garbageValue = "-315377283"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(Lls;I)V",
		garbageValue = "-1829169841"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1622261099"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1730600275"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)Lls;",
		garbageValue = "-1714919219"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(Lby;I)V",
		garbageValue = "1366873098"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		GrandExchangeOfferWorldComparator.runScript(var0, 500000);
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		signature = "(Lgs;I)V",
		garbageValue = "-718074338"
	)
	static final void method2429(class194 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		if (class194.field2354 == var0) {
			var2 = var1.method5720();
			var3 = var2 >> 2;
			var4 = var2 & 3;
			var5 = Client.field724[var3];
			var6 = var1.readUnsignedByte();
			var7 = (var6 >> 4 & 7) + GrandExchangeEvent.field82;
			var8 = (var6 & 7) + GrandExchangeOfferUnitPriceComparator.field103;
			var9 = var1.method5727();
			if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
				Canvas.updatePendingSpawn(class90.Client_plane, var7, var8, var5, var9, var3, var4, 0, -1);
			}

		} else if (class194.field2347 == var0) {
			var2 = var1.method5729();
			var3 = var1.readUnsignedByte();
			var4 = var1.readUnsignedShort();
			var5 = var1.method5776();
			var6 = (var5 >> 4 & 7) + GrandExchangeEvent.field82;
			var7 = (var5 & 7) + GrandExchangeOfferUnitPriceComparator.field103;
			if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
				var6 = var6 * 128 + 64;
				var7 = var7 * 128 + 64;
				GraphicsObject var41 = new GraphicsObject(var2, class90.Client_plane, var6, var7, WorldMapRegion.getTileHeight(var6, var7, class90.Client_plane) - var3, var4, Client.cycle);
				Client.graphicsObjects.addFirst(var41);
			}

		} else {
			TileItem var33;
			if (class194.field2348 == var0) {
				var2 = var1.method5717();
				var3 = (var2 >> 4 & 7) + GrandExchangeEvent.field82;
				var4 = (var2 & 7) + GrandExchangeOfferUnitPriceComparator.field103;
				var5 = var1.readUnsignedShort();
				if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
					NodeDeque var32 = Client.groundItems[class90.Client_plane][var3][var4];
					if (var32 != null) {
						for (var33 = (TileItem)var32.last(); var33 != null; var33 = (TileItem)var32.previous()) {
							if ((var5 & 32767) == var33.id) {
								var33.remove();
								break;
							}
						}

						if (var32.last() == null) {
							Client.groundItems[class90.Client_plane][var3][var4] = null;
						}

						HitSplatDefinition.updateItemPile(var3, var4);
					}
				}

			} else {
				int var10;
				if (class194.field2346 == var0) {
					var2 = var1.method5728();
					var3 = var1.method5720();
					var4 = (var3 >> 4 & 7) + GrandExchangeEvent.field82;
					var5 = (var3 & 7) + GrandExchangeOfferUnitPriceComparator.field103;
					var6 = var1.readUnsignedByte();
					var7 = var6 >> 4 & 15;
					var8 = var6 & 7;
					var9 = var1.method5717();
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
						var10 = var7 + 1;
						if (UserComparator9.localPlayer.pathX[0] >= var4 - var10 && UserComparator9.localPlayer.pathX[0] <= var4 + var10 && UserComparator9.localPlayer.pathY[0] >= var5 - var10 && UserComparator9.localPlayer.pathY[0] <= var5 + var10 && WorldMapSectionType.clientPreferences.areaSoundEffectsVolume != 0 && var8 > 0 && Client.soundEffectCount < 50) {
							Client.soundEffectIds[Client.soundEffectCount] = var2;
							Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8;
							Client.queuedSoundEffectDelays[Client.soundEffectCount] = var9;
							Client.soundEffects[Client.soundEffectCount] = null;
							Client.soundLocations[Client.soundEffectCount] = var7 + (var5 << 8) + (var4 << 16);
							++Client.soundEffectCount;
						}
					}
				}

				if (class194.field2356 == var0) {
					var2 = var1.method5729();
					var3 = var1.method5728();
					var4 = var1.readUnsignedByte();
					var5 = (var4 >> 4 & 7) + GrandExchangeEvent.field82;
					var6 = (var4 & 7) + GrandExchangeOfferUnitPriceComparator.field103;
					if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
						var33 = new TileItem();
						var33.id = var2;
						var33.quantity = var3;
						if (Client.groundItems[class90.Client_plane][var5][var6] == null) {
							Client.groundItems[class90.Client_plane][var5][var6] = new NodeDeque();
						}

						Client.groundItems[class90.Client_plane][var5][var6].addFirst(var33);
						HitSplatDefinition.updateItemPile(var5, var6);
					}

				} else {
					int var11;
					int var12;
					int var14;
					if (class194.field2352 == var0) {
						var2 = var1.method5776();
						var3 = var1.method5717() * 4;
						var4 = var1.method5731();
						var5 = var1.method5729();
						byte var38 = var1.method5747();
						var7 = var1.readUnsignedShort();
						var8 = var1.method5776() * 4;
						byte var39 = var1.method5722();
						var10 = var1.method5776();
						var11 = var1.method5729();
						var12 = var1.method5717();
						int var40 = (var12 >> 4 & 7) + GrandExchangeEvent.field82;
						var14 = (var12 & 7) + GrandExchangeOfferUnitPriceComparator.field103;
						var6 = var38 + var40;
						var9 = var39 + var14;
						if (var40 >= 0 && var14 >= 0 && var40 < 104 && var14 < 104 && var6 >= 0 && var9 >= 0 && var6 < 104 && var9 < 104 && var5 != 65535) {
							var40 = var40 * 128 + 64;
							var14 = var14 * 128 + 64;
							var6 = var6 * 128 + 64;
							var9 = var9 * 128 + 64;
							Projectile var15 = new Projectile(var5, class90.Client_plane, var40, var14, WorldMapRegion.getTileHeight(var40, var14, class90.Client_plane) - var3, var7 + Client.cycle, var11 + Client.cycle, var10, var2, var4, var8);
							var15.setDestination(var6, var9, WorldMapRegion.getTileHeight(var6, var9, class90.Client_plane) - var8, var7 + Client.cycle);
							Client.projectiles.addFirst(var15);
						}

					} else if (class194.field2351 == var0) {
						var2 = var1.readUnsignedByte();
						var3 = (var2 >> 4 & 7) + GrandExchangeEvent.field82;
						var4 = (var2 & 7) + GrandExchangeOfferUnitPriceComparator.field103;
						var5 = var1.method5727();
						var6 = var1.method5727();
						var7 = var1.method5727();
						if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
							NodeDeque var31 = Client.groundItems[class90.Client_plane][var3][var4];
							if (var31 != null) {
								for (TileItem var34 = (TileItem)var31.last(); var34 != null; var34 = (TileItem)var31.previous()) {
									if ((var7 & 32767) == var34.id && var5 == var34.quantity) {
										var34.quantity = var6;
										break;
									}
								}

								HitSplatDefinition.updateItemPile(var3, var4);
							}
						}

					} else if (class194.field2353 == var0) {
						var2 = var1.method5717();
						var3 = var2 >> 2;
						var4 = var2 & 3;
						var5 = Client.field724[var3];
						var6 = var1.method5729();
						var7 = var1.readUnsignedByte();
						var8 = (var7 >> 4 & 7) + GrandExchangeEvent.field82;
						var9 = (var7 & 7) + GrandExchangeOfferUnitPriceComparator.field103;
						if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
							if (var5 == 0) {
								BoundaryObject var35 = MilliClock.scene.method3351(class90.Client_plane, var8, var9);
								if (var35 != null) {
									var11 = class25.Entity_unpackID(var35.tag);
									if (var3 == 2) {
										var35.entity1 = new DynamicObject(var11, 2, var4 + 4, class90.Client_plane, var8, var9, var6, false, var35.entity1);
										var35.entity2 = new DynamicObject(var11, 2, var4 + 1 & 3, class90.Client_plane, var8, var9, var6, false, var35.entity2);
									} else {
										var35.entity1 = new DynamicObject(var11, var3, var4, class90.Client_plane, var8, var9, var6, false, var35.entity1);
									}
								}
							}

							if (var5 == 1) {
								WallDecoration var42 = MilliClock.scene.method3264(class90.Client_plane, var8, var9);
								if (var42 != null) {
									var11 = class25.Entity_unpackID(var42.tag);
									if (var3 != 4 && var3 != 5) {
										if (var3 == 6) {
											var42.entity1 = new DynamicObject(var11, 4, var4 + 4, class90.Client_plane, var8, var9, var6, false, var42.entity1);
										} else if (var3 == 7) {
											var42.entity1 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, class90.Client_plane, var8, var9, var6, false, var42.entity1);
										} else if (var3 == 8) {
											var42.entity1 = new DynamicObject(var11, 4, var4 + 4, class90.Client_plane, var8, var9, var6, false, var42.entity1);
											var42.entity2 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, class90.Client_plane, var8, var9, var6, false, var42.entity2);
										}
									} else {
										var42.entity1 = new DynamicObject(var11, 4, var4, class90.Client_plane, var8, var9, var6, false, var42.entity1);
									}
								}
							}

							if (var5 == 2) {
								GameObject var43 = MilliClock.scene.method3385(class90.Client_plane, var8, var9);
								if (var3 == 11) {
									var3 = 10;
								}

								if (var43 != null) {
									var43.entity = new DynamicObject(class25.Entity_unpackID(var43.tag), var3, var4, class90.Client_plane, var8, var9, var6, false, var43.entity);
								}
							}

							if (var5 == 3) {
								FloorDecoration var44 = MilliClock.scene.getFloorDecoration(class90.Client_plane, var8, var9);
								if (var44 != null) {
									var44.entity = new DynamicObject(class25.Entity_unpackID(var44.tag), 22, var4, class90.Client_plane, var8, var9, var6, false, var44.entity);
								}
							}
						}

					} else if (class194.field2355 == var0) {
						var2 = var1.method5717();
						var3 = var2 >> 2;
						var4 = var2 & 3;
						var5 = Client.field724[var3];
						var6 = var1.method5720();
						var7 = (var6 >> 4 & 7) + GrandExchangeEvent.field82;
						var8 = (var6 & 7) + GrandExchangeOfferUnitPriceComparator.field103;
						if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
							Canvas.updatePendingSpawn(class90.Client_plane, var7, var8, var5, -1, var3, var4, 0, -1);
						}

					} else {
						if (class194.field2350 == var0) {
							var2 = var1.method5729();
							var3 = var1.method5720();
							var4 = var3 >> 2;
							var5 = var3 & 3;
							var6 = Client.field724[var4];
							byte var37 = var1.method5722();
							var8 = var1.method5727();
							var9 = var1.method5720();
							var10 = (var9 >> 4 & 7) + GrandExchangeEvent.field82;
							var11 = (var9 & 7) + GrandExchangeOfferUnitPriceComparator.field103;
							var12 = var1.readUnsignedShort();
							byte var13 = var1.method5722();
							var14 = var1.method5727();
							byte var36 = var1.method5721();
							byte var16 = var1.readByte();
							Player var17;
							if (var14 == Client.localPlayerIndex) {
								var17 = UserComparator9.localPlayer;
							} else {
								var17 = Client.players[var14];
							}

							if (var17 != null) {
								ObjectComposition var18 = WorldMapAreaData.getObjectDefinition(var12);
								int var19;
								int var20;
								if (var5 != 1 && var5 != 3) {
									var19 = var18.sizeX;
									var20 = var18.sizeY;
								} else {
									var19 = var18.sizeY;
									var20 = var18.sizeX;
								}

								int var21 = var10 + (var19 >> 1);
								int var22 = var10 + (var19 + 1 >> 1);
								int var23 = var11 + (var20 >> 1);
								int var24 = var11 + (var20 + 1 >> 1);
								int[][] var25 = Tiles.Tiles_heights[class90.Client_plane];
								int var26 = var25[var22][var24] + var25[var21][var24] + var25[var21][var23] + var25[var22][var23] >> 2;
								int var27 = (var10 << 7) + (var19 << 6);
								int var28 = (var11 << 7) + (var20 << 6);
								Model var29 = var18.getModel(var4, var5, var25, var27, var26, var28);
								if (var29 != null) {
									Canvas.updatePendingSpawn(class90.Client_plane, var10, var11, var6, -1, 0, 0, var8 + 1, var2 + 1);
									var17.animationCycleStart = var8 + Client.cycle;
									var17.animationCycleEnd = var2 + Client.cycle;
									var17.model0 = var29;
									var17.field637 = var10 * 128 + var19 * 64;
									var17.field639 = var11 * 128 + var20 * 64;
									var17.tileHeight2 = var26;
									byte var30;
									if (var36 > var13) {
										var30 = var36;
										var36 = var13;
										var13 = var30;
									}

									if (var16 > var37) {
										var30 = var16;
										var16 = var37;
										var37 = var30;
									}

									var17.field641 = var10 + var36;
									var17.field640 = var10 + var13;
									var17.field642 = var11 + var16;
									var17.field644 = var11 + var37;
								}
							}
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "216002934"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (WorldMapID.clanChat != null) {
			PacketBufferNode var1 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2268, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(WorldMapLabelSize.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
