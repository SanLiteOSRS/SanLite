import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	static EvictingDualNodeHashTable field1869;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	static class335 field1877;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1659826943
	)
	public int field1870;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1405285573
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 318693701
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -583737083
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1271315221
	)
	public int field1874;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1099648425
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2045655285
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1279527771
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1392965729
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 186493939
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(64); // L: 14
		field1869 = new EvictingDualNodeHashTable(64); // L: 15
	}

	HealthBarDefinition() {
		this.int1 = 255; // L: 19
		this.int2 = 255; // L: 20
		this.int3 = -1; // L: 21
		this.field1874 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	} // L: 29

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-1942652761"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return; // L: 50
			}

			this.decodeNext(var1, var2); // L: 48
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luj;II)V",
		garbageValue = "88568767"
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
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort(); // L: 59
		} else if (var2 == 6) { // L: 60
			var1.readUnsignedByte(); // L: 61
		} else if (var2 == 7) { // L: 63
			this.frontSpriteID = var1.method9280();
		} else if (var2 == 8) { // L: 64
			this.backSpriteID = var1.method9280();
		} else if (var2 == 11) { // L: 65
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 66
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 67
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 69

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Luz;",
		garbageValue = "-309117701"
	)
	public SpritePixels method3634() {
		if (this.frontSpriteID < 0) { // L: 72
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field1869.get((long)this.frontSpriteID); // L: 73
			if (var1 != null) {
				return var1; // L: 74
			} else {
				var1 = IgnoreList.SpriteBuffer_getSprite(SecureRandomCallable.field1014, this.frontSpriteID, 0); // L: 75
				if (var1 != null) { // L: 76
					field1869.put(var1, (long)this.frontSpriteID);
				}

				return var1; // L: 78
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Luz;",
		garbageValue = "54"
	)
	public SpritePixels method3635() {
		if (this.backSpriteID < 0) { // L: 82
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field1869.get((long)this.backSpriteID); // L: 83
			if (var1 != null) { // L: 84
				return var1;
			} else {
				var1 = IgnoreList.SpriteBuffer_getSprite(SecureRandomCallable.field1014, this.backSpriteID, 0); // L: 85
				if (var1 != null) {
					field1869.put(var1, (long)this.backSpriteID); // L: 86
				}

				return var1; // L: 88
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "1872253772"
	)
	static SecureRandom method3639() {
		SecureRandom var0 = new SecureRandom(); // L: 45
		var0.nextInt(); // L: 46
		return var0; // L: 47
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-876386223"
	)
	public static void method3654() {
		try {
			JagexCache.JagexCache_dat2File.close(); // L: 343

			for (int var0 = 0; var0 < UserComparator6.idxCount; ++var0) { // L: 344
				class25.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 345
			JagexCache.JagexCache_randomDat.close(); // L: 346
		} catch (Exception var2) { // L: 348
		}

	} // L: 349
}
