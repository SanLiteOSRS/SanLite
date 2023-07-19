import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	public static BufferedFile field1849;
	@ObfuscatedName("ad")
	static String[] field1844;
	@ObfuscatedName("uj")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	@Export("decimator")
	static Decimator decimator;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		field1849 = null; // L: 24
	}

	@ObfuscatedName("ay")
	public static boolean method3599(long var0) {
		return (int)(var0 >>> 16 & 1L) == 1; // L: 64
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lnr;IB)Lum;",
		garbageValue = "-15"
	)
	public static IndexedSprite method3602(AbstractArchive var0, int var1) {
		byte[] var3 = var0.takeFileFlat(var1); // L: 159
		boolean var2;
		if (var3 == null) { // L: 160
			var2 = false; // L: 161
		} else {
			GrandExchangeEvent.SpriteBuffer_decode(var3); // L: 164
			var2 = true; // L: 165
		}

		if (!var2) { // L: 167
			return null;
		} else {
			IndexedSprite var4 = new IndexedSprite(); // L: 170
			var4.width = class527.SpriteBuffer_spriteWidth; // L: 171
			var4.height = class527.SpriteBuffer_spriteHeight; // L: 172
			var4.xOffset = class527.SpriteBuffer_xOffsets[0]; // L: 173
			var4.yOffset = class527.SpriteBuffer_yOffsets[0]; // L: 174
			var4.subWidth = class496.SpriteBuffer_spriteWidths[0]; // L: 175
			var4.subHeight = BuddyRankComparator.SpriteBuffer_spriteHeights[0]; // L: 176
			var4.palette = class527.SpriteBuffer_spritePalette; // L: 177
			var4.pixels = class464.SpriteBuffer_pixels[0]; // L: 178
			PlatformInfo.method8433(); // L: 179
			return var4; // L: 182
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Lca;",
		garbageValue = "7"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 248
		return WorldMapDecoration.getNextWorldListWorld(); // L: 249
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(ZLtf;I)V",
		garbageValue = "-1555940396"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5793
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) { // L: 5794
			var2 = var1.readUnsignedShort(); // L: 5795
			var3 = var1.readUnsignedShort(); // L: 5796
			int var4 = var1.readUnsignedShort(); // L: 5797
			SpotAnimationDefinition.xteaKeys = new int[var4][4]; // L: 5798

			for (var5 = 0; var5 < var4; ++var5) { // L: 5799
				for (var6 = 0; var6 < 4; ++var6) { // L: 5800
					SpotAnimationDefinition.xteaKeys[var5][var6] = var1.readInt(); // L: 5801
				}
			}

			SceneTilePaint.regions = new int[var4]; // L: 5804
			class156.regionMapArchiveIds = new int[var4]; // L: 5805
			class106.regionLandArchiveIds = new int[var4]; // L: 5806
			BufferedNetSocket.regionLandArchives = new byte[var4][]; // L: 5807
			class292.regionMapArchives = new byte[var4][]; // L: 5808
			var4 = 0; // L: 5809

			for (var5 = (var3 - 6) / 8; var5 <= (var3 + 6) / 8; ++var5) { // L: 5810
				for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) { // L: 5811
					var7 = var6 + (var5 << 8); // L: 5812
					SceneTilePaint.regions[var4] = var7; // L: 5813
					class156.regionMapArchiveIds[var4] = Renderable.archive6.getGroupId("m" + var5 + "_" + var6); // L: 5814
					class106.regionLandArchiveIds[var4] = Renderable.archive6.getGroupId("l" + var5 + "_" + var6); // L: 5815
					++var4; // L: 5816
				}
			}

			NPCComposition.method3850(var3, var2, true); // L: 5819
		} else {
			var2 = var1.method9100(); // L: 5822
			var3 = var1.method9099(); // L: 5823
			boolean var15 = var1.method9258() == 1; // L: 5824
			var5 = var1.readUnsignedShort(); // L: 5825
			var1.importIndex(); // L: 5826

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5827
				for (var7 = 0; var7 < 13; ++var7) { // L: 5828
					for (var8 = 0; var8 < 13; ++var8) { // L: 5829
						var9 = var1.readBits(1); // L: 5830
						if (var9 == 1) {
							Client.field573[var6][var7][var8] = var1.readBits(26); // L: 5831
						} else {
							Client.field573[var6][var7][var8] = -1; // L: 5832
						}
					}
				}
			}

			var1.exportIndex(); // L: 5836
			SpotAnimationDefinition.xteaKeys = new int[var5][4]; // L: 5837

			for (var6 = 0; var6 < var5; ++var6) { // L: 5838
				for (var7 = 0; var7 < 4; ++var7) { // L: 5839
					SpotAnimationDefinition.xteaKeys[var6][var7] = var1.readInt(); // L: 5840
				}
			}

			SceneTilePaint.regions = new int[var5]; // L: 5843
			class156.regionMapArchiveIds = new int[var5]; // L: 5844
			class106.regionLandArchiveIds = new int[var5]; // L: 5845
			BufferedNetSocket.regionLandArchives = new byte[var5][]; // L: 5846
			class292.regionMapArchives = new byte[var5][]; // L: 5847
			var5 = 0; // L: 5848

			for (var6 = 0; var6 < 4; ++var6) { // L: 5849
				for (var7 = 0; var7 < 13; ++var7) { // L: 5850
					for (var8 = 0; var8 < 13; ++var8) { // L: 5851
						var9 = Client.field573[var6][var7][var8]; // L: 5852
						if (var9 != -1) { // L: 5853
							int var10 = var9 >> 14 & 1023; // L: 5854
							int var11 = var9 >> 3 & 2047; // L: 5855
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5856

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5857
								if (SceneTilePaint.regions[var13] == var12) {
									var12 = -1; // L: 5858
									break; // L: 5859
								}
							}

							if (var12 != -1) { // L: 5861
								SceneTilePaint.regions[var5] = var12; // L: 5862
								var13 = var12 >> 8 & 255; // L: 5863
								int var14 = var12 & 255; // L: 5864
								class156.regionMapArchiveIds[var5] = Renderable.archive6.getGroupId("m" + var13 + "_" + var14); // L: 5865
								class106.regionLandArchiveIds[var5] = Renderable.archive6.getGroupId("l" + var13 + "_" + var14); // L: 5866
								++var5; // L: 5867
							}
						}
					}
				}
			}

			NPCComposition.method3850(var2, var3, !var15); // L: 5873
		}

	} // L: 5875
}
