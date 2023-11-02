import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tt")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("ak")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Lom;Lom;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1; // L: 14
		this.fontsArchive = var2; // L: 15
		this.map = new HashMap(); // L: 16
	} // L: 17

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([Ltc;I)Ljava/util/HashMap;",
		garbageValue = "932595648"
	)
	@Export("createMap")
	public HashMap createMap(FontName[] var1) {
		HashMap var2 = new HashMap(); // L: 20
		FontName[] var3 = var1; // L: 22

		for (int var4 = 0; var4 < var3.length; ++var4) { // L: 23
			FontName var5 = var3[var4]; // L: 24
			if (this.map.containsKey(var5)) { // L: 26
				var2.put(var5, this.map.get(var5)); // L: 27
			} else {
				AbstractArchive var7 = this.spritesArchive; // L: 31
				AbstractArchive var8 = this.fontsArchive; // L: 32
				String var9 = var5.name; // L: 33
				Font var6;
				if (!var7.isValidFileName(var9, "")) { // L: 35
					var6 = null; // L: 36
				} else {
					int var10 = var7.getGroupId(var9); // L: 39
					int var11 = var7.getFileId(var10, ""); // L: 40
					Font var12;
					if (!class164.method3376(var7, var10, var11)) { // L: 43
						var12 = null; // L: 44
					} else {
						byte[] var14 = var8.takeFile(var10, var11); // L: 48
						Font var13;
						if (var14 == null) { // L: 50
							var13 = null; // L: 51
						} else {
							Font var15 = new Font(var14, class326.SpriteBuffer_xOffsets, ModelData0.SpriteBuffer_yOffsets, class59.SpriteBuffer_spriteWidths, class544.SpriteBuffer_spriteHeights, class372.SpriteBuffer_spritePalette, class414.SpriteBuffer_pixels); // L: 54
							class407.method7453(); // L: 55
							var13 = var15; // L: 56
						}

						var12 = var13; // L: 58
					}

					var6 = var12; // L: 60
				}

				if (var6 != null) { // L: 63
					this.map.put(var5, var6); // L: 64
					var2.put(var5, var6); // L: 65
				}
			}
		}

		return var2; // L: 71
	}
}
