import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("ts")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 677978795
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1630788437
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1609665507
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1064087665
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 273150913
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("as")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 637934421
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
