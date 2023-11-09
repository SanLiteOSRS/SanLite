import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lht;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1498609815
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -961459711
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1394980627
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("ak")
	@Export("name")
	public String name;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 907418181
	)
	public int field1909;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 943944433
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("aa")
	public boolean field1912;
	@ObfuscatedName("aj")
	public boolean field1908;
	@ObfuscatedName("ad")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ac")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("ag")
	int[] field1920;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 189601575
	)
	int field1921;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1285420045
	)
	int field1918;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2073371107
	)
	int field1923;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1725539649
	)
	int field1924;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("aw")
	int[] field1927;
	@ObfuscatedName("ay")
	byte[] field1928;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1662338059
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
		this.field1912 = true; // L: 24
		this.field1908 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1921 = Integer.MAX_VALUE; // L: 29
		this.field1918 = Integer.MAX_VALUE; // L: 30
		this.field1923 = Integer.MIN_VALUE; // L: 31
		this.field1924 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "-70"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)V",
		garbageValue = "1492165512"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 77
			this.sprite1 = var1.method8928();
		} else if (var2 == 2) { // L: 78
			this.sprite2 = var1.method8928();
		} else if (var2 == 3) { // L: 79
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 80
			this.field1909 = var1.readMedium();
		} else if (var2 == 5) { // L: 81
			var1.readMedium(); // L: 82
		} else if (var2 == 6) { // L: 84
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) { // L: 85
				var6 = var1.readUnsignedByte(); // L: 86
				if ((var6 & 1) == 0) { // L: 87
					this.field1912 = false;
				}

				if ((var6 & 2) == 2) { // L: 88
					this.field1908 = true;
				}
			} else if (var2 == 8) { // L: 90
				var1.readUnsignedByte(); // L: 91
			} else if (var2 >= 10 && var2 <= 14) { // L: 93
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 94
				var6 = var1.readUnsignedByte(); // L: 95
				this.field1920 = new int[var6 * 2]; // L: 96

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) { // L: 97
					this.field1920[var4] = var1.readShort();
				}

				var1.readInt(); // L: 98
				var4 = var1.readUnsignedByte(); // L: 99
				this.field1927 = new int[var4]; // L: 100

				int var5;
				for (var5 = 0; var5 < this.field1927.length; ++var5) { // L: 101
					this.field1927[var5] = var1.readInt();
				}

				this.field1928 = new byte[var6]; // L: 102

				for (var5 = 0; var5 < var6; ++var5) { // L: 103
					this.field1928[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 105
				if (var2 == 17) { // L: 106
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 107
					var1.method8928(); // L: 108
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
					var1.method8928(); // L: 127
				} else if (var2 == 28) { // L: 129
					var1.readUnsignedByte(); // L: 130
				} else if (var2 == 29) { // L: 132
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field1981, HorizontalAlignment.field1982, HorizontalAlignment.HorizontalAlignment_centered}; // L: 135
					this.horizontalAlignment = (HorizontalAlignment)GameObject.findEnumerated(var3, var1.readUnsignedByte()); // L: 137
				} else if (var2 == 30) { // L: 139
					VerticalAlignment[] var7 = new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2043, VerticalAlignment.field2045}; // L: 142
					this.verticalAlignment = (VerticalAlignment)GameObject.findEnumerated(var7, var1.readUnsignedByte()); // L: 144
				}
			}
		}

	} // L: 147

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2112078621"
	)
	void method3591() {
		if (this.field1920 != null) { // L: 150
			for (int var1 = 0; var1 < this.field1920.length; var1 += 2) { // L: 151
				if (this.field1920[var1] < this.field1921) { // L: 152
					this.field1921 = this.field1920[var1];
				} else if (this.field1920[var1] > this.field1923) {
					this.field1923 = this.field1920[var1]; // L: 153
				}

				if (this.field1920[var1 + 1] < this.field1918) { // L: 154
					this.field1918 = this.field1920[var1 + 1];
				} else if (this.field1920[var1 + 1] > this.field1924) {
					this.field1924 = this.field1920[var1 + 1]; // L: 155
				}
			}
		}

	} // L: 158

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZI)Ltm;",
		garbageValue = "1127460703"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 161
		return this.getSprite(var2); // L: 162
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Ltm;",
		garbageValue = "1995009325"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) { // L: 166
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1); // L: 167
			if (var2 != null) { // L: 168
				return var2;
			} else {
				var2 = class107.SpriteBuffer_getSprite(class410.WorldMapElement_archive, var1, 0); // L: 169
				if (var2 != null) { // L: 170
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 171
				}

				return var2; // L: 173
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2095862653"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 177
	}
}
