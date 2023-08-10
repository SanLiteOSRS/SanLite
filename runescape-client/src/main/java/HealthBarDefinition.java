import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	public static AbstractArchive field1954;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -146292497
	)
	public int field1962;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1794148409
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -930913665
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1473023265
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 738432147
	)
	public int field1953;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1101954137
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 538877503
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 2132409059
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1157092495
	)
	@Export("width")
	public int width;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1512039135
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
		this.field1953 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "-1925241492"
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "-562332706"
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
			this.frontSpriteID = var1.method9152();
		} else if (var2 == 8) { // L: 49
			this.backSpriteID = var1.method9152();
		} else if (var2 == 11) { // L: 50
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 51
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 52
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 54

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)Lud;",
		garbageValue = "5771"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) { // L: 57
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID); // L: 58
			if (var1 != null) { // L: 59
				return var1;
			} else {
				var1 = WorldMap.SpriteBuffer_getSprite(field1954, this.frontSpriteID, 0); // L: 60
				if (var1 != null) { // L: 61
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1; // L: 63
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Lud;",
		garbageValue = "44"
	)
	public SpritePixels method3674() {
		if (this.backSpriteID < 0) { // L: 67
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID); // L: 68
			if (var1 != null) {
				return var1; // L: 69
			} else {
				var1 = WorldMap.SpriteBuffer_getSprite(field1954, this.backSpriteID, 0); // L: 70
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID); // L: 71
				}

				return var1; // L: 73
			}
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1108196628"
	)
	protected static final void method3672() {
		FloorUnderlayDefinition.clock.mark(); // L: 433

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 434
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 435
			GameEngine.clientTickTimes[var0] = 0L;
		}

		class313.gameCyclesToDo = 0; // L: 436
	} // L: 437
}
