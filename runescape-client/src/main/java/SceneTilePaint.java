import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field2883;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1324322579
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1052157573
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 340042019
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1259764427
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 663340031
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("ao")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1157824399
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	public static int method5104(int var0) {
		return var0 + -512; // L: 22
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "1288752357"
	)
	static int method5103(int var0, Script var1, boolean var2) {
		return 2; // L: 5156
	}
}
