import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	public static AbstractArchive field1658;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("HealthBarDefinition_cached")
	static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("ItemDefinition_modelArchive")
	public static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "Lcx;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1062567333
	)
	public int field1668;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1707673095
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1065530521
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -2120739271
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -114651593
	)
	public int field1666;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1513075709
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1064156991
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1238239581
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -638487751
	)
	@Export("width")
	public int width;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1381174805
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
	}

	HealthBarDefinition() {
		this.int1 = 255;
		this.int2 = 255;
		this.int3 = -1;
		this.field1666 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lop;B)V",
		garbageValue = "36"
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lop;IB)V",
		garbageValue = "119"
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
			this.frontSpriteID = var1.method6946();
		} else if (var2 == 8) {
			this.backSpriteID = var1.method6946();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "367034534"
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
				var1 = WorldMapSection0.SpriteBuffer_getSprite(field1658, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "1676501490"
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
				var1 = WorldMapSection0.SpriteBuffer_getSprite(field1658, this.backSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}
}
