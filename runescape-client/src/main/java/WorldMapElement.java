import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lew;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("soundEffectsArchive")
	public static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("Widget_cachedSprites")
	public static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -298295867
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 300345687
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1973945717
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("b")
	@Export("name")
	public String name;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1016348217
	)
	public int field1557;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 945546823
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("l")
	public boolean field1560;
	@ObfuscatedName("o")
	public boolean field1561;
	@ObfuscatedName("c")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("e")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("g")
	int[] field1564;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 61627465
	)
	int field1565;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1855572569
	)
	int field1574;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1059928721
	)
	int field1567;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1980828279
	)
	int field1568;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("t")
	int[] field1571;
	@ObfuscatedName("h")
	byte[] field1572;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 41328569
	)
	@Export("category")
	public int category;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(256);
	}

	WorldMapElement(int var1) {
		this.sprite1 = -1;
		this.sprite2 = -1;
		this.textSize = 0;
		this.field1560 = true;
		this.field1561 = false;
		this.menuActions = new String[5];
		this.field1565 = Integer.MAX_VALUE;
		this.field1574 = Integer.MAX_VALUE;
		this.field1567 = Integer.MIN_VALUE;
		this.field1568 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1509060370"
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnd;II)V",
		garbageValue = "-1414929060"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.method6583();
		} else if (var2 == 2) {
			this.sprite2 = var1.method6583();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field1557 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var3;
			if (var2 == 7) {
				var3 = var1.readUnsignedByte();
				if ((var3 & 1) == 0) {
					this.field1560 = false;
				}

				if ((var3 & 2) == 2) {
					this.field1561 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var3 = var1.readUnsignedByte();
				this.field1564 = new int[var3 * 2];

				int var4;
				for (var4 = 0; var4 < var3 * 2; ++var4) {
					this.field1564[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1571 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field1571.length; ++var5) {
					this.field1571[var5] = var1.readInt();
				}

				this.field1572 = new byte[var3];

				for (var5 = 0; var5 < var3; ++var5) {
					this.field1572[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) {
					var1.method6583();
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
					var1.method6583();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					this.horizontalAlignment = (HorizontalAlignment)Messages.findEnumerated(FloorOverlayDefinition.method3103(), var1.readUnsignedByte());
				} else if (var2 == 30) {
					this.verticalAlignment = (VerticalAlignment)Messages.findEnumerated(MouseRecorder.method2095(), var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-505496297"
	)
	void method2634() {
		if (this.field1564 != null) {
			for (int var1 = 0; var1 < this.field1564.length; var1 += 2) {
				if (this.field1564[var1] < this.field1565) {
					this.field1565 = this.field1564[var1];
				} else if (this.field1564[var1] > this.field1567) {
					this.field1567 = this.field1564[var1];
				}

				if (this.field1564[var1 + 1] < this.field1574) {
					this.field1574 = this.field1564[var1 + 1];
				} else if (this.field1564[var1 + 1] > this.field1568) {
					this.field1568 = this.field1564[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZI)Loh;",
		garbageValue = "-2060838679"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)Loh;",
		garbageValue = "2134541760"
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
				var2 = ClientPacket.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					Widget_cachedSprites.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1931066057"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(CS)Z",
		garbageValue = "-28639"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1291818540"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}
}
