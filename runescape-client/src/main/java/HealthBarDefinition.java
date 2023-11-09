import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("tj")
	@ObfuscatedGetter(
		intValue = 1380668207
	)
	static int field1912;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("HealthBarDefinition_archive")
	static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	static AbstractArchive field1913;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1502305409
	)
	static int field1923;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -407646153
	)
	public int field1929;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1343351829
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 577688891
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1787371733
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2035054583
	)
	public int field1926;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1473771893
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1474339781
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -683499783
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 187532401
	)
	@Export("width")
	public int width;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1813140989
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 15
	}

	HealthBarDefinition() {
		this.int1 = 255; // L: 19
		this.int2 = 255; // L: 20
		this.int3 = -1; // L: 21
		this.field1926 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	} // L: 29

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqr;S)V",
		garbageValue = "255"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 48
			if (var2 == 0) { // L: 49
				return; // L: 52
			}

			this.decodeNext(var1, var2); // L: 50
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lqr;IB)V",
		garbageValue = "120"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 55
			var1.readUnsignedShort(); // L: 56
		} else if (var2 == 2) { // L: 58
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 59
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) { // L: 60
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort(); // L: 61
		} else if (var2 == 6) { // L: 62
			var1.readUnsignedByte(); // L: 63
		} else if (var2 == 7) {
			this.frontSpriteID = var1.method8422();
		} else if (var2 == 8) {
			this.backSpriteID = var1.method8422();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Lri;",
		garbageValue = "-1781859751"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) { // L: 74
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID); // L: 75
			if (var1 != null) {
				return var1; // L: 76
			} else {
				var1 = FriendsList.SpriteBuffer_getSprite(field1913, this.frontSpriteID, 0); // L: 77
				if (var1 != null) { // L: 78
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1; // L: 80
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Lri;",
		garbageValue = "119501813"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) { // L: 84
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID); // L: 85
			if (var1 != null) {
				return var1; // L: 86
			} else {
				var1 = FriendsList.SpriteBuffer_getSprite(field1913, this.backSpriteID, 0); // L: 87
				if (var1 != null) { // L: 88
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1; // L: 90
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgu;",
		garbageValue = "1"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0); // L: 65
		if (var1 != null) { // L: 66
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0); // L: 67
			var1 = new NPCComposition(); // L: 68
			var1.id = var0; // L: 69
			if (var2 != null) { // L: 70
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 71
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0); // L: 72
			return var1; // L: 73
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lri;",
		garbageValue = "329379604"
	)
	static SpritePixels method3494(int var0, int var1, int var2) {
		return (SpritePixels)WorldMapRegion.WorldMapRegion_cachedSprites.get(SpotAnimationDefinition.method3591(var0, var1, var2)); // L: 42
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-50"
	)
	public static String method3513(String var0) {
		int var1 = var0.length(); // L: 192
		char[] var2 = new char[var1]; // L: 193
		byte var3 = 2; // L: 194

		for (int var4 = 0; var4 < var1; ++var4) { // L: 195
			char var5 = var0.charAt(var4); // L: 196
			if (var3 == 0) { // L: 197
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 198
				var5 = class161.method3268(var5);
			}

			if (Character.isLetter(var5)) { // L: 199
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 200
				if (Character.isSpaceChar(var5)) { // L: 201
					if (var3 != 2) { // L: 202
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 204
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 205
		}

		return new String(var2); // L: 207
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1270280049"
	)
	static final int method3516(int var0, int var1) {
		if (var0 == -2) { // L: 1032
			return 12345678;
		} else if (var0 == -1) { // L: 1033
			if (var1 < 2) { // L: 1034
				var1 = 2;
			} else if (var1 > 126) { // L: 1035
				var1 = 126;
			}

			return var1; // L: 1036
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 1038
			if (var1 < 2) { // L: 1039
				var1 = 2;
			} else if (var1 > 126) { // L: 1040
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1041
		}
	}
}
