import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
public class class28 {
	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lql;",
		garbageValue = "16"
	)
	static SpritePixels method423(int var0, int var1, int var2) {
		return (SpritePixels)WorldMapRegion.WorldMapRegion_cachedSprites.get(class65.method1867(var0, var1, var2));
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-229308626"
	)
	static final void method424(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		Interpreter.clientPreferences.method2330(var0);
	}
}
