import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("al")
	static byte[][][] field3005;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -424379055
	)
	@Export("width")
	int width;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1041623325
	)
	@Export("height")
	int height;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1559450681
	)
	@Export("x")
	int x;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1142710557
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Ljj;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1; // L: 307
	}
}
