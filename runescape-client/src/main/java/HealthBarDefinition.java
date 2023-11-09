import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	public static AbstractArchive field1960;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -431598869
	)
	public int field1959;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 520914669
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1525821745
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -471494485
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 294055185
	)
	public int field1971;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -407931959
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1930644535
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1451871987
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 279738407
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2064168457
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
		this.int3 = -1;
		this.field1971 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsg;B)V",
		garbageValue = "39"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 31
			if (var2 == 0) {
				return; // L: 35
			}

			this.decodeNext(var1, var2); // L: 33
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lsg;IB)V",
		garbageValue = "-52"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
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
			this.frontSpriteID = var1.method9108();
		} else if (var2 == 8) { // L: 49
			this.backSpriteID = var1.method9108();
		} else if (var2 == 11) { // L: 50
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 51
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 52
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 54

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Ltq;",
		garbageValue = "9"
	)
	public SpritePixels method3714() {
		if (this.frontSpriteID < 0) { // L: 57
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.frontSpriteID); // L: 58
			if (var1 != null) {
				return var1; // L: 59
			} else {
				var1 = class484.SpriteBuffer_getSprite(field1960, this.frontSpriteID, 0); // L: 60
				if (var1 != null) { // L: 61
					HitSplatDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1; // L: 63
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ltq;",
		garbageValue = "-540655090"
	)
	public SpritePixels method3713() {
		if (this.backSpriteID < 0) { // L: 67
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.backSpriteID); // L: 68
			if (var1 != null) { // L: 69
				return var1;
			} else {
				var1 = class484.SpriteBuffer_getSprite(field1960, this.backSpriteID, 0); // L: 70
				if (var1 != null) { // L: 71
					HitSplatDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1; // L: 73
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "2040236777"
	)
	public static byte[] method3729(Object var0, boolean var1) {
		if (var0 == null) { // L: 21
			return null;
		} else if (var0 instanceof byte[]) { // L: 22
			byte[] var6 = (byte[])((byte[])var0); // L: 23
			if (var1) { // L: 24
				int var4 = var6.length; // L: 27
				byte[] var5 = new byte[var4]; // L: 28
				System.arraycopy(var6, 0, var5, 0, var4); // L: 29
				return var5; // L: 32
			} else {
				return var6; // L: 34
			}
		} else if (var0 instanceof AbstractByteArrayCopier) { // L: 36
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0; // L: 37
			return var2.get(); // L: 38
		} else {
			throw new IllegalArgumentException(); // L: 40
		}
	}
}
