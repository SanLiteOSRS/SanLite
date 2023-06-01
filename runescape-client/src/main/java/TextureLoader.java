import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "45"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2009328947"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "25"
	)
	boolean vmethod5011(int var1);

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "8"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
