import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
public class class321 {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1459846877
	)
	@Export("canvasHeight")
	public static int canvasHeight;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-884405686"
	)
	static void method5996() {
		Tiles.Tiles_minPlane = 99;
		Tiles.Tiles_underlays = new byte[4][104][104];
		class14.Tiles_overlays = new byte[4][104][104];
		class147.Tiles_shapes = new byte[4][104][104];
		Tiles.field983 = new byte[4][104][104];
		class420.field4545 = new int[4][105][105];
		class392.field4374 = new byte[4][105][105];
		Tiles.field998 = new int[105][105];
		BufferedNetSocket.Tiles_hue = new int[104];
		class116.Tiles_saturation = new int[104];
		Tiles.Tiles_lightness = new int[104];
		class357.Tiles_hueMultiplier = new int[104];
		class361.field4213 = new int[104];
	}
}
