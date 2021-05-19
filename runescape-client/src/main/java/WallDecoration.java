import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1910058323
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -620664259
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -476919717
	)
	@Export("y")
	int y;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1074211039
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -112472913
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 290888717
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2143429633
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = -1980240772236369191L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1664684485
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-10"
	)
	public static void method4234(int var0) {
		if (var0 != -1) {
			if (class5.Widget_loadedInterfaces[var0]) {
				GrandExchangeOffer.Widget_archive.clearFilesGroup(var0);
				if (Widget.Widget_interfaceComponents[var0] != null) {
					boolean var1 = true;

					for (int var2 = 0; var2 < Widget.Widget_interfaceComponents[var0].length; ++var2) {
						if (Widget.Widget_interfaceComponents[var0][var2] != null) {
							if (Widget.Widget_interfaceComponents[var0][var2].type != 2) {
								Widget.Widget_interfaceComponents[var0][var2] = null;
							} else {
								var1 = false;
							}
						}
					}

					if (var1) {
						Widget.Widget_interfaceComponents[var0] = null;
					}

					class5.Widget_loadedInterfaces[var0] = false;
				}
			}
		}
	}
}
