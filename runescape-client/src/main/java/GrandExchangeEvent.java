import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -270415813
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 8578048883828628129L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("aw")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("ay")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Ltl;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated(); // L: 111
		this.previousOfferName = var1.readStringCp1252NullTerminated(); // L: 112
		this.world = var1.readUnsignedShort(); // L: 113
		this.age = var1.readLong(); // L: 114
		int var4 = var1.readInt(); // L: 115
		int var5 = var1.readInt(); // L: 116
		this.grandExchangeOffer = new GrandExchangeOffer(); // L: 117
		this.grandExchangeOffer.method6959(2); // L: 118
		this.grandExchangeOffer.method6958(var2); // L: 119
		this.grandExchangeOffer.unitPrice = var4; // L: 120
		this.grandExchangeOffer.totalQuantity = var5; // L: 121
		this.grandExchangeOffer.currentQuantity = 0; // L: 122
		this.grandExchangeOffer.currentPrice = 0; // L: 123
		this.grandExchangeOffer.id = var3; // L: 124
	} // L: 125

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-84"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName; // L: 128
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1483972435"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName; // L: 132
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1055490538"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (class47.Widget_loadedInterfaces[var0]) { // L: 255
			return true;
		} else if (!BuddyRankComparator.Widget_archive.tryLoadGroup(var0)) { // L: 256
			return false;
		} else {
			int var1 = BuddyRankComparator.Widget_archive.getGroupFileCount(var0); // L: 257
			if (var1 == 0) { // L: 258
				class47.Widget_loadedInterfaces[var0] = true; // L: 259
				return true; // L: 260
			} else {
				if (class179.Widget_interfaceComponents[var0] == null) { // L: 262
					class179.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 263
					if (class179.Widget_interfaceComponents[var0][var2] == null) { // L: 264
						byte[] var3 = BuddyRankComparator.Widget_archive.takeFile(var0, var2); // L: 265
						if (var3 != null) { // L: 266
							class179.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 267
							class179.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 268
							if (var3[0] == -1) { // L: 269
								class179.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								class179.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 270
							}
						}
					}
				}

				class47.Widget_loadedInterfaces[var0] = true; // L: 274
				return true; // L: 275
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1591705883"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 210
		var1.offset = var0.length - 2; // L: 211
		class527.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 212
		class527.SpriteBuffer_xOffsets = new int[class527.SpriteBuffer_spriteCount]; // L: 213
		class527.SpriteBuffer_yOffsets = new int[class527.SpriteBuffer_spriteCount]; // L: 214
		class496.SpriteBuffer_spriteWidths = new int[class527.SpriteBuffer_spriteCount]; // L: 215
		BuddyRankComparator.SpriteBuffer_spriteHeights = new int[class527.SpriteBuffer_spriteCount]; // L: 216
		class464.SpriteBuffer_pixels = new byte[class527.SpriteBuffer_spriteCount][]; // L: 217
		var1.offset = var0.length - 7 - class527.SpriteBuffer_spriteCount * 8; // L: 218
		class527.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 219
		class527.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 220
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 221

		int var3;
		for (var3 = 0; var3 < class527.SpriteBuffer_spriteCount; ++var3) { // L: 222
			class527.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class527.SpriteBuffer_spriteCount; ++var3) { // L: 223
			class527.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class527.SpriteBuffer_spriteCount; ++var3) { // L: 224
			class496.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class527.SpriteBuffer_spriteCount; ++var3) { // L: 225
			BuddyRankComparator.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class527.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 226
		class527.SpriteBuffer_spritePalette = new int[var2]; // L: 227

		for (var3 = 1; var3 < var2; ++var3) { // L: 228
			class527.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 229
			if (class527.SpriteBuffer_spritePalette[var3] == 0) { // L: 230
				class527.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 232

		for (var3 = 0; var3 < class527.SpriteBuffer_spriteCount; ++var3) { // L: 233
			int var4 = class496.SpriteBuffer_spriteWidths[var3]; // L: 234
			int var5 = BuddyRankComparator.SpriteBuffer_spriteHeights[var3]; // L: 235
			int var6 = var5 * var4; // L: 236
			byte[] var7 = new byte[var6]; // L: 237
			class464.SpriteBuffer_pixels[var3] = var7; // L: 238
			int var8 = var1.readUnsignedByte(); // L: 239
			int var9;
			if (var8 == 0) { // L: 240
				for (var9 = 0; var9 < var6; ++var9) { // L: 241
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 243
				for (var9 = 0; var9 < var4; ++var9) { // L: 244
					for (int var10 = 0; var10 < var5; ++var10) { // L: 245
						var7[var9 + var10 * var4] = var1.readByte(); // L: 246
					}
				}
			}
		}

	} // L: 251

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lca;I)V",
		garbageValue = "-1687690401"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 2163
			Client.isMembersWorld = var0.isMembersOnly(); // L: 2164
			class142.method3199(var0.isMembersOnly()); // L: 2165
		}

		if (var0.properties != Client.worldProperties) { // L: 2167
			World.method1856(Nameable.field4637, var0.properties); // L: 2168
		}

		class6.worldHost = var0.host; // L: 2170
		Client.worldId = var0.id; // L: 2171
		Client.worldProperties = var0.properties; // L: 2172
		MouseHandler.field224 = var0.field815; // L: 2173
		class502.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 2174
		GrandExchangeOfferUnitPriceComparator.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 2175
		class20.currentPort = class502.worldPort; // L: 2176
	} // L: 2177
}
