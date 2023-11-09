import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("hj")
	static int[] field2415;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2079142647
	)
	@Export("z")
	int z;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -55574528
	)
	@Export("x")
	int x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 430836919
	)
	@Export("y")
	int y;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = -8254049127519565987L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -542512219
	)
	@Export("height")
	int height;

	ItemLayer() {
	} // L: 13
}
