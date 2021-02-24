import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("HitSplatDefinition_spritesArchive")
	static AbstractArchive HitSplatDefinition_spritesArchive;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lex;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lex;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1428765275
	)
	public int field3312;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1329120235
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1633626953
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -747398397
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1355792235
	)
	public int field3316;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1028657953
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1103221155
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -369560549
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1152543359
	)
	@Export("width")
	public int width;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -784760261
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
		this.field3316 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(Lkx;B)V",
		garbageValue = "0"
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(Lkx;II)V",
		garbageValue = "-782651668"
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
			this.frontSpriteID = var1.method5833();
		} else if (var2 == 8) {
			this.backSpriteID = var1.method5833();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(I)Llm;",
		garbageValue = "1655597886"
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
				var1 = BufferedSource.SpriteBuffer_getSprite(HitSplatDefinition_spritesArchive, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(I)Llm;",
		garbageValue = "-211707789"
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
				var1 = BufferedSource.SpriteBuffer_getSprite(HitSplatDefinition_spritesArchive, this.backSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("n")
	public static double method4658(double var0, double var2, double var4) {
		double var8 = (var0 - var2) / var4;
		double var6 = Math.exp(-var8 * var8 / 2.0D) / Math.sqrt(6.283185307179586D);
		return var6 / var4;
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "-1201121058"
	)
	static final boolean method4677(int var0) {
		if (var0 < 0) {
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0];
			if (var1 >= 2000) {
				var1 -= 2000;
			}

			return var1 == 1007;
		}
	}
}
