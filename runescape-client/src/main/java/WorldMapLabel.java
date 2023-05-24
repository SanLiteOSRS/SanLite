import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("af")
	@Export("text")
	String text;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -31821843
	)
	@Export("width")
	int width;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1401615011
	)
	@Export("height")
	int height;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILjd;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1; // L: 10
		this.width = var2; // L: 11
		this.height = var3; // L: 12
		this.size = var4; // L: 13
	} // L: 14
}
