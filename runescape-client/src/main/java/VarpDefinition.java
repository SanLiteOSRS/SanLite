import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("VarpDefinition_archive")
	public static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1806135951
	)
	public static int field1922;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("VarpDefinition_cached")
	static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -609772131
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	VarpDefinition() {
		this.type = 0; // L: 13
	} // L: 15

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)V",
		garbageValue = "0"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 29
			if (var2 == 0) { // L: 30
				return; // L: 33
			}

			this.decodeNext(var1, var2); // L: 31
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqy;II)V",
		garbageValue = "1920154303"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) { // L: 36
			this.type = var1.readUnsignedShort();
		}

	} // L: 38

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Lgn;",
		garbageValue = "325063701"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0); // L: 79
		if (var1 != null) { // L: 80
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0); // L: 81
			var1 = new ObjectComposition(); // L: 82
			var1.id = var0; // L: 83
			if (var2 != null) { // L: 84
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 85
			if (var1.isSolid) { // L: 86
				var1.interactType = 0; // L: 87
				var1.boolean1 = false; // L: 88
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0); // L: 90
			return var1; // L: 91
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lln;IIIBZB)V",
		garbageValue = "-66"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2);
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6);
		if (var8 == null) {
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6);
			if (var8 == null) {
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6);
				if (var8 != null) {
					if (var5) {
						var8.removeDual();
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6);
						--NetCache.NetCache_pendingWritesCount; // L: 251
						++NetCache.NetCache_pendingPriorityWritesCount;
					}

				} else {
					if (!var5) { // L: 256
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6); // L: 257
						if (var8 != null) { // L: 258
							return;
						}
					}

					var8 = new NetFileRequest();
					var8.archive = var0; // L: 261
					var8.crc = var3; // L: 262
					var8.padding = var4; // L: 263
					if (var5) { // L: 264
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 265
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 266
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8); // L: 269
						NetCache.NetCache_pendingWrites.put(var8, var6); // L: 270
						++NetCache.NetCache_pendingWritesCount; // L: 271
					}

				}
			}
		}
	} // L: 273

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1710620347"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 219
		var1.offset = var0.length - 2; // L: 220
		class481.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 221
		class481.SpriteBuffer_xOffsets = new int[class481.SpriteBuffer_spriteCount]; // L: 222
		class414.SpriteBuffer_yOffsets = new int[class481.SpriteBuffer_spriteCount]; // L: 223
		class11.SpriteBuffer_spriteWidths = new int[class481.SpriteBuffer_spriteCount]; // L: 224
		StructComposition.SpriteBuffer_spriteHeights = new int[class481.SpriteBuffer_spriteCount]; // L: 225
		GroundObject.SpriteBuffer_pixels = new byte[class481.SpriteBuffer_spriteCount][]; // L: 226
		var1.offset = var0.length - 7 - class481.SpriteBuffer_spriteCount * 8; // L: 227
		GrandExchangeOfferTotalQuantityComparator.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 228
		class481.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 229
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 230

		int var3;
		for (var3 = 0; var3 < class481.SpriteBuffer_spriteCount; ++var3) { // L: 231
			class481.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class481.SpriteBuffer_spriteCount; ++var3) { // L: 232
			class414.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class481.SpriteBuffer_spriteCount; ++var3) { // L: 233
			class11.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class481.SpriteBuffer_spriteCount; ++var3) { // L: 234
			StructComposition.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class481.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 235
		WorldMapEvent.SpriteBuffer_spritePalette = new int[var2]; // L: 236

		for (var3 = 1; var3 < var2; ++var3) { // L: 237
			WorldMapEvent.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 238
			if (WorldMapEvent.SpriteBuffer_spritePalette[var3] == 0) { // L: 239
				WorldMapEvent.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 241

		for (var3 = 0; var3 < class481.SpriteBuffer_spriteCount; ++var3) { // L: 242
			int var4 = class11.SpriteBuffer_spriteWidths[var3]; // L: 243
			int var5 = StructComposition.SpriteBuffer_spriteHeights[var3]; // L: 244
			int var6 = var5 * var4; // L: 245
			byte[] var7 = new byte[var6]; // L: 246
			GroundObject.SpriteBuffer_pixels[var3] = var7; // L: 247
			int var8 = var1.readUnsignedByte(); // L: 248
			int var9;
			if (var8 == 0) { // L: 249
				for (var9 = 0; var9 < var6; ++var9) { // L: 250
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 252
				for (var9 = 0; var9 < var4; ++var9) { // L: 253
					for (int var10 = 0; var10 < var5; ++var10) { // L: 254
						var7[var9 + var4 * var10] = var1.readByte(); // L: 255
					}
				}
			}
		}

	} // L: 260

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1192039174"
	)
	static void method3547(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) { // L: 12594
			if ((var1.key >> 48 & 65535L) == (long)var0) { // L: 12595
				var1.remove(); // L: 12596
			}
		}

	} // L: 12599
}
