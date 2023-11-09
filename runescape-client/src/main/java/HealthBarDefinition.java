import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -70914857
	)
	public int field1994;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1864270997
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 169334753
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 468013671
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1305434313
	)
	public int field1998;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 113725845
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 626247901
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 433036111
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 398210675
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1998862717
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 15
	}

	public HealthBarDefinition() {
		this.int1 = 255; // L: 19
		this.int2 = 255; // L: 20
		this.int3 = -1; // L: 21
		this.field1998 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "-75"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 == 0) { // L: 37
				return; // L: 40
			}

			this.decodeNext(var1, var2); // L: 38
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;II)V",
		garbageValue = "1395373315"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 43
			var1.readUnsignedShort(); // L: 44
		} else if (var2 == 2) { // L: 46
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 47
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) { // L: 48
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort(); // L: 49
		} else if (var2 == 6) { // L: 50
			var1.readUnsignedByte(); // L: 51
		} else if (var2 == 7) { // L: 53
			this.frontSpriteID = var1.method9198();
		} else if (var2 == 8) { // L: 54
			this.backSpriteID = var1.method9198();
		} else if (var2 == 11) { // L: 55
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 56
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 57
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 59

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Lui;",
		garbageValue = "26"
	)
	public SpritePixels method3644() {
		if (this.frontSpriteID < 0) { // L: 62
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID); // L: 63
			if (var1 != null) {
				return var1; // L: 64
			} else {
				var1 = Tiles.SpriteBuffer_getSprite(class422.field4609, this.frontSpriteID, 0); // L: 65
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID); // L: 66
				}

				return var1; // L: 68
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lui;",
		garbageValue = "314676722"
	)
	public SpritePixels method3645() {
		if (this.backSpriteID < 0) { // L: 72
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID); // L: 73
			if (var1 != null) {
				return var1; // L: 74
			} else {
				var1 = Tiles.SpriteBuffer_getSprite(class422.field4609, this.backSpriteID, 0); // L: 75
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID); // L: 76
				}

				return var1; // L: 78
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-293165010"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63; // L: 9
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BI)Lpi;",
		garbageValue = "-1270824804"
	)
	static Font method3642(byte[] var0) {
		if (var0 == null) { // L: 166
			return null;
		} else {
			Font var1 = new Font(var0, class529.SpriteBuffer_xOffsets, class152.SpriteBuffer_yOffsets, HealthBarUpdate.SpriteBuffer_spriteWidths, SpriteMask.SpriteBuffer_spriteHeights, class505.SpriteBuffer_spritePalette, Coord.SpriteBuffer_pixels); // L: 167
			class529.SpriteBuffer_xOffsets = null; // L: 169
			class152.SpriteBuffer_yOffsets = null; // L: 170
			HealthBarUpdate.SpriteBuffer_spriteWidths = null; // L: 171
			SpriteMask.SpriteBuffer_spriteHeights = null; // L: 172
			class505.SpriteBuffer_spritePalette = null; // L: 173
			Coord.SpriteBuffer_pixels = null; // L: 174
			return var1; // L: 176
		}
	}
}
