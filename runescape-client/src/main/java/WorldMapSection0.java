import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1768091049
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 988628889
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1156132855
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1708018095
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -432173517
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2114581385
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 130464103
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -2110641739
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1280805387
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1407216149
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1337745057
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1810470631
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 215661089
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1604965757
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Leq;I)V",
		garbageValue = "-609192354"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) {
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX;
		}

		if (var1.regionLowY > this.newY) {
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) {
			var1.regionHighY = this.newY;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IIII)Z",
		garbageValue = "-2146205978"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(III)Z",
		garbageValue = "-916390789"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(IIII)[I",
		garbageValue = "1101045563"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
			return var4;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(III)Lhk;",
		garbageValue = "1643926479"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
			int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
			return new Coord(this.oldZ, var3, var4);
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-576756767"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte();
		this.newZ = var1.readUnsignedByte();
		this.oldX = var1.readUnsignedShort();
		this.oldChunkXLow = var1.readUnsignedByte();
		this.oldChunkXHigh = var1.readUnsignedByte();
		this.oldY = var1.readUnsignedShort();
		this.oldChunkYLow = var1.readUnsignedByte();
		this.oldChunkYHigh = var1.readUnsignedByte();
		this.newX = var1.readUnsignedShort();
		this.newChunkXLow = var1.readUnsignedByte();
		this.newChunkXHigh = var1.readUnsignedByte();
		this.newY = var1.readUnsignedShort();
		this.newChunkYLow = var1.readUnsignedByte();
		this.newChunkYHigh = var1.readUnsignedByte();
		this.postRead();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "61"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lir;Lir;Lir;I)V",
		garbageValue = "1056313138"
	)
	public static void method3034(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		HitSplatDefinition.HitSplatDefinition_archive = var0;
		HitSplatDefinition.field3562 = var1;
		HitSplatDefinition.HitSplatDefinition_fontsArchive = var2;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IIII)I",
		garbageValue = "80303015"
	)
	public static int method3058(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(ILir;IIIZI)V",
		garbageValue = "2053595468"
	)
	@Export("playMusicTrack")
	public static void playMusicTrack(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		class210.musicPlayerStatus = 1;
		class210.musicTrackArchive = var1;
		FaceNormal.musicTrackGroupId = var2;
		WorldMapID.musicTrackFileId = var3;
		class375.musicTrackVolume = var4;
		class210.musicTrackBoolean = var5;
		class1.pcmSampleLength = var0;
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		signature = "(Lhu;II)I",
		garbageValue = "-1824113560"
	)
	static final int method3036(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
			try {
				int[] var2 = var0.cs1Instructions[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}

					if (var6 == 1) {
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) {
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) {
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = class139.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!class23.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) {
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) {
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) {
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) {
						var7 = Varcs.localPlayer.combatLevel;
					}

					if (var6 == 9) {
						for (var9 = 0; var9 < 25; ++var9) {
							if (Skills.Skills_enabled[var9]) {
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = class139.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!class23.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 = 999999999;
									break;
								}
							}
						}
					}

					if (var6 == 11) {
						var7 = Client.runEnergy;
					}

					if (var6 == 12) {
						var7 = Client.weight;
					}

					if (var6 == 13) {
						var9 = Varps.Varps_main[var2[var4++]];
						int var13 = var2[var4++];
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = class2.getVarbit(var9);
					}

					if (var6 == 15) {
						var8 = 1;
					}

					if (var6 == 16) {
						var8 = 2;
					}

					if (var6 == 17) {
						var8 = 3;
					}

					if (var6 == 18) {
						var7 = ItemLayer.baseX * 64 + (Varcs.localPlayer.x >> 7);
					}

					if (var6 == 19) {
						var7 = Tile.baseY * 64 + (Varcs.localPlayer.y >> 7);
					}

					if (var6 == 20) {
						var7 = var2[var4++];
					}

					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}

						if (var5 == 1) {
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}

						if (var5 == 3) {
							var3 *= var7;
						}

						var5 = 0;
					} else {
						var5 = var8;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}
}
