import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lgr;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("Ignored_cached")
	public static EvictingDualNodeHashTable Ignored_cached;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1760689129
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -351523479
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -880575015
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("ac")
	@Export("name")
	public String name;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 90303527
	)
	public int field1830;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 501324725
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("av")
	public boolean field1825;
	@ObfuscatedName("ax")
	public boolean field1824;
	@ObfuscatedName("as")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ay")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("ak")
	int[] field1837;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1354879599
	)
	int field1834;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -488083685
	)
	int field1839;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1506509263
	)
	int field1840;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -867132631
	)
	int field1831;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("an")
	int[] field1844;
	@ObfuscatedName("ag")
	byte[] field1845;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -974886963
	)
	@Export("category")
	public int category;

	static {
		Ignored_cached = new EvictingDualNodeHashTable(256);
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1; // L: 18
		this.sprite2 = -1; // L: 19
		this.textSize = 0; // L: 22
		this.field1825 = true; // L: 24
		this.field1824 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1834 = Integer.MAX_VALUE; // L: 29
		this.field1839 = Integer.MAX_VALUE; // L: 30
		this.field1840 = Integer.MIN_VALUE; // L: 31
		this.field1831 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-987728818"
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
		descriptor = "(Luj;IB)V",
		garbageValue = "0"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 59
			this.sprite1 = var1.method9280();
		} else if (var2 == 2) { // L: 60
			this.sprite2 = var1.method9280();
		} else if (var2 == 3) { // L: 61
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 62
			this.field1830 = var1.readMedium();
		} else if (var2 == 5) { // L: 63
			var1.readMedium(); // L: 64
		} else if (var2 == 6) { // L: 66
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) { // L: 67
				var6 = var1.readUnsignedByte(); // L: 68
				if ((var6 & 1) == 0) { // L: 69
					this.field1825 = false;
				}

				if ((var6 & 2) == 2) { // L: 70
					this.field1824 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte(); // L: 73
			} else if (var2 >= 10 && var2 <= 14) { // L: 75
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 76
				var6 = var1.readUnsignedByte(); // L: 77
				this.field1837 = new int[var6 * 2]; // L: 78

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) { // L: 79
					this.field1837[var4] = var1.readShort();
				}

				var1.readInt(); // L: 80
				var4 = var1.readUnsignedByte(); // L: 81
				this.field1844 = new int[var4]; // L: 82

				int var5;
				for (var5 = 0; var5 < this.field1844.length; ++var5) { // L: 83
					this.field1844[var5] = var1.readInt();
				}

				this.field1845 = new byte[var6]; // L: 84

				for (var5 = 0; var5 < var6; ++var5) { // L: 85
					this.field1845[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 87
				if (var2 == 17) { // L: 88
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 89
					var1.method9280(); // L: 90
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
					var1.method9280(); // L: 109
				} else if (var2 == 28) { // L: 111
					var1.readUnsignedByte(); // L: 112
				} else if (var2 == 29) { // L: 114
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field1909, HorizontalAlignment.field1905, HorizontalAlignment.HorizontalAlignment_centered}; // L: 117
					this.horizontalAlignment = (HorizontalAlignment)class12.findEnumerated(var3, var1.readUnsignedByte()); // L: 119
				} else if (var2 == 30) { // L: 121
					VerticalAlignment[] var7 = new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1972, VerticalAlignment.field1970}; // L: 124
					this.verticalAlignment = (VerticalAlignment)class12.findEnumerated(var7, var1.readUnsignedByte()); // L: 126
				}
			}
		}

	} // L: 129

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1778533168"
	)
	public void method3580() {
		if (this.field1837 != null) { // L: 132
			for (int var1 = 0; var1 < this.field1837.length; var1 += 2) { // L: 133
				if (this.field1837[var1] < this.field1834) { // L: 134
					this.field1834 = this.field1837[var1];
				} else if (this.field1837[var1] > this.field1840) { // L: 135
					this.field1840 = this.field1837[var1];
				}

				if (this.field1837[var1 + 1] < this.field1839) { // L: 136
					this.field1839 = this.field1837[var1 + 1];
				} else if (this.field1837[var1 + 1] > this.field1831) {
					this.field1831 = this.field1837[var1 + 1]; // L: 137
				}
			}
		}

	} // L: 140

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZB)Luz;",
		garbageValue = "9"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 143
		return this.getSprite(var2); // L: 144
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Luz;",
		garbageValue = "539086783"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) { // L: 148
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)Ignored_cached.get((long)var1); // L: 149
			if (var2 != null) { // L: 150
				return var2;
			} else {
				var2 = IgnoreList.SpriteBuffer_getSprite(class432.WorldMapElement_archive, var1, 0); // L: 151
				if (var2 != null) { // L: 152
					Ignored_cached.put(var2, (long)var1); // L: 153
				}

				return var2; // L: 155
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "314107499"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 159
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Laa;I)Lao;",
		garbageValue = "2008844718"
	)
	public static class3 method3590(class6 var0) {
		switch(var0.field11) { // L: 9
		case 0:
			return new class0(); // L: 12
		default:
			throw new IllegalArgumentException(); // L: 16
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1025083911"
	)
	public static void method3589() {
		StructComposition.StructDefinition_cached.clear(); // L: 71
	} // L: 72

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-10"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') { // L: 199
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true; // L: 200
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376; // L: 201
		}
	}
}
