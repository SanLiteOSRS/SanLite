import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("jf")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 267355377
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1030781281
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1931005239
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -456138637
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -741405067
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("ap")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 721769417
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

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZI)I",
		garbageValue = "32040613"
	)
	static int method5011(int var0, Script var1, boolean var2) {
		return 2; // L: 5280
	}
}
