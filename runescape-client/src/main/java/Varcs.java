import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		signature = "Lcs;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("u")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("p")
	@Export("map")
	Map map;
	@ObfuscatedName("b")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("e")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = 93578901250318875L
	)
	long field1366;

	Varcs() {
		this.unwrittenChanges = false;
		int var1 = class235.archive2.getGroupFileCount(19);
		this.map = new HashMap();
		this.intsPersistence = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			VarcInt var3 = GrandExchangeOfferAgeComparator.method4606(var2);
			this.intsPersistence[var2] = var3.persist;
		}

		var2 = 0;
		if (class235.archive2.method4440(15)) {
			var2 = class235.archive2.getGroupFileCount(15);
		}

		this.strings = new String[var2];
		this.read();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "849299209"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "1590858521"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;I)V",
		garbageValue = "111416311"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(IB)Ljava/lang/String;",
		garbageValue = "39"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? (String)var2 : "";
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;I)V",
		garbageValue = "2094662895"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(II)Ljava/lang/String;",
		garbageValue = "944550369"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1];
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1577659232"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) {
			if (!this.intsPersistence[var1]) {
				this.map.remove(var1);
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) {
			this.strings[var1] = null;
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(ZI)Lni;",
		garbageValue = "1031892444"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return class15.getPreferencesFile("2", class27.field208.name, var1);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "105"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true);

		try {
			int var2 = 3;
			int var3 = 0;
			Iterator var4 = this.map.entrySet().iterator();

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next();
				int var6 = (Integer)var5.getKey();
				if (this.intsPersistence[var6]) {
					Object var7 = var5.getValue();
					var2 += 3;
					if (var7 instanceof Integer) {
						var2 += 4;
					} else if (var7 instanceof String) {
						var2 += Friend.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3;
				}
			}

			Buffer var24 = new Buffer(var2);
			var24.writeByte(2);
			var24.writeShort(var3);
			Iterator var25 = this.map.entrySet().iterator();

			while (var25.hasNext()) {
				Entry var13 = (Entry)var25.next();
				int var14 = (Integer)var13.getKey();
				if (this.intsPersistence[var14]) {
					var24.writeShort(var14);
					Object var8 = var13.getValue();
					class373 var9 = class373.method6477(var8.getClass());
					var24.writeByte(var9.field4130);
					class369 var10 = class373.method6480(var8.getClass());
					var10.vmethod6493(var8, var24);
				}
			}

			var1.write(var24.array, 0, var24.offset);
		} catch (Exception var22) {
		} finally {
			try {
				var1.close();
			} catch (Exception var21) {
			}

		}

		this.unwrittenChanges = false;
		this.field1366 = ObjectSound.currentTimeMillis();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1853705286"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false);

		try {
			byte[] var2 = new byte[(int)var1.length()];

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var1.read(var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new EOFException();
				}
			}

			Buffer var15 = new Buffer(var2);
			if (var15.array.length - var15.offset < 1) {
				return;
			}

			int var16 = var15.readUnsignedByte();
			if (var16 < 0 || var16 > 2) {
				return;
			}

			int var7;
			int var8;
			int var9;
			int var17;
			if (var16 >= 2) {
				var17 = var15.readUnsignedShort();

				for (var7 = 0; var7 < var17; ++var7) {
					var8 = var15.readUnsignedShort();
					var9 = var15.readUnsignedByte();
					class373[] var10 = new class373[]{class373.field4128, class373.field4134, class373.field4126};
					class373 var11 = (class373)UserComparator8.findEnumerated(var10, var9);
					Object var12 = var11.method6482(var15);
					if (this.intsPersistence[var8]) {
						this.map.put(var8, var12);
					}
				}
			} else {
				var17 = var15.readUnsignedShort();

				for (var7 = 0; var7 < var17; ++var7) {
					var8 = var15.readUnsignedShort();
					var9 = var15.readInt();
					if (this.intsPersistence[var8]) {
						this.map.put(var8, var9);
					}
				}

				var7 = var15.readUnsignedShort();

				for (var8 = 0; var8 < var7; ++var8) {
					var15.readUnsignedShort();
					var15.readStringCp1252NullTerminated();
				}
			}
		} catch (Exception var26) {
		} finally {
			try {
				var1.close();
			} catch (Exception var25) {
			}

		}

		this.unwrittenChanges = false;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(S)V",
		garbageValue = "150"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1366 < ObjectSound.currentTimeMillis() - 60000L) {
			this.write();
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "111"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}

	@ObfuscatedName("o")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = class304.base37Table[(int)(var6 - 37L * var0)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1479918720"
	)
	static final void method2340() {
		class20.method304(false);
		Client.field655 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < class15.regionLandArchives.length; ++var1) {
			if (WorldMapData_0.regionMapArchiveIds[var1] != -1 && class15.regionLandArchives[var1] == null) {
				class15.regionLandArchives[var1] = class157.archive5.takeFile(WorldMapData_0.regionMapArchiveIds[var1], 0);
				if (class15.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field655;
				}
			}

			if (class18.regionLandArchiveIds[var1] != -1 && MouseHandler.regionMapArchives[var1] == null) {
				MouseHandler.regionMapArchives[var1] = class157.archive5.takeFileEncrypted(class18.regionLandArchiveIds[var1], 0, NPC.xteaKeys[var1]);
				if (MouseHandler.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field655;
				}
			}
		}

		if (!var0) {
			Client.field659 = 1;
		} else {
			Client.field657 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < class15.regionLandArchives.length; ++var1) {
				byte[] var2 = MouseHandler.regionMapArchives[var1];
				if (var2 != null) {
					var3 = (class11.regions[var1] >> 8) * 64 - ItemLayer.baseX * 64;
					var4 = (class11.regions[var1] & 255) * 64 - Tile.baseY * 64;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= ItemContainer.method2092(var2, var3, var4);
				}
			}

			if (!var0) {
				Client.field659 = 2;
			} else {
				if (Client.field659 != 0) {
					class2.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				BoundaryObject.playPcmPlayers();
				WorldMapArea.scene.clear();

				for (var1 = 0; var1 < 4; ++var1) {
					Client.collisionMaps[var1].clear();
				}

				int var13;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var13 = 0; var13 < 104; ++var13) {
						for (var3 = 0; var3 < 104; ++var3) {
							Tiles.Tiles_renderFlags[var1][var13][var3] = 0;
						}
					}
				}

				BoundaryObject.playPcmPlayers();
				Tiles.Tiles_minPlane = 99;
				class9.field69 = new byte[4][104][104];
				Tiles.field1092 = new byte[4][104][104];
				Tiles.field1091 = new byte[4][104][104];
				class362.field4079 = new byte[4][104][104];
				MidiPcmStream.field2489 = new int[4][105][105];
				SecureRandomCallable.field1106 = new byte[4][105][105];
				WorldMapLabelSize.field1570 = new int[105][105];
				Tiles.Tiles_hue = new int[104];
				Tiles.Tiles_saturation = new int[104];
				Tiles.Tiles_lightness = new int[104];
				GrandExchangeOfferOwnWorldComparator.Tiles_hueMultiplier = new int[104];
				class375.field4136 = new int[104];
				var1 = class15.regionLandArchives.length;

				for (ObjectSound var16 = (ObjectSound)ObjectSound.objectSounds.last(); var16 != null; var16 = (ObjectSound)ObjectSound.objectSounds.previous()) {
					if (var16.stream1 != null) {
						Huffman.pcmStreamMixer.removeSubStream(var16.stream1);
						var16.stream1 = null;
					}

					if (var16.stream2 != null) {
						Huffman.pcmStreamMixer.removeSubStream(var16.stream2);
						var16.stream2 = null;
					}
				}

				ObjectSound.objectSounds.clear();
				class20.method304(true);
				int var6;
				int var7;
				byte var8;
				int var10;
				int var11;
				int var14;
				if (!Client.isInInstance) {
					byte[] var5;
					for (var13 = 0; var13 < var1; ++var13) {
						var3 = (class11.regions[var13] >> 8) * 64 - ItemLayer.baseX * 64;
						var4 = (class11.regions[var13] & 255) * 64 - Tile.baseY * 64;
						var5 = class15.regionLandArchives[var13];
						if (var5 != null) {
							BoundaryObject.playPcmPlayers();
							MouseRecorder.method2108(var5, var3, var4, class105.field1327 * 8 - 48, Language.field3357 * 8 - 48, Client.collisionMaps);
						}
					}

					for (var13 = 0; var13 < var1; ++var13) {
						var3 = (class11.regions[var13] >> 8) * 64 - ItemLayer.baseX * 64;
						var4 = (class11.regions[var13] & 255) * 64 - Tile.baseY * 64;
						var5 = class15.regionLandArchives[var13];
						if (var5 == null && Language.field3357 < 800) {
							BoundaryObject.playPcmPlayers();
							var6 = var3;
							var7 = var4;
							var8 = 64;
							byte var9 = 64;

							for (var10 = var4; var10 <= var7 + var9; ++var10) {
								for (var11 = var6; var11 <= var6 + var8; ++var11) {
									if (var11 >= 0 && var11 < 104 && var10 >= 0 && var10 < 104) {
										SecureRandomCallable.field1106[0][var11][var10] = 127;
										if (var11 == var6 && var11 > 0) {
											Tiles.Tiles_heights[0][var11][var10] = Tiles.Tiles_heights[0][var11 - 1][var10];
										}

										if (var11 == var8 + var6 && var11 < 103) {
											Tiles.Tiles_heights[0][var11][var10] = Tiles.Tiles_heights[0][var11 + 1][var10];
										}

										if (var7 == var10 && var10 > 0) {
											Tiles.Tiles_heights[0][var11][var10] = Tiles.Tiles_heights[0][var11][var10 - 1];
										}

										if (var10 == var7 + var9 && var10 < 103) {
											Tiles.Tiles_heights[0][var11][var10] = Tiles.Tiles_heights[0][var11][var10 + 1];
										}
									}
								}
							}
						}
					}

					class20.method304(true);

					for (var13 = 0; var13 < var1; ++var13) {
						byte[] var15 = MouseHandler.regionMapArchives[var13];
						if (var15 != null) {
							var4 = (class11.regions[var13] >> 8) * 64 - ItemLayer.baseX * 64;
							var14 = (class11.regions[var13] & 255) * 64 - Tile.baseY * 64;
							BoundaryObject.playPcmPlayers();
							class243.method4399(var15, var4, var14, WorldMapArea.scene, Client.collisionMaps);
						}
					}
				}

				int var18;
				if (Client.isInInstance) {
					int var19;
					for (var13 = 0; var13 < 4; ++var13) {
						BoundaryObject.playPcmPlayers();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								boolean var20 = false;
								var6 = Client.instanceChunkTemplates[var13][var3][var4];
								if (var6 != -1) {
									var7 = var6 >> 24 & 3;
									var18 = var6 >> 1 & 3;
									var19 = var6 >> 14 & 1023;
									var10 = var6 >> 3 & 2047;
									var11 = (var19 / 8 << 8) + var10 / 8;

									for (int var12 = 0; var12 < class11.regions.length; ++var12) {
										if (class11.regions[var12] == var11 && class15.regionLandArchives[var12] != null) {
											class7.method104(class15.regionLandArchives[var12], var13, var3 * 8, var4 * 8, var7, (var19 & 7) * 8, (var10 & 7) * 8, var18, Client.collisionMaps);
											var20 = true;
											break;
										}
									}
								}

								if (!var20) {
									class26.method368(var13, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var13 = 0; var13 < 13; ++var13) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var13][var3];
							if (var4 == -1) {
								var14 = var13 * 8;
								var6 = var3 * 8;
								byte var17 = 8;
								var8 = 8;

								for (var19 = var6; var19 <= var6 + var8; ++var19) {
									for (var10 = var14; var10 <= var17 + var14; ++var10) {
										if (var10 >= 0 && var10 < 104 && var19 >= 0 && var19 < 104) {
											SecureRandomCallable.field1106[0][var10][var19] = 127;
											if (var10 == var14 && var10 > 0) {
												Tiles.Tiles_heights[0][var10][var19] = Tiles.Tiles_heights[0][var10 - 1][var19];
											}

											if (var10 == var14 + var17 && var10 < 103) {
												Tiles.Tiles_heights[0][var10][var19] = Tiles.Tiles_heights[0][var10 + 1][var19];
											}

											if (var6 == var19 && var19 > 0) {
												Tiles.Tiles_heights[0][var10][var19] = Tiles.Tiles_heights[0][var10][var19 - 1];
											}

											if (var19 == var8 + var6 && var19 < 103) {
												Tiles.Tiles_heights[0][var10][var19] = Tiles.Tiles_heights[0][var10][var19 + 1];
											}
										}
									}
								}
							}
						}
					}

					class20.method304(true);

					for (var13 = 0; var13 < 4; ++var13) {
						BoundaryObject.playPcmPlayers();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var14 = Client.instanceChunkTemplates[var13][var3][var4];
								if (var14 != -1) {
									var6 = var14 >> 24 & 3;
									var7 = var14 >> 1 & 3;
									var18 = var14 >> 14 & 1023;
									var19 = var14 >> 3 & 2047;
									var10 = (var18 / 8 << 8) + var19 / 8;

									for (var11 = 0; var11 < class11.regions.length; ++var11) {
										if (class11.regions[var11] == var10 && MouseHandler.regionMapArchives[var11] != null) {
											class157.method3114(MouseHandler.regionMapArchives[var11], var13, var3 * 8, var4 * 8, var6, (var18 & 7) * 8, (var19 & 7) * 8, var7, WorldMapArea.scene, Client.collisionMaps);
											break;
										}
									}
								}
							}
						}
					}
				}

				class20.method304(true);
				BoundaryObject.playPcmPlayers();
				GameEngine.method680(WorldMapArea.scene, Client.collisionMaps);
				class20.method304(true);
				var13 = Tiles.Tiles_minPlane;
				if (var13 > class26.Client_plane) {
					var13 = class26.Client_plane;
				}

				if (var13 < class26.Client_plane - 1) {
					var13 = class26.Client_plane - 1;
				}

				if (Client.isLowDetail) {
					WorldMapArea.scene.init(Tiles.Tiles_minPlane);
				} else {
					WorldMapArea.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						class225.updateItemPile(var3, var4);
					}
				}

				BoundaryObject.playPcmPlayers();
				NetFileRequest.method4472();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var21;
				if (class10.client.hasFrame()) {
					var21 = ObjectComposition.getPacketBufferNode(ClientPacket.field2312, Client.packetWriter.isaacCipher);
					var21.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var21);
				}

				if (!Client.isInInstance) {
					var3 = (class105.field1327 - 6) / 8;
					var4 = (class105.field1327 + 6) / 8;
					var14 = (Language.field3357 - 6) / 8;
					var6 = (Language.field3357 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var18 = var14 - 1; var18 <= var6 + 1; ++var18) {
							if (var7 < var3 || var7 > var4 || var18 < var14 || var18 > var6) {
								class157.archive5.loadRegionFromName("m" + var7 + "_" + var18);
								class157.archive5.loadRegionFromName("l" + var7 + "_" + var18);
							}
						}
					}
				}

				class20.updateGameState(30);
				BoundaryObject.playPcmPlayers();
				class69.method1166();
				var21 = ObjectComposition.getPacketBufferNode(ClientPacket.field2236, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var21);
				Decimator.clock.mark();

				for (var4 = 0; var4 < 32; ++var4) {
					GameEngine.graphicsTickTimes[var4] = 0L;
				}

				for (var4 = 0; var4 < 32; ++var4) {
					GameEngine.clientTickTimes[var4] = 0L;
				}

				class232.gameCyclesToDo = 0;
			}
		}
	}
}
