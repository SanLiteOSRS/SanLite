import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 652863899
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1200781577
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1475941253
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("g")
	@Export("name")
	public String name;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 318056933
	)
	public int field3417;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 226936447
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("m")
	public boolean field3411;
	@ObfuscatedName("d")
	public boolean field3412;
	@ObfuscatedName("c")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("j")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("r")
	int[] field3419;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 878715993
	)
	int field3416;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1352620723
	)
	int field3422;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1995930283
	)
	int field3418;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 2048510459
	)
	int field3406;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Ljd;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lkf;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("a")
	int[] field3413;
	@ObfuscatedName("w")
	byte[] field3423;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1471498251
	)
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256);
	}

	WorldMapElement(int var1) {
		this.sprite1 = -1;
		this.sprite2 = -1;
		this.textSize = 0;
		this.field3411 = true;
		this.field3412 = false;
		this.menuActions = new String[5];
		this.field3416 = Integer.MAX_VALUE;
		this.field3422 = Integer.MAX_VALUE;
		this.field3418 = Integer.MIN_VALUE;
		this.field3406 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "1455317514"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Lnu;II)V",
		garbageValue = "-1298333373"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.method6597();
		} else if (var2 == 2) {
			this.sprite2 = var1.method6597();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field3417 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var3;
			if (var2 == 7) {
				var3 = var1.readUnsignedByte();
				if ((var3 & 1) == 0) {
					this.field3411 = false;
				}

				if ((var3 & 2) == 2) {
					this.field3412 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var3 = var1.readUnsignedByte();
				this.field3419 = new int[var3 * 2];

				int var4;
				for (var4 = 0; var4 < var3 * 2; ++var4) {
					this.field3419[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field3413 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field3413.length; ++var5) {
					this.field3413[var5] = var1.readInt();
				}

				this.field3423 = new byte[var3];

				for (var5 = 0; var5 < var3; ++var5) {
					this.field3423[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) {
					var1.method6597();
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
					var1.method6597();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					HorizontalAlignment[] var6 = new HorizontalAlignment[]{HorizontalAlignment.field3468, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field3469};
					this.horizontalAlignment = (HorizontalAlignment)UserComparator8.findEnumerated(var6, var1.readUnsignedByte());
				} else if (var2 == 30) {
					VerticalAlignment[] var7 = new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field3517, VerticalAlignment.field3514};
					this.verticalAlignment = (VerticalAlignment)UserComparator8.findEnumerated(var7, var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-465360843"
	)
	void method4907() {
		if (this.field3419 != null) {
			for (int var1 = 0; var1 < this.field3419.length; var1 += 2) {
				if (this.field3419[var1] < this.field3416) {
					this.field3416 = this.field3419[var1];
				} else if (this.field3419[var1] > this.field3418) {
					this.field3418 = this.field3419[var1];
				}

				if (this.field3419[var1 + 1] < this.field3422) {
					this.field3422 = this.field3419[var1 + 1];
				} else if (this.field3419[var1 + 1] > this.field3406) {
					this.field3406 = this.field3419[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(ZI)Loh;",
		garbageValue = "-1983401566"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(II)Loh;",
		garbageValue = "-73698462"
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
				var2 = ModelData0.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					WorldMapElement_cachedSprites.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-643985376"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}
}
