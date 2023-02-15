import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hc")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("m")
	static int[] field2764;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1905065961
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 395510695
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1229882029
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1388285787
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1517279351
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("j")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1002272025
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true; // L: 9
		this.swColor = var1; // L: 13
		this.seColor = var2; // L: 14
		this.neColor = var3; // L: 15
		this.nwColor = var4; // L: 16
		this.texture = var5; // L: 17
		this.rgb = var6; // L: 18
		this.isFlat = var7; // L: 19
	} // L: 20
}
