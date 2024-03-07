import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lgv;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -691696597
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("Ignored_cached")
	static EvictingDualNodeHashTable Ignored_cached;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2072628321
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 136196307
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -191734477
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("az")
	@Export("name")
	public String name;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1726711249
	)
	public int field1873;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -982771965
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("ah")
	public boolean field1867;
	@ObfuscatedName("aj")
	public boolean field1876;
	@ObfuscatedName("af")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ax")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("an")
	int[] field1878;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 438515125
	)
	int field1880;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -731494081
	)
	int field1881;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 244407737
	)
	int field1882;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1270222061
	)
	int field1883;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("ac")
	int[] field1886;
	@ObfuscatedName("ab")
	byte[] field1865;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1542604189
	)
	@Export("category")
	public int category;

	static {
		Ignored_cached = new EvictingDualNodeHashTable(256); // L: 16
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1; // L: 18
		this.sprite2 = -1; // L: 19
		this.textSize = 0; // L: 22
		this.field1867 = true; // L: 24
		this.field1876 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1880 = Integer.MAX_VALUE; // L: 29
		this.field1881 = Integer.MAX_VALUE; // L: 30
		this.field1882 = Integer.MIN_VALUE; // L: 31
		this.field1883 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-1667648408"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;IS)V",
		garbageValue = "-3153"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 59
			this.sprite1 = var1.method9693();
		} else if (var2 == 2) { // L: 60
			this.sprite2 = var1.method9693();
		} else if (var2 == 3) { // L: 61
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 62
			this.field1873 = var1.readMedium();
		} else if (var2 == 5) { // L: 63
			var1.readMedium(); // L: 64
		} else if (var2 == 6) { // L: 66
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) { // L: 67
				var6 = var1.readUnsignedByte(); // L: 68
				if ((var6 & 1) == 0) { // L: 69
					this.field1867 = false;
				}

				if ((var6 & 2) == 2) { // L: 70
					this.field1876 = true;
				}
			} else if (var2 == 8) { // L: 72
				var1.readUnsignedByte(); // L: 73
			} else if (var2 >= 10 && var2 <= 14) { // L: 75
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 76
				var6 = var1.readUnsignedByte(); // L: 77
				this.field1878 = new int[var6 * 2]; // L: 78

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) { // L: 79
					this.field1878[var4] = var1.readShort();
				}

				var1.readInt(); // L: 80
				var4 = var1.readUnsignedByte(); // L: 81
				this.field1886 = new int[var4]; // L: 82

				int var5;
				for (var5 = 0; var5 < this.field1886.length; ++var5) { // L: 83
					this.field1886[var5] = var1.readInt();
				}

				this.field1865 = new byte[var6]; // L: 84

				for (var5 = 0; var5 < var6; ++var5) { // L: 85
					this.field1865[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 87
				if (var2 == 17) { // L: 88
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 89
					var1.method9693(); // L: 90
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
					var1.method9693(); // L: 109
				} else if (var2 == 28) { // L: 111
					var1.readUnsignedByte(); // L: 112
				} else if (var2 == 29) { // L: 114
					this.horizontalAlignment = (HorizontalAlignment)class356.findEnumerated(ObjectSound.method1953(), var1.readUnsignedByte()); // L: 115
				} else if (var2 == 30) { // L: 117
					VerticalAlignment[] var3 = new VerticalAlignment[]{VerticalAlignment.field2015, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2019}; // L: 120
					this.verticalAlignment = (VerticalAlignment)class356.findEnumerated(var3, var1.readUnsignedByte()); // L: 122
				}
			}
		}

	} // L: 125

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1766481744"
	)
	public void method3590() {
		if (this.field1878 != null) { // L: 128
			for (int var1 = 0; var1 < this.field1878.length; var1 += 2) { // L: 129
				if (this.field1878[var1] < this.field1880) { // L: 130
					this.field1880 = this.field1878[var1];
				} else if (this.field1878[var1] > this.field1882) { // L: 131
					this.field1882 = this.field1878[var1];
				}

				if (this.field1878[var1 + 1] < this.field1881) { // L: 132
					this.field1881 = this.field1878[var1 + 1];
				} else if (this.field1878[var1 + 1] > this.field1883) {
					this.field1883 = this.field1878[var1 + 1]; // L: 133
				}
			}
		}

	} // L: 136

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lvd;",
		garbageValue = "-28"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 139
		return this.getSprite(var2); // L: 140
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)Lvd;",
		garbageValue = "-21"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) { // L: 144
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)Ignored_cached.get((long)var1); // L: 145
			if (var2 != null) { // L: 146
				return var2;
			} else {
				var2 = FileSystem.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 147
				if (var2 != null) { // L: 148
					Ignored_cached.put(var2, (long)var1); // L: 149
				}

				return var2; // L: 151
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1080881820"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 155
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lng;III)V",
		garbageValue = "140980928"
	)
	public static void method3580(Widget var0, int var1, int var2) {
		PlayerComposition var3 = var0.field3774; // L: 991
		boolean var4 = var2 != var3.field3665; // L: 992
		var3.field3665 = var2; // L: 993
		if (var4) { // L: 994
			int var5;
			int var6;
			if (var3.field3665 == var1) { // L: 995
				for (var5 = 0; var5 < PlayerComposition.equipmentIndices.length; ++var5) { // L: 996
					var6 = PlayerComposition.equipmentIndices[var5]; // L: 997
					if (var3.equipment[var6] > 0 && var3.equipment[var6] < 512) { // L: 998
						var3.equipment[var6] = var3.field3666[var6]; // L: 999
					}
				}
			} else {
				if (var3.equipment[0] < 512 || WorldMapLabel.method5041(var3)) { // L: 1004
					var3.equipment[class207.field2280.field2289] = 1; // L: 1005
				}

				for (var5 = 0; var5 < 7; ++var5) { // L: 1007
					var6 = PlayerComposition.equipmentIndices[var5]; // L: 1008
					if (var3.equipment[var6] > 0 && var3.equipment[var6] < 512) { // L: 1009
						int[] var7 = var3.equipment; // L: 1010

						for (int var8 = 0; var8 < KitDefinition.field1894; ++var8) { // L: 1012
							KitDefinition var9 = GrandExchangeOfferWorldComparator.KitDefinition_get(var8); // L: 1013
							if (var9 != null && !var9.nonSelectable && var9.bodypartID == var5 + (var2 == 1 ? 7 : 0)) { // L: 1014
								var7[PlayerComposition.equipmentIndices[var5]] = var8 + 256; // L: 1015
								break; // L: 1016
							}
						}
					}
				}
			}
		}

		var3.method6477(); // L: 1024
	} // L: 1025
}
