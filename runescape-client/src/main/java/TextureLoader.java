import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(II)[I",
		garbageValue = "1068759988"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(IB)I",
		garbageValue = "1"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "-1400851651"
	)
	boolean vmethod3432(int var1);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "1467632569"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
