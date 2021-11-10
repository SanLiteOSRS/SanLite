import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("w")
	String field928;
	@ObfuscatedName("s")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("a")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("o")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1670350009
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -239833439
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1823289949
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1448244841
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lnf;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lnf;",
		garbageValue = "17"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1899123891"
	)
	static int method1988(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	public static void method1989() {
		if (NetCache.NetCache_socket != null) {
			NetCache.NetCache_socket.close();
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lko;Ljava/lang/String;Ljava/lang/String;I)Loe;",
		garbageValue = "846421699"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		byte[] var7 = var0.takeFile(var3, var4);
		boolean var6;
		if (var7 == null) {
			var6 = false;
		} else {
			SpriteBuffer_decode(var7);
			var6 = true;
		}

		IndexedSprite var5;
		if (!var6) {
			var5 = null;
		} else {
			IndexedSprite var8 = new IndexedSprite();
			var8.width = class414.SpriteBuffer_spriteWidth;
			var8.height = class414.SpriteBuffer_spriteHeight;
			var8.xOffset = class414.SpriteBuffer_xOffsets[0];
			var8.yOffset = class414.SpriteBuffer_yOffsets[0];
			var8.subWidth = UrlRequester.SpriteBuffer_spriteWidths[0];
			var8.subHeight = class414.SpriteBuffer_spriteHeights[0];
			var8.palette = HitSplatDefinition.SpriteBuffer_spritePalette;
			var8.pixels = class295.SpriteBuffer_pixels[0];
			PacketBuffer.method6913();
			var5 = var8;
		}

		return var5;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1694864666"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class414.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class414.SpriteBuffer_xOffsets = new int[class414.SpriteBuffer_spriteCount];
		class414.SpriteBuffer_yOffsets = new int[class414.SpriteBuffer_spriteCount];
		UrlRequester.SpriteBuffer_spriteWidths = new int[class414.SpriteBuffer_spriteCount];
		class414.SpriteBuffer_spriteHeights = new int[class414.SpriteBuffer_spriteCount];
		class295.SpriteBuffer_pixels = new byte[class414.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - class414.SpriteBuffer_spriteCount * 8;
		class414.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class414.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class414.SpriteBuffer_spriteCount; ++var3) {
			class414.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class414.SpriteBuffer_spriteCount; ++var3) {
			class414.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class414.SpriteBuffer_spriteCount; ++var3) {
			UrlRequester.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class414.SpriteBuffer_spriteCount; ++var3) {
			class414.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class414.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		HitSplatDefinition.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			HitSplatDefinition.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (HitSplatDefinition.SpriteBuffer_spritePalette[var3] == 0) {
				HitSplatDefinition.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < class414.SpriteBuffer_spriteCount; ++var3) {
			int var4 = UrlRequester.SpriteBuffer_spriteWidths[var3];
			int var5 = class414.SpriteBuffer_spriteHeights[var3];
			int var6 = var4 * var5;
			byte[] var7 = new byte[var6];
			class295.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var10 * var4] = var1.readByte();
					}
				}
			}
		}

	}
}
