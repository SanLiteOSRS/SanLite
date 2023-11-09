import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lhd;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 765233789
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	static Archive field1964;
	@ObfuscatedName("uc")
	@ObfuscatedGetter(
		intValue = -1416850481
	)
	static int field1963;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1499586763
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -479011781
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 343394291
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("ap")
	@Export("name")
	public String name;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1599883025
	)
	public int field1953;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 103070733
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("aq")
	public boolean field1949;
	@ObfuscatedName("al")
	public boolean field1950;
	@ObfuscatedName("an")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ar")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("ab")
	int[] field1958;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1767195037
	)
	int field1939;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 309205389
	)
	int field1955;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1237088721
	)
	int field1954;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -242464383
	)
	int field1957;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("aj")
	int[] field1956;
	@ObfuscatedName("av")
	byte[] field1960;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 225792989
	)
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256); // L: 16
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1; // L: 18
		this.sprite2 = -1; // L: 19
		this.textSize = 0; // L: 22
		this.field1949 = true; // L: 24
		this.field1950 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1939 = Integer.MAX_VALUE; // L: 29
		this.field1955 = Integer.MAX_VALUE; // L: 30
		this.field1954 = Integer.MIN_VALUE; // L: 31
		this.field1957 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "332990063"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 52
			if (var2 == 0) { // L: 53
				return; // L: 56
			}

			this.decodeNext(var1, var2); // L: 54
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;II)V",
		garbageValue = "675267888"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 59
			this.sprite1 = var1.method9198();
		} else if (var2 == 2) { // L: 60
			this.sprite2 = var1.method9198();
		} else if (var2 == 3) { // L: 61
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 62
			this.field1953 = var1.readMedium();
		} else if (var2 == 5) { // L: 63
			var1.readMedium(); // L: 64
		} else if (var2 == 6) { // L: 66
			this.textSize = var1.readUnsignedByte();
		} else {
			int var3;
			if (var2 == 7) { // L: 67
				var3 = var1.readUnsignedByte(); // L: 68
				if ((var3 & 1) == 0) { // L: 69
					this.field1949 = false;
				}

				if ((var3 & 2) == 2) { // L: 70
					this.field1950 = true;
				}
			} else if (var2 == 8) { // L: 72
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var3 = var1.readUnsignedByte();
				this.field1958 = new int[var3 * 2];

				int var4;
				for (var4 = 0; var4 < var3 * 2; ++var4) {
					this.field1958[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1956 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field1956.length; ++var5) { // L: 83
					this.field1956[var5] = var1.readInt();
				}

				this.field1960 = new byte[var3];

				for (var5 = 0; var5 < var3; ++var5) {
					this.field1960[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 87
				if (var2 == 17) { // L: 88
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 89
					var1.method9198(); // L: 90
				} else if (var2 == 19) { // L: 92
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) { // L: 93
					var1.readInt(); // L: 94
				} else if (var2 == 22) { // L: 96
					var1.readInt(); // L: 97
				} else if (var2 == 23) { // L: 99
					var1.readUnsignedByte(); // L: 100
					var1.readUnsignedByte(); // L: 101
					var1.readUnsignedByte(); // L: 102
				} else if (var2 == 24) { // L: 104
					var1.readShort(); // L: 105
					var1.readShort(); // L: 106
				} else if (var2 == 25) { // L: 108
					var1.method9198(); // L: 109
				} else if (var2 == 28) { // L: 111
					var1.readUnsignedByte(); // L: 112
				} else if (var2 == 29) { // L: 114
					this.horizontalAlignment = (HorizontalAlignment)class25.findEnumerated(class113.method2844(), var1.readUnsignedByte()); // L: 115
				} else if (var2 == 30) { // L: 117
					this.verticalAlignment = (VerticalAlignment)class25.findEnumerated(Tiles.method2244(), var1.readUnsignedByte()); // L: 118
				}
			}
		}

	} // L: 121

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-79"
	)
	public void method3580() {
		if (this.field1958 != null) { // L: 124
			for (int var1 = 0; var1 < this.field1958.length; var1 += 2) { // L: 125
				if (this.field1958[var1] < this.field1939) { // L: 126
					this.field1939 = this.field1958[var1];
				} else if (this.field1958[var1] > this.field1954) { // L: 127
					this.field1954 = this.field1958[var1];
				}

				if (this.field1958[var1 + 1] < this.field1955) { // L: 128
					this.field1955 = this.field1958[var1 + 1];
				} else if (this.field1958[var1 + 1] > this.field1957) {
					this.field1957 = this.field1958[var1 + 1]; // L: 129
				}
			}
		}

	} // L: 132

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lui;",
		garbageValue = "0"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Lui;",
		garbageValue = "-54"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) { // L: 140
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1); // L: 141
			if (var2 != null) { // L: 142
				return var2;
			} else {
				var2 = Tiles.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 143
				if (var2 != null) { // L: 144
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 145
				}

				return var2; // L: 147
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1172107767"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 151
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhv;",
		garbageValue = "-69"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0); // L: 73
		if (var1 != null) { // L: 74
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0); // L: 75
			var1 = new ObjectComposition(); // L: 76
			var1.id = var0; // L: 77
			if (var2 != null) { // L: 78
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 79
			if (var1.isSolid) { // L: 80
				var1.interactType = 0; // L: 81
				var1.boolean1 = false; // L: 82
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0); // L: 84
			return var1; // L: 85
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "1376332394"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 133
		int var2 = 0; // L: 134

		for (int var3 = 0; var3 < var1; ++var3) { // L: 135
			var2 = (var2 << 5) - var2 + class348.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 136
	}
}
