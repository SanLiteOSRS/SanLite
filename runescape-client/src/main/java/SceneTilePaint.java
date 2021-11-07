import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hg")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1142629297
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1241248513
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -601544489
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -714792091
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1463497725
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("g")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 969353043
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true;
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}
}
