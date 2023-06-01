import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("WorldMapElement_cachedSprites")
	static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -73503751
	)
	static int field1933;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -501266159
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 936337161
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1426600699
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("aj")
	@Export("name")
	public String name;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -356439313
	)
	public int field1919;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2142583779
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("aw")
	public boolean field1921;
	@ObfuscatedName("ae")
	public boolean field1914;
	@ObfuscatedName("ah")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ap")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("as")
	int[] field1925;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -865321247
	)
	int field1926;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 399429587
	)
	int field1927;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1700217549
	)
	int field1928;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 592620185
	)
	int field1922;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("ak")
	int[] field1935;
	@ObfuscatedName("aa")
	byte[] field1918;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -911095353
	)
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256); // L: 16
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1; // L: 18
		this.sprite2 = -1; // L: 19
		this.textSize = 0;
		this.field1921 = true;
		this.field1914 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1926 = Integer.MAX_VALUE; // L: 29
		this.field1927 = Integer.MAX_VALUE; // L: 30
		this.field1928 = Integer.MIN_VALUE; // L: 31
		this.field1922 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1;
	} // L: 41

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)V",
		garbageValue = "-1261472515"
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
		descriptor = "(Ltc;II)V",
		garbageValue = "447359753"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 59
			this.sprite1 = var1.method9095();
		} else if (var2 == 2) { // L: 60
			this.sprite2 = var1.method9095();
		} else if (var2 == 3) { // L: 61
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 62
			this.field1919 = var1.readMedium();
		} else if (var2 == 5) { // L: 63
			var1.readMedium(); // L: 64
		} else if (var2 == 6) { // L: 66
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) { // L: 67
				var6 = var1.readUnsignedByte(); // L: 68
				if ((var6 & 1) == 0) { // L: 69
					this.field1921 = false;
				}

				if ((var6 & 2) == 2) { // L: 70
					this.field1914 = true;
				}
			} else if (var2 == 8) { // L: 72
				var1.readUnsignedByte(); // L: 73
			} else if (var2 >= 10 && var2 <= 14) { // L: 75
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 76
				var6 = var1.readUnsignedByte(); // L: 77
				this.field1925 = new int[var6 * 2]; // L: 78

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) { // L: 79
					this.field1925[var4] = var1.readShort();
				}

				var1.readInt(); // L: 80
				var4 = var1.readUnsignedByte(); // L: 81
				this.field1935 = new int[var4]; // L: 82

				int var5;
				for (var5 = 0; var5 < this.field1935.length; ++var5) { // L: 83
					this.field1935[var5] = var1.readInt();
				}

				this.field1918 = new byte[var6]; // L: 84

				for (var5 = 0; var5 < var6; ++var5) { // L: 85
					this.field1918[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 87
				if (var2 == 17) { // L: 88
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 89
					var1.method9095(); // L: 90
				} else if (var2 == 19) { // L: 92
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) { // L: 93
					var1.readInt(); // L: 94
				} else if (var2 == 22) {
					var1.readInt();
				} else if (var2 == 23) { // L: 99
					var1.readUnsignedByte();
					var1.readUnsignedByte();
					var1.readUnsignedByte();
				} else if (var2 == 24) {
					var1.readShort();
					var1.readShort();
				} else if (var2 == 25) {
					var1.method9095();
				} else if (var2 == 28) { // L: 111
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field1989, HorizontalAlignment.field1991, HorizontalAlignment.HorizontalAlignment_centered}; // L: 117
					this.horizontalAlignment = (HorizontalAlignment)class217.findEnumerated(var3, var1.readUnsignedByte()); // L: 119
				} else if (var2 == 30) { // L: 121
					VerticalAlignment[] var7 = new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2056, VerticalAlignment.field2053}; // L: 124
					this.verticalAlignment = (VerticalAlignment)class217.findEnumerated(var7, var1.readUnsignedByte()); // L: 126
				}
			}
		}

	} // L: 129

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "121"
	)
	public void method3568() {
		if (this.field1925 != null) { // L: 132
			for (int var1 = 0; var1 < this.field1925.length; var1 += 2) { // L: 133
				if (this.field1925[var1] < this.field1926) { // L: 134
					this.field1926 = this.field1925[var1];
				} else if (this.field1925[var1] > this.field1928) { // L: 135
					this.field1928 = this.field1925[var1];
				}

				if (this.field1925[var1 + 1] < this.field1927) { // L: 136
					this.field1927 = this.field1925[var1 + 1];
				} else if (this.field1925[var1 + 1] > this.field1922) {
					this.field1922 = this.field1925[var1 + 1]; // L: 137
				}
			}
		}

	} // L: 140

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)Ltt;",
		garbageValue = "-1226707575"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 143
		return this.getSprite(var2); // L: 144
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Ltt;",
		garbageValue = "-1576629744"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) { // L: 148
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1); // L: 149
			if (var2 != null) { // L: 150
				return var2;
			} else {
				var2 = class302.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 151
				if (var2 != null) { // L: 152
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 153
				}

				return var2; // L: 155
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1266337753"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 159
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-104"
	)
	static void method3586(int var0) {
		class386.field4414 = var0; // L: 21
		class438.field4693 = new class438[var0]; // L: 22
		class438.field4697 = 0; // L: 23
	} // L: 24

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "17"
	)
	public static int method3585(int var0) {
		return class302.field3374[var0]; // L: 40
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-2"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4498) { // L: 96
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 97
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4503) { // L: 100
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0; // L: 101
		} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4492) { // L: 104
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0; // L: 105
		} else if (var0.length == 30000 && ByteArrayPool.field4497 < ByteArrayPool.field4501) { // L: 108
			ByteArrayPool.field4505[++ByteArrayPool.field4497 - 1] = var0; // L: 109
		} else {
			if (class134.ByteArrayPool_arrays != null) { // L: 112
				for (int var1 = 0; var1 < ChatChannel.ByteArrayPool_alternativeSizes.length; ++var1) { // L: 113
					if (var0.length == ChatChannel.ByteArrayPool_alternativeSizes[var1] && class306.ByteArrayPool_altSizeArrayCounts[var1] < class134.ByteArrayPool_arrays[var1].length) { // L: 114
						class134.ByteArrayPool_arrays[var1][class306.ByteArrayPool_altSizeArrayCounts[var1]++] = var0; // L: 115
						return; // L: 116
					}
				}
			}

		}
	} // L: 98 102 106 110 120
}
