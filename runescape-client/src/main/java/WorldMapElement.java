import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("uv")
	@ObfuscatedGetter(
		intValue = 942361787
	)
	static int field1937;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lhw;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("WorldMapElement_cachedSprites")
	static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 219774827
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1458003089
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2035390535
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("al")
	@Export("name")
	public String name;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1080412371
	)
	public int field1917;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 952315347
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("ao")
	public boolean field1923;
	@ObfuscatedName("ax")
	public boolean field1925;
	@ObfuscatedName("ai")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ag")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("ah")
	int[] field1913;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2140325741
	)
	int field1933;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1117233973
	)
	int field1924;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1897586587
	)
	int field1930;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2068879661
	)
	int field1931;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("az")
	int[] field1934;
	@ObfuscatedName("ad")
	byte[] field1935;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -461862935
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
		this.field1923 = true; // L: 24
		this.field1925 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1933 = Integer.MAX_VALUE; // L: 29
		this.field1924 = Integer.MAX_VALUE; // L: 30
		this.field1930 = Integer.MIN_VALUE; // L: 31
		this.field1931 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "-1056093346"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsg;II)V",
		garbageValue = "1073520708"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 77
			this.sprite1 = var1.method9108();
		} else if (var2 == 2) { // L: 78
			this.sprite2 = var1.method9108();
		} else if (var2 == 3) { // L: 79
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 80
			this.field1917 = var1.readMedium();
		} else if (var2 == 5) { // L: 81
			var1.readMedium(); // L: 82
		} else if (var2 == 6) { // L: 84
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) { // L: 85
				var6 = var1.readUnsignedByte(); // L: 86
				if ((var6 & 1) == 0) { // L: 87
					this.field1923 = false;
				}

				if ((var6 & 2) == 2) { // L: 88
					this.field1925 = true;
				}
			} else if (var2 == 8) { // L: 90
				var1.readUnsignedByte(); // L: 91
			} else if (var2 >= 10 && var2 <= 14) { // L: 93
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 94
				var6 = var1.readUnsignedByte(); // L: 95
				this.field1913 = new int[var6 * 2]; // L: 96

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) { // L: 97
					this.field1913[var4] = var1.readShort();
				}

				var1.readInt(); // L: 98
				var4 = var1.readUnsignedByte(); // L: 99
				this.field1934 = new int[var4]; // L: 100

				int var5;
				for (var5 = 0; var5 < this.field1934.length; ++var5) { // L: 101
					this.field1934[var5] = var1.readInt();
				}

				this.field1935 = new byte[var6]; // L: 102

				for (var5 = 0; var5 < var6; ++var5) { // L: 103
					this.field1935[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 105
				if (var2 == 17) { // L: 106
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 107
					var1.method9108(); // L: 108
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
					var1.method9108(); // L: 127
				} else if (var2 == 28) { // L: 129
					var1.readUnsignedByte(); // L: 130
				} else if (var2 == 29) { // L: 132
					this.horizontalAlignment = (HorizontalAlignment)StructComposition.findEnumerated(class473.method8839(), var1.readUnsignedByte()); // L: 133
				} else if (var2 == 30) { // L: 135
					VerticalAlignment[] var3 = new VerticalAlignment[]{VerticalAlignment.field2054, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2059}; // L: 138
					this.verticalAlignment = (VerticalAlignment)StructComposition.findEnumerated(var3, var1.readUnsignedByte()); // L: 140
				}
			}
		}

	} // L: 143

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "262144"
	)
	void method3659() {
		if (this.field1913 != null) { // L: 146
			for (int var1 = 0; var1 < this.field1913.length; var1 += 2) { // L: 147
				if (this.field1913[var1] < this.field1933) { // L: 148
					this.field1933 = this.field1913[var1];
				} else if (this.field1913[var1] > this.field1930) { // L: 149
					this.field1930 = this.field1913[var1];
				}

				if (this.field1913[var1 + 1] < this.field1924) { // L: 150
					this.field1924 = this.field1913[var1 + 1];
				} else if (this.field1913[var1 + 1] > this.field1931) {
					this.field1931 = this.field1913[var1 + 1]; // L: 151
				}
			}
		}

	} // L: 154

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZI)Ltq;",
		garbageValue = "-16711936"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 157
		return this.getSprite(var2); // L: 158
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Ltq;",
		garbageValue = "685104861"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) { // L: 162
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1); // L: 163
			if (var2 != null) { // L: 164
				return var2;
			} else {
				var2 = class484.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 165
				if (var2 != null) { // L: 166
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 167
				}

				return var2; // L: 169
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "557788055"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 173
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static final void method3662() {
		if (ItemContainer.field1024) { // L: 3550
			for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 3552
				Player var1 = Client.players[Players.Players_indices[var0]]; // L: 3553
				var1.method2296(); // L: 3554
			}

			ItemContainer.field1024 = false; // L: 3557
		}

	} // L: 3559
}
