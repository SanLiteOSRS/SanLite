import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
final class class134 implements ThreadFactory {
	@ObfuscatedName("af")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load"); // L: 49
	}

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(IIIILtt;Lme;I)V",
		garbageValue = "1815678067"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 12338
		if (var6 > 4225 && var6 < 90000) { // L: 12339
			int var7 = Client.camAngleY & 2047; // L: 12340
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 12341
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 12342
			int var10 = var9 * var2 + var3 * var8 >> 16; // L: 12343
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12344
			double var12 = Math.atan2((double)var10, (double)var11); // L: 12345
			int var14 = var5.width / 2 - 25; // L: 12346
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 12347
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 12348
			byte var17 = 20; // L: 12349
			class183.redHintArrowSprite.method9417(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 12350
		} else {
			HorizontalAlignment.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 12352
		}

	} // L: 12353
}
