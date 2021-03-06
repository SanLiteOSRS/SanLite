import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "1068759988",
		signature = "(II)[I"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "1",
		signature = "(IB)I"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		garbageValue = "-1400851651",
		signature = "(II)Z"
	)
	boolean vmethod3432(int var1);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "1467632569",
		signature = "(II)Z"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
