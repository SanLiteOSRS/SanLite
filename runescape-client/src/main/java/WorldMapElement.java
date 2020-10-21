import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "[Liv;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1742537505
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("WorldMapElement_cachedSprites")
	static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2104194333
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1581878653
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -886122493
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("w")
	@Export("name")
	public String name;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 2144841941
	)
	public int field3243;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1165437927
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("d")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("h")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("a")
	int[] field3247;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -880693079
	)
	int field3248;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 328256207
	)
	int field3249;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1153457135
	)
	int field3250;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1976425027
	)
	int field3251;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lju;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lit;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("r")
	int[] field3253;
	@ObfuscatedName("u")
	byte[] field3242;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 763418107
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
		this.menuActions = new String[5];
		this.field3248 = Integer.MAX_VALUE;
		this.field3249 = Integer.MAX_VALUE;
		this.field3250 = Integer.MIN_VALUE;
		this.field3251 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lkf;B)V",
		garbageValue = "-62"
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
		signature = "(Lkf;IB)V",
		garbageValue = "87"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.method5634();
		} else if (var2 == 2) {
			this.sprite2 = var1.method5634();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field3243 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var3;
			if (var2 == 7) {
				var3 = var1.readUnsignedByte();
				if ((var3 & 1) == 0) {
				}

				if ((var3 & 2) == 2) {
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var3 = var1.readUnsignedByte();
				this.field3247 = new int[var3 * 2];

				int var4;
				for (var4 = 0; var4 < var3 * 2; ++var4) {
					this.field3247[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field3253 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field3253.length; ++var5) {
					this.field3253[var5] = var1.readInt();
				}

				this.field3242 = new byte[var3];

				for (var5 = 0; var5 < var3; ++var5) {
					this.field3242[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) {
					var1.method5634();
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
					var1.method5634();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					this.horizontalAlignment = (HorizontalAlignment)TextureProvider.findEnumerated(BoundaryObject.method3386(), var1.readUnsignedByte());
				} else if (var2 == 30) {
					VerticalAlignment[] var6 = new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field3221, VerticalAlignment.field3225};
					this.verticalAlignment = (VerticalAlignment)TextureProvider.findEnumerated(var6, var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1332765917"
	)
	public void method4469() {
		if (this.field3247 != null) {
			for (int var1 = 0; var1 < this.field3247.length; var1 += 2) {
				if (this.field3247[var1] < this.field3248) {
					this.field3248 = this.field3247[var1];
				} else if (this.field3247[var1] > this.field3250) {
					this.field3250 = this.field3247[var1];
				}

				if (this.field3247[var1 + 1] < this.field3249) {
					this.field3249 = this.field3247[var1 + 1];
				} else if (this.field3247[var1 + 1] > this.field3251) {
					this.field3251 = this.field3247[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(ZI)Llp;",
		garbageValue = "435474118"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)Llp;",
		garbageValue = "-335461547"
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
				var2 = AbstractUserComparator.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					WorldMapElement_cachedSprites.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "13"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}
}
