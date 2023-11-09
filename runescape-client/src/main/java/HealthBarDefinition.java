import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	static AbstractArchive field1975;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = 1053176985
	)
	static int field1989;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 683600327
	)
	public int field1983;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1073329769
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1259926695
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2123277021
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1492750821
	)
	public int field1976;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -280259539
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1047498223
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 187372523
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1356193103
	)
	@Export("width")
	public int width;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 72194099
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
		this.field1976 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)V",
		garbageValue = "72"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqy;IB)V",
		garbageValue = "-24"
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
			this.frontSpriteID = var1.method8568();
		} else if (var2 == 8) { // L: 54
			this.backSpriteID = var1.method8568();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort(); // L: 55
		} else if (var2 == 14) { // L: 56
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 57
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 59

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Lrx;",
		garbageValue = "-1477397901"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) { // L: 62
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID); // L: 63
			if (var1 != null) {
				return var1; // L: 64
			} else {
				var1 = class125.SpriteBuffer_getSprite(field1975, this.frontSpriteID, 0); // L: 65
				if (var1 != null) { // L: 66
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1; // L: 68
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Lrx;",
		garbageValue = "-2117406619"
	)
	public SpritePixels method3613() {
		if (this.backSpriteID < 0) { // L: 72
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID); // L: 73
			if (var1 != null) {
				return var1; // L: 74
			} else {
				var1 = class125.SpriteBuffer_getSprite(field1975, this.backSpriteID, 0); // L: 75
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID); // L: 76
				}

				return var1; // L: 78
			}
		}
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lkd;I)Ljava/lang/String;",
		garbageValue = "1353163423"
	)
	static String method3622(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 10851
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 10852
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 10854
					if (var3 == -1) { // L: 10855
						break;
					}

					String var4 = var0.substring(0, var3); // L: 10856
					int var6 = GraphicsObject.method2025(var1, var2 - 1); // L: 10858
					String var5;
					if (var6 < 999999999) { // L: 10860
						var5 = Integer.toString(var6); // L: 10861
					} else {
						var5 = "*"; // L: 10864
					}

					var0 = var4 + var5 + var0.substring(var3 + 2); // L: 10866
				}
			}
		}

		return var0; // L: 10870
	}
}
