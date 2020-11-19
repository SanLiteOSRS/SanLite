import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1740090343
	)
	static int field377;
	@ObfuscatedName("gg")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -507222601
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		signature = "(ILhw;Lhw;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(IIIS)I",
		garbageValue = "3638"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		signature = "(Lgg;I)V",
		garbageValue = "-242639541"
	)
	static final void method865(class194 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var3;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		if (class194.field2355 == var0) {
			byte var2 = var1.method5837();
			var3 = var1.method5659();
			byte var4 = var1.method5837();
			var5 = var1.method5650();
			var6 = (var5 >> 4 & 7) + GameEngine.field466;
			var7 = (var5 & 7) + GrandExchangeEvents.field64;
			var8 = var1.method5659();
			var9 = var1.readUnsignedShort();
			var10 = var1.readUnsignedShort();
			var11 = var1.method5619();
			var12 = var11 >> 2;
			var13 = var11 & 3;
			var14 = Client.field954[var12];
			byte var15 = var1.method5837();
			byte var16 = var1.method5837();
			Player var17;
			if (var9 == Client.localPlayerIndex) {
				var17 = PlayerType.localPlayer;
			} else {
				var17 = Client.players[var9];
			}

			if (var17 != null) {
				ObjectComposition var18 = ScriptEvent.getObjectDefinition(var10);
				int var19;
				int var20;
				if (var13 != 1 && var13 != 3) {
					var19 = var18.sizeX;
					var20 = var18.sizeY;
				} else {
					var19 = var18.sizeY;
					var20 = var18.sizeX;
				}

				int var21 = var6 + (var19 >> 1);
				int var22 = var6 + (var19 + 1 >> 1);
				int var23 = var7 + (var20 >> 1);
				int var24 = var7 + (var20 + 1 >> 1);
				int[][] var25 = Tiles.Tiles_heights[GrandExchangeOfferUnitPriceComparator.Client_plane];
				int var26 = var25[var21][var23] + var25[var22][var23] + var25[var21][var24] + var25[var22][var24] >> 2;
				int var27 = (var6 << 7) + (var19 << 6);
				int var28 = (var7 << 7) + (var20 << 6);
				Model var29 = var18.getModel(var12, var13, var25, var27, var26, var28);
				if (var29 != null) {
					GrandExchangeOffer.updatePendingSpawn(GrandExchangeOfferUnitPriceComparator.Client_plane, var6, var7, var14, -1, 0, 0, var8 + 1, var3 + 1);
					var17.animationCycleStart = var8 + Client.cycle;
					var17.animationCycleEnd = var3 + Client.cycle;
					var17.model0 = var29;
					var17.field654 = var6 * 128 + var19 * 64;
					var17.field656 = var7 * 128 + var20 * 64;
					var17.tileHeight2 = var26;
					byte var30;
					if (var2 > var15) {
						var30 = var2;
						var2 = var15;
						var15 = var30;
					}

					if (var4 > var16) {
						var30 = var4;
						var4 = var16;
						var16 = var30;
					}

					var17.field646 = var6 + var2;
					var17.field660 = var6 + var15;
					var17.field669 = var7 + var4;
					var17.field661 = var16 + var7;
				}
			}
		}

		TileItem var31;
		int var37;
		int var38;
		if (class194.field2353 == var0) {
			var37 = var1.readUnsignedByte();
			var3 = (var37 >> 4 & 7) + GameEngine.field466;
			var38 = (var37 & 7) + GrandExchangeEvents.field64;
			var5 = var1.method5659();
			var6 = var1.method5659();
			if (var3 >= 0 && var38 >= 0 && var3 < 104 && var38 < 104) {
				var31 = new TileItem();
				var31.id = var5;
				var31.quantity = var6;
				if (Client.groundItems[GrandExchangeOfferUnitPriceComparator.Client_plane][var3][var38] == null) {
					Client.groundItems[GrandExchangeOfferUnitPriceComparator.Client_plane][var3][var38] = new NodeDeque();
				}

				Client.groundItems[GrandExchangeOfferUnitPriceComparator.Client_plane][var3][var38].addFirst(var31);
				class41.updateItemPile(var3, var38);
			}

		} else if (class194.field2348 == var0) {
			var37 = var1.method5619();
			var3 = (var37 >> 4 & 7) + GameEngine.field466;
			var38 = (var37 & 7) + GrandExchangeEvents.field64;
			var5 = var1.method5619();
			var6 = var5 >> 2;
			var7 = var5 & 3;
			var8 = Client.field954[var6];
			var9 = var1.method5659();
			if (var3 >= 0 && var38 >= 0 && var3 < 104 && var38 < 104) {
				GrandExchangeOffer.updatePendingSpawn(GrandExchangeOfferUnitPriceComparator.Client_plane, var3, var38, var8, var9, var6, var7, 0, -1);
			}

		} else if (class194.field2349 == var0) {
			var37 = var1.method5797();
			var3 = var1.method5675();
			var38 = var1.readUnsignedByte();
			var5 = (var38 >> 4 & 7) + GameEngine.field466;
			var6 = (var38 & 7) + GrandExchangeEvents.field64;
			var7 = var1.method5650();
			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
				var5 = var5 * 128 + 64;
				var6 = var6 * 128 + 64;
				GraphicsObject var41 = new GraphicsObject(var3, GrandExchangeOfferUnitPriceComparator.Client_plane, var5, var6, GrandExchangeOfferWorldComparator.getTileHeight(var5, var6, GrandExchangeOfferUnitPriceComparator.Client_plane) - var7, var37, Client.cycle);
				Client.graphicsObjects.addFirst(var41);
			}

		} else if (class194.field2352 == var0) {
			var37 = var1.method5668();
			var3 = var1.readUnsignedShort();
			var38 = var1.method5668();
			var5 = (var38 >> 4 & 7) + GameEngine.field466;
			var6 = (var38 & 7) + GrandExchangeEvents.field64;
			byte var39 = var1.method5669();
			byte var40 = var1.method5688();
			var9 = var1.method5668() * 4;
			var10 = var1.method5650();
			var11 = var1.readUnsignedShort();
			var12 = var1.readUnsignedShort();
			var13 = var1.method5679();
			var14 = var1.method5619() * 4;
			var8 = var40 + var5;
			var7 = var39 + var6;
			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var8 >= 0 && var7 >= 0 && var8 < 104 && var7 < 104 && var12 != 65535) {
				var5 = var5 * 128 + 64;
				var6 = var6 * 128 + 64;
				var8 = var8 * 128 + 64;
				var7 = var7 * 128 + 64;
				Projectile var33 = new Projectile(var12, GrandExchangeOfferUnitPriceComparator.Client_plane, var5, var6, GrandExchangeOfferWorldComparator.getTileHeight(var5, var6, GrandExchangeOfferUnitPriceComparator.Client_plane) - var14, var11 + Client.cycle, var3 + Client.cycle, var37, var10, var13, var9);
				var33.setDestination(var8, var7, GrandExchangeOfferWorldComparator.getTileHeight(var8, var7, GrandExchangeOfferUnitPriceComparator.Client_plane) - var9, var11 + Client.cycle);
				Client.projectiles.addFirst(var33);
			}

		} else if (class194.field2357 == var0) {
			var37 = var1.method5659();
			var3 = var1.method5659();
			var38 = var1.method5668();
			var5 = (var38 >> 4 & 7) + GameEngine.field466;
			var6 = (var38 & 7) + GrandExchangeEvents.field64;
			var7 = var1.method5797();
			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
				NodeDeque var32 = Client.groundItems[GrandExchangeOfferUnitPriceComparator.Client_plane][var5][var6];
				if (var32 != null) {
					for (TileItem var34 = (TileItem)var32.last(); var34 != null; var34 = (TileItem)var32.previous()) {
						if ((var37 & 32767) == var34.id && var7 == var34.quantity) {
							var34.quantity = var3;
							break;
						}
					}

					class41.updateItemPile(var5, var6);
				}
			}

		} else {
			if (class194.field2351 == var0) {
				var37 = var1.method5619();
				var3 = var1.readUnsignedByte();
				var38 = var3 >> 4 & 15;
				var5 = var3 & 7;
				var6 = var1.method5668();
				var7 = (var6 >> 4 & 7) + GameEngine.field466;
				var8 = (var6 & 7) + GrandExchangeEvents.field64;
				var9 = var1.method5659();
				if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
					var10 = var38 + 1;
					if (PlayerType.localPlayer.pathX[0] >= var7 - var10 && PlayerType.localPlayer.pathX[0] <= var7 + var10 && PlayerType.localPlayer.pathY[0] >= var8 - var10 && PlayerType.localPlayer.pathY[0] <= var8 + var10 && Client.areaSoundEffectVolume != 0 && var5 > 0 && Client.soundEffectCount < 50) {
						Client.soundEffectIds[Client.soundEffectCount] = var9;
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var5;
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = var37;
						Client.soundEffects[Client.soundEffectCount] = null;
						Client.soundLocations[Client.soundEffectCount] = var38 + (var8 << 8) + (var7 << 16);
						++Client.soundEffectCount;
					}
				}
			}

			if (class194.field2356 == var0) {
				var37 = var1.method5650();
				var3 = (var37 >> 4 & 7) + GameEngine.field466;
				var38 = (var37 & 7) + GrandExchangeEvents.field64;
				var5 = var1.method5659();
				if (var3 >= 0 && var38 >= 0 && var3 < 104 && var38 < 104) {
					NodeDeque var35 = Client.groundItems[GrandExchangeOfferUnitPriceComparator.Client_plane][var3][var38];
					if (var35 != null) {
						for (var31 = (TileItem)var35.last(); var31 != null; var31 = (TileItem)var35.previous()) {
							if ((var5 & 32767) == var31.id) {
								var31.remove();
								break;
							}
						}

						if (var35.last() == null) {
							Client.groundItems[GrandExchangeOfferUnitPriceComparator.Client_plane][var3][var38] = null;
						}

						class41.updateItemPile(var3, var38);
					}
				}

			} else if (class194.field2354 != var0) {
				if (class194.field2359 == var0) {
					var37 = var1.method5650();
					var3 = (var37 >> 4 & 7) + GameEngine.field466;
					var38 = (var37 & 7) + GrandExchangeEvents.field64;
					var5 = var1.method5650();
					var6 = var5 >> 2;
					var7 = var5 & 3;
					var8 = Client.field954[var6];
					if (var3 >= 0 && var38 >= 0 && var3 < 104 && var38 < 104) {
						GrandExchangeOffer.updatePendingSpawn(GrandExchangeOfferUnitPriceComparator.Client_plane, var3, var38, var8, -1, var6, var7, 0, -1);
					}

				}
			} else {
				var37 = var1.method5668();
				var3 = var37 >> 2;
				var38 = var37 & 3;
				var5 = Client.field954[var3];
				var6 = var1.method5675();
				var7 = var1.method5619();
				var8 = (var7 >> 4 & 7) + GameEngine.field466;
				var9 = (var7 & 7) + GrandExchangeEvents.field64;
				if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
					if (var5 == 0) {
						BoundaryObject var36 = ModeWhere.scene.method3277(GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9);
						if (var36 != null) {
							var11 = ObjectSound.Entity_unpackID(var36.tag);
							if (var3 == 2) {
								var36.entity1 = new DynamicObject(var11, 2, var38 + 4, GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9, var6, false, var36.entity1);
								var36.entity2 = new DynamicObject(var11, 2, var38 + 1 & 3, GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9, var6, false, var36.entity2);
							} else {
								var36.entity1 = new DynamicObject(var11, var3, var38, GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9, var6, false, var36.entity1);
							}
						}
					}

					if (var5 == 1) {
						WallDecoration var42 = ModeWhere.scene.method3276(GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9);
						if (var42 != null) {
							var11 = ObjectSound.Entity_unpackID(var42.tag);
							if (var3 != 4 && var3 != 5) {
								if (var3 == 6) {
									var42.entity1 = new DynamicObject(var11, 4, var38 + 4, GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9, var6, false, var42.entity1);
								} else if (var3 == 7) {
									var42.entity1 = new DynamicObject(var11, 4, (var38 + 2 & 3) + 4, GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9, var6, false, var42.entity1);
								} else if (var3 == 8) {
									var42.entity1 = new DynamicObject(var11, 4, var38 + 4, GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9, var6, false, var42.entity1);
									var42.entity2 = new DynamicObject(var11, 4, (var38 + 2 & 3) + 4, GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9, var6, false, var42.entity2);
								}
							} else {
								var42.entity1 = new DynamicObject(var11, 4, var38, GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9, var6, false, var42.entity1);
							}
						}
					}

					if (var5 == 2) {
						GameObject var43 = ModeWhere.scene.method3241(GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9);
						if (var3 == 11) {
							var3 = 10;
						}

						if (var43 != null) {
							var43.entity = new DynamicObject(ObjectSound.Entity_unpackID(var43.tag), var3, var38, GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9, var6, false, var43.entity);
						}
					}

					if (var5 == 3) {
						FloorDecoration var44 = ModeWhere.scene.getFloorDecoration(GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9);
						if (var44 != null) {
							var44.entity = new DynamicObject(ObjectSound.Entity_unpackID(var44.tag), 22, var38, GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9, var6, false, var44.entity);
						}
					}
				}

			}
		}
	}
}
