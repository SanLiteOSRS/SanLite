import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
@Implements("DecorativeObject")
public final class DecorativeObject {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -807322147
	)
	@Export("z")
	int z;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -607125504
	)
	@Export("x")
	int x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1002472925
	)
	@Export("y")
	int y;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2005952335
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -887600117
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 450415281
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -64630691
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = -4662075869546300253L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1429480417
	)
	@Export("flags")
	int flags;

	DecorativeObject() {
		this.tag = 0L; // L: 13
		this.flags = 0; // L: 14
	} // L: 16
}
