import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tg")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("af")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Loc;Loc;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1; // L: 14
		this.fontsArchive = var2; // L: 15
		this.map = new HashMap(); // L: 16
	} // L: 17

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([Lty;I)Ljava/util/HashMap;",
		garbageValue = "465282109"
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
					byte[] var14 = var7.takeFile(var10, var11); // L: 45
					boolean var13;
					if (var14 == null) { // L: 46
						var13 = false; // L: 47
					} else {
						class483.SpriteBuffer_decode(var14); // L: 50
						var13 = true; // L: 51
					}

					Font var12;
					if (!var13) { // L: 53
						var12 = null; // L: 54
					} else {
						byte[] var15 = var8.takeFile(var10, var11); // L: 58
						Font var18;
						if (var15 == null) { // L: 60
							var18 = null; // L: 61
						} else {
							Font var16 = new Font(var15, class549.SpriteBuffer_xOffsets, class549.SpriteBuffer_yOffsets, class549.SpriteBuffer_spriteWidths, Ignored.SpriteBuffer_spriteHeights, class126.SpriteBuffer_spritePalette, class549.SpriteBuffer_pixels); // L: 64
							class549.SpriteBuffer_xOffsets = null; // L: 66
							class549.SpriteBuffer_yOffsets = null; // L: 67
							class549.SpriteBuffer_spriteWidths = null; // L: 68
							Ignored.SpriteBuffer_spriteHeights = null; // L: 69
							class126.SpriteBuffer_spritePalette = null; // L: 70
							class549.SpriteBuffer_pixels = null; // L: 71
							var18 = var16;
						}

						var12 = var18;
					}

					var6 = var12; // L: 77
				}

				if (var6 != null) { // L: 80
					this.map.put(var5, var6); // L: 81
					var2.put(var5, var6); // L: 82
				}
			}
		}

		return var2; // L: 88
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-128"
	)
	static void method8920(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75
}
