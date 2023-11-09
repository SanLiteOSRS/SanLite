import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("WallObject")
public final class WallObject {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -324118823
	)
	@Export("z")
	int z;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1387095361
	)
	@Export("x")
	int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1324939305
	)
	@Export("y")
	int y;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1376912137
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 17440941
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 2291229591365950807L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1488495789
	)
	@Export("flags")
	int flags;

	WallObject() {
		this.tag = 0L; // L: 11
		this.flags = 0; // L: 12
	} // L: 14
}
