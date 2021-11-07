import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Len;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1280320999
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 2056696763
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -976227479
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1158497187
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("p")
	@Export("name")
	public String name;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1157635857
	)
	public int field1626;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 334109615
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("y")
	public boolean field1641;
	@ObfuscatedName("k")
	public boolean field1629;
	@ObfuscatedName("t")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("l")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("u")
	int[] field1632;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1219303973
	)
	int field1633;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1453776181
	)
	int field1634;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -526173565
	)
	int field1635;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 2048716063
	)
	int field1621;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("c")
	int[] field1636;
	@ObfuscatedName("f")
	byte[] field1638;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1234093325
	)
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256);
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1;
		this.sprite2 = -1;
		this.textSize = 0;
		this.field1641 = true;
		this.field1629 = false;
		this.menuActions = new String[5];
		this.field1633 = Integer.MAX_VALUE;
		this.field1634 = Integer.MAX_VALUE;
		this.field1635 = Integer.MIN_VALUE;
		this.field1621 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lop;S)V",
		garbageValue = "5756"
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lop;IB)V",
		garbageValue = "-64"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.method6946();
		} else if (var2 == 2) {
			this.sprite2 = var1.method6946();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field1626 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 0) {
					this.field1641 = false;
				}

				if ((var6 & 2) == 2) {
					this.field1629 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var6 = var1.readUnsignedByte();
				this.field1632 = new int[var6 * 2];

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) {
					this.field1632[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1636 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field1636.length; ++var5) {
					this.field1636[var5] = var1.readInt();
				}

				this.field1638 = new byte[var6];

				for (var5 = 0; var5 < var6; ++var5) {
					this.field1638[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) {
					var1.method6946();
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
					var1.method6946();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field1699, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1694};
					this.horizontalAlignment = (HorizontalAlignment)UserComparator4.findEnumerated(var3, var1.readUnsignedByte());
				} else if (var2 == 30) {
					this.verticalAlignment = (VerticalAlignment)UserComparator4.findEnumerated(class150.method2969(), var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-23"
	)
	public void method3008() {
		if (this.field1632 != null) {
			for (int var1 = 0; var1 < this.field1632.length; var1 += 2) {
				if (this.field1632[var1] < this.field1633) {
					this.field1633 = this.field1632[var1];
				} else if (this.field1632[var1] > this.field1635) {
					this.field1635 = this.field1632[var1];
				}

				if (this.field1632[var1 + 1] < this.field1634) {
					this.field1634 = this.field1632[var1 + 1];
				} else if (this.field1632[var1 + 1] > this.field1621) {
					this.field1621 = this.field1632[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ZI)Low;",
		garbageValue = "1908363794"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Low;",
		garbageValue = "-834050600"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1);
			if (var2 != null) {
				return var2;
			} else {
				var2 = WorldMapSection0.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					WorldMapElement_cachedSprites.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1251139845"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "72"
	)
	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) {
			if (KeyHandler.field107 == KeyHandler.field131) {
				return false;
			} else {
				class12.field55 = KeyHandler.field124[KeyHandler.field107];
				class319.field3858 = KeyHandler.field112[KeyHandler.field107];
				KeyHandler.field107 = KeyHandler.field107 + 1 & 127;
				return true;
			}
		}
	}
}
