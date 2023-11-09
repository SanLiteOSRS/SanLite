import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 867907833
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1090582325
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1484128325
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -932651361
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -706966471
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("au")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1380493903
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IZB)Ljava/lang/String;",
		garbageValue = "12"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? Players.method2793(var0, 10, var1) : Integer.toString(var0); // L: 107 108
	}
}
