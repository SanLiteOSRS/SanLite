import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
public class class162 extends class144 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -489866399
	)
	int field1757;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1027796971
	)
	int field1758;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class162(class147 var1) {
		this.this$0 = var1; // L: 271
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-734756620"
	)
	void vmethod3510(Buffer var1) {
		this.field1757 = var1.readInt(); // L: 274
		this.field1758 = var1.readInt(); // L: 275
	} // L: 276

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfc;I)V",
		garbageValue = "-2111347169"
	)
	void vmethod3506(ClanSettings var1) {
		var1.method3336(this.field1757, this.field1758); // L: 279
	} // L: 280

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	static void method3451() {
		ChatChannel.field996 = new int[2000]; // L: 25
		int var0 = 0; // L: 26
		int var1 = 240; // L: 27

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) { // L: 28
			var3 = ArchiveLoader.method2328((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.425F * (float)var0 / 16.0F + 0.075F)); // L: 30
			ChatChannel.field996[var0] = var3; // L: 31
			++var0; // L: 29
		}

		var1 = 48; // L: 33

		for (int var5 = var1 / 6; var0 < ChatChannel.field996.length; var1 -= var5) { // L: 34 35 41
			var3 = var0 * 2; // L: 36

			for (int var4 = ArchiveLoader.method2328((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < ChatChannel.field996.length; ++var0) { // L: 37 38
				ChatChannel.field996[var0] = var4; // L: 39
			}
		}

	} // L: 43

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "33"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 226
		var1.offset = var0.length - 2; // L: 227
		class541.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 228
		class541.SpriteBuffer_xOffsets = new int[class541.SpriteBuffer_spriteCount]; // L: 229
		class541.SpriteBuffer_yOffsets = new int[class541.SpriteBuffer_spriteCount]; // L: 230
		class541.SpriteBuffer_spriteWidths = new int[class541.SpriteBuffer_spriteCount]; // L: 231
		class520.SpriteBuffer_spriteHeights = new int[class541.SpriteBuffer_spriteCount]; // L: 232
		class396.SpriteBuffer_pixels = new byte[class541.SpriteBuffer_spriteCount][]; // L: 233
		var1.offset = var0.length - 7 - class541.SpriteBuffer_spriteCount * 8; // L: 234
		class541.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 235
		GrandExchangeOfferWorldComparator.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 236
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 237

		int var3;
		for (var3 = 0; var3 < class541.SpriteBuffer_spriteCount; ++var3) { // L: 238
			class541.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class541.SpriteBuffer_spriteCount; ++var3) { // L: 239
			class541.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class541.SpriteBuffer_spriteCount; ++var3) { // L: 240
			class541.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class541.SpriteBuffer_spriteCount; ++var3) { // L: 241
			class520.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class541.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 242
		class541.SpriteBuffer_spritePalette = new int[var2]; // L: 243

		for (var3 = 1; var3 < var2; ++var3) { // L: 244
			class541.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 245
			if (class541.SpriteBuffer_spritePalette[var3] == 0) { // L: 246
				class541.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 248

		for (var3 = 0; var3 < class541.SpriteBuffer_spriteCount; ++var3) { // L: 249
			int var4 = class541.SpriteBuffer_spriteWidths[var3]; // L: 250
			int var5 = class520.SpriteBuffer_spriteHeights[var3]; // L: 251
			int var6 = var5 * var4; // L: 252
			byte[] var7 = new byte[var6]; // L: 253
			class396.SpriteBuffer_pixels[var3] = var7; // L: 254
			int var8 = var1.readUnsignedByte(); // L: 255
			int var9;
			if (var8 == 0) { // L: 256
				for (var9 = 0; var9 < var6; ++var9) { // L: 257
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 259
				for (var9 = 0; var9 < var4; ++var9) { // L: 260
					for (int var10 = 0; var10 < var5; ++var10) { // L: 261
						var7[var9 + var4 * var10] = var1.readByte(); // L: 262
					}
				}
			}
		}

	} // L: 267
}
