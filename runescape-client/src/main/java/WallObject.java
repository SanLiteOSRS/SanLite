import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
@Implements("WallObject")
public final class WallObject {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Widget_modelsArchive")
	public static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1881565209
	)
	@Export("z")
	int z;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 473048845
	)
	@Export("x")
	int x;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1697452955
	)
	@Export("y")
	int y;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1621738645
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1622377931
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -6534703373500493307L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1893718069
	)
	@Export("flags")
	int flags;

	WallObject() {
		this.tag = 0L;
		this.flags = 0;
	}
}
