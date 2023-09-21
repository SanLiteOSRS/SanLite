import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	public static AbstractArchive field1979;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("cp")
	static String field1995;
	@ObfuscatedName("rn")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	@Export("Widget_cachedModels")
	static class512 Widget_cachedModels;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1253121225
	)
	public int field1982;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1079281923
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -510300189
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1274186119
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 131608857
	)
	public int field1987;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 2023454973
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2064360287
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -446698775
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1816214723
	)
	@Export("width")
	public int width;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1223811713
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(64); // L: 14
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 15
	}

	HealthBarDefinition() {
		this.int1 = 255; // L: 19
		this.int2 = 255; // L: 20
		this.int3 = -1; // L: 21
		this.field1987 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	} // L: 29

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V",
		garbageValue = "-15"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lul;II)V",
		garbageValue = "1665332626"
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
			this.frontSpriteID = var1.method9223();
		} else if (var2 == 8) { // L: 64
			this.backSpriteID = var1.method9223();
		} else if (var2 == 11) { // L: 65
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 66
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 67
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 69

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Lud;",
		garbageValue = "-1762701574"
	)
	public SpritePixels method3712() {
		if (this.frontSpriteID < 0) { // L: 72
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.frontSpriteID); // L: 73
			if (var1 != null) {
				return var1; // L: 74
			} else {
				var1 = class47.SpriteBuffer_getSprite(field1979, this.frontSpriteID, 0); // L: 75
				if (var1 != null) { // L: 76
					HitSplatDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1; // L: 78
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lud;",
		garbageValue = "665921612"
	)
	public SpritePixels method3713() {
		if (this.backSpriteID < 0) { // L: 82
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.backSpriteID); // L: 83
			if (var1 != null) {
				return var1; // L: 84
			} else {
				var1 = class47.SpriteBuffer_getSprite(field1979, this.backSpriteID, 0); // L: 85
				if (var1 != null) { // L: 86
					HitSplatDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1; // L: 88
			}
		}
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-17"
	)
	static final void method3711(int var0, int var1) {
		if (Client.hintArrowType == 2) { // L: 5351
			class150.worldToScreen(Client.field629 * 64 + (Client.field583 - class20.baseX * 64 << 7), Client.field797 * 64 + (Client.field543 - class19.baseY * 64 << 7), Client.field544 * 4); // L: 5352
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 5353
				UserComparator8.field1457[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}

		}
	} // L: 5354
}
