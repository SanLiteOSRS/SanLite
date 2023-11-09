import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Lfd;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1161109167
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("WorldMapElement_cachedSprites")
	static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 2052373877
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1983314433
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 748178793
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("d")
	@Export("name")
	public String name;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1680634377
	)
	public int field1883;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1651551537
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("s")
	public boolean field1879;
	@ObfuscatedName("p")
	public boolean field1871;
	@ObfuscatedName("b")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("o")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("u")
	int[] field1882;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1739407459
	)
	int field1887;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 778653995
	)
	int field1888;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1785500701
	)
	int field1873;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1428519697
	)
	int field1890;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("e")
	int[] field1893;
	@ObfuscatedName("g")
	byte[] field1894;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -797897937
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
		this.field1879 = true; // L: 24
		this.field1871 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1887 = Integer.MAX_VALUE; // L: 29
		this.field1888 = Integer.MAX_VALUE; // L: 30
		this.field1873 = Integer.MIN_VALUE; // L: 31
		this.field1890 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-1372723798"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return; // L: 56
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "1480478308"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.method8422();
		} else if (var2 == 2) { // L: 60
			this.sprite2 = var1.method8422();
		} else if (var2 == 3) { // L: 61
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 62
			this.field1883 = var1.readMedium();
		} else if (var2 == 5) { // L: 63
			var1.readMedium(); // L: 64
		} else if (var2 == 6) { // L: 66
			this.textSize = var1.readUnsignedByte();
		} else {
			int var3;
			if (var2 == 7) { // L: 67
				var3 = var1.readUnsignedByte(); // L: 68
				if ((var3 & 1) == 0) { // L: 69
					this.field1879 = false;
				}

				if ((var3 & 2) == 2) { // L: 70
					this.field1871 = true;
				}
			} else if (var2 == 8) { // L: 72
				var1.readUnsignedByte(); // L: 73
			} else if (var2 >= 10 && var2 <= 14) { // L: 75
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 76
				var3 = var1.readUnsignedByte(); // L: 77
				this.field1882 = new int[var3 * 2]; // L: 78

				int var4;
				for (var4 = 0; var4 < var3 * 2; ++var4) { // L: 79
					this.field1882[var4] = var1.readShort();
				}

				var1.readInt(); // L: 80
				var4 = var1.readUnsignedByte(); // L: 81
				this.field1893 = new int[var4]; // L: 82

				int var5;
				for (var5 = 0; var5 < this.field1893.length; ++var5) { // L: 83
					this.field1893[var5] = var1.readInt();
				}

				this.field1894 = new byte[var3]; // L: 84

				for (var5 = 0; var5 < var3; ++var5) { // L: 85
					this.field1894[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 87
				if (var2 == 17) { // L: 88
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 89
					var1.method8422(); // L: 90
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
					var1.method8422(); // L: 109
				} else if (var2 == 28) { // L: 111
					var1.readUnsignedByte(); // L: 112
				} else if (var2 == 29) { // L: 114
					this.horizontalAlignment = (HorizontalAlignment)DecorativeObject.findEnumerated(class101.method2565(), var1.readUnsignedByte()); // L: 115
				} else if (var2 == 30) { // L: 117
					this.verticalAlignment = (VerticalAlignment)DecorativeObject.findEnumerated(class120.method2813(), var1.readUnsignedByte()); // L: 118
				}
			}
		}

	} // L: 121

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "623854316"
	)
	public void method3436() {
		if (this.field1882 != null) { // L: 124
			for (int var1 = 0; var1 < this.field1882.length; var1 += 2) { // L: 125
				if (this.field1882[var1] < this.field1887) { // L: 126
					this.field1887 = this.field1882[var1];
				} else if (this.field1882[var1] > this.field1873) { // L: 127
					this.field1873 = this.field1882[var1];
				}

				if (this.field1882[var1 + 1] < this.field1888) { // L: 128
					this.field1888 = this.field1882[var1 + 1];
				} else if (this.field1882[var1 + 1] > this.field1890) {
					this.field1890 = this.field1882[var1 + 1]; // L: 129
				}
			}
		}

	} // L: 132

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lri;",
		garbageValue = "458010968"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 135
		return this.getSprite(var2); // L: 136
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Lri;",
		garbageValue = "-1031771281"
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
				var2 = FriendsList.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 143
				if (var2 != null) { // L: 144
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 145
				}

				return var2; // L: 147
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1600914494"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 151
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Lgg;",
		garbageValue = "-45896361"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 48
		if (var1 != null) { // L: 49
			return var1; // L: 50
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0); // L: 52
			var1 = new SequenceDefinition(); // L: 53
			if (var2 != null) { // L: 54
				var1.decode(new Buffer(var2)); // L: 55
			}

			var1.postDecode(); // L: 57
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 58
			return var1; // L: 59
		}
	}
}
