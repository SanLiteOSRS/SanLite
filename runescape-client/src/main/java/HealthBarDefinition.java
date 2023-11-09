import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static AbstractArchive field1859;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1123916525
	)
	public int field1862;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -958096209
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1196665505
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 355492597
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -323970275
	)
	public int field1867;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1905605681
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1024881205
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -768992371
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 477799443
	)
	@Export("width")
	public int width;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -733042589
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
		this.field1867 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "-56"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 31
			if (var2 == 0) { // L: 32
				return; // L: 35
			}

			this.decodeNext(var1, var2); // L: 33
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqr;IB)V",
		garbageValue = "93"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 38
			var1.readUnsignedShort(); // L: 39
		} else if (var2 == 2) { // L: 41
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 42
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) { // L: 43
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort(); // L: 44
		} else if (var2 == 6) { // L: 45
			var1.readUnsignedByte(); // L: 46
		} else if (var2 == 7) { // L: 48
			this.frontSpriteID = var1.method7652();
		} else if (var2 == 8) { // L: 49
			this.backSpriteID = var1.method7652();
		} else if (var2 == 11) { // L: 50
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 51
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 52
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 54

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lqn;",
		garbageValue = "204858890"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) { // L: 57
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID); // L: 58
			if (var1 != null) {
				return var1; // L: 59
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field1859, this.frontSpriteID, 0); // L: 60
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID); // L: 61
				}

				return var1; // L: 63
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Lqn;",
		garbageValue = "-89"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) { // L: 67
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID); // L: 68
			if (var1 != null) { // L: 69
				return var1;
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field1859, this.backSpriteID, 0); // L: 70
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID); // L: 71
				}

				return var1; // L: 73
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1650060963"
	)
	public static boolean method3371(int var0) {
		return (var0 >> 21 & 1) != 0; // L: 29
	}
}
