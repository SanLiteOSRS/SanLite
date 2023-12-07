import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
@Implements("DecorativeObject")
public final class DecorativeObject {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 697087573
	)
	@Export("z")
	int z;
	@ObfuscatedName("ah")
	@Export("x")
	int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1239297111
	)
	@Export("y")
	int y;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1274967907
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1874531803
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 845842723
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -692946625
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 6922926067835856217L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 416998107
	)
	@Export("flags")
	int flags;

	DecorativeObject() {
		this.tag = 0L; // L: 13
		this.flags = 0; // L: 14
	} // L: 16

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Luk;",
		garbageValue = "-1385996560"
	)
	@Export("FillMode_values")
	public static class538[] FillMode_values() {
		return new class538[]{class538.SOLID, class538.field5220, class538.field5222}; // L: 15
	}
}
