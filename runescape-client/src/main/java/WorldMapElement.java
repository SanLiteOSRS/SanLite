import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -742179081
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 179602593
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1796825019
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("az")
	@Export("name")
	public String name;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1234249425
	)
	public int field1922;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1692909001
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("at")
	public boolean field1919;
	@ObfuscatedName("ah")
	public boolean field1933;
	@ObfuscatedName("ax")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("aa")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("au")
	int[] field1923;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 376504145
	)
	int field1924;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1352516433
	)
	int field1925;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 76971691
	)
	int field1929;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1247562431
	)
	int field1927;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("an")
	int[] field1917;
	@ObfuscatedName("af")
	byte[] field1931;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1716043827
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
		this.field1919 = true; // L: 24
		this.field1933 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1924 = Integer.MAX_VALUE; // L: 29
		this.field1925 = Integer.MAX_VALUE; // L: 30
		this.field1929 = Integer.MIN_VALUE; // L: 31
		this.field1927 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "-65"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lty;IB)V",
		garbageValue = "-112"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 59
			this.sprite1 = var1.method9152();
		} else if (var2 == 2) { // L: 60
			this.sprite2 = var1.method9152();
		} else if (var2 == 3) { // L: 61
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 62
			this.field1922 = var1.readMedium();
		} else if (var2 == 5) { // L: 63
			var1.readMedium(); // L: 64
		} else if (var2 == 6) { // L: 66
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) { // L: 67
				var6 = var1.readUnsignedByte(); // L: 68
				if ((var6 & 1) == 0) { // L: 69
					this.field1919 = false;
				}

				if ((var6 & 2) == 2) { // L: 70
					this.field1933 = true;
				}
			} else if (var2 == 8) { // L: 72
				var1.readUnsignedByte(); // L: 73
			} else if (var2 >= 10 && var2 <= 14) { // L: 75
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 76
				var6 = var1.readUnsignedByte(); // L: 77
				this.field1923 = new int[var6 * 2]; // L: 78

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) { // L: 79
					this.field1923[var4] = var1.readShort();
				}

				var1.readInt(); // L: 80
				var4 = var1.readUnsignedByte(); // L: 81
				this.field1917 = new int[var4]; // L: 82

				int var5;
				for (var5 = 0; var5 < this.field1917.length; ++var5) { // L: 83
					this.field1917[var5] = var1.readInt();
				}

				this.field1931 = new byte[var6]; // L: 84

				for (var5 = 0; var5 < var6; ++var5) { // L: 85
					this.field1931[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 87
				if (var2 == 17) { // L: 88
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 89
					var1.method9152(); // L: 90
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
					var1.method9152(); // L: 109
				} else if (var2 == 28) { // L: 111
					var1.readUnsignedByte(); // L: 112
				} else if (var2 == 29) { // L: 114
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1989, HorizontalAlignment.field1985}; // L: 117
					this.horizontalAlignment = (HorizontalAlignment)ClientPreferences.findEnumerated(var3, var1.readUnsignedByte()); // L: 119
				} else if (var2 == 30) { // L: 121
					this.verticalAlignment = (VerticalAlignment)ClientPreferences.findEnumerated(class425.method7863(), var1.readUnsignedByte()); // L: 122
				}
			}
		}

	} // L: 125

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1012170013"
	)
	public void method3612() {
		if (this.field1923 != null) { // L: 128
			for (int var1 = 0; var1 < this.field1923.length; var1 += 2) { // L: 129
				if (this.field1923[var1] < this.field1924) { // L: 130
					this.field1924 = this.field1923[var1];
				} else if (this.field1923[var1] > this.field1929) {
					this.field1929 = this.field1923[var1]; // L: 131
				}

				if (this.field1923[var1 + 1] < this.field1925) { // L: 132
					this.field1925 = this.field1923[var1 + 1];
				} else if (this.field1923[var1 + 1] > this.field1927) {
					this.field1927 = this.field1923[var1 + 1]; // L: 133
				}
			}
		}

	} // L: 136

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lud;",
		garbageValue = "1803263735"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 139
		return this.getSprite(var2); // L: 140
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lud;",
		garbageValue = "-858203054"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) { // L: 144
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1); // L: 145
			if (var2 != null) { // L: 146
				return var2;
			} else {
				var2 = WorldMap.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 147
				if (var2 != null) { // L: 148
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 149
				}

				return var2; // L: 151
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "119"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 155
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "-1651888504"
	)
	static Date method3625() {
		java.util.Calendar var0 = java.util.Calendar.getInstance(); // L: 1075
		var0.set(2, 0); // L: 1076
		var0.set(5, 1); // L: 1077
		var0.set(1, 1900); // L: 1078
		return var0.getTime(); // L: 1079
	}
}
