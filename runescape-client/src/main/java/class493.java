import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
public class class493 {
	@ObfuscatedName("ao")
	static final char[] field5002;
	@ObfuscatedName("at")
	static final char[] field5001;

	static {
		field5002 = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'}; // L: 8
		field5001 = new char[]{'[', ']', '#'}; // L: 9
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;",
		garbageValue = "1089015752"
	)
	static String method8807(Throwable var0) throws IOException {
		String var1;
		if (var0 instanceof RunException) { // L: 68
			RunException var2 = (RunException)var0; // L: 69
			var1 = var2.message + " | "; // L: 70
			var0 = var2.throwable; // L: 71
		} else {
			var1 = ""; // L: 73
		}

		StringWriter var12 = new StringWriter(); // L: 74
		PrintWriter var3 = new PrintWriter(var12); // L: 75
		var0.printStackTrace(var3); // L: 76
		var3.close(); // L: 77
		String var4 = var12.toString(); // L: 78
		BufferedReader var5 = new BufferedReader(new StringReader(var4)); // L: 79
		String var6 = var5.readLine(); // L: 80

		while (true) {
			while (true) {
				String var7 = var5.readLine(); // L: 82
				if (var7 == null) { // L: 83
					var1 = var1 + "| " + var6;
					return var1;
				}

				int var8 = var7.indexOf(40); // L: 84
				int var9 = var7.indexOf(41, var8 + 1); // L: 85
				if (var8 >= 0 && var9 >= 0) { // L: 86
					String var10 = var7.substring(var8 + 1, var9); // L: 87
					int var11 = var10.indexOf(".java:"); // L: 88
					if (var11 >= 0) { // L: 89
						var10 = var10.substring(0, var11) + var10.substring(var11 + 5); // L: 90
						var1 = var1 + var10 + ' '; // L: 91
						continue; // L: 92
					}

					var7 = var7.substring(0, var8); // L: 94
				}

				var7 = var7.trim();
				var7 = var7.substring(var7.lastIndexOf(32) + 1);
				var7 = var7.substring(var7.lastIndexOf(9) + 1);
				var1 = var1 + var7 + ' ';
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Luk;",
		garbageValue = "-94"
	)
	public static IndexedSprite method8806() {
		IndexedSprite var0 = new IndexedSprite(); // L: 96
		var0.width = class529.SpriteBuffer_spriteWidth; // L: 97
		var0.height = class420.SpriteBuffer_spriteHeight; // L: 98
		var0.xOffset = class529.SpriteBuffer_xOffsets[0]; // L: 99
		var0.yOffset = class152.SpriteBuffer_yOffsets[0]; // L: 100
		var0.subWidth = HealthBarUpdate.SpriteBuffer_spriteWidths[0]; // L: 101
		var0.subHeight = SpriteMask.SpriteBuffer_spriteHeights[0]; // L: 102
		var0.palette = class505.SpriteBuffer_spritePalette; // L: 103
		var0.pixels = Coord.SpriteBuffer_pixels[0]; // L: 104
		class529.SpriteBuffer_xOffsets = null; // L: 106
		class152.SpriteBuffer_yOffsets = null; // L: 107
		HealthBarUpdate.SpriteBuffer_spriteWidths = null; // L: 108
		SpriteMask.SpriteBuffer_spriteHeights = null; // L: 109
		class505.SpriteBuffer_spritePalette = null; // L: 110
		Coord.SpriteBuffer_pixels = null; // L: 111
		return var0; // L: 113
	}
}
