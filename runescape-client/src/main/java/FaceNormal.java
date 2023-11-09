import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("iy")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -452186919
	)
	@Export("x")
	int x;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 150582953
	)
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2077300873
	)
	@Export("z")
	int z;

	FaceNormal() {
	} // L: 8
}
