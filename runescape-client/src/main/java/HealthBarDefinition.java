import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("HitSplatDefinition_spritesArchive")
	public static AbstractArchive HitSplatDefinition_spritesArchive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lev;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lev;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1202719207
	)
	public int field3310;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 989487885
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 609506575
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1179673119
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1289103719
	)
	public int field3314;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1724859725
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1229803207
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -524037047
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 185744125
	)
	@Export("width")
	public int width;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1513629223
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
	}

	public HealthBarDefinition() {
		this.int1 = 255;
		this.int2 = 255;
		this.int3 = -1;
		this.field3314 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lkb;I)V",
		garbageValue = "-1137754671"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lkb;II)V",
		garbageValue = "1563095853"
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
			this.frontSpriteID = var1.method5851();
		} else if (var2 == 8) {
			this.backSpriteID = var1.method5851();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(B)Llc;",
		garbageValue = "124"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = FloorDecoration.SpriteBuffer_getSprite(HitSplatDefinition_spritesArchive, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)Llc;",
		garbageValue = "120"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = FloorDecoration.SpriteBuffer_getSprite(HitSplatDefinition_spritesArchive, this.backSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}
}
