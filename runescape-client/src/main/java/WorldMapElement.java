import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("fy")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Lfy;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 113471429
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1048381869
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1921401085
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 804561295
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("k")
	@Export("name")
	public String name;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1591663295
	)
	public int field1817;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1085600775
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("a")
	public boolean field1820;
	@ObfuscatedName("m")
	public boolean field1829;
	@ObfuscatedName("u")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("l")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("z")
	int[] field1824;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1182827997
	)
	int field1818;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -358126787
	)
	int field1826;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1041936171
	)
	int field1827;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 2040512215
	)
	int field1828;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("f")
	int[] field1831;
	@ObfuscatedName("t")
	byte[] field1834;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1298200341
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
		this.field1820 = true; // L: 24
		this.field1829 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1818 = Integer.MAX_VALUE; // L: 29
		this.field1826 = Integer.MAX_VALUE; // L: 30
		this.field1827 = Integer.MIN_VALUE; // L: 31
		this.field1828 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "1020595455"
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "-492747543"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 59
			this.sprite1 = var1.method7652();
		} else if (var2 == 2) { // L: 60
			this.sprite2 = var1.method7652();
		} else if (var2 == 3) { // L: 61
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 62
			this.field1817 = var1.readMedium();
		} else if (var2 == 5) { // L: 63
			var1.readMedium(); // L: 64
		} else if (var2 == 6) { // L: 66
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) { // L: 67
				var6 = var1.readUnsignedByte(); // L: 68
				if ((var6 & 1) == 0) { // L: 69
					this.field1820 = false;
				}

				if ((var6 & 2) == 2) { // L: 70
					this.field1829 = true;
				}
			} else if (var2 == 8) { // L: 72
				var1.readUnsignedByte(); // L: 73
			} else if (var2 >= 10 && var2 <= 14) { // L: 75
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 76
				var6 = var1.readUnsignedByte(); // L: 77
				this.field1824 = new int[var6 * 2]; // L: 78

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) { // L: 79
					this.field1824[var4] = var1.readShort();
				}

				var1.readInt(); // L: 80
				var4 = var1.readUnsignedByte(); // L: 81
				this.field1831 = new int[var4]; // L: 82

				int var5;
				for (var5 = 0; var5 < this.field1831.length; ++var5) { // L: 83
					this.field1831[var5] = var1.readInt();
				}

				this.field1834 = new byte[var6]; // L: 84

				for (var5 = 0; var5 < var6; ++var5) { // L: 85
					this.field1834[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 87
				if (var2 == 17) { // L: 88
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 89
					var1.method7652(); // L: 90
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
					var1.method7652(); // L: 109
				} else if (var2 == 28) { // L: 111
					var1.readUnsignedByte(); // L: 112
				} else if (var2 == 29) { // L: 114
					this.horizontalAlignment = (HorizontalAlignment)GameEngine.findEnumerated(SecureRandomCallable.method2032(), var1.readUnsignedByte()); // L: 115
				} else if (var2 == 30) { // L: 117
					VerticalAlignment[] var3 = new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1948, VerticalAlignment.field1953}; // L: 120
					this.verticalAlignment = (VerticalAlignment)GameEngine.findEnumerated(var3, var1.readUnsignedByte()); // L: 122
				}
			}
		}

	} // L: 125

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "112"
	)
	public void method3291() {
		if (this.field1824 != null) { // L: 128
			for (int var1 = 0; var1 < this.field1824.length; var1 += 2) { // L: 129
				if (this.field1824[var1] < this.field1818) { // L: 130
					this.field1818 = this.field1824[var1];
				} else if (this.field1824[var1] > this.field1827) { // L: 131
					this.field1827 = this.field1824[var1];
				}

				if (this.field1824[var1 + 1] < this.field1826) { // L: 132
					this.field1826 = this.field1824[var1 + 1];
				} else if (this.field1824[var1 + 1] > this.field1828) {
					this.field1828 = this.field1824[var1 + 1]; // L: 133
				}
			}
		}

	} // L: 136

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lqn;",
		garbageValue = "-1155486429"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 139
		return this.getSprite(var2); // L: 140
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqn;",
		garbageValue = "-57"
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
				var2 = WorldMapScaleHandler.SpriteBuffer_getSprite(class28.WorldMapElement_archive, var1, 0); // L: 147
				if (var2 != null) { // L: 148
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 149
				}

				return var2; // L: 151
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-86142219"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 155
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-3"
	)
	static void method3317(String var0) {
		HitSplatDefinition.field2012 = var0; // L: 12113

		try {
			String var1 = AbstractByteArrayCopier.client.getParameter(Integer.toString(18)); // L: 12115
			String var2 = AbstractByteArrayCopier.client.getParameter(Integer.toString(13)); // L: 12116
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 12117
			if (var0.length() == 0) { // L: 12118
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + class161.method3219(class181.method3483() + 94608000000L) + "; Max-Age=" + 94608000L; // L: 12119
			}

			Client var4 = AbstractByteArrayCopier.client; // L: 12120
			String var5 = "document.cookie=\"" + var3 + "\""; // L: 12121
			JSObject.getWindow(var4).eval(var5); // L: 12124
		} catch (Throwable var6) { // L: 12127
		}

	} // L: 12128
}
