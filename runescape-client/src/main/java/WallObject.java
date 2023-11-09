import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
@Implements("WallObject")
public final class WallObject {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1924671533
	)
	@Export("z")
	int z;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -758120448
	)
	@Export("x")
	int x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1075141989
	)
	@Export("y")
	int y;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1796188905
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1988404137
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = 7474735667812952127L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1366395919
	)
	@Export("flags")
	int flags;

	WallObject() {
		this.tag = 0L; // L: 11
		this.flags = 0; // L: 12
	} // L: 14
}
