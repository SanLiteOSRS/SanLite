import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
@Implements("GroundObject")
public final class GroundObject {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -521558175
	)
	@Export("z")
	int z;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1460666368
	)
	@Export("x")
	int x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1351947283
	)
	@Export("y")
	int y;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 1180111343816748203L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1838339137
	)
	@Export("flags")
	int flags;

	GroundObject() {
	} // L: 11

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1382457981"
	)
	static int method4466(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F)); // L: 4412
	}
}
