import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
@Implements("DecorativeObject")
public final class DecorativeObject {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1615733343
	)
	@Export("z")
	int z;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2001021455
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1180389993
	)
	@Export("x")
	int x;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -675812093
	)
	@Export("y")
	int y;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1918972727
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1535318621
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -656062347
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = 8584670722459832495L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1429799513
	)
	@Export("flags")
	int flags;

	DecorativeObject() {
		this.tag = 0L; // L: 13
		this.flags = 0; // L: 14
	} // L: 16

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1963050797"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1; // L: 4520
	}
}
