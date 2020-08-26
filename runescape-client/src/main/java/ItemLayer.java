import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lez;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 715274953
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -987294249
	)
	@Export("x")
	int x;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1805580001
	)
	@Export("y")
	int y;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lez;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lez;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = -7395510386628271631L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -863180021
	)
	@Export("height")
	int height;

	ItemLayer() {
	}
}
