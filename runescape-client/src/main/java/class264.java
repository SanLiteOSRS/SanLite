import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("js")
public class class264 {
	@ObfuscatedName("gr")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;

	@ObfuscatedName("ko")
	static final void method4796(double var0) {
		Rasterizer3D.Rasterizer3D_setBrightness(var0);
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(var0);
		class2.method26();
		class12.clientPreferences.field1303 = var0;
		KeyHandler.savePreferences();
	}
}
