import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("ae")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		signature = "Lid;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -212739847
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1897982075
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1681555037
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1263884987
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lkb;B)V",
		garbageValue = "-1"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field292.value) {
			throw new IllegalStateException("");
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort() * 64;
			super.regionYLow = var1.readUnsignedShort() * 64;
			this.chunkXLow = var1.readUnsignedByte();
			this.chunkYLow = var1.readUnsignedByte();
			super.regionX = var1.readUnsignedShort();
			super.regionY = var1.readUnsignedShort();
			this.chunkX = var1.readUnsignedByte();
			this.chunkY = var1.readUnsignedByte();
			super.groupId = var1.method5851();
			super.fileId = var1.method5851();
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lkb;I)V",
		garbageValue = "-1024222647"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field196 = new byte[super.planes][64][64];
		super.field187 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class39.field285.value) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			int var5 = var1.readUnsignedByte();
			int var6 = var1.readUnsignedByte();
			if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) {
				for (int var7 = 0; var7 < 8; ++var7) {
					for (int var8 = 0; var8 < 8; ++var8) {
						this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-11"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-810889585"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "65"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "936777914"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) {
			return false;
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1;
			if (super.regionX == var2.regionX && super.regionY == var2.regionY) {
				return var2.chunkX == this.chunkX && this.chunkY == var2.chunkY;
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Lkb;II)V",
		garbageValue = "-984950165"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck();
		var2.size = var0.readUnsignedByte();
		var2.id = var0.readInt();
		var2.operations = new int[var2.size];
		var2.creationErrors = new int[var2.size];
		var2.fields = new Field[var2.size];
		var2.intReplaceValues = new int[var2.size];
		var2.methods = new Method[var2.size];
		var2.arguments = new byte[var2.size][][];

		for (int var3 = 0; var3 < var2.size; ++var3) {
			try {
				int var4 = var0.readUnsignedByte();
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) {
					if (var4 == 3 || var4 == 4) {
						var5 = var0.readStringCp1252NullTerminated();
						var6 = var0.readStringCp1252NullTerminated();
						var7 = var0.readUnsignedByte();
						String[] var8 = new String[var7];

						for (int var9 = 0; var9 < var7; ++var9) {
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated();
						byte[][] var10 = new byte[var7][];
						int var12;
						if (var4 == 3) {
							for (int var11 = 0; var11 < var7; ++var11) {
								var12 = var0.readInt();
								var10[var11] = new byte[var12];
								var0.readBytes(var10[var11], 0, var12);
							}
						}

						var2.operations[var3] = var4;
						Class[] var21 = new Class[var7];

						for (var12 = 0; var12 < var7; ++var12) {
							var21[var12] = Archive.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = Archive.loadClassFromDescriptor(var20);
						if (Archive.loadClassFromDescriptor(var5).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var13 = Archive.loadClassFromDescriptor(var5).getDeclaredMethods();
						Method[] var14 = var13;

						for (int var15 = 0; var15 < var14.length; ++var15) {
							Method var16 = var14[var15];
							if (Reflection.getMethodName(var16).equals(var6)) {
								Class[] var17 = Reflection.getParameterTypes(var16);
								if (var17.length == var21.length) {
									boolean var18 = true;

									for (int var19 = 0; var19 < var21.length; ++var19) {
										if (var21[var19] != var17[var19]) {
											var18 = false;
											break;
										}
									}

									if (var18 && var22 == var16.getReturnType()) {
										var2.methods[var3] = var16;
									}
								}
							}
						}

						var2.arguments[var3] = var10;
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated();
					var6 = var0.readStringCp1252NullTerminated();
					var7 = 0;
					if (var4 == 1) {
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4;
					var2.intReplaceValues[var3] = var7;
					if (Archive.loadClassFromDescriptor(var5).getClassLoader() == null) {
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(Archive.loadClassFromDescriptor(var5), var6);
				}
			} catch (ClassNotFoundException var24) {
				var2.creationErrors[var3] = -1;
			} catch (SecurityException var25) {
				var2.creationErrors[var3] = -2;
			} catch (NullPointerException var26) {
				var2.creationErrors[var3] = -3;
			} catch (Exception var27) {
				var2.creationErrors[var3] = -4;
			} catch (Throwable var28) {
				var2.creationErrors[var3] = -5;
			}
		}

		class105.reflectionChecks.addFirst(var2);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lks;IB)V",
		garbageValue = "0"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1;
		if (var2) {
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2);
		Player var4 = Client.players[var1];
		if (var3 == 0) {
			if (var2) {
				var4.field664 = false;
			} else if (Client.localPlayerIndex == var1) {
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (WorldMapData_0.baseY * 64 + var4.pathY[0] >> 13) + (FloorDecoration.baseX * 64 + var4.pathX[0] >> 13 << 14);
				if (var4.field1003 != -1) {
					Players.Players_orientations[var1] = var4.field1003;
				} else {
					Players.Players_orientations[var1] = var4.orientation;
				}

				Players.Players_targetIndices[var1] = var4.targetIndex;
				Client.players[var1] = null;
				if (var0.readBits(1) != 0) {
					class9.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) {
				var5 = var0.readBits(3);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					--var6;
					--var7;
				} else if (var5 == 1) {
					--var7;
				} else if (var5 == 2) {
					++var6;
					--var7;
				} else if (var5 == 3) {
					--var6;
				} else if (var5 == 4) {
					++var6;
				} else if (var5 == 5) {
					--var6;
					++var7;
				} else if (var5 == 6) {
					++var7;
				} else if (var5 == 7) {
					++var6;
					++var7;
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
					var4.resetPath(var6, var7);
					var4.field664 = false;
				} else if (var2) {
					var4.field664 = true;
					var4.tileX = var6;
					var4.tileY = var7;
				} else {
					var4.field664 = false;
					var4.method1335(var6, var7, Players.field1295[var1]);
				}

			} else if (var3 == 2) {
				var5 = var0.readBits(4);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					var6 -= 2;
					var7 -= 2;
				} else if (var5 == 1) {
					--var6;
					var7 -= 2;
				} else if (var5 == 2) {
					var7 -= 2;
				} else if (var5 == 3) {
					++var6;
					var7 -= 2;
				} else if (var5 == 4) {
					var6 += 2;
					var7 -= 2;
				} else if (var5 == 5) {
					var6 -= 2;
					--var7;
				} else if (var5 == 6) {
					var6 += 2;
					--var7;
				} else if (var5 == 7) {
					var6 -= 2;
				} else if (var5 == 8) {
					var6 += 2;
				} else if (var5 == 9) {
					var6 -= 2;
					++var7;
				} else if (var5 == 10) {
					var6 += 2;
					++var7;
				} else if (var5 == 11) {
					var6 -= 2;
					var7 += 2;
				} else if (var5 == 12) {
					--var6;
					var7 += 2;
				} else if (var5 == 13) {
					var7 += 2;
				} else if (var5 == 14) {
					++var6;
					var7 += 2;
				} else if (var5 == 15) {
					var6 += 2;
					var7 += 2;
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
					var4.resetPath(var6, var7);
					var4.field664 = false;
				} else if (var2) {
					var4.field664 = true;
					var4.tileX = var6;
					var4.tileY = var7;
				} else {
					var4.field664 = false;
					var4.method1335(var6, var7, Players.field1295[var1]);
				}

			} else {
				var5 = var0.readBits(1);
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) {
					var6 = var0.readBits(12);
					var7 = var6 >> 10;
					var8 = var6 >> 5 & 31;
					if (var8 > 15) {
						var8 -= 32;
					}

					var9 = var6 & 31;
					if (var9 > 15) {
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0];
					var11 = var9 + var4.pathY[0];
					if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) {
						if (var2) {
							var4.field664 = true;
							var4.tileX = var10;
							var4.tileY = var11;
						} else {
							var4.field664 = false;
							var4.method1335(var10, var11, Players.field1295[var1]);
						}
					} else {
						var4.resetPath(var10, var11);
						var4.field664 = false;
					}

					var4.plane = (byte)(var7 + var4.plane & 3);
					if (Client.localPlayerIndex == var1) {
						GrandExchangeOfferUnitPriceComparator.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30);
					var7 = var6 >> 28;
					var8 = var6 >> 14 & 16383;
					var9 = var6 & 16383;
					var10 = (FloorDecoration.baseX * 64 + var8 + var4.pathX[0] & 16383) - FloorDecoration.baseX * 64;
					var11 = (WorldMapData_0.baseY * 64 + var9 + var4.pathY[0] & 16383) - WorldMapData_0.baseY * 64;
					if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) {
						if (var2) {
							var4.field664 = true;
							var4.tileX = var10;
							var4.tileY = var11;
						} else {
							var4.field664 = false;
							var4.method1335(var10, var11, Players.field1295[var1]);
						}
					} else {
						var4.resetPath(var10, var11);
						var4.field664 = false;
					}

					var4.plane = (byte)(var7 + var4.plane & 3);
					if (Client.localPlayerIndex == var1) {
						GrandExchangeOfferUnitPriceComparator.Client_plane = var4.plane;
					}

				}
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-218590717"
	)
	static void method817(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		signature = "(ILhw;ZI)V",
		garbageValue = "2083872008"
	)
	static void method796(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = Canvas.getWorldMap().getMapArea(var0);
		int var4 = PlayerType.localPlayer.plane;
		int var5 = FloorDecoration.baseX * 64 + (PlayerType.localPlayer.x >> 7);
		int var6 = WorldMapData_0.baseY * 64 + (PlayerType.localPlayer.y >> 7);
		Coord var7 = new Coord(var4, var5, var6);
		Canvas.getWorldMap().method6470(var3, var7, var1, var2);
	}
}
