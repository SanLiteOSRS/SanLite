import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 322459375
	)
	public int field4556;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("v")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lsi;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4556 = (int)(class153.method3317() / 1000L); // L: 109
		this.username = var1; // L: 110
		this.world = (short)var2; // L: 111
	} // L: 112

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1614306334"
	)
	static String method7586() {
		String var0;
		if (PacketWriter.clientPreferences.method2484()) { // L: 276
			String var2 = Login.Login_username; // L: 278
			String var1 = class25.method366('*', var2.length()); // L: 280
			var0 = var1; // L: 282
		} else {
			var0 = Login.Login_username; // L: 284
		}

		return var0; // L: 285
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1201846591"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 163
		var1.offset = var0.length - 2; // L: 164
		class488.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 165
		class488.SpriteBuffer_xOffsets = new int[class488.SpriteBuffer_spriteCount]; // L: 166
		ApproximateRouteStrategy.SpriteBuffer_yOffsets = new int[class488.SpriteBuffer_spriteCount]; // L: 167
		FriendsList.SpriteBuffer_spriteWidths = new int[class488.SpriteBuffer_spriteCount]; // L: 168
		class132.SpriteBuffer_spriteHeights = new int[class488.SpriteBuffer_spriteCount]; // L: 169
		class140.SpriteBuffer_pixels = new byte[class488.SpriteBuffer_spriteCount][]; // L: 170
		var1.offset = var0.length - 7 - class488.SpriteBuffer_spriteCount * 8; // L: 171
		class488.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 172
		class488.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 173
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 174

		int var3;
		for (var3 = 0; var3 < class488.SpriteBuffer_spriteCount; ++var3) { // L: 175
			class488.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class488.SpriteBuffer_spriteCount; ++var3) { // L: 176
			ApproximateRouteStrategy.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class488.SpriteBuffer_spriteCount; ++var3) { // L: 177
			FriendsList.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class488.SpriteBuffer_spriteCount; ++var3) { // L: 178
			class132.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class488.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 179
		class100.SpriteBuffer_spritePalette = new int[var2]; // L: 180

		for (var3 = 1; var3 < var2; ++var3) { // L: 181
			class100.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 182
			if (class100.SpriteBuffer_spritePalette[var3] == 0) { // L: 183
				class100.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 185

		for (var3 = 0; var3 < class488.SpriteBuffer_spriteCount; ++var3) { // L: 186
			int var4 = FriendsList.SpriteBuffer_spriteWidths[var3]; // L: 187
			int var5 = class132.SpriteBuffer_spriteHeights[var3]; // L: 188
			int var6 = var4 * var5; // L: 189
			byte[] var7 = new byte[var6]; // L: 190
			class140.SpriteBuffer_pixels[var3] = var7; // L: 191
			int var8 = var1.readUnsignedByte(); // L: 192
			int var9;
			if (var8 == 0) { // L: 193
				for (var9 = 0; var9 < var6; ++var9) { // L: 194
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 196
				for (var9 = 0; var9 < var4; ++var9) { // L: 197
					for (int var10 = 0; var10 < var5; ++var10) { // L: 198
						var7[var9 + var10 * var4] = var1.readByte(); // L: 199
					}
				}
			}
		}

	} // L: 204
}
