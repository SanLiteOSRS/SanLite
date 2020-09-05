import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("sb")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("z")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Llq;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Ljh;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 785090077
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("Widget_spritesArchive")
	public static AbstractArchive Widget_spritesArchive;

	static {
		Messages_channels = new HashMap();
		Messages_hashTable = new IterableNodeHashTable(1024);
		Messages_queue = new IterableDualNodeQueue();
		Messages_count = 0;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-80"
	)
	static void method2288() {
		Tiles.field528 = null;
		Tiles.field521 = null;
		class297.field3668 = null;
		class171.field2049 = null;
		class204.field2421 = null;
		class22.field122 = null;
		class39.field282 = null;
		Tiles.Tiles_hue = null;
		Tiles.Tiles_saturation = null;
		WorldMapRectangle.Tiles_lightness = null;
		WorldMapScaleHandler.Tiles_hueMultiplier = null;
		class60.field453 = null;
	}
}
