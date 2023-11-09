import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = 436575851
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("s")
	@Export("text")
	String text;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -633493345
	)
	@Export("width")
	int width;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 908481261
	)
	@Export("height")
	int height;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILhm;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1; // L: 10
		this.width = var2; // L: 11
		this.height = var3; // L: 12
		this.size = var4; // L: 13
	} // L: 14

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-121"
	)
	static final void method4918(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0); // L: 11598
		var0 = 100 - var0; // L: 11599
		float var1 = 0.5F + (float)var0 / 200.0F; // L: 11600
		RouteStrategy.method3811((double)var1); // L: 11601
	} // L: 11602
}
