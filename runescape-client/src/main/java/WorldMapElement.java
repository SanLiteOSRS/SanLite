import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lhd;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 269086767
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1352721151
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2111287869
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1892918285
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("aq")
	@Export("name")
	public String name;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 811916185
	)
	public int field1899;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1518317395
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("ax")
	public boolean field1909;
	@ObfuscatedName("as")
	public boolean field1918;
	@ObfuscatedName("ay")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("am")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("az")
	int[] field1906;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 953250331
	)
	int field1914;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1926223473
	)
	int field1915;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1717847263
	)
	int field1916;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1739215103
	)
	int field1917;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("aw")
	int[] field1920;
	@ObfuscatedName("aa")
	byte[] field1921;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1664643035
	)
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256); // L: 16
	}

	WorldMapElement(int var1) {
		this.sprite1 = -1; // L: 18
		this.sprite2 = -1; // L: 19
		this.textSize = 0; // L: 22
		this.field1909 = true; // L: 24
		this.field1918 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1914 = Integer.MAX_VALUE; // L: 29
		this.field1915 = Integer.MAX_VALUE; // L: 30
		this.field1916 = Integer.MIN_VALUE; // L: 31
		this.field1917 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "441973027"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 70
			if (var2 == 0) { // L: 71
				return; // L: 74
			}

			this.decodeNext(var1, var2); // L: 72
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsy;II)V",
		garbageValue = "-2127028416"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 77
			this.sprite1 = var1.method8638();
		} else if (var2 == 2) { // L: 78
			this.sprite2 = var1.method8638();
		} else if (var2 == 3) { // L: 79
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 80
			this.field1899 = var1.readMedium();
		} else if (var2 == 5) { // L: 81
			var1.readMedium(); // L: 82
		} else if (var2 == 6) { // L: 84
			this.textSize = var1.readUnsignedByte();
		} else {
			int var3;
			if (var2 == 7) { // L: 85
				var3 = var1.readUnsignedByte(); // L: 86
				if ((var3 & 1) == 0) { // L: 87
					this.field1909 = false;
				}

				if ((var3 & 2) == 2) { // L: 88
					this.field1918 = true;
				}
			} else if (var2 == 8) { // L: 90
				var1.readUnsignedByte(); // L: 91
			} else if (var2 >= 10 && var2 <= 14) { // L: 93
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 94
				var3 = var1.readUnsignedByte(); // L: 95
				this.field1906 = new int[var3 * 2]; // L: 96

				int var4;
				for (var4 = 0; var4 < var3 * 2; ++var4) { // L: 97
					this.field1906[var4] = var1.readShort();
				}

				var1.readInt(); // L: 98
				var4 = var1.readUnsignedByte(); // L: 99
				this.field1920 = new int[var4]; // L: 100

				int var5;
				for (var5 = 0; var5 < this.field1920.length; ++var5) { // L: 101
					this.field1920[var5] = var1.readInt();
				}

				this.field1921 = new byte[var3]; // L: 102

				for (var5 = 0; var5 < var3; ++var5) { // L: 103
					this.field1921[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 105
				if (var2 == 17) { // L: 106
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 107
					var1.method8638(); // L: 108
				} else if (var2 == 19) { // L: 110
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) { // L: 111
					var1.readInt(); // L: 112
				} else if (var2 == 22) { // L: 114
					var1.readInt(); // L: 115
				} else if (var2 == 23) { // L: 117
					var1.readUnsignedByte(); // L: 118
					var1.readUnsignedByte(); // L: 119
					var1.readUnsignedByte(); // L: 120
				} else if (var2 == 24) { // L: 122
					var1.readShort(); // L: 123
					var1.readShort(); // L: 124
				} else if (var2 == 25) { // L: 126
					var1.method8638(); // L: 127
				} else if (var2 == 28) { // L: 129
					var1.readUnsignedByte(); // L: 130
				} else if (var2 == 29) { // L: 132
					this.horizontalAlignment = (HorizontalAlignment)SpriteMask.findEnumerated(GrandExchangeOfferOwnWorldComparator.method1210(), var1.readUnsignedByte()); // L: 133
				} else if (var2 == 30) { // L: 135
					this.verticalAlignment = (VerticalAlignment)SpriteMask.findEnumerated(WorldMapLabelSize.method4799(), var1.readUnsignedByte()); // L: 136
				}
			}
		}

	} // L: 139

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "737649030"
	)
	void method3564() {
		if (this.field1906 != null) { // L: 142
			for (int var1 = 0; var1 < this.field1906.length; var1 += 2) { // L: 143
				if (this.field1906[var1] < this.field1914) { // L: 144
					this.field1914 = this.field1906[var1];
				} else if (this.field1906[var1] > this.field1916) { // L: 145
					this.field1916 = this.field1906[var1];
				}

				if (this.field1906[var1 + 1] < this.field1915) { // L: 146
					this.field1915 = this.field1906[var1 + 1];
				} else if (this.field1906[var1 + 1] > this.field1917) {
					this.field1917 = this.field1906[var1 + 1]; // L: 147
				}
			}
		}

	} // L: 150

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lsn;",
		garbageValue = "76"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 153
		return this.getSprite(var2); // L: 154
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsn;",
		garbageValue = "82"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) { // L: 158
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1); // L: 159
			if (var2 != null) { // L: 160
				return var2;
			} else {
				var2 = WorldMapScaleHandler.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 161
				if (var2 != null) { // L: 162
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 163
				}

				return var2; // L: 165
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "4"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 169
	}
}
