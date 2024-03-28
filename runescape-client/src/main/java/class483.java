import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("si")
public class class483 implements class481 {
	@ObfuscatedName("az")
	final Map field4914;

	public class483(Map var1) {
		this.field4914 = var1; // L: 11
	} // L: 12

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lsv;",
		garbageValue = "-2007074756"
	)
	public class480 vmethod8561() {
		return null; // L: 16
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-87"
	)
	public byte[] vmethod8560() throws UnsupportedEncodingException {
		return this.method8562().getBytes("UTF-8"); // L: 21
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1210788714"
	)
	public String method8562() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder(); // L: 25
		Iterator var2 = this.field4914.entrySet().iterator(); // L: 26

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 27
			String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8"); // L: 29
			String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8"); // L: 30
			var1.append(var4).append("=").append(var5).append("&"); // L: 31
		}

		if (var1.length() == 0) { // L: 34
			return "";
		} else {
			var1.deleteCharAt(var1.length() - 1); // L: 35
			var1.insert(0, "?"); // L: 36
			return var1.toString(); // L: 37
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-1"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 177
		var1.offset = var0.length - 2; // L: 178
		class549.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 179
		class549.SpriteBuffer_xOffsets = new int[class549.SpriteBuffer_spriteCount]; // L: 180
		class549.SpriteBuffer_yOffsets = new int[class549.SpriteBuffer_spriteCount]; // L: 181
		class549.SpriteBuffer_spriteWidths = new int[class549.SpriteBuffer_spriteCount]; // L: 182
		Ignored.SpriteBuffer_spriteHeights = new int[class549.SpriteBuffer_spriteCount]; // L: 183
		class549.SpriteBuffer_pixels = new byte[class549.SpriteBuffer_spriteCount][]; // L: 184
		var1.offset = var0.length - 7 - class549.SpriteBuffer_spriteCount * 8; // L: 185
		class549.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 186
		class549.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 187
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 188

		int var3;
		for (var3 = 0; var3 < class549.SpriteBuffer_spriteCount; ++var3) { // L: 189
			class549.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class549.SpriteBuffer_spriteCount; ++var3) { // L: 190
			class549.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class549.SpriteBuffer_spriteCount; ++var3) { // L: 191
			class549.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class549.SpriteBuffer_spriteCount; ++var3) { // L: 192
			Ignored.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class549.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 193
		class126.SpriteBuffer_spritePalette = new int[var2]; // L: 194

		for (var3 = 1; var3 < var2; ++var3) { // L: 195
			class126.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 196
			if (class126.SpriteBuffer_spritePalette[var3] == 0) { // L: 197
				class126.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 199

		for (var3 = 0; var3 < class549.SpriteBuffer_spriteCount; ++var3) { // L: 200
			int var4 = class549.SpriteBuffer_spriteWidths[var3]; // L: 201
			int var5 = Ignored.SpriteBuffer_spriteHeights[var3]; // L: 202
			int var6 = var5 * var4; // L: 203
			byte[] var7 = new byte[var6]; // L: 204
			class549.SpriteBuffer_pixels[var3] = var7; // L: 205
			int var8 = var1.readUnsignedByte(); // L: 206
			int var9;
			if (var8 == 0) { // L: 207
				for (var9 = 0; var9 < var6; ++var9) { // L: 208
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 210
				for (var9 = 0; var9 < var4; ++var9) { // L: 211
					for (int var10 = 0; var10 < var5; ++var10) { // L: 212
						var7[var9 + var4 * var10] = var1.readByte(); // L: 213
					}
				}
			}
		}

	} // L: 218
}
