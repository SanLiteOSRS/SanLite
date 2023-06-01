import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	public static AbstractArchive field1962;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("gs")
	static String field1970;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 997143673
	)
	public int field1959;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 585036195
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -362934123
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -216445993
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -830718327
	)
	public int field1964;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2042389419
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -382348375
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -385609535
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -56300383
	)
	@Export("width")
	public int width;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 2556683
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
		this.field1964 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30;
		this.widthPadding = 0; // L: 27
	} // L: 29

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "-69"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 46
			if (var2 == 0) { // L: 47
				return; // L: 50
			}

			this.decodeNext(var1, var2); // L: 48
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ltc;IB)V",
		garbageValue = "23"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 53
			var1.readUnsignedShort(); // L: 54
		} else if (var2 == 2) { // L: 56
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 57
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) { // L: 58
			this.int3 = 0;
		} else if (var2 == 5) { // L: 59
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 60
			var1.readUnsignedByte(); // L: 61
		} else if (var2 == 7) { // L: 63
			this.frontSpriteID = var1.method9095();
		} else if (var2 == 8) { // L: 64
			this.backSpriteID = var1.method9095();
		} else if (var2 == 11) { // L: 65
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 66
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 67
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 69

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ltt;",
		garbageValue = "-1850204026"
	)
	public SpritePixels method3620() {
		if (this.frontSpriteID < 0) { // L: 72
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID); // L: 73
			if (var1 != null) { // L: 74
				return var1;
			} else {
				var1 = class302.SpriteBuffer_getSprite(field1962, this.frontSpriteID, 0); // L: 75
				if (var1 != null) { // L: 76
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1; // L: 78
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Ltt;",
		garbageValue = "-1"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.backSpriteID < 0) { // L: 82
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID); // L: 83
			if (var1 != null) {
				return var1; // L: 84
			} else {
				var1 = class302.SpriteBuffer_getSprite(field1962, this.backSpriteID, 0); // L: 85
				if (var1 != null) { // L: 86
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1; // L: 88
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1619615379"
	)
	static boolean method3637(int var0, int var1) {
		return var0 != 4 || var1 < 8; // L: 26
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZB)I",
		garbageValue = "123"
	)
	static int method3628(int var0, Script var1, boolean var2) {
		return 2; // L: 5053
	}
}
