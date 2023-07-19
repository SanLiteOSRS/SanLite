import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	public static AbstractArchive field1975;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -888239257
	)
	public int field1970;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1588818577
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1420148671
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -202023633
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1845174669
	)
	public int field1972;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 920092769
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 749668757
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -875561583
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 978518619
	)
	@Export("width")
	public int width;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1072519573
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 15
	}

	public HealthBarDefinition() {
		this.int1 = 255; // L: 19
		this.int2 = 255; // L: 20
		this.int3 = -1; // L: 21
		this.field1972 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "443599271"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ltl;IB)V",
		garbageValue = "-67"
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
			this.frontSpriteID = var1.method9077();
		} else if (var2 == 8) { // L: 49
			this.backSpriteID = var1.method9077();
		} else if (var2 == 11) { // L: 50
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 51
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 52
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 54

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Luq;",
		garbageValue = "1228754414"
	)
	public SpritePixels method3760() {
		if (this.frontSpriteID < 0) { // L: 57
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.frontSpriteID); // L: 58
			if (var1 != null) {
				return var1; // L: 59
			} else {
				var1 = LoginType.SpriteBuffer_getSprite(field1975, this.frontSpriteID, 0); // L: 60
				if (var1 != null) { // L: 61
					HitSplatDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1; // L: 63
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Luq;",
		garbageValue = "-1257333978"
	)
	public SpritePixels method3761() {
		if (this.backSpriteID < 0) { // L: 67
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.backSpriteID); // L: 68
			if (var1 != null) {
				return var1; // L: 69
			} else {
				var1 = LoginType.SpriteBuffer_getSprite(field1975, this.backSpriteID, 0); // L: 70
				if (var1 != null) { // L: 71
					HitSplatDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1; // L: 73
			}
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILme;IIIII[FI)Lme;",
		garbageValue = "-1601809110"
	)
	static Widget method3777(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget(); // L: 844
		var8.type = var0; // L: 845
		var8.parentId = var1.id; // L: 846
		var8.childIndex = var2; // L: 847
		var8.isIf3 = true; // L: 848
		var8.xAlignment = var3; // L: 849
		var8.yAlignment = var4; // L: 850
		var8.widthAlignment = var5; // L: 851
		var8.heightAlignment = var6; // L: 852
		var8.rawX = (int)((float)var1.width * var7[0]); // L: 853
		var8.rawY = (int)(var7[1] * (float)var1.height); // L: 854
		var8.rawWidth = (int)(var7[2] * (float)var1.width); // L: 855
		var8.rawHeight = (int)((float)var1.height * var7[3]); // L: 856
		return var8; // L: 857
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "593534709"
	)
	static void method3776(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) { // L: 12660
			if ((long)var0 == (var1.key >> 48 & 65535L)) { // L: 12661
				var1.remove(); // L: 12662
			}
		}

	} // L: 12665
}
