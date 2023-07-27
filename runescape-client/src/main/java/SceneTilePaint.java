import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1511628191
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1249864347
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 282852125
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 203089423
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -829918051
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("aj")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1554038533
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

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(B)Lih;",
		garbageValue = "107"
	)
	public static class213 method4952() {
		return Client.field750; // L: 1083
	}
}
