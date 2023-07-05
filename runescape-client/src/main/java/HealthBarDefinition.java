import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	public static AbstractArchive field1952;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1932635953
	)
	public int field1954;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1625569879
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 750422699
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 205889791
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1908977665
	)
	public int field1960;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1295532583
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1810270273
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 511268141
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1838106225
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -563933335
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
		this.field1960 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "536910502"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)V",
		garbageValue = "-2057188465"
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
		} else if (var2 == 5) { // L: 44
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 45
			var1.readUnsignedByte(); // L: 46
		} else if (var2 == 7) { // L: 48
			this.frontSpriteID = var1.method8928();
		} else if (var2 == 8) { // L: 49
			this.backSpriteID = var1.method8928();
		} else if (var2 == 11) { // L: 50
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 51
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 52
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 54

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ltm;",
		garbageValue = "-553105347"
	)
	public SpritePixels method3646() {
		if (this.frontSpriteID < 0) { // L: 57
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID); // L: 58
			if (var1 != null) {
				return var1; // L: 59
			} else {
				var1 = class107.SpriteBuffer_getSprite(field1952, this.frontSpriteID, 0); // L: 60
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID); // L: 61
				}

				return var1; // L: 63
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ltm;",
		garbageValue = "-235452519"
	)
	public SpritePixels method3647() {
		if (this.backSpriteID < 0) { // L: 67
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID); // L: 68
			if (var1 != null) {
				return var1; // L: 69
			} else {
				var1 = class107.SpriteBuffer_getSprite(field1952, this.backSpriteID, 0); // L: 70
				if (var1 != null) { // L: 71
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1; // L: 73
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnw;",
		garbageValue = "2145594899"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.PlayerType_hardcoreIronman, PlayerType.field4205, PlayerType.field4204, PlayerType.field4211, PlayerType.PlayerType_ironman, PlayerType.field4212, PlayerType.field4208, PlayerType.field4203, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_ultimateIronman, PlayerType.field4206, PlayerType.field4207, PlayerType.PlayerType_normal, PlayerType.field4202, PlayerType.field4209, PlayerType.field4213, PlayerType.PlayerType_jagexModerator}; // L: 30
	}
}
