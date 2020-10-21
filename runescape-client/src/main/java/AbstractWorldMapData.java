import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = -1795954439
	)
	static int field198;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -775520192
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1369074368
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1287028281
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1006344441
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1534728703
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -622931363
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1787627211
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 953400525
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("u")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("t")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("e")
	byte[][][] field196;
	@ObfuscatedName("o")
	byte[][][] field187;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "[[[[Laz;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("x")
	boolean field202;
	@ObfuscatedName("p")
	boolean field200;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field202 = false;
		this.field200 = false;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lkb;I)V",
		garbageValue = "-1024222647"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "15"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field202 && this.field200;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Liw;B)V",
		garbageValue = "-18"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field202 = true;
				this.field200 = true;
			}

		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-246521616"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field196 = null;
		this.field187 = null;
		this.decorations = null;
		this.field202 = false;
		this.field200 = false;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(IILkb;I)V",
		garbageValue = "1303493953"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method337(var1, var2, var3, var4);
			} else {
				this.method343(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(IILkb;IB)V",
		garbageValue = "96"
	)
	void method337(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(IILkb;II)V",
		garbageValue = "1646413468"
	)
	void method343(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1;
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0;
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		int var8;
		int var9;
		int var11;
		if (var6) {
			var8 = var3.readUnsignedByte();

			for (var9 = 0; var9 < var8; ++var9) {
				int var10 = var3.readUnsignedByte();
				if (var10 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var10;
					var11 = var3.readUnsignedByte();
					this.field196[var9][var1][var2] = (byte)(var11 >> 2);
					this.field187[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var14 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.method5851();
						int var13 = var3.readUnsignedByte();
						var14[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "3"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "66"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II)Ljk;",
		garbageValue = "1003321139"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ItemComposition.ItemDefinition_archive.takeFile(10, var0);
			var1 = new ItemComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.post();
			if (var1.noteTemplate != -1) {
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) {
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) {
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!SoundCache.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
				var1.name = "Members object";
				var1.isTradable = false;
				var1.groundActions = null;
				var1.inventoryActions = null;
				var1.shiftClickIndex = -1;
				var1.team = 0;
				if (var1.params != null) {
					boolean var3 = false;

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
						ParamDefinition var5 = TileItem.getParamDefinition((int)var4.key);
						if (var5.autoDisable) {
							var4.remove();
						} else {
							var3 = true;
						}
					}

					if (!var3) {
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(CI)Z",
		garbageValue = "-47710105"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1953135448"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = WorldMapCacheName.fontPlain12.lineWidth(var0, 250);
			int var6 = WorldMapCacheName.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 16777215);
			WorldMapCacheName.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			int var7 = var3 - var2;
			int var8 = var4 - var2;
			int var9 = var2 + var2 + var5;
			int var10 = var2 + var6 + var2;

			int var11;
			for (var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
				if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var10 + var8) {
					Client.field834[var11] = true;
				}
			}

			if (var1) {
				class22.rasterProvider.drawFull(0, 0);
			} else {
				var11 = var3;
				int var12 = var4;
				int var13 = var5;
				int var14 = var6;

				for (int var15 = 0; var15 < Client.rootWidgetCount; ++var15) {
					if (Client.rootWidgetWidths[var15] + Client.rootWidgetXs[var15] > var11 && Client.rootWidgetXs[var15] < var11 + var13 && Client.rootWidgetHeights[var15] + Client.rootWidgetYs[var15] > var12 && Client.rootWidgetYs[var15] < var14 + var12) {
						Client.field758[var15] = true;
					}
				}
			}

		}
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-16"
	)
	static void method375() {
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
	}
}
