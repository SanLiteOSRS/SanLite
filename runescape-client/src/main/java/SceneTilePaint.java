import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1545996495
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1652527289
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1801729611
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2002434175
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1083388959
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("ao")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 91212955
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

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1985297196"
	)
	static String method4753(int var0) {
		if (var0 < 0) { // L: 9727
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0]; // L: 9728 9729
		}
	}
}
