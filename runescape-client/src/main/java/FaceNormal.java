import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1674496063
	)
	@Export("x")
	int x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1487656947
	)
	@Export("y")
	int y;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1088486113
	)
	@Export("z")
	int z;

	FaceNormal() {
	} // L: 8

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(S)Loq;",
		garbageValue = "321"
	)
	public static NodeDeque method4805() {
		return Client.scriptEvents; // L: 5203
	}
}
