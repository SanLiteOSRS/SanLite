import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
public class class325 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 486674949
	)
	public int field3539;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 987280921
	)
	public int field3540;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1386938305
	)
	public int field3541;

	class325() {
	} // L: 8

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "113"
	)
	static void method6104() {
		Tiles.Tiles_minPlane = 99; // L: 45
		Tiles.field1024 = new short[4][104][104]; // L: 46
		Tiles.field1025 = new short[4][104][104]; // L: 47
		class19.field104 = new byte[4][104][104]; // L: 48
		UserComparator10.field1474 = new byte[4][104][104]; // L: 49
		BufferedNetSocket.field4681 = new int[4][105][105]; // L: 50
		InvDefinition.field1899 = new byte[4][105][105]; // L: 51
		class135.field1601 = new int[105][105]; // L: 52
		class172.Tiles_hue = new int[104]; // L: 53
		GameBuild.Tiles_saturation = new int[104]; // L: 54
		Tiles.Tiles_lightness = new int[104]; // L: 55
		Language.Tiles_hueMultiplier = new int[104]; // L: 56
		class159.field1755 = new int[104]; // L: 57
	} // L: 58
}
