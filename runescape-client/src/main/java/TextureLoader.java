import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(II)[I",
		garbageValue = "1646805002"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "-914943322"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "-335824430"
	)
	boolean vmethod3401(int var1);

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "533356584"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
