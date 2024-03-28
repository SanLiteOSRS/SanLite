import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lhw;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("Ignored_cached")
	public static EvictingDualNodeHashTable Ignored_cached;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1357659579
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1308036587
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1423427751
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("aw")
	@Export("name")
	public String name;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2043006879
	)
	public int field2011;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 902578553
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("ag")
	public boolean field2004;
	@ObfuscatedName("ai")
	public boolean field2012;
	@ObfuscatedName("ax")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ar")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("aj")
	int[] field2013;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -382399201
	)
	int field2002;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1762205745
	)
	int field2017;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -50187643
	)
	int field2018;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2055496749
	)
	int field2019;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("am")
	int[] field2022;
	@ObfuscatedName("ac")
	byte[] field2023;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 540587115
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
		this.field2004 = true; // L: 24
		this.field2012 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field2002 = Integer.MAX_VALUE; // L: 29
		this.field2017 = Integer.MAX_VALUE; // L: 30
		this.field2018 = Integer.MIN_VALUE; // L: 31
		this.field2019 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "-2011784720"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;IS)V",
		garbageValue = "-29043"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 59
			this.sprite1 = var1.method9436();
		} else if (var2 == 2) { // L: 60
			this.sprite2 = var1.method9436();
		} else if (var2 == 3) { // L: 61
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 62
			this.field2011 = var1.readMedium();
		} else if (var2 == 5) { // L: 63
			var1.readMedium(); // L: 64
		} else if (var2 == 6) { // L: 66
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) { // L: 67
				var6 = var1.readUnsignedByte(); // L: 68
				if ((var6 & 1) == 0) { // L: 69
					this.field2004 = false;
				}

				if ((var6 & 2) == 2) { // L: 70
					this.field2012 = true;
				}
			} else if (var2 == 8) { // L: 72
				var1.readUnsignedByte(); // L: 73
			} else if (var2 >= 10 && var2 <= 14) { // L: 75
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 76
				var6 = var1.readUnsignedByte(); // L: 77
				this.field2013 = new int[var6 * 2]; // L: 78

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) { // L: 79
					this.field2013[var4] = var1.readShort();
				}

				var1.readInt(); // L: 80
				var4 = var1.readUnsignedByte(); // L: 81
				this.field2022 = new int[var4]; // L: 82

				int var5;
				for (var5 = 0; var5 < this.field2022.length; ++var5) { // L: 83
					this.field2022[var5] = var1.readInt();
				}

				this.field2023 = new byte[var6]; // L: 84

				for (var5 = 0; var5 < var6; ++var5) { // L: 85
					this.field2023[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 87
				if (var2 == 17) { // L: 88
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 89
					var1.method9436(); // L: 90
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
				} else if (var2 == 24) {
					var1.readShort();
					var1.readShort();
				} else if (var2 == 25) {
					var1.method9436();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) { // L: 114
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field2087, HorizontalAlignment.field2090, HorizontalAlignment.HorizontalAlignment_centered}; // L: 117
					this.horizontalAlignment = (HorizontalAlignment)KitDefinition.findEnumerated(var3, var1.readUnsignedByte()); // L: 119
				} else if (var2 == 30) { // L: 121
					this.verticalAlignment = (VerticalAlignment)KitDefinition.findEnumerated(class130.method3014(), var1.readUnsignedByte()); // L: 122
				}
			}
		}

	} // L: 125

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1294022438"
	)
	public void method3743() {
		if (this.field2013 != null) { // L: 128
			for (int var1 = 0; var1 < this.field2013.length; var1 += 2) { // L: 129
				if (this.field2013[var1] < this.field2002) { // L: 130
					this.field2002 = this.field2013[var1];
				} else if (this.field2013[var1] > this.field2018) { // L: 131
					this.field2018 = this.field2013[var1];
				}

				if (this.field2013[var1 + 1] < this.field2017) { // L: 132
					this.field2017 = this.field2013[var1 + 1];
				} else if (this.field2013[var1 + 1] > this.field2019) {
					this.field2019 = this.field2013[var1 + 1]; // L: 133
				}
			}
		}

	} // L: 136

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lvg;",
		garbageValue = "917391848"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 139
		return this.getSprite(var2); // L: 140
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Lvg;",
		garbageValue = "4"
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
				var2 = GraphicsObject.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 147
				if (var2 != null) { // L: 148
					Ignored_cached.put(var2, (long)var1); // L: 149
				}

				return var2; // L: 151
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-656155168"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 155
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-685240157"
	)
	public static void method3742(int var0, int var1, int var2, int var3) {
		if (class321.field3495.size() > 1 && class321.field3495.get(0) != null && ((class333)class321.field3495.get(0)).field3613.isReady() && class321.field3495.get(1) != null && ((class333)class321.field3495.get(1)).field3613.isReady()) { // L: 103
			WorldMapSection2.method5289(var0, var1, var2, var3); // L: 104
			class321.field3498.add(new class420((class426)null)); // L: 105
			ArrayList var4 = new ArrayList(); // L: 106
			var4.add(new class422(new class425((class426)null, 1, false, class321.field3503), class321.field3502)); // L: 107
			var4.add(new class422(new class424((class426)null, 0, false, class321.field3501), class321.field3492)); // L: 108
			class321.field3498.add(new class427((class426)null, var4)); // L: 109
			if (class321.field3496.get(0) != null && class321.field3496.get(1) != null) { // L: 110
				class333 var5 = (class333)class321.field3496.get(0); // L: 111
				class321.field3496.set(0, class321.field3495.get(1)); // L: 112
				class321.field3496.set(1, var5); // L: 113
			}
		}

	} // L: 116
}
