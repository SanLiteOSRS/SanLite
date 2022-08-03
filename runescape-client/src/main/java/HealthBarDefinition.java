import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	public static AbstractArchive field1867;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -133294807
	)
	static int field1864;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2071720317
	)
	public int field1879;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1693646113
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 2023940309
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -593192551
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1064921901
	)
	public int field1872;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 679969197
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -896018383
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 355495379
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1723689519
	)
	@Export("width")
	public int width;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 896637811
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
		this.field1872 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "451365314"
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqw;II)V",
		garbageValue = "1666740492"
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
			this.frontSpriteID = var1.method7752();
		} else if (var2 == 8) { // L: 49
			this.backSpriteID = var1.method7752();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort(); // L: 50
		} else if (var2 == 14) { // L: 51
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 52
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 54

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Lqj;",
		garbageValue = "61"
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
				var1 = SoundSystem.SpriteBuffer_getSprite(field1867, this.frontSpriteID, 0); // L: 60
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID); // L: 61
				}

				return var1; // L: 63
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Lqj;",
		garbageValue = "-1635351520"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) { // L: 67
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID); // L: 68
			if (var1 != null) {
				return var1; // L: 69
			} else {
				var1 = SoundSystem.SpriteBuffer_getSprite(field1867, this.backSpriteID, 0); // L: 70
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqy;II)V",
		garbageValue = "-1208790636"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 71
		Players.Players_pendingUpdateCount = 0; // L: 72
		WorldMapLabelSize.method4532(var0); // L: 73
		NetCache.method5973(var0); // L: 74
		if (var0.offset - var2 != var1) { // L: 75
			throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 76
		}
	} // L: 78
}
