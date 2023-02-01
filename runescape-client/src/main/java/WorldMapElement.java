import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[Lfm;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1016505837
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 914760617
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -211487071
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1538930309
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("r")
	@Export("name")
	public String name;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1750958439
	)
	public int field1947;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 743086435
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("g")
	public boolean field1936;
	@ObfuscatedName("i")
	public boolean field1940;
	@ObfuscatedName("o")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("n")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("k")
	int[] field1933;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -151297473
	)
	int field1941;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1016813489
	)
	int field1942;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2004701437
	)
	int field1943;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2089039459
	)
	int field1937;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("d")
	int[] field1930;
	@ObfuscatedName("y")
	byte[] field1948;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -249321649
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
		this.field1936 = true; // L: 24
		this.field1940 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1941 = Integer.MAX_VALUE; // L: 29
		this.field1942 = Integer.MAX_VALUE; // L: 30
		this.field1943 = Integer.MIN_VALUE; // L: 31
		this.field1937 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)V",
		garbageValue = "2"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqy;IB)V",
		garbageValue = "1"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 59
			this.sprite1 = var1.method8568();
		} else if (var2 == 2) { // L: 60
			this.sprite2 = var1.method8568();
		} else if (var2 == 3) { // L: 61
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 62
			this.field1947 = var1.readMedium();
		} else if (var2 == 5) { // L: 63
			var1.readMedium(); // L: 64
		} else if (var2 == 6) { // L: 66
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) { // L: 67
				var6 = var1.readUnsignedByte(); // L: 68
				if ((var6 & 1) == 0) { // L: 69
					this.field1936 = false;
				}

				if ((var6 & 2) == 2) { // L: 70
					this.field1940 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte(); // L: 73
			} else if (var2 >= 10 && var2 <= 14) { // L: 75
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 76
				var6 = var1.readUnsignedByte(); // L: 77
				this.field1933 = new int[var6 * 2]; // L: 78

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) { // L: 79
					this.field1933[var4] = var1.readShort();
				}

				var1.readInt(); // L: 80
				var4 = var1.readUnsignedByte(); // L: 81
				this.field1930 = new int[var4]; // L: 82

				int var5;
				for (var5 = 0; var5 < this.field1930.length; ++var5) { // L: 83
					this.field1930[var5] = var1.readInt();
				}

				this.field1948 = new byte[var6]; // L: 84

				for (var5 = 0; var5 < var6; ++var5) { // L: 85
					this.field1948[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) { // L: 88
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 89
					var1.method8568(); // L: 90
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
					var1.method8568(); // L: 109
				} else if (var2 == 28) { // L: 111
					var1.readUnsignedByte(); // L: 112
				} else if (var2 == 29) {
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field2010, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field2008}; // L: 117
					this.horizontalAlignment = (HorizontalAlignment)World.findEnumerated(var3, var1.readUnsignedByte()); // L: 119
				} else if (var2 == 30) { // L: 121
					VerticalAlignment[] var7 = new VerticalAlignment[]{VerticalAlignment.field2073, VerticalAlignment.field2072, VerticalAlignment.VerticalAlignment_centered}; // L: 124
					this.verticalAlignment = (VerticalAlignment)World.findEnumerated(var7, var1.readUnsignedByte()); // L: 126
				}
			}
		}

	} // L: 129

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1089817679"
	)
	public void method3554() {
		if (this.field1933 != null) { // L: 132
			for (int var1 = 0; var1 < this.field1933.length; var1 += 2) { // L: 133
				if (this.field1933[var1] < this.field1941) { // L: 134
					this.field1941 = this.field1933[var1];
				} else if (this.field1933[var1] > this.field1943) { // L: 135
					this.field1943 = this.field1933[var1];
				}

				if (this.field1933[var1 + 1] < this.field1942) { // L: 136
					this.field1942 = this.field1933[var1 + 1];
				} else if (this.field1933[var1 + 1] > this.field1937) {
					this.field1937 = this.field1933[var1 + 1]; // L: 137
				}
			}
		}

	} // L: 140

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lrx;",
		garbageValue = "-36987014"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 143
		return this.getSprite(var2); // L: 144
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lrx;",
		garbageValue = "-2019258857"
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
				var2 = class125.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 151
				if (var2 != null) { // L: 152
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 153
				}

				return var2; // L: 155
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-125"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 159
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lcb;B)V",
		garbageValue = "31"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class125.runScript(var0, 500000, 475000); // L: 113
	} // L: 114

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IB)I",
		garbageValue = "98"
	)
	public static int method3568(CharSequence var0, int var1) {
		return class318.method6373(var0, var1, true); // L: 72
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1005315742"
	)
	static final boolean method3564() {
		return ViewportMouse.ViewportMouse_isInViewport; // L: 87
	}
}
