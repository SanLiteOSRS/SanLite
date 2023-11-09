import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 2110092031
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILki;Lki;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("a")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 16
			if (0L == var0 % 37L) { // L: 17
				return null;
			} else {
				int var2 = 0; // L: 18

				for (long var3 = var0; 0L != var3; var3 /= 37L) { // L: 19 20 22
					++var2; // L: 21
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) { // L: 24 25 34
					long var6 = var0; // L: 26
					var0 /= 37L; // L: 27
					var8 = class359.base37Table[(int)(var6 - var0 * 37L)]; // L: 28
					if (var8 == '_') { // L: 29
						int var9 = var5.length() - 1; // L: 30
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 31
						var8 = 160; // L: 32
					}
				}

				var5.reverse(); // L: 36
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 37
				return var5.toString(); // L: 38
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Float;Ljava/lang/Float;I)V",
		garbageValue = "-753033350"
	)
	static void method5310(Float var0, Float var1) {
		if (var0 + class121.field1454 < 1.3333334F) { // L: 323
			float var2 = var0 - 2.0F; // L: 324
			float var3 = var0 - 1.0F; // L: 325
			float var4 = (float)Math.sqrt((double)(var2 * var2 - var3 * 4.0F * var3)); // L: 326
			float var5 = 0.5F * (var4 + -var2); // L: 327
			if (var1 + class121.field1454 > var5) { // L: 328
				var1 = var5 - class121.field1454; // L: 329
			} else {
				var5 = 0.5F * (-var2 - var4); // L: 332
				if (var1 < var5 + class121.field1454) { // L: 333
					var1 = class121.field1454 + var5; // L: 334
				}
			}
		} else {
			var0 = 1.3333334F - class121.field1454; // L: 339
			var1 = 0.33333334F - class121.field1454; // L: 340
		}

	} // L: 342
}
