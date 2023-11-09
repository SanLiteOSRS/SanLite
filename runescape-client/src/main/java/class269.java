import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
public class class269 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	static final class269 field3019;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	static final class269 field3016;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1601195475
	)
	@Export("value")
	final int value;

	static {
		field3019 = new class269(0); // L: 4
		field3016 = new class269(1); // L: 5
	}

	class269(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1152388374"
	)
	static void method5466() {
		Tiles.Tiles_minPlane = 99; // L: 45
		FaceNormal.field2621 = new short[4][104][104]; // L: 46
		class74.field916 = new short[4][104][104]; // L: 47
		Player.field1127 = new byte[4][104][104]; // L: 48
		Tiles.field1018 = new byte[4][104][104]; // L: 49
		Tiles.field1020 = new int[4][105][105]; // L: 50
		class305.field3399 = new byte[4][105][105]; // L: 51
		Canvas.field116 = new int[105][105]; // L: 52
		UserComparator5.Tiles_hue = new int[104]; // L: 53
		class210.Tiles_saturation = new int[104]; // L: 54
		Tiles.Tiles_lightness = new int[104]; // L: 55
		class149.Tiles_hueMultiplier = new int[104]; // L: 56
		Tiles.field1019 = new int[104]; // L: 57
	} // L: 58
}
