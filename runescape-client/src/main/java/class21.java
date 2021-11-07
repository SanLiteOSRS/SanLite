import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public class class21 {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("hw")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1952099167
	)
	final int field102;
	@ObfuscatedName("w")
	final String field104;

	class21(String var1) {
		this.field102 = 400;
		this.field104 = "";
	}

	class21(HttpURLConnection var1) throws IOException {
		this.field102 = var1.getResponseCode();
		var1.getResponseMessage();
		var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.field102 >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.field104 = var2.toString();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-701476326"
	)
	public int method310() {
		return this.field102;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "932621711"
	)
	public String method303() {
		return this.field104;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lko;III)[Low;",
		garbageValue = "-1741368742"
	)
	public static SpritePixels[] method312(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			Script.SpriteBuffer_decode(var4);
			var3 = true;
		}

		return !var3 ? null : class283.method5221();
	}

	@ObfuscatedName("e")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(Lii;I)V",
		garbageValue = "1398139213"
	)
	static final void method309(class240 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		if (class240.field2781 == var0) {
			var2 = var1.method6995();
			var3 = (var2 >> 4 & 7) + ItemComposition.field1931;
			var4 = (var2 & 7) + Actor.field1146;
			var5 = var1.readUnsignedByte();
			var6 = var5 >> 2;
			var7 = var5 & 3;
			var8 = Client.field530[var6];
			var9 = var1.method7004();
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
				WorldMapLabelSize.updatePendingSpawn(GrandExchangeOfferTotalQuantityComparator.Client_plane, var3, var4, var8, var9, var6, var7, 0, -1);
			}

		} else if (class240.field2777 == var0) {
			var2 = var1.method6997();
			var3 = var2 >> 2;
			var4 = var2 & 3;
			var5 = Client.field530[var3];
			var6 = var1.readUnsignedByte();
			var7 = (var6 >> 4 & 7) + ItemComposition.field1931;
			var8 = (var6 & 7) + Actor.field1146;
			if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
				WorldMapLabelSize.updatePendingSpawn(GrandExchangeOfferTotalQuantityComparator.Client_plane, var7, var8, var5, -1, var3, var4, 0, -1);
			}

		} else if (class240.field2773 == var0) {
			var2 = var1.readUnsignedByte();
			var3 = (var2 >> 4 & 7) + ItemComposition.field1931;
			var4 = (var2 & 7) + Actor.field1146;
			var5 = var1.method7120();
			var6 = var1.method7120();
			var7 = var1.method7006();
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
				NodeDeque var46 = Client.groundItems[GrandExchangeOfferTotalQuantityComparator.Client_plane][var3][var4];
				if (var46 != null) {
					for (TileItem var36 = (TileItem)var46.last(); var36 != null; var36 = (TileItem)var46.previous()) {
						if ((var6 & 32767) == var36.id && var7 == var36.quantity) {
							var36.quantity = var5;
							break;
						}
					}

					WallDecoration.updateItemPile(var3, var4);
				}
			}

		} else {
			int var10;
			int var11;
			int var12;
			int var14;
			if (class240.field2782 == var0) {
				byte var37 = var1.readByte();
				var3 = var1.method7006();
				var4 = var1.method7004();
				var5 = var1.method6996() * 4;
				var6 = var1.method7008();
				byte var39 = var1.method6973();
				var8 = var1.method6995();
				var9 = (var8 >> 4 & 7) + ItemComposition.field1931;
				var10 = (var8 & 7) + Actor.field1146;
				var11 = var1.readUnsignedByte() * 4;
				var12 = var1.method6997();
				int var42 = var1.method7006();
				var14 = var1.method6997();
				var7 = var39 + var9;
				var2 = var37 + var10;
				if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var7 >= 0 && var2 >= 0 && var7 < 104 && var2 < 104 && var42 != 65535) {
					var9 = var9 * 128 + 64;
					var10 = var10 * 128 + 64;
					var7 = var7 * 128 + 64;
					var2 = var2 * 128 + 64;
					Projectile var35 = new Projectile(var42, GrandExchangeOfferTotalQuantityComparator.Client_plane, var9, var10, class392.getTileHeight(var9, var10, GrandExchangeOfferTotalQuantityComparator.Client_plane) - var5, var4 + Client.cycle, var3 + Client.cycle, var14, var12, var6, var11);
					var35.setDestination(var7, var2, class392.getTileHeight(var7, var2, GrandExchangeOfferTotalQuantityComparator.Client_plane) - var11, var4 + Client.cycle);
					Client.projectiles.addFirst(var35);
				}

			} else {
				TileItem var33;
				if (class240.field2780 == var0) {
					var2 = var1.method6995();
					var3 = (var2 >> 4 & 7) + ItemComposition.field1931;
					var4 = (var2 & 7) + Actor.field1146;
					var5 = var1.method7004();
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
						NodeDeque var34 = Client.groundItems[GrandExchangeOfferTotalQuantityComparator.Client_plane][var3][var4];
						if (var34 != null) {
							for (var33 = (TileItem)var34.last(); var33 != null; var33 = (TileItem)var34.previous()) {
								if ((var5 & 32767) == var33.id) {
									var33.remove();
									break;
								}
							}

							if (var34.last() == null) {
								Client.groundItems[GrandExchangeOfferTotalQuantityComparator.Client_plane][var3][var4] = null;
							}

							WallDecoration.updateItemPile(var3, var4);
						}
					}

				} else {
					if (class240.field2772 == var0) {
						var2 = var1.readUnsignedByte();
						var3 = var2 >> 4 & 15;
						var4 = var2 & 7;
						var5 = var1.method6997();
						var6 = (var5 >> 4 & 7) + ItemComposition.field1931;
						var7 = (var5 & 7) + Actor.field1146;
						var8 = var1.method6996();
						var9 = var1.method7004();
						if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
							var10 = var3 + 1;
							if (HealthBarDefinition.localPlayer.pathX[0] >= var6 - var10 && HealthBarDefinition.localPlayer.pathX[0] <= var6 + var10 && HealthBarDefinition.localPlayer.pathY[0] >= var7 - var10 && HealthBarDefinition.localPlayer.pathY[0] <= var7 + var10 && class408.clientPreferences.areaSoundEffectsVolume != 0 && var4 > 0 && Client.soundEffectCount < 50) {
								Client.soundEffectIds[Client.soundEffectCount] = var9;
								Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4;
								Client.queuedSoundEffectDelays[Client.soundEffectCount] = var8;
								Client.soundEffects[Client.soundEffectCount] = null;
								Client.soundLocations[Client.soundEffectCount] = var3 + (var7 << 8) + (var6 << 16);
								++Client.soundEffectCount;
							}
						}
					}

					if (class240.field2775 == var0) {
						var2 = var1.method7004();
						var3 = var1.method7120();
						var4 = var1.method6995();
						var5 = (var4 >> 4 & 7) + ItemComposition.field1931;
						var6 = (var4 & 7) + Actor.field1146;
						if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
							var33 = new TileItem();
							var33.id = var2;
							var33.quantity = var3;
							if (Client.groundItems[GrandExchangeOfferTotalQuantityComparator.Client_plane][var5][var6] == null) {
								Client.groundItems[GrandExchangeOfferTotalQuantityComparator.Client_plane][var5][var6] = new NodeDeque();
							}

							Client.groundItems[GrandExchangeOfferTotalQuantityComparator.Client_plane][var5][var6].addFirst(var33);
							WallDecoration.updateItemPile(var5, var6);
						}

					} else {
						if (class240.field2778 == var0) {
							var2 = var1.method7120();
							var3 = var1.method7006();
							var4 = var1.method6996();
							var5 = var4 >> 2;
							var6 = var4 & 3;
							var7 = Client.field530[var5];
							byte var38 = var1.method6973();
							byte var40 = var1.method7128();
							byte var41 = var1.method6973();
							var11 = var1.method7120();
							var12 = var1.readUnsignedShort();
							byte var13 = var1.readByte();
							var14 = var1.method6995();
							int var15 = (var14 >> 4 & 7) + ItemComposition.field1931;
							int var16 = (var14 & 7) + Actor.field1146;
							Player var17;
							if (var11 == Client.localPlayerIndex) {
								var17 = HealthBarDefinition.localPlayer;
							} else {
								var17 = Client.players[var11];
							}

							if (var17 != null) {
								ObjectComposition var18 = KitDefinition.getObjectDefinition(var12);
								int var19;
								int var20;
								if (var6 != 1 && var6 != 3) {
									var19 = var18.sizeX;
									var20 = var18.sizeY;
								} else {
									var19 = var18.sizeY;
									var20 = var18.sizeX;
								}

								int var21 = var15 + (var19 >> 1);
								int var22 = var15 + (var19 + 1 >> 1);
								int var23 = var16 + (var20 >> 1);
								int var24 = var16 + (var20 + 1 >> 1);
								int[][] var25 = Tiles.Tiles_heights[GrandExchangeOfferTotalQuantityComparator.Client_plane];
								int var26 = var25[var22][var24] + var25[var21][var23] + var25[var22][var23] + var25[var21][var24] >> 2;
								int var27 = (var15 << 7) + (var19 << 6);
								int var28 = (var16 << 7) + (var20 << 6);
								Model var29 = var18.getModel(var5, var6, var25, var27, var26, var28);
								if (var29 != null) {
									WorldMapLabelSize.updatePendingSpawn(GrandExchangeOfferTotalQuantityComparator.Client_plane, var15, var16, var7, -1, 0, 0, var3 + 1, var2 + 1);
									var17.animationCycleStart = var3 + Client.cycle;
									var17.animationCycleEnd = var2 + Client.cycle;
									var17.model0 = var29;
									var17.field1042 = var15 * 128 + var19 * 64;
									var17.field1052 = var16 * 128 + var20 * 64;
									var17.tileHeight2 = var26;
									byte var30;
									if (var41 > var13) {
										var30 = var41;
										var41 = var13;
										var13 = var30;
									}

									if (var38 > var40) {
										var30 = var38;
										var38 = var40;
										var40 = var30;
									}

									var17.minX = var41 + var15;
									var17.maxX = var15 + var13;
									var17.minY = var16 + var38;
									var17.maxY = var40 + var16;
								}
							}
						}

						if (class240.field2779 == var0) {
							var2 = var1.method7006();
							var3 = var1.readUnsignedByte();
							var4 = var1.method7006();
							var5 = var1.method6996();
							var6 = (var5 >> 4 & 7) + ItemComposition.field1931;
							var7 = (var5 & 7) + Actor.field1146;
							if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
								var6 = var6 * 128 + 64;
								var7 = var7 * 128 + 64;
								GraphicsObject var32 = new GraphicsObject(var2, GrandExchangeOfferTotalQuantityComparator.Client_plane, var6, var7, class392.getTileHeight(var6, var7, GrandExchangeOfferTotalQuantityComparator.Client_plane) - var3, var4, Client.cycle);
								Client.graphicsObjects.addFirst(var32);
							}

						} else if (class240.field2774 == var0) {
							var2 = var1.readUnsignedShort();
							var3 = var1.method6996();
							var4 = (var3 >> 4 & 7) + ItemComposition.field1931;
							var5 = (var3 & 7) + Actor.field1146;
							var6 = var1.method6997();
							var7 = var6 >> 2;
							var8 = var6 & 3;
							var9 = Client.field530[var7];
							if (var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) {
								if (var9 == 0) {
									BoundaryObject var31 = GameBuild.scene.method4301(GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5);
									if (var31 != null) {
										var11 = Entity_unpackID(var31.tag);
										if (var7 == 2) {
											var31.renderable1 = new DynamicObject(var11, 2, var8 + 4, GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5, var2, false, var31.renderable1);
											var31.renderable2 = new DynamicObject(var11, 2, var8 + 1 & 3, GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5, var2, false, var31.renderable2);
										} else {
											var31.renderable1 = new DynamicObject(var11, var7, var8, GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5, var2, false, var31.renderable1);
										}
									}
								}

								if (var9 == 1) {
									WallDecoration var43 = GameBuild.scene.method4410(GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5);
									if (var43 != null) {
										var11 = Entity_unpackID(var43.tag);
										if (var7 != 4 && var7 != 5) {
											if (var7 == 6) {
												var43.renderable1 = new DynamicObject(var11, 4, var8 + 4, GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5, var2, false, var43.renderable1);
											} else if (var7 == 7) {
												var43.renderable1 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5, var2, false, var43.renderable1);
											} else if (var7 == 8) {
												var43.renderable1 = new DynamicObject(var11, 4, var8 + 4, GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5, var2, false, var43.renderable1);
												var43.renderable2 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5, var2, false, var43.renderable2);
											}
										} else {
											var43.renderable1 = new DynamicObject(var11, 4, var8, GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5, var2, false, var43.renderable1);
										}
									}
								}

								if (var9 == 2) {
									GameObject var44 = GameBuild.scene.getGameObject(GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5);
									if (var7 == 11) {
										var7 = 10;
									}

									if (var44 != null) {
										var44.renderable = new DynamicObject(Entity_unpackID(var44.tag), var7, var8, GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5, var2, false, var44.renderable);
									}
								}

								if (var9 == 3) {
									FloorDecoration var45 = GameBuild.scene.getFloorDecoration(GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5);
									if (var45 != null) {
										var45.renderable = new DynamicObject(Entity_unpackID(var45.tag), 22, var8, GrandExchangeOfferTotalQuantityComparator.Client_plane, var4, var5, var2, false, var45.renderable);
									}
								}
							}

						}
					}
				}
			}
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "148255026"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2758, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
