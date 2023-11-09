import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("aw")
	@Export("text")
	String text;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1843215057
	)
	@Export("width")
	int width;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -632641915
	)
	@Export("height")
	int height;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILjj;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1; // L: 10
		this.width = var2; // L: 11
		this.height = var3; // L: 12
		this.size = var4; // L: 13
	} // L: 14
}
