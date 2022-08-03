import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("GroundObject")
public final class GroundObject {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1701601029
	)
	@Export("z")
	int z;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1231423439
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1925351669
	)
	@Export("y")
	int y;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -6361683927070424525L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1088902937
	)
	@Export("flags")
	int flags;

	GroundObject() {
	} // L: 11
}
