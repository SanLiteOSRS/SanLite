import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("HealthBarDefinition_archive")
	static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	static EvictingDualNodeHashTable field1600;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("WorldMapElement_cachedSprites")
	static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1611863233
	)
	public int field1602;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 765111099
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -448867717
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 608050033
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 277480779
	)
	public int field1607;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -891708783
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1488754817
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1162639959
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1514706787
	)
	@Export("width")
	public int width;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -320308869
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		field1600 = new EvictingDualNodeHashTable(64);
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(64);
	}

	HealthBarDefinition() {
		this.int1 = 255;
		this.int2 = 255;
		this.int3 = -1;
		this.field1607 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-1015511162"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)V",
		garbageValue = "-1870101408"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) {
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) {
			var1.readUnsignedByte();
		} else if (var2 == 7) {
			this.frontSpriteID = var1.method6630();
		} else if (var2 == 8) {
			this.backSpriteID = var1.method6630();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Loa;",
		garbageValue = "-1342831199"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)WorldMapElement_cachedSprites.get((long)this.frontSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Tile.SpriteBuffer_getSprite(class378.HitSplatDefinition_spritesArchive, this.frontSpriteID, 0);
				if (var1 != null) {
					WorldMapElement_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Loa;",
		garbageValue = "1938378988"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)WorldMapElement_cachedSprites.get((long)this.backSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Tile.SpriteBuffer_getSprite(class378.HitSplatDefinition_spritesArchive, this.backSpriteID, 0);
				if (var1 != null) {
					WorldMapElement_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IZS)Ljava/lang/String;",
		garbageValue = "-25961"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) {
			int var3 = var0;
			String var2;
			if (var1 && var0 >= 0) {
				int var4 = 2;

				for (int var5 = var0 / 10; var5 != 0; ++var4) {
					var5 /= 10;
				}

				char[] var6 = new char[var4];
				var6[0] = '+';

				for (int var7 = var4 - 1; var7 > 0; --var7) {
					int var8 = var3;
					var3 /= 10;
					int var9 = var8 - var3 * 10;
					if (var9 >= 10) {
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48);
					}
				}

				var2 = new String(var6);
			} else {
				var2 = Integer.toString(var0, 10);
			}

			return var2;
		} else {
			return Integer.toString(var0);
		}
	}
}
