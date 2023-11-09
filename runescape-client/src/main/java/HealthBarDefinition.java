import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	public static AbstractArchive field1947;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 758214251
	)
	public int field1946;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1872045827
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1053115535
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1554459737
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1621376523
	)
	public int field1942;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1656797509
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1047664091
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1815861979
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1796624873
	)
	@Export("width")
	public int width;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1912503923
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 15
	}

	HealthBarDefinition() {
		this.int1 = 255; // L: 19
		this.int2 = 255; // L: 20
		this.int3 = -1; // L: 21
		this.field1942 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	} // L: 29

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsy;B)V",
		garbageValue = "67"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 43
			if (var2 == 0) { // L: 44
				return; // L: 47
			}

			this.decodeNext(var1, var2); // L: 45
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsy;II)V",
		garbageValue = "-442070903"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 50
			var1.readUnsignedShort(); // L: 51
		} else if (var2 == 2) { // L: 53
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 54
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) { // L: 55
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort(); // L: 56
		} else if (var2 == 6) { // L: 57
			var1.readUnsignedByte(); // L: 58
		} else if (var2 == 7) { // L: 60
			this.frontSpriteID = var1.method8638();
		} else if (var2 == 8) { // L: 61
			this.backSpriteID = var1.method8638();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort(); // L: 62
		} else if (var2 == 14) { // L: 63
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 64
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 66

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)Lsn;",
		garbageValue = "-18194"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) { // L: 69
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID); // L: 70
			if (var1 != null) {
				return var1; // L: 71
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field1947, this.frontSpriteID, 0); // L: 72
				if (var1 != null) { // L: 73
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1; // L: 75
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Lsn;",
		garbageValue = "99"
	)
	public SpritePixels method3637() {
		if (this.backSpriteID < 0) { // L: 79
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID); // L: 80
			if (var1 != null) { // L: 81
				return var1;
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field1947, this.backSpriteID, 0); // L: 82
				if (var1 != null) { // L: 83
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1; // L: 85
			}
		}
	}
}
