import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Let;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1429232297
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	static Bounds field1572;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 826174565
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -428142715
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -577521577
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("v")
	@Export("name")
	public String name;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 760745591
	)
	public int field1570;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1774887539
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("x")
	public boolean field1557;
	@ObfuscatedName("k")
	public boolean field1558;
	@ObfuscatedName("r")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("p")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("a")
	int[] field1562;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1111331731
	)
	int field1556;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -2061305769
	)
	int field1564;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1154115857
	)
	int field1565;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1068182355
	)
	int field1563;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("s")
	int[] field1569;
	@ObfuscatedName("y")
	byte[] field1552;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 772677055
	)
	@Export("category")
	public int category;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(256);
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1;
		this.sprite2 = -1;
		this.textSize = 0;
		this.field1557 = true;
		this.field1558 = false;
		this.menuActions = new String[5];
		this.field1556 = Integer.MAX_VALUE;
		this.field1564 = Integer.MAX_VALUE;
		this.field1565 = Integer.MIN_VALUE;
		this.field1563 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "112581049"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnk;IB)V",
		garbageValue = "-20"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.method6464();
		} else if (var2 == 2) {
			this.sprite2 = var1.method6464();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field1570 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 0) {
					this.field1557 = false;
				}

				if ((var6 & 2) == 2) {
					this.field1558 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var6 = var1.readUnsignedByte();
				this.field1562 = new int[var6 * 2];

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) {
					this.field1562[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1569 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field1569.length; ++var5) {
					this.field1569[var5] = var1.readInt();
				}

				this.field1552 = new byte[var6];

				for (var5 = 0; var5 < var6; ++var5) {
					this.field1552[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) {
					var1.method6464();
				} else if (var2 == 19) {
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) {
					var1.readInt();
				} else if (var2 == 22) {
					var1.readInt();
				} else if (var2 == 23) {
					var1.readUnsignedByte();
					var1.readUnsignedByte();
					var1.readUnsignedByte();
				} else if (var2 == 24) {
					var1.readShort();
					var1.readShort();
				} else if (var2 == 25) {
					var1.method6464();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field1626, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1632};
					this.horizontalAlignment = (HorizontalAlignment)UserComparator4.findEnumerated(var3, var1.readUnsignedByte());
				} else if (var2 == 30) {
					VerticalAlignment[] var7 = new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1676, VerticalAlignment.field1675};
					this.verticalAlignment = (VerticalAlignment)UserComparator4.findEnumerated(var7, var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1639081598"
	)
	public void method2631() {
		if (this.field1562 != null) {
			for (int var1 = 0; var1 < this.field1562.length; var1 += 2) {
				if (this.field1562[var1] < this.field1556) {
					this.field1556 = this.field1562[var1];
				} else if (this.field1562[var1] > this.field1565) {
					this.field1565 = this.field1562[var1];
				}

				if (this.field1562[var1 + 1] < this.field1564) {
					this.field1564 = this.field1562[var1 + 1];
				} else if (this.field1562[var1 + 1] > this.field1563) {
					this.field1563 = this.field1562[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ZI)Low;",
		garbageValue = "-313379641"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Low;",
		garbageValue = "-67235633"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)Widget_cachedSprites.get((long)var1);
			if (var2 != null) {
				return var2;
			} else {
				var2 = Friend.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					Widget_cachedSprites.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "55"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IS)Leo;",
		garbageValue = "-31016"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0);
			var1 = new ParamComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			ParamComposition.ParamDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "54"
	)
	public static int method2628(int var0, int var1, int var2) {
		int var3 = WorldMapLabel.method3582(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}
}
