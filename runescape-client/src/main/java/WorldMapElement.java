import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "[Lij;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lev;"
	)
	@Export("WorldMapElement_cachedSprites")
	static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1215445883
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1607593407
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 97047321
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("c")
	@Export("name")
	public String name;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1968208311
	)
	public int field3245;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1892301399
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("o")
	public boolean field3258;
	@ObfuscatedName("n")
	public boolean field3248;
	@ObfuscatedName("x")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("p")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("r")
	int[] field3243;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 802871207
	)
	int field3252;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -294512157
	)
	int field3253;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -935648347
	)
	int field3247;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 2073996601
	)
	int field3255;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Ljy;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("a")
	int[] field3251;
	@ObfuscatedName("g")
	byte[] field3240;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 2142350901
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
		this.field3258 = true;
		this.field3248 = false;
		this.menuActions = new String[5];
		this.field3252 = Integer.MAX_VALUE;
		this.field3253 = Integer.MAX_VALUE;
		this.field3247 = Integer.MIN_VALUE;
		this.field3255 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Lkb;S)V",
		garbageValue = "-15323"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lkb;II)V",
		garbageValue = "-2023596008"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.method5851();
		} else if (var2 == 2) {
			this.sprite2 = var1.method5851();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field3245 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var3;
			if (var2 == 7) {
				var3 = var1.readUnsignedByte();
				if ((var3 & 1) == 0) {
					this.field3258 = false;
				}

				if ((var3 & 2) == 2) {
					this.field3248 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var3 = var1.readUnsignedByte();
				this.field3243 = new int[var3 * 2];

				int var4;
				for (var4 = 0; var4 < var3 * 2; ++var4) {
					this.field3243[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field3251 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field3251.length; ++var5) {
					this.field3251[var5] = var1.readInt();
				}

				this.field3240 = new byte[var3];

				for (var5 = 0; var5 < var3; ++var5) {
					this.field3240[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) {
					var1.method5851();
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
					var1.method5851();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					HorizontalAlignment[] var6 = new HorizontalAlignment[]{HorizontalAlignment.field3479, HorizontalAlignment.field3481, HorizontalAlignment.HorizontalAlignment_centered};
					this.horizontalAlignment = (HorizontalAlignment)class195.findEnumerated(var6, var1.readUnsignedByte());
				} else if (var2 == 30) {
					this.verticalAlignment = (VerticalAlignment)class195.findEnumerated(ScriptEvent.method1279(), var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1612993867"
	)
	void method4518() {
		if (this.field3243 != null) {
			for (int var1 = 0; var1 < this.field3243.length; var1 += 2) {
				if (this.field3243[var1] < this.field3252) {
					this.field3252 = this.field3243[var1];
				} else if (this.field3243[var1] > this.field3247) {
					this.field3247 = this.field3243[var1];
				}

				if (this.field3243[var1 + 1] < this.field3253) {
					this.field3253 = this.field3243[var1 + 1];
				} else if (this.field3243[var1 + 1] > this.field3255) {
					this.field3255 = this.field3243[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(ZI)Llc;",
		garbageValue = "-2016135845"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(II)Llc;",
		garbageValue = "1884936089"
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
				var2 = FloorDecoration.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					WorldMapElement_cachedSprites.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-932820751"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}
}
